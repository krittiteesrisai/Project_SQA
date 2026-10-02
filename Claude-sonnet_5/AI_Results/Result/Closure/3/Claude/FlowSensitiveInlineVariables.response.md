# วิเคราะห์และแนวทางการทดสอบ

`FlowSensitiveInlineVariables` เป็นคลาสระดับ `package-private` ที่ทำงานผ่าน `CompilerPass` เต็มรูปแบบ (ต้องพึ่ง `ControlFlowAnalysis`, `MustBeReachingVariableDef`, `MaybeReachingVariableUse` ฯลฯ) การทดสอบหน่วย (unit test) ที่จะจับ fault ได้จริงต้องรันผ่าน pipeline ของ Closure Compiler ทั้งหมด ซึ่งเป็นวิธีมาตรฐานที่ใช้ทดสอบ pass ประเภทนี้ในโปรเจกต์ Closure Compiler คือการสืบทอดจาก `CompilerTestCase` (คลาสอยู่ใน package เดียวกัน `com.google.javascript.jscomp`, สืบทอดจาก `junit.framework.TestCase` ซึ่งอยู่ใน `junit.jar` ที่อนุญาต)

> **ข้อสมมติที่ต้องระบุไว้ (เพราะซอร์สที่ให้มาไม่ได้แสดง API ของ `CompilerTestCase`/`NodeUtil` โดยตรง):**
> - `CompilerTestCase` มี constructor `CompilerTestCase(String externs)`, เมธอด `test(String js, String expected)`, `testSame(String js)`, และ `protected int getNumRepetitions()`
> - `NodeUtil.functionCallHasSideEffects` / `constructorCallHasSideEffects` โดย defaultจะถือว่าฟังก์ชัน/constructor ที่ไม่รู้จักมี side effect (ตาม convention มาตรฐานของ Closure Compiler) — ใช้เพื่อ trigger branch ที่ระบุไว้ในคอมเมนต์ของซอร์สโค้ดเป้าหมายเท่านั้น (เช่น `x = readProp(b), modifyProp(b); print(x);`)
> - Branch ที่ **ไม่ได้ทดสอบ** เพราะไม่สามารถยืนยัน behavior จากซอร์สที่ให้มาได้ (ระบุเป็นคอมเมนต์ในโค้ด):
>   - `isExported(name)` (ขึ้นกับ CodingConvention ที่ compiler ใช้)
>   - `LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE` (ไม่รู้ค่าจริง)
>   - `reachingDef.dependsOnOuterScopeVars(def)`
>   - การ invalidate candidate อื่นผ่าน `inlinedNewDependencies` (ต้องมี dependency graph ซับซ้อนเกินกว่าจะยืนยันได้จากซอร์สที่ให้)
>   - branch `n == null` ใน `SIDE_EFFECT_PREDICATE` (เกิดจาก internal traversal ของ `CheckPathsBetweenNodes` ไปยัง implicit return เท่านั้น ไม่สามารถ force ได้ตรง ๆ จาก public API)

```java
package com.google.javascript.jscomp;

/**
 * Unit tests for {@link FlowSensitiveInlineVariables}.
 *
 * หมายเหตุ: คลาสเป้าหมายเป็น package-private และทำงานผ่าน pipeline เต็มรูปแบบของ
 * Closure Compiler ดังนั้นจึงทดสอบผ่าน {@link CompilerTestCase} ซึ่งเป็นรูปแบบมาตรฐาน
 * ที่ใช้ทดสอบ CompilerPass ทุกตัวในโปรเจกต์นี้ (สืบทอดจาก junit.framework.TestCase
 * ที่รวมอยู่ใน junit.jar)
 */
public class FlowSensitiveInlineVariablesTest extends CompilerTestCase {

  // externs ที่จำเป็นสำหรับฟังก์ชัน/คอนสตรัคเตอร์ที่ใช้ในเทสเคสต่าง ๆ
  // ไม่มี JSDoc @nosideeffects ใด ๆ -> ตาม convention มาตรฐาน compiler จะถือว่า
  // การเรียกฟังก์ชัน/สร้าง object เหล่านี้ "อาจมี side effect" (ดูหมายเหตุด้านบน)
  private static final String EXTERNS =
      "var print;\n" +
      "function foo(){}\n" +
      "function readProp(b){}\n" +
      "function modifyProp(b){}\n" +
      "function Foo(){}\n";

  public FlowSensitiveInlineVariablesTest() {
    super(EXTERNS);
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new FlowSensitiveInlineVariables(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    // pass นี้ทำให้ AST เปลี่ยนแปลงแบบไม่ idempotent เสมอ (บางตัวแปรถูกลบไปแล้ว)
    // จึงบังคับให้รันครั้งเดียวเพื่อความชัดเจนของผลลัพธ์ที่คาดหวัง
    return 1;
  }

  // ---------------------------------------------------------------------
  // 1) enterScope: global scope ต้องถูกข้าม (t.inGlobalScope() == true)
  // ---------------------------------------------------------------------
  public void testGlobalScopeVariablesNotInlined() {
    testSame("var x = 1; print(x);");
  }

  // ---------------------------------------------------------------------
  // 2) canInline: getDefCfgNode().isFunction() -> ห้าม inline parameter
  // ---------------------------------------------------------------------
  public void testParameterNotInlined() {
    testSame("function f(x){ print(x); }");
  }

  // ---------------------------------------------------------------------
  // 3) inlineVariable(): defParent.isVar() branch (positive case)
  // ---------------------------------------------------------------------
  public void testVarDeclarationInlinedIntoSingleUse() {
    test("function f(){ var x = 1; print(x); }",
         "function f(){ var x; print(1); }");
  }

  // ---------------------------------------------------------------------
  // 4) inlineVariable(): def.isAssign() branch (positive case)
  // ---------------------------------------------------------------------
  public void testAssignInlinedIntoSingleUse() {
    test("function f(){ var x; x = 1; print(x); }",
         "function f(){ var x; print(1); }");
  }

  // ---------------------------------------------------------------------
  // 5) canInline: NodeUtil.isWithinLoop(use) == true -> ห้าม inline
  // ---------------------------------------------------------------------
  public void testVariableUsedWithinLoopNotInlined() {
    testSame("function f(){ var x = 1; while(true){ print(x); } }");
  }

  // ---------------------------------------------------------------------
  // 6) canInline: def.isAssign() && !NodeUtil.isExprAssign(def.getParent())
  //    (assignment ถูกใช้เป็น R-Value) -> ห้าม inline
  // ---------------------------------------------------------------------
  public void testAssignUsedAsRValueNotInlined() {
    testSame("function f(){ var x, y; y = (x = 1); print(x); }");
  }

  // ---------------------------------------------------------------------
  // 7) canInline: checkRightOf(...) พบ side effect ทางขวาของ def
  //    ตรงตามตัวอย่างในคอมเมนต์ของซอร์ส: x = readProp(b), modifyProp(b); print(x);
  // ---------------------------------------------------------------------
  public void testSideEffectRightOfDefinitionBlocksInline() {
    testSame(
        "function f(b){ var x; x = readProp(b), modifyProp(b); print(x); }");
  }

  // ---------------------------------------------------------------------
  // 8) canInline: checkLeftOf(...) พบ side effect ทางซ้ายของ use
  //    ตรงตามตัวอย่างในคอมเมนต์: x = readProp(b); modifyProp(b), print(x);
  // ---------------------------------------------------------------------
  public void testSideEffectLeftOfUseBlocksInline() {
    testSame(
        "function f(b){ var x; x = readProp(b); modifyProp(b), print(x); }");
  }

  // ---------------------------------------------------------------------
  // 9) canInline: NodeUtil.mayHaveSideEffects(def.getLastChild()) == true
  // ---------------------------------------------------------------------
  public void testRhsWithSideEffectCallNotInlined() {
    testSame("function f(){ var x = foo(); print(x); }");
  }

  // ---------------------------------------------------------------------
  // 10) canInline: numUseWithinUseCfgNode != 1 (ใช้ตัวแปรซ้ำในสเตทเมนต์เดียว)
  // ---------------------------------------------------------------------
  public void testMultipleUsesInSameStatementNotInlined() {
    testSame("function f(){ var x = 1; print(x + x); }");
  }

  // ---------------------------------------------------------------------
  // 11) canInline: reachingUses.getUses(...).size() != 1
  // ---------------------------------------------------------------------
  public void testMultipleUsesAcrossStatementsNotInlined() {
    testSame("function f(){ var x = 1; print(x); print(x); }");
  }

  // ---------------------------------------------------------------------
  // 12) canInline: NodeUtil.has(...) พบ GETPROP ใน rhs
  //     ตรงตามตัวอย่างในคอมเมนต์: var x = a.b.c; ...
  // ---------------------------------------------------------------------
  public void testGetPropInRhsNotInlined() {
    testSame("function f(a){ var x = a.b; print(x); }");
  }

  // ---------------------------------------------------------------------
  // 13) canInline: NodeUtil.has(...) พบ ARRAYLIT ใน rhs
  // ---------------------------------------------------------------------
  public void testArrayLiteralInRhsNotInlined() {
    testSame("function f(){ var x = [1, 2]; print(x); }");
  }

  // ---------------------------------------------------------------------
  // 14) canInline: NodeUtil.has(...) พบ OBJECTLIT ใน rhs
  // ---------------------------------------------------------------------
  public void testObjectLiteralInRhsNotInlined() {
    testSame("function f(){ var x = {a: 1}; print(x); }");
  }

  // ---------------------------------------------------------------------
  // 15) canInline: NodeUtil.has(...) พบ NEW ใน rhs
  // ---------------------------------------------------------------------
  public void testNewExpressionInRhsNotInlined() {
    testSame("function f(){ var x = new Foo(); print(x); }");
  }

  // ---------------------------------------------------------------------
  // 16) canInline: NodeUtil.has(...) พบ REGEXP ใน rhs
  // ---------------------------------------------------------------------
  public void testRegexpInRhsNotInlined() {
    testSame("function f(){ var x = /abc/; print(x); }");
  }

  // ---------------------------------------------------------------------
  // 17) canInline: CheckPathsBetweenNodes พบ side effect ระหว่าง def/use
  //     ตรงตามตัวอย่างในคอมเมนต์: x = readProp(b); while(modifyProp(b)) {}; print(x);
  //     หมายเหตุ: readProp(b) เองก็อาจถูกดัก mayHaveSideEffects ก่อนแล้ว
  //     แต่ผลลัพธ์ท้ายสุด (ไม่ inline) ตรงกับ assertion ไม่ว่าจะถูก block จาก branch ใด
  // ---------------------------------------------------------------------
  public void testSideEffectBetweenDefAndUseViaPathCheckNotInlined() {
    testSame(
        "function f(b){ var x = readProp(b); "
        + "while (modifyProp(b)) {} print(x); }");
  }

  // ---------------------------------------------------------------------
  // 18) canInline: getDefCfgNode().getNext() != useCfgNode แต่ path ไม่มี
  //     side effect ตาม SIDE_EFFECT_PREDICATE -> ยัง inline ได้ (positive case)
  // ---------------------------------------------------------------------
  public void testNoSideEffectPathAllowsInline() {
    test(
        "function f(b){ var x = 1; while (b) { b = false; } print(x); }",
        "function f(b){ var x; while (b) { b = false; } print(1); }");
  }

  // ---------------------------------------------------------------------
  // 19) SIDE_EFFECT_PREDICATE: n.isDelProp() == true ระหว่าง def และ use
  // ---------------------------------------------------------------------
  public void testDeletePropertyBetweenDefAndUseNotInlined() {
    testSame(
        "function f(a){ var x = 1; delete a.b; print(x); }");
  }
}
```

## ตารางสรุป Test method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testGlobalScopeVariablesNotInlined` | `enterScope`: `t.inGlobalScope() == true` → return early |
| `testParameterNotInlined` | `canInline`: `getDefCfgNode().isFunction() == true` |
| `testVarDeclarationInlinedIntoSingleUse` | `inlineVariable`: `defParent.isVar()` branch (positive) |
| `testAssignInlinedIntoSingleUse` | `inlineVariable`: `def.isAssign()` branch + `defParent.isExprResult()` (positive) |
| `testVariableUsedWithinLoopNotInlined` | `canInline`: `NodeUtil.isWithinLoop(use) == true` |
| `testAssignUsedAsRValueNotInlined` | `canInline`: `def.isAssign() && !NodeUtil.isExprAssign(...)` |
| `testSideEffectRightOfDefinitionBlocksInline` | `canInline`: `checkRightOf(...)` == true |
| `testSideEffectLeftOfUseBlocksInline` | `canInline`: `checkLeftOf(...)` == true |
| `testRhsWithSideEffectCallNotInlined` | `canInline`: `NodeUtil.mayHaveSideEffects(def.getLastChild())` == true |
| `testMultipleUsesInSameStatementNotInlined` | `canInline`: `numUseWithinUseCfgNode != 1` |
| `testMultipleUsesAcrossStatementsNotInlined` | `canInline`: `uses.size() != 1` |
| `testGetPropInRhsNotInlined` | `canInline`: has-predicate `GETPROP` |
| `testArrayLiteralInRhsNotInlined` | `canInline`: has-predicate `ARRAYLIT` |
| `testObjectLiteralInRhsNotInlined` | `canInline`: has-predicate `OBJECTLIT` |
| `testNewExpressionInRhsNotInlined` | `canInline`: has-predicate `NEW` |
| `testRegexpInRhsNotInlined` | `canInline`: has-predicate `REGEXP` |
| `testSideEffectBetweenDefAndUseViaPathCheckNotInlined` | `canInline`: `CheckPathsBetweenNodes.somePathsSatisfyPredicate()` == true |
| `testNoSideEffectPathAllowsInline` | `canInline`: statement-block path check ไม่พบ side effect (positive, ผ่านทุก branch จน `return true`) |
| `testDeletePropertyBetweenDefAndUseNotInlined` | `SIDE_EFFECT_PREDICATE`: `n.isDelProp() == true` |

**Branch ที่ไม่ได้ครอบคลุม (ระบุไว้ตามข้อกำหนดห้ามเดา behavior):**
- `enterScope`: `t.getScope().getVarCount() > MAX_VARIABLES_TO_ANALYZE`
- `GatherCandiates.visit`: `compiler.getCodingConvention().isExported(name)`
- `GatherCandiates.visit`: `reachingDef.dependsOnOuterScopeVars(def)`
- `enterScope` loop: `inlinedNewDependencies` invalidation ของ candidate อื่น
- `SIDE_EFFECT_PREDICATE.apply(null)` (branch `n == null`)
- `inlineVariable`: `while (defParent.getParent().isLabel())` (ต้อง construct label statement ที่ครอบ assign statement ซึ่งซับซ้อนเกินกว่าจะยืนยัน behavior ได้อย่างมั่นใจจากซอร์สที่ให้)