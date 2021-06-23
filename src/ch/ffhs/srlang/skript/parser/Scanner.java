/* The following code was generated by JFlex 1.4.3 on 23.06.21 23:19 */

package ch.ffhs.srlang.skript.parser;

import java_cup.runtime.Symbol;
import static ch.ffhs.srlang.skript.parser.Terminals.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 23.06.21 23:19 from the specification file
 * <tt>./grammars/Scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  private static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  private static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\35\1\30\2\0\1\34\22\0\1\35\7\0\1\7\1\10"+
    "\1\3\1\1\1\13\1\2\1\0\1\4\12\31\1\5\1\14\1\0"+
    "\1\6\3\0\32\33\6\32\2\33\1\25\1\33\1\15\1\17\1\33"+
    "\1\26\1\21\2\33\1\16\1\33\1\20\1\27\1\22\1\33\1\23"+
    "\1\33\1\24\6\33\1\11\1\0\1\12\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\2\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\6\14\1\15\1\16"+
    "\1\15\1\0\1\17\1\20\1\14\1\21\1\14\1\22"+
    "\1\23\1\24\1\14\1\25\2\14\1\26\1\14\1\27"+
    "\374\14";

  private static int [] zzUnpackAction() {
    int [] result = new int[291];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\36\0\36\0\36\0\36\0\74\0\132\0\170"+
    "\0\36\0\36\0\36\0\36\0\36\0\36\0\226\0\264"+
    "\0\322\0\360\0\u010e\0\u012c\0\u014a\0\u0168\0\u0186\0\u01a4"+
    "\0\36\0\36\0\u01c2\0\u01c2\0\u01e0\0\u01c2\0\u01c2\0\u01c2"+
    "\0\u01fe\0\36\0\u021c\0\u023a\0\u021c\0\u0258\0\u0258\0\u0276"+
    "\0\u0294\0\u02b2\0\u02d0\0\u02ee\0\u030c\0\u032a\0\u0348\0\u0366"+
    "\0\u0384\0\u03a2\0\u03c0\0\u03de\0\u03fc\0\u041a\0\u0438\0\u0456"+
    "\0\u0474\0\u0492\0\u04b0\0\u04ce\0\u04ec\0\u050a\0\u0528\0\u0546"+
    "\0\u0564\0\u0582\0\u05a0\0\u05be\0\u05dc\0\u05fa\0\u0618\0\u0636"+
    "\0\u0654\0\u0672\0\u0690\0\u06ae\0\u06cc\0\u06ea\0\u0708\0\u0726"+
    "\0\u0744\0\u0762\0\u0780\0\u079e\0\u07bc\0\u07da\0\u07f8\0\u0816"+
    "\0\u0834\0\u0852\0\u0870\0\u088e\0\u08ac\0\u08ca\0\u08e8\0\u0906"+
    "\0\u0924\0\u0942\0\u0960\0\u097e\0\u099c\0\u09ba\0\u09d8\0\u09f6"+
    "\0\u0a14\0\u0a32\0\u0a50\0\u0a6e\0\u0a8c\0\u0aaa\0\u0ac8\0\u0ae6"+
    "\0\u0b04\0\u0b22\0\u0b40\0\u0b5e\0\u0b7c\0\u0b9a\0\u0bb8\0\u0bd6"+
    "\0\u0bf4\0\u0c12\0\u0c30\0\u0c4e\0\u0c6c\0\u0c8a\0\u0ca8\0\u0cc6"+
    "\0\u0ce4\0\u0d02\0\u0d20\0\u0d3e\0\u0d5c\0\u0d7a\0\u0d98\0\u0db6"+
    "\0\u0dd4\0\u0df2\0\u0e10\0\u0e2e\0\u0e4c\0\u0e6a\0\u0e88\0\u0ea6"+
    "\0\u0ec4\0\u0ee2\0\u0f00\0\u0f1e\0\u0f3c\0\u0f5a\0\u0f78\0\u0f96"+
    "\0\u0fb4\0\u0fd2\0\u0ff0\0\u100e\0\u102c\0\u104a\0\u1068\0\u1086"+
    "\0\u10a4\0\u10c2\0\u10e0\0\u10fe\0\u111c\0\u113a\0\u1158\0\u1176"+
    "\0\u1194\0\u11b2\0\u11d0\0\u11ee\0\u120c\0\u122a\0\u1248\0\u1266"+
    "\0\u1284\0\u12a2\0\u12c0\0\u12de\0\u12fc\0\u131a\0\u1338\0\u1356"+
    "\0\u1374\0\u1392\0\u13b0\0\u13ce\0\u13ec\0\u140a\0\u1428\0\u1446"+
    "\0\u1464\0\u1482\0\u14a0\0\u14be\0\u14dc\0\u14fa\0\u1518\0\u1536"+
    "\0\u1554\0\u1572\0\u1590\0\u15ae\0\u15cc\0\u15ea\0\u1608\0\u1626"+
    "\0\u1644\0\u1662\0\u1680\0\u169e\0\u16bc\0\u16da\0\u16f8\0\u1716"+
    "\0\u1734\0\u1752\0\u1770\0\u178e\0\u17ac\0\u17ca\0\u17e8\0\u1806"+
    "\0\u1824\0\u1842\0\u1860\0\u187e\0\u189c\0\u18ba\0\u18d8\0\u18f6"+
    "\0\u1914\0\u1932\0\u1950\0\u196e\0\u198c\0\u19aa\0\u19c8\0\u19e6"+
    "\0\u1a04\0\u1a22\0\u1a40\0\u1a5e\0\u1a7c\0\u1a9a\0\u1ab8\0\u1ad6"+
    "\0\u1af4\0\u1b12\0\u1b30\0\u1b4e\0\u1b6c\0\u1b8a\0\u1ba8\0\u1bc6"+
    "\0\u1be4\0\u1c02\0\u1c20\0\u1c3e\0\u1c5c\0\u1c7a\0\u1c98\0\u1cb6"+
    "\0\u1cd4\0\u1cf2\0\u1d10\0\u1d2e\0\u1d4c\0\u1d6a\0\u1d88\0\u1da6"+
    "\0\u1dc4\0\u1de2\0\u1e00\0\u1e1e\0\u1e3c\0\u1e5a\0\u1e78\0\u1e96"+
    "\0\u1eb4\0\u1ed2\0\u1ef0\0\u1f0e\0\u1f2c\0\u1f4a\0\u1f68\0\u1f86"+
    "\0\u1fa4\0\u1fc2\0\36";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[291];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\22\1\24\4\22\1\25\1\26\2\22"+
    "\1\25\1\27\42\0\1\30\37\0\1\31\35\0\1\32"+
    "\44\0\1\33\1\34\6\33\1\35\2\33\1\0\1\33"+
    "\1\0\1\33\17\0\5\33\1\36\5\33\1\0\1\33"+
    "\1\0\1\33\17\0\3\33\1\37\7\33\1\0\1\33"+
    "\1\0\1\33\17\0\13\33\1\0\1\33\1\0\1\33"+
    "\17\0\2\33\1\40\10\33\1\0\1\33\1\0\1\33"+
    "\17\0\1\41\12\33\1\0\1\33\1\0\1\33\32\0"+
    "\1\25\3\0\1\25\32\0\1\26\41\0\1\27\30\30"+
    "\1\42\5\30\15\0\13\43\1\0\1\43\1\0\1\43"+
    "\17\0\11\43\1\44\1\43\1\0\1\43\1\0\1\43"+
    "\17\0\7\43\1\45\3\43\1\0\1\43\1\0\1\43"+
    "\17\0\13\46\1\0\1\46\1\0\1\46\17\0\12\46"+
    "\1\47\1\0\1\46\1\0\1\46\17\0\13\50\1\0"+
    "\1\50\1\0\1\50\17\0\13\51\1\0\1\51\1\0"+
    "\1\51\17\0\13\52\1\0\1\52\1\0\1\52\17\0"+
    "\13\53\1\0\1\53\1\0\1\53\17\0\13\54\1\0"+
    "\1\54\1\0\1\54\17\0\13\55\1\0\1\55\1\0"+
    "\1\55\17\0\13\56\1\0\1\56\1\0\1\56\17\0"+
    "\13\57\1\0\1\57\1\0\1\57\17\0\13\60\1\0"+
    "\1\60\1\0\1\60\17\0\13\61\1\0\1\61\1\0"+
    "\1\61\17\0\13\62\1\0\1\62\1\0\1\62\17\0"+
    "\13\63\1\0\1\63\1\0\1\63\17\0\13\64\1\0"+
    "\1\64\1\0\1\64\17\0\13\65\1\0\1\65\1\0"+
    "\1\65\17\0\13\66\1\0\1\66\1\0\1\66\17\0"+
    "\13\67\1\0\1\67\1\0\1\67\17\0\13\70\1\0"+
    "\1\70\1\0\1\70\17\0\13\71\1\0\1\71\1\0"+
    "\1\71\17\0\13\72\1\0\1\72\1\0\1\72\17\0"+
    "\13\73\1\0\1\73\1\0\1\73\17\0\13\74\1\0"+
    "\1\74\1\0\1\74\17\0\13\75\1\0\1\75\1\0"+
    "\1\75\17\0\13\76\1\0\1\76\1\0\1\76\17\0"+
    "\13\77\1\0\1\77\1\0\1\77\17\0\13\100\1\0"+
    "\1\100\1\0\1\100\17\0\13\101\1\0\1\101\1\0"+
    "\1\101\17\0\13\102\1\0\1\102\1\0\1\102\17\0"+
    "\13\103\1\0\1\103\1\0\1\103\17\0\13\104\1\0"+
    "\1\104\1\0\1\104\17\0\13\105\1\0\1\105\1\0"+
    "\1\105\17\0\13\106\1\0\1\106\1\0\1\106\17\0"+
    "\13\107\1\0\1\107\1\0\1\107\17\0\13\110\1\0"+
    "\1\110\1\0\1\110\17\0\13\111\1\0\1\111\1\0"+
    "\1\111\17\0\13\112\1\0\1\112\1\0\1\112\17\0"+
    "\13\113\1\0\1\113\1\0\1\113\17\0\13\114\1\0"+
    "\1\114\1\0\1\114\17\0\13\115\1\0\1\115\1\0"+
    "\1\115\17\0\13\116\1\0\1\116\1\0\1\116\17\0"+
    "\13\117\1\0\1\117\1\0\1\117\17\0\13\120\1\0"+
    "\1\120\1\0\1\120\17\0\13\121\1\0\1\121\1\0"+
    "\1\121\17\0\13\122\1\0\1\122\1\0\1\122\17\0"+
    "\13\123\1\0\1\123\1\0\1\123\17\0\13\124\1\0"+
    "\1\124\1\0\1\124\17\0\13\125\1\0\1\125\1\0"+
    "\1\125\17\0\13\126\1\0\1\126\1\0\1\126\17\0"+
    "\13\127\1\0\1\127\1\0\1\127\17\0\13\130\1\0"+
    "\1\130\1\0\1\130\17\0\13\131\1\0\1\131\1\0"+
    "\1\131\17\0\13\132\1\0\1\132\1\0\1\132\17\0"+
    "\13\133\1\0\1\133\1\0\1\133\17\0\13\134\1\0"+
    "\1\134\1\0\1\134\17\0\13\135\1\0\1\135\1\0"+
    "\1\135\17\0\13\136\1\0\1\136\1\0\1\136\17\0"+
    "\13\137\1\0\1\137\1\0\1\137\17\0\13\140\1\0"+
    "\1\140\1\0\1\140\17\0\13\141\1\0\1\141\1\0"+
    "\1\141\17\0\13\142\1\0\1\142\1\0\1\142\17\0"+
    "\13\143\1\0\1\143\1\0\1\143\17\0\13\144\1\0"+
    "\1\144\1\0\1\144\17\0\13\145\1\0\1\145\1\0"+
    "\1\145\17\0\13\146\1\0\1\146\1\0\1\146\17\0"+
    "\13\147\1\0\1\147\1\0\1\147\17\0\13\150\1\0"+
    "\1\150\1\0\1\150\17\0\13\151\1\0\1\151\1\0"+
    "\1\151\17\0\13\152\1\0\1\152\1\0\1\152\17\0"+
    "\13\153\1\0\1\153\1\0\1\153\17\0\13\154\1\0"+
    "\1\154\1\0\1\154\17\0\13\155\1\0\1\155\1\0"+
    "\1\155\17\0\13\156\1\0\1\156\1\0\1\156\17\0"+
    "\13\157\1\0\1\157\1\0\1\157\17\0\13\160\1\0"+
    "\1\160\1\0\1\160\17\0\13\161\1\0\1\161\1\0"+
    "\1\161\17\0\13\162\1\0\1\162\1\0\1\162\17\0"+
    "\13\163\1\0\1\163\1\0\1\163\17\0\13\164\1\0"+
    "\1\164\1\0\1\164\17\0\13\165\1\0\1\165\1\0"+
    "\1\165\17\0\13\166\1\0\1\166\1\0\1\166\17\0"+
    "\13\167\1\0\1\167\1\0\1\167\17\0\13\170\1\0"+
    "\1\170\1\0\1\170\17\0\13\171\1\0\1\171\1\0"+
    "\1\171\17\0\13\172\1\0\1\172\1\0\1\172\17\0"+
    "\13\173\1\0\1\173\1\0\1\173\17\0\13\174\1\0"+
    "\1\174\1\0\1\174\17\0\13\175\1\0\1\175\1\0"+
    "\1\175\17\0\13\176\1\0\1\176\1\0\1\176\17\0"+
    "\13\177\1\0\1\177\1\0\1\177\17\0\13\200\1\0"+
    "\1\200\1\0\1\200\17\0\13\201\1\0\1\201\1\0"+
    "\1\201\17\0\13\202\1\0\1\202\1\0\1\202\17\0"+
    "\13\203\1\0\1\203\1\0\1\203\17\0\13\204\1\0"+
    "\1\204\1\0\1\204\17\0\13\205\1\0\1\205\1\0"+
    "\1\205\17\0\13\206\1\0\1\206\1\0\1\206\17\0"+
    "\13\207\1\0\1\207\1\0\1\207\17\0\13\210\1\0"+
    "\1\210\1\0\1\210\17\0\13\211\1\0\1\211\1\0"+
    "\1\211\17\0\13\212\1\0\1\212\1\0\1\212\17\0"+
    "\13\213\1\0\1\213\1\0\1\213\17\0\13\214\1\0"+
    "\1\214\1\0\1\214\17\0\13\215\1\0\1\215\1\0"+
    "\1\215\17\0\13\216\1\0\1\216\1\0\1\216\17\0"+
    "\13\217\1\0\1\217\1\0\1\217\17\0\13\220\1\0"+
    "\1\220\1\0\1\220\17\0\13\221\1\0\1\221\1\0"+
    "\1\221\17\0\13\222\1\0\1\222\1\0\1\222\17\0"+
    "\13\223\1\0\1\223\1\0\1\223\17\0\13\224\1\0"+
    "\1\224\1\0\1\224\17\0\13\225\1\0\1\225\1\0"+
    "\1\225\17\0\13\226\1\0\1\226\1\0\1\226\17\0"+
    "\13\227\1\0\1\227\1\0\1\227\17\0\13\230\1\0"+
    "\1\230\1\0\1\230\17\0\13\231\1\0\1\231\1\0"+
    "\1\231\17\0\13\232\1\0\1\232\1\0\1\232\17\0"+
    "\13\233\1\0\1\233\1\0\1\233\17\0\13\234\1\0"+
    "\1\234\1\0\1\234\17\0\13\235\1\0\1\235\1\0"+
    "\1\235\17\0\13\236\1\0\1\236\1\0\1\236\17\0"+
    "\13\237\1\0\1\237\1\0\1\237\17\0\13\240\1\0"+
    "\1\240\1\0\1\240\17\0\13\241\1\0\1\241\1\0"+
    "\1\241\17\0\13\242\1\0\1\242\1\0\1\242\17\0"+
    "\13\243\1\0\1\243\1\0\1\243\17\0\13\244\1\0"+
    "\1\244\1\0\1\244\17\0\13\245\1\0\1\245\1\0"+
    "\1\245\17\0\13\246\1\0\1\246\1\0\1\246\17\0"+
    "\13\247\1\0\1\247\1\0\1\247\17\0\13\250\1\0"+
    "\1\250\1\0\1\250\17\0\13\251\1\0\1\251\1\0"+
    "\1\251\17\0\13\252\1\0\1\252\1\0\1\252\17\0"+
    "\13\253\1\0\1\253\1\0\1\253\17\0\13\254\1\0"+
    "\1\254\1\0\1\254\17\0\13\255\1\0\1\255\1\0"+
    "\1\255\17\0\13\256\1\0\1\256\1\0\1\256\17\0"+
    "\13\257\1\0\1\257\1\0\1\257\17\0\13\260\1\0"+
    "\1\260\1\0\1\260\17\0\13\261\1\0\1\261\1\0"+
    "\1\261\17\0\13\262\1\0\1\262\1\0\1\262\17\0"+
    "\13\263\1\0\1\263\1\0\1\263\17\0\13\264\1\0"+
    "\1\264\1\0\1\264\17\0\13\265\1\0\1\265\1\0"+
    "\1\265\17\0\13\266\1\0\1\266\1\0\1\266\17\0"+
    "\13\267\1\0\1\267\1\0\1\267\17\0\13\270\1\0"+
    "\1\270\1\0\1\270\17\0\13\271\1\0\1\271\1\0"+
    "\1\271\17\0\13\272\1\0\1\272\1\0\1\272\17\0"+
    "\13\273\1\0\1\273\1\0\1\273\17\0\13\274\1\0"+
    "\1\274\1\0\1\274\17\0\13\275\1\0\1\275\1\0"+
    "\1\275\17\0\13\276\1\0\1\276\1\0\1\276\17\0"+
    "\13\277\1\0\1\277\1\0\1\277\17\0\13\300\1\0"+
    "\1\300\1\0\1\300\17\0\13\301\1\0\1\301\1\0"+
    "\1\301\17\0\13\302\1\0\1\302\1\0\1\302\17\0"+
    "\13\303\1\0\1\303\1\0\1\303\17\0\13\304\1\0"+
    "\1\304\1\0\1\304\17\0\13\305\1\0\1\305\1\0"+
    "\1\305\17\0\13\306\1\0\1\306\1\0\1\306\17\0"+
    "\13\307\1\0\1\307\1\0\1\307\17\0\13\310\1\0"+
    "\1\310\1\0\1\310\17\0\13\311\1\0\1\311\1\0"+
    "\1\311\17\0\13\312\1\0\1\312\1\0\1\312\17\0"+
    "\13\313\1\0\1\313\1\0\1\313\17\0\13\314\1\0"+
    "\1\314\1\0\1\314\17\0\13\315\1\0\1\315\1\0"+
    "\1\315\17\0\13\316\1\0\1\316\1\0\1\316\17\0"+
    "\13\317\1\0\1\317\1\0\1\317\17\0\13\320\1\0"+
    "\1\320\1\0\1\320\17\0\13\321\1\0\1\321\1\0"+
    "\1\321\17\0\13\322\1\0\1\322\1\0\1\322\17\0"+
    "\13\323\1\0\1\323\1\0\1\323\17\0\13\324\1\0"+
    "\1\324\1\0\1\324\17\0\13\325\1\0\1\325\1\0"+
    "\1\325\17\0\13\326\1\0\1\326\1\0\1\326\17\0"+
    "\13\327\1\0\1\327\1\0\1\327\17\0\13\330\1\0"+
    "\1\330\1\0\1\330\17\0\13\331\1\0\1\331\1\0"+
    "\1\331\17\0\13\332\1\0\1\332\1\0\1\332\17\0"+
    "\13\333\1\0\1\333\1\0\1\333\17\0\13\334\1\0"+
    "\1\334\1\0\1\334\17\0\13\335\1\0\1\335\1\0"+
    "\1\335\17\0\13\336\1\0\1\336\1\0\1\336\17\0"+
    "\13\337\1\0\1\337\1\0\1\337\17\0\13\340\1\0"+
    "\1\340\1\0\1\340\17\0\13\341\1\0\1\341\1\0"+
    "\1\341\17\0\13\342\1\0\1\342\1\0\1\342\17\0"+
    "\13\343\1\0\1\343\1\0\1\343\17\0\13\344\1\0"+
    "\1\344\1\0\1\344\17\0\13\345\1\0\1\345\1\0"+
    "\1\345\17\0\13\346\1\0\1\346\1\0\1\346\17\0"+
    "\13\347\1\0\1\347\1\0\1\347\17\0\13\350\1\0"+
    "\1\350\1\0\1\350\17\0\13\351\1\0\1\351\1\0"+
    "\1\351\17\0\13\352\1\0\1\352\1\0\1\352\17\0"+
    "\13\353\1\0\1\353\1\0\1\353\17\0\13\354\1\0"+
    "\1\354\1\0\1\354\17\0\13\355\1\0\1\355\1\0"+
    "\1\355\17\0\13\356\1\0\1\356\1\0\1\356\17\0"+
    "\13\357\1\0\1\357\1\0\1\357\17\0\13\360\1\0"+
    "\1\360\1\0\1\360\17\0\13\361\1\0\1\361\1\0"+
    "\1\361\17\0\13\362\1\0\1\362\1\0\1\362\17\0"+
    "\13\363\1\0\1\363\1\0\1\363\17\0\13\364\1\0"+
    "\1\364\1\0\1\364\17\0\13\365\1\0\1\365\1\0"+
    "\1\365\17\0\13\366\1\0\1\366\1\0\1\366\17\0"+
    "\13\367\1\0\1\367\1\0\1\367\17\0\13\370\1\0"+
    "\1\370\1\0\1\370\17\0\13\371\1\0\1\371\1\0"+
    "\1\371\17\0\13\372\1\0\1\372\1\0\1\372\17\0"+
    "\13\373\1\0\1\373\1\0\1\373\17\0\13\374\1\0"+
    "\1\374\1\0\1\374\17\0\13\375\1\0\1\375\1\0"+
    "\1\375\17\0\13\376\1\0\1\376\1\0\1\376\17\0"+
    "\13\377\1\0\1\377\1\0\1\377\17\0\13\u0100\1\0"+
    "\1\u0100\1\0\1\u0100\17\0\13\u0101\1\0\1\u0101\1\0"+
    "\1\u0101\17\0\13\u0102\1\0\1\u0102\1\0\1\u0102\17\0"+
    "\13\u0103\1\0\1\u0103\1\0\1\u0103\17\0\13\u0104\1\0"+
    "\1\u0104\1\0\1\u0104\17\0\13\u0105\1\0\1\u0105\1\0"+
    "\1\u0105\17\0\13\u0106\1\0\1\u0106\1\0\1\u0106\17\0"+
    "\13\u0107\1\0\1\u0107\1\0\1\u0107\17\0\13\u0108\1\0"+
    "\1\u0108\1\0\1\u0108\17\0\13\u0109\1\0\1\u0109\1\0"+
    "\1\u0109\17\0\13\u010a\1\0\1\u010a\1\0\1\u010a\17\0"+
    "\13\u010b\1\0\1\u010b\1\0\1\u010b\17\0\13\u010c\1\0"+
    "\1\u010c\1\0\1\u010c\17\0\13\u010d\1\0\1\u010d\1\0"+
    "\1\u010d\17\0\13\u010e\1\0\1\u010e\1\0\1\u010e\17\0"+
    "\13\u010f\1\0\1\u010f\1\0\1\u010f\17\0\13\u0110\1\0"+
    "\1\u0110\1\0\1\u0110\17\0\13\u0111\1\0\1\u0111\1\0"+
    "\1\u0111\17\0\13\u0112\1\0\1\u0112\1\0\1\u0112\17\0"+
    "\13\u0113\1\0\1\u0113\1\0\1\u0113\17\0\13\u0114\1\0"+
    "\1\u0114\1\0\1\u0114\17\0\13\u0115\1\0\1\u0115\1\0"+
    "\1\u0115\17\0\13\u0116\1\0\1\u0116\1\0\1\u0116\17\0"+
    "\13\u0117\1\0\1\u0117\1\0\1\u0117\17\0\13\u0118\1\0"+
    "\1\u0118\1\0\1\u0118\17\0\13\u0119\1\0\1\u0119\1\0"+
    "\1\u0119\17\0\13\u011a\1\0\1\u011a\1\0\1\u011a\17\0"+
    "\13\u011b\1\0\1\u011b\1\0\1\u011b\17\0\13\u011c\1\0"+
    "\1\u011c\1\0\1\u011c\17\0\13\u011d\1\0\1\u011d\1\0"+
    "\1\u011d\17\0\13\u011e\1\0\1\u011e\1\0\1\u011e\17\0"+
    "\13\u011f\1\0\1\u011f\1\0\1\u011f\17\0\13\u0120\1\0"+
    "\1\u0120\1\0\1\u0120\17\0\13\u0121\1\0\1\u0121\1\0"+
    "\1\u0121\17\0\13\u0122\1\0\1\u0122\1\0\1\u0122\17\0"+
    "\13\u0123\1\0\1\u0123\1\0\1\u0123\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8160];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\4\11\3\1\6\11\11\1\1\0\2\11\7\1"+
    "\1\11\u0100\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[291];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

    private Symbol sym(int type)
    {
         return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symVal(int type)
    {
         return new Symbol(type, yyline, yycolumn, yytext());
    }
   


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 94) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  private final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  private final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  private final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  private final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  private final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  private final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  private final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { throw new RuntimeException("Illegal Symbol '" + yytext() + "' in line " + yyline + ", column " + yycolumn);
          }
        case 24: break;
        case 19: 
          { return sym(kwFunction);
          }
        case 25: break;
        case 12: 
          { return symVal(identifier);
          }
        case 26: break;
        case 11: 
          { return sym(kwEnd);
          }
        case 27: break;
        case 9: 
          { return sym(kwCurlyClose);
          }
        case 28: break;
        case 2: 
          { return sym(kwAdd);
          }
        case 29: break;
        case 7: 
          { return sym(kwRoundClose);
          }
        case 30: break;
        case 6: 
          { return sym(kwRoundOpen);
          }
        case 31: break;
        case 17: 
          { return sym(kwElse);
          }
        case 32: break;
        case 14: 
          { return symVal(literalInteger);
          }
        case 33: break;
        case 21: 
          { return sym(comment);
          }
        case 34: break;
        case 18: 
          { return sym(kwLoop);
          }
        case 35: break;
        case 4: 
          { return sym(kwMul);
          }
        case 36: break;
        case 15: 
          { return sym(kwAssign);
          }
        case 37: break;
        case 23: 
          { return sym(kwEcho);
          }
        case 38: break;
        case 10: 
          { return sym(kwList);
          }
        case 39: break;
        case 22: 
          { return sym(kwReturn);
          }
        case 40: break;
        case 20: 
          { return sym(kwIf);
          }
        case 41: break;
        case 8: 
          { return sym(kwCurlyOpen);
          }
        case 42: break;
        case 3: 
          { return sym(kwSub);
          }
        case 43: break;
        case 5: 
          { return sym(kwDiv);
          }
        case 44: break;
        case 16: 
          { return sym(kwCompare);
          }
        case 45: break;
        case 13: 
          { 
          }
        case 46: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(Terminals.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
