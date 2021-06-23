package ch.ffhs.srlang.skript.instr;

import java.util.List;

public class InstrScript extends Instr {

    final InstrInstructions instructions;

    public InstrScript(InstrInstructions instructions) {
        this.instructions = instructions;
    }


    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitScript(this);
    }

}
