package ch.richebach.srlang.parser;

import java_cup.runtime.Symbol;
import static ch.richebach.srlang.parser.Terminals.*;
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
"=="    { return sym(kwEqual); }
"<"     { return sym(kwLess); }
">"     { return sym(kwGreater); }


"("		{ return sym(kwRoundOpen); }
")"		{ return sym(kwRoundClose); }
"{"		{ return sym(kwCurlyOpen); }
"}"		{ return sym(kwCurlyClose); }

","     { return sym(kwList); }
";"		{ return sym(kwEnd); }
"el"    { return sym(kwElse); }
"fn"    { return sym(kwFunction); }
"if"    { return sym(kwIf); }
"lp"    { return sym(kwLoop); }
"ret"   { return sym(kwReturn); }
"echo"  { return sym(kwEcho); }

(true|false)  { return symVal(literalBoolean); }
\/\/.*\n    { }
[0-9]+  { return symVal(literalInteger); }
[a-zA-z][a-zA-Z0-9]{0,255} { return symVal(identifier); }

[\n\r]+ { }
[ \t]+  { }

.       { throw new RuntimeException("Illegal Symbol '" + yytext() + "' in line " + yyline + ", column " + yycolumn); }
