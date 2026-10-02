# วิเคราะห์และแนวทางการทดสอบ

**ข้อจำกัดสำคัญที่ต้องพิจารณา:** classpath ที่กำหนดไม่มี mocking framework (Mockito/EasyMock) ดังนั้นจึงไม่สามารถ mock `AbstractCompiler`, `JSTypeRegistry`, `Node` ฯลฯ ได้ วิธีที่ทำได้จริงและปลอดภัยที่สุดคือ:

1. ใช้ `com.google.javascript.jscomp.Compiler` (คลาสจริงในโปรเจกต์เดียวกัน ไม่ใช่ jar ภายนอก) รัน pipeline การคอมไพล์จริงเพื่อ trigger การทำงานของ `TypeCheck` ผ่าน `CompilerOptions.setCheckTypes(true)`
2. เขียน `TypeCheckTest` ให้อยู่ใน package เดียวกัน (`com.google.javascript.jscomp`) เพื่อเข้าถึง package-private constructor/method ของ `TypeCheck` ได้ (สำหรับทดสอบ boundary เช่น `check(null,...)` และ `getTypedPercent()`)
3. Diagnostic message ที่ตรวจสอบ ใช้ substring ที่ **มาจาก literal string ในซอร์สที่ให้มาโดยตรง** (เช่น `BAD_DELETE`, `NOT_A_CONSTRUCTOR` เป็นต้น) ส่วนกรณีที่ต้องพึ่งพา `TypeValidator` (ซึ่งไม่มีซอร์สให้) จะ**คอมเมนต์กำกับว่าเป็นสมมติฐาน**

```java
package com.google.javascript.jscomp;

// หมายเหตุ: ไม่ต้อง import TypeCheck เพราะอยู่ package เดียวกัน (com.google.javascript.jscomp)
// ทำให้เข้าถึง package-private constructor / method (check, getTypedPercent, reportMissingProperties) ได้โดยตรง
// classpath ที่กำหนดไม่มี mocking framework จึงทดสอบผ่าน Compiler จริง (integration-style)
// เพื่อ trigger TypeCheck pass ผ่าน CompilerOptions#setCheckTypes(true)

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeCheckTest {

  // ใช้ externs ว่างเปล่า/น้อยที่สุด เพราะ native type (NUMBER, OBJECT, BOOLEAN, STRING ฯลฯ)
  // ถูกสร้างภายใน JSTypeRegistry เองไม่ต้องพึ่ง externs
  private static final String EMPTY_EXTERNS = "";

  @Before
  public void setUp() {
    // ไม่มี state ร่วมระหว่างเทส เพราะแต่ละเทสสร้าง Compiler ใหม่ของตัวเอง
  }

  // ---------- Helper: full pipeline compile ----------

  private Compiler compile(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);
    SourceFile externs = SourceFile.fromCode("externs.js", EMPTY_EXTERNS);
    SourceFile src = SourceFile.fromCode("src.js", js);
    compiler.compile(externs, src, options);
    return compiler;
  }

  private void assertContainsMessage(JSError[] errors, String substring) {
    StringBuilder all = new StringBuilder();
    for (JSError e : errors) {
      all.append(e.toString()).append("\n");
      if (e.toString().contains(substring)) {
        return;
      }
    }
    fail("Expected a diagnostic containing: [" + substring + "] but got:\n" + all);
  }

  private void assertNoMessageContains(JSError[] errors, String substring) {
    for (JSError e : errors) {
      assertFalse("Unexpected diagnostic: " + e, e.toString().contains(substring));
    }
  }

  // ---------- Helper: direct package-private construction ----------

  private TypeCheck createDirectTypeCheck() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    JSTypeRegistry registry = compiler.getTypeRegistry();
    // สมมติฐาน: SemanticReverseAbstractInterpreter มี constructor (CodingConvention, JSTypeRegistry)
    // (คลาสนี้ไม่ได้อยู่ในซอร์สที่ให้มา แต่เป็น collaborator ที่ TypeCheck ต้องการ)
    ReverseAbstractInterpreter interpreter =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    return new TypeCheck(compiler, interpreter, registry); // package-private constructor
  }

  // =========================================================
  // 1. Boundary / null tests บนเมธอด check() โดยตรง
  // =========================================================

  @Test(expected = NullPointerException.class)
  public void testCheck_nullNode_throwsNPE() {
    // Preconditions.checkNotNull(node) ในเมธอด check(Node, boolean)
    TypeCheck typeCheck = createDirectTypeCheck();
    typeCheck.check(null, false);
  }

  @Test
  public void testGetTypedPercent_defaultIsZero() {
    // total = nullCount+unknownCount+typedCount == 0 ตอนเริ่มต้น -> เข้าสาขา (total==0) return 0.0
    TypeCheck typeCheck = createDirectTypeCheck();
    assertEquals(0.0, typeCheck.getTypedPercent(), 0.0001);
  }

  @Test
  public void testReportMissingProperties_chaining() {
    // ทดสอบว่าเมธอด chain-return-this ทำงาน (branch: reportMissingProperties=false)
    TypeCheck typeCheck = createDirectTypeCheck();
    TypeCheck same = typeCheck.reportMissingProperties(false);
    assertSame(typeCheck, same);
  }

  // =========================================================
  // 2. Malformed input (parse error) - ไม่เกี่ยวกับ TypeCheck ตรง ๆ
  //    แต่ยืนยันว่า pipeline จัดการ error ได้โดยไม่ throw exception
  // =========================================================

  @Test
  public void testMalformedInput_producesParseError() {
    Compiler c = compile("var x = ;");
    assertTrue("Expected at least one parse error", c.getErrorCount() > 0);
  }

  @Test
  public void testEmptySource_noErrorsNoWarnings() {
    Compiler c = compile("");
    assertEquals(0, c.getErrorCount());
    // ไม่ assert warnings==0 อย่างเข้มงวด เผื่อ pass อื่นเตือนเรื่องไฟล์ว่าง
  }

  // =========================================================
  // 3. Token.CALL: NOT_CALLABLE / CONSTRUCTOR_NOT_CALLABLE
  // =========================================================

  @Test
  public void testCall_onNumber_notCallable() {
    Compiler c = compile("var x = 1; x();");
    // NOT_CALLABLE message template: "{0} expressions are not callable"
    assertContainsMessage(c.getWarnings(), "expressions are not callable");
  }

  @Test
  public void testCall_constructorCalledWithoutNew_warns() {
    Compiler c = compile("/** @constructor */ function Foo() {} Foo();");
    // CONSTRUCTOR_NOT_CALLABLE: "Constructor {0} should be called with the \"new\" keyword"
    assertContainsMessage(c.getWarnings(), "should be called with the");
  }

  @Test
  public void testCall_constructorCalledWithNew_noConstructorWarning() {
    Compiler c = compile("/** @constructor */ function Foo() {} new Foo();");
    assertNoMessageContains(c.getWarnings(), "should be called with the");
    assertNoMessageContains(c.getWarnings(), "expressions are not callable");
  }

  // =========================================================
  // 4. Token.NEW: NOT_A_CONSTRUCTOR
  // =========================================================

  @Test
  public void testNew_onOrdinaryFunction_notAConstructor() {
    Compiler c = compile("function f() {} new f();");
    // NOT_A_CONSTRUCTOR: "cannot instantiate non-constructor"
    assertContainsMessage(c.getWarnings(), "cannot instantiate non-constructor");
  }

  // =========================================================
  // 5. Token.DELPROP: BAD_DELETE (isReference true/false branch)
  // =========================================================

  @Test
  public void testDelete_onNonReferenceExpression_badDelete() {
    Compiler c = compile("delete (1 + 1);");
    // BAD_DELETE: "delete operator needs a reference operand"
    assertContainsMessage(c.getWarnings(), "delete operator needs a reference operand");
  }

  @Test
  public void testDelete_onGetPropReference_noBadDeleteWarning() {
    Compiler c = compile("var x = {}; delete x.a;");
    assertNoMessageContains(c.getWarnings(), "delete operator needs a reference operand");
  }

  // =========================================================
  // 6. visitParameterList: WRONG_ARGUMENT_COUNT (min/max boundary)
  // =========================================================

  @Test
  public void testCall_tooFewArguments_wrongArgumentCount() {
    Compiler c = compile("function f(a, b) {} f(1);");
    // WRONG_ARGUMENT_COUNT: "...called with {1} argument(s). Function requires at least {2} argument(s)..."
    assertContainsMessage(c.getWarnings(), "argument(s)");
  }

  @Test
  public void testCall_tooManyArguments_wrongArgumentCount() {
    Compiler c = compile("function f(a) {} f(1, 2, 3);");
    assertContainsMessage(c.getWarnings(), "argument(s)");
  }

  @Test
  public void testCall_exactArgumentCount_noWarning() {
    Compiler c = compile("function f(a, b) {} f(1, 2);");
    assertNoMessageContains(c.getWarnings(), "argument(s)");
  }

  // =========================================================
  // 7. Token.BITNOT / shift ops: BIT_OPERATION
  // =========================================================

  @Test
  public void testBitnot_onObjectType_bitOperationWarning() {
    Compiler c = compile("var x = {}; var y = ~x;");
    // BIT_OPERATION: "operator {0} cannot be applied to {1}"
    assertContainsMessage(c.getWarnings(), "cannot be applied to");
  }

  @Test
  public void testShiftLeft_onObjectType_bitOperationWarning() {
    Compiler c = compile("var x = {}; var y = x << 1;");
    assertContainsMessage(c.getWarnings(), "cannot be applied to");
  }

  @Test
  public void testShiftLeft_onNumberType_noWarning() {
    Compiler c = compile("var x = 1; var y = x << 1;");
    assertNoMessageContains(c.getWarnings(), "cannot be applied to");
  }

  // =========================================================
  // 8. Token.RETURN: visitReturn (inconsistent return type)
  // สมมติฐาน: TypeValidator ฝัง description string ที่ส่งเข้าไปไว้ใน message จริง
  // =========================================================

  @Test
  public void testReturn_typeMismatch_warns() {
    Compiler c = compile("/** @return {string} */ function f() { return 1; }");
    assertContainsMessage(c.getWarnings(), "inconsistent return type");
  }

  @Test
  public void testReturn_typeMatches_noWarning() {
    Compiler c = compile("/** @return {number} */ function f() { return 1; }");
    assertNoMessageContains(c.getWarnings(), "inconsistent return type");
  }

  // =========================================================
  // 9. visitAssign: object.prototype = non-object
  // =========================================================

  @Test
  public void testAssign_overridingPrototypeWithNonObject_warns() {
    Compiler c = compile("/** @constructor */ function Foo() {} Foo.prototype = 1;");
    // OVERRIDING_PROTOTYPE_WITH_NON_OBJECT literal constant
    assertContainsMessage(c.getWarnings(), "overriding prototype with non-object");
  }

  // =========================================================
  // 10. visitVar: initializing variable (var.isTypeInferred()==false branch)
  // =========================================================

  @Test
  public void testVar_initializingVariable_typeMismatch_warns() {
    Compiler c = compile("/** @type {string} */ var x = 1;");
    assertContainsMessage(c.getWarnings(), "initializing variable");
  }

  @Test
  public void testVar_initializingVariable_typeMatches_noWarning() {
    Compiler c = compile("/** @type {string} */ var x = 'a';");
    assertNoMessageContains(c.getWarnings(), "initializing variable");
  }

  // =========================================================
  // 11. visitGetProp: expectNotNullOrUndefined -> "has no properties"
  // =========================================================

  @Test
  public void testGetProp_onNullType_hasNoProperties() {
    Compiler c = compile("var x = null; var y = x.foo;");
    assertContainsMessage(c.getWarnings(), "has no properties");
  }

  // =========================================================
  // 12. checkEnumInitializer: OBJECTLIT branch / EnumType-copy branch
  // =========================================================

  @Test
  public void testEnumInitializer_objectLiteralElementTypeMismatch_warns() {
    Compiler c = compile("/** @enum {string} */ var Color = { RED: 1 };");
    assertContainsMessage(c.getWarnings(), "element type must match enum's type");
  }

  @Test
  public void testEnumInitializer_enumCopyIncompatibleType_warns() {
    Compiler c = compile(
        "/** @enum {string} */ var Color = { RED: 'r' };\n"
      + "/** @enum {number} */ var Size = Color;");
    assertContainsMessage(c.getWarnings(), "incompatible enum element types");
  }

  // =========================================================
  // 13. Token.INC/DEC, POS/NEG: expectNumber messages
  // (สมมติฐาน: description ที่ส่งเข้า validator.expectNumber ปรากฏใน message จริง)
  // =========================================================

  @Test
  public void testIncrement_onNonNumberType_warns() {
    Compiler c = compile("var x = {}; x++;");
    assertContainsMessage(c.getWarnings(), "increment/decrement");
  }

  @Test
  public void testIncrement_onNumberType_noWarning() {
    Compiler c = compile("var x = 1; x++;");
    assertNoMessageContains(c.getWarnings(), "increment/decrement");
  }

  @Test
  public void testNegate_onNonNumberType_warns() {
    Compiler c = compile("var x = {}; var y = -x;");
    assertContainsMessage(c.getWarnings(), "sign operator");
  }

  // =========================================================
  // 14. Token.AND/OR/HOOK/OBJECTLIT: ensureTyped ทั้งสองสาขา + visitObjLitKey loop
  // (ไม่ assert diagnostic เฉพาะ เพราะเป็น valid code, ตรวจว่าไม่มี error/crash)
  // =========================================================

  @Test
  public void testLogicalAndHookAndObjectLiteral_validCode_noErrors() {
    Compiler c = compile(
        "var a = 1 && 2;\n"
      + "var b = 1 || 2;\n"
      + "var cond = true ? 1 : 2;\n"
      + "var obj = { x: 1, y: 2 };");
    assertEquals(0, c.getErrorCount());
  }

  // =========================================================
  // 15. Token.CASE / Token.WITH: coverage สำหรับ branch ที่ไม่ throw exception
  // (ไม่ทราบ message format แน่ชัดของ TypeValidator ในกรณีนี้ จึงตรวจแค่ไม่ crash)
  // =========================================================

  @Test
  public void testSwitchCase_doesNotCrash() {
    Compiler c = compile("switch (1) { case 'a': break; default: break; }");
    // ครอบคลุม branch CASE ใน visit(); ไม่ assert message เพราะไม่แน่ใจ format จาก TypeValidator
    assertNotNull(c.getWarnings());
  }

  @Test
  public void testWithStatement_doesNotCrash() {
    Compiler c = compile("with (1) { }");
    // ครอบคลุม branch WITH ใน visit()
    assertNotNull(c.getWarnings());
  }

  // =========================================================
  // 16. FUNCTION_MASKS_VARIABLE (shouldTraverse)
  // หมายเหตุ: เงื่อนไข scope ขึ้นกับ implementation ภายในของ NodeTraversal/Scope
  // ที่ไม่ปรากฏในซอร์สที่ให้มาโดยตรง จึง assert แบบเบา (ไม่ crash) พร้อมคอมเมนต์กำกับ
  // =========================================================

  @Test
  public void testFunctionMasksVariable_doesNotCrash() {
    Compiler c = compile("var x = 3; function f() { function x() {} return x; }");
    assertNotNull(c.getWarnings());
  }

  // =========================================================
  // 17. Token.GETELEM: visitGetElem (index match) - sanity, no crash
  // =========================================================

  @Test
  public void testGetElem_doesNotCrash() {
    Compiler c = compile("var x = {}; var y = x['a'];");
    assertNotNull(c.getWarnings());
  }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCheck_nullNode_throwsNPE` | `check()`: `Preconditions.checkNotNull(node)` — boundary null |
| `testGetTypedPercent_defaultIsZero` | `getTypedPercent()`: branch `total==0` |
| `testReportMissingProperties_chaining` | `reportMissingProperties(boolean)` chain-return |
| `testMalformedInput_producesParseError` | อินพุตผิดรูปแบบ (parse error path) |
| `testEmptySource_noErrorsNoWarnings` | ค่าว่าง/edge-case ของ source ทั้งไฟล์ |
| `testCall_onNumber_notCallable` | `visit()` case `CALL` → `!childType.canBeCalled()` → `NOT_CALLABLE` |
| `testCall_constructorCalledWithoutNew_warns` | `visitCall()`: `functionType.isConstructor() && !isNativeObjectType()` → `CONSTRUCTOR_NOT_CALLABLE` |
| `testCall_constructorCalledWithNew_noConstructorWarning` | else-branch ของเงื่อนไขข้างบน (ไม่เตือน) |
| `testNew_onOrdinaryFunction_notAConstructor` | `visitNew()`: `type==null \|\| !isConstructor()` → `NOT_A_CONSTRUCTOR` |
| `testDelete_onNonReferenceExpression_badDelete` | `visit()` case `DELPROP`: `!isReference(n)` → `BAD_DELETE` |
| `testDelete_onGetPropReference_noBadDeleteWarning` | `isReference()` true-branch (GETPROP) |
| `testCall_tooFewArguments_wrongArgumentCount` | `visitParameterList()`: `minArgs > numArgs` |
| `testCall_tooManyArguments_wrongArgumentCount` | `visitParameterList()`: `maxArgs < numArgs` |
| `testCall_exactArgumentCount_noWarning` | เงื่อนไข `if` เป็น false ทั้งคู่ |
| `testBitnot_onObjectType_bitOperationWarning` | case `BITNOT`: `!childType.matchesInt32Context()` |
| `testShiftLeft_onObjectType_bitOperationWarning` | `visitBinaryOperator()` case `LSH`: `!leftType.matchesInt32Context()` |
| `testShiftLeft_onNumberType_noWarning` | เงื่อนไขเป็น false |
| `testReturn_typeMismatch_warns` / `noWarning` | `visitReturn()`: `jsType instanceof FunctionType`, `valueNode!=null` |
| `testAssign_overridingPrototypeWithNonObject_warns` | `visitAssign()`: `property.equals("prototype")`, `objectJsType instanceof FunctionType`, `isConstructor()` |
| `testVar_initializingVariable_typeMismatch_warns` / `noWarning` | `visitVar()`: `!var.isTypeInferred()` branch |
| `testGetProp_onNullType_hasNoProperties` | `visitGetProp()`: `!validator.expectNotNullOrUndefined(...)` → early `return` |
| `testEnumInitializer_objectLiteralElementTypeMismatch_warns` | `checkEnumInitializer()`: `value.getType()==OBJECTLIT` loop branch |
| `testEnumInitializer_enumCopyIncompatibleType_warns` | `checkEnumInitializer()`: `value.getJSType() instanceof EnumType` branch |
| `testIncrement_onNonNumberType_warns` / `noWarning` | case `INC/DEC` |
| `testNegate_onNonNumberType_warns` | case `NEG` |
| `testLogicalAndHookAndObjectLiteral_validCode_noErrors` | case `AND/OR/HOOK/OBJECTLIT`, loop `for (Node key : n.children())` |
| `testSwitchCase_doesNotCrash` | case `CASE` |
| `testWithStatement_doesNotCrash` | case `WITH` |
| `testFunctionMasksVariable_doesNotCrash` | `shouldTraverse()` FUNCTION_MASKS_VARIABLE condition |
| `testGetElem_doesNotCrash` | case `GETELEM` → `visitGetElem()` |

**หมายเหตุสำคัญ:** เทสที่มีคำว่า "doesNotCrash" หรืออิงข้อความจาก `TypeValidator`/scope internals (ที่ไม่มีซอร์สโค้ดให้) ถูก comment กำกับไว้ในโค้ดว่าเป็นสมมติฐาน เพื่อไม่ให้เดา behavior ที่ไม่ปรากฏในซอร์สที่ให้มาโดยตรง