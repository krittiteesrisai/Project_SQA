# ชุดทดสอบ JUnit 4: ProcessClosurePrimitivesTest

## หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติที่ต้องระบุตามข้อกำหนดที่ 4)

- `ProcessClosurePrimitives` เป็น **package-private class** (`class ProcessClosurePrimitives`) จึงต้องวาง test class ไว้ใน package เดียวกัน (`com.google.javascript.jscomp`) เพื่อเข้าถึง constructor, DiagnosticType static fields และ `getExportedVariableNames()` ได้
- โค้ดนี้พึ่งพา `Node`, `NodeTraversal`, `Compiler`, `JSModule` ฯลฯ ซึ่งเป็นส่วนหนึ่งของโปรเจกต์ Closure Compiler เอง (ไม่ใช่ jar ภายนอกที่ระบุ) — สิ่งเหล่านี้เป็นคลาสของ SUT (system-under-test) ที่ compile อยู่ใน classpath ของโปรเจกต์อยู่แล้ว จึงใช้ได้ตามปกติ
- ใช้ **`CompilerTestCase`** ซึ่งเป็น test-utility class ที่มีอยู่แล้วในซอร์สทรีของโปรเจกต์ Closure Compiler (ไม่ได้อยู่ใน jar ที่ระบุ แต่เป็นส่วนหนึ่งของ test-classpath ของโปรเจกต์ Defects4J Closure-92) เนื่องจากการสร้าง AST ด้วยมือและเรียก private method (`visit`, `processBaseClassCall` ฯลฯ) โดยตรงทำได้ยากมากและเสี่ยงต่อการ "เดา behavior" — จึงเลือกใช้ harness มาตรฐานของโปรเจกต์นี้แทน
- Method signature ของ `CompilerTestCase` (`test(String, String)`, `test(String, DiagnosticType)`, `testSame(String)`, `getProcessor(Compiler)`, `enableNormalize()`) อ้างอิงตามรูปแบบมาตรฐานที่ใช้จริงในชุดทดสอบของ Closure Compiler — หากลายเซ็นจริงต่างจากนี้เล็กน้อย ต้องปรับ import/เมธอดให้ตรง
- บางกรณี (เช่น `XMODULE_REQUIRE_ERROR` ที่ต้องใช้ multi-module setup) มีความซับซ้อนสูงและ API สำหรับสร้าง `JSModule[]` ไม่ชัดเจนพอที่จะเขียนโดยไม่เดา จึง **ไม่ทดสอบ** branch นี้ (คอมเมนต์ไว้ในโค้ด)

```java
package com.google.javascript.jscomp;

import com.google.javascript.jscomp.ProcessClosurePrimitives; // same-package, explicit for clarity

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Unit tests for {@link ProcessClosurePrimitives}.
 *
 * หมายเหตุ: ใช้ CompilerTestCase harness ของโปรเจกต์ Closure Compiler เอง
 * (ดูคำอธิบายด้านบนในคำตอบ) เนื่องจากการสร้าง Node AST ด้วยมือและเรียก
 * private method ตรง ๆ ทำได้ยากและเสี่ยงต่อการเดา behavior
 */
public class ProcessClosurePrimitivesTest extends CompilerTestCase {

  private CheckLevel requiresLevel;
  private boolean rewriteNewDateGoogNow;

  /** เก็บ reference ของ pass instance ล่าสุด เพื่อตรวจ getExportedVariableNames() */
  private ProcessClosurePrimitives lastPass;

  public ProcessClosurePrimitivesTest() {
    // externs พื้นฐาน: ประกาศ Date ไว้ให้ เพื่อทดสอบ trySimplifyNewDate
    super("var Date;");
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    requiresLevel = CheckLevel.ERROR;   // ให้ requiresLevel.isOn() == true เป็น default
    rewriteNewDateGoogNow = true;
    enableNormalize();
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    lastPass = new ProcessClosurePrimitives(
        compiler, requiresLevel, rewriteNewDateGoogNow);
    return lastPass;
  }

  // ---------------------------------------------------------------------
  // goog.provide - basic / boundary
  // ---------------------------------------------------------------------

  @Test
  public void testProvideSimpleNamespace() {
    test("goog.provide('foo');", "var foo = {};");
  }

  @Test
  public void testProvideNestedNamespaceCreatesPrefixes() {
    // ครอบคลุม registerAnyProvidedPrefixes() loop (pos != -1)
    test("goog.provide('foo.bar');", "var foo = {}; foo.bar = {};");
  }

  @Test
  public void testProvideDuplicateNamespaceError() {
    // ครอบคลุม previouslyProvided.isExplicitlyProvided() == true -> DUPLICATE_NAMESPACE_ERROR
    test("goog.provide('foo'); goog.provide('foo');",
        ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR);
  }

  @Test
  public void testProvideInvalidPropertyNameError() {
    // ครอบคลุม verifyProvide(): NodeUtil.isValidPropertyName(part) == false
    test("goog.provide('foo bar');",
        ProcessClosurePrimitives.INVALID_PROVIDE_ERROR);
  }

  @Test
  public void testProvideEmptyStringNamespaceBoundary() {
    // Boundary case: "".split("\\.") -> [""] -> isValidPropertyName("") ควรเป็น false
    test("goog.provide('');",
        ProcessClosurePrimitives.INVALID_PROVIDE_ERROR);
  }

  @Test
  public void testProvideNullArgument() {
    // ครอบคลุม verifyArgument(): arg == null -> NULL_ARGUMENT_ERROR
    test("goog.provide();", ProcessClosurePrimitives.NULL_ARGUMENT_ERROR);
  }

  @Test
  public void testProvideNonStringArgument() {
    // ครอบคลุม verifyArgument(): arg.getType() != desiredType -> INVALID_ARGUMENT_ERROR
    test("goog.provide(foo);", ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR);
  }

  @Test
  public void testProvideTooManyArguments() {
    // ครอบคลุม verifyArgument(): arg.getNext() != null -> TOO_MANY_ARGUMENTS_ERROR
    test("goog.provide('foo', 'bar');",
        ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR);
  }

  @Test
  public void testProvideNotInExprResultIsIgnored() {
    // isExpr == false -> "break" ในสาขา CALL (ไม่มีการประมวลผล provide)
    testSame("var x = goog.provide('foo');"); // ไม่อยู่ใน EXPR_RESULT เดี่ยว ๆ
  }

  // ---------------------------------------------------------------------
  // Function namespace conflict
  // ---------------------------------------------------------------------

  @Test
  public void testProvidedFunctionNamespaceError() {
    // Token.FUNCTION, t.inGlobalScope() && !isFunctionExpression, pn != null
    test("goog.provide('foo'); function foo() {}",
        ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR);
  }

  @Test
  public void testProvidedNamedFunctionExpressionNoError() {
    // ครอบคลุมสาขา NodeUtil.isFunctionExpression(n) == true -> ไม่ error
    test("goog.provide('foo'); var x = function foo() {};",
        "var foo = {}; var x = function foo() {};");
  }

  // ---------------------------------------------------------------------
  // goog.require - basic / boundary / order-dependent
  // ---------------------------------------------------------------------

  @Test
  public void testRequireMissingProvide() {
    // provided == null -> unrecognizedRequires, expectedName == null -> MISSING_PROVIDE_ERROR
    test("goog.require('foo');",
        ProcessClosurePrimitives.MISSING_PROVIDE_ERROR);
  }

  @Test
  public void testRequireWithProvideRemovesCall() {
    test("goog.provide('foo'); goog.require('foo');", "var foo = {};");
  }

  @Test
  public void testLateProvideError() {
    // require มาก่อน provide ในซอร์ส -> expectedName.firstNode != null -> LATE_PROVIDE_ERROR
    test("goog.require('foo'); goog.provide('foo');",
        ProcessClosurePrimitives.LATE_PROVIDE_ERROR);
  }

  @Test
  public void testRequireNullArgument() {
    test("goog.require();", ProcessClosurePrimitives.NULL_ARGUMENT_ERROR);
  }

  @Test
  public void testRequireNonStringArgument() {
    test("goog.require(foo);", ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR);
  }

  @Test
  public void testRequireTooManyArguments() {
    test("goog.require('foo', 'bar');",
        ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR);
  }

  // ---------------------------------------------------------------------
  // exportSymbol - dot / no-dot / boundary (dot ที่ index 0)
  // ---------------------------------------------------------------------

  @Test
  public void testExportSymbolWithoutDot() {
    testSame("goog.exportSymbol('foo', foo);");
    assertTrue(lastPass.getExportedVariableNames().contains("foo"));
  }

  @Test
  public void testExportSymbolWithDot() {
    testSame("goog.exportSymbol('foo.bar', foo);");
    assertTrue(lastPass.getExportedVariableNames().contains("foo"));
    assertFalse(lastPass.getExportedVariableNames().contains("foo.bar"));
  }

  @Test
  public void testExportSymbolLeadingDotBoundary() {
    // Boundary: dot == 0 -> substring(0,0) == "" (edge case ที่อาจเป็น fault)
    testSame("goog.exportSymbol('.foo', foo);");
    assertTrue(lastPass.getExportedVariableNames().contains(""));
  }

  @Test
  public void testExportSymbolNonStringArgumentIgnored() {
    // arg.getType() != STRING -> ไม่มีการเพิ่มลง exportedVariables (ไม่ error เพราะไม่ผ่าน verifyArgument ภายในนี้)
    testSame("goog.exportSymbol(foo, bar);");
    assertTrue(lastPass.getExportedVariableNames().isEmpty());
  }

  // ---------------------------------------------------------------------
  // addDependency
  // ---------------------------------------------------------------------

  @Test
  public void testAddDependencyReplacedWithZero() {
    test("goog.addDependency('foo.js', ['foo'], []);", "0;");
  }

  // ---------------------------------------------------------------------
  // setCssNameMapping
  // ---------------------------------------------------------------------

  @Test
  public void testSetCssNameMappingValid() {
    test("goog.setCssNameMapping({'foo':'bar'});", "");
  }

  @Test
  public void testSetCssNameMappingNonStringValueError() {
    test("goog.setCssNameMapping({'foo':1});",
        ProcessClosurePrimitives.NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR);
  }

  @Test
  public void testSetCssNameMappingWrongArgumentType() {
    // verifyArgument(desiredType = OBJECTLIT) -> arg เป็น STRING -> INVALID_ARGUMENT_ERROR
    test("goog.setCssNameMapping('foo');",
        ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR);
  }

  // ---------------------------------------------------------------------
  // goog.base - error branches
  // ---------------------------------------------------------------------

  @Test
  public void testGoogBaseMissingThisArgument() {
    // thisArg == null -> BASE_CLASS_ERROR
    test("function Foo() { goog.base(); }",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testGoogBaseFirstArgumentNotThis() {
    // thisArg.getType() != Token.THIS -> BASE_CLASS_ERROR
    test("function Foo() { goog.base(foo); }",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testGoogBaseEnclosingMethodNotFound() {
    // getEnclosingDeclNameNode() == null (global scope, ไม่มี function/assign/var ล้อม) -> BASE_CLASS_ERROR
    test("goog.base(this);", ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testGoogBaseConstructorMissingInheritsError() {
    // enclosingQname ไม่มี ".prototype." (constructor case), maybeInheritsExpr ไม่ตรงเงื่อนไข -> BASE_CLASS_ERROR
    test("function Foo() { goog.base(this); }",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testGoogBaseMethodMissingNameArgumentError() {
    // enclosingQname มี ".prototype." แต่ methodNameNode == null -> BASE_CLASS_ERROR
    test("Foo.prototype.bar = function() { goog.base(this); };",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testGoogBaseMethodNameMismatchError() {
    // methodName ไม่ตรงกับ enclosing method name -> BASE_CLASS_ERROR
    test("Foo.prototype.bar = function() { goog.base(this, 'baz'); };",
        ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  @Test
  public void testGoogBaseUsedAsPlainReferenceError() {
    // Token.GETPROP branch: parent ไม่ใช่ CALL/ASSIGN และ qualifiedName == "goog.base"
    test("var x = goog.base;", ProcessClosurePrimitives.BASE_CLASS_ERROR);
  }

  // ---------------------------------------------------------------------
  // goog.base - success rewrite branches
  // (สมมติ exact AST pretty-print ตาม logic ของซอร์ส -- ถ้ารูปแบบผลลัพธ์จริง
  //  ต่างเล็กน้อยจากการ pretty-print ของ compiler อาจต้องปรับ string)
  // ---------------------------------------------------------------------

  @Test
  public void testGoogBaseConstructorRewriteSuccess() {
    test(
        "function Foo() { goog.base(this); } goog.inherits(Foo, Bar);",
        "function Foo() { Bar.call(this); } goog.inherits(Foo, Bar);");
  }

  @Test
  public void testGoogBaseMethodRewriteSuccess() {
    test(
        "Foo.prototype.bar = function() { goog.base(this, 'bar', 1); };",
        "Foo.prototype.bar = function() { Foo.superClass_.bar.call(this, 1); };");
  }

  // ---------------------------------------------------------------------
  // new Date(goog.now()) simplification (flag true/false + edge cases)
  // ---------------------------------------------------------------------

  @Test
  public void testNewDateGoogNowRewrittenWhenFlagEnabled() {
    rewriteNewDateGoogNow = true;
    test("new Date(goog.now());", "new Date;");
  }

  @Test
  public void testNewDateGoogNowNotRewrittenWhenFlagDisabled() {
    // if (!rewriteNewDateGoogNow) return; -> early-return branch
    rewriteNewDateGoogNow = false;
    testSame("new Date(goog.now());");
  }

  @Test
  public void testNewNonDateConstructorNotRewritten() {
    // !NodeUtil.isName(date) || !"Date".equals(...) -> return
    rewriteNewDateGoogNow = true;
    testSame("new Foo(goog.now());");
  }

  @Test
  public void testNewDateNoArgumentsNotRewritten() {
    // callGoogNow == null -> return
    rewriteNewDateGoogNow = true;
    testSame("new Date();");
  }

  @Test
  public void testNewDateWithNonCallArgumentNotRewritten() {
    // callGoogNow != null but !NodeUtil.isCall(callGoogNow) -> return
    rewriteNewDateGoogNow = true;
    testSame("new Date(123);");
  }

  @Test
  public void testNewDateWithOtherFunctionCallNotRewritten() {
    // googNowQName != "goog.now" -> return
    rewriteNewDateGoogNow = true;
    testSame("new Date(foo());");
  }

  @Test
  public void testNewDateWithExtraArgumentAfterGoogNowNotRewritten() {
    // callGoogNow.getNext() != null -> return
    rewriteNewDateGoogNow = true;
    testSame("new Date(goog.now(), 1);");
  }

  // ---------------------------------------------------------------------
  // handleCandidateProvideDefinition - scope / name resolution branches
  // ---------------------------------------------------------------------

  @Test
  public void testCandidateDefinitionIgnoredOutsideGlobalScope() {
    // t.inGlobalScope() == false -> ไม่มีการประมวลผลเลย
    testSame("function f() { var foo = {}; }");
  }

  @Test
  public void testAssignNotUnderExprResultNameStaysNull() {
    // ASSIGN แต่ parent != EXPR_RESULT -> name เป็น null -> ไม่มีผลกระทบ
    testSame("var x = (foo = {});");
  }

  @Test
  public void testProvideWithSubsequentVarDefinitionReplacesExplicitProvide() {
    // candidateDefinition (VAR) + explicitNode -> explicitNode ถูกลบ, ใช้ VAR เดิม
    test("goog.provide('foo'); var foo = {};", "var foo = {};");
  }

  @Test
  public void testProvideWithSubsequentSimpleAssignConvertsToVar() {
    // candidateDefinition เป็น EXPR_RESULT ของ ASSIGN ที่ nameNode เป็น Token.NAME
    // -> ถูกแปลงเป็น VAR declaration
    test("goog.provide('foo'); foo = {};", "var foo = {};");
  }

  @Test
  public void testProvideDottedWithSubsequentAssignKeepsAssign() {
    // nameNode เป็น GETPROP (ไม่ใช่ NAME) -> ไม่แปลงเป็น VAR, แค่ลบ explicit provide
    test("goog.provide('foo.bar'); foo.bar = {};",
        "var foo = {}; foo.bar = {};");
  }

  // ---------------------------------------------------------------------
  // getExportedVariableNames() default state
  // ---------------------------------------------------------------------

  @Test
  public void testExportedVariableNamesInitiallyEmpty() {
    testSame("var x = 1;");
    assertTrue(lastPass.getExportedVariableNames().isEmpty());
  }

  // ---------------------------------------------------------------------
  // NOTE: ไม่ได้ทดสอบ XMODULE_REQUIRE_ERROR (ต้องใช้ multi-module JSModuleGraph
  // setup ที่ซับซ้อนและ API สร้าง JSModule[] ใน CompilerTestCase ไม่ชัดเจนพอ
  // ที่จะเขียนได้โดยไม่เดา behavior - จงใจข้ามตามข้อกำหนดที่ 4)
  // ---------------------------------------------------------------------
}
```

## ตารางสรุป: เมธอดทดสอบ ↔ Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testProvideSimpleNamespace | `provide` สำเร็จ, ns ไม่มี `.` |
| testProvideNestedNamespaceCreatesPrefixes | `registerAnyProvidedPrefixes` loop (`pos != -1`) |
| testProvideDuplicateNamespaceError | `previouslyProvided.isExplicitlyProvided()==true` → DUPLICATE_NAMESPACE_ERROR |
| testProvideInvalidPropertyNameError | `verifyProvide` → `isValidPropertyName==false` |
| testProvideEmptyStringNamespaceBoundary | boundary: string ว่าง หลัง split |
| testProvideNullArgument | `verifyArgument`: `arg==null` |
| testProvideNonStringArgument | `verifyArgument`: type mismatch |
| testProvideTooManyArguments | `verifyArgument`: `arg.getNext()!=null` |
| testProvideNotInExprResultIsIgnored | `isExpr==false` → `break` ใน switch CALL |
| testProvidedFunctionNamespaceError | Token.FUNCTION, `inGlobalScope && !isFunctionExpression`, `pn!=null` |
| testProvidedNamedFunctionExpressionNoError | `isFunctionExpression==true` → skip check |
| testRequireMissingProvide | `provided==null` → MISSING_PROVIDE_ERROR |
| testRequireWithProvideRemovesCall | `provided!=null` → ลบ require call |
| testLateProvideError | `expectedName.firstNode!=null` → LATE_PROVIDE_ERROR |
| testRequireNullArgument / NonString / TooMany | verifyArgument 3 branch สำหรับ require |
| testExportSymbolWithoutDot / WithDot / LeadingDotBoundary | `dot==-1` vs `dot>=0`, boundary `dot==0` |
| testExportSymbolNonStringArgumentIgnored | `arg.getType()!=STRING` |
| testAddDependencyReplacedWithZero | replace CALL ด้วย `Node.newNumber(0)` |
| testSetCssNameMappingValid | loop key/value ถูกต้องทั้งหมด, ไม่มี error |
| testSetCssNameMappingNonStringValueError | `value.getType()!=STRING` → error |
| testSetCssNameMappingWrongArgumentType | `verifyArgument` desiredType=OBJECTLIT mismatch |
| testGoogBase* (error cases) | ทุกสาขา error ใน `processBaseClassCall` (thisArg null/ไม่ใช่ THIS, enclosing not found, missing inherits, missing method name, mismatch name) และ GETPROP misuse |
| testGoogBaseConstructorRewriteSuccess | constructor rewrite success path |
| testGoogBaseMethodRewriteSuccess | prototype method rewrite success path |
| testNewDateGoogNow* (7 tests) | ทุก early-return branch และ success branch ของ `trySimplifyNewDate` |
| testCandidateDefinitionIgnoredOutsideGlobalScope | `t.inGlobalScope()==false` |
| testAssignNotUnderExprResultNameStaysNull | `name==null` (ASSIGN ไม่อยู่ใต้ EXPR_RESULT) |
| testProvideWithSubsequentVarDefinition... | `candidateDefinition` เป็น VAR |
| testProvideWithSubsequentSimpleAssignConvertsToVar | แปลง ASSIGN→VAR (`nameNode.getType()==NAME`) |
| testProvideDottedWithSubsequentAssignKeepsAssign | คง ASSIGN (nameNode เป็น GETPROP) |
| testExportedVariableNamesInitiallyEmpty | boundary: set ว่างตอนเริ่มต้น |