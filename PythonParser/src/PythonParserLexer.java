// Generated from PythonParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NEWLINE=3, INT=4, FLOAT=5, STRING=6, CHAR=7, BOOL=8, OPERATOR=9, 
		ASSIGNMENT=10, SPACE=11, VAR=12, LETTER=13, ARRAY=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NEWLINE", "INT", "FLOAT", "STRING", "CHAR", "BOOL", 
			"OPERATOR", "ASSIGNMENT", "SPACE", "VAR", "LETTER", "ARRAY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NEWLINE", "INT", "FLOAT", "STRING", "CHAR", "BOOL", 
			"OPERATOR", "ASSIGNMENT", "SPACE", "VAR", "LETTER", "ARRAY"
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


	public PythonParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

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
		"\u0004\u0000\u000e\u009b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002#\b\u0002\u000b\u0002"+
		"\f\u0002$\u0001\u0003\u0004\u0003(\b\u0003\u000b\u0003\f\u0003)\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u00053\b\u0005\n\u0005\f\u00056\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007G\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bN\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tg\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003"+
		"\u000bo\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bt\b\u000b"+
		"\n\u000b\f\u000bw\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u007f\b\r\u0001\r\u0001\r\u0005\r\u0083\b\r\n\r\f\r\u0086\t"+
		"\r\u0003\r\u0088\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u008d\b\r\u0005\r"+
		"\u008f\b\r\n\r\f\r\u0092\t\r\u0003\r\u0094\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u009a\b\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0005\u0002\u0000"+
		"\n\n\r\r\u0001\u000009\u0003\u000009AZaz\u0004\u0000%%*+--//\u0002\u0000"+
		"AZaz\u00b8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0001\u001d\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000"+
		"\u0005\"\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000\t+\u0001"+
		"\u0000\u0000\u0000\u000b/\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000"+
		"\u0000\u000fF\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013"+
		"f\u0001\u0000\u0000\u0000\u0015h\u0001\u0000\u0000\u0000\u0017n\u0001"+
		"\u0000\u0000\u0000\u0019x\u0001\u0000\u0000\u0000\u001b\u0099\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005(\u0000\u0000\u001e\u0002\u0001\u0000\u0000"+
		"\u0000\u001f \u0005)\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!#\u0007"+
		"\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0006\u0001\u0000"+
		"\u0000\u0000&(\u0007\u0001\u0000\u0000\'&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000"+
		"*\b\u0001\u0000\u0000\u0000+,\u0003\u0007\u0003\u0000,-\u0005.\u0000\u0000"+
		"-.\u0003\u0007\u0003\u0000.\n\u0001\u0000\u0000\u0000/4\u0005\"\u0000"+
		"\u000003\u0003\u0019\f\u000013\u0003\u0007\u0003\u000020\u0001\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000078\u0005\"\u0000\u00008\f\u0001\u0000\u0000\u00009:"+
		"\u0005\'\u0000\u0000:;\u0007\u0002\u0000\u0000;<\u0005\'\u0000\u0000<"+
		"\u000e\u0001\u0000\u0000\u0000=>\u0005T\u0000\u0000>?\u0005r\u0000\u0000"+
		"?@\u0005u\u0000\u0000@G\u0005e\u0000\u0000AB\u0005F\u0000\u0000BC\u0005"+
		"a\u0000\u0000CD\u0005l\u0000\u0000DE\u0005s\u0000\u0000EG\u0005e\u0000"+
		"\u0000F=\u0001\u0000\u0000\u0000FA\u0001\u0000\u0000\u0000G\u0010\u0001"+
		"\u0000\u0000\u0000HN\u0007\u0003\u0000\u0000IJ\u0005*\u0000\u0000JN\u0005"+
		"*\u0000\u0000KL\u0005/\u0000\u0000LN\u0005/\u0000\u0000MH\u0001\u0000"+
		"\u0000\u0000MI\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000N\u0012"+
		"\u0001\u0000\u0000\u0000OP\u0005+\u0000\u0000Pg\u0005=\u0000\u0000Qg\u0005"+
		"=\u0000\u0000RS\u0005-\u0000\u0000Sg\u0005=\u0000\u0000TU\u0005/\u0000"+
		"\u0000Ug\u0005=\u0000\u0000VW\u0005*\u0000\u0000Wg\u0005=\u0000\u0000"+
		"XY\u0005%\u0000\u0000Yg\u0005=\u0000\u0000Z[\u0005*\u0000\u0000[\\\u0005"+
		"*\u0000\u0000\\g\u0005=\u0000\u0000]^\u0005/\u0000\u0000^_\u0005/\u0000"+
		"\u0000_g\u0005=\u0000\u0000`a\u0005|\u0000\u0000ag\u0005=\u0000\u0000"+
		"bc\u0005^\u0000\u0000cg\u0005=\u0000\u0000de\u0005&\u0000\u0000eg\u0005"+
		"=\u0000\u0000fO\u0001\u0000\u0000\u0000fQ\u0001\u0000\u0000\u0000fR\u0001"+
		"\u0000\u0000\u0000fT\u0001\u0000\u0000\u0000fV\u0001\u0000\u0000\u0000"+
		"fX\u0001\u0000\u0000\u0000fZ\u0001\u0000\u0000\u0000f]\u0001\u0000\u0000"+
		"\u0000f`\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000g\u0014\u0001\u0000\u0000\u0000hi\u0005 \u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jk\u0006\n\u0000\u0000k\u0016\u0001\u0000\u0000\u0000"+
		"lo\u0003\u0019\f\u0000mo\u0005_\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000ou\u0001\u0000\u0000\u0000pt\u0003\u0019\f\u0000"+
		"qt\u0003\u0007\u0003\u0000rt\u0005_\u0000\u0000sp\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0018\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0007\u0004\u0000\u0000"+
		"y\u001a\u0001\u0000\u0000\u0000z~\u0005[\u0000\u0000{\u007f\u0003\u0007"+
		"\u0003\u0000|\u007f\u0003\t\u0004\u0000}\u007f\u0003\r\u0006\u0000~{\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000"+
		"\u007f\u0093\u0001\u0000\u0000\u0000\u0080\u0087\u0005,\u0000\u0000\u0081"+
		"\u0083\u0003\u0015\n\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u008c\u0001\u0000\u0000\u0000\u0089\u008d"+
		"\u0003\u0007\u0003\u0000\u008a\u008d\u0003\t\u0004\u0000\u008b\u008d\u0003"+
		"\r\u0006\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008e\u0080\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005]\u0000"+
		"\u0000\u0096\u009a\u0001\u0000\u0000\u0000\u0097\u0098\u0005[\u0000\u0000"+
		"\u0098\u009a\u0005]\u0000\u0000\u0099z\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u001c\u0001\u0000\u0000\u0000\u0012\u0000"+
		"$)24FMfnsu~\u0084\u0087\u008c\u0090\u0093\u0099\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}