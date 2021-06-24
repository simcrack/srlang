package ch.richebach.srlang.instr;

/**
 * Basisklasse für alle Instruktionen.
 *
 * @author urs-martin
 */
public abstract class Instr {
    public abstract <R> R acceptVisitor(InstrVisitor<R> visitor);
}
