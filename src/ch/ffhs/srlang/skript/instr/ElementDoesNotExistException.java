package ch.ffhs.srlang.skript.instr;

public class ElementDoesNotExistException extends RuntimeException {
    ElementDoesNotExistException(String varName) {
        super(varName);
    }
}
