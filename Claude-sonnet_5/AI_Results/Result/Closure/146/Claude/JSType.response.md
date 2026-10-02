# JSTypeTest.java

**หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติที่ต้องระวัง ตามข้อกำหนดที่ 4):**

- `JSType` เป็น abstract class จึงต้องสร้าง concrete subclass เพื่อทดสอบ ผมสร้าง `TestType` (subclass ควบคุมเองทั้งหมด) ไว้ใน test class เพื่อ "บังคับ" ค่า flag ต่าง ๆ (เช่น `isAllType`, `isNoType`, `isUnknownType`, `isSubtype` ฯลฯ) โดยไม่ต้องพึ่งพา behavior ของ subclass จริงอื่น ๆ (เช่น `NumberType`, `StringType`, `UnionType` ภายใน) ที่ไม่ได้แสดงในซอร์สที่ให้มา
- ต้องวาง `JSTypeTest` ไว้ใน package เดียวกับคลาสเป้าหมาย (`com.google.javascript.rhino.jstype`) เพราะต้อง override/เข้าถึง member แบบ package-private เช่น `resolveInternal`, `setResolvedTypeInternal`, `union.alternates` — ซึ่งตรงกับวิธีที่ Defects4J ทดสอบ JSTypeTest จริงด้วย
- `ErrorReporter` interface ไม่ได้แสดง signature มาให้ ผมสมมติ `warning(String,String,int,int)` / `error(String,String,int,int)` ตามรูปแบบทั่วไปของ Closure Compiler — **หากไม่ตรงกับ signature จริงต้องแก้ให้ตรง**
- `BooleanLiteralSet` enum constants (`BOTH`, `NONE`) ไม่ได้แสดงในซอร์ส สมมติตามชื่อที่สื่อความหมาย
- พฤติกรรมของ `UnionType`/`NamedType`/`ObjectType.cast` ภายในไม่ได้แสดงในซอร์ส จึงใช้ assertion แบบเบา (`assertNotNull`) ในบางจุดที่ต้องพึ่ง class เหล่านี้ พร้อมคอมเมนต์กำกับ
- จุดสำคัญ: มี test ที่ตั้งใจ **ตรวจจับบั๊กจริงของ Closure-146 (missing `return result;` ใน `testForEquality`)** โดยแยก branch ให้ isolate เฉพาะบั๊กนี้จริง ๆ

```java
package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.JSType.TypePair;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit tests for {@link JSType}.
 *
 * หมายเหตุ: วางไว้ใน package เดียวกับคลาสเป้าหมายเพื่อให้เข้าถึง
 * package-private members (resolveInternal, setResolvedTypeInternal,
 * union.alternates ฯลฯ) ได้ตรงตามที่ต้นฉบับ Defects4J JSTypeTest ทำ
 */
public class JSTypeTest {

  private JSTypeRegistry registry;
  private ErrorReporter errorReporter;

  @Before
  public void setUp() {
    // สมมติ signature ของ ErrorReporter ตามรูปแบบทั่วไปของ Closure Compiler
    // (ไม่มีแสดงใน source ที่ให้มา) — ถ้า signature จริงต่างออกไป ต้องแก้
    errorReporter = new ErrorReporter() {
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
    registry = new JSTypeRegistry(errorReporter);
  }

  // =========================================================================
  // Test double: subclass ที่ควบคุมค่า flag ต่าง ๆ ได้เอง 100%
  // เพื่อทดสอบ logic ของ JSType (abstract class) โดยตรง โดยไม่พึ่งพา
  // subclass จริงอื่นที่ไม่มีซอร์สให้ (NumberType, StringType, UnionType ฯลฯ)
  // =========================================================================
  private static class TestType extends JSType {
    private boolean allTypeFlag = false;
    private boolean noTypeFlag = false;
    private boolean noObjectTypeFlag = false;
    private boolean unknownTypeFlag = false;
    private boolean objectTypeFlag = false;
    private boolean nullTypeFlag = false;
    private boolean voidTypeFlag = false;
    private boolean recordTypeFlag = false;
    private Boolean subtypeOverride = null; // null = ใช้ generic helper ของ JSType
    private BooleanLiteralSet outcomes = BooleanLiteralSet.BOTH;

    TestType(JSTypeRegistry registry) {
      super(registry);
    }

    void setAllTypeFlag(boolean b) { this.allTypeFlag = b; }
    void setNoTypeFlag(boolean b) { this.noTypeFlag = b; }
    void setNoObjectTypeFlag(boolean b) { this.noObjectTypeFlag = b; }
    void setUnknownTypeFlag(boolean b) { this.unknownTypeFlag = b; }
    void setObjectTypeFlag(boolean b) { this.objectTypeFlag = b; }
    void setNullTypeFlag(boolean b) { this.nullTypeFlag = b; }
    void setVoidTypeFlag(boolean b) { this.voidTypeFlag = b; }
    void setRecordTypeFlag(boolean b) { this.recordTypeFlag = b; }
    void forceIsSubtype(Boolean b) { this.subtypeOverride = b; }
    void setPossibleOutcomes(BooleanLiteralSet s) { this.outcomes = s; }

    @Override public boolean isAllType() { return allTypeFlag; }
    @Override public boolean isNoType() { return noTypeFlag; }
    @Override public boolean isNoObjectType() { return noObjectTypeFlag; }
    @Override public boolean isUnknownType() { return unknownTypeFlag; }
    @Override public boolean isObject() { return objectTypeFlag; }
    @Override public boolean isNullType() { return nullTypeFlag; }
    @Override public boolean isVoidType() { return voidTypeFlag; }
    @Override public boolean isRecordType() { return recordTypeFlag; }

    @Override
    public BooleanLiteralSet getPossibleToBooleanOutcomes() {
      return outcomes;
    }

    @Override
    public boolean isSubtype(JSType that) {
      if (subtypeOverride != null) {
        return subtypeOverride;
      }
      return JSType.isSubtype(this, that);
    }

    @Override
    public <T> T visit(Visitor<T> visitor) {
      return null; // ไม่ได้ทดสอบ logic ของ Visitor ในชุดนี้
    }

    @Override
    JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
      return this;
    }
  }

  /** ใช้ทดสอบ getTypesUnderEquality/Inequality โดยกำหนดผลลัพธ์ตรง ๆ */
  private static class FixedEqualityType extends TestType {
    private final TernaryValue fixedResult;

    FixedEqualityType(JSTypeRegistry registry, TernaryValue fixedResult) {
      super(registry);
      this.fixedResult = fixedResult;
    }

    @Override
    public TernaryValue testForEquality(JSType that) {
      return fixedResult;
    }
  }

  /**
   * ใช้ isolate บั๊ก Closure-146 (missing return ใน union branch ของ
   * JSType.testForEquality) โดย override เฉพาะกรณีที่รู้ผลลัพธ์ล่วงหน้า
   * แล้ว delegate ไปที่ super.testForEquality(...) (โค้ดจริงที่ต้องการทดสอบ)
   * เหมือนที่ leaf type จริง (เช่น NumberType) ทำ
   */
  private static class PartialOverrideEqualityType extends TestType {
    private final Map<JSType, TernaryValue> knownResults =
        new HashMap<JSType, TernaryValue>();

    PartialOverrideEqualityType(JSTypeRegistry registry) {
      super(registry);
    }

    void setResultFor(JSType other, TernaryValue value) {
      knownResults.put(other, value);
    }

    @Override
    public TernaryValue testForEquality(JSType that) {
      if (knownResults.containsKey(that)) {
        return knownResults.get(that);
      }
      return super.testForEquality(that); // <-- โค้ด JSType ที่ต้องการทดสอบ
    }
  }

  // =========================================================================
  // isEmptyType() : isNoType() || isNoObjectType()
  // =========================================================================

  @Test
  public void testIsEmptyType_viaNoType_true() {
    TestType t = new TestType(registry);
    t.setNoTypeFlag(true);
    assertTrue(t.isEmptyType());
  }

  @Test
  public void testIsEmptyType_viaNoObjectType_true() {
    TestType t = new TestType(registry);
    t.setNoObjectTypeFlag(true);
    assertTrue(t.isEmptyType());
  }

  @Test
  public void testIsEmptyType_neither_false() {
    TestType t = new TestType(registry);
    assertFalse(t.isEmptyType());
  }

  // =========================================================================
  // equals() / hashCode() / isEquivalentTo() (default)
  // =========================================================================

  @Test
  public void testEquals_sameInstance_true() {
    TestType t = new TestType(registry);
    assertTrue(t.equals(t));
  }

  @Test
  public void testEquals_differentInstance_false() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    assertFalse(a.equals(b));
  }

  @Test
  public void testEquals_nonJSTypeObject_false() {
    TestType a = new TestType(registry);
    assertFalse(a.equals("not-a-jstype"));
  }

  @Test
  public void testHashCode_isIdentityHashCode() {
    TestType t = new TestType(registry);
    assertEquals(System.identityHashCode(t), t.hashCode());
  }

  @Test
  public void testIsEquivalentStatic_bothNull_true() {
    assertTrue(JSType.isEquivalent(null, null));
  }

  @Test
  public void testIsEquivalentStatic_oneNull_false() {
    TestType t = new TestType(registry);
    assertFalse(JSType.isEquivalent(null, t));
    assertFalse(JSType.isEquivalent(t, null));
  }

  @Test
  public void testIsEquivalentStatic_bothNonNull_referenceBased() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    assertTrue(JSType.isEquivalent(a, a));
    assertFalse(JSType.isEquivalent(a, b));
  }

  // =========================================================================
  // matchesInt32Context / matchesUint32Context -> delegate matchesNumberContext
  // =========================================================================

  @Test
  public void testMatchesInt32Uint32Context_defaultFalse() {
    TestType t = new TestType(registry);
    assertFalse(t.matchesInt32Context());
    assertFalse(t.matchesUint32Context());
  }

  @Test
  public void testMatchesInt32Uint32Context_trueWhenNumberContextTrue() {
    TestType t = new TestType(registry) {
      @Override public boolean matchesNumberContext() { return true; }
    };
    assertTrue(t.matchesInt32Context());
    assertTrue(t.matchesUint32Context());
  }

  // =========================================================================
  // canAssignTo() : ขึ้นกับ isSubtype()
  // =========================================================================

  @Test
  public void testCanAssignTo_subtypeTrue() {
    TestType a = new TestType(registry);
    a.forceIsSubtype(true);
    TestType b = new TestType(registry);
    assertTrue(a.canAssignTo(b));
  }

  @Test
  public void testCanAssignTo_notSubtypeFalse() {
    TestType a = new TestType(registry);
    a.forceIsSubtype(false);
    TestType b = new TestType(registry);
    assertFalse(a.canAssignTo(b));
  }

  // =========================================================================
  // autoboxesTo / unboxesTo / toObjectType / findPropertyType / dereference
  // (ค่า default ทั้งหมด)
  // =========================================================================

  @Test
  public void testAutoboxUnboxDefaults_null() {
    TestType t = new TestType(registry);
    assertNull(t.autoboxesTo());
    assertNull(t.unboxesTo());
  }

  @Test
  public void testToObjectType_nonObjectType_returnsNull() {
    TestType t = new TestType(registry);
    assertNull(t.toObjectType());
  }

  @Test
  public void testFindPropertyType_noAutobox_returnsNull() {
    TestType t = new TestType(registry);
    assertNull(t.findPropertyType("someProp"));
  }

  @Test
  public void testFindPropertyType_emptyPropertyName_returnsNull() {
    // ค่าว่าง (empty string) ก็ยังต้อง null เพราะ autoboxesTo() เป็น null เสมอ
    TestType t = new TestType(registry);
    assertNull(t.findPropertyType(""));
  }

  @Test
  public void testDereference_noAutoboxNotObjectType_returnsNull() {
    // dereference() เรียก ObjectType.cast(...) ซึ่ง internal ไม่ได้แสดงในซอร์ส
    // แต่ควร null-safe เมื่อ argument ไม่ใช่ ObjectType (สมมติพื้นฐาน)
    TestType t = new TestType(registry);
    assertNull(t.dereference());
  }

  // =========================================================================
  // differsFrom()
  // =========================================================================

  @Test
  public void testDiffersFrom_bothKnown_differentInstances_true() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    assertTrue(a.differsFrom(b));
  }

  @Test
  public void testDiffersFrom_bothKnown_sameInstance_false() {
    TestType a = new TestType(registry);
    assertFalse(a.differsFrom(a));
  }

  @Test
  public void testDiffersFrom_oneUnknown_true() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    b.setUnknownTypeFlag(true);
    assertTrue(a.differsFrom(b));
  }

  @Test
  public void testDiffersFrom_bothUnknown_false() {
    TestType a = new TestType(registry);
    a.setUnknownTypeFlag(true);
    TestType b = new TestType(registry);
    b.setUnknownTypeFlag(true);
    assertFalse(a.differsFrom(b));
  }

  // =========================================================================
  // canTestForShallowEqualityWith()
  // =========================================================================

  @Test
  public void testCanTestForShallowEqualityWith_thisSubtypeOfThat_true() {
    TestType a = new TestType(registry);
    a.forceIsSubtype(true);
    TestType b = new TestType(registry);
    b.forceIsSubtype(false);
    assertTrue(a.canTestForShallowEqualityWith(b));
  }

  @Test
  public void testCanTestForShallowEqualityWith_thatSubtypeOfThis_true() {
    TestType a = new TestType(registry);
    a.forceIsSubtype(false);
    TestType b = new TestType(registry);
    b.forceIsSubtype(true);
    assertTrue(a.canTestForShallowEqualityWith(b));
  }

  @Test
  public void testCanTestForShallowEqualityWith_neither_false() {
    TestType a = new TestType(registry);
    a.forceIsSubtype(false);
    TestType b = new TestType(registry);
    b.forceIsSubtype(false);
    assertFalse(a.canTestForShallowEqualityWith(b));
  }

  // =========================================================================
  // isString() / isNumber() / isNullable() : ทดสอบว่า delegate ไปที่
  // isSubtype(getNativeType(...)) อย่างถูกต้อง โดยไม่ต้องรู้ internal ของ
  // native type จริง (ใช้ forceIsSubtype ควบคุมผลลัพธ์)
  // =========================================================================

  @Test
  public void testIsString_true() {
    TestType t = new TestType(registry);
    t.forceIsSubtype(true);
    assertTrue(t.isString());
  }

  @Test
  public void testIsString_false() {
    TestType t = new TestType(registry);
    t.forceIsSubtype(false);
    assertFalse(t.isString());
  }

  @Test
  public void testIsNumber_true() {
    TestType t = new TestType(registry);
    t.forceIsSubtype(true);
    assertTrue(t.isNumber());
  }

  @Test
  public void testIsNumber_false() {
    TestType t = new TestType(registry);
    t.forceIsSubtype(false);
    assertFalse(t.isNumber());
  }

  @Test
  public void testIsNullable_true() {
    TestType t = new TestType(registry);
    t.forceIsSubtype(true);
    assertTrue(t.isNullable());
  }

  @Test
  public void testIsNullable_false() {
    TestType t = new TestType(registry);
    t.forceIsSubtype(false);
    assertFalse(t.isNullable());
  }

  // =========================================================================
  // getPossibleToBooleanOutcomes / getRestrictedTypeGivenToBooleanOutcome
  // (สมมติชื่อ enum constants BOTH/NONE ตามที่ระบุในคอมเมนต์ด้านบน)
  // =========================================================================

  @Test
  public void testGetRestrictedType_outcomeContained_returnsSelf() {
    TestType t = new TestType(registry);
    t.setPossibleOutcomes(BooleanLiteralSet.BOTH);
    assertSame(t, t.getRestrictedTypeGivenToBooleanOutcome(true));
    assertSame(t, t.getRestrictedTypeGivenToBooleanOutcome(false));
  }

  @Test
  public void testGetRestrictedType_outcomeNotContained_returnsNoType() {
    TestType t = new TestType(registry);
    t.setPossibleOutcomes(BooleanLiteralSet.NONE);
    JSType result = t.getRestrictedTypeGivenToBooleanOutcome(true);
    assertTrue(result.isNoType());
  }

  // =========================================================================
  // *** จุดสำคัญ: ทดสอบบั๊ก Closure-146 (missing `return result;`) ***
  // ใน JSType.testForEquality กรณี that เป็น UnionType
  // =========================================================================

  @Test
  public void testCanTestForEqualityWith_unionBranch_missingReturnDefect() {
    PartialOverrideEqualityType a = new PartialOverrideEqualityType(registry);
    TestType alt1 = new TestType(registry);
    TestType alt2 = new TestType(registry);

    // บังคับให้ a.testForEquality(alt1) และ a.testForEquality(alt2)
    // คืนค่า TRUE ทั้งคู่ -> ภายใน loop ของ union branch, local variable
    // 'result' จะถูกคำนวณเป็น TRUE อย่างแน่นอน (ไม่ short-circuit เป็น UNKNOWN)
    a.setResultFor(alt1, TernaryValue.TRUE);
    a.setResultFor(alt2, TernaryValue.TRUE);

    JSType union = registry.createUnionType(alt1, alt2);

    // ตาม contract ของ testForEquality: เมื่อ that เป็น UnionType
    // ต้อง "return result;" ไม่ใช่ตกลงไปที่ `return null;` ท้ายเมธอด
    // ในรุ่นที่มีบั๊ก (ขาด return statement) ค่าที่ได้จะเป็น null เสมอ
    TernaryValue result = a.testForEquality(union);
    assertNotNull(
        "Defect Closure-146: union branch ของ testForEquality คำนวณ "
            + "'result' ได้ถูกต้องแต่ไม่ return ออกมา (ตกไป return null "
            + "ท้ายเมธอดแทน)",
        result);
    assertEquals(TernaryValue.TRUE, result);

    // ผลต่อเนื่อง: canTestForEqualityWith ต้องไม่ throw NPE และให้ผลลัพธ์ที่
    // สอดคล้อง (TRUE != UNKNOWN -> false)
    assertFalse(a.canTestForEqualityWith(union));
  }

  @Test
  public void testCanTestForEqualityWith_baseImplementation_genericFallbackNPE() {
    // Baseline: การเรียก testForEquality ระหว่าง TestType ธรรมดา 2 ตัว
    // (ไม่ใช่ union, ไม่ใช่ all/no/unknown/enum) จะตกไปที่
    // `return null;` ท้ายเมธอดของ JSType เสมอ -> canTestForEqualityWith
    // จะ throw NullPointerException เพราะเรียก .equals(UNKNOWN) บน null
    // นี่คือ "ข้อจำกัดของ base class เมื่อไม่มี subclass override"
    // ซึ่งไม่ได้อยู่ใน scope ของ single-line fix ของ Closure-146 โดยตรง
    // แต่ช่วยยืนยันพฤติกรรม fallback ของโค้ดต้นฉบับ
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    try {
      a.canTestForEqualityWith(b);
      fail("คาดว่าจะ throw NullPointerException ตาม fallback path ของ "
          + "base class testForEquality (return null ท้ายเมธอด)");
    } catch (NullPointerException expected) {
      // เป็นไปตามที่คาดไว้จากโค้ดต้นฉบับ
    }
  }

  // =========================================================================
  // getTypesUnderEquality()
  // =========================================================================

  @Test
  public void testGetTypesUnderEquality_TRUE_returnsBothTypes() {
    FixedEqualityType a = new FixedEqualityType(registry, TernaryValue.TRUE);
    TestType b = new TestType(registry);
    TypePair pair = a.getTypesUnderEquality(b);
    assertSame(a, pair.typeA);
    assertSame(b, pair.typeB);
  }

  @Test
  public void testGetTypesUnderEquality_UNKNOWN_returnsBothTypes() {
    FixedEqualityType a = new FixedEqualityType(registry, TernaryValue.UNKNOWN);
    TestType b = new TestType(registry);
    TypePair pair = a.getTypesUnderEquality(b);
    assertSame(a, pair.typeA);
    assertSame(b, pair.typeB);
  }

  @Test
  public void testGetTypesUnderEquality_FALSE_returnsNullPair() {
    FixedEqualityType a = new FixedEqualityType(registry, TernaryValue.FALSE);
    TestType b = new TestType(registry);
    TypePair pair = a.getTypesUnderEquality(b);
    assertNull(pair.typeA);
    assertNull(pair.typeB);
  }

  @Test
  public void testGetTypesUnderEquality_thatIsUnionType_delegatesAndSwaps() {
    TestType alt1 = new TestType(registry);
    TestType alt2 = new TestType(registry);
    JSType union = registry.createUnionType(alt1, alt2);
    FixedEqualityType a = new FixedEqualityType(registry, TernaryValue.TRUE);

    // NOTE: พฤติกรรมภายในของ UnionType.getTypesUnderEquality ไม่ได้แสดง
    // ในซอร์สที่ให้มา จึง assert แค่ว่า flow ทำงานได้และคืนค่า TypePair
    // (ไม่ throw exception) เพื่อครอบคลุม branch `that instanceof UnionType`
    TypePair pair = a.getTypesUnderEquality(union);
    assertNotNull(pair);
  }

  // =========================================================================
  // getTypesUnderInequality()
  // =========================================================================

  @Test
  public void testGetTypesUnderInequality_TRUE_returnsNullPair() {
    FixedEqualityType a = new FixedEqualityType(registry, TernaryValue.TRUE);
    TestType b = new TestType(registry);
    TypePair pair = a.getTypesUnderInequality(b);
    assertNull(pair.typeA);
    assertNull(pair.typeB);
  }

  @Test
  public void testGetTypesUnderInequality_FALSE_returnsBothTypes() {
    FixedEqualityType a = new FixedEqualityType(registry, TernaryValue.FALSE);
    TestType b = new TestType(registry);
    TypePair pair = a.getTypesUnderInequality(b);
    assertSame(a, pair.typeA);
    assertSame(b, pair.typeB);
  }

  @Test
  public void testGetTypesUnderInequality_UNKNOWN_returnsBothTypes() {
    FixedEqualityType a = new FixedEqualityType(registry, TernaryValue.UNKNOWN);
    TestType b = new TestType(registry);
    TypePair pair = a.getTypesUnderInequality(b);
    assertSame(a, pair.typeA);
    assertSame(b, pair.typeB);
  }

  @Test
  public void testGetTypesUnderInequality_thatIsUnionType_delegatesAndSwaps() {
    TestType alt1 = new TestType(registry);
    TestType alt2 = new TestType(registry);
    JSType union = registry.createUnionType(alt1, alt2);
    FixedEqualityType a = new FixedEqualityType(registry, TernaryValue.FALSE);

    TypePair pair = a.getTypesUnderInequality(union);
    assertNotNull(pair);
  }

  // =========================================================================
  // getTypesUnderShallowEquality() -> ใช้ getGreatestSubtype()
  // =========================================================================

  @Test
  public void testGetTypesUnderShallowEquality_usesGreatestSubtype() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    a.forceIsSubtype(true); // a <: b -> greatestSubtype = a
    TypePair pair = a.getTypesUnderShallowEquality(b);
    assertSame(a, pair.typeA);
    assertSame(a, pair.typeB);
  }

  // =========================================================================
  // getTypesUnderShallowInequality()
  // =========================================================================

  @Test
  public void testGetTypesUnderShallowInequality_bothNullType_returnsNullPair() {
    TestType a = new TestType(registry);
    a.setNullTypeFlag(true);
    TestType b = new TestType(registry);
    b.setNullTypeFlag(true);
    TypePair pair = a.getTypesUnderShallowInequality(b);
    assertNull(pair.typeA);
    assertNull(pair.typeB);
  }

  @Test
  public void testGetTypesUnderShallowInequality_bothVoidType_returnsNullPair() {
    TestType a = new TestType(registry);
    a.setVoidTypeFlag(true);
    TestType b = new TestType(registry);
    b.setVoidTypeFlag(true);
    TypePair pair = a.getTypesUnderShallowInequality(b);
    assertNull(pair.typeA);
    assertNull(pair.typeB);
  }

  @Test
  public void testGetTypesUnderShallowInequality_default_returnsPair() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    TypePair pair = a.getTypesUnderShallowInequality(b);
    assertSame(a, pair.typeA);
    assertSame(b, pair.typeB);
  }

  @Test
  public void testGetTypesUnderShallowInequality_thatIsUnionType_swap() {
    TestType alt1 = new TestType(registry);
    TestType alt2 = new TestType(registry);
    JSType union = registry.createUnionType(alt1, alt2);
    TestType a = new TestType(registry);
    TypePair pair = a.getTypesUnderShallowInequality(union);
    assertNotNull(pair);
  }

  // =========================================================================
  // restrictByNotNullOrUndefined() default
  // =========================================================================

  @Test
  public void testRestrictByNotNullOrUndefined_defaultReturnsThis() {
    TestType a = new TestType(registry);
    assertSame(a, a.restrictByNotNullOrUndefined());
  }

  // =========================================================================
  // static isSubtype(thisType, thatType) helper — ผ่าน TestType.isSubtype()
  // (ไม่ forceIsSubtype เพื่อทดสอบ generic helper จริง)
  // =========================================================================

  @Test
  public void testStaticIsSubtype_thatUnknown_true() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    b.setUnknownTypeFlag(true);
    assertTrue(a.isSubtype(b));
  }

  @Test
  public void testStaticIsSubtype_equivalentSelf_true() {
    TestType a = new TestType(registry);
    assertTrue(a.isSubtype(a));
  }

  @Test
  public void testStaticIsSubtype_thatAllType_true() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    b.setAllTypeFlag(true);
    assertTrue(a.isSubtype(b));
  }

  @Test
  public void testStaticIsSubtype_default_false() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    assertFalse(a.isSubtype(b));
  }

  @Test
  public void testStaticIsSubtype_unionAlternateMatches_true() {
    final TestType alt1 = new TestType(registry);
    TestType alt2 = new TestType(registry);
    JSType union = registry.createUnionType(alt1, alt2);

    TestType a = new TestType(registry) {
      @Override
      public boolean isSubtype(JSType that) {
        if (that == alt1) {
          return true;
        }
        return JSType.isSubtype(this, that);
      }
    };
    assertTrue(a.isSubtype(union));
  }

  @Test
  public void testStaticIsSubtype_unionNoAlternateMatches_false() {
    TestType alt1 = new TestType(registry);
    TestType alt2 = new TestType(registry);
    JSType union = registry.createUnionType(alt1, alt2);

    TestType a = new TestType(registry);
    assertFalse(a.isSubtype(union));
  }

  // =========================================================================
  // getGreatestSubtype() (instance + static helper)
  // =========================================================================

  @Test
  public void testGetGreatestSubtype_recordTypeDelegation() {
    TestType typeR = new TestType(registry);
    typeR.setRecordTypeFlag(true);
    TestType typeX = new TestType(registry);
    JSType result = typeX.getGreatestSubtype(typeR);
    assertTrue(result.isNoType());
  }

  @Test
  public void testStaticGetGreatestSubtype_thatEmptyOrAll_delegates() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    b.setNoTypeFlag(true);
    JSType result = JSType.getGreatestSubtype(a, b);
    assertTrue(result.isNoType());
  }

  @Test
  public void testStaticGetGreatestSubtype_eitherUnknown_equivalent_returnsThis() {
    TestType a = new TestType(registry);
    a.setUnknownTypeFlag(true);
    JSType result = JSType.getGreatestSubtype(a, a);
    assertSame(a, result);
  }

  @Test
  public void testStaticGetGreatestSubtype_eitherUnknown_notEquivalent_returnsUnknownType() {
    TestType a = new TestType(registry);
    a.setUnknownTypeFlag(true);
    TestType b = new TestType(registry);
    JSType result = JSType.getGreatestSubtype(a, b);
    assertTrue(result.isUnknownType());
  }

  @Test
  public void testStaticGetGreatestSubtype_thisSubtypeOfThat_returnsThis() {
    TestType a = new TestType(registry);
    a.forceIsSubtype(true);
    TestType b = new TestType(registry);
    JSType result = JSType.getGreatestSubtype(a, b);
    assertSame(a, result);
  }

  @Test
  public void testStaticGetGreatestSubtype_thatSubtypeOfThis_returnsThat() {
    TestType a = new TestType(registry);
    a.forceIsSubtype(false);
    TestType b = new TestType(registry);
    b.forceIsSubtype(true);
    JSType result = JSType.getGreatestSubtype(a, b);
    assertSame(b, result);
  }

  @Test
  public void testStaticGetGreatestSubtype_bothObjects_returnsNoObjectType() {
    TestType a = new TestType(registry);
    a.forceIsSubtype(false);
    a.setObjectTypeFlag(true);
    TestType b = new TestType(registry);
    b.forceIsSubtype(false);
    b.setObjectTypeFlag(true);
    JSType result = JSType.getGreatestSubtype(a, b);
    assertTrue(result.isNoObjectType());
  }

  @Test
  public void testStaticGetGreatestSubtype_default_returnsNoType() {
    TestType a = new TestType(registry);
    a.forceIsSubtype(false);
    TestType b = new TestType(registry);
    b.forceIsSubtype(false);
    JSType result = JSType.getGreatestSubtype(a, b);
    assertTrue(result.isNoType());
  }

  // =========================================================================
  // getLeastSupertype() (instance + static helper)
  // =========================================================================

  @Test
  public void testGetLeastSupertype_instance_thatIsUnionType_delegates() {
    TestType alt1 = new TestType(registry);
    TestType alt2 = new TestType(registry);
    JSType union = registry.createUnionType(alt1, alt2);
    TestType a = new TestType(registry);
    JSType result = a.getLeastSupertype(union);
    // พฤติกรรมละเอียดขึ้นกับ UnionType.getLeastSupertype ที่ไม่มีในซอร์สที่ให้
    assertNotNull(result);
  }

  @Test
  public void testStaticGetLeastSupertype_thatEmptyOrAll_delegates() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    b.setAllTypeFlag(true);
    JSType result = JSType.getLeastSupertype(a, b);
    assertNotNull(result);
  }

  @Test
  public void testStaticGetLeastSupertype_default_createsUnionType() {
    TestType a = new TestType(registry);
    TestType b = new TestType(registry);
    JSType result = JSType.getLeastSupertype(a, b);
    assertTrue(result.isUnionType());
  }

  // =========================================================================
  // resolve() / forceResolve() / isResolved() / clearResolved() lifecycle
  // =========================================================================

  @Test
  public void testResolveLifecycle_firstCallCachesResult() {
    TestType t = new TestType(registry);
    assertFalse(t.isResolved());

    JSType result1 = t.resolve(errorReporter, null);
    assertTrue(t.isResolved());
    assertSame(t, result1); // resolveInternal คืน this

    JSType result2 = t.resolve(errorReporter, null); // เรียกซ้ำ -> ใช้ cache
    assertSame(result1, result2);

    t.clearResolved();
    assertFalse(t.isResolved());
  }

  @Test
  public void testResolve_resolvedButResultNull_returnsUnknownType() {
    TestType t = new TestType(registry);
    t.setResolvedTypeInternal(null); // package-private method
    assertTrue(t.isResolved());

    JSType result = t.resolve(errorReporter, null);
    assertTrue(result.isUnknownType());
  }

  @Test
  public void testForceResolve_restoresOriginalResolveMode() {
    TestType t = new TestType(registry);
    JSTypeRegistry.ResolveMode originalMode = registry.getResolveMode();

    JSType result = t.forceResolve(errorReporter, null);
    assertSame(t, result);
    assertEquals(originalMode, registry.getResolveMode());
  }

  // =========================================================================
  // toDebugHashCodeString()
  // =========================================================================

  @Test
  public void testToDebugHashCodeString_format() {
    TestType t = new TestType(registry);
    assertEquals("{" + t.hashCode() + "}", t.toDebugHashCodeString());
  }
}
```

---

## สรุปตาราง Test method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testIsEmptyType_* (3 methods) | `isEmptyType()`: `isNoType()`=true, `isNoObjectType()`=true, ทั้งสอง false |
| testEquals_* (3 methods) | `equals()`: same ref, different ref, non-`JSType` object |
| testHashCode_isIdentityHashCode | `hashCode()` = identityHashCode |
| testIsEquivalentStatic_* (3 methods) | `isEquivalent()`: null/null, null/non-null สลับ, non-null ทั้งคู่ |
| testMatchesInt32Uint32Context_* (2) | delegate ไป `matchesNumberContext()` true/false |
| testCanAssignTo_* (2) | `canAssignTo()`: subtype true/false |
| testAutoboxUnboxDefaults_null | `autoboxesTo()`/`unboxesTo()` default null |
| testToObjectType_nonObjectType_returnsNull | `toObjectType()` เมื่อไม่ใช่ `ObjectType` |
| testFindPropertyType_* (2) | `findPropertyType()` null เมื่อ autobox=null (รวม empty string) |
| testDereference_noAutoboxNotObjectType_returnsNull | `dereference()` path autobox=null, ไม่ใช่ ObjectType |
| testDiffersFrom_* (4) | `differsFrom()`: known/known ต่างกัน, known/known เหมือนกัน, unknown 1 ตัว, unknown ทั้งคู่ |
| testCanTestForShallowEqualityWith_* (3) | `canTestForShallowEqualityWith()`: this<:that, that<:this, ไม่มีทางใด |
| testIsString_*/testIsNumber_*/testIsNullable_* (6) | delegate ไป `isSubtype(getNativeType(...))` true/false |
| testGetRestrictedType_* (2) | `getRestrictedTypeGivenToBooleanOutcome()`: contains true/false → self/NO_TYPE |
| **testCanTestForEqualityWith_unionBranch_missingReturnDefect** | **บั๊ก Closure-146**: union branch คำนวณ `result` แต่ไม่ `return` — isolate เฉพาะบั๊กนี้ |
| testCanTestForEqualityWith_baseImplementation_genericFallbackNPE | fallback `return null;` ท้ายเมธอด → NPE เมื่อไม่มี override |
| testGetTypesUnderEquality_* (4) | switch TRUE/FALSE/UNKNOWN + union-swap branch |
| testGetTypesUnderInequality_* (4) | switch TRUE/FALSE/UNKNOWN + union-swap branch |
| testGetTypesUnderShallowEquality_usesGreatestSubtype | ใช้ `getGreatestSubtype()` ภายใน |
| testGetTypesUnderShallowInequality_* (4) | null/null-type ตรงกัน, void/void ตรงกัน, default pair, union-swap |
| testRestrictByNotNullOrUndefined_defaultReturnsThis | default คืน `this` |
| testStaticIsSubtype_* (5) | helper `isSubtype()`: that unknown, equivalent self, all type, union match/ไม่match, default false |
| testGetGreatestSubtype_recordTypeDelegation | instance method: `that.isRecordType()` delegate |
| testStaticGetGreatestSubtype_* (6) | static helper ทุก branch: empty/all delegate, unknown+equivalent, unknown+ไม่equivalent, this<:that, that<:this, bothObjects, default |
| testGetLeastSupertype_instance_thatIsUnionType_delegates | instance method union branch |
| testStaticGetLeastSupertype_* (2) | static helper: empty/all delegate, default createUnionType |
| testResolveLifecycle_firstCallCachesResult | `resolve()` first-call, cache, `clearResolved()` |
| testResolve_resolvedButResultNull_returnsUnknownType | `resolve()` เมื่อ resolved=true & resolveResult=null |
| testForceResolve_restoresOriginalResolveMode | `forceResolve()` set/restore ResolveMode |
| testToDebugHashCodeString_format | รูปแบบ string output |

**ข้อจำกัดที่ทราบ (ตามข้อกำหนดที่ 4):** บาง assertion (union-swap ใน `getTypesUnder*`, `getLeastSupertype` กับ union) ใช้ `assertNotNull` แบบเบา เพราะพฤติกรรมภายในของ `UnionType`/`NamedType`/`ObjectType.cast` ไม่ได้แสดงในซอร์สที่ให้มา — ไม่ได้เดา behavior ที่ไม่มีหลักฐาน