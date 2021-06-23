package ch.ffhs.srlang.skript.instr;

public class InstrNegate extends Instr {
    final Instr operand;

    public InstrNegate(Instr operand) {
        this.operand = operand;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitNegation(this);
    }

}
