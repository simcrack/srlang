package ch.richebach.srlang;

import ch.richebach.srlang.instr.ElementAlreadyExistsException;
import ch.richebach.srlang.instr.ElementDoesNotExistException;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * Context Klasse für den aktuellen Zustand/Namensraum (sichtbare Variablem und Funktionen).
 * Wird für Funktionen benötigt (Funktionsargumente und lokale Variablen sind nur innerhalb der
 * Funktion verfügbar, wo sie deklariert wurden).
 *
 * @author simon@richebach.ch
 */
public class Context {
    // Context für den Namensraum ausserhalb des aktuellen Code-Blocks.
    private final Context outerContext;

    // Variablenn und Funktionen des eigenen Namesraums.
    private final HashMap<String, BigInteger> variables = new HashMap<>();
    private final HashMap<String, Function> functions = new HashMap<>();

    public Context() {
        this.outerContext = null;
    }

    public Context(Context outerContext) {
        this.outerContext = outerContext;
    }

    /**
     * Kontrolliert, ob im Kontect eine bestimmte Variable deklariert ist.
     * Der äussere Context wird im Gegensatz zu containsVariable() ebenfalls durchsucht.
     *
     * @param name Variablenname
     * @return true, wenn die Variable deklariert ist, false sonst.
     */
    public boolean isVariableDefined(String name) {
        return this.containsVariable(name) || outerContext != null && outerContext.containsVariable(name);
    }

    /**
     * Ändert den Wert einer Variable.
     * Wenn die Variable weder im aktuellen noch im äusseren Context existiert, wird sie neu angelegt.
     *
     * @param name  Variablenname
     * @param value Wert der Variable
     */
    public void setVariable(String name, BigInteger value) {
        if (variables.containsKey(name)) {
            variables.put(name, value);
        } else if (outerContext != null && outerContext.containsVariable(name)) {
            outerContext.setVariable(name, value);
        } else {
            variables.put(name, value);
        }
    }

    /**
     * Liefert den Wert einer Variable zurück.
     * Wenn die Variable als eigene Variable definiert ist, wird dieser Wert zurückgegeben.
     * Sonst wird sie im äusseren Context gesucht (falls dieser vorhanden ist).
     *
     * @param name Variablenname
     * @return Wert der Variable
     */
    public BigInteger getVariable(String name) {
        if (isVariableDefined(name)) {
            if (this.containsVariable(name)) {
                return variables.get(name);
            } else {
                assert outerContext != null; //Wird durch isVariableDefined() sichergestellt
                return outerContext.getVariable(name);
            }
        }
        throw new ElementDoesNotExistException(name);
    }

    /**
     * Kontrolliert, ob der Context eine bestimmte Variable enthält.
     * Der äussere Context wird im Gegensatz zu isVariableDefined() nicht durchsucht.
     *
     * @param name Variablenname
     * @return true, wenn die Variable existiert, false sonst.
     */
    private boolean containsVariable(String name) {
        return variables.containsKey(name);
    }

    /**
     * Kontrolliert, ob im Kontect eine bestimmte Funktion deklariert ist.
     * Der äussere Context wird ebenfalls durchsucht.
     *
     * @param name Funktionsname
     * @return true, wenn die Variable deklariert ist, false sonst.
     */
    public boolean isFunctionDefined(String name) {
        return functions.containsKey(name) || outerContext != null && outerContext.isFunctionDefined(name);
    }

    /**
     * Definiert eine neue Funktion im aktuellen Context.
     * Wenn die Funktion bereits im aktuellen oder äusseren Context existiert, wird ein Fehler geworfen.
     *
     * @param name     Funktionsname
     * @param function Funktions-Definition
     */
    public void setFunction(String name, Function function) {
        if (isFunctionDefined(name)) {
            throw new ElementAlreadyExistsException(name);
        }
        functions.put(name, function);
    }

    /**
     * Gibt die Definition einer Funktion zurück.
     * Es wird dazu sowohl im aktuellen, als auch im äusseren Kontext gesucht.
     *
     * @param name Funktionsname
     * @return Funktions-Definition
     */
    public Function getFunction(String name) {
        if (isFunctionDefined(name)) {
            if (functions.containsKey(name)) {
                return functions.get(name);
            } else {
                assert outerContext != null; //Wird durch Aufruf von isFunctionDefined() sichergestellt
                return outerContext.functions.get(name);
            }
        }
        throw new ElementDoesNotExistException(name);
    }
}