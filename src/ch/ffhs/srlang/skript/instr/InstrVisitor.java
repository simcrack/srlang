package ch.ffhs.srlang.skript.instr;

public interface InstrVisitor<R> {
    public R visitInstructions(InstrInstructions instrInstructions);

    public R visitBinaryOperation(InstrBinaryOperation instrBinaryOperation);

    public R visitNegation(InstrNegate instructionUnaryOperation);

    public R visitConstant(InstrConstant instrConstant);

    public R visitGetVariable(InstrGetVariable instrGetVariable);

    public R visitSetVariable(InstrSetVariable instrSetVariable);

    public R visitEcho(InstrEcho instrEcho);

    public R visitScript(InstrScript instrScript);

    public R visitConditionalOperation(InstrConditional instrConditional);

    public R visitLoopOperation(InstrLoop instrLoop);

    public R visitSetFunction(InstrSetFunction instrSetFunction);

    public R visitGetFunction(InstrGetFunction instrGetFunction);
}
