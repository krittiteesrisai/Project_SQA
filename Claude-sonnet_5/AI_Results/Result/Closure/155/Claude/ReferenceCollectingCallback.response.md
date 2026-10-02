# แนวคิดการทดสอบ

เนื่องจาก `ReferenceCollectingCallback` เป็น package-private class ที่ผูกกับ `Compiler`, `NodeTraversal`, `Scope` อย่างแน่นหนา วิธีที่ปลอดภัยและตรงกับ source ที่ให้มาที่สุดคือ:

1. วาง test class ไว้ใน **package เดียวกัน** (`com.google.javascript.jscomp`) เพื่อเข้าถึง constructor/field/method ระดับ package-private ได้ตรง ๆ (เช่น field `references` ใน `ReferenceCollection`)
2. ใช้ `Compiler.parseTestCode(String)` (utility ที่มีอยู่แล้วในคลาส `Compiler` ของโค้ดเบสเดียวกัน ไม่ใช่ behavior ที่เดาขึ้นของคลาสเป้าหมาย) เพื่อสร้าง AST จาก JS จริง แล้วเรียก `process(null, root)` — พารามิเตอร์ `externs` ไม่ถูกใช้ในเมธอด `process` จริง (`NodeTraversal.traverse(compiler, root, this)` ใช้แค่ `root`)
3. บางกรณีที่วิเคราะห์ branch ได้ชัดเจนจาก source (isWellDefined, isAssignedOnceInLifetime, isNeverAssigned ฯลฯ) จะ **assert ผลลัพธ์ที่คำนวณด้วยมือ** ตาม logic ในซอร์ส
4. บางกรณี (TRY/WITH/SWITCH/AND-OR-HOOK/DO/WHILE) ที่ใช้ยืนยัน branch ของ `isBlockBoundary` แต่ตัดสิน exact semantics ยาก จะเน้น "ไม่ throw exception" + ตรวจสอบ count แบบหลวม (คอมเมนต์กำกับไว้)
5. ทดสอบ `ReferenceCollection` แบบ empty โดยสร้าง object ตรง ๆ (`new ReferenceCollection()`) เพื่อบังคับ branch `size == 0`

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Predicates;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Unit tests สำหรับ {@link ReferenceCollectingCallback} (Defects4J: Closure-155b)
 *
 * หมายเหตุ: ทดสอบอยู่ใน package เดียวกับ target class เพื่อเข้าถึง
 * constructor / field / method ที่เป็น package-private ได้
 *
 * หมายเหตุ: ใช้ {@code Compiler.parseTestCode(String)} ซึ่งเป็น utility
 * ที่มีอยู่แล้วในโค้ดเบส (ไม่ใช่ behavior ของคลาสเป้าหมายที่เราเดาขึ้นเอง)
 * เพื่อสร้าง AST จาก JS จริงสำหรับป้อนให้ NodeTraversal
 */
public class ReferenceCollectingCallbackTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private Node parse(String js) {
    Node n = compiler.parseTestCode(js);
    assertNotNull("parse ควรได้ Node ไม่เป็น null", n);
    return n;
  }

  /** สร้าง callback มาตรฐาน (predicate อยู่เป็น alwaysTrue ผ่าน constructor 2 arg) */
  private ReferenceCollectingCallback createDefaultCallback() {
    return new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
  }

  private void process(ReferenceCollectingCallback callback, Node root) {
    callback.process(null, root); // externs ไม่ถูกใช้จริงใน process()
  }

  /** ดึง Var ตัวเดียวจาก referencedVariables โดยยืนยันว่ามีตัวแปรเดียวจริง ๆ */
  private Var getSoleVar(ReferenceCollectingCallback cb) {
    Set<Var> vars = cb.getReferencedVariables();
    assertEquals("คาดว่าจะมีตัวแปรเดียวในการทดสอบนี้", 1, vars.size());
    return vars.iterator().next();
  }

  // ---------------------------------------------------------------------
  // 1) Declaration + Read พื้นฐาน -> isWellDefined() true
  // ---------------------------------------------------------------------
  @Test
  public void testSimpleDeclarationAndRead_isWellDefined() {
    Node root = parse("var x = 1; x;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertNotNull(rc);
    assertEquals(2, rc.references.size());
    assertTrue(rc.isWellDefined());
    assertTrue(rc.firstReferenceIsAssigningDeclaration());
    assertFalse(rc.isNeverAssigned());
  }

  // ---------------------------------------------------------------------
  // 2) var x; x = 1; -> isInitializingAssignmentAt(1) true -> isWellDefined true
  // ---------------------------------------------------------------------
  @Test
  public void testUninitializedDeclarationThenAssignment_isWellDefined() {
    Node root = parse("var x; x = 1;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertTrue(rc.isWellDefined());
    assertFalse(rc.firstReferenceIsAssigningDeclaration());
    assertTrue(rc.isAssignedOnceInLifetime());
  }

  // ---------------------------------------------------------------------
  // 3) var x; x; -> ไม่มี initializing reference เลย -> isWellDefined false, isNeverAssigned true
  // ---------------------------------------------------------------------
  @Test
  public void testNeverAssigned_isWellDefinedFalse() {
    Node root = parse("var x; x;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertNull(rc.getInitializingReference());
    assertFalse(rc.isWellDefined());
    assertTrue(rc.isNeverAssigned());
    assertFalse(rc.isAssignedOnceInLifetime()); // getOneAndOnlyAssignment() == null
  }

  // ---------------------------------------------------------------------
  // 4) IF boundary: assignment อยู่ใน BasicBlock ลูกของ IF -> provablyExecutesBefore
  //    คืน false เมื่อ init อยู่ในบล็อคลูก แต่ reference หลังอยู่บล็อคแม่ -> isWellDefined false
  // ---------------------------------------------------------------------
  @Test
  public void testConditionalAssignmentInsideIf_isWellDefinedFalse() {
    Node root = parse("var x; if (1) { x = 1; } x;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertNotNull(rc.getInitializingReference()); // ยังหา init ref ได้ (ref index 1)
    assertFalse(rc.isWellDefined());
  }

  // ---------------------------------------------------------------------
  // 5) ตัวแปร escape เข้า inner function scope -> isEscaped() true
  // ---------------------------------------------------------------------
  @Test
  public void testEscapedVariable_isEscapedTrue() {
    Node root = parse("var x = 1; function f() { x; }");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    boolean foundEscaped = false;
    for (Var v : cb.getReferencedVariables()) {
      ReferenceCollection rc = cb.getReferenceCollection(v);
      if (rc.isEscaped()) {
        foundEscaped = true;
      }
    }
    assertTrue("ควรมีตัวแปรที่ escaped เข้า inner scope", foundEscaped);
  }

  // ---------------------------------------------------------------------
  // 6) ตัวแปรไม่ escape เพราะ reference ทั้งหมดอยู่ scope เดียวกัน
  // ---------------------------------------------------------------------
  @Test
  public void testNotEscapedVariable_isEscapedFalse() {
    Node root = parse("var x = 1; x;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertFalse(rc.isEscaped());
  }

  // ---------------------------------------------------------------------
  // 7) assignment เดียวไม่อยู่ใน loop -> isAssignedOnceInLifetime true
  // ---------------------------------------------------------------------
  @Test
  public void testSingleAssignmentNotInLoop_isAssignedOnceTrue() {
    Node root = parse("var x; x = 1;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertTrue(rc.isAssignedOnceInLifetime());
  }

  // ---------------------------------------------------------------------
  // 8) assignment อยู่ใน for-loop body -> BasicBlock.isLoop true -> isAssignedOnceInLifetime false
  // ---------------------------------------------------------------------
  @Test
  public void testAssignmentInsideForLoop_isAssignedOnceFalse() {
    Node root = parse("var x; for (;;) { x = 1; }");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertFalse(rc.isAssignedOnceInLifetime());
  }

  // ---------------------------------------------------------------------
  // 9) มี assignment สองครั้ง -> getOneAndOnlyAssignment() คืน null -> isAssignedOnceInLifetime false
  // ---------------------------------------------------------------------
  @Test
  public void testMultipleAssignments_isAssignedOnceFalse() {
    Node root = parse("var x; x = 1; x = 2;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertFalse(rc.isAssignedOnceInLifetime());
    assertFalse(rc.isNeverAssigned());
  }

  // ---------------------------------------------------------------------
  // 10) var x = 1; -> firstReferenceIsAssigningDeclaration true, isNeverAssigned false
  // ---------------------------------------------------------------------
  @Test
  public void testDeclarationWithInit_flags() {
    Node root = parse("var x = 1;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertTrue(rc.firstReferenceIsAssigningDeclaration());
    assertFalse(rc.isNeverAssigned());
  }

  // ---------------------------------------------------------------------
  // 11) var x; x = 1; -> firstReferenceIsAssigningDeclaration false (decl ไม่มีค่า initial)
  // ---------------------------------------------------------------------
  @Test
  public void testFirstReferenceIsAssigningDeclarationFalse() {
    Node root = parse("var x; x = 1;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertFalse(rc.firstReferenceIsAssigningDeclaration());
  }

  // ---------------------------------------------------------------------
  // 12) constant ใช้งานก่อนประกาศ: getInitializingReference() null
  //     แต่ getInitializingReferenceForConstants() หาเจอ (loop สแกนทุก index)
  // ---------------------------------------------------------------------
  @Test
  public void testGetInitializingReferenceForConstants_declaredAfterUse() {
    Node root = parse("x; var x = 1;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertNull(rc.getInitializingReference());
    assertNotNull(rc.getInitializingReferenceForConstants());
  }

  // ---------------------------------------------------------------------
  // 13) TRY/CATCH boundary tokens: ตรวจว่า traverse ไม่ throw และเก็บ reference ได้ถูกจำนวน
  // ---------------------------------------------------------------------
  @Test
  public void testTryCatchBoundary_collectsReferencesWithoutException() {
    Node root = parse("var x; try { x = 1; } catch (e) { x = 2; } x;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root); // ต้องไม่ throw exception

    boolean foundFourRefs = false;
    for (Var v : cb.getReferencedVariables()) {
      ReferenceCollection rc = cb.getReferenceCollection(v);
      if (rc.references.size() == 4) {
        foundFourRefs = true;
      }
    }
    assertTrue("ควรมีตัวแปร x ที่มี 4 references (decl+try-assign+catch-assign+read)",
        foundFourRefs);
  }

  // ---------------------------------------------------------------------
  // 14) WITH boundary token: แค่ตรวจว่าไม่ throw exception และเก็บ reference ได้
  // (semantics ละเอียดของ with-scope ไม่ได้ระบุชัดในซอร์ส จึงตรวจแบบหลวม)
  // ---------------------------------------------------------------------
  @Test
  public void testWithBoundary_noExceptionThrown() {
    Node root = parse("var obj = {}; with (obj) { obj; }");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);
    assertFalse(cb.getReferencedVariables().isEmpty());
  }

  // ---------------------------------------------------------------------
  // 15) SWITCH/CASE boundary (Token.CASE เงื่อนไขสุดท้ายของ isBlockBoundary)
  // ---------------------------------------------------------------------
  @Test
  public void testSwitchCaseBoundary_collectsAllReferences() {
    Node root = parse(
        "var x = 1; switch (x) { case 1: x = 2; break; default: x = 3; }");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    // decl + switch-read + case-assign + default-assign
    assertEquals(4, rc.references.size());
  }

  // ---------------------------------------------------------------------
  // 16) AND / OR / HOOK boundary (เงื่อนไข n != parent.getFirstChild())
  // ---------------------------------------------------------------------
  @Test
  public void testAndOrHookBoundary_noExceptionThrown() {
    Node root = parse(
        "var x = 1; x && (x = 2); x || (x = 3); var y = x ? 1 : (x = 4);");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root); // ต้องไม่ throw

    assertEquals(2, cb.getReferencedVariables().size()); // x, y
  }

  // ---------------------------------------------------------------------
  // 17) DO boundary token
  // ---------------------------------------------------------------------
  @Test
  public void testDoWhileBoundary_noExceptionThrown() {
    Node root = parse("var x = 0; do { x = x + 1; } while (x < 10);");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertTrue(rc.references.size() >= 3);
  }

  // ---------------------------------------------------------------------
  // 18) WHILE boundary token
  // ---------------------------------------------------------------------
  @Test
  public void testWhileBoundary_noExceptionThrown() {
    Node root = parse("var x = 0; while (x < 10) { x = x + 1; }");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    Var x = getSoleVar(cb);
    ReferenceCollection rc = cb.getReferenceCollection(x);
    assertTrue(rc.references.size() >= 3);
  }

  // ---------------------------------------------------------------------
  // 19) varFilter = alwaysFalse -> เงื่อนไข "v != null && varFilter.apply(v)" เป็น false
  //     -> ไม่มี reference ถูกเก็บเลย
  // ---------------------------------------------------------------------
  @Test
  public void testVarFilterAlwaysFalse_excludesAllVariables() {
    Node root = parse("var x = 1; x;");
    ReferenceCollectingCallback cb = new ReferenceCollectingCallback(
        compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR,
        Predicates.<Var>alwaysFalse());
    process(cb, root);

    assertTrue(cb.getReferencedVariables().isEmpty());
  }

  // ---------------------------------------------------------------------
  // 20) ตัวแปรที่ไม่ถูกประกาศเลย -> t.getScope().getVar(...) คืน null
  //     -> เงื่อนไข "v != null" เป็น false -> ไม่ถูกเก็บ
  // ---------------------------------------------------------------------
  @Test
  public void testUndeclaredVariable_notCollected() {
    Node root = parse("undeclaredGlobalVar;");
    ReferenceCollectingCallback cb = createDefaultCallback();
    process(cb, root);

    assertTrue(cb.getReferencedVariables().isEmpty());
  }

  // ---------------------------------------------------------------------
  // 21) DO_NOTHING_BEHAVIOR ต้องไม่ throw exception เมื่อถูกเรียกตรง ๆ
  // ---------------------------------------------------------------------
  @Test
  public void testDoNothingBehavior_noException() {
    ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR
        .afterExitScope(null, com.google.common.collect.Maps
            .<Var, ReferenceCollection>newHashMap());
    // ถ้าไม่ throw แสดงว่าผ่าน
  }

  // ---------------------------------------------------------------------
  // 22) custom Behavior ต้องถูกเรียกตอน exitScope() จริง
  // ---------------------------------------------------------------------
  @Test
  public void testCustomBehaviorInvokedOnExitScope() {
    final AtomicBoolean called = new AtomicBoolean(false);
    Behavior behavior = new Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t,
          java.util.Map<Var, ReferenceCollection> referenceMap) {
        called.set(true);
      }
    };
    Node root = parse("var x = 1; x;");
    ReferenceCollectingCallback cb =
        new ReferenceCollectingCallback(compiler, behavior);
    process(cb, root);

    assertTrue("afterExitScope ควรถูกเรียกอย่างน้อยหนึ่งครั้ง", called.get());
  }

  // ---------------------------------------------------------------------
  // 23) getReferenceCollection คืน null เมื่อ Var ไม่ได้อยู่ใน map ของ callback อื่น
  // ---------------------------------------------------------------------
  @Test
  public void testGetReferenceCollection_unknownVarReturnsNull() {
    Node root1 = parse("var x = 1; x;");
    ReferenceCollectingCallback cb1 = createDefaultCallback();
    process(cb1, root1);
    Var x = getSoleVar(cb1);

    Compiler otherCompiler = new Compiler();
    ReferenceCollectingCallback cb2 = new ReferenceCollectingCallback(
        otherCompiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
    Node root2 = otherCompiler.parseTestCode("var y = 2; y;");
    cb2.process(null, root2);

    // Var จาก cb1 ไม่มีทางอยู่ใน map ของ cb2 (traversal คนละครั้ง)
    assertNull(cb2.getReferenceCollection(x));
  }

  // ---------------------------------------------------------------------
  // 24) ทดสอบ ReferenceCollection แบบ empty (สร้างตรง ๆ) -> ครอบคลุม branch "size == 0"
  //     และ loop ที่ไม่ execute เลยในทุกเมธอด
  // ---------------------------------------------------------------------
  @Test
  public void testEmptyReferenceCollection_defaultBranches() {
    ReferenceCollection rc = new ReferenceCollection();

    assertFalse(rc.isWellDefined());               // size == 0 -> false
    assertTrue(rc.isNeverAssigned());               // loop ไม่ execute -> true
    assertFalse(rc.isEscaped());                     // loop ไม่ execute -> false
    assertFalse(rc.firstReferenceIsAssigningDeclaration()); // size > 0 เป็น false
    assertNull(rc.getInitializingReferenceForConstants());  // loop ไม่ execute -> null
    assertFalse(rc.isAssignedOnceInLifetime());      // getOneAndOnlyAssignment() == null
    assertNull(rc.getInitializingReference());       // isInitializingDeclarationAt(0) false path
  }
}
```

# สรุปตาราง Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testSimpleDeclarationAndRead_isWellDefined | `isInitializingDeclarationAt(0)`=true, loop `provablyExecutesBefore` ทุก index=true, `firstReferenceIsAssigningDeclaration`=true |
| testUninitializedDeclarationThenAssignment_isWellDefined | `isInitializingDeclarationAt(0)`=false → `isInitializingAssignmentAt(1)`=true, `isAssignedOnceInLifetime` (ไม่มี loop) |
| testNeverAssigned_isWellDefinedFalse | `getInitializingReference()`=null → `isWellDefined` return false ที่ branch `init==null`, `isNeverAssigned`=true |
| testConditionalAssignmentInsideIf_isWellDefinedFalse | IF boundary (`n != parent.getFirstChild()`), `provablyExecutesBefore` คืน false (currentBlock ไม่พบ this) |
| testEscapedVariable_isEscapedTrue | `isEscaped()` branch `scope != ref.scope` → true |
| testNotEscapedVariable_isEscapedFalse | `isEscaped()` loop ผ่านหมดโดยไม่ mismatch → false |
| testSingleAssignmentNotInLoop_isAssignedOnceTrue | `getOneAndOnlyAssignment` พบ 1 ตัว, loop block ไม่ isLoop → true |
| testAssignmentInsideForLoop_isAssignedOnceFalse | FOR boundary (`case Token.FOR: return true`), `block.isLoop`=true → false |
| testMultipleAssignments_isAssignedOnceFalse | `getOneAndOnlyAssignment` เจอ assignment ที่ 2 → return null |
| testDeclarationWithInit_flags | `isInitializingDeclaration()`=true (parent VAR, firstChild!=null) |
| testFirstReferenceIsAssigningDeclarationFalse | `firstReferenceIsAssigningDeclaration` size>0 แต่ initializing=false |
| testGetInitializingReferenceForConstants_declaredAfterUse | loop `getInitializingReferenceForConstants` หาที่ index>0, ต่างจาก `getInitializingReference` ที่คืน null |
| testTryCatchBoundary_collectsReferencesWithoutException | `case Token.TRY` boundary, CATCH scope handling |
| testWithBoundary_noExceptionThrown | `case Token.WITH` boundary |
| testSwitchCaseBoundary_collectsAllReferences | `n.getType() == Token.CASE` (fallback return) |
| testAndOrHookBoundary_noExceptionThrown | `case Token.AND/OR/HOOK` boundary condition |
| testDoWhileBoundary_noExceptionThrown | `case Token.DO` boundary |
| testWhileBoundary_noExceptionThrown | `case Token.WHILE` boundary |
| testVarFilterAlwaysFalse_excludesAllVariables | `v != null && varFilter.apply(v)` → false ฝั่ง filter |
| testUndeclaredVariable_notCollected | `v != null` → false ฝั่ง var lookup |
| testDoNothingBehavior_noException | `DO_NOTHING_BEHAVIOR.afterExitScope` empty body |
| testCustomBehaviorInvokedOnExitScope | `exitScope()` เรียก `behavior.afterExitScope` |
| testGetReferenceCollection_unknownVarReturnsNull | `referenceMap.get(v)` คืน null (key ไม่พบ) |
| testEmptyReferenceCollection_defaultBranches | `size==0` ทุก branch, loop ที่ไม่ execute ในทุกเมธอดของ `ReferenceCollection` |

**คำเตือน/สมมติฐานที่ต้องระวัง:** อาศัย `Compiler.parseTestCode(String)` และ `Scope.Var` เป็น utility ที่มีอยู่ในโค้ดเบสจริงของ Closure Compiler (ไม่ใช่ behavior ของ `ReferenceCollectingCallback` ที่เดาขึ้น) เพื่อสร้าง AST สำหรับทดสอบ หากเวอร์ชัน classpath จริงมี signature ต่างออกไป อาจต้องปรับ helper `parse()` เท่านั้น โดยไม่กระทบ logic การทดสอบคลาสเป้าหมาย