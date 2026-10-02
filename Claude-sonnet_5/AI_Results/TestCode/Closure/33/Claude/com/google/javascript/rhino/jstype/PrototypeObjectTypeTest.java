package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.javascript.rhino.ErrorReporter;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

/**
 * Unit test สำหรับ PrototypeObjectType (Defects4J Closure-33b)
 *
 * หมายเหตุ: ประกาศ class ไว้ package เดียวกับ target เพราะ PrototypeObjectType
 * เป็น package-private class (ไม่มี modifier public) จึงไม่สามารถ import
 * จาก package อื่นได้
 */
public class PrototypeObjectTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    // ErrorReporter เป็น interface ง่าย ๆ ตาม com.google.javascript.rhino.ErrorReporter
    // (ใช้ signature ที่ปรากฏจริงในโครงการ Closure Compiler รุ่นนี้)
    registry = new JSTypeRegistry(new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        // ไม่ทำอะไร - เป็น test double
      }
      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        // ไม่ทำอะไร - เป็น test double
      }
    });
  }

  // ---------------------------------------------------------------
  // Constructor branches
  // ---------------------------------------------------------------

  @Test
  public void testConstructor_nullPrototype_nonNative_defaultsToObjectType() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE),
        type.getImplicitPrototype());
  }

  @Test
  public void testConstructor_explicitPrototype_used() {
    ObjectType proto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", proto);
    assertSame(proto, type.getImplicitPrototype());
  }

  @Test
  public void testConstructor_nativeTypeTrue_nullPrototype_allowsNull() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    assertNull(type.getImplicitPrototype());
    assertTrue(type.isNativeObjectType());
  }

  @Test
  public void testConstructor_nativeTypeFalse_default() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "M", null, false);
    assertFalse(type.isNativeObjectType());
  }

  // ---------------------------------------------------------------
  // getReferenceName / hasReferenceName
  // ---------------------------------------------------------------

  @Test
  public void testGetReferenceName_withClassName() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertEquals("Foo", type.getReferenceName());
    assertTrue(type.hasReferenceName());
  }

  @Test
  public void testGetReferenceName_emptyStringClassName_notNullBranch() {
    // boundary: "" ไม่ใช่ null ดังนั้น className != null เป็น true
    PrototypeObjectType type = new PrototypeObjectType(registry, "", null);
    assertEquals("", type.getReferenceName());
    assertTrue(type.hasReferenceName());
  }

  @Test
  public void testGetReferenceName_nullClassName_noOwnerFunction_returnsNull() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertNull(type.getReferenceName());
    assertFalse(type.hasReferenceName());
  }

  // NOTE: branch ที่ className == null แต่ ownerFunction != null (ทั้งใน getReferenceName
  // และ hasReferenceName) ไม่ได้ทดสอบ เพราะไม่มี constructor/factory ของ FunctionType
  // ปรากฏในซอร์สที่ให้มา จึงไม่สามารถสร้าง FunctionType จริงได้โดยไม่เดา API

  // ---------------------------------------------------------------
  // getSlot / hasProperty / hasOwnProperty / getOwnPropertyNames
  // ---------------------------------------------------------------

  @Test
  public void testGetSlot_ownProperty() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    type.defineProperty("x", numberType, false, null);
    StaticSlot<JSType> slot = type.getSlot("x");
    assertNotNull(slot);
    assertSame(numberType, slot.getType());
    assertFalse(slot.isTypeInferred());
  }

  @Test
  public void testGetSlot_inheritedFromImplicitPrototype() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null);
    JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    proto.defineProperty("y", strType, false, null);
    PrototypeObjectType type = new PrototypeObjectType(registry, null, proto);
    StaticSlot<JSType> slot = type.getSlot("y");
    assertNotNull(slot);
    assertSame(strType, slot.getType());
  }

  @Test
  public void testGetSlot_notFound_returnsNull() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertNull(type.getSlot("nonexistent"));
  }

  @Test(expected = NullPointerException.class)
  public void testGetSlot_nullName_throwsNPE() {
    // TreeMap (Maps.newTreeMap()) ไม่รองรับ key เป็น null ตามธรรมชาติของ natural-ordering
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.getSlot(null);
  }

  @Test
  public void testHasProperty_normalTrueFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertFalse(type.hasProperty("foo"));
    type.defineProperty("foo", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(type.hasProperty("foo"));
  }
  // NOTE: branch isUnknownType()==true ของ hasProperty ไม่ได้ทดสอบ เพราะ UNKNOWN_TYPE
  // ไม่น่าจะถูก implement เป็น PrototypeObjectType โดยตรง (ไม่มีซอร์สยืนยัน)

  @Test
  public void testHasOwnProperty_trueFalse() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null);
    proto.defineProperty("inherited", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    PrototypeObjectType type = new PrototypeObjectType(registry, null, proto);
    assertFalse(type.hasOwnProperty("inherited"));
    type.defineProperty("own", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(type.hasOwnProperty("own"));
    assertFalse(type.hasOwnProperty("missing"));
  }

  @Test(expected = NullPointerException.class)
  public void testHasOwnProperty_nullName_throwsNPE() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.hasOwnProperty(null);
  }

  @Test
  public void testGetOwnPropertyNames() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertTrue(type.getOwnPropertyNames().isEmpty());
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    type.defineProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    Set<String> names = type.getOwnPropertyNames();
    assertEquals(2, names.size());
    assertTrue(names.contains("a"));
    assertTrue(names.contains("b"));
  }

  // ---------------------------------------------------------------
  // getPropertiesCount
  // ---------------------------------------------------------------

  @Test
  public void testGetPropertiesCount_implicitPrototypeNull() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null, true);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    type.defineProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertEquals(2, type.getPropertiesCount());
  }

  @Test
  public void testGetPropertiesCount_withImplicitPrototype_localCountOnlyNewProps() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null);
    proto.defineProperty("shared", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    PrototypeObjectType type = new PrototypeObjectType(registry, null, proto);
    type.defineProperty("own", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    type.defineProperty("shared", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    int expected = proto.getPropertiesCount() + 1; // "shared" ถูกกันออกเพราะมีใน implicitPrototype แล้ว
    assertEquals(expected, type.getPropertiesCount());
  }

  // ---------------------------------------------------------------
  // isPropertyTypeDeclared / isPropertyTypeInferred / getPropertyType
  // ---------------------------------------------------------------

  @Test
  public void testIsPropertyTypeDeclared_slotNull() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertFalse(type.isPropertyTypeDeclared("missing"));
  }

  @Test
  public void testIsPropertyTypeDeclared_declaredTrue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.defineProperty("d", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(type.isPropertyTypeDeclared("d"));
  }

  @Test
  public void testIsPropertyTypeDeclared_inferredFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.defineProperty("i", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    assertFalse(type.isPropertyTypeDeclared("i"));
  }

  @Test
  public void testIsPropertyTypeInferred() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertFalse(type.isPropertyTypeInferred("missing"));
    type.defineProperty("i", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    assertTrue(type.isPropertyTypeInferred("i"));
    type.defineProperty("d2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertFalse(type.isPropertyTypeInferred("d2"));
  }

  @Test
  public void testGetPropertyType_missing_returnsUnknown() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), type.getPropertyType("missing"));
  }

  @Test
  public void testGetPropertyType_present() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    type.defineProperty("n", numType, false, null);
    assertSame(numType, type.getPropertyType("n"));
  }

  // ---------------------------------------------------------------
  // collectPropertyNames
  // ---------------------------------------------------------------

  @Test
  public void testCollectPropertyNames_includesOwnAndPrototype() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null);
    proto.defineProperty("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    PrototypeObjectType type = new PrototypeObjectType(registry, null, proto);
    type.defineProperty("p2", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    Set<String> names = Sets.newHashSet();
    type.collectPropertyNames(names);
    assertTrue(names.contains("p1"));
    assertTrue(names.contains("p2"));
  }

  // ---------------------------------------------------------------
  // isPropertyInExterns
  // ---------------------------------------------------------------

  @Test
  public void testIsPropertyInExterns_ownProperty_defaultFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.defineProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertFalse(type.isPropertyInExterns("p"));
  }

  @Test
  public void testIsPropertyInExterns_missing_noImplicitPrototype() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null, true);
    assertFalse(type.isPropertyInExterns("missing"));
  }

  @Test
  public void testIsPropertyInExterns_missing_withImplicitPrototype_delegates() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null);
    PrototypeObjectType type = new PrototypeObjectType(registry, null, proto);
    assertFalse(type.isPropertyInExterns("missing"));
  }
  // NOTE: branch isFromExterns()==true ไม่ได้ทดสอบ เพราะไม่มี API ในซอร์สที่ให้มา
  // สำหรับตั้งค่า fromExterns=true บน Property

  // ---------------------------------------------------------------
  // defineProperty
  // ---------------------------------------------------------------

  @Test
  public void testDefineProperty_newProperty_returnsTrue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    boolean result = type.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(result);
    assertTrue(type.hasOwnProperty("x"));
  }

  @Test
  public void testDefineProperty_alreadyDeclared_returnsFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    boolean result = type.defineProperty("x", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertFalse(result);
    // ค่าเดิมต้องไม่เปลี่ยน
    assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), type.getPropertyType("x"));
  }

  @Test
  public void testDefineProperty_overwriteInferredProperty_allowed() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null); // inferred
    boolean result = type.defineProperty("x", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertTrue(result);
    assertSame(registry.getNativeType(JSTypeNative.STRING_TYPE), type.getPropertyType("x"));
  }

  @Test
  public void testDefineProperty_emptyStringName_boundary() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    boolean result = type.defineProperty("", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(result);
    assertTrue(type.hasOwnProperty(""));
  }

  // ---------------------------------------------------------------
  // removeProperty
  // ---------------------------------------------------------------

  @Test
  public void testRemoveProperty_trueFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertFalse(type.removeProperty("missing"));
    type.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(type.removeProperty("x"));
    assertFalse(type.hasOwnProperty("x"));
    assertFalse(type.removeProperty("x"));
  }

  // ---------------------------------------------------------------
  // getPropertyNode
  // ---------------------------------------------------------------

  @Test
  public void testGetPropertyNode_ownProperty_nullNode() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertNull(type.getPropertyNode("x"));
  }

  @Test
  public void testGetPropertyNode_missing_noImplicitPrototype() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null, true);
    assertNull(type.getPropertyNode("missing"));
  }

  @Test
  public void testGetPropertyNode_missing_withImplicitPrototype_delegates() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null);
    PrototypeObjectType type = new PrototypeObjectType(registry, null, proto);
    assertNull(type.getPropertyNode("missing"));
  }

  // ---------------------------------------------------------------
  // getOwnPropertyJSDocInfo / setPropertyJSDocInfo
  // ---------------------------------------------------------------

  @Test
  public void testGetOwnPropertyJSDocInfo_missing() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertNull(type.getOwnPropertyJSDocInfo("missing"));
  }

  @Test
  public void testGetOwnPropertyJSDocInfo_present_noInfoSet() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertNull(type.getOwnPropertyJSDocInfo("x"));
  }

  @Test
  public void testSetPropertyJSDocInfo_nullInfo_noop() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.setPropertyJSDocInfo("x", null);
    assertFalse(type.hasOwnProperty("x"));
  }
  // NOTE: branch info != null (ทั้งกรณี property ยังไม่ถูกประกาศ และกรณีถูกประกาศแล้ว)
  // ไม่ได้ทดสอบ เพราะไม่มี constructor/builder ของ JSDocInfo ปรากฏในซอร์สที่ให้มา

  // ---------------------------------------------------------------
  // matchesNumberContext / matchesStringContext / hasOverridenNativeProperty
  // ---------------------------------------------------------------

  @Test
  public void testMatchesNumberContext_numberObjectType_true() {
    ObjectType numberObj = registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
    assertTrue(numberObj.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_dateType_true() {
    ObjectType dateType = registry.getNativeObjectType(JSTypeNative.DATE_TYPE);
    assertTrue(dateType.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_booleanObjectType_true() {
    ObjectType boolObj = registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
    assertTrue(boolObj.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_stringObjectType_true() {
    ObjectType strObj = registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
    assertTrue(strObj.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_plainObject_false() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertFalse(type.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_overriddenValueOf_true() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo",
        registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    type.defineProperty("valueOf", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertTrue(type.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_nativeType_skipsOverrideCheck() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null, true);
    type.defineProperty("valueOf", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    // hasOverridenNativeProperty return false ทันทีเพราะ isNativeObjectType()==true
    assertFalse(type.matchesNumberContext());
  }

  @Test
  public void testMatchesStringContext_theObjectType_true() {
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertTrue(objType.matchesStringContext());
  }

  @Test
  public void testMatchesStringContext_arrayType_true() {
    ObjectType arrayType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
    assertTrue(arrayType.matchesStringContext());
  }

  @Test
  public void testMatchesStringContext_regexpType_true() {
    ObjectType regexpType = registry.getNativeObjectType(JSTypeNative.REGEXP_TYPE);
    assertTrue(regexpType.matchesStringContext());
  }

  @Test
  public void testMatchesStringContext_plainObject_false() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo",
        registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    assertFalse(type.matchesStringContext());
  }

  @Test
  public void testMatchesStringContext_overriddenToString_true() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo",
        registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    type.defineProperty("toString", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertTrue(type.matchesStringContext());
  }
  // NOTE: branch this.isFunctionType()==true ภายใน hasOverridenNativeProperty (ที่ใช้
  // FUNCTION_PROTOTYPE) ไม่ได้ทดสอบ เพราะไม่มี FunctionType instance ที่สร้างได้อย่างมั่นใจ

  // ---------------------------------------------------------------
  // unboxesTo
  // ---------------------------------------------------------------

  @Test
  public void testUnboxesTo_stringObjectType() {
    ObjectType strObj = registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE);
    assertSame(registry.getNativeType(JSTypeNative.STRING_TYPE), strObj.unboxesTo());
  }

  @Test
  public void testUnboxesTo_booleanObjectType() {
    ObjectType boolObj = registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE);
    assertSame(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), boolObj.unboxesTo());
  }

  @Test
  public void testUnboxesTo_numberObjectType() {
    ObjectType numObj = registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
    assertSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numObj.unboxesTo());
  }

  @Test
  public void testUnboxesTo_plainObject_fallsThroughToSuper() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    JSType result = type.unboxesTo();
    assertNotSame(registry.getNativeType(JSTypeNative.STRING_TYPE), result);
    assertNotSame(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), result);
    assertNotSame(registry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
  }

  // ---------------------------------------------------------------
  // matchesObjectContext / canBeCalled
  // ---------------------------------------------------------------

  @Test
  public void testMatchesObjectContext_alwaysTrue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertTrue(type.matchesObjectContext());
  }

  @Test
  public void testCanBeCalled_regexpType_true() {
    ObjectType regexp = registry.getNativeObjectType(JSTypeNative.REGEXP_TYPE);
    assertTrue(regexp.canBeCalled());
  }

  @Test
  public void testCanBeCalled_plainObject_false() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertFalse(type.canBeCalled());
  }

  // ---------------------------------------------------------------
  // toStringHelper / setPrettyPrint / isPrettyPrint
  // ---------------------------------------------------------------

  @Test
  public void testToStringHelper_hasReferenceName() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertEquals("Foo", type.toStringHelper(false));
    assertEquals("Foo", type.toStringHelper(true));
  }

  @Test
  public void testToStringHelper_anonymous_noPrettyPrint_forAnnotationsFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null, true);
    assertEquals("{...}", type.toStringHelper(false));
  }

  @Test
  public void testToStringHelper_anonymous_noPrettyPrint_forAnnotationsTrue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null, true);
    assertEquals("?", type.toStringHelper(true));
  }

  @Test
  public void testToStringHelper_prettyPrint_withFewProperties() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null, true);
    type.setPrettyPrint(true);
    assertTrue(type.isPrettyPrint());
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    type.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    String result = type.toStringHelper(false);
    assertTrue(result.startsWith("{"));
    assertTrue(result.endsWith("}"));
    assertTrue(result.contains("a"));
    assertTrue(result.contains("b"));
  }

  @Test
  public void testToStringHelper_prettyPrint_truncatedAtMax_forAnnotationsFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null, true);
    type.setPrettyPrint(true);
    for (String name : new String[] {"a", "b", "c", "d", "e"}) {
      type.defineProperty(name, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    }
    String result = type.toStringHelper(false);
    assertTrue(result.contains(", ...")); // MAX_PRETTY_PRINTED_PROPERTIES = 4 -> ตัด property ที่ 5
    assertFalse(result.contains("e:"));
  }

  @Test
  public void testToStringHelper_prettyPrint_forAnnotationsTrue_noTruncation() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null, true);
    type.setPrettyPrint(true);
    for (String name : new String[] {"a", "b", "c", "d", "e"}) {
      type.defineProperty(name, registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    }
    String result = type.toStringHelper(true);
    assertFalse(result.contains("..."));
    assertTrue(result.contains("e"));
  }

  @Test
  public void testSetAndIsPrettyPrint() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertFalse(type.isPrettyPrint());
    type.setPrettyPrint(true);
    assertTrue(type.isPrettyPrint());
  }

  // ---------------------------------------------------------------
  // getConstructor / getImplicitPrototype / setImplicitPrototype
  // ---------------------------------------------------------------

  @Test
  public void testGetConstructor_alwaysNull() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertNull(type.getConstructor());
  }

  @Test
  public void testSetImplicitPrototype_updatesValue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    ObjectType newProto = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    type.setImplicitPrototype(newProto);
    assertSame(newProto, type.getImplicitPrototype());
  }
  // NOTE: branch checkState(!hasCachedValues()) เมื่อ hasCachedValues()==true (ควร throw
  // IllegalStateException) ไม่ได้ทดสอบ เพราะไม่มีวิธี set สถานะ resolved/cached ที่ยืนยันได้
  // จากซอร์สที่ให้มาเพียงอย่างเดียว

  // ---------------------------------------------------------------
  // isNativeObjectType
  // ---------------------------------------------------------------

  @Test
  public void testIsNativeObjectType() {
    PrototypeObjectType nativeType = new PrototypeObjectType(registry, "N", null, true);
    assertTrue(nativeType.isNativeObjectType());
    PrototypeObjectType nonNative = new PrototypeObjectType(registry, "M", null, false);
    assertFalse(nonNative.isNativeObjectType());
  }

  // ---------------------------------------------------------------
  // setOwnerFunction / getOwnerFunction
  // ---------------------------------------------------------------

  @Test
  public void testSetOwnerFunction_null_doesNotThrow() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.setOwnerFunction(null);
    assertNull(type.getOwnerFunction());
  }
  // NOTE: branch ที่ ownerFunction ถูก set แล้วและพยายาม set ซ้ำด้วยค่า non-null (ควร throw
  // IllegalStateException จาก Preconditions.checkState) ไม่ได้ทดสอบ เพราะไม่มี FunctionType
  // instance ที่สร้างได้อย่างมั่นใจจากซอร์สที่ให้มา

  // ---------------------------------------------------------------
  // getCtorImplementedInterfaces / getCtorExtendedInterfaces
  // ---------------------------------------------------------------

  @Test
  public void testGetCtorImplementedInterfaces_notFunctionPrototype_empty() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertFalse(type.getCtorImplementedInterfaces().iterator().hasNext());
  }

  @Test
  public void testGetCtorExtendedInterfaces_notFunctionPrototype_empty() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertFalse(type.getCtorExtendedInterfaces().iterator().hasNext());
  }
  // NOTE: branch true (isFunctionPrototypeType()==true) ไม่ได้ทดสอบ เพราะต้องมี ownerFunction
  // เป็น FunctionType จริงซึ่งไม่มี API ที่ยืนยันได้จากซอร์สที่ให้มา

  // ---------------------------------------------------------------
  // resolveInternal
  // ---------------------------------------------------------------

  @Test
  public void testResolveInternal_noImplicitPrototype_noProperties() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null, true);
    JSType result = type.resolveInternal(null, null);
    assertSame(type, result);
  }

  @Test
  public void testResolveInternal_withImplicitPrototypeAndProperties() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, null, null, true);
    PrototypeObjectType type = new PrototypeObjectType(registry, null, proto);
    type.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    JSType result = type.resolveInternal(null, null);
    assertSame(type, result);
  }

  // ---------------------------------------------------------------
  // isSubtype (ครอบคลุมเฉพาะ branch ที่สร้าง fixture ได้โดยไม่เดา API)
  // ---------------------------------------------------------------

  @Test
  public void testIsSubtype_reflexive_true() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertTrue(type.isSubtype(type));
  }

  @Test
  public void testIsSubtype_actualPrototypeChain_true() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    assertTrue(child.isSubtype(parent));
  }

  @Test
  public void testIsSubtype_unrelatedObjectTypes_false() {
    PrototypeObjectType typeA = new PrototypeObjectType(registry, "A",
        registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    PrototypeObjectType typeB = new PrototypeObjectType(registry, "B",
        registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    assertFalse(typeA.isSubtype(typeB));
  }

  @Test
  public void testIsSubtype_unionType_branch() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    // ใช้ createUnionType ของ JSTypeRegistry (สมมติฐาน: มี method นี้จริงตาม API มาตรฐานของ
    // Closure Compiler แต่ไม่ได้แสดง source ให้ดูโดยตรง)
    JSType union = registry.createUnionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    assertFalse(type.isSubtype(union));
  }
  // NOTE: branch record type, interface (thatCtor.isInterface()), และ
  // implicitPrototypeChainIsUnknown()==true ไม่ได้ทดสอบ เพราะต้องมี RecordType/FunctionType
  // (interface) หรือ "unknown" ObjectType ซึ่งไม่มี API สร้างที่ยืนยันได้จากซอร์สที่ให้มา

  // ---------------------------------------------------------------
  // matchConstraint
  // ---------------------------------------------------------------

  @Test
  public void testMatchConstraint_nonRecordType_noop() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    ObjectType numberObjType = registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE);
    type.matchConstraint(numberObjType);
    assertTrue(type.getOwnPropertyNames().isEmpty());
  }
  // NOTE: branch constraintObj.isRecordType()==true (รวมถึง sub-branch isPropertyTypeDeclared,
  // hasProperty) ไม่ได้ทดสอบ เพราะไม่มี API สร้าง RecordType ที่ยืนยันได้จากซอร์สที่ให้มา
  // (RecordTypeBuilder/registry.createRecordType ไม่ปรากฏใน source ที่ให้)

  // ---------------------------------------------------------------
  // hasCachedValues (ผ่าน super) - ทดสอบเบื้องต้น
  // ---------------------------------------------------------------

  @Test
  public void testHasCachedValues_freshInstance() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    // สมมติฐาน: instance ที่สร้างใหม่และยังไม่ resolve ควรมี hasCachedValues()==false
    // (พฤติกรรมจริงของ super.hasCachedValues() ไม่ได้แสดงในซอร์สที่ให้มา)
    assertFalse(type.hasCachedValues());
  }
}
