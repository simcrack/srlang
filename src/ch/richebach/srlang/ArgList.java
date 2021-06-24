package ch.richebach.srlang;

import ch.richebach.srlang.instr.Instr;

import java.util.ArrayList;
import java.util.List;

/**
 * Liste von Werten, wird einer Funktion bei deren Aufruf übergeben.
 * Ist im Wesentlichen ein Wrapper für eine Liste von Ausdrüken.
 *
 * @author simon@richebach.ch
 */
public class ArgList {
    private final List<Instr> args = new ArrayList<>();

    public ArgList(Instr arg1) {
        args.add(arg1);
    }

    public ArgList() {
    }

    public void add(Instr arg) {
        args.add(arg);
    }

    public Instr getArg(int index) {
        return args.get(index);
    }
}
