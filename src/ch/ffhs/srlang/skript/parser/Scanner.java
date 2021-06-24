/* The following code was generated by JFlex 1.4.3 on 24.06.21 12:30 */

package ch.ffhs.srlang.skript.parser;

import java_cup.runtime.Symbol;
import static ch.ffhs.srlang.skript.parser.Terminals.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 24.06.21 12:30 from the specification file
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
    "\11\0\1\36\1\31\2\0\1\35\22\0\1\36\7\0\1\10\1\11"+
    "\1\3\1\1\1\14\1\2\1\0\1\4\12\32\1\5\1\15\1\7"+
    "\1\6\3\0\32\34\6\33\2\34\1\26\1\34\1\16\1\20\1\34"+
    "\1\27\1\22\2\34\1\17\1\34\1\21\1\30\1\23\1\34\1\24"+
    "\1\34\1\25\6\34\1\12\1\0\1\13\uff82\0";

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
    "\1\7\1\10\1\11\1\12\1\13\1\14\6\15\1\16"+
    "\1\17\1\16\1\0\1\20\1\21\1\15\1\22\1\15"+
    "\1\23\1\24\1\25\1\15\1\16\2\15\1\26\1\15"+
    "\1\27\374\15";

  private static int [] zzUnpackAction() {
    int [] result = new int[292];
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
    "\0\0\0\37\0\37\0\37\0\37\0\76\0\135\0\174"+
    "\0\37\0\37\0\37\0\37\0\37\0\37\0\37\0\233"+
    "\0\272\0\331\0\370\0\u0117\0\u0136\0\u0155\0\u0174\0\u0193"+
    "\0\u01b2\0\37\0\37\0\u01d1\0\u01d1\0\u01f0\0\u01d1\0\u01d1"+
    "\0\u01d1\0\u020f\0\37\0\u022e\0\u024d\0\u022e\0\u026c\0\u026c"+
    "\0\u028b\0\u02aa\0\u02c9\0\u02e8\0\u0307\0\u0326\0\u0345\0\u0364"+
    "\0\u0383\0\u03a2\0\u03c1\0\u03e0\0\u03ff\0\u041e\0\u043d\0\u045c"+
    "\0\u047b\0\u049a\0\u04b9\0\u04d8\0\u04f7\0\u0516\0\u0535\0\u0554"+
    "\0\u0573\0\u0592\0\u05b1\0\u05d0\0\u05ef\0\u060e\0\u062d\0\u064c"+
    "\0\u066b\0\u068a\0\u06a9\0\u06c8\0\u06e7\0\u0706\0\u0725\0\u0744"+
    "\0\u0763\0\u0782\0\u07a1\0\u07c0\0\u07df\0\u07fe\0\u081d\0\u083c"+
    "\0\u085b\0\u087a\0\u0899\0\u08b8\0\u08d7\0\u08f6\0\u0915\0\u0934"+
    "\0\u0953\0\u0972\0\u0991\0\u09b0\0\u09cf\0\u09ee\0\u0a0d\0\u0a2c"+
    "\0\u0a4b\0\u0a6a\0\u0a89\0\u0aa8\0\u0ac7\0\u0ae6\0\u0b05\0\u0b24"+
    "\0\u0b43\0\u0b62\0\u0b81\0\u0ba0\0\u0bbf\0\u0bde\0\u0bfd\0\u0c1c"+
    "\0\u0c3b\0\u0c5a\0\u0c79\0\u0c98\0\u0cb7\0\u0cd6\0\u0cf5\0\u0d14"+
    "\0\u0d33\0\u0d52\0\u0d71\0\u0d90\0\u0daf\0\u0dce\0\u0ded\0\u0e0c"+
    "\0\u0e2b\0\u0e4a\0\u0e69\0\u0e88\0\u0ea7\0\u0ec6\0\u0ee5\0\u0f04"+
    "\0\u0f23\0\u0f42\0\u0f61\0\u0f80\0\u0f9f\0\u0fbe\0\u0fdd\0\u0ffc"+
    "\0\u101b\0\u103a\0\u1059\0\u1078\0\u1097\0\u10b6\0\u10d5\0\u10f4"+
    "\0\u1113\0\u1132\0\u1151\0\u1170\0\u118f\0\u11ae\0\u11cd\0\u11ec"+
    "\0\u120b\0\u122a\0\u1249\0\u1268\0\u1287\0\u12a6\0\u12c5\0\u12e4"+
    "\0\u1303\0\u1322\0\u1341\0\u1360\0\u137f\0\u139e\0\u13bd\0\u13dc"+
    "\0\u13fb\0\u141a\0\u1439\0\u1458\0\u1477\0\u1496\0\u14b5\0\u14d4"+
    "\0\u14f3\0\u1512\0\u1531\0\u1550\0\u156f\0\u158e\0\u15ad\0\u15cc"+
    "\0\u15eb\0\u160a\0\u1629\0\u1648\0\u1667\0\u1686\0\u16a5\0\u16c4"+
    "\0\u16e3\0\u1702\0\u1721\0\u1740\0\u175f\0\u177e\0\u179d\0\u17bc"+
    "\0\u17db\0\u17fa\0\u1819\0\u1838\0\u1857\0\u1876\0\u1895\0\u18b4"+
    "\0\u18d3\0\u18f2\0\u1911\0\u1930\0\u194f\0\u196e\0\u198d\0\u19ac"+
    "\0\u19cb\0\u19ea\0\u1a09\0\u1a28\0\u1a47\0\u1a66\0\u1a85\0\u1aa4"+
    "\0\u1ac3\0\u1ae2\0\u1b01\0\u1b20\0\u1b3f\0\u1b5e\0\u1b7d\0\u1b9c"+
    "\0\u1bbb\0\u1bda\0\u1bf9\0\u1c18\0\u1c37\0\u1c56\0\u1c75\0\u1c94"+
    "\0\u1cb3\0\u1cd2\0\u1cf1\0\u1d10\0\u1d2f\0\u1d4e\0\u1d6d\0\u1d8c"+
    "\0\u1dab\0\u1dca\0\u1de9\0\u1e08\0\u1e27\0\u1e46\0\u1e65\0\u1e84"+
    "\0\u1ea3\0\u1ec2\0\u1ee1\0\u1f00\0\u1f1f\0\u1f3e\0\u1f5d\0\u1f7c"+
    "\0\u1f9b\0\u1fba\0\u1fd9\0\u1ff8\0\u2017\0\u2036\0\u2055\0\u2074"+
    "\0\u2093\0\u20b2\0\u20d1\0\37";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[292];
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
    "\1\22\1\23\1\24\1\23\1\25\4\23\1\26\1\27"+
    "\2\23\1\26\1\30\43\0\1\31\40\0\1\32\36\0"+
    "\1\33\46\0\1\34\1\35\6\34\1\36\2\34\1\0"+
    "\1\34\1\0\1\34\20\0\5\34\1\37\5\34\1\0"+
    "\1\34\1\0\1\34\20\0\3\34\1\40\7\34\1\0"+
    "\1\34\1\0\1\34\20\0\13\34\1\0\1\34\1\0"+
    "\1\34\20\0\2\34\1\41\10\34\1\0\1\34\1\0"+
    "\1\34\20\0\1\42\12\34\1\0\1\34\1\0\1\34"+
    "\33\0\1\26\3\0\1\26\33\0\1\27\42\0\1\30"+
    "\31\31\1\43\5\31\16\0\13\44\1\0\1\44\1\0"+
    "\1\44\20\0\11\44\1\45\1\44\1\0\1\44\1\0"+
    "\1\44\20\0\7\44\1\46\3\44\1\0\1\44\1\0"+
    "\1\44\20\0\13\47\1\0\1\47\1\0\1\47\20\0"+
    "\12\47\1\50\1\0\1\47\1\0\1\47\20\0\13\51"+
    "\1\0\1\51\1\0\1\51\20\0\13\52\1\0\1\52"+
    "\1\0\1\52\20\0\13\53\1\0\1\53\1\0\1\53"+
    "\20\0\13\54\1\0\1\54\1\0\1\54\20\0\13\55"+
    "\1\0\1\55\1\0\1\55\20\0\13\56\1\0\1\56"+
    "\1\0\1\56\20\0\13\57\1\0\1\57\1\0\1\57"+
    "\20\0\13\60\1\0\1\60\1\0\1\60\20\0\13\61"+
    "\1\0\1\61\1\0\1\61\20\0\13\62\1\0\1\62"+
    "\1\0\1\62\20\0\13\63\1\0\1\63\1\0\1\63"+
    "\20\0\13\64\1\0\1\64\1\0\1\64\20\0\13\65"+
    "\1\0\1\65\1\0\1\65\20\0\13\66\1\0\1\66"+
    "\1\0\1\66\20\0\13\67\1\0\1\67\1\0\1\67"+
    "\20\0\13\70\1\0\1\70\1\0\1\70\20\0\13\71"+
    "\1\0\1\71\1\0\1\71\20\0\13\72\1\0\1\72"+
    "\1\0\1\72\20\0\13\73\1\0\1\73\1\0\1\73"+
    "\20\0\13\74\1\0\1\74\1\0\1\74\20\0\13\75"+
    "\1\0\1\75\1\0\1\75\20\0\13\76\1\0\1\76"+
    "\1\0\1\76\20\0\13\77\1\0\1\77\1\0\1\77"+
    "\20\0\13\100\1\0\1\100\1\0\1\100\20\0\13\101"+
    "\1\0\1\101\1\0\1\101\20\0\13\102\1\0\1\102"+
    "\1\0\1\102\20\0\13\103\1\0\1\103\1\0\1\103"+
    "\20\0\13\104\1\0\1\104\1\0\1\104\20\0\13\105"+
    "\1\0\1\105\1\0\1\105\20\0\13\106\1\0\1\106"+
    "\1\0\1\106\20\0\13\107\1\0\1\107\1\0\1\107"+
    "\20\0\13\110\1\0\1\110\1\0\1\110\20\0\13\111"+
    "\1\0\1\111\1\0\1\111\20\0\13\112\1\0\1\112"+
    "\1\0\1\112\20\0\13\113\1\0\1\113\1\0\1\113"+
    "\20\0\13\114\1\0\1\114\1\0\1\114\20\0\13\115"+
    "\1\0\1\115\1\0\1\115\20\0\13\116\1\0\1\116"+
    "\1\0\1\116\20\0\13\117\1\0\1\117\1\0\1\117"+
    "\20\0\13\120\1\0\1\120\1\0\1\120\20\0\13\121"+
    "\1\0\1\121\1\0\1\121\20\0\13\122\1\0\1\122"+
    "\1\0\1\122\20\0\13\123\1\0\1\123\1\0\1\123"+
    "\20\0\13\124\1\0\1\124\1\0\1\124\20\0\13\125"+
    "\1\0\1\125\1\0\1\125\20\0\13\126\1\0\1\126"+
    "\1\0\1\126\20\0\13\127\1\0\1\127\1\0\1\127"+
    "\20\0\13\130\1\0\1\130\1\0\1\130\20\0\13\131"+
    "\1\0\1\131\1\0\1\131\20\0\13\132\1\0\1\132"+
    "\1\0\1\132\20\0\13\133\1\0\1\133\1\0\1\133"+
    "\20\0\13\134\1\0\1\134\1\0\1\134\20\0\13\135"+
    "\1\0\1\135\1\0\1\135\20\0\13\136\1\0\1\136"+
    "\1\0\1\136\20\0\13\137\1\0\1\137\1\0\1\137"+
    "\20\0\13\140\1\0\1\140\1\0\1\140\20\0\13\141"+
    "\1\0\1\141\1\0\1\141\20\0\13\142\1\0\1\142"+
    "\1\0\1\142\20\0\13\143\1\0\1\143\1\0\1\143"+
    "\20\0\13\144\1\0\1\144\1\0\1\144\20\0\13\145"+
    "\1\0\1\145\1\0\1\145\20\0\13\146\1\0\1\146"+
    "\1\0\1\146\20\0\13\147\1\0\1\147\1\0\1\147"+
    "\20\0\13\150\1\0\1\150\1\0\1\150\20\0\13\151"+
    "\1\0\1\151\1\0\1\151\20\0\13\152\1\0\1\152"+
    "\1\0\1\152\20\0\13\153\1\0\1\153\1\0\1\153"+
    "\20\0\13\154\1\0\1\154\1\0\1\154\20\0\13\155"+
    "\1\0\1\155\1\0\1\155\20\0\13\156\1\0\1\156"+
    "\1\0\1\156\20\0\13\157\1\0\1\157\1\0\1\157"+
    "\20\0\13\160\1\0\1\160\1\0\1\160\20\0\13\161"+
    "\1\0\1\161\1\0\1\161\20\0\13\162\1\0\1\162"+
    "\1\0\1\162\20\0\13\163\1\0\1\163\1\0\1\163"+
    "\20\0\13\164\1\0\1\164\1\0\1\164\20\0\13\165"+
    "\1\0\1\165\1\0\1\165\20\0\13\166\1\0\1\166"+
    "\1\0\1\166\20\0\13\167\1\0\1\167\1\0\1\167"+
    "\20\0\13\170\1\0\1\170\1\0\1\170\20\0\13\171"+
    "\1\0\1\171\1\0\1\171\20\0\13\172\1\0\1\172"+
    "\1\0\1\172\20\0\13\173\1\0\1\173\1\0\1\173"+
    "\20\0\13\174\1\0\1\174\1\0\1\174\20\0\13\175"+
    "\1\0\1\175\1\0\1\175\20\0\13\176\1\0\1\176"+
    "\1\0\1\176\20\0\13\177\1\0\1\177\1\0\1\177"+
    "\20\0\13\200\1\0\1\200\1\0\1\200\20\0\13\201"+
    "\1\0\1\201\1\0\1\201\20\0\13\202\1\0\1\202"+
    "\1\0\1\202\20\0\13\203\1\0\1\203\1\0\1\203"+
    "\20\0\13\204\1\0\1\204\1\0\1\204\20\0\13\205"+
    "\1\0\1\205\1\0\1\205\20\0\13\206\1\0\1\206"+
    "\1\0\1\206\20\0\13\207\1\0\1\207\1\0\1\207"+
    "\20\0\13\210\1\0\1\210\1\0\1\210\20\0\13\211"+
    "\1\0\1\211\1\0\1\211\20\0\13\212\1\0\1\212"+
    "\1\0\1\212\20\0\13\213\1\0\1\213\1\0\1\213"+
    "\20\0\13\214\1\0\1\214\1\0\1\214\20\0\13\215"+
    "\1\0\1\215\1\0\1\215\20\0\13\216\1\0\1\216"+
    "\1\0\1\216\20\0\13\217\1\0\1\217\1\0\1\217"+
    "\20\0\13\220\1\0\1\220\1\0\1\220\20\0\13\221"+
    "\1\0\1\221\1\0\1\221\20\0\13\222\1\0\1\222"+
    "\1\0\1\222\20\0\13\223\1\0\1\223\1\0\1\223"+
    "\20\0\13\224\1\0\1\224\1\0\1\224\20\0\13\225"+
    "\1\0\1\225\1\0\1\225\20\0\13\226\1\0\1\226"+
    "\1\0\1\226\20\0\13\227\1\0\1\227\1\0\1\227"+
    "\20\0\13\230\1\0\1\230\1\0\1\230\20\0\13\231"+
    "\1\0\1\231\1\0\1\231\20\0\13\232\1\0\1\232"+
    "\1\0\1\232\20\0\13\233\1\0\1\233\1\0\1\233"+
    "\20\0\13\234\1\0\1\234\1\0\1\234\20\0\13\235"+
    "\1\0\1\235\1\0\1\235\20\0\13\236\1\0\1\236"+
    "\1\0\1\236\20\0\13\237\1\0\1\237\1\0\1\237"+
    "\20\0\13\240\1\0\1\240\1\0\1\240\20\0\13\241"+
    "\1\0\1\241\1\0\1\241\20\0\13\242\1\0\1\242"+
    "\1\0\1\242\20\0\13\243\1\0\1\243\1\0\1\243"+
    "\20\0\13\244\1\0\1\244\1\0\1\244\20\0\13\245"+
    "\1\0\1\245\1\0\1\245\20\0\13\246\1\0\1\246"+
    "\1\0\1\246\20\0\13\247\1\0\1\247\1\0\1\247"+
    "\20\0\13\250\1\0\1\250\1\0\1\250\20\0\13\251"+
    "\1\0\1\251\1\0\1\251\20\0\13\252\1\0\1\252"+
    "\1\0\1\252\20\0\13\253\1\0\1\253\1\0\1\253"+
    "\20\0\13\254\1\0\1\254\1\0\1\254\20\0\13\255"+
    "\1\0\1\255\1\0\1\255\20\0\13\256\1\0\1\256"+
    "\1\0\1\256\20\0\13\257\1\0\1\257\1\0\1\257"+
    "\20\0\13\260\1\0\1\260\1\0\1\260\20\0\13\261"+
    "\1\0\1\261\1\0\1\261\20\0\13\262\1\0\1\262"+
    "\1\0\1\262\20\0\13\263\1\0\1\263\1\0\1\263"+
    "\20\0\13\264\1\0\1\264\1\0\1\264\20\0\13\265"+
    "\1\0\1\265\1\0\1\265\20\0\13\266\1\0\1\266"+
    "\1\0\1\266\20\0\13\267\1\0\1\267\1\0\1\267"+
    "\20\0\13\270\1\0\1\270\1\0\1\270\20\0\13\271"+
    "\1\0\1\271\1\0\1\271\20\0\13\272\1\0\1\272"+
    "\1\0\1\272\20\0\13\273\1\0\1\273\1\0\1\273"+
    "\20\0\13\274\1\0\1\274\1\0\1\274\20\0\13\275"+
    "\1\0\1\275\1\0\1\275\20\0\13\276\1\0\1\276"+
    "\1\0\1\276\20\0\13\277\1\0\1\277\1\0\1\277"+
    "\20\0\13\300\1\0\1\300\1\0\1\300\20\0\13\301"+
    "\1\0\1\301\1\0\1\301\20\0\13\302\1\0\1\302"+
    "\1\0\1\302\20\0\13\303\1\0\1\303\1\0\1\303"+
    "\20\0\13\304\1\0\1\304\1\0\1\304\20\0\13\305"+
    "\1\0\1\305\1\0\1\305\20\0\13\306\1\0\1\306"+
    "\1\0\1\306\20\0\13\307\1\0\1\307\1\0\1\307"+
    "\20\0\13\310\1\0\1\310\1\0\1\310\20\0\13\311"+
    "\1\0\1\311\1\0\1\311\20\0\13\312\1\0\1\312"+
    "\1\0\1\312\20\0\13\313\1\0\1\313\1\0\1\313"+
    "\20\0\13\314\1\0\1\314\1\0\1\314\20\0\13\315"+
    "\1\0\1\315\1\0\1\315\20\0\13\316\1\0\1\316"+
    "\1\0\1\316\20\0\13\317\1\0\1\317\1\0\1\317"+
    "\20\0\13\320\1\0\1\320\1\0\1\320\20\0\13\321"+
    "\1\0\1\321\1\0\1\321\20\0\13\322\1\0\1\322"+
    "\1\0\1\322\20\0\13\323\1\0\1\323\1\0\1\323"+
    "\20\0\13\324\1\0\1\324\1\0\1\324\20\0\13\325"+
    "\1\0\1\325\1\0\1\325\20\0\13\326\1\0\1\326"+
    "\1\0\1\326\20\0\13\327\1\0\1\327\1\0\1\327"+
    "\20\0\13\330\1\0\1\330\1\0\1\330\20\0\13\331"+
    "\1\0\1\331\1\0\1\331\20\0\13\332\1\0\1\332"+
    "\1\0\1\332\20\0\13\333\1\0\1\333\1\0\1\333"+
    "\20\0\13\334\1\0\1\334\1\0\1\334\20\0\13\335"+
    "\1\0\1\335\1\0\1\335\20\0\13\336\1\0\1\336"+
    "\1\0\1\336\20\0\13\337\1\0\1\337\1\0\1\337"+
    "\20\0\13\340\1\0\1\340\1\0\1\340\20\0\13\341"+
    "\1\0\1\341\1\0\1\341\20\0\13\342\1\0\1\342"+
    "\1\0\1\342\20\0\13\343\1\0\1\343\1\0\1\343"+
    "\20\0\13\344\1\0\1\344\1\0\1\344\20\0\13\345"+
    "\1\0\1\345\1\0\1\345\20\0\13\346\1\0\1\346"+
    "\1\0\1\346\20\0\13\347\1\0\1\347\1\0\1\347"+
    "\20\0\13\350\1\0\1\350\1\0\1\350\20\0\13\351"+
    "\1\0\1\351\1\0\1\351\20\0\13\352\1\0\1\352"+
    "\1\0\1\352\20\0\13\353\1\0\1\353\1\0\1\353"+
    "\20\0\13\354\1\0\1\354\1\0\1\354\20\0\13\355"+
    "\1\0\1\355\1\0\1\355\20\0\13\356\1\0\1\356"+
    "\1\0\1\356\20\0\13\357\1\0\1\357\1\0\1\357"+
    "\20\0\13\360\1\0\1\360\1\0\1\360\20\0\13\361"+
    "\1\0\1\361\1\0\1\361\20\0\13\362\1\0\1\362"+
    "\1\0\1\362\20\0\13\363\1\0\1\363\1\0\1\363"+
    "\20\0\13\364\1\0\1\364\1\0\1\364\20\0\13\365"+
    "\1\0\1\365\1\0\1\365\20\0\13\366\1\0\1\366"+
    "\1\0\1\366\20\0\13\367\1\0\1\367\1\0\1\367"+
    "\20\0\13\370\1\0\1\370\1\0\1\370\20\0\13\371"+
    "\1\0\1\371\1\0\1\371\20\0\13\372\1\0\1\372"+
    "\1\0\1\372\20\0\13\373\1\0\1\373\1\0\1\373"+
    "\20\0\13\374\1\0\1\374\1\0\1\374\20\0\13\375"+
    "\1\0\1\375\1\0\1\375\20\0\13\376\1\0\1\376"+
    "\1\0\1\376\20\0\13\377\1\0\1\377\1\0\1\377"+
    "\20\0\13\u0100\1\0\1\u0100\1\0\1\u0100\20\0\13\u0101"+
    "\1\0\1\u0101\1\0\1\u0101\20\0\13\u0102\1\0\1\u0102"+
    "\1\0\1\u0102\20\0\13\u0103\1\0\1\u0103\1\0\1\u0103"+
    "\20\0\13\u0104\1\0\1\u0104\1\0\1\u0104\20\0\13\u0105"+
    "\1\0\1\u0105\1\0\1\u0105\20\0\13\u0106\1\0\1\u0106"+
    "\1\0\1\u0106\20\0\13\u0107\1\0\1\u0107\1\0\1\u0107"+
    "\20\0\13\u0108\1\0\1\u0108\1\0\1\u0108\20\0\13\u0109"+
    "\1\0\1\u0109\1\0\1\u0109\20\0\13\u010a\1\0\1\u010a"+
    "\1\0\1\u010a\20\0\13\u010b\1\0\1\u010b\1\0\1\u010b"+
    "\20\0\13\u010c\1\0\1\u010c\1\0\1\u010c\20\0\13\u010d"+
    "\1\0\1\u010d\1\0\1\u010d\20\0\13\u010e\1\0\1\u010e"+
    "\1\0\1\u010e\20\0\13\u010f\1\0\1\u010f\1\0\1\u010f"+
    "\20\0\13\u0110\1\0\1\u0110\1\0\1\u0110\20\0\13\u0111"+
    "\1\0\1\u0111\1\0\1\u0111\20\0\13\u0112\1\0\1\u0112"+
    "\1\0\1\u0112\20\0\13\u0113\1\0\1\u0113\1\0\1\u0113"+
    "\20\0\13\u0114\1\0\1\u0114\1\0\1\u0114\20\0\13\u0115"+
    "\1\0\1\u0115\1\0\1\u0115\20\0\13\u0116\1\0\1\u0116"+
    "\1\0\1\u0116\20\0\13\u0117\1\0\1\u0117\1\0\1\u0117"+
    "\20\0\13\u0118\1\0\1\u0118\1\0\1\u0118\20\0\13\u0119"+
    "\1\0\1\u0119\1\0\1\u0119\20\0\13\u011a\1\0\1\u011a"+
    "\1\0\1\u011a\20\0\13\u011b\1\0\1\u011b\1\0\1\u011b"+
    "\20\0\13\u011c\1\0\1\u011c\1\0\1\u011c\20\0\13\u011d"+
    "\1\0\1\u011d\1\0\1\u011d\20\0\13\u011e\1\0\1\u011e"+
    "\1\0\1\u011e\20\0\13\u011f\1\0\1\u011f\1\0\1\u011f"+
    "\20\0\13\u0120\1\0\1\u0120\1\0\1\u0120\20\0\13\u0121"+
    "\1\0\1\u0121\1\0\1\u0121\20\0\13\u0122\1\0\1\u0122"+
    "\1\0\1\u0122\20\0\13\u0123\1\0\1\u0123\1\0\1\u0123"+
    "\20\0\13\u0124\1\0\1\u0124\1\0\1\u0124\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8432];
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
    "\1\0\4\11\3\1\7\11\11\1\1\0\2\11\7\1"+
    "\1\11\u0100\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[292];
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
        case 20: 
          { return sym(kwFunction);
          }
        case 25: break;
        case 13: 
          { return symVal(identifier);
          }
        case 26: break;
        case 12: 
          { return sym(kwEnd);
          }
        case 27: break;
        case 10: 
          { return sym(kwCurlyClose);
          }
        case 28: break;
        case 2: 
          { return sym(kwAdd);
          }
        case 29: break;
        case 8: 
          { return sym(kwRoundClose);
          }
        case 30: break;
        case 7: 
          { return sym(kwRoundOpen);
          }
        case 31: break;
        case 18: 
          { return sym(kwElse);
          }
        case 32: break;
        case 15: 
          { return symVal(literalInteger);
          }
        case 33: break;
        case 17: 
          { return sym(kwEqual);
          }
        case 34: break;
        case 19: 
          { return sym(kwLoop);
          }
        case 35: break;
        case 4: 
          { return sym(kwMul);
          }
        case 36: break;
        case 16: 
          { return sym(kwAssign);
          }
        case 37: break;
        case 6: 
          { return sym(kwLess);
          }
        case 38: break;
        case 23: 
          { return sym(kwEcho);
          }
        case 39: break;
        case 11: 
          { return sym(kwList);
          }
        case 40: break;
        case 22: 
          { return sym(kwReturn);
          }
        case 41: break;
        case 21: 
          { return sym(kwIf);
          }
        case 42: break;
        case 9: 
          { return sym(kwCurlyOpen);
          }
        case 43: break;
        case 3: 
          { return sym(kwSub);
          }
        case 44: break;
        case 5: 
          { return sym(kwDiv);
          }
        case 45: break;
        case 14: 
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
