# หมายเหตุสำคัญก่อนดูโค้ด (ข้อสมมติที่ใช้ตามข้อกำหนด #4)

`FunctionTypeBuilder` เป็น package-private class ที่ผูกกับคลาสอื่น ๆ ของ Closure Compiler จำนวนมาก (`Compiler`, `Scope`, `JSDocInfoBuilder`, `JSTypeExpression`, `FunctionParamBuilder` ฯลฯ) ซึ่ง**ไม่ได้อยู่ในซอร์สที่ให้มา** ผมจึงต้องตั้งข้อสมมติบางอย่างเพื่อให้ทดสอบได้จริง โดยเลือกเฉพาะ API ที่เป็นที่รู้จักแพร่หลายของ Closure Compiler (ไม่ใช่การเดา business logic ของ `FunctionTypeBuilder` เอง) และ **คอมเมนต์กำกับไว้ทุกจุดที่ไม่มั่นใจ 100%**:

- **`scope` parameter ส่งเป็น `null` เสมอ** — เพราะ constructor ของ `Scope` ไม่ได้อยู่ในซอร์สที่ให้มา และ constructor ของ `FunctionTypeBuilder` ไม่ได้ validate `scope` (ดูจากซอร์ส: `this.scope = scope;` ไม่มี null check) จึงปลอดภัยที่จะส่ง `null` **ตราบใดที่ path ที่ทดสอบไม่เรียก `scope.xxx()` หรือ `evaluate(scope, ...)`** — ผมเลือก test case ที่หลีกเลี่ยง path เหล่านั้นโดยเจตนา และ**ไม่ทดสอบ** path ที่ต้องใช้ scope จริง (เช่น `inferThisType(info, Node owner)`, `getOrCreateConstructor()`, build ของ constructor/interface)
- ใช้ `com.google.javascript.jscomp.Compiler` (concrete class) + `compiler.initOptions(new CompilerOptions())` เพื่อให้ได้ `JSTypeRegistry` และ error-manager ที่ใช้งานได้ — เป็น pattern มาตรฐานที่ใช้ทั่วไปในเทสของ Closure Compiler
- ใช้ `JSDocInfoBuilder` (public API) เพื่อสร้าง `JSDocInfo` — ไม่เดา field ภายใน `JSDocInfo` เอง
- `JSTypeExpression(Node, String)` และ `Node.newString(int, String)` ใช้ pattern เดียวกับที่เห็นในซอร์สจริงของ `FunctionTypeBuilder` (เช่น `Node.newString(Token.NAME, name)`)
- `compiler.getWarnings()` ใช้ตรวจแค่ **จำนวน > 0** ไม่ตรวจ field ภายใน `JSError` เพราะไม่มีซอร์ส `JSError` ให้ยืนยัน
- ใช้ **reflection** เข้าถึง private field (`fnName`, `returnType`, `baseType`, `implementedInterfaces`, `thisType`, `isConstructor`, `isInterface`, `templateTypeName`, `parametersNode`, `sourceNode`) เพื่อยืนยัน state ภายในโดยไม่ต้องพึ่ง behavior ที่ซับซ้อนกว่านั้น
- **ไม่ครอบคลุม** (คอมเมนต์ไว้ในโค้ด): `inferFromOverriddenFunction` กรณี `oldType != null` (ต้องมี `FunctionType` จริงพร้อม parameters), `inferReturnStatementsAsLastResort` กรณี `functionBlock != null` (ต้องมี `CompilerInput` ที่ลงทะเบียนกับ `sourceName`), `inferThisType(info, owner)` overload, `inferParameterTypes` เมื่อมีการ evaluate ชนิดพารามิเตอร์จริง (ต้องพึ่ง `scope`), และ path ของ constructor/interface ใน `buildAndRegister` — เพราะทั้งหมดนี้ต้องพึ่งพา class ที่ไม่มีซอร์สให้ตรวจสอบได้แน่ชัด

---

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Unit tests for {@link FunctionTypeBuilder} (Defects4J Closure-90b).
 *
 * หมายเหตุ: ดูคอมเมนต์ประกอบด้านบนของไฟล์คำตอบเกี่ยวกับข้อสมมติที่ใช้
 * (Compiler#initOptions, JSDocInfoBuilder API, scope = null)
 */
public class FunctionTypeBuilderTest {

  private Compiler compiler;
  private JSTypeRegistry typeRegistry;
  private Node errorRoot;

  @Before
  public void setUp() {
    // สมมติ: Compiler + initOptions เป็น pattern มาตรฐานของ Closure Compiler
    // สำหรับเตรียม JSTypeRegistry / error manager โดยไม่ต้อง compile จริง
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    typeRegistry = compiler.getTypeRegistry();
    errorRoot = new Node(Token.FUNCTION);
  }

  /**
   * scope ส่งเป็น null โดยเจตนา (ดูหมายเหตุด้านบน) - ปลอดภัยเฉพาะ path
   * ที่ไม่เรียกใช้ scope.
   */
  private FunctionTypeBuilder newBuilder(String fnName) {
    return new FunctionTypeBuilder(fnName, compiler, errorRoot, "test.js", null);
  }

  private JSTypeExpression typeExpr(String typeName) {
    // สมมติโครงสร้าง Node แบบง่ายสำหรับชื่อชนิดข้อมูล (ไม่มีซอร์สยืนยัน 100%)
    return new JSTypeExpression(Node.newString(Token.STRING, typeName), "test.js");
  }

  private static Object getField(Object target, String name) throws Exception {
    Field f = FunctionTypeBuilder.class.getDeclaredField(name);
    f.setAccessible(true);
    return f.get(target);
  }

  private static void setField(Object target, String name, Object value) throws Exception {
    Field f = FunctionTypeBuilder.class.getDeclaredField(name);
    f.setAccessible(true);
    f.set(target, value);
  }

  // ---------------------------------------------------------------------
  // isFunctionTypeDeclaration (static) - ครอบคลุมทั้ง 5 เงื่อนไข OR + false
  // ---------------------------------------------------------------------

  @Test
  public void testIsFunctionTypeDeclaration_paramCountGreaterThanZero_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordParameter("x", typeExpr("string"));
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_hasReturnType_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordReturnType(typeExpr("string"));
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_hasThisType_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordThisType(typeExpr("Object"));
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_isConstructor_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordConstructor();
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_isInterface_true() {
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordInterface();
    JSDocInfo info = b.build(null);
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclaration_allFalse_false() {
    JSDocInfo info = new JSDocInfoBuilder(false).build(null);
    assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  // ---------------------------------------------------------------------
  // Constructor
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullErrorRoot_throwsNPE() {
    // ซอร์สมี Preconditions.checkNotNull(errorRoot) อย่างชัดเจน
    new FunctionTypeBuilder("foo", compiler, null, "test.js", null);
  }

  @Test
  public void testConstructor_nullFnName_defaultsToEmptyString() throws Exception {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder(null, compiler, errorRoot, "test.js", null);
    assertEquals("", getField(builder, "fnName"));
  }

  @Test
  public void testConstructor_nonNullFnName_keepsName() throws Exception {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("myFn", compiler, errorRoot, "test.js", null);
    assertEquals("myFn", getField(builder, "fnName"));
  }

  // ---------------------------------------------------------------------
  // setSourceNode
  // ---------------------------------------------------------------------

  @Test
  public void testSetSourceNode_returnsSameInstanceAndSetsField() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo9");
    Node fnNode = new Node(Token.FUNCTION);

    FunctionTypeBuilder result = builder.setSourceNode(fnNode);

    assertSame(builder, result);
    assertSame(fnNode, getField(builder, "sourceNode"));
  }

  // ---------------------------------------------------------------------
  // inferFromOverriddenFunction - เฉพาะกรณี oldType == null (short-circuit)
  // ---------------------------------------------------------------------

  @Test
  public void testInferFromOverriddenFunction_nullOldType_noOpReturnsThis() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo0");

    FunctionTypeBuilder result = builder.inferFromOverriddenFunction(null, null);

    assertSame(builder, result);
    assertNull(getField(builder, "returnType"));
    assertNull(getField(builder, "parametersNode"));
  }

  // ---------------------------------------------------------------------
  // inferReturnType
  // ---------------------------------------------------------------------

  @Test
  public void testInferReturnType_nullInfo_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo10");
    builder.inferReturnType(null);
    assertNull(getField(builder, "returnType"));
  }

  @Test
  public void testInferReturnType_infoWithoutReturnType_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo11");
    JSDocInfo info = new JSDocInfoBuilder(false).build(null); // hasReturnType() == false
    builder.inferReturnType(info);
    assertNull(getField(builder, "returnType"));
  }

  // ---------------------------------------------------------------------
  // inferReturnStatementsAsLastResort - เฉพาะ short-circuit functionBlock==null
  // (ไม่ทดสอบกรณี != null เพราะต้องมี CompilerInput ที่ลงทะเบียน sourceName จริง)
  // ---------------------------------------------------------------------

  @Test
  public void testInferReturnStatementsAsLastResort_nullBlock_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo12");

    FunctionTypeBuilder result = builder.inferReturnStatementsAsLastResort(null);

    assertSame(builder, result);
    assertNull(getField(builder, "returnType"));
  }

  // ---------------------------------------------------------------------
  // inferInheritance
  // ---------------------------------------------------------------------

  @Test
  public void testInferInheritance_nullInfo_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo1a");

    builder.inferInheritance(null);

    assertNull(getField(builder, "baseType"));
    assertNull(getField(builder, "implementedInterfaces"));
    assertFalse((Boolean) getField(builder, "isConstructor"));
    assertFalse((Boolean) getField(builder, "isInterface"));
  }

  @Test
  public void testInferInheritance_constructorNoBaseNoInterfaces_emptyInterfaceList()
      throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo2a");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordConstructor();
    JSDocInfo info = b.build(null);

    builder.inferInheritance(info);

    assertTrue((Boolean) getField(builder, "isConstructor"));
    assertNull(getField(builder, "baseType")); // hasBaseType() == false -> ไม่ถูกกำหนด
    Object interfaces = getField(builder, "implementedInterfaces");
    assertNotNull(interfaces);
    assertTrue(((List<?>) interfaces).isEmpty());
  }

  @Test
  public void testInferInheritance_baseTypeWithoutConstructorOrInterface_reportsWarning()
      throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo3a");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordBaseType(typeExpr("Object"));
    JSDocInfo info = b.build(null);

    builder.inferInheritance(info);

    // isConstructor/isInterface เป็น false -> เข้า else -> EXTENDS_WITHOUT_TYPEDEF
    assertNull(getField(builder, "baseType"));
    assertTrue("ควรมี warning เกิดขึ้น (EXTENDS_WITHOUT_TYPEDEF)",
        compiler.getWarnings().length > 0);
  }

  @Test
  public void testInferInheritance_implementsWithoutConstructor_reportsWarning()
      throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo4a");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordImplementedInterface(typeExpr("SomeInterface"));
    JSDocInfo info = b.build(null);

    builder.inferInheritance(info);

    assertTrue("ควรมี warning เกิดขึ้น (IMPLEMENTS_WITHOUT_CONSTRUCTOR)",
        compiler.getWarnings().length > 0);
  }

  // ---------------------------------------------------------------------
  // inferTemplateTypeName - เฉพาะ info == null
  // ---------------------------------------------------------------------

  @Test
  public void testInferTemplateTypeName_nullInfo_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo13");
    builder.inferTemplateTypeName(null);
    assertNull(getField(builder, "templateTypeName"));
  }

  // ---------------------------------------------------------------------
  // inferThisType(JSDocInfo, JSType)
  // ---------------------------------------------------------------------

  @Test
  public void testInferThisType_typeNotObject_thisTypeStaysNull() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo5a");
    JSType voidType = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);

    builder.inferThisType(null, voidType);

    assertNull(getField(builder, "thisType"));
  }

  @Test
  public void testInferThisType_typeObjectInfoNull_setsThisType() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo6a");
    JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);

    builder.inferThisType(null, objectType);

    assertNotNull(getField(builder, "thisType"));
  }

  @Test
  public void testInferThisType_typeObjectInfoHasType_thisTypeStaysNull() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo7a");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    // สมมติ: มี method recordType(JSTypeExpression) ใน JSDocInfoBuilder (ไม่มีในซอร์สที่ให้มา)
    b.recordType(typeExpr("Object"));
    JSDocInfo info = b.build(null);
    JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);

    builder.inferThisType(info, objectType);

    // info.hasType() == true -> เงื่อนไข (info==null || !info.hasType()) เป็น false
    assertNull(getField(builder, "thisType"));
  }

  // ---------------------------------------------------------------------
  // inferParameterTypes
  // ---------------------------------------------------------------------

  @Test
  public void testInferParameterTypes_bothNull_noOp() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo14");

    FunctionTypeBuilder result = builder.inferParameterTypes(null, null);

    assertSame(builder, result);
    assertNull(getField(builder, "parametersNode"));
  }

  @Test
  public void testInferParameterTypes_inexistentParam_reportsWarning() throws Exception {
    FunctionTypeBuilder builder = newBuilder("Foo15");
    JSDocInfoBuilder b = new JSDocInfoBuilder(false);
    b.recordParameter("a", typeExpr("string"));
    JSDocInfo info = b.build(null);
    // argsParent ไม่มี parameter จริงเลย -> ทำให้ "a" ตกไปอยู่ใน allJsDocParams ที่เหลือ
    Node argsParent = new Node(Token.LP);

    builder.inferParameterTypes(argsParent, info);

    assertTrue("ควรมี warning INEXISTANT_PARAM", compiler.getWarnings().length > 0);
    assertNotNull(getField(builder, "parametersNode")); // builder.build() ถูกเรียกเสมอ
  }

  // ---------------------------------------------------------------------
  // buildAndRegister
  // ---------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testBuildAndRegister_noParametersNode_throwsIllegalStateException() {
    FunctionTypeBuilder builder = newBuilder("Foo8");
    builder.buildAndRegister();
  }

  @Test
  public void testBuildAndRegister_plainFunction_buildsSuccessfully() throws Exception {
    // isConstructor == false, isInterface == false (default) -> เข้า branch "plain function"
    // ซึ่งไม่เรียก scope.isGlobal() จึงปลอดภัยแม้ scope == null
    FunctionTypeBuilder builder = newBuilder("PlainFunc123");
    Node params = new FunctionParamBuilder(typeRegistry).build();
    setField(builder, "parametersNode", params);

    FunctionType fnType = builder.buildAndRegister();

    assertNotNull(fnType);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE),
        fnType.getReturnType());
  }
}
```

---

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| เทสเมธอด | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testIsFunctionTypeDeclaration_paramCountGreaterThanZero_true` | `info.getParameterCount() > 0` → true |
| `testIsFunctionTypeDeclaration_hasReturnType_true` | `info.hasReturnType()` → true |
| `testIsFunctionTypeDeclaration_hasThisType_true` | `info.hasThisType()` → true |
| `testIsFunctionTypeDeclaration_isConstructor_true` | `info.isConstructor()` → true |
| `testIsFunctionTypeDeclaration_isInterface_true` | `info.isInterface()` → true |
| `testIsFunctionTypeDeclaration_allFalse_false` | ทุกเงื่อนไข OR เป็น false |
| `testConstructor_nullErrorRoot_throwsNPE` | `Preconditions.checkNotNull(errorRoot)` throw path |
| `testConstructor_nullFnName_defaultsToEmptyString` | `fnName == null ? "" : fnName` → true branch |
| `testConstructor_nonNullFnName_keepsName` | เงื่อนไขเดียวกัน → false branch |
| `testSetSourceNode_returnsSameInstanceAndSetsField` | fluent setter + field assignment |
| `testInferFromOverriddenFunction_nullOldType_noOpReturnsThis` | `if (oldType == null) return this;` → true |
| `testInferReturnType_nullInfo_noOp` | `info != null && info.hasReturnType()` → false (info null) |
| `testInferReturnType_infoWithoutReturnType_noOp` | เงื่อนไขเดียวกัน → false (hasReturnType false) |
| `testInferReturnStatementsAsLastResort_nullBlock_noOp` | `functionBlock == null \|\| ...` → true (short-circuit ก่อน `compiler.getInput`) |
| `testInferInheritance_nullInfo_noOp` | `if (info != null)` → false |
| `testInferInheritance_constructorNoBaseNoInterfaces_emptyInterfaceList` | `isConstructor` true, `hasBaseType()` false, loop interfaces 0 รอบ, `baseType == null` skip inner if |
| `testInferInheritance_baseTypeWithoutConstructorOrInterface_reportsWarning` | `hasBaseType()` true + `isConstructor/isInterface` false → else `EXTENDS_WITHOUT_TYPEDEF` |
| `testInferInheritance_implementsWithoutConstructor_reportsWarning` | `isConstructor/isInterface` false + `getImplementedInterfaceCount() > 0` → `IMPLEMENTS_WITHOUT_CONSTRUCTOR` |
| `testInferTemplateTypeName_nullInfo_noOp` | `if (info != null)` → false |
| `testInferThisType_typeNotObject_thisTypeStaysNull` | `objType != null` → false (VOID_TYPE ไม่ใช่ ObjectType) |
| `testInferThisType_typeObjectInfoNull_setsThisType` | `objType != null && (info == null ...)` → true |
| `testInferThisType_typeObjectInfoHasType_thisTypeStaysNull` | `objType != null && !info.hasType()` → false (hasType true) |
| `testInferParameterTypes_bothNull_noOp` | `argsParent == null && info == null` → true (return this) |
| `testInferParameterTypes_inexistentParam_reportsWarning` | loop `argsParent.children()` 0 รอบ, loop `allJsDocParams` เหลือ → `INEXISTANT_PARAM` |
| `testBuildAndRegister_noParametersNode_throwsIllegalStateException` | `if (parametersNode == null) throw ...` → true |
| `testBuildAndRegister_plainFunction_buildsSuccessfully` | `!isConstructor && !isInterface` → else branch (FunctionBuilder path), `returnType == null` → set UNKNOWN_TYPE |

**Branch ที่ไม่ได้ครอบคลุม (ระบุเหตุผลตามข้อกำหนด #4):** `inferFromOverriddenFunction` เมื่อ `oldType != null` (ทั้ง loop และ sub-branch var_args), `inferReturnStatementsAsLastResort` เมื่อ `functionBlock != null` (worklist loop ทุกกรณี), `inferThisType(info, owner)` overload, การ evaluate ชนิดพารามิเตอร์จริงใน `inferParameterTypes`/`addParameter` (optional/varargs/required ทุกสาขา), และ path constructor/interface ใน `buildAndRegister`/`getOrCreateConstructor` — เนื่องจากทั้งหมดต้องพึ่งพา `Scope` จริงหรือ `CompilerInput` ที่ลงทะเบียนแล้ว ซึ่งไม่มีซอร์สให้ตรวจสอบ constructor/behavior ที่ถูกต้องได้ในคำสั่งนี้