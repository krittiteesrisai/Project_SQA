# วิเคราะห์คลาสเป้าหมาย

`FlowSensitiveInlineVariables` เป็น **package-private class** ที่พึ่งพา dataflow analysis ภายใน (`ControlFlowAnalysis`, `MustBeReachingVariableDef`, `MaybeReachingVariableUse`) และมี inner class private (`Candidate`, `GatherCandiates`) ที่ไม่มี public API ให้เรียกตรง ๆ ดังนั้นวิธีทดสอบที่ทำได้จริงและปลอดภัยที่สุดคือ **black-box end-to-end test** ผ่าน public entry point `process(Node externs, Node root)` โดยใช้ `Compiler` จริง parse ซอร์ส JS แล้วตรวจสอบผลลัพธ์ที่ได้ ซึ่งจะทำให้ทุก branch ภายใน `canInline()`, `enterScope()`, `GatherCandiates`, `checkRightOf/checkLeftOf`, `inlineVariable()` ถูก exercise ทางอ้อมตามพฤติกรรมที่ระบุในซอร์ส

> ⚠️ หมายเหตุสำคัญ: เนื่องจากคลาส `Compiler`, `CompilerOptions`, `SourceFile` ไม่ได้แสดงซอร์สโค้ดมาให้ ผมใช้ API ตามความรู้ทั่วไปของ Closure Compiler รุ่นนี้ (`compiler.init(...)`, `compiler.parseInputs()`, `compiler.toSource(Node)`) — หากลายเซ็นจริงต่างจากนี้ อาจต้องปรับ helper method แต่ **ตรรกะการทดสอบ (สิ่งที่ assert) ไม่ได้เดา behavior ของ `FlowSensitiveInlineVariables` เอง** ยังคงอ้างอิงจาก source ที่ให้มาเท่านั้น

```java
package com.google.javascript.jscomp;

// หมายเหตุ: FlowSensitiveInlineVariables เป็น package-private class
// ดังนั้นคลาสทดสอบต้องอยู่ใน package เดียวกัน (com.google.javascript.jscomp)
// การ "import" คลาสเป้าหมายในกรณีนี้คือการอยู่ใน package เดียวกัน
// (Java ไม่อนุญาตให้ import class ข้าม package ที่เป็น package-private อยู่แล้ว)

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * JUnit4 test สำหรับ {@link FlowSensitiveInlineVariables}
 *
 * เนื่องจากคลาสเป้าหมายพึ่งพา ControlFlowAnalysis, MustBeReachingVariableDef,
 * MaybeReachingVariableUse และ NodeTraversal ของ Closure Compiler อย่างมาก
 * (constructor/field ของ inner class เป็น private ทั้งหมด ไม่สามารถ mock/เข้าถึงตรง ๆ ได้)
 * การทดสอบนี้จึงเป็นแบบ black-box end-to-end: สร้าง Compiler จริง, parse ซอร์ส JS,
 * เรียก pass ผ่าน public entry point process(Node, Node) แล้วตรวจผลลัพธ์ source
 * ว่าสอดคล้องกับ logic ที่อ่านได้จาก canInline()/enterScope()/inlineVariable()
 *
 * ข้อสมมติของ harness (ไม่ใช่ behavior ของคลาสเป้าหมาย):
 *  - Compiler#init(List<SourceFile>, List<SourceFile>, CompilerOptions)
 *  - Compiler#parseInputs() คืน root ซึ่ง firstChild = externsRoot, ถัดไปคือ mainRoot
 *  - Compiler#toSource(Node) ใช้แปลง Node กลับเป็น source string
 *  - NodeUtil.functionCallHasSideEffects คืนค่า true (conservative) สำหรับ
 *    unqualified function call ที่ไม่มี extern ระบุว่า pure
 * จุดที่ไม่แน่ใจ 100% จะมีคอมเมนต์กำกับไว้ในแต่ละเทส
 */
public class FlowSensitiveInlineVariablesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /**
   * รัน FlowSensitiveInlineVariables pass บนซอร์ส JS ที่กำหนด แล้วคืนค่า source
   * ที่ได้หลังการแปลง
   */
  private String runPass(String js) {
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs =
        Arrays.asList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs =
        Arrays.asList(SourceFile.fromCode("input.js", js));
    compiler.init(externs, inputs, options);

    Node root = compiler.parseInputs();
    assertTrue("Unexpected parse error(s), count=" + compiler.getErrorCount(),
        compiler.getErrorCount() == 0);

    Node externsRoot = root.getFirstChild();
    Node mainRoot = externsRoot.getNext();

    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(externsRoot, mainRoot);

    return compiler.toSource(mainRoot);
  }

  // ---------------------------------------------------------------------
  // enterScope(): t.inGlobalScope() == true -> return early (ไม่ inline)
  // ---------------------------------------------------------------------
  @Test
  public void testGlobalScopeVariableNotInlined() {
    String js = "var x = 1; print(x);";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // enterScope(): กรณีปกติ -> inline สำเร็จ
  // ครอบคลุม defParent.isVar() branch ของ inlineVariable() ด้วย
  // ครอบคลุม checkRightOf/checkLeftOf loop กรณี "false ทันที" (p == expressionRoot)
  // และ path-check branch กรณี defCfgNode.getNext() == useCfgNode (adjacent -> skip)
  // ---------------------------------------------------------------------
  @Test
  public void testSimpleVarInline() {
    String js = "function f() { var x = 1; return x; }";
    String result = runPass(js);
    assertFalse(result.contains("var x"));
    assertTrue(result.contains("return 1"));
  }

  // ---------------------------------------------------------------------
  // enterScope(): getVarCount() > MAX_VARIABLES_TO_ANALYZE -> return ก่อนวิเคราะห์
  // (ไม่ทราบค่าจริงของ threshold จาก source ที่ให้มา ใช้ตัวเลขมากพอสมควรตามสมมติฐาน)
  // ---------------------------------------------------------------------
  @Test
  public void testTooManyVariablesSkipsAnalysis() {
    StringBuilder sb = new StringBuilder("function f() {");
    for (int i = 0; i < 150; i++) {
      sb.append("var v").append(i).append(" = ").append(i).append(";");
    }
    sb.append("var x = 1; return x; }");
    String result = runPass(sb.toString());
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): defCfgNode.isFunction() == true -> false (ไม่ inline พารามิเตอร์)
  // ---------------------------------------------------------------------
  @Test
  public void testParameterNotInlined() {
    String js = "function f(a) { return a; }";
    String result = runPass(js);
    assertTrue(result.contains("return a"));
  }

  // ---------------------------------------------------------------------
  // canInline(): def.isAssign() && !isExprAssign(def.getParent()) -> false
  // ---------------------------------------------------------------------
  @Test
  public void testAssignAsRValueNotInlined() {
    String js = "function f() { var x; if ((x = 5) > 0) { return x; } return 0; }";
    String result = runPass(js);
    assertTrue(result.contains("x = 5"));
    assertTrue(result.contains("return x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): checkRightOf(def, defCfgNode, SIDE_EFFECT_PREDICATE) == true -> false
  // (exercise ทั้ง for-loop ของ checkRightOf และ recursive loop ของ SIDE_EFFECT_PREDICATE)
  // ---------------------------------------------------------------------
  @Test
  public void testSideEffectRightOfDefNotInlined() {
    String js = "function f() { var x; x = readVal(), sideEffect(); print(x); }";
    String result = runPass(js);
    assertTrue(result.contains("print(x)"));
  }

  // ---------------------------------------------------------------------
  // canInline(): checkLeftOf(use, useCfgNode, SIDE_EFFECT_PREDICATE) == true -> false
  // ---------------------------------------------------------------------
  @Test
  public void testSideEffectLeftOfUseNotInlined() {
    String js = "function f() { var x = readVal(); print(sideEffect(), x); }";
    String result = runPass(js);
    assertTrue(result.contains("print("));
    assertTrue(result.contains("x)"));
  }

  // ---------------------------------------------------------------------
  // canInline(): NodeUtil.mayHaveSideEffects(def.getLastChild()) == true -> false
  // (สถานการณ์เดี่ยว ไม่มี checkRightOf/checkLeftOf มาแทรก เพื่อ isolate branch นี้)
  // ---------------------------------------------------------------------
  @Test
  public void testSideEffectingRhsNotInlined() {
    String js = "function f() { var x = sideEffect(); print(x); }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): numUseWithinUseCfgNode != 1 -> false
  // ---------------------------------------------------------------------
  @Test
  public void testMultipleUsesInSameCfgNodeNotInlined() {
    String js = "function f() { var x = 1; print(x, x); }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): NodeUtil.isWithinLoop(use) == true -> false
  // ---------------------------------------------------------------------
  @Test
  public void testUseWithinLoopNotInlined() {
    String js = "function f(cond) { var x = 1; while (cond) { print(x); } }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): uses.size() != 1 -> false (มี 2 จุดใช้งานที่ reach จาก def เดียวกัน)
  // ---------------------------------------------------------------------
  @Test
  public void testMultipleReachableUsesNotInlined() {
    String js = "function f(cond) { var x = 1; if (cond) { print(x); } print(x); }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): NodeUtil.has(...) พบ Token.GETPROP -> false
  // ---------------------------------------------------------------------
  @Test
  public void testGetPropNotInlined() {
    String js = "function f(a) { var x = a.b; return x; }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): NodeUtil.has(...) พบ Token.ARRAYLIT -> false
  // ---------------------------------------------------------------------
  @Test
  public void testArrayLiteralNotInlined() {
    String js = "function f() { var x = [1, 2]; return x; }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): NodeUtil.has(...) พบ Token.OBJECTLIT -> false
  // ---------------------------------------------------------------------
  @Test
  public void testObjectLiteralNotInlined() {
    String js = "function f() { var x = {a: 1}; return x; }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): NodeUtil.has(...) พบ Token.REGEXP -> false
  // ---------------------------------------------------------------------
  @Test
  public void testRegexpNotInlined() {
    String js = "function f() { var x = /abc/; return x; }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): เกี่ยวข้องกับ Token.NEW
  // หมายเหตุ: อาจถูกดักด้วย mayHaveSideEffects(def.getLastChild()) ก่อนถึง
  // NodeUtil.has() ก็ได้ (constructorCallHasSideEffects ของ constructor
  // ที่ไม่รู้จักมักถูกประเมินว่ามี side effect) จึงไม่สามารถยืนยัน branch
  // ที่แน่ชัดจาก black-box test นี้ได้ 100%
  // ---------------------------------------------------------------------
  @Test
  public void testNewExpressionNotInlined() {
    String js = "function f() { var x = new Foo(); return x; }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // canInline(): defCfgNode/useCfgNode ไม่ติดกัน แต่ไม่มี side effect ระหว่างทาง
  // -> pathCheck.somePathsSatisfyPredicate() == false -> ยัง inline ได้
  // ---------------------------------------------------------------------
  @Test
  public void testNonAdjacentNoSideEffectStillInlined() {
    String js = "function f() { var x = 1; var y = 2; return x; }";
    String result = runPass(js);
    assertFalse(result.contains("var x"));
    assertTrue(result.contains("return 1"));
  }

  // ---------------------------------------------------------------------
  // canInline(): defCfgNode/useCfgNode ไม่ติดกัน และมี side effect ระหว่างทาง
  // -> pathCheck.somePathsSatisfyPredicate() == true -> ไม่ inline
  // ---------------------------------------------------------------------
  @Test
  public void testNonAdjacentWithSideEffectNotInlined() {
    String js = "function f() { var x = 1; sideEffect(); return x; }";
    String result = runPass(js);
    assertTrue(result.contains("var x"));
  }

  // ---------------------------------------------------------------------
  // inlineVariable(): def.isAssign() == true และ while(defParent.getParent().isLabel())
  // หมายเหตุ: ไม่สามารถยืนยัน 100% ว่า CFG node ที่ผูกกับ label statement
  // ถูกจัดการอย่างไรภายใน ControlFlowAnalysis (ไม่มีอยู่ในซอร์สที่ให้มา)
  // แต่เป็นกรณีตัวอย่างที่ตรงกับ comment ในซอร์ส ("Oh yes! I have grandparent...")
  // ---------------------------------------------------------------------
  @Test
  public void testInlineWithLabeledAssignment() {
    String js = "function f() { var x; L: x = 1; return x; }";
    String result = runPass(js);
    assertFalse(result.contains("var x"));
    assertTrue(result.contains("return 1"));
  }

  // ---------------------------------------------------------------------
  // GatherCandiates: parent.isCatch() -> ข้าม (ไม่ถือว่าเป็นการอ่านค่า)
  // ทดสอบว่า pass ทำงานได้โดยไม่ throw exception กับ try/catch
  // ---------------------------------------------------------------------
  @Test
  public void testCatchClauseDoesNotCrash() {
    String js = "function f() { try { risky(); } catch (e) { print(e); } }";
    String result = runPass(js);
    assertTrue(result.contains("catch"));
  }

  // ---------------------------------------------------------------------
  // boundary: function ที่ไม่มีเนื้อหา -> ไม่มี candidate เลย ต้องไม่ throw
  // ---------------------------------------------------------------------
  @Test
  public void testEmptyFunctionBody() {
    String js = "function f() {}";
    String result = runPass(js);
    assertTrue(result.contains("function f"));
  }

  // ---------------------------------------------------------------------
  // boundary/ว่าง: source เป็นสตริงว่าง ต้องไม่ throw exception
  // ---------------------------------------------------------------------
  @Test
  public void testEmptySource() {
    String result = runPass("");
    assertNotNull(result);
  }

  // ---------------------------------------------------------------------
  // อินพุตผิดรูปแบบ: syntax error ควรถูกจับที่ parser ก่อนที่ pass จะรัน
  // (FlowSensitiveInlineVariables ไม่มีการตรวจสอบ AST ที่ผิดรูปแบบเอง
  // จึงทดสอบเฉพาะพฤติกรรมของขั้น parse โดยไม่เรียก pass.process บน AST ที่เสีย)
  // ---------------------------------------------------------------------
  @Test
  public void testMalformedInputReportsParseError() {
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs =
        Arrays.asList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = Arrays.asList(
        SourceFile.fromCode("input.js", "function f( { var x = ; }"));
    compiler.init(externs, inputs, options);
    compiler.parseInputs();
    assertTrue(compiler.getErrorCount() > 0);
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testGlobalScopeVariableNotInlined | `enterScope`: `t.inGlobalScope() == true` → return |
| testSimpleVarInline | `enterScope` ปกติ; `inlineVariable`: `defParent.isVar()`; path-check: `getNext()==useCfgNode`; checkRightOf/checkLeftOf loop = false ทันที |
| testTooManyVariablesSkipsAnalysis | `enterScope`: `varCount > MAX_VARIABLES_TO_ANALYZE` → return |
| testParameterNotInlined | `canInline`: `defCfgNode.isFunction() == true` → false |
| testAssignAsRValueNotInlined | `canInline`: `def.isAssign() && !isExprAssign(parent)` → false |
| testSideEffectRightOfDefNotInlined | `canInline`: `checkRightOf(...) == true` → false; SIDE_EFFECT_PREDICATE recursion |
| testSideEffectLeftOfUseNotInlined | `canInline`: `checkLeftOf(...) == true` → false |
| testSideEffectingRhsNotInlined | `canInline`: `NodeUtil.mayHaveSideEffects(def.getLastChild())==true` → false |
| testMultipleUsesInSameCfgNodeNotInlined | `canInline`: `numUseWithinUseCfgNode != 1` → false |
| testUseWithinLoopNotInlined | `canInline`: `NodeUtil.isWithinLoop(use)==true` → false |
| testMultipleReachableUsesNotInlined | `canInline`: `uses.size() != 1` → false |
| testGetPropNotInlined | `canInline`: `NodeUtil.has(...)` พบ `GETPROP` → false |
| testArrayLiteralNotInlined | `NodeUtil.has(...)` พบ `ARRAYLIT` → false |
| testObjectLiteralNotInlined | `NodeUtil.has(...)` พบ `OBJECTLIT` → false |
| testRegexpNotInlined | `NodeUtil.has(...)` พบ `REGEXP` → false |
| testNewExpressionNotInlined | เกี่ยวข้องกับ `NEW`/`mayHaveSideEffects` (ไม่ยืนยัน branch แน่ชัด — คอมเมนต์กำกับ) |
| testNonAdjacentNoSideEffectStillInlined | path-check: `isStatementBlock && getNext()!=useCfgNode` = true, `somePathsSatisfyPredicate()==false` → inline สำเร็จ |
| testNonAdjacentWithSideEffectNotInlined | path-check: `somePathsSatisfyPredicate()==true` → false |
| testInlineWithLabeledAssignment | `inlineVariable`: `def.isAssign()`; `while(defParent.getParent().isLabel())` (ไม่ยืนยัน 100% — คอมเมนต์กำกับ) |
| testCatchClauseDoesNotCrash | `GatherCandiates`: `parent.isCatch()` → skip (ตรวจไม่ throw) |
| testEmptyFunctionBody | boundary: ไม่มี candidate เลย |
| testEmptySource | boundary/ว่าง: source ว่าง ไม่ throw |
| testMalformedInputReportsParseError | อินพุตผิดรูปแบบ: parser รายงาน error ก่อนรัน pass |

**หมายเหตุปิดท้าย:** บาง branch (เช่น `defNode == null` ใน `canInline`, `isExported(name)` ใน `GatherCandiates`, `defCfgNode.getParent()` ที่ไม่ใช่ statement block, และ `else` สุดท้ายของ `inlineVariable`) ไม่สามารถออกแบบ input แบบ black-box ที่ยืนยันได้ 100% ว่าจะ trigger branch นั้นโดยไม่พึ่งพา internal implementation ที่ไม่ได้แสดงในซอร์ส จึงไม่ได้เขียนเทสแยกสำหรับ branch เหล่านี้ตามข้อกำหนดที่ 4 (ห้ามเดา behavior ที่ไม่มีอยู่ในซอร์สโค้ด)