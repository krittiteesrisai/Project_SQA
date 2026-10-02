# หมายเหตุสำคัญก่อนโค้ด (ตามข้อกำหนดที่ 4)

`InlineVariables` เป็นคลาส **package-private** ที่ทำงานผ่าน `ReferenceCollectingCallback` ซึ่งต้องมี `Scope`, `Var`, และ `NodeTraversal` ที่สร้างจริงจากการ parse โค้ด JS — ไม่สามารถ mock ได้ง่ายด้วย library ที่กำหนด (guava/junit/…) เพียงอย่างเดียว
วิธีทดสอบที่ถูกต้องและตรงกับที่โปรเจกต์ Closure Compiler ใช้จริงคือการเขียนคลาสทดสอบไว้ใน **package เดียวกัน** (`com.google.javascript.jscomp`) แล้ว extend `CompilerTestCase` (คลาส test-infrastructure ที่มาพร้อมกับ source ของโปรเจกต์เอง ไม่ใช่ third-party jar จึงไม่ขัดกับข้อกำหนดเรื่อง classpath) ซึ่งมีเมธอด `test(js, expected)` / `testSame(js)` ที่ parse แล้วเทียบ AST (ไม่ใช่เทียบ string ตรง ๆ) ทำให้ทดสอบ behavior ของ pass ได้แม่นยำโดยไม่ผูกกับรูปแบบการ print โค้ด

**สมมติฐาน/ความไม่แน่ใจที่ต้องกำกับไว้ (ไม่มีอยู่ใน source ที่ให้มา):**
- พฤติกรรมจริงของ `Var.isConst()`, `ReferenceCollection.isWellDefined()/isAssignedOnceInLifetime()`, `CodingConvention` default (isExported, getClassesDefinedByCall, getSingletonGetterClassName) ไม่ได้แสดงใน source ที่ให้ — ผมจึงตั้งกรณีทดสอบให้สอดคล้องกับ logic ที่ **อ่านได้จาก source ที่ให้มาเท่านั้น** และคอมเมนต์ไว้ในจุดที่ต้องอิงพฤติกรรม class อื่นที่ไม่เห็น source
- ไม่เรียก `enableNormalize()` เพราะไม่มีหลักฐานจาก source ที่ให้ว่าจำเป็น
- Branch ที่พึ่งพา `extern` variable, `RENAME_PROPERTY_FUNCTION_NAME`, function-inlining ผ่าน `CodingConvention.isInlinableFunction` ถูก**ข้าม**เพราะไม่มีข้อมูลพอจะยืนยัน expected output ได้แน่ชัด (กันการเดา behavior)

```java
package com.google.javascript.jscomp;

/**
 * JUnit4-compatible test (runs under JUnit's TestCase-detection) for InlineVariables.
 *
 * ใช้ CompilerTestCase (อยู่ใน source tree เดียวกันกับ target class, ไม่ใช่ third-party jar)
 * เพราะ InlineVariables เป็น package-private และพึ่งพา Scope/Var/ReferenceCollectingCallback
 * ที่ต้องสร้างจากการ compile/parse จริงเท่านั้น
 */
public class InlineVariablesTest extends CompilerTestCase {

  private InlineVariables.Mode mode;
  private boolean inlineAllStrings;

  public InlineVariablesTest() {
    super(""); // ไม่ใช้ externs พิเศษ - เคสทดสอบทั้งหมดใช้ global function ที่ไม่ต้องประกาศ extern
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mode = InlineVariables.Mode.ALL;
    inlineAllStrings = false;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new InlineVariables(compiler, mode, inlineAllStrings);
  }

  // ---------- Boundary / basic inlining (refCount == firstRefAfterInit) ----------

  public void testInlineSimpleLiteral() {
    test("var x = 1; f(x);", "f(1);");
  }

  public void testUnusedVariableNotTouched() {
    // refCount = 1 (แค่ declaration) -> ไม่มี branch ใดใน inlineNonConstants ถูกเข้า
    // และ loop ท้าย (alias) ต้อง iterate 0 รอบ (boundary ของ for i=1;i<refs.size())
    testSame("var x = 1;");
  }

  public void testEmptyScript() {
    // boundary: ไม่มี scope/var เลย -> loop ของ getVars() ต้องไม่ throw
    testSame("");
  }

  // ---------- refCount > 1 && isImmutableAndWellDefinedVariable ----------

  public void testInlineImmutableUsedMultipleTimes() {
    test("var x = 1; f(x); g(x);", "f(1); g(1);");
  }

  public void testNoInlineWhenReassigned() {
    // isNeverAssigned() = false -> isImmutableAndWellDefinedVariable = false
    // และ isAssignedOnceInLifetime() = false -> alias-block ท้ายก็ไม่ทำงาน
    testSame("var x = 1; x = 2; f(x);");
  }

  public void testDuplicateVarDeclarations() {
    // อินพุตแปลก ๆ (รูปแบบซ้ำ) แต่ valid syntax - เทียบเท่า reassignment
    testSame("var x = 1; var x = 2; f(x);");
  }

  // ---------- isValidDeclaration (for-loop var ต้อง false) ----------

  public void testNoInlineForLoopVar() {
    // declaration.getGrandparent().isFor() == true -> isValidDeclaration = false
    testSame("for (var i = 0; i < 10; i++) { f(i); }");
  }

  // ---------- canInline: cross basic block ----------

  public void testNoInlineAcrossBasicBlocks() {
    // declaration/basicBlock != reference/basicBlock (อยู่ใน if-block)
    testSame("var x = 1; if (cond) { f(x); }");
  }

  // ---------- canInline: GetProp เข้า call-target ----------

  public void testNoInlineGetPropIntoCallContext() {
    // value.isGetProp() && reference เป็น callee ของ CALL -> return false
    testSame("var a = b.c; a();");
  }

  public void testInlineGetPropAsArgument() {
    // value เป็น GetProp แต่ reference ไม่ใช่ callee (เป็น argument) -> ผ่าน check นี้
    // แล้วไปที่ canMoveModerately (ไม่มี side-effect node คั่นกลาง)
    test("var a = b.c; f(a);", "f(b.c);");
  }

  // ---------- isValidReference: lvalue ----------

  public void testNoInlineWhenReferenceIsLvalue() {
    // reference คือ x ใน "x = f()" -> isLvalue == true -> isValidReference == false
    testSame("var x = 1; x = f();");
  }

  // ---------- declaration != init && refCount == 2 ----------

  public void testRemoveDeadDeclarationAndAssignment() {
    // var x; (decl) ; x = 5; (init, ไม่มี read อื่นเลย -> refCount==2)
    // isValidDeclaration=true, isValidInitialization=true -> inline + remove decl
    test("var x; x = 5;", "5;");
  }

  // ---------- Declared constants ----------

  public void testInlineDeclaredConstant() {
    // สมมติฐาน: @const ทำให้ var.isConst() == true
    test("/** @const */ var C = 1; f(C); g(C);", "f(1); g(1);");
  }

  // ---------- Mode.CONSTANTS_ONLY ----------

  public void testConstantsOnlyModeSkipsRegularVars() {
    mode = InlineVariables.Mode.CONSTANTS_ONLY;
    // ตัวกรอง IdentifyConstants -> referenceInfo == null -> continue
    testSame("var x = 1; f(x);");
  }

  public void testConstantsOnlyModeInlinesConstants() {
    mode = InlineVariables.Mode.CONSTANTS_ONLY;
    test("/** @const */ var C = 1; f(C);", "f(1);");
  }

  public void testConstantsOnlyModeContinuesForNonInlineableConstant() {
    mode = InlineVariables.Mode.CONSTANTS_ONLY;
    // isConst()==true แต่ value ไม่ immutable (foo()) -> isInlineableDeclaredConstant=false
    // -> เข้า branch "mode == CONSTANTS_ONLY -> continue"
    testSame("/** @const */ var C = foo(); use(C);");
  }

  // ---------- Mode.LOCALS_ONLY ----------

  public void testLocalsOnlyModeSkipsGlobals() {
    mode = InlineVariables.Mode.LOCALS_ONLY;
    testSame("var x = 1; f(x);");
  }

  public void testLocalsOnlyModeInlinesLocals() {
    mode = InlineVariables.Mode.LOCALS_ONLY;
    test("function f() { var x = 1; return g(x); }",
         "function f() { return g(1); }");
  }

  // ---------- isStringWorthInlining ----------

  public void testConstStringNotInlinedWhenNotBeneficial() {
    // string ยาว + refs หลายจุด -> noInlineBytes < inlineBytes -> ไม่คุ้ม (return false)
    testSame(
        "/** @const */ var S = 'abcdefghijklmnopqrstuvwxyz'; f(S); g(S); h(S);");
  }

  public void testConstStringInlinedWhenAllStringsAllowed() {
    inlineAllStrings = true; // ข้าม heuristic ทั้งหมด -> return true เสมอ
    test(
        "/** @const */ var S = 'abcdefghijklmnopqrstuvwxyz'; f(S); g(S); h(S);",
        "f('abcdefghijklmnopqrstuvwxyz'); g('abcdefghijklmnopqrstuvwxyz'); "
        + "h('abcdefghijklmnopqrstuvwxyz');");
  }

  // ---------- Alias-candidate inlining (ท้าย inlineNonConstants) ----------
  // หมายเหตุ: อิงสมมติฐานเรื่อง isWellDefined()/isAssignedOnceInLifetime() ของ
  // ReferenceCollection ซึ่งไม่มี source ให้ตรวจสอบตรง ๆ

  public void testInlineAlias() {
    test(
        "function f() { var w = h(); var v = w; return v + w; }",
        "function f() { var w = h(); return w + w; }");
  }

  // ---------- maybeEscapedOrModifiedArguments / isLValue ----------

  public void testArgumentsAssignmentBlocksAliasInlining() {
    // arguments[0] = 1 -> isLValue(parent)==true -> ถือว่า escape/modify -> block alias inline
    testSame(
        "function f() { var w = h(); var v = w; arguments[0] = 1; "
        + "return v + w; }");
  }

  public void testArgumentsPropertyReadDoesNotBlockAliasInlining() {
    // arguments[0] เป็นแค่ read (ไม่ใช่ lvalue) -> ไม่ถือว่า escape -> alias inline ยังทำงาน
    test(
        "function f() { var w = h(); var v = w; use(arguments[0]); "
        + "return v + w; }",
        "function f() { var w = h(); use(arguments[0]); return w + w; }");
  }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testInlineSimpleLiteral | refCount==firstRefAfterInit (decl==init), canInline=true, canMoveAggressively(literal)=true |
| testUnusedVariableNotTouched | refCount=1: ไม่เข้า if/else ใด ๆ, loop alias 0 รอบ |
| testEmptyScript | getVars() ไม่มีสมาชิก (boundary กรณีว่าง) |
| testInlineImmutableUsedMultipleTimes | refCount>1 && isImmutableAndWellDefinedVariable=true |
| testNoInlineWhenReassigned | isNeverAssigned=false, isWellDefined=false, isAssignedOnceInLifetime=false |
| testDuplicateVarDeclarations | อินพุตรูปแบบไม่ปกติ/ซ้ำ, เทียบเท่า reassignment |
| testNoInlineForLoopVar | isValidDeclaration=false (grandparent.isFor()) |
| testNoInlineAcrossBasicBlocks | canInline: cross basic-block check = true (บล็อคไม่ตรงกัน) |
| testNoInlineGetPropIntoCallContext | value.isGetProp() && reference เป็น callee ของ CALL = true |
| testInlineGetPropAsArgument | ผ่าน GetProp-call check (false), canMoveModerately=true |
| testNoInlineWhenReferenceIsLvalue | isValidReference=false (isLvalue=true) |
| testRemoveDeadDeclarationAndAssignment | declaration!=init && refCount==2, isValidDeclaration/isValidInitialization=true, inlineValue.isSimpleAssignmentToName()=true |
| testInlineDeclaredConstant | isInlineableDeclaredConstant=true (const + immutable value) |
| testConstantsOnlyModeSkipsRegularVars | getFilterForMode CONSTANTS_ONLY, referenceInfo==null -> continue |
| testConstantsOnlyModeInlinesConstants | mode==CONSTANTS_ONLY แต่ isInlineableDeclaredConstant=true ก่อน |
| testConstantsOnlyModeContinuesForNonInlineableConstant | isInlineableDeclaredConstant=false, mode==CONSTANTS_ONLY -> continue |
| testLocalsOnlyModeSkipsGlobals | IdentifyLocals: var.scope.isLocal()=false |
| testLocalsOnlyModeInlinesLocals | IdentifyLocals: var.scope.isLocal()=true |
| testConstStringNotInlinedWhenNotBeneficial | isStringWorthInlining: noInlineBytes<inlineBytes -> false |
| testConstStringInlinedWhenAllStringsAllowed | isStringWorthInlining: inlineAllStrings=true -> bypass heuristic |
| testInlineAlias | collectAliasCandidates (value.isName()=true), alias loop containsKey=true |
| testArgumentsAssignmentBlocksAliasInlining | maybeEscapedOrModifiedArguments=true, isLValue=true |
| testArgumentsPropertyReadDoesNotBlockAliasInlining | maybeEscapedOrModifiedArguments=false, isLValue=false (read only) |