package ch.ffhs.srlang.skript.instr;

import java.util.List;

public class Function {
    private final String name;
    private final List<String> argNames;
    private final InstrInstructions instructions;
    private final Instr returnExpression;

    Function(String name, List<String> argNames, InstrInstructions instructions, Instr returnExpression) {
        this.name = name;
        this.argNames = argNames;
        this.instructions = instructions;
        this.returnExpression = returnExpression;
    }

    public List<String> getArgNames() {
        return argNames;
    }

    public String getName() {
        return name;
    }

    public InstrInstructions getInstructions() {
        return instructions;
    }

    public Instr getReturnExpression() {
        return returnExpression;
    }

}
