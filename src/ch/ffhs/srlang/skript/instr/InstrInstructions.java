package ch.ffhs.srlang.skript.instr;

import java.util.ArrayList;
import java.util.List;

public class InstrInstructions extends Instr {

    final List<Instr> instructions;

    public InstrInstructions() {
        this.instructions = new ArrayList<>();
    }

    public InstrInstructions(List<Instr> instructions) {
        this.instructions = instructions;
    }
    public void addInstruction(Instr instr) {
        this.instructions.add(instr);
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitInstructions(this);
    }

}
