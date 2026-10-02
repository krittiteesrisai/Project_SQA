# CheckGlobalThisTest — JUnit 4 Test Suite

## หมายเหตุสำคัญ (ข้อสมมติที่ใช้ เนื่องจากไม่สามารถรันจริงเพื่อยืนยัน 100%)

เพราะ `CheckGlobalThis` เป็น `final class` แบบ **package-private** ที่ผูกกับโครงสร้าง AST ของ Rhino/Closure parser จริง การทดสอบจึงต้องใช้ `Compiler` จริงในการ parse source string เป็น AST แล้วรัน pass ผ่าน `NodeTraversal` — ผมเขียน test class ไว้ใน package เดียวกัน (`com.google.javascript.jscomp`) เพื่อเข้าถึง class/field package-private ได้โดยไม่ต้อง import

**ข้อสมมติที่ไม่สามารถยืนยันได้ 100% โดยไม่รันจริง (กำกับด้วยคอมเมนต์ในโค้ด):**
1. `Compiler.parseTestCode(String)` คืน AST ที่มี parent pointer สมบูรณ์ และแนบ `JSDocInfo` จาก comment `/** ... */` ให้ node ที่เหมาะสมโดยอัตโนมัติตาม pattern ใน javadoc ของ `getFunctionJsDocInfo`
2. ต้องเรียก `compiler.initOptions(new CompilerOptions())` ก่อน parse เพื่อให้ ErrorManager ทำงานได้ (ไม่ NPE)
3. โครงสร้าง AST: function-declaration ที่ top-level มี parent เป็น `SCRIPT`, ใน `if(){}` มี parent เป็น `BLOCK`, function เป็น argument ของ call มี parent เป็น `CALL`, `var a = function(){}` มี parent เป็น `NAME`
4. พฤติกรรม error-recovery ของ parser ต่ออินพุตผิดรูปแบบไม่ชัดเจนจากซอร์สที่ให้มา — จึงทดสอบเพียง "ไม่ throw exception" และ "มี parse error ถูกบันทึก"

```java
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
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyInput_NoWarnings` | Boundary: input ว่าง, ไม่มี node ให้ traverse |
| `testMalformedInput_DoesNotThrowAndRecordsParseError` | Malformed input, robustness (ไม่ crash), มี parse error |
| `testBareThis_NotFlagged` | `shouldReportThis`: `assignLhsChild==null` และ `NodeUtil.isGet(parent)==false` |
| `testBareThisInsideNonExemptFunction_NotFlagged` | ยืนยัน bare `this` ภายในฟังก์ชันที่ traverse ได้ก็ยังไม่ report |
| `testGlobalThisPropertyRead_Flagged` | `shouldReportThis`: `NodeUtil.isGet(parent)==true` (property read) |
| `testGlobalThisPropertyAssign_Flagged` | `shouldReportThis`: `assignLhsChild!=null` (assign-lhs path) |
| `testThisAssignedToVariable_NotFlagged` | `shouldTraverse` else-branch: `NodeUtil.isGet(lhs)==false` (lhs เป็น NAME) |
| `testChainedAssignment_BothFlagged` | `assignLhsChild` set/report/reset วนสองรอบ (nested assign) |
| `testNestedAssignInsideGetProp_ThisFlagged` | `if (assignLhsChild == null)` false-branch (ไม่ override ค่าเดิม) |
| `testTopLevelFunctionDeclaration_NoJsDoc_Flagged` | `pType == Token.SCRIPT` (allow-list true) |
| `testFunctionAssignedToVarName_NoJsDoc_Flagged` | `pType == Token.NAME` (allow-list true) |
| `testFunctionAssignedToProperty_NoJsDoc_Flagged` | `pType == Token.ASSIGN` (allow-list true, ไม่ใช่ prototype) |
| `testFunctionDeclarationInsideBlock_Flagged` | `pType == Token.BLOCK` (allow-list true) |
| `testFunctionAsCallArgument_NotTraversed` | pType allow-list false-branch (`pType == CALL`) → `return false` |
| `testConstructorAnnotationDirectlyOnFunction_NotFlagged` | `getFunctionJsDocInfo`: jsDoc บน node เอง + `isConstructor()==true` |
| `testConstructorAnnotationOnAssign_NotFlagged` | `getFunctionJsDocInfo`: `parentType==ASSIGN` branch |
| `testConstructorAnnotationOnName_NotFlagged` | `getFunctionJsDocInfo`: `parentType==NAME` branch (ไม่ต้องขึ้น gramps) |
| `testConstructorAnnotationOnVar_NotFlagged` | `getFunctionJsDocInfo`: `gramps.getType()==VAR` branch |
| `testInterfaceAnnotation_NotFlagged` | `jsDoc.isInterface()==true` |
| `testThisTypeAnnotation_NotFlagged` | `jsDoc.hasThisType()==true` |
| `testOverrideAnnotation_NotFlagged` | `jsDoc.isOverride()==true` |
| `testJsDocWithoutExemptTags_StillFlagged` | compound condition `(isConstructor \|\| isInterface \|\| hasThisType \|\| isOverride)` false-branch |
| `testDirectPrototypeAssign_NotTraversed` | `lhs.getLastChild().getString().equals("prototype")==true` |
| `testPrototypeMethodAssign_NotTraversed` | `llhs.getLastChild().getString().equals("prototype")==true` |
| `testNonPrototypeNestedPropertyAssign_Flagged` | ทั้งสอง prototype-equality checks false-branch |
| `testNoThisUsage_NoWarnings` | Sanity: ไม่มี `Token.THIS` เลย → visit ไม่ report |

**ข้อจำกัดที่ควรทราบ:** เนื่องจากไม่สามารถ compile/run จริงเพื่อยืนยัน API (`parseTestCode`, `initOptions`) และรูปร่าง AST ที่แน่นอนของ parser เวอร์ชันนี้ หากมีความคลาดเคลื่อนของ AST (เช่น token type ของ object-literal key ที่ไม่ได้ทดสอบในชุดนี้เพราะไม่แน่ใจ) ควรตรวจสอบและปรับ assertion ให้ตรงกับพฤติกรรมจริงก่อนนำไปใช้งาน