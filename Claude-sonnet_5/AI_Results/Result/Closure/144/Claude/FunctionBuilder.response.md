ต่อไปนี้คือชุดทดสอบ JUnit 4 สำหรับ `FunctionBuilder`

**หมายเหตุสำคัญก่อนเริ่ม:** เมื่อวิเคราะห์ซอร์สโค้ด `FunctionBuilder` แล้วพบว่า **ไม่มี if/else หรือ loop อยู่เลย** — ทุกเมธอด (ยกเว้น `build()` และ `copyFromOtherFunction()`) เป็น fluent setter แบบ straight-line เท่านั้น ดังนั้นการทดสอบจึงเน้นที่ **method/statement coverage ครบทุก public/package-private method**, ค่า null/boundary ของแต่ละ setter, และพฤติกรรมของ `copyFromOtherFunction()` ซึ่งเป็นจุดเดียวที่มี logic ซับซ้อนกว่าปกติ (และมีจุดที่น่าสงสัยว่าอาจเป็น fault คือไม่ copy `inferredReturnType`)

```java
package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link FunctionBuilder}.
 *
 * หมายเหตุ (Assumption notes) — เพื่อความโปร่งใสตามข้อกำหนด:
 * - FunctionBuilder ไม่มี if/else หรือ loop ภายในเลย (fluent setter ทั้งหมด)
 *   จึงเน้น statement/method coverage และตรวจค่าที่ถูกส่งต่อไปยัง FunctionType ที่สร้างขึ้น
 * - สมมติว่า com.google.javascript.rhino.ErrorReporter มี method
 *   void warning(String, String, int, int) และ void error(String, String, int, int)
 * - getter ของ FunctionType: getReferenceName(), getSource(), getParametersNode(),
 *   getReturnType(), getTypeOfThis(), getTemplateTypeName(), isConstructor(), isNativeObjectType()
 *   ยืนยันได้จาก copyFromOtherFunction() ในซอร์สที่ให้มาโดยตรง
 * - isReturnTypeInferred() เป็นการอนุมานจาก field inferredReturnType (ไม่ปรากฏโดยตรงในซอร์ส
 *   ที่ให้มา) — หากไม่มีจริงในโปรเจกต์ ให้พิจารณาลบ/แก้ assertion ที่เกี่ยวข้อง
 * - FunctionParamBuilder(JSTypeRegistry) และ build() อ้างอิงโดยตรงจาก withParams()
 * - JSTypeRegistry.getNativeType(JSTypeNative) เป็น API มาตรฐานของ Closure Compiler
 * - Node(int type) และ Token.FUNCTION / Token.PARAM_LIST สมมติว่ามีอยู่จริงในโปรเจกต์
 */
public class FunctionBuilderTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        // no-op for test
      }

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        // no-op for test
      }
    });
  }

  // ---------- Default (ไม่เรียก setter ใด ๆ) ----------

  @Test
  public void testBuild_defaultValues() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType type = builder.build();

    assertNotNull(type);
    assertNull(type.getReferenceName());
    assertNull(type.getSource());
    assertFalse(type.isConstructor());
    assertFalse(type.isNativeObjectType());
    assertNull(type.getTemplateTypeName());
    assertFalse(type.isReturnTypeInferred());
  }

  // ---------- withName ----------

  @Test
  public void testWithName_setsName() {
    FunctionType type = new FunctionBuilder(registry).withName("myFunc").build();
    assertEquals("myFunc", type.getReferenceName());
  }

  @Test
  public void testWithName_null() {
    FunctionType type = new FunctionBuilder(registry).withName(null).build();
    assertNull(type.getReferenceName());
  }

  @Test
  public void testWithName_emptyString() {
    FunctionType type = new FunctionBuilder(registry).withName("").build();
    assertEquals("", type.getReferenceName());
  }

  @Test
  public void testWithName_overwritePreviousValue() {
    FunctionType type = new FunctionBuilder(registry)
        .withName("first")
        .withName("second")
        .build();
    assertEquals("second", type.getReferenceName());
  }

  // ---------- withSourceNode ----------

  @Test
  public void testWithSourceNode_setsNode() {
    Node srcNode = new Node(Token.FUNCTION);
    FunctionType type = new FunctionBuilder(registry).withSourceNode(srcNode).build();
    assertSame(srcNode, type.getSource());
  }

  @Test
  public void testWithSourceNode_null() {
    FunctionType type = new FunctionBuilder(registry).withSourceNode(null).build();
    assertNull(type.getSource());
  }

  // ---------- withParams (FunctionParamBuilder) ----------

  @Test
  public void testWithParams_setsParametersNodeFromBuilder() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    FunctionType type = new FunctionBuilder(registry).withParams(paramBuilder).build();
    assertNotNull(type.getParametersNode());
  }

  // ---------- withParamsNode ----------

  @Test
  public void testWithParamsNode_setsRawNode() {
    Node paramsNode = new Node(Token.PARAM_LIST);
    FunctionType type = new FunctionBuilder(registry).withParamsNode(paramsNode).build();
    assertSame(paramsNode, type.getParametersNode());
  }

  @Test
  public void testWithParamsNode_null() {
    FunctionType type = new FunctionBuilder(registry).withParamsNode(null).build();
    assertNull(type.getParametersNode());
  }

  // ---------- withReturnType (ไม่ inferred) ----------

  @Test
  public void testWithReturnType_setsTypeAndNotInferred() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType type = new FunctionBuilder(registry).withReturnType(numberType).build();
    assertSame(numberType, type.getReturnType());
    assertFalse(type.isReturnTypeInferred());
  }

  @Test
  public void testWithReturnType_null() {
    FunctionType type = new FunctionBuilder(registry).withReturnType(null).build();
    assertNull(type.getReturnType());
    assertFalse(type.isReturnTypeInferred());
  }

  // ---------- withInferredReturnType ----------

  @Test
  public void testWithInferredReturnType_setsTypeAndInferredFlag() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType type = new FunctionBuilder(registry).withInferredReturnType(numberType).build();
    assertSame(numberType, type.getReturnType());
    assertTrue(type.isReturnTypeInferred());
  }

  @Test
  public void testWithInferredReturnType_null() {
    FunctionType type = new FunctionBuilder(registry).withInferredReturnType(null).build();
    assertNull(type.getReturnType());
    assertTrue(type.isReturnTypeInferred());
  }

  // ---------- withTypeOfThis ----------

  @Test
  public void testWithTypeOfThis_setsType() {
    ObjectType thisType = (ObjectType) registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    FunctionType type = new FunctionBuilder(registry).withTypeOfThis(thisType).build();
    assertSame(thisType, type.getTypeOfThis());
  }

  @Test
  public void testWithTypeOfThis_null() {
    // ไม่ยืนยัน exact behavior ภายในของ FunctionType/ArrowType เมื่อ typeOfThis เป็น null
    // จึงตรวจสอบเพียงว่า build() ไม่ throw exception
    FunctionType type = new FunctionBuilder(registry).withTypeOfThis(null).build();
    assertNotNull(type);
  }

  // ---------- withTemplateName ----------

  @Test
  public void testWithTemplateName_setsName() {
    FunctionType type = new FunctionBuilder(registry).withTemplateName("T").build();
    assertEquals("T", type.getTemplateTypeName());
  }

  @Test
  public void testWithTemplateName_null() {
    FunctionType type = new FunctionBuilder(registry).withTemplateName(null).build();
    assertNull(type.getTemplateTypeName());
  }

  // ---------- forConstructor ----------

  @Test
  public void testForConstructor_setsFlagTrue() {
    FunctionType type = new FunctionBuilder(registry).forConstructor().build();
    assertTrue(type.isConstructor());
  }

  @Test
  public void testWithoutForConstructor_defaultFalse() {
    FunctionType type = new FunctionBuilder(registry).build();
    assertFalse(type.isConstructor());
  }

  // ---------- forNativeType (package-private) ----------

  @Test
  public void testForNativeType_setsFlagTrue() {
    FunctionType type = new FunctionBuilder(registry).forNativeType().build();
    assertTrue(type.isNativeObjectType());
  }

  @Test
  public void testWithoutForNativeType_defaultFalse() {
    FunctionType type = new FunctionBuilder(registry).build();
    assertFalse(type.isNativeObjectType());
  }

  // ---------- copyFromOtherFunction ----------

  @Test
  public void testCopyFromOtherFunction_copiesAllFields() {
    Node srcNode = new Node(Token.FUNCTION);
    Node paramsNode = new Node(Token.PARAM_LIST);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ObjectType thisType = (ObjectType) registry.getNativeType(JSTypeNative.OBJECT_TYPE);

    FunctionType original = new FunctionBuilder(registry)
        .withName("originalFunc")
        .withSourceNode(srcNode)
        .withParamsNode(paramsNode)
        .withReturnType(numberType)
        .withTypeOfThis(thisType)
        .withTemplateName("T")
        .forConstructor()
        .forNativeType()
        .build();

    FunctionType copy = new FunctionBuilder(registry)
        .copyFromOtherFunction(original)
        .build();

    assertEquals(original.getReferenceName(), copy.getReferenceName());
    assertSame(original.getSource(), copy.getSource());
    assertSame(original.getParametersNode(), copy.getParametersNode());
    assertSame(original.getReturnType(), copy.getReturnType());
    assertSame(original.getTypeOfThis(), copy.getTypeOfThis());
    assertEquals(original.getTemplateTypeName(), copy.getTemplateTypeName());
    assertEquals(original.isConstructor(), copy.isConstructor());
    assertEquals(original.isNativeObjectType(), copy.isNativeObjectType());
  }

  @Test
  public void testCopyFromOtherFunction_doesNotCopyInferredReturnTypeFlag() {
    // ตามซอร์สโค้ดที่ให้มา copyFromOtherFunction() ไม่ได้ copy field inferredReturnType
    // ดังนั้นแม้ original มี inferred return type = true ผลลัพธ์ copy ควรได้ default (false)
    // -> เทสนี้ช่วยดักจับ fault หากมีการแก้ไขให้ copy ค่านี้ผิดพลาดในอนาคต (regression)
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType original = new FunctionBuilder(registry)
        .withInferredReturnType(numberType)
        .build();
    assertTrue(original.isReturnTypeInferred());

    FunctionType copy = new FunctionBuilder(registry)
        .copyFromOtherFunction(original)
        .build();

    assertFalse(copy.isReturnTypeInferred());
  }

  // ---------- Fluent chain / method-return-this ----------

  @Test
  public void testFluentChain_returnsSameBuilderInstance() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder chained = builder
        .withName("f")
        .withSourceNode(null)
        .withParamsNode(null)
        .withReturnType(null)
        .withTemplateName(null)
        .forConstructor()
        .forNativeType();
    assertSame(builder, chained);
  }
}
```

## สรุปการครอบคลุม (Coverage Summary)

| Test Method | ครอบคลุมส่วนใดของ `FunctionBuilder` |
|---|---|
| `testBuild_defaultValues` | ค่า default ของทุก field เมื่อไม่เรียก setter ใด ๆ, เมธอด `build()` |
| `testWithName_setsName` / `_null` / `_emptyString` / `_overwritePreviousValue` | `withName()` — ค่าปกติ, null, empty string, การ override ค่า |
| `testWithSourceNode_setsNode` / `_null` | `withSourceNode()` — ค่าปกติและ null |
| `testWithParams_setsParametersNodeFromBuilder` | `withParams(FunctionParamBuilder)` — เรียก `params.build()` ภายใน |
| `testWithParamsNode_setsRawNode` / `_null` | `withParamsNode()` — Node ที่กำหนดเองและ null |
| `testWithReturnType_setsTypeAndNotInferred` / `_null` | `withReturnType()` — ตรวจว่า `inferredReturnType` ยังคงเป็น false |
| `testWithInferredReturnType_setsTypeAndInferredFlag` / `_null` | `withInferredReturnType()` — ตรวจว่า `inferredReturnType` ถูกตั้งเป็น true |
| `testWithTypeOfThis_setsType` / `_null` | `withTypeOfThis()` — ค่าปกติและ null (boundary) |
| `testWithTemplateName_setsName` / `_null` | `withTemplateName()` — ค่าปกติและ null |
| `testForConstructor_setsFlagTrue` / `testWithoutForConstructor_defaultFalse` | `forConstructor()` เทียบกับค่า default |
| `testForNativeType_setsFlagTrue` / `testWithoutForNativeType_defaultFalse` | `forNativeType()` (package-private) เทียบกับค่า default |
| `testCopyFromOtherFunction_copiesAllFields` | `copyFromOtherFunction()` — ตรวจการ copy ครบทุก field ที่ระบุในซอร์ส |
| `testCopyFromOtherFunction_doesNotCopyInferredReturnTypeFlag` | จุดที่น่าสงสัยว่าเป็น fault: `inferredReturnType` ไม่ถูก copy — เทสนี้ดักจับการเปลี่ยนแปลง behavior ที่ผิดจากซอร์สปัจจุบัน |
| `testFluentChain_returnsSameBuilderInstance` | ยืนยันว่าทุก setter คืนค่า `this` (fluent pattern) ตลอด chain |

**ข้อจำกัดที่ควรทราบ:** เนื่องจาก `FunctionBuilder` ไม่มี branch (if/else/loop) จริง ๆ การ "coverage" ในที่นี้จึงหมายถึง method/statement coverage แบบเต็มรูปแบบของทุกเส้นทางการเรียกใช้ ส่วนความถูกต้องของ getter names (`getReferenceName`, `isReturnTypeInferred` เป็นต้น) และ constructor ของ `FunctionParamBuilder`/`JSTypeRegistry` เป็นการอนุมานจากบริบทของซอร์สที่ให้มา หากคอมไพล์ไม่ผ่านเนื่องจากชื่อเมธอด/constructor ไม่ตรงกับเวอร์ชันจริงในโปรเจกต์ ให้ปรับตาม API จริงที่มีอยู่ (ตามที่ระบุในคอมเมนต์ Assumption notes ด้านบน)