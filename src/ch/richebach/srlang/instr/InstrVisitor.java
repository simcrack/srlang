package ch.richebach.srlang.instr;

/**
 * Visitor-Interface zum Besuchen aller Instruktionen (Instr*-Objekte).
 *
 * @author simon@richebach.ch
 */
interface InstrVisitor<R> {
    R visitInstructions(InstrInstructions instrInstructions);

    R visitBinExpression(InstrBinExpression instrBinExpression);

    R visitConstant(InstrConstant instrConstant);

    R visitGetVariable(InstrGetVariable instrGetVariable);

    R visitSetVariable(InstrSetVariable instrSetVariable);

    R visitEcho(InstrEcho instrEcho);

    R visitScript(InstrScript instrScript);

    R visitConditionalOperation(InstrConditional instrConditional);

    R visitLoop(InstrLoop instrLoop);

    R visitSetFunction(InstrSetFunction instrSetFunction);

    R visitGetFunction(InstrGetFunction instrGetFunction);
}
