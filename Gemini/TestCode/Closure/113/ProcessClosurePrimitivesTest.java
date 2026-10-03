package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class ProcessClosurePrimitivesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private ProcessClosurePrimitives createPass(CheckLevel level) {
    return new ProcessClosurePrimitives(compiler, null, level);
  }

  @Test
  public void testProcessProvideValid() {
    Node script = new Node(Token.SCRIPT);
    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "provide")),
            new Node(Token.STRING, "my.namespace")));
    script.addChildToBack(expr);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);
    
    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testProcessProvideDuplicate() {
    Node script = new Node(Token.SCRIPT);
    Node expr1 = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "provide")),
            new Node(Token.STRING, "my.namespace")));
    Node expr2 = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "provide")),
            new Node(Token.STRING, "my.namespace")));
    script.addChildToBack(expr1);
    script.addChildToBack(expr2);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);
    
    assertFalse(compiler.getErrors().isEmpty());
    assertEquals(ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR, compiler.getErrors().get(0.getDiagnosticType()));
  }

  @Test
  public void testProcessRequireMissing() {
    Node script = new Node(Token.SCRIPT);
    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "require")),
            new Node(Token.STRING, "nonexistent.namespace")));
    script.addChildToBack(expr);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);

    assertFalse(compiler.getErrors().isEmpty());
    assertEquals(ProcessClosurePrimitives.MISSING_PROVIDE_ERROR, compiler.getErrors().get(0.getDiagnosticType()));
  }

  @Test
  public void testProcessRequireNullArgument() {
    Node script = new Node(Token.SCRIPT);
    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "require"))));
    script.addChildToBack(expr);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);

    assertFalse(compiler.getErrors().isEmpty());
    assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR, compiler.getErrors().get(0.getDiagnosticType()));
  }

  @Test
  public void testProcessRequireInvalidArgumentType() {
    Node script = new Node(Token.SCRIPT);
    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "require")),
            new Node(Token.NUMBER, 123)));
    script.addChildToBack(expr);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);

    assertFalse(compiler.getErrors().isEmpty());
    assertEquals(ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR, compiler.getErrors().get(0.getDiagnosticType()));
  }

  @Test
  public void testProcessRequireTooManyArguments() {
    Node script = new Node(Token.SCRIPT);
    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "require")),
            new Node(Token.STRING, "ns1"),
            new Node(Token.STRING, "ns2")));
    script.addChildToBack(expr);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);

    assertFalse(compiler.getErrors().isEmpty());
    assertEquals(ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR, compiler.getErrors().get(0.getDiagnosticType()));
  }

  @Test
  public void testProcessSetCssNameMappingValid() {
    Node script = new Node(Token.SCRIPT);
    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString(Token.STRING_KEY, "foo");
    key.addChildToBack(Node.newString("bar"));
    objLit.addChildToBack(key);

    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "setCssNameMapping")),
            objLit,
            Node.newString("BY_PART")));
    script.addChildToBack(expr);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);

    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testProcessSetCssNameMappingInvalidStyle() {
    Node script = new Node(Token.SCRIPT);
    Node objLit = new Node(Token.OBJECTLIT);
    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "setCssNameMapping")),
            objLit,
            Node.newString("INVALID_STYLE")));
    script.addChildToBack(expr);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);

    assertFalse(compiler.getErrors().isEmpty());
    assertEquals(ProcessClosurePrimitives.INVALID_STYLE_ERROR, compiler.getErrors().get(0.getDiagnosticType()));
  }

  @Test
  public void testProcessSetCssNameMappingInvalidMapKeyByPart() {
    Node script = new Node(Token.SCRIPT);
    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString(Token.STRING_KEY, "foo-bar");
    key.addChildToBack(Node.newString("baz"));
    objLit.addChildToBack(key);

    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "setCssNameMapping")),
            objLit,
            Node.newString("BY_PART")));
    script.addChildToBack(expr);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);

    assertFalse(compiler.getErrors().isEmpty());
    assertEquals(ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP, compiler.getErrors().get(0.getDiagnosticType()));
  }

  @Test
  public void testProcessBaseClassCallMissingThis() {
    Node script = new Node(Token.SCRIPT);
    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "base")),
            Node.newNumber(1)));
    script.addChildToBack(expr);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);

    assertFalse(compiler.getErrors().isEmpty());
    assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.getErrors().get(0.getDiagnosticType()));
  }

  @Test
  public void testFunctionNamespaceError() {
    Node script = new Node(Token.SCRIPT);
    Node provideExpr = new Node(Token.EXPR_RESULT,
        new Node(Token.CALL,
            new Node(Token.GETPROP,
                new Node(Token.NAME, "goog"),
                new Node(Token.STRING, "provide")),
            Node.newString("myFunc")));
    
    Node funcNode = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, "myFunc"),
        new Node(Token.PARAM_LIST),
        new Node(Token.BLOCK));

    script.addChildToBack(provideExpr);
    script.addChildToBack(funcNode);

    ProcessClosurePrimitives pass = createPass(CheckLevel.ERROR);
    pass.process(null, script);

    assertFalse(compiler.getErrors().isEmpty());
    assertEquals(ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR, compiler.getErrors().get(0.getDiagnosticType()));
  }
}