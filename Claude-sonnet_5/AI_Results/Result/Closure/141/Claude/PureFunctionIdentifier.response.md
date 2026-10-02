# แนวทางการทดสอบ

`PureFunctionIdentifier` เป็นคลาส **package-private** ที่ผูกกับ pipeline จริงของ Closure Compiler (ต้องใช้ `Compiler`, `SourceFile`, `SimpleDefinitionFinder`, `Node`/`Token` จาก Rhino) จึงไม่สามารถ mock ทุกอย่างได้โดยไม่เดา API ที่ไม่ปรากฏในซอร์สที่ให้มา

ผมจึงเขียนเป็น **integration-style unit test** โดย:
- วาง test class ไว้ใน package เดียวกัน (`com.google.javascript.jscomp`) เพื่อเข้าถึง class/field แบบ package-private ได้ (เช่น `INVALID_NO_SIDE_EFFECT_ANNOTATION`)
- ใช้ `Compiler` จริง compile ซอร์ส JS เล็ก ๆ เพื่อสร้าง AST แล้วรัน `PureFunctionIdentifier.process(...)`
- ตรวจผลผ่าน `Node.isNoSideEffectsCall()` (getter คู่กับ `setIsNoSideEffectsCall()` ที่เห็นในซอร์ส) — **มีคอมเมนต์กำกับว่าเป็นสมมติฐานที่จำเป็น** เพราะไม่ปรากฏ signature ตรง ๆ ในซอร์สที่ให้มา
- ใช้ `Token.CALL/NEW/NAME`, `Node.getFirstChild()/getNext()/getType()/getString()` ซึ่งยืนยันได้จากซอร์สจริงว่ามีอยู่

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ชุดทดสอบ JUnit4 สำหรับ PureFunctionIdentifier (Closure-141b)
 *
 * หมายเหตุสมมติฐานสำคัญ (ไม่มีอยู่ตรง ๆ ในซอร์สที่ให้มา แต่จำเป็นสำหรับ integration test):
 *  - Node มีเมธอด isNoSideEffectsCall() คู่กับ setIsNoSideEffectsCall() ที่เห็นในซอร์ส
 *  - Compiler มีเมธอด compile(SourceFile, SourceFile, CompilerOptions) และ getRoot()
 *    ที่คืน ROOT node ซึ่งมี 2 children คือ [externsRoot, jsRoot]
 *  - SimpleDefinitionFinder(AbstractCompiler) + process(Node, Node) เป็น CompilerPass มาตรฐาน
 *    ของ Closure Compiler ที่ implement DefinitionProvider
 * หากสมมติฐานเหล่านี้ผิด ให้ปรับ helper method setupAndProcess() ตาม API จริงของโปรเจกต์
 */
public class PureFunctionIdentifierTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  @After
  public void tearDown() {
    compiler = null;
  }

  // ---------- Helper ----------

  /**
   * Compile externs+src ผ่าน pipeline จริง แล้วรัน PureFunctionIdentifier.process
   * คืนค่า Node[]{externsRoot, jsRoot}
   */
  private Node[] setupAndProcess(String externsCode, String srcCode) {
    CompilerOptions options = new CompilerOptions();
    SourceFile externsFile = SourceFile.fromCode("externs.js", externsCode);
    SourceFile srcFile = SourceFile.fromCode("input.js", srcCode);

    compiler.compile(externsFile, srcFile, options);

    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();

    SimpleDefinitionFinder finder = new SimpleDefinitionFinder(compiler);
    finder.process(externsRoot, jsRoot);

    PureFunctionIdentifier pfi = new PureFunctionIdentifier(compiler, finder);
    pfi.process(externsRoot, jsRoot);

    return new Node[] {externsRoot, jsRoot};
  }

  /**
   * ค้นหา CALL/NEW node แบบ DFS ที่ชื่อ callee (NAME) ตรงกับ calleeName
   */
  private Node findCallLikeNode(Node n, int tokenType, String calleeName) {
    if (n.getType() == tokenType) {
      Node first = n.getFirstChild();
      if (first != null
          && first.getType() == Token.NAME
          && calleeName.equals(first.getString())) {
        return n;
      }
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findCallLikeNode(c, tokenType, calleeName);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  // ---------- 1. State / boundary ของ process() และ getDebugReport() ----------

  @Test
  public void testProcessCalledTwiceThrowsIllegalStateException() {
    String src = "function f() { return 1; } function main(){ f(); }";
    setupAndProcess("", src);

    SimpleDefinitionFinder finder = new SimpleDefinitionFinder(compiler);
    PureFunctionIdentifier pfi = new PureFunctionIdentifier(compiler, finder);

    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    finder.process(externsRoot, jsRoot);
    pfi.process(externsRoot, jsRoot);

    try {
      pfi.process(externsRoot, jsRoot);
      fail("Expected IllegalStateException when process() called twice on same instance");
    } catch (IllegalStateException expected) {
      // ok
    }
  }

  @Test
  public void testGetDebugReportBeforeProcessThrowsNPE() {
    SimpleDefinitionFinder finder = new SimpleDefinitionFinder(compiler);
    PureFunctionIdentifier pfi = new PureFunctionIdentifier(compiler, finder);
    try {
      pfi.getDebugReport();
      fail("Expected NullPointerException from Preconditions.checkNotNull(externs)");
    } catch (NullPointerException expected) {
      // ok - externs field ยัง null ก่อนเรียก process()
    }
  }

  @Test
  public void testProcessWithNullArgumentsThrows() {
    // boundary: อินพุตผิดรูปแบบ/null -> ควรพังก่อนถึงขั้น propagate/mark
    SimpleDefinitionFinder finder = new SimpleDefinitionFinder(compiler);
    PureFunctionIdentifier pfi = new PureFunctionIdentifier(compiler, finder);
    try {
      pfi.process(null, null);
      fail("Expected an exception when traversing null AST roots");
    } catch (Exception expected) {
      // ok - NodeTraversal.traverse(compiler, null, ...) ควร throw
    }
  }

  @Test
  public void testEmptyExternsAndSourceDoNotThrow() {
    // ค่าว่าง (empty) ทั้ง externs และ src ต้องไม่ throw exception
    Node[] roots = setupAndProcess("", "");
    assertNotNull(roots[1]);
  }

  // ---------- 2. Pure function -> ถูก mark no side effect ----------

  @Test
  public void testPureFunctionCallMarkedNoSideEffects() {
    String src =
        "function pureAdd(a, b) { return a + b; }"
        + "function main() { pureAdd(1, 2); }";
    Node[] roots = setupAndProcess("", src);

    Node call = findCallLikeNode(roots[1], Token.CALL, "pureAdd");
    assertNotNull("call site to pureAdd not found", call);
    assertTrue("pure function call should be marked no-side-effects",
        call.isNoSideEffectsCall());
  }

  // ---------- 3. Global state mutation (INC) -> side effect ----------

  @Test
  public void testGlobalVariableIncrementCausesSideEffects() {
    String src =
        "var counter = 0;"
        + "function impureInc() { counter++; }"
        + "function main() { impureInc(); }";
    Node[] roots = setupAndProcess("", src);

    Node call = findCallLikeNode(roots[1], Token.CALL, "impureInc");
    assertNotNull(call);
    assertTrue("global mutation must cause side effects",
        !call.isNoSideEffectsCall());
  }

  // ---------- 4. throw -> functionThrows -> side effect ----------

  @Test
  public void testFunctionThrowCausesSideEffects() {
    String src =
        "function throwsError() { throw 'x'; }"
        + "function main() { throwsError(); }";
    Node[] roots = setupAndProcess("", src);

    Node call = findCallLikeNode(roots[1], Token.CALL, "throwsError");
    assertNotNull(call);
    assertTrue("throwing function must be marked as having side effects",
        !call.isNoSideEffectsCall());
  }

  // ---------- 5. taintsThis: CALL vs NEW ต่างกัน ----------

  @Test
  public void testConstructorSideEffectDependsOnCallType() {
    // Foo() เขียนแค่ this.x=1 -> taintsThis เท่านั้น
    // ตาม comment ในซอร์ส: "Calling a constructor that modifies this
    // has no side effects" ดังนั้น new Foo() ควรถูก mark no-side-effect
    // แต่ Foo() (เรียกแบบธรรมดา) ยังถือว่ามี side effect เพราะ mayHaveSideEffects()==true
    String src =
        "function Foo() { this.x = 1; }"
        + "function callAsNew() { new Foo(); }"
        + "function callAsFunction() { Foo(); }";
    Node[] roots = setupAndProcess("", src);

    Node newCall = findCallLikeNode(roots[1], Token.NEW, "Foo");
    Node call = findCallLikeNode(roots[1], Token.CALL, "Foo");
    assertNotNull(newCall);
    assertNotNull(call);

    assertTrue("new Foo() only taints this -> should be no-side-effects",
        newCall.isNoSideEffectsCall());
    assertTrue("Foo() as plain call -> mayHaveSideEffects true -> side effect",
        !call.isNoSideEffectsCall());
  }

  // ---------- 6. @nosideeffects ใน externs -> pure ----------

  @Test
  public void testNoSideEffectsAnnotationInExternsMarksPure() {
    String externs = "/** @nosideeffects */ function extFn() {}";
    String src = "function main() { extFn(); }";
    Node[] roots = setupAndProcess(externs, src);

    Node call = findCallLikeNode(roots[1], Token.CALL, "extFn");
    assertNotNull(call);
    assertTrue("@nosideeffects in externs must mark function pure",
        call.isNoSideEffectsCall());
  }

  // ---------- 7. @nosideeffects นอก externs -> error ----------

  @Test
  public void testNoSideEffectsAnnotationOutsideExternsReportsError() {
    String src =
        "/** @nosideeffects */ function myFn() { return 1; }"
        + "function main() { myFn(); }";
    setupAndProcess("", src);

    assertTrue("Using @nosideeffects outside externs must report an error",
        compiler.getErrorCount() > 0);
  }

  // ---------- 8. Local variable reassignment ไม่ taint ----------

  @Test
  public void testLocalVariableReassignmentDoesNotTaint() {
    String src =
        "function f() { var x = 1; x = 2; return x; }"
        + "function main() { f(); }";
    Node[] roots = setupAndProcess("", src);

    Node call = findCallLikeNode(roots[1], Token.CALL, "f");
    assertNotNull(call);
    assertTrue("reassigning a local var must not taint the function",
        call.isNoSideEffectsCall());
  }

  // ---------- 9. Assignment ไปยัง property ของ parameter -> taintsUnknown ----------

  @Test
  public void testParameterPropertyAssignmentTaintsUnknown() {
    String src =
        "function f(o) { o.x = 1; }"
        + "function main(obj) { f(obj); }";
    Node[] roots = setupAndProcess("", src);

    Node call = findCallLikeNode(roots[1], Token.CALL, "f");
    assertNotNull(call);
    assertTrue("assigning to o.x (o != this) must taint unknown -> side effect",
        !call.isNoSideEffectsCall());
  }

  // ---------- 10. Assignment ไปยังตัวแปร global ที่ไม่ได้ประกาศ ----------

  @Test
  public void testUndeclaredGlobalNameAssignmentTaintsGlobalState() {
    String src =
        "function f() { y = 5; }"
        + "function main() { f(); }";
    Node[] roots = setupAndProcess("", src);

    Node call = findCallLikeNode(roots[1], Token.CALL, "f");
    assertNotNull(call);
    assertTrue("assignment to undeclared global name must taint global state",
        !call.isNoSideEffectsCall());
  }

  // ---------- 11. var declaration เปล่า ไม่ throw exception (NAME/isVarDeclaration branch) ----------

  @Test
  public void testBareVarDeclarationDoesNotThrowAndStaysPure() {
    String src =
        "function f() { var z; }"
        + "function main() { f(); }";
    Node[] roots = setupAndProcess("", src);

    Node call = findCallLikeNode(roots[1], Token.CALL, "f");
    assertNotNull(call);
    assertTrue("bare var declaration alone should keep function pure",
        call.isNoSideEffectsCall());
  }

  // ---------- 12. delete this.prop -> taintsThis (DELPROP branch) ----------

  @Test
  public void testDeleteThisPropertyTaintsThis() {
    String src =
        "function f() { delete this.prop; }"
        + "function main() { f(); }";
    Node[] roots = setupAndProcess("", src);

    Node call = findCallLikeNode(roots[1], Token.CALL, "f");
    assertNotNull(call);
    assertTrue("delete this.prop as a plain call must be marked as side effect",
        !call.isNoSideEffectsCall());
  }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testProcessCalledTwiceThrowsIllegalStateException` | `process()`: if(`externs != null \|\| root != null`) → true (เรียกซ้ำ) |
| `testGetDebugReportBeforeProcessThrowsNPE` | `getDebugReport()`: `Preconditions.checkNotNull(externs)` เมื่อ externs ยัง null |
| `testProcessWithNullArgumentsThrows` | boundary: อินพุต null ให้ `process()` (ไม่มีการเดา behavior เพิ่ม แค่ยืนยันว่า error) |
| `testEmptyExternsAndSourceDoNotThrow` | boundary: อินพุตว่าง (empty source), loop ว่างใน `propagateSideEffects()`/`markPureFunctionCalls()` ไม่ throw |
| `testPureFunctionCallMarkedNoSideEffects` | `mayBePure()==true` path → `setIsPure()` ใน `propagateSideEffects()`, `markPureFunctionCalls()`: `!hasSideEffects` → `setIsNoSideEffectsCall()` |
| `testGlobalVariableIncrementCausesSideEffects` | `visitAssignmentOrUnaryOperatorLhs` NAME-branch: `var==null` → `setTaintsGlobalState()`; case `Token.INC` |
| `testFunctionThrowCausesSideEffects` | case `Token.THROW` → `visitThrow()` → `setFunctionThrows()`; `mayBePure()==false` |
| `testConstructorSideEffectDependsOnCallType` | `markPureFunctionCalls()`: เงื่อนไข `NodeUtil.isCall` vs `NodeUtil.isNew(...) && (mutatesGlobalState() \|\| functionThrows())`; taintsThis ไม่กระทบ NEW |
| `testNoSideEffectsAnnotationInExternsMarksPure` | `visitFunction()`: `hasNoSideEffectsAnnotation==true && inExterns==true` → `setIsPure()` |
| `testNoSideEffectsAnnotationOutsideExternsReportsError` | `visitFunction()`: `hasNoSideEffectsAnnotation==true && inExterns==false` → `traversal.report(INVALID_NO_SIDE_EFFECT_ANNOTATION)` |
| `testLocalVariableReassignmentDoesNotTaint` | `visitAssignmentOrUnaryOperatorLhs` NAME-branch: `var != null && var.scope == scope` → ไม่ taint |
| `testParameterPropertyAssignmentTaintsUnknown` | `visitAssignmentOrUnaryOperatorLhs` GETPROP-branch: `!isThis(lhs.getFirstChild())` → `setTaintsUnknown()` |
| `testUndeclaredGlobalNameAssignmentTaintsGlobalState` | `visitAssignmentOrUnaryOperatorLhs` NAME-branch: `var == null` → `setTaintsGlobalState()` (via `NodeUtil.isAssignmentOp`) |
| `testBareVarDeclarationDoesNotThrowAndStaysPure` | case `Token.NAME`: `Preconditions.checkArgument(NodeUtil.isVarDeclaration(node))` ไม่ throw, ไม่ taint |
| `testDeleteThisPropertyTaintsThis` | case `Token.DELPROP` → `visitAssignmentOrUnaryOperatorLhs` GETPROP-branch: `isThis(lhs.getFirstChild())` → `setTaintsThis()` |

**หมายเหตุ**: บาง branch ในซอร์ส (เช่น default-case `IllegalArgumentException` ของ node type ที่ไม่รู้จัก, และ path เต็มของ `getCallThisObject()`/`SideEffectPropagationCallback` ผ่าน `.call()`/`.apply()`) ไม่ได้เขียนเทสตรง ๆ เนื่องจากต้องพึ่งพา behavior ภายในของ `NodeUtil`/`SimpleDefinitionFinder` ที่ไม่มีซอร์สให้ตรวจสอบ การเดา assertion ในจุดนี้อาจทำให้ทดสอบผิดพลาดโดยไม่เกี่ยวกับ fault จริงของคลาสเป้าหมาย จึงงดไว้ตามข้อกำหนดที่ 4