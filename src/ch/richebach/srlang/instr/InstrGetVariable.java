package ch.richebach.srlang.instr;

/**
 * Instruktion, welche dem auslesen des Inhalts einer Variable entspricht.
 * Wird zum Beispiel in Ausdrücken benötigt.
 *
 * @author simon@richebach.ch
 */
public class InstrGetVariable extends Instr {
    final String name;

    public InstrGetVariable(String name) {
        this.name = name;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitGetVariable(this);
    }
}
