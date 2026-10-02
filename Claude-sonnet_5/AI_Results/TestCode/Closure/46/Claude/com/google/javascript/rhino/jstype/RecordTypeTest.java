package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Unit test สำหรับ com.google.javascript.rhino.jstype.RecordType
 * (Defects4J: Closure-46b)
 */
public class RecordTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    // ใช้ ErrorReporter แบบ no-op เพื่อไม่ให้ warning/error รบกวนการทดสอบ
    ErrorReporter reporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line,
          int lineOffset) {
        // no-op
      }

      @Override
      public void error(String message, String sourceName, int line,
          int lineOffset) {
        // no-op
      }
    };
    registry = new JSTypeRegistry(reporter);
  }

  // ---------- Helper methods ----------

  private JSType numberType() {
    return registry.getNativeType(JSTypeNative.NUMBER_TYPE);
  }

  private JSType stringType() {
    return registry.getNativeType(JSTypeNative.STRING_TYPE);
  }

  private JSType unknownType() {
    return registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
  }

  /** สร้าง RecordType จาก Map<String, JSType> โดยห่อเป็น RecordProperty ให้ */
  private RecordType buildRecord(Map<String, JSType> propTypes) {
    Map<String, RecordTypeBuilder.RecordProperty> props =
        new LinkedHashMap<>();
    for (Map.Entry<String, JSType> e : propTypes.entrySet()) {
      props.put(e.getKey(),
          new RecordTypeBuilder.RecordProperty(e.getValue(), null));
    }
    return new RecordType(registry, props);
  }

  private Map<String, JSType> mapOf(String k, JSType v) {
    Map<String, JSType> m = new LinkedHashMap<>();
    m.put(k, v);
    return m;
  }

  private Map<String, JSType> mapOf(String k1, JSType v1, String k2, JSType v2) {
    Map<String, JSType> m = new LinkedHashMap<>();
    m.put(k1, v1);
    m.put(k2, v2);
    return m;
  }

  // ============================================================
  // Constructor
  // ============================================================

  @Test
  public void testConstructor_emptyProperties_ok() {
    RecordType record = buildRecord(new LinkedHashMap<String, JSType>());
    assertNotNull(record);
    assertTrue(record.isRecordType());
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructor_nullRecordProperty_throwsIllegalStateException() {
    // อินพุตผิดรูปแบบ: ค่าใน map เป็น null -> ต้อง throw ตาม source
    Map<String, RecordTypeBuilder.RecordProperty> props =
        new LinkedHashMap<>();
    props.put("a", null);
    new RecordType(registry, props);
  }

  @Test
  public void testConstructor_freezesInstance_defineNonInferredPropertyReturnsFalse() {
    // หลัง constructor เสร็จ isFrozen = true -> defineProperty ต้อง return false เสมอ
    RecordType record = buildRecord(mapOf("a", numberType()));
    boolean result = record.defineProperty("b", stringType(), false, null);
    assertFalse(result);
  }

  @Test
  public void testConstructor_freezesInstance_defineInferredPropertyReturnsFalse() {
    // ทดสอบ branch inferred=true เมื่อ isFrozen=true (ยังคือ return false เพราะเช็ค isFrozen ก่อน)
    RecordType record = buildRecord(mapOf("a", numberType()));
    boolean result = record.defineProperty("c", stringType(), true, null);
    assertFalse(result);
  }

  // ============================================================
  // isEquivalentTo
  // ============================================================

  @Test
  public void testIsEquivalentTo_otherNotRecordType_returnsFalse() {
    RecordType record = buildRecord(mapOf("a", numberType()));
    JSType other = numberType(); // ไม่ใช่ record type
    assertFalse(record.isEquivalentTo(other));
  }

  @Test
  public void testIsEquivalentTo_sameInstance_returnsTrue() {
    RecordType record = buildRecord(mapOf("a", numberType()));
    assertTrue(record.isEquivalentTo(record));
  }

  @Test
  public void testIsEquivalentTo_differentKeySet_returnsFalse() {
    RecordType r1 = buildRecord(mapOf("a", numberType()));
    RecordType r2 = buildRecord(mapOf("b", numberType()));
    assertFalse(r1.isEquivalentTo(r2));
  }

  @Test
  public void testIsEquivalentTo_sameKeyDifferentType_returnsFalse() {
    RecordType r1 = buildRecord(mapOf("a", numberType()));
    RecordType r2 = buildRecord(mapOf("a", stringType()));
    assertFalse(r1.isEquivalentTo(r2));
  }

  @Test
  public void testIsEquivalentTo_sameKeySameType_returnsTrue() {
    RecordType r1 = buildRecord(mapOf("a", numberType()));
    RecordType r2 = buildRecord(mapOf("a", numberType()));
    assertTrue(r1.isEquivalentTo(r2));
  }

  // ============================================================
  // getImplicitPrototype
  // ============================================================

  @Test
  public void testGetImplicitPrototype_returnsObjectType() {
    RecordType record = buildRecord(mapOf("a", numberType()));
    ObjectType proto = record.getImplicitPrototype();
    assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), proto);
  }

  // ============================================================
  // getLeastSupertype
  // ============================================================

  @Test
  public void testGetLeastSupertype_thatNotRecordType_delegatesToSuper() {
    RecordType record = buildRecord(mapOf("a", numberType()));
    JSType that = numberType(); // ไม่ใช่ record
    JSType result = record.getLeastSupertype(that);
    // ไม่สามารถยืนยัน exact ค่าคืนจาก super.getLeastSupertype ได้จาก source ที่ให้มา
    // จึงตรวจสอบเพียงว่าไม่มี exception และมีผลลัพธ์กลับมา
    assertNotNull(result);
  }

  @Test
  public void testGetLeastSupertype_commonEquivalentProperty_isRetained() {
    RecordType r1 = buildRecord(mapOf("a", numberType()));
    RecordType r2 = buildRecord(mapOf("a", numberType(), "b", stringType()));
    JSType result = r1.getLeastSupertype(r2);
    assertTrue(result.isRecordType());
    assertTrue(result.toMaybeRecordType().hasProperty("a"));
    // "b" ไม่ควรอยู่ในผลลัพธ์ เพราะ loop วิ่งบน properties ของ r1 (this) เท่านั้น
    assertFalse(result.toMaybeRecordType().hasProperty("b"));
  }

  @Test
  public void testGetLeastSupertype_mismatchedPropertyType_isExcluded() {
    RecordType r1 = buildRecord(mapOf("a", numberType()));
    RecordType r2 = buildRecord(mapOf("a", stringType()));
    JSType result = r1.getLeastSupertype(r2);
    // property "a" มีชนิดไม่ตรงกัน -> ไม่ควรถูกเพิ่มลง builder
    if (result.isRecordType()) {
      assertFalse(result.toMaybeRecordType().hasProperty("a"));
    }
  }

  // ============================================================
  // getGreatestSubtypeHelper
  // ============================================================

  @Test
  public void testGetGreatestSubtypeHelper_thatRecordType_noConflict_merges() {
    RecordType r1 = buildRecord(mapOf("a", numberType()));
    RecordType r2 = buildRecord(mapOf("b", stringType()));
    JSType result = r1.getGreatestSubtypeHelper(r2);
    assertTrue(result.isRecordType());
    assertTrue(result.toMaybeRecordType().hasProperty("a"));
    assertTrue(result.toMaybeRecordType().hasProperty("b"));
  }

  @Test
  public void testGetGreatestSubtypeHelper_thatRecordType_conflict_returnsNoType() {
    RecordType r1 = buildRecord(mapOf("a", numberType()));
    RecordType r2 = buildRecord(mapOf("a", stringType()));
    JSType result = r1.getGreatestSubtypeHelper(r2);
    // ชนกันที่ property "a" -> ควรได้ NO_TYPE (ซึ่งเป็น empty type)
    assertTrue(result.isEmptyType());
  }

  @Test
  public void testGetGreatestSubtypeHelper_thatNotObjectRelated_returnsEmptyGreatestSubtype() {
    RecordType r1 = buildRecord(mapOf("a", numberType()));
    JSType that = registry.getNativeType(JSTypeNative.NO_TYPE);
    JSType result = r1.getGreatestSubtypeHelper(that);
    // NO_TYPE จำกัดด้วย OBJECT_TYPE ควรเป็น empty -> ข้าม loop -> คืนค่า NO_OBJECT_TYPE (เริ่มต้น)
    // สมมติฐาน: NO_TYPE/NO_OBJECT_TYPE เป็น bottom type จึง isEmptyType() = true
    assertTrue(result.isEmptyType());
  }

  // ============================================================
  // isSubtype (instance method)
  // ============================================================

  @Test
  public void testIsSubtype_viaObjectTypeBranch_returnsTrue() {
    RecordType record = buildRecord(mapOf("a", numberType()));
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    // OBJECT_TYPE.isSubtype(OBJECT_TYPE) เป็น true เสมอ -> เข้า branch ที่สอง
    assertTrue(record.isSubtype(objectType));
  }

  @Test
  public void testIsSubtype_thatNotRecordAndNotSuperOfObject_returnsFalse() {
    RecordType record = buildRecord(mapOf("a", numberType()));
    JSType that = numberType(); // ไม่ใช่ record, ไม่ใช่ supertype ของ OBJECT_TYPE
    assertFalse(record.isSubtype(that));
  }

  @Test
  public void testIsSubtype_thatIsRecordType_matching_returnsTrue() {
    RecordType record = buildRecord(mapOf("a", numberType()));
    RecordType that = buildRecord(mapOf("a", numberType()));
    assertTrue(record.isSubtype(that));
  }

  @Test
  public void testIsSubtype_thatIsRecordType_mismatchProperty_returnsFalse() {
    RecordType record = buildRecord(mapOf("a", numberType()));
    RecordType that = buildRecord(mapOf("a", stringType()));
    assertFalse(record.isSubtype(that));
  }

  // ============================================================
  // static isSubtype(ObjectType typeA, RecordType typeB)
  // ============================================================

  @Test
  public void testStaticIsSubtype_typeAMissingProperty_returnsFalse() {
    ObjectType typeA = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    RecordType typeB = buildRecord(mapOf("foo", numberType()));
    assertFalse(RecordType.isSubtype(typeA, typeB));
  }

  @Test
  public void testStaticIsSubtype_bothUnknownType_skipsCheck_returnsTrue() {
    RecordType typeA = buildRecord(mapOf("foo", unknownType()));
    RecordType typeB = buildRecord(mapOf("foo", unknownType()));
    // propA/propB ทั้งคู่ unknown -> ข้ามการเช็คภายใน if -> ผลลัพธ์ true
    assertTrue(RecordType.isSubtype(typeA, typeB));
  }

  @Test
  public void testStaticIsSubtype_declaredNotEquivalent_returnsFalse() {
    // RecordType constructor เรียก defineDeclaredProperty เสมอ -> isPropertyTypeDeclared = true
    RecordType typeA = buildRecord(mapOf("foo", numberType()));
    RecordType typeB = buildRecord(mapOf("foo", stringType()));
    assertFalse(RecordType.isSubtype(typeA, typeB));
  }

  @Test
  public void testStaticIsSubtype_declaredEquivalent_returnsTrue() {
    RecordType typeA = buildRecord(mapOf("foo", numberType()));
    RecordType typeB = buildRecord(mapOf("foo", numberType()));
    assertTrue(RecordType.isSubtype(typeA, typeB));
  }

  // หมายเหตุ: branch "property ไม่ได้ declare (inferred) แล้วเช็ค propA.isSubtype(propB)"
  // ไม่สามารถ trigger ได้อย่างปลอดภัยในการทดสอบนี้ เนื่องจาก RecordType
  // constructor เรียก defineDeclaredProperty เสมอ (ทำให้ isPropertyTypeDeclared = true
  // เสมอสำหรับ property ของ RecordType) และไม่มีรายละเอียดพอที่จะสร้าง ObjectType
  // ชนิดอื่นที่มี inferred property ได้อย่างปลอดภัยจาก source ที่ให้มา
  // -> จงใจไม่เขียนเทสสำหรับ branch นี้เพื่อไม่เดา behavior เกินขอบเขต

  // ============================================================
  // toMaybeRecordType
  // ============================================================

  @Test
  public void testToMaybeRecordType_returnsSelf() {
    RecordType record = buildRecord(mapOf("a", numberType()));
    assertEquals(record, record.toMaybeRecordType());
  }

  @Test
  public void testTwoDifferentRecordTypeInstances_notSame() {
    RecordType r1 = buildRecord(mapOf("a", numberType()));
    RecordType r2 = buildRecord(mapOf("a", numberType()));
    assertNotSame(r1, r2);
    assertTrue(r1.isEquivalentTo(r2));
  }
}
