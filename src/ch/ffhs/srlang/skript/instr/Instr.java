package ch.ffhs.srlang.skript.instr;

/**
 * Basisklasse für alle Instruktionen.
 *
 * @author urs-martin
 */
public abstract class Instr {
    public abstract <R> R acceptVisitor(InstrVisitor<R> visitor);

}
