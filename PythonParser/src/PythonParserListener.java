// Generated from PythonParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParserParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PythonParserParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PythonParserParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonParserParser.ExprContext ctx);
}