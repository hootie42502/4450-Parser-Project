// You might notice this is almost completely re-architected compared to my previous deliverable
// Basically my old one was super poorly written as i kept running into issues when writing
// the grammar for if/elif/else blocks so i redid it. Im still running into issues with the
// grammar recognizing consecutive if blocks as nested instead. Ive been working the past two days
// on this and im nowhere :/

grammar PythonParser;

// Define tokens
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: ('-'? [0-9]+);
FLOAT: ('-'? [0-9]+ '.' [0-9]*) | ('-'? '.' [0-9]+) | ('-'? [0-9]+);
CHAR: '\'' . '\'';
STRING: '"' .*? '"';
BOOL: 'True' | 'False';
NEWLINE: '\r'? '\n' -> skip;

// Define parser rules
program: statement+ EOF;

statement: assignment | arithmetic_operation | array_declaration | variable_declaration | if_statement | while_statement | for_statement;

assignment: ID assignment_operator (STRING | FLOAT | INT | CHAR | ID);

arithmetic_operation: ID '=' expression;
expression: or_expression;

or_expression: and_expression ('or' and_expression)*;
and_expression: (rel_expression | not_expression) ('and' (rel_expression | not_expression) )*;
rel_expression: add_expression (relational_operator add_expression)?;
not_expression: 'not' atom | atom;

add_expression: mul_expression (('+' | '-') mul_expression)*;
mul_expression: atom (('*' | '/' | '%') atom)*;

atom: ID | INT | FLOAT | CHAR | STRING | BOOL | '(' expression ')';

array_declaration: ID '=' '[' (expression (',' expression)*)? ']';

variable_declaration: ID '=' expression;

if_statement: 'if' expression ':' statement+ ('elif' expression ':' statement+ )* ('else' ':' statement+ )?;

while_statement: 'while' expression ':' statement+ ;

for_statement: 'for' ID 'in' (ID | range_operator) ':' statement+ ;
range_operator: 'range('  INT  ','  INT  ')' ;

// Define relational operators
relational_operator: '<' | '>' | '<=' | '>=' | '==' | '!=';
assignment_operator: '+=' | '=' | '-=' | '/=' | '*=' | '%=' | '**=' | '//=' | '|=' | '^=' | '&=' ;

// Ignore whitespaces and comments
WS: [ \t]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '\'' '\'' '\'' .*? '\'' '\'' '\'' -> skip;