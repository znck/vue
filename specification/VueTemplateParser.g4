parser grammar VueTemplateParser;

options { tokenVocab=VueTemplateLexer; }

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    | htmlMisc*
    ;

htmlElement
    : TAG_OPEN htmlTagName htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH htmlTagName TAG_CLOSE
    | TAG_OPEN htmlTagName htmlAttribute* TAG_SLASH_CLOSE
    | TAG_OPEN htmlTagName htmlAttribute* TAG_CLOSE
    ;

htmlContent
    : htmlChardata? ((htmlElement | htmlComment | vueInterpolation) htmlChardata?)*
    ;

vueInterpolation
    : INTERPOLATION_OPEN INTERPOLATION_BODY INTERPOLATION_CLOSE
    ;

htmlAttribute
    : vueDirective
    // | TAG_NAME TAG_EQUALS htmlAttributeValue
    // | TAG_NAME
    ;

vueDirective
    : vueDirectiveName TAG_EQUALS htmlAttributeValue
    | vueDirectiveName
    ;

vueDirectiveName
    : DIRECTIVE_SHORTHAND DIRECTIVE_ARGUMENT DIRECTIVE_MODIFIER*
    | DIRECTIVE_NAME DIRECTIVE_ARGUMENT DIRECTIVE_MODIFIER*
    | DIRECTIVE_NAME DIRECTIVE_MODIFIER*
    ;

htmlAttributeValue
    : ATTVALUE_VALUE
    ;

htmlTagName
    : TAG_NAME
    ;

htmlChardata
    : HTML_TEXT
    | WHITE_SPACE
    ;

htmlMisc
    : htmlComment
    | WHITE_SPACE
    ;

htmlComment
    : HTML_COMMENT
    ;
