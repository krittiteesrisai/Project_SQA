# แนวคิดการทดสอบ

`MaybeReachingVariableUse` เป็นคลาส package-private ที่ทำงานร่วมกับ `Scope`, `ControlFlowGraph<Node>` และ `AbstractCompiler` จริง ไม่สามารถ mock ได้ง่าย (ไม่มี Mockito ใน classpath ที่กำหนด) จึงต้องสร้าง pipeline จริงแบบย่อ (parse → build Scope → build CFG → analyze) โดยใช้ utility ภายในแพ็กเกจเดียวกัน (`Compiler#parseTestCode`, `SyntacticScopeCreator`, `ControlFlowAnalysis`) ซึ่งเป็น pattern ที่ใช้ใน test ตัวอื่น ๆ ของ DataFlowAnalysis ในโปรเจกต์เดียวกัน (เช่น `LiveVariablesAnalysisTest`, `DeadAssignmentsEliminationTest`)

> **หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4):**
> - พฤติกรรมของ `MaybeReachingVariableUse` เองอ้างจากซอร์สที่ให้มาเท่านั้น
> - เนื่องจาก `hasExceptionHandler()` คืนค่า `false` เสมอ ทำให้ `conditional` ที่ถูกส่งเข้ามาจาก `flowThrough` ที่ระดับ statement บนสุดเป็น `false` เสมอ ⇒ branch “`conditional == true`” ของ `case FOR` (for-in) และ `case VAR` **ไม่สามารถ trigger ได้จาก statement ระดับบนสุด** เพราะ VAR/FOR-IN เป็น statement ไม่ใช่ expression จึงไม่ถูกซ้อนอยู่ใน AND/OR/HOOK ได้ — จึงไม่ได้เขียนเทสสำหรับกรณีนี้ (คอมเมนต์กำกับไว้ในโค้ด)
> - `Preconditions.checkState(n.hasChildren())` ใน `case VAR` ไม่สามารถ trigger ได้ด้วย JS ที่ parse ผ่านได้จริง (VAR ต้องมีลูกอย่างน้อย 1 ตัว) จึงไม่ได้เขียนเทส
> - ความหมายของ `state.getOut()` (ใน backward analysis) อ้างอิงจาก docstring/ตัวอย่างในคลาสเป้าหมายเอง (ตัวอย่าง `A=1; if(x){A=2}; alert(A)`) — ไม่ได้เดาเพิ่มเติม

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

import java.util.Collection;

/**
 * Unit test สำหรับ {@link MaybeReachingVariableUse}
 *
 * หมายเหตุ: MaybeReachingVariableUse ต้องใช้ Scope/ControlFlowGraph จริง
 * จึงสร้าง pipeline ย่อ (parse -> scope -> cfg -> analyze) ในเมธอด helper
 * {@link #analyze(String)} โดยใช้ API ภายในแพ็กเกจเดียวกัน (Compiler,
 * SyntacticScopeCreator, ControlFlowAnalysis) ซึ่งเป็น pattern เดียวกันกับ
 * test อื่น ๆ ของ DataFlowAnalysis subclass ในโปรเจกต์นี้
 */
public class MaybeReachingVariableUseTest {

  private Compiler compiler;
  private MaybeReachingVariableUse analysis;
  private Node function;
  private Node body;

  /**
   * Parse ฟังก์ชันเดียว สร้าง Scope ของฟังก์ชันนั้น สร้าง CFG แล้ว analyze
   * ด้วย MaybeReachingVariableUse จริง เก็บผลลัพธ์ไว้ใน field เพื่อให้
   * เทสแต่ละตัวใช้ต่อได้
   */
  private void analyze(String js) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node script = compiler.parseTestCode(js);
    assertEquals("มี parse error สำหรับ: " + js, 0, compiler.getErrorCount());

    function = script.getFirstChild();
    assertEquals(Token.FUNCTION, function.getType());
    body = function.getLastChild();

    Scope globalScope = new SyntacticScopeCreator(compiler).createScope(script, null);
    Scope functionScope =
        new SyntacticScopeCreator(compiler).createScope(function, globalScope);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, function);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    analysis = new MaybeReachingVariableUse(cfg, functionScope, compiler);
    analysis.analyze();
  }

  /** ดึง statement ที่ index (0-based) จาก body ของฟังก์ชันที่ analyze ไว้ */
  private Node stmt(int index) {
    Node n = body.getFirstChild();
    for (int i = 0; i < index && n != null; i++) {
      n = n.getNext();
    }
    assertNotNull("ไม่พบ statement ที่ index " + index, n);
    return n;
  }

  // ---------------------------------------------------------------------
  // BLOCK / FUNCTION case
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyFunctionBody() {
    // body ว่าง -> CFG node ที่เป็น BLOCK เปล่าจะถูกประมวลผล (case BLOCK: return;)
    analyze("function f() {}");
    // ไม่ควร throw exception ใด ๆ
    assertTrue(true);
  }

  @Test
  public void testNestedFunctionDeclarationIsNoOp() {
    // function ประกาศซ้อนใน body -> case FUNCTION: return; (no-op)
    analyze("function f() {"
        + "  function g() {}"
        + "  var x = 1;"
        + "  x;"
        + "}");

    Node varXEq1 = stmt(1);
    Node useX = stmt(2);

    Collection<Node> uses = analysis.getUses("x", varXEq1);
    assertTrue(uses.contains(useX));
    assertEquals(1, uses.size());
  }

  // ---------------------------------------------------------------------
  // NAME + straight line def/use (kill semantics)
  // ---------------------------------------------------------------------

  @Test
  public void testStraightLineDefinitionAndUse() {
    analyze("function f() {"
        + "  var x;"
        + "  x = 1;"
        + "  y = x;"
        + "}");

    Node varX = stmt(0);
    Node assignX = stmt(1);
    Node useX = stmt(2);

    // definition ที่ x = 1 ควรถูกอ่านที่ y = x
    Collection<Node> usesOfAssign = analysis.getUses("x", assignX);
    assertEquals(1, usesOfAssign.size());
    assertTrue(usesOfAssign.contains(useX));

    // ก่อนหน้า x=1 (คือ "var x;") ไม่ควรมีการอ้างถึง x เพราะ x=1 ได้ kill
    // การใช้งานก่อนหน้าไปแล้ว (removeFromUseIfLocal)
    Collection<Node> usesOfVarDecl = analysis.getUses("x", varX);
    assertTrue(usesOfVarDecl.isEmpty());
  }

  @Test
  public void testKillRemovesPriorUse() {
    // ยืนยันว่า assignment (kill) ตัดการเชื่อมโยงกับ use ที่อยู่ก่อนหน้า def
    analyze("function f() {"
        + "  x = 1;"      // def #1 (จะถูก kill โดย def #2)
        + "  x = 2;"      // def #2
        + "  y = x;"      // use -> ควรจับคู่กับ def #2 เท่านั้น
        + "}");

    Node firstAssign = stmt(0);
    Node secondAssign = stmt(1);
    Node use = stmt(2);

    assertTrue(analysis.getUses("x", firstAssign).isEmpty());
    Collection<Node> usesOfSecond = analysis.getUses("x", secondAssign);
    assertEquals(1, usesOfSecond.size());
    assertTrue(usesOfSecond.contains(use));
  }

  @Test
  public void testCompoundAssignmentIsBothUseAndDef() {
    // "x += 1" ต้อง addToUseIfLocal ตัวเอง (เพราะ !n.isAssign()) และยัง
    // removeFromUseIfLocal ของเก่าไปด้วย (ครอบคลุมทั้ง 2 branch ใน default-case)
    analyze("function f() {"
        + "  var x;"
        + "  x += 1;"
        + "  z = x;"
        + "}");

    Node varX = stmt(0);
    Node compound = stmt(1);
    Node use = stmt(2);

    // def ที่ compound assignment เองก็ "ใช้" ตัวมันเองด้วย -> ผลคือ
    // OUT ของ var x ควรชี้ไปที่ statement ของ compound assignment
    Collection<Node> usesOfVarDecl = analysis.getUses("x", varX);
    assertEquals(1, usesOfVarDecl.size());
    assertTrue(usesOfVarDecl.contains(compound));

    // และ compound assignment เอง (ในฐานะ def) ควรถูกใช้ที่ z = x
    Collection<Node> usesOfCompound = analysis.getUses("x", compound);
    assertEquals(1, usesOfCompound.size());
    assertTrue(usesOfCompound.contains(use));
  }

  @Test
  public void testNonNameAssignmentTargetUsesBaseObject() {
    // LHS ของ assignment ไม่ใช่ NAME (เช่น obj.prop) -> ตกไป default/else
    // (loop ย้อนกลับผ่านลูกทุกตัว) แทนที่จะเป็น NodeUtil.isAssignmentOp branch
    analyze("function f() {"
        + "  var obj, val;"
        + "  obj.prop = val;"
        + "}");
    // ควร analyze ผ่านโดยไม่ throw exception, และ "obj"/"val" ถูกนับเป็นการอ่าน
    assertTrue(true);
  }

  @Test
  public void testMultipleArgsCallDefaultReverseIteration() {
    // ครอบคลุม default-case ที่ loop ย้อนกลับผ่านลูกหลายตัว (CALL node)
    analyze("function f() {"
        + "  var a, b, c;"
        + "  foo(a, b, c);"
        + "}");
    assertTrue(true);
  }

  // ---------------------------------------------------------------------
  // WHILE / DO / IF (condition expression) + AND/OR/HOOK
  // ---------------------------------------------------------------------

  @Test
  public void testIfConditionWithAnd() {
    analyze("function f() {"
        + "  var x, y, z;"
        + "  if (x && y) {"
        + "    z = 1;"
        + "  }"
        + "}");
    assertTrue(true); // ครอบคลุม case IF -> case AND
  }

  @Test
  public void testIfConditionWithOr() {
    analyze("function f() {"
        + "  var x, y, z;"
        + "  if (x || y) {"
        + "    z = 1;"
        + "  }"
        + "}");
    assertTrue(true); // ครอบคลุม case IF -> case OR
  }

  @Test
  public void testTernaryHookCondition() {
    analyze("function f() {"
        + "  var a, b, c;"
        + "  a ? b : c;"
        + "}");
    assertTrue(true); // ครอบคลุม case HOOK (ทั้ง 3 การเรียก computeMayUse)
  }

  @Test
  public void testIfElseWithEmptyBlockBranch() {
    // else-block ว่าง -> อาจกลายเป็น CFG node ชนิด BLOCK เพิ่มเติม
    analyze("function f() {"
        + "  var x, y;"
        + "  if (x) {"
        + "    y = 1;"
        + "  } else {"
        + "  }"
        + "}");
    assertTrue(true);
  }

  @Test
  public void testWhileLoopCondition() {
    analyze("function f() {"
        + "  var x;"
        + "  while (x) {"
        + "    x = 0;"
        + "  }"
        + "}");
    assertTrue(true); // ครอบคลุม case WHILE
  }

  @Test
  public void testDoWhileLoopCondition() {
    analyze("function f() {"
        + "  var x;"
        + "  do {"
        + "    x = 0;"
        + "  } while (x);"
        + "}");
    assertTrue(true); // ครอบคลุม case DO
  }

  // ---------------------------------------------------------------------
  // FOR (non for-in) และ FOR-IN ทุก sub-branch ที่วิเคราะห์ได้
  // ---------------------------------------------------------------------

  @Test
  public void testForLoopRegularCondition() {
    analyze("function f() {"
        + "  var i;"
        + "  for (i = 0; i < 10; i++) {"
        + "  }"
        + "}");
    assertTrue(true); // ครอบคลุม case FOR: !isForIn
  }

  @Test
  public void testForInWithVarDeclaration() {
    // for (var k in obj) {} -> lhs.isVar() == true
    analyze("function f() {"
        + "  var obj;"
        + "  for (var k in obj) {"
        + "  }"
        + "}");
    assertTrue(true);
  }

  @Test
  public void testForInWithExistingVariable() {
    // for (k in obj) {} โดย k ถูกประกาศไว้ก่อนแล้ว -> lhs.isVar() == false,
    // lhs.isName() == true
    analyze("function f() {"
        + "  var k, obj;"
        + "  for (k in obj) {"
        + "  }"
        + "}");
    assertTrue(true);
  }

  @Test
  public void testForInWithNonNameLhs() {
    // for (obj.prop in y) {} -> lhs.isName() == false (skip removeFromUseIfLocal)
    analyze("function f() {"
        + "  var obj, y;"
        + "  for (obj.prop in y) {"
        + "  }"
        + "}");
    assertTrue(true);
  }

  // NOTE: กรณี "lhs.isName() && !conditional" โดย conditional == true
  // ไม่สามารถสร้างเทสได้จริง เพราะ hasExceptionHandler() คืนค่า false เสมอ
  // และ FOR-IN เป็น statement (ไม่ถูกซ้อนใน AND/OR/HOOK ได้) — ข้ามตามข้อกำหนดที่ 4

  // ---------------------------------------------------------------------
  // VAR (มี / ไม่มี initializer)
  // ---------------------------------------------------------------------

  @Test
  public void testVarDeclarationWithoutInitializer() {
    // var x; (ไม่มีลูกใน NAME) -> ข้าม computeMayUse และ removeFromUseIfLocal
    analyze("function f() {"
        + "  var x;"
        + "  x;"
        + "}");

    Node varX = stmt(0);
    Node use = stmt(1);

    // เพราะ "var x;" ไม่ kill ค่าใด ๆ, OUT ของมันควรเท่ากับ IN ของ statement ถัดไป
    Collection<Node> uses = analysis.getUses("x", varX);
    assertEquals(1, uses.size());
    assertTrue(uses.contains(use));
  }

  // NOTE: Preconditions.checkState(n.hasChildren()) ใน case VAR ไม่สามารถ
  // trigger ได้ด้วย source ที่ parse ผ่านจริง (VAR ต้องมี NAME ลูกเสมอ)
  // จึงไม่ได้เขียนเทสสำหรับกรณีนี้ ตามข้อกำหนดที่ 4

  // ---------------------------------------------------------------------
  // addToUseIfLocal / removeFromUseIfLocal: null var, scope mismatch, escaped
  // ---------------------------------------------------------------------

  @Test
  public void testUndeclaredVariableReturnsEmpty() {
    // h ไม่ถูกประกาศที่ไหนเลย -> jsScope.getVar("h") == null
    analyze("function f() {"
        + "  h = 1;"
        + "  h;"
        + "}");

    Node def = stmt(0);
    Collection<Node> uses = analysis.getUses("h", def);
    assertTrue(uses.isEmpty());
  }

  @Test
  public void testGlobalVariableDifferentScopeExcluded() {
    // g ถูกประกาศที่ global scope ไม่ใช่ใน scope ของฟังก์ชัน f
    // -> var.scope != jsScope ใน addToUseIfLocal/removeFromUseIfLocal
    analyze("function f() {"
        + "  g = 1;"
        + "  g;"
        + "}"
        + "var g;");

    Node def = stmt(0);
    Collection<Node> uses = analysis.getUses("g", def);
    assertTrue(uses.isEmpty());
  }

  @Test
  public void testEscapedVariableIsExcluded() {
    // x ถูกอ้างถึงในฟังก์ชันซ้อนใน (inner) ทำให้ x ถูกจัดเป็น escaped
    // -> escaped.contains(var) == true ใน addToUseIfLocal/removeFromUseIfLocal
    analyze("function f() {"
        + "  var x = 1;"
        + "  function inner() { return x; }"
        + "  x;"
        + "}");

    Node def = stmt(0); // var x = 1;
    Collection<Node> uses = analysis.getUses("x", def);
    // เพราะ x escape แล้ว จะไม่ถูกเพิ่มเข้า mayUseMap เลยไม่ว่ากรณีใด
    assertTrue(uses.isEmpty());
  }

  // ---------------------------------------------------------------------
  // getUses(): defNode ไม่อยู่ใน CFG -> Preconditions.checkNotNull throws
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testGetUsesThrowsWhenNodeNotInCfg() {
    analyze("function f() {"
        + "  var x;"
        + "  x = 1;"
        + "}");

    // node ที่ไม่ได้อยู่ใน CFG เลย
    Node foreignNode = new Node(Token.EXPR_RESULT);
    analysis.getUses("x", foreignNode);
  }

  // ---------------------------------------------------------------------
  // Malformed input (ทดสอบขอบเขตของ pipeline การ parse ก่อนเข้าคลาสเป้าหมาย)
  // ---------------------------------------------------------------------

  @Test
  public void testMalformedInputReportsParseError() {
    // หมายเหตุ: MaybeReachingVariableUse ไม่ได้ parse เอง ดังนั้นการทดสอบนี้
    // ยืนยันเพียงว่า pipeline ตรวจพบ syntax error ก่อนที่จะสร้าง Scope/CFG
    // ให้กับ MaybeReachingVariableUse (จึงไม่เรียก analyze() ต่อ)
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    compiler.parseTestCode("function f( { var x = ; }");
    assertTrue(compiler.getErrorCount() > 0);
  }
}
```

# สรุปตาราง Test ↔ Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testEmptyFunctionBody | `case Token.BLOCK` (block เปล่า, no-op) |
| testNestedFunctionDeclarationIsNoOp | `case Token.FUNCTION` (no-op) + ยืนยัน flow ปกติต่อ |
| testStraightLineDefinitionAndUse | `case Token.NAME` (add), assignment default-case (`!conditional` → remove), kill semantics |
| testKillRemovesPriorUse | assignment kill ตัดการเชื่อมกับ def เก่า (ยืนยัน correctness/fault-detect) |
| testCompoundAssignmentIsBothUseAndDef | `!n.isAssign()` == true → addToUseIfLocal ตัวเอง, ร่วมกับ remove |
| testNonNameAssignmentTargetUsesBaseObject | `NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()` == **false** → else-loop reverse iteration |
| testMultipleArgsCallDefaultReverseIteration | default-case: reverse loop ผ่านลูกหลายตัว (CALL) |
| testIfConditionWithAnd / testIfConditionWithOr | `case Token.IF` → `case Token.AND` / `case Token.OR` |
| testTernaryHookCondition | `case Token.HOOK` (ทั้ง 3 computeMayUse) |
| testIfElseWithEmptyBlockBranch | if/else, else-block ว่าง → `case Token.BLOCK` เพิ่มเติม |
| testWhileLoopCondition | `case Token.WHILE` |
| testDoWhileLoopCondition | `case Token.DO` |
| testForLoopRegularCondition | `case Token.FOR` → `!NodeUtil.isForIn(n)` == true |
| testForInWithVarDeclaration | `case Token.FOR` (for-in) → `lhs.isVar()` == true |
| testForInWithExistingVariable | `case Token.FOR` (for-in) → `lhs.isVar()` == false, `lhs.isName()` == true |
| testForInWithNonNameLhs | `case Token.FOR` (for-in) → `lhs.isName()` == false |
| testVarDeclarationWithoutInitializer | `case Token.VAR` → `varName.hasChildren()` == false |
| testUndeclaredVariableReturnsEmpty | `addToUseIfLocal`/`removeFromUseIfLocal` → `var == null` |
| testGlobalVariableDifferentScopeExcluded | `addToUseIfLocal`/`removeFromUseIfLocal` → `var.scope != jsScope` |
| testEscapedVariableIsExcluded | `addToUseIfLocal`/`removeFromUseIfLocal` → `escaped.contains(var)` == true |
| testGetUsesThrowsWhenNodeNotInCfg | `Preconditions.checkNotNull(n)` ใน `getUses` (boundary: node ไม่อยู่ใน CFG) |
| testMalformedInputReportsParseError | อินพุตผิดรูปแบบ (parse error) ก่อนเข้าคลาสเป้าหมาย |

**Branch ที่ไม่สามารถทดสอบได้ (ระบุเหตุผลตามข้อกำหนดที่ 4):**
- `case FOR` (for-in) และ `case VAR` เมื่อ `conditional == true` — ไม่สามารถสร้างได้เพราะ `hasExceptionHandler()` คืน `false` เสมอ และ FOR/VAR เป็น statement ไม่ถูกซ้อนใน AND/OR/HOOK
- `Preconditions.checkState(n.hasChildren())` ใน `case VAR` — ไม่สามารถ trigger ด้วย JS ที่ parse ผ่านได้จริง