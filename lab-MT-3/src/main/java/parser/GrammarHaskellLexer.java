package parser;// Generated from /Users/anastasiaspileva/Desktop/МТ/lab-MT-3/src/main/java/GrammarHaskell.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarHaskellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, INTEGER=2, DOUBLE=3, BOOL=4, WORD=5, XA=6, WS=7, COMMA=8, LB=9, 
		RB=10, COLON=11, DOUBLECOLON=12, SEMICOLON=13, EQ=14, STICK=15, ARROW=16, 
		PLUS=17, MINUS=18, DIV=19, MUL=20, MOD=21, LET=22, IN=23, OR=24, AND=25, 
		LESS=26, LESSEQUAL=27, GREATEREQUAL=28, GREATER=29, DEQ=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "INTEGER", "DOUBLE", "BOOL", "WORD", "XA", "WS", "COMMA", "LB", 
			"RB", "COLON", "DOUBLECOLON", "SEMICOLON", "EQ", "STICK", "ARROW", "PLUS", 
			"MINUS", "DIV", "MUL", "MOD", "LET", "IN", "OR", "AND", "LESS", "LESSEQUAL", 
			"GREATEREQUAL", "GREATER", "DEQ"
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


	public GrammarHaskellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarHaskell.g4"; }

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
		"\u0004\u0000\u001e\u00ba\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"U\b\u0000\u0001\u0001\u0003\u0001X\b\u0001\u0001\u0001\u0004\u0001[\b"+
		"\u0001\u000b\u0001\f\u0001\\\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002b\b\u0002\n\u0002\f\u0002e\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003p\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004t\b\u0004"+
		"\n\u0004\f\u0004w\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0004\u0006}\b\u0006\u000b\u0006\f\u0006~\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e\u0001\u0000\u0004\u0001"+
		"\u000009\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000\t\n\r\r  \u00c2"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0001T"+
		"\u0001\u0000\u0000\u0000\u0003W\u0001\u0000\u0000\u0000\u0005^\u0001\u0000"+
		"\u0000\u0000\u0007o\u0001\u0000\u0000\u0000\tq\u0001\u0000\u0000\u0000"+
		"\u000bx\u0001\u0000\u0000\u0000\r|\u0001\u0000\u0000\u0000\u000f\u0082"+
		"\u0001\u0000\u0000\u0000\u0011\u0084\u0001\u0000\u0000\u0000\u0013\u0086"+
		"\u0001\u0000\u0000\u0000\u0015\u0088\u0001\u0000\u0000\u0000\u0017\u008a"+
		"\u0001\u0000\u0000\u0000\u0019\u008d\u0001\u0000\u0000\u0000\u001b\u008f"+
		"\u0001\u0000\u0000\u0000\u001d\u0091\u0001\u0000\u0000\u0000\u001f\u0093"+
		"\u0001\u0000\u0000\u0000!\u0096\u0001\u0000\u0000\u0000#\u0098\u0001\u0000"+
		"\u0000\u0000%\u009a\u0001\u0000\u0000\u0000\'\u009c\u0001\u0000\u0000"+
		"\u0000)\u009e\u0001\u0000\u0000\u0000+\u00a0\u0001\u0000\u0000\u0000-"+
		"\u00a4\u0001\u0000\u0000\u0000/\u00a7\u0001\u0000\u0000\u00001\u00aa\u0001"+
		"\u0000\u0000\u00003\u00ad\u0001\u0000\u0000\u00005\u00af\u0001\u0000\u0000"+
		"\u00007\u00b2\u0001\u0000\u0000\u00009\u00b5\u0001\u0000\u0000\u0000;"+
		"\u00b7\u0001\u0000\u0000\u0000=>\u0005I\u0000\u0000>?\u0005n\u0000\u0000"+
		"?@\u0005t\u0000\u0000@A\u0005e\u0000\u0000AB\u0005g\u0000\u0000BC\u0005"+
		"e\u0000\u0000CU\u0005r\u0000\u0000DE\u0005D\u0000\u0000EF\u0005o\u0000"+
		"\u0000FG\u0005u\u0000\u0000GH\u0005b\u0000\u0000HI\u0005l\u0000\u0000"+
		"IU\u0005e\u0000\u0000JK\u0005S\u0000\u0000KL\u0005t\u0000\u0000LM\u0005"+
		"r\u0000\u0000MN\u0005i\u0000\u0000NO\u0005n\u0000\u0000OU\u0005g\u0000"+
		"\u0000PQ\u0005B\u0000\u0000QR\u0005o\u0000\u0000RS\u0005o\u0000\u0000"+
		"SU\u0005l\u0000\u0000T=\u0001\u0000\u0000\u0000TD\u0001\u0000\u0000\u0000"+
		"TJ\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000U\u0002\u0001\u0000"+
		"\u0000\u0000VX\u0005-\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XZ\u0001\u0000\u0000\u0000Y[\u0007\u0000\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]\u0004\u0001\u0000\u0000\u0000^_\u0003\u0003"+
		"\u0001\u0000_c\u0005.\u0000\u0000`b\u0007\u0000\u0000\u0000a`\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d\u0006\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000fg\u0005T\u0000\u0000gh\u0005r\u0000\u0000hi\u0005u\u0000\u0000"+
		"ip\u0005e\u0000\u0000jk\u0005F\u0000\u0000kl\u0005a\u0000\u0000lm\u0005"+
		"l\u0000\u0000mn\u0005s\u0000\u0000np\u0005e\u0000\u0000of\u0001\u0000"+
		"\u0000\u0000oj\u0001\u0000\u0000\u0000p\b\u0001\u0000\u0000\u0000qu\u0007"+
		"\u0001\u0000\u0000rt\u0007\u0002\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\n\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005x\u0000"+
		"\u0000yz\u0005a\u0000\u0000z\f\u0001\u0000\u0000\u0000{}\u0007\u0003\u0000"+
		"\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0006\u0006\u0000\u0000\u0081\u000e\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005,\u0000\u0000\u0083\u0010\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005(\u0000\u0000\u0085\u0012\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005)\u0000\u0000\u0087\u0014\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005:\u0000\u0000\u0089\u0016\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		":\u0000\u0000\u008b\u008c\u0005:\u0000\u0000\u008c\u0018\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005;\u0000\u0000\u008e\u001a\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005=\u0000\u0000\u0090\u001c\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005|\u0000\u0000\u0092\u001e\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005-\u0000\u0000\u0094\u0095\u0005>\u0000\u0000\u0095 \u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005+\u0000\u0000\u0097\"\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005-\u0000\u0000\u0099$\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005/\u0000\u0000\u009b&\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"*\u0000\u0000\u009d(\u0001\u0000\u0000\u0000\u009e\u009f\u0005%\u0000"+
		"\u0000\u009f*\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005l\u0000\u0000\u00a1"+
		"\u00a2\u0005e\u0000\u0000\u00a2\u00a3\u0005t\u0000\u0000\u00a3,\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005i\u0000\u0000\u00a5\u00a6\u0005n\u0000"+
		"\u0000\u00a6.\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005|\u0000\u0000\u00a8"+
		"\u00a9\u0005|\u0000\u0000\u00a90\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"&\u0000\u0000\u00ab\u00ac\u0005&\u0000\u0000\u00ac2\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005<\u0000\u0000\u00ae4\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005<\u0000\u0000\u00b0\u00b1\u0005=\u0000\u0000\u00b16\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005>\u0000\u0000\u00b3\u00b4\u0005=\u0000"+
		"\u0000\u00b48\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005>\u0000\u0000\u00b6"+
		":\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005=\u0000\u0000\u00b8\u00b9\u0005"+
		"=\u0000\u0000\u00b9<\u0001\u0000\u0000\u0000\b\u0000TW\\cou~\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}