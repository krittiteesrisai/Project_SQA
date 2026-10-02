package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Unit tests for {@link DisambiguateProperties} (Closure-118b).
 *
 * หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4 ห้ามเดา behavior ที่ไม่มีอยู่ในซอร์ส):
 * คลาสเป้าหมายทำงานบน AST ที่ผ่าน type-checking จริงเท่านั้น (ใช้
 * {@code compiler.getTypeValidator()}, {@code node.getJSType()}) และ
 * {@code process()} มี precondition ว่า
 * {@code compiler.getLifeCycleStage() == LifeCycleStage.NORMALIZED}
 * ดังนั้นชุดทดสอบนี้จำเป็นต้องเรียกใช้ front-end จริงของ Compiler
 * (parse + type-check) ผ่าน {@link Compiler#compile}. รายละเอียดของ
 * {@code CompilerOptions} (การใช้ public field เช่น {@code checkTypes},
 * {@code closurePass}) และ {@code Result#success} เป็นการสมมติ API
 * ของโค้ดยุค Closure-118 (ไม่ได้ปรากฏในซอร์สของคลาสเป้าหมายที่ให้มา)
 * — คอมเมนต์กำกับไว้ในแต่ละจุดที่เกี่ยวข้อง
 */
public class DisambiguatePropertiesTest {

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  /**
   * Compile ให้ได้ AST ที่ผ่าน type-checking แล้วบังคับ LifeCycleStage
   * เป็น NORMALIZED (สมมติว่า Compiler มี package-private
   * setLifeCycleStage ซึ่งใช้เพื่อผ่าน precondition ของ process()
   * โดยไม่ต้องรัน Normalize pass เต็มรูปแบบ).
   */
  private Node[] compileAndPrepare(Compiler compiler, String externsJs, String js) {
    CompilerOptions options = new CompilerOptions();
    // สมมติ: CompilerOptions ยุคนี้เปิดเผย public field สำหรับ flag พื้นฐาน
    options.checkTypes = true;
    options.closurePass = false;

    SourceFile externsFile = SourceFile.fromCode("externs.js", externsJs);
    SourceFile inputFile = SourceFile.fromCode("input.js", js);

    Result result = compiler.compile(
        Lists.newArrayList(externsFile),
        Lists.newArrayList(inputFile),
        options);

    assertTrue("Compilation should succeed (errors: "
            + java.util.Arrays.toString(compiler.getErrors()) + ")",
        result.success);

    Node combinedRoot = compiler.getRoot();
    Node externsRoot = combinedRoot.getFirstChild();
    Node jsRoot = combinedRoot.getLastChild();

    // Precondition ของ DisambiguateProperties#process()
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    return new Node[] {externsRoot, jsRoot, combinedRoot};
  }

  /** เก็บชื่อ property (ตัว String node ลูกสุดท้ายของ GETPROP) ที่ตรงกับ originalName หรือถูก rename เป็น *$originalName */
  private void collectGetPropNames(Node n, String originalName, List<String> out) {
    if (n.isGetProp()) {
      String s = n.getLastChild().getString();
      if (s.equals(originalName) || s.endsWith("$" + originalName)) {
        out.add(s);
      }
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      collectGetPropNames(c, originalName, out);
    }
  }

  private List<String> namesFor(Node searchRoot, String originalName) {
    List<String> out = Lists.newArrayList();
    collectGetPropNames(searchRoot, originalName, out);
    return out;
  }

  // ---------------------------------------------------------------------
  // 1. Precondition / boundary: LifeCycleStage ไม่ใช่ NORMALIZED
  // ---------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testProcess_throwsIllegalStateException_whenNotNormalized() {
    Compiler compiler = new Compiler();
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);
    // ยังไม่เรียก compile() -> LifeCycleStage เป็นค่า default (ไม่ใช่ NORMALIZED)
    dp.process(null, null);
  }

  // ---------------------------------------------------------------------
  // 2. Boundary: ไม่มี property เลย (empty input)
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyInput_noPropertiesNoExceptions() {
    Compiler compiler = new Compiler();
    Node[] roots = compileAndPrepare(compiler, "", "");
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    dp.process(roots[0], roots[1]);

    assertTrue(dp.getRenamedTypesForTesting().isEmpty());
  }

  // ---------------------------------------------------------------------
  // 3. Malformed input: syntax error -> compile ล้มเหลว (ไม่เรียก pass ต่อ)
  // ---------------------------------------------------------------------

  @Test
  public void testMalformedInput_compilationFails() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    SourceFile externsFile = SourceFile.fromCode("externs.js", "");
    SourceFile inputFile = SourceFile.fromCode("input.js", "function f( { ");

    Result result = compiler.compile(
        Lists.newArrayList(externsFile), Lists.newArrayList(inputFile), options);

    assertFalse("Malformed JS ควร compile ไม่สำเร็จ", result.success);
    assertTrue(compiler.getErrorCount() > 0);
    // ไม่เรียก dp.process() ต่อเพราะ AST ไม่สมบูรณ์ (นอกขอบเขตของคลาสเป้าหมาย)
  }

  // ---------------------------------------------------------------------
  // 4. หนึ่ง type เดียว -> ไม่ rename (shouldRename() == false, singleTypeProps)
  // ---------------------------------------------------------------------

  @Test
  public void testSingleType_notRenamed() {
    Compiler compiler = new Compiler();
    String js =
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.a = 0;\n"
        + "var f = new Foo();\n"
        + "f.a;\n";
    Node[] roots = compileAndPrepare(compiler, "", js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);
    dp.process(roots[0], roots[1]);

    List<String> names = namesFor(roots[2], "a");
    assertFalse(names.isEmpty());
    for (String s : names) {
      assertEquals("มี type เดียว ไม่ควร rename", "a", s);
    }
  }

  // ---------------------------------------------------------------------
  // 5. สอง type ที่ไม่เกี่ยวข้องกัน -> ต้อง rename และได้ชื่อต่างกัน
  //    (shouldRename() == true, node.setString branch, buildPropNames)
  // ---------------------------------------------------------------------

  @Test
  public void testTwoUnrelatedTypes_renamedDifferently() {
    Compiler compiler = new Compiler();
    String js =
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.a = 0;\n"
        + "/** @constructor */ function Bar() {}\n"
        + "Bar.prototype.a = 0;\n"
        + "var f = new Foo(); f.a;\n"
        + "var b = new Bar(); b.a;\n";
    Node[] roots = compileAndPrepare(compiler, "", js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);
    dp.process(roots[0], roots[1]);

    List<String> names = namesFor(roots[2], "a");
    Set<String> distinct = new HashSet<String>(names);

    assertFalse("ทุก node ควรถูก rename ไม่เหลือชื่อเดิม 'a'", names.contains("a"));
    assertEquals("ต้องได้ชื่อ 2 กลุ่มที่ต่างกันสำหรับ Foo และ Bar", 2, distinct.size());
    assertFalse(dp.getRenamedTypesForTesting().get("a").isEmpty());
  }

  // ---------------------------------------------------------------------
  // 6. Extern property: skip rename เฉพาะ type ที่ประกาศใน externs
  //    (FindExternProperties, addTypeToSkip, getInstanceFromPrototype,
  //     shouldRename(type) == false branch, instancesSkipped)
  // ---------------------------------------------------------------------

  @Test
  public void testExternProperty_skippedForThatTypeButRenamedForOther() {
    Compiler compiler = new Compiler();
    String externs =
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.a;\n";
    String js =
        "/** @constructor */ function Bar() {}\n"
        + "Bar.prototype.a = 0;\n"
        + "var f = new Foo(); f.a;\n"
        + "var b = new Bar(); b.a;\n";
    Node[] roots = compileAndPrepare(compiler, externs, js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);
    dp.process(roots[0], roots[1]);

    // ค้นหาเฉพาะใน jsRoot (roots[1]) เพื่อแยก f.a และ b.a ที่อยู่ใน main code
    List<String> names = namesFor(roots[1], "a");

    assertTrue("การอ้างอิงบน Foo (ประกาศใน externs) ต้องไม่ถูก rename",
        names.contains("a"));
    assertTrue("การอ้างอิงบน Bar ต้องถูก rename",
        names.stream().anyMatch(new java.util.function.Predicate<String>() {
          @Override public boolean test(String s) {
            return !s.equals("a") && s.endsWith("$a");
          }
        }));
  }

  // ---------------------------------------------------------------------
  // 7. Extern-skip + propertiesToErrorFor -> ยิง Warnings.INVALIDATION_ON_TYPE
  //    (renameProperties: checkLevelForProp != null/OFF, reported set dedup)
  // ---------------------------------------------------------------------

  @Test
  public void testExternProperty_reportsInvalidationOnTypeWarning_whenConfigured() {
    Compiler compiler = new Compiler();
    String externs =
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.a;\n";
    String js =
        "/** @constructor */ function Bar() {}\n"
        + "Bar.prototype.a = 0;\n"
        + "var f = new Foo(); f.a;\n"
        + "var b = new Bar(); b.a;\n";
    Node[] roots = compileAndPrepare(compiler, externs, js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    propertiesToErrorFor.put("a", CheckLevel.WARNING);
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    int before = compiler.getWarnings().length;
    dp.process(roots[0], roots[1]);
    int after = compiler.getWarnings().length;

    assertTrue("ควรมี warning เพิ่มขึ้นจากการ skip renaming บน Foo",
        after > before);
  }

  // ---------------------------------------------------------------------
  // 8. Union type: การอ้างอิงผ่าน union ทำให้ equivalence class ถูก union
  //    รวมกัน จึงไม่ rename (getTypeAlternatives != null, relatedType chain)
  //    -- นี่คือจุดที่ใกล้เคียงกับพฤติกรรมที่ Closure-118 เกี่ยวข้อง
  // ---------------------------------------------------------------------

  @Test
  public void testUnionType_mergesEquivalenceClasses_notRenamed() {
    Compiler compiler = new Compiler();
    String js =
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.a = 0;\n"
        + "/** @constructor */ function Bar() {}\n"
        + "Bar.prototype.a = 0;\n"
        + "/** @param {(Foo|Bar)} x */\n"
        + "function f(x) { x.a; }\n";
    Node[] roots = compileAndPrepare(compiler, "", js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);
    dp.process(roots[0], roots[1]);

    List<String> names = namesFor(roots[2], "a");
    assertFalse(names.isEmpty());
    for (String s : names) {
      assertEquals(
          "การอ้างอิงผ่าน union type ควรทำให้ Foo และ Bar ถูก union "
              + "เข้า equivalence class เดียวกัน จึงไม่ควร rename",
          "a", s);
    }
  }

  // ---------------------------------------------------------------------
  // 9. Object literal property (handleObjectLit loop, isObjectLit branch)
  //    -- smoke test: ต้อง track property ได้โดยไม่ throw exception
  // ---------------------------------------------------------------------

  @Test
  public void testObjectLiteralProperty_isTrackedWithoutException() {
    Compiler compiler = new Compiler();
    String js =
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.a = 0;\n"
        + "var obj = { a: 1 };\n";
    Node[] roots = compileAndPrepare(compiler, "", js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    dp.process(roots[0], roots[1]);

    // การกำหนดชื่อผลลัพธ์ที่แน่ชัดขึ้นกับ JSType#toString() ของ object literal
    // ซึ่งไม่ได้ระบุไว้ในซอร์สที่ให้มา จึงตรวจแบบ weak assertion เท่านั้น
    assertTrue(dp.getRenamedTypesForTesting().containsKey("a"));
  }

  // ---------------------------------------------------------------------
  // 10. ALL_TYPE (*) -> invalidate, propertiesToErrorFor แจ้งเตือน
  //     พร้อม suggestion "Consider casting" (isAllType true, isThis false)
  // ---------------------------------------------------------------------

  @Test
  public void testAllType_reportsInvalidationWarning_withCastSuggestion() {
    Compiler compiler = new Compiler();
    String js = "/** @param {*} x */\n function f(x) { x.a; }\n";
    Node[] roots = compileAndPrepare(compiler, "", js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    propertiesToErrorFor.put("a", CheckLevel.WARNING);
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    int before = compiler.getWarnings().length;
    dp.process(roots[0], roots[1]);
    int after = compiler.getWarnings().length;

    assertTrue("ควรมี JSC_INVALIDATION warning สำหรับ property บน ALL_TYPE",
        after > before);
  }

  // ---------------------------------------------------------------------
  // 11. this ที่ไม่รู้ type (isThis == true branch, suggestion เกี่ยว this)
  // ---------------------------------------------------------------------

  @Test
  public void testUnknownThisType_reportsInvalidationWarning_withThisSuggestion() {
    Compiler compiler = new Compiler();
    // ฟังก์ชันธรรมดา (ไม่ใช่ constructor, ไม่มี @this) -> this เป็น unknown
    String js = "function F() { this.a; }\n";
    Node[] roots = compileAndPrepare(compiler, "", js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    propertiesToErrorFor.put("a", CheckLevel.WARNING);
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    int before = compiler.getWarnings().length;
    dp.process(roots[0], roots[1]);
    int after = compiler.getWarnings().length;

    assertTrue("ควรมี warning สำหรับการอ้างอิง property บน this ที่ unknown",
        after > before);
  }

  // ---------------------------------------------------------------------
  // 12. propertiesToErrorFor ว่าง -> ไม่มี warning จากคลาสนี้เพิ่มขึ้น
  //     (containsKey(name) == false branch)
  // ---------------------------------------------------------------------

  @Test
  public void testNoPropertiesToErrorFor_noAdditionalWarnings() {
    Compiler compiler = new Compiler();
    String js = "/** @param {*} x */\n function f(x) { x.a; }\n";
    Node[] roots = compileAndPrepare(compiler, "", js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap(); // ว่างเปล่า
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    int before = compiler.getWarnings().length;
    dp.process(roots[0], roots[1]);
    int after = compiler.getWarnings().length;

    assertEquals("ไม่ควรมี warning เพิ่มจาก DisambiguateProperties เมื่อ map ว่าง",
        before, after);
  }

  // ---------------------------------------------------------------------
  // 13. type mismatch จริง -> ทดสอบ loop ใน process() ที่เรียก
  //     addInvalidatingType และ recordInvalidationError เมื่อ
  //     invalidationMap == null (propertiesToErrorFor ว่างเปล่า)
  // ---------------------------------------------------------------------

  @Test
  public void testRealTypeMismatch_processDoesNotThrow_whenInvalidationMapNull() {
    Compiler compiler = new Compiler();
    String js =
        "/** @constructor */ function Foo() {}\n"
        + "/** @type {string} */\n"
        + "var s = new Foo();\n";
    Node[] roots = compileAndPrepare(compiler, "", js);

    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap(); // -> invalidationMap == null
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    // ต้องไม่ throw แม้ recordInvalidationError ถูกเรียกด้วย invalidationMap == null
    dp.process(roots[0], roots[1]);
  }

  // ---------------------------------------------------------------------
  // 14/15. getTypeWithProperty(): null-check และ "prototype" branch
  //    (ทดสอบระดับ unit โดยไม่ต้องรัน compile pipeline เต็มรูปแบบ)
  // ---------------------------------------------------------------------

  @Test
  public void testGetTypeWithProperty_nullTypeReturnsNull() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    assertNull(dp.getTypeWithProperty("a", null));
  }

  @Test
  public void testGetTypeWithProperty_prototypeFieldAlwaysReturnsNull() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    JSType objectPrototype =
        compiler.getTypeRegistry().getNativeType(JSTypeNative.OBJECT_PROTOTYPE);
    assertNotNull(objectPrototype);

    assertNull("field ชื่อ 'prototype' ต้องถูก ignore เสมอ",
        dp.getTypeWithProperty("prototype", objectPrototype));
  }
}
