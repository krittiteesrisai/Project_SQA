# วิเคราะห์และแนวทางการทดสอบ

**หมายเหตุสำคัญ:** คลาส `TypeCheck` มี constructor และ method ส่วนใหญ่เป็น `private`/package-private และทำงานผ่าน `NodeTraversal` บน AST ของ Rhino ซึ่งพึ่งพา `Scope`, `TypedScopeCreator`, `JSTypeRegistry` ฯลฯ อย่างมาก การจะเรียก method เหล่านี้โดยตรง (unit test แบบ isolate) ต้องสร้าง dependency กราฟทั้งหมดซึ่งไม่มี mocking framework ให้ใช้ในโจทย์

ดังนั้นแนวทางที่ปฏิบัติได้จริงและไม่ต้อง "เดา" internal ของคลาสอื่น คือใช้ **`com.google.javascript.jscomp.Compiler`** (concrete public class ใน package เดียวกัน) รัน pipeline แบบ end-to-end ผ่าน public API (`compile()`) แล้วตรวจสอบ `DiagnosticType` ที่เป็น field ของ `TypeCheck` เอง (ซึ่งมองเห็นได้เพราะ test อยู่ package เดียวกัน) วิธีนี้จะไปกระตุ้น branch ต่าง ๆ ภายใน `visit()`/`shouldTraverse()`/private helper methods ได้จริงตามพฤติกรรมจริงของคอมไพเลอร์

จุดที่ผลลัพธ์ไม่สามารถยืนยันได้ชัดจากซอร์สที่ให้มา (พฤติกรรมของ `JSType` lattice เช่น `matchesInt32Context`, หรือของ `Scope`/`TypedScopeCreator`) จะใส่คอมเมนต์กำกับไว้ตามข้อกำหนด

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * ชุดทดสอบสำหรับ TypeCheck (Closure-11b)
 *
 * แนวทาง: เนื่องจาก TypeCheck ส่วนใหญ่เป็น private method ที่ทำงานผ่าน
 * NodeTraversal และพึ่งพา Scope/TypedScopeCreator/JSTypeRegistry อย่างมาก
 * (ซึ่งไม่มี mocking framework ให้ใช้ในโจทย์) จึงทดสอบผ่าน public API ของ
 * com.google.javascript.jscomp.Compiler (อยู่ package เดียวกัน) แบบ
 * end-to-end แล้วตรวจ DiagnosticType ที่ TypeCheck.java ประกาศไว้เอง
 * (มองเห็นได้เพราะ test class อยู่ package เดียวกัน)
 *
 * หมายเหตุ: บาง assertion (ที่พึ่งพา JSType lattice / Scope internals
 * ซึ่งไม่ปรากฏใน source ที่ให้มา) จะกำกับด้วยคอมเมนต์ "สมมติฐาน" ไว้ชัดเจน
 */
public class TypeCheckTest {

  // Externs ขั้นต่ำที่จำเป็นสำหรับให้ TypedScopeCreator ผูก global type ได้
  private static final String EXTERNS =
      "/** @constructor @param {*=} opt_v @return {!Object} */\n"
      + "function Object(opt_v) {}\n"
      + "Object.prototype.toString = function() {};\n"
      + "/** @constructor @param {...*} var_args */\n"
      + "function Function(var_args) {}\n"
      + "/** @constructor @param {*=} arrayLength */\n"
      + "function Array(arrayLength) {}\n"
      + "/** @constructor @param {*=} opt_str */\n"
      + "function String(opt_str) {}\n"
      + "/** @constructor @param {*=} opt_num */\n"
      + "function Number(opt_num) {}\n"
      + "/** @constructor @param {*=} opt_val */\n"
      + "function Boolean(opt_val) {}\n"
      + "/** @constructor */\n"
      + "function RegExp() {}\n";

  private CompilerOptions createOptions() {
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
    return options;
  }

  private Result compile(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = createOptions();
    List<SourceFile> externs =
        ImmutableList.of(SourceFile.fromCode("externs.js", EXTERNS));
    List<SourceFile> inputs =
        ImmutableList.of(SourceFile.fromCode("input.js", js));
    return compiler.compile(externs, inputs, options);
  }

  private void assertNoProblems(Result result) {
    assertTrue("Expected no errors, got: " + Arrays.toString(result.errors),
        result.errors.length == 0);
    assertTrue("Expected no warnings, got: " + Arrays.toString(result.warnings),
        result.warnings.length == 0);
  }

  private void assertHasAnyProblem(String js) {
    Result result = compile(js);
    assertTrue("Expected at least one error/warning",
        result.errors.length > 0 || result.warnings.length > 0);
  }

  private void assertHasWarningOrError(String js, DiagnosticType type) {
    Result result = compile(js);
    boolean found = false;
    for (JSError w : result.warnings) {
      if (w.getType() == type) { found = true; break; }
    }
    if (!found) {
      for (JSError e : result.errors) {
        if (e.getType() == type) { found = true; break; }
      }
    }
    assertTrue("Expected diagnostic not found. warnings="
        + Arrays.toString(result.warnings) + " errors="
        + Arrays.toString(result.errors), found);
  }

  // ---------------------------------------------------------------
  // Boundary / null / empty / malformed input
  // ---------------------------------------------------------------

  @Test
  public void testEmptySourceNoProblems() {
    assertNoProblems(compile(""));
  }

  @Test
  public void testWhitespaceOnlySource() {
    assertNoProblems(compile("   \n\t  "));
  }

  @Test
  public void testEmptyFunctionBody() {
    assertNoProblems(compile("function f() {}"));
  }

  @Test
  public void testMalformedInputDoesNotCrash() {
    // Syntax error -> compile ควรจบแบบ fail (ไม่ throw exception ที่ไม่ถูกจับ)
    Result result = compile("var x = ;");
    assertFalse(result.success);
  }

  // ---------------------------------------------------------------
  // Literal token branches: TRUE/FALSE/NULL/NUMBER/STRING/ARRAYLIT/REGEXP
  // ---------------------------------------------------------------

  @Test
  public void testBasicLiteralsNoWarnings() {
    Result result = compile(
        "var a = true;"
        + "var b = false;"
        + "var c = null;"
        + "var d = 5;"
        + "var e = 'str';"
        + "var f = [1,2,3];"
        + "var g = /abc/;");
    assertNoProblems(result);
  }

  @Test
  public void testThisInsideConstructor() {
    // ครอบคลุม Token.THIS
    Result result = compile(
        "/** @constructor */ function Foo() { this.x = 1; }");
    assertNoProblems(result);
  }

  @Test
  public void testCommaOperator() {
    // ครอบคลุม Token.COMMA (ensureTyped ด้วย type ของ last child)
    Result result = compile("var x = (1, 2, 'three');");
    assertNoProblems(result);
  }

  @Test
  public void testAnonymousFunctionNoMasking() {
    // ครอบคลุม branch functionPrivateName.length() > 0 == false ใน shouldTraverse
    Result result = compile("var f = function() { return 1; };");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // Token.NOT / VOID / TYPEOF
  // ---------------------------------------------------------------

  @Test
  public void testNotVoidTypeof() {
    Result result = compile(
        "var a = !true;" + "var b = void 0;" + "var c = typeof 5;");
    assertNoProblems(result);
  }

  @Test
  public void testTypeofValidStringComparison() {
    // checkTypeofString: ค่า "number" อยู่ใน whitelist -> ไม่มี warning
    Result result = compile("var x = 5; var y = (typeof x == 'number');");
    assertNoProblems(result);
  }

  @Test
  public void testTypeofInvalidStringComparison() {
    // checkTypeofString: ค่านอก whitelist -> validator.expectValidTypeofName
    // (ไม่ทราบ DiagnosticType ที่แน่ชัดของ TypeValidator จาก source ที่ให้มา
    // จึงตรวจแบบทั่วไปว่ามี warning เกิดขึ้น)
    assertHasAnyProblem("var x = 5; var y = (typeof x == 'invalidType');");
  }

  // ---------------------------------------------------------------
  // Token.DEC / INC
  // ---------------------------------------------------------------

  @Test
  public void testIncrementOnNumberOk() {
    Result result = compile("var a = 5; a++;");
    assertNoProblems(result);
  }

  @Test
  public void testIncrementOnNonNumberWarns() {
    // validator.expectNumber ควร emit warning เมื่อ increment string
    assertHasAnyProblem("var b = 'str'; b++;");
  }

  // ---------------------------------------------------------------
  // Token.EQ/NE/SHEQ/SHNE -> DETERMINISTIC_TEST
  // ---------------------------------------------------------------

  @Test
  public void testDeterministicShallowEqualityNumberVsString() {
    // สมมติฐาน: Number กับ String ไม่สามารถ shallow-equal กันได้เลย
    // (canTestForShallowEqualityWith คืน false) -> DETERMINISTIC_TEST
    assertHasWarningOrError(
        "var a = 1; var b = 'x'; var c = (a === b);",
        TypeCheck.DETERMINISTIC_TEST);
  }

  @Test
  public void testEqualityBetweenSameTypeNoWarning() {
    Result result = compile("var a = 1; var b = 2; var c = (a === b);");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // Token.LT/LE/GT/GE
  // ---------------------------------------------------------------

  @Test
  public void testNumericComparisonOk() {
    Result result = compile("var a = 1; var b = 2; var c = (a < b);");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // Token.IN / INSTANCEOF
  // ---------------------------------------------------------------

  @Test
  public void testInAndInstanceofOk() {
    Result result = compile(
        "/** @constructor */ function Foo() {}"
        + "var f = new Foo();"
        + "var b = (f instanceof Foo);"
        + "var o = {};"
        + "var c = ('x' in o);");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // Binary/Assign operators (arithmetic, bitwise)
  // ---------------------------------------------------------------

  @Test
  public void testArithmeticOperatorsOk() {
    Result result = compile(
        "var a=1+2; var b=3-1; var c=2*3; var d=4/2; var e=5%2;");
    assertNoProblems(result);
  }

  @Test
  public void testArithmeticOperatorTypeMismatch() {
    assertHasAnyProblem("var a = {} - 1;");
  }

  @Test
  public void testBitwiseOperatorsOk() {
    Result result = compile("var a=1&2; var b=1|2; var c=1^2;");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // Token.DELPROP / HOOK / AND / OR / OBJECTLIT / GETELEM / WITH / SWITCH
  // ---------------------------------------------------------------

  @Test
  public void testMiscExpressions() {
    Result result = compile(
        "var o = {a:1, b:2};"
        + "delete o.a;"
        + "var x = true ? 1 : 2;"
        + "var y = true && false;"
        + "var z = true || false;"
        + "var arr = [1,2,3];"
        + "var e = arr[0];");
    assertNoProblems(result);
  }

  @Test
  public void testWithAndSwitchStatements() {
    // "with" ใช้งานได้ใน non-strict ES5 (ยังไม่ได้ set strict mode)
    Result result = compile(
        "var o = {};"
        + "with (o) {}"
        + "var x = 1;"
        + "switch (x) { case 1: break; default: break; }");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // Token.VAR (visitVar): inferred vs declared type branch
  // ---------------------------------------------------------------

  @Test
  public void testVarInferredTypeNoJsDoc() {
    // ไม่มี @type -> var.isTypeInferred() == true branch
    Result result = compile("var x = 5; x = 'str';");
    assertNoProblems(result);
  }

  @Test
  public void testVarExplicitTypeMismatch() {
    // มี @type ชัดเจน -> var.isTypeInferred() == false, ตรวจ expectCanAssignTo
    assertHasAnyProblem("/** @type {string} */ var x = 5;");
  }

  // ---------------------------------------------------------------
  // Token.RETURN
  // ---------------------------------------------------------------

  @Test
  public void testReturnTypeMatch() {
    Result result = compile(
        "/** @return {number} */ function f() { return 5; }");
    assertNoProblems(result);
  }

  @Test
  public void testReturnTypeMismatch() {
    assertHasAnyProblem(
        "/** @return {number} */ function f() { return 'str'; }");
  }

  // ---------------------------------------------------------------
  // Token.NEW (visitNew) -> NOT_A_CONSTRUCTOR / ok path
  // ---------------------------------------------------------------

  @Test
  public void testNewOnConstructorOk() {
    Result result = compile("/** @constructor */ function Foo() {} new Foo();");
    assertNoProblems(result);
  }

  @Test
  public void testNewOnNonConstructor() {
    assertHasWarningOrError("var x = 5; new x();", TypeCheck.NOT_A_CONSTRUCTOR);
  }

  // ---------------------------------------------------------------
  // Token.CALL (visitCall) -> NOT_CALLABLE / CONSTRUCTOR_NOT_CALLABLE /
  // EXPECTED_THIS_TYPE / ok path
  // ---------------------------------------------------------------

  @Test
  public void testCallOnNonCallable() {
    assertHasWarningOrError("var x = 5; x();", TypeCheck.NOT_CALLABLE);
  }

  @Test
  public void testCallConstructorWithoutNew() {
    assertHasWarningOrError(
        "/** @constructor */ function Foo() {} Foo();",
        TypeCheck.CONSTRUCTOR_NOT_CALLABLE);
  }

  @Test
  public void testCallFunctionOk() {
    Result result = compile("function f() {} f();");
    assertNoProblems(result);
  }

  @Test
  public void testExpectedThisTypeMissing() {
    assertHasWarningOrError(
        "/** @constructor */ function Foo() {}"
        + "/** @this {Foo} */ function f() {}"
        + "f();",
        TypeCheck.EXPECTED_THIS_TYPE);
  }

  // ---------------------------------------------------------------
  // visitParameterList (loop / boundary): min/max args
  // ---------------------------------------------------------------

  @Test
  public void testWrongArgumentCountTooFew() {
    assertHasWarningOrError(
        "/** @param {number} a @param {number} b */ function f(a,b) {} f(1);",
        TypeCheck.WRONG_ARGUMENT_COUNT);
  }

  @Test
  public void testWrongArgumentCountTooMany() {
    assertHasWarningOrError(
        "/** @param {number} a */ function f(a) {} f(1,2);",
        TypeCheck.WRONG_ARGUMENT_COUNT);
  }

  @Test
  public void testCorrectArgumentCountOk() {
    Result result = compile(
        "/** @param {number} a */ function f(a) {} f(1);");
    assertNoProblems(result);
  }

  @Test
  public void testOptionalParameterBoundaryOk() {
    Result result = compile(
        "/** @param {number} a @param {number=} b */"
        + "function f(a, b) {}"
        + "f(1);"
        + "f(1,2);");
    assertNoProblems(result);
  }

  @Test
  public void testOptionalParameterTooMany() {
    assertHasWarningOrError(
        "/** @param {number} a @param {number=} b */"
        + "function f(a, b) {}"
        + "f(1,2,3);",
        TypeCheck.WRONG_ARGUMENT_COUNT);
  }

  @Test
  public void testVarArgsAcceptsManyArguments() {
    Result result = compile(
        "/** @param {...number} args */ function f(args) {} f(1,2,3,4,5);");
    assertNoProblems(result);
  }

  @Test
  public void testVarArgsAcceptsZeroArguments() {
    Result result = compile(
        "/** @param {...number} args */ function f(args) {} f();");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // visitFunction: constructor/interface inheritance branches
  // ---------------------------------------------------------------

  @Test
  public void testBadImplementedTypeNonInterface() {
    assertHasWarningOrError(
        "/** @constructor */ function Foo() {}"
        + "/** @constructor @implements {Foo} */ function Bar() {}",
        TypeCheck.BAD_IMPLEMENTED_TYPE);
  }

  @Test
  public void testConflictingImplementedTypeOnInterface() {
    assertHasWarningOrError(
        "/** @interface */ function Foo() {}"
        + "/** @interface @implements {Foo} */ function Bar() {}",
        TypeCheck.CONFLICTING_IMPLEMENTED_TYPE);
  }

  @Test
  public void testConflictingExtendedTypeInterfaceExtendsConstructor() {
    assertHasWarningOrError(
        "/** @constructor */ function Foo() {}"
        + "/** @interface @extends {Foo} */ function Bar() {}",
        TypeCheck.CONFLICTING_EXTENDED_TYPE);
  }

  @Test
  public void testConflictingExtendedTypeConstructorExtendsInterface() {
    assertHasWarningOrError(
        "/** @interface */ function Foo() {}"
        + "/** @constructor @extends {Foo} */ function Bar() {}",
        TypeCheck.CONFLICTING_EXTENDED_TYPE);
  }

  @Test
  public void testInterfaceExtendsInterfaceOk() {
    Result result = compile(
        "/** @interface */ function Foo() {}"
        + "/** @interface @extends {Foo} */ function Bar() {}");
    assertNoProblems(result);
  }

  @Test
  public void testConstructorImplementsInterfaceOk() {
    Result result = compile(
        "/** @interface */ function Foo() {}"
        + "/** @constructor @implements {Foo} */ function Bar() {}");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // checkDeclaredPropertyInheritance: UNKNOWN_OVERRIDE /
  // HIDDEN_SUPERCLASS_PROPERTY_MISMATCH / valid override
  // ---------------------------------------------------------------

  @Test
  public void testUnknownOverrideNoSuperProperty() {
    assertHasWarningOrError(
        "/** @constructor */ function Foo() {}"
        + "/** @override */ Foo.prototype.bar = function() {};",
        TypeCheck.UNKNOWN_OVERRIDE);
  }

  @Test
  public void testHiddenSuperclassPropertyMismatch() {
    // สมมติฐาน: @extends เพียงพอให้ TypedScopeCreator ผูก inheritance chain
    // โดยไม่ต้องมี Baz.prototype = new Foo() (ใช้เฉพาะระบบ type ไม่ใช่ runtime)
    assertHasWarningOrError(
        "/** @constructor */ function Foo() {}"
        + "/** @type {number} */ Foo.prototype.bar = 1;"
        + "/** @constructor @extends {Foo} */ function Baz() {}"
        + "/** @override @type {string} */ Baz.prototype.bar = 'x';",
        TypeCheck.HIDDEN_SUPERCLASS_PROPERTY_MISMATCH);
  }

  @Test
  public void testValidOverrideNoWarning() {
    Result result = compile(
        "/** @constructor */ function Foo() {}"
        + "/** @type {number} */ Foo.prototype.bar = 1;"
        + "/** @constructor @extends {Foo} */ function Baz() {}"
        + "/** @override @type {number} */ Baz.prototype.bar = 2;");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // visitGetProp: dict property access via '.', enum inexistent element
  // ---------------------------------------------------------------

  @Test
  public void testDictPropertyAccessWithDotOperator() {
    // ตรงตาม source: if (childType.isDict()) report(TypeValidator.ILLEGAL_PROPERTY_ACCESS,...)
    assertHasWarningOrError(
        "/** @constructor @dict */ function Foo() {}"
        + "var f = new Foo();"
        + "var x = f.bar;",
        TypeValidator.ILLEGAL_PROPERTY_ACCESS);
  }

  @Test
  public void testInexistentEnumElement() {
    assertHasWarningOrError(
        "/** @enum {number} */ var Color = {RED:1, GREEN:2};"
        + "var x = Color.BLUE;",
        TypeCheck.INEXISTENT_ENUM_ELEMENT);
  }

  @Test
  public void testExistentEnumElementOk() {
    Result result = compile(
        "/** @enum {number} */ var Color = {RED:1, GREEN:2};"
        + "var x = Color.RED;");
    assertNoProblems(result);
  }

  // ---------------------------------------------------------------
  // shouldTraverse: FUNCTION_MASKS_VARIABLE
  // ---------------------------------------------------------------

  /**
   * หมายเหตุ: การทดสอบนี้อ้างอิงพฤติกรรมของ Scope/TypedScopeCreator
   * ในการ resolve ชื่อ "f" ที่ประกาศทั้งเป็น var (number) และ function
   * ในสโคปเดียวกัน ซึ่งไม่ปรากฏรายละเอียดในซอร์สของ TypeCheck.java ที่ให้มา
   * โดยตรง (พึ่งพาคลาสอื่น) จึงมีความเสี่ยงที่ผลลัพธ์อาจต่างจากที่คาดไว้
   */
  @Test
  public void testFunctionMasksVariable() {
    assertHasWarningOrError(
        "var f = 1; function f() {}",
        TypeCheck.FUNCTION_MASKS_VARIABLE);
  }

  // ---------------------------------------------------------------
  // GETPROP on possibly-null (validator.expectNotNullOrUndefined branch)
  // ---------------------------------------------------------------

  @Test
  public void testPropertyAccessOnPossiblyNull() {
    assertHasAnyProblem(
        "/** @param {?Object} o */ function f(o) { return o.toString; }");
  }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testEmptySourceNoProblems, testWhitespaceOnlySource, testEmptyFunctionBody | Boundary: input ว่าง/whitespace ไม่ทำให้ crash |
| testMalformedInputDoesNotCrash | อินพุตผิดรูปแบบ (syntax error) |
| testBasicLiteralsNoWarnings | case TRUE/FALSE/NULL/NUMBER/STRING/ARRAYLIT/REGEXP |
| testThisInsideConstructor | case THIS |
| testCommaOperator | case COMMA |
| testAnonymousFunctionNoMasking | shouldTraverse: `functionPrivateName.length()>0`==false |
| testNotVoidTypeof / testTypeofValidStringComparison / testTypeofInvalidStringComparison | case NOT/VOID/TYPEOF, checkTypeofString whitelist true/false |
| testIncrementOnNumberOk / testIncrementOnNonNumberWarns | case DEC/INC, expectNumber pass/fail |
| testDeterministicShallowEqualityNumberVsString / testEqualityBetweenSameTypeNoWarning | case SHEQ: result != UNKNOWN / == UNKNOWN |
| testNumericComparisonOk | case LT/GT numeric branch |
| testInAndInstanceofOk | case IN, INSTANCEOF |
| testArithmeticOperatorsOk / testArithmeticOperatorTypeMismatch | visitBinaryOperator: SUB/ADD/MUL/DIV numeric ok/mismatch |
| testBitwiseOperatorsOk | visitBinaryOperator: BITAND/OR/XOR |
| testMiscExpressions | DELPROP, HOOK, AND, OR, OBJECTLIT, GETELEM |
| testWithAndSwitchStatements | case WITH, SWITCH/CASE |
| testVarInferredTypeNoJsDoc / testVarExplicitTypeMismatch | visitVar: `var.isTypeInferred()` true/false |
| testReturnTypeMatch / testReturnTypeMismatch | visitReturn: assignable/not assignable |
| testNewOnConstructorOk / testNewOnNonConstructor | visitNew: constructor ok / NOT_A_CONSTRUCTOR |
| testCallOnNonCallable | visitCall: `!childType.canBeCalled()` → NOT_CALLABLE |
| testCallConstructorWithoutNew | visitCall: constructor called without `new` |
| testCallFunctionOk | visitCall: normal function ok path |
| testExpectedThisTypeMissing | visitCall: EXPECTED_THIS_TYPE branch |
| testWrongArgumentCountTooFew/TooMany/CorrectArgumentCountOk | visitParameterList: minArgs/maxArgs boundary |
| testOptionalParameterBoundaryOk/TooMany | optional (`=`) parameter boundary |
| testVarArgsAcceptsManyArguments/ZeroArguments | visitParameterList loop: `parameter.isVarArgs()` |
| testBadImplementedTypeNonInterface | visitFunction: `badImplementedType=true` |
| testConflictingImplementedTypeOnInterface | visitFunction: interface `hasImplementedInterfaces()` |
| testConflictingExtendedType* (2 cases) + Ok cases | visitFunction: CONFLICTING_EXTENDED_TYPE ทั้ง 2 ทิศทาง + ok |
| testConstructorImplementsInterfaceOk | visitFunction: implement ok path |
| testUnknownOverrideNoSuperProperty | checkDeclaredPropertyInheritance: UNKNOWN_OVERRIDE branch |
| testHiddenSuperclassPropertyMismatch / testValidOverrideNoWarning | HIDDEN_SUPERCLASS_PROPERTY_MISMATCH true/false |
| testDictPropertyAccessWithDotOperator | visitGetProp: `childType.isDict()` true |
| testInexistentEnumElement / testExistentEnumElementOk | checkPropertyAccess: EnumType true/false |
| testFunctionMasksVariable | shouldTraverse: FUNCTION_MASKS_VARIABLE (มีคอมเมนต์กำกับ) |
| testPropertyAccessOnPossiblyNull | visitGetProp: expectNotNullOrUndefined branch |

**ข้อจำกัดที่ควรทราบ:** branch บางส่วน เช่น `UNEXPECTED_TOKEN` (default case), `BAD_DELETE` (ไม่ถูกเรียกใน source ที่ให้มา), `ENUM_DUP`/`ENUM_NOT_CONSTANT` (ไม่ปรากฏการเรียกใน `TypeCheck.java` ที่ให้มา สันนิษฐานว่าอยู่ใน `TypedScopeCreator`) และ `getTypedPercent()` (package-private, ต้องสร้าง `TypeCheck` instance ตรงซึ่งพึ่งพา `ReverseAbstractInterpreter`/`ScopeCreator` ที่ไม่มีรายละเอียด constructor ในซอร์สที่ให้มา) **ไม่ได้ทดสอบ** เพื่อไม่ให้เดา behavior ที่ไม่มีหลักฐานในซอร์สโค้ด