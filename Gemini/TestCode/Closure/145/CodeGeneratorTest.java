package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CodeGeneratorTest {

  /**
   * Stub implementation of CodeConsumer for testing CodeGenerator output.
   */
  private static class TestCodeConsumer extends CodeConsumer {
    final StringBuilder sb = new StringBuilder();
    final List<String> identifiers = new ArrayList<String>();
    final List<String> ops = new ArrayList<String>();

    @Override
    void add(String str) {
      sb.append(str);
    }

    @Override
    void addIdentifier(String identifier) {
      identifiers.add(identifier);
      sb.append(identifier);
    }

    @Override
    void addOp(String op, boolean needSpace) {
      if (needSpace && sb.length() > 0 && !Character.isWhitespace(sb.charAt(sb.length() - 1))) {
        sb.append(" ");
      }
      ops.add(op);
      sb.append(op);
      if (needSpace) {
        sb.append(" ");
      }
    }

    @Override
    boolean continueProcessing() {
      return true;
    }

    String getOutput() {
      return sb.toString();
    }
  }

  @Test
  public void testConstructorsAndCharsets() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cgNull = new CodeGenerator(consumer, null);
    CodeGenerator cgAscii = new CodeGenerator(consumer, Charsets.US_ASCII);
    CodeGenerator cgUtf8 = new CodeGenerator(consumer, Charset.forName("UTF-8"));
    CodeGenerator cgDefault = new CodeGenerator(consumer);
    
    assertNotNull(cgNull);
    assertNotNull(cgAscii);
    assertNotNull(cgUtf8);
    assertNotNull(cgDefault);
  }

  @Test
  public void testAddStringAndNumber() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);
    cg.add("hello");
    assertEquals("hello", consumer.getOutput());

    Node numNode = Node.newNumber(42.5);
    cg.add(numNode);
  }

  @Test
  public void testBinaryOperatorsAndAssociativity() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);

    // a + b
    Node left = Node.newString(Token.NAME, "a");
    Node right = Node.newString(Token.NAME, "b");
    Node addNode = new Node(Token.ADD, left, right);

    cg.add(addNode);
    assertTrue(consumer.getOutput().contains("+"));
  }

  @Test
  public void testTryCatchFinallyNode() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);

    // try { } catch (e) { } finally { }
    Node tryBody = new Node(Token.BLOCK);
    Node catchBlockParent = new Node(Token.BLOCK, new Node(Token.EMPTY));
    Node finallyBody = new Node(Token.BLOCK);

    Node tryNode = new Node(Token.TRY, tryBody, catchBlockParent, finallyBody);
    
    try {
      cg.add(tryNode);
    } catch (Exception e) {
      // Depending on strict preconditions in D4J, verify behavior
    }
  }

  @Test
  public void testThrowAndReturnStatements() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);

    Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "err"));
    cg.add(throwNode);

    Node returnNode = new Node(Token.RETURN);
    cg.add(returnNode);
  }

  @Test
  public void testVarAndNameNodes() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);

    Node nameNode = Node.newString(Token.NAME, "x");
    Node varNode = new Node(Token.VAR, nameNode);
    cg.add(varNode);

    Node assignedName = Node.newString(Token.NAME, "y");
    assignedName.addChildToBack(Node.newNumber(10));
    cg.add(assignedName);
  }

  @Test
  public void testUnaryAndLogicalOperators() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);

    Node notNode = new Node(Token.NOT, Node.newString(Token.NAME, "flag"));
    cg.add(notNode);

    Node typeofNode = new Node(Token.TYPEOF, Node.newString(Token.NAME, "x"));
    cg.add(typeofNode);
  }

  @Test
  public void testHookOperator() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);

    Node cond = Node.newString(Token.TRUE);
    Node left = Node.newNumber(1);
    Node right = Node.newNumber(2);
    Node hook = new Node(Token.HOOK, cond, left);
    hook.addChildToBack(right);

    cg.add(hook);
    assertTrue(consumer.getOutput().contains("?"));
    assertTrue(consumer.getOutput().contains(":"));
  }

  @Test
  public void testRegExpEscapeVariants() {
    String escaped1 = CodeGenerator.regexpEscape("test/path");
    assertEquals("/test\\/path/", escaped1);

    String escaped2 = CodeGenerator.regexpEscape("test/path", Charset.forName("UTF-8"));
    assertTrue(escaped2.contains("test"));
  }

  @Test
  public void testJsStringAndEscapingEdgeCases() {
    // Test quotes counting
    String jsStr1 = CodeGenerator.jsString("he'llo \"world\"", null);
    assertNotNull(jsStr1);

    // Test strEscape with special characters (\n, \r, \t, \, ", ', >, <, non-ascii)
    String complexStr = "Line1\nLine2\rTab\t\\Backslash\"Double'Single>--]]><script>ü";
    String escapedResult = CodeGenerator.strEscape(complexStr, '"', "\\\"", "\'", "\\\\", null);
    assertNotNull(escapedResult);

    String escapedWithEncoder = CodeGenerator.strEscape(complexStr, '"', "\\\"", "\'", "\\\\", Charset.forName("US-ASCII").newEncoder());
    assertNotNull(escapedWithEncoder);
  }

  @Test
  public void testIdentifierEscape() {
    String asciiId = CodeGenerator.identifierEscape("validName");
    assertEquals("validName", asciiId);

    String unicodeId = CodeGenerator.identifierEscape("ตัวแปร");
    assertTrue(unicodeId.contains("\\u"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString() {
    String res = CodeGenerator.escapeToDoubleQuotedJsString("test 'single' and \"double\"");
    assertNotNull(res);
  }

  @Test(expected = Error.class)
  public void testExprVoidThrowsError() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);
    Node exprVoid = new Node(Token.EXPR_VOID);
    cg.add(exprVoid);
  }

  @Test
  public void testObjectLiteralAndSwitch() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);

    Node objLit = new Node(Token.OBJECTLIT, Node.newString(Token.STRING, "key"), Node.newNumber(1));
    cg.add(objLit);

    Node switchNode = new Node(Token.SWITCH, Node.newString(Token.NAME, "val"));
    Node caseNode = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK));
    switchNode.addChildToBack(caseNode);
    cg.add(switchNode);
  }

  @Test
  public void testForAndWhileLoops() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    CodeGenerator cg = new CodeGenerator(consumer);

    Node whileNode = new Node(Token.WHILE, Node.newString(Token.TRUE), new Node(Token.BLOCK));
    cg.add(whileNode);

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), Node.newString(Token.TRUE));
    cg.add(doNode);
  }
}