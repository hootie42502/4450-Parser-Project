grammar PythonParser;

prog: (statement NEWLINE)* statement? EOF;

statement: expr;

expr: expr OPERATOR expr
    | expr ASSIGNMENT expr
    | INT
    | FLOAT
    | '(' expr ')'
    | VAR
    | STRING
    | CHAR
    | ARRAY
    | BOOL
    ;

NEWLINE : [\r\n]+;
INT     : [0-9]+;
FLOAT   : INT '.' INT;
STRING  : '"' (LETTER | INT)* '"';
CHAR    : '\'' [a-zA-Z0-9] '\'';
BOOL    : ('True' | 'False');
OPERATOR: ( '*' | '/' | '+' | '-' | '%' | '**' | '//' );
ASSIGNMENT : ( '+=' | '=' | '-=' | '/=' | '*=' | '%=' | '**=' | '//=' | '|=' | '^=' | '&=' );
SPACE : ' ' -> skip;
VAR : (LETTER | '_' ) ( LETTER | INT | '_')* ;
LETTER : [a-zA-Z];
ARRAY : ('[' ((INT | FLOAT | CHAR) ((',' ((SPACE)*)? (INT | FLOAT | CHAR))*)? ']') | '[]');

