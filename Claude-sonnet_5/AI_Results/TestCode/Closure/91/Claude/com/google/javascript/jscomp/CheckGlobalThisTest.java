package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * JUnit4 tests สำหรับ {@link CheckGlobalThis} (Defects4J Closure-91b).
 *
 * ASSUMPTIONS (สมมติฐาน/ความเสี่ยงที่ต้องกำกับตามข้อ 4):
 * 1) ไม่มี mocking framework ใน classpath ที่กำหนด จึงสร้าง Node/JSDocInfo
 *    ด้วยของจริงทั้งหมด
 * 2) กรณี jsDoc.hasThisType() == true (@this annotation) ไม่ได้ถูกทดสอบ
 *    เพราะต้องสร้าง JSTypeExpression ซึ่งซับซ้อนเกินกว่าจะสร้างได้อย่าง
 *    ปลอดภัยโดยไม่เดา API ที่ไม่ปรากฏในซอร์สที่ให้มา
 * 3) NodeUtil.isGet(Node) ถูกอ้างอิงตาม concept มาตรฐานของ Closure Compiler
 *    ว่าคืน true สำหรับ GETPROP/GETELEM เท่านั้น (ไม่มีซอร์สของ NodeUtil ให้)
 * 4) Compiler#initOptions(CompilerOptions), Compiler#getWarningCount(),
 *    NodeTraversal.traverse(AbstractCompiler, Node, Callback) ใช้ตาม
 *    รูปแบบมาตรฐานของโค้ด Closure Compiler ยุคนั้น
 */
public class CheckGlobalThisTest {

  private Compiler compiler;
  private CheckGlobalThis pass;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    pass = new CheckGlobalThis(compiler, CheckLevel.WARNING);
  }

  // ---------------- Helpers ----------------

  private static Node nameNode(String s) {
    return Node.newString(Token.NAME, s);
  }

  private static Node getprop(Node base, String prop) {
    return new Node(Token.GETPROP, base, Node.newString(Token.STRING, prop));
  }

  /** สร้าง JSDocInfo พร้อม flag ที่ต้องการ (ไม่รวม hasThisType, ดู assumption #2) */
  private JSDocInfo buildJsDoc(boolean isConstructor, boolean isInterface,
      boolean isOverride) {
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    if (isConstructor) {
      builder.recordConstructor();
    }
    if (isInterface) {
      builder.recordInterface();
    }
    if (isOverride) {
      builder.recordOverride();
    }
    return builder.build(new Node(Token.FUNCTION));
  }

  // ============ shouldTraverse: FUNCTION + JSDoc annotation branches ============

  @Test
  public void testShouldTraverse_FunctionIsConstructor_ReturnsFalse() {
    Node block = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION);
    block.addChildToBack(fn);
    fn.setJSDocInfo(buildJsDoc(true, false, false));

    assertFalse(pass.shouldTraverse(null, fn, block));
  }

  @Test
  public void testShouldTraverse_FunctionIsInterface_ReturnsFalse() {
    Node block = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION);
    block.addChildToBack(fn);
    fn.setJSDocInfo(buildJsDoc(false, true, false));

    assertFalse(pass.shouldTraverse(null, fn, block));
  }

  @Test
  public void testShouldTraverse_FunctionIsOverride_ReturnsFalse() {
    Node block = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION);
    block.addChildToBack(fn);
    fn.setJSDocInfo(buildJsDoc(false, false, true));

    assertFalse(pass.shouldTraverse(null, fn, block));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_ParentBlock_ReturnsTrue() {
    Node block = new Node(Token.BLOCK);
    Node fn = new Node(Token.FUNCTION);
    block.addChildToBack(fn);

    assertTrue(pass.shouldTraverse(null, fn, block));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_InvalidParent_ReturnsFalse() {
    // parent = CALL ไม่อยู่ใน whitelist (BLOCK/SCRIPT/NAME/ASSIGN/STRING/NUMBER)
    Node call = new Node(Token.CALL);
    Node fn = new Node(Token.FUNCTION);
    call.addChildToBack(fn);

    assertFalse(pass.shouldTraverse(null, fn, call));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_ParentScript_ReturnsTrue() {
    Node script = new Node(Token.SCRIPT);
    Node fn = new Node(Token.FUNCTION);
    script.addChildToBack(fn);

    assertTrue(pass.shouldTraverse(null, fn, script));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_ParentString_ReturnsTrue() {
    // object literal key: {x: function(){}}
    Node key = Node.newString(Token.STRING, "x");
    Node fn = new Node(Token.FUNCTION);
    key.addChildToBack(fn);

    assertTrue(pass.shouldTraverse(null, fn, key));
  }

  @Test
  public void testShouldTraverse_FunctionNoJsDoc_ParentNumber_ReturnsTrue() {
    Node key = Node.newNumber(1);
    Node fn = new Node(Token.FUNCTION);
    key.addChildToBack(fn);

    assertTrue(pass.shouldTraverse(null, fn, key));
  }

  @Test
  public void testShouldTraverse_FunctionJsDocFromNameParent_Constructor() {
    // var a = function() {}; jsDoc ติดบน NAME node
    Node var = new Node(Token.VAR);
    Node name = nameNode("a");
    var.addChildToBack(name);
    Node fn = new Node(Token.FUNCTION);
    name.addChildToBack(fn);
    name.setJSDocInfo(buildJsDoc(true, false, false));

    assertFalse(pass.shouldTraverse(null, fn, name));
  }

  @Test
  public void testShouldTraverse_FunctionJsDocFromVarGramps_Constructor() {
    // jsDoc ติดบน VAR (gramps ของ FUNCTION)
    Node var = new Node(Token.VAR);
    Node name = nameNode("a");
    var.addChildToBack(name);
    Node fn = new Node(Token.FUNCTION);
    name.addChildToBack(fn);
    var.setJSDocInfo(buildJsDoc(true, false, false));

    assertFalse(pass.shouldTraverse(null, fn, name));
  }

  @Test
  public void testShouldTraverse_FunctionJsDocNone_GrampsNotVar_ReturnsTrue() {
    // gramps เป็น ASSIGN ไม่ใช่ VAR -> jsDoc ยังคง null -> parent(NAME) valid -> true
    Node assignForName = new Node(Token.ASSIGN);
    Node name = nameNode("a");
    assignForName.addChildToBack(name);
    assignForName.addChildToBack(Node.newNumber(0));
    Node fn = new Node(Token.FUNCTION);
    name.addChildToBack(fn);

    assertTrue(pass.shouldTraverse(null, fn, name));
  }

  @Test
  public void testShouldTraverse_FunctionJsDocFromAssignParent_Override() {
    // a.x = function() {}; jsDoc ติดบน ASSIGN
    Node lhs = getprop(nameNode("a"), "x");
    Node fn = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN, lhs, fn);
    assign.setJSDocInfo(buildJsDoc(false, false, true));

    assertFalse(pass.shouldTraverse(null, fn, assign));
  }

  // ============ shouldTraverse: ASSIGN / prototype-skip branches ============

  @Test
  public void testShouldTraverse_AssignLhs_AlwaysTraversed() {
    Node lhs = new Node(Token.THIS);
    Node rhs = Node.newNumber(5);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertTrue(pass.shouldTraverse(null, lhs, assign));
  }

  @Test
  public void testShouldTraverse_AssignRhs_LhsIsPrototypeGetProp_ReturnsFalse() {
    // Foo.prototype = this;
    Node lhs = getprop(nameNode("Foo"), "prototype");
    Node rhs = new Node(Token.THIS);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertFalse(pass.shouldTraverse(null, rhs, assign));
  }

  @Test
  public void testShouldTraverse_AssignRhs_LlhsIsPrototypeGetProp_ReturnsFalse() {
    // Foo.prototype.bar = this;
    Node protoGet = getprop(nameNode("Foo"), "prototype");
    Node lhs = getprop(protoGet, "bar");
    Node rhs = new Node(Token.THIS);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertFalse(pass.shouldTraverse(null, rhs, assign));
  }

  @Test
  public void testShouldTraverse_AssignRhs_LhsIsNonPrototypeGetProp_ReturnsTrue() {
    // a.b = this;
    Node lhs = getprop(nameNode("a"), "b");
    Node rhs = new Node(Token.THIS);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertTrue(pass.shouldTraverse(null, rhs, assign));
  }

  @Test
  public void testShouldTraverse_AssignRhs_LhsIsNotGet_ReturnsTrue() {
    // a = this;
    Node lhs = nameNode("a");
    Node rhs = new Node(Token.THIS);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    assertTrue(pass.shouldTraverse(null, rhs, assign));
  }

  @Test
  public void testShouldTraverse_ParentNotAssign_ReturnsTrue() {
    Node block = new Node(Token.BLOCK);
    Node n = new Node(Token.THIS);
    block.addChildToBack(n);

    assertTrue(pass.shouldTraverse(null, n, block));
  }

  // ============ Full traversal: visit()/shouldReportThis/assignLhsChild ============

  @Test
  public void testVisit_GlobalThisPropertyAccess_ReportsWarning() {
    // this.foo = 5;
    Node thisNode = new Node(Token.THIS);
    Node lhs = new Node(Token.GETPROP, thisNode, Node.newString(Token.STRING, "foo"));
    Node rhs = Node.newNumber(5);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(assign);

    NodeTraversal.traverse(compiler, script, pass);

    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_BareThisAsAssignLhs_ReportsWarning() {
    // this = 5; (ทดสอบ path assignLhsChild ตรง ๆ)
    Node thisNode = new Node(Token.THIS);
    Node rhs = Node.newNumber(5);
    Node assign = new Node(Token.ASSIGN, thisNode, rhs);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(assign);

    NodeTraversal.traverse(compiler, script, pass);

    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_ThisAssignedToVariable_NoWarning() {
    // var a = this;  (ตามตัวอย่างในเอกสารของคลาส ไม่ควร trigger)
    Node var = new Node(Token.VAR);
    Node name = nameNode("a");
    var.addChildToBack(name);
    Node thisNode = new Node(Token.THIS);
    name.addChildToBack(thisNode);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(var);

    NodeTraversal.traverse(compiler, script, pass);

    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_PlainAssignRhsThis_NoWarning() {
    // a = this;
    Node lhs = nameNode("a");
    Node rhs = new Node(Token.THIS);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(assign);

    NodeTraversal.traverse(compiler, script, pass);

    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_RhsThisPropertyAccess_ReportsWarning() {
    // a.b = this.c;
    Node lhs = getprop(nameNode("a"), "b");
    Node thisNode = new Node(Token.THIS);
    Node rhs = getprop(thisNode, "c");
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(assign);

    NodeTraversal.traverse(compiler, script, pass);

    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testVisit_PrototypeAssignment_RhsNotTraversed_NoWarning() {
    // Foo.prototype.bar = this.baz;
    Node protoGet = getprop(nameNode("Foo"), "prototype");
    Node lhs = getprop(protoGet, "bar");
    Node thisNode = new Node(Token.THIS);
    Node rhs = getprop(thisNode, "baz");
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(assign);

    NodeTraversal.traverse(compiler, script, pass);

    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_FunctionWithConstructorJsDoc_ThisInside_NotReported() {
    // function Foo() { this.x = 1; } กับ @constructor -> ไม่ traverse เข้าไปเลย
    Node fnNameNode = nameNode("Foo");
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToBack(fnNameNode);
    Node body = new Node(Token.BLOCK);
    Node thisNode = new Node(Token.THIS);
    Node innerLhs = new Node(Token.GETPROP, thisNode, Node.newString(Token.STRING, "x"));
    Node innerAssign = new Node(Token.ASSIGN, innerLhs, Node.newNumber(1));
    body.addChildToBack(innerAssign);
    fn.addChildToBack(body);
    fn.setJSDocInfo(buildJsDoc(true, false, false));

    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(fn);

    NodeTraversal.traverse(compiler, script, pass);

    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testVisit_FunctionWithoutJsDoc_ValidParent_ThisInside_Reported() {
    // a.foo = function() { this.x = 1; };
    Node lhsOuter = getprop(nameNode("a"), "foo");
    Node fn = new Node(Token.FUNCTION);
    Node fnNameEmpty = Node.newString(Token.NAME, "");
    fn.addChildToBack(fnNameEmpty);
    Node body = new Node(Token.BLOCK);
    Node thisNode = new Node(Token.THIS);
    Node innerLhs = new Node(Token.GETPROP, thisNode, Node.newString(Token.STRING, "x"));
    Node innerAssign = new Node(Token.ASSIGN, innerLhs, Node.newNumber(1));
    body.addChildToBack(innerAssign);
    fn.addChildToBack(body);

    Node assignOuter = new Node(Token.ASSIGN, lhsOuter, fn);
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(assignOuter);

    NodeTraversal.traverse(compiler, script, pass);

    assertEquals(1, compiler.getWarningCount());
  }
}
