package ch.ffhs.srlang.skript;

import ch.ffhs.srlang.skript.instr.Executor;
import ch.ffhs.srlang.skript.instr.Instr;
import ch.ffhs.srlang.skript.parser.Parser;
import ch.ffhs.srlang.skript.parser.Scanner;
import java_cup.runtime.Symbol;

import java.io.StringReader;
import java.util.Set;

/**
 * Interaktiver Interpreter als Konsonen-Applikation.
 * Ein Skript-Teil wird jeweils nach Eingabe einer Leerzeile ausgeführt.
 *
 * @author urs-martin
 */
public class SkriptRunner {
    public static void main(String[] args) {
        try {
            //String script = "abc := 12;\nlp (abc < 20) { echo 1; abc := abc + 1; }"; // echo (1 + abc) * 2;\necho abc * 2 + 1;if (abc == 2) { echo 1; }";
            String script = "fn test() { abr := 2;//Mein Test echo abr;\n ret (1); } echo 2 * test() + (2 + test()) * 3;";
            Parser parser = new Parser(new Scanner(new StringReader(script)));
            Symbol symbol = parser.parse();
            Instr instr = (Instr) symbol.value;

            Executor executor = new Executor();
            instr.acceptVisitor(executor);
        } catch (Exception ex) {
            //System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static String setToString(Set<String> set) {
        return set.toString();
    }
}
