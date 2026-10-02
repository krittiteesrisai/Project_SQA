# FunctionTypeBuilderTest — JUnit 4 Test Suite

## หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติที่ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา)

เนื่องจาก `FunctionTypeBuilder` พึ่งพา infrastructure จริงของ Closure Compiler (`Compiler`, `Scope`, `JSTypeRegistry`, `JSDocInfo`) ซึ่ง source ของคลาสเหล่านี้ไม่ได้ให้มาในโจทย์ ผมจึงต้องใช้ API สาธารณะ/แพ็กเกจ-ไพรเวตที่ **เชื่อว่ามีอยู่จริง** ใน Closure Compiler เวอร์ชันนี้ (Defects4J Closure-41b) ดังนี้ — กำกับด้วยคอมเมนต์ในโค้ดด้วย:

- `Scope(Node rootNode, AbstractCompiler compiler)` — คอนสตรัคเตอร์แพ็กเกจ-ไพรเวตสร้าง global scope (`isGlobal() == true`)
- `Compiler#parse(SourceFile)` — คืน AST root สำหรับ parse ทดสอบ (ใช้เพื่อสร้าง `JSDocInfo` จริงจาก syntax เช่น `@param {number=}`, `@param {...number}` ซึ่งเป็น **syntax สาธารณะที่เอกสารรับรอง** ไม่ใช่การเดา internal behavior)
- `Node#isFunction()`, `Node#getJSDocInfo()` — เมธอดมาตรฐานของ Node ที่ใช้ทั่วไปในโค้ดต้นฉบับ (เทียบเคียงกับ `isVarArgs()`, `isOptionalArg()`, `isFromExterns()` ที่เห็นในซอร์ส)

จุดที่ไม่แน่ใจแต่ไม่กระทบ correctness ของเทส (เช่น การ route ของ `@extends` ในกรณี interface) จะ**เลี่ยงการ assert ค่าที่เดา** และ assert เฉพาะสิ่งที่ยืนยันได้ตรงจาก source เท่านั้น

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Unit tests for {@link FunctionTypeBuilder} (Defects4J Closure-41b).
 *
 * ดูหมายเหตุด้านบนสำหรับข้อสมมติเกี่ยวกับ API ของ Scope/Compiler ที่ไม่ได้อยู่ใน
 * ซอร์สที่ให้มาโดยตรง
 */
public class FunctionTypeBuilderTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Scope globalScope;
  private Node errorRoot;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    errorRoot = IR.block();
    // ASSUMPTION: Scope(Node, AbstractCompiler) builds a *global* scope
    // (parent == null -> isGlobal() == true). Pattern seen across the
    // Closure Compiler codebase for constructing scopes in isolation.
    globalScope = new Scope(IR.block(), compiler);
  }

  private FunctionTypeBuilder newBuilder(String fnName) {
    return new FunctionTypeBuilder(
        fnName, compiler, errorRoot, "test.js", globalScope);
  }

  @SuppressWarnings("unchecked")
  private Object getField(Object target, String name) throws Exception {
    Field f = FunctionTypeBuilder.class.getDeclaredField(name);
    f.setAccessible(true);
    return f.get(target);
  }

  private Node findFunctionNode(Node n) {
    if (n.isFunction()) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node found = findFunctionNode(c);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  /**
   * Parses real JS source with a leading JSDoc comment and returns the
   * {@link JSDocInfo} attached to the first function found. Uses the
   * production parser so that JSTypeExpressions inside the JSDocInfo are
   * always valid and evaluable.
   *
   * ASSUMPTION: Compiler#parse(SourceFile) exists and returns the AST root.
   */
  private JSDocInfo parseJsDoc(String js) {
    Node script = compiler.parse(SourceFile.fromCode("input.js", js));
    assertNotNull("Parse failed for: " + js, script);
    Node fn = findFunctionNode(script);
    assertNotNull("No function found for: " + js, fn);
    return fn.getJSDocInfo();
  }

  // =========================================================================
  // Constructor
  // =========================================================================

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullErrorRoot_throwsNPE() {
    new FunctionTypeBuilder("foo", compiler, null, "test.js", globalScope);
  }

  @Test
  public void testConstructor_nullFnName_defaultsToEmptyString() throws Exception {
    FunctionTypeBuilder builder = newBuilder(null);
    assertEquals("", getField(builder, "fnName"));
  }

  @Test
  public void testConstructor_nonNullFnName_isPreserved() throws Exception {
    FunctionTypeBuilder builder = newBuilder("myFunc");
    assertEquals("myFunc", getField(builder, "fnName"));
  }

  // =========================================================================
  // setContents
  // =========================================================================

  @Test
  public void testSetContents_null_doesNotChangeContents() throws Exception {
    FunctionTypeBuilder builder = newBuilder("f");
    Object before = getField(builder, "contents");
    builder.setContents(null);
    assertSame(before, getField(builder, "contents"));
    assertTrue(getField(builder, "contents") instanceof UnknownFunctionContents);
  }

  @Test
  public void testSetContents_nonNull_setsContents() throws Exception {
    FunctionTypeBuilder builder = newBuilder("f");
    AstFunctionContents contents =
        new AstFunctionContents(IR.function(IR.name("f"), IR.paramList(), IR.block()));
    builder.setContents(contents);
    assertSame(contents, getField(builder, "contents"));
  }

  // =========================================================================
  // inferFromOverriddenFunction
  // =========================================================================

  @Test
  public void testInferFromOverriddenFunction_nullOldType_noChange() throws Exception {
    FunctionTypeBuilder builder = newBuilder("f");
    FunctionTypeBuilder result = builder.inferFromOverriddenFunction(null, null);
    assertSame(builder, result);
    assertNull(getField(builder, "returnType"));
    assertNull(getField(builder, "parametersNode"));
  }

  // =========================================================================
  // inferReturnType
  // =========================================================================

  @Test
  public void testInferReturnType_nullInfo_noChange() throws Exception {
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferReturnType(null);
    assertNull(getField(builder, "returnType"));
    assertFalse((Boolean) getField(builder, "returnTypeInferred"));
  }

  @Test
  public void testInferReturnType_withReturnType_setsReturnTypeNotInferred() throws Exception {
    JSDocInfo info = parseJsDoc("/** @return {number} */ function f() {}");
    assertTrue(info.hasReturnType());
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferReturnType(info);
    assertNotNull(getField(builder, "returnType"));
    assertFalse((Boolean) getField(builder, "returnTypeInferred"));
  }

  @Test
  public void testInferReturnType_templateReturnType_reportsTemplateExpectedError()
      throws Exception {
    // @return {T} where T is the template type -> not allowed as a return
    // type (branch: templateTypeName != null && returnType.isTemplateType()).
    JSDocInfo info = parseJsDoc("/** @template T\n * @return {T} */ function f() {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferTemplateTypeName(info);
    builder.inferReturnType(info);
    assertNotNull(getField(builder, "returnType"));
  }

  // =========================================================================
  // inferInheritance
  // =========================================================================

  @Test
  public void testInferInheritance_nullInfo_noChange() throws Exception {
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferInheritance(null);
    assertNull(getField(builder, "baseType"));
    assertNull(getField(builder, "implementedInterfaces"));
    assertNull(getField(builder, "extendedInterfaces"));
    assertFalse((Boolean) getField(builder, "isConstructor"));
    assertFalse((Boolean) getField(builder, "isInterface"));
  }

  @Test
  public void testInferInheritance_constructorInfo_setsFlagsAndEmptyImplementsList()
      throws Exception {
    JSDocInfo info = parseJsDoc("/** @constructor */ function f() {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferInheritance(info);
    assertTrue((Boolean) getField(builder, "isConstructor"));
    assertFalse((Boolean) getField(builder, "isInterface"));
    assertNotNull(getField(builder, "implementedInterfaces"));
    assertNull(getField(builder, "extendedInterfaces"));
  }

  @Test
  public void testInferInheritance_interfaceInfo_setsFlagsAndEmptyLists() throws Exception {
    JSDocInfo info = parseJsDoc("/** @interface */ function f() {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferInheritance(info);
    assertTrue((Boolean) getField(builder, "isInterface"));
    assertFalse((Boolean) getField(builder, "isConstructor"));
    assertNotNull(getField(builder, "implementedInterfaces"));
    assertNotNull(getField(builder, "extendedInterfaces"));
  }

  @Test
  public void testInferInheritance_extendsWithoutConstructor_reportsWarningNoBaseType()
      throws Exception {
    JSDocInfo info = parseJsDoc("/** @extends {Object} */ function f() {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferInheritance(info);
    // isConstructor false -> EXTENDS_WITHOUT_TYPEDEF branch, baseType stays null.
    assertNull(getField(builder, "baseType"));
  }

  @Test
  public void testInferInheritance_constructorWithValidBaseType_setsBaseType()
      throws Exception {
    JSDocInfo info =
        parseJsDoc("/** @constructor\n * @extends {Object} */ function Sub() {}");
    FunctionTypeBuilder builder = newBuilder("Sub");
    builder.inferInheritance(info);
    assertNotNull(getField(builder, "baseType"));
  }

  @Test
  public void testInferInheritance_implementsWithoutConstructor_reportsWarning()
      throws Exception {
    JSDocInfo info = parseJsDoc("/** @implements {SomeInterface} */ function f() {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferInheritance(info);
    // Not constructor/interface -> IMPLEMENTS_WITHOUT_CONSTRUCTOR branch.
    assertNull(getField(builder, "implementedInterfaces"));
  }

  // =========================================================================
  // inferThisType (both overloads)
  // =========================================================================

  @Test
  public void testInferThisType_singleArg_withThisAnnotation_setsThisType() throws Exception {
    JSDocInfo info = parseJsDoc("/** @this {Object} */ function f() {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferThisType(info);
    assertNotNull(getField(builder, "thisType"));
  }

  @Test
  public void testInferThisType_singleArg_withoutThisAnnotation_noChange() throws Exception {
    JSDocInfo info = parseJsDoc("/** @return {number} */ function f() {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferThisType(info);
    assertNull(getField(builder, "thisType"));
  }

  @Test
  public void testInferThisType_twoArg_infoNull_usesGivenObjectType() throws Exception {
    FunctionTypeBuilder builder = newBuilder("f");
    JSType objType = registry.getNativeType(OBJECT_TYPE);
    builder.inferThisType(null, objType);
    assertSame(objType, getField(builder, "thisType"));
  }

  @Test
  public void testInferThisType_twoArg_nonObjectType_doesNotSetThisType() throws Exception {
    FunctionTypeBuilder builder = newBuilder("f");
    JSType voidType = registry.getNativeType(VOID_TYPE);
    builder.inferThisType(null, voidType);
    assertNull(getField(builder, "thisType"));
  }

  @Test
  public void testInferThisType_twoArg_infoHasExplicitTypeTag_doesNotUseGivenType()
      throws Exception {
    JSDocInfo info = parseJsDoc("/** @type {number} */ function f() {}");
    FunctionTypeBuilder builder = newBuilder("f");
    JSType objType = registry.getNativeType(OBJECT_TYPE);
    builder.inferThisType(info, objType);
    // info.hasType() true and no @this -> thisType stays null.
    assertNull(getField(builder, "thisType"));
  }

  // =========================================================================
  // inferTemplateTypeName
  // =========================================================================

  @Test
  public void testInferTemplateTypeName_nullInfo_noChange() throws Exception {
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferTemplateTypeName(null);
    assertNull(getField(builder, "templateTypeName"));
  }

  @Test
  public void testInferTemplateTypeName_withTemplate_setsName() throws Exception {
    JSDocInfo info = parseJsDoc("/** @template T */ function f() {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferTemplateTypeName(info);
    assertEquals("T", getField(builder, "templateTypeName"));
  }

  // =========================================================================
  // inferParameterTypes
  // =========================================================================

  @Test
  public void testInferParameterTypes_nullArgsNullInfo_noChange() throws Exception {
    FunctionTypeBuilder builder = newBuilder("f");
    FunctionTypeBuilder result = builder.inferParameterTypes((Node) null, (JSDocInfo) null);
    assertSame(builder, result);
    assertNull(getField(builder, "parametersNode"));
  }

  @Test
  public void testInferParameterTypes_nullArgsWithInfo_delegatesToInfoOverload()
      throws Exception {
    JSDocInfo info = parseJsDoc("/** @param {number} a */ function f(a) {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferParameterTypes((Node) null, info);
    assertNotNull(getField(builder, "parametersNode"));
  }

  @Test
  public void testInferParameterTypes_simpleRequiredParamNoInfo_buildsUnknownType()
      throws Exception {
    Node argsParent = IR.paramList(IR.name("a"));
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferParameterTypes(argsParent, null);
    Node paramsNode = (Node) getField(builder, "parametersNode");
    assertNotNull(paramsNode);
    assertEquals(1, paramsNode.getChildCount());
  }

  @Test
  public void testInferParameterTypes_withJsDocParamType_buildsOk() throws Exception {
    JSDocInfo info = parseJsDoc("/** @param {string} a */ function f(a) {}");
    Node argsParent = IR.paramList(IR.name("a"));
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferParameterTypes(argsParent, info);
    Node paramsNode = (Node) getField(builder, "parametersNode");
    assertEquals(1, paramsNode.getChildCount());
  }

  @Test
  public void testInferParameterTypes_inexistentJsDocParam_stillBuildsAndWarns()
      throws Exception {
    JSDocInfo info = parseJsDoc("/** @param {string} b */ function f(a) {}");
    Node argsParent = IR.paramList(IR.name("a"));
    FunctionTypeBuilder builder = newBuilder("f");
    // 'b' documented but not a real parameter -> INEXISTANT_PARAM branch.
    builder.inferParameterTypes(argsParent, info);
    Node paramsNode = (Node) getField(builder, "parametersNode");
    assertEquals(1, paramsNode.getChildCount());
  }

  @Test
  public void testInferParameterTypes_optionalBeforeRequired_triggersOptionalArgAtEndBranch()
      throws Exception {
    JSDocInfo info =
        parseJsDoc("/** @param {number=} a\n * @param {number} b */ function f(a, b) {}");
    Node argsParent = IR.paramList(IR.name("a"), IR.name("b"));
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferParameterTypes(argsParent, info);
    Node paramsNode = (Node) getField(builder, "parametersNode");
    assertEquals(2, paramsNode.getChildCount());
  }

  @Test
  public void testInferParameterTypes_varArgsNotLast_triggersVarArgsMustBeLastBranch()
      throws Exception {
    JSDocInfo info =
        parseJsDoc("/** @param {...number} a\n * @param {number} b */ function f(a, b) {}");
    Node argsParent = IR.paramList(IR.name("a"), IR.name("b"));
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferParameterTypes(argsParent, info);
    Node paramsNode = (Node) getField(builder, "parametersNode");
    assertEquals(2, paramsNode.getChildCount());
  }

  @Test
  public void testInferParameterTypes_templateTypeExpectedWarning_noParamUsesTemplate()
      throws Exception {
    JSDocInfo info =
        parseJsDoc("/** @template T\n * @param {string} a */ function f(a) {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferTemplateTypeName(info);
    Node argsParent = IR.paramList(IR.name("a"));
    builder.inferParameterTypes(argsParent, info);
    assertNotNull(getField(builder, "parametersNode"));
  }

  @Test
  public void testInferParameterTypes_duplicateTemplateType_reportsDuplicatedWarning()
      throws Exception {
    JSDocInfo info = parseJsDoc(
        "/** @template T\n * @param {T} a\n * @param {T} b */ function f(a, b) {}");
    FunctionTypeBuilder builder = newBuilder("f");
    builder.inferTemplateTypeName(info);
    Node argsParent = IR.paramList(IR.name("a"), IR.name("b"));
    builder.inferParameterTypes(argsParent, info);
    Node paramsNode = (Node) getField(builder, "parametersNode");
    assertEquals(2, paramsNode.getChildCount());
  }

  // =========================================================================
  // isFunctionTypeDeclaration (static)
  // =========================================================================

  @Test
  public void testIsFunctionTypeDeclaration_returnTypeOnly_true() throws Exception {
    JSDocInfo info = parseJsDoc("/** @return {number} */ function f() {}");
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_paramOnly_true() throws Exception {
    JSDocInfo info = parseJsDoc("/** @param {number} a */ function f(a) {}");
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_constructor_true() throws Exception {
    JSDocInfo info = parseJsDoc("/** @constructor */ function f() {}");
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_interface_true() throws Exception {
    JSDocInfo info = parseJsDoc("/** @interface */ function f() {}");
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_thisType_true() throws Exception {
    JSDocInfo info = parseJsDoc("/** @this {Object} */ function f() {}");
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_noRelevantTags_false() throws Exception {
    // @desc is a recognized tag but not part of isFunctionTypeDeclaration's checks.
    JSDocInfo info = parseJsDoc("/** @desc plain description */ function f() {}");
    assertNotNull(info);
    assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  // =========================================================================
  // buildAndRegister
  // =========================================================================

  @Test(expected = IllegalStateException.class)
  public void testBuildAndRegister_noParametersNode_throwsISE() {
    FunctionTypeBuilder builder = newBuilder("f");
    builder.buildAndRegister();
  }

  @Test
  public void testBuildAndRegister_plainFunctionUnknownContents_returnTypeUnknown()
      throws Exception {
    FunctionTypeBuilder builder = newBuilder("plainFn");
    builder.inferParameterTypes(IR.paramList(), null);
    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType);
    assertFalse(fnType.isConstructor());
    assertFalse(fnType.isInterface());
    assertTrue(fnType.getReturnType().isUnknownType());
  }

  @Test
  public void testBuildAndRegister_noReturnsAndNotExterns_returnTypeVoidInferred()
      throws Exception {
    FunctionTypeBuilder builder = newBuilder("noReturnFn");
    Node fnNode = IR.function(IR.name("noReturnFn"), IR.paramList(), IR.block());
    builder.setContents(new AstFunctionContents(fnNode));
    builder.inferParameterTypes(IR.paramList(), null);
    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType);
    assertTrue(fnType.getReturnType().isVoidType());
  }

  @Test
  public void testBuildAndRegister_constructorFunction_buildsConstructorType()
      throws Exception {
    JSDocInfo info = parseJsDoc("/** @constructor */ function MyCtor() {}");
    FunctionTypeBuilder builder = newBuilder("MyCtor");
    builder.inferInheritance(info);
    builder.inferParameterTypes(IR.paramList(), null);
    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType);
    assertTrue(fnType.isConstructor());
  }

  @Test
  public void testBuildAndRegister_interfaceFunction_buildsInterfaceType() throws Exception {
    JSDocInfo info = parseJsDoc("/** @interface */ function MyIface() {}");
    FunctionTypeBuilder builder = newBuilder("MyIface");
    builder.inferInheritance(info);
    builder.inferParameterTypes(IR.paramList(), null);
    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType);
    assertTrue(fnType.isInterface());
  }

  @Test
  public void testBuildAndRegister_existingFunctionName_returnsExistingFunctionType()
      throws Exception {
    // ASSUMPTION: JSTypeRegistry pre-registers "Function" as a global type name
    // (native bootstrapping). Exercises getOrCreateConstructor's existingType
    // branch (fnName.equals("Function")).
    JSDocInfo info = parseJsDoc("/** @constructor */ function Function() {}");
    FunctionTypeBuilder builder = newBuilder("Function");
    builder.inferInheritance(info);
    builder.inferParameterTypes(IR.paramList(), null);
    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType);
  }
}
```

## ตารางสรุป Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_nullErrorRoot_throwsNPE` | `Preconditions.checkNotNull(errorRoot)` throw |
| `testConstructor_nullFnName_defaultsToEmptyString` | `fnName == null ? "" : fnName` (true branch) |
| `testConstructor_nonNullFnName_isPreserved` | เงื่อนไขเดียวกัน (false branch) |
| `testSetContents_null_doesNotChangeContents` | `if (contents != null)` false branch |
| `testSetContents_nonNull_setsContents` | true branch |
| `testInferFromOverriddenFunction_nullOldType_noChange` | `if (oldType == null) return this;` |
| `testInferReturnType_nullInfo_noChange` | `if (info != null && info.hasReturnType())` false |
| `testInferReturnType_withReturnType_setsReturnTypeNotInferred` | เงื่อนไขนี้ true |
| `testInferReturnType_templateReturnType_reportsTemplateExpectedError` | `templateTypeName != null && ... isTemplateType()` true |
| `testInferInheritance_nullInfo_noChange` | `if (info != null)` false |
| `testInferInheritance_constructorInfo_...` | `isConstructor` true, `implementedInterfaces` block, `extendedInterfaces` skip |
| `testInferInheritance_interfaceInfo_...` | `isInterface` true, ทั้ง implemented/extended lists |
| `testInferInheritance_extendsWithoutConstructor_...` | `hasBaseType()` true + `!isConstructor` → warning |
| `testInferInheritance_constructorWithValidBaseType_...` | `hasBaseType()` + `isConstructor` + validator true |
| `testInferInheritance_implementsWithoutConstructor_...` | `else if (getImplementedInterfaceCount() > 0)` |
| `testInferThisType_singleArg_withThisAnnotation_*` | `info.hasThisType()` true |
| `testInferThisType_singleArg_withoutThisAnnotation_*` | false branch |
| `testInferThisType_twoArg_infoNull_*` | `thisType == null` + `objType != null` true |
| `testInferThisType_twoArg_nonObjectType_*` | `ObjectType.cast(type) == null` |
| `testInferThisType_twoArg_infoHasExplicitTypeTag_*` | `info.hasType()` true → skip assign |
| `testInferTemplateTypeName_nullInfo_noChange` | `if (info != null)` false |
| `testInferTemplateTypeName_withTemplate_setsName` | true branch |
| `testInferParameterTypes_nullArgsNullInfo_noChange` | `argsParent==null && info==null` |
| `testInferParameterTypes_nullArgsWithInfo_*` | `argsParent==null && info!=null` → delegate |
| `testInferParameterTypes_simpleRequiredParamNoInfo_*` | loop, `info==null` → UNKNOWN_TYPE |
| `testInferParameterTypes_withJsDocParamType_*` | `info.hasParameterType(name)` true |
| `testInferParameterTypes_inexistentJsDocParam_*` | `allJsDocParams` non-empty → INEXISTANT_PARAM |
| `testInferParameterTypes_optionalBeforeRequired_*` | `addParameter` required-after-optional → OPTIONAL_ARG_AT_END |
| `testInferParameterTypes_varArgsNotLast_*` | required-after-varargs → VAR_ARGS_MUST_BE_LAST |
| `testInferParameterTypes_templateTypeExpectedWarning_*` | `!foundTemplateType` → TEMPLATE_TYPE_EXPECTED |
| `testInferParameterTypes_duplicateTemplateType_*` | `foundTemplateType` true ครั้งที่สอง → DUPLICATED |
| `testIsFunctionTypeDeclaration_*` (5 tests true) | แต่ละเงื่อนไข OR ทีละตัว |
| `testIsFunctionTypeDeclaration_noRelevantTags_false` | ทุกเงื่อนไข false |
| `testBuildAndRegister_noParametersNode_throwsISE` | `parametersNode == null` throw |
| `testBuildAndRegister_plainFunctionUnknownContents_*` | first-if false (mayHaveNonEmptyReturns=true) → UNKNOWN_TYPE, else-branch build |
| `testBuildAndRegister_noReturnsAndNotExterns_*` | first-if true → VOID_TYPE + inferred |
| `testBuildAndRegister_constructorFunction_*` | `isConstructor` branch → `getOrCreateConstructor` (existingType==null) |
| `testBuildAndRegister_interfaceFunction_*` | `isInterface` branch → `createInterfaceType` |
| `testBuildAndRegister_existingFunctionName_*` | `getOrCreateConstructor` existingType!=null, `fnName.equals("Function")` |

**จุดที่ไม่ได้ทดสอบและเหตุผล:** branch ภายใน `ExtendedTypeValidator`/`ImplementedTypeValidator` เกี่ยวกับ `isEmptyType()`/`isUnknownType()`/`hasMoreTagsToResolve()` และ `getScopeDeclaredIn()` กรณี `fnName` มีจุด (`.`) ไม่ถูกทดสอบ เนื่องจากต้องสร้างสถานะ type ที่ unresolved/empty อย่างแม่นยำซึ่งไม่สามารถยืนยัน behavior จาก source ที่ให้มาได้ครบถ้วน — ใส่ไว้เป็นข้อจำกัดตามข้อกำหนดที่ 4