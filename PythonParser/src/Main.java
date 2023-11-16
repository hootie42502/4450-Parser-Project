import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./project_deliverable_2_testcase.py");
        CharStream charStream = CharStreams.fromPath(path);
        PythonParserLexer pythonLexer = new PythonParserLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(pythonLexer);
        PythonParserParser pythonParser = new PythonParserParser(commonTokenStream);

        ParseTree parseTree = pythonParser.program();

        showTree(parseTree);
    }

    private static void showTree(ParseTree tree) {
        JFrame frame = new JFrame("Parse Tree");
        JPanel panel = new JPanel(new BorderLayout());

        TreeViewer treeViewer = new TreeViewer(null, tree);
        treeViewer.setScale(1.5);

        JScrollPane scrollPane = new JScrollPane(treeViewer);
        panel.add(scrollPane, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}