package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Unit tests for {@link Scope}.
 *
 * ข้อสมมติฐาน (Assumptions) เนื่องจากไม่มีซอร์สของคลาสที่ Scope พึ่งพา:
 *
 * 1) สมมติว่า NodeUtil.getInfoForNameNode(Node) คืนค่า null เมื่อ node ไม่มี
 *    JSDocInfo ติดอยู่ (กรณีปกติที่สุด) — ไม่ได้ยืนยันจากซอร์สที่ให้มา
 *    ถ้าสมมติฐานนี้ผิด การเรียก declare() บางเทสอาจ throw โดยไม่คาดคิด
 * 2) สมมติ API มาตรฐานของ com.google.javascript.rhino.Node
 *    (constructor (int type), (int type, String str), addChildToBack,
 *    getFirstChild, getLastChild, getParent, getType, getJSType)
 * 3) การทดสอบ constructor Scope(Node, AbstractCompiler) ใช้ Compiler จริง +
 *    CompilerOptions เพื่อ initialize TypeRegistry (ไม่ mock)
 * 4) ไม่ได้ทดสอบ branch ที่ต้องใช้ CompilerInput ที่ไม่เป็น null
 *    (เช่น isExtern() เมื่อ input!=null, getInputName() เมื่อ input!=null)
 *    เนื่องจากการสร้าง CompilerInput ที่ใช้งานได้จริงซับซ้อนเกินขอบเขต unit test นี้
 * 5) isConst()/isBleedingFunction() พึ่งพา NodeUtil ที่ไม่มีซอร์สให้
 *    จึงทดสอบแบบ smoke test (ไม่ throw exception) เท่านั้น ไม่ยืนยันค่า true/false
 */
public class ScopeTest {

  private Node rootA;
  private Node rootB;
  private Node rootC;

  @Before
  public void setUp() {
    rootA = new Node(Token.SCRIPT);
    rootB = new Node(Token.FUNCTION);
    rootC = new Node(Token.FUNCTION);
  }

  private Node nameNodeWithVarParent(String name) {
    Node parent = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, name);
    parent.addChildToBack(nameNode);
    return nameNode;
  }

  // ---------- Constructor: bottom scope (Node, ObjectType) ----------

  @Test
  public void testBottomScopeConstructor() {
    Scope root = new Scope(rootA, (ObjectType) null);
    assertTrue(root.isBottom());
    assertEquals(0, root.getDepth());
    assertNull(root.getParent());
    assertNull(root.getParentScope());
    assertSame(rootA, root.getRootNode());
    assertNull(root.getTypeOfThis());
    assertTrue(root.isGlobal());
    assertFalse(root.isLocal());
    assertSame(root, root.getGlobalScope());
  }

  // ---------- Constructor: Scope(Scope parent, Node rootNode) ----------

  @Test
  public void testChildScopeConstructor() {
    Scope root = new Scope(rootA, (ObjectType) null);
    Scope child = new Scope(root, rootB);

    assertFalse(child.isBottom());
    assertEquals(1, child.getDepth());
    assertSame(root, child.getParent());
    assertSame(root, child.getParentScope());
    assertSame(rootB, child.getRootNode());
    assertNull(child.getTypeOfThis()); // ไม่มี JSType ที่ rootB -> inherit จาก parent
    assertFalse(child.isGlobal());
    assertTrue(child.isLocal());
    assertSame(root, child.getGlobalScope());
  }

  @Test
  public void testNestedScopeDepthAndGlobalScope() {
    Scope root = new Scope(rootA, (ObjectType) null);
    Scope mid = new Scope(root, rootB);
    Scope leaf = new Scope(mid, rootC);

    assertEquals(0, root.getDepth());
    assertEquals(1, mid.getDepth());
    assertEquals(2, leaf.getDepth());
    assertSame(root, leaf.getGlobalScope());
    assertSame(root, mid.getGlobalScope());
  }

  @Test(expected = NullPointerException.class)
  public void testChildScopeConstructorNullParentThrows() {
    new Scope((Scope) null, rootB);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testChildScopeConstructorSameRootNodeThrows() {
    Scope root = new Scope(rootA, (ObjectType) null);
    new Scope(root, rootA); // rootNode == parent.rootNode
  }

  // ---------- Constructor: Scope(Node, AbstractCompiler) - global scope ----------

  @Test
  public void testGlobalScopeWithCompilerConstructor() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node root = new Node(Token.BLOCK);

    Scope global = new Scope(root, compiler);

    assertFalse(global.isBottom());
    assertEquals(0, global.getDepth());
    assertNull(global.getParent());
    assertTrue(global.isGlobal());
    assertFalse(global.isLocal());
    assertNotNull(global.getTypeOfThis());
  }

  // ---------- declare / undeclare / getVar / getSlot / getOwnSlot ----------

  @Test
  public void testDeclareAndGetVar() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node nameNode = nameNodeWithVarParent("x");

    Var v = scope.declare("x", nameNode, null, null);

    assertNotNull(v);
    assertEquals("x", v.getName());
    assertSame(nameNode, v.getNameNode());
    assertTrue(v.isTypeInferred());
    assertNull(v.getType());
    assertEquals(1, scope.getVarCount());
    assertSame(v, scope.getVar("x"));
    assertSame(v, scope.getSlot("x"));
    assertSame(v, scope.getOwnSlot("x"));
    assertNull(scope.getVar("nonexistent"));
  }

  @Test
  public void testDeclareWithInferredFlagFalse() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node nameNode = nameNodeWithVarParent("y");

    Var v = scope.declare("y", nameNode, null, null, false);

    assertFalse(v.isTypeInferred());
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclareNullNameThrows() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    scope.declare(null, nameNodeWithVarParent("z"), null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclareEmptyNameThrows() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    scope.declare("", nameNodeWithVarParent("z"), null, null);
  }

  @Test(expected = IllegalStateException.class)
  public void testDeclareDuplicateNameThrows() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    scope.declare("dup", nameNodeWithVarParent("dup"), null, null);
    scope.declare("dup", nameNodeWithVarParent("dup"), null, null);
  }

  @Test
  public void testGetVarRecursesToParent() {
    Scope root = new Scope(rootA, (ObjectType) null);
    Scope child = new Scope(root, rootB);

    Node nameNode = nameNodeWithVarParent("outer");
    Var v = root.declare("outer", nameNode, null, null);

    assertSame(v, child.getVar("outer"));   // branch: parent != null -> recurse
    assertSame(v, child.getSlot("outer"));
    assertNull(child.getOwnSlot("outer"));  // getOwnSlot ไม่ recurse
  }

  @Test
  public void testGetVarNotFoundAnywhereReturnsNull() {
    Scope root = new Scope(rootA, (ObjectType) null);
    Scope child = new Scope(root, rootB);

    assertNull(child.getVar("doesNotExist")); // branch: parent == null (สุดสาย) -> null
  }

  @Test
  public void testUndeclare() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node nameNode = nameNodeWithVarParent("temp");
    Var v = scope.declare("temp", nameNode, null, null);

    assertEquals(1, scope.getVarCount());
    scope.undeclare(v);
    assertEquals(0, scope.getVarCount());
    assertNull(scope.getVar("temp"));
  }

  @Test(expected = IllegalStateException.class)
  public void testUndeclareWrongScopeThrows() {
    Scope scopeA = new Scope(rootA, (ObjectType) null);
    Scope scopeB = new Scope(scopeA, rootB);

    Node nameNode = nameNodeWithVarParent("v");
    Var v = scopeA.declare("v", nameNode, null, null);

    scopeB.undeclare(v); // v.scope == scopeA != scopeB(this)
  }

  @Test(expected = IllegalStateException.class)
  public void testUndeclareTwiceThrows() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node nameNode = nameNodeWithVarParent("v2");
    Var v = scope.declare("v2", nameNode, null, null);

    scope.undeclare(v);
    scope.undeclare(v); // ครั้งที่สอง vars.get(name) != var
  }

  // ---------- isDeclared ----------

  @Test
  public void testIsDeclaredOwnScopeTrue() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    scope.declare("a", nameNodeWithVarParent("a"), null, null);

    assertTrue(scope.isDeclared("a", false));
    assertTrue(scope.isDeclared("a", true));
  }

  @Test
  public void testIsDeclaredRecurseTrueFindsInParent() {
    Scope root = new Scope(rootA, (ObjectType) null);
    Scope child = new Scope(root, rootB);
    root.declare("b", nameNodeWithVarParent("b"), null, null);

    assertTrue(child.isDeclared("b", true));
  }

  @Test
  public void testIsDeclaredRecurseFalseDoesNotFindInParent() {
    Scope root = new Scope(rootA, (ObjectType) null);
    Scope child = new Scope(root, rootB);
    root.declare("c", nameNodeWithVarParent("c"), null, null);

    assertFalse(child.isDeclared("c", false));
  }

  @Test
  public void testIsDeclaredNotFoundAtAll() {
    Scope root = new Scope(rootA, (ObjectType) null);
    Scope child = new Scope(root, rootB);

    assertFalse(child.isDeclared("nope", true));
    assertFalse(root.isDeclared("nope", false));
  }

  // ---------- getVars / getVarCount ----------

  @Test
  public void testGetVarsIteratorAndCount() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    assertEquals(0, scope.getVarCount());

    scope.declare("v1", nameNodeWithVarParent("v1"), null, null);
    scope.declare("v2", nameNodeWithVarParent("v2"), null, null);

    assertEquals(2, scope.getVarCount());

    Iterator<Var> it = scope.getVars();
    int count = 0;
    while (it.hasNext()) {
      it.next();
      count++;
    }
    assertEquals(2, count);
  }

  // ---------- isGlobal / isLocal ----------

  @Test
  public void testIsGlobalIsLocal() {
    Scope root = new Scope(rootA, (ObjectType) null);
    Scope child = new Scope(root, rootB);

    assertTrue(root.isGlobal());
    assertFalse(root.isLocal());
    assertFalse(child.isGlobal());
    assertTrue(child.isLocal());
  }

  // ---------- Var: getParentNode / getInitialValue ----------

  @Test
  public void testVarGetParentNode() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node nameNode = nameNodeWithVarParent("p");
    Var v = scope.declare("p", nameNode, null, null);

    assertSame(nameNode.getParent(), v.getParentNode());
  }

  @Test
  public void testVarGetParentNodeNullWhenNoParent() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node nameNode = new Node(Token.NAME, "noparent"); // ไม่มี parent

    Var v = scope.declare("noparent", nameNode, null, null);

    assertNull(v.getParentNode());
  }

  @Test
  public void testGetInitialValueFunctionCase() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node functionParent = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "f");
    functionParent.addChildToBack(nameNode);

    Var v = scope.declare("f", nameNode, null, null);

    assertSame(functionParent, v.getInitialValue()); // branch: pType == FUNCTION
  }

  @Test
  public void testGetInitialValueAssignCase() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node assignParent = new Node(Token.ASSIGN);
    Node nameNode = new Node(Token.NAME, "a");
    Node valueNode = new Node(Token.NUMBER);
    assignParent.addChildToBack(nameNode);
    assignParent.addChildToBack(valueNode);

    Var v = scope.declare("a", nameNode, null, null);

    assertSame(valueNode, v.getInitialValue()); // branch: pType == ASSIGN
  }

  @Test
  public void testGetInitialValueVarCase() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node varParent = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "vv");
    Node valueNode = new Node(Token.NUMBER);
    varParent.addChildToBack(nameNode);
    nameNode.addChildToBack(valueNode);

    Var v = scope.declare("vv", nameNode, null, null);

    assertSame(valueNode, v.getInitialValue()); // branch: pType == VAR
  }

  @Test
  public void testGetInitialValueDefaultCase() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node blockParent = new Node(Token.BLOCK);
    Node nameNode = new Node(Token.NAME, "bb");
    blockParent.addChildToBack(nameNode);

    Var v = scope.declare("bb", nameNode, null, null);

    assertNull(v.getInitialValue()); // branch: else -> null
  }

  @Test(expected = NullPointerException.class)
  public void testGetInitialValueNoParentThrowsNPE() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Node nameNode = new Node(Token.NAME, "nn");
    Var v = scope.declare("nn", nameNode, null, null);

    v.getInitialValue(); // parent == null -> parent.getType() ทำให้ NPE
  }

  // ---------- Var: isGlobal / isLocal delegation ----------

  @Test
  public void testVarIsGlobalIsLocalDelegatesToScope() {
    Scope root = new Scope(rootA, (ObjectType) null);
    Scope child = new Scope(root, rootB);

    Var globalVar = root.declare("g", nameNodeWithVarParent("g"), null, null);
    Var localVar = child.declare("l", nameNodeWithVarParent("l"), null, null);

    assertTrue(globalVar.isGlobal());
    assertFalse(globalVar.isLocal());
    assertFalse(localVar.isGlobal());
    assertTrue(localVar.isLocal());
  }

  // ---------- Var: isExtern ----------

  @Test
  public void testVarIsExternWithNullInput() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("e", nameNodeWithVarParent("e"), null, null);

    assertTrue(v.isExtern()); // input == null -> true
  }
  // หมายเหตุ: กรณี input != null ไม่ได้ทดสอบ (ดูข้อสมมติฐานข้อ 4)

  // ---------- Var: isDefine / getJSDocInfo / isNoShadow ----------

  @Test
  public void testVarIsDefineFalseWhenNoJSDocInfo() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("d", nameNodeWithVarParent("d"), null, null);

    assertFalse(v.isDefine());
    assertNull(v.getJSDocInfo());
    assertFalse(v.isNoShadow()); // info == null -> false
  }

  // ---------- Var: getType / setType / isTypeInferred ----------

  @Test
  public void testVarGetTypeInitiallyNull() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("t", nameNodeWithVarParent("t"), null, null);

    assertNull(v.getType());
  }

  @Test
  public void testVarSetTypeWhenInferredSucceeds() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("ti", nameNodeWithVarParent("ti"), null, null, true);

    v.setType(null); // ไม่ throw เพราะ typeInferred == true
    assertNull(v.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testVarSetTypeWhenNotInferredThrows() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("td", nameNodeWithVarParent("td"), null, null, false);

    v.setType(null); // typeInferred == false -> throw
  }

  // ---------- Var: resolveType (type == null branch) ----------

  @Test
  public void testVarResolveTypeNoOpWhenTypeNull() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("rt", nameNodeWithVarParent("rt"), null, null);

    v.resolveType(null); // type == null -> ไม่มีการ resolve, ไม่ throw
    assertNull(v.getType());
  }

  // ---------- Var: getInputName ----------

  @Test
  public void testVarGetInputNameNullInput() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("in", nameNodeWithVarParent("in"), null, null);

    assertEquals("<non-file>", v.getInputName());
  }
  // หมายเหตุ: กรณี input != null (input.getName()) ไม่ได้ทดสอบ (ดูข้อสมมติฐานข้อ 4)

  // ---------- Var: equals / hashCode / toString ----------

  @Test
  public void testVarEqualsBasedOnNameNodeReference() {
    Scope scopeA = new Scope(rootA, (ObjectType) null);
    Scope scopeB = new Scope(scopeA, rootB);

    Node sharedNameNode = nameNodeWithVarParent("shared");

    Var v1 = scopeA.declare("nameX", sharedNameNode, null, null);
    Var v2 = scopeB.declare("nameY", sharedNameNode, null, null);

    // equals() เช็คแค่ reference ของ nameNode ไม่เช็คชื่อ/สโคป
    // -> อาจเป็นช่องโหว่/fault ที่เทสนี้ช่วยดักจับ
    assertTrue(v1.equals(v2));
    assertEquals(v1.hashCode(), v2.hashCode());
  }

  @Test
  public void testVarEqualsFalseForDifferentNameNode() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v1 = scope.declare("n1", nameNodeWithVarParent("n1"), null, null);
    Var v2 = scope.declare("n2", nameNodeWithVarParent("n2"), null, null);

    assertFalse(v1.equals(v2));
  }

  @Test
  public void testVarEqualsFalseForNonVarObject() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v1 = scope.declare("nv", nameNodeWithVarParent("nv"), null, null);

    assertFalse(v1.equals("not a var"));
  }

  @Test
  public void testVarToString() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("tostr", nameNodeWithVarParent("tostr"), null, null);

    assertEquals("Scope.Var tostr", v.toString());
  }

  // ---------- Var: isBleedingFunction / isConst (smoke tests, assumption #5) ----------

  @Test
  public void testVarIsBleedingFunctionSmokeTest() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("bf", nameNodeWithVarParent("bf"), null, null);

    // parent เป็น VAR (ไม่ใช่ function expression) -> คาดว่าเป็น false
    assertFalse(v.isBleedingFunction());
  }

  @Test
  public void testVarIsConstSmokeTest() {
    Scope scope = new Scope(rootA, (ObjectType) null);
    Var v = scope.declare("myVar", nameNodeWithVarParent("myVar"), null, null);

    // ไม่ทราบ behavior จริงของ NodeUtil.isConstantName() จึงแค่เรียกโดยไม่ให้ throw
    v.isConst();
  }
}
