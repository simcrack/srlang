package ch.richebach.srlang.instr;

import ch.richebach.srlang.BinOperator;

/**
 * Instruktion, welche einen binärem Ausdruck entspricht.
 * Ein binärer Ausdruck besteht aus zwei Ausdrücken und einem Operanden.
 * Wird sowohl für arithmetische, als auch für boolsche Ausdrücke verwendet.
 *
 * @author simon@richebach.ch
 */
public class InstrBinExpression extends Instr {
    final BinOperator operator;
    final Instr leftExpression;
    final Instr rightExpression;

    public InstrBinExpression(BinOperator operator, Instr leftExpression, Instr rightExpression) {
        this.operator = operator;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitBinExpression(this);
    }
}
