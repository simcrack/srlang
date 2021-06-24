package ch.richebach.srlang.instr;

public class ElementAlreadyExistsException extends RuntimeException {
    public ElementAlreadyExistsException(String elemName) {
        super(elemName);
    }
}
