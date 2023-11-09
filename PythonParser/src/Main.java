import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("./project_deliverable_1_testcase.py");
        PythonParserLexer pythonLexer = new PythonParserLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(pythonLexer);
        PythonParserParser pythonParser = new PythonParserParser(commonTokenStream);

        ParseTree parseTree = pythonParser.expr();
        System.out.println(parseTree.toStringTree());

    }
}