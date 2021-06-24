package ch.richebach.srlang.instr;

/**
 * Instruktion, welche einem if-else-endif entspricht.
 * Besteht minimal aus einem boolschen Ausdruck (1=true, 0= false)
 * und einer Instruktionsliste für den Fall, dass der Ausdruck wahr ist.
 *
 * @author simon@richebach.ch
 */
public class InstrConditional extends Instr {
    final Instr boolExpression;
    final InstrInstructions trueExpression;
    final InstrInstructions falseExpression;

    public InstrConditional(Instr boolExpression, InstrInstructions trueExpression) {
        this.boolExpression = boolExpression;
        this.trueExpression = trueExpression;
        this.falseExpression = new InstrInstructions(); //leere Instruction liste
    }

    public InstrConditional(Instr boolExpression, InstrInstructions trueExpression, InstrInstructions falseExpression) {
        this.boolExpression = boolExpression;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitConditionalOperation(this);
    }
}
