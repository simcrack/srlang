package ch.ffhs.srlang.skript.instr;

public class InstrGetFunction extends Instr {
    final String name;
    final ArgList argList;

    public InstrGetFunction(String name, ArgList argList) {
        this.name = name;
        this.argList = argList;
    }
    public InstrGetFunction(String name) {
        this(name, new ArgList());
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitGetFunction(this);
    }

}
