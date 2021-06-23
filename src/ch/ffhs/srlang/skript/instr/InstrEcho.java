package ch.ffhs.srlang.skript.instr;

public class InstrEcho extends Instr {
    final Instr expression;

    public InstrEcho(Instr expression) {
        this.expression = expression;
    }

    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitEcho(this);
    }


}
