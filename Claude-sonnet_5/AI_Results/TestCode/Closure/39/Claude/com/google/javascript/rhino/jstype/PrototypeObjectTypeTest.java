package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;
// import เป้าหมายตามข้อกำหนด (redundant เพราะอยู่ package เดียวกัน แต่ใส่ไว้ให้ชัดเจน)
import com.google.javascript.rhino.jstype.PrototypeObjectType;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * JUnit4 test suite สำหรับ PrototypeObjectType (Closure-39b)
 *
 * หมายเหตุสมมติฐานสำคัญที่ใช้ในชุดทดสอบนี้ (เพราะไม่มีซอร์สของคลาสที่เกี่ยวข้องให้ตรวจสอบ 100%):
 * 1) สมมติว่า JSTypeRegistry มี constructor สาธารณะ/แพ็กเกจ (ErrorReporter) — เป็น API มาตรฐานของ
 *    Closure Compiler ที่ทราบโดยทั่วไป จำเป็นต้องใช้เพื่อสร้าง instance ของคลาสเป้าหมายได้เลย
 * 2) สมมติว่า Object.prototype ถูก initialize โดย registry ให้มี property มาตรฐานเช่น
 *    "valueOf"/"toString" (มีหลักฐานสนับสนุนจาก hasOverridenNativeProperty ที่ตรวจสอบชื่อ property
 *    เหล่านี้กับ nativeType.getPropertyType(...) โดยตรงในซอร์สที่ให้มา)
 * 3) สมมติว่า OBJECT_TYPE ที่ได้จาก registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)
 *    เป็น native object (isNativeObjectType()==true) ตามความหมายของคำว่า "native type"
 * 4) toString() ของ JSType ฐาน สันนิษฐานว่าเรียก toStringHelper(false) ภายใน (ตามชื่อเมธอด)
 */
public class PrototypeObjectTypeTest {

  private JSTypeRegistry registry;

  private static final ErrorReporter NULL_REPORTER = new ErrorReporter() {
    @Override
    public void warning(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      // no-op สำหรับการทดสอบ
    }

    @Override
    public void error(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      // no-op สำหรับการทดสอบ
    }
  };

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(NULL_REPORTER);
  }

  // ---------------------------------------------------------------------
  // Constructor
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_NullPrototype_NonNative_DefaultsToObjectType() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE),
        obj.getImplicitPrototype());
    assertFalse(obj.isNativeObjectType());
  }

  @Test
  public void testConstructor_ExplicitPrototype_NonNative() {
    ObjectType proto = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", proto);
    assertSame(proto, obj.getImplicitPrototype());
  }

  @Test
  public void testConstructor_NativeTrue_NullPrototype_SetsNull() {
    PrototypeObjectType obj =
        new PrototypeObjectType(registry, "NativeFoo", null, true);
    assertNull(obj.getImplicitPrototype());
    assertTrue(obj.isNativeObjectType());
  }

  @Test
  public void testConstructor_NativeTrue_WithPrototype() {
    ObjectType proto = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
    PrototypeObjectType obj =
        new PrototypeObjectType(registry, "NativeFoo", proto, true);
    assertSame(proto, obj.getImplicitPrototype());
    assertTrue(obj.isNativeObjectType());
  }

  // ---------------------------------------------------------------------
  // getSlot
  // ---------------------------------------------------------------------

  @Test
  public void testGetSlot_OwnProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("bar", obj, false, null);
    Property p = obj.getSlot("bar");
    assertNotNull(p);
    assertSame(obj, p.getType());
  }

  @Test
  public void testGetSlot_FromImplicitPrototype() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    parent.defineProperty("inherited", parent, false, null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);

    Property p = child.getSlot("inherited");
    assertNotNull(p);
  }

  @Test
  public void testGetSlot_NotFound_ReturnsNull() {
    // ครอบคลุมกรณี loop getCtorExtendedInterfaces() ทำงาน 0 ครั้ง (ImmutableList.of())
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertNull(obj.getSlot("__no_such_property__"));
  }

  // ---------------------------------------------------------------------
  // getPropertiesCount
  // ---------------------------------------------------------------------

  @Test
  public void testGetPropertiesCount_NullImplicitPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "N", null, true);
    obj.defineProperty("a", obj, false, null);
    obj.defineProperty("b", obj, false, null);
    assertEquals(2, obj.getPropertiesCount());
  }

  @Test
  public void testGetPropertiesCount_NonOverlappingIncreasesCount() {
    PrototypeObjectType base = new PrototypeObjectType(registry, "Base", null);
    int baseCount = base.getPropertiesCount();

    PrototypeObjectType withExtra = new PrototypeObjectType(registry, "WithExtra", null);
    withExtra.defineProperty("zzzUniqueProp123", withExtra, false, null);
    assertEquals(baseCount + 1, withExtra.getPropertiesCount());
  }

  @Test
  public void testGetPropertiesCount_OverlappingWithImplicitPrototype_NotDoubleCounted() {
    // สมมติฐาน: "valueOf" มีอยู่แล้วบน Object.prototype (ดูหมายเหตุด้านบนของไฟล์)
    PrototypeObjectType base = new PrototypeObjectType(registry, "Base2", null);
    int baseCount = base.getPropertiesCount();

    PrototypeObjectType overlap = new PrototypeObjectType(registry, "Overlap", null);
    overlap.defineProperty("valueOf", overlap, false, null);
    assertEquals(baseCount, overlap.getPropertiesCount());
  }

  // ---------------------------------------------------------------------
  // hasProperty / hasOwnProperty
  // ---------------------------------------------------------------------

  @Test
  public void testHasProperty_True_OwnProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("uniqueProp", obj, false, null);
    assertTrue(obj.hasProperty("uniqueProp"));
  }

  @Test
  public void testHasProperty_False() {
    // ข้าม branch isUnknownType()==true เพราะไม่มีวิธีสร้าง unknown-type instance
    // จาก API ที่ให้มาโดยไม่ต้องเดา
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(obj.hasProperty("__not_exist__"));
  }

  @Test
  public void testHasOwnProperty_TrueAndFalse() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(obj.hasOwnProperty("x"));
    obj.defineProperty("x", obj, false, null);
    assertTrue(obj.hasOwnProperty("x"));
  }

  // ---------------------------------------------------------------------
  // getOwnPropertyNames
  // ---------------------------------------------------------------------

  @Test
  public void testGetOwnPropertyNames_EmptyThenSorted() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertTrue(obj.getOwnPropertyNames().isEmpty());

    obj.defineProperty("b", obj, false, null);
    obj.defineProperty("a", obj, false, null);

    Set<String> names = obj.getOwnPropertyNames();
    assertEquals(2, names.size());
    Iterator<String> it = names.iterator();
    // TreeMap -> ควรได้ลำดับตัวอักษร
    assertEquals("a", it.next());
    assertEquals("b", it.next());
  }

  // ---------------------------------------------------------------------
  // isPropertyTypeDeclared / isPropertyTypeInferred
  // ---------------------------------------------------------------------

  @Test
  public void testIsPropertyTypeDeclared_SlotNull_False() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(obj.isPropertyTypeDeclared("nope"));
  }

  @Test
  public void testIsPropertyTypeInferred_SlotNull_False() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(obj.isPropertyTypeInferred("nope"));
  }

  @Test
  public void testIsPropertyTypeDeclared_True_WhenNotInferred() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("d", obj, false, null); // inferred = false -> declared
    assertTrue(obj.isPropertyTypeDeclared("d"));
    assertFalse(obj.isPropertyTypeInferred("d"));
  }

  @Test
  public void testIsPropertyTypeInferred_True_WhenInferred() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("i", obj, true, null); // inferred = true
    assertFalse(obj.isPropertyTypeDeclared("i"));
    assertTrue(obj.isPropertyTypeInferred("i"));
  }

  // ---------------------------------------------------------------------
  // collectPropertyNames
  // ---------------------------------------------------------------------

  @Test
  public void testCollectPropertyNames_IncludesImplicitPrototype() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    parent.defineProperty("p1", parent, false, null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    child.defineProperty("c1", child, false, null);

    Set<String> props = new HashSet<String>();
    child.collectPropertyNames(props);

    assertTrue(props.contains("c1"));
    assertTrue(props.contains("p1"));
  }

  // ---------------------------------------------------------------------
  // getPropertyType
  // ---------------------------------------------------------------------

  @Test
  public void testGetPropertyType_UnknownWhenNoSlot() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    // ควรเป็น singleton เดียวกันทุกครั้งที่เรียก (native UNKNOWN_TYPE)
    assertSame(obj.getPropertyType("nope1"), obj.getPropertyType("nope2"));
  }

  @Test
  public void testGetPropertyType_ReturnsDefinedType() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("t", obj, false, null);
    assertSame(obj, obj.getPropertyType("t"));
  }

  // ---------------------------------------------------------------------
  // isPropertyInExterns
  // ---------------------------------------------------------------------

  @Test
  public void testIsPropertyInExterns_OwnProperty_Branch() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("e", obj, false, null);
    // ไม่มี API เปิดเผยให้ set isFromExterns=true จากซอร์สที่ให้มา จึงตรวจสอบแค่ branch ที่ p!=null
    assertFalse(obj.isPropertyInExterns("e"));
  }

  @Test
  public void testIsPropertyInExterns_DelegatesToImplicitPrototype() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    parent.defineProperty("e2", parent, false, null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    assertFalse(child.isPropertyInExterns("e2"));
  }

  @Test
  public void testIsPropertyInExterns_NoPropertyNoPrototype_False() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "N", null, true); // implicitPrototype=null
    assertFalse(obj.isPropertyInExterns("nope"));
  }

  // ---------------------------------------------------------------------
  // defineProperty
  // ---------------------------------------------------------------------

  @Test
  public void testDefineProperty_NewProperty_ReturnsTrue() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertTrue(obj.defineProperty("x", obj, false, null));
  }

  @Test
  public void testDefineProperty_AlreadyDeclared_ReturnsFalse() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertTrue(obj.defineProperty("x", obj, false, null));
    assertFalse(obj.defineProperty("x", obj, false, null));
  }

  @Test
  public void testDefineProperty_RedefineInferred_OldPropBranch() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertTrue(obj.defineProperty("y", obj, true, null)); // inferred, not declared
    // ยังไม่ declared -> ควร defineProperty ซ้ำได้ (ครอบคลุม oldProp != null)
    assertTrue(obj.defineProperty("y", obj, true, null));
  }

  // ---------------------------------------------------------------------
  // removeProperty
  // ---------------------------------------------------------------------

  @Test
  public void testRemoveProperty_TrueAndFalse() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(obj.removeProperty("nope"));
    obj.defineProperty("r", obj, false, null);
    assertTrue(obj.removeProperty("r"));
    assertFalse(obj.hasOwnProperty("r"));
  }

  // ---------------------------------------------------------------------
  // getPropertyNode
  // ---------------------------------------------------------------------

  @Test
  public void testGetPropertyNode_OwnProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("n", obj, false, null);
    assertNull(obj.getPropertyNode("n")); // node ที่ส่งเป็น null
  }

  @Test
  public void testGetPropertyNode_DelegatesToImplicitPrototype() {
    PrototypeObjectType parent = new PrototypeObjectType(registry, "Parent", null);
    parent.defineProperty("n2", parent, false, null);
    PrototypeObjectType child = new PrototypeObjectType(registry, "Child", parent);
    assertNull(child.getPropertyNode("n2"));
  }

  @Test
  public void testGetPropertyNode_NoPropertyNoPrototype_Null() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "N", null, true);
    assertNull(obj.getPropertyNode("nope"));
  }

  // ---------------------------------------------------------------------
  // getOwnPropertyJSDocInfo / setPropertyJSDocInfo
  // ---------------------------------------------------------------------

  @Test
  public void testGetOwnPropertyJSDocInfo_NullWhenNoProperty() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertNull(obj.getOwnPropertyJSDocInfo("nope"));
  }

  @Test
  public void testGetOwnPropertyJSDocInfo_NullWhenPropertyHasNoDoc() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("j", obj, false, null);
    assertNull(obj.getOwnPropertyJSDocInfo("j"));
  }

  @Test
  public void testSetPropertyJSDocInfo_NullInfo_NoOp() {
    // ครอบคลุมเฉพาะ branch info == null; branch info != null ข้ามไว้เพราะไม่มี API
    // สร้าง JSDocInfo ที่ยืนยันได้แน่ชัดจากซอร์สที่ให้มา (ป้องกันการเดา)
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.setPropertyJSDocInfo("newProp", null);
    assertFalse(obj.hasOwnProperty("newProp"));
  }

  // ---------------------------------------------------------------------
  // matchesNumberContext / matchesStringContext / hasOverridenNativeProperty
  // ---------------------------------------------------------------------

  @Test
  public void testMatchesNumberContext_False_WhenNativeObjectType() {
    // isNativeObjectType()==true -> hasOverridenNativeProperty คืน false ทันที
    PrototypeObjectType obj = new PrototypeObjectType(registry, "N", null, true);
    assertFalse(obj.matchesNumberContext());
  }

  @Test
  public void testMatchesNumberContext_True_WhenValueOfOverridden() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("valueOf", obj, false, null); // ต่างจาก native valueOf แน่นอน
    assertTrue(obj.matchesNumberContext());
  }

  @Test
  public void testMatchesStringContext_False_WhenNativeObjectType() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "N", null, true);
    assertFalse(obj.matchesStringContext());
  }

  @Test
  public void testMatchesStringContext_True_WhenToStringOverridden() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.defineProperty("toString", obj, false, null);
    assertTrue(obj.matchesStringContext());
  }

  // ---------------------------------------------------------------------
  // unboxesTo / matchesObjectContext / canBeCalled
  // ---------------------------------------------------------------------

  @Test
  public void testUnboxesTo_DefaultDelegatesToSuper_NoException() {
    // ไม่ทราบพฤติกรรมแน่ชัดของ super.unboxesTo() จากซอร์สที่ให้มา
    // จึงตรวจสอบเพียงว่าเรียกได้โดยไม่เกิด exception (ครอบคลุม else-branch)
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Plain", null, true);
    obj.unboxesTo();
  }

  @Test
  public void testMatchesObjectContext_AlwaysTrue() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertTrue(obj.matchesObjectContext());
  }

  @Test
  public void testCanBeCalled_DefaultFalse() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(obj.canBeCalled());
  }

  // ---------------------------------------------------------------------
  // toStringHelper / setPrettyPrint / isPrettyPrint
  // ---------------------------------------------------------------------

  @Test
  public void testSetAndIsPrettyPrint() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(obj.isPrettyPrint());
    obj.setPrettyPrint(true);
    assertTrue(obj.isPrettyPrint());
  }

  @Test
  public void testToStringHelper_HasReferenceName() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "MyClass", null);
    assertEquals("MyClass", obj.toStringHelper(false));
    assertEquals("MyClass", obj.toStringHelper(true));
  }

  @Test
  public void testToStringHelper_NoReferenceName_NoPrettyPrint() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, null);
    assertEquals("{...}", obj.toStringHelper(false));
  }

  @Test
  public void testToStringHelper_PrettyPrint_NoProperties() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, null);
    obj.setPrettyPrint(true);
    assertEquals("{}", obj.toStringHelper(false));
  }

  @Test
  public void testToStringHelper_PrettyPrint_FewProperties_NoTruncation() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, null);
    obj.setPrettyPrint(true);
    obj.defineProperty("b", obj, false, null);
    obj.defineProperty("a", obj, false, null);
    // property type คือ obj เอง -> toString() ภายในจะไม่ pretty-print ซ้อน (prettyPrint ถูกปิดชั่วคราว)
    // จึงได้ "{...}" เสมอสำหรับ nested call
    assertEquals("{a: {...}, b: {...}}", obj.toStringHelper(false));
  }

  @Test
  public void testToStringHelper_PrettyPrint_ExactlyMax_AppendsEllipsis() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, null);
    obj.setPrettyPrint(true);
    obj.defineProperty("a", obj, false, null);
    obj.defineProperty("b", obj, false, null);
    obj.defineProperty("c", obj, false, null);
    obj.defineProperty("d", obj, false, null);
    // ทดสอบขอบเขต: แม้มีพอดี MAX (4) property ก็ยังต่อ ", ..." เสมอ (พฤติกรรมตามโค้ดจริง)
    assertEquals("{a: {...}, b: {...}, c: {...}, d: {...}, ...}",
        obj.toStringHelper(false));
  }

  @Test
  public void testToStringHelper_PrettyPrint_ExceedsMax_TruncatesFifth() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, null);
    obj.setPrettyPrint(true);
    obj.defineProperty("a", obj, false, null);
    obj.defineProperty("b", obj, false, null);
    obj.defineProperty("c", obj, false, null);
    obj.defineProperty("d", obj, false, null);
    obj.defineProperty("e", obj, false, null);
    String result = obj.toStringHelper(false);
    assertEquals("{a: {...}, b: {...}, c: {...}, d: {...}, ...}", result);
    assertFalse(result.contains("e:"));
  }

  // ---------------------------------------------------------------------
  // getConstructor
  // ---------------------------------------------------------------------

  @Test
  public void testGetConstructor_AlwaysNull() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertNull(obj.getConstructor());
  }

  // ---------------------------------------------------------------------
  // getImplicitPrototype / setImplicitPrototype
  // ---------------------------------------------------------------------

  @Test
  public void testSetImplicitPrototype_ChangesValue() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    ObjectType newProto = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
    obj.setImplicitPrototype(newProto);
    assertSame(newProto, obj.getImplicitPrototype());
  }

  // ---------------------------------------------------------------------
  // getReferenceName / hasReferenceName
  // ---------------------------------------------------------------------

  @Test
  public void testGetReferenceName_WithClassName() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "MyClass", null);
    assertEquals("MyClass", obj.getReferenceName());
    assertTrue(obj.hasReferenceName());
  }

  @Test
  public void testGetReferenceName_NoClassNameNoOwner_Null() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, null, null);
    assertNull(obj.getReferenceName());
    assertFalse(obj.hasReferenceName());
  }

  // หมายเหตุ: branch ที่ ownerFunction != null (getReferenceName คืน
  // ownerFunction.getReferenceName() + ".prototype") ข้ามไว้ เพราะไม่มีวิธีสร้าง
  // instance ของ FunctionType จาก API ที่ปรากฏในซอร์สที่ให้มาโดยไม่ต้องเดา constructor

  // ---------------------------------------------------------------------
  // isSubtype (เฉพาะ branch ที่ยืนยันได้อย่างมั่นใจ)
  // ---------------------------------------------------------------------

  @Test
  public void testIsSubtype_ReflexiveTrue() {
    // สมมติฐาน: type เป็น subtype ของตัวเอง (isSubtypeHelper คืน true เมื่อ this==that)
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Self", null);
    assertTrue(obj.isSubtype(obj));
  }
  // หมายเหตุ: branch union/record/interface/unknown ข้ามไว้ เพราะต้องพึ่ง UnionType,
  // RecordType, FunctionType (isInterface) ซึ่งไม่มีรายละเอียด constructor ในซอร์สที่ให้มา

  // ---------------------------------------------------------------------
  // getCtorImplementedInterfaces / getCtorExtendedInterfaces (branch false)
  // ---------------------------------------------------------------------

  @Test
  public void testGetCtorImplementedInterfaces_EmptyWhenNotFunctionPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    Iterator<ObjectType> it = obj.getCtorImplementedInterfaces().iterator();
    assertFalse(it.hasNext());
  }

  @Test
  public void testGetCtorExtendedInterfaces_EmptyWhenNotFunctionPrototype() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    Iterator<ObjectType> it = obj.getCtorExtendedInterfaces().iterator();
    assertFalse(it.hasNext());
  }

  // ---------------------------------------------------------------------
  // setOwnerFunction / getOwnerFunction
  // ---------------------------------------------------------------------

  @Test
  public void testGetOwnerFunction_DefaultNull() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertNull(obj.getOwnerFunction());
  }

  @Test
  public void testSetOwnerFunction_NullWhenAlreadyNull_NoException() {
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    obj.setOwnerFunction(null);
    obj.setOwnerFunction(null);
    assertNull(obj.getOwnerFunction());
  }
  // หมายเหตุ: branch ที่ throw IllegalStateException (ownerFunction != null && type != null)
  // ข้ามไว้ เพราะต้องสร้าง instance ของ FunctionType จริง ซึ่งไม่มี constructor ให้ตรวจสอบในซอร์สนี้

  // ---------------------------------------------------------------------
  // hasCachedValues (ไม่มี branch ภายในเมธอดนี้เอง, ทดสอบพฤติกรรม default)
  // ---------------------------------------------------------------------

  @Test
  public void testHasCachedValues_DefaultFalseForFreshType() {
    // สมมติฐาน: type ที่สร้างใหม่ยังไม่ resolve/cache -> false
    PrototypeObjectType obj = new PrototypeObjectType(registry, "Foo", null);
    assertFalse(obj.hasCachedValues());
  }
}
