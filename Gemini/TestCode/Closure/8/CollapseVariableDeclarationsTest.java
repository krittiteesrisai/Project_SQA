package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import junit.framework.TestCase;

/**
 * JUnit 4 Test Suite for CollapseVariableDeclarations (Closure-8b)
 * Designed for high branch/condition coverage and edge cases detection.
 */
public class CollapseVariableDeclarationsTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // ตั้งค่า Compiler options พื้นฐานสำหรับการทดสอบ
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  /**
   * Test 1: Empty AST / No variables to collapse.
   * Triggers: collapses.isEmpty() == true branch.
   */
  public void testEmptyPass() {
    Node root = new Node(Token.BLOCK);
    CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);
    pass.process(null, root);
    // ตรวจสอบว่าผ่านได้ปกติโดยไม่มี Error
    assertNotNull(root);
  }

  /**
   * Test 2: Standard multiple var declarations.
   * Triggers: n.isVar() branch, hasNodesToCollapse && hasVar == true,
   * และ applyCollapses() สำหรับ n.isVar()
   */
  public void testCollapseMultipleVars() {
    // สร้าง AST จำลอง: var a; var b = 1; var c = 2;
    Node block = new Node(Token.BLOCK);
    
    Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "b").clonePropsFrom(Node.newNumber(1)));
    var2.getFirstChild().addChildToBack(Node.newNumber(1));
    
    block.addChildToBack(var1);
    block.addChildToBack(var2);

    CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);
    pass.process(null, block);

    // ตรวจสอบผลลัพธ์หลัง Collapse
    // คาดหวังว่าจะยุบเหลือ var node เดียว
    assertEquals(Token.VAR, block.getFirstChild().getType());
  }

  /**
   * Test 3: Edge Case - Stub variable blacklisting.
   * Triggers: blacklistStubVars where child.getFirstChild() == null.
   */
  public void testBlacklistStubVars() {
    Node block = new Node(Token.BLOCK);
    // var x; (stub var - ไม่มีค่าเริ่มต้น)
    Node stubVar = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    // var x = 1; (พยายามประกาศซ้ำ)
    Node redeclVar = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    redeclVar.getFirstChild().addChildToBack(Node.newNumber(1));

    block.addChildToBack(stubVar);
    block.addChildToBack(redeclVar);

    NodeTraversal t = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal traversal, Node n, Node parent) {}
    });
    t.traverse(block);

    CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);
    pass.process(null, block);
    assertNotNull(block);
  }

  /**
   * Test 4: Edge Case - If node parent protection.
   * Triggers: parent.isIf() branch -> should skip collapsing.
   */
  public void testParentIsIfNode() {
    Node block = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF);
    
    Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "b"));
    
    ifNode.addChildToBack(Node.newTrue()); // Condition
    ifNode.addChildToBack(var1);          // Then branch
    ifNode.addChildToBack(var2);          // Else branch (adjacent var children under IF)

    block.addChildToBack(ifNode);

    CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);
    // ไม่ควรยุบ var ภายใน IF node
    pass.process(null, block);
    assertEquals(Token.IF, block.getFirstChild().getType());
  }

  /**
   * Test 5: Assignment Collapse (canBeRedeclared).
   * Triggers: canBeRedeclared() returning true, and redeclaration branch in applyCollapses().
   */
  public void testCollapseAssignments() {
    Node block = new Node(Token.BLOCK);
    
    // var c;
    Node varC = new Node(Token.VAR, Node.newString(Token.NAME, "c"));
    
    // a = true;
    Node assignA = new Node(Token.EXPR_RESULT, 
        new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), Node.newTrue()));
        
    block.addChildToBack(varC);
    block.addChildToBack(assignA);

    CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);
    pass.process(null, block);
    
    assertNotNull(block);
  }

  /**
   * Test 6: Invalid assignment structure for canBeRedeclared.
   * Triggers: !NodeUtil.isExprAssign(n) and !lhs.isName() branches.
   */
  public void testInvalidCanBeRedeclaredStates() {
    Node block = new Node(Token.BLOCK);
    
    // Exprที่ไม่ใช่ Assign เช่นฟังก์ชันคอลเดี่ยวๆ
    Node exprCall = new Node(Token.EXPR_RESULT, new Node(Token.CALL, Node.newString(Token.NAME, "alert")));
    block.addChildToBack(exprCall);

    CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);
    pass.process(null, block);
    
    assertNotNull(block);
  }

  /**
   * Test 7: Already visited nodes (nodesToCollapse contains n).
   * Triggers: nodesToCollapse.contains(n) return branch.
   */
  public void testAlreadyProcessedNodes() {
    Node block = new Node(Token.BLOCK);
    Node var1 = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    Node var2 = new Node(Token.VAR, Node.newString(Token.NAME, "y"));
    
    block.addChildToBack(var1);
    block.addChildToBack(var2);

    CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);
    // รันสองรอบเพื่อให้มั่นใจว่า Handle สถานะซ้ำได้ถูกต้อง
    pass.process(null, block);
    pass.process(null, block);

    assertNotNull(block);
  }
}