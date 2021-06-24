package ch.richebach.srlang.instr;

import ch.richebach.srlang.Function;

import java.util.ArrayList;
import java.util.List;

/**
 * Instruktion, welche einer Funktionsdeklaration & -definition entspricht.
 * Die Definition zur Funktion werden in einem Function-Objekt gespeichert.
 *
 * @author simon@richebach.ch
 */
public class InstrSetFunction extends Instr {
    Function function;

    public InstrSetFunction(String name, InstrInstructions instructions) {
        this(name, new ArrayList<>(), instructions);
    }

    public InstrSetFunction(String name, List<String> argNames, InstrInstructions instructions) {
        this(name, argNames, instructions, new InstrConstant(0));
    }

    public InstrSetFunction(String name, List<String> argNames, InstrInstructions instructions, Instr returnExpression) {
        function = new Function(name, argNames, instructions, returnExpression);
    }

    public InstrSetFunction(String name, InstrInstructions instructions, Instr returnExpression) {
        this(name, new ArrayList<>(), instructions, returnExpression);
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitSetFunction(this);
    }
}
