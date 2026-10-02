# TypedScopeCreatorTest.java

⚠️ **หมายเหตุสำคัญก่อนโค้ด**: `TypedScopeCreator` เป็น package-private class ที่ผูกแน่นกับ internal infrastructure ของ Closure Compiler (`Compiler`, `Scope`, `JSTypeRegistry`, `TypeValidator` เป็นต้น) ไม่มีทางสร้าง instance แบบ isolate ได้จริงโดยไม่พึ่ง `com.google.javascript.jscomp.Compiler` (concrete impl ของ `AbstractCompiler`) ดังนั้นชุดทดสอบนี้:
- ใช้ `createInitialScope()` (ถูก mark `@VisibleForTesting` ในซอร์ส) เรียกตรง ๆ เพื่อทดสอบ native type declarations แบบ pure unit test
- ใช้ `createScope(root, null)` เรียกตรง ๆ กับ AST ที่ parse จริงเพื่อทดสอบ branch ต่าง ๆ ของ `define()/defineName()/getEnumType()/defineSlot()/maybeDeclareQualifiedName()`
- จุดที่ผมไม่มั่นใจ 100% ว่าตรงกับ behavior จริง (เพราะ dependency class เช่น `TypeValidator`, parser JSDoc-attachment ไม่ได้แสดงในซอร์สที่ให้มา) จะมีคอมเมนต์ `// NOTE:` กำกับไว้ชัดเจน

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Unit tests สำหรับ {@link TypedScopeCreator}.
 *
 * ใช้ com.google.javascript.jscomp.Compiler (concrete AbstractCompiler)
 * เพื่อจัดเตรียม TypeRegistry / TypeValidator / CodingConvention / CompilerInput
 * ที่ TypedScopeCreator ต้องใช้งานภายใน แล้วเรียก createScope()/createInitialScope()
 * ของคลาสเป้าหมายโดยตรง (เนื่องจากอยู่ package เดียวกัน จึงเข้าถึง
 * package-private members ได้)
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    compiler.initOptions(options);
  }

  /**
   * Parse โค้ด JS (พร้อม externs ว่าง) แล้วสร้าง global Scope ผ่าน
   * TypedScopeCreator.createScope(root, null) โดยตรง
   *
   * NOTE: อาศัย public API compiler.init(...) / compiler.parseInputs()
   * ของ com.google.javascript.jscomp.Compiler ซึ่งไม่ได้แสดงอยู่ในซอร์ส
   * ของ TypedScopeCreator ที่ให้มา แต่จำเป็นสำหรับสร้าง AST + CompilerInput
   * ที่ผูก sourceName ให้ครบตามที่ define()/defineName() ต้องใช้
   * (Preconditions.checkNotNull(input, sourceName))
   */
  private Scope parseAndCreateScope(String js) {
    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));
    compiler.init(externs, inputs, options);
    Node root = compiler.parseInputs();
    assertNotNull("Parse should not fail for: " + js, root);
    return new TypedScopeCreator(compiler).createScope(root, null);
  }

  private boolean hasWarningOfType(DiagnosticType type) {
    for (JSError w : compiler.getWarnings()) {
      if (w.getType() == type) {
        return true;
      }
    }
    return false;
  }

  // ==========================================================
  // createInitialScope() -- @VisibleForTesting: native types
  // ==========================================================

  @Test
  public void testCreateInitialScope_nativeFunctionTypesDeclared() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = new Node(Token.BLOCK);
    Scope scope = creator.createInitialScope(root);

    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("Boolean"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("Error"));
    assertNotNull(scope.getVar("EvalError"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("Number"));
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("RangeError"));
    assertNotNull(scope.getVar("ReferenceError"));
    assertNotNull(scope.getVar("RegExp"));
    assertNotNull(scope.getVar("String"));
    assertNotNull(scope.getVar("SyntaxError"));
    assertNotNull(scope.getVar("TypeError"));
    assertNotNull(scope.getVar("URIError"));
  }

  @Test
  public void testCreateInitialScope_prototypesDeclared() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = new Node(Token.BLOCK);
    Scope scope = creator.createInitialScope(root);

    // declareNativeFunctionType ประกาศทั้ง instance และ prototype
    assertNotNull(scope.getVar("Object.prototype"));
    assertNotNull(scope.getVar("Array.prototype"));
    assertNotNull(scope.getVar("Function.prototype"));
  }

  @Test
  public void testCreateInitialScope_valueTypesDeclared() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = new Node(Token.BLOCK);
    Scope scope = creator.createInitialScope(root);

    Var undefinedVar = scope.getVar("undefined");
    assertNotNull(undefinedVar);
    assertEquals(
        compiler.getTypeRegistry().getNativeType(JSTypeNative.VOID_TYPE),
        undefinedVar.getType());

    Var typedefVar = scope.getVar("goog.typedef");
    assertNotNull(typedefVar);
    assertEquals(
        compiler.getTypeRegistry().getNativeType(JSTypeNative.NO_TYPE),
        typedefVar.getType());

    Var activeXVar = scope.getVar("ActiveXObject");
    assertNotNull(activeXVar);
    assertEquals(
        compiler.getTypeRegistry().getNativeType(JSTypeNative.NO_OBJECT_TYPE),
        activeXVar.getType());
  }

  @Test
  public void testCreateInitialScope_unknownVariableNotDeclared() {
    // boundary: ชื่อที่ไม่เคยถูกประกาศต้องคืนค่า null (รวมถึง empty string)
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = new Node(Token.BLOCK);
    Scope scope = creator.createInitialScope(root);
    assertNull(scope.getVar("ThisNameDoesNotExist"));
    assertNull(scope.getVar(""));
  }

  @Test
  public void testCreateInitialScope_objectIsConstructorType() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Node root = new Node(Token.BLOCK);
    Scope scope = creator.createInitialScope(root);

    Var objectVar = scope.getVar("Object");
    assertTrue(objectVar.getType() instanceof FunctionType);
    FunctionType objectFn = (FunctionType) objectVar.getType();
    assertTrue(objectFn.isConstructor());
  }

  // ==========================================================
  // createScope() ผ่าน global scope
  // (define / defineName / defineSlot / getEnumType / maybeDeclareQualifiedName)
  // ==========================================================

  @Test
  public void testEmptyProgram_globalScopeStillHasNativeTypes() {
    // boundary case: โปรแกรมว่างเปล่า -> createInitialScope ยังคงถูกเรียกใน createScope
    Scope scope = parseAndCreateScope("");
    assertNotNull(scope.getVar("Object"));
  }

  @Test
  public void testGlobalVar_withoutJSDoc_isInferred() {
    // branch: info == null -> type inferred (ไม่ extern -> type = null, inferred = true)
    Scope scope = parseAndCreateScope("var x = 1;");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertTrue("Variable without JSDoc should be inferred", x.isTypeInferred());
  }

  @Test
  public void testGlobalVar_withJSDocType_isDeclared() {
    // branch: info != null, ไม่มี @enum, ไม่ใช่ constructor -> getDeclaredTypeInAnnotation
    Scope scope = parseAndCreateScope("/** @type {number} */ var x = 1;");
    Var x = scope.getVar("x");
    assertNotNull(x);
    assertFalse("Variable with @type should be declared, not inferred",
        x.isTypeInferred());
  }

  @Test
  public void testMultipleVarDeclaration_withJSDoc_reportsWarning() {
    // branch: n.getChildCount() > 1 && info != null -> MULTIPLE_VAR_DEF
    parseAndCreateScope("/** @type {number} */ var a, b;");
    assertTrue("Expected MULTIPLE_VAR_DEF warning",
        hasWarningOfType(TypeCheck.MULTIPLE_VAR_DEF));
  }

  @Test
  public void testMultipleVarDeclaration_withoutJSDoc_noWarning() {
    // branch: n.getChildCount() > 1 && info == null -> ไม่รายงาน MULTIPLE_VAR_DEF
    parseAndCreateScope("var a, b;");
    assertFalse(hasWarningOfType(TypeCheck.MULTIPLE_VAR_DEF));
  }

  @Test
  public void testSingleVarDeclaration_elseBranch_noWarning() {
    // branch: n.getChildCount() == 1 (else ของ VAR case)
    parseAndCreateScope("/** @type {number} */ var a;");
    assertFalse(hasWarningOfType(TypeCheck.MULTIPLE_VAR_DEF));
  }

  @Test
  public void testFunctionDeclaration_declaresFunctionType() {
    // branch: Token.FUNCTION, NodeUtil.isFunctionDeclaration(n) == true
    Scope scope = parseAndCreateScope("function Foo() {}");
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    assertTrue(foo.getType() instanceof FunctionType);
  }

  @Test
  public void testConstructorFunction_declaresPrototypeInGlobalScope() {
    // branch: scope.isGlobal() && type instanceof FunctionType &&
    //         (fnType.isConstructor() || fnType.isInterface())
    Scope scope = parseAndCreateScope("/** @constructor */ function Foo() {}");
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    assertTrue(((FunctionType) foo.getType()).isConstructor());
    assertNotNull(scope.getVar("Foo.prototype"));
  }

  @Test
  public void testEnum_withObjectLiteral_declaresEnumType_noWarning() {
    // branch: value.getType() == Token.OBJECTLIT -> createEnumType + defineElement
    Scope scope =
        parseAndCreateScope("/** @enum {number} */ var Foo = {A: 1, B: 2};");
    assertNotNull(scope.getVar("Foo"));
    assertFalse(hasWarningOfType(TypedScopeCreator.ENUM_INITIALIZER));
    assertFalse(hasWarningOfType(TypeCheck.ENUM_DUP));
  }

  @Test
  public void testEnum_duplicateKey_reportsEnumDupWarning() {
    // branch: enumType.hasOwnProperty(keyName) == true -> ENUM_DUP
    parseAndCreateScope("/** @enum {number} */ var Foo = {A: 1, A: 2};");
    assertTrue("Expected ENUM_DUP warning",
        hasWarningOfType(TypeCheck.ENUM_DUP));
  }

  @Test
  public void testEnum_initializerNotObjectLiteralOrEnum_reportsWarning() {
    // branch: value != OBJECTLIT และไม่ใช่ qualified name -> enumType == null
    //         -> ENUM_INITIALIZER
    parseAndCreateScope("/** @enum {number} */ var Foo = 3;");
    assertTrue("Expected ENUM_INITIALIZER warning",
        hasWarningOfType(TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnum_noValue_reportsInitializerWarning() {
    // branch: value == null (no initializer with @enum) -> enumType == null
    //         -> ENUM_INITIALIZER
    // NOTE: ต้องมั่นใจว่า parser ยอมรับ "var Foo;" กับ @enum โดยไม่ error ก่อน
    parseAndCreateScope("/** @enum {number} */ var Foo;");
    assertTrue(hasWarningOfType(TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnum_referencingAnotherEnum_noWarning() {
    // branch: value.isQualifiedName() && var.getType() instanceof EnumType
    String js =
        "/** @enum {number} */ var Foo = {A: 1};"
            + "/** @enum {number} */ var Bar = Foo;";
    parseAndCreateScope(js);
    assertFalse(hasWarningOfType(TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testTypedef_valid_noMalformedWarning() {
    // branch (checkForTypedef): info.hasTypedefType() == true, realType != null
    parseAndCreateScope("/** @typedef {string} */ var MyString;");
    assertFalse(hasWarningOfType(TypedScopeCreator.MALFORMED_TYPEDEF));
  }

  @Test
  public void testNonTypedefVar_noTypedefCheckTriggered() {
    // branch: info == null || !info.hasTypedefType() -> return ทันทีใน checkForTypedef
    parseAndCreateScope("var normal = 1;");
    assertFalse(hasWarningOfType(TypedScopeCreator.MALFORMED_TYPEDEF));
  }

  @Test
  public void testCatchVariable_declaredInFunctionLocalScope_notGlobal() {
    // branch: Token.CATCH -> define(n, parent) -> defineSlot(catchName, n, null)
    // เกิดขึ้นใน LocalScopeBuilder (เมื่อ createScope ถูกเรียกซ้ำกับ parent!=null
    // ภายในการ build ฟังก์ชัน) ในระดับ global scope ตัวแปร catch จึงไม่ปรากฏ
    Scope scope =
        parseAndCreateScope("function f() { try {} catch (e) { var y = e; } }");
    assertNull(scope.getVar("e"));
    assertNotNull(scope.getVar("f"));
  }

  @Test
  public void testRedeclaredGlobalVariable_triggersValidatorCheck() {
    // branch: scope.isDeclared(variableName, false) == true ->
    // validator.expectUndeclaredVariable(...) ถูกเรียก (ไม่ทราบ DiagnosticType
    // ที่แน่ชัดของ TypeValidator จากซอร์สที่ให้มา จึงตรวจแบบกว้าง ๆ)
    // NOTE: ไม่ยืนยัน exact diagnostic เนื่องจาก TypeValidator source ไม่ได้ให้มา
    parseAndCreateScope(
        "/** @type {number} */ var x = 1;\n"
            + "/** @type {string} */ var x = 'a';");
    assertTrue(
        "Expected at least one error/warning for redeclared variable",
        compiler.getErrors().length + compiler.getWarnings().length > 0);
  }

  @Test
  public void testPrototypePropertyAssignment_declaresMethodOnPrototype() {
    // branch: getPrototypePropertyOwner(lvalueNode) != null (GETPROP + "prototype")
    // -> maybeDeclareQualifiedName -> ownerType.defineDeclaredProperty
    String js =
        "/** @constructor */ function Foo() {}"
            + "/** @return {number} */ Foo.prototype.bar = function() { return 1; };";
    Scope scope = parseAndCreateScope(js);
    Var foo = scope.getVar("Foo");
    assertNotNull(foo);
    FunctionType fooType = (FunctionType) foo.getType();
    ObjectType prototype = fooType.getPrototype();
    assertNotNull(prototype);
    assertTrue(prototype.hasOwnProperty("bar"));
  }

  @Test
  public void testStubPropertyDeclaration_resolvedWithoutException() {
    // branch: valueType == null && parent.getType() == EXPR_RESULT ->
    //         stubDeclarations.add(...) -> resolveStubDeclarations()
    String js =
        "/** @constructor */ function Foo() {}"
            + "Foo.prototype.bar;";
    Scope scope = parseAndCreateScope(js);
    assertNotNull(scope.getVar("Foo"));
    // ไม่ throw exception แสดงว่า resolveStubDeclarations() ทำงานได้ครบ branch
  }

  @Test
  public void testGetPrototypePropertyOwner_nonPrototypeGetProp_returnsNull_noSpecialHandling() {
    // branch: getPrototypePropertyOwner คืน null เมื่อไม่ใช่ ".prototype.xxx"
    // -> ทำงานผ่านเส้นทาง getFunctionType ปกติ (ไม่ error)
    String js = "var ns = {}; ns.foo = function() {};";
    Scope scope = parseAndCreateScope(js);
    assertNotNull(scope.getVar("ns"));
  }
}
```

# ตารางสรุป Test coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testCreateInitialScope_nativeFunctionTypesDeclared` | `createInitialScope`: การเรียก `declareNativeFunctionType` ครบทุก native type (14 ประเภท) |
| `testCreateInitialScope_prototypesDeclared` | `declareNativeFunctionType`: การประกาศ `t.getPrototype()` เพิ่มจาก instance type |
| `testCreateInitialScope_valueTypesDeclared` | `declareNativeValueType` สำหรับ `undefined`, `goog.typedef`, `ActiveXObject` |
| `testCreateInitialScope_unknownVariableNotDeclared` | boundary: ชื่อ/empty string ที่ไม่มีอยู่ -> `scope.getVar` คืน null |
| `testCreateInitialScope_objectIsConstructorType` | ตรวจสอบชนิด FunctionType + isConstructor() ของ native Object |
| `testEmptyProgram_globalScopeStillHasNativeTypes` | boundary: input ว่าง, `createScope` เมื่อ parent==null |
| `testGlobalVar_withoutJSDoc_isInferred` | `defineName`: `info == null` -> inferred branch |
| `testGlobalVar_withJSDocType_isDeclared` | `defineName`: `info != null`, ไม่ใช่ enum/constructor -> `getDeclaredTypeInAnnotation` |
| `testMultipleVarDeclaration_withJSDoc_reportsWarning` | `define` VAR case: `childCount>1 && info!=null` -> `MULTIPLE_VAR_DEF` |
| `testMultipleVarDeclaration_withoutJSDoc_noWarning` | `define` VAR case: `childCount>1 && info==null` (ไม่ report) |
| `testSingleVarDeclaration_elseBranch_noWarning` | `define` VAR case: else-branch (`childCount==1`) |
| `testFunctionDeclaration_declaresFunctionType` | `define` FUNCTION case: `NodeUtil.isFunctionDeclaration==true` |
| `testConstructorFunction_declaresPrototypeInGlobalScope` | `defineSlot`: `scope.isGlobal() && fnType.isConstructor()` -> declare `.prototype` |
| `testEnum_withObjectLiteral_declaresEnumType_noWarning` | `getEnumType`: `value.getType()==OBJECTLIT`, ไม่มี dup/invalid key |
| `testEnum_duplicateKey_reportsEnumDupWarning` | `getEnumType` loop: `enumType.hasOwnProperty(keyName)==true` -> `ENUM_DUP` |
| `testEnum_initializerNotObjectLiteralOrEnum_reportsWarning` | `getEnumType`: value ไม่ใช่ OBJECTLIT/qualified-enum -> `enumType==null` -> `ENUM_INITIALIZER` |
| `testEnum_noValue_reportsInitializerWarning` | `getEnumType`: `value==null` boundary -> `ENUM_INITIALIZER` |
| `testEnum_referencingAnotherEnum_noWarning` | `getEnumType`: `value.isQualifiedName() && var.getType() instanceof EnumType` |
| `testTypedef_valid_noMalformedWarning` | `checkForTypedef`: `info.hasTypedefType()==true`, `realType!=null` |
| `testNonTypedefVar_noTypedefCheckTriggered` | `checkForTypedef`: early-return เมื่อ `info==null` |
| `testCatchVariable_declaredInFunctionLocalScope_notGlobal` | `define` CATCH case + LocalScopeBuilder scope boundary |
| `testRedeclaredGlobalVariable_triggersValidatorCheck` | `defineSlot`: `scope.isDeclared(name,false)==true` -> validator path |
| `testPrototypePropertyAssignment_declaresMethodOnPrototype` | `getPrototypePropertyOwner` != null, `maybeDeclareQualifiedName` declared branch |
| `testStubPropertyDeclaration_resolvedWithoutException` | `maybeDeclareQualifiedName`: `valueType==null && EXPR_RESULT` -> stub -> `resolveStubDeclarations` |
| `testGetPrototypePropertyOwner_nonPrototypeGetProp_returnsNull_noSpecialHandling` | `getPrototypePropertyOwner`: คืน null เมื่อไม่ match `.prototype` pattern |

**ข้อจำกัดที่ระบุไว้**: กรณี `CONSTRUCTOR_EXPECTED` (ต้องพึ่ง `codingConvention.getObjectLiteralCast`) และรายละเอียด exact diagnostic ของ `TypeValidator.expectUndeclaredVariable` ไม่สามารถยืนยัน syntax ที่ trigger ได้แน่ชัดจากซอร์สที่ให้มา จึงไม่ได้เขียนเป็น assertion เฉพาะเจาะจง (ดูคอมเมนต์ `// NOTE:` ในโค้ด)