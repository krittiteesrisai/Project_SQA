package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link CrossModuleMethodMotion}.
 *
 * หมายเหตุ: บาง branch ภายใน moveMethods() ขึ้นกับ internal behavior ของ
 * AnalyzePrototypeProperties ซึ่งไม่มีรายละเอียดใน source ที่ให้มา
 * กรณีที่ไม่สามารถยืนยันได้แน่นอนจะระบุคอมเมนต์กำกับไว้ในแต่ละเทส
 */
public class CrossModuleMethodMotionTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private CompilerOptions createOptions() {
    CompilerOptions options = new CompilerOptions();
    options.setCrossModuleMethodMotion(true);
    return options;
  }

  private JSModule[] createModuleChain(String... sources) {
    JSModule[] modules = new JSModule[sources.length];
    for (int i = 0; i < sources.length; i++) {
      modules[i] = new JSModule("m" + i);
      modules[i].add(SourceFile.fromCode("i" + i + ".js", sources[i]));
      if (i > 0) {
        modules[i].addDependency(modules[i - 1]);
      }
    }
    return modules;
  }

  private Result compileModules(String... sources) {
    JSModule[] modules = createModuleChain(sources);
    List<SourceFile> externs = Lists.newArrayList();
    return compiler.compileModules(
        externs, Lists.newArrayList(modules), createOptions());
  }

  // ---------------------------------------------------------------------
  // Boundary: จำนวน module <= 1 -> process() ต้องเป็น no-op
  // (ครอบคลุมเงื่อนไข moduleGraph.getModuleCount() > 1 == false)
  // ---------------------------------------------------------------------
  @Test
  public void testSingleModule_NoMotionOccurs() {
    Result result = compileModules(
        "function Foo() {} Foo.prototype.bar = function() { return 1; };"
            + "(new Foo()).bar();");
    assertTrue(result.success);

    String out = compiler.toSource();
    assertFalse(out.contains(CrossModuleMethodMotion.STUB_METHOD_NAME));
    assertFalse(out.contains(CrossModuleMethodMotion.UNSTUB_METHOD_NAME));
  }

  // ---------------------------------------------------------------------
  // Boundary: ไม่มี module graph เลย (ใช้ compile() ธรรมดา)
  // ครอบคลุมกรณี moduleGraph == null (หรือเทียบเท่าไม่ผ่านเงื่อนไข AND แรก)
  // NOTE: เราไม่ยืนยัน internal state ของ moduleGraph โดยตรง (private field)
  // แต่ตรวจผลลัพธ์ที่สังเกตได้ (ไม่มีการ stub/unstub เกิดขึ้น)
  // ---------------------------------------------------------------------
  @Test
  public void testNoModuleGraph_NoMotionOccurs() {
    CompilerOptions options = createOptions();
    List<SourceFile> externs = Lists.newArrayList();
    List<SourceFile> inputs = Lists.newArrayList(
        SourceFile.fromCode(
            "input.js",
            "function Foo() {} Foo.prototype.bar = function() { return 1; };"
                + "(new Foo()).bar();"));
    Result result = compiler.compile(externs, inputs, options);
    assertTrue(result.success);

    String out = compiler.toSource();
    assertFalse(out.contains(CrossModuleMethodMotion.STUB_METHOD_NAME));
  }

  // ---------------------------------------------------------------------
  // Happy path: มี 2 module (boundary ค่าต่ำสุดที่ผ่านเงื่อนไข > 1)
  // เมธอด bar ถูกอ้างอิงใน module ที่ลึกกว่า -> ต้องถูก stub/unstub
  // ครอบคลุม: isReferenced()==true, readsClosureVariables()==false,
  // deepestCommonModuleRef != null, symbol instanceof Property == true,
  // dependsOn(...) && value.isFunction() == true,
  // valueParent ไม่ใช่ getter/setter,
  // และ branch สุดท้าย (!hasStubDeclaration && hasGeneratedAnyIds())==true
  // ---------------------------------------------------------------------
  @Test
  public void testMethodMovedToDeeperModule() {
    JSModule[] modules = createModuleChain(
        "function Foo() {} Foo.prototype.bar = function() { return 1; };",
        "(new Foo()).bar();");
    List<SourceFile> externs = Lists.newArrayList();
    Result result = compiler.compileModules(
        externs, Lists.newArrayList(modules), createOptions());
    assertTrue(result.success);

    String out0 = compiler.toSource(modules[0]);
    String out1 = compiler.toSource(modules[1]);

    assertTrue(out0.contains(CrossModuleMethodMotion.STUB_METHOD_NAME));
    assertTrue(out1.contains(CrossModuleMethodMotion.UNSTUB_METHOD_NAME));
  }

  // ---------------------------------------------------------------------
  // STUB_DECLARATIONS ต้องถูกแทรกเมื่อมีการสร้าง id จริง
  // ครอบคลุม branch: !hasStubDeclaration && idGenerator.hasGeneratedAnyIds()
  // ---------------------------------------------------------------------
  @Test
  public void testStubDeclarationsInsertedWhenIdsGenerated() {
    JSModule[] modules = createModuleChain(
        "function Foo() {} Foo.prototype.bar = function() { return 1; };",
        "(new Foo()).bar();");
    List<SourceFile> externs = Lists.newArrayList();
    Result result = compiler.compileModules(
        externs, Lists.newArrayList(modules), createOptions());
    assertTrue(result.success);

    String full = compiler.toSource();
    assertTrue(full.contains("JSCompiler_stubMap"));
  }

  // ---------------------------------------------------------------------
  // property ที่ไม่ถูกอ้างอิงเลย -> nameInfo.isReferenced() == false -> continue
  // ---------------------------------------------------------------------
  @Test
  public void testUnreferencedPropertyIsNotMoved() {
    JSModule[] modules = createModuleChain(
        "function Foo() {} Foo.prototype.bar = function() { return 1; };",
        "var x = 1;");
    List<SourceFile> externs = Lists.newArrayList();
    Result result = compiler.compileModules(
        externs, Lists.newArrayList(modules), createOptions());
    assertTrue(result.success);

    String out0 = compiler.toSource(modules[0]);
    assertFalse(out0.contains(CrossModuleMethodMotion.STUB_METHOD_NAME));
  }

  // ---------------------------------------------------------------------
  // ฟังก์ชันที่อ่าน closure variable -> readsClosureVariables()==true -> continue
  // ---------------------------------------------------------------------
  @Test
  public void testClosureVariableReadDisablesMotion() {
    JSModule[] modules = createModuleChain(
        "function Foo() {}"
            + "(function() {"
            + "  var x = 1;"
            + "  Foo.prototype.bar = function() { return x; };"
            + "})();",
        "(new Foo()).bar();");
    List<SourceFile> externs = Lists.newArrayList();
    Result result = compiler.compileModules(
        externs, Lists.newArrayList(modules), createOptions());
    assertTrue(result.success);

    String out0 = compiler.toSource(modules[0]);
    assertFalse(out0.contains(CrossModuleMethodMotion.STUB_METHOD_NAME));
  }

  // ---------------------------------------------------------------------
  // getter (ES5 get syntax) ต้องไม่ถูก stub
  // ครอบคลุม branch: valueParent.isGetterDef() || valueParent.isSetterDef() == true
  // NOTE: เราไม่สามารถยืนยัน 100% ว่า AnalyzePrototypeProperties ส่ง getter
  // เข้ามาเป็น Property เสมอ (ไม่มี source ให้ตรวจ) จึงยืนยันเพียงผลลัพธ์
  // ที่สังเกตได้ (ไม่มีการ stub เกิดขึ้นกับ getter)
  // ---------------------------------------------------------------------
  @Test
  public void testGetterIsNotMoved() {
    CompilerOptions options = createOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    JSModule[] modules = createModuleChain(
        "function Foo() {} Foo.prototype = { get bar() { return 1; } };",
        "(new Foo()).bar;");
    List<SourceFile> externs = Lists.newArrayList();
    Result result = compiler.compileModules(
        externs, Lists.newArrayList(modules), options);
    assertTrue(result.success);

    String out0 = compiler.toSource(modules[0]);
    assertFalse(out0.contains(CrossModuleMethodMotion.STUB_METHOD_NAME));
  }

  // ---------------------------------------------------------------------
  // best-effort: symbol ที่ไม่ใช่ Property (เช่น global function ชื่อเดียวกัน)
  // ต้องไม่ทำให้ loop พัง และ Property จริงยังถูก stub ตามปกติ
  // ครอบคลุม branch: !(symbol instanceof Property) -> continue
  // NOTE: ไม่มี source ของ AnalyzePrototypeProperties ให้ยืนยันการจับกลุ่ม
  // NameInfo ระหว่างชื่อ global กับ prototype property จึงถือเป็น best-effort
  // ---------------------------------------------------------------------
  @Test
  public void testMixedGlobalAndPrototypeSymbolsUnderSameName() {
    JSModule[] modules = createModuleChain(
        "function bar() { return 0; }"
            + "function Foo() {} Foo.prototype.bar = function() { return 1; };"
            + "bar();",
        "(new Foo()).bar();");
    List<SourceFile> externs = Lists.newArrayList();
    Result result = compiler.compileModules(
        externs, Lists.newArrayList(modules), createOptions());
    assertTrue(result.success);

    String out0 = compiler.toSource(modules[0]);
    assertTrue(out0.contains(CrossModuleMethodMotion.STUB_METHOD_NAME));
  }

  // ---------------------------------------------------------------------
  // ค่าว่าง/boundary: source เป็น empty string ทั้งสอง module
  // ครอบคลุม: for loop บน allNameInfo ที่ไม่มี item ให้ iterate,
  // และ branch สุดท้าย (hasGeneratedAnyIds()==false) -> ไม่แทรก STUB_DECLARATIONS
  // ---------------------------------------------------------------------
  @Test
  public void testEmptySourcesDoNotThrow() {
    Result result = compileModules("", "");
    assertTrue(result.success);

    String out = compiler.toSource();
    assertFalse(out.contains("JSCompiler_stubMap"));
  }

  // ---------------------------------------------------------------------
  // อินพุตผิดรูปแบบ (syntax error) -> compile ล้มเหลวก่อนถึง process()
  // ---------------------------------------------------------------------
  @Test
  public void testSyntaxErrorDoesNotCrashPass() {
    Result result = compileModules(
        "function Foo() {", // ฟังก์ชันไม่สมบูรณ์ -> syntax error
        "(new Foo()).bar();");
    assertFalse(result.success);
  }

  // ---------------------------------------------------------------------
  // IdGenerator: unit test ตรง ๆ ตาม source (currentId เริ่มที่ 0)
  // ---------------------------------------------------------------------
  @Test
  public void testIdGeneratorInitialState() {
    IdGenerator idGen = new IdGenerator();
    assertFalse(idGen.hasGeneratedAnyIds());
  }

  @Test
  public void testIdGeneratorNewIdIncrementsAndFlagsGenerated() {
    IdGenerator idGen = new IdGenerator();
    assertEquals(0, idGen.newId());
    assertTrue(idGen.hasGeneratedAnyIds());
    assertEquals(1, idGen.newId());
    assertEquals(2, idGen.newId());
  }

  // NOTE: branch ที่ deepestCommonModuleRef == null (นำไปสู่การ report
  // NULL_COMMON_MODULE_ERROR) ไม่สามารถสร้างสถานการณ์ให้เกิดขึ้นได้อย่าง
  // น่าเชื่อถือผ่าน public Compiler API เพียงอย่างเดียว เนื่องจาก
  // JSModuleGraph ปกติจะเป็นกราฟที่เชื่อมต่อกันเสมอ (มี common ancestor)
  // จึงไม่เขียนเทสสำหรับ branch นี้ตามข้อกำหนดห้ามเดา behavior
}
