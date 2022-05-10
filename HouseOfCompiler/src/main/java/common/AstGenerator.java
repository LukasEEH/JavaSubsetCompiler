package common;

import codegen.ClassGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import parser.generated.JavaSubsetLexer;
import parser.generated.JavaSubsetParser;
import syntaxtree.structure.ClassDecl;
import syntaxtree.structure.Program;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class AstGenerator implements IAstGenerator{

    @Override
    public Program getAst(InputStream stream) {
        CharStream charStream = null;

        try{
            charStream = CharStreams.fromStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JavaSubsetLexer lexer = new JavaSubsetLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaSubsetParser parser = new JavaSubsetParser(tokens);


        Vector<ClassDecl> classes = new Vector<ClassDecl>();
        Program program = new Program(classes);

        // TODO: Generatoren Implementieren (Lukas)

        return program;
    }
}
