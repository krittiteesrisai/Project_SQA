package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests สำหรับ {@link CheckGlobalThis}
 *
 * ข้อสมมติฐาน (assumption) เกี่ยวกับ API ที่ไม่ได้อยู่ในซอร์สของ CheckGlobalThis ที่ให้มา
 * แต่จำเป็นสำหรับสร้าง/รัน AST ทดสอบ (ใช้ตาม pattern มาตรฐานของ Closure Compiler):
 *  - Token ที่ปรากฏตรง ๆ ในซอร์ส (FUNCTION, BLOCK, SCRIPT, NAME, ASSIGN, GETPROP, THIS)
 *    ใช้ตรงตามที่ประกาศจริงในคลาสเป้าหมาย
 *  - Token อื่น ๆ ที่ใช้ประกอบ AST เท่านั้น (STRING, VAR, CALL, PARAM_LIST, EXPR_RESULT)
 *    เป็น token มาตรฐานของ com.google.javascript.rhino.Token
 *  - Node(int,...), Node.newString(...), addChildToBack, getFirstChild/getNext/getLastChild,
 *    setJSDocInfo/getJSDocInfo, getQualifiedName เป็น API มาตรฐานของ Node
 *  - JSDocInfoBuilder(boolean), recordConstructor(), recordOverride(), build(Node)
 *    เป็น API มาตรฐานสำหรับสร้าง JSDocInfo ในการทดสอบ
 *  - Compiler#initOptions(CompilerOptions), Compiler#getWarnings(),
 *    NodeTraversal#traverse(AbstractCompiler, Node, Callback) เป็น API มาตรฐาน
 *    ที่ใช้กันทั่วไปในชุดทดสอบของ Closure Compiler
 *
 * หมายเหตุ: กรณี jsDoc.hasThisType() (เงื่อนไข OR ตัวที่ 2 ใน shouldTraverse) "ไม่ได้"
 * เขียนเทสไว้ เนื่องจากการสร้าง JSTypeExpression ที่ถูกต้องต้องพึ่ง API ที่ไม่มีอยู่ใน
 * ซอร์สที่ให้มา และไม่ต้องการเดา behavior ที่ไม่แน่ใจ
 */
public class CheckGlobalThisTest {

  private Compiler compiler;
  private CheckGlobalThis pass;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // assumption: initOptions ตั้งค่า error manager เริ่มต้นให้ compiler.report(...) ทำงานได้
    compiler.initOptions(new CompilerOptions());
    pass = new CheckGlobalThis(compiler, CheckLevel.WARNING);
  }

  // ==================== Helper: สร้าง AST มือ ====================

  private static Node thisNode() {
    return new Node(Token.THIS);
  }

  private static Node name(String n) {
    return Node.newString(Token.NAME, n);
  }

  private static Node string(String s) {
    return Node.newString(s);
  }

  private static Node getprop(Node target, String prop) {
    return new Node(Token.GETPROP, target, string(prop));
  }

  private static Node assign(Node lhs, Node rhs) {
    return new Node(Token.ASSIGN, lhs, rhs);
  }

  private static Node block(Node... stmts) {
    Node b = new Node(Token.BLOCK);
    for (Node s : stmts) {
      b.addChildToBack(s);
    }
    return b;
  }

  private static Node script(Node... stmts) {
    Node s = new Node(Token.SCRIPT);
    for (Node c : stmts) {
      s.addChildToBack(c);
    }
    return s;
  }

  private static Node exprResult(Node expr) {
    return new Node(Token.EXPR_RESULT, expr);
  }

  private static Node function(Node body) {
    Node nameNode = name("");
    Node params = new Node(Token.PARAM_LIST);
    return new Node(Token.FUNCTION, nameNode, params, body);
  }

  private static JSDocInfo buildJsDoc(Node associated, boolean isConstructor, boolean isOverride) {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    if (isConstructor) {
      b.recordConstructor();
    }
    if (isOverride) {
      b.recordOverride();
    }
    return b.build(associated);
  }

  // ==================== shouldTraverse: เงื่อนไขเกี่ยวกับ FUNCTION ====================

  @Test
  public void testShouldTraverse_FunctionWithConstructorJsDoc_ReturnsFalse() {
    Node fn = function(block());
    Node scriptNode = script(fn);
    fn.setJSDocInfo(buildJsDoc(fn, true, false));
    assertFalse(pass.shouldTraverse(null, fn, scriptNode));
  }

  @Test
  public void testShouldTraverse_FunctionWithOverrideJsDoc_ReturnsFalse() {
    Node fn = function(block());
    Node scriptNode = script(fn);
    fn.setJSDocInfo(buildJsDoc(fn, false, true));
    assertFalse(pass.shouldTraverse(null, fn, scriptNode));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_ParentNotAllowed_ReturnsFalse() {
    // function เป็น argument ของ CALL -> parent ไม่ใช่ BLOCK/SCRIPT/NAME/ASSIGN
    Node fn = function(block());
    Node callee = name("setTimeout");
    Node call = new Node(Token.CALL, callee, fn);
    assertFalse(pass.shouldTraverse(null, fn, call));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_ParentBlock_ReturnsTrue() {
    Node fn = function(block());
    Node outerBlock = new Node(Token.BLOCK);
    outerBlock.addChildToBack(fn);
    assertTrue(pass.shouldTraverse(null, fn, outerBlock));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_ParentScript_ReturnsTrue() {
    Node fn = function(block());
    Node scriptNode = new Node(Token.SCRIPT);
    scriptNode.addChildToBack(fn);
    assertTrue(pass.shouldTraverse(null, fn, scriptNode));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_ParentName_ReturnsTrue() {
    // var a = function() {};
    Node fn = function(block());
    Node nameNode = name("a");
    nameNode.addChildToBack(fn);
    assertTrue(pass.shouldTraverse(null, fn, nameNode));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_ParentAssign_NotPrototype_ReturnsTrue() {
    // a.x = function() {};
    Node fn = function(block());
    Node lhs = getprop(name("a"), "x");
    Node assignNode = assign(lhs, fn);
    assertTrue(pass.shouldTraverse(null, fn, assignNode));
  }

  @Test(expected = NullPointerException.class)
  public void testShouldTraverse_FunctionWithoutParent_ThrowsNPE() {
    // boundary: FUNCTION ที่ไม่มี parent เลย -> getFunctionJsDocInfo() เรียก
    // parent.getType() โดยไม่มีการตรวจ null ก่อน ตามที่อ่านได้จากซอร์สโค้ดจริง
    Node fn = function(block());
    pass.shouldTraverse(null, fn, null);
  }

  // ==================== shouldTraverse: เงื่อนไขเกี่ยวกับ ASSIGN (ไม่ใช่ FUNCTION) ====================

  @Test
  public void testShouldTraverse_AssignRhs_LhsIsPrototypeGetProp_ReturnsFalse() {
    // Foo.prototype = <rhs>;
    Node lhs = getprop(name("Foo"), "prototype");
    Node rhs = name("rhsPlaceholder");
    Node assignNode = assign(lhs, rhs);
    assertFalse(pass.shouldTraverse(null, rhs, assignNode));
  }

  @Test
  public void testShouldTraverse_AssignRhs_LhsQualifiedNameContainsPrototype_ReturnsFalse() {
    // Foo.prototype.bar = function() {};
    Node lhs = getprop(getprop(name("Foo"), "prototype"), "bar");
    Node fn = function(block());
    Node assignNode = assign(lhs, fn);
    assertFalse(pass.shouldTraverse(null, fn, assignNode));
  }

  @Test
  public void testShouldTraverse_AssignRhs_NotPrototype_ReturnsTrue() {
    // a.b = c;
    Node lhs = getprop(name("a"), "b");
    Node rhs = name("c");
    Node assignNode = assign(lhs, rhs);
    assertTrue(pass.shouldTraverse(null, rhs, assignNode));
  }

  @Test
  public void testShouldTraverse_AssignLhs_ReturnsTrue() {
    // x = v; -- n คือฝั่ง lhs เอง ต้อง traverse เสมอ
    Node lhs = name("x");
    Node rhs = name("v");
    Node assignNode = assign(lhs, rhs);
    assertTrue(pass.shouldTraverse(null, lhs, assignNode));
  }

  @Test
  public void testShouldTraverse_NullParent_ReturnsTrue() {
    Node scriptNode = new Node(Token.SCRIPT);
    assertTrue(pass.shouldTraverse(null, scriptNode, null));
  }

  @Test
  public void testShouldTraverse_NonAssignNonFunction_ReturnsTrue() {
    Node blk = new Node(Token.BLOCK);
    Node stmt = exprResult(name("a"));
    blk.addChildToBack(stmt);
    assertTrue(pass.shouldTraverse(null, stmt, blk));
  }

  // ==================== getFunctionJsDocInfo: การหา jsdoc จาก parent/grandparent ====================

  @Test
  public void testShouldTraverse_ConstructorJsDocOnVarGrandparent_ReturnsFalse() {
    // /** @constructor */ var Foo = function() {};
    Node fn = function(block());
    Node nameNode = name("Foo");
    nameNode.addChildToBack(fn);
    Node varNode = new Node(Token.VAR, nameNode);
    varNode.setJSDocInfo(buildJsDoc(varNode, true, false));
    assertFalse(pass.shouldTraverse(null, fn, nameNode));
  }

  @Test
  public void testShouldTraverse_ConstructorJsDocOnAssignParent_ReturnsFalse() {
    // /** @constructor */ Foo = function() {};
    Node fn = function(block());
    Node lhs = name("Foo");
    Node assignNode = assign(lhs, fn);
    assignNode.setJSDocInfo(buildJsDoc(assignNode, true, false));
    assertFalse(pass.shouldTraverse(null, fn, assignNode));
  }

  // ==================== visit / shouldReportThis ====================

  @Test
  public void testVisit_ThisAsPropertyAccess_ReportsWarning() {
    // this.foo;
    Node getPropNode = getprop(thisNode(), "foo");
    Node root = script(exprResult(getPropNode));
    NodeTraversal.traverse(compiler, root, pass);
    assertEquals(1, compiler.getWarnings().length);
  }

  @Test
  public void testVisit_ThisAlone_NoWarning() {
    // this; (ไม่ใช่ property access และไม่ใช่ lhs ของ assign)
    Node thisN = thisNode();
    Node parent = exprResult(thisN);
    pass.visit(null, thisN, parent);
    assertEquals(0, compiler.getWarnings().length);
  }

  @Test
  public void testVisit_ThisWithNullParent_NoWarning() {
    Node thisN = thisNode();
    pass.visit(null, thisN, null);
    assertEquals(0, compiler.getWarnings().length);
  }

  @Test
  public void testVisit_NonThisNode_NoWarningNoException() {
    Node nameN = name("a");
    pass.visit(null, nameN, null);
    assertEquals(0, compiler.getWarnings().length);
  }

  @Test
  public void testVisit_ThisInsideNonPrototypeAssignedFunction_ReportsWarning() {
    // a.x = function() { this.foo = v; };
    Node thisAssignLhs = getprop(thisNode(), "foo");
    Node innerAssign = assign(thisAssignLhs, name("v"));
    Node fnBody = block(exprResult(innerAssign));
    Node fn = function(fnBody);
    Node outerLhs = getprop(name("a"), "x");
    Node outerAssign = assign(outerLhs, fn);
    Node root = script(exprResult(outerAssign));

    NodeTraversal.traverse(compiler, root, pass);
    assertEquals(1, compiler.getWarnings().length);
  }

  @Test
  public void testVisit_ThisInsidePrototypeAssignedFunction_NoWarning() {
    // Foo.prototype.bar = function() { this.foo = v; };
    Node thisAssignLhs = getprop(thisNode(), "foo");
    Node innerAssign = assign(thisAssignLhs, name("v"));
    Node fnBody = block(exprResult(innerAssign));
    Node fn = function(fnBody);
    Node outerLhs = getprop(getprop(name("Foo"), "prototype"), "bar");
    Node outerAssign = assign(outerLhs, fn);
    Node root = script(exprResult(outerAssign));

    NodeTraversal.traverse(compiler, root, pass);
    assertEquals(0, compiler.getWarnings().length);
  }

  @Test
  public void testVisit_NestedAssignWithThisOnLhs_ReportsWarningOnce() {
    // (a = this).property = c;  -- ตัวอย่างตรงจาก JavaDoc ของ CheckGlobalThis
    Node innerAssign = assign(name("a"), thisNode());
    Node outerLhs = getprop(innerAssign, "property");
    Node outerAssign = assign(outerLhs, name("c"));
    Node root = script(exprResult(outerAssign));

    NodeTraversal.traverse(compiler, root, pass);
    assertEquals(1, compiler.getWarnings().length);
  }
}
