package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.jscomp.FunctionInjector.Reference;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FunctionInjectorTest {

  private Compiler compiler;
  private Supplier<String> safeNameIdSupplier;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // ใช้ CompilerOptions ค่าเริ่มต้น (ไม่มีการปรับแต่ง CodingConvention พิเศษ)
    compiler.initOptions(new CompilerOptions());
    safeNameIdSupplier = new Supplier<String>() {
      private int id = 0;
      @Override
      public String get() {
        return "inline_" + (id++);
      }
    };
  }

  private FunctionInjector newInjector(
      boolean allowDecomposition, boolean assumeStrictThis, boolean assumeMinimumCapture) {
    return new FunctionInjector(
        compiler, safeNameIdSupplier, allowDecomposition,
        assumeStrictThis, assumeMinimumCapture);
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private static Node findNodeOfType(Node n, int type) {
    if (n.getType() == type) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findNodeOfType(c, type);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  private Node findFunction(String js) {
    Node fn = findNodeOfType(parse(js), Token.FUNCTION);
    assertNotNull("ไม่พบ FUNCTION node ใน: " + js, fn);
    return fn;
  }

  private Node findCall(String js) {
    Node call = findNodeOfType(parse(js), Token.CALL);
    assertNotNull("ไม่พบ CALL node ใน: " + js, call);
    return call;
  }

  // ---------------------------------------------------------------------
  // Constructor - null checks (Preconditions.checkNotNull)
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullCompiler_throwsNPE() {
    new FunctionInjector(null, safeNameIdSupplier, true, true, true);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullSupplier_throwsNPE() {
    new FunctionInjector(compiler, null, true, true, true);
  }

  // ---------------------------------------------------------------------
  // doesFunctionMeetMinimumRequirements
  // ---------------------------------------------------------------------

  @Test
  public void testDoesFunctionMeetMinimumRequirements_simpleFunction_true() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    assertTrue(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesArguments_false() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return arguments[0]; }");
    assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesEval_false() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return eval(a); }");
    assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_referencesFnNameParam_false() {
    FunctionInjector injector = newInjector(true, true, true);
    // ฟังก์ชันอ้างชื่อ "foo" ที่ตรงกับพารามิเตอร์ fnName ที่ส่งเข้ามา (ไม่ใช่ชื่อฟังก์ชันเอง)
    Node fnNode = findFunction("function bar(a) { return foo + a; }");
    assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirements_recursiveReference_false() {
    FunctionInjector injector = newInjector(true, true, true);
    // ฟังก์ชันเรียกตัวเอง (fnRecursionName ตรงกับชื่อ FUNCTION node)
    Node fnNode = findFunction("function foo(a) { return foo(a); }");
    assertFalse(injector.doesFunctionMeetMinimumRequirements("bar", fnNode));
  }

  // ---------------------------------------------------------------------
  // isDirectCallNodeReplacementPossible
  // ---------------------------------------------------------------------

  @Test
  public void testIsDirectCallNodeReplacementPossible_emptyBody_true() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo() {}");
    assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_singleReturnWithExpr_true() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_singleReturnNoExpr_false() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo() { return; }");
    assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_multipleStatements_false() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { var x = 1; return a; }");
    assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectCallNodeReplacementPossible_singleNonReturnStatement_false() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { a = 1; }");
    assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  // ---------------------------------------------------------------------
  // canInlineReferenceToFunction (รวม isSupportedCallType, canInlineReferenceDirectly)
  // ---------------------------------------------------------------------

  @Test
  public void testCanInlineReferenceToFunction_unsupportedDotCall_NO() {
    FunctionInjector injector = newInjector(true, /*assumeStrictThis*/ false, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("foo.call(x);"); // arg แรกไม่ใช่ this
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_referencesThisNotDotCall_NO() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("foo(1);"); // ไม่ใช่ .call
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, /*referencesThis*/ true, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_directMode_notDirectReplacementPossible_NO() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { var x = 1; return a; }");
    Node callNode = findCall("foo(1);");
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_directMode_yes() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("foo(1);");
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_directMode_argHasSideEffects_NO() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("foo(i++);");
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_containsFunctions_withinLoop_NO() {
    // assumeMinimumCapture = true -> ข้ามการเช็ค t.inGlobalScope() ไปเช็ค isWithinLoop แทน (t=null ปลอดภัย)
    FunctionInjector injector = newInjector(true, true, /*assumeMinimumCapture*/ true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("for(;;) { foo(1); }");
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, /*containsFunctions*/ true);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_containsFunctions_notInLoop_proceeds() {
    FunctionInjector injector = newInjector(true, true, /*assumeMinimumCapture*/ true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("foo(1);");
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, /*containsFunctions*/ true);
    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_dotCallWithThis_assumeStrictThis_yes() {
    FunctionInjector injector = newInjector(true, /*assumeStrictThis*/ true, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("foo.call(this, 1);");
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, /*referencesThis*/ true, false);
    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_dotCallNoArgs_NO() {
    FunctionInjector injector = newInjector(true, /*assumeStrictThis*/ false, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("foo.call();"); // thisValue == null
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_dotApply_NO() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("foo.apply(this, [1]);");
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_extraArgWithSideEffect_NO() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo() { return 1; }"); // ไม่มีพารามิเตอร์
    Node callNode = findCall("foo(i++);"); // arg เกิน param แต่มี side effect
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_fewerArgsThanParams_yes() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a, b) { return a; }");
    Node callNode = findCall("foo(1);"); // ไม่ครบพารามิเตอร์
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_argUsedTwiceMutableState_NO() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return a + a; }"); // ใช้ a สองครั้ง
    Node callNode = findCall("foo(bar());"); // arg อาจมี mutable state effect
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineReferenceToFunction_fnHasSideEffectReturn_argCanBeSideEffected_NO() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return a++; }"); // return มี side effect
    Node callNode = findCall("foo(x);"); // arg เป็นชื่อตัวแปรที่ side-effected ได้
    CanInlineResult result = injector.canInlineReferenceToFunction(
        null, callNode, fnNode, Sets.<String>newHashSet(),
        InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  // ---------------------------------------------------------------------
  // inliningLowersCost
  // ---------------------------------------------------------------------

  @Test
  public void testInliningLowersCost_zeroReferences_true() {
    FunctionInjector injector = newInjector(true, true, true);
    List<Reference> emptyRefs = Collections.<Reference>emptyList();
    // referenceCount == 0 -> return true ก่อนแตะ fnNode/fnModule/compiler.getModuleGraph()
    boolean result = injector.inliningLowersCost(
        null, null, emptyRefs, Sets.<String>newHashSet(), false, false);
    assertTrue(result);
  }

  // ---------------------------------------------------------------------
  // setKnownConstants
  // ---------------------------------------------------------------------

  @Test
  public void testSetKnownConstants_firstCall_ok() {
    FunctionInjector injector = newInjector(true, true, true);
    injector.setKnownConstants(Sets.<String>newHashSet());
    // ไม่ throw exception = ผ่าน
  }

  @Test(expected = IllegalStateException.class)
  public void testSetKnownConstants_secondCall_throwsISE() {
    FunctionInjector injector = newInjector(true, true, true);
    Set<String> first = Sets.newHashSet("A");
    injector.setKnownConstants(first);           // field ไม่ว่างแล้ว
    injector.setKnownConstants(Sets.newHashSet("B")); // ต้อง throw ISE
  }

  // ---------------------------------------------------------------------
  // inline() - precondition ของ lifecycle stage
  // ---------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testInline_compilerNotNormalized_throwsISE() {
    FunctionInjector injector = newInjector(true, true, true);
    Node fnNode = findFunction("function foo(a) { return a; }");
    Node callNode = findCall("foo(1);");
    injector.inline(callNode, "foo", fnNode, InliningMode.DIRECT);
  }

  // ---------------------------------------------------------------------
  // maybePrepareCall / classifyCallSite (ทดสอบทางอ้อม)
  // ---------------------------------------------------------------------

  @Test
  public void testMaybePrepareCall_simpleCall_noException() {
    FunctionInjector injector = newInjector(true, true, true);
    Node callNode = findCall("foo(1);"); // -> SIMPLE_CALL, prepare() ไม่ทำอะไร
    injector.maybePrepareCall(callNode);
  }

  @Test
  public void testMaybePrepareCall_simpleAssignment_noException() {
    FunctionInjector injector = newInjector(true, true, true);
    Node callNode = findCall("x = foo(1);"); // -> SIMPLE_ASSIGNMENT
    injector.maybePrepareCall(callNode);
  }

  @Test
  public void testMaybePrepareCall_varDeclAssignment_noException() {
    FunctionInjector injector = newInjector(true, true, true);
    Node callNode = findCall("var x = foo(1);"); // -> VAR_DECL_SIMPLE_ASSIGNMENT
    injector.maybePrepareCall(callNode);
  }
}
