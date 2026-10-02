# วิเคราะห์และแนวทางการทดสอบ

`TypeCheck` เป็น internal compiler pass ที่ผูกกับ `AbstractCompiler`, `JSTypeRegistry`, `Scope`, `ScopeCreator`, `JSType` hierarchy ฯลฯ อย่างลึกซึ้งมาก การ mock dependency เหล่านี้เองทำได้ยากและมีความเสี่ยงสูงที่จะ "เดา" พฤติกรรมที่ไม่ได้อยู่ในซอร์สที่ให้มา ผมจึงแบ่งชุดทดสอบเป็น 2 กลุ่ม:

- **กลุ่ม A (ความมั่นใจสูง)**: ทดสอบ logic ที่อ่านได้ตรงจากซอร์สโดยตรง (Preconditions, arithmetic ของ `getTypedPercent()`, `isReference()`, การ chain ของ `reportMissingProperties()`) โดยใช้ **reflection** (มาตรฐาน JDK ไม่ใช่ external lib) เพื่อเข้าถึง private/package-private member เนื่องจากคลาสทดสอบไม่ได้อยู่ package เดียวกัน (ต้อง `import` ตามข้อกำหนด)
- **กลุ่ม B (best-effort / integration)**: ใช้ pipeline จริงของ `com.google.javascript.jscomp.Compiler` (คลาสในโปรเจกต์เดียวกัน ไม่ใช่ jar ภายนอก) เพื่อ compile JS snippet แล้วตรวจ warning ที่เกิดจาก branch ต่าง ๆ ของ `visit()` — มี**คอมเมนต์กำกับ**จุดที่อ้างอิง API ของคลาสอื่น (Compiler/CompilerOptions/SourceFile/JSError) ซึ่งไม่ได้แสดงอยู่ในซอร์ส `TypeCheck.java` ที่ให้มา

```java
import static org.junit.Assert.*;

import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DiagnosticGroups;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * JUnit4 test สำหรับ {@link TypeCheck} (Defects4J Closure-66b)
 *
 * หมายเหตุสำคัญ (ตามข้อกำหนดข้อ 4):
 * - เมธอด/ฟิลด์บางส่วนของ TypeCheck เป็น private/package-private จึงใช้ java.lang.reflect
 *   (เป็นส่วนของ JDK มาตรฐาน ไม่ใช่ external library) ในการเข้าถึง เพื่อทดสอบ logic
 *   ที่อ่านได้ตรงจากซอร์สโดยไม่ต้อง mock dependency ที่ซับซ้อน (AbstractCompiler, Scope ฯลฯ)
 * - เทสในกลุ่ม "Integration" (ท้ายไฟล์) อ้างอิง public API ของ com.google.javascript.jscomp.Compiler,
 *   CompilerOptions, SourceFile, JSError ซึ่ง**ไม่ได้ปรากฏในซอร์สโค้ด TypeCheck ที่ให้มา**
 *   จึงมีคอมเมนต์กำกับไว้ทุกจุดที่เป็นการอ้าง API ของคลาสอื่นที่ไม่ได้ยืนยัน signature 100%
 *   (เช่น JSError#getType(), Compiler#compile(SourceFile,SourceFile,CompilerOptions))
 * - พฤติกรรมภายในของ JSType (เช่น canBeCalled(), matchesInt32Context(), testForEquality())
 *   ไม่ได้แสดงในซอร์สที่ให้มา เทสที่พึ่งพาสิ่งเหล่านี้จึงเลือกเฉพาะกรณีที่มั่นใจสูงและมีคอมเมนต์กำกับ
 */
public class TypeCheckTest {

  private Compiler compiler;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // ASSUMPTION: Compiler#initOptions(CompilerOptions) เป็น bootstrap มาตรฐานของ Closure Compiler
    compiler.initOptions(new CompilerOptions());
    registry = compiler.getTypeRegistry();
  }

  // ==================================================================
  // Reflection helpers
  // ==================================================================

  private static Object invokePrivate(Object target, Class<?> declaringClass,
      String name, Class<?>[] paramTypes, Object... args) throws Exception {
    Method m = declaringClass.getDeclaredMethod(name, paramTypes);
    m.setAccessible(true);
    return m.invoke(target, args);
  }

  private static void setIntField(Object target, String name, int value) throws Exception {
    Field f = TypeCheck.class.getDeclaredField(name);
    f.setAccessible(true);
    f.setInt(target, value);
  }

  private static boolean getBooleanField(Object target, String name) throws Exception {
    Field f = TypeCheck.class.getDeclaredField(name);
    f.setAccessible(true);
    return f.getBoolean(target);
  }

  private TypeCheck newTypeCheck() {
    // ใช้ public constructor 5 อาร์กิวเมนต์ (topScope/scopeCreator = null ภายใน)
    return new TypeCheck(compiler, null, registry, CheckLevel.WARNING, CheckLevel.OFF);
  }

  // ==================================================================
  // กลุ่ม A: ทดสอบตรงจากซอร์สโดยตรง (Preconditions / arithmetic / static helper)
  // ==================================================================

  /** ค่า null: compiler==null -> constructor เรียก compiler.getTypeValidator() -> NPE */
  @Test(expected = NullPointerException.class)
  public void testConstructor_nullCompiler_throwsNPE() {
    new TypeCheck(null, null, registry, CheckLevel.WARNING, CheckLevel.OFF);
  }

  /** ค่า null: process() ต้องมี scopeCreator ที่ไม่ใช่ null (Preconditions.checkNotNull) */
  @Test(expected = NullPointerException.class)
  public void testProcess_withNullScopeCreatorAndTopScope_throwsNPE() {
    TypeCheck tc = newTypeCheck(); // scopeCreator = null, topScope = null
    tc.process(null, null); // ควร throw ก่อนแม้ node เป็น null เพราะ check scopeCreator ก่อน
  }

  /** reportMissingProperties(boolean) ต้อง return this (chaining) และตั้งค่า field จริง */
  @Test
  public void testReportMissingProperties_returnsThisAndUpdatesField() throws Exception {
    TypeCheck tc = newTypeCheck();
    Object result = invokePrivate(tc, TypeCheck.class, "reportMissingProperties",
        new Class<?>[] { boolean.class }, false);
    assertSame("ต้อง return this เพื่อ chaining", tc, result);
    assertFalse(getBooleanField(tc, "reportMissingProperties"));
  }

  /** getTypedPercent(): total==0 -> คืนค่า 0.0 (branch แรก) */
  @Test
  public void testGetTypedPercent_totalZero_returnsZero() throws Exception {
    TypeCheck tc = newTypeCheck();
    Object percent = invokePrivate(tc, TypeCheck.class, "getTypedPercent",
        new Class<?>[] {});
    assertEquals(0.0, (Double) percent, 0.0001);
  }

  /** getTypedPercent(): total!=0 -> คำนวณ (100*typedCount)/total (branch ที่สอง) */
  @Test
  public void testGetTypedPercent_computesRatio() throws Exception {
    TypeCheck tc = newTypeCheck();
    setIntField(tc, "typedCount", 3);
    setIntField(tc, "nullCount", 1);
    setIntField(tc, "unknownCount", 0);
    Object percent = invokePrivate(tc, TypeCheck.class, "getTypedPercent",
        new Class<?>[] {});
    assertEquals(75.0, (Double) percent, 0.0001);
  }

  /** getTypedPercent(): typedCount==0 แต่ total!=0 -> คืนค่า 0.0 (boundary ของ branch ที่สอง) */
  @Test
  public void testGetTypedPercent_typedCountZero_returnsZeroPercent() throws Exception {
    TypeCheck tc = newTypeCheck();
    setIntField(tc, "typedCount", 0);
    setIntField(tc, "nullCount", 5);
    setIntField(tc, "unknownCount", 5);
    Object percent = invokePrivate(tc, TypeCheck.class, "getTypedPercent",
        new Class<?>[] {});
    assertEquals(0.0, (Double) percent, 0.0001);
  }

  /** isReference(Node): NAME/GETPROP/GETELEM -> true */
  @Test
  public void testIsReference_referenceNodes_true() throws Exception {
    Method m = TypeCheck.class.getDeclaredMethod("isReference", Node.class);
    m.setAccessible(true);
    assertTrue((Boolean) m.invoke(null, new Node(Token.NAME)));
    assertTrue((Boolean) m.invoke(null, new Node(Token.GETPROP)));
    assertTrue((Boolean) m.invoke(null, new Node(Token.GETELEM)));
  }

  /** isReference(Node): กรณี default -> false */
  @Test
  public void testIsReference_nonReferenceNodes_false() throws Exception {
    Method m = TypeCheck.class.getDeclaredMethod("isReference", Node.class);
    m.setAccessible(true);
    assertFalse((Boolean) m.invoke(null, new Node(Token.NUMBER)));
    assertFalse((Boolean) m.invoke(null, new Node(Token.STRING)));
    assertFalse((Boolean) m.invoke(null, new Node(Token.ADD)));
  }

  // ==================================================================
  // กลุ่ม B: Integration test ผ่าน Compiler pipeline (best-effort)
  // ASSUMPTION: Compiler#compile(SourceFile, SourceFile, CompilerOptions),
  //             JSError#getType(), CompilerOptions#setWarningLevel(...)
  //             เป็น public API จริงของโปรเจกต์ Closure Compiler (ไม่ได้อยู่ในซอร์ส TypeCheck ที่ให้มา)
  // ==================================================================

  private static final String EXTERNS =
      "/** @constructor @param {*=} opt_v */ function Object(opt_v) {}\n" +
      "/** @constructor */ function Function() {}\n" +
      "/** @constructor */ function Array() {}\n";

  private Compiler compileJs(String js) {
    Compiler comp = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
    SourceFile externsFile = SourceFile.fromCode("externs.js", EXTERNS);
    SourceFile srcFile = SourceFile.fromCode("input.js", js);
    comp.compile(externsFile, srcFile, options);
    return comp;
  }

  private boolean hasDiagnostic(JSError[] diagnostics, DiagnosticType type) {
    for (JSError e : diagnostics) {
      if (e.getType() == type) {
        return true;
      }
    }
    return false;
  }

  /** visitNew(): type==null && ไม่ใช่ GETPROP -> NOT_A_CONSTRUCTOR */
  @Test
  public void testNew_onNonConstructorValue_reportsNotAConstructor() {
    String js = "/** @type {number} */ var x = 1; var y = new x();";
    Compiler comp = compileJs(js);
    assertTrue(hasDiagnostic(comp.getWarnings(), TypeCheck.NOT_A_CONSTRUCTOR));
  }

  /** visitNew(): type!=null && isConstructor() -> ไม่มี NOT_A_CONSTRUCTOR */
  @Test
  public void testNew_onProperConstructor_noWarning() {
    String js = "/** @constructor */ function Foo() {} var f = new Foo();";
    Compiler comp = compileJs(js);
    assertFalse(hasDiagnostic(comp.getWarnings(), TypeCheck.NOT_A_CONSTRUCTOR));
  }

  /** visitParameterList(): numArgs > maxArgs -> WRONG_ARGUMENT_COUNT */
  @Test
  public void testCall_tooManyArguments_reportsWrongArgumentCount() {
    String js = "/** @param {number} a */ function f(a) {} f(1, 2);";
    Compiler comp = compileJs(js);
    assertTrue(hasDiagnostic(comp.getWarnings(), TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  /** visitParameterList(): minArgs > numArgs -> WRONG_ARGUMENT_COUNT */
  @Test
  public void testCall_tooFewArguments_reportsWrongArgumentCount() {
    String js = "/** @param {number} a\n@param {number} b */ function f(a,b) {} f(1);";
    Compiler comp = compileJs(js);
    assertTrue(hasDiagnostic(comp.getWarnings(), TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  /** visitParameterList(): จำนวน argument ถูกต้อง -> ไม่มี WRONG_ARGUMENT_COUNT */
  @Test
  public void testCall_correctArgumentCount_noWarning() {
    String js = "/** @param {number} a */ function f(a) {} f(1);";
    Compiler comp = compileJs(js);
    assertFalse(hasDiagnostic(comp.getWarnings(), TypeCheck.WRONG_ARGUMENT_COUNT));
  }

  /** shouldTraverse(): ฟังก์ชันชื่อซ้ำกับ var ที่ประกาศไว้ก่อน -> FUNCTION_MASKS_VARIABLE */
  @Test
  public void testFunctionMasksVariable_reportsWarning() {
    String js = "var x = 1; function x() {}";
    Compiler comp = compileJs(js);
    assertTrue(hasDiagnostic(comp.getWarnings(), TypeCheck.FUNCTION_MASKS_VARIABLE));
  }

  /** DELPROP: operand ไม่ใช่ reference -> BAD_DELETE */
  @Test
  public void testDelete_onNonReference_reportsBadDelete() {
    String js = "var r = delete (1 + 2);";
    Compiler comp = compileJs(js);
    assertTrue(hasDiagnostic(comp.getWarnings(), TypeCheck.BAD_DELETE));
  }

  /** DELPROP: operand เป็น GETPROP (reference) -> ไม่มี BAD_DELETE */
  @Test
  public void testDelete_onReference_noBadDeleteWarning() {
    String js = "var obj = {}; var r = delete obj.prop;";
    Compiler comp = compileJs(js);
    assertFalse(hasDiagnostic(comp.getWarnings(), TypeCheck.BAD_DELETE));
  }

  /** checkPropertyAccess(): objectType instanceof EnumType -> INEXISTENT_ENUM_ELEMENT */
  @Test
  public void testEnum_accessingUndefinedElement_reportsInexistentEnumElement() {
    String js = "/** @enum {number} */ var Color = {RED:1, GREEN:2}; var c = Color.BLUE;";
    Compiler comp = compileJs(js);
    assertTrue(hasDiagnostic(comp.getWarnings(), TypeCheck.INEXISTENT_ENUM_ELEMENT));
  }

  /** visitCall(): !childType.canBeCalled() -> NOT_CALLABLE
   *  (ASSUMPTION: number type ไม่สามารถ canBeCalled() ได้ - เป็นพฤติกรรมของ JSType
   *   ที่ไม่ได้แสดงในซอร์ส TypeCheck ที่ให้มา) */
  @Test
  public void testCall_onNonFunctionValue_reportsNotCallable() {
    String js = "/** @type {number} */ var x = 1; x();";
    Compiler comp = compileJs(js);
    assertTrue(hasDiagnostic(comp.getWarnings(), TypeCheck.NOT_CALLABLE));
  }

  /** boundary: โปรแกรมว่าง -> ไม่มี warning จาก TypeCheck เลย */
  @Test
  public void testEmptyProgram_noTypeCheckWarnings() {
    Compiler comp = compileJs("");
    assertEquals(0, comp.getWarnings().length);
  }

  /** อินพุตผิดรูปแบบ (syntax error): pipeline ต้องไม่ throw exception และรายงาน error */
  @Test
  public void testMalformedSyntax_doesNotThrowAndReportsErrors() {
    Compiler comp = compileJs("function ( {"); // syntax ผิด
    assertTrue("คาดว่า parser จะรายงาน error สำหรับ syntax ที่ผิดรูปแบบ",
        comp.getErrors().length > 0);
  }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุมใน `TypeCheck` |
|---|---|
| `testConstructor_nullCompiler_throwsNPE` | Constructor: `compiler.getTypeValidator()` เมื่อ compiler เป็น null (ค่า null) |
| `testProcess_withNullScopeCreatorAndTopScope_throwsNPE` | `process()`: `Preconditions.checkNotNull(scopeCreator)` (ค่า null) |
| `testReportMissingProperties_returnsThisAndUpdatesField` | `reportMissingProperties(boolean)`: การตั้งค่า field และ return `this` |
| `testGetTypedPercent_totalZero_returnsZero` | `getTypedPercent()`: branch `total == 0` |
| `testGetTypedPercent_computesRatio` | `getTypedPercent()`: branch `total != 0`, คำนวณ ratio |
| `testGetTypedPercent_typedCountZero_returnsZeroPercent` | `getTypedPercent()`: boundary `typedCount==0`, `total!=0` |
| `testIsReference_referenceNodes_true` | `isReference()`: case `NAME`/`GETPROP`/`GETELEM` → true |
| `testIsReference_nonReferenceNodes_false` | `isReference()`: `default` → false |
| `testNew_onNonConstructorValue_reportsNotAConstructor` | `visitNew()`: `type==null` && ไม่ใช่ `GETPROP` → `NOT_A_CONSTRUCTOR` |
| `testNew_onProperConstructor_noWarning` | `visitNew()`: `type!=null && type.isConstructor()` → ไม่มี warning |
| `testCall_tooManyArguments_reportsWrongArgumentCount` | `visitParameterList()`: `maxArgs < numArgs` |
| `testCall_tooFewArguments_reportsWrongArgumentCount` | `visitParameterList()`: `minArgs > numArgs` |
| `testCall_correctArgumentCount_noWarning` | `visitParameterList()`: เงื่อนไข count ถูกต้อง, loop ทำงานครบ |
| `testFunctionMasksVariable_reportsWarning` | `shouldTraverse()` case `FUNCTION`: เงื่อนไข `isDeclared && !FunctionType` |
| `testDelete_onNonReference_reportsBadDelete` | `visit()` case `DELPROP`: `!isReference()` → `BAD_DELETE` |
| `testDelete_onReference_noBadDeleteWarning` | `visit()` case `DELPROP`: `isReference()` → ไม่มี warning |
| `testEnum_accessingUndefinedElement_reportsInexistentEnumElement` | `checkPropertyAccess()`: `objectType instanceof EnumType` → `INEXISTENT_ENUM_ELEMENT` |
| `testCall_onNonFunctionValue_reportsNotCallable` | `visitCall()`: `!childType.canBeCalled()` → `NOT_CALLABLE` |
| `testEmptyProgram_noTypeCheckWarnings` | Boundary: อินพุตว่าง ไม่มี node ให้ตรวจ |
| `testMalformedSyntax_doesNotThrowAndReportsErrors` | อินพุตผิดรูปแบบ: pipeline ไม่ throw, มี error ถูกรายงาน |

**ข้อจำกัดที่ระบุไว้ชัดเจน**: เมธอดเช่น `checkDeclaredPropertyInheritance`, `hasUnknownOrEmptySupertype`, `visitInterfaceGetprop`, `checkNoTypeCheckSection`, `visitBinaryOperator` (บาง case เช่น `BIT_OPERATION`, `DETERMINISTIC_TEST`) ต้องพึ่งพา semantics ภายในของ `JSType`/`FunctionType`/`Scope` ที่ไม่ได้แสดงในซอร์สที่ให้มา จึง**ไม่ได้เขียนเทสยืนยัน outcome เฉพาะเจาะจง**เพื่อไม่ละเมิดข้อกำหนดที่ 4 (ห้ามเดา behavior)