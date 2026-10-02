# JUnit 4 Test Suite สำหรับ `JSType` (Closure-82b)

## หมายเหตุสำคัญก่อนเริ่ม

- `JSType` เป็น abstract class ที่ผูกกับ `JSTypeRegistry` จริง (native types เช่น `NUMBER_TYPE`, `OBJECT_TYPE` ฯลฯ ถูกอ้างอิงในซอร์สโค้ดเป้าหมายเอง) ดังนั้นทดสอบจะอยู่ใน **package เดียวกัน** (`com.google.javascript.rhino.jstype`) เพื่อให้เข้าถึง constructor/method แบบ package-private ได้ (เช่น `resolveInternal`, `setResolvedTypeInternal`, static helper `getGreatestSubtype`, `isSubtype`, `filterNoResolvedType`)
- สร้าง **stub class `FakeJSType`** ที่ extends `JSType` เพื่อควบคุมค่า boolean flag ต่าง ๆ (isFunctionType, isEnumElementType, ...) ได้ตรง ๆ สำหรับทดสอบ logic ภายใน `JSType` เอง แยกจาก logic ของ subclass จริง (ObjectType/UnionType) ที่ไม่มีซอร์สให้
- บาง branch (เช่น `ProxyObjectType` ใน `isEquivalentTo`, `NamedType` ใน `isSubtype` static helper, `UnionType.meet(...)`) **ไม่ทดสอบเจาะลึกพฤติกรรมภายใน** เพราะไม่มีซอร์สโค้ดให้ตรวจสอบ — จะทำเพียง smoke test (ไม่ throw / ไม่ null) พร้อมคอมเมนต์กำกับ
- Test `testForEqualityHelper_DefaultCase_ReturnsNull...` เป็นการทดสอบตรงจากซอร์ส (branch สุดท้าย `return null;`) ซึ่งเป็นจุดที่น่าสงสัยว่าเป็นสาเหตุของบั๊ก (Closure-82) — เมื่อเรียกผ่าน `canTestForEqualityWith` จะได้ NPE จริงตามโค้ดปัจจุบัน

```java
package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;

import org.junit.Before;
import org.junit.Test;

public class JSTypeTest {

  private JSTypeRegistry registry;

  // ErrorReporter แบบ no-op (สมมติ interface มี warning/error ตามธรรมเนียมของ Closure)
  private static final ErrorReporter NULL_REPORTER = new ErrorReporter() {
    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {}
    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {}
  };

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(NULL_REPORTER);
  }

  private FakeJSType newFake() {
    return new FakeJSType(registry);
  }

  // ---------------------------------------------------------------------
  // Stub class เพื่อควบคุม flag ต่าง ๆ ของ JSType ได้โดยตรง
  // ---------------------------------------------------------------------
  static class FakeJSType extends JSType {
    boolean subtype;
    boolean allType, unknownType, noResolvedType, noType, noObjectType;
    boolean functionType, enumElementType, unionType;
    boolean nullType, voidType, object, recordType;
    boolean matchesNumberContextFlag;
    String displayName;
    JSType autoboxTo;
    JSType unboxTo;
    JSType greatestSubtypeOverride;
    TernaryValue ternaryOverride;
    BooleanLiteralSet booleanOutcomes = BooleanLiteralSet.BOTH;
    int resolveCount = 0;
    JSType resolveInternalResult;

    FakeJSType(JSTypeRegistry registry) {
      super(registry);
      this.resolveInternalResult = this;
    }

    @Override public boolean isSubtype(JSType that) { return subtype; }
    @Override public boolean isAllType() { return allType; }
    @Override public boolean isUnknownType() { return unknownType; }
    @Override public boolean isNoResolvedType() { return noResolvedType; }
    @Override public boolean isNoType() { return noType; }
    @Override public boolean isNoObjectType() { return noObjectType; }
    @Override public boolean isFunctionType() { return functionType; }
    @Override public boolean isEnumElementType() { return enumElementType; }
    @Override public boolean isUnionType() { return unionType; }
    @Override public boolean isNullType() { return nullType; }
    @Override public boolean isVoidType() { return voidType; }
    @Override public boolean isObject() { return object; }
    @Override public boolean isRecordType() { return recordType; }
    @Override public boolean matchesNumberContext() { return matchesNumberContextFlag; }
    @Override public String getDisplayName() { return displayName; }
    @Override public JSType autoboxesTo() { return autoboxTo; }
    @Override public JSType unboxesTo() { return unboxTo; }
    @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return booleanOutcomes; }
    @Override public <T> T visit(Visitor<T> visitor) { return null; }

    @Override
    JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
      resolveCount++;
      return resolveInternalResult;
    }

    @Override
    public JSType getGreatestSubtype(JSType that) {
      if (greatestSubtypeOverride != null) {
        return greatestSubtypeOverride;
      }
      return super.getGreatestSubtype(that);
    }

    @Override
    public TernaryValue testForEquality(JSType that) {
      if (ternaryOverride != null) {
        return ternaryOverride;
      }
      return super.testForEquality(that);
    }
  }

  // ---------------------------------------------------------------------
  // hasDisplayName()
  // ---------------------------------------------------------------------
  @Test
  public void hasDisplayName_NullReturnsFalse() {
    FakeJSType t = newFake();
    t.displayName = null;
    assertFalse(t.hasDisplayName());
  }

  @Test
  public void hasDisplayName_EmptyReturnsFalse() {
    FakeJSType t = newFake();
    t.displayName = "";
    assertFalse(t.hasDisplayName());
  }

  @Test
  public void hasDisplayName_NonEmptyReturnsTrue() {
    FakeJSType t = newFake();
    t.displayName = "Foo";
    assertTrue(t.hasDisplayName());
  }

  // ---------------------------------------------------------------------
  // isEmptyType()
  // ---------------------------------------------------------------------
  @Test
  public void isEmptyType_Branches() {
    FakeJSType t1 = newFake();
    t1.noType = true;
    assertTrue(t1.isEmptyType());

    FakeJSType t2 = newFake();
    t2.noObjectType = true;
    assertTrue(t2.isEmptyType());

    FakeJSType t3 = newFake();
    t3.noResolvedType = true;
    assertTrue(t3.isEmptyType());

    FakeJSType t4 = newFake();
    assertFalse(t4.isEmptyType());
  }

  // ---------------------------------------------------------------------
  // isEquivalentTo() / isEquivalent() / equals() / hashCode()
  // ---------------------------------------------------------------------
  @Test
  public void isEquivalentTo_SameInstanceTrue() {
    FakeJSType t = newFake();
    assertTrue(t.isEquivalentTo(t));
  }

  @Test
  public void isEquivalentTo_DifferentInstanceFalse() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    assertFalse(a.isEquivalentTo(b));
  }

  @Test
  public void isEquivalentStatic_AllBranches() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    assertTrue(JSType.isEquivalent(null, null));
    assertFalse(JSType.isEquivalent(null, a));
    assertFalse(JSType.isEquivalent(a, null));
    assertTrue(JSType.isEquivalent(a, a));
    assertFalse(JSType.isEquivalent(a, b));
  }

  @Test
  public void equalsObject_Branches() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    assertTrue(a.equals(a));
    assertFalse(a.equals(b));
    assertFalse(a.equals("not a JSType"));
    assertFalse(a.equals(null));
  }

  @Test
  public void hashCode_MatchesIdentityHashCode() {
    FakeJSType a = newFake();
    assertEquals(System.identityHashCode(a), a.hashCode());
  }

  // ---------------------------------------------------------------------
  // differsFrom()
  // ---------------------------------------------------------------------
  @Test
  public void differsFrom_BothKnown_Equivalent() {
    FakeJSType a = newFake();
    assertFalse(a.differsFrom(a));
  }

  @Test
  public void differsFrom_BothKnown_NotEquivalent() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    assertTrue(a.differsFrom(b));
  }

  @Test
  public void differsFrom_OneUnknown() {
    FakeJSType a = newFake();
    a.unknownType = true;
    FakeJSType b = newFake();
    assertTrue(a.differsFrom(b));   // this unknown, that known
    assertTrue(b.differsFrom(a));   // this known, that unknown
  }

  @Test
  public void differsFrom_BothUnknown() {
    FakeJSType a = newFake();
    a.unknownType = true;
    FakeJSType b = newFake();
    b.unknownType = true;
    assertFalse(a.differsFrom(b));
  }

  // ---------------------------------------------------------------------
  // canAssignTo()
  // ---------------------------------------------------------------------
  @Test
  public void canAssignTo_True() {
    FakeJSType a = newFake();
    a.subtype = true;
    assertTrue(a.canAssignTo(newFake()));
  }

  @Test
  public void canAssignTo_False() {
    FakeJSType a = newFake();
    a.subtype = false;
    assertFalse(a.canAssignTo(newFake()));
  }

  // ---------------------------------------------------------------------
  // toObjectType() / dereference() / findPropertyType() / autoboxesTo()
  // ---------------------------------------------------------------------
  @Test
  public void toObjectType_NonObjectReturnsNull() {
    FakeJSType a = newFake();
    assertNull(a.toObjectType());
  }

  @Test
  public void toObjectType_RealObjectTypeReturnsSelf() {
    JSType objType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    assertSame(objType, objType.toObjectType());
  }

  @Test
  public void findPropertyType_AutoboxNullReturnsNull() {
    FakeJSType a = newFake();
    a.autoboxTo = null;
    assertNull(a.findPropertyType("foo"));
  }

  @Test
  public void findPropertyType_AutoboxNonNullDelegates() {
    FakeJSType a = newFake();
    a.autoboxTo = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    // ไม่มี property "nonexistentProp" บน Object -> คาดว่า delegate สำเร็จและได้ null
    assertNull(a.findPropertyType("nonexistentProp12345"));
  }

  @Test
  public void dereference_NoAutoboxAndNotObjectReturnsNull() {
    FakeJSType a = newFake();
    a.autoboxTo = null; // restrictByNotNullOrUndefined() default = this (ไม่ใช่ ObjectType)
    assertNull(a.dereference());
  }

  @Test
  public void dereference_WithAutoboxReturnsObjectType() {
    FakeJSType a = newFake();
    ObjectType obj = (ObjectType) registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    a.autoboxTo = obj;
    assertSame(obj, a.dereference());
  }

  // ---------------------------------------------------------------------
  // isNullable() / matchesInt32Context / matchesUint32Context
  // ---------------------------------------------------------------------
  @Test
  public void isNullable_DelegatesToIsSubtype() {
    FakeJSType a = newFake();
    a.subtype = true;
    assertTrue(a.isNullable());
    a.subtype = false;
    assertFalse(a.isNullable());
  }

  @Test
  public void matchesInt32AndUint32Context_DelegateToNumberContext() {
    FakeJSType a = newFake();
    a.matchesNumberContextFlag = true;
    assertTrue(a.matchesInt32Context());
    assertTrue(a.matchesUint32Context());
    a.matchesNumberContextFlag = false;
    assertFalse(a.matchesInt32Context());
    assertFalse(a.matchesUint32Context());
  }

  // ---------------------------------------------------------------------
  // isString()/isNumber() บนชนิดจริงจาก registry (sanity, ไม่ใช่ stub)
  // ---------------------------------------------------------------------
  @Test
  public void isNumber_RealNumberType() {
    JSType number = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertTrue(number.isNumber());
    assertFalse(number.isString());
  }

  @Test
  public void isString_RealStringType() {
    JSType string = registry.getNativeType(JSTypeNative.STRING_TYPE);
    assertTrue(string.isString());
    assertFalse(string.isNumber());
  }

  // ---------------------------------------------------------------------
  // canTestForShallowEqualityWith()
  // ---------------------------------------------------------------------
  @Test
  public void canTestForShallowEqualityWith_Combinations() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();

    a.subtype = true; b.subtype = false;
    assertTrue(a.canTestForShallowEqualityWith(b));

    a.subtype = false; b.subtype = true;
    assertTrue(a.canTestForShallowEqualityWith(b));

    a.subtype = false; b.subtype = false;
    assertFalse(a.canTestForShallowEqualityWith(b));
  }

  // ---------------------------------------------------------------------
  // testForEqualityHelper() ผ่าน testForEquality()
  // ---------------------------------------------------------------------
  @Test
  public void testForEquality_UnknownAllOrNoResolved_ReturnsUnknown() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();

    b.unknownType = true;
    assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));

    b.unknownType = false; a.allType = true;
    assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));

    a.allType = false; b.noResolvedType = true;
    assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));
  }

  @Test
  public void testForEquality_BothEmpty_ReturnsTrue() {
    FakeJSType a = newFake();
    a.noType = true;
    FakeJSType b = newFake();
    b.noObjectType = true;
    assertEquals(TernaryValue.TRUE, a.testForEquality(b));
  }

  @Test
  public void testForEquality_OneEmpty_ReturnsUnknown() {
    FakeJSType a = newFake();
    a.noType = true;
    FakeJSType b = newFake(); // ไม่ empty
    assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));
  }

  @Test
  public void testForEquality_FunctionType_MeetIsNoType_ReturnsFalse() {
    FakeJSType a = newFake();
    a.functionType = true;
    FakeJSType b = newFake();
    b.greatestSubtypeOverride = registry.getNativeType(JSTypeNative.NO_TYPE);
    assertEquals(TernaryValue.FALSE, a.testForEquality(b));
  }

  @Test
  public void testForEquality_FunctionType_MeetOther_ReturnsUnknown() {
    FakeJSType a = newFake();
    a.functionType = true;
    FakeJSType b = newFake();
    // meet ไม่ใช่ NoType/NoObjectType -> UNKNOWN
    b.greatestSubtypeOverride = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));
  }

  @Test
  public void testForEquality_EnumElementType_TriggersDelegateBranch() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    b.enumElementType = true;
    // เข้าเงื่อนไข bType.isEnumElementType() แล้ว delegate เป็น b.testForEquality(a)
    // (ตามซอร์ส สุดท้ายอาจ return null เพราะ a ไม่มี flag พิเศษใด ๆ ต่อ)
    TernaryValue result = a.testForEquality(b);
    // แค่ยืนยันว่า branch delegate ถูกเข้าจริง (ไม่ throw) - ค่า null ตรงกับ source ปัจจุบัน
    assertNull(result);
  }

  @Test
  public void testForEquality_UnionTypeFlag_TriggersDelegateBranch() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    b.unionType = true;
    TernaryValue result = a.testForEquality(b);
    assertNull(result);
  }

  /**
   * กรณีทั่วไปที่ไม่เข้าเงื่อนไขพิเศษใด ๆ เลย (ไม่ unknown/all/noResolved/empty/function/enum/union)
   * ตามซอร์สโค้ดจริง โค้ดจะตกไปที่ "return null;" ที่บรรทัดสุดท้ายของ testForEqualityHelper
   * ซึ่งเป็นจุดที่น่าสงสัยว่าเป็นต้นเหตุของ NPE (Closure-82) เมื่อถูกเรียกผ่าน canTestForEqualityWith
   */
  @Test
  public void testForEquality_DefaultCase_ReturnsNull() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    assertNull(a.testForEquality(b));
  }

  @Test(expected = NullPointerException.class)
  public void canTestForEqualityWith_DefaultCase_ThrowsNPE_DueToNullTestForEquality() {
    // เอกสารข้อบกพร่อง: testForEquality คืน null แล้ว .equals(UNKNOWN) จะ NPE
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    a.canTestForEqualityWith(b);
  }

  @Test
  public void canTestForEqualityWith_ControlledOverride() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();

    a.ternaryOverride = TernaryValue.UNKNOWN;
    assertTrue(a.canTestForEqualityWith(b));

    a.ternaryOverride = TernaryValue.TRUE;
    assertFalse(a.canTestForEqualityWith(b));

    a.ternaryOverride = TernaryValue.FALSE;
    assertFalse(a.canTestForEqualityWith(b));
  }

  // ---------------------------------------------------------------------
  // getTypesUnderEquality() / getTypesUnderInequality()
  // ---------------------------------------------------------------------
  @Test
  public void getTypesUnderEquality_Branches() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();

    a.ternaryOverride = TernaryValue.FALSE;
    JSType.TypePair p1 = a.getTypesUnderEquality(b);
    assertNull(p1.typeA);
    assertNull(p1.typeB);

    a.ternaryOverride = TernaryValue.TRUE;
    JSType.TypePair p2 = a.getTypesUnderEquality(b);
    assertSame(a, p2.typeA);
    assertSame(b, p2.typeB);

    a.ternaryOverride = TernaryValue.UNKNOWN;
    JSType.TypePair p3 = a.getTypesUnderEquality(b);
    assertSame(a, p3.typeA);
    assertSame(b, p3.typeB);
  }

  @Test
  public void getTypesUnderInequality_Branches() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();

    a.ternaryOverride = TernaryValue.TRUE;
    JSType.TypePair p1 = a.getTypesUnderInequality(b);
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    assertSame(noType, p1.typeA);
    assertSame(noType, p1.typeB);

    a.ternaryOverride = TernaryValue.FALSE;
    JSType.TypePair p2 = a.getTypesUnderInequality(b);
    assertSame(a, p2.typeA);
    assertSame(b, p2.typeB);

    a.ternaryOverride = TernaryValue.UNKNOWN;
    JSType.TypePair p3 = a.getTypesUnderInequality(b);
    assertSame(a, p3.typeA);
    assertSame(b, p3.typeB);
  }

  // ---------------------------------------------------------------------
  // getTypesUnderShallowEquality() / getTypesUnderShallowInequality()
  // ---------------------------------------------------------------------
  @Test
  public void getTypesUnderShallowEquality_UsesGreatestSubtype() {
    FakeJSType a = newFake();
    JSType marker = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    a.greatestSubtypeOverride = marker;
    FakeJSType b = newFake();

    JSType.TypePair p = a.getTypesUnderShallowEquality(b);
    assertSame(marker, p.typeA);
    assertSame(marker, p.typeB);
  }

  @Test
  public void getTypesUnderShallowInequality_BothNull() {
    FakeJSType a = newFake();
    a.nullType = true;
    FakeJSType b = newFake();
    b.nullType = true;

    JSType.TypePair p = a.getTypesUnderShallowInequality(b);
    assertNull(p.typeA);
    assertNull(p.typeB);
  }

  @Test
  public void getTypesUnderShallowInequality_BothVoid() {
    FakeJSType a = newFake();
    a.voidType = true;
    FakeJSType b = newFake();
    b.voidType = true;

    JSType.TypePair p = a.getTypesUnderShallowInequality(b);
    assertNull(p.typeA);
    assertNull(p.typeB);
  }

  @Test
  public void getTypesUnderShallowInequality_MismatchFallsToElse() {
    FakeJSType a = newFake();
    a.nullType = true; // แต่ b ไม่ nullType -> ไม่เข้าเงื่อนไข && ทั้งคู่
    FakeJSType b = newFake();

    JSType.TypePair p = a.getTypesUnderShallowInequality(b);
    assertSame(a, p.typeA);
    assertSame(b, p.typeB);
  }

  // ---------------------------------------------------------------------
  // static isSubtype(JSType, JSType) helper
  // ---------------------------------------------------------------------
  @Test
  public void staticIsSubtype_ThatUnknown() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    b.unknownType = true;
    assertTrue(JSType.isSubtype(a, b));
  }

  @Test
  public void staticIsSubtype_Equivalent() {
    FakeJSType a = newFake();
    assertTrue(JSType.isSubtype(a, a));
  }

  @Test
  public void staticIsSubtype_ThatAllType() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    b.allType = true;
    assertTrue(JSType.isSubtype(a, b));
  }

  @Test
  public void staticIsSubtype_ThatIsRealUnionType_MatchOneAlternate() {
    FakeJSType a = newFake();
    a.subtype = true; // a.isSubtype(anything) == true
    JSType n = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType s = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType union = registry.createUnionType(n, s);
    assertTrue(JSType.isSubtype(a, union));
  }

  @Test
  public void staticIsSubtype_DefaultFalse() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    assertFalse(JSType.isSubtype(a, b));
  }

  // ---------------------------------------------------------------------
  // static getGreatestSubtype(JSType, JSType) helper
  // ---------------------------------------------------------------------
  @Test
  public void staticGetGreatestSubtype_Equivalent() {
    FakeJSType a = newFake();
    assertSame(a, JSType.getGreatestSubtype(a, a));
  }

  @Test
  public void staticGetGreatestSubtype_ThisUnknown() {
    FakeJSType a = newFake();
    a.unknownType = true;
    FakeJSType b = newFake();
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    assertSame(unknown, JSType.getGreatestSubtype(a, b));
  }

  @Test
  public void staticGetGreatestSubtype_ThatUnknown() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    b.unknownType = true;
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    assertSame(unknown, JSType.getGreatestSubtype(a, b));
  }

  @Test
  public void staticGetGreatestSubtype_ThisIsSubtype() {
    FakeJSType a = newFake();
    a.subtype = true;
    FakeJSType b = newFake();
    // filterNoResolvedType(a): a ไม่ noResolvedType -> คืน a เดิม
    assertSame(a, JSType.getGreatestSubtype(a, b));
  }

  @Test
  public void staticGetGreatestSubtype_ThisIsSubtype_ButNoResolved_FiltersToNoResolvedType() {
    FakeJSType a = newFake();
    a.subtype = true;
    a.noResolvedType = true;
    FakeJSType b = newFake();
    JSType noResolved = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
    assertSame(noResolved, JSType.getGreatestSubtype(a, b));
  }

  @Test
  public void staticGetGreatestSubtype_ThatIsSubtype() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    b.subtype = true; // a.subtype = false -> ไปตรวจ b.isSubtype(a)
    assertSame(b, JSType.getGreatestSubtype(a, b));
  }

  @Test
  public void staticGetGreatestSubtype_BothObject_FallsBackToNoObjectType() {
    FakeJSType a = newFake();
    a.object = true;
    FakeJSType b = newFake();
    b.object = true;
    JSType noObject = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    assertSame(noObject, JSType.getGreatestSubtype(a, b));
  }

  @Test
  public void staticGetGreatestSubtype_NeitherObject_FallsBackToNoType() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    assertSame(noType, JSType.getGreatestSubtype(a, b));
  }

  @Test
  public void staticGetGreatestSubtype_UnionTypeSmokeTest() {
    // ไม่ทราบ implementation ของ UnionType.meet(...) แน่ชัด (ไม่มีซอร์สให้)
    // จึงทำเพียง smoke test ว่าไม่ throw และผลลัพธ์ไม่เป็น null
    JSType n = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType s = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType union = registry.createUnionType(n, s);
    JSType bool = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    JSType result = JSType.getGreatestSubtype(union, bool);
    assertNotNull(result);
  }

  // ---------------------------------------------------------------------
  // instance getGreatestSubtype() - branch ของ isRecordType()
  // ---------------------------------------------------------------------
  @Test
  public void instanceGetGreatestSubtype_RecordTypeDelegatesToThat() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    b.recordType = true;
    JSType marker = registry.getNativeType(JSTypeNative.NO_TYPE);
    b.greatestSubtypeOverride = marker;

    assertSame(marker, a.getGreatestSubtype(b));
  }

  // ---------------------------------------------------------------------
  // getLeastSupertype() (instance)
  // ---------------------------------------------------------------------
  @Test
  public void getLeastSupertype_EquivalentReturnsSameInstance() {
    FakeJSType a = newFake();
    assertSame(a, a.getLeastSupertype(a));
  }

  @Test
  public void getLeastSupertype_NotEquivalent_ReturnsNonNull() {
    FakeJSType a = newFake();
    FakeJSType b = newFake();
    JSType result = a.getLeastSupertype(b);
    assertNotNull(result);
  }

  @Test
  public void getLeastSupertype_ThatIsUnionType_DelegatesSmokeTest() {
    FakeJSType a = newFake();
    JSType n = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType s = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType union = registry.createUnionType(n, s);
    // ไม่ทราบ union.getLeastSupertype ภายในแน่ชัด, ทำ smoke test
    JSType result = a.getLeastSupertype(union);
    assertNotNull(result);
  }

  // ---------------------------------------------------------------------
  // filterNoResolvedType(JSType)
  // ---------------------------------------------------------------------
  @Test
  public void filterNoResolvedType_NoResolvedInput() {
    FakeJSType a = newFake();
    a.noResolvedType = true;
    JSType noResolved = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
    assertSame(noResolved, JSType.filterNoResolvedType(a));
  }

  @Test
  public void filterNoResolvedType_PlainTypeUnchanged() {
    FakeJSType a = newFake();
    assertSame(a, JSType.filterNoResolvedType(a));
  }

  @Test
  public void filterNoResolvedType_UnionWithoutNoResolved_Unchanged() {
    JSType n = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType s = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType union = registry.createUnionType(n, s);
    assertSame(union, JSType.filterNoResolvedType(union));
  }

  // ---------------------------------------------------------------------
  // resolve() / forceResolve() / isResolved() / clearResolved()
  // ---------------------------------------------------------------------
  @Test
  public void resolve_CachesResult_CallsResolveInternalOnce() {
    FakeJSType a = newFake();
    JSType r1 = a.resolve(null, null);
    JSType r2 = a.resolve(null, null);
    assertSame(r1, r2);
    assertEquals(1, a.resolveCount);
    assertTrue(a.isResolved());
  }

  @Test
  public void resolve_ResolvedButNullResult_ReturnsUnknownType() {
    FakeJSType a = newFake();
    a.setResolvedTypeInternal(null); // resolved=true, resolveResult=null
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    assertSame(unknown, a.resolve(null, null));
  }

  @Test
  public void forceResolve_RestoresOriginalResolveMode() {
    FakeJSType a = newFake();
    JSTypeRegistry.ResolveMode before = registry.getResolveMode();
    a.forceResolve(null, null);
    assertEquals(before, registry.getResolveMode());
    assertTrue(a.isResolved());
  }

  @Test
  public void isResolvedAndClearResolved() {
    FakeJSType a = newFake();
    assertFalse(a.isResolved());
    a.resolve(null, null);
    assertTrue(a.isResolved());
    a.clearResolved();
    assertFalse(a.isResolved());
    // เรียก resolve อีกครั้งหลัง clear ต้องเรียก resolveInternal ใหม่
    a.resolve(null, null);
    assertEquals(2, a.resolveCount);
  }

  // ---------------------------------------------------------------------
  // setValidator()
  // ---------------------------------------------------------------------
  @Test
  public void setValidator_TrueAndFalse() {
    FakeJSType a = newFake();
    Predicate<JSType> alwaysTrue = new Predicate<JSType>() {
      @Override public boolean apply(JSType input) { return true; }
    };
    Predicate<JSType> alwaysFalse = new Predicate<JSType>() {
      @Override public boolean apply(JSType input) { return false; }
    };
    assertTrue(a.setValidator(alwaysTrue));
    assertFalse(a.setValidator(alwaysFalse));
  }

  // ---------------------------------------------------------------------
  // toDebugHashCodeString() (smoke test)
  // ---------------------------------------------------------------------
  @Test
  public void toDebugHashCodeString_ContainsHashCode() {
    FakeJSType a = newFake();
    String s = a.toDebugHashCodeString();
    assertTrue(s.contains(String.valueOf(a.hashCode())));
  }

  // ---------------------------------------------------------------------
  // forgiveUnknownNames() (no-op, ทดสอบว่าไม่ throw)
  // ---------------------------------------------------------------------
  @Test
  public void forgiveUnknownNames_NoException() {
    FakeJSType a = newFake();
    a.forgiveUnknownNames();
  }
}
```

## ตารางสรุป Test method → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `hasDisplayName_*` | `displayName != null && !isEmpty()` (null / empty / non-empty) |
| `isEmptyType_Branches` | `isNoType()`/`isNoObjectType()`/`isNoResolvedType()`/ทั้งหมด false |
| `isEquivalentTo_*` | identity check ใน `isEquivalentTo` |
| `isEquivalentStatic_AllBranches` | null/null, null/non-null (ทั้งสองด้าน), non-null equal/ไม่ equal |
| `equalsObject_Branches` | `instanceof JSType` true/false |
| `hashCode_MatchesIdentityHashCode` | ตรวจ `System.identityHashCode` |
| `differsFrom_*` | ทั้ง 2 branch: equivalence check และ xor ของ unknown |
| `canAssignTo_True/False` | `isSubtype()` true/false |
| `toObjectType_*` | `this instanceof ObjectType` true/false |
| `findPropertyType_*` | `autoboxObjType != null` true/false |
| `dereference_*` | autobox null/non-null |
| `isNullable_*` | delegate ผ่าน `isSubtype` |
| `matchesInt32AndUint32Context_*` | delegate ผ่าน `matchesNumberContext` |
| `isNumber_RealNumberType`, `isString_RealStringType` | ทดสอบด้วย native type จริง |
| `canTestForShallowEqualityWith_Combinations` | OR ของ `isSubtype` สองทาง |
| `testForEquality_UnknownAllOrNoResolved_ReturnsUnknown` | branch แรกของ `testForEqualityHelper` (a/b unknown/all/noResolved) |
| `testForEquality_BothEmpty_ReturnsTrue` / `OneEmpty_ReturnsUnknown` | branch `aIsEmpty/bIsEmpty` |
| `testForEquality_FunctionType_*` | branch function-type, meet=NoType/Other |
| `testForEquality_EnumElementType_*`, `UnionTypeFlag_*` | branch `bType.isEnumElementType()||isUnionType()` |
| `testForEquality_DefaultCase_ReturnsNull` | branch สุดท้าย `return null;` (จุดสงสัยบั๊ก) |
| `canTestForEqualityWith_DefaultCase_ThrowsNPE_*` | ดักจับข้อบกพร่องจริงจาก `return null` |
| `canTestForEqualityWith_ControlledOverride` | UNKNOWN/TRUE/FALSE ของ `canTestForEqualityWith` |
| `getTypesUnderEquality_Branches` | switch FALSE/TRUE/UNKNOWN |
| `getTypesUnderInequality_Branches` | switch TRUE/FALSE/UNKNOWN |
| `getTypesUnderShallowEquality_*` | ใช้ `getGreatestSubtype` |
| `getTypesUnderShallowInequality_*` | null&&null, void&&void, mismatch→else |
| `staticIsSubtype_*` | unknown, equivalent, allType, union-match, default false |
| `staticGetGreatestSubtype_*` | equivalent, this/that unknown, this/that subtype (+ filterNoResolvedType), both object, neither object, union smoke |
| `instanceGetGreatestSubtype_RecordTypeDelegatesToThat` | `that.isRecordType()` true |
| `getLeastSupertype_*` | equivalent, ไม่ equivalent, that เป็น UnionType |
| `filterNoResolvedType_*` | noResolvedType true, plain, union ไม่ต้อง filter |
| `resolve_CachesResult_*` | resolved flag caching, เรียก resolveInternal ครั้งเดียว |
| `resolve_ResolvedButNullResult_*` | branch `resolveResult == null` |
| `forceResolve_RestoresOriginalResolveMode` | save/restore ResolveMode |
| `isResolvedAndClearResolved` | `clearResolved()` reset flag |
| `setValidator_TrueAndFalse` | `validator.apply(this)` true/false |
| `toDebugHashCodeString_*`, `forgiveUnknownNames_*` | smoke test เมธอด trivial |