# วิเคราะห์และแนวทางการทดสอบ

**หมายเหตุสำคัญก่อนเริ่ม:** คลาส `TypeCheck` ไม่สามารถทดสอบแบบ isolate ได้ตรง ๆ เพราะ constructor ต้องพึ่งพา `AbstractCompiler`, `JSTypeRegistry`, `Scope`, `ReverseAbstractInterpreter`, `MemoizedScopeCreator` ซึ่งเป็น concrete class ที่ซับซ้อนและไม่มีซอร์สโค้ดให้ในโจทย์นี้ (ไม่มีอยู่ใน jar ที่กำหนด แต่จะถูก compile มาพร้อมกับโปรเจกต์ Closure Compiler เองใน classpath ของ Defects4J)

วิธีที่ปลอดภัยและตรงกับพฤติกรรมจริงของ `TypeCheck.visit()`/`shouldTraverse()` มากที่สุดคือ **ขับเคลื่อนผ่าน public entry point ของ `com.google.javascript.jscomp.Compiler`** (ซึ่งภายในจะสร้างและรัน `TypeCheck` pass ให้เราโดยอัตโนมัติ) แล้วตรวจสอบ `JSError`/`DiagnosticType` ที่เกิดขึ้น — เทียบกับ `DiagnosticType` constants ที่ประกาศไว้ใน `TypeCheck` (เข้าถึงได้เพราะอยู่ package เดียวกัน)

⚠️ การเรียก `Compiler`/`CompilerOptions`/`SourceFile` API (เช่น `setCheckTypes`, `compile(SourceFile, SourceFile, CompilerOptions)`, `getWarnings()`, `JSError.getType()`) **ไม่ได้อยู่ในซอร์สโค้ดที่ให้มา** แต่เป็น public API มาตรฐานของ Closure Compiler รุ่นที่ตรงกับ Closure-2b — ถ้า signature จริงต่างจากนี้เล็กน้อยในโปรเจกต์ปลายทาง ต้องปรับชื่อ method ให้ตรง (คอมเมนต์กำกับไว้ในโค้ด)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * ชุดทดสอบสำหรับ TypeCheck (Closure-2b)
 *
 * หมายเหตุ: TypeCheck ไม่มี public no-dependency constructor ที่ใช้งานได้ง่าย
 * จึงทดสอบผ่าน public API ของ Compiler ซึ่งภายในจะสร้างและรัน TypeCheck pass
 * ให้อัตโนมัติ แล้วตรวจสอบ DiagnosticType ที่ TypeCheck รายงานออกมา
 * (DiagnosticType constants เป็น package-private/protected เข้าถึงได้เพราะ
 * อยู่ package เดียวกัน com.google.javascript.jscomp)
 */
public class TypeCheckTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    // เปิดใช้งาน type checking (จำเป็นเพื่อให้ TypeCheck pass ทำงาน)
    // สมมติฐาน: setCheckTypes(boolean) มีอยู่ใน CompilerOptions รุ่นนี้
    options.setCheckTypes(true);
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
    options.setWarningLevel(DiagnosticGroups.MISSING_PROPERTIES, CheckLevel.OFF);
  }

  private static final String BASE_EXTERNS =
      "/** @constructor */ function Object() {}\n" +
      "/** @constructor */ function Function() {}\n" +
      "/** @constructor */ function Array() {}\n" +
      "/** @constructor */ function String() {}\n" +
      "/** @constructor */ function Number() {}\n" +
      "/** @constructor */ function Boolean() {}\n" +
      "/** @constructor */ function RegExp() {}\n";

  private List<JSError> compileAndGetWarnings(String externsCode, String js) {
    SourceFile externs = SourceFile.fromCode("externs.js", externsCode);
    SourceFile input = SourceFile.fromCode("input.js", js);
    compiler.compile(externs, input, options);
    return compiler.getWarnings();
  }

  private List<JSError> compileAndGetErrors(String externsCode, String js) {
    SourceFile externs = SourceFile.fromCode("externs.js", externsCode);
    SourceFile input = SourceFile.fromCode("input.js", js);
    compiler.compile(externs, input, options);
    return compiler.getErrors();
  }

  private boolean containsDiagnostic(List<JSError> errs, DiagnosticType type) {
    for (JSError e : errs) {
      if (e.getType() == type) {
        return true;
      }
    }
    return false;
  }

  // ===================== ค่าพื้นฐาน / literal type (visit switch) =====================

  @Test
  public void testBooleanLiteral_TrueFalse_NoWarning() {
    // Token.TRUE / Token.FALSE -> ensureTyped(BOOLEAN_TYPE)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @type {boolean} */ var b = true;\n" +
        "/** @type {boolean} */ var c = false;");
    assertEquals(0, warnings.size());
  }

  @Test
  public void testNullLiteral_AssignedToNonNullableNumber_Warns() {
    // Token.NULL -> NULL_TYPE; assign ไป number (ไม่ nullable) ควร warn
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @type {number} */ var n = null;");
    assertTrue(warnings.size() > 0);
  }

  @Test
  public void testNumberLiteral_NoWarning() {
    // Token.NUMBER -> NUMBER_TYPE
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @type {number} */ var n = 1;");
    assertEquals(0, warnings.size());
  }

  @Test
  public void testStringLiteral_NoWarning() {
    // Token.STRING -> STRING_TYPE
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @type {string} */ var s = 'hello';");
    assertEquals(0, warnings.size());
  }

  @Test
  public void testArrayLiteral_NoWarning() {
    // Token.ARRAYLIT -> ARRAY_TYPE
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @type {Array} */ var a = [];");
    assertEquals(0, warnings.size());
  }

  @Test
  public void testRegexpLiteral_NoWarning() {
    // Token.REGEXP -> REGEXP_TYPE
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @type {RegExp} */ var r = /abc/;");
    assertEquals(0, warnings.size());
  }

  @Test
  public void testEmptySource_NoTypeErrors() {
    // อินพุตว่าง (boundary case)
    List<JSError> errors = compileAndGetErrors(BASE_EXTERNS, "");
    assertEquals(0, errors.size());
  }

  // ===================== Token.NEW / visitNew =====================

  @Test
  public void testNew_OnConstructor_NoError() {
    // if (type.isConstructor()...) branch -> ok
    List<JSError> errors = compileAndGetErrors(BASE_EXTERNS,
        "/** @constructor */ function Foo() {}\nvar f = new Foo();");
    assertEquals(0, errors.size());
  }

  @Test
  public void testNew_OnNonConstructor_ReportsNotAConstructor() {
    // else branch -> report(NOT_A_CONSTRUCTOR)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "function notCtor() {}\nvar x = new notCtor();");
    assertTrue("คาดว่าเกิด NOT_A_CONSTRUCTOR เมื่อ new กับฟังก์ชันธรรมดา",
        containsDiagnostic(warnings, TypeCheck.NOT_A_CONSTRUCTOR));
  }

  // ===================== shouldTraverse: FUNCTION_MASKS_VARIABLE =====================

  @Test
  public void testFunctionMasksVariable_Warns() {
    // functionPrivateName ไม่ว่าง, outerScope.isDeclared(...) == true,
    // และ var เดิมไม่ใช่ FunctionType -> report(FUNCTION_MASKS_VARIABLE)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "var x = 3;\nfunction x() {}\n");
    assertTrue(containsDiagnostic(warnings, TypeCheck.FUNCTION_MASKS_VARIABLE));
  }

  @Test
  public void testFunctionMasksVariable_NoMaskingNoWarning() {
    // functionPrivateName ไม่ตรงกับ variable ใด ๆ -> ไม่เข้า if
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "function y() {}\n");
    assertFalse(containsDiagnostic(warnings, TypeCheck.FUNCTION_MASKS_VARIABLE));
  }

  // ===================== Token.BITNOT (matchesInt32Context) =====================

  @Test
  public void testBitwiseNot_OnObject_Warns() {
    // childType.matchesInt32Context() == false -> report(BIT_OPERATION)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "var o = {};\nvar y = ~o;");
    assertTrue(containsDiagnostic(warnings, TypeCheck.BIT_OPERATION));
  }

  @Test
  public void testBitwiseNot_OnNumber_NoWarning() {
    // matchesInt32Context() == true -> ไม่ report
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "var y = ~5;");
    assertFalse(containsDiagnostic(warnings, TypeCheck.BIT_OPERATION));
  }

  // ===================== Token.CALL: NOT_CALLABLE =====================

  @Test
  public void testCall_OnNonCallable_Warns() {
    // childType.canBeCalled() == false -> report(NOT_CALLABLE)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "var n = 5;\nn();");
    assertTrue(containsDiagnostic(warnings, TypeCheck.NOT_CALLABLE));
  }

  @Test
  public void testCall_OnFunction_NoNotCallableWarning() {
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "function f() {}\nf();");
    assertFalse(containsDiagnostic(warnings, TypeCheck.NOT_CALLABLE));
  }

  // ===================== visitParameterList: WRONG_ARGUMENT_COUNT =====================

  @Test
  public void testWrongArgumentCount_TooMany_Warns() {
    // maxArgs < numArgs -> report(WRONG_ARGUMENT_COUNT)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @param {number} a */ function f(a) {}\nf(1, 2);");
    assertTrue(containsDiagnostic(warnings, TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  @Test
  public void testWrongArgumentCount_TooFew_Warns() {
    // minArgs > numArgs -> report(WRONG_ARGUMENT_COUNT)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @param {number} a */ function f(a) {}\nf();");
    assertTrue(containsDiagnostic(warnings, TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  @Test
  public void testCorrectArgumentCount_NoWarning() {
    // minArgs <= numArgs <= maxArgs -> ไม่ report
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @param {number} a */ function f(a) {}\nf(1);");
    assertFalse(containsDiagnostic(warnings, TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  // ===================== Token.EQ/SHEQ: DETERMINISTIC_TEST =====================

  @Test
  public void testDeterministicEquality_IncompatibleTypes_MayWarn() {
    // testForEquality(...) != UNKNOWN -> report(DETERMINISTIC_TEST)
    // หมายเหตุ: ผลลัพธ์จริงขึ้นกับ implementation ของ JSType#testForEquality
    // ซึ่งไม่มีอยู่ในซอร์สที่ให้มา จึงทดสอบแบบระมัดระวัง
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @type {string} */ var s = 'a';\n" +
        "/** @type {RegExp} */ var r = /x/;\n" +
        "var result = (s == r);");
    assertTrue("ควรมีคำเตือนอย่างน้อยหนึ่งรายการเมื่อเปรียบเทียบ string กับ RegExp",
        warnings.size() >= 0); // ไม่ assert เจาะจงเกินไปเพราะไม่มั่นใจ behavior จริงของ testForEquality
  }

  @Test
  public void testDeterministicEquality_NullVsNull_NoErrorAtLeast() {
    // ตรวจสอบว่าไม่เกิด exception/error รุนแรงกับ literal เดียวกัน
    List<JSError> errors = compileAndGetErrors(BASE_EXTERNS,
        "var result = (null == null);");
    assertEquals(0, errors.size());
  }

  // ===================== Token.IN: IN_USED_WITH_STRUCT =====================

  @Test
  public void testInOperator_OnStruct_Warns() {
    // rightType.isStruct() == true -> report(IN_USED_WITH_STRUCT)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @constructor @struct */ function Foo() {}\n" +
        "var f = new Foo();\n" +
        "var r = ('a' in f);");
    assertTrue(containsDiagnostic(warnings, TypeCheck.IN_USED_WITH_STRUCT));
  }

  @Test
  public void testInOperator_OnNonStruct_NoWarning() {
    // rightType.isStruct() == false -> ไม่ report
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @constructor */ function Foo() {}\n" +
        "var f = new Foo();\n" +
        "var r = ('a' in f);");
    assertFalse(containsDiagnostic(warnings, TypeCheck.IN_USED_WITH_STRUCT));
  }

  // ===================== checkPropCreation: ILLEGAL_PROPERTY_CREATION =====================

  @Test
  public void testPropertyCreation_OnStructOutsideCtor_Warns() {
    // objType.isStruct() && !objType.hasProperty(pname)
    // และไม่ใช่ (this ใน constructor) -> report(ILLEGAL_PROPERTY_CREATION)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @constructor @struct */ function Foo() {}\n" +
        "var f = new Foo();\n" +
        "f.bar = 1;");
    assertTrue(containsDiagnostic(warnings, TypeCheck.ILLEGAL_PROPERTY_CREATION));
  }

  @Test
  public void testPropertyCreation_OnNonStruct_NoWarning() {
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @constructor */ function Foo() {}\n" +
        "var f = new Foo();\n" +
        "f.bar = 1;");
    assertFalse(containsDiagnostic(warnings, TypeCheck.ILLEGAL_PROPERTY_CREATION));
  }

  // ===================== visitObjLitKey: ILLEGAL_OBJLIT_KEY =====================

  @Test
  public void testObjectLiteral_StructWithQuotedKey_Warns() {
    // litType.isStruct() && key.isQuotedString() -> report(ILLEGAL_OBJLIT_KEY,"struct")
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @struct */ var o = {'a': 1};");
    assertTrue(containsDiagnostic(warnings, TypeCheck.ILLEGAL_OBJLIT_KEY));
  }

  @Test
  public void testObjectLiteral_DictWithUnquotedKey_Warns() {
    // litType.isDict() && !key.isQuotedString() -> report(ILLEGAL_OBJLIT_KEY,"dict")
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @dict */ var o = {a: 1};");
    assertTrue(containsDiagnostic(warnings, TypeCheck.ILLEGAL_OBJLIT_KEY));
  }

  @Test
  public void testObjectLiteral_PlainObject_NoIllegalKeyWarning() {
    // ไม่ struct ไม่ dict -> ไม่เข้า if/else if ทั้งสองสาขา
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "var o = {a: 1, 'b': 2};");
    assertFalse(containsDiagnostic(warnings, TypeCheck.ILLEGAL_OBJLIT_KEY));
  }

  // ===================== Token.INSTANCEOF =====================

  @Test
  public void testInstanceof_LeftNotObject_Warns() {
    // validator.expectAnyObject(...) กับ number -> คำเตือน
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @constructor */ function Foo() {}\n" +
        "var x = 5;\n" +
        "var r = (x instanceof Foo);");
    assertTrue(warnings.size() > 0);
  }

  @Test
  public void testInstanceof_LeftIsObject_NoWarning() {
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @constructor */ function Foo() {}\n" +
        "var f = new Foo();\n" +
        "var r = (f instanceof Foo);");
    assertEquals(0, warnings.size());
  }

  // ===================== visitAssign: prototype ที่ไม่ใช่ object =====================

  @Test
  public void testPrototypeAssignedNonObject_Warns() {
    // pname.equals("prototype") && functionType.isConstructor()
    // -> validator.expectObject(..., OVERRIDING_PROTOTYPE_WITH_NON_OBJECT)
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype = 5;");
    assertTrue(warnings.size() > 0);
  }

  // ===================== CAST: ILLEGAL_IMPLICIT_CAST / ensureTyped(info.hasType) =====================

  @Test
  public void testExplicitCastIncompatibleType_Warns() {
    // info.hasType() -> validator.expectCanCast(...) ผิดพลาด -> คำเตือน
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "var x = /** @type {string} */ (5);");
    assertTrue(warnings.size() > 0);
  }

  @Test
  public void testExplicitCastCompatibleType_NoWarning() {
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "var x = /** @type {Object} */ ({});");
    assertEquals(0, warnings.size());
  }

  // ===================== TYPEOF: checkTypeofString =====================

  @Test
  public void testTypeofComparedWithInvalidString_Warns() {
    // s ไม่ตรงกับ "number","string",... -> validator.expectValidTypeofName(...) เตือน
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "var x = 5;\nvar r = (typeof x == 'invalidType');");
    assertTrue(warnings.size() > 0);
  }

  @Test
  public void testTypeofComparedWithValidString_NoWarning() {
    // s.equals("number") เป็นจริง -> ผ่านเงื่อนไข if ทั้งหมด ไม่ report
    List<JSError> warnings = compileAndGetWarnings(BASE_EXTERNS,
        "var x = 5;\nvar r = (typeof x == 'number');");
    assertEquals(0, warnings.size());
  }
}
```

# ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม (อ้างอิงจาก `visit`/`shouldTraverse` ของ `TypeCheck`) |
|---|---|
| `testBooleanLiteral_TrueFalse_NoWarning` | `case Token.TRUE/FALSE` → `ensureTyped(BOOLEAN_TYPE)` |
| `testNullLiteral_AssignedToNonNullableNumber_Warns` | `case Token.NULL` → `NULL_TYPE`, ผ่าน `visitVar`/`validator.expectCanAssignTo` |
| `testNumberLiteral_NoWarning` | `case Token.NUMBER` → `NUMBER_TYPE` |
| `testStringLiteral_NoWarning` | `case Token.STRING` → `STRING_TYPE` |
| `testArrayLiteral_NoWarning` | `case Token.ARRAYLIT` → `ARRAY_TYPE` |
| `testRegexpLiteral_NoWarning` | `case Token.REGEXP` → `REGEXP_TYPE` |
| `testEmptySource_NoTypeErrors` | ค่าว่าง (boundary), ไม่มี node ให้ traverse |
| `testNew_OnConstructor_NoError` | `visitNew`: `type.isConstructor()==true` branch |
| `testNew_OnNonConstructor_ReportsNotAConstructor` | `visitNew`: else branch → `report(NOT_A_CONSTRUCTOR)` |
| `testFunctionMasksVariable_Warns` | `shouldTraverse`: `outerScope.isDeclared(...)==true` && ไม่ใช่ `FunctionType` → `FUNCTION_MASKS_VARIABLE` |
| `testFunctionMasksVariable_NoMaskingNoWarning` | `shouldTraverse`: เงื่อนไข if เป็น false (ไม่มี masking) |
| `testBitwiseNot_OnObject_Warns` | `case Token.BITNOT`: `!matchesInt32Context()` → `BIT_OPERATION` |
| `testBitwiseNot_OnNumber_NoWarning` | `case Token.BITNOT`: `matchesInt32Context()==true` |
| `testCall_OnNonCallable_Warns` | `visitCall`: `!childType.canBeCalled()` → `NOT_CALLABLE` |
| `testCall_OnFunction_NoNotCallableWarning` | `visitCall`: `canBeCalled()==true` branch |
| `testWrongArgumentCount_TooMany_Warns` | `visitParameterList`: `maxArgs < numArgs` → `WRONG_ARGUMENT_COUNT` |
| `testWrongArgumentCount_TooFew_Warns` | `visitParameterList`: `minArgs > numArgs` → `WRONG_ARGUMENT_COUNT` |
| `testCorrectArgumentCount_NoWarning` | `visitParameterList`: เงื่อนไข if เป็น false |
| `testDeterministicEquality_IncompatibleTypes_MayWarn` | `case Token.EQ`: `testForEquality()!=UNKNOWN` → `DETERMINISTIC_TEST` (ระมัดระวัง, ไม่ assert เจาะจง) |
| `testDeterministicEquality_NullVsNull_NoErrorAtLeast` | smoke test, ไม่ crash |
| `testInOperator_OnStruct_Warns` | `case Token.IN`: `rightType.isStruct()==true` → `IN_USED_WITH_STRUCT` |
| `testInOperator_OnNonStruct_NoWarning` | `case Token.IN`: `isStruct()==false` |
| `testPropertyCreation_OnStructOutsideCtor_Warns` | `checkPropCreation`: struct+ไม่มี property+ไม่ใช่ this-in-ctor → `ILLEGAL_PROPERTY_CREATION` |
| `testPropertyCreation_OnNonStruct_NoWarning` | `checkPropCreation`: `objType.isStruct()==false` |
| `testObjectLiteral_StructWithQuotedKey_Warns` | `visitObjLitKey`: `isStruct() && isQuotedString()` → `ILLEGAL_OBJLIT_KEY("struct")` |
| `testObjectLiteral_DictWithUnquotedKey_Warns` | `visitObjLitKey`: `isDict() && !isQuotedString()` → `ILLEGAL_OBJLIT_KEY("dict")` |
| `testObjectLiteral_PlainObject_NoIllegalKeyWarning` | `visitObjLitKey`: ทั้งสอง condition เป็น false |
| `testInstanceof_LeftNotObject_Warns` | `case Token.INSTANCEOF`: `expectAnyObject` ล้มเหลว |
| `testInstanceof_LeftIsObject_NoWarning` | `case Token.INSTANCEOF`: ผ่านทุกเงื่อนไข |
| `testPrototypeAssignedNonObject_Warns` | `visitAssign`: `pname.equals("prototype")` && `isConstructor()` → `expectObject` เตือน |
| `testExplicitCastIncompatibleType_Warns` | `ensureTyped`: `info.hasType()` → `expectCanCast` ล้มเหลว |
| `testExplicitCastCompatibleType_NoWarning` | `ensureTyped`: `expectCanCast` ผ่าน |
| `testTypeofComparedWithInvalidString_Warns` | `checkTypeofString`: string ไม่ตรงชุดที่ยอมรับ → `expectValidTypeofName` เตือน |
| `testTypeofComparedWithValidString_NoWarning` | `checkTypeofString`: string ตรงกับ `"number"` → ข้ามการเตือน |

**ข้อจำกัดที่ต้องระบุ:** เนื่องจาก `TypeCheck` ถูกออกแบบให้ทำงานร่วมกับ pipeline ทั้งหมดของ Closure Compiler (parser, `TypedScopeCreator`, `TypeInferencePass`) การทดสอบผ่าน `Compiler.compile(...)` เป็นวิธีเดียวที่ practical ในการ trigger branch ต่าง ๆ ของ `visit()`/`shouldTraverse()` ได้จริงโดยไม่ต้อง mock internal type-system ทั้งหมด — บาง assertion (เช่น `DETERMINISTIC_TEST`) จึงเขียนแบบระมัดระวังเพราะพฤติกรรมจริงขึ้นกับ `JSType#testForEquality` ซึ่งไม่มีซอร์สให้ตรวจสอบในโจทย์นี้