package ch.richebach.srlang.instr;

import java.math.BigInteger;

/**
 * Instruktion, welche eine Konstante repräsentiert.
 * Wird sowohl für Zahlen, als auch für boolean-Literale benötigt (true=1, false=0).
 *
 * @author simon@richebach.ch
 */
public class InstrConstant extends Instr {
    final BigInteger value;

    /**
     * Instanziiert ein InstConstant-Objekt.
     *
     * @param str Zahl oder boolean-Literal (true|false), wird in einen BigInteger konvertiert.
     * @return Neu erstelltes InstConstant-Objekt.
     */
    public static InstrConstant fromString(String str) {
        switch (str) {
            case "true":
                return new InstrConstant(1);
            case "false":
                return new InstrConstant(0);
            default:
                return new InstrConstant(new BigInteger(str));
        }
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
