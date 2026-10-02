# หมายเหตุสำคัญก่อนเริ่ม (สมมติฐานที่ต้องกำกับไว้ตามข้อ 4)

`CollapseVariableDeclarations` เป็น package-private class ที่ผูกกับโครงสร้าง `Node`/`Scope`/`NodeTraversal` ของ Closure Compiler อย่างลึก การสร้าง AST เองด้วยมือทุก node จะเสี่ยงผิดพลาดสูงและไม่สะท้อน behavior จริง จึงเลือกใช้ **`CompilerTestCase`** ซึ่งเป็น test-utility มาตรฐานที่อยู่ใน source tree เดียวกัน (package `com.google.javascript.jscomp`) ของโปรเจกต์ Closure Compiler สำหรับทดสอบ `CompilerPass` ทุกตัว (เป็นแนวปฏิบัติจริงของ Defects4J Closure-8b)

สมมติฐานที่ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา (กำกับด้วยคอมเมนต์ในโค้ด):
- `CompilerTestCase` มี constructor แบบไม่มีอาร์กิวเมนต์ และมีเมธอด `test(String, String)` / `testSame(String)` / `getProcessor(Compiler)`
- `NodeUtil.isExprAssign(n)` ตรวจสอบเพียงว่า statement เป็น `EXPR_RESULT` ที่ครอบ `ASSIGN` (โอเปอเรเตอร์ `=`) โดยไม่ตรวจสอบชนิดของ lhs (เพราะโค้ดตรวจ `lhs.isName()` แยกอีกที)
- Parser ไม่แทรก synthetic `BLOCK` ให้ single-statement if/else (`if (x) var a=1; else var b=1;`) จึงทำให้ `parent.isIf()` เป็น true ได้จริงตามที่คอมเมนต์ในซอร์สระบุ
- ไม่ยืนยันว่า `test()` เปรียบเทียบ `JSDocInfo` ด้วยหรือไม่ จึงเลี่ยงการ assert เนื้อหา `@suppress` โดยตรง

จุดที่ **ไม่ได้ทดสอบ** เพราะไม่มีทางตั้งค่าได้อย่างปลอดภัยจากซอร์สที่ให้มา: การเรียก constructor ตอนที่ `compiler.getLifeCycleStage().isNormalized()==true` (จะ throw `IllegalStateException`) — ไม่มี API ที่ยืนยันได้ว่าจะบังคับ lifecycle stage ผ่าน `CompilerTestCase` ได้อย่างไร

---

# โค้ดชุดทดสอบ

```java
package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * Unit tests for {@link CollapseVariableDeclarations}.
 *
 * ใช้ CompilerTestCase (test utility มาตรฐานของ Closure Compiler ใน package เดียวกัน)
 * เพื่อ parse/run pass/compare AST ผลลัพธ์ การตัดสินใจ expected output ทุกกรณี
 * มาจากการ trace โค้ดต้นฉบับทีละบรรทัด ไม่ได้เดา behavior ที่ไม่มีในซอร์ส
 */
public class CollapseVariableDeclarationsTest extends CompilerTestCase {

  // สมมติฐาน: CompilerTestCase มี default (no-arg) constructor ใช้งานได้
  // และค่า lifecycle stage เริ่มต้นไม่ใช่ normalized (ตรงกับ precondition ของ pass)

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CollapseVariableDeclarations(compiler);
  }

  // ---------------------------------------------------------------------
  // Boundary: ไม่มีสิ่งที่จะ collapse ได้ -> collapses.isEmpty() == true
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyScript() {
    // ไม่มี statement ใด ๆ -> process() ไม่ทำอะไร (branch: collapses.isEmpty()==true)
    testSame("");
  }

  @Test
  public void testSingleVarStubNoCollapse() {
    // มี var เดียวไม่มีตัวตามหลัง -> hasNodesToCollapse=false -> ไม่มี Collapse ถูกสร้าง
    testSame("var a;");
  }

  @Test
  public void testSingleVarWithValueNoCollapse() {
    // เหมือนด้านบนแต่มี initializer -> ครอบคลุม branch "not blacklisted"
    // ใน blacklistStubVars (child.getFirstChild() != null)
    testSame("var a = 1;");
  }

  // ---------------------------------------------------------------------
  // Basic var-to-var collapsing (loop เดินซ้ำผ่านหลาย sibling)
  // ---------------------------------------------------------------------

  @Test
  public void testCollapsingTwoVarStubs() {
    test("var a; var b;", "var a, b;");
  }

  @Test
  public void testCollapsingTwoVarsWithValues() {
    test("var a = 1; var b = 2;", "var a=1, b=2;");
  }

  @Test
  public void testCollapsingThreeVarsMixed() {
    // ตรวจสอบ while-loop เดินซ้ำมากกว่า 1 รอบ (3 statement)
    test("var a; var b = 1; var c = 2;", "var a, b=1, c=2;");
  }

  // ---------------------------------------------------------------------
  // blacklistedVars: stub var ("var a;") ห้ามถูก redeclare ด้วย assign ตามหลัง
  // (workaround สำหรับบั๊ก Firefox ตามคอมเมนต์ในซอร์ส)
  // ---------------------------------------------------------------------

  @Test
  public void testStubVarsBlockAssignRedeclare() {
    // a และ b เป็น stub var -> ถูก blacklist -> a=1;/b=2; ไม่ถูก merge เข้าไปใน var
    // แต่ตัว "var a; var b;" เองยัง collapse กันได้ตามปกติ
    test("var a; var b; a=1; b=2;", "var a, b; a=1; b=2;");
  }

  @Test
  public void testMultiNameStubVarBlacklist() {
    // ตรวจ loop ภายใน blacklistStubVars ที่วนผ่านหลาย NAME child ใน var เดียว
    testSame("var a, b; a=1; b=2;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared: ทุกเงื่อนไขที่เป็น true ครบ -> merge assign เข้ากับ var เดิม
  // (ผลลัพธ์จริงจากการ trace applyCollapses(): เกิดการ "redeclare" ชื่อซ้ำในบรรทัดเดียว
  //  พร้อม JSDoc @suppress duplicate ถูกแนบไว้ที่ node var แต่ไม่ assert เนื้อหา JSDoc
  //  เพราะไม่ยืนยัน behavior การเทียบ JSDoc ของ CompilerTestCase.test())
  // ---------------------------------------------------------------------

  @Test
  public void testAssignRedeclareMergeWithInitializedVar() {
    // a ประกาศด้วย initializer (ไม่ถูก blacklist) จึงถูก redeclare ได้จริง
    test("var a = 1; a = 5; var b = 2;", "var a=1, a=5, b=2;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared == false เพราะ lhs ไม่ใช่ NAME (เช่น property access)
  // ---------------------------------------------------------------------

  @Test
  public void testPropertyAssignNotRedeclarable() {
    testSame("var a; a.x = 1;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared == false เพราะ s.getVar(...) == null (ไม่เคยประกาศตัวแปรนี้)
  // ---------------------------------------------------------------------

  @Test
  public void testAssignToUndeclaredVarNotCollapsed() {
    testSame("var a = 1; b = 2;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared == false เพราะ var.getScope() != s (ตัวแปร global ถูกอ้างจาก
  // scope ของฟังก์ชันภายใน)
  // ---------------------------------------------------------------------

  @Test
  public void testAssignInDifferentScopeNotCollapsed() {
    testSame("var a = 1; function f() { var x; a = 2; }");
  }

  // ---------------------------------------------------------------------
  // parent.isIf(): VAR ที่เป็น then/else clause ของ IF โดยตรง (ไม่มี block)
  // ต้องไม่ถูก collapse ตามคอมเมนต์ในซอร์ส
  // ---------------------------------------------------------------------

  @Test
  public void testIfWithoutBlockVarsNotCollapsed() {
    testSame("if (x) var a = 1; else var b = 1;");
  }

  @Test
  public void testVarsInsideIfBlockStillCollapse() {
    // parent คือ BLOCK ไม่ใช่ IF โดยตรง -> ยัง collapse กันได้ตามปกติ
    test("if (x) { var a; var b; }", "if (x) { var a, b; }");
  }

  // ---------------------------------------------------------------------
  // hasVar ต้องเป็น true จึงจะเกิด collapse แม้ hasNodesToCollapse เป็น true แล้วก็ตาม
  // ---------------------------------------------------------------------

  @Test
  public void testChainBreaksOnHasVarFalse() {
    // "var a=1; var b=2;" collapse กันได้ตามปกติ (หยุดที่ foo() เพราะไม่ใช่ var/assign)
    // ส่วน "a=3; b=4;" เป็น chain ของ assign ล้วน ๆ ไม่มี var คั่นอยู่เลย
    // -> hasVar ยังเป็น false ตลอด -> ไม่เกิดการ collapse สำหรับคู่นี้
    test("var a = 1; var b = 2; foo(); a = 3; b = 4;",
         "var a=1, b=2; foo(); a=3; b=4;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared == false เพราะ NodeUtil.isExprAssign เป็น false (ไม่ใช่ assign)
  // ---------------------------------------------------------------------

  @Test
  public void testNoCollapseWhenOnlyFunctionCalls() {
    testSame("foo(); bar();");
  }
}
```

---

# ตารางสรุปการครอบคลุม Branch/Condition

| Test method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testEmptyScript` | `process()`: `collapses.isEmpty()==true` (ไม่ apply/ไม่ report code change) |
| `testSingleVarStubNoCollapse` | `hasNodesToCollapse==false` (ไม่มี sibling ให้ merge), `child.getFirstChild()==null` ใน `blacklistStubVars` |
| `testSingleVarWithValueNoCollapse` | `blacklistStubVars`: `child.getFirstChild()!=null` (ไม่ blacklist) |
| `testCollapsingTwoVarStubs` | while-loop เข้ารอบ, `n.isVar()==true` ในลูป, `hasNodesToCollapse&&hasVar==true` |
| `testCollapsingTwoVarsWithValues` | เหมือนข้างต้นแต่ initializer ยังคงอยู่ครบ (ตรวจ applyCollapses ย้าย child ถูกต้อง) |
| `testCollapsingThreeVarsMixed` | while-loop วนซ้ำมากกว่า 1 ครั้ง |
| `testStubVarsBlockAssignRedeclare` | `canBeRedeclared`: `blacklistedVars.contains(var)==true` → false |
| `testMultiNameStubVarBlacklist` | `blacklistStubVars` วนหลาย NAME child ใน var เดียว |
| `testAssignRedeclareMergeWithInitializedVar` | `canBeRedeclared` ทุกเงื่อนไข true, `hasVar==true` ผ่าน assign, `redeclaration=true` path ใน `applyCollapses` (branch `n.isVar()==false` ใน apply loop) |
| `testPropertyAssignNotRedeclarable` | `canBeRedeclared`: `lhs.isName()==false` |
| `testAssignToUndeclaredVarNotCollapsed` | `canBeRedeclared`: `var==null` |
| `testAssignInDifferentScopeNotCollapsed` | `canBeRedeclared`: `var.getScope()==s` → false |
| `testIfWithoutBlockVarsNotCollapsed` | `parent.isIf()==true` → return ก่อนเริ่ม chain |
| `testVarsInsideIfBlockStillCollapse` | `parent.isIf()==false` (parent เป็น BLOCK) ยัง collapse ได้ |
| `testChainBreaksOnHasVarFalse` | `hasNodesToCollapse&&hasVar`: กรณี `hasVar==false` (chain assign ล้วนไม่มี var) → ไม่ collapse; และกรณี chain ก่อนหน้าที่ `hasVar==true` |
| `testNoCollapseWhenOnlyFunctionCalls` | `canBeRedeclared`: `NodeUtil.isExprAssign==false` → top-level `if (!n.isVar() && !canBeRedeclared) return` เป็น true |