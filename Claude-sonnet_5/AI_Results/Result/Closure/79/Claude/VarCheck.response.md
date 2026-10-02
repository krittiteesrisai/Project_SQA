# วิเคราะห์และแนวทางการทดสอบ

เนื่องจาก `VarCheck` เป็น `CompilerPass` ที่ทำงานร่วมกับ `Compiler`, `Scope`, `JSModule`, `JSModuleGraph` ฯลฯ ของ Closure Compiler อย่างแน่นแฟ้น และใน classpath ที่กำหนดไม่มี mocking library (Mockito/EasyMock) ผมจึงเลือกวิธี **integration-style unit test** โดยใช้ public API ของ `Compiler`/`JSModule` จริง (ซึ่งเป็นส่วนหนึ่งของโปรเจกต์เดียวกับคลาสเป้าหมาย ไม่ใช่ external jar) เพื่อ trigger branch ต่าง ๆ ใน `visit()` และ `NameRefInExternsCheck`

> ⚠️ หมายเหตุสำคัญ: ชื่อ field/method บางตัว (`CompilerOptions.checkSymbols`, `JSModule.add(SourceFile)`, `Compiler.compileModules(...)`) อ้างอิงจาก public API ของ Closure Compiler ช่วงเวลาเดียวกับ commit นี้ หากชื่อไม่ตรงกับซอร์สจริงที่คอมไพล์ ต้องปรับชื่อ API ให้ตรง — เป็นเรื่อง scaffolding ของเทส ไม่ใช่การเดา business logic ของ `VarCheck`

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.VarCheck; // อ้างอิงคลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้อยู่ package เดียวกัน)

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * ชุดทดสอบ JUnit 4 สำหรับ com.google.javascript.jscomp.VarCheck (Defects4J Closure-79b)
 *
 * แนวทาง:
 * - ทดสอบผ่าน public API ของ Compiler/JSModule แบบ integration เนื่องจากไม่มี mocking
 *   library ใน classpath ที่กำหนด และตัว VarCheck ผูกกับ Scope/CompilerInput/JSModuleGraph
 *   อย่างแน่นแฟ้น
 * - คลาสทดสอบอยู่ package เดียวกับคลาสเป้าหมายเพื่อให้อ้างอิง DiagnosticType คงที่
 *   (UNDEFINED_VAR_ERROR ฯลฯ) ได้โดยตรง
 * - บาง branch ที่สร้างผ่าน JS source ปกติไม่ได้อย่างมั่นใจ (INVALID_FUNCTION_DECL,
 *   sanityCheck throw IllegalStateException, currInput/varInput == null) จะไม่เขียนเทส
 *   และระบุเหตุผลไว้เป็นคอมเมนต์ ตามข้อกำหนดห้ามเดา behavior
 */
public class VarCheckTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    // เปิดใช้งาน pass การตรวจสอบตัวแปร (สมมติฐาน: field public ชื่อ checkSymbols
    // มีอยู่ใน CompilerOptions ของเวอร์ชันนี้ ตามรูปแบบ public field ของ Closure
    // Compiler ยุคแรก)
    options.checkSymbols = true;
  }

  private static boolean containsError(JSError[] items, DiagnosticType type) {
    if (items == null) {
      return false;
    }
    for (JSError e : items) {
      if (e.getType().equals(type)) {
        return true;
      }
    }
    return false;
  }

  private JSError[] compileForErrors(String externsCode, String jsCode) {
    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", externsCode));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", jsCode));
    compiler.compile(externs, inputs, options);
    return compiler.getErrors();
  }

  private JSError[] compileForWarnings(String externsCode, String jsCode) {
    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", externsCode));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", jsCode));
    compiler.compile(externs, inputs, options);
    return compiler.getWarnings();
  }

  // -----------------------------------------------------------------------
  // 1) ตัวแปรถูกประกาศและใช้ในไฟล์เดียวกัน -> ไม่มี error
  //    (branch: var != null, currInput == varInput)
  // -----------------------------------------------------------------------
  @Test
  public void testDeclaredVariable_NoError() {
    JSError[] errors = compileForErrors("", "var x; x = 1;");
    assertEquals(0, errors.length);
  }

  // -----------------------------------------------------------------------
  // 2) ตัวแปรไม่ได้ประกาศเลย -> UNDEFINED_VAR_ERROR
  //    (branch: var == null, !isFunctionExpression(parent), sanityCheck == false)
  // -----------------------------------------------------------------------
  @Test
  public void testUndeclaredVariable_ReportsUndefinedVarError() {
    JSError[] errors = compileForErrors("", "y = 1;");
    assertTrue(containsError(errors, VarCheck.UNDEFINED_VAR_ERROR));
  }

  // -----------------------------------------------------------------------
  // 3) ชื่อว่าง (function expression) -> ข้าม ไม่รายงาน INVALID_FUNCTION_DECL
  //    (branch: varName.isEmpty() == true, isFunctionExpression(parent) == true)
  // -----------------------------------------------------------------------
  @Test
  public void testAnonymousFunctionExpression_NoError() {
    JSError[] errors = compileForErrors("", "var f = function() { return 1; };");
    assertEquals(0, errors.length);
  }

  // -----------------------------------------------------------------------
  // 4) ตัวแปรประกาศใน externs ใช้ในไฟล์ js อื่น โดยไม่มี module
  //    -> currModule == null, varModule == null -> ไม่ error
  // -----------------------------------------------------------------------
  @Test
  public void testVariableDeclaredInExterns_UsedInJs_NoError() {
    JSError[] errors = compileForErrors("var window;", "window.foo = 1;");
    assertEquals(0, errors.length);
  }

  // -----------------------------------------------------------------------
  // 5) NameRefInExternsCheck: case GETPROP, n เป็น firstChild, var == null
  //    -> UNDEFINED_EXTERN_VAR_ERROR (warning)
  // -----------------------------------------------------------------------
  @Test
  public void testUndefinedGetpropInExterns_ReportsUndefinedExternVarWarning() {
    JSError[] warnings = compileForWarnings("a.b;", "var y;");
    assertTrue(containsError(warnings, VarCheck.UNDEFINED_EXTERN_VAR_ERROR));
  }

  // -----------------------------------------------------------------------
  // 6) NameRefInExternsCheck: default case ของ switch (ไม่ใช่ VAR/FUNCTION/LP/GETPROP)
  //    -> NAME_REFERENCE_IN_EXTERNS_ERROR (warning)
  // -----------------------------------------------------------------------
  @Test
  public void testBareNameReferenceInExterns_ReportsNameReferenceWarning() {
    JSError[] warnings = compileForWarnings("foo;", "var y;");
    assertTrue(containsError(warnings, VarCheck.NAME_REFERENCE_IN_EXTERNS_ERROR));
  }

  // -----------------------------------------------------------------------
  // 7) ตัวแปรที่ถูกเติมใน varsToDeclareInExterns จาก externs แล้วถูกประกาศจริงด้วย var
  //    -> branch (parent.getType()==VAR && varsToDeclareInExterns.contains(varName))
  //       ต้อง createSynthesizedExternVar และไม่รายงาน UNDEFINED_VAR_ERROR ซ้ำ
  // -----------------------------------------------------------------------
  @Test
  public void testVarDeclaredAfterUndefinedExternReference_NoUndefinedVarError() {
    JSError[] errors = compileForErrors("bar.baz;", "var bar; bar = 1;");
    assertFalse(containsError(errors, VarCheck.UNDEFINED_VAR_ERROR));
  }

  // -----------------------------------------------------------------------
  // 8) Boundary: source ว่างทั้งหมด -> ไม่มี NAME node เลย ไม่มี error
  // -----------------------------------------------------------------------
  @Test
  public void testEmptySource_NoError() {
    JSError[] errors = compileForErrors("", "");
    assertEquals(0, errors.length);
  }

  // -----------------------------------------------------------------------
  // 9) Module dependency ถูกประกาศถูกต้อง
  //    (branch: moduleGraph.dependsOn(currModule, varModule) == true)
  // -----------------------------------------------------------------------
  @Test
  public void testModuleDependencyDeclaredCorrectly_NoError() {
    JSModule moduleA = new JSModule("A");
    moduleA.add(SourceFile.fromCode("a.js", "var x = 1;"));

    JSModule moduleB = new JSModule("B");
    moduleB.addDependency(moduleA); // B ขึ้นกับ A -> A โหลดก่อน B
    moduleB.add(SourceFile.fromCode("b.js", "x = 2;"));

    List<SourceFile> externs = Lists.newArrayList();
    List<JSModule> modules = Lists.newArrayList(moduleA, moduleB);

    compiler.compileModules(externs, modules, options);

    JSError[] errors = compiler.getErrors();
    assertFalse(containsError(errors, VarCheck.VIOLATED_MODULE_DEP_ERROR));
  }

  // -----------------------------------------------------------------------
  // 10) การอ้างอิงข้าม module ผิดทิศทาง (global scope)
  //     (branch: dependsOn(curr,var)==false, scope.isGlobal()==true,
  //              dependsOn(var,curr)==true -> VIOLATED_MODULE_DEP_ERROR)
  // -----------------------------------------------------------------------
  @Test
  public void testViolatedModuleDependency_ReportsError() {
    JSModule moduleA = new JSModule("A");
    moduleA.add(SourceFile.fromCode("a.js", "x = 2;")); // ใช้ x ก่อน B ประกาศ

    JSModule moduleB = new JSModule("B");
    moduleB.addDependency(moduleA); // B ขึ้นกับ A
    moduleB.add(SourceFile.fromCode("b.js", "var x = 1;"));

    List<SourceFile> externs = Lists.newArrayList();
    List<JSModule> modules = Lists.newArrayList(moduleA, moduleB);

    compiler.compileModules(externs, modules, options);

    JSError[] errors = compiler.getErrors();
    assertTrue(containsError(errors, VarCheck.VIOLATED_MODULE_DEP_ERROR));
  }

  // -----------------------------------------------------------------------
  // 11) ไม่มี dependency ระหว่าง module เลย
  //     (branch: dependsOn(curr,var)==false, dependsOn(var,curr)==false
  //              -> MISSING_MODULE_DEP_ERROR)
  // -----------------------------------------------------------------------
  @Test
  public void testNoModuleRelationship_ReportsMissingDependencyWarning() {
    JSModule moduleA = new JSModule("A");
    moduleA.add(SourceFile.fromCode("a.js", "var x = 1;"));

    JSModule moduleB = new JSModule("B");
    // ไม่ประกาศ dependency ระหว่าง A กับ B เลย
    moduleB.add(SourceFile.fromCode("b.js", "x = 2;"));

    List<SourceFile> externs = Lists.newArrayList();
    List<JSModule> modules = Lists.newArrayList(moduleA, moduleB);

    compiler.compileModules(externs, modules, options);

    JSError[] warnings = compiler.getWarnings();
    assertTrue(containsError(warnings, VarCheck.MISSING_MODULE_DEP_ERROR));
  }

  // -----------------------------------------------------------------------
  // 12) การอ้างอิงข้าม module เกิดใน local scope (scope.isGlobal() == false)
  //     -> เข้า branch STRICT_MODULE_DEP_ERROR (disabled by default) แทนที่จะเป็น
  //     VIOLATED/MISSING ใช้ยืนยันว่าไม่ถูกจัดเป็นสอง error ประเภทนั้น
  // -----------------------------------------------------------------------
  @Test
  public void testLocalScopeCrossModuleReference_NotViolatedOrMissing() {
    JSModule moduleA = new JSModule("A");
    moduleA.add(SourceFile.fromCode("a.js", "var x = 1;"));

    JSModule moduleB = new JSModule("B");
    moduleB.add(SourceFile.fromCode("b.js", "function f() { x = 2; } f();"));

    List<SourceFile> externs = Lists.newArrayList();
    List<JSModule> modules = Lists.newArrayList(moduleA, moduleB);

    compiler.compileModules(externs, modules, options);

    JSError[] errors = compiler.getErrors();
    JSError[] warnings = compiler.getWarnings();
    assertFalse(containsError(errors, VarCheck.VIOLATED_MODULE_DEP_ERROR));
    assertFalse(containsError(warnings, VarCheck.MISSING_MODULE_DEP_ERROR));
  }

  // -----------------------------------------------------------------------
  // 13) หมายเหตุ (ไม่ได้เขียนเทส): sanityCheck == true + ตัวแปรไม่ประกาศ ควร throw
  //     IllegalStateException แต่ต้องสร้าง Node/Scope/CompilerInput ให้ครบผ่าน
  //     internal API ที่ไม่มั่นใจ จึงไม่เขียนเทสเพื่อไม่เดา behavior
  //
  // 14) หมายเหตุ (ไม่ได้เขียนเทส): branch INVALID_FUNCTION_DECL (ชื่อฟังก์ชันว่าง
  //     และไม่ใช่ function expression) เป็น parser edge case ของ Rhino ที่ไม่
  //     สามารถสร้างผ่าน JS source ปกติได้อย่างแน่ใจ
  // -----------------------------------------------------------------------
}
```

## ตารางสรุป Test Method ↔ Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDeclaredVariable_NoError` | `var != null` และ `currInput == varInput` → return โดยไม่ error |
| `testUndeclaredVariable_ReportsUndefinedVarError` | `var == null`, ไม่ใช่ function expression, `sanityCheck == false` → `UNDEFINED_VAR_ERROR` + synthesize |
| `testAnonymousFunctionExpression_NoError` | `varName.isEmpty()==true` และ `isFunctionExpression(parent)==true` → skip |
| `testVariableDeclaredInExterns_UsedInJs_NoError` | `currInput != varInput`, `currModule==null`, `varModule==null` → ข้าม module check |
| `testUndefinedGetpropInExterns_ReportsUndefinedExternVarWarning` | `NameRefInExternsCheck` case `GETPROP`, `var==null` → `UNDEFINED_EXTERN_VAR_ERROR` |
| `testBareNameReferenceInExterns_ReportsNameReferenceWarning` | `NameRefInExternsCheck` default case → `NAME_REFERENCE_IN_EXTERNS_ERROR` |
| `testVarDeclaredAfterUndefinedExternReference_NoUndefinedVarError` | `parent.getType()==VAR && varsToDeclareInExterns.contains(varName)` → duplicate/suppression branch |
| `testEmptySource_NoError` | Boundary: ไม่มี NAME node → ไม่ trigger branch ใด ๆ |
| `testModuleDependencyDeclaredCorrectly_NoError` | `dependsOn(currModule,varModule)==true` |
| `testViolatedModuleDependency_ReportsError` | `dependsOn(curr,var)==false`, `scope.isGlobal()==true`, `dependsOn(var,curr)==true` → `VIOLATED_MODULE_DEP_ERROR` |
| `testNoModuleRelationship_ReportsMissingDependencyWarning` | `dependsOn(curr,var)==false`, `dependsOn(var,curr)==false` → `MISSING_MODULE_DEP_ERROR` |
| `testLocalScopeCrossModuleReference_NotViolatedOrMissing` | `scope.isGlobal()==false` → เข้า branch `STRICT_MODULE_DEP_ERROR` (ไม่ใช่ VIOLATED/MISSING) |
| (หมายเหตุ #13, #14 ในโค้ด) | ไม่ครอบคลุม: `sanityCheck` throw `IllegalStateException`, `INVALID_FUNCTION_DECL` — ระบุเหตุผลไว้เพื่อไม่เดา behavior |