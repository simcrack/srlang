package ch.ffhs.srlang.skript.instr;

import java.util.ArrayList;
import java.util.List;

public class ArgList {
    private final List<Instr> args = new ArrayList<>();

    public ArgList(Instr arg1) {
        args.add(arg1);
    }
    public ArgList() {}

    public void add(Instr arg) {
        args.add(arg);
    }
    public Instr getArg(int index) {
        return args.get(index);
    }
}
