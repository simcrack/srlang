package ch.ffhs.srlang.skript.instr;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * Context Klasse für Variablen.
 * In dieser Implementierung wird sie nicht verwendet, Variablen werden in einfachen Maps abgelegt.
 * Contexts sind dann notwendig, wenn es verschachtelte Variablen getypt sind oder wenn es
 * Gültigkeitsbereiche von Variablen gibt (z.B. in Java: Instanzvariable,
 * lokale Variable in den Methoden und Variable, die nur in einem Teilblock einer Methode definiert sind.
 *
 * @author urs-martin
 */
public class Context {
    /**
     * Context für  umfassenden Namensraum.
     */
    private Context outerContext;

    /**
     * Eigene Variable des Contexts.
     */
    private HashMap<String, BigInteger> vars = new HashMap<String, BigInteger>();
    private HashMap<String, Function> funcs = new HashMap<>();

    public Context() {
    }

    public Context(Context outerContext) {
        this.outerContext = outerContext;
    }

    /**
     * Liefert den Wert einer Variablen zurück.
     * Wenn die Variable als eigene Variable definiert ist, wird dieser Wert zurückgegeben;
     * sonst wird sie im äusseren Kontext gesucht (falls dieser vorhanden ist).
     *
     * @param name
     * @return Wert der Variablen
     */
    public BigInteger getVariable(String name) {
        if (this.containsVariable(name)) return vars.get(name);
        if (outerContext != null && outerContext.containsVariable(name)) return outerContext.getVariable(name);

        throw new ElementDoesNotExistException(name);
    }

    public boolean containsVariable(String name) {
        return vars.containsKey(name);
    }

    public boolean isFunctionDefined(String name) {
        return funcs.containsKey(name) || outerContext != null && outerContext.isFunctionDefined(name);
    }
    /**
     * Ändert den Wert einer exisitierenden Variablen, wenn sie noch nicht existiert, wird sie im aktuellen
     * Context angelegt
     *
     * @param name
     * @param value
     */
    public void setVariable(String name, BigInteger value) {
        if (vars.containsKey(name)) {
            vars.put(name, value);
        } else if (outerContext != null && outerContext.containsVariable(name)) {
            outerContext.setVariable(name, value);
        } else {
            vars.put(name, value);
        }
    }

    public void setFunction(String name, Function function) {
        if (isFunctionDefined(name)) {
            throw new RuntimeException("Function " + name + " is already declared");
        }
        funcs.put(name, function);
    }

    public Function getFunction(String name) {
        if (funcs.containsKey(name)) return funcs.get(name);
        if (outerContext.funcs.containsKey(name)) return outerContext.funcs.get(name);
        throw new ElementDoesNotExistException(name);
    }
}
