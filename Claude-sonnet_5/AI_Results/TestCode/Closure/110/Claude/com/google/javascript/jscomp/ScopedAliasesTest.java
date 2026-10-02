package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * Unit tests สำหรับ {@link ScopedAliases}.
 *
 * หมายเหตุ: ScopedAliases เป็น package-private class จึงไม่ต้อง import แยก
 * (test class นี้อยู่ package เดียวกัน: com.google.javascript.jscomp)
 *
 * ใช้ CompilerTestCase (ส่วนหนึ่งของ source เดิมของโปรเจกต์ Closure Compiler
 * ไม่ใช่ external library) เป็นฐาน เพราะการทดสอบ pass ระดับ AST เช่นนี้
 * จำเป็นต้องพึ่งพา NodeTraversal/Scope/Rhino AST ที่สร้างจริงจากการ parse
 * source code เท่านั้น การ mock เองจะมีความเสี่ยงสูงที่จะเดา behavior
 *
 * เมธอด test ทั้งหมดมี @Test annotation (JUnit4 style) และตั้งชื่อขึ้นต้นด้วย
 * "test" เพื่อ compatible กับ runner แบบเดิม (CompilerTestCase extends TestCase)
 */
public class ScopedAliasesTest extends CompilerTestCase {

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    // preprocessorSymbolTable = null -> ครอบคลุม branch false ของ
    // "if (preprocessorSymbolTable != null)" ในทุกเทสเคสของคลาสนี้
    return new ScopedAliases(
        compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
  }

  // ---------------------------------------------------------------------
  // Boundary / empty / no-op cases
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyScript() {
    // อินพุตว่างเปล่า -> ไม่มี goog.scope ให้ประมวลผล ไม่ error, ไม่เปลี่ยนโค้ด
    testSame("");
  }

  @Test
  public void testNoScopeCallNoOp() {
    // ไม่มีการเรียก goog.scope เลย -> isCallToScopeMethod เป็น false เสมอ
    // ไม่ควรมีการแปลงหรือ error ใด ๆ
    testSame("var x = 1;");
  }

  @Test
  public void testNotAScopeCallDoesNotDescend() {
    // shouldTraverse() จะคืน false เมื่อพบ FUNCTION ใน global scope
    // ที่ parent ไม่ใช่ call ไปยัง "goog.scope" (isCallToScopeMethod(parent) == false)
    // ดังนั้นเนื้อหาภายใน (this/return/throw) จะไม่ถูกตรวจสอบเลย และไม่ error
    testSame("foo.scope(function() { this.x = 1; return; throw 'e'; });");
  }

  @Test
  public void testEmptyScopeBody() {
    // goog.scope(function(){}) ที่ body ว่าง -> ไม่มี alias, ไม่มี error,
    // scope ถูก collapse เหลือ statement เปล่า (NodeUtil.tryMergeBlock)
    test("goog.scope(function() {});", "");
  }

  // ---------------------------------------------------------------------
  // Normal alias resolution (aliasWorkQueue loop, referencesOtherAlias=false)
  // ---------------------------------------------------------------------

  @Test
  public void testOneLevelAlias() {
    test(
        "goog.scope(function() {"
        + "  var g = goog;"
        + "  g.dom.createElement(g.dom.TagName.DIV);"
        + "});",
        "goog.dom.createElement(goog.dom.TagName.DIV);");
  }

  @Test
  public void testTransitiveAlias() {
    // ทดสอบ loop ใน hotSwapScript: รอบแรก d.* ยัง referencesOtherAlias()==true
    // (เพราะ root ของ d คือ g ซึ่งเป็น alias) จึงเข้า newQueue ก่อนถูก apply รอบถัดไป
    test(
        "goog.scope(function() {"
        + "  var g = goog;"
        + "  var d = g.dom;"
        + "  d.createElement(d.TagName.DIV);"
        + "});",
        "goog.dom.createElement(goog.dom.TagName.DIV);");
  }

  // ---------------------------------------------------------------------
  // validateScopeCall(): error branches
  // ---------------------------------------------------------------------

  @Test
  public void testUsedImproperly() {
    // parent ของ call ไม่ใช่ EXPR_RESULT (ที่นี่เป็น NAME "x")
    // -> !parent.isExprResult() == true -> GOOG_SCOPE_USED_IMPROPERLY
    test("var x = goog.scope(function() {});",
        ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testBadParametersWrongChildCount() {
    // n.getChildCount() != 2 (ไม่มี argument เลย) -> GOOG_SCOPE_HAS_BAD_PARAMETERS
    test("goog.scope();", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testBadParametersNotFunction() {
    // childCount == 2 แต่ argument (x) ไม่ใช่ FUNCTION
    test("goog.scope(x);", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testBadParametersNamedFunction() {
    // NodeUtil.getFunctionName(anonymousFnNode) != null (มีชื่อ "foo")
    test("goog.scope(function foo() {});",
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testBadParametersHasParams() {
    // ฟังก์ชัน anonymous แต่มี parameter (a) -> hasChildren() == true
    test("goog.scope(function(a) {});",
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  // ---------------------------------------------------------------------
  // visit(): scopeDepth == 2 error branches (this/return/throw)
  // ---------------------------------------------------------------------

  @Test
  public void testReferencesThis() {
    test("goog.scope(function() { this.x = 3; });",
        ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testUsesReturn() {
    test("goog.scope(function() { return; });",
        ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testUsesThrow() {
    test("goog.scope(function() { throw 'x'; });",
        ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  // ---------------------------------------------------------------------
  // Alias redefinition / cycle / non-alias local
  // ---------------------------------------------------------------------

  @Test
  public void testAliasRedefined() {
    // aliasVar != null, NodeUtil.isLValue(n) == true, แต่ aliasVar.getNode() != n
    // (การ assign ครั้งที่สองให้ x) -> GOOG_SCOPE_ALIAS_REDEFINED
    test(
        "goog.scope(function() {"
        + "  var x = goog.dom;"
        + "  x = goog.events;"
        + "});",
        ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testAliasCycle() {
    // var a = b; var b = a; -> ทั้งคู่ referencesOtherAlias() == true เสมอ
    // -> newQueue.size() == aliasWorkQueue.size() -> ตรวจพบ cycle
    // -> GOOG_SCOPE_ALIAS_CYCLE พร้อม break loop (ป้องกัน infinite loop)
    test(
        "goog.scope(function() {"
        + "  var a = b;"
        + "  var b = a;"
        + "});",
        ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE);
  }

  @Test
  public void testNonAliasLocal_CatchParam() {
    // อ้างอิงจากคอมเมนต์ในซอร์สโค้ดต้นฉบับ:
    // "// Do not [handle] other kinds of local symbols, like catch params."
    // -> catch param ตกลงใน else สุดท้ายของ findAliases()
    // -> GOOG_SCOPE_NON_ALIAS_LOCAL
    test(
        "goog.scope(function() {"
        + "  try {} catch (e) {}"
        + "});",
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  // ---------------------------------------------------------------------
  // Branch ที่ไม่ทดสอบ exact behavior เพราะพึ่งพา resource ภายนอก
  // ---------------------------------------------------------------------
  // "else if (isVar)" ใน findAliases() (เช่น "var x = 3;" ที่ค่าไม่ใช่
  // qualified name) จะเรียก compiler.ensureLibraryInjected("base") และสร้าง
  // ชื่อ "$jscomp.scope.x" ขึ้นมาใหม่ ซึ่งผลลัพธ์ที่แน่นอนขึ้นกับ resource
  // ("base" library) ที่ไม่ปรากฏอยู่ในซอร์สโค้ดที่ให้มา จึงไม่เขียนเทส
  // ที่ยืนยัน exact output ของ branch นี้ เพื่อไม่ฝ่าฝืนข้อกำหนดที่ 4
}
