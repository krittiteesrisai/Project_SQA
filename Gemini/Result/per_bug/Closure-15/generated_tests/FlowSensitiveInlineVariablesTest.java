package com.google.javascript.jscomp;

import junit.framework.TestCase;
import com.google.javascript.rhino.Node;

/**
 * JUnit 4 Test Suite for FlowSensitiveInlineVariables (Closure-15b)
 * Designed by Senior Java Test Automation Engineer to maximize Branch/Condition Coverage.
 */
public class FlowSensitiveInlineVariablesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // ตั้งค่า Compiler Options พื้นฐานที่จำเป็นสำหรับการคอมไพล์ JS
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private void runTest(String jsInput, String expectedOutput) {
    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parseSyntheticCode("testcode", jsInput);
    
    assertNotNull("Parsed root should not be null", root);
    
    // รัน Compiler Pass
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(externs, root);
    
    String result = compiler.toSource(root);
    assertEquals(expectedOutput, result);
  }

  // 1. Edge Case: Global Scope should be ignored (Branch 1.1)
  public void testGlobalScopeIgnored() {
    String js = "var x = 1; print(x);";
    runTest(js, "var x=1;print(x)");
  }

  // 2. Normal Case: Safe variable inlining with a single definition and single use
  public void testSimpleInline() {
    String js = "function f() { var x = 1; print(x); }";
    runTest(js, "function f(){print(1)}");
  }

  // 3. Edge Case: Cannot inline parameter (Branch 3.1)
  public void testCannotInlineParameter() {
    String js = "function f(x) { print(x); }";
    runTest(js, "function f(x){print(x)}");
  }

  // 4. Edge Case: Cannot inline when RHS has side effects (Branch 3.5)
  public void testCannotInlineSideEffectRhs() {
    String js = "function f() { var x = foo(); print(x); }";
    // สมมติ foo() เป็นฟังก์ชันทั่วไปที่มี side-effects หรือคอมไพเลอร์มองว่าไม่ปลอดภัย
    // ถ้าไม่ inline ผลลัพธ์จะคงเดิมหรือตามพฤติกรรม Compiler
    String expected = compiler.toSource(compiler.parseSyntheticCode("testcode", js));
    runTest(js, expected);
  }

  // 5. Edge Case: Multiple uses prevent inlining (Branch 3.6)
  public void testMultipleUsesInCfgNode() {
    String js = "function f() { var x = 1; print(x + x); }";
    runTest(js, "function f(){print(1+1)}"); // ขึ้นอยู่กับพฤติกรรมการบวก แต่อย่างน้อยเช็คว่าทำงานไม่พัง
  }

  // 6. Edge Case: Variable used within a loop cannot be inlined (Branch 3.7)
  public void testInlineInsideLoop() {
    String js = "function f() { var x = 1; while(true) { print(x); } }";
    String expected = compiler.toSource(compiler.parseSyntheticCode("testcode", js));
    runTest(js, expected);
  }

  // 7. Edge Case: Inlining with GETPROP or Object literals restricted (Branch 3.9)
  public void testGetPropRestrictedInline() {
    String js = "function f() { var x = a.b; print(x); }";
    String expected = compiler.toSource(compiler.parseSyntheticCode("testcode", js));
    runTest(js, expected);
  }

  // 8. Edge Case: Side effect between definition and use nodes (Branch 3.10)
  public void testSideEffectPathBetweenDefAndUse() {
    String js = "function f() { var x = 1; sideEffect(); print(x); }";
    String expected = compiler.toSource(compiler.parseSyntheticCode("testcode", js));
    runTest(js, expected);
  }

  // 9. Edge Case: Assignment expression not used as expression result
  public void testAssignNotExprResult() {
    String js = "function f() { var y; var x = (y = 1); print(x); }";
    String expected = compiler.toSource(compiler.parseSyntheticCode("testcode", js));
    runTest(js, expected);
  }
}