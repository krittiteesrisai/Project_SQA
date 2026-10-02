# TypedScopeCreatorTest.java

**หมายเหตุสำคัญก่อนเริ่ม:**
- `TypedScopeCreator` เป็น package-private class ดังนั้น test class ต้องอยู่ใน package เดียวกัน (`com.google.javascript.jscomp`) จึงจะเข้าถึงได้
- การทดสอบคลาสนี้จำเป็นต้องพึ่งพา infrastructure จริงของ Closure Compiler (`Compiler`, `CompilerOptions`, `Node`, `JSType`, `Scope`) ซึ่งไม่ได้แสดง source ให้ดูทั้งหมดในโจทย์ — ผมได้ทำเครื่องหมาย `// NOTE:` ไว้ทุกจุดที่พึ่งพา behavior ของ dependency ภายนอกที่ไม่ได้ยืนยันจาก source ที่ให้มาโดยตรง (เช่น `Compiler.parseTestCode`, `getWarningCount/getErrorCount`, default `CodingConvention.isValidEnumKey`)
- Assertion ทุกจุดพยายามอ้างอิงเฉพาะ logic ที่อ่านได้จริงจาก source ของ `TypedScopeCreator` ที่ให้มา

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;

import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests สำหรับ {@link TypedScopeCreator} (Defects4J Closure-54b)
 *
 * NOTE: ใช้ Compiler จริงในการ parse ซอร์สโค้ด JS แล้วเรียก
 * TypedScopeCreator.createScope(...) ตรง ๆ เพื่อตรวจสอบ Scope/Type
 * ที่ถูกสร้างขึ้น จุดที่พึ่งพา API ภายนอกที่ไม่ได้ยืนยันจาก source
 * ที่ให้มา จะมีคอมเมนต์ // NOTE: กำกับไว้
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // NOTE: สมมติว่า Compiler#initOptions(CompilerOptions) เพียงพอสำหรับ
    // การ parse โค้ดทดสอบสั้น ๆ (ใช้แนวทางเดียวกับ unit test ภายในของ
    // Closure Compiler เอง)
    compiler.initOptions(options);
  }

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  /** NOTE: สมมติว่า Compiler มีเมธอด parseTestCode(String) สำหรับ parse
   * โค้ดทดสอบและคืน root Node (ใช้กันทั่วไปใน test suite ของ Closure). */
  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private Scope createGlobalScope(String js) {
    Node root = parse(js);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    return creator.createScope(root, null);
  }

  private JSType nativeType(com.google.javascript.rhino.jstype.JSTypeNative t) {
    return compiler.getTypeRegistry().getNativeType(t);
  }

  private Node findNodeOfType(Node n, int token) {
    if (n == null) {
      return null;
    }
    if (n.getType() == token) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findNodeOfType(c, token);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  // ---------------------------------------------------------------------
  // 1) createInitialScope: native types
  // ---------------------------------------------------------------------

  @Test
  public void testNativeTypesDeclaredInGlobalScope() {
    Scope scope = createGlobalScope("");
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("ActiveXObject"));
    assertTrue(scope.getVar("Object").getType().isFunctionType());
  }

  // ---------------------------------------------------------------------
  // 2-3) defineVar / defineName: inferred vs declared
  // ---------------------------------------------------------------------

  @Test
  public void testVarWithoutJSDoc_IsInferred() {
    Scope scope = createGlobalScope("var x = 3;");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertTrue(x.isTypeInferred());
  }

  @Test
  public void testVarWithJSDocType_IsDeclared() {
    Scope scope = createGlobalScope("/** @type {number} */ var x = 3;");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertFalse(x.isTypeInferred());
    assertEquals(nativeType(NUMBER_TYPE), x.getType());
  }

  // ---------------------------------------------------------------------
  // 4-5) defineVar: MULTIPLE_VAR_DEF branch (n.hasMoreThanOneChild() && info != null)
  // ---------------------------------------------------------------------

  @Test
  public void testMultipleVarDefinitionWithJSDoc_Warns() {
    createGlobalScope("/** @type {number} */ var x = 1, y = 2;");
    // NOTE: ใช้ getWarningCount() เพื่อยืนยันว่ามี warning เกิดขึ้น
    // (MULTIPLE_VAR_DEF) โดยไม่ได้ตรวจสอบ DiagnosticType โดยตรง
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testMultipleVarDefinitionWithoutJSDoc_NoWarning() {
    Scope scope = createGlobalScope("var x = 1, y = 2;");
    assertEquals(0, compiler.getWarningCount());
    assertNotNull(scope.getVar("x"));
    assertNotNull(scope.getVar("y"));
  }

  // ---------------------------------------------------------------------
  // 6-8) defineFunctionLiteral / defineSlot: constructor & interface handling
  // ---------------------------------------------------------------------

  @Test
  public void testFunctionDeclaration_NotConstructor_NoPrototypeSlot() {
    Scope scope = createGlobalScope("function f(a, b) {}");
    Var f = scope.getVar("f");
    assertNotNull(f);
    assertFalse(f.isTypeInferred());
    assertTrue(f.getType().isFunctionType());
    // ไม่ใช่ constructor/interface -> ไม่มีการประกาศ "f.prototype" slot
    assertNull(scope.getVar("f.prototype"));
  }

  @Test
  public void testConstructorDeclaration_DeclaresPrototypeNoWarning() {
    Scope scope = createGlobalScope("/** @constructor */ function Foo() {}");
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    assertTrue(foo.getType().toMaybeFunctionType().isConstructor());
    assertNotNull(scope.getVar("Foo.prototype"));
    // มี initial value (ตัวฟังก์ชันเอง) จึงไม่เกิด CTOR_INITIALIZER
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testInterfaceDeclaration_DeclaresPrototype() {
    Scope scope = createGlobalScope("/** @interface */ function Foo() {}");
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    assertTrue(foo.getType().toMaybeFunctionType().isInterface());
    assertNotNull(scope.getVar("Foo.prototype"));
  }

  // ---------------------------------------------------------------------
  // 9-10) CTOR_INITIALIZER / IFACE_INITIALIZER
  // ---------------------------------------------------------------------

  @Test
  public void testCtorInitializer_WarnsWhenNoInitialValue() {
    createGlobalScope("/** @constructor */ var Foo;");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testIfaceInitializer_WarnsWhenNoInitialValue() {
    createGlobalScope("/** @interface */ var Foo;");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  // ---------------------------------------------------------------------
  // 11-14) Enum handling (createEnumTypeFromNodes / ENUM_INITIALIZER / ENUM_DUP)
  // ---------------------------------------------------------------------

  @Test
  public void testEnumInitializer_InvalidValue_Warns() {
    // initial value ไม่ใช่ OBJECTLIT หรือ qualified name -> ENUM_INITIALIZER
    createGlobalScope("/** @enum */ var Foo = 5;");
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testEnumInitializer_ObjectLiteral_NoWarning() {
    Scope scope = createGlobalScope("/** @enum */ var Foo = {BAR: 1};");
    assertEquals(0, compiler.getWarningCount());
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    assertTrue(foo.getType() instanceof EnumType);
  }

  @Test
  public void testEnumDuplicateKey_Warns() {
    // NOTE: สมมติว่า "BAR" (ตัวพิมพ์ใหญ่) เป็น valid enum key ตาม default
    // CodingConvention ของ Closure Compiler (ไม่ได้ยืนยันจาก source ที่ให้มา)
    createGlobalScope("/** @enum */ var Foo = {BAR: 1, BAR: 2};");
    assertTrue(compiler.getWarningCount() >= 1); // ENUM_DUP
  }

  @Test
  public void testEnumAlias_SharesSameType() {
    Scope scope = createGlobalScope(
        "/** @enum {number} */ var Foo = {A: 1};\n"
        + "/** @enum */ var Bar = Foo;");
    Var foo = scope.getVar("Foo");
    Var bar = scope.getVar("Bar");
    assertNotNull(foo);
    assertNotNull(bar);
    assertSame(foo.getType(), bar.getType());
  }

  // ---------------------------------------------------------------------
  // 15) processObjectLitProperties
  // ---------------------------------------------------------------------

  @Test
  public void testObjectLiteralProperties_DeclaredOnType() {
    Node root = parse("var obj = {a: 1, b: 'str'};");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    Node objLitNode = findNodeOfType(root, Token.OBJECTLIT);
    assertNotNull(objLitNode);
    ObjectType objLitType = ObjectType.cast(objLitNode.getJSType());
    assertNotNull(objLitType);
    assertTrue(objLitType.hasOwnProperty("a"));
    assertTrue(objLitType.hasOwnProperty("b"));
  }

  // ---------------------------------------------------------------------
  // 16-18) @lends handling
  // ---------------------------------------------------------------------

  @Test
  public void testLendsUnknownName_Warns() {
    createGlobalScope("/** @lends {UnknownName} */ ({});");
    assertTrue(compiler.getWarningCount() >= 1); // UNKNOWN_LENDS
  }

  @Test
  public void testLendsOnNonObject_Warns() {
    createGlobalScope(
        "/** @type {number} */ var x = 5;\n"
        + "/** @lends {x} */ ({});");
    assertTrue(compiler.getWarningCount() >= 1); // LENDS_ON_NON_OBJECT
  }

  @Test
  public void testLendsValid_NoWarnings() {
    createGlobalScope(
        "var x = {};\n"
        + "/** @lends {x} */ ({y: 1});");
    assertEquals(0, compiler.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // 19) defineCatch
  // ---------------------------------------------------------------------

  @Test
  public void testCatchParameter_DeclaredInferred() {
    Scope scope = createGlobalScope("try {} catch (e) {}");
    Var e = scope.getVar("e");
    assertNotNull(e);
    assertTrue(e.isTypeInferred());
  }

  // ---------------------------------------------------------------------
  // 20-21) Stub declarations (GETPROP w/ EXPR_RESULT parent)
  // ---------------------------------------------------------------------

  @Test
  public void testStubDeclarationWithType_Declared() {
    Scope scope = createGlobalScope(
        "var foo = {};\n"
        + "/** @type {number} */\n"
        + "foo.bar;");
    Var bar = scope.getVar("foo.bar");
    assertNotNull(bar);
    assertFalse(bar.isTypeInferred());
    assertEquals(nativeType(NUMBER_TYPE), bar.getType());
  }

  @Test
  public void testStubDeclarationWithoutType_ResolvedUnknown() {
    Scope scope = createGlobalScope(
        "var foo = {};\n"
        + "foo.bar;");
    Var bar = scope.getVar("foo.bar");
    assertNotNull(bar);
    assertTrue(bar.isTypeInferred());
    assertTrue(bar.getType().isUnknownType());
  }

  // ---------------------------------------------------------------------
  // 22) ASSIGN of function literal to qualified name
  // ---------------------------------------------------------------------

  @Test
  public void testAssignFunctionLiteralToQualifiedName_Declared() {
    Scope scope = createGlobalScope(
        "var foo = {};\n"
        + "foo.bar = function() {};");
    Var bar = scope.getVar("foo.bar");
    assertNotNull(bar);
    assertFalse(bar.isTypeInferred());
    assertTrue(bar.getType().isFunctionType());
  }

  // ---------------------------------------------------------------------
  // 23-24) "prototype" special-case in maybeDeclareQualifiedName
  // ---------------------------------------------------------------------

  @Test
  public void testPrototypeReassignment_NoExplicitSuper_UndeclaredAndNotRedeclared() {
    Node root = parse(
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "Foo.prototype = {y: 1};");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);

    // ไม่มี @extends -> Foo.prototype ถูกประกาศแบบ inferred=true ตอนแรก
    // เมื่อพบ ASSIGN ใหม่ (rhsValue ไม่ใช่ FUNCTION) จะ undeclare แล้วไม่ redeclare
    assertNull(scope.getVar("Foo.prototype"));

    Node objLitNode = findNodeOfType(root, Token.OBJECTLIT);
    ObjectType objLitType = ObjectType.cast(objLitNode.getJSType());
    assertNotNull(objLitType);
    assertTrue(objLitType.hasOwnProperty("y"));
  }

  @Test
  public void testPrototypeReassignment_ExplicitSuper_Ignored() {
    Scope scope = createGlobalScope(
        "/** @constructor */\n"
        + "function Super() {}\n"
        + "/** @constructor @extends {Super} */\n"
        + "function Sub() {}\n"
        + "Sub.prototype = {z: 1};");
    Var proto = scope.getVar("Sub.prototype");
    assertNotNull(proto);
    assertFalse(proto.isTypeInferred());
    ObjectType protoType = ObjectType.cast(proto.getType());
    // การ assign ถูกละเว้น (return early) ดังนั้น property z ไม่ควรถูกเพิ่ม
    assertFalse(protoType.hasOwnProperty("z"));
  }

  // ---------------------------------------------------------------------
  // 25-27) LocalScopeBuilder: function parameters
  // ---------------------------------------------------------------------

  @Test
  public void testFunctionParametersDeclaredInLocalScope() {
    Node root = parse(
        "/** @param {number} a\n@param {string} b */\n"
        + "function f(a, b) {}");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);
    Node fnNode = findNodeOfType(root, Token.FUNCTION);
    assertNotNull(fnNode);
    Scope localScope = creator.createScope(fnNode, globalScope);

    Var a = localScope.getVar("a");
    Var b = localScope.getVar("b");
    assertNotNull(a);
    assertNotNull(b);
    assertFalse(a.isTypeInferred());
    assertFalse(b.isTypeInferred());
    assertEquals(nativeType(NUMBER_TYPE), a.getType());
    assertEquals(nativeType(STRING_TYPE), b.getType());
  }

  @Test
  public void testFunctionParameterWithoutJSDoc_DeclaredUnknown() {
    Node root = parse("function f(a) {}");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);
    Node fnNode = findNodeOfType(root, Token.FUNCTION);
    Scope localScope = creator.createScope(fnNode, globalScope);

    Var a = localScope.getVar("a");
    assertNotNull(a);
    // jsDocParameter != null (แม้ไม่มี @param, builder ยังสร้าง param node ให้)
    // ทำให้ inferred flag ที่ถูกส่งเข้า defineSlot คือ false เสมอในสาขานี้
    assertFalse(a.isTypeInferred());
  }

  @Test
  public void testExtraParameterWithoutMatchingJSDoc_Inferred() {
    Node root = parse("/** @param {number} a */\nfunction f(a, b) {}");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);
    Node fnNode = findNodeOfType(root, Token.FUNCTION);
    Scope localScope = creator.createScope(fnNode, globalScope);

    Var b = localScope.getVar("b");
    assertNotNull(b);
    // jsDocParameter หมดก่อน astParameter -> else branch: defineSlot(..., null, true)
    assertTrue(b.isTypeInferred());
  }

  // ---------------------------------------------------------------------
  // 28) Bleeding function name in local scope
  // ---------------------------------------------------------------------

  @Test
  public void testBleedingFunctionName_DeclaredInLocalScope() {
    Node root = parse("var f = function foo() { return foo; };");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);
    Node fnNode = findNodeOfType(root, Token.FUNCTION);
    Scope localScope = creator.createScope(fnNode, globalScope);

    Var foo = localScope.getVar("foo");
    assertNotNull(foo);
    assertFalse(foo.isTypeInferred());
  }

  // ---------------------------------------------------------------------
  // 29) shouldDeclareOnGlobalThis
  // ---------------------------------------------------------------------

  @Test
  public void testGlobalThisPropertyDeclaredForVar() {
    createGlobalScope("var GlobalVar = 5;");
    JSTypeRegistry registry = compiler.getTypeRegistry();
    ObjectType globalThis = registry.getNativeObjectType(GLOBAL_THIS);
    assertTrue(globalThis.hasOwnProperty("GlobalVar"));
  }

  // ---------------------------------------------------------------------
  // 30) "Window" special-case (smoke test เพื่อดัก NPE/exception)
  // ---------------------------------------------------------------------

  @Test
  public void testWindowConstructorSpecialCase_NoCrash() {
    Scope scope = createGlobalScope("/** @constructor */\nfunction Window() {}");
    Var window = scope.getVar("Window");
    assertNotNull(window);
    assertTrue(window.getType().isFunctionType());
  }

  // ---------------------------------------------------------------------
  // 31) Boundary: empty input
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyScript_NoErrors() {
    createGlobalScope("");
    assertEquals(0, compiler.getErrorCount());
  }

  // ---------------------------------------------------------------------
  // 32-33) Typedef handling (GlobalScopeBuilder.checkForTypedef)
  // ---------------------------------------------------------------------

  @Test
  public void testTypedefDeclaresType() {
    createGlobalScope("/** @typedef {number} */\nvar NumberAlias;");
    JSType numberAliasType = compiler.getTypeRegistry().getType("NumberAlias");
    assertNotNull(numberAliasType);
  }

  @Test
  public void testTypedefOnQualifiedName() {
    Scope scope = createGlobalScope(
        "var ns = {};\n"
        + "/** @typedef {number} */\n"
        + "ns.NumberAlias;");
    Var v = scope.getVar("ns.NumberAlias");
    assertNotNull(v);
  }

  // ---------------------------------------------------------------------
  // 34) Global ctor alias branch ใน createFunctionTypeFromNodes
  // ---------------------------------------------------------------------

  @Test
  public void testCtorAlias_SharesFunctionType() {
    Scope scope = createGlobalScope(
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/** @constructor */\n"
        + "var Bar = Foo;");
    Var foo = scope.getVar("Foo");
    Var bar = scope.getVar("Bar");
    assertNotNull(foo);
    assertNotNull(bar);
    assertSame(foo.getType(), bar.getType());
  }

  // ---------------------------------------------------------------------
  // 35) shouldUseFunctionLiteralType: global scope, no jsdoc
  // ---------------------------------------------------------------------

  @Test
  public void testVarAssignedFunctionLiteral_TreatedAsDeclared() {
    Scope scope = createGlobalScope("var f = function() {};");
    Var f = scope.getVar("f");
    assertNotNull(f);
    assertFalse(f.isTypeInferred());
    assertTrue(f.getType().isFunctionType());
  }

  // ---------------------------------------------------------------------
  // 36-37) getDeclaredType: @const branch + OR idiom
  // ---------------------------------------------------------------------

  @Test
  public void testConstVarWithNumberLiteral_UsesLiteralType() {
    Scope scope = createGlobalScope("/** @const */ var X = 5;");
    Var x = scope.getVar("X");
    assertNotNull(x);
    assertFalse(x.isTypeInferred());
    assertEquals(nativeType(NUMBER_TYPE), x.getType());
  }

  @Test
  public void testConstVarOrIdiom_UsesSecondClauseType() {
    Scope scope = createGlobalScope("/** @const */ var x = x || {};");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertFalse(x.isTypeInferred());
    assertNotNull(x.getType());
  }

  // ---------------------------------------------------------------------
  // 38) Malformed input: ต้องไม่ throw exception
  // ---------------------------------------------------------------------

  @Test
  public void testMalformedInput_DoesNotCrash() {
    Node root = parse("var ;");
    assertTrue(compiler.getErrorCount() > 0);
    if (root != null) {
      TypedScopeCreator creator = new TypedScopeCreator(compiler);
      try {
        creator.createScope(root, null);
      } catch (Exception e) {
        fail("createScope ไม่ควร throw exception บน malformed input: " + e);
      }
    }
  }
}
```

# สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testNativeTypesDeclaredInGlobalScope | `createInitialScope`: declareNativeFunctionType/declareNativeValueType ทุกตัว |
| testVarWithoutJSDoc_IsInferred | `defineName`: info null, type=null → inferred=true |
| testVarWithJSDocType_IsDeclared | `getDeclaredType`: info.hasType()==true branch |
| testMultipleVarDefinitionWithJSDoc_Warns | `defineVar`: hasMoreThanOneChild && info!=null → MULTIPLE_VAR_DEF |
| testMultipleVarDefinitionWithoutJSDoc_NoWarning | `defineVar`: hasMoreThanOneChild && info==null (no warning) |
| testFunctionDeclaration_NotConstructor_NoPrototypeSlot | `defineSlot`: fnType != ctor/interface → skip prototype declare |
| testConstructorDeclaration_DeclaresPrototypeNoWarning | `defineSlot`: isConstructor branch, initialValue!=null → no CTOR_INITIALIZER |
| testInterfaceDeclaration_DeclaresPrototype | `defineSlot`: isInterface branch |
| testCtorInitializer_WarnsWhenNoInitialValue | `defineSlot`: newVar.getInitialValue()==null && ctor → CTOR_INITIALIZER |
| testIfaceInitializer_WarnsWhenNoInitialValue | เดียวกันแต่ isInterface → IFACE_INITIALIZER |
| testEnumInitializer_InvalidValue_Warns | `defineSlot`: !isValidValue → ENUM_INITIALIZER |
| testEnumInitializer_ObjectLiteral_NoWarning | `defineSlot`: isValidValue==true (OBJECTLIT) |
| testEnumDuplicateKey_Warns | `createEnumTypeFromNodes`: hasOwnProperty(keyName)==true → ENUM_DUP |
| testEnumAlias_SharesSameType | `createEnumTypeFromNodes`: rValue.isQualifiedName() alias branch |
| testObjectLiteralProperties_DeclaredOnType | `processObjectLitProperties`: keyType!=null, objLitType!=null |
| testLendsUnknownName_Warns | `defineObjectLiteral`: lendsVar==null → UNKNOWN_LENDS |
| testLendsOnNonObject_Warns | `defineObjectLiteral`: !type.isSubtype(OBJECT) → LENDS_ON_NON_OBJECT |
| testLendsValid_NoWarnings | `defineObjectLiteral`: lendsVar!=null && isSubtype==true |
| testCatchParameter_DeclaredInferred | `defineCatch`: defineSlot(catchName, n, null) |
| testStubDeclarationWithType_Declared | `maybeDeclareQualifiedName`: valueType!=null จาก @type บน stub |
| testStubDeclarationWithoutType_ResolvedUnknown | `resolveStubDeclarations`: valueType==null → stubDeclarations, unknown type |
| testAssignFunctionLiteralToQualifiedName_Declared | `maybeDeclareQualifiedName`: inferred=false เพราะ rhsValue FUNCTION และยังไม่ declared |
| testPrototypeReassignment_NoExplicitSuper_UndeclaredAndNotRedeclared | `maybeDeclareQualifiedName`: "prototype" branch, qVar.isTypeInferred()==true → undeclare, ไม่ redeclare |
| testPrototypeReassignment_ExplicitSuper_Ignored | `maybeDeclareQualifiedName`: qVar.isTypeInferred()==false → return early |
| testFunctionParametersDeclaredInLocalScope | `declareArguments`: jsDocParameter!=null loop |
| testFunctionParameterWithoutJSDoc_DeclaredUnknown | `declareArguments`: jsDocParameter!=null (unknown type, inferred=false) |
| testExtraParameterWithoutMatchingJSDoc_Inferred | `declareArguments`: jsDocParameter==null → else branch inferred=true |
| testBleedingFunctionName_DeclaredInLocalScope | `handleFunctionInputs`: fnVar==null → defineSlot bleeding name |
| testGlobalThisPropertyDeclaredForVar | `defineSlot`: shouldDeclareOnGlobalThis==true, defineInferredProperty |
| testWindowConstructorSpecialCase_NoCrash | `defineSlot`: "Window" special-case branch (smoke) |
| testEmptyScript_NoErrors | boundary: empty input |
| testTypedefDeclaresType | `checkForTypedef`: realType!=null, VAR NAME (ไม่ใช่ GETPROP) |
| testTypedefOnQualifiedName | `checkForTypedef`: candidate.getType()==GETPROP → defineSlot NO_TYPE |
| testCtorAlias_SharesFunctionType | `createFunctionTypeFromNodes`: rValue alias เป็น constructor ที่มีอยู่แล้ว |
| testVarAssignedFunctionLiteral_TreatedAsDeclared | `shouldUseFunctionLiteralType`: scope.isGlobal()==true |
| testConstVarWithNumberLiteral_UsesLiteralType | `getDeclaredType`: info.isConstant() && rValue.getJSType()!=null && !unknown |
| testConstVarOrIdiom_UsesSecondClauseType | `getDeclaredType`: OR-idiom branch (namesMatch && secondClause type) |
| testMalformedInput_DoesNotCrash | null/malformed input, ป้องกัน uncaught exception |

**ข้อจำกัดที่ทราบ (ไม่ได้เดา behavior):** ไม่ได้ทดสอบ branch `ENUM_NOT_CONSTANT` จาก keyName==null (getter/setter key) และ `!codingConvention.isValidEnumKey` เนื่องจากพฤติกรรมขึ้นกับ `CodingConvention`/`NodeUtil` ที่ไม่มี source ให้ตรวจสอบ รวมถึง `MALFORMED_TYPEDEF` (ขึ้นกับ `JSTypeExpression.evaluate` ว่าจะคืน null เมื่อไร) จึงละเว้นตามข้อกำหนดที่ 4