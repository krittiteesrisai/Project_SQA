package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;

import org.junit.Test;

/**
 * JUnit4 test สำหรับ ScopedAliases (Closure-174b)
 *
 * หมายเหตุสำคัญ: เนื่องจากไม่มี mocking library ใน classpath ที่กำหนด
 * และ ScopedAliases พึ่งพา Compiler/NodeTraversal/Scope/Var จริง
 * เทสนี้จึงใช้ com.google.javascript.jscomp.Compiler จริงในการ parse
 * (ผ่าน parseTestCode ซึ่งเป็น helper มาตรฐานสำหรับทดสอบ pass เดี่ยว)
 * แล้วเรียก ScopedAliases.process()/hotSwapScript() ตรง ๆ
 */
public class ScopedAliasesTest {

  /** No-op AliasTransformationHandler ที่ implement ตาม contract ที่เห็นได้จาก source เท่านั้น */
  private final AliasTransformationHandler noopHandler = new AliasTransformationHandler() {
    @Override
    public AliasTransformation logAliasTransformation(
        String sourceFile, SourcePosition<AliasTransformation> position) {
      return new AliasTransformation() {
        @Override
        public void addAlias(String alias, String qualifiedName) {
          // no-op สำหรับการทดสอบ
        }
      };
    }
  };

  private Compiler newCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // สมมติฐาน API: initOptions เป็น public method มาตรฐานของ Compiler
    compiler.initOptions(options);
    return compiler;
  }

  private Node parse(Compiler compiler, String js) {
    // สมมติฐาน API: parseTestCode คืน root node (ระดับ SCRIPT) พร้อมใช้กับ NodeTraversal.traverse
    return compiler.parseTestCode(js);
  }

  private ScopedAliases newPass(Compiler compiler) {
    return new ScopedAliases(compiler, null, noopHandler);
  }

  private String run(String js) {
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    return compiler.toSource(root);
  }

  // ---------- Boundary / empty ----------

  @Test
  public void testEmptyScript_NoOp() {
    Compiler compiler = newCompiler();
    Node root = parse(compiler, "");
    newPass(compiler).process(null, root);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testNoScopeCall_NoOp() {
    // ไม่มี goog.scope เลย -> aliasUsages/aliasDefinitions/scopeCalls ทั้งหมดว่าง
    // ครอบคลุมสาขา "if (...size() > 0 ...)" เป็น false ทั้งหมด
    String out = run("var x = 1;");
    assertTrue(out.contains("x"));
    Compiler c = newCompiler();
    Node root = parse(c, "var x = 1;");
    newPass(c).process(null, root);
    assertEquals(0, c.getErrorCount());
  }

  @Test
  public void testShouldTraverse_SkipsUnrelatedTopLevelFunction() {
    // ฟังก์ชันธรรมดาที่ global scope และไม่ใช่ goog.scope call
    // -> shouldTraverse ต้อง return false ทำให้เนื้อหาข้างในไม่ถูกประมวลผลเลย
    String js = "function foo() { var alias = goog.dom; alias.bar(); }";
    String out = run(js);
    assertTrue("เนื้อหาในฟังก์ชันที่ไม่เกี่ยวกับ goog.scope ต้องไม่ถูกแปลง",
        out.contains("alias.bar") || out.contains("alias.bar()"));
  }

  // ---------- Basic alias inlining ----------

  @Test
  public void testBasicAliasInlining() {
    String js = "goog.scope(function() { "
        + "var alias = goog.dom; "
        + "alias.createElement('DIV'); "
        + "});";
    String out = run(js);
    assertTrue(out.contains("goog.dom.createElement"));
    assertFalse(out.contains("alias"));
  }

  @Test
  public void testTransitiveAliasInlining() {
    // ครอบคลุม while-loop ใน hotSwapScript: referencesOtherAlias() true -> newQueue -> resolve
    String js = "goog.scope(function() { "
        + "var g = goog; "
        + "var d = g.dom; "
        + "d.createElement('DIV'); "
        + "});";
    String out = run(js);
    assertTrue(out.contains("goog.dom.createElement"));
    assertFalse(out.contains("var g"));
    assertFalse(out.contains("var d"));
  }

  @Test
  public void testMultipleVarDeclarationsPartialRemoval() {
    // ครอบคลุมทั้งสองสาขาของ:
    // if (aliasDefinition.getParent().isVar() && aliasDefinition.getParent().hasOneChild())
    // - 'alias' ถูกลบตอนที่ parent ยังมี 2 children (false-branch: detach เฉพาะตัวมันเอง)
    // - 'other' ถูกลบตอนที่ parent เหลือ 1 child (true-branch: detach ทั้ง var statement)
    String js = "goog.scope(function() { "
        + "var alias = goog.dom, other = goog.events; "
        + "alias.createElement('DIV'); "
        + "});";
    String out = run(js);
    assertTrue(out.contains("goog.dom.createElement"));
    assertFalse(out.contains("alias"));
    assertFalse(out.contains("other"));
  }

  // ---------- Error branches: alias validation ----------

  @Test
  public void testAliasRedefinedReportsError() {
    // aliasVar != null && isLValue(n) && aliasVar.getNode() != n -> GOOG_SCOPE_ALIAS_REDEFINED
    String js = "goog.scope(function() { "
        + "var alias = goog.dom; "
        + "alias = goog.other; "
        + "alias.createElement('DIV'); "
        + "});";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test(timeout = 5000)
  public void testAliasCycleReportsErrorAndBreaksLoop() {
    // ทดสอบ branch cycle-detection: ถ้า logic ป้องกัน infinite loop พัง เทสนี้จะ hang -> timeout จับได้
    String js = "goog.scope(function() { "
        + "var a = b; "
        + "var b = a; "
        + "});";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue("คาดว่าต้องมี error จาก GOOG_SCOPE_ALIAS_CYCLE",
        compiler.getErrorCount() >= 1);
  }

  @Test
  public void testNonAliasLocalReportsError() {
    // parent ไม่ใช่ VAR, ไม่ใช่ bleeding function, ไม่ใช่ LP param -> GOOG_SCOPE_NON_ALIAS_LOCAL
    String js = "goog.scope(function() { function foo() {} });";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test
  public void testThisReferenceReportsError() {
    String js = "goog.scope(function() { alert(this); });";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test
  public void testReturnStatementReportsError() {
    String js = "goog.scope(function() { return; });";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test
  public void testThrowStatementReportsError() {
    String js = "goog.scope(function() { throw 1; });";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  // ---------- Error branches: validateScopeCall ----------

  @Test
  public void testGoogScopeUsedImproperly() {
    // parent ของ CALL ไม่ใช่ EXPR_RESULT -> GOOG_SCOPE_USED_IMPROPERLY
    // (hasErrors=true จึงต้อง gate การ collapse ทั้งหมด -> output ยังคง goog.scope(...) อยู่)
    String js = "var x = goog.scope(function() {});";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
    assertTrue(compiler.toSource(root).contains("goog.scope"));
  }

  @Test
  public void testGoogScopeBadParameters_TooFewArgs() {
    // childCount == 1 (< 2) -> != 2 -> GOOG_SCOPE_HAS_BAD_PARAMETERS (boundary ล่าง)
    String js = "goog.scope();";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test
  public void testGoogScopeBadParameters_TooManyArgs() {
    // childCount == 3 (> 2) -> != 2 -> GOOG_SCOPE_HAS_BAD_PARAMETERS (boundary บน)
    String js = "goog.scope(1, 2);";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test
  public void testGoogScopeBadParameters_ArgNotFunction() {
    // childCount == 2 แต่ param ไม่ใช่ function -> GOOG_SCOPE_HAS_BAD_PARAMETERS
    String js = "goog.scope(x);";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test
  public void testGoogScopeBadParameters_NamedFunction() {
    // NodeUtil.getFunctionName(...) != null -> GOOG_SCOPE_HAS_BAD_PARAMETERS
    String js = "goog.scope(function named() {});";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test
  public void testGoogScopeBadParameters_FunctionWithParams() {
    // getFunctionParameters(...).hasChildren() == true -> GOOG_SCOPE_HAS_BAD_PARAMETERS
    String js = "goog.scope(function(a) {});";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertTrue(compiler.getErrorCount() >= 1);
  }

  @Test
  public void testGoogScopeValidParameters_NoErrorFromBadParamsCheck() {
    // ฟังก์ชัน anonymous ไม่มีชื่อ ไม่มี param -> ไม่เข้า GOOG_SCOPE_HAS_BAD_PARAMETERS
    String js = "goog.scope(function() {});";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).process(null, root);
    assertEquals(0, compiler.getErrorCount());
  }

  // ---------- Malformed input ----------

  @Test
  public void testMalformedInput_ParseErrorDoesNotCrashParser() {
    // input ผิดรูปแบบทางไวยากรณ์ (unbalanced parens)
    // เราตรวจสอบเพียงว่า parser รายงาน error ของตัวเองได้โดยไม่ throw exception ที่ไม่คาดคิด
    // หมายเหตุ: ไม่เรียก ScopedAliases.process() ต่อกับ AST ที่ parse ไม่สมบูรณ์
    // เนื่องจาก source ที่ให้มาไม่ได้ระบุ behavior สำหรับ tree ผิดรูปแบบ (ป้องกันการเดา)
    Compiler compiler = newCompiler();
    String malformedJs = "goog.scope(function( {";
    parse(compiler, malformedJs);
    assertTrue("expected parser to report a syntax error",
        compiler.getErrorCount() > 0);
  }

  // ---------- hotSwapScript interface method ----------

  @Test
  public void testHotSwapScript_BehavesSameAsProcess() {
    String js = "goog.scope(function() { "
        + "var alias = goog.dom; "
        + "alias.createElement('DIV'); "
        + "});";
    Compiler compiler = newCompiler();
    Node root = parse(compiler, js);
    newPass(compiler).hotSwapScript(root, null);
    String out = compiler.toSource(root);
    assertTrue(out.contains("goog.dom.createElement"));
    assertEquals(0, compiler.getErrorCount());
  }
}
