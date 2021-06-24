package ch.richebach.srlang.instr;

/**
 * Instruktion, welche einem Ausgabebefehl (echo) entspricht.
 *
 * @author simon@richebach.ch
 */
public class InstrEcho extends Instr {
    final Instr expression;

    /**
     * expression wird bei der Ausführung der InstrEcho-Instruktion auf der Kommandozeile ausgegeben.
     */
    public InstrEcho(Instr expression) {
        this.expression = expression;
    }

    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitEcho(this);
    }
}
