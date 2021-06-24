package ch.richebach.srlang.instr;

/**
 * Instruktion, welche einem Loop entspricht.
 * Besteht aus einem boolschen Ausdruck (1=true, 0= false)
 * und einer Instruktionsliste, welche solange ausgeführt wird, als  der Ausdruck wahr ist.
 *
 * @author simon@richebach.ch
 */
public class InstrLoop extends Instr {
    final Instr boolExpression;
    final InstrInstructions cmdExpression;

    public InstrLoop(Instr boolExpression, InstrInstructions cmdExpression) {
        this.boolExpression = boolExpression;
        this.cmdExpression = cmdExpression;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitLoop(this);
    }
}
