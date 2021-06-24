package ch.richebach.srlang;

import ch.richebach.srlang.instr.Instr;
import ch.richebach.srlang.instr.InstrInstructions;

import java.util.List;

/**
 * Repräsentiert eine Funktionsdefinition.
 *
 * @author simon@richebach.ch
 */
public class Function {
    private final String name;
    private final List<String> argNames;
    private final InstrInstructions instructions;
    private final Instr returnExpression;

    /**
     * @param name             Funktionsname
     * @param argNames         Eine Liste von Argument-NAMEN (Variablen).
     * @param instructions     Code-Block mit einer Liste von Instruktionen, die die Funktion ausführen soll.
     * @param returnExpression Ausdruck, welcher nach der Ausführung der Funktion zurückgegeben werden soll.
     */
    public Function(String name, List<String> argNames, InstrInstructions instructions, Instr returnExpression) {
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
