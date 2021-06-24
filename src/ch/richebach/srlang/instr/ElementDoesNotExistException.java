package ch.richebach.srlang.instr;

public class ElementDoesNotExistException extends RuntimeException {
    public ElementDoesNotExistException(String elemName) {
        super(elemName);
    }
}
