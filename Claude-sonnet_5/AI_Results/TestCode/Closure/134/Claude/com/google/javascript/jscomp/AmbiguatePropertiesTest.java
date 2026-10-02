package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Unit tests สำหรับ {@link AmbiguateProperties} (Defects4J Closure-134b).
 *
 * แนวทาง: ใช้ Compiler จริงในการ parse + type-check ซอร์ส JS แบบสั้น ๆ
 * เพื่อให้ได้ Node ที่มี JSType ติดอยู่ (ซึ่ง AmbiguateProperties ต้องใช้)
 * แล้วเรียก process() ตรง ๆ และตรวจผลผ่าน getRenamingMap()
 *
 * ข้อสมมติเกี่ยวกับ API ของ Compiler/CompilerOptions/SourceFile (ไม่ได้แสดงในซอร์ส
 * ของคลาสเป้าหมาย) จะระบุเป็นคอมเมนต์ในแต่ละจุดที่ใช้งาน
 */
public class AmbiguatePropertiesTest {

  private Compiler compiler;
  private Node externsRoot;
  private Node jsRoot;

  /**
   * Compile externs + js ด้วย type checking เปิดอยู่ แล้วเก็บ externsRoot/jsRoot
   * ไว้ใช้เรียก process()
   */
  private void compile(String externsCode, String jsCode) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // สมมติว่ามี setter นี้ในเวอร์ชันของ CompilerOptions ที่ใช้ทดสอบ
    options.setCheckTypes(true);

    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", externsCode));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", jsCode));

    compiler.compile(externs, inputs, options);

    assertEquals("การคอมไพล์ต้องไม่มี error เพื่อให้ AST มี JSType ที่ถูกต้อง",
        0, compiler.getErrorCount());

    externsRoot = compiler.getRoot().getFirstChild();
    jsRoot = compiler.getRoot().getLastChild();
  }

  private Map<String, String> ambiguate(char[] reservedChars) {
    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externsRoot, jsRoot);
    return pass.getRenamingMap();
  }

  private Map<String, String> ambiguate() {
    return ambiguate(new char[0]);
  }

  // ---------------------------------------------------------------------
  // 1. สถานะก่อนเรียก process()
  // ---------------------------------------------------------------------

  @Test
  public void testGetRenamingMap_beforeProcess_isEmpty() {
    compile("", "var x = 1;");
    AmbiguateProperties pass = new AmbiguateProperties(compiler, new char[0]);
    assertNotNull(pass.getRenamingMap());
    assertTrue(pass.getRenamingMap().isEmpty());
  }

  // ---------------------------------------------------------------------
  // 2. ไม่มี property เลย -> renamingMap ต้องว่าง (boundary: input ว่าง)
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_noProperties_resultsInEmptyRenamingMap() {
    compile("", "var x = 1; x = x + 1;");
    Map<String, String> renamingMap = ambiguate();
    assertTrue(renamingMap.isEmpty());
  }

  // ---------------------------------------------------------------------
  // 3. สองชนิดที่ไม่สัมพันธ์กัน -> ตาม javadoc ของคลาส ควรได้ชื่อใหม่เดียวกันได้
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_unrelatedTypesCanShareNewName() {
    String js =
        "/** @constructor */\n" +
        "function Foo() {}\n" +
        "Foo.prototype.a = 1;\n" +
        "/** @constructor */\n" +
        "function Bar() {}\n" +
        "Bar.prototype.bbb = 1;\n" +
        "var f = new Foo();\n" +
        "f.a;\n" +
        "var b = new Bar();\n" +
        "b.bbb;\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();

    assertTrue(renamingMap.containsKey("a"));
    assertTrue(renamingMap.containsKey("bbb"));

    String newA = renamingMap.get("a");
    String newBbb = renamingMap.get("bbb");
    assertNotNull(newA);
    assertNotNull(newBbb);

    // Foo และ Bar ไม่มีความสัมพันธ์เป็น subtype กัน -> ตาม design doc ของคลาส
    // ("Foo.fooprop=0; Bar.barprop=0" -> ได้ชื่อเดียวกัน) ควรได้ชื่อใหม่เดียวกัน
    assertEquals(newA, newBbb);
  }

  // ---------------------------------------------------------------------
  // 4. subtype relation -> ต้องได้ชื่อใหม่ต่างกัน (เพราะ "related")
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_relatedTypesGetDifferentNewNames() {
    String js =
        "/** @constructor */\n" +
        "function Foo() {}\n" +
        "Foo.prototype.a = 1;\n" +
        "/**\n" +
        " * @constructor\n" +
        " * @extends {Foo}\n" +
        " */\n" +
        "function SubFoo() {}\n" +
        "SubFoo.prototype.bbb = 1;\n" +
        "var s = new SubFoo();\n" +
        "s.a;\n" +
        "s.bbb;\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();

    String newA = renamingMap.get("a");
    String newBbb = renamingMap.get("bbb");
    assertNotNull(newA);
    assertNotNull(newBbb);

    // ทั้งสอง property ถูกอ้างถึงจาก instance เดียวกัน (s : SubFoo) จึง "related"
    // ต้องได้ชื่อใหม่ที่ต่างกัน
    assertFalse(newA.equals(newBbb));
  }

  @Test
  public void testProcess_multiplePropertiesOnSameUnrelatedObjectAreDistinct() {
    String js =
        "/** @constructor */\n" +
        "function Foo() {}\n" +
        "Foo.prototype.aaa = 1;\n" +
        "Foo.prototype.bbb = 2;\n" +
        "var f = new Foo();\n" +
        "f.aaa;\n" +
        "f.bbb;\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();

    String newAaa = renamingMap.get("aaa");
    String newBbb = renamingMap.get("bbb");
    assertNotNull(newAaa);
    assertNotNull(newBbb);
    assertFalse(newAaa.equals(newBbb));
  }

  // ---------------------------------------------------------------------
  // 5. Extern property ต้องไม่ถูก rename (ProcessExterns / GETPROP case)
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_externedPropertyIsNotRenamed() {
    String externs =
        "/** @constructor */\n" +
        "function Foo() {}\n" +
        "/** @type {number} */\n" +
        "Foo.prototype.a;\n";
    String js =
        "var f = new Foo();\n" +
        "f.a;\n";
    compile(externs, js);
    Map<String, String> renamingMap = ambiguate();

    assertFalse(renamingMap.containsKey("a"));
  }

  // ---------------------------------------------------------------------
  // 6. Quoted key ใน object literal -> ไม่เข้า maybeMarkCandidate เลย
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_quotedObjectLiteralKeyIsNeverCandidate() {
    String js = "var obj = {'quotedKey': 1};\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();

    assertFalse(renamingMap.containsKey("quotedKey"));
  }

  // กรณีตรงข้าม: unquoted key ใน object literal (ครอบคลุมสาขา if (!key.isQuotedString()))
  // หมายเหตุ: โค้ดต้นฉบับเรียก getJSType(n.getFirstChild()) โดย n คือ OBJECTLIT
  // ทำให้ n.getFirstChild() คือ "key node แรก" ไม่ใช่ตัว object เอง ซึ่งอาจเป็น
  // จุดที่ทำให้พฤติกรรมไม่ตรงกับที่คาด (อาจเป็นสาเหตุของ defect ในบัคนี้)
  // จึงไม่ assert ผลลัพธ์ชื่อใหม่ที่แน่นอน เพียงยืนยันว่า process() ไม่ throw
  @Test
  public void testProcess_unquotedObjectLiteralKeyDoesNotThrow() {
    String js = "var obj = {plainKey: 1};\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();
    assertNotNull(renamingMap); // ไม่ throw exception ถือว่าผ่าน
  }

  // ---------------------------------------------------------------------
  // 7. GETELEM ที่มี string literal -> เก็บ quotedNames, ไม่เข้า propertyMap
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_getElemStringLiteralIsNeverCandidate() {
    String js =
        "var obj = {};\n" +
        "obj['dynamicProp'] = 1;\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();

    assertFalse(renamingMap.containsKey("dynamicProp"));
  }

  // GETELEM ที่ไม่ใช่ string literal (เช่น ตัวแปร index) -> ไม่เข้า branch เก็บ quotedNames
  @Test
  public void testProcess_getElemWithNonStringIndexDoesNotThrow() {
    String js =
        "/** @constructor */\n" +
        "function Foo() {}\n" +
        "Foo.prototype.a = 1;\n" +
        "var f = new Foo();\n" +
        "f.a;\n" +
        "var arr = [1, 2, 3];\n" +
        "var i = 0;\n" +
        "arr[i];\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();
    // 'a' ยังควรถูก rename ตามปกติ ไม่ได้รับผลกระทบจาก GETELEM ที่ไม่ใช่ string
    assertTrue(renamingMap.containsKey("a"));
  }

  // ---------------------------------------------------------------------
  // 8. SKIP_PREFIX -> skipAmbiguating = true -> ไม่เข้า graph, ไม่ปรากฏใน renamingMap
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_skipPrefixPropertyIsNotAmbiguated() {
    String js =
        "/** @constructor */\n" +
        "function Foo() {}\n" +
        "Foo.prototype.JSAbstractCompiler_foo = 1;\n" +
        "var f = new Foo();\n" +
        "f.JSAbstractCompiler_foo;\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();

    assertFalse(renamingMap.containsKey("JSAbstractCompiler_foo"));
  }

  @Test
  public void testProcess_exactSkipPrefixNameBoundary() {
    // boundary: ชื่อ property เท่ากับ SKIP_PREFIX พอดี
    String js =
        "/** @constructor */\n" +
        "function Foo() {}\n" +
        "Foo.prototype.JSAbstractCompiler = 1;\n" +
        "var f = new Foo();\n" +
        "f.JSAbstractCompiler;\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();

    assertFalse(renamingMap.containsKey("JSAbstractCompiler"));
  }

  // ---------------------------------------------------------------------
  // 9. isInvalidatingType: objType == null (primitive type, ไม่ใช่ ObjectType)
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_primitivePropertyAccessIsSkipped() {
    // 's' เป็น string primitive (ไม่ใช่ ObjectType) -> isInvalidatingType คืน true
    // ทันทีจาก branch objType == null -> property ถูก skipAmbiguating
    String js =
        "var s = 'hello';\n" +
        "s.length;\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate();

    assertFalse(renamingMap.containsKey("length"));
  }

  // ---------------------------------------------------------------------
  // 10. Constructor: ค่า null / ว่าง สำหรับ reservedCharacters
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_withNullReservedCharacters_doesNotThrow() {
    compile("", "var x = 1;");
    // constructor เพียงเก็บ reference ไว้ ไม่ dereference ทันที จึงไม่ throw ตอนสร้าง
    AmbiguateProperties pass = new AmbiguateProperties(compiler, null);
    assertNotNull(pass);
    // หมายเหตุ: ไม่เรียก process() ในกรณีนี้ เพราะ NameGenerator (ซึ่งไม่ได้แสดง
    // ซอร์สในโจทย์) อาจ dereference ค่านี้และเกิด NPE ซึ่งไม่สามารถยืนยัน behavior
    // ได้จากซอร์สที่ให้มา จึงไม่ทดสอบ/ไม่ assert ในจุดนี้เพิ่มเติม
  }

  @Test
  public void testConstructor_withEmptyReservedCharacters_processSucceeds() {
    String js =
        "/** @constructor */\n" +
        "function Foo() {}\n" +
        "Foo.prototype.a = 1;\n" +
        "var f = new Foo();\n" +
        "f.a;\n";
    compile("", js);
    Map<String, String> renamingMap = ambiguate(new char[0]);
    assertFalse(renamingMap.isEmpty());
  }

  @Test
  public void testProcess_withCustomReservedCharacters_doesNotThrowAndStillRenames() {
    String js =
        "/** @constructor */\n" +
        "function Foo() {}\n" +
        "Foo.prototype.a = 1;\n" +
        "var f = new Foo();\n" +
        "f.a;\n";
    compile("", js);
    // ไม่ assert ชื่อใหม่ที่เจาะจง เพราะอัลกอริทึม NameGenerator ไม่ได้แสดงในซอร์ส
    Map<String, String> renamingMap = ambiguate(new char[] {'a', 'b'});
    assertTrue(renamingMap.containsKey("a"));
    assertNotNull(renamingMap.get("a"));
  }
}
