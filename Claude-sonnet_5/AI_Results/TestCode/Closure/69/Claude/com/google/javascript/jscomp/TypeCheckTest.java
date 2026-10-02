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
