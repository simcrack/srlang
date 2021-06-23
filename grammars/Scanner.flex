package ch.ffhs.srlang.skript.parser;

import java_cup.runtime.Symbol;
import static ch.ffhs.srlang.skript.parser.Terminals.*;

%%

%public
%apiprivate
%class Scanner
%cupsym Terminals
%cup
%unicode
%line
%column

%{

    private Symbol sym(int type)
    {
         return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symVal(int type)
    {
         return new Symbol(type, yyline, yycolumn, yytext());
    }
   
%}

%%

"+"     { return sym(kwAdd); }
"-"     { return sym(kwSub); }
"*"     { return sym(kwMul); }
"/"     { return sym(kwDiv); }
":="    { return sym(kwAssign); }
"("		{ return sym(kwRoundOpen); }
")"		{ return sym(kwRoundClose); }

[0-9]+  { return symVal(literalInteger); }
[a-zA-z][a-zA-Z0-9]{0,255} { return symVal(identifier); }

[\n\r]+ { return sym(kwEnd); }
\/\/.*  { }
[ \t]+  { }

.       { throw new RuntimeException("Illegal Symbol '" + yytext() + "' in line " + yyline + ", column " + yycolumn); }






