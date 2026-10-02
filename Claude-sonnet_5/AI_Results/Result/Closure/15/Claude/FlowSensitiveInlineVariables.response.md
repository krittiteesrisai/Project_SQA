# วิเคราะห์และแนวทางการทดสอบ

`FlowSensitiveInlineVariables` เป็นคลาส **package-private** ใน `com.google.javascript.jscomp` ที่ทำงานเป็น `CompilerPass` เต็มรูปแบบ (ต้องพึ่งพา `ControlFlowAnalysis`, `MustBeReachingVariableDef`, `MaybeReachingVariableUse`, `Node`(rhino AST) ฯลฯ ภายใน) การจะทดสอบ private inner class (`Candidate`, `GatherCandiates`) และ private static method (`checkRightOf`, `checkLeftOf`) แบบ isolate ทำไม่ได้จริงในระดับ unit เพราะ dependency กับ `Node`/CFG จริง

แนวทางมาตรฐานของโปรเจกต์นี้ (และของ Defects4J: Closure‑15) คือใช้ **`CompilerTestCase`** (test utility ที่มาพร้อมกับซอร์สของ closure-compiler เอง อยู่ใน classpath เดียวกับคลาสเป้าหมาย ไม่ใช่ jar ภายนอก) เพื่อ compile ผ่าน pass จริงแล้วเทียบ AST ก่อน/หลัง วิธีนี้ทำให้เข้าถึง branch ต่าง ๆ ภายใน private method ได้จริงผ่านพฤติกรรมที่สังเกตได้ (input/output JS)

> **หมายเหตุ/ข้อสมมติ (ตามข้อกำหนดที่ 4):**
> - สมมติว่า `CompilerTestCase` มี constructor `CompilerTestCase(String externs)`, method `test(String, String)`, `testSame(String)`, และ `getProcessor(Compiler)` เป็น pattern มาตรฐานที่ใช้ทั่วทั้งชุดทดสอบของ closure-compiler (ไม่ใช่ jar ภายนอกในรายการ แต่เป็นส่วนหนึ่งของ source เดียวกับคลาสเป้าหมาย)
> - ค่า default ของ `compiler.getCodingConvention().isExported(name)` และ `reachingDef.dependsOnOuterScopeVars(...)` ไม่ได้ระบุพฤติกรรมชัดเจนในซอร์สที่ให้มา จึง**ไม่เขียนเทสสำหรับ branch เหล่านี้โดยตรง** (คอมเมนต์กำกับไว้ในโค้ด)
> - สมมติว่าฟังก์ชัน call ที่ไม่รู้จัก (เช่น `foo()`, `modifyProp()`) ถูกพิจารณาว่า “มี side effect” ตามพฤติกรรม default ของ `NodeUtil.functionCallHasSideEffects` (ปกติของ closure-compiler เมื่อไม่มี externs/annotation บอกว่าเป็น pure function)

```java
package com.google.javascript.jscomp;

/**
 * Unit/characterization tests for {@link FlowSensitiveInlineVariables}.
 *
 * หมายเหตุ: เนื่องจากคลาสเป้าหมายเป็น package-private และพึ่งพา CFG/AST จริง
 * การทดสอบจึงทำผ่าน {@link CompilerTestCase} ซึ่งรัน pass จริงบนซอร์ส JS
 * แล้วเทียบผลลัพธ์ AST (แปลงกลับเป็น source) ก่อน/หลัง
 */
public class FlowSensitiveInlineVariablesTest extends CompilerTestCase {

  public FlowSensitiveInlineVariablesTest() {
    // ไม่มี externs พิเศษที่จำเป็นสำหรับการทดสอบ pass นี้
    super("");
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return new FlowSensitiveInlineVariables(compiler);
  }

  // ---------- Helpers ----------

  /**
   * enterScope() ของคลาสเป้าหมาย return ทันทีถ้าเป็น global scope
   * ดังนั้นต้อง wrap โค้ดทดสอบไว้ในฟังก์ชันเสมอ เพื่อให้ pass ทำงานจริง
   */
  private static String wrap(String src) {
    return "function _FUNCTION(){" + src + "}";
  }

  private void inline(String input, String expected) {
    test(wrap(input), wrap(expected));
  }

  private void noInline(String input) {
    inline(input, input);
  }

  // ---------- 1) Global scope: enterScope -> t.inGlobalScope() == true ----------

  public void testGlobalVariableNotInlined() {
    // ไม่ wrap ด้วยฟังก์ชัน -> อยู่ใน global scope -> pass ต้อง return ทันที ไม่แก้ไขอะไร
    testSame("var x = 1; print(x);");
  }

  // ---------- 2) Simple VAR inline: defParent.isVar() branch ----------

  public void testSimpleVarInline() {
    inline("var x = 1; print(x);",
           "var x; print(1);");
  }

  // ---------- 3) Simple ASSIGN inline: def.isAssign() branch,
  //              Preconditions.checkState(defParent.isExprResult()) ----------

  public void testSimpleAssignInline() {
    inline("var x; x = 1; print(x);",
           "var x; print(1);");
  }

  // ---------- 4) Label unwrap loop: while (defParent.getParent().isLabel()) ----------

  public void testAssignUnderLabelInline() {
    inline("var x; l: x = 1; print(x);",
           "var x; print(1);");
  }

  // ---------- 5) canInline: defCfgNode.isFunction() -> true (parameter) ----------

  public void testNoInlineFunctionParameter() {
    noInline("function f(a) { print(a); }");
  }

  // ---------- 6) canInline: numUseWithinUseCfgNode != 1 (multiple uses) ----------

  public void testNoInlineMultipleUses() {
    noInline("var x = 1; print(x); print(x);");
  }

  // ---------- 7) canInline: NodeUtil.isWithinLoop(use) == true ----------

  public void testNoInlineWithinLoop() {
    noInline("var x = 1; while (cond) { print(x); }");
  }

  // ---------- 8) canInline: def.isAssign() && !isExprAssign(def.getParent()) ----------

  public void testNoInlineAssignUsedAsRValue() {
    // x = 1 ถูกใช้เป็นค่าเริ่มต้นของ y (ไม่ใช่ EXPR_RESULT ตรง ๆ)
    noInline("var x; var y = (x = 1); print(x);");
  }

  // ---------- 9) canInline: NodeUtil.mayHaveSideEffects(def.getLastChild()) ----------

  public void testNoInlineRhsHasSideEffect() {
    // foo() ไม่รู้จักว่า pure -> ถือว่ามี side effect ตาม default assumption
    noInline("var x = foo(); print(x);");
  }

  // ---------- 10) canInline: checkRightOf(...) พบ side effect ทางขวาของ def ----------

  public void testNoInlineSideEffectRightOfDef() {
    // ตัวอย่างตรงคอมเมนต์ในซอร์ส: x = readProp(b), modifyProp(b); print(x);
    noInline("var x; x = readProp(), modifyProp(); print(x);");
  }

  // ---------- 11) canInline: checkLeftOf(...) พบ side effect ทางซ้ายของ use ----------

  public void testNoInlineSideEffectLeftOfUse() {
    // ตัวอย่างตรงคอมเมนต์ในซอร์ส: x = readProp(b); modifyProp(b), print(x);
    noInline("var x; x = readProp(); modifyProp(), print(x);");
  }

  // ---------- 12) canInline: NodeUtil.has(...) พบ GETPROP -> aliasing risk ----------

  public void testNoInlineGetPropAliasRisk() {
    noInline("var x; x = a.b; c.b = 1; print(x);");
  }

  // ---------- 13) canInline: path-check branch เมื่อ defCfgNode/useCfgNode ไม่ติดกัน
  //               และไม่มี side effect ระหว่างทาง -> ยัง inline ได้ ----------

  public void testInlineAcrossNonAdjacentStatementsNoSideEffect() {
    inline("var x = 1; var y = 2; print(x);",
           "var x; var y = 2; print(1);");
  }

  // ---------- 14) canInline: path-check branch พบ side effect ระหว่างทาง -> ห้าม inline ----------

  public void testNoInlineSideEffectBetweenNonAdjacentStatements() {
    noInline("var x = 1; foo(); print(x);");
  }

  // ---------- 15) enterScope: LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE
  //               < t.getScope().getVarCount() -> return early, ไม่วิเคราะห์เลย ----------

  public void testTooManyVariablesScopeSkipped() {
    int max = LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE;
    StringBuilder src = new StringBuilder();
    for (int i = 0; i <= max; i++) {
      src.append("var v").append(i).append(" = ").append(i).append(";");
    }
    // เงื่อนไขที่ปกติควร inline ได้ แต่ scope ถูกข้ามไปเพราะจำนวนตัวแปรเกินเกณฑ์
    src.append("var x = 1; print(x);");
    String code = wrap(src.toString());
    testSame(code);
  }

  // ---------- ขอบเขต/รูปแบบผิดปกติเพิ่มเติม ----------

  public void testEmptyFunctionBodyNoCrash() {
    // ฟังก์ชันไม่มี body statement ใด ๆ ที่จะ inline ได้ -> ต้องไม่ throw exception
    testSame(wrap(""));
  }

  public void testNoCandidateWhenNoUse() {
    // ประกาศตัวแปรแต่ไม่มีการใช้เลย -> ไม่มี candidate เกิดขึ้น ไม่ควรมีการแก้ไข
    noInline("var x = 1;");
  }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGlobalVariableNotInlined` | `enterScope`: `if (t.inGlobalScope()) return;` — **true** branch |
| `testSimpleVarInline` | `inlineVariable`: `defParent.isVar()` branch (else-if) |
| `testSimpleAssignInline` | `inlineVariable`: `def.isAssign()` branch, `Preconditions.checkState(defParent.isExprResult())`, while-label loop **false** (ไม่มี label) |
| `testAssignUnderLabelInline` | `while (defParent.getParent().isLabel())` — loop วนจริง (label unwrap) |
| `testNoInlineFunctionParameter` | `canInline`: `if (defCfgNode.isFunction()) return false;` — **true** branch |
| `testNoInlineMultipleUses` | `canInline`: `if (numUseWithinUseCfgNode != 1) return false;` — **true** branch |
| `testNoInlineWithinLoop` | `canInline`: `if (NodeUtil.isWithinLoop(use)) return false;` — **true** branch |
| `testNoInlineAssignUsedAsRValue` | `canInline`: `def.isAssign() && !NodeUtil.isExprAssign(def.getParent())` — **true** branch |
| `testNoInlineRhsHasSideEffect` | `canInline`: `NodeUtil.mayHaveSideEffects(def.getLastChild())` — **true** branch |
| `testNoInlineSideEffectRightOfDef` | `canInline`: `checkRightOf(def, defCfgNode, SIDE_EFFECT_PREDICATE)` — **true** branch (ลูป inner/outer ของ `checkRightOf`) |
| `testNoInlineSideEffectLeftOfUse` | `canInline`: `checkLeftOf(use, useCfgNode, SIDE_EFFECT_PREDICATE)` — **true** branch (ลูป inner/outer ของ `checkLeftOf`) |
| `testNoInlineGetPropAliasRisk` | `canInline`: `NodeUtil.has(...)` พบ `GETPROP`/switch-case ใน predicate — **true** branch |
| `testInlineAcrossNonAdjacentStatementsNoSideEffect` | `canInline`: `NodeUtil.isStatementBlock(...) && defCfgNode.getNext() != useCfgNode` — **true**, แต่ `pathCheck.somePathsSatisfyPredicate()` — **false** |
| `testNoInlineSideEffectBetweenNonAdjacentStatements` | เงื่อนไขเดียวกันแต่ `somePathsSatisfyPredicate()` — **true** branch |
| `testTooManyVariablesScopeSkipped` | `enterScope`: `MAX_VARIABLES_TO_ANALYZE < getVarCount()` — **true** branch |
| `testEmptyFunctionBodyNoCrash` | Boundary case: ไม่มี statement ให้ traverse เลย (loop 0 iteration ใน `GatherCandiates`) |
| `testNoCandidateWhenNoUse` | Boundary case: ไม่มี use เกิดขึ้นเลย -> `candidates` ว่าง -> loop `for (Candidate c : candidates)` ไม่ทำงาน (0 iteration) |

**Branch ที่ไม่ได้ทดสอบโดยตรง (ระบุเหตุผลตามข้อกำหนดที่ 4):** `reachingDef.dependsOnOuterScopeVars`, `compiler.getCodingConvention().isExported(name)`, และกรณี `parent.isCatch()` ใน `GatherCandiates` — เนื่องจากพฤติกรรม default ของ dependency เหล่านี้ไม่ได้ระบุไว้ชัดเจนในซอร์สที่ให้มา จึงไม่ขอสมมติ behavior เพิ่มเติม