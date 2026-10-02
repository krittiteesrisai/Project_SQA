# หมายเหตุก่อนเริ่ม (สมมติฐานสำคัญ)

`TypedScopeCreator` เป็น `final class` แบบ **package-private** และพึ่งพา internal object จำนวนมาก (Compiler, Scope, JSTypeRegistry ฯลฯ) ที่ไม่มี mocking framework ให้ใช้ใน classpath ที่กำหนด ดังนั้นแนวทางที่ทดสอบได้จริงและไม่ hallucinate API คือ **สร้าง instance จริงผ่าน `Compiler`/`CompilerOptions`/`SourceFile`** แล้วเรียก `createScope(...)` ตรง ๆ (ซึ่งเป็น pattern เดียวกับที่ใช้จริงใน closure-compiler test suite เดิม)

จุดที่ผมไม่มั่นใจ 100% ว่าตรงกับ signature จริงของเวอร์ชันนี้ (เช่น `JSError#getType()`, พฤติกรรมของ `isValidEnumKey("length")` ใน default `CodingConvention`) ผม**คอมเมนต์กำกับไว้ในโค้ด**ตามข้อกำหนด

```java
package com.google.javascript.jscomp;

import static com.google.javascript.jscomp.TypeCheck.ENUM_NOT_CONSTANT;
import static com.google.javascript.jscomp.TypeCheck.MULTIPLE_VAR_DEF;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSType;

import org.junit.Test;

/**
 * JUnit4 tests for {@link TypedScopeCreator} (Defects4J Closure-172b).
 *
 * แนวทาง: ใช้ Compiler จริง parse ซอร์สโค้ด JS แล้วเรียก
 * TypedScopeCreator#createScope(...) ตรง ๆ (เหมือนวิธีที่ใช้จริงใน
 * closure-compiler test suite) เนื่องจากไม่มี mocking framework ใน classpath
 * และคลาสเป็น package-private จึงต้องอยู่ใน package เดียวกัน
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;
  private TypedScopeCreator creator;
  private Node root;

  // ---------- Helpers ----------

  /** Parse externs+js และคืน root node (children: externsRoot, jsRoot) */
  private Node parse(String externsCode, String js) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        ImmutableList.of(SourceFile.fromCode("externs.js", externsCode)),
        ImmutableList.of(SourceFile.fromCode("input.js", js)),
        options);
    return compiler.parseInputs();
  }

  /** Parse js (externs ว่าง) แล้วสร้าง global scope ผ่าน TypedScopeCreator */
  private Scope getGlobalScope(String js) {
    return getGlobalScope("", js);
  }

  private Scope getGlobalScope(String externsCode, String js) {
    root = parse(externsCode, js);
    assertNotNull("การ parse ควรสำเร็จ (ไม่มี syntax error)", root);
    creator = new TypedScopeCreator(compiler);
    return creator.createScope(root, null);
  }

  /** หา FUNCTION node แรกที่เจอแบบ DFS */
  private Node findFunction(Node n) {
    if (n == null) {
      return null;
    }
    if (n.isFunction()) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findFunction(c);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  /**
   * ตรวจว่ามี warning ของ DiagnosticType ที่กำหนดหรือไม่
   * NOTE: สมมติฐาน - JSError มีเมธอด getType() คืนค่า DiagnosticType
   * (พบ pattern นี้ในซอร์ส closure-compiler รุ่นใกล้เคียง แต่ยืนยัน signature
   * แน่ชัด 100% ไม่ได้ในสภาพแวดล้อมนี้)
   */
  private boolean hasWarning(DiagnosticType type) {
    for (JSError e : compiler.getWarnings()) {
      if (e.getType() == type) {
        return true;
      }
    }
    return false;
  }

  // ---------- 1) createInitialScope / native types ----------

  @Test
  public void testCreateInitialScopeDeclaresNativeTypes() {
    Scope scope = getGlobalScope("");
    // native constructors/prototypes ที่ declareNativeFunctionType ประกาศไว้
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Object.prototype"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("Function"));
    // declareNativeValueType
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("ActiveXObject"));
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testEmptyProgramGlobalScopeNoWarnings() {
    getGlobalScope("");
    assertEquals(0, compiler.getWarnings().length);
  }

  // ---------- 2) Malformed input (boundary: syntax error) ----------

  @Test
  public void testMalformedInputProducesParseErrors() {
    Node r = parse("", "var x = ;");
    // ไม่เรียก createScope ต่อเมื่อมี parse error (พฤติกรรมจริงของ TypedScopeCreator
    // ไม่ได้ถูกออกแบบมาจัดการ AST ที่ parse ไม่สำเร็จ)
    assertTrue("ควรมี error จากการ parse", compiler.getErrors().length > 0);
    // ไม่ assert ว่า r เป็น null เพราะไม่แน่ใจ 100% ว่า parseInputs()
    // คืน null เสมอเมื่อ parse error (คอมเมนต์กำกับความไม่แน่ใจ)
  }

  // ---------- 3) VAR declaration: inferred vs declared ----------

  @Test
  public void testVarDeclarationInferredWithoutJSDoc() {
    Scope scope = getGlobalScope("var x = 1;");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertTrue("ไม่มี JSDoc => type ควรถูก infer", x.isTypeInferred());
  }

  @Test
  public void testVarDeclarationWithJSDocType() {
    Scope scope = getGlobalScope("/** @type {number} */ var x = 1;");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertFalse("มี @type => ควรเป็น declared ไม่ใช่ inferred", x.isTypeInferred());
    assertEquals("number", x.getType().toString());
  }

  // ---------- 4) MULTIPLE_VAR_DEF branch ----------

  @Test
  public void testMultipleVarDefWithJSDocReportsWarning() {
    Scope scope = getGlobalScope(
        "/** @type {number} */ var x = 1, y = 2;");
    assertTrue(hasWarning(MULTIPLE_VAR_DEF));
    assertNotNull(scope.getVar("x"));
    assertNotNull(scope.getVar("y"));
  }

  @Test
  public void testMultipleVarDefWithoutJSDocNoWarning() {
    Scope scope = getGlobalScope("var x = 1, y = 2;");
    assertFalse(hasWarning(MULTIPLE_VAR_DEF));
    assertNotNull(scope.getVar("x"));
    assertNotNull(scope.getVar("y"));
  }

  // ---------- 5) Function literal declaration ----------

  @Test
  public void testFunctionDeclarationDeclaredType() {
    Scope scope = getGlobalScope("function f(a, b) {}");
    Var f = scope.getVar("f");
    assertNotNull(f);
    assertFalse(f.isTypeInferred());
    assertTrue(f.getType().isFunctionType());
    assertTrue(f.getType().toMaybeFunctionType().isOrdinaryFunction()
        || f.getType().toMaybeFunctionType() != null);
  }

  // ---------- 6) Enum handling ----------

  @Test
  public void testEnumObjectLiteralDeclaration() {
    Scope scope = getGlobalScope(
        "/** @enum {number} */ var Color = { RED: 1, GREEN: 2 };");
    Var color = scope.getVar("Color");
    assertNotNull(color);
    assertTrue(color.getType() instanceof EnumType);
    assertFalse(hasWarning(TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnumInitializerNotObjectLiteralOrEnumWarning() {
    // rValue เป็น number literal ไม่ใช่ object literal / qualified name
    // => ENUM_INITIALIZER ควรถูก report ตาม defineSlot()
    getGlobalScope("/** @enum {number} */ var Color = 5;");
    assertTrue(hasWarning(TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnumAliasingNoWarning() {
    // aliasing: var MyColor = Color; (Color เป็น EnumType อยู่แล้ว)
    Scope scope = getGlobalScope(
        "/** @enum {number} */ var Color = { RED: 1 };\n"
        + "/** @enum {number} */ var MyColor = Color;");
    assertFalse(hasWarning(TypedScopeCreator.ENUM_INITIALIZER));
    Var myColor = scope.getVar("MyColor");
    Var color = scope.getVar("Color");
    assertNotNull(myColor);
    assertTrue(myColor.getType() instanceof EnumType);
    // ควร reference EnumType เดียวกับ Color (ตาม logic aliasing)
    assertTrue(myColor.getType() == color.getType());
  }

  @Test
  public void testEnumInvalidKeyReportsWarning() {
    // สมมติฐาน: default CodingConvention#isValidEnumKey("length") == false
    // (พฤติกรรมนี้พบใน closure-compiler รุ่นใกล้เคียงกัน แต่ไม่สามารถยืนยัน
    // ได้แน่นอน 100% ในสภาพแวดล้อมนี้ — คอมเมนต์กำกับความไม่แน่ใจ)
    getGlobalScope(
        "/** @enum {number} */ var Color = { length: 1, RED: 2 };");
    assertTrue(hasWarning(ENUM_NOT_CONSTANT));
  }

  // ---------- 7) Constructor / Interface initializer ----------

  @Test
  public void testConstructorWithoutInitializerWarning() {
    getGlobalScope("/** @constructor */ var Foo;");
    assertTrue(hasWarning(TypedScopeCreator.CTOR_INITIALIZER));
  }

  @Test
  public void testInterfaceWithoutInitializerWarning() {
    getGlobalScope("/** @interface */ var Foo;");
    assertTrue(hasWarning(TypedScopeCreator.IFACE_INITIALIZER));
  }

  @Test
  public void testConstructorWithInitializerNoWarning() {
    Scope scope = getGlobalScope("/** @constructor */ function Foo() {}");
    assertFalse(hasWarning(TypedScopeCreator.CTOR_INITIALIZER));
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    assertTrue(foo.getType().isFunctionType());
  }

  // ---------- 8) Typedef (GlobalScopeBuilder.checkForTypedef) ----------

  @Test
  public void testTypedefDeclarationRegistersType() {
    getGlobalScope("/** @typedef {number} */ var MyNumber;");
    JSType t = compiler.getTypeRegistry().getType("MyNumber");
    assertNotNull("typedef ควรถูก declare ใน type registry", t);
    assertFalse(hasWarning(TypedScopeCreator.MALFORMED_TYPEDEF));
  }

  // ---------- 9) @lends handling ----------

  @Test
  public void testLendsUnknownVariableWarning() {
    getGlobalScope("var obj = /** @lends {UnknownName} */ ({});");
    assertTrue(hasWarning(TypedScopeCreator.UNKNOWN_LENDS));
  }

  @Test
  public void testLendsOnNonObjectWarning() {
    getGlobalScope(
        "/** @type {number} */ var num = 5;\n"
        + "var obj = /** @lends {num} */ ({});");
    assertTrue(hasWarning(TypedScopeCreator.LENDS_ON_NON_OBJECT));
  }

  @Test
  public void testLendsOnValidObjectNoWarning() {
    getGlobalScope(
        "var ns = {};\n"
        + "var obj = /** @lends {ns} */ ({ foo: 1 });");
    assertFalse(hasWarning(TypedScopeCreator.UNKNOWN_LENDS));
    assertFalse(hasWarning(TypedScopeCreator.LENDS_ON_NON_OBJECT));
  }

  // ---------- 10) Qualified name property declaration (ASSIGN / GETPROP) ----------

  @Test
  public void testQualifiedNamePropertyDeclarationWithType() {
    Scope scope = getGlobalScope(
        "var ns = {};\n"
        + "/** @type {number} */\n"
        + "ns.foo = 1;");
    Var nsFoo = scope.getVar("ns.foo");
    assertNotNull(nsFoo);
    assertFalse(nsFoo.isTypeInferred());
    assertEquals("number", nsFoo.getType().toString());
  }

  // ---------- 11) Stub declaration (GETPROP without value) ----------

  @Test
  public void testStubDeclarationResolvesToUnknown() {
    Scope scope = getGlobalScope(
        "var ns = {};\n"
        + "ns.foo;");
    Var nsFoo = scope.getVar("ns.foo");
    assertNotNull("stub ควรถูก resolve หลัง resolveStubDeclarations()", nsFoo);
    assertTrue(nsFoo.isTypeInferred());
  }

  @Test
  public void testStubDeclarationWithTypeNotTreatedAsStub() {
    Scope scope = getGlobalScope(
        "var ns = {};\n"
        + "/** @type {number} */\n"
        + "ns.foo;");
    Var nsFoo = scope.getVar("ns.foo");
    assertNotNull(nsFoo);
    assertFalse(nsFoo.isTypeInferred());
    assertEquals("number", nsFoo.getType().toString());
  }

  // ---------- 12) Catch parameter ----------

  @Test
  public void testCatchParameterDeclaration() {
    Scope scope = getGlobalScope(
        "try { throw 1; } catch (e) { }");
    Var e = scope.getVar("e");
    assertNotNull(e);
    assertTrue(e.isTypeInferred());
  }

  // ---------- 13) LocalScopeBuilder: parameters + local vars ----------

  @Test
  public void testLocalScopeParametersAndVars() {
    Scope globalScope = getGlobalScope(
        "function f(a, b) { var c = a + b; return c; }");
    Node fnNode = findFunction(root.getLastChild());
    assertNotNull(fnNode);

    Scope localScope = creator.createScope(fnNode, globalScope);
    Var a = localScope.getVar("a");
    Var b = localScope.getVar("b");
    Var c = localScope.getVar("c");

    assertNotNull(a);
    assertNotNull(b);
    assertNotNull(c);
    assertTrue(a.isTypeInferred());
    assertTrue(b.isTypeInferred());
    assertTrue(c.isTypeInferred());
    assertFalse(localScope.isGlobal());
  }

  // ---------- 14) Boundary / sanity: static constants ----------

  @Test
  public void testDelegateProxySuffixNotEmpty() {
    assertNotNull(TypedScopeCreator.DELEGATE_PROXY_SUFFIX);
    assertFalse(TypedScopeCreator.DELEGATE_PROXY_SUFFIX.isEmpty());
  }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testCreateInitialScopeDeclaresNativeTypes | `createInitialScope`, `declareNativeFunctionType`, `declareNativeValueType` (happy path, ไม่มี branch ซับซ้อน แต่ยืนยัน baseline) |
| testEmptyProgramGlobalScopeNoWarnings | boundary: input ว่าง, ไม่ trigger warning ใด ๆ |
| testMalformedInputProducesParseErrors | อินพุตผิดรูปแบบ (syntax error) ก่อนเข้าสู่ TypedScopeCreator |
| testVarDeclarationInferredWithoutJSDoc | `defineName`: `info==null` → `type==null` → inferred=true |
| testVarDeclarationWithJSDocType | `getDeclaredType`: `info.hasType()` == true → declared |
| testMultipleVarDefWithJSDocReportsWarning | `defineVar`: `hasMoreThanOneChild()==true && info!=null` → MULTIPLE_VAR_DEF |
| testMultipleVarDefWithoutJSDocNoWarning | `defineVar`: `hasMoreThanOneChild()==true && info==null` → ไม่ report |
| testFunctionDeclarationDeclaredType | `defineFunctionLiteral` + `isFunctionDeclaration` branch |
| testEnumObjectLiteralDeclaration | `createEnumTypeFromNodes` + object-literal element collection |
| testEnumInitializerNotObjectLiteralOrEnumWarning | `defineSlot`: `type instanceof EnumType` + `isValidValue==false` → ENUM_INITIALIZER |
| testEnumAliasingNoWarning | `createEnumTypeFromNodes`: `rValue.isQualifiedName()` alias branch, `isValidValue==true` |
| testEnumInvalidKeyReportsWarning | `createEnumTypeFromNodes`: `!codingConvention.isValidEnumKey(keyName)` → ENUM_NOT_CONSTANT (มีคอมเมนต์กำกับสมมติฐาน) |
| testConstructorWithoutInitializerWarning | `finishConstructorDefinition`: `fnType.isConstructor()` + `initialValue==null` → CTOR_INITIALIZER |
| testInterfaceWithoutInitializerWarning | `finishConstructorDefinition`: `fnType.isInterface()` branch → IFACE_INITIALIZER |
| testConstructorWithInitializerNoWarning | `finishConstructorDefinition`: `initialValue!=null` → ไม่ report |
| testTypedefDeclarationRegistersType | `GlobalScopeBuilder.checkForTypedef`: `info.hasTypedefType()==true`, `realType!=null` |
| testLendsUnknownVariableWarning | `defineObjectLiteral`: `lendsVar==null` → UNKNOWN_LENDS |
| testLendsOnNonObjectWarning | `defineObjectLiteral`: `!type.isSubtype(OBJECT_TYPE)` → LENDS_ON_NON_OBJECT |
| testLendsOnValidObjectNoWarning | `defineObjectLiteral`: happy path ของ @lends |
| testQualifiedNamePropertyDeclarationWithType | `maybeDeclareQualifiedName` (ASSIGN + GETPROP, valueType!=null, inferred=false) |
| testStubDeclarationResolvesToUnknown | `maybeDeclareQualifiedName`: `valueType==null && parent.isExprResult()` → stub → `resolveStubDeclarations` |
| testStubDeclarationWithTypeNotTreatedAsStub | `maybeDeclareQualifiedName`: `valueType!=null` → ไม่เข้า stub path |
| testCatchParameterDeclaration | `defineCatch` (Token.CATCH branch), inferred=true |
| testLocalScopeParametersAndVars | `LocalScopeBuilder.build/handleFunctionInputs/declareArguments` (parent!=null branch ของ `createScope`) |
| testDelegateProxySuffixNotEmpty | boundary check ค่าคงที่ static (sanity) |

**ข้อจำกัดที่ไม่ครอบคลุม (ระบุตามข้อ 4):** `patchGlobalScope`, `applyDelegateRelationship`, `checkForClassDefiningCalls`, `Window` special-case, และ branch `keyName==null` ใน enum (ES5 computed/getter key) ไม่ได้เขียนทดสอบเนื่องจากต้องพึ่งพา `CodingConvention`/สถานการณ์เฉพาะที่ไม่สามารถยืนยัน behavior จากซอร์สที่ให้มาได้อย่างแน่ชัดโดยไม่เดา