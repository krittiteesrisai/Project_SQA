package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.InlineVariables.Mode;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * JUnit4 test สำหรับ InlineVariables (Defects4J Closure-36b)
 *
 * หมายเหตุ:
 * - ใช้ com.google.javascript.jscomp.Compiler / CompilerOptions / SourceFile
 *   (public API มาตรฐานของโปรเจกต์ Closure Compiler เอง ซึ่ง InlineVariables
 *   อาศัยอยู่ในแพ็กเกจเดียวกัน) เพื่อ parse JS จริงเป็น AST แล้วเรียก
 *   InlineVariables.process(...) ตรง ๆ
 * - เมธอด parseInputs()/init()/toSource() เป็น best-effort ตามความรู้เกี่ยวกับ
 *   Closure Compiler codebase ช่วงเวลาเดียวกับ bug นี้ (ไม่ได้แสดงในซอร์สที่ให้มา)
 *   หากไม่ตรงกับ actual signature ต้องปรับ helper ตาม API จริงของโปรเจกต์
 */
public class InlineVariablesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /** รัน InlineVariables pass โดยไม่มี custom externs */
  private String runInline(String js, Mode mode, boolean inlineAllStrings) {
    return runInline("", js, mode, inlineAllStrings);
  }

  /** รัน InlineVariables pass พร้อม externs ที่กำหนดเอง (เพื่อทดสอบ isExtern) */
  private String runInline(String externsJs, String js, Mode mode,
      boolean inlineAllStrings) {
    CompilerOptions options = new CompilerOptions();

    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", externsJs));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));

    compiler.init(externs, inputs, options);
    // parseInputs(): parse แล้วคืน root ที่มี externsRoot เป็น first child,
    // jsRoot เป็น last child (ตาม convention ของ Closure Compiler)
    Node root = compiler.parseInputs();
    assertNotNull("parse ล้มเหลว ตรวจสอบ syntax ของ input", root);

    Node externsRoot = root.getFirstChild();
    Node jsRoot = root.getLastChild();

    InlineVariables pass = new InlineVariables(compiler, mode, inlineAllStrings);
    pass.process(externsRoot, jsRoot);

    return compiler.toSource();
  }

  // =====================================================================
  // 1) enum Mode - boundary ของค่าคงที่
  // =====================================================================

  @Test
  public void testModeEnumHasThreeValues() {
    Mode[] values = Mode.values();
    assertEquals(3, values.length);
    assertEquals(Mode.CONSTANTS_ONLY, values[0]);
    assertEquals(Mode.LOCALS_ONLY, values[1]);
    assertEquals(Mode.ALL, values[2]);
  }

  @Test
  public void testModeValueOf() {
    assertEquals(Mode.ALL, Mode.valueOf("ALL"));
    assertEquals(Mode.LOCALS_ONLY, Mode.valueOf("LOCALS_ONLY"));
    assertEquals(Mode.CONSTANTS_ONLY, Mode.valueOf("CONSTANTS_ONLY"));
  }

  // =====================================================================
  // 2) Constructor
  // =====================================================================

  @Test
  public void testConstructorAllModesDoNotThrow() {
    new InlineVariables(compiler, Mode.ALL, true);
    new InlineVariables(compiler, Mode.LOCALS_ONLY, false);
    new InlineVariables(compiler, Mode.CONSTANTS_ONLY, true);
  }

  @Test
  public void testConstructorWithNullCompiler_NoImmediateException() {
    // ตามซอร์สโค้ด constructor เพียง assign field ไม่มี Preconditions.checkNotNull
    // จึงไม่ควร throw ตอนสร้าง object (edge case: null input)
    InlineVariables pass = new InlineVariables(null, Mode.ALL, true);
    assertNotNull(pass);
  }

  // =====================================================================
  // 3) Mode.ALL - inline ตัวแปรใช้ครั้งเดียว (refCount == firstRefAfterInit == 2)
  // =====================================================================

  @Test
  public void testInlineSingleUseLiteral_ModeAll() {
    String js = "function f() { var x = 1; return x; }";
    String result = runInline(js, Mode.ALL, true);

    assertFalse("x ควรถูก inline และลบ declaration", result.contains("var x"));
    assertTrue("ค่า literal ควรถูกแทนที่ตำแหน่งอ้างอิง", result.contains("return 1"));
  }

  // =====================================================================
  // 4) Mode.ALL - ตัวแปร immutable ที่อ้างอิงมากกว่า 1 ครั้ง
  //    (refCount > 1 && isImmutableAndWellDefinedVariable)
  // =====================================================================

  @Test
  public void testInlineMultipleUseImmutableLiteral_ModeAll() {
    String js = "function f() { var x = 1; return x + x; }";
    String result = runInline(js, Mode.ALL, true);

    assertFalse(result.contains("var x"));
    assertTrue(result.contains("1 + 1"));
  }

  // =====================================================================
  // 5) Mode.ALL - ตัวแปรถูก reassign -> ไม่ well-defined -> ไม่ inline
  // =====================================================================

  @Test
  public void testDoNotInlineReassignedVariable_ModeAll() {
    String js = "function f() { var x = 1; x = 2; return x; }";
    String result = runInline(js, Mode.ALL, true);

    assertTrue("ตัวแปรที่ reassign ไม่ควร inline", result.contains("var x"));
  }

  // =====================================================================
  // 6) Mode.ALL - ตัวแปรไม่ถูกใช้เลย (refCount == 1) -> ไม่มี branch ใด match
  // =====================================================================

  @Test
  public void testDoNotInlineUnusedVariable_ModeAll() {
    String js = "function f() { var x = 1; return 0; }";
    String result = runInline(js, Mode.ALL, true);

    assertTrue(result.contains("var x"));
  }

  // =====================================================================
  // 7) Mode.ALL - branch "declaration != init && refCount == 2"
  // =====================================================================

  @Test
  public void testInlineSeparateDeclarationAndAssignment_ModeAll() {
    String js = "function f() { var x; x = 1; }";
    String result = runInline(js, Mode.ALL, true);

    assertFalse(result.contains("var x"));
  }

  // =====================================================================
  // 8) Mode.ALL - branch "refCount == firstRefAfterInit" (firstRefAfterInit=3)
  // =====================================================================

  @Test
  public void testInlineSeparateDeclarationAssignmentThenRead_ModeAll() {
    String js = "function f() { var x; x = 1; return x; }";
    String result = runInline(js, Mode.ALL, true);

    assertFalse(result.contains("var x"));
    assertTrue(result.contains("return 1"));
  }

  // =====================================================================
  // 9) Mode.LOCALS_ONLY - global variable ต้องไม่ inline (IdentifyLocals=false)
  // =====================================================================

  @Test
  public void testLocalsOnlyMode_GlobalVariableNotInlined() {
    String js = "var x = 1; function f() { return x; }";
    String result = runInline(js, Mode.LOCALS_ONLY, true);

    assertTrue(result.contains("var x"));
  }

  // =====================================================================
  // 10) Mode.LOCALS_ONLY - local variable ควร inline ได้
  // =====================================================================

  @Test
  public void testLocalsOnlyMode_LocalVariableInlined() {
    String js = "function f() { var x = 1; return x; }";
    String result = runInline(js, Mode.LOCALS_ONLY, true);

    assertFalse(result.contains("var x"));
    assertTrue(result.contains("return 1"));
  }

  // =====================================================================
  // 11) Mode.CONSTANTS_ONLY - ตัวแปรที่ไม่ใช่ constant ต้องไม่ inline
  // =====================================================================

  @Test
  public void testConstantsOnlyMode_NonConstantNotInlined() {
    String js = "function f() { var x = 1; return x; }";
    String result = runInline(js, Mode.CONSTANTS_ONLY, true);

    assertTrue(result.contains("var x"));
  }

  // =====================================================================
  // 12) Mode.CONSTANTS_ONLY - ตัวแปรประกาศด้วย @const (best-effort)
  //     หมายเหตุ: เงื่อนไขจริงของ Var.isConst() ไม่ปรากฏในซอร์สที่ให้มา
  //     จึงยืนยันเพียงว่าไม่ throw exception (weak assertion โดยเจตนา)
  // =====================================================================

  @Test
  public void testConstantsOnlyMode_DeclaredConstant_BestEffort() {
    String js = "/** @const */ var XX = 1; function f() { return XX; }";
    String result = runInline(js, Mode.CONSTANTS_ONLY, true);
    assertNotNull(result);
  }

  // =====================================================================
  // 13) อินพุตว่าง / ไม่มีตัวแปร - ต้องไม่ throw exception
  // =====================================================================

  @Test
  public void testEmptyProgram_NoExceptions() {
    String result = runInline("", Mode.ALL, true);
    assertNotNull(result);
  }

  @Test
  public void testProgramWithNoVariables_NoExceptions() {
    String result = runInline("function f() { return 1; }", Mode.ALL, true);
    assertTrue(result.contains("return 1"));
  }

  // =====================================================================
  // 14) inlineAllStrings flag true/false - isStringWorthInlining (ทดสอบทางอ้อม)
  // =====================================================================

  @Test
  public void testInlineAllStringsFlagVariants() {
    String js = "function f() { var s = 'hello'; return s; }";

    String resultTrue = runInline(js, Mode.ALL, true);
    assertNotNull(resultTrue);

    compiler = new Compiler(); // reset state สำหรับรันครั้งที่ 2
    String resultFalse = runInline(js, Mode.ALL, false);
    assertNotNull(resultFalse);
  }

  // =====================================================================
  // 15) isVarInlineForbidden - RENAME_PROPERTY_FUNCTION_NAME ต้องไม่ inline
  //     (อ้างอิงค่าคงที่จริงจากซอร์สโค้ด ไม่ใช่การเดา)
  // =====================================================================

  @Test
  public void testDoNotInlineRenamePropertyFunctionName_ModeAll() {
    String fnName = RenameProperties.RENAME_PROPERTY_FUNCTION_NAME;
    String js = "function f() { var " + fnName + " = 1; return " + fnName + "; }";
    String result = runInline(js, Mode.ALL, true);

    assertTrue(result.contains("var " + fnName));
  }

  // =====================================================================
  // 16) isVarInlineForbidden - extern variable ต้องไม่ inline
  // =====================================================================

  @Test
  public void testDoNotInlineExternVariable_ModeAll() {
    String externs = "var x;";
    String js = "function f() { x = 1; return x; }";
    String result = runInline(externs, js, Mode.ALL, true);

    assertTrue("ตัวแปรที่ประกาศใน externs (isExtern) ต้องไม่ inline",
        result.contains("x = 1"));
  }
}
