package ch.ffhs.srlang.skript.instr;

public class InstrConditional extends Instr {

    final Instr boolExpression;
    final InstrInstructions trueExpression;
    final InstrInstructions falseExpression;

    public InstrConditional(Instr boolExpression, InstrInstructions trueExpression) {
        this.boolExpression = boolExpression;
        this.trueExpression = trueExpression;
        this.falseExpression = new InstrInstructions(); //empty instruction list
    }

    public InstrConditional(Instr boolExpression, InstrInstructions trueExpression, InstrInstructions falseExpression) {
        this.boolExpression = boolExpression;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitConditionalOperation(this);
    }
}
