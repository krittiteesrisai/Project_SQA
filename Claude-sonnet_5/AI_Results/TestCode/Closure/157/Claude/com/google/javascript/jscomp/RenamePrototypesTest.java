package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit tests for {@link RenamePrototypes} (Defects4J Closure-157b).
 *
 * หมายเหตุการออกแบบ:
 * - เนื่องจากไม่มี parser ("Compiler.parse") ที่ยืนยันได้แน่ชัดในสภาพ classpath ที่กำหนด,
 *   จึงสร้าง AST ด้วยมือผ่าน Rhino Node API พื้นฐาน (Node/Token) ตามรูปแบบที่ปรากฏจริง
 *   ในซอร์สโค้ดเป้าหมาย (n.getFirstChild().getNext(), n.getString(), n.setString(), ...)
 * - บาง test พึ่งพา default CodingConvention ของ Compiler ในเรื่อง isPrivate/isExported
 *   (leading/trailing underscore) ซึ่งไม่ได้อยู่ในซอร์สที่ให้มาโดยตรง แต่อ้างอิงจาก
 *   Javadoc ระดับคลาสของ RenamePrototypes เอง — กำกับคอมเมนต์ไว้ในแต่ละ test ที่เกี่ยวข้อง
 */
public class RenamePrototypesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    // process() ต้องการ Preconditions.checkState(lifeCycleStage.isNormalized())
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
  }

  // ---------- Node-building helpers (Rhino Node API) ----------

  private Node nameNode(String n) {
    return Node.newString(Token.NAME, n);
  }

  private Node twoChild(int type, Node left, Node right) {
    Node n = new Node(type);
    n.addChildToBack(left);
    n.addChildToBack(right);
    return n;
  }

  private Node getprop(Node base, String propName) {
    return twoChild(Token.GETPROP, base, Node.newString(propName));
  }

  private Node getelem(Node base, String propName) {
    return twoChild(Token.GETELEM, base, Node.newString(propName));
  }

  /** สร้าง Foo.prototype.<propName> -> คืนค่า outer GETPROP node */
  private Node buildPrototypeMethod(String propName) {
    Node base = getprop(nameNode("Foo"), "prototype");
    return getprop(base, propName);
  }

  /** ดึง STRING node ของชื่อ property จาก outer GETPROP ที่สร้างโดย buildPrototypeMethod */
  private Node propStringOf(Node outerGetProp) {
    return outerGetProp.getFirstChild().getNext();
  }

  private Node block(Node... children) {
    Node b = new Node(Token.BLOCK);
    for (Node c : children) {
      b.addChildToBack(c);
    }
    return b;
  }

  private Node emptyExterns() {
    return new Node(Token.BLOCK);
  }

  // =========================================================
  // aggressiveRenaming + character-heuristic loop (canRenamePrototypeProperty)
  // =========================================================

  @Test
  public void testAggressiveRenaming_plainName_renamed() {
    Node methodAccess = buildPrototypeMethod("abc");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertNotEquals("abc", propStringOf(methodAccess).getString());
  }

  @Test
  public void testNonAggressive_plainLowercaseName_notRenamed() {
    Node methodAccess = buildPrototypeMethod("abc");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertEquals("abc", propStringOf(methodAccess).getString());
  }

  @Test
  public void testNonAggressive_nameWithUppercase_renamed() {
    Node methodAccess = buildPrototypeMethod("fooBar");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertNotEquals("fooBar", propStringOf(methodAccess).getString());
  }

  @Test
  public void testNonAggressive_nameWithDigit_renamed() {
    Node methodAccess = buildPrototypeMethod("foo2");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertNotEquals("foo2", propStringOf(methodAccess).getString());
  }

  // =========================================================
  // reservedNames (default built-ins) 
  // =========================================================

  @Test
  public void testDefaultReservedName_toString_notRenamed() {
    Node methodAccess = buildPrototypeMethod("toString");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertEquals("toString", propStringOf(methodAccess).getString());
  }

  // =========================================================
  // isExported / isPrivate (naming convention) - ตาม Javadoc ของคลาส
  // =========================================================

  @Test
  public void testLeadingUnderscore_treatedAsExported_notRenamed() {
    // NOTE: อ้างอิง Javadoc ของ RenamePrototypes: "leading underscore -> ไม่ rename"
    // การตัดสินใจจริงอยู่ใน CodingConvention.isExported() ซึ่งไม่ปรากฏใน source ที่ให้มา
    Node methodAccess = buildPrototypeMethod("_foo");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertEquals("_foo", propStringOf(methodAccess).getString());
  }

  @Test
  public void testTrailingUnderscore_objLit_treatedAsPrivate_renamed() {
    // NOTE: อ้างอิง Javadoc: "end with underscore -> rename"
    // canRenameObjLitProperty() ไม่มี character loop เลย จึงพึ่งพา isPrivate() 100%
    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString("abc_");
    objLit.addChildToBack(key);
    Node jsRoot = block(objLit);

    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertNotEquals("abc_", key.getString());
  }

  // =========================================================
  // canRenameObjLitProperty ไม่สนใจ aggressiveRenaming
  // =========================================================

  @Test
  public void testObjLitProperty_aggressiveIrrelevant_notRenamed() {
    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString("abc");
    objLit.addChildToBack(key);
    Node jsRoot = block(objLit);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertEquals("abc", key.getString());
  }

  // =========================================================
  // canRename(): combined branch (prototypeCount>0 && objLitCount>0)
  // =========================================================

  @Test
  public void testCombinedPrototypeAndObjLit_oneFails_notRenamed() {
    // "fooBar": prototype-heuristic = true (uppercase), objLit-heuristic = false (no underscore)
    Node methodAccess = buildPrototypeMethod("fooBar");
    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString("fooBar");
    objLit.addChildToBack(key);
    Node jsRoot = block(methodAccess, objLit);

    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertEquals("fooBar", propStringOf(methodAccess).getString());
    assertEquals("fooBar", key.getString());
  }

  @Test
  public void testCombinedPrototypeAndObjLit_bothTrue_renamed() {
    // NOTE: พึ่งพา default isPrivate() ของ CodingConvention (ดูหมายเหตุด้านบน)
    Node methodAccess = buildPrototypeMethod("abc_");
    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString("abc_");
    objLit.addChildToBack(key);
    Node jsRoot = block(methodAccess, objLit);

    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    pass.process(emptyExterns(), jsRoot);

    assertNotEquals("abc_", propStringOf(methodAccess).getString());
    assertNotEquals("abc_", key.getString());
    // ทั้งสอง node อ้างถึง Property เดียวกัน จึงควรได้ newName เดียวกัน
    assertEquals(propStringOf(methodAccess).getString(), key.getString());
  }

  // =========================================================
  // "ไม่ทราบว่าเป็น prototype หรือ objLit" (refCount only) -> ตกไปที่ branch สุดท้ายของ canRename()
  // =========================================================

  @Test
  public void testRefOnlyProperty_combinedBranch_notRenamed() {
    Node access = getprop(nameNode("Foo"), "bar"); // Foo.bar (ไม่ผ่าน prototype/objlit)
    Node jsRoot = block(access);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(emptyExterns(), jsRoot);

    Node propNode = access.getFirstChild().getNext();
    assertEquals("bar", propNode.getString());
  }

  @Test
  public void testRefOnlyProperty_combinedBranch_renamed() {
    Node access = getprop(nameNode("Foo"), "bar_");
    Node jsRoot = block(access);

    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    pass.process(emptyExterns(), jsRoot);

    Node propNode = access.getFirstChild().getNext();
    assertNotEquals("bar_", propNode.getString());
  }

  // =========================================================
  // prevUsedRenameMap (reusePrototypeNames)
  // =========================================================

  @Test
  public void testPrevRenameMap_reusedName() {
    Map<String, String> prevMap = new HashMap<String, String>();
    prevMap.put("abc", "z");
    VariableMap varMap = new VariableMap(prevMap);

    Node methodAccess = buildPrototypeMethod("abc");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, varMap);
    pass.process(emptyExterns(), jsRoot);

    assertEquals("z", propStringOf(methodAccess).getString());
  }

  @Test
  public void testPrevRenameMap_conflictWithReserved_fallsBackToNameGenerator() {
    Map<String, String> prevMap = new HashMap<String, String>();
    prevMap.put("abc", "toString"); // "toString" อยู่ใน reservedNames โดย default
    VariableMap varMap = new VariableMap(prevMap);

    Node methodAccess = buildPrototypeMethod("abc");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, varMap);
    pass.process(emptyExterns(), jsRoot);

    String result = propStringOf(methodAccess).getString();
    assertNotEquals("toString", result);
    assertNotEquals("abc", result);
  }

  // =========================================================
  // ProcessExternedProperties: externs -> reservedNames (GETPROP / GETELEM)
  // =========================================================

  @Test
  public void testExternedPropertyNotRenamed_viaGetProp() {
    Node externRoot = block(getprop(nameNode("Foo"), "abc"));
    Node methodAccess = buildPrototypeMethod("abc");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(externRoot, jsRoot);

    assertEquals("abc", propStringOf(methodAccess).getString());
  }

  @Test
  public void testExternedPropertyNotRenamed_viaGetElem() {
    Node externRoot = block(getelem(nameNode("Foo"), "abc"));
    Node methodAccess = buildPrototypeMethod("abc");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(externRoot, jsRoot);

    assertEquals("abc", propStringOf(methodAccess).getString());
  }

  // =========================================================
  // Foo.prototype = {...} (ASSIGN branch) + NUMBER key skip + prototypeObjLits dedup
  // =========================================================

  @Test
  public void testPrototypeAssignObjectLiteral_ASSIGN_branch_and_numberKeySkip() {
    Node fooProto = getprop(nameNode("Foo"), "prototype");
    Node objLit = new Node(Token.OBJECTLIT);
    Node abcKey = Node.newString("abc");
    objLit.addChildToBack(abcKey);
    // numeric key ต้องถูก skip โดยไม่พยายามเรียก getString() บน NUMBER node
    Node numKey = Node.newNumber(1);
    objLit.addChildToBack(numKey);
    Node assign = twoChild(Token.ASSIGN, fooProto, objLit);
    Node jsRoot = block(assign);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    // ต้องไม่ throw แม้ objLit มี NUMBER key ปนอยู่
    pass.process(emptyExterns(), jsRoot);

    assertNotEquals("abc", abcKey.getString());
    assertEquals(Token.NUMBER, numKey.getType());
  }

  // =========================================================
  // dest.getType() != STRING -> ต้องถูก ignore (ไม่ throw, ไม่ track)
  // =========================================================

  @Test
  public void testGetElemWithNonStringKey_ignored() {
    // Foo[x] : dest เป็น NAME ไม่ใช่ STRING
    Node access = twoChild(Token.GETELEM, nameNode("Foo"), nameNode("x"));
    Node jsRoot = block(access);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(emptyExterns(), jsRoot);

    VariableMap map = pass.getPropertyMap();
    assertNull(map.lookupNewName("x"));
  }

  // =========================================================
  // getPropertyMap()
  // =========================================================

  @Test
  public void testGetPropertyMap_reflectsRenaming() {
    Node methodAccess = buildPrototypeMethod("abc");
    Node jsRoot = block(methodAccess);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(emptyExterns(), jsRoot);

    String newName = propStringOf(methodAccess).getString();
    VariableMap map = pass.getPropertyMap();
    assertEquals(newName, map.lookupNewName("abc"));
  }

  // =========================================================
  // Boundary: empty externs/root trees
  // =========================================================

  @Test
  public void testEmptyTrees_noExceptionAndEmptyMap() {
    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(emptyExterns(), new Node(Token.BLOCK));

    VariableMap map = pass.getPropertyMap();
    assertNull(map.lookupNewName("anything"));
  }
}
