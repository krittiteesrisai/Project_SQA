以下คือชุดทดสอบ JUnit 4 สำหรับคลาส `RecordType` (Defects4J: Closure-46b)

**หมายเหตุสำคัญก่อนเริ่ม:**
- คลาส `RecordType`, `RecordTypeBuilder`, `RecordTypeBuilder.RecordProperty` เป็น package-private จึงต้องวาง test class ไว้ใน package เดียวกัน (`com.google.javascript.rhino.jstype`)
- ฟิลด์/เมธอดที่ไม่ปรากฏใน source ที่ให้มา (เช่น `JSTypeRegistry`, `PrototypeObjectType`, `ObjectType.hasProperty`, `JSType.isEquivalentTo`, `resolveInternal`'s `StaticScope`) ผมอ้างอิงตาม API จริงของ Closure Compiler ที่จำเป็นต้องมีเพื่อให้โค้ดที่ให้มา **compile ได้** เท่านั้น จะไม่เดาพฤติกรรม (behavior) เพิ่มเติมเกินกว่าที่ระบุใน source — จุดที่ไม่แน่ใจ 100% จะมีคอมเมนต์กำกับไว้
- `resolveInternal` ถูกงดเว้นจากการทดสอบโดยตรง เพราะต้องพึ่งพา `StaticScope<JSType>` ซึ่งไม่มีรายละเอียดใน source ที่ให้มา หากเดา constructor/interface ผิดจะทำให้ทั้งไฟล์ compile ไม่ผ่าน จึงเลือกไม่เสี่ยง (ระบุไว้ในตารางสรุป)
- Branch ของ `defineProperty` กรณี `isFrozen == false && inferred == true` ไม่สามารถ trigger ได้ เพราะ constructor เรียกผ่าน `defineDeclaredProperty` (inferred=false) เท่านั้น และหลัง constructor `isFrozen` จะเป็น `true` เสมอ — จึง unreachable ตาม design ของ class นี้

```java
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
```

### ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_emptyProperties_ok` | constructor: loop ว่าง (0 iterations), `isFrozen` ตั้งเป็น true |
| `testConstructor_nullRecordProperty_throwsIllegalStateException` | constructor: `if (prop == null)` → true → throw exception |
| `testConstructor_freezesInstance_defineNonInferredPropertyReturnsFalse` | `defineProperty`: `if (isFrozen) return false` (true branch) หลัง construct |
| `testConstructor_freezesInstance_defineInferredPropertyReturnsFalse` | `defineProperty`: `isFrozen==true` branch อีกกรณี (inferred=true) |
| `testIsEquivalentTo_otherNotRecordType_returnsFalse` | `isEquivalentTo`: `!other.isRecordType()` → true |
| `testIsEquivalentTo_sameInstance_returnsTrue` | `isEquivalentTo`: `otherRecord == this` → true |
| `testIsEquivalentTo_differentKeySet_returnsFalse` | `isEquivalentTo`: `!otherProps.keySet().equals(keySet)` → true |
| `testIsEquivalentTo_sameKeyDifferentType_returnsFalse` | `isEquivalentTo`: for-loop, `!otherProps.get(key).isEquivalentTo(...)` → true |
| `testIsEquivalentTo_sameKeySameType_returnsTrue` | `isEquivalentTo`: loop ผ่านทุก key, ท้ายสุด return true |
| `testGetImplicitPrototype_returnsObjectType` | `getImplicitPrototype`: return path เดียว |
| `testGetLeastSupertype_thatNotRecordType_delegatesToSuper` | `getLeastSupertype`: `!that.isRecordType()` → true |
| `testGetLeastSupertype_commonEquivalentProperty_isRetained` | `getLeastSupertype`: `hasProperty && isEquivalentTo` → true → addProperty |
| `testGetLeastSupertype_mismatchedPropertyType_isExcluded` | `getLeastSupertype`: condition false → ไม่ addProperty |
| `testGetGreatestSubtypeHelper_thatRecordType_noConflict_merges` | `getGreatestSubtypeHelper`: `that.isRecordType()` true, ไม่ conflict, loop ที่สอง (`!hasProperty`) |
| `testGetGreatestSubtypeHelper_thatRecordType_conflict_returnsNoType` | `getGreatestSubtypeHelper`: conflict → return NO_TYPE |
| `testGetGreatestSubtypeHelper_thatNotObjectRelated_returnsEmptyGreatestSubtype` | `getGreatestSubtypeHelper`: `that.isRecordType()` false, `thatRestrictedToObj.isEmptyType()` true → ข้าม loop |
| `testIsSubtype_viaObjectTypeBranch_returnsTrue` | `isSubtype`: branch `OBJECT_TYPE.isSubtype(that)` → true |
| `testIsSubtype_thatNotRecordAndNotSuperOfObject_returnsFalse` | `isSubtype`: `!that.isRecordType()` → true → return false |
| `testIsSubtype_thatIsRecordType_matching_returnsTrue` | `isSubtype`: delegate ไป `RecordType.isSubtype(this, that)` → true |
| `testIsSubtype_thatIsRecordType_mismatchProperty_returnsFalse` | `isSubtype`: delegate → false |
| `testStaticIsSubtype_typeAMissingProperty_returnsFalse` | static `isSubtype`: `!typeA.hasProperty(property)` → true |
| `testStaticIsSubtype_bothUnknownType_skipsCheck_returnsTrue` | static `isSubtype`: `propA.isUnknownType()` true → skip if-block |
| `testStaticIsSubtype_declaredNotEquivalent_returnsFalse` | static `isSubtype`: `isPropertyTypeDeclared` true, `!isEquivalentTo` → false |
| `testStaticIsSubtype_declaredEquivalent_returnsTrue` | static `isSubtype`: `isPropertyTypeDeclared` true, equivalent → loop จบ → true |
| `testToMaybeRecordType_returnsSelf` | `toMaybeRecordType`: return path เดียว |
| `testTwoDifferentRecordTypeInstances_notSame` | ยืนยัน identity vs equivalence แยกกัน (sanity check) |

**Branch ที่ไม่ได้ครอบคลุม (พร้อมเหตุผล):**
- `defineProperty`: กรณี `isFrozen == false` — unreachable จาก API ภายนอกเพราะ constructor freeze ก่อนคืนค่า
- static `isSubtype`: กรณี property ไม่ declared (inferred) แล้วใช้ `propA.isSubtype(propB)` — ไม่สามารถสร้างสถานการณ์นี้ได้อย่างปลอดภัยจาก source ที่ให้มา
- `getGreatestSubtypeHelper`: branch ที่ `thatRestrictedToObj` ไม่ empty (ต้องพึ่ง `registry.getEachReferenceTypeWithProperty`) — ซับซ้อนเกินขอบเขตของ source ที่ให้มา
- `resolveInternal`: ไม่ทดสอบเนื่องจากต้องพึ่ง `StaticScope<JSType>` ที่ไม่มีรายละเอียดใน source