package ch.ffhs.srlang.skript.instr;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Ein Executor zum Ausführen von Instructions.
 * Die Klasse ist eine Visitorklasse und wird wie folgt verwendet:
 * instruction.acceptVisitor(evaluator);
 *
 * @author simon@richebach.ch
 */
public class Executor implements InstrVisitor<BigInteger> {
    /**
     * Map mit allen instanziierten Variablen
     */
    private final Map<String, BigInteger> context;

    /**
     * Erzeugt einen Executor mit leerem Context und leerer FunktionsLibrary.
     */
    public Executor() {
        this(new HashMap<>());
    }

    /**
     * Erzeugt einen Executor
     *
     * @param context Vordefinierte Variablenwerte
     */
    public Executor(Map<String, BigInteger> context) {
        this.context = context;
    }

    // Ohne weitere Kommentare: Auswertungsmethoden für alle Instruktionstypen.

    @Override
    public BigInteger visitConstant(InstrConstant instrConstant) {
        return (BigInteger) instrConstant.value;
    }

    @Override
    public BigInteger visitGetVariable(InstrGetVariable instrGetVariable) {
        if (context.containsKey(instrGetVariable.name)) {
            return context.get(instrGetVariable.name);
        } else {
            throw new RuntimeException("Variable " + instrGetVariable.name + " not initialized.");
            //TODO spezifischere Exception
        }
    }

    @Override
    public BigInteger visitSetVariable(InstrSetVariable instrSetVariable) {
        BigInteger evaluatedValue = instrSetVariable.value.acceptVisitor(this);
        context.put(instrSetVariable.name, evaluatedValue);
        return null;
    }


    @Override
    public BigInteger visitBinaryOperation(
            InstrBinaryOperation instrBinaryOperation) {
        BigInteger left = instrBinaryOperation.leftOperand.acceptVisitor(this);
        BigInteger right = instrBinaryOperation.rightOperand.acceptVisitor(this);
        switch (instrBinaryOperation.operator) {
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
            default:
                throw new NotImplementedException();
        }
    }

    @Override
    public BigInteger visitNegation(InstrNegate instrNegate) {
        BigInteger operand = instrNegate.operand.acceptVisitor(this);
        return operand.negate();
    }

    @Override
    public BigInteger visitInstructions(InstrInstructions instrInstructions) {
        for (Instr instr : instrInstructions.instructions) {
            instr.acceptVisitor(this);
        }
        return BigInteger.valueOf(0);
    }

    @Override
    public BigInteger visitEcho(InstrEcho instrEcho) {
        BigInteger val = instrEcho.expression.acceptVisitor(this);
        System.out.println(val);
        return BigInteger.valueOf(0);
    }

    @Override
    public BigInteger visitScript(InstrScript instrScript) {
        instrScript.instructions.acceptVisitor(this);
        return BigInteger.valueOf(0);
    }

    public BigInteger visitConditionalOperation(InstrConditional instrConditional) {
        if (instrConditional.boolExpression.acceptVisitor(this).equals(BigInteger.valueOf(1))) {
            instrConditional.trueExpression.acceptVisitor(this);
        }
        return BigInteger.valueOf(0);
    }

}
