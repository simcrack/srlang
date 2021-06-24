package ch.ffhs.srlang.skript.instr;

public class InstrLoop extends Instr {

    final Instr boolExpression;
    final InstrInstructions cmdExpression;

    public InstrLoop(Instr boolExpression, InstrInstructions cmdExpression) {
        this.boolExpression = boolExpression;
        this.cmdExpression = cmdExpression;
    }
    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitLoopOperation(this);
    }
}
