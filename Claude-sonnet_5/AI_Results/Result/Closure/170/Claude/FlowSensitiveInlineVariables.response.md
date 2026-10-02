# หมายเหตุการออกแบบการทดสอบ

`FlowSensitiveInlineVariables` เป็นคลาสที่ทำงานเป็น `CompilerPass`/`ScopedCallback` ผูกติดกับ Closure Compiler framework อย่างแน่นแฟ้น (ต้องมี `ControlFlowGraph`, `MustBeReachingVariableDef`, `MaybeReachingVariableUse`, `Scope` ที่ถูกต้อง) และ inner class ทั้งหมด (`Candidate`, `GatherCandiates`) เป็น **private** จึงไม่มี seam ให้ mock/stub โดยตรง

วิธีที่ตรงกับซอร์สและปลอดภัยที่สุดคือ **ขับเคลื่อน pass ผ่าน `Compiler` จริง** (parse → `pass.process(externsRoot, mainRoot)` → `toSource()`) เช่นเดียวกับที่ `CompilerTestCase` ทำในโปรเจกต์เดียวกัน — เป็น integration-style unit test ที่เรียก public entry point (`process`) ของคลาสเป้าหมายโดยตรง

จุดที่ **ไม่มั่นใจ 100%** ในรายละเอียด internal (เช่น ค่า `LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE`, `isExported()`, `dependsOnOuterScopeVars`) จะไม่ assert ผลลัพธ์ที่เดาเอา — มีคอมเมนต์กำกับไว้ในโค้ด

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * Unit tests for {@link FlowSensitiveInlineVariables}.
 *
 * หมายเหตุสำคัญ:
 * - คลาสเป้าหมายไม่มี seam สำหรับ mock (inner class เป็น private ทั้งหมด) จึงทดสอบผ่าน
 *   Compiler จริง: parseInputs() -> pass.process(externsRoot, mainRoot) -> toSource()
 * - พฤติกรรมที่ assert อ้างอิงจากคอมเมนต์/โค้ดใน Candidate#canInline และ
 *   Candidate#inlineVariable เท่านั้น
 * - กรณีที่ไม่มั่นใจ behavior แน่ชัด (เช่น isExported, MAX_VARIABLES_TO_ANALYZE,
 *   dependsOnOuterScopeVars) จะไม่ assert ค่าที่เดาเอา มีคอมเมนต์กำกับไว้
 */
public class FlowSensitiveInlineVariablesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /** รัน pass กับซอร์ส JS แล้วคืนค่า source หลัง process */
  private String inline(String js) {
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Collections.<SourceFile>emptyList();
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));
    compiler.init(externs, inputs, options);

    Node root = compiler.parseInputs();
    assertNotNull(
        "Parse ควรสำเร็จ แต่พบ error count=" + compiler.getErrorCount(), root);

    Node externsRoot = root.getFirstChild();
    Node mainRoot = root.getLastChild();

    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(externsRoot, mainRoot);

    return compiler.toSource();
  }

  private static String norm(String s) {
    return s.replaceAll("\\s+", "");
  }

  // ---------- Boundary / empty input ----------

  @Test
  public void testEmptyProgram_doesNotThrow() {
    String result = inline("");
    assertNotNull(result);
  }

  @Test
  public void testGlobalScope_notInlined() {
    // enterScope: if (t.inGlobalScope()) return; -> ไม่มีการวิเคราะห์ระดับ global เลย
    String result = inline("var x = 1; print(x);");
    String n = norm(result);
    assertTrue(n.contains("print(x)"));
    assertFalse(n.contains("print(1)"));
  }

  // ---------- Malformed input ----------

  @Test
  public void testMalformedInput_reportsErrorInsteadOfCrashingPass() {
    // ซอร์สไม่มีการป้องกัน null Node จึงไม่ควรเรียก pass.process กับ AST ที่ parse ไม่สำเร็จ
    // (ทดสอบขอบเขตการใช้งานที่ถูกต้อง ไม่ใช่ behavior ของ FlowSensitiveInlineVariables เอง)
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Collections.<SourceFile>emptyList();
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("bad.js", "function( { "));
    compiler.init(externs, inputs, options);
    Node root = compiler.parseInputs();
    assertTrue(root == null || compiler.getErrorCount() > 0);
  }

  // ---------- Simple successful inline ----------

  @Test
  public void testSimpleVarDefinitionInlined() {
    // single def, single use, ไม่มี side effect, ไม่อยู่ใน loop
    // defParent.isVar() -> ลบเฉพาะ rhs (เหลือ "var x;")
    String result = inline("function f(){var x=1;print(x);}");
    String n = norm(result);
    assertTrue("expected inlined value: " + result, n.contains("print(1)"));
    assertFalse(n.contains("print(x)"));
    assertTrue("declaration ควรยังอยู่ (ไม่ถูกลบทั้งบรรทัด)", n.contains("varx;"));
  }

  @Test
  public void testSimpleAssignDefinitionInlined() {
    // def.isAssign() branch ใน inlineVariable(): ลบ statement "x=1;" ทั้งบรรทัด
    String result = inline("function f(){var x;x=1;print(x);}");
    String n = norm(result);
    assertTrue(n.contains("print(1)"));
    assertFalse(n.contains("x=1"));
  }

  @Test
  public void testMultipleIndependentCandidatesAllInlined() {
    // ครอบคลุม for (Candidate c : candidates) วนหลายตัว, canInline() คืน true หลายครั้ง
    String result = inline("function f(){var a=1;var b=2;print(a);print(b);}");
    String n = norm(result);
    assertTrue(n.contains("print(1)"));
    assertTrue(n.contains("print(2)"));
    assertFalse(n.contains("print(a)"));
    assertFalse(n.contains("print(b)"));
  }

  // ---------- getDefCfgNode().isFunction() -> false (parameter) ----------

  @Test
  public void testParameterCannotBeInlined() {
    String result = inline("function f(x){print(x);}");
    String n = norm(result);
    assertTrue(n.contains("print(x)"));
  }

  // ---------- ไม่มี use เลย -> ไม่มี Candidate ----------

  @Test
  public void testNoUsage_noCandidateNoChange() {
    String result = inline("function f(){var x=1;}");
    String n = norm(result);
    assertTrue(n.contains("varx=1"));
  }

  // ---------- assign used as R-value -> blocked ----------

  @Test
  public void testAssignUsedAsRValue_notInlined() {
    // def.isAssign() && !NodeUtil.isExprAssign(def.getParent()) -> return false
    String result = inline("function f(){var x;var y=(x=1);print(x);}");
    String n = norm(result);
    assertTrue(n.contains("print(x)"));
    assertFalse(n.contains("print(1)"));
  }

  // ---------- side effect ขวามือของ definition ----------

  @Test
  public void testSideEffectRightOfDefinition_notInlined() {
    // checkRightOf(...): "x = readProp(b), modifyProp(b); print(x);"
    String result = inline(
        "function f(b){var x;x=readProp(b),modifyProp(b);print(x);}");
    String n = norm(result);
    assertTrue(n.contains("print(x)"));
    assertFalse(n.contains("print(readProp(b))"));
  }

  // ---------- side effect ซ้ายมือของ use ----------

  @Test
  public void testSideEffectLeftOfUse_notInlined() {
    // checkLeftOf(...): "x = readProp(b); modifyProp(b), print(x);"
    String result = inline(
        "function f(b){var x=readProp(b);modifyProp(b),print(x);}");
    String n = norm(result);
    assertTrue(n.contains("print(x)"));
    assertFalse(n.contains("print(readProp(b))"));
  }

  // ---------- mayHaveSideEffects บน rhs โดยตรง ----------

  @Test
  public void testSideEffectInDefinitionRhs_notInlined() {
    String result = inline("function f(){var x=sideEffectCall();print(x);}");
    String n = norm(result);
    assertTrue(n.contains("print(x)"));
    assertFalse(n.contains("print(sideEffectCall())"));
  }

  // ---------- numUsesWithinCfgNode != 1 ----------

  @Test
  public void testMultipleUsesInSameCfgNode_notInlined() {
    String result = inline("function f(){var x=1;print(x+x);}");
    String n = norm(result);
    assertFalse(n.contains("print(1+1)"));
    assertTrue(n.contains("print(x+x)"));
  }

  @Test
  public void testMultipleUsesInDifferentCfgNodes_notInlined() {
    // uses.size() != 1
    String result = inline("function f(){var x=1;print(x);print(x);}");
    String n = norm(result);
    assertTrue(n.contains("varx=1"));
    assertFalse(n.contains("print(1)"));
  }

  // ---------- NodeUtil.isWithinLoop(use) ----------

  @Test
  public void testUseWithinLoop_notInlined() {
    String result = inline("function f(){var x=1;while(cond()){print(x);}}");
    String n = norm(result);
    assertTrue(n.contains("varx=1"));
    assertFalse(n.contains("print(1)"));
  }

  // ---------- NodeUtil.has(...) predicate บน RHS ----------

  @Test
  public void testGetPropRhs_notInlined() {
    String result = inline("function f(a){var x=a.b;j.c=1;print(x);}");
    String n = norm(result);
    assertTrue(n.contains("print(x)"));
    assertFalse(n.contains("print(a.b)"));
  }

  @Test
  public void testArrayLiteralRhs_notInlined() {
    String result = inline("function f(){var x=[1,2,3];print(x);}");
    assertTrue(norm(result).contains("print(x)"));
  }

  @Test
  public void testObjectLiteralRhs_notInlined() {
    String result = inline("function f(){var x={a:1};print(x);}");
    assertTrue(norm(result).contains("print(x)"));
  }

  @Test
  public void testRegexpRhs_notInlined() {
    String result = inline("function f(){var x=/abc/;print(x);}");
    assertTrue(norm(result).contains("print(x)"));
  }

  @Test
  public void testNewExpressionRhs_notInlined() {
    String result = inline("function f(){var x=new Foo();print(x);}");
    String n = norm(result);
    assertTrue(n.contains("print(x)"));
    assertFalse(n.contains("print(newFoo())"));
  }

  // ---------- CheckPathsBetweenNodes (statement block, ไม่ติดกัน) ----------

  @Test
  public void testSideEffectBetweenDefAndUse_notInlined() {
    String result = inline("function f(b){var x=1;modifyProp(b);print(x);}");
    String n = norm(result);
    assertTrue(n.contains("varx=1"));
    assertFalse(n.contains("print(1)"));
  }

  @Test
  public void testDeleteBetweenDefAndUse_notInlined() {
    // ครอบคลุม SIDE_EFFECT_PREDICATE: n.isDelProp() == true
    String result = inline("function f(o){var x=1;delete o.p;print(x);}");
    String n = norm(result);
    assertTrue(n.contains("varx=1"));
    assertFalse(n.contains("print(1)"));
  }

  @Test
  public void testNoSideEffectBetweenDefAndUse_inlined() {
    // ไม่มี CALL/NEW/DELPROP ระหว่าง def กับ use -> somePathsSatisfyPredicate()=false -> inline สำเร็จ
    String result = inline("function f(){var x=1;var y=2;print(x);}");
    assertTrue(norm(result).contains("print(1)"));
  }

  @Test
  public void testAdjacentStatements_skipPathCheck_inlined() {
    // getDefCfgNode().getNext() == useCfgNode -> ข้าม CheckPathsBetweenNodes ไปเลย
    String result = inline("function f(){var x=1;print(x);}");
    assertTrue(norm(result).contains("print(1)"));
  }

  // ---------- Dependency chain: ไม่ assert ผลลัพธ์ที่ไม่มั่นใจ ----------

  @Test
  public void testDependencyChain_doesNotCrash() {
    // b ขึ้นกับ a; ไม่ assert ผลลัพธ์แน่ชัดเพราะไม่มั่นใจ 100% เรื่อง
    // dependsOnOuterScopeVars / inlinedNewDependencies เพียงตรวจว่าไม่ throw
    String result = inline("function f(){var a=1;var b=a+1;print(b);}");
    assertNotNull(result);
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testEmptyProgram_doesNotThrow | boundary: input ว่าง, ไม่มี scope ให้วิเคราะห์ |
| testGlobalScope_notInlined | `enterScope`: `t.inGlobalScope()` == true → return early |
| testMalformedInput_reportsErrorInsteadOfCrashingPass | อินพุตผิดรูปแบบ, ป้องกันการเรียก process บน null AST |
| testSimpleVarDefinitionInlined | `canInline` ผ่านทุกเงื่อนไข, `inlineVariable`: `defParent.isVar()` |
| testSimpleAssignDefinitionInlined | `canInline`: `def.isAssign() && isExprAssign(parent)`=true, `inlineVariable`: `def.isAssign()` branch |
| testMultipleIndependentCandidatesAllInlined | loop `for (Candidate c : candidates)` หลายตัว, canInline=true ซ้ำ |
| testParameterCannotBeInlined | `canInline`: `getDefCfgNode().isFunction()` == true → false |
| testNoUsage_noCandidateNoChange | GatherCandiates ไม่พบ read → ไม่มี Candidate |
| testAssignUsedAsRValue_notInlined | `canInline`: `def.isAssign() && !isExprAssign(parent)` == true → false |
| testSideEffectRightOfDefinition_notInlined | `checkRightOf` พบ side effect → false |
| testSideEffectLeftOfUse_notInlined | `checkLeftOf` พบ side effect → false |
| testSideEffectInDefinitionRhs_notInlined | `NodeUtil.mayHaveSideEffects(def.getLastChild())` == true |
| testMultipleUsesInSameCfgNode_notInlined | `numUsesWithinCfgNode != 1` |
| testMultipleUsesInDifferentCfgNodes_notInlined | `uses.size() != 1` |
| testUseWithinLoop_notInlined | `NodeUtil.isWithinLoop(use)` == true |
| testGetPropRhs_notInlined | predicate switch-case `GETPROP` |
| testArrayLiteralRhs_notInlined | predicate switch-case `ARRAYLIT` |
| testObjectLiteralRhs_notInlined | predicate switch-case `OBJECTLIT` |
| testRegexpRhs_notInlined | predicate switch-case `REGEXP` |
| testNewExpressionRhs_notInlined | predicate switch-case `NEW` (หรือ mayHaveSideEffects ก่อนถึง) |
| testSideEffectBetweenDefAndUse_notInlined | `CheckPathsBetweenNodes` + `isCall`/`functionCallHasSideEffects` |
| testDeleteBetweenDefAndUse_notInlined | `SIDE_EFFECT_PREDICATE`: `n.isDelProp()` == true |
| testNoSideEffectBetweenDefAndUse_inlined | `CheckPathsBetweenNodes`: `somePathsSatisfyPredicate()` == false |
| testAdjacentStatements_skipPathCheck_inlined | `getDefCfgNode().getNext() == useCfgNode` → ข้าม path check |
| testDependencyChain_doesNotCrash | `defMetadata.depends` non-empty (สังเกตแบบ smoke test, ไม่ assert ค่าที่ไม่มั่นใจ) |

**ข้อจำกัดที่ไม่ครอบคลุม (มีคอมเมนต์กำกับ, ไม่ได้เดา behavior):** `LiveVariablesAnalysis.MAX_VARIABLES_TO_ANALYZE` limit, `isExported()` ของ CodingConvention, `dependsOnOuterScopeVars`, catch-variable predicate case (`Token.NAME` + `var.getParentNode().isCatch()`) — เนื่องจากต้องอาศัยรายละเอียด internal ของ `MustBeReachingVariableDef`/`Scope` ในเวอร์ชันนี้ที่ไม่สามารถยืนยันได้แน่ชัดจากซอร์สที่ให้มาเพียงอย่างเดียว