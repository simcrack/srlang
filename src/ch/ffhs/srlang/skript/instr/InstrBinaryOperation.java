package ch.ffhs.srlang.skript.instr;

public class InstrBinaryOperation extends Instr {

    final BinaryOperator operator;

    final Instr leftOperand;

    final Instr rightOperand;

    public InstrBinaryOperation(BinaryOperator operator, Instr leftOperand, Instr rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitBinaryOperation(this);
    }


}
