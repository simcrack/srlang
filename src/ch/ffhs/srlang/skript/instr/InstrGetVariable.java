package ch.ffhs.srlang.skript.instr;

public class InstrGetVariable extends Instr {
    final String name;

    public InstrGetVariable(String name) {
        this.name = name;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitGetVariable(this);
    }
}
