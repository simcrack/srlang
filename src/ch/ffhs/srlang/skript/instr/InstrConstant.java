package ch.ffhs.srlang.skript.instr;

import java.math.BigInteger;

public class InstrConstant extends Instr {
    final Object value;

    public static InstrConstant integer(String str) {
        return new InstrConstant(new BigInteger(str));
    }

    public InstrConstant(Object value) {
        this.value = value;
    }

    public <R> R acceptVisitor(InstrVisitor<R> visitor) {
        return visitor.visitConstant(this);
    }
}
