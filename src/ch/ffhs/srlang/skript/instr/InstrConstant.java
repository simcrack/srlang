package ch.ffhs.srlang.skript.instr;

import java.math.BigInteger;

public class InstrConstant extends Instr {
    final BigInteger value;

    public static InstrConstant fromString(String str) {
        return new InstrConstant(new BigInteger(str));
    }

    public InstrConstant(BigInteger value) {
        this.value = value;
    }
    public InstrConstant(Integer value) {
        this.value = BigInteger.valueOf(value);
    }

    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitConstant(this);
    }
}
