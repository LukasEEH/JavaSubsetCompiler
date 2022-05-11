package parser.adapter;

import common.AccessModifier;
import parser.generated.JavaSubsetParser;
import syntaxtree.structure.FieldDecl;

import java.util.Locale;

public class FieldAdapter {
    public static FieldDecl adapt(JavaSubsetParser.FieldDeclContext fieldDeclContext){
        return new FieldDecl(
                fieldDeclContext.Identifier(1).getText(),
                AccessModifier.valueOf(
                        fieldDeclContext.AccessModifier().getText().toUpperCase(Locale.ROOT)
                )
        );
    }
}
