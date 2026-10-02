package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Unit test สำหรับ {@link UnionType} (Defects4J Closure-104b)
 *
 * วางอยู่ใน package เดียวกับคลาสเป้าหมายเพื่อเข้าถึง constructor
 * และเมธอด package-private ({@code meet}) ได้โดยตรง (white-box test)
 */
public class UnionTypeTest {

  private JSTypeRegistry registry;

  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType nullType;
  private JSType voidType;
  private JSType objectType;
  private JSType unknownType;
  private JSType noType;
  private JSType noObjectType;

  @Before
  public void setUp() {
    // สมมติฐาน: ErrorReporter มีเมธอดตามรูปแบบมาตรฐานของ Rhino/Closure
    ErrorReporter reporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line,
          String lineSource, int lineOffset) {
      }

      @Override
      public void error(String message, String sourceName, int line,
          String lineSource, int lineOffset) {
      }
    };
    registry = new JSTypeRegistry(reporter);

    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
  }

  /** ใช้ LinkedHashSet เพื่อควบคุม "ลำดับการ iterate" ให้ deterministic */
  private UnionType union(JSType... types) {
    Set<JSType> set = new LinkedHashSet<JSType>();
    for (JSType t : types) {
      set.add(t);
    }
    return new UnionType(registry, set);
  }

  // ---------------------------------------------------------------------
  // getAlternates()
  // ---------------------------------------------------------------------

  @Test
  public void testGetAlternates_containsAllGivenTypes() {
    UnionType u = union(numberType, stringType);
    Set<JSType> result = new HashSet<JSType>();
    for (JSType t : u.getAlternates()) {
      result.add(t);
    }
    assertEquals(2, result.size());
    assertTrue(result.contains(numberType));
    assertTrue(result.contains(stringType));
  }

  @Test
  public void testGetAlternates_emptyUnion_returnsEmptyIterable() {
    UnionType u = union(); // boundary: union ว่าง
    int count = 0;
    for (JSType t : u.getAlternates()) {
      count++;
    }
    assertEquals(0, count);
  }

  // ---------------------------------------------------------------------
  // forgiveUnknownNames() - smoke test เท่านั้น
  // (ไม่สามารถสังเกต side-effect ภายในของ JSType อื่นได้จากซอร์สที่ให้มา)
  // ---------------------------------------------------------------------

  @Test
  public void testForgiveUnknownNames_doesNotThrow() {
    UnionType u = union(numberType, stringType);
    u.forgiveUnknownNames();
  }

  // ---------------------------------------------------------------------
  // matchesNumberContext() - self-consistency (ไม่ทราบค่า literal จริง)
  // ---------------------------------------------------------------------

  @Test
  public void testMatchesNumberContext_singleAlternate_selfConsistent() {
    UnionType u = union(numberType);
    boolean expected = numberType.matchesNumberContext();
    assertEquals(expected, u.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_emptyUnion_isFalse() {
    // โครงสร้าง: ไม่มี alternate ให้ loop จึงคืนค่า false เสมอ (แน่นอนจากโค้ด)
    UnionType u = union();
    assertFalse(u.matchesNumberContext());
  }

  // ---------------------------------------------------------------------
  // matchesStringContext() - อิง Javadoc ของซอร์ส: "true if not VoidType"
  // ---------------------------------------------------------------------

  @Test
  public void testMatchesStringContext_emptyUnion_isFalse() {
    UnionType u = union();
    assertFalse(u.matchesStringContext());
  }

  @Test
  public void testMatchesStringContext_anyTrueAlternate_isTrue() {
    // สมมติฐาน (จาก Javadoc): numberType ไม่ใช่ VoidType -> matchesStringContext() = true
    UnionType u = union(voidType, numberType);
    boolean fromNumber = numberType.matchesStringContext();
    boolean expected = voidType.matchesStringContext() || fromNumber;
    assertEquals(expected, u.matchesStringContext());
  }

  // ---------------------------------------------------------------------
  // matchesObjectContext() - อิง Javadoc: "true if not NullType or VoidType"
  // ---------------------------------------------------------------------

  @Test
  public void testMatchesObjectContext_emptyUnion_isFalse() {
    UnionType u = union();
    assertFalse(u.matchesObjectContext());
  }

  @Test
  public void testMatchesObjectContext_orLogic_selfConsistent() {
    UnionType u = union(nullType, objectType);
    boolean expected = nullType.matchesObjectContext()
        || objectType.matchesObjectContext();
    assertEquals(expected, u.matchesObjectContext());
  }

  // ---------------------------------------------------------------------
  // findPropertyType() - ใช้พฤติกรรม "skip null/void" ที่ยืนยันได้จากซอร์สจริง
  // ---------------------------------------------------------------------

  @Test
  public void testFindPropertyType_skipsNullAndVoidAlternates_returnsNull() {
    // isNullType()/isVoidType() ของ nullType/voidType ต้องเป็น true ตามนิยาม
    UnionType u = union(nullType, voidType);
    assertNull(u.findPropertyType("anyProperty"));
  }

  @Test
  public void testFindPropertyType_noMatchingProperty_returnsNull() {
    UnionType u = union(numberType, stringType);
    // สมมติฐาน: ชื่อพร็อพเพอร์ตี้ที่สุ่มขึ้นไม่มีอยู่จริงบนชนิดพื้นฐานเหล่านี้
    assertNull(u.findPropertyType("__no_such_property_xyz__"));
  }

  @Test
  public void testFindPropertyType_emptyPropertyName() {
    UnionType u = union(numberType);
    // ค่าขอบเขต: property name เป็น empty string
    assertNull(u.findPropertyType(""));
  }

  // ---------------------------------------------------------------------
  // canAssignTo()
  // ---------------------------------------------------------------------

  @Test
  public void testCanAssignTo_emptyUnion_returnsTrue() {
    // โครงสร้าง: canAssign เริ่มต้น true และไม่มี alternate ให้ loop
    UnionType u = union();
    assertTrue(u.canAssignTo(numberType));
  }

  @Test
  public void testCanAssignTo_unknownAlternate_shortCircuitsTrue() {
    // unknownType.isUnknownType() ต้องเป็น true ตามนิยาม -> return true ทันที
    UnionType u = union(unknownType, numberType);
    assertTrue(u.canAssignTo(stringType));
  }

  @Test
  public void testCanAssignTo_nonUnknownAlternate_selfConsistent() {
    UnionType u = union(numberType);
    boolean expected = numberType.canAssignTo(stringType);
    assertEquals(expected, u.canAssignTo(stringType));
  }

  // ---------------------------------------------------------------------
  // canBeCalled()
  // ---------------------------------------------------------------------

  @Test
  public void testCanBeCalled_emptyUnion_returnsTrue() {
    UnionType u = union();
    assertTrue(u.canBeCalled());
  }

  @Test
  public void testCanBeCalled_nonCallableAlternate_returnsFalse() {
    // สมมติฐาน: NumberType ไม่สามารถถูกเรียกใช้งานเป็นฟังก์ชันได้
    UnionType u = union(numberType);
    assertFalse(u.canBeCalled());
  }

  // ---------------------------------------------------------------------
  // testForEquality()
  // ---------------------------------------------------------------------

  @Test
  public void testTestForEquality_emptyUnion_returnsNull() {
    UnionType u = union();
    assertNull(u.testForEquality(numberType));
  }

  @Test
  public void testTestForEquality_singleAlternate_selfConsistent() {
    UnionType u = union(numberType);
    TernaryValue expected = numberType.testForEquality(stringType);
    assertEquals(expected, u.testForEquality(stringType));
  }

  @Test
  public void testTestForEquality_differentResults_returnsUnknown() {
    TernaryValue fromNull = nullType.testForEquality(voidType);
    TernaryValue fromNumber = numberType.testForEquality(voidType);
    // sanity check ของสมมติฐาน JS semantics (null==undefined true, number==undefined false)
    assertFalse(fromNull.equals(fromNumber));

    UnionType u = union(nullType, numberType);
    assertEquals(TernaryValue.UNKNOWN, u.testForEquality(voidType));
  }

  @Test
  public void testTestForEquality_sameResults_continuesLoop() {
    TernaryValue fromNumber = numberType.testForEquality(voidType);
    TernaryValue fromBoolean = booleanType.testForEquality(voidType);
    // sanity check ของสมมติฐาน: number==undefined และ boolean==undefined ให้ผลเท่ากัน (false)
    assertEquals(fromNumber, fromBoolean);

    UnionType u = union(numberType, booleanType);
    assertEquals(fromNumber, u.testForEquality(voidType));
  }

  // ---------------------------------------------------------------------
  // isNullable() - อิง Javadoc: "true for everything but Number and Boolean"
  // ---------------------------------------------------------------------

  @Test
  public void testIsNullable_onlyNonNullableAlternates_isFalse() {
    UnionType u = union(numberType, booleanType);
    assertFalse(u.isNullable());
  }

  @Test
  public void testIsNullable_containsNullableAlternate_isTrue() {
    UnionType u = union(numberType, stringType);
    assertTrue(u.isNullable());
  }

  @Test
  public void testIsNullable_emptyUnion_isFalse() {
    UnionType u = union();
    assertFalse(u.isNullable());
  }

  // ---------------------------------------------------------------------
  // isUnknownType()
  // ---------------------------------------------------------------------

  @Test
  public void testIsUnknownType_noneUnknown_isFalse() {
    UnionType u = union(numberType, stringType);
    assertFalse(u.isUnknownType());
  }

  @Test
  public void testIsUnknownType_containsUnknown_isTrue() {
    UnionType u = union(numberType, unknownType);
    assertTrue(u.isUnknownType());
  }

  // ---------------------------------------------------------------------
  // getLeastSupertype()
  // ---------------------------------------------------------------------

  @Test
  public void testGetLeastSupertype_thatIsUnknown_skipsLoop() {
    UnionType u = union(numberType);
    // ครอบคลุม branch: !that.isUnknownType() == false -> ข้าม for-loop ไปเรียก static overload
    assertNotNull(u.getLeastSupertype(unknownType));
  }

  @Test
  public void testGetLeastSupertype_matchFound_returnsSameInstance() {
    // สมมติฐาน: objectType.isSubtype(objectType) เป็น true (reflexive)
    UnionType u = union(numberType, objectType);
    JSType result = u.getLeastSupertype(objectType);
    assertSame(u, result);
  }

  @Test
  public void testGetLeastSupertype_noMatch_fallsThroughToStaticCall() {
    // สมมติฐาน: stringType ไม่ใช่ subtype ของ numberType
    UnionType u = union(numberType);
    assertNotNull(u.getLeastSupertype(stringType));
  }

  // ---------------------------------------------------------------------
  // meet() - package-private, เข้าถึงได้เพราะอยู่ package เดียวกัน
  // ---------------------------------------------------------------------

  @Test
  public void testMeet_withUnionArgument_smoke() {
    UnionType u1 = union(numberType, stringType);
    UnionType u2 = union(numberType);
    // ครอบคลุม branch: (that instanceof UnionType) == true
    assertNotNull(u1.meet(u2));
  }

  @Test
  public void testMeet_withNonUnionArgument_noOverlap_returnsNoType() {
    // สมมติฐาน: numberType.isObject() = false, stringType.isSubtype(union(numberType)) = false
    UnionType u = union(numberType);
    JSType result = u.meet(stringType);
    assertSame(noType, result);
  }

  @Test
  public void testMeet_firstLoopReflexiveMatch_returnsNonNullResult() {
    // สมมติฐาน: numberType.isSubtype(numberType) = true (reflexive)
    // และ UnionTypeBuilder ยุบ alternate เดียวเหลือ plain type (ธรรมเนียมของโค้ดชุดนี้)
    UnionType u = union(numberType);
    JSType result = u.meet(numberType);
    assertEquals(numberType, result);
  }

  // ---------------------------------------------------------------------
  // equals() / hashCode()
  // ---------------------------------------------------------------------

  @Test
  public void testEquals_sameAlternates_isEqual() {
    UnionType u1 = union(numberType, stringType);
    UnionType u2 = union(stringType, numberType);
    assertTrue(u1.equals(u2));
    assertEquals(u1.hashCode(), u2.hashCode());
  }

  @Test
  public void testEquals_differentAlternates_isNotEqual() {
    UnionType u1 = union(numberType, stringType);
    UnionType u2 = union(numberType, booleanType);
    assertFalse(u1.equals(u2));
  }

  @Test
  public void testEquals_withNonUnionTypeObject_isFalse() {
    UnionType u = union(numberType);
    assertFalse(u.equals("not a union type"));
  }

  @Test
  public void testEquals_withNull_isFalse() {
    UnionType u = union(numberType);
    assertFalse(u.equals(null)); // ค่า null boundary
  }

  // ---------------------------------------------------------------------
  // isUnionType()
  // ---------------------------------------------------------------------

  @Test
  public void testIsUnionType_alwaysTrue() {
    UnionType u = union();
    assertTrue(u.isUnionType());
  }

  // ---------------------------------------------------------------------
  // isObject()
  // ---------------------------------------------------------------------

  @Test
  public void testIsObject_allAlternatesAreObjects_isTrue() {
    UnionType u = union(objectType);
    assertTrue(u.isObject());
  }

  @Test
  public void testIsObject_oneAlternateNotObject_isFalse() {
    UnionType u = union(objectType, numberType);
    assertFalse(u.isObject());
  }

  @Test
  public void testIsObject_emptyUnion_isTrue() {
    // โครงสร้าง: loop ไม่พบตัวที่ไม่ใช่ object -> คืน true (แน่นอนจากโค้ด)
    UnionType u = union();
    assertTrue(u.isObject());
  }

  // ---------------------------------------------------------------------
  // contains()
  // ---------------------------------------------------------------------

  @Test
  public void testContains_existingAlternate_isTrue() {
    UnionType u = union(numberType, stringType);
    assertTrue(u.contains(numberType));
  }

  @Test
  public void testContains_nonExistingAlternate_isFalse() {
    UnionType u = union(numberType);
    assertFalse(u.contains(stringType));
  }

  @Test
  public void testContains_null_isFalse() {
    UnionType u = union(numberType);
    assertFalse(u.contains(null));
  }

  // ---------------------------------------------------------------------
  // getRestrictedUnion()
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedUnion_unknownAlternateAlwaysKept() {
    UnionType u = union(unknownType);
    JSType result = u.getRestrictedUnion(numberType);
    assertNotNull(result);
    assertTrue(result.isUnknownType());
  }

  @Test
  public void testGetRestrictedUnion_subtypeRemoved_resultIsNull() {
    // สมมติฐาน: numberType.isSubtype(numberType) = true (reflexive)
    // และ UnionTypeBuilder.build() คืน null เมื่อไม่มี alternate เหลือเลย
    UnionType u = union(numberType);
    JSType result = u.getRestrictedUnion(numberType);
    assertNull(result);
  }

  // ---------------------------------------------------------------------
  // toString() - ตรวจโครงสร้าง ไม่ตรวจ literal string ของ alternate
  // ---------------------------------------------------------------------

  @Test
  public void testToString_emptyUnion() {
    UnionType u = union();
    assertEquals("()", u.toString());
  }

  @Test
  public void testToString_singleAlternate() {
    UnionType u = union(numberType);
    assertEquals("(" + numberType.toString() + ")", u.toString());
  }

  @Test
  public void testToString_multipleAlternates_containsSeparatorAndBothTypes() {
    UnionType u = union(numberType, stringType);
    String result = u.toString();
    assertTrue(result.startsWith("("));
    assertTrue(result.endsWith(")"));
    assertTrue(result.contains("|"));
    assertTrue(result.contains(numberType.toString()));
    assertTrue(result.contains(stringType.toString()));
  }

  // ---------------------------------------------------------------------
  // isSubtype()
  // ---------------------------------------------------------------------

  @Test
  public void testIsSubtype_emptyUnion_isTrue() {
    // โครงสร้าง: loop ว่าง -> คืน true เสมอ (vacuous truth)
    UnionType u = union();
    assertTrue(u.isSubtype(numberType));
  }

  @Test
  public void testIsSubtype_allElementsSubtype_isTrue() {
    // สมมติฐาน: reflexive subtype
    UnionType u = union(numberType);
    assertTrue(u.isSubtype(numberType));
  }

  @Test
  public void testIsSubtype_someElementNotSubtype_isFalse() {
    // สมมติฐาน: stringType ไม่ใช่ subtype ของ numberType
    UnionType u = union(numberType, stringType);
    assertFalse(u.isSubtype(numberType));
  }

  // ---------------------------------------------------------------------
  // getPossibleToBooleanOutcomes()
  // ---------------------------------------------------------------------

  @Test
  public void testGetPossibleToBooleanOutcomes_emptyUnion_returnsEmpty() {
    // โครงสร้าง: literals เริ่มต้นที่ EMPTY และไม่มี alternate ให้ loop
    UnionType u = union();
    assertEquals(BooleanLiteralSet.EMPTY, u.getPossibleToBooleanOutcomes());
  }

  @Test
  public void testGetPossibleToBooleanOutcomes_bothBreaksLoopEarly() {
    // สมมติฐาน: booleanType ให้ผลลัพธ์ BOTH (ค่า boolean เป็นได้ทั้ง true/false)
    // ลำดับ insertion (LinkedHashSet): booleanType ก่อน numberType
    // -> ควรกระตุ้นเส้นทาง break ใน source
    UnionType u = union(booleanType, numberType);
    assertEquals(BooleanLiteralSet.BOTH, u.getPossibleToBooleanOutcomes());
  }

  // ---------------------------------------------------------------------
  // getRestrictedTypeGivenToBooleanOutcome() - smoke test
  // ---------------------------------------------------------------------

  @Test
  public void testGetRestrictedTypeGivenToBooleanOutcome_trueOutcome_noException() {
    UnionType u = union(numberType, stringType);
    JSType result = u.getRestrictedTypeGivenToBooleanOutcome(true);
    // ไม่ทราบพฤติกรรมภายในของแต่ละชนิดข้อมูลจากซอร์สที่ให้มา จึงตรวจแค่ไม่ throw exception
    // result อาจเป็น null ได้ตามโครงสร้างของ UnionTypeBuilder
    if (result != null) {
      assertNotNull(result.toString());
    }
  }

  @Test
  public void testGetRestrictedTypeGivenToBooleanOutcome_falseOutcome_noException() {
    UnionType u = union(numberType, stringType);
    u.getRestrictedTypeGivenToBooleanOutcome(false);
  }

  // ---------------------------------------------------------------------
  // restrictByNotNullOrUndefined() - smoke test
  // ---------------------------------------------------------------------

  @Test
  public void testRestrictByNotNullOrUndefined_noException() {
    UnionType u = union(nullType, voidType, numberType);
    u.restrictByNotNullOrUndefined();
  }

  // ---------------------------------------------------------------------
  // getTypesUnderEquality / Inequality / ShallowInequality - smoke test
  // (ไม่ทราบพฤติกรรมภายในของ JSType.getTypesUnder* สำหรับแต่ละชนิดข้อมูล)
  // ---------------------------------------------------------------------

  @Test
  public void testGetTypesUnderEquality_returnsNonNullTypePair() {
    UnionType u = union(numberType, stringType);
    TypePair p = u.getTypesUnderEquality(numberType);
    assertNotNull(p);
  }

  @Test
  public void testGetTypesUnderInequality_returnsNonNullTypePair() {
    UnionType u = union(numberType, stringType);
    TypePair p = u.getTypesUnderInequality(numberType);
    assertNotNull(p);
  }

  @Test
  public void testGetTypesUnderShallowInequality_returnsNonNullTypePair() {
    UnionType u = union(numberType, stringType);
    TypePair p = u.getTypesUnderShallowInequality(numberType);
    assertNotNull(p);
  }
}
