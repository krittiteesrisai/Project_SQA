package com.google.javascript.jscomp;

// หมายเหตุ: RemoveUnusedVars เป็น package-private class ในแพ็กเกจนี้
// จึงต้องประกาศคลาสทดสอบไว้ใน package เดียวกัน (com.google.javascript.jscomp)
// ไม่มี import statement สำหรับ RemoveUnusedVars เพราะอยู่ package เดียวกันอยู่แล้ว

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.util.List;

/**
 * JUnit4 test suite สำหรับ RemoveUnusedVars (Defects4J Closure-45b)
 *
 * แนวทาง: ขับเคลื่อนผ่าน Compiler front-end จริง (parse -> Normalize -> pass ->
 * toSource) เพราะคลาสเป้าหมายผูกกับ Scope/AST ของ Closure Compiler อย่างลึก
 * ไม่สามารถทดสอบแบบ unit ล้วน ๆ ได้โดยไม่พึ่ง infrastructure จริงของตัว compiler
 */
public class RemoveUnusedVarsTest {

  /**
   * รัน RemoveUnusedVars บนซอร์ส JS ที่กำหนด แล้ว return source ที่ได้หลัง process
   *
   * ASSUMPTION: Compiler.init/parse/getRoot/toSource มีลายเซ็นตามที่ใช้ด้านล่าง
   * ตาม API มาตรฐานของ Closure Compiler ยุคเดียวกับซอร์สที่ให้มา
   */
  private String runPass(
      String js, boolean removeGlobals, boolean preserveFunctionExpressionNames) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));

    compiler.init(externs, inputs, options);
    compiler.parse();

    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node mainRoot = root.getLastChild();

    // RemoveUnusedVars.process() ต้องการ AST ที่ normalize แล้ว
    // (Preconditions.checkState(compiler.getLifeCycleStage().isNormalized())).
    // ASSUMPTION: Normalize.process() จะปรับ LifeCycleStage เป็น NORMALIZED เอง
    new Normalize(compiler, false).process(externsRoot, mainRoot);

    RemoveUnusedVars pass = new RemoveUnusedVars(
        compiler, removeGlobals, preserveFunctionExpressionNames, /* modifyCallSites= */ false);
    pass.process(externsRoot, mainRoot);

    return compiler.toSource(mainRoot);
  }

  private String runPass(String js, boolean removeGlobals) {
    return runPass(js, removeGlobals, false);
  }

  /** ลบ whitespace ทั้งหมดเพื่อลดความเปราะบางของการเทียบ source text ที่ print ออกมา */
  private static String norm(String s) {
    return s.replaceAll("\\s+", "");
  }

  // ---------------------------------------------------------------------
  // 1) global var ไม่ถูกใช้ -> ถูกลบ (removeGlobals = true)
  // ---------------------------------------------------------------------
  @Test
  public void testUnusedGlobalVarRemoved() {
    String result = runPass("var x;", true);
    assertEquals("", norm(result));
  }

  // ---------------------------------------------------------------------
  // 2) global var ถูกใช้งาน -> ต้องไม่ถูกลบ
  // ---------------------------------------------------------------------
  @Test
  public void testUsedGlobalVarKept() {
    String result = runPass("var x; x;", true);
    assertEquals(norm("var x;x;"), norm(result));
  }

  // ---------------------------------------------------------------------
  // 3) removeGlobals = false -> global var ที่ไม่ถูกใช้ ต้องไม่ถูกลบ
  //    (ครอบคลุมเงื่อนไข isRemovableVar: !removeGlobals && var.isGlobal())
  // ---------------------------------------------------------------------
  @Test
  public void testUnusedGlobalVarKeptWhenRemoveGlobalsFalse() {
    String result = runPass("var x;", false);
    assertEquals(norm("var x;"), norm(result));
  }

  // ---------------------------------------------------------------------
  // 4) removeGlobals = false แต่ local var ที่ไม่ถูกใช้ยังต้องถูกลบ
  //    (isRemovableVar ไม่ถูก block เพราะ var.isGlobal() == false)
  // ---------------------------------------------------------------------
  @Test
  public void testUnusedLocalVarRemovedEvenWhenRemoveGlobalsFalse() {
    String result = runPass("function f(){ var x; }", false);
    assertEquals(norm("function f(){}"), norm(result));
  }

  // ---------------------------------------------------------------------
  // 5) function declaration ที่ไม่ถูกเรียกใช้ -> ถูกลบทั้งหมด
  // ---------------------------------------------------------------------
  @Test
  public void testUnusedFunctionDeclarationRemoved() {
    String result = runPass("function f(){}", true);
    assertEquals("", norm(result));
  }

  // ---------------------------------------------------------------------
  // 6) function declaration ที่ถูกเรียกใช้ -> ต้องไม่ถูกลบ
  // ---------------------------------------------------------------------
  @Test
  public void testUsedFunctionDeclarationKept() {
    String result = runPass("function f(){} f();", true);
    assertEquals(norm("function f(){}f();"), norm(result));
  }

  // ---------------------------------------------------------------------
  // 7) property-assign กับ initializer ที่เป็น literal -> ถือว่ายังไม่ referenced
  //    -> ทั้ง var และ assign ถูกลบทั้งคู่ (interpretAssigns: assignedToUnknownValue=false)
  // ---------------------------------------------------------------------
  @Test
  public void testPropertyAssignWithLiteralInitRemovesVarAndAssign() {
    String result = runPass("var x = {}; x.foo = 1;", true);
    assertEquals("", norm(result));
  }

  // ---------------------------------------------------------------------
  // 8) property-assign กับ initializer ที่ไม่รู้ค่า (call) + มี property assign
  //    -> ตาม interpretAssigns var จะถูก mark referenced -> คงเดิมทั้งหมด
  // ---------------------------------------------------------------------
  @Test
  public void testPropertyAssignWithUnknownInitKeepsVarReferenced() {
    String js = "var x = foo(); x.foo = 1;";
    String result = runPass(js, true);
    assertEquals(norm(js), norm(result));
  }

  // ---------------------------------------------------------------------
  // 9) unused trailing function args ถูกตัดออกจากท้าย param list
  //    (removeUnreferencedFunctionArgs, modifyCallSites=false -> while loop)
  // ---------------------------------------------------------------------
  @Test
  public void testTrailingUnusedFunctionArgsRemoved() {
    String result = runPass("function f(a,b,c){return a;} f(1,2,3);", true);
    assertEquals(norm("function f(a){return a;}f(1,2,3);"), norm(result));
  }

  // ---------------------------------------------------------------------
  // 10) param กลางถูกใช้ -> การตัดจากท้ายหยุดทันทีที่พบ referenced param
  //     (a ไม่ถูกใช้เช่นกัน แต่ไม่ถูกตัดเพราะไม่ใช่ trailing)
  // ---------------------------------------------------------------------
  @Test
  public void testMiddleUsedArgStopsTrailingRemoval() {
    String result = runPass("function f(a,b,c){return b;} f(1,2,3);", true);
    assertEquals(norm("function f(a,b){return b;}f(1,2,3);"), norm(result));
  }

  // ---------------------------------------------------------------------
  // 11) named function expression ที่ไม่ self-reference และ
  //     preserveFunctionExpressionNames = false -> ชื่อถูกลบ (setString(""))
  // ---------------------------------------------------------------------
  @Test
  public void testFunctionExpressionNameAnonymizedWhenNotPreserved() {
    String result = runPass("var f = function foo(){}; f();", true, false);
    assertFalse("ชื่อ 'foo' ต้องถูกลบออก (anonymized)", result.contains("foo"));
    assertTrue(result.contains("f()"));
  }

  // ---------------------------------------------------------------------
  // 12) preserveFunctionExpressionNames = true -> ชื่อยังคงอยู่
  // ---------------------------------------------------------------------
  @Test
  public void testFunctionExpressionNamePreservedWhenFlagTrue() {
    String result = runPass("var f = function foo(){}; f();", true, true);
    assertTrue("ชื่อ 'foo' ต้องยังคงอยู่เมื่อ preserve=true", result.contains("foo"));
  }

  // ---------------------------------------------------------------------
  // 13) หลาย var ใน statement เดียว: ลบเฉพาะตัวที่ไม่ถูกใช้
  //     (toRemove.isVar() && toRemove.getChildCount() > 1 branch)
  // ---------------------------------------------------------------------
  @Test
  public void testMultipleVarDeclarationPartialRemoval() {
    String result = runPass("var a, b, c; b;", true);
    assertEquals(norm("var b;b;"), norm(result));
  }

  // ---------------------------------------------------------------------
  // 14) boundary: ทุกตัวใน var เดียวกันไม่ถูกใช้เลย -> ทั้ง statement ถูกลบหมด
  // ---------------------------------------------------------------------
  @Test
  public void testAllUnusedInMultipleVarDeclarationRemovesEntireStatement() {
    String result = runPass("var a, b, c;", true);
    assertEquals("", norm(result));
  }

  // ---------------------------------------------------------------------
  // 15) การ assign เฉย ๆ (x = 5;) ไม่ถือเป็นการอ้างอิงตัวแปร (assignsByNode
  //     กันไม่ให้ NAME node ที่เป็น assign-target ถูก mark referenced)
  //     -> ทั้ง declaration และ assign ถูกลบ
  // ---------------------------------------------------------------------
  @Test
  public void testAssignAloneDoesNotKeepVarAlive() {
    String result = runPass("var x; x = 5;", true);
    assertEquals("", norm(result));
  }

  // ---------------------------------------------------------------------
  // 16) initializer มี side effect (call) -> declaration ถูกแปลงเป็น
  //     expression statement เดี่ยว ๆ (var a = foo(); -> foo();)
  // ---------------------------------------------------------------------
  @Test
  public void testVarWithSideEffectInitializerConvertedToExpression() {
    String result = runPass("var a = foo();", true);
    assertEquals(norm("foo();"), norm(result));
  }

  // ---------------------------------------------------------------------
  // 17) for-in variable ต้องไม่ถูกลบแม้ไม่ถูกใช้ (parent.isFor() &&
  //     parent.getChildCount() < 4 -> "leave them alone" branch)
  // ---------------------------------------------------------------------
  @Test
  public void testForInVariablePreservedEvenIfUnreferenced() {
    String js = "for(var k in obj){}";
    String result = runPass(js, true);
    assertEquals(norm(js), norm(result));
  }

  // ---------------------------------------------------------------------
  // 18) การใช้ "arguments" ใน scope local -> mark ทุก parameter เป็น
  //     referenced -> ป้องกันการตัด trailing args ทั้งหมด
  // ---------------------------------------------------------------------
  @Test
  public void testArgumentsUsagePreventsTrailingArgRemoval() {
    String js = "function f(a,b){ use(arguments); } f();";
    String result = runPass(js, true);
    assertTrue(result.contains("a"));
    assertTrue(result.contains("b"));
  }

  // ---------------------------------------------------------------------
  // 19) assign ที่ base ไม่ใช่ NAME ตรง ๆ (เช่น getObj().foo = b;)
  //     -> Assign.maybeCreateAssign คืน null -> fallthrough traversal ปกติ
  //     -> RHS (b) ยังถูก mark referenced ตามปกติ
  // ---------------------------------------------------------------------
  @Test
  public void testAssignToComputedPropertyDoesNotTrackAsVarAssign() {
    String js = "var b; getObj().foo = b;";
    String result = runPass(js, true);
    assertEquals(norm(js), norm(result));
  }

  // ---------------------------------------------------------------------
  // 20) boundary: โปรแกรมว่างเปล่า -> ไม่มี exception, ผลลัพธ์ว่าง
  // ---------------------------------------------------------------------
  @Test
  public void testEmptyProgramNoException() {
    String result = runPass("", true);
    assertEquals("", norm(result));
  }

  // ---------------------------------------------------------------------
  // 21) โปรแกรมที่ไม่มีตัวแปรเลย -> ไม่มีการเปลี่ยนแปลง ไม่ throw
  // ---------------------------------------------------------------------
  @Test
  public void testNoVarsProgramUnchanged() {
    String js = "1;";
    String result = runPass(js, true);
    assertEquals(norm(js), norm(result));
  }

  // ---------------------------------------------------------------------
  // 22) null / unnormalized compiler -> process() ต้อง fail-fast
  //     (Preconditions.checkState ใน process(Node, Node))
  //     ไม่แน่ใจ exact exception subtype จึงเช็คแบบกว้างเป็น RuntimeException
  // ---------------------------------------------------------------------
  @Test(expected = RuntimeException.class)
  public void testProcessOnUnnormalizedCompilerThrows() {
    Compiler freshCompiler = new Compiler();
    RemoveUnusedVars pass = new RemoveUnusedVars(freshCompiler, true, false, false);
    // ไม่เคย parse/normalize compiler นี้เลย -> getLifeCycleStage() ไม่ normalized
    // (หรืออาจ throw NPE ก่อนถึง checkState) ทั้งสองกรณีเป็น RuntimeException
    pass.process(null, null);
  }

  // ---------------------------------------------------------------------
  // 23) malformed input (syntax error) -> เฉพาะตรวจว่า parser รายงาน error
  //     ไม่ตั้งสมมติฐานเกี่ยวกับพฤติกรรมของ RemoveUnusedVars บน AST ที่ผิดรูป
  //     เพราะไม่มีนิยามไว้ในซอร์สโค้ดต้นทาง
  // ---------------------------------------------------------------------
  @Test
  public void testMalformedInputReportsParseError() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = Lists.newArrayList(SourceFile.fromCode("input.js", "var x = ;"));
    c.init(externs, inputs, options);
    c.parse();
    assertTrue("parser ควรรายงาน error สำหรับ syntax ที่ผิดรูป",
        c.getErrorCount() > 0);
  }
}
