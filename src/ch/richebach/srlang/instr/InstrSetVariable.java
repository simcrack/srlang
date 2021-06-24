package ch.richebach.srlang.instr;

/**
 * Instruktion, welche einer Variablendeklaration & -initialisierung entspricht.
 * Eine Variable besteht aus einem Namen und einem Ausdruck.
 *
 * @author simon@richebach.ch
 */
public class InstrSetVariable extends Instr {
    final String name;
    final Instr value;

    public InstrSetVariable(String name, Instr value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitSetVariable(this);
    }
}
