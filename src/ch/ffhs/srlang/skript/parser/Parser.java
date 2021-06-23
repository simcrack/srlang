
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Jun 23 14:53:27 CEST 2021
//----------------------------------------------------

package ch.ffhs.srlang.skript.parser;

import java.util.ArrayList;
import java_cup.runtime.*;
import ch.ffhs.srlang.skript.instr.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Jun 23 14:53:27 CEST 2021
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\004\000\002\002\005\000\002\003" +
    "\002\000\002\003\004\000\002\010\002\000\002\010\003" +
    "\000\002\004\006\000\002\005\003\000\002\005\004\000" +
    "\002\005\005\000\002\005\005\000\002\006\003\000\002" +
    "\006\005\000\002\006\005\000\002\007\003\000\002\007" +
    "\003\000\002\007\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\012\005\uffff\020\uffff\021\uffff\031\uffff\001" +
    "\002\000\004\002\037\001\002\000\012\005\014\020\011" +
    "\021\006\031\013\001\002\000\010\005\014\020\011\031" +
    "\021\001\002\000\020\002\ufff6\007\ufff6\014\ufff6\016\ufff6" +
    "\017\ufff6\021\ufff6\022\ufff6\001\002\000\012\005\ufffe\020" +
    "\ufffe\021\ufffe\031\ufffe\001\002\000\012\005\014\020\011" +
    "\021\006\031\021\001\002\000\012\002\ufffd\007\026\021" +
    "\025\022\032\001\002\000\020\002\ufff3\007\ufff3\010\023" +
    "\014\ufff3\016\ufff3\021\ufff3\022\ufff3\001\002\000\020\002" +
    "\ufff2\007\ufff2\014\ufff2\016\ufff2\017\ufff2\021\ufff2\022\ufff2" +
    "\001\002\000\020\002\ufffa\007\ufffa\014\017\016\016\017" +
    "\ufffa\021\ufffa\022\ufffa\001\002\000\010\005\014\020\011" +
    "\031\021\001\002\000\010\005\014\020\011\031\021\001" +
    "\002\000\020\002\ufff4\007\ufff4\014\ufff4\016\ufff4\017\ufff4" +
    "\021\ufff4\022\ufff4\001\002\000\020\002\ufff3\007\ufff3\014" +
    "\ufff3\016\ufff3\017\ufff3\021\ufff3\022\ufff3\001\002\000\020" +
    "\002\ufff5\007\ufff5\014\ufff5\016\ufff5\017\ufff5\021\ufff5\022" +
    "\ufff5\001\002\000\012\005\014\020\011\021\006\031\021" +
    "\001\002\000\010\007\026\021\025\022\027\001\002\000" +
    "\010\005\014\020\011\031\021\001\002\000\010\005\014" +
    "\020\011\031\021\001\002\000\012\005\ufffb\020\ufffb\021" +
    "\ufffb\031\ufffb\001\002\000\020\002\ufff8\007\ufff8\014\017" +
    "\016\016\017\ufff8\021\ufff8\022\ufff8\001\002\000\020\002" +
    "\ufff7\007\ufff7\014\017\016\016\017\ufff7\021\ufff7\022\ufff7" +
    "\001\002\000\004\002\ufffc\001\002\000\004\002\000\001" +
    "\002\000\010\007\026\017\035\021\025\001\002\000\020" +
    "\002\ufff1\007\ufff1\014\ufff1\016\ufff1\017\ufff1\021\ufff1\022" +
    "\ufff1\001\002\000\020\002\ufff9\007\ufff9\014\017\016\016" +
    "\017\ufff9\021\ufff9\022\ufff9\001\002\000\004\002\001\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\012\004\007\005\011\006\014\007\006\001\001" +
    "\000\006\006\035\007\006\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\005\033\006\014\007\006\001\001" +
    "\000\004\010\032\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\021\001\001\000\004" +
    "\007\017\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\005\023\006\014\007\006\001\001" +
    "\000\002\001\001\000\006\006\030\007\006\001\001\000" +
    "\006\006\027\007\006\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SIMPLE_TERM ::= kwRoundOpen SUM kwRoundClose 
            {
              Instruction RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = s; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIMPLE_TERM",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SIMPLE_TERM ::= literalInteger 
            {
              Instruction RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Number n = (Number)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = InstructionConstant.integer(n); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIMPLE_TERM",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SIMPLE_TERM ::= identifier 
            {
              Instruction RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new InstructionGetVariable(n); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SIMPLE_TERM",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // PRODUCT ::= PRODUCT kwDiv SIMPLE_TERM 
            {
              Instruction RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int stleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int stright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Instruction st = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.DIV, p, st); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PRODUCT",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // PRODUCT ::= PRODUCT kwMul SIMPLE_TERM 
            {
              Instruction RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int stleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int stright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Instruction st = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.TIMES, p, st); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PRODUCT",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // PRODUCT ::= SIMPLE_TERM 
            {
              Instruction RESULT =null;
		int stleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int stright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Instruction st = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = st; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("PRODUCT",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SUM ::= SUM kwSub PRODUCT 
            {
              Instruction RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.MINUS, s, p); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SUM",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SUM ::= SUM kwAdd PRODUCT 
            {
              Instruction RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.PLUS, s, p); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SUM",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SUM ::= kwSub PRODUCT 
            {
              Instruction RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new InstructionNegate(p); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SUM",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SUM ::= PRODUCT 
            {
              Instruction RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = p; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SUM",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ASSIGNMENT ::= identifier kwAssign SUM kwEnd 
            {
              Instruction RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new InstructionSetVariable(n, s); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ASSIGNMENT",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ENDE ::= kwEnd 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ENDE",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ENDE ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ENDE",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ASSIGNMENT_LIST ::= ASSIGNMENT_LIST ASSIGNMENT 
            {
              ArrayList<Instruction> RESULT =null;
		int alleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int alright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList<Instruction> al = (ArrayList<Instruction>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Instruction a = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		  RESULT = al;
                      RESULT.add(a);
                  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ASSIGNMENT_LIST",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ASSIGNMENT_LIST ::= 
            {
              ArrayList<Instruction> RESULT =null;
		  RESULT = new ArrayList<Instruction>(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ASSIGNMENT_LIST",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // SCRIPT ::= ASSIGNMENT_LIST SUM ENDE 
            {
              Instruction RESULT =null;
		int alleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int alright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ArrayList<Instruction> al = (ArrayList<Instruction>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new InstructionScript(al, s); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SCRIPT",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= SCRIPT EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Instruction start_val = (Instruction)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

