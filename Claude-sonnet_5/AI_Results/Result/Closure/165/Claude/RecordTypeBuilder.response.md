# JUnit 4 Test Suite: RecordTypeBuilderTest

## หมายเหตุสำคัญก่อนเริ่ม

- คลาส `RecordType` เป็น **package-private** (ไม่มี access modifier) จึงต้องวาง test class ไว้ใน package เดียวกันคือ `com.google.javascript.rhino.jstype` เพื่อให้สามารถอ้างอิง type ได้ด้วย `instanceof`
- เนื่องจาก classpath ที่กำหนดไม่มี mocking framework (เช่น Mockito) จึงใช้ instance จริงของ `JSTypeRegistry`, `JSType`, `Node` จาก source tree เดียวกัน (สมมติว่าคลาสเหล่านี้ compile ร่วมอยู่ในโปรเจกต์ Closure Compiler ตาม Defects4J bug นี้)
- ผมไม่มั่นใจ 100% ว่า signature ของ `ErrorReporter` และ constructor ของ `JSTypeRegistry` ในเวอร์ชันนี้ตรงกับที่เขียนไว้เป๊ะ — **คอมเมนต์กำกับไว้ในโค้ด** หากรันไม่ผ่านเพราะ signature ไม่ตรง ให้ปรับตาม source จริงของเวอร์ชันนั้น
- โค้ดต้นฉบับ **ไม่มีการตรวจสอบ null** สำหรับ `type`, `propertyNode`, หรือ `name` เลย ดังนั้น testcase ที่ป้อนค่า null จึงคาดหวังว่าจะไม่ throw exception (ตาม behavior จริงของ HashMap ที่รองรับ null key)

```java
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
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testAddProperty_newProperty_returnsBuilderInstance` | `addProperty`: `properties.containsKey(name)` → **false**, return `this` |
| `testAddProperty_duplicateProperty_returnsNull` | `addProperty`: `properties.containsKey(name)` → **true**, return `null` |
| `testBuild_emptyRecord_returnsNativeObjectType` | `build()`: `if (isEmpty)` → **true**, return native OBJECT_TYPE |
| `testBuild_withOneProperty_returnsRecordTypeInstance` | `build()`: `if (isEmpty)` → **false**, return `new RecordType(...)` |
| `testBuild_afterDuplicateAddProperty_stillNotEmpty` | ยืนยันลำดับการทำงาน `isEmpty = false;` ถูก set ก่อนเช็ค duplicate (ทั้งสอง branch ของ containsKey ถูกเรียกแล้ว isEmpty ยังเป็น false) |
| `testAddProperty_withNullType_doesNotThrow` | Boundary: `type == null` ไม่ทำให้เกิด exception (ไม่มี validation ใน source) |
| `testAddProperty_withNullPropertyNode_doesNotThrow` | Boundary: `propertyNode == null` ไม่ทำให้เกิด exception |
| `testAddProperty_withEmptyStringName` | Boundary: `name = ""` ทำงานเหมือน key ปกติ ทั้ง branch เพิ่มใหม่และ duplicate |
| `testAddProperty_withNullName` | Boundary: `name == null` — ทดสอบ `containsKey(null)`/`put(null,...)` ทั้ง branch ใหม่และ duplicate |
| `testBuild_calledMultipleTimes_returnsConsistentResultsForEmpty` | เรียก `build()` ซ้ำในสถานะ `isEmpty == true` เพื่อยืนยัน consistency |
| `testAddProperty_multipleDistinctProperties` | Loop-like scenario: เรียก `addProperty` หลายครั้งด้วยชื่อต่างกัน ครอบคลุม branch "not duplicate" ซ้ำหลายรอบ |

**ข้อจำกัด/สิ่งที่ไม่แน่ใจ**: signature ของ `ErrorReporter` interface และ constructor ของ `JSTypeRegistry` อาจแตกต่างกันเล็กน้อยตามเวอร์ชันจริงของ Closure-165 หากไม่ตรง ต้องปรับให้สอดคล้องกับซอร์สจริงในโปรเจกต์ (ไม่ได้ระบุมาในซอร์สที่ให้มา จึงไม่สามารถยืนยัน behavior 100%)