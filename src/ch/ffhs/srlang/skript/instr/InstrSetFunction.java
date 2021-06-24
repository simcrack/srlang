package ch.ffhs.srlang.skript.instr;

import java.util.ArrayList;
import java.util.List;

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
