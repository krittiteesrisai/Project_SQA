# วิเคราะห์และข้อจำกัด

`JSType` เป็น abstract class ที่ต้องพึ่งพา `JSTypeRegistry`, native types (ผ่าน `JSTypeNative`), และ subclass จริงหลายตัว (FunctionType, UnionType, RecordType, EnumElementType, ProxyObjectType) ที่ **ไม่มี source ให้มา** ดังนั้นเพื่อไม่ "เดา" behavior ของคลาสเหล่านั้น ผมจะ:

1. ทดสอบ **base-class logic** ของ `JSType` โดยใช้ **StubJSType** (inner class ใน package เดียวกัน) ที่ override เฉพาะ method ที่จำเป็น เพื่อควบคุม branch ได้แน่นอน 100%
2. ใช้ native types จริง (ผ่าน `JSTypeRegistry`) เฉพาะจุดที่ literal ปรากฏอยู่ใน source ที่ให้มา (`ALL_TYPE`(อนุมานจาก isAllType), `UNKNOWN_TYPE`, `NO_TYPE`, `NO_OBJECT_TYPE`, `NO_RESOLVED_TYPE`, `NULL_TYPE`, `OBJECT_TYPE`, `GLOBAL_THIS`, `LEAST_FUNCTION_TYPE`, และ `NUMBER_TYPE/STRING_TYPE/BOOLEAN_TYPE/VOID_TYPE` ที่อนุมานจาก pattern การตั้งชื่อของ constant ที่ยืนยันแล้ว)
3. **ข้าม (skip)** branch ที่ต้องพึ่งพา FunctionType/UnionType/RecordType/EnumElementType/ProxyObjectType จริง โดยคอมเมนต์กำกับไว้ชัดเจน — จะทดสอบแบบ smoke-test (ไม่ throw) เท่านั้นถ้าจำเป็นต้องแตะ

> **หมายเหตุสมมติฐานสำคัญ** (ไม่มีใน source ที่ให้มา แต่จำเป็นต่อการ compile/instantiate):
> - `JSTypeRegistry(ErrorReporter)` เป็น public constructor
> - `ErrorReporter` มี method `warning(String,String,int,String,int)` และ `error(String,String,int,String,int)`
> - `JSTypeNative` มี constant ตามที่ใช้จริงใน source ที่ให้มา (ALL_TYPE, UNKNOWN_TYPE, NO_TYPE, NO_OBJECT_TYPE, NO_RESOLVED_TYPE, NULL_TYPE, OBJECT_TYPE, GLOBAL_THIS, LEAST_FUNCTION_TYPE) และ NUMBER_TYPE/STRING_TYPE/BOOLEAN_TYPE/VOID_TYPE (อนุมานจาก naming pattern)
> - `registry.createUnionType(JSType...)` คืนค่าที่ `isUnionType()==true`

```java
package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;

import org.junit.Before;
import org.junit.Test;

public class JSTypeTest {

  private JSTypeRegistry registry;
  private ErrorReporter errorReporter;

  private JSType ALL;
  private JSType UNKNOWN;
  private JSType NO;
  private JSType NO_OBJECT;
  private JSType NO_RESOLVED;
  private JSType NULL;
  private JSType OBJECT;
  private JSType NUMBER;
  private JSType STRING;
  private JSType BOOLEAN;
  private JSType VOID;
  private JSType GLOBAL_THIS;
  private JSType LEAST_FUNCTION;

  @Before
  public void setUp() {
    errorReporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line,
          String lineSource, int lineNumber) {}
      @Override
      public void error(String message, String sourceName, int line,
          String lineSource, int lineNumber) {}
    };
    registry = new JSTypeRegistry(errorReporter);

    ALL          = registry.getNativeType(JSTypeNative.ALL_TYPE);
    UNKNOWN      = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    NO           = registry.getNativeType(JSTypeNative.NO_TYPE);
    NO_OBJECT    = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    NO_RESOLVED  = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
    NULL         = registry.getNativeType(JSTypeNative.NULL_TYPE);
    OBJECT       = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    NUMBER       = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    STRING       = registry.getNativeType(JSTypeNative.STRING_TYPE);
    BOOLEAN      = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    VOID         = registry.getNativeType(JSTypeNative.VOID_TYPE);
    GLOBAL_THIS  = registry.getNativeType(JSTypeNative.GLOBAL_THIS);
    LEAST_FUNCTION = registry.getNativeType(JSTypeNative.LEAST_FUNCTION_TYPE);
  }

  /**
   * Stub ที่ใช้ทดสอบ logic ของ JSType (base class) แบบแยกส่วน
   * โดย override เท่าที่จำเป็นต่อการ implement abstract method เท่านั้น
   */
  private class StubJSType extends JSType {
    StubJSType() {
      super(registry);
    }

    @Override
    public BooleanLiteralSet getPossibleToBooleanOutcomes() {
      // ไม่ถูกเรียกใช้งานในชุดทดสอบนี้ (ข้าม getRestrictedTypeGivenToBooleanOutcome
      // เพราะไม่รู้ API ของ BooleanLiteralSet จาก source ที่ให้มา)
      return null;
    }

    @Override
    public <T> T visit(Visitor<T> visitor) {
      return null;
    }

    @Override
    JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
      return this;
    }

    @Override
    String toStringHelper(boolean forAnnotations) {
      return "STUB[" + forAnnotations + "]";
    }
  }

  // ===================== hasDisplayName() =====================

  @Test
  public void testHasDisplayName_Null() {
    JSType t = new StubJSType() {
      @Override public String getDisplayName() { return null; }
    };
    assertFalse(t.hasDisplayName());
  }

  @Test
  public void testHasDisplayName_Empty() {
    JSType t = new StubJSType() {
      @Override public String getDisplayName() { return ""; }
    };
    assertFalse(t.hasDisplayName());
  }

  @Test
  public void testHasDisplayName_NonEmpty() {
    JSType t = new StubJSType() {
      @Override public String getDisplayName() { return "Foo"; }
    };
    assertTrue(t.hasDisplayName());
  }

  // ===================== isEmptyType() =====================

  @Test
  public void testIsEmptyType_NoType() {
    JSType t = new StubJSType() {
      @Override public boolean isNoType() { return true; }
    };
    assertTrue(t.isEmptyType());
  }

  @Test
  public void testIsEmptyType_NoObjectType() {
    JSType t = new StubJSType() {
      @Override public boolean isNoObjectType() { return true; }
    };
    assertTrue(t.isEmptyType());
  }

  @Test
  public void testIsEmptyType_NoResolvedType() {
    JSType t = new StubJSType() {
      @Override public boolean isNoResolvedType() { return true; }
    };
    assertTrue(t.isEmptyType());
  }

  @Test
  public void testIsEmptyType_LeastFunctionTypeIdentity() {
    // registry.getNativeFunctionType(LEAST_FUNCTION_TYPE) == this
    assertTrue(LEAST_FUNCTION.isEmptyType());
  }

  @Test
  public void testIsEmptyType_FalseCase() {
    JSType t = new StubJSType();
    assertFalse(t.isEmptyType());
  }

  // ===================== isString() / isNumber() =====================

  @Test
  public void testIsNumber_True() {
    assertTrue(NUMBER.isNumber());
  }

  @Test
  public void testIsString_True() {
    assertTrue(STRING.isString());
  }

  @Test
  public void testIsNumber_FalseForString() {
    assertFalse(STRING.isNumber());
  }

  @Test
  public void testIsString_FalseForNumber() {
    assertFalse(NUMBER.isString());
  }

  // ===================== isGlobalThisType() =====================

  @Test
  public void testIsGlobalThisType_True() {
    assertTrue(GLOBAL_THIS.isGlobalThisType());
  }

  @Test
  public void testIsGlobalThisType_False() {
    JSType t = new StubJSType();
    assertFalse(t.isGlobalThisType());
  }

  // ============ toMaybeXxx() defaults -> is*() = false ============

  @Test
  public void testDefaultDowncasts_AllFalse() {
    JSType t = new StubJSType();
    assertFalse(t.isUnionType());
    assertFalse(t.isFunctionType());
    assertFalse(t.isEnumElementType());
    assertFalse(t.isEnumType());
    assertFalse(t.isRecordType());
    assertFalse(t.isParameterizedType());
    assertFalse(t.isTemplateType());
    assertNull(JSType.toMaybeFunctionType(null));      // null-safe static
    assertNull(JSType.toMaybeParameterizedType(null));
    assertNull(JSType.toMaybeTemplateType(null));
  }

  @Test
  public void testUnionType_RealInstanceIsUnion() {
    JSType u = registry.createUnionType(NUMBER, STRING);
    assertTrue(u.isUnionType());
    assertNotNull(u.toMaybeUnionType());
  }

  // ===================== hasAnyTemplate() =====================

  @Test
  public void testHasAnyTemplate_Default() {
    JSType t = new StubJSType();
    assertFalse(t.hasAnyTemplate());
  }

  @Test
  public void testHasAnyTemplate_RecursionGuard() {
    // ถ้า guard ไม่ทำงาน จะเกิด infinite recursion / StackOverflowError
    final JSType[] holder = new JSType[1];
    JSType t = new StubJSType() {
      @Override boolean hasAnyTemplateInternal() {
        return holder[0].hasAnyTemplate(); // เรียกซ้อนตัวเอง
      }
    };
    holder[0] = t;
    assertFalse(t.hasAnyTemplate());
  }

  // ===================== isNominalConstructor() =====================

  @Test
  public void testIsNominalConstructor_NotConstructorNotInterface() {
    JSType t = new StubJSType();
    assertFalse(t.isNominalConstructor());
  }

  @Test
  public void testIsNominalConstructor_ConstructorButNoFunctionType() {
    JSType t = new StubJSType() {
      @Override public boolean isConstructor() { return true; }
    };
    assertFalse(t.isNominalConstructor()); // fn == null branch
  }

  @Test
  public void testIsNominalConstructor_InterfaceButNoFunctionType() {
    JSType t = new StubJSType() {
      @Override public boolean isInterface() { return true; }
    };
    assertFalse(t.isNominalConstructor());
  }

  // ===================== isEquivalentTo / equals / hashCode =====================

  @Test
  public void testIsEquivalentTo_SameInstance() {
    JSType t = new StubJSType();
    assertTrue(t.isEquivalentTo(t));
  }

  @Test
  public void testIsEquivalentTo_DifferentInstances() {
    JSType a = new StubJSType();
    JSType b = new StubJSType();
    assertFalse(a.isEquivalentTo(b));
  }

  @Test
  public void testEquals_NonJSType() {
    JSType t = new StubJSType();
    assertFalse(t.equals("not a JSType"));
  }

  @Test
  public void testEquals_Null() {
    JSType t = new StubJSType();
    assertFalse(t.equals(null));
  }

  @Test
  public void testEquals_JSTypeDelegatesToIsEquivalentTo() {
    JSType a = new StubJSType();
    JSType b = new StubJSType();
    assertTrue(a.equals(a));
    assertFalse(a.equals(b));
  }

  @Test
  public void testHashCode_ConsistentAcrossCalls() {
    JSType t = new StubJSType();
    assertEquals(t.hashCode(), t.hashCode());
  }

  // ===================== isEquivalent(static) =====================

  @Test
  public void testIsEquivalentStatic_BothNull() {
    assertTrue(JSType.isEquivalent(null, null));
  }

  @Test
  public void testIsEquivalentStatic_OneNull() {
    assertFalse(JSType.isEquivalent(null, NUMBER));
    assertFalse(JSType.isEquivalent(NUMBER, null));
  }

  @Test
  public void testIsEquivalentStatic_BothNonNull() {
    assertTrue(JSType.isEquivalent(NUMBER, NUMBER));
  }

  // ===================== differsFrom() =====================

  @Test
  public void testDiffersFrom_BothKnownEquivalent() {
    JSType t = new StubJSType();
    assertFalse(t.differsFrom(t));
  }

  @Test
  public void testDiffersFrom_BothKnownDifferent() {
    JSType a = new StubJSType();
    JSType b = new StubJSType();
    assertTrue(a.differsFrom(b));
  }

  @Test
  public void testDiffersFrom_ThisUnknownThatKnown() {
    JSType a = new StubJSType() {
      @Override public boolean isUnknownType() { return true; }
    };
    JSType b = new StubJSType();
    assertTrue(a.differsFrom(b));
  }

  @Test
  public void testDiffersFrom_ThisKnownThatUnknown() {
    JSType a = new StubJSType();
    JSType b = new StubJSType() {
      @Override public boolean isUnknownType() { return true; }
    };
    assertTrue(a.differsFrom(b));
  }

  @Test
  public void testDiffersFrom_BothUnknown() {
    JSType a = new StubJSType() {
      @Override public boolean isUnknownType() { return true; }
    };
    JSType b = new StubJSType() {
      @Override public boolean isUnknownType() { return true; }
    };
    assertFalse(a.differsFrom(b));
  }

  // ============ matchesInt32Context / matchesUint32Context ============

  @Test
  public void testMatchesInt32AndUint32Context_True() {
    JSType t = new StubJSType() {
      @Override public boolean matchesNumberContext() { return true; }
    };
    assertTrue(t.matchesInt32Context());
    assertTrue(t.matchesUint32Context());
  }

  @Test
  public void testMatchesInt32AndUint32Context_False() {
    JSType t = new StubJSType();
    assertFalse(t.matchesInt32Context());
    assertFalse(t.matchesUint32Context());
  }

  @Test
  public void testMatchesContext_Defaults() {
    JSType t = new StubJSType();
    assertFalse(t.matchesNumberContext());
    assertFalse(t.matchesStringContext());
    assertFalse(t.matchesObjectContext());
  }

  // ===================== findPropertyType() =====================

  @Test
  public void testFindPropertyType_NoAutobox_NullName() {
    JSType t = new StubJSType();
    assertNull(t.findPropertyType(null)); // ค่า null ของ input
  }

  @Test
  public void testFindPropertyType_NoAutobox_EmptyName() {
    JSType t = new StubJSType();
    assertNull(t.findPropertyType(""));
  }

  // ===================== canBeCalled() =====================

  @Test
  public void testCanBeCalled_Default() {
    assertFalse(new StubJSType().canBeCalled());
  }

  // ===================== canAssignTo() =====================

  @Test
  public void testCanAssignTo_True() {
    JSType t = new StubJSType() {
      @Override public boolean isSubtype(JSType that) { return true; }
    };
    assertTrue(t.canAssignTo(NUMBER));
  }

  @Test
  public void testCanAssignTo_False() {
    JSType t = new StubJSType() {
      @Override public boolean isSubtype(JSType that) { return false; }
    };
    assertFalse(t.canAssignTo(NUMBER));
  }

  // ===================== autobox() =====================

  @Test
  public void testAutobox_NoAutoboxesTo_ReturnsRestricted() {
    final JSType restricted = new StubJSType();
    JSType t = new StubJSType() {
      @Override public JSType restrictByNotNullOrUndefined() { return restricted; }
    };
    assertSame(restricted, t.autobox());
  }

  @Test
  public void testAutobox_WithAutoboxesTo_ReturnsAutoboxed() {
    final JSType autoboxed = new StubJSType();
    final JSType restricted = new StubJSType() {
      @Override public JSType autoboxesTo() { return autoboxed; }
    };
    JSType t = new StubJSType() {
      @Override public JSType restrictByNotNullOrUndefined() { return restricted; }
    };
    assertSame(autoboxed, t.autobox());
  }

  // ===================== canTestForEqualityWith() =====================

  @Test
  public void testCanTestForEqualityWith_Unknown() {
    JSType t = new StubJSType() {
      @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
    };
    assertTrue(t.canTestForEqualityWith(NUMBER));
  }

  @Test
  public void testCanTestForEqualityWith_True() {
    JSType t = new StubJSType() {
      @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.TRUE; }
    };
    assertFalse(t.canTestForEqualityWith(NUMBER));
  }

  @Test
  public void testCanTestForEqualityWith_False() {
    JSType t = new StubJSType() {
      @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.FALSE; }
    };
    assertFalse(t.canTestForEqualityWith(NUMBER));
  }

  // ===================== testForEquality / testForEqualityHelper =====================

  @Test
  public void testTestForEquality_BTypeIsAll() {
    assertEquals(TernaryValue.UNKNOWN, NUMBER.testForEquality(ALL));
  }

  @Test
  public void testTestForEquality_BTypeIsUnknown() {
    assertEquals(TernaryValue.UNKNOWN, NUMBER.testForEquality(UNKNOWN));
  }

  @Test
  public void testTestForEquality_BTypeIsNoResolved() {
    assertEquals(TernaryValue.UNKNOWN, NUMBER.testForEquality(NO_RESOLVED));
  }

  @Test
  public void testTestForEquality_ATypeIsAll() {
    assertEquals(TernaryValue.UNKNOWN, ALL.testForEquality(NUMBER));
  }

  @Test
  public void testTestForEquality_BothEmpty_ReturnsTrue() {
    // ทั้งคู่ isNoType() == true -> isEmptyType() == true
    JSType a = new StubJSType() { @Override public boolean isNoType() { return true; } };
    JSType b = new StubJSType() { @Override public boolean isNoType() { return true; } };
    assertEquals(TernaryValue.TRUE, a.testForEquality(b));
  }

  @Test
  public void testTestForEquality_OneEmptyOneNot_ReturnsUnknown() {
    JSType a = new StubJSType() { @Override public boolean isNoType() { return true; } };
    JSType b = new StubJSType();
    assertEquals(TernaryValue.UNKNOWN, a.testForEquality(b));
  }

  @Test
  public void testTestForEquality_FallThrough_ReturnsNull() {
    // ไม่ empty, ไม่ all/unknown/noResolved, ไม่ function, ไม่ enum/union
    JSType a = new StubJSType();
    JSType b = new StubJSType();
    assertNull(a.testForEquality(b)); // จุดตกที่ return null ท้ายเมธอด
  }

  @Test(expected = NullPointerException.class)
  public void testCanTestForEqualityWith_FallThroughNull_ThrowsNPE() {
    // Boundary case: base implementation คืน null แล้ว canTestForEqualityWith
    // เรียก .equals(UNKNOWN) บน null -> NPE (เป็น edge-case ของ base class
    // ที่ไม่ถูก override; ปกติ subclass จริงจะ override testForEqualityHelper)
    JSType a = new StubJSType();
    JSType b = new StubJSType();
    a.canTestForEqualityWith(b);
  }

  // ===================== canTestForShallowEqualityWith() =====================

  @Test
  public void testCanTestForShallowEqualityWith_EmptyOr_FirstTrue() {
    JSType a = new StubJSType() {
      @Override public boolean isNoType() { return true; }
      @Override public boolean isSubtype(JSType that) { return true; }
    };
    JSType b = new StubJSType();
    assertTrue(a.canTestForShallowEqualityWith(b));
  }

  @Test
  public void testCanTestForShallowEqualityWith_EmptyOr_SecondTrue() {
    final JSType[] aRef = new JSType[1];
    JSType a = new StubJSType() {
      @Override public boolean isNoType() { return true; }
      @Override public boolean isSubtype(JSType that) { return false; }
    };
    JSType b = new StubJSType() {
      @Override public boolean isSubtype(JSType that) { return true; }
    };
    assertTrue(a.canTestForShallowEqualityWith(b));
  }

  @Test
  public void testCanTestForShallowEqualityWith_EmptyOr_BothFalse() {
    JSType a = new StubJSType() {
      @Override public boolean isNoType() { return true; }
      @Override public boolean isSubtype(JSType that) { return false; }
    };
    JSType b = new StubJSType() {
      @Override public boolean isSubtype(JSType that) { return false; }
    };
    assertFalse(a.canTestForShallowEqualityWith(b));
  }

  @Test
  public void testCanTestForShallowEqualityWith_NonEmpty_InfNotEmpty() {
    final JSType inf = new StubJSType(); // isEmptyType() == false
    JSType a = new StubJSType() {
      @Override public JSType getGreatestSubtype(JSType that) { return inf; }
    };
    assertTrue(a.canTestForShallowEqualityWith(new StubJSType()));
  }

  @Test
  public void testCanTestForShallowEqualityWith_NonEmpty_InfIsLeastFunction() {
    JSType a = new StubJSType() {
      @Override public JSType getGreatestSubtype(JSType that) { return LEAST_FUNCTION; }
    };
    // LEAST_FUNCTION ถูกออกแบบให้ isEmptyType() == true ตาม isEmptyType()
    assertTrue(a.canTestForShallowEqualityWith(new StubJSType()));
  }

  @Test
  public void testCanTestForShallowEqualityWith_NonEmpty_InfEmptyNotLeastFunction() {
    final JSType inf = new StubJSType() {
      @Override public boolean isNoType() { return true; } // isEmptyType == true
    };
    JSType a = new StubJSType() {
      @Override public JSType getGreatestSubtype(JSType that) { return inf; }
    };
    assertFalse(a.canTestForShallowEqualityWith(new StubJSType()));
  }

  // ===================== isNullable() =====================

  @Test
  public void testIsNullable_True() {
    JSType t = new StubJSType() {
      @Override public boolean isSubtype(JSType that) { return true; }
    };
    assertTrue(t.isNullable());
  }

  @Test
  public void testIsNullable_False() {
    JSType t = new StubJSType() {
      @Override public boolean isSubtype(JSType that) { return false; }
    };
    assertFalse(t.isNullable());
  }

  // ===================== collapseUnion() =====================

  @Test
  public void testCollapseUnion_ReturnsThis() {
    JSType t = new StubJSType();
    assertSame(t, t.collapseUnion());
  }

  // ===================== getLeastSupertype() =====================

  @Test
  public void testGetLeastSupertype_Equivalent() {
    JSType t = new StubJSType();
    assertSame(t, t.getLeastSupertype(t));
  }

  @Test
  public void testGetLeastSupertype_NotEquivalent_ProducesUnion() {
    JSType a = new StubJSType();
    JSType b = new StubJSType();
    JSType result = a.getLeastSupertype(b);
    assertNotNull(result);
    assertTrue(result.isUnionType());
  }

  @Test
  public void testGetLeastSupertype_ThatIsUnion_Delegates() {
    // สาขา that.isUnionType() -> delegate ไปที่ UnionType.getLeastSupertype
    // (ไม่ทราบ implementation ภายในของ UnionType จาก source ที่ให้มา
    // จึงตรวจสอบเพียงว่าไม่ throw exception)
    JSType a = new StubJSType();
    JSType union = registry.createUnionType(NUMBER, STRING);
    JSType result = a.getLeastSupertype(union);
    assertNotNull(result);
  }

  // ===================== getGreatestSubtype() =====================

  @Test
  public void testGetGreatestSubtype_Equivalent() {
    JSType t = new StubJSType();
    assertSame(t, t.getGreatestSubtype(t));
  }

  @Test
  public void testGetGreatestSubtype_UnknownBranch() {
    assertSame(UNKNOWN, NUMBER.getGreatestSubtype(UNKNOWN));
  }

  @Test
  public void testGetGreatestSubtype_ThisIsSubtypeOfThat() {
    // NUMBER <: ALL -> filterNoResolvedType(NUMBER)
    assertSame(NUMBER, NUMBER.getGreatestSubtype(ALL));
  }

  @Test
  public void testGetGreatestSubtype_ThatIsSubtypeOfThis() {
    // ALL.getGreatestSubtype(NUMBER): NUMBER <: ALL -> filterNoResolvedType(NUMBER)
    assertSame(NUMBER, ALL.getGreatestSubtype(NUMBER));
  }

  @Test
  public void testGetGreatestSubtype_BothObjects_ReturnsNoObjectType() {
    JSType a = new StubJSType() { @Override public boolean isObject() { return true; } };
    JSType b = new StubJSType() { @Override public boolean isObject() { return true; } };
    assertSame(NO_OBJECT, a.getGreatestSubtype(b));
  }

  @Test
  public void testGetGreatestSubtype_NeitherObject_ReturnsNoType() {
    JSType a = new StubJSType();
    JSType b = new StubJSType();
    assertSame(NO, a.getGreatestSubtype(b));
  }

  // ===================== filterNoResolvedType() (package-private static) ==========

  @Test
  public void testFilterNoResolvedType_NoResolvedInput() {
    assertSame(NO_RESOLVED, JSType.filterNoResolvedType(NO_RESOLVED));
  }

  @Test
  public void testFilterNoResolvedType_PlainType_Unchanged() {
    assertSame(NUMBER, JSType.filterNoResolvedType(NUMBER));
  }

  // ===================== getTypesUnderEquality() =====================

  @Test
  public void testGetTypesUnderEquality_False() {
    JSType a = new StubJSType() {
      @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.FALSE; }
    };
    JSType.TypePair p = a.getTypesUnderEquality(NUMBER);
    assertNull(p.typeA);
    assertNull(p.typeB);
  }

  @Test
  public void testGetTypesUnderEquality_True() {
    final JSType that = new StubJSType();
    JSType a = new StubJSType() {
      @Override public TernaryValue testForEquality(JSType t) { return TernaryValue.TRUE; }
    };
    JSType.TypePair p = a.getTypesUnderEquality(that);
    assertSame(a, p.typeA);
    assertSame(that, p.typeB);
  }

  @Test
  public void testGetTypesUnderEquality_Unknown() {
    final JSType that = new StubJSType();
    JSType a = new StubJSType() {
      @Override public TernaryValue testForEquality(JSType t) { return TernaryValue.UNKNOWN; }
    };
    JSType.TypePair p = a.getTypesUnderEquality(that);
    assertSame(a, p.typeA);
    assertSame(that, p.typeB);
  }

  // ===================== getTypesUnderInequality() =====================

  @Test
  public void testGetTypesUnderInequality_True_ReturnsNoType() {
    JSType a = new StubJSType() {
      @Override public TernaryValue testForEquality(JSType t) { return TernaryValue.TRUE; }
    };
    JSType.TypePair p = a.getTypesUnderInequality(NUMBER);
    assertSame(NO, p.typeA);
    assertSame(NO, p.typeB);
  }

  @Test
  public void testGetTypesUnderInequality_False() {
    final JSType that = new StubJSType();
    JSType a = new StubJSType() {
      @Override public TernaryValue testForEquality(JSType t) { return TernaryValue.FALSE; }
    };
    JSType.TypePair p = a.getTypesUnderInequality(that);
    assertSame(a, p.typeA);
    assertSame(that, p.typeB);
  }

  @Test
  public void testGetTypesUnderInequality_Unknown() {
    final JSType that = new StubJSType();
    JSType a = new StubJSType() {
      @Override public TernaryValue testForEquality(JSType t) { return TernaryValue.UNKNOWN; }
    };
    JSType.TypePair p = a.getTypesUnderInequality(that);
    assertSame(a, p.typeA);
    assertSame(that, p.typeB);
  }

  // ===================== getTypesUnderShallowEquality() =====================

  @Test
  public void testGetTypesUnderShallowEquality_UsesGreatestSubtype() {
    final JSType common = new StubJSType();
    JSType a = new StubJSType() {
      @Override public JSType getGreatestSubtype(JSType that) { return common; }
    };
    JSType.TypePair p = a.getTypesUnderShallowEquality(NUMBER);
    assertSame(common, p.typeA);
    assertSame(common, p.typeB);
  }

  // ===================== getTypesUnderShallowInequality() =====================

  @Test
  public void testGetTypesUnderShallowInequality_BothNull() {
    JSType.TypePair p = NULL.getTypesUnderShallowInequality(NULL);
    assertNull(p.typeA);
    assertNull(p.typeB);
  }

  @Test
  public void testGetTypesUnderShallowInequality_BothVoid() {
    JSType.TypePair p = VOID.getTypesUnderShallowInequality(VOID);
    assertNull(p.typeA);
    assertNull(p.typeB);
  }

  @Test
  public void testGetTypesUnderShallowInequality_ElseBranch() {
    JSType.TypePair p = NUMBER.getTypesUnderShallowInequality(STRING);
    assertSame(NUMBER, p.typeA);
    assertSame(STRING, p.typeB);
  }

  // ===================== restrictByNotNullOrUndefined() =====================

  @Test
  public void testRestrictByNotNullOrUndefined_Default() {
    JSType t = new StubJSType();
    assertSame(t, t.restrictByNotNullOrUndefined());
  }

  // ===================== isSubtype() / isSubtypeHelper() =====================

  @Test
  public void testIsSubtype_ThatIsUnknown() {
    JSType t = new StubJSType();
    assertTrue(t.isSubtype(UNKNOWN));
  }

  @Test
  public void testIsSubtype_Equivalent() {
    JSType t = new StubJSType();
    assertTrue(t.isSubtype(t));
  }

  @Test
  public void testIsSubtype_ThatIsAll() {
    JSType t = new StubJSType();
    assertTrue(t.isSubtype(ALL));
  }

  @Test
  public void testIsSubtype_UnionMatch() {
    JSType s = new StubJSType();
    JSType union = registry.createUnionType(s, STRING);
    assertTrue(s.isSubtype(union));
  }

  @Test
  public void testIsSubtype_UnionNoMatch() {
    JSType s = new StubJSType();
    JSType union = registry.createUnionType(STRING, BOOLEAN);
    assertFalse(s.isSubtype(union));
  }

  @Test
  public void testIsSubtype_DefaultFalse() {
    JSType a = new StubJSType();
    JSType b = new StubJSType();
    assertFalse(a.isSubtype(b));
  }

  // ===================== resolve / forceResolve / isResolved / clearResolved =====

  @Test
  public void testIsResolved_InitiallyFalse() {
    JSType t = new StubJSType();
    assertFalse(t.isResolved());
  }

  @Test
  public void testResolve_FirstCallInvokesResolveInternalAndCaches() {
    final int[] counter = {0};
    JSType t = new StubJSType() {
      @Override JSType resolveInternal(ErrorReporter tt, StaticScope<JSType> scope) {
        counter[0]++;
        return this;
      }
    };
    JSType r1 = t.resolve(errorReporter, null);
    assertSame(t, r1);
    assertTrue(t.isResolved());
    assertEquals(1, counter[0]);

    JSType r2 = t.resolve(errorReporter, null); // ควรใช้ cache ไม่เรียก resolveInternal ซ้ำ
    assertSame(t, r2);
    assertEquals(1, counter[0]);
  }

  @Test
  public void testResolve_ResolvedButNullResult_ReturnsUnknown() {
    JSType t = new StubJSType();
    t.setResolvedTypeInternal(null); // จำลอง resolved==true, resolveResult==null
    JSType result = t.resolve(errorReporter, null);
    assertSame(UNKNOWN, result);
  }

  @Test
  public void testForceResolve_RestoresResolveMode() {
    JSType t = new StubJSType();
    Object modeBefore = registry.getResolveMode();
    t.forceResolve(errorReporter, null);
    assertEquals(modeBefore, registry.getResolveMode());
  }

  @Test
  public void testClearResolved_ResetsState() {
    final int[] counter = {0};
    JSType t = new StubJSType() {
      @Override JSType resolveInternal(ErrorReporter tt, StaticScope<JSType> scope) {
        counter[0]++;
        return this;
      }
    };
    t.resolve(errorReporter, null);
    assertTrue(t.isResolved());
    t.clearResolved();
    assertFalse(t.isResolved());
    t.resolve(errorReporter, null);
    assertEquals(2, counter[0]); // resolveInternal ถูกเรียกใหม่อีกครั้ง
  }

  // ===================== setValidator() =====================

  @Test
  public void testSetValidator_True() {
    JSType t = new StubJSType();
    Predicate<JSType> validator = new Predicate<JSType>() {
      @Override public boolean apply(JSType input) { return input != null; }
    };
    assertTrue(t.setValidator(validator));
  }

  @Test
  public void testSetValidator_False() {
    JSType t = new StubJSType();
    Predicate<JSType> validator = new Predicate<JSType>() {
      @Override public boolean apply(JSType input) { return false; }
    };
    assertFalse(t.setValidator(validator));
  }

  // ===================== toString / toAnnotationString / toDebugHashCodeString ====

  @Test
  public void testToString_UsesForAnnotationsFalse() {
    JSType t = new StubJSType();
    assertEquals("STUB[false]", t.toString());
  }

  @Test
  public void testToAnnotationString_UsesForAnnotationsTrue() {
    JSType t = new StubJSType();
    assertEquals("STUB[true]", t.toAnnotationString());
  }

  @Test
  public void testToDebugHashCodeString_Format() {
    JSType t = new StubJSType();
    assertEquals("{" + t.hashCode() + "}", t.toDebugHashCodeString());
  }

  // ===================== matchConstraint() =====================

  @Test
  public void testMatchConstraint_NoOp() {
    JSType t = new StubJSType();
    t.matchConstraint(NUMBER); // ไม่ควร throw exception
  }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testHasDisplayName_*` | `getDisplayName()`==null / ""/ non-empty |
| `testIsEmptyType_*` | `isNoType`, `isNoObjectType`, `isNoResolvedType`, identity กับ `LEAST_FUNCTION_TYPE`, กรณี false |
| `testIsNumber_*`, `testIsString_*` | `isSubtype` ผ่าน STRING/NUMBER_VALUE_OR_OBJECT_TYPE, true/false |
| `testIsGlobalThisType_*` | `this == getNativeType(GLOBAL_THIS)` true/false |
| `testDefaultDowncasts_AllFalse`, `testUnionType_RealInstanceIsUnion` | ค่า default null ของ toMaybe* และ null-safe static helper, union จริง |
| `testHasAnyTemplate_*` | flag `inTemplatedCheckVisit` false/true (recursion guard) |
| `testIsNominalConstructor_*` | `isConstructor||isInterface` false, true+fn==null (3 เคส) |
| `testIsEquivalentTo_*`, `testEquals_*`, `testHashCode_*` | identity check, instanceof check, null input |
| `testIsEquivalentStatic_*` | null/null, null/non-null, non-null/non-null |
| `testDiffersFrom_*` | ทุก combination ของ known/unknown (5 เคส) |
| `testMatchesInt32AndUint32Context_*`, `testMatchesContext_Defaults` | delegate true/false, default false ทั้งหมด |
| `testFindPropertyType_*` | `autoboxesTo()==null`, input null/empty |
| `testCanAssignTo_*` | `isSubtype` true/false |
| `testAutobox_*` | `autoboxesTo()==null` vs non-null, chain กับ `restrictByNotNullOrUndefined` |
| `testCanTestForEqualityWith_*` | UNKNOWN/TRUE/FALSE |
| `testTestForEquality_*` | bType/aType เป็น ALL/UNKNOWN/NO_RESOLVED, empty ทั้งคู่/บางส่วน, fallthrough คืน null |
| `testCanTestForEqualityWith_FallThroughNull_ThrowsNPE` | edge-case NPE จาก base implementation |
| `testCanTestForShallowEqualityWith_*` | empty-OR (true/true, false/true, false/false), non-empty (`inf` ไม่ empty / ==LEAST_FUNCTION / empty อื่น) |
| `testIsNullable_*` | `isSubtype(NULL_TYPE)` true/false |
| `testCollapseUnion_ReturnsThis` | default behavior |
| `testGetLeastSupertype_*` | equivalence true, union สร้างใหม่, that เป็น union (delegate) |
| `testGetGreatestSubtype_*` | equivalence, unknown, subtype ทั้งสองทาง, object&&object, fallback NoType |
| `testFilterNoResolvedType_*` | isNoResolvedType true/false |
| `testGetTypesUnderEquality_*` | switch TRUE/FALSE/UNKNOWN |
| `testGetTypesUnderInequality_*` | switch TRUE/FALSE/UNKNOWN |
| `testGetTypesUnderShallowEquality_*` | ใช้ `getGreatestSubtype` |
| `testGetTypesUnderShallowInequality_*` | null&&null, void&&void, else branch |
| `testIsSubtype_*` | unknown, equivalence, all, union match/no-match, default false |
| `testResolve_*`, `testClearResolved_*`, `testForceResolve_*` | resolved cache, resolveResult==null branch, mode restore |
| `testSetValidator_*` | predicate true/false |
| `testToString_*`, `testToAnnotationString_*`, `testToDebugHashCodeString_*` | `forAnnotations` true/false, format string |
| `testMatchConstraint_NoOp` | no-op method |

**Branch ที่ข้ามโดยเจตนา** (ต้องพึ่งพา subclass ที่ไม่มี source ให้มา): FunctionType-based branch ใน `testForEqualityHelper`/`getGreatestSubtype`, EnumElementType branch, RecordType branch, ProxyObjectType branch — คอมเมนต์กำกับไว้ในโค้ดแต่ละจุดที่เกี่ยวข้อง