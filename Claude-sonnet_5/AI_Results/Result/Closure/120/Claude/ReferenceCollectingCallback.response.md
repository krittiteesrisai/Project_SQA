# ReferenceCollectingCallbackTest.java

**หมายเหตุสำคัญก่อนเริ่ม:**
- คลาสเป้าหมายและคลาส inner (`Reference`, `BasicBlock`, `ReferenceCollection`) เป็น package-private จึงต้องวางเทสไว้ใน package เดียวกัน (`com.google.javascript.jscomp`)
- เมธอด `isBlockBoundary` (private static) และ constructor ของ `Reference` แบบ 4-parameter (private) ถูกเรียกผ่าน **reflection** เพื่อทดสอบ logic ภายในโดยตรง โดยไม่ต้องพึ่งพา `NodeTraversal`/`Scope`/`Compiler` เต็มรูปแบบ ซึ่งไม่มี source ให้ตรวจสอบ behavior ที่แน่ชัด
- จุดใดที่ต้องอิงพฤติกรรมของคลาสภายนอก (เช่น `NodeUtil.isForIn`, `NodeUtil.isHoistedFunctionDeclaration`, `NodeUtil.getAssignedValue`) ที่ไม่มี source ให้ จะ**คอมเมนต์กำกับ** ว่าเป็นสมมติฐานที่สมเหตุสมผล (เช่น node ที่ไม่ใช่ FUNCTION ย่อมไม่ใช่ hoisted function declaration)
- `process()/visit()/enterScope()/exitScope()` เต็มรูปแบบต้องพึ่งพา `Compiler`/`NodeTraversal`/`Scope` ที่ไม่มี source ให้ในโจทย์ จึง**ไม่ได้ทดสอบแบบ end-to-end** เพื่อไม่ต้องเดา behavior ของคลาสเหล่านั้น แต่ได้ทดสอบ public API ส่วนที่ปลอดภัย (`getAllSymbols`, `getReferences`, constructors) แทน

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Predicates;
import com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReferenceCollectingCallbackTest {

  // ---------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------

  private static Node name(String s) {
    return Node.newString(Token.NAME, s);
  }

  /** Creates {@code new Node(type)} with the given children appended (each child gets a fresh parent). */
  private static Node parented(int type, Node... children) {
    Node n = new Node(type);
    for (Node c : children) {
      n.addChildToBack(c);
    }
    return n;
  }

  /**
   * Uses reflection to call the private 4-arg constructor of {@link Reference}
   * (Node, BasicBlock, Scope, InputId) so we can build References without a
   * full NodeTraversal/Scope pipeline. scope/inputId are set to null; this is
   * safe for every method under test here except getSymbol() (not tested).
   */
  private static Reference newRef(Node nameNode, BasicBlock block) {
    try {
      Constructor<Reference> ctor = Reference.class.getDeclaredConstructor(
          Node.class, BasicBlock.class, Scope.class, InputId.class);
      ctor.setAccessible(true);
      return ctor.newInstance(nameNode, block, null, null);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  /** Invokes the private static isBlockBoundary(Node, Node) via reflection. */
  private static boolean isBlockBoundary(Node n, Node parent) {
    try {
      Method m = ReferenceCollectingCallback.class.getDeclaredMethod(
          "isBlockBoundary", Node.class, Node.class);
      m.setAccessible(true);
      return (Boolean) m.invoke(null, n, parent);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  // ---------------------------------------------------------------
  // ReferenceCollectingCallback (outer class) - constructors / basic API
  // ---------------------------------------------------------------

  @Test
  public void testTwoArgConstructor_allSymbolsInitiallyEmpty() {
    ReferenceCollectingCallback callback =
        new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    assertFalse(callback.getAllSymbols().iterator().hasNext());
  }

  @Test
  public void testThreeArgConstructor_noException() {
    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
        null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR,
        Predicates.<Var>alwaysFalse());
    assertFalse(callback.getAllSymbols().iterator().hasNext());
  }

  @Test
  public void testGetReferences_nullVar_returnsNull_boundaryCase() {
    ReferenceCollectingCallback callback =
        new ReferenceCollectingCallback(null, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    // Boundary/null-input case: empty map, null key -> HashMap#get supports null keys.
    assertNull(callback.getReferences(null));
  }

  // ---------------------------------------------------------------
  // isBlockBoundary (private static)
  // ---------------------------------------------------------------

  @Test
  public void testIsBlockBoundary_nullParent_caseNode_true() {
    assertTrue(isBlockBoundary(new Node(Token.CASE), null));
  }

  @Test
  public void testIsBlockBoundary_nullParent_notCase_false() {
    assertFalse(isBlockBoundary(name("a"), null));
  }

  @Test
  public void testIsBlockBoundary_doForTryWhileWith_alwaysTrue() {
    int[] types = {Token.DO, Token.FOR, Token.TRY, Token.WHILE, Token.WITH};
    for (int t : types) {
      Node child = new Node(Token.BLOCK);
      Node parent = parented(t, child);
      assertTrue("type=" + t, isBlockBoundary(child, parent));
    }
  }

  @Test
  public void testIsBlockBoundary_ifFirstChild_false() {
    Node cond = name("x");
    Node thenBlock = new Node(Token.BLOCK);
    Node ifNode = parented(Token.IF, cond, thenBlock);
    assertFalse(isBlockBoundary(cond, ifNode));
  }

  @Test
  public void testIsBlockBoundary_ifNonFirstChild_true() {
    Node cond = name("x");
    Node thenBlock = new Node(Token.BLOCK);
    Node ifNode = parented(Token.IF, cond, thenBlock);
    assertTrue(isBlockBoundary(thenBlock, ifNode));
  }

  @Test
  public void testIsBlockBoundary_and_firstVsSecondChild() {
    Node left = name("x");
    Node right = name("y");
    Node andNode = parented(Token.AND, left, right);
    assertFalse(isBlockBoundary(left, andNode));
    assertTrue(isBlockBoundary(right, andNode));
  }

  @Test
  public void testIsBlockBoundary_defaultFallthrough_returnsIsCase() {
    Node parent = new Node(Token.BLOCK); // unmatched switch type
    assertTrue(isBlockBoundary(new Node(Token.CASE), parent));
    assertFalse(isBlockBoundary(name("z"), parent));
  }

  // ---------------------------------------------------------------
  // BasicBlock
  // ---------------------------------------------------------------

  @Test
  public void testBasicBlock_globalScopeBlock_noParent() {
    BasicBlock block = new BasicBlock(null, new Node(Token.BLOCK));
    assertTrue(block.isGlobalScopeBlock());
    assertNull(block.getParent());
  }

  @Test
  public void testBasicBlock_childBlock_notGlobal() {
    BasicBlock parent = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock child = new BasicBlock(parent, new Node(Token.BLOCK));
    assertFalse(child.isGlobalScopeBlock());
    assertSame(parent, child.getParent());
  }

  @Test
  public void testProvablyExecutesBefore_sameBlock_true() {
    BasicBlock block = new BasicBlock(null, new Node(Token.BLOCK));
    assertTrue(block.provablyExecutesBefore(block));
  }

  @Test
  public void testProvablyExecutesBefore_ancestorRelation_true() {
    BasicBlock ancestor = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock child = new BasicBlock(ancestor, new Node(Token.BLOCK));
    assertTrue(ancestor.provablyExecutesBefore(child));
  }

  @Test
  public void testProvablyExecutesBefore_bothGlobalUnrelated_true() {
    BasicBlock a = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock b = new BasicBlock(null, new Node(Token.BLOCK));
    assertTrue(a.provablyExecutesBefore(b));
  }

  @Test
  public void testProvablyExecutesBefore_thisGlobal_thatNotGlobalUnrelated_false() {
    BasicBlock a = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock someParent = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock b = new BasicBlock(someParent, new Node(Token.BLOCK));
    assertFalse(a.provablyExecutesBefore(b));
  }

  @Test
  public void testProvablyExecutesBefore_bothNotGlobalUnrelated_false() {
    BasicBlock p1 = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock a = new BasicBlock(p1, new Node(Token.BLOCK));
    BasicBlock p2 = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock b = new BasicBlock(p2, new Node(Token.BLOCK));
    assertFalse(a.provablyExecutesBefore(b));
  }

  // ---------------------------------------------------------------
  // Reference
  // ---------------------------------------------------------------

  @Test
  public void testReference_varDeclarationNoInitializer() {
    Node n = name("a");
    Node varNode = parented(Token.VAR, n);
    parented(Token.BLOCK, varNode); // gives varNode a non-null parent (avoids NPE inside isLhsOfForInExpression)

    Reference ref = newRef(n, null);
    assertTrue(ref.isDeclaration());
    assertTrue(ref.isVarDeclaration());
    assertFalse(ref.isInitializingDeclaration());
    assertFalse(ref.isLvalue());
    assertFalse(ref.isSimpleAssignmentToName());
  }

  @Test
  public void testReference_varDeclarationWithInitializer() {
    Node n = name("a");
    n.addChildToBack(new Node(Token.NULL));
    Node varNode = parented(Token.VAR, n);
    parented(Token.BLOCK, varNode);

    Reference ref = newRef(n, null);
    assertTrue(ref.isDeclaration());
    assertTrue(ref.isVarDeclaration());
    assertTrue(ref.isInitializingDeclaration());
    assertTrue(ref.isLvalue());
  }

  @Test
  public void testReference_simpleAssignment() {
    Node n = name("a");
    parented(Token.ASSIGN, n, new Node(Token.NULL));

    Reference ref = newRef(n, null);
    assertFalse(ref.isDeclaration());
    assertFalse(ref.isVarDeclaration());
    assertFalse(ref.isInitializingDeclaration());
    assertTrue(ref.isSimpleAssignmentToName());
    assertTrue(ref.isLvalue());
  }

  @Test
  public void testReference_increment_isLvalue() {
    Node n = name("a");
    parented(Token.INC, n);
    assertTrue(newRef(n, null).isLvalue());
  }

  @Test
  public void testReference_decrement_isLvalue() {
    Node n = name("a");
    parented(Token.DEC, n);
    assertTrue(newRef(n, null).isLvalue());
  }

  @Test
  public void testReference_plainRead_notDeclarationNorLvalue() {
    Node n = name("a");
    parented(Token.CALL, n);

    Reference ref = newRef(n, null);
    assertFalse(ref.isDeclaration());
    assertFalse(ref.isInitializingDeclaration());
    assertFalse(ref.isLvalue());
    assertFalse(ref.isSimpleAssignmentToName());
  }

  @Test
  public void testReference_functionParam_isDeclarationAndInitializing() {
    Node param = name("p");
    Node paramList = parented(Token.PARAM_LIST, param);
    Node funcName = name("f");
    Node funcBody = new Node(Token.BLOCK);
    parented(Token.FUNCTION, funcName, paramList, funcBody);

    Reference ref = newRef(param, null);
    assertTrue(ref.isDeclaration());
    assertFalse(ref.isVarDeclaration());
    assertTrue(ref.isInitializingDeclaration());
  }

  @Test
  public void testReference_paramListButGrandparentNotFunction_notDeclaration() {
    Node param = name("p");
    Node paramList = parented(Token.PARAM_LIST, param);
    parented(Token.CALL, paramList); // grandparent is CALL, not FUNCTION

    assertFalse(newRef(param, null).isDeclaration());
  }

  @Test
  public void testReference_functionNameNode_isDeclaration_andGetAssignedValue() {
    Node funcName = name("f");
    Node paramList = new Node(Token.PARAM_LIST);
    Node funcBody = new Node(Token.BLOCK);
    Node func = parented(Token.FUNCTION, funcName, paramList, funcBody);

    Reference ref = newRef(funcName, null);
    assertTrue(ref.isDeclaration());
    assertFalse(ref.isVarDeclaration());
    assertTrue(ref.isInitializingDeclaration());
    // ternary true-branch: parent.isFunction() -> returns the function node itself
    assertSame(func, ref.getAssignedValue());
  }

  @Test
  public void testReference_catchDeclaration_isDeclarationAndInitializing() {
    Node catchName = name("e");
    Node catchBody = new Node(Token.BLOCK);
    parented(Token.CATCH, catchName, catchBody);

    Reference ref = newRef(catchName, null);
    assertTrue(ref.isDeclaration());
    assertFalse(ref.isVarDeclaration());
    assertTrue(ref.isInitializingDeclaration());
  }

  @Test
  public void testReference_getParentAndGrandparent() {
    Node n = name("a");
    Node varNode = parented(Token.VAR, n);
    Node blockWrap = parented(Token.BLOCK, varNode);

    Reference ref = newRef(n, null);
    assertSame(varNode, ref.getParent());
    assertSame(blockWrap, ref.getGrandparent());
  }

  @Test
  public void testReference_getGrandparent_nullWhenNoParent_boundary() {
    Node n = name("a"); // standalone, no parent attached at all
    Reference ref = newRef(n, null);
    assertNull(ref.getParent());
    assertNull(ref.getGrandparent());
  }

  @Test
  public void testReference_getBasicBlock() {
    Node n = name("a");
    BasicBlock bb = new BasicBlock(null, new Node(Token.BLOCK));
    Reference ref = newRef(n, bb);
    assertSame(bb, ref.getBasicBlock());
  }

  // ---------------------------------------------------------------
  // ReferenceCollection
  // ---------------------------------------------------------------

  @Test
  public void testIsWellDefined_empty_false() {
    assertFalse(new ReferenceCollection().isWellDefined());
  }

  @Test
  public void testIsWellDefined_singleInitializingDeclaration_true() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    n.addChildToBack(new Node(Token.NULL));
    parented(Token.BLOCK, parented(Token.VAR, n));
    rc.add(newRef(n, new BasicBlock(null, new Node(Token.BLOCK))));
    assertTrue(rc.isWellDefined());
  }

  @Test
  public void testIsWellDefined_declarationWithoutInitializer_false() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    parented(Token.BLOCK, parented(Token.VAR, n));
    rc.add(newRef(n, new BasicBlock(null, new Node(Token.BLOCK))));
    assertFalse(rc.isWellDefined()); // getInitializingReference() == null
  }

  @Test
  public void testIsWellDefined_declarationThenProvablyLaterRead_true() {
    ReferenceCollection rc = new ReferenceCollection();

    Node declName = name("a");
    declName.addChildToBack(new Node(Token.NULL));
    parented(Token.BLOCK, parented(Token.VAR, declName));
    BasicBlock declBlock = new BasicBlock(null, new Node(Token.BLOCK));
    rc.add(newRef(declName, declBlock));

    Node readName = name("a");
    parented(Token.CALL, readName);
    BasicBlock readBlock = new BasicBlock(declBlock, new Node(Token.BLOCK));
    rc.add(newRef(readName, readBlock));

    assertTrue(rc.isWellDefined());
  }

  @Test
  public void testIsWellDefined_declarationThenUnrelatedRead_false() {
    ReferenceCollection rc = new ReferenceCollection();

    Node declName = name("a");
    declName.addChildToBack(new Node(Token.NULL));
    parented(Token.BLOCK, parented(Token.VAR, declName));
    BasicBlock declBlock = new BasicBlock(null, new Node(Token.BLOCK));
    rc.add(newRef(declName, declBlock));

    Node readName = name("a");
    parented(Token.CALL, readName);
    BasicBlock unrelatedParent = new BasicBlock(null, new Node(Token.BLOCK));
    BasicBlock readBlock = new BasicBlock(unrelatedParent, new Node(Token.BLOCK));
    rc.add(newRef(readName, readBlock));

    assertFalse(rc.isWellDefined());
  }

  @Test
  public void testIsEscaped_empty_false() {
    assertFalse(new ReferenceCollection().isEscaped());
  }

  @Test
  public void testIsEscaped_sameNullScope_false() {
    // NOTE: because all references here have scope == null, the local
    // variable `scope` inside isEscaped() is reassigned to null on every
    // iteration (the "scope == null" branch always matches), so the
    // "escaped" (scope != ref.scope) branch is never actually reached.
    // Testing the true-branch would require two distinct real Scope
    // instances, which cannot be built without a full Compiler/NodeTraversal
    // pipeline (Scope's constructor is not part of the provided source),
    // so that branch is intentionally left uncovered here.
    ReferenceCollection rc = new ReferenceCollection();
    Node n1 = name("a");
    parented(Token.CALL, n1);
    rc.add(newRef(n1, null));
    Node n2 = name("a");
    parented(Token.CALL, n2);
    rc.add(newRef(n2, null));
    assertFalse(rc.isEscaped());
  }

  @Test
  public void testIsNeverAssigned_empty_true() {
    assertTrue(new ReferenceCollection().isNeverAssigned());
  }

  @Test
  public void testIsNeverAssigned_onlyReads_true() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    parented(Token.CALL, n);
    rc.add(newRef(n, null));
    assertTrue(rc.isNeverAssigned());
  }

  @Test
  public void testIsNeverAssigned_withLvalue_false() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    parented(Token.INC, n);
    rc.add(newRef(n, null));
    assertFalse(rc.isNeverAssigned());
  }

  @Test
  public void testIsNeverAssigned_withInitializingDeclaration_false() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    n.addChildToBack(new Node(Token.NULL));
    parented(Token.BLOCK, parented(Token.VAR, n));
    rc.add(newRef(n, null));
    assertFalse(rc.isNeverAssigned());
  }

  @Test
  public void testIsAssignedOnceInLifetime_noAssignments_false() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    parented(Token.CALL, n);
    rc.add(newRef(n, null));
    assertFalse(rc.isAssignedOnceInLifetime());
  }

  @Test
  public void testIsAssignedOnceInLifetime_twoAssignments_false() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n1 = name("a");
    parented(Token.INC, n1);
    rc.add(newRef(n1, null));
    Node n2 = name("a");
    parented(Token.DEC, n2);
    rc.add(newRef(n2, null));
    assertFalse(rc.isAssignedOnceInLifetime());
  }

  @Test
  public void testIsAssignedOnceInLifetime_oneAssignmentNotInLoop_true() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    parented(Token.INC, n);
    BasicBlock block = new BasicBlock(null, new Node(Token.BLOCK));
    rc.add(newRef(n, block));
    assertTrue(rc.isAssignedOnceInLifetime());
  }

  @Test
  public void testIsAssignedOnceInLifetime_oneAssignmentInLoop_false() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    parented(Token.INC, n);
    Node bodyBlockNode = new Node(Token.BLOCK);
    parented(Token.FOR, bodyBlockNode); // bodyBlockNode.getParent() type == FOR -> isLoop == true
    BasicBlock loopBlock = new BasicBlock(null, bodyBlockNode);
    rc.add(newRef(n, loopBlock));
    assertFalse(rc.isAssignedOnceInLifetime());
  }

  @Test
  public void testIsAssignedOnceInLifetime_functionBreaksBeforeLoopCheck_true() {
    // Deliberately construct a block that is BOTH a function block AND has a
    // FOR-type parent (artificial), to verify "if (isFunction) break;" is
    // checked BEFORE "else if (isLoop) return false;" as coded.
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    parented(Token.INC, n);
    Node funcNode = new Node(Token.FUNCTION);
    parented(Token.FOR, funcNode);
    BasicBlock weirdBlock = new BasicBlock(null, funcNode);
    rc.add(newRef(n, weirdBlock));
    assertTrue(rc.isAssignedOnceInLifetime());
  }

  @Test
  public void testFirstReferenceIsAssigningDeclaration_empty_false() {
    assertFalse(new ReferenceCollection().firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testFirstReferenceIsAssigningDeclaration_true() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    n.addChildToBack(new Node(Token.NULL));
    parented(Token.BLOCK, parented(Token.VAR, n));
    rc.add(newRef(n, null));
    assertTrue(rc.firstReferenceIsAssigningDeclaration());
  }

  @Test
  public void testFirstReferenceIsAssigningDeclaration_varNoInit_false() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    parented(Token.BLOCK, parented(Token.VAR, n));
    rc.add(newRef(n, null));
    assertFalse(rc.firstReferenceIsAssigningDeclaration());
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testGetInitializingReference_emptyCollection_throws_boundary() {
    // Malformed/boundary usage: unlike isWellDefined() (guards size==0),
    // getInitializingReference() unconditionally reads index 0.
    new ReferenceCollection().getInitializingReference();
  }

  @Test
  public void testGetInitializingReference_index0_declaration() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n = name("a");
    n.addChildToBack(new Node(Token.NULL));
    parented(Token.BLOCK, parented(Token.VAR, n));
    Reference ref = newRef(n, null);
    rc.add(ref);
    assertSame(ref, rc.getInitializingReference());
  }

  @Test
  public void testGetInitializingReference_index1_assignmentAfterVarDecl() {
    ReferenceCollection rc = new ReferenceCollection();

    Node declName = name("a");
    parented(Token.BLOCK, parented(Token.VAR, declName)); // var a; (no init)
    rc.add(newRef(declName, null));

    Node assignName = name("a");
    parented(Token.ASSIGN, assignName, new Node(Token.NULL)); // a = null;
    Reference assignRef = newRef(assignName, null);
    rc.add(assignRef);

    assertSame(assignRef, rc.getInitializingReference());
  }

  @Test
  public void testGetInitializingReference_noneFound_null() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n1 = name("a");
    parented(Token.CALL, n1);
    Node n2 = name("a");
    parented(Token.CALL, n2);
    rc.add(newRef(n1, null));
    rc.add(newRef(n2, null));
    assertNull(rc.getInitializingReference());
  }

  @Test
  public void testGetInitializingReference_assignmentButPriorNotVarDecl_null() {
    ReferenceCollection rc = new ReferenceCollection();
    Node read = name("a");
    parented(Token.CALL, read);
    rc.add(newRef(read, null));

    Node assignName = name("a");
    parented(Token.ASSIGN, assignName, new Node(Token.NULL));
    rc.add(newRef(assignName, null));

    assertNull(rc.getInitializingReference());
  }

  @Test
  public void testGetInitializingReferenceForConstants_empty_null() {
    assertNull(new ReferenceCollection().getInitializingReferenceForConstants());
  }

  @Test
  public void testGetInitializingReferenceForConstants_foundLater() {
    ReferenceCollection rc = new ReferenceCollection();

    Node read1 = name("a");
    parented(Token.CALL, read1);
    rc.add(newRef(read1, null));

    Node read2 = name("a");
    parented(Token.CALL, read2);
    rc.add(newRef(read2, null));

    Node declName = name("a");
    declName.addChildToBack(new Node(Token.NULL));
    parented(Token.BLOCK, parented(Token.VAR, declName));
    Reference declRef = newRef(declName, null);
    rc.add(declRef);

    assertSame(declRef, rc.getInitializingReferenceForConstants());
  }

  @Test
  public void testGetInitializingReferenceForConstants_noneFound_null() {
    ReferenceCollection rc = new ReferenceCollection();
    Node n1 = name("a");
    parented(Token.CALL, n1);
    rc.add(newRef(n1, null));
    assertNull(rc.getInitializingReferenceForConstants());
  }
}
```

## สรุปตาราง Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testTwoArgConstructor_*`, `testThreeArgConstructor_*`, `testGetReferences_nullVar_*` | Constructor 2-arg delegate ไป 3-arg, `getAllSymbols()` กรณี map ว่าง, `getReferences(null)` (null-input boundary) |
| `testIsBlockBoundary_nullParent_*` | `parent == null` → เช็ค `n.isCase()` (true/false) |
| `testIsBlockBoundary_doForTryWhileWith_*` | switch-case `DO/FOR/TRY/WHILE/WITH` → return true |
| `testIsBlockBoundary_if*`, `_and_*` | switch-case `AND/HOOK/IF/OR` → `n != parent.getFirstChild()` (true/false) |
| `testIsBlockBoundary_defaultFallthrough_*` | parent type ไม่ตรง case ใด → fallthrough ไป `return n.isCase()` |
| `testBasicBlock_*` | constructor `BasicBlock`, `isGlobalScopeBlock()` (parent null/ไม่ null) |
| `testProvablyExecutesBefore_*` (5 เมธอด) | loop หา ancestor, `currentBlock==this` (true), ไม่พบ + ทั้งคู่ global (true), this global/that ไม่ global (false), ทั้งคู่ไม่ global ไม่สัมพันธ์กัน (false) |
| `testReference_varDeclaration*` | `isDeclaration/isVarDeclaration/isInitializingDeclaration/isLvalue` กรณี VAR มี/ไม่มี initializer |
| `testReference_simpleAssignment`, `_increment_*`, `_decrement_*` | `isLvalue` ผ่าน ASSIGN/INC/DEC, `isSimpleAssignmentToName` |
| `testReference_plainRead_*` | ทุก branch เป็น false (ไม่ decl, ไม่ lvalue) รวมถึง `isLhsOfForInExpression` เส้นทาง non-VAR |
| `testReference_functionParam_*`, `_paramListButGrandparentNotFunction_*` | เงื่อนไข `parent.isParamList() && grandparent.isFunction()` ทั้ง true/false |
| `testReference_functionNameNode_*`, `_catchDeclaration_*` | `DECLARATION_PARENTS` (FUNCTION, CATCH), `getAssignedValue()` ternary true-branch |
| `testReference_getParentAndGrandparent`, `_getGrandparent_nullWhenNoParent_*` | `getGrandparent()` ทั้ง parent!=null และ parent==null (boundary) |
| `testReference_getBasicBlock` | `getBasicBlock()` |
| `testIsWellDefined_*` (5 เมธอด) | `size==0`, `init==null`, loop `provablyExecutesBefore` true/false |
| `testIsEscaped_*` | empty + same-scope(null) false-branch (คอมเมนต์กำกับกรณี true-branch ที่ทดสอบไม่ได้) |
| `testIsNeverAssigned_*` (4 เมธอด) | empty, only-read, lvalue, initializing-declaration |
| `testIsAssignedOnceInLifetime_*` (5 เมธอด) | `getOneAndOnlyAssignment` null (0/2+), loop `isFunction` break, `isLoop` false-return, ลำดับความสำคัญ isFunction ก่อน isLoop |
| `testFirstReferenceIsAssigningDeclaration_*` (3 เมธอด) | empty, true, false |
| `testGetInitializingReference_*` (5 เมธอด) | index0 true, index1 true (`isInitializingAssignmentAt`), ไม่พบ (null), boundary-exception, `maybeDecl.isVarDeclaration()==false` |
| `testGetInitializingReferenceForConstants_*` (3 เมธอด) | empty(null ปลอดภัย ไม่ throw), พบใน index ท้าย ๆ, ไม่พบ |

**ข้อจำกัดที่เปิดเผยตามข้อกำหนด #4:** ไม่ได้ทดสอบ `process/visit/enterScope/exitScope` แบบ end-to-end และ `isEscaped()` true-branch เพราะต้องพึ่งพา `Compiler`/`NodeTraversal`/`Scope` ที่ constructor/behavior ภายในไม่มีอยู่ใน source ที่ให้มา จึงไม่ขอเดา behavior ดังกล่าว