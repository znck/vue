// Generated from /Users/znck/Workspace/OpenSource/vuejs/vue/specification/VueTemplateLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VueTemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, WHITE_SPACE=2, TAG_OPEN=3, INTERPOLATION_OPEN=4, HTML_TEXT=5, 
		TAG_CLOSE=6, TAG_SLASH_CLOSE=7, TAG_SLASH=8, TAG_EQUALS=9, DIRECTIVE_NAME=10, 
		DIRECTIVE_SHORTHAND=11, TAG_NAME=12, TAG_WHITESPACE=13, DIRECTIVE_ARGUMENT=14, 
		DIRECTIVE_MODIFIER=15, DIRECTIVE_WHITESPACE=16, ATTVALUE_VALUE=17, ATTRIBUTE=18, 
		INTERPOLATION_CLOSE=19, INTERPOLATION_BODY=20;
	public static final int
		TAG=1, DIRECTIVE=2, ATTVALUE=3, INTERPOLATION=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG", "DIRECTIVE", "ATTVALUE", "INTERPOLATION"
	};

	public static final String[] ruleNames = {
		"HTML_COMMENT", "WHITE_SPACE", "TAG_OPEN", "INTERPOLATION_OPEN", "HTML_TEXT", 
		"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "DIRECTIVE_NAME", 
		"DIRECTIVE_SHORTHAND", "TAG_NAME", "TAG_WHITESPACE", "DIRECTIVE_ARGUMENT", 
		"DIRECTIVE_MODIFIER", "DIRECTIVE_WHITESPACE", "DIRECTIVE_EQUALS", "HEXDIGIT", 
		"DIGIT", "TAG_NameChar", "TAG_NameStartChar", "ATTVALUE_VALUE", "ATTRIBUTE", 
		"INTERPOLATION_CLOSE", "INTERPOLATION_BODY", "ATTCHAR", "ATTCHARS", "HEXCHARS", 
		"DECCHARS", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", "DIRCETIVE_SHORTHAND_Char", 
		"DIRECTIVE_ARGUMENT_Sep", "DIRECTIVE_MODIFIER_Sep", "DIRECTIVE_NAME_StartChar", 
		"DIRECTIVE_NAME_Char"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'<'", "'{{'", null, "'>'", "'/>'", "'/'", "'='", null, 
		null, null, null, null, null, null, null, null, "'}}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HTML_COMMENT", "WHITE_SPACE", "TAG_OPEN", "INTERPOLATION_OPEN", 
		"HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
		"DIRECTIVE_NAME", "DIRECTIVE_SHORTHAND", "TAG_NAME", "TAG_WHITESPACE", 
		"DIRECTIVE_ARGUMENT", "DIRECTIVE_MODIFIER", "DIRECTIVE_WHITESPACE", "ATTVALUE_VALUE", 
		"ATTRIBUTE", "INTERPOLATION_CLOSE", "INTERPOLATION_BODY"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public VueTemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VueTemplateLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0125\b\1\b\1"+
		"\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3a\n\3\3\3\6\3d\n"+
		"\3\r\3\16\3e\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\6\6r\n\6\r\6\16\6"+
		"s\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\7\r\u0096\n\r\f\r\16\r\u0099\13\r\3\16\3\16\3\16\3\16\3"+
		"\17\5\17\u00a0\n\17\3\17\3\17\6\17\u00a4\n\17\r\17\16\17\u00a5\3\17\3"+
		"\17\5\17\u00aa\n\17\3\17\6\17\u00ad\n\17\r\17\16\17\u00ae\5\17\u00b1\n"+
		"\17\3\20\3\20\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9\13\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\5\25\u00ce\n\25\3\26\5\26\u00d1\n\26\3\27\7\27\u00d4\n\27"+
		"\f\27\16\27\u00d7\13\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u00e2\n\30\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u00ea\n\32\r\32\16\32"+
		"\u00eb\3\33\5\33\u00ef\n\33\3\34\6\34\u00f2\n\34\r\34\16\34\u00f3\3\34"+
		"\5\34\u00f7\n\34\3\35\3\35\6\35\u00fb\n\35\r\35\16\35\u00fc\3\36\6\36"+
		"\u0100\n\36\r\36\16\36\u0101\3\36\5\36\u0105\n\36\3\37\3\37\7\37\u0109"+
		"\n\37\f\37\16\37\u010c\13\37\3\37\3\37\3 \3 \7 \u0112\n \f \16 \u0115"+
		"\13 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\5%\u0124\n%\4W\u00eb\2&"+
		"\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20"+
		"#\21%\22\'\2)\2+\2-\2/\2\61\23\63\24\65\25\67\269\2;\2=\2?\2A\2C\2E\2"+
		"G\2I\2K\2M\2\7\2\3\4\5\6\24\4\2\13\13\"\"\3\2>>\3\2xx\3\2//\5\2\13\f\17"+
		"\17\"\"\6\2\13\f\17\17\"\"@@\7\2\13\f\17\17\"\"\60\60?@\5\2\62;CHch\3"+
		"\2\62;\4\2//aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\t\2C\\c|\u2072"+
		"\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\3\2\"\"\t\2%%-"+
		"=??AAC\\aac|\4\2$$>>\4\2))>>\5\2%%<<BB\4\2C\\c|\2\u0130\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\3\23\3\2"+
		"\2\2\3\25\3\2\2\2\3\27\3\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\3\35\3\2\2\2"+
		"\3\37\3\2\2\2\4!\3\2\2\2\4#\3\2\2\2\4%\3\2\2\2\4\'\3\2\2\2\5\61\3\2\2"+
		"\2\5\63\3\2\2\2\6\65\3\2\2\2\6\67\3\2\2\2\7O\3\2\2\2\tc\3\2\2\2\13g\3"+
		"\2\2\2\rk\3\2\2\2\17q\3\2\2\2\21u\3\2\2\2\23y\3\2\2\2\25~\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u0084\3\2\2\2\33\u008f\3\2\2\2\35\u0093\3\2\2\2\37\u009a\3"+
		"\2\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2%\u00ba\3\2\2\2\'\u00bf\3\2\2\2)\u00c5"+
		"\3\2\2\2+\u00c7\3\2\2\2-\u00cd\3\2\2\2/\u00d0\3\2\2\2\61\u00d5\3\2\2\2"+
		"\63\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67\u00e9\3\2\2\29\u00ee\3\2\2\2;\u00f1"+
		"\3\2\2\2=\u00f8\3\2\2\2?\u00ff\3\2\2\2A\u0106\3\2\2\2C\u010f\3\2\2\2E"+
		"\u0118\3\2\2\2G\u011a\3\2\2\2I\u011c\3\2\2\2K\u011e\3\2\2\2M\u0123\3\2"+
		"\2\2OP\7>\2\2PQ\7#\2\2QR\7/\2\2RS\7/\2\2SW\3\2\2\2TV\13\2\2\2UT\3\2\2"+
		"\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7/\2\2[\\\7/\2"+
		"\2\\]\7@\2\2]\b\3\2\2\2^d\t\2\2\2_a\7\17\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2"+
		"\2\2bd\7\f\2\2c^\3\2\2\2c`\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\n\3"+
		"\2\2\2gh\7>\2\2hi\3\2\2\2ij\b\4\2\2j\f\3\2\2\2kl\7}\2\2lm\7}\2\2mn\3\2"+
		"\2\2no\b\5\3\2o\16\3\2\2\2pr\n\3\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3"+
		"\2\2\2t\20\3\2\2\2uv\7@\2\2vw\3\2\2\2wx\b\7\4\2x\22\3\2\2\2yz\7\61\2\2"+
		"z{\7@\2\2{|\3\2\2\2|}\b\b\4\2}\24\3\2\2\2~\177\7\61\2\2\177\26\3\2\2\2"+
		"\u0080\u0081\7?\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\n\5\2\u0083\30\3"+
		"\2\2\2\u0084\u0085\t\4\2\2\u0085\u0086\t\5\2\2\u0086\u008a\5K$\2\u0087"+
		"\u0089\5M%\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e"+
		"\b\13\6\2\u008e\32\3\2\2\2\u008f\u0090\5E!\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\b\f\6\2\u0092\34\3\2\2\2\u0093\u0097\5/\26\2\u0094\u0096\5-\25"+
		"\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\36\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\t\6\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\b\16\7\2\u009d \3\2\2\2\u009e\u00a0\5G\"\2"+
		"\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3"+
		"\7]\2\2\u00a2\u00a4\n\7\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00b1\7_"+
		"\2\2\u00a8\u00aa\5G\"\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00ad\n\b\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u009f\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\5I#\2\u00b3"+
		"\u00b7\5K$\2\u00b4\u00b6\5M%\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8$\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00ba\u00bb\t\6\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\21\7\2\u00bd"+
		"\u00be\b\21\4\2\u00be&\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1\u00c2\b\22\4\2\u00c2\u00c3\b\22\5\2\u00c3\u00c4\b\22\b\2\u00c4"+
		"(\3\2\2\2\u00c5\u00c6\t\t\2\2\u00c6*\3\2\2\2\u00c7\u00c8\t\n\2\2\u00c8"+
		",\3\2\2\2\u00c9\u00ce\5/\26\2\u00ca\u00ce\t\13\2\2\u00cb\u00ce\5+\24\2"+
		"\u00cc\u00ce\t\f\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce.\3\2\2\2\u00cf\u00d1\t\r\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\60\3\2\2\2\u00d2\u00d4\t\16\2\2\u00d3\u00d2\3\2\2"+
		"\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\5\63\30\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00db\b\27\4\2\u00db\62\3\2\2\2\u00dc\u00e2\5A\37\2\u00dd\u00e2"+
		"\5C \2\u00de\u00e2\5;\34\2\u00df\u00e2\5=\35\2\u00e0\u00e2\5?\36\2\u00e1"+
		"\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7\177\2\2\u00e4"+
		"\u00e5\7\177\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\31\4\2\u00e7\66\3\2"+
		"\2\2\u00e8\u00ea\13\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec8\3\2\2\2\u00ed\u00ef\t\17\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef:\3\2\2\2\u00f0\u00f2\59\33\2\u00f1\u00f0\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f7\7\"\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7<\3\2\2\2\u00f8\u00fa\7%\2\2\u00f9\u00fb\t\t\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		">\3\2\2\2\u00fe\u0100\t\n\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0105"+
		"\7\'\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105@\3\2\2\2\u0106"+
		"\u010a\7$\2\2\u0107\u0109\n\20\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010e\7$\2\2\u010eB\3\2\2\2\u010f\u0113\7)\2\2\u0110"+
		"\u0112\n\21\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\7)\2\2\u0117D\3\2\2\2\u0118\u0119\t\22\2\2\u0119F\3\2\2\2\u011a"+
		"\u011b\7<\2\2\u011bH\3\2\2\2\u011c\u011d\7\60\2\2\u011dJ\3\2\2\2\u011e"+
		"\u011f\t\23\2\2\u011fL\3\2\2\2\u0120\u0124\t\23\2\2\u0121\u0124\5+\24"+
		"\2\u0122\u0124\t\13\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124N\3\2\2\2\"\2\3\4\5\6W`ces\u008a\u0097\u009f\u00a5"+
		"\u00a9\u00ae\u00b0\u00b7\u00cd\u00d0\u00d5\u00e1\u00eb\u00ee\u00f3\u00f6"+
		"\u00fc\u0101\u0104\u010a\u0113\u0123\t\7\3\2\7\6\2\6\2\2\7\5\2\7\4\2\b"+
		"\2\2\t\13\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}