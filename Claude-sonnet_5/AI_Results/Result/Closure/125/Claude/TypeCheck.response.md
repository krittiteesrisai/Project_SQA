# วิเคราะห์และแนวทางการทดสอบ

`TypeCheck` เป็นคลาสที่พึ่งพา infrastructure ของ Closure Compiler (Compiler, CompilerOptions, JSTypeRegistry, Scope ฯลฯ) อย่างมาก ผมจึงเขียนเทสสองระดับ:

1. **Direct/white-box tests** – สร้าง `TypeCheck` ตรง ๆ ในแพ็กเกจเดียวกัน (`com.google.javascript.jscomp`) เพื่อเข้าถึง package-private method `getTypedPercent()` และทดสอบ boundary branch `(total == 0)` ได้แม่นยำโดยไม่ต้องพึ่ง full pipeline
2. **Black-box/end-to-end tests** – ใช้ `Compiler.compile(SourceFile, SourceFile, CompilerOptions)` (public API มาตรฐานของ Closure Compiler) รัน pass เต็มรูปแบบ (TypedScopeCreator → TypeInferencePass → TypeCheck) แล้วตรวจสอบ `JSError[]` ที่ได้ เพื่อครอบคลุม if/else หลาย ๆ สาขาใน `visit()`, `visitAssign()`, `visitCall()`, `visitNew()`, `visitParameterList()`, `visitObjLitKey()`, `checkDeclaredPropertyInheritance()` ฯลฯ

⚠️ **หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4):**
- Logic การตัดสินใจภายใน `TypeValidator`, `TernaryValue.testForEquality/canTestForShallowEqualityWith`, และ diagnostics ที่ *ประกาศไว้แต่ไม่ถูกเรียกใช้ในซอร์สที่ให้มา* (เช่น `ENUM_DUP`, `ENUM_NOT_CONSTANT`, `MULTIPLE_VAR_DEF`, `DETERMINISTIC_TEST`) **ไม่ได้ถูกทดสอบแบบเจาะจงผลลัพธ์** เพราะ implementation ไม่อยู่ในซอร์สที่ให้มา — จึงไม่ทดสอบเพื่อไม่ "เดา" behavior
- Field ของ `JSError` (`type`, `description`) และ method บางตัวของ `Compiler`/`SemanticReverseAbstractInterpreter` เป็นการอ้างอิงจาก public API ที่รู้จักกันทั่วไปของ Closure Compiler เวอร์ชันนี้ หากสภาพแวดล้อม compile จริงมี signature ต่างออกไปเล็กน้อย ให้ปรับตามที่ระบุคอมเมนต์ `// NOTE:` กำกับไว้

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Test;

/**
 * Unit test สำหรับ {@link TypeCheck} (Defects4J Closure-125b)
 *
 * NOTE: เนื่องจากคลาสอยู่ใน package com.google.javascript.jscomp
 * และ TypeCheckTest ถูกวางไว้ใน package เดียวกัน จึงไม่จำเป็นต้อง import
 * TypeCheck, Compiler, CompilerOptions, SourceFile, CheckLevel, JSError,
 * DiagnosticType, DiagnosticGroups (เข้าถึงได้โดยตรงเพราะเป็น
 * package-private/protected members ในแพ็กเกจเดียวกัน)
 */
public class TypeCheckTest {

  // ---------------------------------------------------------------------
  // Helper methods
  // ---------------------------------------------------------------------

  /**
   * รัน full compile pipeline (parsing + TypedScopeCreator + TypeInference
   * + TypeCheck) ผ่าน public API ของ Compiler แล้วคืนค่า Compiler
   * เพื่อให้ดึง errors/warnings ออกมาตรวจสอบได้
   */
  private Compiler runTypeCheck(String js) {
    Compiler compiler = new Compiler();
    // NOTE: disableThreads() ใช้ป้องกันปัญหา thread-pool ใน test environment
    // (สมมติฐานอ้างอิงจาก public API ทั่วไปของ Compiler เวอร์ชันนี้)
    compiler.disableThreads();

    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    options.setCheckTypes(true);
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);

    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", js);

    compiler.compile(externs, input, options);
    return compiler;
  }

  private boolean hasDiagnostic(JSError[] errs, DiagnosticType type) {
    for (JSError e : errs) {
      // NOTE: สมมติว่า JSError มี public final field ชื่อ `type`
      if (e.type == type) {
        return true;
      }
    }
    return false;
  }

  private boolean hasAnyOf(Compiler c, DiagnosticType type) {
    return hasDiagnostic(c.getErrors(), type) || hasDiagnostic(c.getWarnings(), type);
  }

  // ---------------------------------------------------------------------
  // 1) Direct / white-box tests: getTypedPercent() boundary
  // ---------------------------------------------------------------------

  @Test
  public void testGetTypedPercent_ZeroWhenNothingProcessed() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSTypeRegistry registry = compiler.getTypeRegistry();
    ReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);

    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry, CheckLevel.WARNING);

    // ไม่เรียก check()/process() เลย -> typedCount=nullCount=unknownCount=0
    // -> total==0 -> ทดสอบ branch "return 0.0" ตรง ๆ
    assertEquals(0.0, typeCheck.getTypedPercent(), 0.0001);
  }

  @Test
  public void testGetTypedPercent_PositiveAfterProcessing() {
    // NOTE: best-effort test อาศัย low-level API (init/parse/getRoot) ของ
    // Compiler ที่อาจต้องปรับ signature ตามเวอร์ชันจริงของ classpath
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);

    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1;");
    compiler.init(Lists.newArrayList(externs), Lists.newArrayList(input), options);
    compiler.parse();

    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node jsRoot = root.getLastChild();

    JSTypeRegistry registry = compiler.getTypeRegistry();
    ReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry, CheckLevel.WARNING);

    typeCheck.processForTesting(externsRoot, jsRoot);

    assertTrue(typeCheck.getTypedPercent() > 0.0);
  }

  // ---------------------------------------------------------------------
  // 2) Baseline / smoke tests
  // ---------------------------------------------------------------------

  @Test
  public void testNoWarnings_WellTypedSimpleCode() {
    Compiler c = runTypeCheck(
        "/** @param {number} a\n"
        + " * @param {number} b\n"
        + " * @return {number} */\n"
        + "function add(a, b) { return a + b; }\n"
        + "var result = add(1, 2);");
    assertEquals(0, c.getErrors().length);
  }

  @Test
  public void testDeleteProperty_NoCrashNoWarning() {
    Compiler c = runTypeCheck("var obj = {}; delete obj.foo;");
    assertEquals(0, c.getErrors().length);
  }

  @Test
  public void testCastValid_NoWarning() {
    Compiler c = runTypeCheck("var x = /** @type {number} */ (1);");
    assertEquals(0, c.getErrors().length);
  }

  @Test
  public void testGetElemArrayAccess_NoWarning() {
    Compiler c = runTypeCheck("var arr = [1, 2, 3]; var x = arr[0];");
    assertEquals(0, c.getErrors().length);
  }

  // ---------------------------------------------------------------------
  // 3) Token.NEW -> visitNew(): NOT_A_CONSTRUCTOR
  // ---------------------------------------------------------------------

  @Test
  public void testNotAConstructor_NewOnNumber() {
    Compiler c = runTypeCheck(
        "/** @type {number} */ var x = 1;\n"
        + "new x();");
    assertTrue(hasAnyOf(c, TypeCheck.NOT_A_CONSTRUCTOR));
  }

  @Test
  public void testConstructorCallable_NoWarningWithNew() {
    Compiler c = runTypeCheck(
        "/** @constructor */ function Foo() {}\n"
        + "new Foo();");
    assertFalse(hasAnyOf(c, TypeCheck.NOT_A_CONSTRUCTOR));
    assertFalse(hasAnyOf(c, TypeCheck.CONSTRUCTOR_NOT_CALLABLE));
  }

  // ---------------------------------------------------------------------
  // 4) Token.CALL -> visitCall(): NOT_CALLABLE / CONSTRUCTOR_NOT_CALLABLE
  // ---------------------------------------------------------------------

  @Test
  public void testNotCallable_CallOnNumber() {
    Compiler c = runTypeCheck(
        "/** @type {number} */ var x = 1;\n"
        + "x();");
    assertTrue(hasAnyOf(c, TypeCheck.NOT_CALLABLE));
  }

  @Test
  public void testConstructorNotCallable_CallWithoutNew() {
    Compiler c = runTypeCheck(
        "/** @constructor */ function Foo() {}\n"
        + "Foo();");
    assertTrue(hasAnyOf(c, TypeCheck.CONSTRUCTOR_NOT_CALLABLE));
  }

  @Test
  public void testPlainFunctionCall_NoWarning() {
    Compiler c = runTypeCheck("function f() {} f();");
    assertFalse(hasAnyOf(c, TypeCheck.NOT_CALLABLE));
    assertFalse(hasAnyOf(c, TypeCheck.CONSTRUCTOR_NOT_CALLABLE));
  }

  // ---------------------------------------------------------------------
  // 5) visitParameterList(): WRONG_ARGUMENT_COUNT (min/max/var_args branch)
  // ---------------------------------------------------------------------

  @Test
  public void testWrongArgumentCount_TooFew() {
    Compiler c = runTypeCheck(
        "/** @param {number} a\n"
        + " * @param {number} b */\n"
        + "function f(a, b) {}\n"
        + "f(1);");
    assertTrue(hasAnyOf(c, TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  @Test
  public void testWrongArgumentCount_TooMany() {
    Compiler c = runTypeCheck(
        "/** @param {number} a */\n"
        + "function f(a) {}\n"
        + "f(1, 2);");
    assertTrue(hasAnyOf(c, TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  @Test
  public void testWrongArgumentCount_ExactMatch_NoWarning() {
    Compiler c = runTypeCheck(
        "/** @param {number} a */\n"
        + "function f(a) {}\n"
        + "f(1);");
    assertFalse(hasAnyOf(c, TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  @Test
  public void testVarArgsFunctionCall_NoWarning() {
    // ครอบคลุม branch "parameter != null && parameter.isVarArgs()"
    // ใน while-loop ของ visitParameterList()
    Compiler c = runTypeCheck(
        "/** @param {...number} nums */\n"
        + "function sum(nums) {}\n"
        + "sum(1, 2, 3, 4);");
    assertFalse(hasAnyOf(c, TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  // ---------------------------------------------------------------------
  // 6) Token.BITNOT -> BIT_OPERATION
  // ---------------------------------------------------------------------

  @Test
  public void testBitOperation_WarningOnNonInt32() {
    // NOTE: อาศัยความรู้พื้นฐานของระบบชนิดว่า plain Object ไม่ match
    // Int32 context (สมมติฐานตามธรรมชาติของ type checker ไม่ใช่การเดา
    // behavior แปลกใหม่)
    Compiler c = runTypeCheck("var obj = {}; var y = ~obj;");
    assertTrue(hasAnyOf(c, TypeCheck.BIT_OPERATION));
  }

  @Test
  public void testBitOperation_NoWarningOnNumber() {
    Compiler c = runTypeCheck("var n = 5; var y = ~n;");
    assertFalse(hasAnyOf(c, TypeCheck.BIT_OPERATION));
  }

  // ---------------------------------------------------------------------
  // 7) Token.IN -> IN_USED_WITH_STRUCT
  // ---------------------------------------------------------------------

  @Test
  public void testInUsedWithStruct_Warning() {
    Compiler c = runTypeCheck(
        "/** @constructor @struct */ function Foo() {}\n"
        + "var f = new Foo();\n"
        + "var b = ('bar' in f);");
    assertTrue(hasAnyOf(c, TypeCheck.IN_USED_WITH_STRUCT));
  }

  @Test
  public void testInUsedWithStruct_NoWarningOnNonStruct() {
    Compiler c = runTypeCheck(
        "/** @constructor */ function Foo() {}\n"
        + "var f = new Foo();\n"
        + "var b = ('bar' in f);");
    assertFalse(hasAnyOf(c, TypeCheck.IN_USED_WITH_STRUCT));
  }

  // ---------------------------------------------------------------------
  // 8) Token.FOR (isForIn) -> IN_USED_WITH_STRUCT (คนละ branch จาก IN token)
  // ---------------------------------------------------------------------

  @Test
  public void testForInWithStruct_Warning() {
    Compiler c = runTypeCheck(
        "/** @constructor @struct */ function Foo() {}\n"
        + "var f = new Foo();\n"
        + "for (var k in f) {}");
    assertTrue(hasAnyOf(c, TypeCheck.IN_USED_WITH_STRUCT));
  }

  // ---------------------------------------------------------------------
  // 9) visitObjLitKey(): ILLEGAL_OBJLIT_KEY (struct / dict, quoted/unquoted)
  // ---------------------------------------------------------------------

  @Test
  public void testIllegalObjLitKey_StructQuotedKey_Warning() {
    Compiler c = runTypeCheck("var x = /** @struct */ {'a': 1};");
    assertTrue(hasAnyOf(c, TypeCheck.ILLEGAL_OBJLIT_KEY));
  }

  @Test
  public void testIllegalObjLitKey_StructUnquotedKey_NoWarning() {
    Compiler c = runTypeCheck("var x = /** @struct */ {a: 1};");
    assertFalse(hasAnyOf(c, TypeCheck.ILLEGAL_OBJLIT_KEY));
  }

  @Test
  public void testIllegalObjLitKey_DictUnquotedKey_Warning() {
    Compiler c = runTypeCheck("var d = /** @dict */ {a: 1};");
    assertTrue(hasAnyOf(c, TypeCheck.ILLEGAL_OBJLIT_KEY));
  }

  @Test
  public void testIllegalObjLitKey_DictQuotedKey_NoWarning() {
    Compiler c = runTypeCheck("var d = /** @dict */ {'a': 1};");
    assertFalse(hasAnyOf(c, TypeCheck.ILLEGAL_OBJLIT_KEY));
  }

  // ---------------------------------------------------------------------
  // 10) checkPropertyAccess(): INEXISTENT_ENUM_ELEMENT
  // ---------------------------------------------------------------------

  @Test
  public void testInexistentEnumElement_Warning() {
    Compiler c = runTypeCheck(
        "/** @enum {number} */ var Color = {RED: 1, BLUE: 2};\n"
        + "var x = Color.GREEN;");
    assertTrue(hasAnyOf(c, TypeCheck.INEXISTENT_ENUM_ELEMENT));
  }

  @Test
  public void testExistentEnumElement_NoWarning() {
    Compiler c = runTypeCheck(
        "/** @enum {number} */ var Color = {RED: 1, BLUE: 2};\n"
        + "var x = Color.RED;");
    assertFalse(hasAnyOf(c, TypeCheck.INEXISTENT_ENUM_ELEMENT));
  }

  // ---------------------------------------------------------------------
  // 11) visitInterfaceGetprop(): INVALID_INTERFACE_MEMBER_DECLARATION /
  //     INTERFACE_FUNCTION_NOT_EMPTY
  // ---------------------------------------------------------------------

  @Test
  public void testInvalidInterfaceMemberDeclaration_NonFunctionValue() {
    Compiler c = runTypeCheck(
        "/** @interface */ function Foo() {}\n"
        + "Foo.prototype.bar = 5;");
    assertTrue(hasAnyOf(c, TypeCheck.INVALID_INTERFACE_MEMBER_DECLARATION));
  }

  @Test
  public void testInterfaceFunctionNotEmpty_Warning() {
    Compiler c = runTypeCheck(
        "/** @interface */ function Foo() {}\n"
        + "Foo.prototype.bar = function() { return 1; };");
    assertTrue(hasAnyOf(c, TypeCheck.INTERFACE_FUNCTION_NOT_EMPTY));
  }

  @Test
  public void testInterfaceFunctionEmpty_NoWarning() {
    Compiler c = runTypeCheck(
        "/** @interface */ function Foo() {}\n"
        + "Foo.prototype.bar = function() {};");
    assertFalse(hasAnyOf(c, TypeCheck.INTERFACE_FUNCTION_NOT_EMPTY));
    assertFalse(hasAnyOf(c, TypeCheck.INVALID_INTERFACE_MEMBER_DECLARATION));
  }

  // ---------------------------------------------------------------------
  // 12) checkDeclaredPropertyInheritance(): UNKNOWN_OVERRIDE
  //     (early-return branch vs. warning branch)
  // ---------------------------------------------------------------------

  @Test
  public void testUnknownOverride_WithOverrideAnnotationNoSuperProperty_Warning() {
    Compiler c = runTypeCheck(
        "/** @constructor */ function Foo() {}\n"
        + "/** @override */\n"
        + "Foo.prototype.bar = function() {};");
    assertTrue(hasAnyOf(c, TypeCheck.UNKNOWN_OVERRIDE));
  }

  @Test
  public void testNoOverrideAnnotation_NoSuperProperty_NoWarning() {
    // ครอบคลุม branch early-return:
    // if (!declaredOverride && !superClassHasProperty && !superInterfaceHasProperty) return;
    Compiler c = runTypeCheck(
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.bar = function() {};");
    assertFalse(hasAnyOf(c, TypeCheck.UNKNOWN_OVERRIDE));
  }

  // ---------------------------------------------------------------------
  // 13) shouldTraverse(): FUNCTION_MASKS_VARIABLE
  // ---------------------------------------------------------------------

  @Test
  public void testFunctionMasksVariable_Warning() {
    Compiler c = runTypeCheck(
        "var x = 3;\n"
        + "function x() {}");
    assertTrue(hasAnyOf(c, TypeCheck.FUNCTION_MASKS_VARIABLE));
  }
}
```

## ตารางสรุปการครอบคลุม (Branch/Condition)

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testGetTypedPercent_ZeroWhenNothingProcessed` | `getTypedPercent()`: `(total == 0) → return 0.0` |
| `testGetTypedPercent_PositiveAfterProcessing` | `getTypedPercent()`: `total != 0 → คำนวณ percent` |
| `testNoWarnings_WellTypedSimpleCode` | baseline: NAME/NUMBER/ADD/RETURN/CALL ไม่มี error |
| `testDeleteProperty_NoCrashNoWarning` | `Token.DELPROP` branch |
| `testCastValid_NoWarning` | `Token.CAST`: `castType.isSubtype(exprType)` true |
| `testGetElemArrayAccess_NoWarning` | `Token.ARRAYLIT`, `visitGetElem()` |
| `testNotAConstructor_NewOnNumber` | `visitNew()`: else → `NOT_A_CONSTRUCTOR` |
| `testConstructorCallable_NoWarningWithNew` | `visitNew()`: `type.isConstructor()` true, ไม่มี warning |
| `testNotCallable_CallOnNumber` | `visitCall()`: `!childType.canBeCalled()` → `NOT_CALLABLE` |
| `testConstructorNotCallable_CallWithoutNew` | `visitCall()`: constructor call เงื่อนไข `CONSTRUCTOR_NOT_CALLABLE` true |
| `testPlainFunctionCall_NoWarning` | `visitCall()`: false branch ของทั้งสองเงื่อนไขข้างบน |
| `testWrongArgumentCount_TooFew` | `visitParameterList()`: `minArgs > numArgs` |
| `testWrongArgumentCount_TooMany` | `visitParameterList()`: `maxArgs < numArgs` (+ suffix message branch) |
| `testWrongArgumentCount_ExactMatch_NoWarning` | `visitParameterList()`: เงื่อนไข false ทั้งคู่ |
| `testVarArgsFunctionCall_NoWarning` | while-loop: `parameter != null && parameter.isVarArgs()` |
| `testBitOperation_WarningOnNonInt32` | `Token.BITNOT`: `!childType.matchesInt32Context()` true |
| `testBitOperation_NoWarningOnNumber` | `Token.BITNOT`: เงื่อนไข false |
| `testInUsedWithStruct_Warning` | `Token.IN`: `rightType.isStruct()` true |
| `testInUsedWithStruct_NoWarningOnNonStruct` | `Token.IN`: เงื่อนไข false |
| `testForInWithStruct_Warning` | `Token.FOR` + `NodeUtil.isForIn(n)` true, `getJSType(obj).isStruct()` |
| `testIllegalObjLitKey_StructQuotedKey_Warning` | `visitObjLitKey()`: `litType.isStruct() && key.isQuotedString()` |
| `testIllegalObjLitKey_StructUnquotedKey_NoWarning` | ผลลบของ branch เดียวกัน |
| `testIllegalObjLitKey_DictUnquotedKey_Warning` | `litType.isDict() && !key.isQuotedString()` |
| `testIllegalObjLitKey_DictQuotedKey_NoWarning` | ผลลบของ branch เดียวกัน |
| `testInexistentEnumElement_Warning` | `checkPropertyAccess()`: `objectType instanceof EnumType` → `INEXISTENT_ENUM_ELEMENT` |
| `testExistentEnumElement_NoWarning` | `checkPropertyAccess()`: `objectType.hasProperty(propName)` true |
| `testInvalidInterfaceMemberDeclaration_NonFunctionValue` | `visitInterfaceGetprop()`: `!rvalueType.isFunctionType()` |
| `testInterfaceFunctionNotEmpty_Warning` | `visitInterfaceGetprop()`: `isFunction() && !isEmptyBlock()` |
| `testInterfaceFunctionEmpty_NoWarning` | ผลลบของทั้งสองเงื่อนไขข้างบน |
| `testUnknownOverride_...Warning` | `checkDeclaredPropertyInheritance()`: ผ่าน early-return, ตกถึง `UNKNOWN_OVERRIDE` |
| `testNoOverrideAnnotation_...NoWarning` | `checkDeclaredPropertyInheritance()`: early-return branch |
| `testFunctionMasksVariable_Warning` | `shouldTraverse()`: `FUNCTION_MASKS_VARIABLE` condition true |

**หมายเหตุ:** จุดที่ diagnostic ถูก "ประกาศ" ไว้ใน `TypeCheck` แต่ *ไม่ถูกเรียก* ในซอร์สที่ให้มา (`ENUM_DUP`, `ENUM_NOT_CONSTANT`, `MULTIPLE_VAR_DEF`, `DETERMINISTIC_TEST`, `HIDDEN_SUPERCLASS_PROPERTY*` ที่ต้องพึ่ง `reportMissingOverride` level ซึ่งไม่ทราบ default แน่ชัด) ถูกงดเว้นการทดสอบเชิงยืนยันผลลัพธ์เพื่อไม่ละเมิดข้อกำหนดที่ 4