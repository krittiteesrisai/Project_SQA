package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link RecordTypeBuilder}.
 *
 * หมายเหตุ: RecordType เป็น package-private จึงต้องวาง test class
 * ไว้ใน package com.google.javascript.rhino.jstype เดียวกัน
 */
public class RecordTypeBuilderTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    // ไม่แน่ใจ 100% ว่า signature ของ ErrorReporter ตรงกับเวอร์ชันนี้เป๊ะ
    // ถ้า compile ไม่ผ่าน ให้ตรวจสอบ interface ErrorReporter จริงในซอร์ส
    registry = new JSTypeRegistry(new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line,
          int lineOffset) {
        // ไม่สนใจ warning สำหรับการทดสอบนี้
      }

      @Override
      public void error(String message, String sourceName, int line,
          int lineOffset) {
        throw new RuntimeException("Unexpected JSType error: " + message);
      }
    });
  }

  private Node newNode() {
    return new Node(Token.NAME);
  }

  // ---------- addProperty: กรณีปกติ (ไม่ duplicate) ----------

  @Test
  public void testAddProperty_newProperty_returnsBuilderInstance() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node propertyNode = newNode();

    RecordTypeBuilder result = builder.addProperty("foo", numberType, propertyNode);

    assertSame("addProperty ควร return this เมื่อไม่มี duplicate", builder, result);
  }

  // ---------- addProperty: branch containsKey == true (duplicate) ----------

  @Test
  public void testAddProperty_duplicateProperty_returnsNull() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    builder.addProperty("foo", numberType, newNode());
    RecordTypeBuilder result = builder.addProperty("foo", stringType, newNode());

    assertNull("addProperty ควร return null เมื่อ property name ซ้ำ", result);
  }

  // ---------- build(): branch isEmpty == true ----------

  @Test
  public void testBuild_emptyRecord_returnsNativeObjectType() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);

    JSType result = builder.build();

    JSType expected = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertSame(
        "เมื่อไม่มี property ใด ๆ, build() ควร return native OBJECT_TYPE",
        expected, result);
  }

  // ---------- build(): branch isEmpty == false ----------

  @Test
  public void testBuild_withOneProperty_returnsRecordTypeInstance() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    builder.addProperty("foo", numberType, newNode());

    JSType result = builder.build();

    assertTrue(
        "เมื่อมี property อย่างน้อยหนึ่งตัว, build() ควร return RecordType",
        result instanceof RecordType);

    JSType nativeObjectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertNotSame(
        "ผลลัพธ์ไม่ควรเป็น native object type เดิม",
        nativeObjectType, result);
  }

  // ---------- isEmpty ถูกตั้งค่าก่อนตรวจสอบ duplicate (ตามลำดับโค้ด) ----------

  @Test
  public void testBuild_afterDuplicateAddProperty_stillNotEmpty() {
    // isEmpty ถูกตั้งเป็น false ทุกครั้งที่เรียก addProperty ไม่ว่าจะ duplicate หรือไม่
    // (เพราะ isEmpty = false; อยู่ก่อนเช็ค containsKey ใน source code)
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    builder.addProperty("foo", numberType, newNode());
    builder.addProperty("foo", numberType, newNode()); // duplicate -> null

    JSType result = builder.build();
    assertTrue(
        "isEmpty ควรเป็น false แม้จะมีการเพิ่ม property ซ้ำ",
        result instanceof RecordType);
  }

  // ---------- ค่า null สำหรับ type / propertyNode (ไม่มีการ validate ใน source) ----------

  @Test
  public void testAddProperty_withNullType_doesNotThrow() {
    // source ไม่ตรวจสอบ null สำหรับ type จึงไม่ควร throw exception
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);

    RecordTypeBuilder result = builder.addProperty("foo", null, newNode());

    assertSame(result, builder);
  }

  @Test
  public void testAddProperty_withNullPropertyNode_doesNotThrow() {
    // source ไม่ตรวจสอบ null สำหรับ propertyNode
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    RecordTypeBuilder result = builder.addProperty("foo", numberType, null);

    assertSame(result, builder);
  }

  // ---------- ชื่อ property เป็น empty string ----------

  @Test
  public void testAddProperty_withEmptyStringName() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    RecordTypeBuilder firstResult = builder.addProperty("", numberType, newNode());
    RecordTypeBuilder secondResult = builder.addProperty("", numberType, newNode());

    assertSame(builder, firstResult);
    assertNull("การเพิ่ม property ชื่อ '' ซ้ำอีกครั้งควร return null", secondResult);
  }

  // ---------- ชื่อ property เป็น null (HashMap รองรับ null key) ----------

  @Test
  public void testAddProperty_withNullName() {
    // HashMap.containsKey(null)/put(null, ...) ทำงานได้ปกติ ไม่ throw exception
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    RecordTypeBuilder firstResult = builder.addProperty(null, numberType, newNode());
    RecordTypeBuilder secondResult = builder.addProperty(null, numberType, newNode());

    assertSame(builder, firstResult);
    assertNull("การเพิ่ม property ชื่อ null ซ้ำอีกครั้งควร return null", secondResult);
  }

  // ---------- build() ถูกเรียกหลายครั้งบน empty builder ----------

  @Test
  public void testBuild_calledMultipleTimes_returnsConsistentResultsForEmpty() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);

    JSType result1 = builder.build();
    JSType result2 = builder.build();

    // registry.getNativeObjectType(...) ควร return instance เดิมทุกครั้ง
    assertSame(result1, result2);
  }

  // ---------- เพิ่ม property หลายตัวที่ไม่ซ้ำกัน ----------

  @Test
  public void testAddProperty_multipleDistinctProperties() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    RecordTypeBuilder r1 = builder.addProperty("foo", numberType, newNode());
    RecordTypeBuilder r2 = builder.addProperty("bar", stringType, newNode());

    assertSame(builder, r1);
    assertSame(builder, r2);

    JSType result = builder.build();
    assertTrue(result instanceof RecordType);
  }
}
