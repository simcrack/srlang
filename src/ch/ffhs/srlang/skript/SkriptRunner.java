package ch.ffhs.srlang.skript;

import java.io.StringReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import ch.ffhs.srlang.skript.instr.Executor;
import ch.ffhs.srlang.skript.instr.Instr;
import java_cup.runtime.Symbol;
import ch.ffhs.srlang.skript.parser.Parser;
import ch.ffhs.srlang.skript.parser.Scanner;

/**
 * Interaktiver Interpreter als Konsonen-Applikation. 
 * Ein Skript-Teil wird jeweils nach Eingabe einer Leerzeile ausgeführt.
 *  
 * @author urs-martin
 */
public class SkriptRunner
{
    public static void main(String[] args)
    {
        try
        {
            Map<String, BigInteger> context = new HashMap<>();
            String script = "abc := 12;\necho (1 + abc) * 2;\necho abc * 2 + 1;if (1 == 1) { echo 1; }";
            Parser parser = new Parser(new Scanner(new StringReader(script)));
            Symbol symbol = parser.parse();
            Instr instr = (Instr) symbol.value;

            Executor executor = new Executor(context);
            instr.acceptVisitor(executor);
        }
        catch (Exception ex)
        {
            //System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    private static String setToString(Set<String> set)
    {
        return set.toString();
    }
}
