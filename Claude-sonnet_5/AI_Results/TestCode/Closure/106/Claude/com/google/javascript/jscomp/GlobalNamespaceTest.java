package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GlobalNamespaceTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
  }

  /**
   * NOTE: ใช้ Compiler#parseTestCode เป็น helper สร้าง AST สำหรับการทดสอบ
   * ถ้า API จริงของ build นี้ไม่มีเมธอดนี้ ให้เปลี่ยนเป็น
   * compiler.parse(SourceFile.fromCode("test.js", js)) แทน
   */
  private Node parseTestCode(String js) {
    return compiler.parseTestCode(js);
  }

  private GlobalNamespace createNamespace(String js) {
    Node root = parseTestCode(js);
    assertNotNull("parse failed: " + js, root);
    return new GlobalNamespace(compiler, root);
  }

  private Ref soleRef(Name n) {
    assertNotNull("name not found in index", n);
    assertNotNull("expected refs list to be non-null", n.refs);
    assertEquals("expected exactly one ref", 1, n.refs.size());
    return n.refs.get(0);
  }

  private Ref findGetRef(Name n) {
    assertNotNull(n);
    assertNotNull(n.refs);
    for (Ref r : n.refs) {
      if (!r.isSet()) {
        return r;
      }
    }
    fail("no get-ref found for " + n.fullName());
    return null;
  }

  // ---------------------------------------------------------------------
  // Boundary / empty cases
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyScript_NoNames() {
    GlobalNamespace ns = createNamespace("");
    assertTrue(ns.getNameForest().isEmpty());
    assertTrue(ns.getNameIndex().isEmpty());
  }

  @Test
  public void testGetNameForestAndIndexConsistency() {
    GlobalNamespace ns = createNamespace("var a = 1;");
    List<Name> forest = ns.getNameForest();
    Map<String, Name> index = ns.getNameIndex();
    assertEquals(1, forest.size());
    assertSame(index.get("a"), forest.get(0));
  }

  @Test
  public void testForestContainsOnlyTopLevelNames() {
    GlobalNamespace ns = createNamespace("var a = {}; a.b = 1;");
    List<Name> forest = ns.getNameForest();
    assertEquals(1, forest.size());
    assertEquals("a", forest.get(0).fullName());
    assertNotNull(ns.getNameIndex().get("a.b"));
  }

  // ---------------------------------------------------------------------
  // Token.NAME / VAR - value type resolution
  // ---------------------------------------------------------------------

  @Test
  public void testSimpleVarDeclaration_TypeOther() {
    Name a = createNamespace("var a = 1;").getNameIndex().get("a");
    assertNotNull(a);
    assertEquals(Name.Type.OTHER, a.type);
    assertEquals(1, a.globalSets);
    assertTrue(a.isSimpleName());
    assertEquals("a", a.fullName());
  }

  @Test
  public void testVarDeclarationNoInitializer_TypeOther() {
    Name a = createNamespace("var a;").getNameIndex().get("a");
    assertNotNull(a);
    assertEquals(Name.Type.OTHER, a.type);
    assertEquals(1, a.globalSets);
  }

  @Test
  public void testVarObjectLiteral_TypeObjectLit() {
    Name a = createNamespace("var a = {};").getNameIndex().get("a");
    assertEquals(Name.Type.OBJECTLIT, a.type);
  }

  @Test
  public void testVarFunctionExpression_TypeFunction() {
    Name a = createNamespace("var a = function() {};").getNameIndex().get("a");
    assertEquals(Name.Type.FUNCTION, a.type);
  }

  @Test
  public void testFunctionDeclaration_TypeFunction() {
    Name f = createNamespace("function f() {}").getNameIndex().get("f");
    assertNotNull(f);
    assertEquals(Name.Type.FUNCTION, f.type);
    assertEquals(1, f.globalSets);
  }

  @Test
  public void testBareAssignmentWithoutDeclaration_NotRegistered() {
    // ไม่มี var/function ประกาศ 'a' -> scope.getVar("a") == null และไม่มี externsScope
    // => isGlobalVarReference คืน false -> ไม่ถูกบันทึกใน namespace (จาก source ตรงๆ)
    GlobalNamespace ns = createNamespace("a = 1;");
    assertNull(ns.getNameIndex().get("a"));
  }

  // ---------------------------------------------------------------------
  // Token.GETPROP - property assignment / intermediate name creation
  // ---------------------------------------------------------------------

  @Test
  public void testPropertyAssignmentCreatesIntermediateNames() {
    Map<String, Name> index =
        createNamespace("var a = {}; a.b.c = 1;").getNameIndex();
    Name c = index.get("a.b.c");
    Name b = index.get("a.b");
    assertNotNull(c);
    assertEquals(1, c.globalSets);
    assertEquals(Name.Type.OTHER, c.type);
    assertNotNull(b);
    assertEquals(0, b.globalSets); // สร้างเป็น intermediate เท่านั้น ไม่มี ref ตรง
    assertSame(b, c.parent);
  }

  // ---------------------------------------------------------------------
  // Token.STRING - object literal key naming (getNameForObjLitKey)
  // ---------------------------------------------------------------------

  @Test
  public void testObjectLiteralKey_Simple() {
    Map<String, Name> index = createNamespace("var w = {x: 1};").getNameIndex();
    Name wx = index.get("w.x");
    Name w = index.get("w");
    assertNotNull(wx);
    assertEquals(1, wx.globalSets);
    assertEquals(Name.Type.OTHER, wx.type);
    assertEquals(Name.Type.OBJECTLIT, w.type);
  }

  @Test
  public void testObjectLiteralKey_Nested() {
    Map<String, Name> index =
        createNamespace("var w = {x: {y: 1}};").getNameIndex();
    Name wx = index.get("w.x");
    Name wxy = index.get("w.x.y");
    assertNotNull(wx);
    assertNotNull(wxy);
    assertEquals(1, wx.globalSets); // key ของตัวเองก็ถูกบันทึกด้วย (ไม่ใช่แค่ intermediate)
    assertEquals(Name.Type.OBJECTLIT, wx.type);
    assertEquals(Name.Type.OTHER, wxy.type);
  }

  @Test
  public void testObjectLiteralKey_InvalidIdentifierIgnored() {
    Map<String, Name> index =
        createNamespace("var w = {'x-y': 1};").getNameIndex();
    assertNull(index.get("w.x-y"));
    assertNotNull(index.get("w"));
  }

  @Test
  public void testObjectLiteralStringValueNotTreatedAsKey() {
    Map<String, Name> index =
        createNamespace("var w = {x: 'hello'};").getNameIndex();
    assertNotNull(index.get("w.x"));
    assertNull(index.get("w.hello"));
  }

  @Test
  public void testObjectLiteralKey_AssignGrampsBranch() {
    Map<String, Name> index =
        createNamespace("var a = {}; a.b = {c: 1};").getNameIndex();
    Name ab = index.get("a.b");
    Name abc = index.get("a.b.c");
    assertNotNull(ab);
    assertNotNull(abc);
    assertEquals(1, ab.globalSets);
    assertEquals(Name.Type.OBJECTLIT, ab.type);
    assertEquals(1, abc.globalSets);
  }

  // ---------------------------------------------------------------------
  // isConstructorOrEnumDeclaration / setIsClassOrEnum
  // ---------------------------------------------------------------------

  @Test
  public void testConstructorAnnotationOnAssign_SetsClassOrEnum() {
    Map<String, Name> index = createNamespace(
        "var ns = {}; /** @constructor */ ns.Foo = function() {};")
        .getNameIndex();
    Name ns = index.get("ns");
    Name foo = index.get("ns.Foo");
    assertEquals(Name.Type.FUNCTION, foo.type);
    assertTrue(ns.isNamespace()); // hasClassOrEnumDescendant ถูก propagate ขึ้นมา
  }

  @Test
  public void testConstructorAnnotationWrongValueType_NotClassOrEnum() {
    Map<String, Name> index = createNamespace(
        "var ns = {}; /** @constructor */ ns.Foo = 5;")
        .getNameIndex();
    Name ns = index.get("ns");
    assertFalse(ns.isNamespace());
  }

  @Test
  public void testEnumAnnotation_BypassesAliasingGetsCheck() {
    Map<String, Name> index = createNamespace(
        "/** @enum {number} */ var Foo = {A:1, B:2}; f(Foo);")
        .getNameIndex();
    Name foo = index.get("Foo");
    assertEquals(1, foo.aliasingGets);
    // isClassOrEnum == true -> canCollapseUnannotatedChildNames คืน true
    // แม้ aliasingGets > 0 (ต่างจากกรณีไม่มี annotation)
    assertTrue(foo.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testNoAnnotation_AliasingGetPreventsCollapse() {
    Map<String, Name> index =
        createNamespace("var Foo = {A:1}; f(Foo);").getNameIndex();
    Name foo = index.get("Foo");
    assertEquals(1, foo.aliasingGets);
    assertFalse(foo.canCollapseUnannotatedChildNames());
  }

  @Test
  public void testConstructorAnnotationOnVar_JSDocFallbackToParent() {
    Map<String, Name> index = createNamespace(
        "/** @constructor */ var Foo = function(){}; f(Foo);")
        .getNameIndex();
    Name foo = index.get("Foo");
    assertEquals(1, foo.aliasingGets);
    assertTrue(foo.canCollapseUnannotatedChildNames());
  }

  // ---------------------------------------------------------------------
  // Nested assignment / aliasing get + twin
  // ---------------------------------------------------------------------

  @Test
  public void testNestedAssignment_CreatesAliasingGetAndTwins() {
    Name a = createNamespace("var a = {}; var b = a = {};").getNameIndex().get("a");
    assertEquals(2, a.globalSets);
    assertEquals(1, a.aliasingGets);
    assertEquals(1, a.totalGets);

    boolean foundTwin = false;
    for (Ref r : a.refs) {
      if (r.type == Ref.Type.ALIASING_GET) {
        assertNotNull(r.getTwin());
        assertEquals(Ref.Type.SET_FROM_GLOBAL, r.getTwin().type);
        foundTwin = true;
      }
    }
    assertTrue(foundTwin);
  }

  @Test
  public void testNonNestedAssignment_NoAliasingGet() {
    Name a = createNamespace("var a = {}; a = {};").getNameIndex().get("a");
    assertEquals(2, a.globalSets);
    assertEquals(0, a.aliasingGets);
    assertEquals(0, a.totalGets);
  }

  // ---------------------------------------------------------------------
  // Local scope handling
  // ---------------------------------------------------------------------

  @Test
  public void testLocalSetInsideFunction_HandledAsLocal() {
    Name a = createNamespace("var a = {}; function f() { a = {}; }")
        .getNameIndex().get("a");
    assertEquals(1, a.globalSets);
    assertEquals(1, a.localSets);
  }

  @Test
  public void testLocalShadowVariable_NotGlobalReference() {
    Name a = createNamespace(
        "var a = {}; function f() { var a = 1; a = 2; }")
        .getNameIndex().get("a");
    assertEquals(1, a.globalSets);
    assertEquals(0, a.localSets); // ตัวแปร local ชื่อซ้ำถูกกรองออก (v.isLocal())
  }

  // ---------------------------------------------------------------------
  // handleGet: CALL / NEW ref-type branches
  // ---------------------------------------------------------------------

  @Test
  public void testCallGet_FirstArgOfCall() {
    Name a = createNamespace("var a = {}; a();").getNameIndex().get("a");
    Ref ref = soleRef(a);
    assertEquals(Ref.Type.CALL_GET, ref.type);
    assertEquals(1, a.callGets);
  }

  @Test
  public void testAliasingGet_ArgumentOfCall() {
    Name a = createNamespace("var a = {}; f(a);").getNameIndex().get("a");
    Ref ref = soleRef(a);
    assertEquals(Ref.Type.ALIASING_GET, ref.type);
    assertEquals(1, a.aliasingGets);
  }

  @Test
  public void testDirectGet_NewFirstChild() {
    Name a = createNamespace("var a = function(){}; new a();")
        .getNameIndex().get("a");
    Ref ref = soleRef(a);
    assertEquals(Ref.Type.DIRECT_GET, ref.type);
  }

  @Test
  public void testAliasingGet_NewNonFirstChildArgument() {
    Name a = createNamespace(
        "var a = {}; var ctor = function(){}; new ctor(a);")
        .getNameIndex().get("a");
    Ref ref = soleRef(a);
    assertEquals(Ref.Type.ALIASING_GET, ref.type);
  }

  // ---------------------------------------------------------------------
  // handleGet: OR / AND / HOOK branches (determineGetTypeForHookOrBooleanExpr)
  // ---------------------------------------------------------------------

  @Test
  public void testOrExpression_AliasWhenAssignedToDifferentName() {
    Name a = createNamespace("var a = {}; var b = a || {};")
        .getNameIndex().get("a");
    Ref ref = soleRef(a);
    assertEquals(Ref.Type.ALIASING_GET, ref.type);
  }

  @Test
  public void testOrExpression_DirectWhenReassignedToSameName() {
    Name a = createNamespace("var a = {}; a = a || {};").getNameIndex().get("a");
    Ref getRef = findGetRef(a);
    assertEquals(Ref.Type.DIRECT_GET, getRef.type);
    assertEquals(0, a.aliasingGets);
  }

  @Test
  public void testAndExpression_AliasWhenAssignedToDifferentName() {
    Name a = createNamespace("var a = {}; var b = a && {};")
        .getNameIndex().get("a");
    Ref ref = soleRef(a);
    assertEquals(Ref.Type.ALIASING_GET, ref.type);
  }

  @Test
  public void testHookCondition_DirectGet() {
    Name a = createNamespace("var a = {}; var b = a ? 1 : 2;")
        .getNameIndex().get("a");
    Ref ref = soleRef(a);
    assertEquals(Ref.Type.DIRECT_GET, ref.type);
    assertEquals(0, a.aliasingGets);
  }

  @Test
  public void testHookBranch_AliasWhenAssignedToDifferentName() {
    Name a = createNamespace("var a = {}; var b = cond ? a : {};")
        .getNameIndex().get("a");
    Ref ref = soleRef(a);
    assertEquals(Ref.Type.ALIASING_GET, ref.type);
  }

  // ---------------------------------------------------------------------
  // maybeHandlePrototypePrefix
  // ---------------------------------------------------------------------

  @Test
  public void testPrototypeExactSuffix_NotRegisteredAsOwnName() {
    Map<String, Name> index =
        createNamespace("function Foo() {} Foo.prototype = {};").getNameIndex();
    assertNull(index.get("Foo.prototype"));
    Name foo = index.get("Foo");
    Ref ref = soleRef(foo);
    assertEquals(Ref.Type.PROTOTYPE_GET, ref.type);
  }

  @Test
  public void testPrototypeDotSuffix_NotRegisteredAsOwnName() {
    Map<String, Name> index = createNamespace(
        "function Foo() {} Foo.prototype.bar = function(){};").getNameIndex();
    assertNull(index.get("Foo.prototype.bar"));
    Name foo = index.get("Foo");
    Ref ref = soleRef(foo);
    assertEquals(Ref.Type.PROTOTYPE_GET, ref.type);
  }

  @Test
  public void testPrototypeObjectLiteralKey_NoExtraRefAdded() {
    Map<String, Name> index = createNamespace(
        "function Foo() {} Foo.prototype = {bar: function(){}};").getNameIndex();
    assertNull(index.get("Foo.prototype.bar"));
    Name foo = index.get("Foo");
    // ต้องมี ref เดียวเท่านั้น (จาก Foo.prototype = {...}) ไม่ใช่ 2 (isObjectLitKey -> return true ทันที)
    Ref ref = soleRef(foo);
    assertEquals(Ref.Type.PROTOTYPE_GET, ref.type);
  }

  // ---------------------------------------------------------------------
  // externsRoot / externsScope handling (constructor แบบ 3-arg)
  // ---------------------------------------------------------------------

  @Test
  public void testExternsScope_PropertyAssignmentOnExternName() {
    Node externs = parseTestCode("var extern1;");
    Node root = parseTestCode("extern1.foo = 1;");
    GlobalNamespace ns = new GlobalNamespace(compiler, externs, root);

    Map<String, Name> index = ns.getNameIndex();
    Name extern1 = index.get("extern1");
    Name foo = index.get("extern1.foo");

    assertNotNull(extern1);
    assertTrue(extern1.inExterns);
    assertEquals(1, extern1.globalSets);

    assertNotNull(foo);
    assertFalse(foo.inExterns);
    assertEquals(1, foo.globalSets);
  }
}
