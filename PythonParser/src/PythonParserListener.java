// Generated from PythonParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParserParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonParserParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonParserParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operation(PythonParserParser.Arithmetic_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operation(PythonParserParser.Arithmetic_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PythonParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PythonParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(PythonParserParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(PythonParserParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(PythonParserParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(PythonParserParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#rel_expression}.
	 * @param ctx the parse tree
	 */
	void enterRel_expression(PythonParserParser.Rel_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#rel_expression}.
	 * @param ctx the parse tree
	 */
	void exitRel_expression(PythonParserParser.Rel_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#not_expression}.
	 * @param ctx the parse tree
	 */
	void enterNot_expression(PythonParserParser.Not_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#not_expression}.
	 * @param ctx the parse tree
	 */
	void exitNot_expression(PythonParserParser.Not_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(PythonParserParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(PythonParserParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#mul_expression}.
	 * @param ctx the parse tree
	 */
	void enterMul_expression(PythonParserParser.Mul_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#mul_expression}.
	 * @param ctx the parse tree
	 */
	void exitMul_expression(PythonParserParser.Mul_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PythonParserParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PythonParserParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration(PythonParserParser.Array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration(PythonParserParser.Array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PythonParserParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PythonParserParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PythonParserParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PythonParserParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(PythonParserParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(PythonParserParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParserParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(PythonParserParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParserParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(PythonParserParser.Assignment_operatorContext ctx);
}