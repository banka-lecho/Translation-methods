package parser;// Generated from /Users/anastasiaspileva/Desktop/МТ/lab-MT-3/src/main/java/GrammarHaskell.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarHaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, INTEGER=2, DOUBLE=3, BOOL=4, WORD=5, XA=6, WS=7, COMMA=8, LB=9, 
		RB=10, COLON=11, DOUBLECOLON=12, SEMICOLON=13, EQ=14, STICK=15, ARROW=16, 
		PLUS=17, MINUS=18, DIV=19, MUL=20, MOD=21, LET=22, IN=23, OR=24, AND=25, 
		LESS=26, LESSEQUAL=27, GREATEREQUAL=28, GREATER=29, DEQ=30;
	public static final int
		RULE_code = 0, RULE_function = 1, RULE_headerFunc = 2, RULE_bodyFunc = 3, 
		RULE_type = 4, RULE_args = 5, RULE_oneArg = 6, RULE_data = 7, RULE_localStatement = 8, 
		RULE_condition = 9, RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "function", "headerFunc", "bodyFunc", "type", "args", "oneArg", 
			"data", "localStatement", "condition", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'xa'", null, "','", "'('", "')'", 
			"':'", "'::'", "';'", "'='", "'|'", "'->'", "'+'", "'-'", "'/'", "'*'", 
			"'%'", "'let'", "'in'", "'||'", "'&&'", "'<'", "'<='", "'>='", "'>'", 
			"'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "INTEGER", "DOUBLE", "BOOL", "WORD", "XA", "WS", "COMMA", 
			"LB", "RB", "COLON", "DOUBLECOLON", "SEMICOLON", "EQ", "STICK", "ARROW", 
			"PLUS", "MINUS", "DIV", "MUL", "MOD", "LET", "IN", "OR", "AND", "LESS", 
			"LESSEQUAL", "GREATEREQUAL", "GREATER", "DEQ"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "GrammarHaskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarHaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public StringBuilder value;
		public FunctionContext fd;
		public TerminalNode EOF() { return getToken(GrammarHaskellParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((CodeContext)_localctx).value =  new StringBuilder();
			        _localctx.value.append("#include <iostream>");
			        _localctx.value.append("\n");
			        _localctx.value.append("\n");
			     
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				((CodeContext)_localctx).fd = function();

				        _localctx.value.append(((CodeContext)_localctx).fd.value);
				        _localctx.value.append("\n");
				        _localctx.value.append("\n");
				      
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(30);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public StringBuilder value;
		public HeaderFuncContext header;
		public BodyFuncContext body;
		public HeaderFuncContext headerFunc() {
			return getRuleContext(HeaderFuncContext.class,0);
		}
		public List<BodyFuncContext> bodyFunc() {
			return getRuleContexts(BodyFuncContext.class);
		}
		public BodyFuncContext bodyFunc(int i) {
			return getRuleContext(BodyFuncContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionContext)_localctx).value =  new StringBuilder(); 
			{
			setState(33);
			((FunctionContext)_localctx).header = headerFunc();

			        ((FunctionContext)_localctx).value =  ((FunctionContext)_localctx).header.value;
			        for (int i = ((FunctionContext)_localctx).header.argTypes.size() - 1; i > 0; i--) {
			            _localctx.value.append(((FunctionContext)_localctx).header.argTypes.get(i) + " k" + i + (i == 1 ? ") {\n" : ", "));
			        }
			    
			}
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					((FunctionContext)_localctx).body = bodyFunc();

					        if(((FunctionContext)_localctx).body.argsNames == null && ((FunctionContext)_localctx).body.argsConiditions == null){
					            _localctx.value.append(((FunctionContext)_localctx).header.argTypes.get(0));
					            _localctx.value.append(((FunctionContext)_localctx).body.body);
					        } else if(((FunctionContext)_localctx).body.argsNames == null){
					            _localctx.value.append(") {\n  return " + ((FunctionContext)_localctx).body.body + ";\n");
					        }else{
					            if (((FunctionContext)_localctx).header.argTypes.size() > 1) {
					                _localctx.value.append("  ");
					                for (int i = ((FunctionContext)_localctx).header.argTypes.size() - 1; i > 0; i--) {
					                    _localctx.value.append(((FunctionContext)_localctx).header.argTypes.get(((FunctionContext)_localctx).header.argTypes.size() - i - 1) + " " + ((FunctionContext)_localctx).body.argsNames.get(i - 1) + " = k" + (((FunctionContext)_localctx).header.argTypes.size() - i) + ";\n  ");
					                }
					                _localctx.value.append("if (");
					                for (int j = 0; j < ((FunctionContext)_localctx).body.argsConiditions.size(); j++) {
					                    _localctx.value.append(((FunctionContext)_localctx).body.argsConiditions.get(j) + (j != ((FunctionContext)_localctx).body.argsConiditions.size() - 1 ? " && " : ")"));
					                }
					                _localctx.value.append(" {\n    return " + ((FunctionContext)_localctx).body.body + ";\n  }\n");
					            } else {
					                _localctx.value.append(((FunctionContext)_localctx).header.argTypes.get(0) + " " + ((FunctionContext)_localctx).body.argsNames.get(0) + " = " + ((FunctionContext)_localctx).body.body);
					            }
					        }
					    
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			_localctx.value.append("}");
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderFuncContext extends ParserRuleContext {
		public StringBuilder value;
		public ArrayList<String> argTypes;
		public Token WORD;
		public TypeContext type;
		public TerminalNode WORD() { return getToken(GrammarHaskellParser.WORD, 0); }
		public TerminalNode DOUBLECOLON() { return getToken(GrammarHaskellParser.DOUBLECOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public HeaderFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterHeaderFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitHeaderFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitHeaderFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderFuncContext headerFunc() throws RecognitionException {
		HeaderFuncContext _localctx = new HeaderFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_headerFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			((HeaderFuncContext)_localctx).WORD = match(WORD);
			setState(47);
			match(DOUBLECOLON);
			setState(48);
			((HeaderFuncContext)_localctx).type = type();

			        ((HeaderFuncContext)_localctx).value =  new StringBuilder();
			        ((HeaderFuncContext)_localctx).argTypes =  ((HeaderFuncContext)_localctx).type.value;
			        _localctx.value.append(_localctx.argTypes.get(0) + ' ' + (((HeaderFuncContext)_localctx).WORD!=null?((HeaderFuncContext)_localctx).WORD.getText():null) + "(");
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyFuncContext extends ParserRuleContext {
		public String body;
		public ArrayList<String> argsNames;
		public ArrayList<String> argsConiditions;
		public Token f;
		public Token x;
		public Token XA;
		public ExpressionContext expf;
		public ExpressionContext exps;
		public ArgsContext ad;
		public LocalStatementContext localStatement;
		public TerminalNode EQ() { return getToken(GrammarHaskellParser.EQ, 0); }
		public TerminalNode LET() { return getToken(GrammarHaskellParser.LET, 0); }
		public TerminalNode XA() { return getToken(GrammarHaskellParser.XA, 0); }
		public TerminalNode IN() { return getToken(GrammarHaskellParser.IN, 0); }
		public List<TerminalNode> WORD() { return getTokens(GrammarHaskellParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GrammarHaskellParser.WORD, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LocalStatementContext localStatement() {
			return getRuleContext(LocalStatementContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BodyFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterBodyFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitBodyFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitBodyFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyFuncContext bodyFunc() throws RecognitionException {
		BodyFuncContext _localctx = new BodyFuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bodyFunc);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((BodyFuncContext)_localctx).f = match(WORD);
				setState(52);
				((BodyFuncContext)_localctx).x = match(WORD);
				setState(53);
				match(EQ);
				setState(54);
				match(LET);
				setState(55);
				((BodyFuncContext)_localctx).XA = match(XA);
				setState(56);
				((BodyFuncContext)_localctx).expf = expression();
				setState(57);
				match(IN);
				setState(58);
				((BodyFuncContext)_localctx).exps = expression();

				        ((BodyFuncContext)_localctx).body =  " " + (((BodyFuncContext)_localctx).XA!=null?((BodyFuncContext)_localctx).XA.getText():null) + " = " + (((BodyFuncContext)_localctx).expf!=null?_input.getText(((BodyFuncContext)_localctx).expf.start,((BodyFuncContext)_localctx).expf.stop):null) + "; \n  return" + (((BodyFuncContext)_localctx).exps!=null?_input.getText(((BodyFuncContext)_localctx).exps.start,((BodyFuncContext)_localctx).exps.stop):null) + "; \n";
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(WORD);
				setState(62);
				((BodyFuncContext)_localctx).ad = args();
				setState(63);
				match(EQ);
				setState(64);
				((BodyFuncContext)_localctx).localStatement = localStatement();

				        ((BodyFuncContext)_localctx).body =  (((BodyFuncContext)_localctx).localStatement!=null?_input.getText(((BodyFuncContext)_localctx).localStatement.start,((BodyFuncContext)_localctx).localStatement.stop):null);
				        ((BodyFuncContext)_localctx).argsNames =  ((BodyFuncContext)_localctx).ad.argsNames;
				        ((BodyFuncContext)_localctx).argsConiditions =  ((BodyFuncContext)_localctx).ad.argsConiditions;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public ArrayList<String> value;
		public Token TYPE;
		public TypeContext tp;
		public TerminalNode TYPE() { return getToken(GrammarHaskellParser.TYPE, 0); }
		public TerminalNode ARROW() { return getToken(GrammarHaskellParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((TypeContext)_localctx).TYPE = match(TYPE);

				        ((TypeContext)_localctx).value =  new ArrayList<String>();
				        if (!((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Integer") || (((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Double") || (((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("String") || (((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Bool"))) {
				            _localctx.value.add((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null));
				        } else {
				            _localctx.value.add((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).toLowerCase());
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((TypeContext)_localctx).TYPE = match(TYPE);
				setState(72);
				match(ARROW);
				setState(73);
				((TypeContext)_localctx).tp = type();

				        ((TypeContext)_localctx).value =  ((TypeContext)_localctx).tp.value;
				        if (!((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Integer") || (((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Double") || (((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("String") || (((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Bool"))) {
				            _localctx.value.add((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null));
				        } else {
				            _localctx.value.add((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).toLowerCase());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public ArrayList<String> argsNames;
		public ArrayList<String> argsConiditions;
		public OneArgContext oneArg;
		public ArgsContext ar;
		public OneArgContext oneArg() {
			return getRuleContext(OneArgContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarHaskellParser.COMMA, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
			case LB:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((ArgsContext)_localctx).oneArg = oneArg();
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(79);
					match(COMMA);
					setState(80);
					((ArgsContext)_localctx).ar = args();

					        ((ArgsContext)_localctx).argsNames =  ((ArgsContext)_localctx).ar.argsNames;
					        ((ArgsContext)_localctx).argsConiditions =  ((ArgsContext)_localctx).ar.argsConiditions;
					    
					}
					break;
				case EQ:
					{

					        ((ArgsContext)_localctx).argsNames =  new ArrayList<String>();
					        ((ArgsContext)_localctx).argsConiditions =  new ArrayList<String>();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}

				        _localctx.argsNames.add(((ArgsContext)_localctx).oneArg.argName);
				        if (((ArgsContext)_localctx).oneArg.argCondition != null)
				            _localctx.argsConiditions.add(((ArgsContext)_localctx).oneArg.argCondition);
				    
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{

				        ((ArgsContext)_localctx).argsNames =  null;
				        ((ArgsContext)_localctx).argsConiditions =  null;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class OneArgContext extends ParserRuleContext {
		public String argName;
		public String argCondition;
		public OneArgContext oa;
		public Token WORD;
		public ConditionContext condition;
		public TerminalNode LB() { return getToken(GrammarHaskellParser.LB, 0); }
		public TerminalNode RB() { return getToken(GrammarHaskellParser.RB, 0); }
		public OneArgContext oneArg() {
			return getRuleContext(OneArgContext.class,0);
		}
		public TerminalNode WORD() { return getToken(GrammarHaskellParser.WORD, 0); }
		public TerminalNode STICK() { return getToken(GrammarHaskellParser.STICK, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OneArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterOneArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitOneArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitOneArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneArgContext oneArg() throws RecognitionException {
		OneArgContext _localctx = new OneArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_oneArg);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(LB);
				setState(92);
				((OneArgContext)_localctx).oa = oneArg();
				setState(93);
				match(RB);

				        ((OneArgContext)_localctx).argName =  ((OneArgContext)_localctx).oa.argName;
				        ((OneArgContext)_localctx).argCondition =  ((OneArgContext)_localctx).oa.argCondition;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				((OneArgContext)_localctx).WORD = match(WORD);
				setState(97);
				match(STICK);
				setState(98);
				((OneArgContext)_localctx).condition = condition();

				        ((OneArgContext)_localctx).argName =  (((OneArgContext)_localctx).WORD!=null?((OneArgContext)_localctx).WORD.getText():null);
				        ((OneArgContext)_localctx).argCondition =  (((OneArgContext)_localctx).condition!=null?_input.getText(((OneArgContext)_localctx).condition.start,((OneArgContext)_localctx).condition.stop):null);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				((OneArgContext)_localctx).WORD = match(WORD);

				        ((OneArgContext)_localctx).argName =  (((OneArgContext)_localctx).WORD!=null?((OneArgContext)_localctx).WORD.getText():null);
				        ((OneArgContext)_localctx).argCondition =  "true";
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GrammarHaskellParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(GrammarHaskellParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(GrammarHaskellParser.BOOL, 0); }
		public TerminalNode WORD() { return getToken(GrammarHaskellParser.WORD, 0); }
		public TerminalNode LB() { return getToken(GrammarHaskellParser.LB, 0); }
		public TerminalNode RB() { return getToken(GrammarHaskellParser.RB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarHaskellParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarHaskellParser.COMMA, i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_data);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(DOUBLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(WORD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(WORD);
				setState(110);
				match(LB);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) {
					{
					setState(111);
					expression();
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(112);
						match(COMMA);
						setState(113);
						expression();
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(121);
				match(RB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalStatementContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode EQ() { return getToken(GrammarHaskellParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterLocalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitLocalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitLocalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalStatementContext localStatement() throws RecognitionException {
		LocalStatementContext _localctx = new LocalStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localStatement);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				data();
				setState(125);
				match(EQ);
				setState(126);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LESS() { return getToken(GrammarHaskellParser.LESS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LESSEQUAL() { return getToken(GrammarHaskellParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(GrammarHaskellParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(GrammarHaskellParser.GREATEREQUAL, 0); }
		public TerminalNode AND() { return getToken(GrammarHaskellParser.AND, 0); }
		public TerminalNode OR() { return getToken(GrammarHaskellParser.OR, 0); }
		public TerminalNode DEQ() { return getToken(GrammarHaskellParser.DEQ, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				expression();
				setState(132);
				match(LESS);
				setState(133);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				expression();
				setState(136);
				match(LESSEQUAL);
				setState(137);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				expression();
				setState(140);
				match(GREATER);
				setState(141);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				expression();
				setState(144);
				match(GREATEREQUAL);
				setState(145);
				condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				expression();
				setState(148);
				match(AND);
				setState(149);
				condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				expression();
				setState(152);
				match(OR);
				setState(153);
				condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				expression();
				setState(156);
				match(DEQ);
				setState(157);
				condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(GrammarHaskellParser.PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(GrammarHaskellParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(GrammarHaskellParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(GrammarHaskellParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(GrammarHaskellParser.MOD, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarHaskellListener ) ((GrammarHaskellListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarHaskellVisitor ) return ((GrammarHaskellVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				data();
				setState(163);
				match(PLUS);
				setState(164);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				data();
				setState(167);
				match(MINUS);
				setState(168);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				data();
				setState(171);
				match(DIV);
				setState(172);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				data();
				setState(175);
				match(MUL);
				setState(176);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				data();
				setState(179);
				match(MOD);
				setState(180);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				data();
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00ba\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f\u0000"+
		"\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001"+
		"\f\u0001+\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003D\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004M\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005U\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Z\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006h\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"s\b\u0007\n\u0007\f\u0007v\t\u0007\u0003\u0007x\b\u0007\u0001\u0007\u0003"+
		"\u0007{\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0082"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00a1\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b8"+
		"\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0000\u00c9\u0000\u0016\u0001\u0000\u0000\u0000\u0002"+
		" \u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u0006C\u0001"+
		"\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000"+
		"\fg\u0001\u0000\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010\u0081"+
		"\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000\u0000\u0000\u0014\u00b7"+
		"\u0001\u0000\u0000\u0000\u0016\u001a\u0006\u0000\uffff\uffff\u0000\u0017"+
		"\u0018\u0003\u0002\u0001\u0000\u0018\u0019\u0006\u0000\uffff\uffff\u0000"+
		"\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000"+
		" !\u0006\u0001\uffff\uffff\u0000!\"\u0003\u0004\u0002\u0000\"#\u0006\u0001"+
		"\uffff\uffff\u0000#)\u0001\u0000\u0000\u0000$%\u0003\u0006\u0003\u0000"+
		"%&\u0006\u0001\uffff\uffff\u0000&(\u0001\u0000\u0000\u0000\'$\u0001\u0000"+
		"\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		",-\u0006\u0001\uffff\uffff\u0000-\u0003\u0001\u0000\u0000\u0000./\u0005"+
		"\u0005\u0000\u0000/0\u0005\f\u0000\u000001\u0003\b\u0004\u000012\u0006"+
		"\u0002\uffff\uffff\u00002\u0005\u0001\u0000\u0000\u000034\u0005\u0005"+
		"\u0000\u000045\u0005\u0005\u0000\u000056\u0005\u000e\u0000\u000067\u0005"+
		"\u0016\u0000\u000078\u0005\u0006\u0000\u000089\u0003\u0014\n\u00009:\u0005"+
		"\u0017\u0000\u0000:;\u0003\u0014\n\u0000;<\u0006\u0003\uffff\uffff\u0000"+
		"<D\u0001\u0000\u0000\u0000=>\u0005\u0005\u0000\u0000>?\u0003\n\u0005\u0000"+
		"?@\u0005\u000e\u0000\u0000@A\u0003\u0010\b\u0000AB\u0006\u0003\uffff\uffff"+
		"\u0000BD\u0001\u0000\u0000\u0000C3\u0001\u0000\u0000\u0000C=\u0001\u0000"+
		"\u0000\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0005\u0001\u0000\u0000"+
		"FM\u0006\u0004\uffff\uffff\u0000GH\u0005\u0001\u0000\u0000HI\u0005\u0010"+
		"\u0000\u0000IJ\u0003\b\u0004\u0000JK\u0006\u0004\uffff\uffff\u0000KM\u0001"+
		"\u0000\u0000\u0000LE\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000"+
		"M\t\u0001\u0000\u0000\u0000NT\u0003\f\u0006\u0000OP\u0005\b\u0000\u0000"+
		"PQ\u0003\n\u0005\u0000QR\u0006\u0005\uffff\uffff\u0000RU\u0001\u0000\u0000"+
		"\u0000SU\u0006\u0005\uffff\uffff\u0000TO\u0001\u0000\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u0005\uffff\uffff"+
		"\u0000WZ\u0001\u0000\u0000\u0000XZ\u0006\u0005\uffff\uffff\u0000YN\u0001"+
		"\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u000b\u0001\u0000\u0000"+
		"\u0000[\\\u0005\t\u0000\u0000\\]\u0003\f\u0006\u0000]^\u0005\n\u0000\u0000"+
		"^_\u0006\u0006\uffff\uffff\u0000_h\u0001\u0000\u0000\u0000`a\u0005\u0005"+
		"\u0000\u0000ab\u0005\u000f\u0000\u0000bc\u0003\u0012\t\u0000cd\u0006\u0006"+
		"\uffff\uffff\u0000dh\u0001\u0000\u0000\u0000ef\u0005\u0005\u0000\u0000"+
		"fh\u0006\u0006\uffff\uffff\u0000g[\u0001\u0000\u0000\u0000g`\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000h\r\u0001\u0000\u0000\u0000i{\u0005"+
		"\u0002\u0000\u0000j{\u0005\u0003\u0000\u0000k{\u0005\u0004\u0000\u0000"+
		"l{\u0005\u0005\u0000\u0000mn\u0005\u0005\u0000\u0000nw\u0005\t\u0000\u0000"+
		"ot\u0003\u0014\n\u0000pq\u0005\b\u0000\u0000qs\u0003\u0014\n\u0000rp\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000wo\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y{\u0005\n\u0000\u0000zi\u0001\u0000\u0000\u0000zj\u0001\u0000"+
		"\u0000\u0000zk\u0001\u0000\u0000\u0000zl\u0001\u0000\u0000\u0000zm\u0001"+
		"\u0000\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0003\u000e\u0007"+
		"\u0000}~\u0005\u000e\u0000\u0000~\u007f\u0003\u0014\n\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0014\n\u0000\u0081|\u0001"+
		"\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0011\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0003\u0014\n\u0000\u0084\u0085\u0005\u001a"+
		"\u0000\u0000\u0085\u0086\u0003\u0012\t\u0000\u0086\u00a1\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0003\u0014\n\u0000\u0088\u0089\u0005\u001b\u0000\u0000"+
		"\u0089\u008a\u0003\u0012\t\u0000\u008a\u00a1\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0003\u0014\n\u0000\u008c\u008d\u0005\u001d\u0000\u0000\u008d\u008e"+
		"\u0003\u0012\t\u0000\u008e\u00a1\u0001\u0000\u0000\u0000\u008f\u0090\u0003"+
		"\u0014\n\u0000\u0090\u0091\u0005\u001c\u0000\u0000\u0091\u0092\u0003\u0012"+
		"\t\u0000\u0092\u00a1\u0001\u0000\u0000\u0000\u0093\u0094\u0003\u0014\n"+
		"\u0000\u0094\u0095\u0005\u0019\u0000\u0000\u0095\u0096\u0003\u0012\t\u0000"+
		"\u0096\u00a1\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098"+
		"\u0099\u0005\u0018\u0000\u0000\u0099\u009a\u0003\u0012\t\u0000\u009a\u00a1"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u0014\n\u0000\u009c\u009d\u0005"+
		"\u001e\u0000\u0000\u009d\u009e\u0003\u0012\t\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0003\u0014\n\u0000\u00a0\u0083\u0001\u0000\u0000"+
		"\u0000\u00a0\u0087\u0001\u0000\u0000\u0000\u00a0\u008b\u0001\u0000\u0000"+
		"\u0000\u00a0\u008f\u0001\u0000\u0000\u0000\u00a0\u0093\u0001\u0000\u0000"+
		"\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a0\u009b\u0001\u0000\u0000"+
		"\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u0013\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0003\u000e\u0007\u0000\u00a3\u00a4\u0005\u0011\u0000"+
		"\u0000\u00a4\u00a5\u0003\u0014\n\u0000\u00a5\u00b8\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0003\u000e\u0007\u0000\u00a7\u00a8\u0005\u0012\u0000\u0000"+
		"\u00a8\u00a9\u0003\u0014\n\u0000\u00a9\u00b8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0003\u000e\u0007\u0000\u00ab\u00ac\u0005\u0013\u0000\u0000\u00ac"+
		"\u00ad\u0003\u0014\n\u0000\u00ad\u00b8\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0003\u000e\u0007\u0000\u00af\u00b0\u0005\u0014\u0000\u0000\u00b0\u00b1"+
		"\u0003\u0014\n\u0000\u00b1\u00b8\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003"+
		"\u000e\u0007\u0000\u00b3\u00b4\u0005\u0015\u0000\u0000\u00b4\u00b5\u0003"+
		"\u0014\n\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u000e"+
		"\u0007\u0000\u00b7\u00a2\u0001\u0000\u0000\u0000\u00b7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00b7\u00aa\u0001\u0000\u0000\u0000\u00b7\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u0015\u0001\u0000\u0000\u0000\r\u001c)CLTYgtwz\u0081"+
		"\u00a0\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}