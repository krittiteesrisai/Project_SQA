# วิเคราะห์คลาส `RecordType`

จากซอร์สที่ให้มา คลาสนี้เป็น package-private class ใน `com.google.javascript.rhino.jstype` จึงต้องเขียนเทสในแพ็กเกจเดียวกันเพื่อเข้าถึง constructor และเมธอด package-private ได้

**หมายเหตุสำคัญ (ตามข้อ 4):** ซอร์สที่ให้มาไม่ได้แสดงซอร์สของ `JSTypeRegistry`, `RecordTypeBuilder`, `PrototypeObjectType`, และ `JSTypeNative` แบบสมบูรณ์ ผมจึงต้องอ้างอิง API ที่ปรากฏอยู่ใน imports/การเรียกใช้จริงในซอร์สที่ให้มา (เช่น `registry.getNativeType(...)`, `registry.getNativeObjectType(...)`, `RecordTypeBuilder(registry)`, `builder.addProperty(...)`, `builder.build()`) และค่าคงที่ enum ที่ปรากฏจริงในซอร์ส (`OBJECT_TYPE`, `NO_TYPE`, `NO_OBJECT_TYPE`) ส่วนค่าคงที่อื่น เช่น `NUMBER_TYPE`, `STRING_TYPE`, `ALL_TYPE`, `UNKNOWN_TYPE` และ constructor ของ `JSTypeRegistry(ErrorReporter)` เป็นสมมติฐานตาม API มาตรฐานของโปรเจกต์นี้ (จำเป็นต้องใช้เพื่อสร้าง object จริงในการเทส) — **ได้ทำคอมเมนต์กำกับไว้ในโค้ด**

```java
package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Maps;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * Unit tests สำหรับ {@link RecordType} (Defects4J: Closure-165b)
 *
 * หมายเหตุสมมติฐาน (assumption) ที่ไม่ได้ยืนยันได้ 100% จากซอร์สที่ให้มาโดยตรง:
 *  - JSTypeRegistry มี constructor รับ ErrorReporter (ใช้เพื่อสร้าง instance ทดสอบ)
 *  - RecordTypeBuilder มี constructor(JSTypeRegistry), เมธอด addProperty(String, JSType, Node),
 *    และ build() ที่คืนค่า JSType ซึ่งเมื่อมี property จะเป็น RecordType (ใช้ pattern เดียวกับที่ปรากฏ
 *    ในซอร์ส getGreatestSubtypeHelper() ที่เรียก builder.build())
 *  - ค่าคงที่ JSTypeNative.NUMBER_TYPE, STRING_TYPE, ALL_TYPE, UNKNOWN_TYPE มีอยู่จริงตาม API มาตรฐาน
 *    ของ Closure type system (ส่วน OBJECT_TYPE, NO_TYPE, NO_OBJECT_TYPE ยืนยันได้จากซอร์สที่ให้มาโดยตรง)
 *  - PrototypeObjectType มี constructor(JSTypeRegistry, String, ObjectType) ตามที่ RecordType เรียก
 *    ผ่าน super(registry, null, null)
 */
public class RecordTypeTest {

  private JSTypeRegistry registry;

  // ErrorReporter แบบ no-op สำหรับใช้ทดสอบ (สมมติฐาน signature ตาม ErrorReporter มาตรฐานของ Rhino/Closure)
  private static final ErrorReporter ERROR_REPORTER = new ErrorReporter() {
    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {
      // no-op
    }

    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {
      // no-op
    }
  };

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(ERROR_REPORTER);
  }

  // ---------- Helper methods ----------

  private RecordType buildRecordType(String name1, JSType type1) {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty(name1, type1, null);
    JSType built = builder.build();
    RecordType record = built.toMaybeRecordType();
    assertNotNull("builder.build() ควรคืน RecordType เมื่อมี property อย่างน้อย 1 ตัว", record);
    return record;
  }

  private RecordType buildRecordType(String name1, JSType type1, String name2, JSType type2) {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty(name1, type1, null);
    builder.addProperty(name2, type2, null);
    JSType built = builder.build();
    RecordType record = built.toMaybeRecordType();
    assertNotNull(record);
    return record;
  }

  // ==================================================================
  // Constructor
  // ==================================================================

  @Test(expected = IllegalStateException.class)
  public void testConstructor_NullRecordPropertyThrowsIllegalStateException() {
    Map<String, RecordProperty> props = Maps.newHashMap();
    props.put("a", null); // ค่า null -> ควร throw ตาม javadoc/โค้ดใน constructor
    new RecordType(registry, props);
  }

  @Test
  public void testConstructor_EmptyPropertiesMap_NoException() {
    // boundary case: loop for (String property : properties.keySet()) วน 0 ครั้ง
    Map<String, RecordProperty> props = Maps.newHashMap();
    RecordType r = new RecordType(registry, props);
    assertNotNull(r);
    assertTrue(r.isRecordType());
  }

  @Test
  public void testConstructor_ValidPropertyIsDefinedAndDeclared() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    RecordType r = buildRecordType("a", numberType);
    assertTrue(r.hasProperty("a"));
    assertEquals(numberType, r.getPropertyType("a"));
    // constructor เรียก defineDeclaredProperty เสมอ -> ควรเป็น declared property
    assertTrue(r.isPropertyTypeDeclared("a"));
  }

  @Test
  public void testConstructor_EmptyStringPropertyName() {
    // อินพุตแปลก (edge case): ชื่อ property เป็นสตริงว่าง
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    RecordType r = buildRecordType("", numberType);
    assertTrue(r.hasProperty(""));
  }

  // ==================================================================
  // isEquivalentTo
  // ==================================================================

  @Test
  public void testIsEquivalentTo_OtherNotRecordType_ReturnsFalse() {
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    assertFalse(r.isEquivalentTo(stringType));
  }

  @Test
  public void testIsEquivalentTo_SameInstance_ReturnsTrue() {
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertTrue(r.isEquivalentTo(r));
  }

  @Test
  public void testIsEquivalentTo_DifferentKeySets_ReturnsFalse() {
    RecordType r1 = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    RecordType r2 = buildRecordType("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertFalse(r1.isEquivalentTo(r2));
  }

  @Test
  public void testIsEquivalentTo_SameKeysDifferentTypes_ReturnsFalse() {
    RecordType r1 = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    RecordType r2 = buildRecordType("a", registry.getNativeType(JSTypeNative.STRING_TYPE));
    assertFalse(r1.isEquivalentTo(r2));
  }

  @Test
  public void testIsEquivalentTo_SameKeysSameTypes_ReturnsTrue() {
    RecordType r1 = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    RecordType r2 = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertTrue(r1.isEquivalentTo(r2));
  }

  // ==================================================================
  // getImplicitPrototype
  // ==================================================================

  @Test
  public void testGetImplicitPrototype_ReturnsObjectType() {
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE),
        r.getImplicitPrototype());
  }

  // ==================================================================
  // defineProperty (frozen behaviour)
  // ==================================================================

  @Test
  public void testDefineProperty_AfterConstruction_ReturnsFalseBecauseFrozen() {
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    boolean result = r.defineProperty(
        "b", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertFalse(result);
    assertFalse(r.hasProperty("b"));
  }

  @Test
  public void testDefineProperty_NullPropertyName_StillFalseBecauseFrozenShortCircuits() {
    // อินพุตผิดรูปแบบ (null name) แต่ isFrozen check เกิดก่อน จึงไม่ throw
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    boolean result = r.defineProperty(
        null, registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertFalse(result);
  }

  // ==================================================================
  // getGreatestSubtypeHelper
  // ==================================================================

  @Test
  public void testGetGreatestSubtypeHelper_RecordType_NoConflict_MergesProperties() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    RecordType r1 = buildRecordType("a", numberType);
    RecordType r2 = buildRecordType("b", stringType);

    JSType result = r1.getGreatestSubtypeHelper(r2);
    assertTrue(result.isRecordType());
    RecordType resultRecord = result.toMaybeRecordType();
    assertTrue(resultRecord.hasProperty("a"));
    assertTrue(resultRecord.hasProperty("b"));
  }

  @Test
  public void testGetGreatestSubtypeHelper_RecordType_ConflictingProperty_ReturnsNoType() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    RecordType r1 = buildRecordType("a", numberType);
    RecordType r2 = buildRecordType("a", stringType);

    JSType result = r1.getGreatestSubtypeHelper(r2);
    assertEquals(registry.getNativeObjectType(JSTypeNative.NO_TYPE), result);
  }

  @Test
  public void testGetGreatestSubtypeHelper_NonRecordType_EmptyRestricted_ReturnsNoObjectType() {
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    // OBJECT_TYPE.getGreatestSubtype(NO_TYPE) ควรเป็น empty type -> ข้าม loop -> คืน NO_OBJECT_TYPE ตรง ๆ
    JSType result = r.getGreatestSubtypeHelper(noType);
    assertEquals(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), result);
  }

  @Test
  public void testGetGreatestSubtypeHelper_NonRecordType_NonEmptyRestricted_NoException() {
    // เข้า branch loop (thatRestrictedToObj ไม่ empty) - ผลลัพธ์ตัวเลขแม่นยำขึ้นกับ
    // reference type ทั้งหมดใน registry ซึ่งไม่ได้ระบุในซอร์สที่ให้มา จึงตรวจแค่ไม่ throw/ไม่ null
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    JSType result = r.getGreatestSubtypeHelper(objectType);
    assertNotNull(result);
  }

  // ==================================================================
  // toMaybeRecordType
  // ==================================================================

  @Test
  public void testToMaybeRecordType_ReturnsSelf() {
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertSame(r, r.toMaybeRecordType());
  }

  // ==================================================================
  // isSubtype (instance level)
  // ==================================================================

  @Test
  public void testIsSubtype_SameInstance_ReturnsTrueViaIsSubtypeHelper() {
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertTrue(r.isSubtype(r));
  }

  @Test
  public void testIsSubtype_ObjectTypeIsSubtypeOfThat_ReturnsTrue() {
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    // OBJECT_TYPE.isSubtype(ALL_TYPE) ควรเป็น true เสมอ -> branch ที่สองใน isSubtype คืน true
    assertTrue(r.isSubtype(allType));
  }

  @Test
  public void testIsSubtype_ThatIsNotRecordType_ReturnsFalse() {
    RecordType r = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    assertFalse(r.isSubtype(stringType));
  }

  @Test
  public void testIsSubtype_RecordType_DelegatesToStaticIsSubtype_True() {
    RecordType typeB = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    RecordType typeA = buildRecordType(
        "a", registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        "b", registry.getNativeType(JSTypeNative.STRING_TYPE));

    assertTrue(typeA.isSubtype(typeB));
  }

  @Test
  public void testIsSubtype_RecordType_DelegatesToStaticIsSubtype_False() {
    RecordType typeB = buildRecordType(
        "a", registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        "b", registry.getNativeType(JSTypeNative.STRING_TYPE));
    RecordType typeA = buildRecordType("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    // typeA ไม่มี property "b" ที่ typeB ต้องการ
    assertFalse(typeA.isSubtype(typeB));
  }

  // ==================================================================
  // static isSubtype(ObjectType, RecordType)
  // ==================================================================

  @Test
  public void testStaticIsSubtype_MissingProperty_ReturnsFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    RecordType typeB = buildRecordType("a", numberType);

    PrototypeObjectType typeA = new PrototypeObjectType(registry, null, null);
    // ไม่กำหนด property "a" ให้ typeA

    assertFalse(RecordType.isSubtype(typeA, typeB));
  }

  @Test
  public void testStaticIsSubtype_DeclaredPropertyEquivalent_ReturnsTrue() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    RecordType typeB = buildRecordType("a", numberType);

    PrototypeObjectType typeA = new PrototypeObjectType(registry, null, null);
    typeA.defineDeclaredProperty("a", numberType, null);

    assertTrue(RecordType.isSubtype(typeA, typeB));
  }

  @Test
  public void testStaticIsSubtype_DeclaredPropertyNotEquivalent_ReturnsFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    RecordType typeB = buildRecordType("a", numberType);

    PrototypeObjectType typeA = new PrototypeObjectType(registry, null, null);
    typeA.defineDeclaredProperty("a", stringType, null);

    assertFalse(RecordType.isSubtype(typeA, typeB));
  }

  @Test
  public void testStaticIsSubtype_InferredPropertyIsSubtype_ReturnsTrue() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    RecordType typeB = buildRecordType("a", numberType);

    PrototypeObjectType typeA = new PrototypeObjectType(registry, null, null);
    typeA.defineProperty("a", numberType, /* inferred */ true, null);

    assertTrue(RecordType.isSubtype(typeA, typeB));
  }

  @Test
  public void testStaticIsSubtype_InferredPropertyNotSubtype_ReturnsFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    RecordType typeB = buildRecordType("a", numberType);

    PrototypeObjectType typeA = new PrototypeObjectType(registry, null, null);
    typeA.defineProperty("a", stringType, /* inferred */ true, null);

    assertFalse(RecordType.isSubtype(typeA, typeB));
  }

  @Test
  public void testStaticIsSubtype_UnknownPropertyTypeSkipsCheck_ReturnsTrue() {
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    RecordType typeB = buildRecordType("a", unknownType);

    PrototypeObjectType typeA = new PrototypeObjectType(registry, null, null);
    // ชนิดของ property บน typeA ไม่ตรงกับ typeB เลย แต่เนื่องจาก propB เป็น unknown
    // การเทียบชนิดจะถูกข้าม (if (!propA.isUnknownType() && !propB.isUnknownType())) -> ผ่านเสมอ
    typeA.defineDeclaredProperty("a", stringType, null);

    assertTrue(RecordType.isSubtype(typeA, typeB));
  }

  @Test
  public void testStaticIsSubtype_EmptyPropertiesInTypeB_ReturnsTrue() {
    // boundary: typeB ไม่มี property เลย -> for loop ไม่วน -> คืน true เสมอ
    Map<String, RecordProperty> emptyProps = Maps.newHashMap();
    RecordType typeB = new RecordType(registry, emptyProps);

    PrototypeObjectType typeA = new PrototypeObjectType(registry, null, null);

    assertTrue(RecordType.isSubtype(typeA, typeB));
  }

  // ==================================================================
  // resolveInternal
  // ==================================================================

  @Test
  public void testResolveInternal_PropertyTypeUnchanged_PreservesValue() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    RecordType r = buildRecordType("a", numberType);

    // NUMBER_TYPE เป็น native type ที่ resolve แล้วควรคืน instance เดิม (type == resolvedType)
    JSType resolved = r.resolveInternal(ERROR_REPORTER, null);

    assertNotNull(resolved);
    assertEquals(numberType, r.getPropertyType("a"));
  }

  @Test
  public void testResolveInternal_EmptyProperties_NoExceptionAndReturnsSelfType() {
    Map<String, RecordProperty> emptyProps = Maps.newHashMap();
    RecordType r = new RecordType(registry, emptyProps);

    JSType resolved = r.resolveInternal(ERROR_REPORTER, null);
    assertNotNull(resolved);
  }
}
```

---

## สรุปตาราง Test Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_NullRecordPropertyThrowsIllegalStateException` | constructor: `prop == null` → throw `IllegalStateException` |
| `testConstructor_EmptyPropertiesMap_NoException` | constructor: loop วน 0 ครั้ง (boundary map ว่าง) |
| `testConstructor_ValidPropertyIsDefinedAndDeclared` | constructor: loop วน 1 ครั้ง, `defineDeclaredProperty` ถูกเรียก |
| `testConstructor_EmptyStringPropertyName` | constructor: อินพุตขอบเขต (ชื่อ property เป็น `""`) |
| `testIsEquivalentTo_OtherNotRecordType_ReturnsFalse` | `isEquivalentTo`: `!other.isRecordType()` → false |
| `testIsEquivalentTo_SameInstance_ReturnsTrue` | `isEquivalentTo`: `otherRecord == this` → true |
| `testIsEquivalentTo_DifferentKeySets_ReturnsFalse` | `isEquivalentTo`: `!otherProps.keySet().equals(keySet)` → false |
| `testIsEquivalentTo_SameKeysDifferentTypes_ReturnsFalse` | `isEquivalentTo`: loop key ตรงกัน แต่ type ไม่ equivalent → false |
| `testIsEquivalentTo_SameKeysSameTypes_ReturnsTrue` | `isEquivalentTo`: loop ผ่านทุก key → true |
| `testGetImplicitPrototype_ReturnsObjectType` | `getImplicitPrototype`: คืน `OBJECT_TYPE` |
| `testDefineProperty_AfterConstruction_ReturnsFalseBecauseFrozen` | `defineProperty`: `isFrozen == true` → false |
| `testDefineProperty_NullPropertyName_StillFalseBecauseFrozenShortCircuits` | `defineProperty`: short-circuit ก่อนใช้ชื่อ property (null-safety) |
| `testGetGreatestSubtypeHelper_RecordType_NoConflict_MergesProperties` | `getGreatestSubtypeHelper`: `that.isRecordType()==true`, ไม่มี conflict, รวม property ทั้งสองฝั่ง |
| `testGetGreatestSubtypeHelper_RecordType_ConflictingProperty_ReturnsNoType` | `getGreatestSubtypeHelper`: property ชนกัน → คืน `NO_TYPE` |
| `testGetGreatestSubtypeHelper_NonRecordType_EmptyRestricted_ReturnsNoObjectType` | `getGreatestSubtypeHelper`: `!that.isRecordType()`, `thatRestrictedToObj.isEmptyType()==true` → skip loop |
| `testGetGreatestSubtypeHelper_NonRecordType_NonEmptyRestricted_NoException` | `getGreatestSubtypeHelper`: `!that.isRecordType()`, `isEmptyType()==false` → เข้า for-loop |
| `testToMaybeRecordType_ReturnsSelf` | `toMaybeRecordType`: คืน `this` |
| `testIsSubtype_SameInstance_ReturnsTrueViaIsSubtypeHelper` | `isSubtype`: branch แรก (`isSubtypeHelper`) true |
| `testIsSubtype_ObjectTypeIsSubtypeOfThat_ReturnsTrue` | `isSubtype`: branch สอง (`OBJECT_TYPE.isSubtype(that)`) true |
| `testIsSubtype_ThatIsNotRecordType_ReturnsFalse` | `isSubtype`: `!that.isRecordType()` → false |
| `testIsSubtype_RecordType_DelegatesToStaticIsSubtype_True/False` | `isSubtype`: delegate ไปยัง static `isSubtype(this, that)` ทั้งกรณี true/false |
| `testStaticIsSubtype_MissingProperty_ReturnsFalse` | static `isSubtype`: `!typeA.hasProperty(property)` → false |
| `testStaticIsSubtype_DeclaredPropertyEquivalent/NotEquivalent` | static `isSubtype`: branch `isPropertyTypeDeclared==true` → equivalent check true/false |
| `testStaticIsSubtype_InferredPropertyIsSubtype/NotSubtype` | static `isSubtype`: branch `isPropertyTypeDeclared==false` → subtype check true/false |
| `testStaticIsSubtype_UnknownPropertyTypeSkipsCheck_ReturnsTrue` | static `isSubtype`: `propA.isUnknownType() \|\| propB.isUnknownType()` → skip comparison |
| `testStaticIsSubtype_EmptyPropertiesInTypeB_ReturnsTrue` | static `isSubtype`: loop วน 0 ครั้ง (boundary) → true |
| `testResolveInternal_PropertyTypeUnchanged_PreservesValue` | `resolveInternal`: `type == resolvedType` (ไม่ put ใหม่) |
| `testResolveInternal_EmptyProperties_NoExceptionAndReturnsSelfType` | `resolveInternal`: loop วน 0 ครั้ง (boundary) |

**ข้อจำกัดที่ควรทราบ:** เทสบางเคส (เช่น `getGreatestSubtypeHelper` กรณี non-record ที่ loop จริง) ตรวจสอบแค่ "ไม่ throw / ไม่ null" เพราะค่าที่แน่นอนขึ้นกับ reference-type ทั้งหมดใน `JSTypeRegistry` ซึ่งไม่ได้ระบุไว้ในซอร์สที่ให้มา จึงไม่กล้าฟันธง behavior ที่ไม่มีหลักฐานรองรับ