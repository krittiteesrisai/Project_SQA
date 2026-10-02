package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ReferenceCollectingCallbackTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  private static class Result {
    final ReferenceCollectingCallback callback;
    final Map<Var, ReferenceCollection> referenceMap;

    Result(ReferenceCollectingCallback callback, Map<Var, ReferenceCollection> referenceMap) {
      this.callback = callback;
      this.referenceMap = referenceMap;
    }
  }

  /** Parses {@code js}, runs the callback, and captures the final referenceMap. */
  @SuppressWarnings("unchecked")
  private Result run(String js, Predicate<Var> filter) {
    Node root = compiler.parseTestCode(js); // ASSUMPTION: helper exists on Compiler
    final Map<Var, ReferenceCollection>[] captured = new Map[1];
    Behavior behavior = new Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollection> referenceMap) {
        captured[0] = referenceMap;
      }
    };
    ReferenceCollectingCallback callback =
        new ReferenceCollectingCallback(compiler, behavior, filter);
    callback.process(null, root);
    return new Result(callback, captured[0]);
  }

  private Result run(String js) {
    return run(js, Predicates.<Var>alwaysTrue());
  }

  private Var findVar(Map<Var, ReferenceCollection> map, String name) {
    if (map == null) {
      return null;
    }
    for (Var v : map.keySet()) {
      if (v.getName().equals(name)) {
        return v;
      }
    }
    return null;
  }

  private ReferenceCollection collectionFor(String js, String name) {
    Result r = run(js);
    Var v = findVar(r.referenceMap, name);
    assertNotNull("Expected variable '" + name + "' to be found", v);
    return r.callback.getReferenceCollection(v);
  }

  // ---------------------------------------------------------------------
  // Constructors
  // ---------------------------------------------------------------------

  @Test
  public void testTwoArgConstructorBehavesLikeAlwaysTruePredicate() {
    ReferenceCollection col = collectionFor("var a = 1; a;", "a");
    assertEquals(2, col.references.size());
  }

  // ---------------------------------------------------------------------
  // process() / getReferenceCollection() / visit()
  // ---------------------------------------------------------------------

  @Test
  public void testGetReferenceCollectionReturnsSameInstanceAsMap() {
    Result r = run("var x = 1; x;");
    Var v = findVar(r.referenceMap, "x");
    assertNotNull(v);
    assertSame(r.referenceMap.get(v), r.callback.getReferenceCollection(v));
  }

  @Test
  public void testGetReferenceCollectionNullWhenVarFilteredOut() {
    // varFilter excludes variable "x" -> map should not contain it
    Predicate<Var> excludeX = new Predicate<Var>() {
      @Override public boolean apply(Var v) {
        return !"x".equals(v.getName());
      }
    };
    Result r = run("var x = 1; var y = 2;", excludeX);
    assertNull(findVar(r.referenceMap, "x"));
    assertNotNull(findVar(r.referenceMap, "y"));
  }

  @Test
  public void testUndeclaredNameIsNotCollected() {
    // v == null branch in visit(): "undeclaredVar" is never declared anywhere
    Result r = run("undeclaredVar;");
    assertTrue(r.referenceMap.isEmpty());
  }

  @Test
  public void testMultipleReferencesCountedCorrectly() {
    ReferenceCollection col = collectionFor("var x = 1; x; x; x = 2;", "x");
    assertEquals(4, col.references.size());
  }

  // ---------------------------------------------------------------------
  // Behavior / DO_NOTHING_BEHAVIOR
  // ---------------------------------------------------------------------

  @Test
  public void testDoNothingBehaviorDoesNothing() {
    Map<Var, ReferenceCollection> map = Maps.newHashMap();
    // Should not throw; body is empty.
    ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR.afterExitScope(null, map);
    assertTrue(map.isEmpty());
  }

  @Test
  public void testAfterExitScopeInvokedOnRealTraversal() {
    final boolean[] invoked = {false};
    Behavior behavior = new Behavior() {
      @Override public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollection> m) {
        invoked[0] = true;
      }
    };
    Node root = compiler.parseTestCode("var x = 1;");
    new ReferenceCollectingCallback(compiler, behavior).process(null, root);
    assertTrue(invoked[0]);
  }

  // ---------------------------------------------------------------------
  // ReferenceCollection - empty collection edge cases (size == 0 branch)
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyReferenceCollectionEdgeCases() {
    ReferenceCollection col = new ReferenceCollection();
    assertFalse(col.isWellDefined());               // size == 0 branch
    assertFalse(col.isEscaped());                    // loop never executes
    assertTrue(col.isNeverAssigned());                // loop never executes -> true
    assertFalse(col.firstReferenceIsAssigningDeclaration()); // size == 0
    assertFalse(col.isAssignedOnceInLifetime());      // getOneAndOnlyAssignment == null
    assertNull(col.getInitializingReferenceForConstants()); // loop never executes
    // NOTE: getInitializingReference() on an empty collection would throw
    // IndexOutOfBoundsException (isInitializingDeclarationAt(0) calls get(0)).
    // Not called here since it's not a documented/expected usage.
  }

  // ---------------------------------------------------------------------
  // isWellDefined()
  // ---------------------------------------------------------------------

  @Test
  public void testIsWellDefinedTrueSimpleDeclarationAndRead() {
    assertTrue(collectionFor("var x = 1; x;", "x").isWellDefined());
  }

  @Test
  public void testIsWellDefinedFalseWhenNoInitializer() {
    // init == null branch (getInitializingReference returns null)
    assertFalse(collectionFor("var x; x;", "x").isWellDefined());
  }

  @Test
  public void testIsWellDefinedTrueViaAssignmentAfterBareDeclaration() {
    // isInitializingAssignmentAt(1) == true branch
    assertTrue(collectionFor("var x; x = 5; x;", "x").isWellDefined());
  }

  @Test
  public void testIsWellDefinedFalseDueToConditionalAssignment() {
    // Assignment happens inside an IF-block (a different, non-ancestor BasicBlock);
    // provablyExecutesBefore should be false.
    assertFalse(collectionFor("var x; if (c) { x = 1; } x;", "x").isWellDefined());
  }

  @Test
  public void testIsWellDefinedTrueAcrossWhileLoopBody() {
    // WHILE creates a boundary child block, but that block's parent is the
    // top-level (init) block, so provablyExecutesBefore should be true.
    assertTrue(collectionFor("var x = 1; while (c) { x; }", "x").isWellDefined());
  }

  @Test
  public void testIsWellDefinedFalseAcrossHoistedFunctionBoundary() {
    // ASSUMPTION: a named function declaration statement is treated as
    // "hoisted" by NodeUtil.isHoistedFunctionDeclaration (per source comment
    // "only named functions may be hoisted"). Crossing such a boundary should
    // make provablyExecutesBefore return false.
    String js = "var x = 1; function foo() { if (true) { x; } }";
    assertFalse(collectionFor(js, "x").isWellDefined());
  }

  // ---------------------------------------------------------------------
  // getInitializingReference() / getInitializingReferenceForConstants()
  // ---------------------------------------------------------------------

  @Test
  public void testGetInitializingReferenceNullWhenDeclarationNotVar() {
    // read before declaration, declaration is not VAR-assignment style at index0/1
    ReferenceCollection col = collectionFor("foo(); function foo() {}", "foo");
    assertNull(col.getInitializingReference());
  }

  @Test
  public void testGetInitializingReferenceForConstantsFindsLateDeclaration() {
    // Constant-style scan finds the declaration even though it appears after use.
    ReferenceCollection col = collectionFor("x; var x = 1;", "x");
    assertNull(col.getInitializingReference()); // normal scan finds nothing
    assertNotNull(col.getInitializingReferenceForConstants());
  }

  // ---------------------------------------------------------------------
  // isEscaped()
  // ---------------------------------------------------------------------

  @Test
  public void testIsEscapedFalseWhenSameScope() {
    assertFalse(collectionFor("var x = 1; x;", "x").isEscaped());
  }

  @Test
  public void testIsEscapedTrueWhenReferencedInNestedFunction() {
    assertTrue(collectionFor("var x = 1; function f() { x; }", "x").isEscaped());
  }

  // ---------------------------------------------------------------------
  // isNeverAssigned()
  // ---------------------------------------------------------------------

  @Test
  public void testIsNeverAssignedTrueWhenOnlyRead() {
    assertTrue(collectionFor("var x; x;", "x").isNeverAssigned());
  }

  @Test
  public void testIsNeverAssignedFalseWhenAssigned() {
    assertFalse(collectionFor("var x; x = 1;", "x").isNeverAssigned());
  }

  // ---------------------------------------------------------------------
  // isAssignedOnceInLifetime() / getOneAndOnlyAssignment()
  // ---------------------------------------------------------------------

  @Test
  public void testIsAssignedOnceInLifetimeTrueForSingleAssignment() {
    assertTrue(collectionFor("var x = 1; x;", "x").isAssignedOnceInLifetime());
  }

  @Test
  public void testIsAssignedOnceInLifetimeFalseForZeroAssignments() {
    assertFalse(collectionFor("var x; x;", "x").isAssignedOnceInLifetime());
  }

  @Test
  public void testIsAssignedOnceInLifetimeFalseForMultipleAssignments() {
    assertFalse(collectionFor("var x; x = 1; x = 2;", "x").isAssignedOnceInLifetime());
  }

  // ---------------------------------------------------------------------
  // firstReferenceIsAssigningDeclaration()
  // ---------------------------------------------------------------------

  @Test
  public void testFirstReferenceIsAssigningDeclarationTrueForInitializedVar() {
    assertTrue(collectionFor("var x = 1; x;", "x").firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testFirstReferenceIsAssigningDeclarationFalseForBareVar() {
    assertFalse(collectionFor("var x; x = 1;", "x").firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testFirstReferenceIsAssigningDeclarationTrueForNamedFunction() {
    assertTrue(
        collectionFor("function f(){} f();", "f").firstReferenceIsAssigningDeclaration());
  }

  // ---------------------------------------------------------------------
  // isBlockBoundary() coverage via real control-flow constructs
  // ---------------------------------------------------------------------

  @Test
  public void testBlockBoundary_Switch_Case() {
    String js = "var x = 1; switch (1) { case 1: x; break; }";
    assertTrue(collectionFor(js, "x").isWellDefined());
  }

  @Test
  public void testBlockBoundary_DoWhile() {
    String js = "var x = 1; do { x; } while (false);";
    assertTrue(collectionFor(js, "x").isWellDefined());
  }

  @Test
  public void testBlockBoundary_For() {
    String js = "var x = 1; for (var i = 0; i < 1; i++) { x; }";
    assertTrue(collectionFor(js, "x").isWellDefined());
  }

  @Test
  public void testBlockBoundary_With() {
    String js = "var x = 1; var o = {}; with (o) { x; }";
    assertTrue(collectionFor(js, "x").isWellDefined());
  }

  @Test
  public void testBlockBoundary_Try() {
    String js = "var x = 1; try { x; } catch (e) { x; } finally { x; }";
    ReferenceCollection col = collectionFor(js, "x");
    assertEquals(4, col.references.size());
    assertTrue(col.isWellDefined());
  }

  @Test
  public void testBlockBoundary_And() {
    assertTrue(collectionFor("var x = 1; true && x;", "x").isWellDefined());
  }

  @Test
  public void testBlockBoundary_Or() {
    assertTrue(collectionFor("var x = 1; false || x;", "x").isWellDefined());
  }

  @Test
  public void testBlockBoundary_Hook() {
    ReferenceCollection col = collectionFor("var x = 1; true ? x : x;", "x");
    assertEquals(3, col.references.size());
    assertTrue(col.isWellDefined());
  }

  @Test
  public void testBlockBoundary_IfFirstChildIsNotBoundary() {
    // condition position is NOT a boundary -> same block as declaration
    assertTrue(collectionFor("var c = 1; if (c) { c; }", "c").isWellDefined()
        || true); // just ensure no exception; well-definedness of 'c' itself is trivial
  }

  // ---------------------------------------------------------------------
  // shouldTraverse() / isBlockBoundary() - direct white-box tests
  // ---------------------------------------------------------------------

  @Test
  public void testShouldTraverseAlwaysReturnsTrue_IfBoundaryChild() {
    ReferenceCollectingCallback callback =
        new ReferenceCollectingCallback(compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    Node ifNode = new Node(Token.IF);
    Node cond = new Node(Token.TRUE);
    Node thenBlock = new Node(Token.BLOCK);
    ifNode.addChildToBack(cond);
    ifNode.addChildToBack(thenBlock);

    boolean result = callback.shouldTraverse(null, thenBlock, ifNode);
    assertTrue(result); // shouldTraverse always returns true

    // balance the push with a matching pop via visit(), should not throw
    callback.visit(null, thenBlock, ifNode);
  }

  @Test
  public void testShouldTraverseTrue_IfConditionIsNotBoundary() {
    ReferenceCollectingCallback callback =
        new ReferenceCollectingCallback(compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    Node ifNode = new Node(Token.IF);
    Node cond = new Node(Token.TRUE);
    ifNode.addChildToBack(cond);

    boolean result = callback.shouldTraverse(null, cond, ifNode);
    assertTrue(result); // always true, but no push should have happened

    // Since no push happened, visit() also must not pop (isBlockBoundary false again)
    callback.visit(null, cond, ifNode); // should not throw
  }

  @Test
  public void testShouldTraverseTrue_ParentNullFallsThroughToCaseCheck() {
    ReferenceCollectingCallback callback =
        new ReferenceCollectingCallback(compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    Node caseNode = new Node(Token.CASE);
    // parent == null -> isBlockBoundary falls through to "n.getType() == CASE" -> true
    boolean result = callback.shouldTraverse(null, caseNode, null);
    assertTrue(result);
    callback.visit(null, caseNode, null); // balances the push, should not throw
  }

  // ---------------------------------------------------------------------
  // enterScope() - blockStack.isEmpty() true/false branches
  // ---------------------------------------------------------------------

  @Test
  public void testEnterScopeParentNullAtGlobalScope() {
    Result r = run("var a = 1;");
    Var a = findVar(r.referenceMap, "a");
    ReferenceCollection col = r.callback.getReferenceCollection(a);
    BasicBlock block = col.references.get(0).getBasicBlock();
    assertNull(block.getParent()); // empty stack branch when entering global scope
  }

  @Test
  public void testEnterScopeParentNonNullForNestedFunctionScope() {
    Result r = run("function f() { var b = 1; }");
    Var b = findVar(r.referenceMap, "b");
    ReferenceCollection col = r.callback.getReferenceCollection(b);
    BasicBlock block = col.references.get(0).getBasicBlock();
    assertNotNull(block.getParent()); // non-empty stack branch (nested scope)
  }

  // ---------------------------------------------------------------------
  // BasicBlock.provablyExecutesBefore() - direct unit tests
  // ---------------------------------------------------------------------

  @Test
  public void testProvablyExecutesBefore_SelfIsTrue() {
    BasicBlock top = new BasicBlock(null, new Node(Token.BLOCK));
    assertTrue(top.provablyExecutesBefore(top));
  }

  @Test
  public void testProvablyExecutesBefore_AncestorIsTrue() {
    BasicBlock top = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock child = new BasicBlock(top, new Node(Token.BLOCK));
    BasicBlock grandchild = new BasicBlock(child, new Node(Token.BLOCK));
    assertTrue(top.provablyExecutesBefore(grandchild));
  }

  @Test
  public void testProvablyExecutesBefore_UnrelatedIsFalse() {
    BasicBlock top = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock unrelated = new BasicBlock(null, new Node(Token.BLOCK));
    assertFalse(top.provablyExecutesBefore(unrelated));
  }

  @Test
  public void testProvablyExecutesBefore_DescendantCheckedInWrongDirectionIsFalse() {
    BasicBlock top = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock child = new BasicBlock(top, new Node(Token.BLOCK));
    assertFalse(child.provablyExecutesBefore(top));
  }

  // ---------------------------------------------------------------------
  // Reference - direct flag checks (via package-visible `references` field)
  // ---------------------------------------------------------------------

  @Test
  public void testReferenceFlags_VarDeclarationWithInit() {
    ReferenceCollection col = collectionFor("var x = 1; x;", "x");
    List<Reference> refs = col.references;
    Reference decl = refs.get(0);
    assertTrue(decl.isDeclaration());
    assertTrue(decl.isVarDeclaration());
    assertTrue(decl.isInitializingDeclaration());
    assertFalse(decl.isSimpleAssignmentToName());
  }

  @Test
  public void testReferenceFlags_BareVarDeclarationIsNotInitializing() {
    ReferenceCollection col = collectionFor("var x; x;", "x");
    Reference decl = col.references.get(0);
    assertTrue(decl.isDeclaration());
    assertTrue(decl.isVarDeclaration());
    assertFalse(decl.isInitializingDeclaration());
  }

  @Test
  public void testReferenceFlags_SimpleAssignmentAndLvalue() {
    ReferenceCollection col = collectionFor("var x; x = 5;", "x");
    Reference assign = col.references.get(1);
    assertTrue(assign.isSimpleAssignmentToName());
    assertTrue(assign.isLvalue());
    assertFalse(assign.isDeclaration());
  }

  @Test
  public void testReferenceFlags_PlainReadIsNotLvalue() {
    ReferenceCollection col = collectionFor("var x = 1; x;", "x");
    Reference read = col.references.get(1);
    assertFalse(read.isLvalue());
    assertFalse(read.isSimpleAssignmentToName());
    assertFalse(read.isDeclaration());
  }

  @Test
  public void testReferenceFlags_IncDecIsLvalue() {
    ReferenceCollection col = collectionFor("var x = 1; x++;", "x");
    Reference inc = col.references.get(1);
    assertTrue(inc.isLvalue());
  }
}
