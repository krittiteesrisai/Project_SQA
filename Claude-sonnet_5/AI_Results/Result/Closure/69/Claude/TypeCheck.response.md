# TypeCheckTest.java

## หมายเหตุสำคัญก่อนเริ่ม (ข้อจำกัดและแนวทางที่เลือก)

`TypeCheck` เป็นคลาสที่ผูกกับ infrastructure ภายในของ Closure Compiler อย่างลึก (ต้องใช้ `Node` ที่มี `JSType` ติดมาแล้ว, `Scope`, `ScopeCreator`, `JSTypeRegistry`, `ReverseAbstractInterpreter` ฯลฯ) และ constructor หลักที่ใช้งานได้จริง (`TypeCheck(compiler, reverseInterpreter, typeRegistry)`) เป็น package-private และยังต้องพึ่ง `processForTesting()` ซึ่งต้องสร้าง `TypedScopeCreator` + `TypeInferencePass` ให้ครบวงจร

เนื่องจาก classpath ที่กำหนดมา **ไม่มี mocking library** (เช่น Mockito) และการ mock `JSType`/`Node`/`Scope` ด้วยมือทั้งหมดจะเสี่ยงต่อ behavior ที่ไม่ตรงกับซอร์สจริง (ผิดข้อกำหนดที่ 4) จึงเลือกใช้แนวทาง **black-box integration test ผ่าน public API ของ `Compiler`** (ซึ่งเป็นวิธีเดียวกันกับที่ทีม Closure ใช้ทดสอบ `TypeCheck` จริง) โดย compile JS snippet เล็ก ๆ แล้วตรวจสอบ `errors`/`warnings` ที่เกิดจาก branch ต่าง ๆ ใน `visit()` และ `visitFunction()` ของ `TypeCheck`

> ⚠️ คอมเมนต์กำกับ: ค่า field ของ `Result`/`JSError` (เช่น `errors`, `warnings`, `toString()`) อ้างอิงจาก public API ของ Closure Compiler ยุคเดียวกับ Closure-69; หากเวอร์ชันจริงต่างจากนี้เล็กน้อย ให้ปรับชื่อ field/เมธอดตามจริง — ไม่ได้เดา *behavior* ของ `TypeCheck` เอง เพียงแต่เดาช่องทางเข้าถึงผลลัพธ์

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

// import คลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้อยู่ package เดียวกันก็ import ได้)
import com.google.javascript.jscomp.TypeCheck;

/**
 * ชุดทดสอบสำหรับ {@link TypeCheck}
 *
 * แนวทาง: ทดสอบผ่าน public pipeline ของ {@link Compiler#compile}
 * เนื่องจาก TypeCheck ไม่สามารถ instantiate/เรียกใช้แบบ isolate ได้ง่าย
 * โดยไม่มี mocking framework (ไม่มีอยู่ใน classpath ที่กำหนด)
 */
public class TypeCheckTest {

  /**
   * Externs แบบย่อที่สุดเท่าที่จำเป็นสำหรับให้ JSTypeRegistry
   * รู้จัก native type พื้นฐาน (Object, Function, String, Number, Boolean, Array, RegExp)
   * หมายเหตุ: เป็น externs สมมติขั้นต่ำ ไม่ใช่ externs มาตรฐานเต็มรูปแบบของเบราว์เซอร์
   */
  private static final String DEFAULT_EXTERNS =
      "/** @constructor\n * @param {*=} opt_v\n * @return {!Object} */\n"
          + "function Object(opt_v) {}\n"
          + "/** @constructor\n * @param {...*} var_args */\n"
          + "function Function(var_args) {}\n"
          + "/** @constructor\n * @param {*=} opt_v\n * @return {string} */\n"
          + "function String(opt_v) {}\n"
          + "/** @constructor\n * @param {*=} opt_v\n * @return {number} */\n"
          + "function Number(opt_v) {}\n"
          + "/** @constructor\n * @param {*=} opt_v */\n"
          + "function Boolean(opt_v) {}\n"
          + "/** @constructor\n * @param {...*} var_args\n * @return {!Array} */\n"
          + "function Array(var_args) {}\n"
          + "/** @constructor */ function RegExp() {}\n"
          + "var undefined;\n";

  /** helper: compile ด้วย externs default + เปิด type checking */
  private Result compile(String js) {
    return compile(DEFAULT_EXTERNS, js);
  }

  private Result compile(String externsCode, String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // เปิดใช้งาน type checking pass (ซึ่งภายในจะสร้างและรัน TypeCheck)
    options.setCheckTypes(true);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", externsCode);
    JSSourceFile input = JSSourceFile.fromCode("input.js", js);

    return compiler.compile(externs, input, options);
  }

  /** ค้นหาว่ามี warning/error ใดที่ toString() มีข้อความ substring ที่ระบุ */
  private boolean containsMessage(JSError[] arr, String substring) {
    if (arr == null) {
      return false;
    }
    for (JSError e : arr) {
      if (e.toString().contains(substring)) {
        return true;
      }
    }
    return false;
  }

  // ---------------------------------------------------------------------
  // 1) Boundary / ค่าว่าง
  // ---------------------------------------------------------------------

  @Test
  public void testEmptySourceProducesNoErrors() {
    Result result = compile("");
    assertEquals(0, result.errors.length);
  }

  @Test
  public void testSimpleValidCodeNoTypeErrors() {
    // ค่าตัวแปรพื้นฐาน ไม่มีการ mismatch ชนิดข้อมูล
    Result result = compile("var x = 1; x = 2; var y = x + 3;");
    assertEquals(0, result.errors.length);
  }

  @Test
  public void testMalformedInputProducesParseError() {
    // อินพุตผิดรูปแบบทางไวยากรณ์ -> ควรมี error จาก parser
    // (TypeCheck จะไม่ถูกรันสมบูรณ์ แต่เป็นกรณี "อินพุตผิดรูปแบบ" ตามข้อกำหนด)
    Result result = compile("var x = ;");
    assertTrue(result.errors.length > 0);
  }

  @Test(expected = NullPointerException.class)
  public void testCompileWithNullOptionsThrowsNPE() {
    // กรณี null: เรียก compile โดยไม่ส่ง CompilerOptions
    // หมายเหตุ: ทดสอบผ่าน public API ของ Compiler เนื่องจากไม่สามารถเรียก
    // TypeCheck ตรง ๆ ได้โดยไม่มี scopeCreator/topScope (Preconditions.checkNotNull)
    Compiler compiler = new Compiler();
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", DEFAULT_EXTERNS);
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(externs, input, null);
  }

  // ---------------------------------------------------------------------
  // 2) Token.DELPROP -> isReference() true/false branch, BAD_DELETE
  // ---------------------------------------------------------------------

  @Test
  public void testBadDeleteOnNonReferenceOperand() {
    // delete บนค่า literal (ไม่ใช่ NAME/GETPROP/GETELEM) -> isReference() == false
    // -> ควร report BAD_DELETE
    Result result = compile("delete 1;");
    assertTrue(containsMessage(result.warnings, "delete operator needs a reference operand"));
  }

  @Test
  public void testDeleteOnPropertyReferenceNoWarning() {
    // delete บน GETPROP -> isReference() == true -> ไม่ควรมี BAD_DELETE warning
    Result result = compile("var obj = {}; delete obj.x;");
    assertFalse(containsMessage(result.warnings, "delete operator needs a reference operand"));
  }

  // ---------------------------------------------------------------------
  // 3) Token.NEW -> visitNew(): type==null/isConstructor() branch, NOT_A_CONSTRUCTOR
  // ---------------------------------------------------------------------

  @Test
  public void testNewOnNonConstructorNumberReportsError() {
    // x เป็น number ไม่ใช่ FunctionType -> getFunctionType คืน null
    // -> constructor.getType() != GETPROP (เป็น NAME) -> report NOT_A_CONSTRUCTOR
    Result result = compile("var x = 1; new x();");
    assertTrue(containsMessage(result.warnings, "cannot instantiate non-constructor"));
  }

  @Test
  public void testNewOnValidConstructorNoWarning() {
    Result result =
        compile("/** @constructor */ function Foo() {} var f = new Foo();");
    assertFalse(containsMessage(result.warnings, "cannot instantiate non-constructor"));
  }

  // ---------------------------------------------------------------------
  // 4) Token.CALL -> visitCall(): canBeCalled() false branch, NOT_CALLABLE
  // ---------------------------------------------------------------------

  @Test
  public void testCallOnNonCallableNumberReportsError() {
    // x เป็น number -> childType.canBeCalled() == false -> NOT_CALLABLE
    Result result = compile("var x = 1; x();");
    assertTrue(containsMessage(result.warnings, "are not callable"));
  }

  // ---------------------------------------------------------------------
  // 5) Token.SHEQ -> canTestForShallowEqualityWith() false branch
  //    DETERMINISTIC_TEST_NO_RESULT
  // ---------------------------------------------------------------------

  @Test
  public void testStrictEqualityOfIncompatiblePrimitivesAlwaysWarns() {
    // string === number ไม่สามารถ shallow-equal กันได้ตามกฎของ type system
    // -> ควร report DETERMINISTIC_TEST_NO_RESULT
    Result result = compile("var r = ('a' === 1);");
    assertTrue(containsMessage(result.warnings,
        "condition always evaluates to the same value"));
  }

  // ---------------------------------------------------------------------
  // 6) visitVar / ENUM_DUP (enum key ซ้ำ) -> Token.OBJECTLIT ในบริบท enum
  // ---------------------------------------------------------------------

  @Test
  public void testEnumDuplicateElementReportsError() {
    Result result = compile("/** @enum */ var E = { A: 1, A: 2 };");
    assertTrue(containsMessage(result.errors, "already defined"));
  }

  // ---------------------------------------------------------------------
  // 7) visitParameterList -> WRONG_ARGUMENT_COUNT (minArgs>numArgs branch)
  //    และกรณีจำนวน argument ถูกต้อง (ไม่ควร trigger)
  // ---------------------------------------------------------------------

  @Test
  public void testWrongArgumentCountTooFewReportsWarning() {
    Result result = compile("function f(a, b) {} f(1);");
    assertTrue(containsMessage(result.warnings, "Function requires at least"));
  }

  @Test
  public void testCorrectArgumentCountNoWrongArgumentCountWarning() {
    Result result = compile("function f(a, b) {} f(1, 2);");
    assertFalse(containsMessage(result.warnings, "Function requires at least"));
  }

  // ---------------------------------------------------------------------
  // 8) visitFunction(): CONFLICTING_EXTENDED_TYPE ทั้งสองทิศทาง
  //    - constructor @extends interface
  //    - interface @extends constructor
  // ---------------------------------------------------------------------

  @Test
  public void testConstructorExtendingInterfaceReportsConflict() {
    String js =
        "/** @interface */ function Foo() {}\n"
            + "/** @constructor @extends {Foo} */ function Bar() {}";
    Result result = compile(js);
    assertTrue(containsMessage(result.warnings, "cannot extend this type"));
  }

  @Test
  public void testInterfaceExtendingConstructorReportsConflict() {
    String js =
        "/** @constructor */ function Foo() {}\n"
            + "/** @interface @extends {Foo} */ function Bar() {}";
    Result result = compile(js);
    assertTrue(containsMessage(result.warnings, "cannot extend this type"));
  }

  // ---------------------------------------------------------------------
  // 9) visitFunction(): BAD_IMPLEMENTED_TYPE
  //    (constructor implements ชนิดที่ไม่ใช่ interface)
  // ---------------------------------------------------------------------

  @Test
  public void testClassImplementingNonInterfaceReportsError() {
    String js =
        "/** @constructor */ function Foo() {}\n"
            + "/** @constructor @implements {Foo} */ function Bar() {}";
    Result result = compile(js);
    assertTrue(containsMessage(result.warnings, "can only implement interfaces"));
  }

  // ---------------------------------------------------------------------
  // 10) visitFunction(): constructor ที่ implement interface ถูกต้อง -> ไม่ error
  // ---------------------------------------------------------------------

  @Test
  public void testClassImplementingInterfaceCorrectlyNoWarning() {
    String js =
        "/** @interface */ function Foo() {}\n"
            + "/** @constructor @implements {Foo} */ function Bar() {}";
    Result result = compile(js);
    assertFalse(containsMessage(result.warnings, "can only implement interfaces"));
    assertFalse(containsMessage(result.warnings, "cannot extend this type"));
  }
}
```

## หมายเหตุเพิ่มเติม (คอมเมนต์กำกับตามข้อกำหนดที่ 4)

- `JSSourceFile.fromCode`, `CompilerOptions#setCheckTypes(boolean)`, `Result#errors/#warnings` เป็น public API ของ `Compiler` ที่ใช้เปิดทาง (entry point) ให้ `TypeCheck` ทำงานจริงตาม pipeline — ไม่ได้เดา behavior ภายในของ `TypeCheck` เอง
- `JSError#toString()` สมมติว่าประกอบด้วยข้อความจาก `DiagnosticType` (เช่น `"cannot instantiate non-constructor"`) ซึ่งตรงกับข้อความ error/warning ที่ประกาศไว้ตรงในซอร์สโค้ดเป้าหมาย (`NOT_A_CONSTRUCTOR`, `NOT_CALLABLE`, `BAD_DELETE`, `BAD_IMPLEMENTED_TYPE`, `CONFLICTING_EXTENDED_TYPE`, `ENUM_DUP`, `WRONG_ARGUMENT_COUNT`, `DETERMINISTIC_TEST_NO_RESULT`)
- ไม่ได้เขียนทดสอบสำหรับ diagnostic ที่ไม่มีทางกระตุ้นได้ผ่าน JS ปกติ (เช่น `UNEXPECTED_TOKEN` ซึ่งใช้กับ AST ที่ผิดปกติเท่านั้น) หรือ diagnostic ที่ default เป็น `disabled` (เช่น `INEXISTENT_PROPERTY`) เพื่อไม่เดา behavior ที่ไม่ปรากฏชัดในซอร์ส

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุมในซอร์ส |
|---|---|
| `testEmptySourceProducesNoErrors` | boundary: input ว่าง, pipeline ทำงานไม่ throw, `errors.length==0` |
| `testSimpleValidCodeNoTypeErrors` | เส้นทาง happy-path ของ `visit()` หลาย case (NAME, NUMBER, ASSIGN) โดยไม่ trigger warning |
| `testMalformedInputProducesParseError` | อินพุตผิดรูปแบบ (syntax error) ก่อนถึง `TypeCheck` |
| `testCompileWithNullOptionsThrowsNPE` | ค่า null ที่ทำให้ `Preconditions.checkNotNull` ใน pipeline ล้มเหลว |
| `testBadDeleteOnNonReferenceOperand` | `Token.DELPROP` → `isReference(n)==false` → `report(..., BAD_DELETE)` |
| `testDeleteOnPropertyReferenceNoWarning` | `Token.DELPROP` → `isReference(n)==true` (GETPROP case) → ไม่ report |
| `testNewOnNonConstructorNumberReportsError` | `visitNew`: `type==null` และ `constructor.getType()!=GETPROP` → `NOT_A_CONSTRUCTOR` |
| `testNewOnValidConstructorNoWarning` | `visitNew`: `type!=null && type.isConstructor()` → ensureTyped ปกติ ไม่ error |
| `testCallOnNonCallableNumberReportsError` | `visitCall`: `!childType.canBeCalled()` → `NOT_CALLABLE` |
| `testStrictEqualityOfIncompatiblePrimitivesAlwaysWarns` | `Token.SHEQ`: `!canTestForShallowEqualityWith(...)` → `DETERMINISTIC_TEST_NO_RESULT` |
| `testEnumDuplicateElementReportsError` | `checkEnumInitializer`/enum key ซ้ำ → `ENUM_DUP` |
| `testWrongArgumentCountTooFewReportsWarning` | `visitParameterList`: `minArgs > numArgs` → `WRONG_ARGUMENT_COUNT` |
| `testCorrectArgumentCountNoWrongArgumentCountWarning` | `visitParameterList`: `minArgs<=numArgs<=maxArgs` → ไม่ report (boundary ค่าพอดี) |
| `testConstructorExtendingInterfaceReportsConflict` | `visitFunction`: constructor branch, `baseConstructor.isInterface() && functionType.isConstructor()` → `CONFLICTING_EXTENDED_TYPE` |
| `testInterfaceExtendingConstructorReportsConflict` | `visitFunction`: interface branch, `extInterface.getConstructor()!=null && !isInterface()` → `CONFLICTING_EXTENDED_TYPE` |
| `testClassImplementingNonInterfaceReportsError` | `visitFunction`: constructor branch, loop `getImplementedInterfaces()`, `interfaceConstructor!=null && !isInterface()` → `BAD_IMPLEMENTED_TYPE` |
| `testClassImplementingInterfaceCorrectlyNoWarning` | `visitFunction`: constructor branch implement ถูกต้อง → `badImplementedType==false`, ไม่ report ทั้ง `BAD_IMPLEMENTED_TYPE` และ `CONFLICTING_EXTENDED_TYPE` |

หากต้องการเพิ่ม branch coverage ต่อ (เช่น `HIDDEN_SUPERCLASS_PROPERTY`, `INTERFACE_METHOD_OVERRIDE`, `FUNCTION_MASKS_VARIABLE`) จะต้องออกแบบ JS snippet ที่ซับซ้อนขึ้นมาก (multi-level inheritance, `@override`) ซึ่งมีความเสี่ยงสูงที่จะ "เดา" ผลลัพธ์ของ semantic ภายในที่ไม่ได้ระบุชัดในซอร์สที่ให้มา จึงไม่ได้รวมไว้เพื่อรักษาข้อกำหนดที่ 4