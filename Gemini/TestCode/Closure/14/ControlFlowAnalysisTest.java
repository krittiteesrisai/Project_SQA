package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for ControlFlowAnalysis (Closure-14b).
 */
public class ControlFlowAnalysisTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  @Test
  public void testConstructorAndGetters() {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, true);
    Assert.assertNull(cfa.getCfg());
  }

  @Test
  public void testProcessBasicScript() {
    // สร้าง SCRIPT node ง่ายๆ พร้อม EXPR_RESULT
    Node script = new Node(Token.SCRIPT);
    Node expr = new Node(Token.EXPR_RESULT, new Node(Token.NUMBER, 1.0));
    script.addChildToBack(expr);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, false);
    cfa.process(script, script);
    Assert.assertNotNull(cfa.getCfg());
  }

  @Test
  public void testShouldTraverseFunctionAndTry() {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, false);
    Node root = new Node(Token.SCRIPT);
    Node func = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK));
    
    root.addChildToBack(func);
    root.addChildToBack(tryNode);

    cfa.process(root, root);
    
    // ทดสอบ shouldTraverse สำหรับ Function และ Try โดยตรง
    NodeTraversal t = new NodeTraversal(compiler, cfa);
    Assert.assertTrue(cfa.shouldTraverse(t, func, root));
    Assert.assertTrue(cfa.shouldTraverse(t, tryNode, root));
  }

  @Test
  public void testShouldTraverseParentBranches() {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    Node root = new Node(Token.SCRIPT);
    
    // Test FOR parent check
    Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.BLOCK));
    Node forBody = forNode.getLastChild();
    NodeTraversal t = new NodeTraversal(compiler, cfa);
    
    Assert.assertTrue(cfa.shouldTraverse(t, forBody, forNode));
    Assert.assertFalse(cfa.shouldTraverse(t, forNode.getFirstChild(), forNode));

    // Test IF parent check (skip condition, traverse branch)
    Node ifNode = new Node(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK));
    Assert.assertFalse(cfa.shouldTraverse(t, ifNode.getFirstChild(), ifNode));
    Assert.assertTrue(cfa.shouldTraverse(t, ifNode.getFirstChild().getNext(), ifNode));

    // Test SWITCH, CATCH, LABEL parents
    Node switchNode = new Node(Token.SWITCH, new Node(Token.STRING, "s"), new Node(Token.BLOCK));
    Assert.assertFalse(cfa.shouldTraverse(t, switchNode.getFirstChild(), switchNode));
  }

  @Test
  public void testVisitBranches() {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, false);
    Node root = new Node(Token.SCRIPT);
    
    // จำลองกระบวนการประมวลผล Control Flow ของ Control Structures ต่างๆ
    Node ifNode = new Node(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK), new Node(Token.BLOCK));
    Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), new Node(Token.TRUE));
    Node switchNode = new Node(Token.SWITCH, new Node(Token.STRING, "a"));
    Node caseNode = new Node(Token.CASE, new Node(Token.STRING, "a"), new Node(Token.BLOCK));
    Node defaultNode = new Node(Token.DEFAULT_CASE, new Node(Token.BLOCK));
    Node throwNode = new Node(Token.THROW, new Node(Token.STRING, "err"));
    Node returnNode = new Node(Token.RETURN);
    Node breakNode = new Node(Token.BREAK);
    Node continueNode = new Node(Token.CONTINUE);
    Node withNode = new Node(Token.WITH, new Node(Token.NAME, "obj"), new Node(Token.BLOCK));

    root.addChildToBack(ifNode);
    root.addChildToBack(whileNode);
    root.addChildToBack(doNode);
    root.addChildToBack(switchNode);
    root.addChildToBack(caseNode);
    root.addChildToBack(defaultNode);
    root.addChildToBack(throwNode);
    root.addChildToBack(returnNode);
    root.addChildToBack(breakNode);
    root.addChildToBack(continueNode);
    root.addChildToBack(withNode);

    cfa.process(root, root);
    Assert.assertNotNull(cfa.getCfg());
  }

  @Test(expected = IllegalStateException.class)
    public void testBreakTargetNotFoundThrowsException() {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, false);
    Node root = new Node(Token.SCRIPT);
    Node breakNode = new Node(Token.BREAK); // ไม่มี Loop รองรับด้านบน ทำให้หา Break target ไม่พบ
    root.addChildToBack(breakNode);

    compiler.setIdeMode(false);
    cfa.process(root, root);
  }

  @Test
  public void testBreakTargetNotFoundIdeMode() {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, false);
    Node root = new Node(Token.SCRIPT);
    Node breakNode = new Node(Token.BREAK);
    root.addChildToBack(breakNode);

    compiler.setIdeMode(true); // ใน IDE mode จะไม่โยน Exception
    cfa.process(root, root);
    Assert.assertNotNull(cfa.getCfg());
  }

  @Test
  public void testMayThrowExceptionEdgeCases() {
    // ทดสอบ Token ที่ทำให้ mayThrowException เป็น true และ false
    Node callNode = new Node(Token.CALL);
    Node getPropNode = new Node(Token.GETPROP);
    Node funcNode = new Node(Token.FUNCTION);
    Node numberNode = new Node(Token.NUMBER, 10.0);

    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(callNode));
    Assert.assertTrue(ControlFlowAnalysis.mayThrowException(getPropNode));
    Assert.assertFalse(ControlFlowAnalysis.mayThrowException(funcNode));
    Assert.assertFalse(ControlFlowAnalysis.mayThrowException(numberNode));
  }

  @Test
  public void testIsBreakAndContinueStructure() {
    Node forNode = new Node(Token.FOR);
    Node whileNode = new Node(Token.WHILE);
    Node doNode = new Node(Token.DO);
    Node switchNode = new Node(Token.SWITCH);
    Node ifNode = new Node(Token.IF);

    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(forNode, false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(ifNode, true));
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(ifNode, false));

    Assert.assertTrue(ControlFlowAnalysis.isContinueStructure(forNode));
    Assert.assertTrue(ControlFlowAnalysis.isContinueStructure(whileNode));
    Assert.assertTrue(ControlFlowAnalysis.isContinueStructure(doNode));
    Assert.assertFalse(ControlFlowAnalysis.isContinueStructure(ifNode));
  }

  @Test
  public void testGetExceptionHandlerAndCatchHandler() {
    Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), new Node(Token.BLOCK));
    Node block = tryNode.getFirstChild();
    
    // ทดสอบ getCatchHandlerForBlock และ getExceptionHandler
    Assert.assertNull(ControlFlowAnalysis.getCatchHandlerForBlock(block));
    Assert.assertNull(ControlFlowAnalysis.getExceptionHandler(block));
  }

  @Test
  public void testComputeFollowNodeStatics() {
    Node node = new Node(Token.EXPR_RESULT, new Node(Token.NUMBER, 1.0));
    Node follow = ControlFlowAnalysis.computeFollowNode(node);
    Assert.assertNull(follow);
  }
}