package ch.richebach.srlang;

import ch.richebach.srlang.instr.Executor;
import ch.richebach.srlang.instr.Instr;
import ch.richebach.srlang.parser.Parser;
import ch.richebach.srlang.parser.Scanner;
import java_cup.runtime.Symbol;

import java.io.FileReader;

/**
 * Code-Interpreter für die Sprache srlang.
 * Führt ein Script aus, welches als Konsolen-Argument übergeben werden muss.
 *
 * @author urs-martin
 * @author simon@richebach.ch
 */


public class Interpreter {

    public static void main(String[] args) {

        if (args.length != 1) {
            printUsage();
        }
        try {
            Parser parser = new Parser(new Scanner(new FileReader(args[0])));
            Symbol startSymbol = parser.parse();
            Instr script = (Instr) startSymbol.value;

            Executor executor = new Executor();
            script.acceptVisitor(executor);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printUsage() {
        System.out.println("Usage: srlang FILE\n"
                + "Runs a script file which is written in srlang scripting language.");
    }
}
