package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class FunctionInjectorTest {

  private Compiler compiler;
  private FunctionInjector injector;              // allowDecomp=true, strictThis=false, minCapture=false
  private FunctionInjector strictThisInjector;     // assumeStrictThis=true
  private Supplier<String> safeNameIdSupplier;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    safeNameIdSupplier = new Supplier<String>() {
      int id = 0;
      @Override
      public String get() {
        return "$inline_" + (id++);
      }
    };

    injector = new FunctionInjector(
        compiler, safeNameIdSupplier, true, false, false);
    strictThisInjector = new FunctionInjector(
        compiler, safeNameIdSupplier, true, true, false);
  }

  // ---------- Helpers ----------

  /** NOTE: assumes Compiler#parseTestCode(String) exists (not shown in given source). */
  private Node parse(String js) {
    Node root = compiler.parseTestCode(js);
    assertEquals("Unexpected parse errors", 0, compiler.getErrorCount());
    return root;
  }

  private Node firstFunction(Node n) {
    if (n.isFunction()) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node r = firstFunction(c);
      if (r != null) {
        return r;
      }
    }
    return null;
  }

  private Node firstCall(Node n) {
    if (n.isCall()) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node r = firstCall(c);
      if (r != null) {
        return r;
      }
    }
    return null;
  }

  private AbstractCompiler mockAlwaysInlinableCompiler() {
    AbstractCompiler mc = mock(AbstractCompiler.class);
    CodingConvention cc = mock(CodingConvention.class);
    when(cc.isInlinableFunction(any(Node.class))).thenReturn(true);
    when(mc.getCodingConvention()).thenReturn(cc);
    return mc;
  }

  // ================= Constructor =================

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullCompiler_throwsNPE() {
    new FunctionInjector(null, safeNameIdSupplier, true, false, false);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullSupplier_throwsNPE() {
    new FunctionInjector(compiler, null, true, false, false);
  }

  // ================= doesFunctionMeetMinimumRequirements =================

  @Test
  public void testMeetsMinReq_notInlinableByConvention_false() {
    AbstractCompiler mc = mock(AbstractCompiler.class);
    CodingConvention cc = mock(CodingConvention.class);
    when(cc.isInlinableFunction(any(Node.class))).thenReturn(false);
    when(mc.getCodingConvention()).thenReturn(cc);
    FunctionInjector inj = new FunctionInjector(
        mc, safeNameIdSupplier, true, false, false);

    Node fn = firstFunction(parse("function foo(a) { return a; }"));
    assertFalse(inj.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testMeetsMinReq_normalFunction_true() {
    FunctionInjector inj = new FunctionInjector(
        mockAlwaysInlinableCompiler(), safeNameIdSupplier, true, false, false);
    Node fn = firstFunction(parse("function foo(a) { return a; }"));
    assertTrue(inj.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testMeetsMinReq_referencesArguments_false() {
    FunctionInjector inj = new FunctionInjector(
        mockAlwaysInlinableCompiler(), safeNameIdSupplier, true, false, false);
    Node fn = firstFunction(parse("function foo(a) { return arguments[0]; }"));
    assertFalse(inj.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testMeetsMinReq_referencesEval_false() {
    FunctionInjector inj = new FunctionInjector(
        mockAlwaysInlinableCompiler(), safeNameIdSupplier, true, false, false);
    Node fn = firstFunction(parse("function foo(a) { eval('1'); return a; }"));
    assertFalse(inj.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testMeetsMinReq_referencesGivenFnNameDirectly_false() {
    FunctionInjector inj = new FunctionInjector(
        mockAlwaysInlinableCompiler(), safeNameIdSupplier, true, false, false);
    // function's own name is 'bar' (not matched), but body calls outer name 'foo'
    // which matches the fnName param -> isolates the fnName-branch specifically.
    Node fn = firstFunction(parse("function bar(a) { return foo(a); }"));
    assertFalse(inj.doesFunctionMeetMinimumRequirements("foo", fn));
  }

  @Test
  public void testMeetsMinReq_referencesRecursionName_false() {
    FunctionInjector inj = new FunctionInjector(
        mockAlwaysInlinableCompiler(), safeNameIdSupplier, true, false, false);
    // fnName param empty isolates the recursion-name branch.
    Node fn = firstFunction(parse("function foo(a) { return foo(a-1); }"));
    assertFalse(inj.doesFunctionMeetMinimumRequirements("", fn));
  }

  @Test
  public void testMeetsMinReq_emptyNamesNoSelfRef_true() {
    FunctionInjector inj = new FunctionInjector(
        mockAlwaysInlinableCompiler(), safeNameIdSupplier, true, false, false);
    Node fn = firstFunction(parse("function foo(a) { return a; }"));
    assertTrue(inj.doesFunctionMeetMinimumRequirements("", fn));
  }

  @Test
  public void testMeetsMinReq_anonymousFunctionCalledViaOuterVarName_notDetected_true() {
    // Recursion via the *outer variable name* is NOT detected: the predicate only
    // compares against the function's own literal name and the given fnName param,
    // not the name of the variable an anonymous function is assigned to.
    // This documents a possibly surprising (fault-prone) behavior of the given source.
    FunctionInjector inj = new FunctionInjector(
        mockAlwaysInlinableCompiler(), safeNameIdSupplier, true, false, false);
    Node fn = firstFunction(parse("var f = function() { f(); };"));
    assertTrue(inj.doesFunctionMeetMinimumRequirements("", fn));
  }

  // ================= isSupportedCallType (via canInlineReferenceToFunction) =================

  @Test
  public void testCanInline_unsupportedApplyCall_NO() {
    Node root = parse("function foo(a) { return a; } var r = foo.apply(null, [1]);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_callWithoutThisArg_NO() {
    Node root = parse("function foo(a) { return a; } var r = foo.call();");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_callWithNonThisFirstArg_NO() {
    Node root = parse("function foo(a) { return a; } var r = foo.call(x, 1);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_callWithThisArg_YES() {
    Node root = parse("function foo(a) { return a; } var r = foo.call(this, 1);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInline_assumeStrictThis_bypassesThisCheck_thenNOfromDirectLogic() {
    // With assumeStrictThis=true the this-check inside isSupportedCallType is skipped,
    // so the call is "supported"; but canInlineReferenceDirectly independently
    // requires the first arg after .call to actually be `this`.
    Node root = parse("function foo(a) { return a; } var r = foo.call(x, 1);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = strictThisInjector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_propertyCallNeitherCallNorApply_supported_YES() {
    Node root = parse("function foo(a) { return a; } var obj = {}; obj.foo(1);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.YES, result);
  }

  // ================= containsFunctions branch =================

  @Test
  public void testCanInline_containsFunctions_notGlobalScope_notMinCapture_NO() {
    Node root = parse("function foo(){ return function(){}; } foo();");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);
    when(t.inGlobalScope()).thenReturn(false);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, true);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_containsFunctions_globalScope_proceeds_YES() {
    Node root = parse("function foo(){ return function(){}; } foo();");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);
    when(t.inGlobalScope()).thenReturn(true);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, true);
    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInline_containsFunctions_assumeMinCapture_withinLoop_NO() {
    FunctionInjector minCapInjector = new FunctionInjector(
        compiler, safeNameIdSupplier, true, false, true);
    Node root = parse("function foo(){ return function(){}; } for(;;){ foo(); }");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = minCapInjector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, true);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_containsFunctions_assumeMinCapture_notInLoop_YES() {
    FunctionInjector minCapInjector = new FunctionInjector(
        compiler, safeNameIdSupplier, true, false, true);
    Node root = parse("function foo(){ return function(){}; } foo();");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = minCapInjector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, true);
    assertEquals(CanInlineResult.YES, result);
  }

  // ================= referencesThis branch =================

  @Test
  public void testCanInline_referencesThis_notFunctionObjectCall_NO() {
    Node root = parse("function foo(){ return this.x; } foo();");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, true, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_referencesThis_functionObjectCall_YES() {
    Node root = parse("function foo(){ return this.x; } var r = foo.call(this);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, true, false);
    assertEquals(CanInlineResult.YES, result);
  }

  // ================= isDirectCallNodeReplacementPossible =================

  @Test
  public void testIsDirectReplacement_emptyBody_true() {
    Node fn = firstFunction(parse("function foo(){}"));
    assertTrue(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectReplacement_singleReturnWithExpr_true() {
    Node fn = firstFunction(parse("function foo(){ return 1; }"));
    assertTrue(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectReplacement_singleReturnNoExpr_false() {
    Node fn = firstFunction(parse("function foo(){ return; }"));
    assertFalse(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectReplacement_singleNonReturnStmt_false() {
    Node fn = firstFunction(parse("function foo(){ var x = 1; }"));
    assertFalse(injector.isDirectCallNodeReplacementPossible(fn));
  }

  @Test
  public void testIsDirectReplacement_multipleStatements_false() {
    Node fn = firstFunction(parse("function foo(){ var x=1; return x; }"));
    assertFalse(injector.isDirectCallNodeReplacementPossible(fn));
  }

  // ================= canInlineReferenceDirectly (via DIRECT mode) =================

  @Test
  public void testCanInlineDirect_notDirectReplacementPossible_NO() {
    Node root = parse("function foo(a){ var t=a; return t; } foo(1);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineDirect_argHasSideEffects_NO() {
    // Per given source, mayHaveSideEffects(cArg) unconditionally returns NO
    // regardless of parameter reference count (potential fault area / Closure-175).
    Node root = parse("function foo(a){ return a; } var x=0; foo(x++);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineDirect_argMutableState_paramUsedTwice_NO() {
    Node root = parse("function foo(a){ return a + a; } foo({});");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInlineDirect_argMutableState_paramUsedOnce_YES() {
    Node root = parse("function foo(a){ return a; } foo({});");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineDirect_moreArgsThanParams_noSideEffects_YES() {
    Node root = parse("function foo(a){ return a; } foo(1, 2, 3);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInlineDirect_moreParamsThanArgs_YES() {
    Node root = parse("function foo(a,b,c){ return a; } foo(1);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.DIRECT, false, false);
    assertEquals(CanInlineResult.YES, result);
  }

  // ================= BLOCK mode dispatch (canInlineReferenceAsStatementBlock) =================

  @Test
  public void testCanInline_blockMode_simpleCall_YES() {
    Node root = parse("function foo(a){ var x = a; x++; } foo(1);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);
    when(t.inGlobalScope()).thenReturn(true);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.BLOCK, false, false);
    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInline_blockMode_applyCall_unsupported_NO() {
    // isSupportedCallType filters this out before classifyCallSite/BLOCK logic runs.
    Node root = parse("function foo(a){ return a; } foo.apply(null, [1]);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.BLOCK, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_blockMode_decompositionDisallowed_NO() {
    // NOTE (assumption): classifyCallSite() is expected to return EXPRESSION
    // (MOVABLE) for "1 + foo(2)" since foo(2) is the sole/first side-effect;
    // with allowDecomposition=false this must yield NO. Based on Javadoc,
    // not verified against ExpressionDecomposer's actual source.
    FunctionInjector noDecompInjector = new FunctionInjector(
        compiler, safeNameIdSupplier, false, false, false);
    Node root = parse("function foo(a){ return a; } var y = 1 + foo(2);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);
    NodeTraversal t = mock(NodeTraversal.class);

    CanInlineResult result = noDecompInjector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.BLOCK, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_blockMode_callerScopeHasEval_forbidsVarsInCallee_NO() {
    Node root = parse(
        "function foo(a){ var t = a; return t; }"
        + "function caller(){ eval('1'); foo(1); }");
    Node fn = firstFunction(root);
    Node callerFn = fn.getNext();
    Node call = firstCall(callerFn);
    NodeTraversal t = mock(NodeTraversal.class);
    when(t.inGlobalScope()).thenReturn(false);
    when(t.getScopeRoot()).thenReturn(callerFn);

    CanInlineResult result = injector.canInlineReferenceToFunction(
        t, call, fn, Sets.<String>newHashSet(), InliningMode.BLOCK, false, false);
    assertEquals(CanInlineResult.NO, result);
  }

  // ================= maybePrepareCall / classifyCallSite (SIMPLE_CALL no-op) =================

  @Test
  public void testMaybePrepareCall_simpleCall_noStructureChange() {
    Node root = parse("function foo(a){ return a; } foo(1);");
    Node call = firstCall(root);
    Node parentBefore = call.getParent();

    injector.maybePrepareCall(call);

    assertSame(parentBefore, call.getParent());
  }

  // ================= inline() dispatch (DIRECT -> inlineReturnValue) =================

  @Test
  public void testInline_direct_withReturnExpression_replacesCall() {
    AbstractCompiler mc = mock(AbstractCompiler.class);
    // NOTE: assumes AbstractCompiler.LifeCycleStage.NORMALIZED exists (not shown in source).
    when(mc.getLifeCycleStage()).thenReturn(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector inj = new FunctionInjector(
        mc, safeNameIdSupplier, true, false, false);

    Node root = parse("function foo(a){ return a + 1; } var r = foo(5);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);

    Node result = inj.inline(call, "foo", fn, InliningMode.DIRECT);

    assertNotNull(result);
    assertFalse(result.isCall());
  }

  @Test
  public void testInline_direct_emptyBody_returnsNonCallNode() {
    AbstractCompiler mc = mock(AbstractCompiler.class);
    when(mc.getLifeCycleStage()).thenReturn(AbstractCompiler.LifeCycleStage.NORMALIZED);
    FunctionInjector inj = new FunctionInjector(
        mc, safeNameIdSupplier, true, false, false);

    Node root = parse("function foo(){} foo();");
    Node fn = firstFunction(root);
    Node call = firstCall(root);

    Node result = inj.inline(call, "foo", fn, InliningMode.DIRECT);

    assertNotNull(result);
    // NOTE: exact node shape produced by NodeUtil.newUndefinedNode is not
    // shown in the given source; only asserting it's no longer the CALL node.
    assertFalse(result.isCall());
  }

  @Test(expected = IllegalStateException.class)
  public void testInline_notNormalized_throwsISE() {
    AbstractCompiler mc = mock(AbstractCompiler.class);
    // NOTE: assumes AbstractCompiler.LifeCycleStage.RAW exists as a "not normalized" stage.
    when(mc.getLifeCycleStage()).thenReturn(AbstractCompiler.LifeCycleStage.RAW);
    FunctionInjector inj = new FunctionInjector(
        mc, safeNameIdSupplier, true, false, false);

    Node root = parse("function foo(a){ return a; } foo(1);");
    Node fn = firstFunction(root);
    Node call = firstCall(root);

    inj.inline(call, "foo", fn, InliningMode.DIRECT);
  }

  // ================= setKnownConstants =================

  @Test
  public void testSetKnownConstants_firstCall_succeeds() {
    injector.setKnownConstants(Sets.newHashSet("A", "B")); // should not throw
  }

  @Test(expected = IllegalStateException.class)
  public void testSetKnownConstants_calledTwiceWithNonEmptySet_throws() {
    injector.setKnownConstants(Sets.newHashSet("A"));
    injector.setKnownConstants(Sets.newHashSet("B"));
  }

  @Test
  public void testSetKnownConstants_emptySet_allowsRepeatedCalls() {
    // Boundary: since the internal set stays empty, checkState(isEmpty()) keeps passing.
    injector.setKnownConstants(Sets.<String>newHashSet());
    injector.setKnownConstants(Sets.newHashSet("X")); // still allowed once
  }
}
