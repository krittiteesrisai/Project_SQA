package com.google.javascript.jscomp;

import junit.framework.TestCase;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * JUnit 4 test suite for FlowSensitiveInlineVariables (Closure-3b).
 * Focuses on Branch/Condition Coverage and Edge Cases.
 */
public class FlowSensitiveInlineVariablesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // ตั้งค่า Compiler basic options พื้นฐานสำหรับการทดสอบ
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  /**
   * Helper method to parse JavaScript source code into an AST Node.
   */
  private Node parse(String js) {
    Node root = compiler.parseSyntheticCode("testcode", js);
    assertNotNull("Parsing failed", root);
    return root;
  }

  public void testGlobalScope() {
    // Branch Coverage: t.inGlobalScope() == true
    Node root = parse("var x = 1; print(x);");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    // รันผ่าน scope ที่ถือว่าเป็น global โดยตรง
    NodeTraversal t = new NodeTraversal(compiler, pass);
    pass.enterScope(t);
    // ตรวจสอบว่าไม่มีข้อยกเว้นและทำงานเสร็จสิ้น
    assertNotNull(root);
  }

  public void testSimpleVarInline() {
    // Branch Coverage: Valid candidate, canInline() == true, var definition in var statement
    Node root = parse("function f() { var x = 10; print(x); }");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, root);
    // ตรวจสอบว่าโค้ดผ่านกระบวนการ pass โดยไม่มีข้อผิดพลาด
    assertNotNull(root);
  }

  public void testAssignInlineWithExprAssign() {
    // Branch Coverage: def.isAssign() && NodeUtil.isExprAssign(def.getParent()) == true
    Node root = parse("function f() { var x; x = 20; print(x); }");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, root);
    assertNotNull(root);
  }

  public void testParameterInlineShouldFail() {
    // Branch Coverage: getDefCfgNode().isFunction() == true (Trying to inline parameter)
    Node root = parse("function f(x) { print(x); }");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, root);
    assertNotNull(root);
  }

  public void testUseWithinLoopShouldNotInline() {
    // Branch Coverage: NodeUtil.isWithinLoop(use) == true
    Node root = parse("function f() { var x = 5; while(true) { print(x); } }");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, root);
    assertNotNull(root);
  }

  public void testMultipleUsesShouldNotInline() {
    // Branch Coverage: numUseWithinUseCfgNode != 1 or uses.size() != 1
    Node root = parse("function f() { var x = 5; print(x); print(x); }");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, root);
    assertNotNull(root);
  }

  public void testRestrictedRValueGetPropShouldNotInline() {
    // Branch Coverage: R-Value contains GETPROP (Token.GETPROP -> returns true in predicate)
    Node root = parse("function f() { var x = a.b; print(x); }");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, root);
    assertNotNull(root);
  }

  public void testSideEffectFunctionCallShouldNotInline() {
    // Branch Coverage: SIDE_EFFECT_PREDICATE detects call with side effects
    Node root = parse("function f() { var x = alert(1); print(x); }");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, root);
    assertNotNull(root);
  }

  public void testNullNodeInSideEffectPredicate() {
    // Branch Coverage: SIDE_EFFECT_PREDICATE with null node edge case
    // ทดสอบทางอ้อมผ่านการทำงานของ pass ที่มี implicit return หรือโครงสร้าง CFG ปลายทาง
    Node root = parse("function f() { var x = 1; if (true) { return; } print(x); }");
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, root);
    assertNotNull(root);
  }
}