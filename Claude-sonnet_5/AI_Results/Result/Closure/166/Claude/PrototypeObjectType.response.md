# PrototypeObjectTypeTest

## หมายเหตุสำคัญก่อนเริ่ม (ข้อจำกัดของ source ที่ให้มา)

- คลาสเป้าหมาย `PrototypeObjectType` เป็น **package-private** และพึ่งพา `JSTypeRegistry`, `ObjectType`, `JSType`, `FunctionType`, `Property`, `JSDocInfo`, `RecordType` ฯลฯ ซึ่ง **ไม่ได้แสดง source ในโจทย์** ผมจึงต้อง:
  - วาง test class ไว้ใน package เดียวกัน (`com.google.javascript.rhino.jstype`) เพื่อเข้าถึง constructor/method แบบ package-private ได้
  - ใช้ `JSTypeRegistry(ErrorReporter)` และ `ErrorReporter.warning/error(String,String,int,int)` ตาม signature ที่ทราบจาก Closure Compiler โค้ดฐานจริงในช่วงเวลานี้ — **สมมติฐานนี้ระบุเป็นคอมเมนต์ในโค้ด**
  - หลีกเลี่ยงการสร้าง instance ของ `JSDocInfo`, `FunctionType`, `RecordType` ตรง ๆ เพราะไม่มี source ยืนยัน API (ทำตามข้อ 4 ห้ามเดา) — จุดที่ข้ามจะมีคอมเมนต์กำกับชัดเจน

```java
package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Sets;
import com.google.javascript.rhino.ErrorReporter;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 * Unit tests for {@link PrototypeObjectType}.
 *
 * NOTE (สมมติฐานที่ไม่มี source ยืนยันตรง ๆ ในโจทย์ แต่จำเป็นต่อการ compile/run):
 *  - JSTypeRegistry มี constructor รับ ErrorReporter ตัวเดียว: JSTypeRegistry(ErrorReporter)
 *  - ErrorReporter มี method: warning(String,String,int,int), error(String,String,int,int)
 *  - registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE) เป็น native object type
 *    (isNativeObjectType() == true) ตามธรรมชาติของ built-in type ที่ registry สร้างขึ้น
 */
public class PrototypeObjectTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    ErrorReporter errorReporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        // no-op สำหรับ test
      }

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        // no-op สำหรับ test
      }
    };
    registry = new JSTypeRegistry(errorReporter);
  }

  // ---------------------------------------------------------------------
  // Constructor
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_nullImplicitPrototype_nonNative_usesObjectType() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertSame(objectType, type.getImplicitPrototype());
    assertEquals("Foo", type.getReferenceName());
    assertTrue(type.hasReferenceName());
    assertFalse(type.isNativeObjectType());
  }

  @Test
  public void testConstructor_withImplicitPrototype_nonNative() {
    ObjectType proto = new PrototypeObjectType(registry, "Proto", null);
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", proto);
    assertSame(proto, type.getImplicitPrototype());
  }

  @Test
  public void testConstructor_nativeTrue_withNullImplicitPrototype_keepsNull() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    assertNull(type.getImplicitPrototype());
    assertTrue(type.isNativeObjectType());
  }

  @Test
  public void testConstructor_anonymousClass_nullClassName() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertNull(type.getReferenceName());
    assertFalse(type.hasReferenceName());
  }

  // ---------------------------------------------------------------------
  // getSlot
  // ---------------------------------------------------------------------

  @Test
  public void testGetSlot_ownProperty() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    type.defineProperty("bar", numberType, false, null);
    assertNotNull(type.getSlot("bar"));
    assertSame(numberType, type.getSlot("bar").getType());
  }

  @Test
  public void testGetSlot_fromImplicitPrototype() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    proto.defineProperty("bar", numberType, false, null);
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", proto);
    assertNotNull(type.getSlot("bar"));
  }

  @Test
  public void testGetSlot_notFound() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    assertNull(type.getSlot("nonexistent"));
  }

  @Test
  public void testGetSlot_emptyPropertyName_notFound() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null, true);
    assertNull(type.getSlot(""));
  }

  @Test(expected = NullPointerException.class)
  public void testGetSlot_nullPropertyName_throwsNPE() {
    // properties เป็น TreeMap (natural ordering) -> containsKey(null) ควร throw NPE
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.getSlot(null);
  }

  // ---------------------------------------------------------------------
  // getPropertiesCount
  // ---------------------------------------------------------------------

  @Test
  public void testGetPropertiesCount_noImplicitPrototype() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    assertEquals(0, type.getPropertiesCount());
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertEquals(1, type.getPropertiesCount());
  }

  @Test
  public void testGetPropertiesCount_overlapAndNew() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null, true);
    proto.defineProperty("shared", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", proto);
    type.defineProperty("shared", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    type.defineProperty("own", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);

    // proto.getPropertiesCount() = 1 ("shared")
    // type local: "shared" -> proto.hasProperty=true -> ไม่นับ, "own" -> ไม่มีใน proto -> นับ
    // total = 1 + 1 = 2
    assertEquals(2, type.getPropertiesCount());
  }

  // ---------------------------------------------------------------------
  // hasProperty / hasOwnProperty
  // ---------------------------------------------------------------------

  @Test
  public void testHasProperty_found() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(type.hasProperty("a"));
  }

  @Test
  public void testHasProperty_notFound() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    assertFalse(type.hasProperty("nonexistent"));
  }
  // NOTE: ไม่ทดสอบ branch isUnknownType()==true เพราะต้องใช้ UnknownType instance
  // ซึ่งไม่มี source ยืนยันวิธีสร้างในโจทย์นี้

  @Test
  public void testHasOwnProperty_trueAndFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(type.hasOwnProperty("a"));
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(type.hasOwnProperty("a"));
  }

  // ---------------------------------------------------------------------
  // getOwnPropertyNames
  // ---------------------------------------------------------------------

  @Test
  public void testGetOwnPropertyNames() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertTrue(type.getOwnPropertyNames().isEmpty());
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    type.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
    Set<String> names = type.getOwnPropertyNames();
    assertEquals(2, names.size());
    assertTrue(names.contains("a"));
    assertTrue(names.contains("b"));
  }

  // ---------------------------------------------------------------------
  // isPropertyTypeDeclared / isPropertyTypeInferred
  // ---------------------------------------------------------------------

  @Test
  public void testIsPropertyTypeDeclared_notFound() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    assertFalse(type.isPropertyTypeDeclared("x"));
  }

  @Test
  public void testIsPropertyTypeDeclared_declared() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(type.isPropertyTypeDeclared("a"));
  }

  @Test
  public void testIsPropertyTypeDeclared_inferred_returnsFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    assertFalse(type.isPropertyTypeDeclared("a"));
  }

  @Test
  public void testIsPropertyTypeInferred_notFound() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    assertFalse(type.isPropertyTypeInferred("x"));
  }

  @Test
  public void testIsPropertyTypeInferred_true() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    assertTrue(type.isPropertyTypeInferred("a"));
  }

  @Test
  public void testIsPropertyTypeInferred_false_whenDeclared() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertFalse(type.isPropertyTypeInferred("a"));
  }

  // ---------------------------------------------------------------------
  // collectPropertyNames
  // ---------------------------------------------------------------------

  @Test
  public void testCollectPropertyNames_includesPrototypeChain() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null, true);
    proto.defineProperty("protoProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", proto);
    type.defineProperty("ownProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    Set<String> props = Sets.newHashSet();
    type.collectPropertyNames(props);

    assertTrue(props.contains("ownProp"));
    assertTrue(props.contains("protoProp"));
  }

  // ---------------------------------------------------------------------
  // getPropertyType
  // ---------------------------------------------------------------------

  @Test
  public void testGetPropertyType_notFound_returnsUnknown() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    assertSame(unknown, type.getPropertyType("x"));
  }

  @Test
  public void testGetPropertyType_found() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    type.defineProperty("a", numberType, false, null);
    assertSame(numberType, type.getPropertyType("a"));
  }

  // ---------------------------------------------------------------------
  // isPropertyInExterns
  // ---------------------------------------------------------------------

  @Test
  public void testIsPropertyInExterns_ownProperty_defaultNotExterns() {
    // NOTE: defineProperty() ไม่มีพารามิเตอร์ externs จึง assume default isFromExterns()==false
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertFalse(type.isPropertyInExterns("a"));
  }

  @Test
  public void testIsPropertyInExterns_delegatesToPrototype() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null, true);
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", proto);
    assertFalse(type.isPropertyInExterns("missing"));
  }

  @Test
  public void testIsPropertyInExterns_noPrototype_notFound() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    assertFalse(type.isPropertyInExterns("missing"));
  }

  // ---------------------------------------------------------------------
  // defineProperty
  // ---------------------------------------------------------------------

  @Test
  public void testDefineProperty_newProperty_returnsTrue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    boolean result =
        type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(result);
    assertTrue(type.hasOwnProperty("a"));
  }

  @Test
  public void testDefineProperty_emptyStringName_allowed() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    boolean result =
        type.defineProperty("", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(result);
    assertTrue(type.hasOwnProperty(""));
  }

  @Test
  public void testDefineProperty_alreadyDeclared_returnsFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    boolean result =
        type.defineProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertFalse(result);
  }

  @Test
  public void testDefineProperty_redefineAfterInferred_returnsTrue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
    boolean result =
        type.defineProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertTrue(result);
    assertSame(registry.getNativeType(JSTypeNative.STRING_TYPE), type.getPropertyType("a"));
  }

  // ---------------------------------------------------------------------
  // removeProperty
  // ---------------------------------------------------------------------

  @Test
  public void testRemoveProperty_exists() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(type.removeProperty("a"));
    assertFalse(type.hasOwnProperty("a"));
  }

  @Test
  public void testRemoveProperty_notExists() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(type.removeProperty("nonexistent"));
  }

  // ---------------------------------------------------------------------
  // getPropertyNode
  // ---------------------------------------------------------------------

  @Test
  public void testGetPropertyNode_ownProperty() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertNull(type.getPropertyNode("a")); // node ที่ define ไว้เป็น null
  }

  @Test
  public void testGetPropertyNode_notFound_noPrototype() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    assertNull(type.getPropertyNode("missing"));
  }

  @Test
  public void testGetPropertyNode_delegatesToPrototype() {
    PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null, true);
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", proto);
    assertNull(type.getPropertyNode("missing"));
  }

  // ---------------------------------------------------------------------
  // getOwnPropertyJSDocInfo / setPropertyJSDocInfo
  // ---------------------------------------------------------------------

  @Test
  public void testGetOwnPropertyJSDocInfo_notFound() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertNull(type.getOwnPropertyJSDocInfo("missing"));
  }

  @Test
  public void testGetOwnPropertyJSDocInfo_foundButNoDocSet() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertNull(type.getOwnPropertyJSDocInfo("a"));
  }

  @Test
  public void testSetPropertyJSDocInfo_nullInfo_isNoop() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.setPropertyJSDocInfo("a", null);
    assertFalse(type.hasOwnProperty("a"));
  }
  // NOTE: ไม่ทดสอบ branch info != null เนื่องจากไม่มี source ของ JSDocInfo ให้มา
  // จึงไม่ทราบวิธี instantiate อย่างถูกต้อง (หลีกเลี่ยงการเดา API ตามข้อกำหนด)

  // ---------------------------------------------------------------------
  // matchesNumberContext / matchesStringContext / hasOverridenNativeProperty
  // ---------------------------------------------------------------------

  @Test
  public void testMatchesNumberContext_plainObject_false() {
    // สมมติฐาน: prototype chain ปกติของ object ธรรมดาจะสืบทอด valueOf จาก OBJECT_PROTOTYPE
    // เดียวกันกับที่ hasOverridenNativeProperty ใช้เทียบ -> propertyType == nativePropertyType -> false
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(type.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_withOverriddenValueOf_true() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("valueOf", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertTrue(type.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_nativeType_shortCircuitsFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Native", null, true);
    type.defineProperty("valueOf", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    // isNativeObjectType()==true -> hasOverridenNativeProperty return false ทันที
    assertFalse(type.matchesNumberContext());
  }

  @Test
  public void testMatchesStringContext_plainObject_false() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(type.matchesStringContext());
  }

  @Test
  public void testMatchesStringContext_withOverriddenToString_true() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("toString", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    assertTrue(type.matchesStringContext());
  }

  // ---------------------------------------------------------------------
  // unboxesTo
  // ---------------------------------------------------------------------

  @Test
  public void testUnboxesTo_defaultPath_noException() {
    // isStringObjectType/isBooleanObjectType/isNumberObjectType เป็น false โดย default
    // (ไม่ถูก override ใน PrototypeObjectType) -> เข้า branch super.unboxesTo()
    // ไม่ assert ค่าที่แน่ชัดเนื่องจาก super ไม่มี source ให้มา
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.unboxesTo();
  }

  // ---------------------------------------------------------------------
  // matchesObjectContext / canBeCalled
  // ---------------------------------------------------------------------

  @Test
  public void testMatchesObjectContext_alwaysTrue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertTrue(type.matchesObjectContext());
  }

  @Test
  public void testCanBeCalled_default_false() {
    // isRegexpType() เป็น false โดย default
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(type.canBeCalled());
  }

  // ---------------------------------------------------------------------
  // toStringHelper
  // ---------------------------------------------------------------------

  @Test
  public void testToStringHelper_hasReferenceName_forAnnotationsFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertEquals("Foo", type.toStringHelper(false));
  }

  @Test
  public void testToStringHelper_hasReferenceName_forAnnotationsTrue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertEquals("Foo", type.toStringHelper(true));
  }

  @Test
  public void testToStringHelper_noReferenceName_noPrettyPrint_forAnnotationsFalse() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertEquals("{...}", type.toStringHelper(false));
  }

  @Test
  public void testToStringHelper_noReferenceName_noPrettyPrint_forAnnotationsTrue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    assertEquals("?", type.toStringHelper(true));
  }

  @Test
  public void testToStringHelper_prettyPrint_buildsPropertyList() {
    // สมมติฐาน: OBJECT_TYPE (implicit prototype default) เป็น native -> loop สะสม property
    // หยุดที่ตัว this เท่านั้น (ไม่รวม property ของ OBJECT_TYPE)
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.setPrettyPrint(true);
    type.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
    String result = type.toStringHelper(false);
    assertTrue(result.startsWith("{"));
    assertTrue(result.contains("a"));
    assertTrue(result.endsWith("}"));
  }

  @Test
  public void testToStringHelper_prettyPrint_truncatesAtMax_whenNotForAnnotations() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.setPrettyPrint(true);
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    type.defineProperty("p1", num, false, null);
    type.defineProperty("p2", num, false, null);
    type.defineProperty("p3", num, false, null);
    type.defineProperty("p4", num, false, null);
    type.defineProperty("p5", num, false, null);
    String result = type.toStringHelper(false);
    assertTrue(result.contains("..."));
  }

  @Test
  public void testToStringHelper_prettyPrint_forAnnotations_noTruncationMark() {
    PrototypeObjectType type = new PrototypeObjectType(registry, null, null);
    type.setPrettyPrint(true);
    JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    type.defineProperty("p1", num, false, null);
    type.defineProperty("p2", num, false, null);
    type.defineProperty("p3", num, false, null);
    type.defineProperty("p4", num, false, null);
    type.defineProperty("p5", num, false, null);
    String result = type.toStringHelper(true);
    assertFalse(result.contains("..."));
  }

  // ---------------------------------------------------------------------
  // setPrettyPrint / isPrettyPrint
  // ---------------------------------------------------------------------

  @Test
  public void testPrettyPrintFlag_toggle() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(type.isPrettyPrint());
    type.setPrettyPrint(true);
    assertTrue(type.isPrettyPrint());
  }

  // ---------------------------------------------------------------------
  // getConstructor
  // ---------------------------------------------------------------------

  @Test
  public void testGetConstructor_alwaysNull() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertNull(type.getConstructor());
  }

  // ---------------------------------------------------------------------
  // getImplicitPrototype / setImplicitPrototype
  // ---------------------------------------------------------------------

  @Test
  public void testSetImplicitPrototype_updatesValue() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    ObjectType newProto = new PrototypeObjectType(registry, "NewProto", null);
    type.setImplicitPrototype(newProto);
    assertSame(newProto, type.getImplicitPrototype());
  }
  // NOTE: ไม่ทดสอบ branch ที่ checkState(!hasCachedValues()) throw exception
  // เนื่องจากไม่มี source ของ hasCachedValues()/resolve mechanism ที่ชัดเจนพอจะจำลองสภาวะ cached ได้อย่างปลอดภัย

  // ---------------------------------------------------------------------
  // getOwnerFunction (default)
  // ---------------------------------------------------------------------

  @Test
  public void testGetOwnerFunction_defaultNull() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    assertNull(type.getOwnerFunction());
  }
  // NOTE: ไม่ทดสอบ setOwnerFunction(FunctionType) / getReferenceName ownerFunction-branch
  // เนื่องจากไม่มี source ของ FunctionType constructor ให้มา จึงไม่สามารถสร้าง instance ได้โดยไม่เดา API

  // ---------------------------------------------------------------------
  // getCtorImplementedInterfaces / getCtorExtendedInterfaces
  // ---------------------------------------------------------------------

  @Test
  public void testGetCtorImplementedInterfaces_notFunctionPrototypeType_empty() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    Iterable<ObjectType> result = type.getCtorImplementedInterfaces();
    assertFalse(result.iterator().hasNext());
  }

  @Test
  public void testGetCtorExtendedInterfaces_notFunctionPrototypeType_empty() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    Iterable<ObjectType> result = type.getCtorExtendedInterfaces();
    assertFalse(result.iterator().hasNext());
  }
  // NOTE: isFunctionPrototypeType()==true branch ต้องการ ownerFunction จริง (FunctionType)
  // ซึ่งไม่มี source ให้มา จึงข้ามการทดสอบ branch นี้

  // ---------------------------------------------------------------------
  // isSubtype (พึ่งพา static JSType.isSubtypeHelper ที่ไม่มี source ให้มา)
  // ---------------------------------------------------------------------

  @Test
  public void testIsSubtype_childOfImplicitPrototype_true() {
    // NOTE: สมมติฐานตามตรรกะ isImplicitPrototype(thatObj) ท้ายเมธอด: type ที่มี parent
    // เป็น implicit prototype ของตัวเองถือเป็น subtype ของ parent
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    assertTrue(child.isSubtype(parent));
  }

  @Test
  public void testIsSubtype_unrelatedTypes_false() {
    // NOTE: สมมติฐานว่า type สองตัวที่ไม่มีความสัมพันธ์ implicit-prototype กันจะไม่เป็น subtype กัน
    PrototypeObjectType typeA = new PrototypeObjectType(registry, "A", null);
    PrototypeObjectType typeB = new PrototypeObjectType(registry, "B", null);
    assertFalse(typeA.isSubtype(typeB));
  }

  // ---------------------------------------------------------------------
  // hasCachedValues (delegate)
  // ---------------------------------------------------------------------

  @Test
  public void testHasCachedValues_callableWithoutException() {
    // NOTE: ไม่ทราบค่า default ที่แน่นอนจาก super.hasCachedValues() (ไม่มี source ObjectType)
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.hasCachedValues();
  }

  // ---------------------------------------------------------------------
  // matchConstraint
  // ---------------------------------------------------------------------

  @Test
  public void testMatchConstraint_hasReferenceName_isNoop() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    type.matchConstraint(stringType);
    assertTrue(type.getOwnPropertyNames().isEmpty());
  }
  // NOTE: ไม่ทดสอบ branch constraint.isRecordType()==true เพราะไม่มี source ของ
  // RecordType/RecordTypeBuilder ให้มา จึงไม่ทราบวิธีสร้าง instance อย่างถูกต้อง

  // ---------------------------------------------------------------------
  // matchRecordTypeConstraint (ใช้ PrototypeObjectType อีกตัวแทน record constraint)
  // ---------------------------------------------------------------------

  @Test
  public void testMatchRecordTypeConstraint_missingProperty_definesInferred() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    PrototypeObjectType constraint = new PrototypeObjectType(registry, "Constraint", null);
    constraint.defineProperty("x", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    type.matchRecordTypeConstraint(constraint);

    assertTrue(type.hasOwnProperty("x"));
    assertTrue(type.isPropertyTypeInferred("x"));
  }

  @Test
  public void testMatchRecordTypeConstraint_alreadyDeclared_skipped() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    type.defineProperty("x", numberType, false, null); // declared

    PrototypeObjectType constraint = new PrototypeObjectType(registry, "Constraint", null);
    constraint.defineProperty("x", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

    type.matchRecordTypeConstraint(constraint);

    assertSame(numberType, type.getPropertyType("x"));
  }

  @Test
  public void testMatchRecordTypeConstraint_existingInferred_usesPropTypeDirectly() {
    PrototypeObjectType type = new PrototypeObjectType(registry, "Foo", null);
    type.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null); // inferred

    PrototypeObjectType constraint = new PrototypeObjectType(registry, "Constraint", null);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    constraint.defineProperty("x", stringType, false, null);

    type.matchRecordTypeConstraint(constraint);

    assertSame(stringType, type.getPropertyType("x"));
  }
}
```

## ตารางสรุป Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_nullImplicitPrototype_nonNative_usesObjectType | constructor: `nativeType==false && implicitPrototype==null` → ใช้ OBJECT_TYPE |
| testConstructor_withImplicitPrototype_nonNative | constructor: `implicitPrototype != null` → ใช้ prototype ที่ส่งมา |
| testConstructor_nativeTrue_withNullImplicitPrototype_keepsNull | constructor: `nativeType==true` → คง null ไว้ |
| testConstructor_anonymousClass_nullClassName | getReferenceName/hasReferenceName: className==null, ownerFunction==null |
| testGetSlot_ownProperty / _fromImplicitPrototype / _notFound / _emptyPropertyName_notFound / _nullPropertyName_throwsNPE | getSlot: own property, prototype fallback, not found, empty key, null key (NPE) |
| testGetPropertiesCount_noImplicitPrototype / _overlapAndNew | getPropertiesCount: `implicitPrototype==null`, loop true/false branch (`hasProperty`) |
| testHasProperty_found / _notFound | hasProperty: getSlot!=null / ==null |
| testHasOwnProperty_trueAndFalse | hasOwnProperty: exists/not exists |
| testGetOwnPropertyNames | getOwnPropertyNames: empty/non-empty |
| testIsPropertyTypeDeclared_* (3 cases) | isPropertyTypeDeclared: slot null, declared, inferred |
| testIsPropertyTypeInferred_* (3 cases) | isPropertyTypeInferred: slot null, inferred, declared |
| testCollectPropertyNames_includesPrototypeChain | collectPropertyNames: own + prototype chain (`implicitPrototype!=null`) |
| testGetPropertyType_notFound_returnsUnknown / _found | getPropertyType: slot null → UNKNOWN_TYPE, slot found → type |
| testIsPropertyInExterns_* (3 cases) | isPropertyInExterns: own property found, delegate to prototype, no prototype |
| testDefineProperty_* (4 cases) | defineProperty: new property, empty name, already declared (false), redefine after inferred (oldProp!=null branch) |
| testRemoveProperty_exists / _notExists | removeProperty: true/false |
| testGetPropertyNode_* (3 cases) | getPropertyNode: own, not found no prototype, delegate to prototype |
| testGetOwnPropertyJSDocInfo_* (2 cases) | getOwnPropertyJSDocInfo: p==null, p!=null |
| testSetPropertyJSDocInfo_nullInfo_isNoop | setPropertyJSDocInfo: `info==null` no-op |
| testMatchesNumberContext_* (3 cases) | matchesNumberContext + hasOverridenNativeProperty: plain(false), overridden(true), native short-circuit(false) |
| testMatchesStringContext_* (2 cases) | matchesStringContext: plain(false), overridden toString(true) |
| testUnboxesTo_defaultPath_noException | unboxesTo: else branch → super.unboxesTo() |
| testMatchesObjectContext_alwaysTrue | matchesObjectContext: always true |
| testCanBeCalled_default_false | canBeCalled: isRegexpType()==false |
| testToStringHelper_* (6 cases) | toStringHelper: hasReferenceName, prettyPrint on/off, forAnnotations true/false, max-properties truncation |
| testPrettyPrintFlag_toggle | setPrettyPrint/isPrettyPrint |
| testGetConstructor_alwaysNull | getConstructor: always null |
| testSetImplicitPrototype_updatesValue | setImplicitPrototype/getImplicitPrototype |
| testGetOwnerFunction_defaultNull | getOwnerFunction: default null |
| testGetCtorImplementedInterfaces_* / testGetCtorExtendedInterfaces_* | getCtorImplementedInterfaces/ExtendedInterfaces: `isFunctionPrototypeType()==false` branch |
| testIsSubtype_childOfImplicitPrototype_true / _unrelatedTypes_false | isSubtype: implicit-prototype relation true/false (สมมติฐานระบุคอมเมนต์) |
| testHasCachedValues_callableWithoutException | hasCachedValues: delegate call (smoke) |
| testMatchConstraint_hasReferenceName_isNoop | matchConstraint: `hasReferenceName()==true` → return early |
| testMatchRecordTypeConstraint_* (3 cases) | matchRecordTypeConstraint: property missing (infer with VOID union), already declared (skip), existing inferred (ใช้ propType ตรง) |

จุดที่ **ข้ามการทดสอบโดยเจตนา** (พร้อมคอมเมนต์ในโค้ด) เนื่องจากไม่มี source ยืนยัน API และเลี่ยงการเดา behavior ตามข้อ 4:
- `setPropertyJSDocInfo`/`getOwnPropertyJSDocInfo` กรณี `info != null` (ต้อง instantiate `JSDocInfo`)
- `setOwnerFunction`/`getReferenceName` กรณี ownerFunction != null และ `getCtorImplementedInterfaces` กรณี `isFunctionPrototypeType()==true` (ต้อง instantiate `FunctionType`)
- `matchConstraint`/`matchRecordTypeConstraint` ผ่าน constraint ที่เป็น `RecordType` จริง (ต้อง instantiate `RecordType`/`RecordTypeBuilder`)
- `setImplicitPrototype` กรณี `checkState` throw exception (ต้องจำลอง `hasCachedValues()==true`)
- `resolveInternal` (ต้องมี `StaticScope<JSType>` ซึ่งไม่มี source ให้มา)
- `hasProperty`/`isSubtype` กรณี `isUnknownType()==true` (ต้องมี `UnknownType` instance)