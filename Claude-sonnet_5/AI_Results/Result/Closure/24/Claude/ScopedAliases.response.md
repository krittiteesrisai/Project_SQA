# วิเคราะห์และแนวทางการทดสอบ

`ScopedAliases` เป็นคลาส **package-private** ที่ผูกแน่นกับ `NodeTraversal`, `Scope`, `Node` (Rhino-based AST) และ `AbstractCompiler` — ไม่มี public constructor/สาขาที่เรียกใช้ตรงได้ง่ายจากภายนอกโดยไม่สร้าง AST จริง ดังนั้นวิธีที่ปลอดภัยและตรงกับพฤติกรรมจริงที่สุดคือ **รันผ่าน full compiler pipeline** โดยเปิด `CompilerOptions#setClosurePass(true)` (ซึ่งเป็นสวิตช์ที่ wiring pass นี้เข้าไปใน pipeline — ไม่ได้ระบุใน source ที่ให้มาโดยตรง จึงขอระบุเป็นสมมติฐานตามคอมเมนต์ในโค้ด) แล้วตรวจผลผ่าน `Result` และ `Compiler#toSource()`

⚠️ **หมายเหตุสำคัญ**: บาง API ที่ใช้ (`JSSourceFile`, `Compiler#compile(...)`, `Result#success/errors`) เป็น API สนับสนุนของ Closure Compiler ในยุคเดียวกับ Closure-24 ไม่ได้อยู่ใน source ที่ให้มาโดยตรง จึงกำกับด้วยคอมเมนต์ตามข้อกำหนดที่ 4 หากชื่อคลาส/เมธอดจริงต่างไป (เช่น `SourceFile` แทน `JSSourceFile`) ให้ปรับตาม classpath จริง

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for {@link ScopedAliases}.
 *
 * หมายเหตุสำคัญ (สมมติฐานเกี่ยวกับ API สนับสนุนที่ไม่ได้อยู่ใน source ของ ScopedAliases โดยตรง):
 * - ScopedAliases เป็น package-private class ที่ทำงานผูกกับ NodeTraversal/Scope/Node
 *   การสร้าง AST + Scope ที่ถูกต้องด้วยมือทำได้ยากและเสี่ยงต่อการเดา behavior ผิด
 *   จึงเลือกทดสอบผ่าน full compiler pipeline โดยเปิด CompilerOptions#setClosurePass(true)
 *   ซึ่งเป็นสวิตช์ที่ (ตามความเข้าใจทั่วไปของ Closure Compiler ในยุคเดียวกัน) ใช้ wiring
 *   ScopedAliases pass เข้ากับ DefaultPassConfig — รายละเอียดนี้ไม่ได้อยู่ใน source ที่ให้มา
 * - ใช้ JSSourceFile.fromCode(...) และ Compiler#compile(JSSourceFile, JSSourceFile, CompilerOptions)
 *   และ Result#success / Result#errors (JSError[]) ตาม API ของ Closure Compiler ช่วงเวลาเดียวกับ
 *   Closure-24 หากเวอร์ชันจริงต่างออกไป (เช่นใช้ SourceFile) ต้องปรับชื่อคลาส/เมธอด
 * - ทดสอบเป็นแบบ same-package จึงไม่จำเป็นต้องมี import statement สำหรับ ScopedAliases,
 *   Compiler, CompilerOptions ฯลฯ (Java resolve ให้อัตโนมัติ) แต่มีการอ้างอิงคลาสเป้าหมาย
 *   (ScopedAliases.SCOPING_METHOD_NAME) โดยตรงเพื่อยืนยันว่าอ้างอิงคลาสที่ถูกต้อง
 */
public class ScopedAliasesTest {

  private Compiler compiler;

  private Result compileJs(String js, boolean closurePass) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setClosurePass(closurePass);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "var goog = {};"
            + "goog.dom = {};"
            + "goog.events = {};"
            + "goog.scope = function(fn) {};");
    JSSourceFile input = JSSourceFile.fromCode("input.js", js);
    return compiler.compile(externs, input, options);
  }

  private String source() {
    return compiler.toSource();
  }

  // ---------------------------------------------------------------------
  // Success path: การแทนที่ alias และการ collapse scope (ไม่มี error)
  // ---------------------------------------------------------------------

  @Test
  public void testBasicAliasSubstitution() {
    String js =
        "goog.scope(function() {\n"
            + "  var dom = goog.dom;\n"
            + "  dom.createElement('DIV');\n"
            + "});\n";
    Result result = compileJs(js, true);

    assertTrue("compile ควรสำเร็จ", result.success);
    assertEquals("ไม่ควรมี error", 0, result.errors.length);

    String out = source();
    assertFalse("goog.scope call ควรถูก collapse ออกไปแล้ว", out.contains("goog.scope"));
    assertFalse("alias definition (var dom) ควรถูกลบ", out.contains("var dom"));
    assertTrue("การอ้างอิง alias ควรถูกแทนที่ด้วยค่าเดิม", out.contains("goog.dom.createElement"));
  }

  @Test
  public void testTransitiveAlias() {
    // var g = goog; var d = g.dom;  -> d ควรถูกแทนที่เป็น goog.dom โดยตรง (ไม่ clone ซ้อน)
    String js =
        "goog.scope(function() {\n"
            + "  var g = goog;\n"
            + "  var d = g.dom;\n"
            + "  d.createElement('DIV');\n"
            + "});\n";
    Result result = compileJs(js, true);

    assertTrue(result.success);
    assertEquals(0, result.errors.length);

    String out = source();
    assertFalse(out.contains("goog.scope"));
    assertTrue("alias แบบ transitive ควรถูกแทนที่เป็น goog.dom.createElement",
        out.contains("goog.dom.createElement"));
  }

  @Test
  public void testAliasUsageInsideNestedFunction() {
    // ทดสอบสาขา "Validate all descendent scopes" (t.getScopeDepth() >= 2)
    // สำหรับ scope ที่ลึกกว่า 2 ชั้น (function ซ้อนอยู่ใน goog.scope function)
    String js =
        "goog.scope(function() {\n"
            + "  var dom = goog.dom;\n"
            + "  function inner() { return dom.createElement('DIV'); }\n"
            + "});\n";
    Result result = compileJs(js, true);

    assertTrue(result.success);
    assertEquals(0, result.errors.length);
    assertTrue("alias ที่ใช้ใน nested function ควรถูกแทนที่เช่นกัน",
        source().contains("goog.dom.createElement"));
  }

  @Test
  public void testEmptyScopeBlockCollapsesCleanly() {
    String js = "goog.scope(function() {});\n";
    Result result = compileJs(js, true);

    assertTrue(result.success);
    assertEquals(0, result.errors.length);
    assertFalse(source().contains("goog.scope"));
  }

  @Test
  public void testEmptySourceNoGoogScopeCall_boundary() {
    // boundary/empty case: ไม่มี statement ใด ๆ เลยในไฟล์
    Result result = compileJs("", true);

    assertTrue(result.success);
    assertEquals(0, result.errors.length);
  }

  @Test
  public void testShouldTraverseBlocksNormalTopLevelFunction() {
    // ทดสอบ shouldTraverse(): function ปกติ (ไม่ใช่ argument ของ goog.scope) ที่ระดับ global
    // จะไม่ถูก traverse เข้าไปข้างใน ดังนั้น 'return' ข้างในจึงไม่ควรทำให้เกิด
    // GOOG_SCOPE_USES_RETURN (ถ้า branch นี้ผิดพลาด/ถูกลบ จะเกิด false-positive error)
    String js =
        "function foo() { return; }\n"
            + "goog.scope(function() {});\n";
    Result result = compileJs(js, true);

    assertTrue("ไม่ควรมี error จาก return ใน function ปกติที่ระดับ global", result.success);
    assertEquals(0, result.errors.length);
  }

  // ---------------------------------------------------------------------
  // Error path: GOOG_SCOPE_USED_IMPROPERLY
  // ---------------------------------------------------------------------

  @Test
  public void testGoogScopeUsedImproperly_notAloneInStatement() {
    String js = "var x = goog.scope(function() {});\n";
    Result result = compileJs(js, true);

    assertFalse("ควร fail เนื่องจาก goog.scope ไม่ได้อยู่คนเดียวใน statement", result.success);
    assertTrue(result.errors.length >= 1);
    // เนื่องจาก hasErrors() เป็น true การแปลง (apply/remove/collapse) ทั้งหมดจะไม่ถูกทำ
    assertTrue(source().contains(ScopedAliases.SCOPING_METHOD_NAME));
  }

  // ---------------------------------------------------------------------
  // Error path: GOOG_SCOPE_HAS_BAD_PARAMETERS (3 สาขาย่อย)
  // ---------------------------------------------------------------------

  @Test
  public void testGoogScopeHasBadParameters_wrongArgCount() {
    // childCount != 2 -> report บน call node ตรง ๆ
    String js = "goog.scope();\n";
    Result result = compileJs(js, true);

    assertFalse(result.success);
    assertTrue(result.errors.length >= 1);
  }

  @Test
  public void testGoogScopeHasBadParameters_functionWithParams() {
    // childCount == 2, แต่ anonymous function มี parameter
    String js = "goog.scope(function(x) {});\n";
    Result result = compileJs(js, true);

    assertFalse(result.success);
    assertTrue(result.errors.length >= 1);
  }

  @Test
  public void testGoogScopeHasBadParameters_namedFunction() {
    // childCount == 2, แต่ function มีชื่อ (getFunctionName != null)
    String js = "goog.scope(function foo() {});\n";
    Result result = compileJs(js, true);

    assertFalse(result.success);
    assertTrue(result.errors.length >= 1);
  }

  // ---------------------------------------------------------------------
  // Error path: GOOG_SCOPE_REFERENCES_THIS
  // ---------------------------------------------------------------------

  @Test
  public void testGoogScopeReferencesThis() {
    String js =
        "goog.scope(function() {\n"
            + "  this.foo();\n"
            + "});\n";
    Result result = compileJs(js, true);

    assertFalse(result.success);
    assertTrue(result.errors.length >= 1);
  }

  // ---------------------------------------------------------------------
  // Error path: GOOG_SCOPE_USES_RETURN
  // ---------------------------------------------------------------------

  @Test
  public void testGoogScopeUsesReturn() {
    String js =
        "goog.scope(function() {\n"
            + "  return;\n"
            + "});\n";
    Result result = compileJs(js, true);

    assertFalse(result.success);
    assertTrue(result.errors.length >= 1);
  }

  // ---------------------------------------------------------------------
  // Error path: GOOG_SCOPE_USES_THROW
  // ---------------------------------------------------------------------

  @Test
  public void testGoogScopeUsesThrow() {
    String js =
        "goog.scope(function() {\n"
            + "  throw 'x';\n"
            + "});\n";
    Result result = compileJs(js, true);

    assertFalse(result.success);
    assertTrue(result.errors.length >= 1);
  }

  // ---------------------------------------------------------------------
  // Error path: GOOG_SCOPE_ALIAS_REDEFINED
  // ---------------------------------------------------------------------

  @Test
  public void testGoogScopeAliasRedefined() {
    String js =
        "goog.scope(function() {\n"
            + "  var x = goog.dom;\n"
            + "  x = goog.events;\n"
            + "});\n";
    Result result = compileJs(js, true);

    assertFalse("ควร fail เพราะ alias x ถูกกำหนดค่าซ้ำ", result.success);
    assertTrue(result.errors.length >= 1);
  }

  // ---------------------------------------------------------------------
  // Error path: GOOG_SCOPE_NON_ALIAS_LOCAL
  // ---------------------------------------------------------------------

  @Test
  public void testGoogScopeNonAliasLocal() {
    // ค่าที่กำหนดให้ x ไม่ใช่ qualified name (เป็น number literal)
    String js =
        "goog.scope(function() {\n"
            + "  var x = 5;\n"
            + "});\n";
    Result result = compileJs(js, true);

    assertFalse("ควร fail เพราะ local variable ไม่ใช่ alias ของ qualified name", result.success);
    assertTrue(result.errors.length >= 1);
  }

  // ---------------------------------------------------------------------
  // fixTypeNode: JSDoc @type ที่อ้างอิง alias
  // ---------------------------------------------------------------------

  @Test
  public void testFixTypeNodeWithAliasedJsDocType() {
    // หมายเหตุ: ตรวจสอบเพียงว่าไม่มี error เกิดขึ้น (ไม่ตรวจสอบ string ผลลัพธ์แบบละเอียด
    // เนื่องจากการพิมพ์ JSDoc annotation กลับมาขึ้นกับ CompilerOptions เพิ่มเติมที่ไม่ได้
    // ระบุใน source ของ ScopedAliases เอง — ป้องกันการเดา behavior ที่ไม่มีอยู่ในซอร์ส)
    String js =
        "goog.scope(function() {\n"
            + "  var dom = goog.dom;\n"
            + "  /** @type {dom.Element} */\n"
            + "  var x;\n"
            + "});\n";
    Result result = compileJs(js, true);

    assertTrue(result.success);
    assertEquals(0, result.errors.length);
  }

  // ---------------------------------------------------------------------
  // ข้อจำกัดที่ทราบ (ไม่ได้ทดสอบ เพื่อไม่เดา behavior นอก source ที่ให้มา)
  // ---------------------------------------------------------------------
  // ทุก test ข้างต้นใช้ full pipeline ซึ่งไม่ได้ตั้งค่า preprocessorSymbolTable
  // (constructor param เป็น null เสมอในบริบทนี้) จึงครอบคลุมเพียง branch
  // "preprocessorSymbolTable == null" ของ validateScopeCall เท่านั้น
  // ส่วน branch preprocessorSymbolTable != null ไม่มี public API ใน source ที่ให้มา
  // สำหรับเปิดใช้งานได้อย่างปลอดภัย จึงข้ามไว้ตามข้อกำหนดที่ 4
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testBasicAliasSubstitution` | `isCallToScopeMethod` true, `findAliases`: `n.hasChildren() && isQualifiedName()` true, `AliasedNode.applyAlias()`, ลบ alias definition (`hasOneChild` true), collapse scope, `hasErrors()==false` |
| `testTransitiveAlias` | Alias ซ้อน (alias ของ alias), เส้นทาง `AliasedNode` โดยไม่ clone ซ้ำ |
| `testAliasUsageInsideNestedFunction` | `t.getScopeDepth() >= 2` (descendant scope, ไม่ใช่แค่ ==2) ใน `visit()` |
| `testEmptyScopeBlockCollapsesCleanly` | `scopeCalls` ไม่มี alias/definition, การ collapse ของ block ว่าง (`NodeUtil.tryMergeBlock`) |
| `testEmptySourceNoGoogScopeCall_boundary` | Boundary: ไม่มี call ใด ๆ, `traversal.getAliasUsages()/…/getScopeCalls()` = 0 ทั้งหมด → ไม่เรียก `reportCodeChange()` |
| `testShouldTraverseBlocksNormalTopLevelFunction` | `shouldTraverse`: `n.isFunction() && t.inGlobalScope()` true และ `!isCallToScopeMethod(parent)` true → return false |
| `testGoogScopeUsedImproperly_notAloneInStatement` | `validateScopeCall`: `!parent.isExprResult()` true → `GOOG_SCOPE_USED_IMPROPERLY`, gate `!hasErrors()` false |
| `testGoogScopeHasBadParameters_wrongArgCount` | `n.getChildCount() != 2` true → `GOOG_SCOPE_HAS_BAD_PARAMETERS` (สาขาที่ 1) |
| `testGoogScopeHasBadParameters_functionWithParams` | `childCount==2`, `getFunctionParameters().hasChildren()` true → report (สาขาที่ 2) |
| `testGoogScopeHasBadParameters_namedFunction` | `childCount==2`, `getFunctionName()!=null` true → report (สาขาที่ 3) |
| `testGoogScopeReferencesThis` | `type == Token.THIS` ที่ `scopeDepth==2` → `GOOG_SCOPE_REFERENCES_THIS` |
| `testGoogScopeUsesReturn` | `type == Token.RETURN` ที่ `scopeDepth==2` → `GOOG_SCOPE_USES_RETURN` |
| `testGoogScopeUsesThrow` | `type == Token.THROW` ที่ `scopeDepth==2` → `GOOG_SCOPE_USES_THROW` |
| `testGoogScopeAliasRedefined` | `aliasVar != null && isLValue(n)` true, `aliasVar.getNode() != n` → `GOOG_SCOPE_ALIAS_REDEFINED` (else branch) |
| `testGoogScopeNonAliasLocal` | `findAliases`: `isQualifiedName()` false → else branch `GOOG_SCOPE_NON_ALIAS_LOCAL` |
| `testFixTypeNodeWithAliasedJsDocType` | `fixTypeNode`: `typeNode.isString()` true, `aliasVar != null` true, recursion ผ่าน child nodes |

**ข้อจำกัดที่ยอมรับ**: branch `preprocessorSymbolTable != null` ใน `validateScopeCall` ไม่ถูกทดสอบ เนื่องจากไม่มี public API ที่ยืนยันได้จาก source ที่ให้มาในการเปิดใช้งานผ่าน full pipeline โดยไม่เดา behavior เพิ่มเติม