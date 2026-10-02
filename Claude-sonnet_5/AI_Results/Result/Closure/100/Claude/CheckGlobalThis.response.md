# วิเคราะห์และแนวทางการทดสอบ

**หมายเหตุสำคัญ:** `CheckGlobalThis` เป็น package-private class ที่ต้องพึ่งพา `Compiler`, `NodeTraversal`, `CompilerOptions`, `SourceFile` ซึ่งเป็นส่วนหนึ่งของซอร์ส Closure Compiler เดียวกัน (ไม่ใช่ jar ภายนอกที่ระบุ แต่ compile มาด้วยกันใน source tree ของ Defects4J Closure-100b) จึงใช้ API เหล่านี้เพื่อ parse โค้ดจริงและรัน `NodeTraversal` เพื่อทดสอบ behavior แบบ black-box/end-to-end ซึ่งเป็นวิธีที่ปลอดภัยที่สุดในการดัก fault โดยไม่ต้อง mock internal state (`assignLhsChild`) เอง เพราะ state นี้ซับซ้อนและอาจทำให้เดา behavior ผิดหากตั้งเองผ่าน reflection

จุดที่ทดสอบว่า "ไม่มั่นใจ 100%" (เช่นตำแหน่งที่ parser แนบ JSDoc) จะมีคอมเมนต์กำกับไว้ตามข้อกำหนด

```java
package com.google.javascript.jscomp;

// CheckGlobalThis เป็น package-private class อยู่ใน package เดียวกันนี้แล้ว
// จึงไม่จำเป็นต้อง import แยก (การไม่ import คือการ "import ให้ถูกต้อง"
// สำหรับ package-private class ในแพ็กเกจเดียวกัน)

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.javascript.rhino.Node;

/**
 * Unit tests สำหรับ CheckGlobalThis (Defects4J Closure-100b)
 *
 * แนวทาง: parse ซอร์ส JS จริงด้วย Compiler แล้วรัน NodeTraversal พร้อม
 * CheckGlobalThis เป็น callback จากนั้นตรวจสอบจำนวน/พฤติกรรมของ warning
 * ที่เกิดขึ้น เพื่อให้ครอบคลุมทุกสาขา (branch) ของ shouldTraverse/visit/
 * shouldReportThis/getFunctionJsDocInfo ตามที่วิเคราะห์ได้จากซอร์สที่ให้มา
 */
public class CheckGlobalThisTest {

  /**
   * Helper: parse js แล้วรัน CheckGlobalThis ผ่าน NodeTraversal จริง
   * คืนค่า Compiler เพื่อให้ผู้เรียกตรวจสอบ warning/error count ต่อไปได้
   */
  private Compiler runCheck(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    List<SourceFile> externs = Collections.<SourceFile>emptyList();
    List<SourceFile> inputs =
        Collections.singletonList(SourceFile.fromCode("input.js", js));

    compiler.init(externs, inputs, options);
    compiler.parse();

    assertEquals(
        "ไม่ควรมี parse error สำหรับอินพุตนี้: " + js,
        0, compiler.getErrorCount());

    Node root = compiler.getRoot();
    CheckGlobalThis pass = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal.traverse(compiler, root, pass);

    return compiler;
  }

  // ---------------------------------------------------------------------
  // 1) THIS บนฝั่งซ้ายของ assignment -> ต้องถูก flag
  //    ครอบคลุม: shouldTraverse (n==lhs, set assignLhsChild),
  //              visit (n.getType()==THIS && shouldReportThis==true -> report),
  //              visit (n==assignLhsChild -> reset)
  // ---------------------------------------------------------------------
  @Test
  public void testThisAssignedToPropertyIsFlagged() {
    Compiler c = runCheck("this.a = 3;");
    assertEquals(1, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 2) THIS ใน property access ธรรมดา (ไม่ใช่ lhs ของ assign)
  //    shouldReportThis(): assignLhsChild == null -> return false (ไม่ report)
  //    แม้ comment จะบอกว่า "Also report a THIS with a property access"
  //    แต่ตามโค้ดจริง (บั๊กที่มีอยู่) จะไม่ report กรณีนี้
  // ---------------------------------------------------------------------
  @Test
  public void testPlainThisPropertyAccessNotFlagged() {
    Compiler c = runCheck("this.a;");
    assertEquals(0, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 3) ตรงกับตัวอย่างใน Javadoc: "var a = this;" ไม่ถูก flag
  //    parent ของ THIS คือ NAME ไม่ใช่ ASSIGN -> ข้าม if-block ทั้งหมด
  // ---------------------------------------------------------------------
  @Test
  public void testThisAssignedToVariableNotFlagged() {
    Compiler c = runCheck("var a = this;");
    assertEquals(0, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 4) THIS เป็น rhs ของ assign ที่ lhs เป็น NAME ธรรมดา (ไม่ใช่ GETPROP)
  //    shouldTraverse: n==rhs, lhs.getType()!=GETPROP -> fallthrough true
  //    visit: assignLhsChild ยังเป็น null (ไม่เคย set เพราะ lhs คือ NAME "a"
  //    ไม่ใช่ this) -> shouldReportThis คืน false -> ไม่ report
  // ---------------------------------------------------------------------
  @Test
  public void testThisAsRhsOfSimpleAssignNotFlagged() {
    Compiler c = runCheck("a = this;");
    assertEquals(0, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 5) Nested assignment ตามตัวอย่างที่ระบุใน comment ของ field assignLhsChild:
  //    "(a = this).property = c;" ควรถูก flag เพราะ assignLhsChild ไม่ถูก
  //    override ระหว่าง nested assign (if (assignLhsChild == null) เท่านั้น)
  // ---------------------------------------------------------------------
  @Test
  public void testNestedAssignFlagsInnerThis() {
    Compiler c = runCheck("(a = this).b = c;");
    assertEquals(1, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 6) ฟังก์ชันธรรมดาไม่มี JSDoc -> getFunctionJsDocInfo คืน null
  //    -> jsDoc!=null&&(...) เป็น false -> traverse ปกติ -> this.a=3 ถูก flag
  // ---------------------------------------------------------------------
  @Test
  public void testThisInPlainFunctionIsFlagged() {
    Compiler c = runCheck("function f() { this.a = 3; }");
    assertEquals(1, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 7) ฟังก์ชันมี @constructor -> jsDoc.isConstructor()==true
  //    -> shouldTraverse คืน false สำหรับ FUNCTION node -> ไม่ traverse body
  // ---------------------------------------------------------------------
  @Test
  public void testThisInConstructorFunctionNotFlagged() {
    Compiler c = runCheck(
        "/** @constructor */ function A() { this.a = 3; }");
    assertEquals(0, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 8) ฟังก์ชันมี @this -> jsDoc.hasThisType()==true
  //    -> shouldTraverse คืน false
  // ---------------------------------------------------------------------
  @Test
  public void testThisInThisAnnotatedFunctionNotFlagged() {
    Compiler c = runCheck(
        "/** @this {Object} */ function f() { this.a = 3; }");
    assertEquals(0, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 9) ฟังก์ชันมี JSDoc แต่ไม่ใช่ @constructor/@this (เช่น @param เท่านั้น)
  //    -> jsDoc!=null แต่ (isConstructor()||hasThisType())==false
  //    -> condition รวมเป็น false -> traverse ปกติ -> ถูก flag
  // ---------------------------------------------------------------------
  @Test
  public void testThisInFunctionWithUnrelatedJSDocIsFlagged() {
    Compiler c = runCheck(
        "/** @param {number} x */ function f(x) { this.a = 1; }");
    assertEquals(1, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 10) ฟังก์ชัน anonymous ที่ส่งเป็น callback (parent ของ FUNCTION คือ CALL
  //     ไม่ใช่ NAME/ASSIGN) -> getFunctionJsDocInfo คืน null ตลอด
  //     -> ถูก traverse และ flag ตามปกติ (สะท้อนข้อจำกัดของพาสนี้)
  // ---------------------------------------------------------------------
  @Test
  public void testThisInCallbackFunctionIsFlagged() {
    Compiler c = runCheck("foo(function() { this.a = 1; });");
    assertEquals(1, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 11) lhs ของ assign เป็น GETPROP ที่ lastChild เป็น "prototype" พอดี
  //     -> shouldTraverse คืน false ทันที (ไม่ traverse FUNCTION rhs)
  // ---------------------------------------------------------------------
  @Test
  public void testPrototypeAssignmentRhsFunctionNotTraversed() {
    Compiler c = runCheck(
        "Foo.prototype = function() { this.a = 1; };");
    assertEquals(0, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 12) lhs เป็น "Foo.prototype.bar" -> lastChild != "prototype" แต่
  //     leftName.contains(".prototype.") == true -> return false
  // ---------------------------------------------------------------------
  @Test
  public void testPrototypeMethodAssignmentRhsFunctionNotTraversed() {
    Compiler c = runCheck(
        "Foo.prototype.bar = function() { this.a = 1; };");
    assertEquals(0, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 13) lhs เป็น "Foo.bar" ธรรมดา ไม่มี "prototype" เกี่ยวข้อง
  //     -> ทั้งสองเงื่อนไขเป็น false -> fallthrough return true -> ถูก flag
  // ---------------------------------------------------------------------
  @Test
  public void testNonPrototypeGetpropAssignmentRhsFunctionIsFlagged() {
    Compiler c = runCheck(
        "Foo.bar = function() { this.a = 1; };");
    assertEquals(1, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 14) lhs เป็น GETPROP ที่ getQualifiedName() คืน null
  //     (object part เป็น CALL: foo().bar) -> leftName == null
  //     -> เงื่อนไข leftName!=null&&... เป็น false -> fallthrough true
  // ---------------------------------------------------------------------
  @Test
  public void testGetpropWithNullQualifiedNameLhsIsFlagged() {
    Compiler c = runCheck(
        "foo().bar = function() { this.a = 1; };");
    assertEquals(1, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 15) หลาย statement ระดับบนสุด -> ทดสอบว่า state (assignLhsChild)
  //     ไม่รั่วไหลข้าม statement และแต่ละ this.x=... ถูก flag แยกกัน
  // ---------------------------------------------------------------------
  @Test
  public void testMultipleTopLevelThisAssignmentsEachFlagged() {
    Compiler c = runCheck("this.a = 1; this.b = 2;");
    assertEquals(2, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 16) Boundary case: ไฟล์ JS ว่าง -> ไม่มี node ให้ traverse -> ไม่ error/warn
  // ---------------------------------------------------------------------
  @Test
  public void testEmptyScriptNoWarnings() {
    Compiler c = runCheck("");
    assertEquals(0, c.getWarningCount());
    assertEquals(0, c.getErrorCount());
  }

  // ---------------------------------------------------------------------
  // 17) อินพุตผิดรูปแบบ (malformed) -> parser ควรรายงาน error
  //     และ pass ต้องไม่ throw exception แม้ AST อาจไม่สมบูรณ์
  // ---------------------------------------------------------------------
  @Test
  public void testMalformedInputDoesNotCrash() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Collections.<SourceFile>emptyList();
    List<SourceFile> inputs =
        Collections.singletonList(SourceFile.fromCode("input.js", "this. = 3;"));

    compiler.init(externs, inputs, options);
    compiler.parse();

    assertTrue("คาดว่าจะมี parse error สำหรับอินพุตผิดรูปแบบ",
        compiler.getErrorCount() > 0);

    // ไม่ควร throw แม้ AST มาจากอินพุตที่ parse error
    Node root = compiler.getRoot();
    CheckGlobalThis pass = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal.traverse(compiler, root, pass);
  }

  // ---------------------------------------------------------------------
  // 18) JSDoc แนบที่ ASSIGN node: "/** @constructor */ a.b = function(){}"
  //     ทดสอบ getFunctionJsDocInfo(): parentType == ASSIGN branch
  //     หมายเหตุ: ตำแหน่งที่ parser จริงแนบ JSDoc (ASSIGN หรือ EXPR_RESULT)
  //     ไม่ได้ยืนยันจากซอร์สที่ให้มาโดยตรง จึงตรวจผลลัพธ์ปลายทาง
  //     (ไม่มี warning) เป็นหลักตาม intent ของโค้ด
  // ---------------------------------------------------------------------
  @Test
  public void testJsDocOnAssignNodeConstructorSuppressesWarning() {
    Compiler c = runCheck(
        "/** @constructor */ a.b = function() { this.x = 1; };");
    assertEquals(0, c.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 19) JSDoc แนบผ่าน NAME -> VAR (gramps): "/** @constructor */ var A = function(){}"
  //     ทดสอบ getFunctionJsDocInfo(): parentType==NAME, jsDoc null on NAME,
  //     gramps.getType()==VAR branch
  //     หมายเหตุ: ขึ้นกับตำแหน่งแนบ JSDoc จริงของ parser เช่นเดียวกับ #18
  // ---------------------------------------------------------------------
  @Test
  public void testJsDocViaVarGrandparentConstructorSuppressesWarning() {
    Compiler c = runCheck(
        "/** @constructor */ var A = function() { this.x = 1; };");
    assertEquals(0, c.getWarningCount());
  }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testThisAssignedToPropertyIsFlagged` | `shouldTraverse`: n==lhs, set `assignLhsChild`; `visit`: THIS && shouldReportThis→true→report; reset assignLhsChild |
| `testPlainThisPropertyAccessNotFlagged` | `shouldReportThis`: assignLhsChild==null → return false |
| `testThisAssignedToVariableNotFlagged` | `shouldTraverse`: parent.getType()!=ASSIGN → skip if-block ทั้งหมด |
| `testThisAsRhsOfSimpleAssignNotFlagged` | `shouldTraverse`: n==rhs, lhs.getType()!=GETPROP → fallthrough true; `shouldReportThis`: assignLhsChild ไม่ถูก set |
| `testNestedAssignFlagsInnerThis` | `if (assignLhsChild == null)` false → ไม่ override; shouldReportThis→true จาก outer assignLhsChild |
| `testThisInPlainFunctionIsFlagged` | `getFunctionJsDocInfo` คืน null; FUNCTION-block condition false |
| `testThisInConstructorFunctionNotFlagged` | `jsDoc.isConstructor()==true` → return false |
| `testThisInThisAnnotatedFunctionNotFlagged` | `jsDoc.hasThisType()==true` → return false |
| `testThisInFunctionWithUnrelatedJSDocIsFlagged` | jsDoc!=null แต่ isConstructor/hasThisType ทั้งคู่ false |
| `testThisInCallbackFunctionIsFlagged` | parentType ของ FUNCTION ไม่ใช่ NAME/ASSIGN → jsDoc คงเป็น null |
| `testPrototypeAssignmentRhsFunctionNotTraversed` | `lhs.getLastChild().getString().equals("prototype")` → true → return false |
| `testPrototypeMethodAssignmentRhsFunctionNotTraversed` | lastChild != prototype แต่ `leftName.contains(".prototype.")` → true |
| `testNonPrototypeGetpropAssignmentRhsFunctionIsFlagged` | ทั้งสองเงื่อนไข GETPROP-check เป็น false → fallthrough return true |
| `testGetpropWithNullQualifiedNameLhsIsFlagged` | `leftName == null` → เงื่อนไข `leftName != null && ...` เป็น false |
| `testMultipleTopLevelThisAssignmentsEachFlagged` | ทดสอบ loop การ traverse หลาย statement, state ไม่รั่วไหล |
| `testEmptyScriptNoWarnings` | Boundary: ไม่มี node ให้ traverse |
| `testMalformedInputDoesNotCrash` | อินพุตผิดรูปแบบ, ทดสอบความทนทาน (robustness) |
| `testJsDocOnAssignNodeConstructorSuppressesWarning` | `getFunctionJsDocInfo`: parentType==ASSIGN branch |
| `testJsDocViaVarGrandparentConstructorSuppressesWarning` | `getFunctionJsDocInfo`: parentType==NAME, jsDoc null → gramps.getType()==VAR branch |