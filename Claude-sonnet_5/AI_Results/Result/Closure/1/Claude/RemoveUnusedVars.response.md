# วิเคราะห์และแนวทางการทดสอบ

**หมายเหตุสำคัญก่อนเริ่ม:**

- `RemoveUnusedVars` เป็น package-private class ที่ผูกกับโครงสร้างภายในของ Closure Compiler อย่างลึก (ต้องใช้ `AbstractCompiler`, `Scope`, `SyntacticScopeCreator`, `Node` ที่ผ่านการ parse และ normalize จริง) การจะเรียก `process()` ได้ต้องผ่าน precondition `compiler.getLifeCycleStage().isNormalized()` ซึ่งสร้างเองด้วยมือได้ยากมากโดยไม่มี parser/normalizer จริง
- จึงใช้ `CompilerTestCase` (คลาสฐานมาตรฐานสำหรับทดสอบ compiler pass ใน package เดียวกัน `com.google.javascript.jscomp`) ซึ่งจัดการ parse/normalize/print ให้อัตโนมัติ — คลาสนี้สืบทอดจาก `junit.framework.TestCase` (อยู่ใน `junit.jar` ที่อนุญาต) และรันได้ผ่านตัวรัน JUnit4 (`JUnitCore`) ตามปกติของ Defects4J
- จุดที่ **ห้ามเดา** (ระบุไว้เป็นคอมเมนต์ในโค้ด): `goog.inherits`/`addSingletonGetter` (ขึ้นกับ `CodingConvention` เฉพาะที่ไม่มีในซอร์ส), `codingConvention.isExported(name)` (ไม่รู้ semantics), และผลลัพธ์ละเอียดของ `CallSiteOptimizer` เมื่อ `modifyCallSites=true` (พึ่ง `SimpleDefinitionFinder`/`DefinitionsRemover` ที่ไม่ได้ให้มา) — จึงมีเทสเดียวที่ครอบคลุมแบบระวังพร้อมคอมเมนต์กำกับ

```java
package com.google.javascript.jscomp;

import com.google.javascript.jscomp.RemoveUnusedVars; // อยู่ package เดียวกัน ระบุไว้เพื่อความชัดเจนตามข้อกำหนด

/**
 * Unit tests สำหรับ {@link RemoveUnusedVars} (Defects4J Closure-1b)
 *
 * ใช้ {@link CompilerTestCase} เป็น harness มาตรฐานของ Closure Compiler
 * (อยู่ใน package เดียวกัน, สืบทอดจาก junit.framework.TestCase ซึ่งมาจาก junit.jar
 * และรันได้ปกติผ่าน JUnit4 runner) เนื่องจากการสร้าง AbstractCompiler / Normalized AST
 * ด้วยมือโดยไม่พึ่ง parser จริงเป็นไปไม่ได้ในทางปฏิบัติ และไม่ได้ระบุ API ไว้ในซอร์สที่ให้มา
 *
 * เมธอด test()/testSame() ของ CompilerTestCase เปรียบเทียบ AST (ไม่สนใจ whitespace)
 */
public class RemoveUnusedVarsTest extends CompilerTestCase {

  // ค่าที่ควบคุมพารามิเตอร์ของ constructor เป้าหมาย ปรับได้ต่อเทส
  private boolean removeGlobal;
  private boolean preserveFunctionExpressionNames;
  private boolean modifyCallSites;

  public RemoveUnusedVarsTest() {
    // externs ว่าง: ไม่ต้องพึ่ง extern เพราะ NAME ที่ไม่พบใน scope จะได้ var == null
    // (ไม่เกิดผลข้างเคียงต่อการทำงานของพาส ตามตรรกะใน traverseNode)
    super("");
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    removeGlobal = true;
    preserveFunctionExpressionNames = false;
    modifyCallSites = false;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new RemoveUnusedVars(
        compiler, removeGlobal, preserveFunctionExpressionNames, modifyCallSites);
  }

  // ---------------------------------------------------------------------
  // 0) Boundary / empty input
  // ---------------------------------------------------------------------

  public void testEmptySource() {
    testSame(""); // ค่าว่าง: ต้องไม่ throw และไม่มีการเปลี่ยนแปลง
  }

  public void testNoVariablesJustCalls() {
    testSame("foo(); bar();"); // ไม่มีตัวแปรให้ลบ ครอบคลุม default-path ของ CALL/ NAME(var==null)
  }

  // ---------------------------------------------------------------------
  // 1) Constructor - null compiler (null input, ตรวจตรงจาก constructor ในซอร์ส)
  //    this.codingConvention = compiler.getCodingConvention(); จะ throw NPE ทันที
  // ---------------------------------------------------------------------

  public void testConstructorNullCompilerThrowsNPE() {
    try {
      new RemoveUnusedVars(null, true, false, false);
      fail("Expected NullPointerException when compiler == null");
    } catch (NullPointerException expected) {
      // ตรงตามพฤติกรรมที่อ่านได้จาก source: compiler.getCodingConvention() บน null
    }
  }

  // ---------------------------------------------------------------------
  // 2) isRemovableVar: removeGlobals flag branch
  // ---------------------------------------------------------------------

  public void testRemoveUnusedGlobalVar_whenRemoveGlobalsTrue() {
    removeGlobal = true;
    test("var x = 1;", "");
  }

  public void testKeepUnusedGlobalVar_whenRemoveGlobalsFalse() {
    removeGlobal = false;
    testSame("var x = 1;");
  }

  public void testRemoveUnusedLocalVar_evenWhenRemoveGlobalsFalse() {
    // ตัวแปร local ไม่ผ่าน var.isGlobal() จึงยังถูกลบได้เสมอ (ไม่ขึ้นกับ removeGlobal)
    removeGlobal = false;
    test("function f(){var x = 1; return 0;} f();",
         "function f(){return 0;} f();");
  }

  // ---------------------------------------------------------------------
  // 3) Token.FUNCTION branch (isFunctionDeclaration + isRemovableVar)
  // ---------------------------------------------------------------------

  public void testUnusedFunctionDeclarationRemoved() {
    removeGlobal = true;
    test("function f(){}", "");
  }

  public void testUsedFunctionDeclarationNotRemoved() {
    removeGlobal = true;
    testSame("function f(){} f();");
  }

  // ---------------------------------------------------------------------
  // 4) removeUnreferencedFunctionArgs: trailing removal loop + break branch
  // ---------------------------------------------------------------------

  public void testTrailingUnusedParamRemoved() {
    // b ไม่ถูกใช้และอยู่ท้ายสุด -> ถูกตัดออกจาก declaration
    test("function f(a,b){return a;} f(1,2);",
         "function f(a){return a;} f(1,2);");
  }

  public void testNonTrailingUnusedParamNotRemoved() {
    // a ไม่ถูกใช้แต่ b (ตัวสุดท้าย) ถูกใช้ -> loop break ทันที ไม่มีการลบ
    testSame("function f(a,b){return b;} f(1,2);");
  }

  public void testGetterSetterParamNotRemoved() {
    // NodeUtil.isGetOrSetKey(function.getParent()) == true -> return ก่อนแตะ argList
    // obj ถูกอ้างอิงผ่าน use(obj) เพื่อให้ traversal เข้าไปสำรวจ setter จริง (ไม่ถูกตัดทิ้งทั้งยวง)
    testSame("var obj = {set foo(a) {}}; use(obj);");
  }

  public void testArgumentsUsage_marksAllParamsReferenced() {
    // สาขา "arguments".equals(n.getString()) && scope.isLocal() -> mark ทุก parameter
    testSame("function f(a,b){return arguments.length;} f(1,2);");
  }

  // ---------------------------------------------------------------------
  // 5) Function expression name (Continuation + preserveFunctionExpressionNames)
  // ---------------------------------------------------------------------

  public void testFunctionExpressionName_anonymizedWhenUnreferenced() {
    preserveFunctionExpressionNames = false;
    test("var a = function foo() { return 1; }; use(a);",
         "var a = function() { return 1; }; use(a);");
  }

  public void testFunctionExpressionName_preservedWhenFlagSet() {
    preserveFunctionExpressionNames = true;
    testSame("var a = function foo() { return 1; }; use(a);");
  }

  // ---------------------------------------------------------------------
  // 6) Multiple-name var declaration (toRemove.getChildCount() > 1 branch)
  // ---------------------------------------------------------------------

  public void testMultipleVarDeclaration_partialRemoval() {
    test("var a=1, b=2; use(a);", "var a=1; use(a);");
  }

  // ---------------------------------------------------------------------
  // 7) Assign.maybeCreateAssign: property-assign 1 ชั้น vs มากกว่า 1 ชั้น
  // ---------------------------------------------------------------------

  public void testDeepPropertyAssign_marksVarReferencedDirectly() {
    // obj.a.b = 1  -> unwrap ได้ไม่ถึง NAME ชั้นเดียว -> maybeCreateAssign คืน null
    // -> ตกไป traverse ปกติ -> obj ถูก mark referenced ตรง ๆ (ไม่ผ่าน heuristic)
    testSame("var obj = {}; obj.a.b = 1;");
  }

  public void testSinglePropertyAssign_withUnknownInitialValue_keepsVar() {
    // y = foo() (ไม่ใช่ literal) + y.bar = 3 (property assign)
    // -> assignedToUnknownValue=true, hasPropertyAssign=true -> markReferencedVar
    testSame("var y = foo(); y.bar = 3;");
  }

  public void testSinglePropertyAssign_withLiteralInitialValue_getsRemoved() {
    // y = {} (literal) + y.bar = 3 -> assignedToUnknownValue=false, maybeAliased=false
    // -> เงื่อนไข (assignedToUnknownValue || maybeEscaped) && hasPropertyAssign เป็น false
    // -> ไม่ mark referenced -> ทั้ง var และ assign ถูกลบทิ้งทั้งหมด
    test("var y = {}; y.bar = 3;", "");
  }

  public void testPropertyAssign_resultUsed_marksAliasedAndKeepsVar() {
    // z.bar = 5 ถูกใช้เป็นผลของ expression (ส่งเข้า use(...)) -> maybeAliased = true
    // ร่วมกับ hasPropertyAssign = true -> markReferencedVar ผ่าน interpretAssigns()
    testSame("var z = foo(); use(z.bar = 5);");
  }

  // ---------------------------------------------------------------------
  // 8) Idempotency ของ markReferencedVar / referenced.contains(var) branch
  // ---------------------------------------------------------------------

  public void testVarReferencedMultipleTimes_isIdempotent() {
    testSame("var a = 1; use(a); use(a);");
  }

  // ---------------------------------------------------------------------
  // 9) modifyCallSites = true (CallSiteOptimizer) — ทดสอบอย่างระมัดระวัง
  // ---------------------------------------------------------------------

  public void testModifyCallSites_trailingParamRemovedFromDeclarationAndCallSite() {
    // หมายเหตุ: พฤติกรรมละเอียดของ CallSiteOptimizer พึ่งพา SimpleDefinitionFinder /
    // DefinitionsRemover ซึ่งไม่ได้แสดงในซอร์สที่ให้มา ผลลัพธ์นี้อิงจากคอมเมนต์ในซอร์สต้นฉบับ
    // ("Strip unreferenced args off the end ... optimize call sites") สำหรับกรณี "ง่ายที่สุด"
    // (ฟังก์ชัน global ถูกเรียกจากจุดเดียว ไม่มี alias) หากพฤติกรรมจริงต่างจากนี้ ให้ถือว่า
    // เป็นจุดที่ต้องปรับปรุง assertion ตาม logic จริงของ SimpleDefinitionFinder
    modifyCallSites = true;
    test("function f(a,b){return a;} f(1,2);",
         "function f(a){return a;} f(1);");
  }
}
```

## สรุป Coverage ของแต่ละเทส

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testEmptySource` | Boundary: input ว่าง, robustness ของ `traverseNode` เมื่อไม่มี node ให้เดิน |
| `testNoVariablesJustCalls` | `Token.NAME` เมื่อ `var == null`, `Token.CALL` default fallthrough |
| `testConstructorNullCompilerThrowsNPE` | Null input: constructor `compiler.getCodingConvention()` บน null |
| `testRemoveUnusedGlobalVar_whenRemoveGlobalsTrue` | `isRemovableVar`: `!removeGlobals && var.isGlobal()` = false (removeGlobal=true) |
| `testKeepUnusedGlobalVar_whenRemoveGlobalsFalse` | `isRemovableVar`: `!removeGlobals && var.isGlobal()` = true → ไม่ลบ |
| `testRemoveUnusedLocalVar_evenWhenRemoveGlobalsFalse` | `var.isGlobal()` = false สำหรับ local var แม้ removeGlobal=false |
| `testUnusedFunctionDeclarationRemoved` | `Token.FUNCTION`: isFunctionDeclaration && isRemovableVar → continuation + ลบ |
| `testUsedFunctionDeclarationNotRemoved` | `Token.FUNCTION`: isRemovableVar=false → `traverseFunction` ตรง |
| `testTrailingUnusedParamRemoved` | while-loop ใน `removeUnreferencedFunctionArgs` (ลบ arg ท้ายสุด) |
| `testNonTrailingUnusedParamNotRemoved` | `break` ของ while-loop เมื่อ arg ท้ายสุดถูกอ้างอิง |
| `testGetterSetterParamNotRemoved` | `NodeUtil.isGetOrSetKey(...)` → return ก่อนถึง argList loop |
| `testArgumentsUsage_marksAllParamsReferenced` | branch `"arguments".equals(...) && scope.isLocal()` |
| `testFunctionExpressionName_anonymizedWhenUnreferenced` | `NodeUtil.isFunctionExpression` + `!preserveFunctionExpressionNames` |
| `testFunctionExpressionName_preservedWhenFlagSet` | same branch, `preserveFunctionExpressionNames = true` |
| `testMultipleVarDeclaration_partialRemoval` | `toRemove.isVar() && toRemove.getChildCount() > 1` |
| `testDeepPropertyAssign_marksVarReferencedDirectly` | `Assign.maybeCreateAssign` คืน `null` (current ไม่ใช่ NAME) |
| `testSinglePropertyAssign_withUnknownInitialValue_keepsVar` | `interpretAssigns`: `assignedToUnknownValue=true` |
| `testSinglePropertyAssign_withLiteralInitialValue_getsRemoved` | `interpretAssigns`: เงื่อนไข AND เป็น false → ลบทั้งหมด |
| `testPropertyAssign_resultUsed_marksAliasedAndKeepsVar` | `NodeUtil.isExpressionResultUsed` → `maybeAliased=true` |
| `testVarReferencedMultipleTimes_isIdempotent` | `markReferencedVar`: `referenced.add(var)` คืน false รอบสอง |
| `testModifyCallSites_trailingParamRemovedFromDeclarationAndCallSite` | `modifyCallers` = true → `CallSiteOptimizer.optimize` (มีคอมเมนต์กำกับความไม่แน่นอน) |

**จุดที่ไม่ได้ทดสอบ พร้อมเหตุผล (ตามข้อกำหนดห้ามเดา):**
- `Token.CALL` กรณี `subclassRelationship != null` (goog.inherits) และ `getSingletonGetterClassName` — ต้องพึ่ง `CodingConvention` เฉพาะที่ไม่มีรายละเอียดในซอร์สที่ให้มา
- `codingConvention.isExported(name)` — ไม่มี semantics ของ default convention ในซอร์สที่ให้มา
- รายละเอียดภายในของ `CallSiteOptimizer` (เช่น `toReplaceWithZero`, `canChangeSignature` แบบซับซ้อนหลาย call site) — พึ่ง `SimpleDefinitionFinder`/`DefinitionsRemover` ที่ไม่ได้แสดงในซอร์ส มีเพียงเทสเดียวที่ทดสอบกรณีง่ายที่สุดพร้อมคอมเมนต์กำกับความเสี่ยง