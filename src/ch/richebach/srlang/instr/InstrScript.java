package ch.richebach.srlang.instr;

/**
 * Instruktion, welche dem gesamten Script entspricht (Wurzelknoten).
 * Ein Script besteht aus genau einem Code-Block, welcher eine beliebige Anzahl von Instruktionen
 * (auch Code-Blöcke) enthalten kann.
 *
 * @author simon@richebach.ch
 */
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
