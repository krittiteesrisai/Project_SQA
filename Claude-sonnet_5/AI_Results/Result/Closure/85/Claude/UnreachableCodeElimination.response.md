# UnreachableCodeEliminationTest

## หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติฐาน - ตามข้อกำหนดที่ 4)

เนื่องจาก `UnreachableCodeElimination` เป็น **package-private class** (ไม่มี `public` modifier) และ constructor ก็เป็น package-private เช่นกัน จึงจำเป็นต้องประกาศคลาสทดสอบไว้ใน `package com.google.javascript.jscomp;` เดียวกัน เพื่อให้เข้าถึงคลาสได้

คลาสนี้พึ่งพา internal class จำนวนมาก (`Compiler`, `NodeTraversal`, `ControlFlowAnalysis`, `NodeUtil`, `Scope`, `GraphReachability`, `ControlFlowGraph`, ฯลฯ) ซึ่ง**ไม่ได้อยู่ใน jar ภายนอกที่กำหนด** แต่เป็นส่วนหนึ่งของ source tree เดียวกันกับคลาสเป้าหมาย (มาตรฐานของ Defects4J) จึง**สมมติ**ว่า:

- `com.google.javascript.jscomp.Compiler` มี public no-arg constructor
- `com.google.javascript.jscomp.CompilerTestCase` (test harness มาตรฐานของโปรเจกต์นี้ ใช้ทดสอบ pass ทุกตัวใน jscomp) มีอยู่ใน source tree, มี `test(String, String)`, `testSame(String)`, `getProcessor(Compiler)`, และ constructor `CompilerTestCase(String externs)`
- `com.google.javascript.rhino.Node` มี public constructor `Node(int type)`, method `addChildToBack(Node)`, `getFirstChild()`

จุดที่พฤติกรรมขึ้นกับ method ที่ไม่ได้แสดง source (เช่น `ControlFlowAnalysis.computeFollowNode`, `NodeUtil.isTryCatchNodeContainer`) จะ**คอมเมนต์กำกับไว้ชัดเจนว่าเป็น assumption**

ไม่มี mocking library ใน classpath ที่กำหนด (ไม่มี Mockito) จึงใช้วิธี **white-box testing ด้วย reflection** (`setAccessible(true)`) เพื่อเทส private method บางตัว (`removeDeadExprStatementSafely`) แบบ isolate โดยไม่ต้องพึ่ง CFG จริง และใช้การเรียก `visit()` (ซึ่งเป็น public method) ตรง ๆ เพื่อเทส early-return branch โดยไม่ต้องสร้าง CFG

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertSame;

import java.lang.reflect.Method;

import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * JUnit4 test สำหรับ {@link UnreachableCodeElimination} (Defects4J Closure-85b)
 *
 * โครงสร้าง:
 *  1) Black-box tests ผ่าน CompilerTestCase (parse -> run pass -> compare AST)
 *  2) White-box tests เรียก visit()/removeDeadExprStatementSafely() ตรง ๆ
 *     เพื่อเพิ่ม branch coverage โดยไม่ต้องพึ่ง CFG จริง
 *  3) Boundary/null tests
 *
 * หมายเหตุ: เนื่องจากคลาสนี้ extends CompilerTestCase (ซึ่ง extends junit.framework.TestCase
 * รูปแบบ JUnit3) เมื่อรันด้วย JUnit4 runner จะถูกจับด้วย JUnit38ClassRunner โดยอัตโนมัติ
 * (อาศัย naming convention "testXxx") การใส่ @Test ไว้จึงไม่มีผลเสีย แต่ใส่ไว้เพื่อความชัดเจน
 * ตามข้อกำหนดที่ให้ใช้ JUnit4
 */
public class UnreachableCodeEliminationTest extends CompilerTestCase {

  private boolean removeNoOpStatements;

  public UnreachableCodeEliminationTest() {
    super(""); // ไม่ต้องใช้ externs สำหรับเทสกลุ่มนี้ (assumption: มี ctor รับ externs string)
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    removeNoOpStatements = false;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new UnreachableCodeElimination(compiler, removeNoOpStatements);
  }

  // =======================================================================
  // 1) visit(): unreachable-code removal — ใช้ตัวอย่างที่ระบุตรงใน Javadoc ของคลาส
  // =======================================================================

  @Test
  public void testRemoveCodeAfterReturn_DocumentedExample() {
    test(
        "function f(x) { if (x) { return; alert('unreachable'); } }",
        "function f(x) { if (x) { return; } }");
  }

  @Test
  public void testRemoveCodeAfterBreakInsideLoop() {
    // alert(1) เป็น dead code หลัง break -> ถูกลบ (ผ่าน removeDeadExprStatementSafely)
    // แต่ break เองไม่ถูกลบ เพราะ n.getNext() != null (มี alert(1) เป็น sibling ถัดไป)
    // ตามเงื่อนไขใน tryRemoveUnconditionalBranching: (n.getNext() == null || FUNCTION)
    test(
        "while (x) { break; alert(1); }",
        "while (x) { break; }");
  }

  @Test
  public void testRemoveCodeAfterContinueInsideLoop() {
    test(
        "while (x) { continue; alert(1); }",
        "while (x) { continue; }");
  }

  @Test
  public void testCodeAfterUnconditionalThrowIsRemoved() {
    // throw ไม่ได้อยู่ใน switch ของ tryRemoveUnconditionalBranching แต่ reachability
    // (คำนวณโดย GraphReachability ผ่าน enterScope) ยัง mark code หลัง throw ว่า unreachable
    test(
        "function f(){ throw 'e'; alert(1); }",
        "function f(){ throw 'e'; }");
  }

  // =======================================================================
  // 2) visit(): FUNCTION / SCRIPT node ต้อง skip เสมอ (return ก่อนเช็คอะไรทั้งนั้น)
  // =======================================================================

  @Test
  public void testFunctionDeclarationNeverRemovedEvenIfUnreachable() {
    testSame("function f(){ return; function g(){} }");
  }

  // =======================================================================
  // 3) removeNoOpStatements flag = true -> ลบ statement ที่ไม่มี side effect
  //    (ตัวอย่างจาก Javadoc ของคลาสโดยตรง)
  // =======================================================================

  @Test
  public void testRemoveNoOpStatement_LiteralTrue() {
    removeNoOpStatements = true;
    test("true;", "");
  }

  @Test
  public void testRemoveNoOpStatement_PropertyAccess() {
    removeNoOpStatements = true;
    test("a.b.MyClass.prototype.propertyName;", "");
  }

  @Test
  public void testRemoveNoOpStatements_FunctionCallNotRemoved() {
    // function call ถือว่ามี side effect เสมอ (NodeUtil.mayHaveSideEffects == true)
    removeNoOpStatements = true;
    testSame("alert(1);");
  }

  // =======================================================================
  // 4) removeNoOpStatements = false -> ไม่ลบแม้ statement จะไม่มี side effect
  // =======================================================================

  @Test
  public void testKeepNoOpStatementWhenFlagFalse() {
    removeNoOpStatements = false;
    testSame("true;");
  }

  // =======================================================================
  // 5) tryRemoveUnconditionalBranching(): RETURN ที่มี children ต้องไม่ถูกลบ
  //    (if (n.hasChildren()) break; ) — จุดที่เคยเป็นบั๊กในเวอร์ชันก่อนแก้ของ Closure-85
  // =======================================================================

  @Test
  public void testReturnWithValueAtEndOfFunctionIsNeverRemoved() {
    testSame("function f(x) { if (x) { alert(1); } return x; }");
  }

  // =======================================================================
  // 6) removeDeadExprStatementSafely(): DO node ไม่ถูกลบแม้ unreachable
  // =======================================================================

  @Test
  public void testUnreachableDoWhileIsNeverRemoved() {
    testSame("function f(){ return; do { alert(1); } while (x); }");
  }

  // =======================================================================
  // 7) removeDeadExprStatementSafely(): empty BLOCK ไม่ถูกลบแม้ unreachable
  // =======================================================================

  @Test
  public void testUnreachableEmptyBlockIsNeverRemoved() {
    testSame("function f(){ return; {} }");
  }

  // =======================================================================
  // 8) เคสทั่วไป/boundary: object literal, empty program (ต้องไม่ throw / ไม่พัง)
  // =======================================================================

  @Test
  public void testObjectLiteralDoesNotBreakPass() {
    testSame("var a = {b: 1, c: 2};");
  }

  @Test
  public void testEmptyProgram() {
    testSame("");
  }

  // =======================================================================
  // 9) BLOCK ที่มี children ใน tryRemoveUnconditionalBranching (nested block)
  //    ASSUMPTION: พฤติกรรมของ ControlFlowAnalysis.computeFollowNode() สำหรับ block
  //    ที่ซ้อนอยู่ ไม่ได้แสดงใน source ที่ให้มา จึงอนุมานจาก semantic มาตรฐานของ break/loop
  // =======================================================================

  @Test
  public void testNestedBlockWithBreakChild() {
    test(
        "while (x) { { break; } alert(1); }",
        "while (x) { { break; } }");
  }

  // =======================================================================
  // 10) switch-case: dead code หลัง break ในเคสเดียวกันถูกลบ, เคสถัดไปยังอยู่
  //     ASSUMPTION: switch-case CFG semantic มาตรฐาน (ไม่ได้แสดงใน source ที่ให้มา)
  // =======================================================================

  @Test
  public void testSwitchCaseDeadCodeAfterBreak() {
    test(
        "switch (x) { case 1: alert(1); break; alert(2); case 2: alert(3); }",
        "switch (x) { case 1: alert(1); break; case 2: alert(3); }");
  }

  // =======================================================================
  // 11) White-box: visit() early-return branches (ไม่ต้องพึ่ง CFG จริง)
  // =======================================================================

  @Test
  public void testVisitReturnsEarlyWhenParentIsNull() {
    Compiler compiler = new Compiler();
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    Node n = new Node(Token.EXPR_RESULT);
    // curCfg ยังเป็น null (ไม่ผ่าน enterScope) -> ถ้าไม่ return ก่อนตรวจ curCfg จะเกิด NPE
    pass.visit(null, n, null); // ต้องไม่ throw
  }

  @Test
  public void testVisitSkipsFunctionNodeWithoutTouchingCfg() {
    Compiler compiler = new Compiler();
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    Node fn = new Node(Token.FUNCTION);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(fn);
    pass.visit(null, fn, parent); // curCfg == null แต่ต้อง return ก่อนแตะ curCfg
  }

  @Test
  public void testVisitSkipsScriptNodeWithoutTouchingCfg() {
    Compiler compiler = new Compiler();
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    Node script = new Node(Token.SCRIPT);
    Node parent = new Node(Token.BLOCK);
    parent.addChildToBack(script);
    pass.visit(null, script, parent);
  }

  // =======================================================================
  // 12) Boundary: process(null, null) -> ควรเกิด exception (ไม่มีการเช็ค null ใน process())
  //     ASSUMPTION: NodeTraversal.traverse(compiler, null, this) จะ throw RuntimeException/NPE
  // =======================================================================

  @Test(expected = RuntimeException.class)
  public void testProcessWithNullRootThrowsException() {
    Compiler compiler = new Compiler();
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    pass.process(null, null);
  }

  // =======================================================================
  // 13) White-box (reflection): removeDeadExprStatementSafely() - branch พิเศษ
  //     ที่ไม่ต้องพึ่ง curCfg เลย (เพราะ method นี้ไม่ได้ใช้ field curCfg)
  // =======================================================================

  private static void invokeRemoveDeadExprStatementSafely(
      UnreachableCodeElimination pass, Node n) throws Exception {
    Method m = UnreachableCodeElimination.class
        .getDeclaredMethod("removeDeadExprStatementSafely", Node.class);
    m.setAccessible(true);
    m.invoke(pass, n);
  }

  @Test
  public void testRemoveDeadExprStatementSafely_EmptyNodeNotRemoved() throws Exception {
    Compiler compiler = new Compiler();
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    Node parent = new Node(Token.BLOCK);
    Node emptyNode = new Node(Token.EMPTY);
    parent.addChildToBack(emptyNode);

    invokeRemoveDeadExprStatementSafely(pass, emptyNode);

    // if (n.getType() == Token.EMPTY ...) return; -> ห้ามลบ
    assertSame(emptyNode, parent.getFirstChild());
  }

  @Test
  public void testRemoveDeadExprStatementSafely_EmptyBlockNotRemoved() throws Exception {
    Compiler compiler = new Compiler();
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    Node parent = new Node(Token.BLOCK);
    Node emptyBlock = new Node(Token.BLOCK); // ไม่มี children
    parent.addChildToBack(emptyBlock);

    invokeRemoveDeadExprStatementSafely(pass, emptyBlock);

    // (n.getType() == Token.BLOCK && !n.hasChildren()) -> return; ห้ามลบ
    assertSame(emptyBlock, parent.getFirstChild());
  }

  @Test
  public void testRemoveDeadExprStatementSafely_DoNodeNotRemoved() throws Exception {
    Compiler compiler = new Compiler();
    UnreachableCodeElimination pass = new UnreachableCodeElimination(compiler, false);
    Node parent = new Node(Token.BLOCK);
    Node doNode = new Node(Token.DO);
    parent.addChildToBack(doNode);

    invokeRemoveDeadExprStatementSafely(pass, doNode);

    // case Token.DO: return; -> ห้ามลบไม่ว่ากรณีใด (ตาม comment ใน source)
    assertSame(doNode, parent.getFirstChild());
  }
}
```

## สรุปการครอบคลุม Branch/Condition

| # | เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| 1 | testRemoveCodeAfterReturn_DocumentedExample | `visit()`: `annotation != REACHABLE` → true (unreachable code removal) |
| 2 | testRemoveCodeAfterBreakInsideLoop | `tryRemoveUnconditionalBranching`: case BREAK, เงื่อนไข `n.getNext()==null||FUNCTION` เป็น false → ไม่ลบ; และ unreachable-removal สำหรับ alert(1) |
| 3 | testRemoveCodeAfterContinueInsideLoop | เหมือน #2 แต่กับ case CONTINUE |
| 4 | testCodeAfterUnconditionalThrowIsRemoved | reachability annotation หลัง throw (ทาง `visit()` unreachable branch) |
| 5 | testFunctionDeclarationNeverRemovedEvenIfUnreachable | `visit()`: `n.getType()==FUNCTION` → return early |
| 6 | testRemoveNoOpStatement_LiteralTrue | `visit()`: `removeNoOpStatements && !mayHaveSideEffects(n)` → true |
| 7 | testRemoveNoOpStatement_PropertyAccess | เหมือน #6 กับ property access |
| 8 | testRemoveNoOpStatements_FunctionCallNotRemoved | `removeNoOpStatements=true` แต่ `mayHaveSideEffects(n)==true` → false branch → ไม่ลบ |
| 9 | testKeepNoOpStatementWhenFlagFalse | `removeNoOpStatements==false` → เงื่อนไข false ทั้งก้อน → `tryRemoveUnconditionalBranching` (no-op path) |
| 10 | testReturnWithValueAtEndOfFunctionIsNeverRemoved | `case Token.RETURN: if (n.hasChildren()) break;` → true branch |
| 11 | testUnreachableDoWhileIsNeverRemoved | `removeDeadExprStatementSafely`: `case Token.DO: return;` |
| 12 | testUnreachableEmptyBlockIsNeverRemoved | `removeDeadExprStatementSafely`: `(BLOCK && !hasChildren())` → return |
| 13 | testObjectLiteralDoesNotBreakPass | boundary: `gNode == null` path (assumption) / no crash |
| 14 | testEmptyProgram | boundary: empty input, ไม่มี node ให้ visit |
| 15 | testNestedBlockWithBreakChild | `case Token.BLOCK: n.hasChildren()` → true, recurse `first child` |
| 16 | testSwitchCaseDeadCodeAfterBreak | outEdges/reachability ผสมกับ BREAK-in-switch (assumption ด้าน switch CFG) |
| 17 | testVisitReturnsEarlyWhenParentIsNull | `visit()`: `parent == null` → true |
| 18 | testVisitSkipsFunctionNodeWithoutTouchingCfg | `visit()`: `n.getType()==FUNCTION` (โดยไม่พึ่ง curCfg) |
| 19 | testVisitSkipsScriptNodeWithoutTouchingCfg | `visit()`: `n.getType()==SCRIPT` |
| 20 | testProcessWithNullRootThrowsException | boundary/null: `process(null,null)` |
| 21 | testRemoveDeadExprStatementSafely_EmptyNodeNotRemoved | `n.getType()==Token.EMPTY` → return |
| 22 | testRemoveDeadExprStatementSafely_EmptyBlockNotRemoved | `(BLOCK && !hasChildren())` (isolated, ไม่พึ่ง CFG) |
| 23 | testRemoveDeadExprStatementSafely_DoNodeNotRemoved | `case Token.DO: return;` (isolated) |

**ข้อจำกัดที่ยอมรับ:** branch ของ `case Token.BLOCK` ที่ `parent.getType()==Token.TRY && NodeUtil.isTryCatchNodeContainer(n)==true` และ `case Token.CATCH` (การเรียก `NodeUtil.maybeAddFinally`) ไม่ได้เขียนเทสยืนยันผลลัพธ์ที่แน่ชัด เนื่องจาก behavior ของ `NodeUtil` ไม่ได้แสดงใน source ที่ให้มา จึงงดเดาผลลัพธ์ตามข้อกำหนดที่ 4