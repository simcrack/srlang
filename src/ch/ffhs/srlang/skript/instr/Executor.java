package ch.ffhs.srlang.skript.instr;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigInteger;

/**
 * Ein Executor zum Ausführen von Instructions.
 * Die Klasse ist eine Visitorklasse und wird wie folgt verwendet:
 * instruction.acceptVisitor(evaluator);
 *
 * @author simon@richebach.ch
 */
public class Executor implements InstrVisitor<BigInteger> {
    private final Context context;

    public Executor() {
        this(new Context());
    }

    public Executor(Context context) {
        this.context = context;
    }

    @Override
    public BigInteger visitConstant(InstrConstant instrConstant) {
        return (BigInteger) instrConstant.value;
    }

    @Override
    public BigInteger visitGetVariable(InstrGetVariable instrGetVariable) {
        return context.getVariable(instrGetVariable.name);
    }

    @Override
    public BigInteger visitSetVariable(InstrSetVariable instrSetVariable) {
        BigInteger evaluatedValue = instrSetVariable.value.acceptVisitor(this);
        context.setVariable(instrSetVariable.name, evaluatedValue);
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
            case LES:
                if (left.compareTo(right) < 0) {
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
        return null;
    }

    @Override
    public BigInteger visitEcho(InstrEcho instrEcho) {
        BigInteger val = instrEcho.expression.acceptVisitor(this);
        System.out.println(val);
        return null;
    }

    @Override
    public BigInteger visitScript(InstrScript instrScript) {
        instrScript.instructions.acceptVisitor(this);
        return null;
    }

    @Override
    public BigInteger visitConditionalOperation(InstrConditional instrConditional) {
        if (instrConditional.boolExpression.acceptVisitor(this).equals(BigInteger.valueOf(1))) {
            instrConditional.trueExpression.acceptVisitor(this);
        } else {
            instrConditional.falseExpression.acceptVisitor(this);
        }
        return null;
    }

    @Override
    public BigInteger visitLoopOperation(InstrLoop instrLoop) {
        while (instrLoop.boolExpression.acceptVisitor(this).equals(BigInteger.valueOf(1))) {
            instrLoop.cmdExpression.acceptVisitor(this);
        }
        return null;
    }

    @Override
    public BigInteger visitSetFunction(InstrSetFunction instrSetFunction) {
        context.setFunction(instrSetFunction.function.getName(), instrSetFunction.function);
        return null;
    }

    @Override
    public BigInteger visitGetFunction(InstrGetFunction instrGetFunction) {
        Function function = context.getFunction(instrGetFunction.name);
        Executor innerExecutor = new Executor(new Context(context));

        //Variablen im neuen Kontext (Argumente) initialisieren
        int index = 0;
        for (String argName : function.getArgNames()) {
            innerExecutor.context.setVariable(argName, instrGetFunction.argList.getArg(index++).acceptVisitor(this));
        }

        function.getInstructions().acceptVisitor(innerExecutor);

        return function.getReturnExpression().acceptVisitor(innerExecutor);
    }
}
