package ch.richebach.srlang.instr;


import ch.richebach.srlang.Context;
import ch.richebach.srlang.Function;

import java.math.BigInteger;

/**
 * Ein Executor zum Ausführen von Instructions.
 * Die Klasse ist eine Visitorklasse und wird wie folgt verwendet:
 * instruction.acceptVisitor(evaluator).
 *
 * @author simon@richebach.ch
 */
public class Executor implements InstrVisitor<BigInteger> {
    // Aktueller Kontext (Variablen und Funktionen).
    private final Context context;

    public Executor() {
        this(new Context());
    }

    public Executor(Context context) {
        this.context = context;
    }

    /**
     * Wertet einen binären Ausdruck aus.
     * Ein binärer Ausdruck besteht aus zwei Ausdrücken und einem Operanden.
     * Wird sowohl für arithmetische, als auch für boolsche Ausdrücke verwendet.
     */
    @Override
    public BigInteger visitBinExpression(InstrBinExpression instrBinExpression) {
        BigInteger left = instrBinExpression.leftExpression.acceptVisitor(this);
        BigInteger right = instrBinExpression.rightExpression.acceptVisitor(this);
        switch (instrBinExpression.operator) {
            case ADD:
                return left.add(right);
            case SUB:
                return left.subtract(right);
            case MUL:
                return left.multiply(right);
            case DIV:
                return left.divide(right);
            case EQU:
                if (left.equals(right)) {
                    return BigInteger.valueOf(1);
                } else {
                    return BigInteger.valueOf(0);
                }
            case LES:
                if (left.compareTo(right) < 0) {
                    return BigInteger.valueOf(1);
                } else {
                    return BigInteger.valueOf(0);
                }
            case GTR:
                if (left.compareTo(right) > 0) {
                    return BigInteger.valueOf(1);
                } else {
                    return BigInteger.valueOf(0);
                }
            default:
                throw new UnsupportedOperationException(String.valueOf(instrBinExpression.operator));
        }
    }

    /**
     * Führt eine if-else-endif Instruktion aus (Conditional).
     *
     * @return null
     */
    @Override
    public BigInteger visitConditionalOperation(InstrConditional instrConditional) {
        if (instrConditional.boolExpression.acceptVisitor(this).equals(BigInteger.valueOf(1))) {
            instrConditional.trueExpression.acceptVisitor(this);
        } else {
            instrConditional.falseExpression.acceptVisitor(this);
        }
        return null;
    }

    /**
     * Gibt den in einer Konstanten-Instruktion definierte Wert zurück.
     */
    @Override
    public BigInteger visitConstant(InstrConstant instrConstant) {
        return instrConstant.value;
    }

    /**
     * Wertet eine Echo-Instruktion aus.
     * Das Resultat wird auf der Konsole ausgegeben.
     *
     * @return null
     */
    @Override
    public BigInteger visitEcho(InstrEcho instrEcho) {
        BigInteger val = instrEcho.expression.acceptVisitor(this);
        System.out.println(val);
        return null;
    }

    /**
     * Führt eine Funktion aus.
     * Die Funktion muss im aktuellen Context (oder desser äusserem Context) registriert sein.
     *
     * @return Rückgabewert der Funktion.
     */
    @Override
    public BigInteger visitGetFunction(InstrGetFunction instrGetFunction) {
        Function function = context.getFunction(instrGetFunction.name);
        Executor innerExecutor = new Executor(new Context(context));

        // Funktionsargumente als Variablen im neuen Kontext initialisieren
        int index = 0;
        for (String argName : function.getArgNames()) {
            innerExecutor.context.setVariable(argName, instrGetFunction.argList.getArg(index++).acceptVisitor(this));
        }

        function.getInstructions().acceptVisitor(innerExecutor);

        return function.getReturnExpression().acceptVisitor(innerExecutor);
    }

    /**
     * Gibt den in einer Variablen-Instruktion gespeicherte Wert zurück.
     */
    @Override
    public BigInteger visitGetVariable(InstrGetVariable instrGetVariable) {
        return context.getVariable(instrGetVariable.name);
    }

    /**
     * Führt einen Code-Block aus.
     * Ein Code-Block besteht aus einer beliebigen Anzahl von Instruktionen.
     *
     * @return null
     */
    @Override
    public BigInteger visitInstructions(InstrInstructions instrInstructions) {
        for (Instr instr : instrInstructions.instructions) {
            instr.acceptVisitor(this);
        }
        return null;
    }

    /**
     * Führt eine Loop-Instruktion aus.
     *
     * @return null
     */
    @Override
    public BigInteger visitLoop(InstrLoop instrLoop) {
        while (instrLoop.boolExpression.acceptVisitor(this).equals(BigInteger.valueOf(1))) {
            instrLoop.cmdExpression.acceptVisitor(this);
        }
        return null;
    }

    /**
     * Führt ein Script aus.
     * Ein Script besteht normalerweise aus einem Code-Block mit einer beliebigen Anzahl von Instruktionen.
     */
    @Override
    public BigInteger visitScript(InstrScript instrScript) {
        instrScript.instructions.acceptVisitor(this);
        return null;
    }

    /**
     * Registiert eine neue Funktion im aktuellen Context.
     *
     * @return null
     */
    @Override
    public BigInteger visitSetFunction(InstrSetFunction instrSetFunction) {
        context.setFunction(instrSetFunction.function.getName(), instrSetFunction.function);
        return null;
    }

    /**
     * Setzt den Wert einer Variable. Falls sie noch nicht existiert, wird sie neu angelegt.
     */
    @Override
    public BigInteger visitSetVariable(InstrSetVariable instrSetVariable) {
        BigInteger evaluatedValue = instrSetVariable.value.acceptVisitor(this);
        context.setVariable(instrSetVariable.name, evaluatedValue);
        return null;
    }
}
