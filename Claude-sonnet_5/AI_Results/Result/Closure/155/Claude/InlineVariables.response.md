# การวิเคราะห์และชุดทดสอบ InlineVariablesTest (Closure-155b)

## หมายเหตุสำคัญก่อนเริ่ม (ต้องอ่านก่อน)

`InlineVariables` เป็น **package-private class** ที่ทำงานผ่าน `process(Node, Node)` เพียงเมธอดเดียวที่เป็น public entry point ส่วน logic ทั้งหมด (canInline, isImmutableAndWellDefinedVariable, isStringWorthInlining ฯลฯ) เป็น **private method ภายใน private inner class** `InliningBehavior` ซึ่งไม่สามารถเรียกตรง ๆ จากเทสภายนอกได้

ดังนั้นวิธีทดสอบที่ตรงกับความเป็นจริงของ Defects4J-155b คือให้ Test class อยู่ใน package เดียวกัน (`com.google.javascript.jscomp`) และใช้ `CompilerTestCase` (ซึ่งเป็นส่วนหนึ่งของ **source tree เดียวกัน** ของ Closure Compiler ไม่ใช่ jar dependency ภายนอก จึง compile ได้พร้อมกับ `InlineVariables`, `Compiler`, `Scope`, `NodeTraversal` ฯลฯ ที่ระบุใน classpath ไม่มี) เป็นตัวช่วย parse JS → รัน pass → เทียบ AST/source output

`CompilerTestCase` extends `junit.framework.TestCase` ซึ่ง JUnit4 runner ยังรันได้ตามปกติ (backward compatible) จึงใช้ชื่อเมธอด `testXxx()` ควบคู่ `@Test` (เพื่อความชัดเจนเชิง JUnit4 แม้จะซ้ำซ้อนเล็กน้อย)

**บาง branch/behavior ไม่สามารถยืนยัน 100% เพราะพึ่งพา class ที่ไม่ได้แสดงในซอร์สที่ให้มา** (เช่น `Var.isConst()`, `ReferenceCollection`, `NodeIterators.LocalVarMotion`, `CodingConvention` default) — ได้ใส่คอมเมนต์กำกับไว้ทุกจุดตามข้อกำหนด

```java
package com.google.javascript.jscomp;

import com.google.javascript.jscomp.InlineVariables.Mode;
import org.junit.Test;

/**
 * ชุดทดสอบสำหรับ InlineVariables (Closure-155b)
 *
 * หมายเหตุด้านโครงสร้าง:
 * - InlineVariables เป็น package-private class, logic หลักเป็น private method
 *   ภายใน private class InliningBehavior จึงทดสอบผ่าน public entry point เดียวคือ
 *   process(Node,Node) โดยใช้ CompilerTestCase (อยู่ใน source tree เดียวกัน ไม่ใช่ jar
 *   dependency ภายนอกตามที่ระบุใน classpath) เป็นตัวช่วย parse -> run pass -> compare AST
 * - CompilerTestCase extends junit.framework.TestCase ซึ่งรันได้ปกติบน JUnit4 runner
 *   (ใส่ @Test เพิ่มเพื่อความชัดเจนตามข้อกำหนดข้อ 2)
 * - บางพฤติกรรม (Var.isConst(), NodeIterators.LocalVarMotion, CodingConvention default,
 *   ReferenceCollection internals) ไม่ได้แสดงใน source ที่ให้มา -> ใส่คอมเมนต์ระดับ
 *   ความมั่นใจ (confidence) กำกับไว้ในแต่ละเทสที่เกี่ยวข้อง
 */
public class InlineVariablesTest extends CompilerTestCase {

  private Mode mode;
  private boolean inlineAllStrings;

  public InlineVariablesTest() {
    super(""); // ไม่มี externs พิเศษที่จำเป็นสำหรับ pass นี้
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mode = Mode.ALL;
    inlineAllStrings = false;
  }

  @Override
  protected int getNumRepetitions() {
    // pass นี้แก้ AST ทีละรอบและอาจไม่ idempotent เต็มที่ (คล้าย pass อื่นที่ mutate AST)
    // จึงรันครั้งเดียวเพื่อความชัดเจนของผลลัพธ์ที่คาดหวัง
    return 1;
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new InlineVariables(compiler, mode, inlineAllStrings);
  }

  // =========================================================================
  // GROUP A: Mode.ALL - inlineNonConstants: branch แรก
  // (refCount > 1 && isImmutableAndWellDefinedVariable == true)
  // =========================================================================

  @Test
  public void testInline_singleRead_immutableLiteral() {
    // declaration == init, refCount = 2, value = 3 (immutable literal)
    // -> isImmutableAndWellDefinedVariable = true -> inlineWellDefinedVariable
    mode = Mode.ALL;
    test("var x = 3; y = x;", "y = 3;");
  }

  @Test
  public void testInline_multiRead_immutableLiteral() {
    // refCount = 3 > 1, value = 3 immutable, ทุก read เป็น valid reference
    // -> isImmutableAndWellDefinedVariable = true -> inline ทุก reference
    mode = Mode.ALL;
    test("var x = 3; bar(x); baz(x);", "bar(3); baz(3);");
  }

  @Test
  public void testNoInline_multiRead_mutableValue() {
    // value = foo() (CALL) -> NodeUtil.isImmutableValue = false, ไม่ใช่ THIS
    // -> isImmutableAndWellDefinedVariable = false
    // refCount(3) != firstRefAfterInit(2) และ declaration == init
    // -> ไม่มี branch ใดถูก execute -> ไม่มีการเปลี่ยนแปลง
    mode = Mode.ALL;
    testSame("var x = foo(); bar(x); baz(x);");
  }

  // =========================================================================
  // GROUP B: Mode.ALL - inlineNonConstants: branch ที่สอง (canInline heuristic)
  // เกิดเมื่อ isImmutableAndWellDefinedVariable = false แต่ refCount ==
  // firstRefAfterInit พอดี (การอ่านครั้งเดียว)
  // =========================================================================

  @Test
  public void testInline_singleRead_mutableValue_viaCanInline() {
    // ความมั่นใจ: กลาง (MEDIUM) - พึ่งพา canMoveModerately/NodeIterators.LocalVarMotion
    // ซึ่งไม่ได้แสดง implementation ในซอร์สที่ให้มา คาดว่า "var x=foo(); y=x;" ไม่มี
    // side-effect ระหว่าง init กับ reference จึงอนุญาตให้ inline ได้
    mode = Mode.ALL;
    test("var x = foo(); y = x;", "y = foo();");
  }

  @Test
  public void testNoInline_getPropIntoCallContext() {
    // value.getType() == GETPROP และ reference ถูกเรียกเป็น callee ของ CALL
    // -> canInline คืน false ตาม branch พิเศษ (ป้องกัน context ของ 'this' เปลี่ยน)
    // ความมั่นใจ: กลาง-สูง เพราะเป็น branch ที่เขียนไว้ชัดเจนในซอร์ส
    mode = Mode.ALL;
    testSame("var a = b.c; a();");
  }

  @Test
  public void testInline_getPropAsCallArgument() {
    // value เป็น GETPROP แต่ reference เป็น argument ไม่ใช่ callee
    // -> ไม่เข้า branch พิเศษด้านบน -> canMoveAggressively(isLiteralValue) น่าจะ true
    // สำหรับ property access แบบ pure -> inline ได้
    // ความมั่นใจ: กลาง
    mode = Mode.ALL;
    test("var a = b.c; f(a);", "f(b.c);");
  }

  // =========================================================================
  // GROUP C: Mode.ALL - declaration != init (ประกาศแยกจาก assignment)
  // =========================================================================

  @Test
  public void testInline_declSeparateFromInit_immutable_refCountTwo() {
    // declaration != init, refCount = 2, value = 3 (immutable)
    // -> isImmutableAndWellDefinedVariable = true (loop รอบอ่านค่าว่างเพราะไม่มี read เพิ่ม)
    // -> refCount(2) > 1 -> เข้า "branch แรก" (ไม่ใช่ branch ที่ 3 ตามที่อาจดูตอนแรก)
    // -> inlineWellDefinedVariable แปลง "x = 3;" เป็น expression เปล่า "3;" และลบ "var x;"
    mode = Mode.ALL;
    test("var x; x = 3;", "3;");
  }

  @Test
  public void testInline_declSeparateFromInit_mutable_refCountTwo() {
    // declaration != init, refCount = 2, value = foo() (mutable)
    // -> isImmutableAndWellDefinedVariable = false (ไม่ผ่าน immutable check)
    // -> refCount(2) != firstRefAfterInit(3) (เพราะ declaration != init)
    // -> ตกไป branch ที่ 3: declaration != init && refCount == 2
    //    -> isValidDeclaration && isValidInitialization -> inlineWellDefinedVariable
    mode = Mode.ALL;
    test("var x; x = foo();", "foo();");
  }

  @Test
  public void testInline_declSeparateFromInit_refCountThree_immutable() {
    // declaration != init, refCount = 3 (decl, init, read), value = 3 (immutable)
    // -> isImmutableAndWellDefinedVariable = true (read เดียวถูกต้อง)
    // -> เข้า "branch แรก" อีกครั้ง (ไม่ใช่ branch ที่ 2 ตามที่อาจคาดโดยสัญชาตญาณ)
    // -> inlineWellDefinedVariable แทนที่ทุก reference ตั้งแต่ index 1 เป็นต้นไป
    //    ทำให้ "x = 3;" กลายเป็น expression เปล่า "3;" ด้วย (ผลข้างเคียงที่ไม่ได้ "สวย"
    //    แต่สอดคล้องกับ logic ในซอร์ส)
    mode = Mode.ALL;
    test("var x; x = 3; y = x;", "3; y = 3;");
  }

  // =========================================================================
  // GROUP D: Mode.CONSTANTS_ONLY
  // =========================================================================

  @Test
  public void testConstantsOnly_inlinesAllCapsConstant() {
    // สมมติฐาน (ความมั่นใจ: กลาง): Var.isConst() คืน true สำหรับชื่อ ALL_CAPS
    // ตามคอมเมนต์ในซอร์ส "anything ... named in all caps" - ไม่เห็น implementation จริง
    mode = Mode.CONSTANTS_ONLY;
    test("var CONST = 3; alert(CONST);", "alert(3);");
  }

  @Test
  public void testConstantsOnly_doesNotInlineNonConstantName() {
    // ชื่อไม่ใช่ ALL_CAPS -> isConst() = false -> isInlineableDeclaredConstant = false
    // -> mode == CONSTANTS_ONLY -> continue -> ไม่มีการเปลี่ยนแปลง
    mode = Mode.CONSTANTS_ONLY;
    testSame("var x = 3; alert(x);");
  }

  @Test
  public void testConstantsOnly_noInlineWhenAssignedMultipleTimes() {
    // refInfo.isAssignedOnceInLifetime() = false (ถูก assign ซ้ำ)
    // -> isInlineableDeclaredConstant = false -> ไม่ inline
    // หมายเหตุ: กรณีนี้ผิด coding convention จริง (const ห้าม reassign) แต่ทดสอบ branch
    // ของ isAssignedOnceInLifetime() โดยตรงตามที่ปรากฏในซอร์ส
    mode = Mode.CONSTANTS_ONLY;
    testSame("var CONST = 3; CONST = 4; alert(CONST);");
  }

  @Test
  public void testConstantsOnly_shortStringWorthInlining() {
    // value.getType() == STRING, isStringWorthInlining():
    // len=1+2=3, refs=2 -> noInlineBytes=8+3+4=15, inlineBytes=(3-1)*1=2 -> 15>=2 true
    mode = Mode.CONSTANTS_ONLY;
    test("var CONST = 'a'; alert(CONST);", "alert('a');");
  }

  @Test
  public void testConstantsOnly_longStringNotWorthInlining() {
    // สตริงยาว ใช้หลายครั้ง -> noInlineBytes < inlineBytes -> isStringWorthInlining false
    // -> isInlineableDeclaredConstant false -> ไม่ inline
    mode = Mode.CONSTANTS_ONLY;
    String s = "'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'";
    testSame(
        "var CONST = " + s + ";"
        + "f1(CONST); f2(CONST); f3(CONST); f4(CONST); f5(CONST);");
  }

  @Test
  public void testConstantsOnly_inlineAllStringsFlagForcesInline() {
    // inlineAllStrings = true -> isStringWorthInlining คืน true ทันที (ข้าม heuristic)
    mode = Mode.CONSTANTS_ONLY;
    inlineAllStrings = true;
    String s = "'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'";
    test(
        "var CONST = " + s + ";"
        + "f1(CONST); f2(CONST); f3(CONST); f4(CONST); f5(CONST);",
        "f1(" + s + "); f2(" + s + "); f3(" + s + "); "
        + "f4(" + s + "); f5(" + s + ");");
  }

  @Test
  public void testConstantsOnly_valueNotImmutable_notInlined() {
    // value = foo() -> NodeUtil.isImmutableValue = false -> isInlineableDeclaredConstant false
    mode = Mode.CONSTANTS_ONLY;
    testSame("var CONST = foo(); alert(CONST);");
  }

  @Test
  public void testConstantsOnlyMode_continueBranch_onNonConstVar() {
    // ทดสอบ branch "else if (mode == Mode.CONSTANTS_ONLY) { continue; }" โดยตรง:
    // ในโหมด ALL ตัวแปรนี้จะถูก inline ได้ (ดู group A) แต่ในโหมด CONSTANTS_ONLY ต้องไม่ inline
    mode = Mode.CONSTANTS_ONLY;
    testSame("var x = 3; y = x;");
  }

  // =========================================================================
  // GROUP E: Mode.LOCALS_ONLY (getFilterForMode -> IdentifyLocals)
  // =========================================================================

  @Test
  public void testLocalsOnly_inlinesLocalVariable() {
    // var.scope.isLocal() == true -> ผ่าน filter -> ถูกเก็บใน referenceMap -> inline ได้
    mode = Mode.LOCALS_ONLY;
    test(
        "function f() { var x = 3; return x; }",
        "function f() { return 3; }");
  }

  @Test
  public void testLocalsOnly_doesNotInlineGlobalVariable() {
    // ตัวแปร global -> isLocal() == false -> ถูกกรองออกจาก referenceMap
    // -> ใน doInlinesForScope: referenceInfo == null -> continue -> ไม่ inline
    mode = Mode.LOCALS_ONLY;
    testSame("var g = 3; alert(g);");
  }

  // =========================================================================
  // GROUP F: ค่าขอบเขต / ว่าง / โครงสร้างพิเศษ
  // =========================================================================

  @Test
  public void testEmptyProgram_noException() {
    // ไม่มีตัวแปรใด ๆ -> ไม่ throw exception, ไม่มีการเปลี่ยนแปลง
    mode = Mode.ALL;
    testSame("");
  }

  @Test
  public void testNoVars_onlyFunctionCalls() {
    // ไม่มี var declaration เลย -> ไม่มี scope var ให้ประมวลผล
    mode = Mode.ALL;
    testSame("alert('hi'); foo();");
  }

  @Test
  public void testNoInline_declarationOnly_neverUsed() {
    // referenceInfo.references.size() == 1 (มีแต่ declaration, ไม่มี read/write เพิ่ม)
    // -> ไม่มี branch ใดใน inlineNonConstants ถูก execute -> ไม่มีการเปลี่ยนแปลง
    mode = Mode.ALL;
    testSame("var x;");
  }

  @Test
  public void testEdgeCase_selfReferencingInitializer_noException() {
    // ความมั่นใจ: ต่ำ (LOW) - ไม่ยืนยัน exact output แต่ตรวจว่า pass ไม่ throw exception
    // กับ input ที่ syntax ถูกต้องแต่ semantic แปลก (ตัวแปรอ้างถึงตัวเองตอน initialize)
    mode = Mode.ALL;
    testSame("var x = x;");
  }
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| กลุ่ม | เมธอดเทส | Branch/Condition ที่ครอบคลุม | ระดับความมั่นใจ |
|---|---|---|---|
| A | testInline_singleRead_immutableLiteral | `refCount>1 && isImmutableAndWellDefinedVariable==true` (value immutable, declaration==init) | สูง |
| A | testInline_multiRead_immutableLiteral | เหมือนบน แต่ loop ตรวจ multiple read references | สูง |
| A | testNoInline_multiRead_mutableValue | `isImmutableAndWellDefinedVariable==false` (value=CALL ไม่ immutable), ไม่มี branch ใดถูกเรียก | สูง |
| B | testInline_singleRead_mutableValue_viaCanInline | branch ที่ 2: `refCount==firstRefAfterInit`, `canInline`→`canMoveModerately` (VAR parent path) | กลาง (พึ่ง NodeIterators ที่ไม่มีใน source) |
| B | testNoInline_getPropIntoCallContext | `canInline`: GETPROP+CALL callee → return false | กลาง-สูง |
| B | testInline_getPropAsCallArgument | `canInline`: GETPROP เป็น argument → ไม่เข้า branch พิเศษ, `canMoveAggressively` | กลาง |
| C | testInline_declSeparateFromInit_immutable_refCountTwo | declaration!=init, refCount=2, เข้า branch แรก (immutable), `inlineWellDefinedVariable` | กลาง-สูง |
| C | testInline_declSeparateFromInit_mutable_refCountTwo | branch ที่ 3: `declaration!=init && refCount==2`, `isValidDeclaration/isValidInitialization` | สูง |
| C | testInline_declSeparateFromInit_refCountThree_immutable | branch แรกอีกครั้งกับ refCount=3, startingReadRef=2 ใน isImmutableAndWellDefinedVariable | กลาง |
| D | testConstantsOnly_inlinesAllCapsConstant | `getFilterForMode()`=CONSTANTS_ONLY, `isInlineableDeclaredConstant`=true, `inlineDeclaredConstant` | กลาง |
| D | testConstantsOnly_doesNotInlineNonConstantName | `identifyConstants.apply(var)`=false → return false ต้น isInlineableDeclaredConstant | กลาง |
| D | testConstantsOnly_noInlineWhenAssignedMultipleTimes | `!refInfo.isAssignedOnceInLifetime()` → return false | สูง |
| D | testConstantsOnly_shortStringWorthInlining | `isStringWorthInlining`: noInlineBytes>=inlineBytes true | กลาง |
| D | testConstantsOnly_longStringNotWorthInlining | `isStringWorthInlining`: noInlineBytes<inlineBytes false | กลาง |
| D | testConstantsOnly_inlineAllStringsFlagForcesInline | `!inlineAllStrings && !var.isDefine()` = false (inlineAllStrings=true) → return true ทันที | กลาง |
| D | testConstantsOnly_valueNotImmutable_notInlined | `!NodeUtil.isImmutableValue(value)` → return false | กลาง |
| D | testConstantsOnlyMode_continueBranch_onNonConstVar | `else if (mode == Mode.CONSTANTS_ONLY) continue;` | สูง |
| E | testLocalsOnly_inlinesLocalVariable | `getFilterForMode()`=LOCALS_ONLY, `IdentifyLocals.apply`=true | กลาง-สูง |
| E | testLocalsOnly_doesNotInlineGlobalVariable | `IdentifyLocals.apply`=false → `referenceInfo==null` → continue | กลาง-สูง |
| F | testEmptyProgram_noException | ค่าว่าง (empty program), ไม่มี Var เลย | สูง |
| F | testNoVars_onlyFunctionCalls | ไม่มี var declaration | สูง |
| F | testNoInline_declarationOnly_neverUsed | `refCount==1`, ไม่มี branch ใน inlineNonConstants ถูกเข้า | สูง |
| F | testEdgeCase_selfReferencingInitializer_noException | อินพุตผิดปกติทาง semantic (boundary/มัลฟอร์มเชิง logic) — ตรวจไม่ throw | ต่ำ |

### จุดที่ไม่ได้ครอบคลุม (พร้อมเหตุผล)
- `getFilterForMode()` default case (`throw IllegalStateException`) — unreachable ผ่าน public API เพราะ enum `Mode` มีแค่ 3 ค่า ต้องใช้ reflection ถึงจะ trigger ได้ ไม่ได้ทำเพราะไม่อยู่ใน behavior ที่ระบุชัดในซอร์ส
- `isVarInlineForbidden` (isExported, RENAME_PROPERTY_FUNCTION_NAME) — ขึ้นกับ `CodingConvention` ที่ไม่ได้แสดง implementation ในซอร์สที่ให้มา จึงไม่กล้าเดา behavior
- alias-candidate inlining (`collectAliasCandidates` + alias loop ใน `inlineNonConstants`) — ซับซ้อนมากและพึ่งพา `ReferenceCollection` internals ที่ไม่มีในซอร์ส จึงงดเขียนเทสที่ assert ผลลัพธ์เฉพาะเจาะจง เพื่อไม่ละเมิดข้อกำหนดข้อ 4
- `canMoveModerately` ฝั่ง `ASSIGN` parent และ `IllegalStateException` (unexpected initialization parent) — พึ่งพา `NodeIterators.LocalVarMotion` ที่ไม่มีใน source ที่ให้มา