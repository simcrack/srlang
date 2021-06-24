package ch.richebach.srlang.instr;

import ch.richebach.srlang.ArgList;

/**
 * Instruktion, welche einem Funktionsaufruf entspricht.
 * Ein Funktionsaufruf besteht aus einem Funktionsname und einer Argumentliste.
 *
 * @author simon@richebach.ch
 */
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
