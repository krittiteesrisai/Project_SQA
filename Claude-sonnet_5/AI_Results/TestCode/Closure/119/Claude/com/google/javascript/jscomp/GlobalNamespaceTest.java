package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.GlobalNamespace.AstChange;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * JUnit4 test suite สำหรับ {@link GlobalNamespace} (Defects4J: Closure-119b)
 */
public class GlobalNamespaceTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  /**
   * Parse JS ด้วย Compiler.parseTestCode (สมมติฐาน: มี method นี้จริงใน
   * Compiler สำหรับใช้งานใน test ของ jscomp package)
   */
  private Node parseCode(String js) {
    Node root = compiler.parseTestCode(js);
    assertEquals("ควร parse ได้ไม่มี error", 0, compiler.getErrorCount());
    return root;
  }

  /**
   * สร้าง Node ปลอม ๆ ที่มี parent (BLOCK) เสมอ เพื่อไม่ให้ชน NPE ใน
   * Name.getDocInfoForDeclaration() ซึ่งเรียก refParent.getType() โดยไม่เช็ค null
   * เมื่อ ref.node.getParent() เป็น null (เกิดเฉพาะกรณี ref type = SET_FROM_GLOBAL)
   */
  private static Node dummyNode() {
    Node parent = new Node(Token.BLOCK);
    Node child = new Node(Token.NAME);
    parent.addChildToBack(child);
    return child;
  }

  // =======================================================================
  // ส่วนที่ 1: ทดสอบ Name / Ref โดยตรง (ไม่ต้อง parse จริง)
  // =======================================================================

  @Test
  public void testNameDefaultsAndSimpleGetters() {
    Name n = new Name("a", null, false);
    assertNull(n.getDeclaration());
    assertFalse(n.isTypeInferred());
    assertNull(n.getType());
    assertNull(n.getJSDocInfo());
    assertTrue(n.getRefs().isEmpty());
    assertFalse(n.isDeclaredType());
  }

  @Test
  public void testGetFullNameAndBaseName() {
    Name root = new Name("a", null, false);
    Name child = root.addProperty("b", false);
    Name grandchild = child.addProperty("c", false);
    assertEquals("a", root.getFullName());
    assertEquals("a.b", child.getFullName());
    assertEquals("a.b.c", grandchild.getFullName());
    assertEquals("c", grandchild.getBaseName());
    assertEquals("a.b.c", grandchild.getName());
  }

  @Test
  public void testIsSimpleName() {
    Name root = new Name("a", null, false);
    Name child = root.addProperty("b", false);
    assertTrue(root.isSimpleName());
    assertFalse(child.isSimpleName());
  }

  @Test
  public void testIsGetOrSetDefinition() {
    Name n = new Name("a", null, false);
    n.type = Name.Type.GET;
    assertTrue(n.isGetOrSetDefinition());
    n.type = Name.Type.SET;
    assertTrue(n.isGetOrSetDefinition());
    n.type = Name.Type.OTHER;
    assertFalse(n.isGetOrSetDefinition());
  }

  @Test
  public void testRemoveDeclaration_reassignsToNextGlobalSet() {
    Name n = new Name("a", null, false);
    Ref set1 = new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0);
    Ref set2 = new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 1);

    n.addRef(set1);
    n.addRef(set2);
    assertSame(set1, n.getDeclaration());

    n.removeRef(set1);
    assertSame(set2, n.getDeclaration());
    assertEquals(1, n.globalSets);
  }

  @Test
  public void testRemoveDeclaration_keepsDeclarationWhenRemovingOther() {
    Name n = new Name("a", null, false);
    Ref set1 = new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0);
    Ref set2 = new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 1);

    n.addRef(set1);
    n.addRef(set2);
    n.removeRef(set2);
    assertSame(set1, n.getDeclaration());
    assertEquals(1, n.globalSets);
  }

  @Test
  public void testRemoveRef_onNeverAddedRefIsNoOp() {
    Name n = new Name("a", null, false);
    Ref notAdded = new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0);
    // refs ยังเป็น null เพราะไม่เคย addRef -> ต้องไม่ throw exception
    n.removeRef(notAdded);
    assertNull(n.getDeclaration());
    assertEquals(0, n.globalSets);
  }

  @Test
  public void testAddRef_allTypesUpdateCounters() {
    Name n = new Name("a", null, false);

    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    assertEquals(1, n.globalSets);

    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_LOCAL, 1));
    assertEquals(1, n.localSets);

    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.DIRECT_GET, 2));
    assertEquals(1, n.totalGets);

    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.PROTOTYPE_GET, 3));
    assertEquals(2, n.totalGets);

    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.ALIASING_GET, 4));
    assertEquals(3, n.totalGets);
    assertEquals(1, n.aliasingGets);

    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.CALL_GET, 5));
    assertEquals(4, n.totalGets);
    assertEquals(1, n.callGets);

    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.DELETE_PROP, 6));
    assertEquals(1, n.deleteProps);

    assertEquals(6, n.getRefs().size());
  }

  @Test
  public void testMarkTwins_valid() {
    Name n = new Name("a", null, false);
    Ref setRef = new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0);
    Ref getRef = new Ref(null, null, dummyNode(), n, Ref.Type.ALIASING_GET, 1);
    Ref.markTwins(setRef, getRef);
    assertSame(getRef, setRef.getTwin());
    assertSame(setRef, getRef.getTwin());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testMarkTwins_invalid_bothAliasingGet() {
    Name n = new Name("a", null, false);
    Ref get1 = new Ref(null, null, dummyNode(), n, Ref.Type.ALIASING_GET, 0);
    Ref get2 = new Ref(null, null, dummyNode(), n, Ref.Type.ALIASING_GET, 1);
    Ref.markTwins(get1, get2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testMarkTwins_invalid_bothSets() {
    Name n = new Name("a", null, false);
    Ref set1 = new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0);
    Ref set2 = new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_LOCAL, 1);
    Ref.markTwins(set1, set2);
  }

  @Test
  public void testCloneAndReclassify() {
    Name n = new Name("a", null, false);
    Ref original = new Ref(null, null, dummyNode(), n, Ref.Type.DIRECT_GET, 7);
    Ref clone = original.cloneAndReclassify(Ref.Type.ALIASING_GET);
    assertEquals(Ref.Type.ALIASING_GET, clone.type);
    assertEquals(7, clone.preOrderIndex);
    assertSame(original.node, clone.node);
    assertSame(original.name, clone.name);
  }

  @Test
  public void testCreateRefForTesting() {
    Ref ref = Ref.createRefForTesting(Ref.Type.DIRECT_GET);
    assertEquals(Ref.Type.DIRECT_GET, ref.type);
    assertEquals(-1, ref.preOrderIndex);
    assertNull(ref.name);
    assertNull(ref.module);
    assertNull(ref.scope);
  }

  @Test
  public void testIsSimpleStubDeclaration_trueWhenSingleExprResultRef() {
    Name n = new Name("a", null, false);
    Node nameNode = new Node(Token.NAME);
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(nameNode);
    n.addRef(new Ref(null, null, nameNode, n, Ref.Type.DIRECT_GET, 0));
    assertTrue(n.isSimpleStubDeclaration());
  }

  @Test
  public void testIsSimpleStubDeclaration_falseWhenNoParent() {
    Name n = new Name("a", null, false);
    Node nameNode = new Node(Token.NAME); // ไม่มี parent
    n.addRef(new Ref(null, null, nameNode, n, Ref.Type.DIRECT_GET, 0));
    assertFalse(n.isSimpleStubDeclaration());
  }

  @Test
  public void testIsSimpleStubDeclaration_falseWhenMultipleRefs() {
    Name n = new Name("a", null, false);
    Node nameNode1 = new Node(Token.NAME);
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(nameNode1);
    n.addRef(new Ref(null, null, nameNode1, n, Ref.Type.DIRECT_GET, 0));
    n.addRef(new Ref(null, null, new Node(Token.NAME), n, Ref.Type.DIRECT_GET, 1));
    assertFalse(n.isSimpleStubDeclaration());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_falseWhenTypeOther() {
    Name n = new Name("a", null, false);
    n.type = Name.Type.OTHER;
    assertFalse(n.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_falseWhenGetOrSet() {
    Name n = new Name("a", null, false);
    n.type = Name.Type.GET;
    assertFalse(n.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_falseWhenGlobalSetsNotOne() {
    Name n = new Name("a", null, false);
    n.type = Name.Type.OBJECTLIT;
    assertFalse(n.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_falseWhenLocalSetsPresent() {
    Name n = new Name("a", null, false);
    n.type = Name.Type.OBJECTLIT;
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_LOCAL, 1));
    assertFalse(n.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_falseWhenDeletePropPresent() {
    Name n = new Name("a", null, false);
    n.type = Name.Type.OBJECTLIT;
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.DELETE_PROP, 1));
    assertFalse(n.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_falseWhenDeclarationIsTwin() {
    Name n = new Name("a", null, false);
    Ref setRef = new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0);
    Ref aliasRef = new Ref(null, null, dummyNode(), n, Ref.Type.ALIASING_GET, 1);
    Ref.markTwins(setRef, aliasRef);
    n.addRef(setRef);
    n.addRef(aliasRef);
    n.type = Name.Type.OBJECTLIT;
    assertFalse(n.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_trueWhenDeclaredType() {
    Name n = new Name("a", null, false);
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    n.type = Name.Type.OBJECTLIT;
    n.setDeclaredType();
    assertTrue(n.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_falseWhenParentShouldKeepKeys() {
    Name parent = new Name("p", null, false);
    parent.type = Name.Type.OBJECTLIT;
    parent.addRef(new Ref(null, null, dummyNode(), parent, Ref.Type.ALIASING_GET, 0));

    Name child = parent.addProperty("c", false);
    child.addRef(new Ref(null, null, dummyNode(), child, Ref.Type.SET_FROM_GLOBAL, 1));
    child.type = Name.Type.OBJECTLIT;
    assertFalse(child.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_falseWhenAliasingGetsPositive() {
    Name n = new Name("a", null, false);
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.ALIASING_GET, 1));
    n.type = Name.Type.OBJECTLIT;
    assertFalse(n.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapseUnannotatedChildNames_trueWhenSimpleCase() {
    Name n = new Name("a", null, false);
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    n.type = Name.Type.OBJECTLIT;
    assertTrue(n.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testCanCollapse_falseWhenInExterns() {
    Name n = new Name("a", null, true);
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    assertFalse(n.canCollapse());
  }

  @Test
  public void testCanCollapse_falseWhenGetOrSetDefinition() {
    Name n = new Name("a", null, false);
    n.type = Name.Type.GET;
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    assertFalse(n.canCollapse());
  }

  @Test
  public void testCanCollapse_trueWhenDeclaredType() {
    Name n = new Name("a", null, false);
    n.setDeclaredType();
    assertTrue(n.canCollapse());
  }

  @Test
  public void testCanCollapse_falseWhenNoSetsAndNotDeclaredType() {
    Name n = new Name("a", null, false);
    assertFalse(n.canCollapse());
  }

  @Test
  public void testCanCollapse_trueWhenGlobalSetPresentAndRootName() {
    Name n = new Name("a", null, false);
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    assertTrue(n.canCollapse());
  }

  @Test
  public void testCanCollapse_falseWhenDeletePropPresent() {
    Name n = new Name("a", null, false);
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.DELETE_PROP, 1));
    assertFalse(n.canCollapse());
  }

  @Test
  public void testCanCollapse_falseWhenParentCannotCollapseUnannotatedChildNames() {
    Name parent = new Name("p", null, false); // ไม่มี set เลย -> globalSets=0
    Name child = parent.addProperty("c", false);
    child.addRef(new Ref(null, null, dummyNode(), child, Ref.Type.SET_FROM_GLOBAL, 0));
    assertFalse(child.canCollapse());
  }

  @Test
  public void testCanEliminate_falseWhenTotalGetsPositive() {
    Name n = new Name("a", null, false);
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.DIRECT_GET, 1));
    assertFalse(n.canEliminate());
  }

  @Test
  public void testCanEliminate_falseWhenCannotCollapseUnannotatedChildNames() {
    Name n = new Name("a", null, false); // globalSets = 0
    assertFalse(n.canEliminate());
  }

  @Test
  public void testCanEliminate_falseWhenChildCannotCollapse() {
    Name n = new Name("a", null, false);
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    n.addProperty("b", false); // child ไม่มี set -> canCollapse() = false
    assertFalse(n.canEliminate());
  }

  @Test
  public void testCanEliminate_trueWhenSimpleCase() {
    Name n = new Name("a", null, false);
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 0));
    assertTrue(n.canEliminate());
  }

  @Test
  public void testShouldKeepKeys() {
    Name n = new Name("a", null, false);
    n.type = Name.Type.OBJECTLIT;
    assertFalse(n.shouldKeepKeys());
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.ALIASING_GET, 0));
    assertTrue(n.shouldKeepKeys());
  }

  @Test
  public void testNeedsToBeStubbed() {
    Name n = new Name("a", null, false);
    assertFalse(n.needsToBeStubbed());
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_LOCAL, 0));
    assertTrue(n.needsToBeStubbed());
    n.addRef(new Ref(null, null, dummyNode(), n, Ref.Type.SET_FROM_GLOBAL, 1));
    assertFalse(n.needsToBeStubbed());
  }

  @Test
  public void testIsNamespace_viaSetDeclaredTypePropagation() {
    Name root = new Name("a", null, false);
    root.type = Name.Type.OBJECTLIT;
    Name child = root.addProperty("b", false);
    assertFalse(root.isNamespace());
    child.setDeclaredType();
    assertTrue(root.isNamespace());
    assertTrue(child.isDeclaredType());
  }

  // =======================================================================
  // ส่วนที่ 2: ทดสอบผ่านการ parse JS จริง (BuildGlobalNamespace + public API)
  // =======================================================================

  @Test
  public void testHasExternsRoot_falseWithTwoArgConstructor() {
    Node root = parseCode("var x = 1;");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    assertFalse(ns.hasExternsRoot());
  }

  @Test
  public void testHasExternsRoot_trueWithExternsProvided() {
    Node externs = parseCode("");
    Node root = parseCode("var x = 1;");
    GlobalNamespace ns = new GlobalNamespace(compiler, externs, root);
    assertTrue(ns.hasExternsRoot());
  }

  @Test
  public void testGetParentScope_alwaysNull() {
    Node root = parseCode("var x = 1;");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    assertNull(ns.getParentScope());
  }

  @Test
  public void testGetRootNode_matchesRootParent() {
    Node root = parseCode("var x = 1;");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    assertEquals(root.getParent(), ns.getRootNode());
  }

  @Test
  public void testProcess_emptySource() {
    Node root = parseCode("");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    assertTrue(ns.getNameIndex().isEmpty());
    assertTrue(ns.getNameForest().isEmpty());
  }

  @Test
  public void testProcess_simpleVarDeclaration() {
    Node root = parseCode("var x = 1;");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    Map<String, Name> index = ns.getNameIndex();
    assertTrue(index.containsKey("x"));
    Name x = index.get("x");
    assertEquals(Name.Type.OTHER, x.type);
    assertEquals(1, x.globalSets);
    assertEquals(0, x.localSets);
    assertEquals(0, x.totalGets);
  }

  @Test
  public void testProcess_objectLiteralNestedProperties() {
    Node root = parseCode("var a = {b: 1, c: {d: 2}};");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    Map<String, Name> index = ns.getNameIndex();

    assertTrue(index.containsKey("a"));
    assertTrue(index.containsKey("a.b"));
    assertTrue(index.containsKey("a.c"));
    assertTrue(index.containsKey("a.c.d"));

    assertEquals(Name.Type.OBJECTLIT, index.get("a").type);
    assertEquals(Name.Type.OTHER, index.get("a.b").type);
    assertEquals(Name.Type.OBJECTLIT, index.get("a.c").type);
    assertEquals(Name.Type.OTHER, index.get("a.c.d").type);
  }

  @Test
  public void testProcess_functionDeclaration() {
    Node root = parseCode("function foo() {}");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    Name foo = ns.getNameIndex().get("foo");
    assertNotNull(foo);
    assertEquals(Name.Type.FUNCTION, foo.type);
    assertEquals(1, foo.globalSets);
  }

  @Test
  public void testProcess_prototypeAssignmentOmittedFromNamespace() {
    Node root = parseCode("function Foo() {} Foo.prototype.bar = function() {};");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    Map<String, Name> index = ns.getNameIndex();

    // ตาม javadoc ของคลาส "Omits prototypes" ดังนั้น Foo.prototype* ไม่ควรถูกสร้าง
    assertFalse(index.containsKey("Foo.prototype"));
    assertFalse(index.containsKey("Foo.prototype.bar"));

    Name foo = index.get("Foo");
    assertNotNull(foo);
    assertEquals(1, foo.globalSets);
    assertEquals(1, foo.totalGets); // มาจาก PROTOTYPE_GET ที่สร้างแทน
  }

  @Test
  public void testProcess_nestedAssignmentCreatesAliasTwin() {
    Node root = parseCode("var b; var a = b = {};");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    Map<String, Name> index = ns.getNameIndex();

    Name b = index.get("b");
    assertNotNull(b);
    assertEquals(1, b.globalSets);
    assertEquals(1, b.aliasingGets);
    assertEquals(1, b.totalGets);
    assertNotNull(b.getDeclaration().getTwin());

    Name a = index.get("a");
    assertNotNull(a);
    assertEquals(1, a.globalSets);
    assertEquals(0, a.aliasingGets);
  }

  @Test
  public void testProcess_localParameterShadowsGlobal_notAddedToNamespace() {
    Node root = parseCode("function f(a) { a.b = 1; }");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    Map<String, Name> index = ns.getNameIndex();
    assertFalse(index.containsKey("a"));
    assertFalse(index.containsKey("a.b"));
    assertTrue(index.containsKey("f"));
  }

  @Test
  public void testProcess_localAssignmentToGlobalVarUsesSetFromLocal() {
    Node root = parseCode("var a; function f() { a = 1; }");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    Name a = ns.getNameIndex().get("a");
    assertNotNull(a);
    assertEquals(1, a.globalSets);
    assertEquals(1, a.localSets);
  }

  @Test
  public void testProcess_getPropChainOnlyOutermostRecorded() {
    Node root = parseCode("var a = {}; a.b.c;");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    Map<String, Name> index = ns.getNameIndex();

    assertTrue(index.containsKey("a.b"));
    assertTrue(index.containsKey("a.b.c"));
    // "a.b" ถูกสร้างเป็นแค่ prefix อัตโนมัติ ไม่มี ref ตรง ๆ
    assertTrue(index.get("a.b").getRefs().isEmpty());
    assertEquals(1, index.get("a.b.c").totalGets);
  }

  @Test
  public void testGetSlotAndGetOwnSlot() {
    Node root = parseCode("var x = 1;");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    assertNotNull(ns.getSlot("x"));
    assertNotNull(ns.getOwnSlot("x"));
    assertNull(ns.getSlot("doesNotExist"));
    assertNull(ns.getOwnSlot("doesNotExist"));
  }

  @Test
  public void testGetSlot_nullNameReturnsNull() {
    Node root = parseCode("var x = 1;");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    assertNull(ns.getSlot(null));
  }

  @Test
  public void testGetReferences_unmodifiableAndMatchesRefs() {
    Node root = parseCode("var x = 1; x;");
    GlobalNamespace ns = new GlobalNamespace(compiler, root);
    Name x = ns.getSlot("x");
    Iterable<Ref> refsIterable = ns.getReferences(x);

    List<Ref> refs = new ArrayList<Ref>();
    for (Ref r : refsIterable) {
      refs.add(r);
    }
    assertEquals(x.getRefs().size(), refs.size());

    try {
      ((List<Ref>) refsIterable).add(Ref.createRefForTesting(Ref.Type.DIRECT_GET));
      fail("ควรได้ UnsupportedOperationException");
    } catch (UnsupportedOperationException expected) {
      // ตามที่คาดไว้: getReferences คืนค่าด้วย Collections.unmodifiableList
    }
  }

  @Test
  public void testGetAllSymbols_unmodifiableAndContainsExpected() {
    Node root = parse