package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

/**
 * High-coverage JUnit 4 test suite for com.google.javascript.rhino.IR (Defects4J Closure-27b)
 */
public class IRTest {

  @Test
  public void testBasicNodes() {
    assertNotNull(IR.empty());
    assertEquals(Token.EMPTY, IR.empty().getType());

    assertNotNull(IR.block());
    assertEquals(Token.BLOCK, IR.block().getType());

    assertNotNull(IR.returnNode());
    assertEquals(Token.RETURN, IR.returnNode().getType());

    assertNotNull(IR.breakNode());
    assertEquals(Token.BREAK, IR.breakNode().getType());

    assertNotNull(IR.continueNode());
    assertEquals(Token.CONTINUE, IR.continueNode().getType());

    assertNotNull(IR.thisNode());
    assertEquals(Token.THIS, IR.thisNode().getType());

    assertNotNull(IR.trueNode());
    assertEquals(Token.TRUE, IR.trueNode().getType());

    assertNotNull(IR.falseNode());
    assertEquals(Token.FALSE, IR.falseNode().getType());

    assertNotNull(IR.nullNode());
    assertEquals(Token.NULL, IR.nullNode().getType());

    assertNotNull(IR.name("testName"));
    assertEquals(Token.NAME, IR.name("testName").getType());

    assertNotNull(IR.string("str"));
    assertNotNull(IR.stringKey("strKey"));
    assertNotNull(IR.number(42.0));
  }

  @Test
  public void testFunctionAndParams() {
    Node name = IR.name("myFunc");
    Node paramList = IR.paramList(IR.name("a"), IR.name("b"));
    Node body = IR.block(IR.empty());

    Node func = IR.function(name, paramList, body);
    assertEquals(Token.FUNCTION, func.getType());

    // Test overloaded paramList
    Node singleParam = IR.paramList(IR.name("x"));
    assertEquals(Token.PARAM_LIST, singleParam.getType());

    List<Node> listParams = new ArrayList<Node>();
    listParams.add(IR.name("y"));
    Node listParamResult = IR.paramList(listParams);
    assertEquals(Token.PARAM_LIST, listParamResult.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionInvalidName() {
    // Passing a number instead of a name should trigger IllegalStateException
    IR.function(IR.number(1), IR.paramList(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionInvalidParams() {
    IR.function(IR.name("f"), IR.block(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionInvalidBody() {
    IR.function(IR.name("f"), IR.paramList(), IR.name("body"));
  }

  @Test
  public void testControlFlowIfAndLoops() {
    Node cond = IR.trueNode();
    Node thenBlock = IR.block(IR.empty());
    Node elseBlock = IR.block(IR.empty());

    Node ifN = IR.ifNode(cond, thenBlock);
    assertEquals(Token.IF, ifN.getType());

    Node ifElseN = IR.ifNode(cond, thenBlock, elseBlock);
    assertEquals(Token.IF, ifElseN.getType());

    Node doN = IR.doNode(thenBlock, cond);
    assertEquals(Token.DO, doN.getType());

    Node varNode = IR.var(IR.name("i"), IR.number(0));
    Node incr = IR.exprResult(IR.add(IR.name("i"), IR.number(1)));
    Node forN = IR.forNode(varNode, cond, incr, thenBlock);
    assertEquals(Token.FOR, forN.getType());

    Node forInN = IR.forIn(IR.name("x"), IR.name("obj"), thenBlock);
    assertEquals(Token.FOR, forInN.getType());
  }

  @Test
  public void testSwitchAndCases() {
    Node cond = IR.name("val");
    Node caseN = IR.caseNode(IR.number(1), IR.block(IR.empty()));
    Node defaultN = IR.defaultCase(IR.block(IR.empty()));

    Node switchN = IR.switchNode(cond, caseN, defaultN);
    assertEquals(Token.SWITCH, switchN.getType());
  }

  @Test
  public void testTryCatchFinally() {
    Node labelNameTry = IR.labelName("tryLabel");
    Node labelNameFinally = IR.labelName("finallyLabel");
    
    // tryFinally expects label names based on implementation code
    Node tryFin = IR.tryFinally(labelNameTry, labelNameFinally);
    assertEquals(Token.TRY, tryFin.getType());

    Node tryBody = IR.block(IR.empty());
    Node catchN = IR.catchNode(IR.name("e"), IR.block(IR.empty()));
    Node tryCat = IR.tryCatch(tryBody, catchN);
    assertEquals(Token.TRY, tryCat.getType());

    Node tryCatFin = IR.tryCatchFinally(tryBody, catchN, IR.block(IR.empty()));
    assertEquals(Token.TRY, tryCatFin.getType());
  }

  @Test
  public void testOperatorsAndExpressions() {
    Node n1 = IR.name("a");
    Node n2 = IR.name("b");

    assertNotNull(IR.call(n1, n2));
    assertNotNull(IR.newNode(n1, n2));
    assertNotNull(IR.getprop(n1, IR.stringKey("prop")));
    assertNotNull(IR.getelem(n1, n2));
    assertNotNull(IR.assign(IR.name("a"), n2));
    assertNotNull(IR.hook(n1, n2, n1));
    assertNotNull(IR.comma(n1, n2));
    assertNotNull(IR.and(n1, n2));
    assertNotNull(IR.or(n1, n2));
    assertNotNull(IR.not(n1));
    assertNotNull(IR.eq(n1, n2));
    assertNotNull(IR.sheq(n1, n2));
    assertNotNull(IR.voidNode(n1));
    assertNotNull(IR.neg(n1));
    assertNotNull(IR.pos(n1));
    assertNotNull(IR.add(n1, n2));
    assertNotNull(IR.sub(n1, n2));
  }

  @Test
  public void testLiteralsAndRegex() {
    Node strKey = IR.stringKey("key");
    Node propDef = IR.propdef(strKey, IR.number(123));
    assertNotNull(propDef);

    Node objLit = IR.objectlit(propDef);
    assertEquals(Token.OBJECTLIT, objLit.getType());

    Node arrLit = IR.arraylit(IR.number(1), IR.empty());
    assertEquals(Token.ARRAYLIT, arrLit.getType());

    Node reg = IR.regexp(IR.string("abc"));
    assertEquals(Token.REGEXP, reg.getType());

    Node regFlags = IR.regexp(IR.string("abc"), IR.string("g"));
    assertEquals(Token.REGEXP, regFlags.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testInvalidStatementTriggerDefaultBranch() {
    // Passing a non-statement/non-expression where statement is expected triggers Preconditions
    // e.g., block(Node stmt) requires mayBeStatement(stmt) == true
    IR.block(IR.string("not-a-statement"));
  }

  @Test(expected = IllegalStateException.class)
  public void testInvalidExpressionTriggerDefaultBranch() {
    // exprResult requires mayBeExpression(expr) == true
    IR.exprResult(IR.empty());
  }

  @Test(expected = IllegalStateException.class)
  public void testLabelNameEmpty() {
    IR.labelName("");
  }
}