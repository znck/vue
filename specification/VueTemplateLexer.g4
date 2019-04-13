lexer grammar VueTemplateLexer;

HTML_COMMENT
    : '<!--' .*? '-->'
    ;

WHITE_SPACE
    :  (' '|'\t'|'\r'? '\n')+
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;

INTERPOLATION_OPEN
    : '{{' -> pushMode(INTERPOLATION)
    ;

HTML_TEXT
    : ~'<'+
    ;

//
// tag declarations
//
mode TAG;

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;

//
// lexing mode for attribute values
//
TAG_EQUALS
    : '=' -> pushMode(ATTVALUE)
    ;


DIRECTIVE_NAME
    : [v] [-] DIRECTIVE_NAME_StartChar DIRECTIVE_NAME_Char* -> pushMode(DIRECTIVE)
    ;

DIRECTIVE_SHORTHAND
    : DIRCETIVE_SHORTHAND_Char -> pushMode(DIRECTIVE)
    ;

TAG_NAME
    : TAG_NameStartChar TAG_NameChar*
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> skip
    ;


mode DIRECTIVE;
DIRECTIVE_ARGUMENT
    : DIRECTIVE_ARGUMENT_Sep? '[' ~[>\t\r\n ]+ ']'
    | DIRECTIVE_ARGUMENT_Sep? ~[.=>\t\r\n ]+
    ;

DIRECTIVE_MODIFIER
    : DIRECTIVE_MODIFIER_Sep DIRECTIVE_NAME_StartChar DIRECTIVE_NAME_Char*
    ;

DIRECTIVE_WHITESPACE
    : [ \t\r\n] -> skip, popMode
    ;

DIRECTIVE_EQUALS
    : '=' -> popMode, pushMode(ATTVALUE), type(TAG_EQUALS)
    ;

fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | DIGIT
    |   '\u00B7'
    |   '\u0300'..'\u036F'
    |   '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    :   [a-zA-Z]
    |   '\u2070'..'\u218F'
    |   '\u2C00'..'\u2FEF'
    |   '\u3001'..'\uD7FF'
    |   '\uF900'..'\uFDCF'
    |   '\uFDF0'..'\uFFFD'
    ;

//
// attribute values
//
mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE
    : [ ]* ATTRIBUTE -> popMode
    ;

ATTRIBUTE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;


mode INTERPOLATION;

INTERPOLATION_CLOSE
    : '}}' -> popMode
    ;

INTERPOLATION_BODY
    : .+?
    ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment ATTCHARS
    : ATTCHAR+ ' '?
    ;

fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;
fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
    ;

fragment DIRCETIVE_SHORTHAND_Char
    : '@'
    | '#'
    | ':'
    ;

fragment DIRECTIVE_ARGUMENT_Sep
    : ':'
    ;

fragment DIRECTIVE_MODIFIER_Sep
    : '.'
    ;

fragment DIRECTIVE_NAME_StartChar
    : [a-zA-Z]
    ;

fragment DIRECTIVE_NAME_Char
    : [a-zA-Z]
    | DIGIT
    | '-'
    | '_'
    ;