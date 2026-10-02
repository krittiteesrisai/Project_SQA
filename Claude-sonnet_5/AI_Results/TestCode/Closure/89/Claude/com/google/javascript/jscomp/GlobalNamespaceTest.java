package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GlobalNamespaceTest {

  // ---------------------------------------------------------------------
  // Helper: parse js (ไม่มี externs) แล้วสร้าง GlobalNamespace จาก root จริง
  // ---------------------------------------------------------------------
  private GlobalNamespace parse(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Lists.newArrayList();
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));
    compiler.init(externs, inputs, options);
    compiler.parse();
    assertEquals("unexpected parse error(s) for: " + js,
        0, compiler.getErrorCount());
    Node root = compiler.getRoot();
    return new GlobalNamespace(compiler, root);
  }

  // ---------------------------------------------------------------------
  // Helper: parse พร้อม externs แยกต่างหาก เพื่อทดสอบ externsScope
  // ---------------------------------------------------------------------
  private GlobalNamespace parseWithExterns(String externsJs, String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", externsJs));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));
    compiler.init(externs, inputs, options);
    compiler.parse();
    assertEquals(0, compiler.getErrorCount());
    Node overallRoot = compiler.getRoot();
    // สมมติโครงสร้าง: overallRoot -> [externsRoot, jsRoot]
    Node externsRoot = overallRoot.getFirstChild();
    Node jsRoot = overallRoot.getLastChild();
    return new GlobalNamespace(compiler, externsRoot, jsRoot);
  }

  // =====================================================================
  // 1. Boundary: var declaration ไม่มี initializer -> type OTHER
  // =====================================================================
  @Test
  public void testVarDeclarationNoInitializer_TypeOtherGlobalSetsOne() {
    GlobalNamespace ns = parse("var a;");
    Map<String, Name> index = ns.getNameIndex();
    Name a = index.get("a");
    assertNotNull(a);
    assertEquals(Name.Type.OTHER, a.type);
    assertEquals(1, a.globalSets);
    assertEquals(0, a.localSets);
    assertTrue(a.isSimpleName());
    assertTrue(a.canCollapse());
  }

  // =====================================================================
  // 2. var = object literal -> namespace, property สร้าง nested name
  // =====================================================================
  @Test
  public void testVarWithObjectLiteral_PropertyCreatesNestedName() {
    GlobalNamespace ns = parse("var ns = {}; ns.foo = 1;");
    Map<String, Name> index = ns.getNameIndex();
    Name ns_ = index.get("ns");
    Name foo = index.get("ns.foo");
    assertNotNull(ns_);
    assertNotNull(foo);
    assertEquals(Name.Type.OBJECTLIT, ns_.type);
    assertEquals(Name.Type.OTHER, foo.type);
    assertEquals("ns.foo", foo.fullName());
    assertFalse(foo.isSimpleName());
  }

  // =====================================================================
  // 3. function assignment -> type FUNCTION
  // =====================================================================
  @Test
  public void testFunctionAssignment_TypeFunction() {
    GlobalNamespace ns = parse("var f = function() {};");
    Name f = ns.getNameIndex().get("f");
    assertNotNull(f);
    assertEquals(Name.Type.FUNCTION, f.type);
  }

  // =====================================================================
  // 4. Named function DECLARATION (ไม่ใช่ expression) -> ถูกนับเป็น SET
  //    และ docInfo มาจาก case Token.FUNCTION ใน getDocInfoForDeclaration
  // =====================================================================
  @Test
  public void testNamedFunctionDeclaration_TypeFunctionAndDocInfo() {
    GlobalNamespace ns = parse(
        "/** @return {number} */ function foo() { return 1; }");
    Name foo = ns.getNameIndex().get("foo");
    assertNotNull(foo);
    assertEquals(Name.Type.FUNCTION, foo.type);
    // อาจไม่มั่นใจ 100% ว่า parser แนบ JSDoc ไว้ที่ FUNCTION node เสมอ
    // แต่เป็นพฤติกรรมมาตรฐานของ Closure Compiler parser
    assertNotNull(foo.docInfo);
  }

  // =====================================================================
  // 5. Named FUNCTION EXPRESSION -> ชื่อภายในไม่ถูกเพิ่มเข้า namespace
  //    (gramps==null || NodeUtil.isFunctionExpression(parent) -> return)
  // =====================================================================
  @Test
  public void testNamedFunctionExpression_InnerNameNotAdded() {
    GlobalNamespace ns = parse("var f = function foo() {};");
    assertNotNull(ns.getNameIndex().get("f"));
    assertNull(ns.getNameIndex().get("foo"));
  }

  // =====================================================================
  // 6. Nested object literal keys -> recursive case Token.STRING
  //    ใน getNameForObjLitKey (a.b.c)
  // =====================================================================
  @Test
  public void testNestedObjectLiteralKeys_RecursiveStringCase() {
    GlobalNamespace ns = parse("var a = {b: {c: 1}};");
    Map<String, Name> index = ns.getNameIndex();
    assertNotNull(index.get("a"));
    assertNotNull(index.get("a.b"));
    assertNotNull(index.get("a.b.c"));
    assertEquals(Name.Type.OBJECTLIT, index.get("a").type);
    assertEquals(Name.Type.OBJECTLIT, index.get("a.b").type);
    assertEquals(Name.Type.OTHER, index.get("a.b.c").type);
    assertEquals("a.b.c", index.get("a.b.c").fullName());
  }

  // =====================================================================
  // 7. Object literal key ที่ไม่ใช่ JS identifier ที่ถูกต้อง -> ไม่ถูกเพิ่ม
  // =====================================================================
  @Test
  public void testInvalidIdentifierObjectLiteralKey_NotAdded() {
    GlobalNamespace ns = parse("var w = {'x-y': 1};");
    Map<String, Name> index = ns.getNameIndex();
    assertNotNull(index.get("w"));
    assertEquals(1, index.size()); // ไม่มีการเพิ่ม "w.x-y"
  }

  // =====================================================================
  // 8. Object literal key ที่ lvalue ไม่เป็น qualified name -> return null
  //    (foo().bar = {baz: 1};)
  // =====================================================================
  @Test
  public void testObjectLiteralKeyWithNonQualifiedLValue_NotAdded() {
    GlobalNamespace ns = parse("foo().bar = {baz: 1};");
    assertTrue(ns.getNameIndex().isEmpty());
  }

  // =====================================================================
  // 9. Object literal ระดับบนสุดที่ไม่ถูก assign ให้ชื่อใด -> default: null
  //    (({b: 1});)
  // =====================================================================
  @Test
  public void testTopLevelObjectLiteralExpression_NotAdded() {
    GlobalNamespace ns = parse("({b: 1});");
    assertTrue(ns.getNameIndex().isEmpty());
  }

  // =====================================================================
  // 10. Assign property เป็น object literal ใหม่ -> case Token.ASSIGN
  //     ของ getNameForObjLitKey
  // =====================================================================
  @Test
  public void testAssignToExistingPropertyCreatesNestedName() {
    GlobalNamespace ns = parse("var a = {}; a.b = {c: 1};");
    Map<String, Name> index = ns.getNameIndex();
    assertNotNull(index.get("a.b"));
    assertNotNull(index.get("a.b.c"));
    assertEquals(Name.Type.OBJECTLIT, index.get("a.b").type);
  }

  // =====================================================================
  // 11. getValueType: OR -> propagate จาก last child
  // =====================================================================
  @Test
  public void testOrValueTypePropagation_ObjectLiteral() {
    GlobalNamespace ns = parse("var a = window.b || {};");
    Name a = ns.getNameIndex().get("a");
    assertEquals(Name.Type.OBJECTLIT, a.type);
  }

  // =====================================================================
  // 12. getValueType: HOOK -> ทั้ง 2 สาขา (second != OTHER, second == OTHER)
  // =====================================================================
  @Test
  public void testHookValueType_BothBranches() {
    GlobalNamespace ns1 = parse("var a = cond ? {} : 5;");
    assertEquals(Name.Type.OBJECTLIT, ns1.getNameIndex().get("a").type);

    GlobalNamespace ns2 = parse("var a = cond ? 5 : {};");
    assertEquals(Name.Type.OBJECTLIT, ns2.getNameIndex().get("a").type);
  }

  // =====================================================================
  // 13. maybeHandlePrototypePrefix: prototype method ไม่ถูกเพิ่มเป็นชื่อ
  //     ของตัวเอง แต่สร้าง PROTOTYPE_GET บนชื่อฐาน
  // =====================================================================
  @Test
  public void testPrototypeAssignment_OmittedButAddsPrototypeGetOnBase() {
    GlobalNamespace ns = parse(
        "var Foo = function(){}; Foo.prototype.bar = function(){};");
    Map<String, Name> index = ns.getNameIndex();
    assertNull(index.get("Foo.prototype"));
    assertNull(index.get("Foo.prototype.bar"));
    Name foo = index.get("Foo");
    assertNotNull(foo);
    assertEquals(1, foo.globalSets);
    assertEquals(1, foo.totalGets);
    assertEquals(1, foo.refs.size());
    assertEquals(Ref.Type.PROTOTYPE_GET, foo.refs.get(0).type);
  }

  // =====================================================================
  // 14. @constructor -> setIsClassOrEnum() + ancestor.hasClassOrEnumDescendant
  // =====================================================================
  @Test
  public void testConstructorAnnotation_SetsClassOrEnum_MarksAncestorNamespace() {
    GlobalNamespace ns = parse(
        "var a = {}; /** @constructor */ a.Foo = function(){};");
    Name aFoo = ns.getNameIndex().get("a.Foo");
    Name a = ns.getNameIndex().get("a");
    assertNotNull(aFoo);
    assertTrue(aFoo.canCollapse());   // isClassOrEnum -> canCollapse() true
    assertTrue(a.isNamespace());      // hasClassOrEnumDescendant && OBJECTLIT
    assertNotNull(aFoo.docInfo);      // JSDoc ควรแนบที่ ASSIGN node
  }

  // =====================================================================
  // 15. @enum -> setIsClassOrEnum() ผ่านทาง VAR case
  // =====================================================================
  @Test
  public void testEnumAnnotation_SetsClassOrEnum() {
    GlobalNamespace ns = parse(
        "/** @enum {number} */ var Colors = {RED: 1, BLUE: 2};");
    Name colors = ns.getNameIndex().get("Colors");
    assertNotNull(colors);
    assertTrue(colors.canCollapse());
    assertNotNull(colors.docInfo);
  }

  // =====================================================================
  // 16. ตัวแปร local ที่บัง global (shadowing) -> ไม่ถูกนับเป็น global ref
  //     (v.isLocal() == true -> isGlobalVarReference() คืน false)
  // =====================================================================
  @Test
  public void testLocalShadowingVariable_NotTreatedAsGlobal() {
    GlobalNamespace ns = parse(
        "var a = 1; function f() { var a = 2; a.b = 3; }");
    Map<String, Name> index = ns.getNameIndex();
    assertNotNull(index.get("a"));
    assertNull(index.get("a.b"));
    assertEquals(1, index.get("a").globalSets);
    assertEquals(0, index.get("a").localSets);
  }

  // =====================================================================
  // 17. ตัวแปรที่ไม่ถูกประกาศเลย (v == null, externsScope == null)
  //     -> ถูกข้ามไปทั้งหมด
  // =====================================================================
  @Test
  public void testUndeclaredGlobalReference_Ignored() {
    GlobalNamespace ns = parse("undeclared.prop = 1;");
    assertTrue(ns.getNameIndex().isEmpty());
  }

  // =====================================================================
  // 18. externsScope fallback: ตัวแปรประกาศเฉพาะใน externs แต่ referenced
  //     ใน main root -> v==null in mainScope, fallback ไป externsScope
  // =====================================================================
  @Test
  public void testExternsScope_UsedForVariableDeclaredOnlyInExterns() {
    GlobalNamespace ns = parseWithExterns("var extVar;", "extVar.foo = 1;");
    Map<String, Name> index = ns.getNameIndex();
    Name extVar = index.get("extVar");
    Name extVarFoo = index.get("extVar.foo");
    assertNotNull(extVar);
    assertTrue(extVar.inExterns);
    assertNotNull(extVarFoo);
    assertFalse(extVarFoo.inExterns);
    assertEquals(1, extVarFoo.globalSets);
  }

  // =====================================================================
  // 19. handleSetFromLocal: property set ภายใน local scope -> needsToBeStubbed()
  // =====================================================================
  @Test
  public void testLocalSetOfGlobalProperty_NeedsStubbing() {
    GlobalNamespace ns = parse("var a = {}; function f() { a.b = 1; }");
    Name ab = ns.getNameIndex().get("a.b");
    assertNotNull(ab);
    assertEquals(0, ab.globalSets);
    assertEquals(1, ab.localSets);
    assertTrue(ab.needsToBeStubbed());
  }

  // =====================================================================
  // 20. isNestedAssign == true -> สร้าง twin SET + ALIASING_GET
  //     (var c = a = {};  -> ASSIGN ไม่ได้อยู่ใต้ EXPR_RESULT โดยตรง)
  // =====================================================================
  @Test
  public void testNestedAssignmentCreatesAliasingGetTwin() {
    GlobalNamespace ns = parse("var a = {}; var c = a = {};");
    Name a = ns.getNameIndex().get("a");
    assertEquals(2, a.globalSets);
    assertEquals(1, a.aliasingGets);
    assertEquals(1, a.totalGets);
    assertNotNull(a.refs);
    assertEquals(2, a.refs.size());
    Ref set2 = a.refs.get(0);
    Ref get = a.refs.get(1);
    assertEquals(Ref.Type.SET_FROM_GLOBAL, set2.type);
    assertEquals(Ref.Type.ALIASING_GET, get.type);
    assertSame(get, set2.getTwin());
    assertSame(set2, get.getTwin());
  }

  // =====================================================================
  // 21. CALL_GET vs ALIASING_GET ตามตำแหน่งใน CALL
  // =====================================================================
  @Test
  public void testCallGetVsAliasingGetInCallArguments() {
    GlobalNamespace ns1 = parse("var a = {b: function(){}}; a.b();");
    Name ab1 = ns1.getNameIndex().get("a.b");
    assertEquals(1, ab1.callGets);

    GlobalNamespace ns2 = parse("var a = {}; foo(a);");
    Name a2 = ns2.getNameIndex().get("a");
    assertEquals(1, a2.aliasingGets);
  }

  // =====================================================================
  // 22. DIRECT_GET vs ALIASING_GET ตามตำแหน่งใน NEW
  // =====================================================================
  @Test
  public void testNewGetDirectVsAliasing() {
    GlobalNamespace ns1 = parse("var a = {Foo: function(){}}; new a.Foo();");
    Name aFoo1 = ns1.getNameIndex().get("a.Foo");
    // n == parent.getFirstChild() ใน NEW -> DIRECT_GET
    assertEquals(1, aFoo1.totalGets);
    assertEquals(0, aFoo1.aliasingGets);

    GlobalNamespace ns2 = parse("var a = {}; new Foo(a);");
    Name a2 = ns2.getNameIndex().get("a");
    assertEquals(1, a2.aliasingGets);
  }

  // =====================================================================
  // 23. handleGet: IF / TYPEOF / NOT -> DIRECT_GET (fallthrough, break)
  // =====================================================================
  @Test
  public void testHandleGet_DirectContexts() {
    GlobalNamespace ns = parse(
        "var a = {}; typeof a; if (a) {} !a;");
    Name a = ns.getNameIndex().get("a");
    assertNotNull(a.refs);
    assertEquals(3, a.refs.size());
    for (Ref r : a.refs) {
      assertEquals(Ref.Type.DIRECT_GET, r.type);
    }
  }

  // =====================================================================
  // 24. determineGetTypeForHookOrBooleanExpr: OR -> ALIASING เมื่อชื่อไม่ตรงกัน
  //     และ ALIASING เมื่อเป็น argument ของ CALL
  // =====================================================================
  @Test
  public void testDetermineGetTypeForOr_AliasingBranches() {
    GlobalNamespace ns1 = parse("var a = {}; var b = a || 5;");
    Name a1 = ns1.getNameIndex().get("a");
    assertEquals(1, a1.refs.size());
    assertEquals(Ref.Type.ALIASING_GET, a1.refs.get(0).type);

    GlobalNamespace ns2 = parse("var a = {}; foo(a || {});");
    Name a2 = ns2.getNameIndex().get("a");
    assertEquals(Ref.Type.ALIASING_GET, a2.refs.get(0).type);
  }

  // =====================================================================
  // 25. determineGetTypeForHookOrBooleanExpr: OR -> DIRECT_GET เมื่อ assign
  //     กลับชื่อเดิม (ASSIGN case: ชื่อตรงกัน -> continue -> EXPR_RESULT)
  // =====================================================================
  @Test
  public void testDetermineGetTypeForOr_DirectWhenAssignedBackToSameName() {
    GlobalNamespace ns = parse("var a = {}; a = a || {};");
    Name a = ns.getNameIndex().get("a");
    assertEquals(2, a.globalSets);
    boolean foundDirect = false;
    for (Ref r : a.refs) {
      if (r.type == Ref.Type.DIRECT_GET) {
        foundDirect = true;
      }
    }
    assertTrue(foundDirect);
  }

  // =====================================================================
  // 26. HOOK ancestor ภายใน determineGetTypeForHookOrBooleanExpr:
  //     true-branch (anc.getFirstChild()==prev) -> DIRECT_GET
  //     false-branch (ไม่ตรง) -> break แล้วไปเจอ NAME mismatch -> ALIASING_GET
  // =====================================================================
  @Test
  public void testDetermineGetTypeForHook_TrueAndFalseBranch() {
    // OR เป็น "condition" ของ HOOK -> true branch -> DIRECT_GET
    GlobalNamespace ns1 = parse("var a = {}; var b = (a || {}) ? 1 : 2;");
    Name a1 = ns1.getNameIndex().get("a");
    assertEquals(Ref.Type.DIRECT_GET, a1.refs.get(0).type);

    // OR เป็น "then" branch ของ HOOK -> false branch (break) -> ไป NAME "b"
    // ซึ่งไม่ตรงกับ "a" -> ALIASING_GET
    GlobalNamespace ns2 = parse("var a = {}; var b = x ? (a || {}) : 5;");
    Name a2 = ns2.getNameIndex().get("a");
    assertEquals(Ref.Type.ALIASING_GET, a2.refs.get(0).type);
  }

  // =====================================================================
  // 27. shouldKeepKeys(): OBJECTLIT + aliasingGets > 0
  // =====================================================================
  @Test
  public void testShouldKeepKeys_WhenAliasingGetOnObjectLiteral() {
    GlobalNamespace ns = parse("var a = {}; var b = a;");
    Name a = ns.getNameIndex().get("a");
    assertEquals(1, a.aliasingGets);
    assertTrue(a.shouldKeepKeys());
  }

  // =====================================================================
  // 28. canEliminate(): true เมื่อไม่มี get เลยและ collapse ได้ทั้งหมด
  // =====================================================================
  @Test
  public void testCanEliminate_SimpleObjectLiteralNoGets() {
    GlobalNamespace ns = parse("var a = {};");
    Name a = ns.getNameIndex().get("a");
    assertTrue(a.canEliminate());
  }

  // =====================================================================
  // 29. isNamespace(): true เมื่อมี class/enum descendant + OBJECTLIT,
  //     false เมื่อไม่มี descendant ดังกล่าว
  // =====================================================================
  @Test
  public void testIsNamespace_TrueAndFalseCases() {
    GlobalNamespace ns1 = parse(
        "var a = {}; /** @constructor */ a.Foo = function(){};");
    assertTrue(ns1.getNameIndex().get("a").isNamespace());

    GlobalNamespace ns2 = parse("var a = {};");
    assertFalse(ns2.getNameIndex().get("a").isNamespace());
  }

  // =====================================================================
  // 30. isSimpleName(): top-level vs nested
  // =====================================================================
  @Test
  public void testIsSimpleName_TopLevelVsNested() {
    GlobalNamespace ns = parse("var a = {}; a.b = 1;");
    assertTrue(ns.getNameIndex().get("a").isSimpleName());
    assertFalse(ns.getNameIndex().get("a.b").isSimpleName());
  }

  // =====================================================================
  // 31. removeRef(): reassign declaration เมื่อลบ declaration เดิม
  // =====================================================================
  @Test
  public void testRemoveRef_ReassignsDeclarationAndDecrementsCount() {
    GlobalNamespace ns = parse("var a = 1; a = 2;");
    Name a = ns.getNameIndex().get("a");
    assertEquals(2, a.globalSets);
    Ref oldDecl = a.declaration;
    assertNotNull(oldDecl);
    assertEquals(1, a.refs.size());
    Ref expectedNewDecl = a.refs.get(0);

    a.removeRef(oldDecl);

    assertEquals(1, a.globalSets);
    assertSame(expectedNewDecl, a.declaration);
    assertTrue(a.refs.isEmpty());
  }

  // =====================================================================
  // 32. removeRef(): no-op เมื่อ ref ไม่ใช่ declaration และไม่อยู่ใน refs
  // =====================================================================
  @Test
  public void testRemoveRef_NoOpWhenRefNotPresent() {
    GlobalNamespace ns = parse("var a = 1;");
    Name a = ns.getNameIndex().get("a");
    int before = a.globalSets;
    Ref foreign = Ref.createRefForTesting(Ref.Type.DIRECT_GET);

    a.removeRef(foreign);

    assertEquals(before, a.globalSets);
  }

  // =====================================================================
  // 33. getNameForest()/getNameIndex(): lazy generation, เรียกซ้ำไม่ process ใหม่
  // =====================================================================
  @Test
  public void testLazyProcessing_CalledOnlyOnce() {
    GlobalNamespace ns = parse("var a = 1;");
    List<Name> forest = ns.getNameForest();
    Name aFromForest = null;
    for (Name n : forest) {
      if (n.name.equals("a")) {
        aFromForest = n;
      }
    }
    assertNotNull(aFromForest);
    int globalSetsAfterFirstCall = aFromForest.globalSets;

    // เรียกซ้ำ: ถ้า process() ถูกเรียกซ้ำ (ไม่มี generated guard)
    // globalSets ของ "a" จะถูกเพิ่มซ้ำเป็น 2 -> ต้องยังเป็นค่าเดิม
    Map<String, Name> index = ns.getNameIndex();
    Name aFromIndex = index.get("a");
    assertSame(aFromForest, aFromIndex);
    assertEquals(globalSetsAfterFirstCall, aFromIndex.globalSets);
    assertEquals(1, aFromIndex.globalSets);
  }

  // =====================================================================
  // 34. Boundary/null: root == null -> คาดว่าเกิด NullPointerException
  //     เนื่องจากไม่มีการระบุ behavior สำหรับ root == null ในซอร์สโค้ด
  //     จึงคาดหวังแค่ว่าระบบจะ throw รันไทม์เอ็กเซปชันเมื่อ traverse
  // =====================================================================
  @Test(expected = NullPointerException.class)
  public void testNullRoot_ThrowsNullPointerException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(Lists.<SourceFile>newArrayList(),
        Lists.newArrayList(SourceFile.fromCode("input.js", "")),
        options);
    compiler.parse();

    GlobalNamespace ns = new GlobalNamespace(compiler, null);
    ns.getNameForest(); // ควร throw เพราะ root เป็น null
  }

  // =====================================================================
  // 35. อินพุตผิดรูปแบบ (malformed JS) -> ตรวจว่า parser รายงาน error
  //     (ไม่เดา behavior ของ GlobalNamespace ต่อ AST ที่ parse ผิดพลาด)
  // =====================================================================
  @Test
  public void testMalformedInput_ParseErrorDetected() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(Lists.<SourceFile>newArrayList(),
        Lists.newArrayList(SourceFile.fromCode("bad.js", "var a = ;")),
        options);
    compiler.parse();
    assertTrue("expected parse error for malformed input",
        compiler.getErrorCount() > 0);
    // หมายเหตุ: ไม่เรียก GlobalNamespace ต่อเพราะ behavior กับ AST ที่ parse
    // ผิดพลาดไม่ได้ถูกระบุไว้ในซอร์สโค้ดที่ให้มา
  }

  // =====================================================================
  // 36. Empty input: ไฟล์ว่าง -> ไม่มีชื่อใดถูกสร้าง
  // =====================================================================
  @Test
  public void testEmptyInput_NoNames() {
    GlobalNamespace ns = parse("");
    assertTrue(ns.getNameForest().isEmpty());
    assertTrue(ns.getNameIndex().isEmpty());
  }
}
