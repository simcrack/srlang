
java -jar .\lib\java-cup-11a.jar -destdir .\src\ch\ffhs\srlang\skript\parser -interface -parser Parser -symbols Terminals .\grammars\Parser.cup
java -jar .\lib\JFlex.jar .\grammars\Scanner.flex -d .\src\ch\ffhs\srlang\skript\parser\