# TypedScopeCreatorTest.java

**หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติที่ใช้ในเทสนี้ ตามข้อกำหนดข้อ 4):**
- คลาส `TypedScopeCreator` เป็น package-private และพึ่งพา infrastructure ของ compiler อย่างมาก (parser, `JSTypeRegistry`, `CodingConvention` ฯลฯ) การ mock `AbstractCompiler` ทำได้ยากมากโดยไม่มี Mockito ในคลาสพาธที่กำหนด ดังนั้นจึงเลือกใช้ `com.google.javascript.jscomp.Compiler` ตัวจริงในการ parse source แล้วเรียก `createScope(...)` ตรง ๆ (เป็นวิธีที่ใกล้เคียง unit test ที่สุดสำหรับคลาสนี้)
- สมมติว่า API `Compiler.init(List<SourceFile>, List<SourceFile>, CompilerOptions)`, `Compiler.parseInputs()`, `Compiler.getErrors()/getWarnings()` คืนค่า `JSError[]`, และ `JSError.getType()` มีอยู่จริงตาม convention ทั่วไปของ closure-compiler ยุคนั้น — หากชื่อคลาส/เมธอดจริงต่างจากนี้ (เช่น `JSSourceFile` แทน `SourceFile`) ต้องปรับ import/การเรียกให้ตรง
- พฤติกรรมของ `CodingConvention.isValidEnumKey`, `getObjectLiteralCast`, `identifyTypeDefAssign` (ใช้ตัดสิน ENUM_NOT_CONSTANT, CONSTRUCTOR_EXPECTED, old-style typedef) **ไม่ปรากฏใน source ที่ให้มา** จึง**ไม่ทดสอบ branch เหล่านี้แบบยืนยันผลลัพธ์ที่แน่นอน** เพื่อไม่ให้เดา behavior

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * JUnit4 test สำหรับ com.google.javascript.jscomp.TypedScopeCreator
 * (อยู่ package เดียวกันเพื่อเข้าถึง package-private members ได้)
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  // ---------- Helpers ----------

  /** parse externs + js แล้วคืน root node สำหรับส่งให้ createScope */
  private Node parse(String externsCode, String js) {
    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", externsCode));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));
    compiler.init(externs, inputs, options);
    Node root = compiler.parseInputs();
    assertNotNull("Parse ล้มเหลว: " + java.util.Arrays.toString(compiler.getErrors()),
        root);
    return root;
  }

  private Node parse(String js) {
    return parse("", js);
  }

  /** สร้าง global scope ผ่าน public API createScope(root, null) */
  private Scope buildGlobalScope(String js) {
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    return creator.createScope(root, null);
  }

  private boolean containsDiagnostic(JSError[] errors, DiagnosticType type) {
    for (JSError e : errors) {
      if (e.getType() == type) {
        return true;
      }
    }
    return false;
  }

  private Node findFunctionNode(Node n, String name) {
    if (n.getType() == Token.FUNCTION) {
      Node fnName = n.getFirstChild();
      if (fnName != null && fnName.getType() == Token.NAME
          && name.equals(fnName.getString())) {
        return n;
      }
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findFunctionNode(c, name);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  // ---------- 1. createInitialScope / native types ----------

  @Test
  public void testNativeTypesDeclaredInGlobalScope() {
    Scope s = buildGlobalScope("");
    assertNotNull(s.getVar("Object"));
    assertNotNull(s.getVar("Object.prototype"));
    assertNotNull(s.getVar("Array"));
    assertNotNull(s.getVar("Date"));
    assertNotNull(s.getVar("Function"));
    assertNotNull(s.getVar("undefined"));
    assertNotNull(s.getVar("goog.typedef"));
    assertNotNull(s.getVar("ActiveXObject"));
  }

  @Test
  public void testEmptySourceOnlyNativeTypes() {
    // boundary: source ว่างเปล่า
    Scope s = buildGlobalScope("");
    assertNull(s.getVar("SomethingThatDoesNotExist_XYZ"));
  }

  // ---------- 2. VAR declarations ----------

  @Test
  public void testVarWithoutJsDocIsInferred() {
    Scope s = buildGlobalScope("var x = 1;");
    Scope.Var v = s.getVar("x");
    assertNotNull(v);
    assertTrue(v.isTypeInferred());
  }

  @Test
  public void testVarWithTypeAnnotationIsDeclared() {
    Scope s = buildGlobalScope("/** @type {number} */ var x;");
    Scope.Var v = s.getVar("x");
    assertNotNull(v);
    assertFalse(v.isTypeInferred());
  }

  @Test
  public void testMultipleVarDeclarationsWithJsDocReportsWarning() {
    buildGlobalScope("/** @type {number} */ var a, b;");
    assertTrue(containsDiagnostic(compiler.getWarnings(), TypeCheck.MULTIPLE_VAR_DEF)
        || containsDiagnostic(compiler.getErrors(), TypeCheck.MULTIPLE_VAR_DEF));
  }

  @Test
  public void testMultipleVarDeclarationsWithoutJsDocNoWarning() {
    Scope s = buildGlobalScope("var a = 1, b = 2;");
    assertFalse(containsDiagnostic(compiler.getWarnings(), TypeCheck.MULTIPLE_VAR_DEF));
    assertNotNull(s.getVar("a"));
    assertNotNull(s.getVar("b"));
  }

  // ---------- 3. ENUM handling ----------

  @Test
  public void testEnumViaVarObjectLiteralDeclaresElements() {
    Scope s = buildGlobalScope(
        "/** @enum {number} */ var Color = {RED:1, GREEN:2};");
    Scope.Var v = s.getVar("Color");
    assertNotNull(v);
    assertTrue(v.getType() instanceof EnumType);
    EnumType enumType = (EnumType) v.getType();
    assertTrue(enumType.hasOwnProperty("RED"));
    assertTrue(enumType.hasOwnProperty("GREEN"));
    assertNotNull(compiler.getTypeRegistry().getType("Color"));
  }

  @Test
  public void testEnumDuplicateKeyReportsWarning() {
    buildGlobalScope("/** @enum {number} */ var Color = {RED:1, RED:2};");
    assertTrue(containsDiagnostic(compiler.getWarnings(), TypeCheck.ENUM_DUP)
        || containsDiagnostic(compiler.getErrors(), TypeCheck.ENUM_DUP));
  }

  @Test
  public void testEnumInitializerInvalidValueReportsWarning() {
    // value ไม่ใช่ OBJECTLIT และไม่ใช่ qualified-name ที่ชี้ไป enum อื่น -> ENUM_INITIALIZER
    buildGlobalScope("/** @enum {number} */ var Color = 5;");
    assertTrue(containsDiagnostic(compiler.getWarnings(), TypedScopeCreator.ENUM_INITIALIZER)
        || containsDiagnostic(compiler.getErrors(), TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnumAliasFromExistingEnumVar() {
    Scope s = buildGlobalScope(
        "/** @enum {number} */ var A = {X:1};\n"
        + "/** @enum {number} */ var B = A;");
    Scope.Var a = s.getVar("A");
    Scope.Var b = s.getVar("B");
    assertNotNull(a);
    assertNotNull(b);
    assertTrue(b.getType() instanceof EnumType);
    assertSame(a.getType(), b.getType());
    assertFalse(containsDiagnostic(compiler.getWarnings(),
        TypedScopeCreator.ENUM_INITIALIZER));
  }

  // ---------- 4. Constructor / function declarations ----------

  @Test
  public void testConstructorFunctionDeclarationDeclaresPrototype() {
    Scope s = buildGlobalScope("/** @constructor */ function Foo() {}");
    Scope.Var foo = s.getVar("Foo");
    assertNotNull(foo);
    assertTrue(foo.getType() instanceof FunctionType);
    assertTrue(((FunctionType) foo.getType()).isConstructor());
    assertNotNull(s.getVar("Foo.prototype"));
  }

  @Test
  public void testPlainFunctionDeclarationHasNoPrototypeVar() {
    Scope s = buildGlobalScope("function foo() {}");
    Scope.Var foo = s.getVar("foo");
    assertNotNull(foo);
    assertTrue(foo.getType() instanceof FunctionType);
    assertFalse(((FunctionType) foo.getType()).isConstructor());
    assertNull(s.getVar("foo.prototype"));
  }

  @Test
  public void testFunctionAssignedToVarWithConstructorJsDoc() {
    Scope s = buildGlobalScope("/** @constructor */ var Foo = function() {};");
    Scope.Var foo = s.getVar("Foo");
    assertNotNull(foo);
    assertTrue(foo.getType() instanceof FunctionType);
    assertTrue(((FunctionType) foo.getType()).isConstructor());
    assertNotNull(s.getVar("Foo.prototype"));
  }

  @Test
  public void testFunctionAliasRegistersTypeName() {
    Scope s = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n"
        + "/** @constructor */ Bar = Foo;");
    JSType fooInstance = compiler.getTypeRegistry().getType("Foo");
    JSType barInstance = compiler.getTypeRegistry().getType("Bar");
    assertNotNull(fooInstance);
    assertNotNull(barInstance);
    assertSame(fooInstance, barInstance);
  }

  // ---------- 5. Prototype property / stub declarations ----------

  @Test
  public void testPrototypeMethodAssignmentDeclaresProperty() {
    Scope s = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.bar = function() {};");
    Scope.Var foo = s.getVar("Foo");
    assertNotNull(foo);
    FunctionType fooCtor = (FunctionType) foo.getType();
    ObjectType proto = fooCtor.getPrototype();
    assertTrue(proto.hasOwnProperty("bar"));
    assertNotNull(s.getVar("Foo.prototype.bar"));
  }

  @Test
  public void testStubPropertyDeclarationResolvesToUnknown() {
    Scope s = buildGlobalScope(
        "/** @constructor */ function Foo() {}\n"
        + "Foo.prototype.bar;\n");
    Scope.Var v = s.getVar("Foo.prototype.bar");
    assertNotNull(v);
    assertTrue(v.isTypeInferred());
  }

  // ---------- 6. Catch parameter ----------

  @Test
  public void testCatchParameterDeclaredAndInferred() {
    Scope s = buildGlobalScope(
        "function f() { try { g(); } catch (e) { } }");
    // แม้ catch อยู่ใน function แต่ scope creator นี้ประกาศ catch ผ่าน defineCatch
    // ในระดับ scope ที่ traverse ถึง (ที่นี่คือ global-scope-builder เดียวกัน เพราะ
    // TypedScopeCreator (Global/LocalScopeBuilder) ไม่สร้าง scope ใหม่ให้ catch block)
    Scope.Var e = s.getVar("e");
    assertNotNull(e);
    assertTrue(e.isTypeInferred());
  }

  // ---------- 7. Typedef ----------

  @Test
  public void testTypedefDeclaresTypeInRegistry() {
    buildGlobalScope("/** @typedef {number} */ var MyNum;");
    JSType t = compiler.getTypeRegistry().getType("MyNum");
    assertNotNull(t);
    assertFalse(containsDiagnostic(compiler.getWarnings(),
        TypedScopeCreator.MALFORMED_TYPEDEF));
  }

  // ---------- 8. Local scope (function parameters) ----------

  @Test
  public void testLocalScopeFunctionParametersDeclaredInferred() {
    Node root = parse(
        "/**\n * @param {number} a\n * @param {string} b\n */\n"
        + "function foo(a, b) {}");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope global = creator.createScope(root, null);

    Node fn = findFunctionNode(root, "foo");
    assertNotNull("ไม่พบ function node 'foo' ใน AST", fn);

    Scope local = creator.createScope(fn, global);
    Scope.Var a = local.getVar("a");
    Scope.Var b = local.getVar("b");
    assertNotNull(a);
    assertNotNull(b);
    // ใน declareArguments() ค่า inferred ถูก hardcode เป็น true เสมอ
    assertTrue(a.isTypeInferred());
    assertTrue(b.isTypeInferred());
  }

  // ---------- 9. Boundary / null / malformed input ----------

  @Test(expected = RuntimeException.class)
  public void testCreateScopeWithNullRootThrows() {
    // boundary: root == null ไม่มีการป้องกันใน source -> คาดว่าจะเกิด RuntimeException
    // (เช่น NullPointerException) เมื่อ NodeTraversal พยายาม traverse node null
    parse(""); // init compiler ให้พร้อมก่อน (typeRegistry ต้อง valid)
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(null, null);
  }

  @Test
  public void testMalformedJavaScriptReportsParseError() {
    // อินพุตผิดรูปแบบทางไวยากรณ์
    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", "var = ;"));
    compiler.init(externs, inputs, options);
    compiler.parseInputs();
    // ไม่เรียก createScope ต่อเมื่อ parse ล้มเหลว เพื่อไม่เดา behavior ที่ไม่ได้ระบุใน source
    assertTrue("คาดว่าจะมี parse error", compiler.getErrors().length > 0);
  }

  @Test
  public void testEmptyStringSourceFile() {
    // boundary: ไฟล์ js ที่เป็น string ว่าง ต้องไม่ throw และยังมี native scope ปกติ
    Scope s = buildGlobalScope("");
    assertTrue(compiler.getErrors().length == 0);
    assertNotNull(s.getVar("Object"));
  }
}
```

---

## ตารางสรุป Test Method → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testNativeTypesDeclaredInGlobalScope` | `createInitialScope` – ทุกการเรียก `declareNativeFunctionType`/`declareNativeValueType`, กรณี `parent == null` ใน `createScope` |
| `testEmptySourceOnlyNativeTypes` | boundary: source ว่าง, ตรวจสอบ `getVar` คืน null สำหรับตัวแปรที่ไม่มีอยู่ |
| `testVarWithoutJsDocIsInferred` | `defineVar` (1 child), `defineName` – branch `info == null` → inferred |
| `testVarWithTypeAnnotationIsDeclared` | `defineName` – branch `getDeclaredTypeInAnnotation` (`info.hasType()`), `defineSlot` inferred=false |
| `testMultipleVarDeclarationsWithJsDocReportsWarning` | `defineVar` – `n.hasMoreThanOneChild() && info != null` → `MULTIPLE_VAR_DEF` |
| `testMultipleVarDeclarationsWithoutJsDocNoWarning` | `defineVar` – `hasMoreThanOneChild()` true แต่ `info == null` → ไม่รายงาน warning |
| `testEnumViaVarObjectLiteralDeclaresElements` | `getEnumType` – value เป็น `OBJECTLIT`, loop เก็บ element, `defineElement`, `typeRegistry.declareType` |
| `testEnumDuplicateKeyReportsWarning` | `getEnumType` – branch `enumType.hasOwnProperty(keyName)` → `ENUM_DUP` |
| `testEnumInitializerInvalidValueReportsWarning` | `getEnumType` – value ไม่ใช่ OBJECTLIT/qualified-name → `enumType == null` → `ENUM_INITIALIZER` |
| `testEnumAliasFromExistingEnumVar` | `getEnumType` – branch `value.isQualifiedName()` และ `var.getType() instanceof EnumType` |
| `testConstructorFunctionDeclarationDeclaresPrototype` | `defineDeclaredFunction`, `getFunctionType` (info.hasType เท็จ, build ผ่าน FunctionTypeBuilder), `defineSlot` – branch ประกาศ `.prototype` เมื่อ `isConstructor()` |
| `testPlainFunctionDeclarationHasNoPrototypeVar` | `defineSlot` – branch `fnType.isConstructor() || isInterface()` เป็น false → ไม่ประกาศ `.prototype` |
| `testFunctionAssignedToVarWithConstructorJsDoc` | `defineName` – branch `info.isConstructor()` |
| `testFunctionAliasRegistersTypeName` | `getFunctionType` – branch alias: `rValue.isQualifiedName() && scope.isGlobal()` และ `functionType.isConstructor()` → `typeRegistry.declareType` |
| `testPrototypeMethodAssignmentDeclaresProperty` | `defineNamedTypeAssign`, `maybeDeclareQualifiedName` – branch `rhsValue.getType()==FUNCTION`, `getPrototypePropertyOwner`, `ownerType.defineDeclaredProperty` |
| `testStubPropertyDeclarationResolvesToUnknown` | `maybeDeclareQualifiedName` – branch `valueType == null` → เก็บใน `stubDeclarations`, `resolveStubDeclarations` |
| `testCatchParameterDeclaredAndInferred` | `defineCatch`, `Token.CATCH` case ใน `visit` |
| `testTypedefDeclaresTypeInRegistry` | `GlobalScopeBuilder.checkForTypedef` – branch `info.hasTypedefType()`, `realType != null` |
| `testLocalScopeFunctionParametersDeclaredInferred` | `createScope` branch `parent != null` (LocalScopeBuilder), `handleFunctionInputs`, `declareArguments` loop ทั้งกรณีมี `jsDocParameter` |
| `testCreateScopeWithNullRootThrows` | boundary: `root == null` (ไม่มีการป้องกันใน source) |
| `testMalformedJavaScriptReportsParseError` | อินพุตผิดรูปแบบ (syntax error) — ตรวจสอบว่า compiler รายงาน error โดยไม่เรียก `createScope` ต่อ |
| `testEmptyStringSourceFile` | boundary: string ว่าง ไม่มี error, native scope ทำงานปกติ |

**หมายเหตุ branch ที่ไม่ได้ทดสอบ (ตามข้อกำหนดข้อ 4 ห้ามเดา):**
- `ENUM_NOT_CONSTANT` (ขึ้นกับ `CodingConvention.isValidEnumKey` ที่ไม่มีใน source ให้มา)
- `CONSTRUCTOR_EXPECTED` / old-style typedef (`checkForOldStyleTypedef`) และ delegate/subclass relationship (ขึ้นกับ `CodingConvention` ที่ไม่ทราบ default implementation แน่ชัด)
- `MALFORMED_TYPEDEF` แบบยืนยันผล (ไม่สามารถสร้าง input ที่ทำให้ `evaluate()` คืน null ได้อย่างมั่นใจจาก source ที่ให้มา)