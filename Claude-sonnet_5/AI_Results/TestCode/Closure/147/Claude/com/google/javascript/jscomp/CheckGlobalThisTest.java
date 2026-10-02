package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link CheckGlobalThis} (Defects4J Closure-147b).
 *
 * หมายเหตุ: ดูคอมเมนต์ข้อสมมติด้านบนไฟล์คำอธิบายก่อนใช้งาน/ตีความผลลัพธ์
 */
public class CheckGlobalThisTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // ต้อง init ก่อน parse เพื่อให้ ErrorManager พร้อมใช้งาน (สมมติฐาน #2)
    compiler.initOptions(options);
  }

  /**
   * Parse ซอร์ส JS แล้วรัน CheckGlobalThis ผ่าน NodeTraversal
   * คืนค่าจำนวน warning ประเภท GLOBAL_THIS ที่เกิดขึ้น
   */
  private int countGlobalThisWarnings(String js) {
    Node root = compiler.parseTestCode(js);
    CheckGlobalThis pass = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    t.traverse(root);

    int count = 0;
    for (JSError w : compiler.getWarnings()) {
      if (w.getType() == CheckGlobalThis.GLOBAL_THIS) {
        count++;
      }
    }
    return count;
  }

  // ===================== 0. Boundary / empty / malformed =====================

  @Test
  public void testEmptyInput_NoWarnings() {
    assertEquals(0, countGlobalThisWarnings(""));
  }

  @Test
  public void testMalformedInput_DoesNotThrowAndRecordsParseError() {
    // อินพุตผิดรูปแบบ: พฤติกรรม recovery ของ parser ไม่ชัดเจนจากซอร์ส
    // จึงทดสอบเพียงว่า pass ไม่ throw exception และมี parse error ถูกบันทึกจริง
    try {
      countGlobalThisWarnings("this. = 1;");
    } catch (Exception e) {
      fail("Pass should not throw on malformed input: " + e);
    }
    assertTrue("Expected a parse error to be recorded",
        compiler.getErrorCount() > 0);
  }

  // ===================== 1. this ธรรมดา (ไม่ใช่ get/assign-lhs) =====================

  @Test
  public void testBareThis_NotFlagged() {
    // "this;" ไม่ใช่ get และไม่ใช่ lhs ของ assign -> shouldReportThis คืน false
    assertEquals(0, countGlobalThisWarnings("this;"));
  }

  @Test
  public void testBareThisInsideNonExemptFunction_NotFlagged() {
    // แม้ traverse เข้าไปในฟังก์ชัน (ไม่มี jsDoc exempt) แต่ this ไม่ใช่ get/assign-lhs
    assertEquals(0, countGlobalThisWarnings("function foo() { return this; }"));
  }

  // ===================== 2. Property access (read) =====================

  @Test
  public void testGlobalThisPropertyRead_Flagged() {
    // this.foo; -> parent เป็น GETPROP (isGet == true) -> report
    assertEquals(1, countGlobalThisWarnings("this.foo;"));
  }

  // ===================== 3. Property assignment (lhs ของ assign) =====================

  @Test
  public void testGlobalThisPropertyAssign_Flagged() {
    assertEquals(1, countGlobalThisWarnings("this.foo = 1;"));
  }

  // ===================== 4. this ฝั่งขวาของ assign ที่ lhs ไม่ใช่ get =====================

  @Test
  public void testThisAssignedToVariable_NotFlagged() {
    // x = this; -> lhs เป็น NAME (ไม่ใช่ get) -> isGet(lhs)==false, shouldReportThis==false
    assertEquals(0, countGlobalThisWarnings("var x; x = this;"));
  }

  // ===================== 5. Nested / chained assignment =====================

  @Test
  public void testChainedAssignment_BothFlagged() {
    // this.a = this.b = 1;  assignLhsChild ถูก set-report-reset สองรอบ
    assertEquals(2, countGlobalThisWarnings("this.a = this.b = 1;"));
  }

  @Test
  public void testNestedAssignInsideGetProp_ThisFlagged() {
    // (a = this).property = c;  ตัวอย่างจาก JavaDoc ของคลาส
    // assignLhsChild ต้องไม่ถูก override เมื่อพบ nested assign ซ้อนใต้ lhs เดิม
    assertEquals(1, countGlobalThisWarnings("var a, c; (a = this).property = c;"));
  }

  // ===================== 6. pType allow-list ของ shouldTraverse (function node) =====================

  @Test
  public void testTopLevelFunctionDeclaration_NoJsDoc_Flagged() {
    // parent(function) == SCRIPT -> อนุญาต traverse
    assertEquals(1, countGlobalThisWarnings("function Foo() { this.bar = 1; }"));
  }

  @Test
  public void testFunctionAssignedToVarName_NoJsDoc_Flagged() {
    // parent(function) == NAME -> อนุญาต traverse
    assertEquals(1, countGlobalThisWarnings("var a = function() { this.bar = 1; };"));
  }

  @Test
  public void testFunctionAssignedToProperty_NoJsDoc_Flagged() {
    // parent(function) == ASSIGN, ไม่ใช่ prototype -> อนุญาต traverse
    assertEquals(1, countGlobalThisWarnings(
        "var a = {}; a.b = function() { this.bar = 1; };"));
  }

  @Test
  public void testFunctionDeclarationInsideBlock_Flagged() {
    // parent(function) == BLOCK (ภายใน if) -> อนุญาต traverse
    assertEquals(1, countGlobalThisWarnings(
        "if (true) { function foo() { this.bar = 1; } }"));
  }

  @Test
  public void testFunctionAsCallArgument_NotTraversed() {
    // parent(function) == CALL -> ไม่อยู่ใน allow-list -> shouldTraverse คืน false
    assertEquals(0, countGlobalThisWarnings("foo(function() { this.bar = 1; });"));
  }

  // ===================== 7. getFunctionJsDocInfo 4 รูปแบบ (ตาม JavaDoc เมธอด) =====================

  @Test
  public void testConstructorAnnotationDirectlyOnFunction_NotFlagged() {
    // รูปแบบ: "... function() {}" -> jsDoc ติดอยู่บน function node ตรง ๆ
    String js = "/** @constructor */\n"
        + "function Foo() { this.bar = 1; }";
    assertEquals(0, countGlobalThisWarnings(js));
  }

  @Test
  public void testConstructorAnnotationOnAssign_NotFlagged() {
    // รูปแบบ: "... x = function() {};" -> jsDoc ติดที่ ASSIGN (parent ของ function)
    String js = "var Foo = {};\n"
        + "/** @constructor */\n"
        + "Foo.Bar = function() { this.baz = 1; };";
    assertEquals(0, countGlobalThisWarnings(js));
  }

  @Test
  public void testConstructorAnnotationOnName_NotFlagged() {
    // รูปแบบ: "var ... x = function() {};" -> jsDoc ติดที่ NAME (parent ของ function)
    String js = "var /** @constructor */ Foo = function() { this.bar = 1; };";
    assertEquals(0, countGlobalThisWarnings(js));
  }

  @Test
  public void testConstructorAnnotationOnVar_NotFlagged() {
    // รูปแบบ: "... var x = function() {};" -> jsDoc ติดที่ VAR (gramps ของ function)
    String js = "/** @constructor */\n"
        + "var Foo = function() { this.bar = 1; };";
    assertEquals(0, countGlobalThisWarnings(js));
  }

  // ===================== 8. jsDoc exempt flags แต่ละตัว (isConstructor/isInterface/hasThisType/isOverride) =====================

  @Test
  public void testInterfaceAnnotation_NotFlagged() {
    String js = "/** @interface */\n"
        + "function Foo() { this.bar = 1; }";
    assertEquals(0, countGlobalThisWarnings(js));
  }

  @Test
  public void testThisTypeAnnotation_NotFlagged() {
    String js = "/** @this {Object} */\n"
        + "function foo() { this.bar = 1; }";
    assertEquals(0, countGlobalThisWarnings(js));
  }

  @Test
  public void testOverrideAnnotation_NotFlagged() {
    String js = "/** @override */\n"
        + "function foo() { this.bar = 1; }";
    assertEquals(0, countGlobalThisWarnings(js));
  }

  @Test
  public void testJsDocWithoutExemptTags_StillFlagged() {
    // jsDoc != null แต่ isConstructor/isInterface/hasThisType/isOverride == false ทั้งหมด
    // -> compound condition false -> ไม่ return false ที่ branch นี้ -> ยัง traverse ต่อ
    String js = "/**\n"
        + " * @param {number} x\n"
        + " */\n"
        + "function Foo(x) { this.y = x; }";
    assertEquals(1, countGlobalThisWarnings(js));
  }

  // ===================== 9. prototype-assignment skip-rhs logic =====================

  @Test
  public void testDirectPrototypeAssign_NotTraversed() {
    // Foo.prototype = function(){...};  lhs.getLastChild() == "prototype" -> return false ทันที
    String js = "function Foo() {}\n"
        + "Foo.prototype = function() { this.bar = 1; };";
    assertEquals(0, countGlobalThisWarnings(js));
  }

  @Test
  public void testPrototypeMethodAssign_NotTraversed() {
    // Foo.prototype.bar = function(){...};  llhs.getLastChild() == "prototype" -> return false
    String js = "function Foo() {}\n"
        + "Foo.prototype.bar = function() { this.baz = 1; };";
    assertEquals(0, countGlobalThisWarnings(js));
  }

  @Test
  public void testNonPrototypeNestedPropertyAssign_Flagged() {
    // a.b.c = function(){...};  ทั้ง lhs และ llhs ไม่ลงท้ายด้วย "prototype" -> traverse ปกติ
    String js = "var a = {b:{}};\n"
        + "a.b.c = function() { this.x = 1; };";
    assertEquals(1, countGlobalThisWarnings(js));
  }

  // ===================== 10. ไม่มีการใช้ this เลย =====================

  @Test
  public void testNoThisUsage_NoWarnings() {
    assertEquals(0, countGlobalThisWarnings("var a = 1; function foo() { return a; }"));
  }
}
