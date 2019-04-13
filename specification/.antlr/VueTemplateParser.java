// Generated from /Users/znck/Workspace/OpenSource/vuejs/vue/specification/VueTemplateParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VueTemplateParser extends Parser {
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
		RULE_htmlElements = 0, RULE_htmlElement = 1, RULE_htmlContent = 2, RULE_vueInterpolation = 3, 
		RULE_htmlAttribute = 4, RULE_vueDirective = 5, RULE_vueDirectiveName = 6, 
		RULE_htmlAttributeValue = 7, RULE_htmlTagName = 8, RULE_htmlChardata = 9, 
		RULE_htmlMisc = 10, RULE_htmlComment = 11;
	public static final String[] ruleNames = {
		"htmlElements", "htmlElement", "htmlContent", "vueInterpolation", "htmlAttribute", 
		"vueDirective", "vueDirectiveName", "htmlAttributeValue", "htmlTagName", 
		"htmlChardata", "htmlMisc", "htmlComment"
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

	@Override
	public String getGrammarFileName() { return "VueTemplateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VueTemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlElements);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_COMMENT || _la==WHITE_SPACE) {
					{
					{
					setState(24);
					htmlMisc();
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(30);
				htmlElement();
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_COMMENT || _la==WHITE_SPACE) {
					{
					{
					setState(31);
					htmlMisc();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HTML_COMMENT || _la==WHITE_SPACE) {
					{
					{
					setState(37);
					htmlMisc();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(VueTemplateParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(VueTemplateParser.TAG_OPEN, i);
		}
		public List<HtmlTagNameContext> htmlTagName() {
			return getRuleContexts(HtmlTagNameContext.class);
		}
		public HtmlTagNameContext htmlTagName(int i) {
			return getRuleContext(HtmlTagNameContext.class,i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(VueTemplateParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(VueTemplateParser.TAG_CLOSE, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(VueTemplateParser.TAG_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(VueTemplateParser.TAG_SLASH_CLOSE, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElement);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(TAG_OPEN);
				setState(46);
				htmlTagName();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIRECTIVE_NAME || _la==DIRECTIVE_SHORTHAND) {
					{
					{
					setState(47);
					htmlAttribute();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(TAG_CLOSE);
				setState(54);
				htmlContent();
				setState(55);
				match(TAG_OPEN);
				setState(56);
				match(TAG_SLASH);
				setState(57);
				htmlTagName();
				setState(58);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(TAG_OPEN);
				setState(61);
				htmlTagName();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIRECTIVE_NAME || _la==DIRECTIVE_SHORTHAND) {
					{
					{
					setState(62);
					htmlAttribute();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(TAG_OPEN);
				setState(71);
				htmlTagName();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIRECTIVE_NAME || _la==DIRECTIVE_SHORTHAND) {
					{
					{
					setState(72);
					htmlAttribute();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(TAG_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public List<VueInterpolationContext> vueInterpolation() {
			return getRuleContexts(VueInterpolationContext.class);
		}
		public VueInterpolationContext vueInterpolation(int i) {
			return getRuleContext(VueInterpolationContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE || _la==HTML_TEXT) {
				{
				setState(82);
				htmlChardata();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_OPEN:
						{
						setState(85);
						htmlElement();
						}
						break;
					case HTML_COMMENT:
						{
						setState(86);
						htmlComment();
						}
						break;
					case INTERPOLATION_OPEN:
						{
						setState(87);
						vueInterpolation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITE_SPACE || _la==HTML_TEXT) {
						{
						setState(90);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VueInterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_OPEN() { return getToken(VueTemplateParser.INTERPOLATION_OPEN, 0); }
		public TerminalNode INTERPOLATION_BODY() { return getToken(VueTemplateParser.INTERPOLATION_BODY, 0); }
		public TerminalNode INTERPOLATION_CLOSE() { return getToken(VueTemplateParser.INTERPOLATION_CLOSE, 0); }
		public VueInterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vueInterpolation; }
	}

	public final VueInterpolationContext vueInterpolation() throws RecognitionException {
		VueInterpolationContext _localctx = new VueInterpolationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vueInterpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(INTERPOLATION_OPEN);
			setState(99);
			match(INTERPOLATION_BODY);
			setState(100);
			match(INTERPOLATION_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeContext extends ParserRuleContext {
		public VueDirectiveContext vueDirective() {
			return getRuleContext(VueDirectiveContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			vueDirective();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VueDirectiveContext extends ParserRuleContext {
		public VueDirectiveNameContext vueDirectiveName() {
			return getRuleContext(VueDirectiveNameContext.class,0);
		}
		public TerminalNode TAG_EQUALS() { return getToken(VueTemplateParser.TAG_EQUALS, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public VueDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vueDirective; }
	}

	public final VueDirectiveContext vueDirective() throws RecognitionException {
		VueDirectiveContext _localctx = new VueDirectiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vueDirective);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				vueDirectiveName();
				setState(105);
				match(TAG_EQUALS);
				setState(106);
				htmlAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				vueDirectiveName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VueDirectiveNameContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE_SHORTHAND() { return getToken(VueTemplateParser.DIRECTIVE_SHORTHAND, 0); }
		public TerminalNode DIRECTIVE_ARGUMENT() { return getToken(VueTemplateParser.DIRECTIVE_ARGUMENT, 0); }
		public List<TerminalNode> DIRECTIVE_MODIFIER() { return getTokens(VueTemplateParser.DIRECTIVE_MODIFIER); }
		public TerminalNode DIRECTIVE_MODIFIER(int i) {
			return getToken(VueTemplateParser.DIRECTIVE_MODIFIER, i);
		}
		public TerminalNode DIRECTIVE_NAME() { return getToken(VueTemplateParser.DIRECTIVE_NAME, 0); }
		public VueDirectiveNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vueDirectiveName; }
	}

	public final VueDirectiveNameContext vueDirectiveName() throws RecognitionException {
		VueDirectiveNameContext _localctx = new VueDirectiveNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vueDirectiveName);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(DIRECTIVE_SHORTHAND);
				setState(112);
				match(DIRECTIVE_ARGUMENT);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIRECTIVE_MODIFIER) {
					{
					{
					setState(113);
					match(DIRECTIVE_MODIFIER);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(DIRECTIVE_NAME);
				setState(120);
				match(DIRECTIVE_ARGUMENT);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIRECTIVE_MODIFIER) {
					{
					{
					setState(121);
					match(DIRECTIVE_MODIFIER);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(DIRECTIVE_NAME);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIRECTIVE_MODIFIER) {
					{
					{
					setState(128);
					match(DIRECTIVE_MODIFIER);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode ATTVALUE_VALUE() { return getToken(VueTemplateParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ATTVALUE_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlTagNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(VueTemplateParser.TAG_NAME, 0); }
		public HtmlTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagName; }
	}

	public final HtmlTagNameContext htmlTagName() throws RecognitionException {
		HtmlTagNameContext _localctx = new HtmlTagNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlTagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(TAG_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(VueTemplateParser.HTML_TEXT, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(VueTemplateParser.WHITE_SPACE, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==WHITE_SPACE || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(VueTemplateParser.WHITE_SPACE, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlMisc);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				htmlComment();
				}
				break;
			case WHITE_SPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(WHITE_SPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(VueTemplateParser.HTML_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_htmlComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(HTML_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\7\2#\n\2"+
		"\f\2\16\2&\13\2\3\2\7\2)\n\2\f\2\16\2,\13\2\5\2.\n\2\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3B\n\3"+
		"\f\3\16\3E\13\3\3\3\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3\3\3\5"+
		"\3S\n\3\3\4\5\4V\n\4\3\4\3\4\3\4\5\4[\n\4\3\4\5\4^\n\4\7\4`\n\4\f\4\16"+
		"\4c\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b"+
		"\3\b\7\bu\n\b\f\b\16\bx\13\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b"+
		"\3\b\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\5\b\u0089\n\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\5\f\u0093\n\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\3\4\2\4\4\7\7\2\u009f\2-\3\2\2\2\4R\3\2\2\2\6U\3\2\2\2"+
		"\bd\3\2\2\2\nh\3\2\2\2\fo\3\2\2\2\16\u0088\3\2\2\2\20\u008a\3\2\2\2\22"+
		"\u008c\3\2\2\2\24\u008e\3\2\2\2\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32\34"+
		"\5\26\f\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 "+
		"\3\2\2\2\37\35\3\2\2\2 $\5\4\3\2!#\5\26\f\2\"!\3\2\2\2#&\3\2\2\2$\"\3"+
		"\2\2\2$%\3\2\2\2%.\3\2\2\2&$\3\2\2\2\')\5\26\f\2(\'\3\2\2\2),\3\2\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*\3\2\2\2-\35\3\2\2\2-*\3\2\2\2.\3\3\2"+
		"\2\2/\60\7\5\2\2\60\64\5\22\n\2\61\63\5\n\6\2\62\61\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\b\2"+
		"\289\5\6\4\29:\7\5\2\2:;\7\n\2\2;<\5\22\n\2<=\7\b\2\2=S\3\2\2\2>?\7\5"+
		"\2\2?C\5\22\n\2@B\5\n\6\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3"+
		"\2\2\2EC\3\2\2\2FG\7\t\2\2GS\3\2\2\2HI\7\5\2\2IM\5\22\n\2JL\5\n\6\2KJ"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\b\2\2Q"+
		"S\3\2\2\2R/\3\2\2\2R>\3\2\2\2RH\3\2\2\2S\5\3\2\2\2TV\5\24\13\2UT\3\2\2"+
		"\2UV\3\2\2\2Va\3\2\2\2W[\5\4\3\2X[\5\30\r\2Y[\5\b\5\2ZW\3\2\2\2ZX\3\2"+
		"\2\2ZY\3\2\2\2[]\3\2\2\2\\^\5\24\13\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_"+
		"Z\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2de\7\6\2\2"+
		"ef\7\26\2\2fg\7\25\2\2g\t\3\2\2\2hi\5\f\7\2i\13\3\2\2\2jk\5\16\b\2kl\7"+
		"\13\2\2lm\5\20\t\2mp\3\2\2\2np\5\16\b\2oj\3\2\2\2on\3\2\2\2p\r\3\2\2\2"+
		"qr\7\r\2\2rv\7\20\2\2su\7\21\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2w\u0089\3\2\2\2xv\3\2\2\2yz\7\f\2\2z~\7\20\2\2{}\7\21\2\2|{\3\2\2\2"+
		"}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0089\3\2\2\2\u0080~\3\2\2"+
		"\2\u0081\u0085\7\f\2\2\u0082\u0084\7\21\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088q\3\2\2\2\u0088y\3\2\2\2\u0088\u0081\3\2"+
		"\2\2\u0089\17\3\2\2\2\u008a\u008b\7\23\2\2\u008b\21\3\2\2\2\u008c\u008d"+
		"\7\16\2\2\u008d\23\3\2\2\2\u008e\u008f\t\2\2\2\u008f\25\3\2\2\2\u0090"+
		"\u0093\5\30\r\2\u0091\u0093\7\4\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3"+
		"\2\2\2\u0093\27\3\2\2\2\u0094\u0095\7\3\2\2\u0095\31\3\2\2\2\24\35$*-"+
		"\64CMRUZ]aov~\u0085\u0088\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}