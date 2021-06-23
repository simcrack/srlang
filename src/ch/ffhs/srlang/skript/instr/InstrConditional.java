package ch.ffhs.srlang.skript.instr;

public class InstrConditional extends Instr {

    final Instr boolExpression;
    final Instr trueExpression;

    public InstrConditional(Instr boolExpression, Instr trueExpression) {
        this.boolExpression = boolExpression;
        this.trueExpression = trueExpression;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitConditionalOperation(this);
    }
}
