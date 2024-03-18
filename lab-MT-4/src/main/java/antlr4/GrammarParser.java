package antlr4;// Generated from /Users/anastasiaspileva/Desktop/MT/lab-MT-4/src/main/java/Grammar.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, CODE = 5, VAR = 6, VARACC = 7, TOKEN = 8, NONTERM = 9,
            STRING_RULE = 10, REGEX_RULE = 11, WS = 12;
    public static final int
            RULE_gram = 0, RULE_global = 1, RULE_acc = 2, RULE_nontermRule = 3, RULE_alt = 4,
            RULE_lexRule = 5;

    private static String[] makeRuleNames() {
        return new String[]{
                "gram", "global", "acc", "nontermRule", "alt", "lexRule"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "':='", "'|'", "';'", "'='"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, "CODE", "VAR", "VARACC", "TOKEN", "NONTERM",
                "STRING_RULE", "REGEX_RULE", "WS"
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
    public String getGrammarFileName() {
        return "Grammar.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public GrammarParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class GramContext extends ParserRuleContext {
        public List<GlobalContext> global() {
            return getRuleContexts(GlobalContext.class);
        }

        public GlobalContext global(int i) {
            return getRuleContext(GlobalContext.class, i);
        }

        public List<AccContext> acc() {
            return getRuleContexts(AccContext.class);
        }

        public AccContext acc(int i) {
            return getRuleContext(AccContext.class, i);
        }

        public List<NontermRuleContext> nontermRule() {
            return getRuleContexts(NontermRuleContext.class);
        }

        public NontermRuleContext nontermRule(int i) {
            return getRuleContext(NontermRuleContext.class, i);
        }

        public List<LexRuleContext> lexRule() {
            return getRuleContexts(LexRuleContext.class);
        }

        public LexRuleContext lexRule(int i) {
            return getRuleContext(LexRuleContext.class, i);
        }

        public GramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_gram;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterGram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitGram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitGram(this);
            else return visitor.visitChildren(this);
        }
    }

    public final GramContext gram() throws RecognitionException {
        GramContext _localctx = new GramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_gram);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(15);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == VAR) {
                    {
                        {
                            setState(12);
                            global();
                        }
                    }
                    setState(17);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(21);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == VARACC) {
                    {
                        {
                            setState(18);
                            acc();
                        }
                    }
                    setState(23);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(28);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN || _la == NONTERM) {
                    {
                        setState(26);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case NONTERM: {
                                setState(24);
                                nontermRule();
                            }
                            break;
                            case TOKEN: {
                                setState(25);
                                lexRule();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(30);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class GlobalContext extends ParserRuleContext {
        public TerminalNode VAR() {
            return getToken(GrammarParser.VAR, 0);
        }

        public GlobalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_global;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterGlobal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitGlobal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitGlobal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final GlobalContext global() throws RecognitionException {
        GlobalContext _localctx = new GlobalContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_global);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(31);
                match(VAR);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AccContext extends ParserRuleContext {
        public TerminalNode VARACC() {
            return getToken(GrammarParser.VARACC, 0);
        }

        public AccContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_acc;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterAcc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitAcc(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitAcc(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AccContext acc() throws RecognitionException {
        AccContext _localctx = new AccContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_acc);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(33);
                match(VARACC);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NontermRuleContext extends ParserRuleContext {
        public TerminalNode NONTERM() {
            return getToken(GrammarParser.NONTERM, 0);
        }

        public List<AltContext> alt() {
            return getRuleContexts(AltContext.class);
        }

        public AltContext alt(int i) {
            return getRuleContext(AltContext.class, i);
        }

        public NontermRuleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nontermRule;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterNontermRule(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitNontermRule(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor)
                return ((GrammarVisitor<? extends T>) visitor).visitNontermRule(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NontermRuleContext nontermRule() throws RecognitionException {
        NontermRuleContext _localctx = new NontermRuleContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_nontermRule);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(35);
                match(NONTERM);
                setState(36);
                match(T__0);
                {
                    setState(37);
                    alt();
                    setState(42);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__1) {
                        {
                            {
                                setState(38);
                                match(T__1);
                                setState(39);
                                alt();
                            }
                        }
                        setState(44);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                setState(45);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AltContext extends ParserRuleContext {
        public List<TerminalNode> TOKEN() {
            return getTokens(GrammarParser.TOKEN);
        }

        public TerminalNode TOKEN(int i) {
            return getToken(GrammarParser.TOKEN, i);
        }

        public List<TerminalNode> NONTERM() {
            return getTokens(GrammarParser.NONTERM);
        }

        public TerminalNode NONTERM(int i) {
            return getToken(GrammarParser.NONTERM, i);
        }

        public List<TerminalNode> CODE() {
            return getTokens(GrammarParser.CODE);
        }

        public TerminalNode CODE(int i) {
            return getToken(GrammarParser.CODE, i);
        }

        public AltContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_alt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterAlt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitAlt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitAlt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AltContext alt() throws RecognitionException {
        AltContext _localctx = new AltContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_alt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(57);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN || _la == NONTERM) {
                    {
                        setState(55);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case TOKEN: {
                                setState(47);
                                match(TOKEN);
                                setState(49);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                                    case 1: {
                                        setState(48);
                                        match(CODE);
                                    }
                                    break;
                                }
                            }
                            break;
                            case NONTERM: {
                                setState(51);
                                match(NONTERM);
                                setState(53);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                                    case 1: {
                                        setState(52);
                                        match(CODE);
                                    }
                                    break;
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(59);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(61);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CODE) {
                    {
                        setState(60);
                        match(CODE);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LexRuleContext extends ParserRuleContext {
        public TerminalNode TOKEN() {
            return getToken(GrammarParser.TOKEN, 0);
        }

        public TerminalNode STRING_RULE() {
            return getToken(GrammarParser.STRING_RULE, 0);
        }

        public TerminalNode REGEX_RULE() {
            return getToken(GrammarParser.REGEX_RULE, 0);
        }

        public LexRuleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lexRule;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterLexRule(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitLexRule(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitLexRule(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LexRuleContext lexRule() throws RecognitionException {
        LexRuleContext _localctx = new LexRuleContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_lexRule);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(63);
                match(TOKEN);
                setState(64);
                match(T__3);
                setState(65);
                _la = _input.LA(1);
                if (!(_la == STRING_RULE || _la == REGEX_RULE)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(66);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\u0004\u0001\fE\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000" +
                    "\u0011\t\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017" +
                    "\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000" +
                    "\u001e\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003)\b\u0003" +
                    "\n\u0003\f\u0003,\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004" +
                    "\u0003\u00042\b\u0004\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004\u0005" +
                    "\u00048\b\u0004\n\u0004\f\u0004;\t\u0004\u0001\u0004\u0003\u0004>\b\u0004" +
                    "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
                    "\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0001\u0001\u0000" +
                    "\n\u000bH\u0000\u000f\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000" +
                    "\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000" +
                    "\b9\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002" +
                    "\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000" +
                    "\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000" +
                    "\u0010\u0015\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000" +
                    "\u0012\u0014\u0003\u0004\u0002\u0000\u0013\u0012\u0001\u0000\u0000\u0000" +
                    "\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000" +
                    "\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u001c\u0001\u0000\u0000\u0000" +
                    "\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u001b\u0003\u0006\u0003\u0000" +
                    "\u0019\u001b\u0003\n\u0005\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a" +
                    "\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c" +
                    "\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d" +
                    "\u0001\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f" +
                    " \u0005\u0006\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005\u0007" +
                    "\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#$\u0005\t\u0000\u0000$%\u0005" +
                    "\u0001\u0000\u0000%*\u0003\b\u0004\u0000&\'\u0005\u0002\u0000\u0000\'" +
                    ")\u0003\b\u0004\u0000(&\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000" +
                    "*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000" +
                    "\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0003\u0000\u0000.\u0007\u0001" +
                    "\u0000\u0000\u0000/1\u0005\b\u0000\u000002\u0005\u0005\u0000\u000010\u0001" +
                    "\u0000\u0000\u000012\u0001\u0000\u0000\u000028\u0001\u0000\u0000\u0000" +
                    "35\u0005\t\u0000\u000046\u0005\u0005\u0000\u000054\u0001\u0000\u0000\u0000" +
                    "56\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u00007/\u0001\u0000\u0000" +
                    "\u000073\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000" +
                    "\u0000\u00009:\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001" +
                    "\u0000\u0000\u0000<>\u0005\u0005\u0000\u0000=<\u0001\u0000\u0000\u0000" +
                    "=>\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\b\u0000" +
                    "\u0000@A\u0005\u0004\u0000\u0000AB\u0007\u0000\u0000\u0000BC\u0005\u0003" +
                    "\u0000\u0000C\u000b\u0001\u0000\u0000\u0000\n\u000f\u0015\u001a\u001c" +
                    "*1579=";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}