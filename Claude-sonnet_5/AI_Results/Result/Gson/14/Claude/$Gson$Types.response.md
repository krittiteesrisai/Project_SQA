# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ `$Gson$Types`

หมายเหตุสำคัญก่อนเริ่ม:
- วางไฟล์ทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`com.google.gson.internal`) เพื่อให้เข้าถึง package-private static methods (`equal`, `getGenericSupertype`, `getSupertype`, `resolveTypeVariable`, `checkNotPrimitive`, `hashCodeOrZero`) ได้โดยตรง ตามแบบชุดทดสอบต้นฉบับของ Defects4J
- เมธอด `indexOf` และ `declaringClassOf` เป็น `private` แม้อยู่ package เดียวกันก็เรียกตรงไม่ได้ จึงถูกทดสอบทางอ้อมผ่าน `resolveTypeVariable`
- Branch `if (collectionType instanceof WildcardType)` ใน `getCollectionElementType` วิเคราะห์แล้วว่ายากมากที่จะ trigger ผ่านการใช้งาน generic ตามปกติ (ดูคอมเมนต์ในโค้ด) — **ไม่ guess behavior จึงไม่เขียนเทสสำหรับ branch นี้** ตามข้อกำหนดที่ 4
- Branch ตรวจสอบความยาว array ผิดใน `WildcardTypeImpl` constructor (checkArgument length) **ไม่สามารถ reach ได้ผ่าน public API** (`subtypeOf`/`supertypeOf` fix ค่าที่ถูกต้องเสมอ) และคลาสเป็น `private` เรียกตรงไม่ได้ — จึงเว้นไว้พร้อมคอมเมนต์

```java
package com.google.gson.internal;

import static org.junit.Assert.*;

import com.google.gson.internal.$Gson$Types;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * JUnit4 test suite for {@link $Gson$Types} (Defects4J Gson-14b).
 */
public class $Gson$TypesTest {

  // ======================================================================
  // Helper types used to build reflective generic Type instances
  // ======================================================================

  interface Foo {}
  interface Bar extends Foo {}
  static class ImplFoo implements Foo {}
  static class ImplBar implements Bar {}

  static class Base {}
  static class Derived extends Base {}

  static class Grand {}
  static class Mid extends Grand {}
  static class Child extends Mid {}

  static class Container<T> { T value; }
  static class StringContainer extends Container<String> {}
  @SuppressWarnings("rawtypes")
  static class RawContainerSub extends Container {}

  static class ArrayContainer<T> { T[] arr; }
  static class StringArrayContainer extends ArrayContainer<String> {}

  static class ListContainer<T> { List<T> list; }
  static class StringListContainer extends ListContainer<String> {}
  static class ConcreteListContainer { List<String> list; }

  static class WildcardContainer<T> {
    List<? extends T> extendsList;
    List<? super T> superList;
  }
  static class StringWildcardContainer extends WildcardContainer<String> {}
  static class ConcreteWildcardContainer { List<? extends Number> list; }

  static class StringArrayList extends ArrayList<String> {}

  @SuppressWarnings("rawtypes")
  static abstract class RawCollectionDirect implements Collection {}

  @SuppressWarnings("rawtypes")
  static abstract class RawMapDirect implements Map {}

  static class StringIntMap extends HashMap<String, Integer> {}

  /** Non-static inner class (has non-null, non-static enclosing class). */
  class NonStaticInner {}

  static class CustomType implements Type {
    // Marker Type implementation matching none of Class/ParameterizedType/
    // GenericArrayType/WildcardType/TypeVariable.
  }

  static <M> M genericMethod(M m) { return m; }

  // ======================================================================
  // Private constructor
  // ======================================================================

  @Test
  public void testPrivateConstructor_throwsUnsupportedOperationException() throws Exception {
    Constructor<$Gson$Types> constructor = $Gson$Types.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    try {
      constructor.newInstance();
      fail("Expected UnsupportedOperationException");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof UnsupportedOperationException);
    }
  }

  // ======================================================================
  // newParameterizedTypeWithOwner / ParameterizedTypeImpl
  // ======================================================================

  @Test
  public void testNewParameterizedTypeWithOwner_staticClass_noOwner_ok() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, pt.getRawType());
    assertNull(pt.getOwnerType());
    assertArrayEquals(new Type[] { String.class }, pt.getActualTypeArguments());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeWithOwner_nonStaticInnerWithoutOwner_throws() {
    $Gson$Types.newParameterizedTypeWithOwner(null, NonStaticInner.class);
  }

  @Test(expected = NullPointerException.class) // assumption: checkNotNull throws NPE
  public void testNewParameterizedTypeWithOwner_nullTypeArgument_throws() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, (Type) null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeWithOwner_primitiveTypeArgument_throws() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
  }

  @Test
  public void testParameterizedType_toString_noArgs() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class);
    assertEquals(0, pt.getActualTypeArguments().length);
    assertEquals("java.util.List", pt.toString());
  }

  @Test
  public void testParameterizedType_toString_oneArg() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals("java.util.List<java.lang.String>", pt.toString());
  }

  @Test
  public void testParameterizedType_toString_multipleArgs() {
    ParameterizedType pt =
        $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    assertEquals("java.util.Map<java.lang.String, java.lang.Integer>", pt.toString());
  }

  @Test
  public void testParameterizedType_equalsMethod_trueAndFalse() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
    assertTrue(pt1.equals(pt2));
    assertFalse(pt1.equals(pt3));
    assertFalse(pt1.equals("not a type"));
  }

  @Test
  public void testParameterizedType_hashCode_consistentAndWithOwner() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(String.class, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(String.class, List.class, String.class);
    assertEquals(pt1.hashCode(), pt2.hashCode());
  }

  // ======================================================================
  // arrayOf / GenericArrayTypeImpl
  // ======================================================================

  @Test
  public void testArrayOf_basic() {
    GenericArrayType g = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, g.getGenericComponentType());
  }

  @Test
  public void testArrayOf_primitiveComponent_noValidation() {
    // GenericArrayTypeImpl does NOT call checkNotPrimitive - documenting actual behavior.
    GenericArrayType g = $Gson$Types.arrayOf(int.class);
    assertEquals(int.class, g.getGenericComponentType());
  }

  @Test
  public void testGenericArrayType_toString() {
    assertEquals("java.lang.String[]", $Gson$Types.arrayOf(String.class).toString());
  }

  @Test
  public void testGenericArrayType_equalsAndHashCode() {
    GenericArrayType g1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType g2 = $Gson$Types.arrayOf(String.class);
    GenericArrayType g3 = $Gson$Types.arrayOf(Integer.class);
    assertTrue(g1.equals(g2));
    assertEquals(g1.hashCode(), g2.hashCode());
    assertFalse(g1.equals(g3));
    assertFalse(g1.equals("x"));
  }

  // ======================================================================
  // subtypeOf / supertypeOf / WildcardTypeImpl
  // ======================================================================

  @Test
  public void testSubtypeOf_object() {
    WildcardType w = $Gson$Types.subtypeOf(Object.class);
    assertEquals("?", w.toString());
    assertArrayEquals(new Type[] { Object.class }, w.getUpperBounds());
    assertArrayEquals(new Type[] {}, w.getLowerBounds());
  }

  @Test
  public void testSubtypeOf_nonObjectBound() {
    WildcardType w = $Gson$Types.subtypeOf(String.class);
    assertEquals("? extends java.lang.String", w.toString());
  }

  @Test
  public void testSupertypeOf_basic() {
    WildcardType w = $Gson$Types.supertypeOf(String.class);
    assertEquals("? super java.lang.String", w.toString());
    assertArrayEquals(new Type[] { Object.class }, w.getUpperBounds());
    assertArrayEquals(new Type[] { String.class }, w.getLowerBounds());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testSubtypeOf_primitiveBound_throws() {
    $Gson$Types.subtypeOf(int.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testSupertypeOf_primitiveBound_throws() {
    $Gson$Types.supertypeOf(int.class);
  }

  // NOTE: WildcardTypeImpl's checkArgument(lowerBounds.length<=1) / checkArgument(upperBounds.length==1)
  // branches are unreachable via subtypeOf()/supertypeOf() (always valid lengths) and the class is private,
  // so it cannot be constructed directly from the test. Left uncovered intentionally (requirement #4).

  // ======================================================================
  // canonicalize
  // ======================================================================

  @Test
  public void testCanonicalize_class_nonArray_returnsSameInstance() {
    assertSame(String.class, $Gson$Types.canonicalize(String.class));
  }

  @Test
  public void testCanonicalize_class_array() {
    Type canon = $Gson$Types.canonicalize(String[].class);
    assertTrue(canon instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) canon).getGenericComponentType());
  }

  @Test
  public void testCanonicalize_parameterizedType() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type canon = $Gson$Types.canonicalize(pt);
    assertTrue($Gson$Types.equals(pt, canon));
  }

  @Test
  public void testCanonicalize_genericArrayType() {
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    Type canon = $Gson$Types.canonicalize(gat);
    assertTrue($Gson$Types.equals(gat, canon));
  }

  @Test
  public void testCanonicalize_wildcardType() {
    WildcardType w = $Gson$Types.subtypeOf(Number.class);
    Type canon = $Gson$Types.canonicalize(w);
    assertTrue($Gson$Types.equals(w, canon));
  }

  @Test
  public void testCanonicalize_typeVariable_fallsToElse_returnsSameInstance() {
    TypeVariable<?> t = Container.class.getTypeParameters()[0];
    assertSame(t, $Gson$Types.canonicalize(t));
  }

  @Test
  public void testCanonicalize_customUnsupportedType_returnsSameInstance() {
    CustomType c = new CustomType();
    assertSame(c, $Gson$Types.canonicalize(c));
  }

  @Test
  public void testCanonicalize_null_returnsNull() {
    assertNull($Gson$Types.canonicalize(null));
  }

  // ======================================================================
  // getRawType
  // ======================================================================

  @Test
  public void testGetRawType_class() {
    assertEquals(String.class, $Gson$Types.getRawType(String.class));
  }

  @Test
  public void testGetRawType_parameterizedType() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, $Gson$Types.getRawType(pt));
  }

  @Test
  public void testGetRawType_parameterizedType_rawTypeNotClass_throws() {
    ParameterizedType fake = new ParameterizedType() {
      public Type[] getActualTypeArguments() { return new Type[0]; }
      public Type getRawType() { return $Gson$Types.arrayOf(String.class); } // not a Class
      public Type getOwnerType() { return null; }
    };
    try {
      $Gson$Types.getRawType(fake);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // ok
    }
  }

  @Test
  public void testGetRawType_genericArrayType() {
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(String[].class, $Gson$Types.getRawType(gat));
  }

  @Test
  public void testGetRawType_typeVariable_returnsObjectClass() {
    TypeVariable<?> t = Container.class.getTypeParameters()[0];
    assertEquals(Object.class, $Gson$Types.getRawType(t));
  }

  @Test
  public void testGetRawType_wildcardType() {
    WildcardType w = $Gson$Types.subtypeOf(String.class);
    assertEquals(String.class, $Gson$Types.getRawType(w));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawType_null_throws() {
    $Gson$Types.getRawType(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawType_unsupportedType_throws() {
    $Gson$Types.getRawType(new CustomType());
  }

  // ======================================================================
  // equal(Object,Object) [package-private helper]
  // ======================================================================

  @Test public void testEqualHelper_bothNull() { assertTrue($Gson$Types.equal(null, null)); }

  @Test public void testEqualHelper_sameReference() {
    Object o = new Object();
    assertTrue($Gson$Types.equal(o, o));
  }

  @Test public void testEqualHelper_aNullBNotNull() { assertFalse($Gson$Types.equal(null, "x")); }

  @Test public void testEqualHelper_notEqualObjects() { assertFalse($Gson$Types.equal("a", "b")); }

  @Test public void testEqualHelper_equalDifferentInstances() {
    assertTrue($Gson$Types.equal(new String("a"), new String("a")));
  }

  // ======================================================================
  // hashCodeOrZero
  // ======================================================================

  @Test public void testHashCodeOrZero_null() { assertEquals(0, $Gson$Types.hashCodeOrZero(null)); }

  @Test public void testHashCodeOrZero_nonNull() {
    assertEquals("abc".hashCode(), $Gson$Types.hashCodeOrZero("abc"));
  }

  // ======================================================================
  // typeToString
  // ======================================================================

  @Test public void testTypeToString_class() {
    assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
  }

  @Test public void testTypeToString_nonClass() {
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(gat.toString(), $Gson$Types.typeToString(gat));
  }

  @Test(expected = NullPointerException.class)
  public void testTypeToString_null_throwsNPE() {
    // type instanceof Class == false for null -> falls to type.toString() -> NPE.
    $Gson$Types.typeToString(null);
  }

  // ======================================================================
  // public equals(Type,Type)
  // ======================================================================

  @Test public void testEquals_bothNull_returnsTrue() { assertTrue($Gson$Types.equals(null, null)); }

  @Test public void testEquals_sameReference() { assertTrue($Gson$Types.equals(String.class, String.class)); }

  @Test public void testEquals_classVsClass_notEqual() {
    assertFalse($Gson$Types.equals(String.class, Integer.class));
  }

  @Test public void testEquals_parameterizedType_bNotParameterized_returnsFalse() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertFalse($Gson$Types.equals(pt, String.class));
  }

  @Test public void testEquals_parameterizedType_equal() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertTrue($Gson$Types.equals(pt1, pt2));
  }

  @Test public void testEquals_parameterizedType_notEqual_actualTypeArgs() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
    assertFalse($Gson$Types.equals(pt1, pt2));
  }

  @Test public void testEquals_parameterizedType_notEqual_rawType() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, Set.class, String.class);
    assertFalse($Gson$Types.equals(pt1, pt2));
  }

  @Test public void testEquals_parameterizedType_notEqual_ownerType() {
    // Owner values are arbitrary here purely to exercise the ownerType comparison branch.
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(String.class, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(Integer.class, List.class, String.class);
    assertFalse($Gson$Types.equals(pt1, pt2));
  }

  @Test public void testEquals_genericArrayType_bNotGenericArray_returnsFalse() {
    GenericArrayType g = $Gson$Types.arrayOf(String.class);
    assertFalse($Gson$Types.equals(g, String.class));
  }

  @Test public void testEquals_genericArrayType_equal() {
    assertTrue($Gson$Types.equals($Gson$Types.arrayOf(String.class), $Gson$Types.arrayOf(String.class)));
  }

  @Test public void testEquals_genericArrayType_notEqual() {
    assertFalse($Gson$Types.equals($Gson$Types.arrayOf(String.class), $Gson$Types.arrayOf(Integer.class)));
  }

  @Test public void testEquals_wildcardType_bNotWildcard_returnsFalse() {
    assertFalse($Gson$Types.equals($Gson$Types.subtypeOf(String.class), String.class));
  }

  @Test public void testEquals_wildcardType_equal() {
    assertTrue($Gson$Types.equals($Gson$Types.subtypeOf(String.class), $Gson$Types.subtypeOf(String.class)));
  }

  @Test public void testEquals_wildcardType_notEqual() {
    assertFalse($Gson$Types.equals($Gson$Types.subtypeOf(String.class), $Gson$Types.subtypeOf(Number.class)));
  }

  @Test public void testEquals_typeVariable_bNotTypeVariable_returnsFalse() {
    TypeVariable<?> t = Container.class.getTypeParameters()[0];
    assertFalse($Gson$Types.equals(t, String.class));
  }

  @Test public void testEquals_typeVariable_equal() {
    TypeVariable<?> t1 = Container.class.getTypeParameters()[0];
    TypeVariable<?> t2 = Container.class.getTypeParameters()[0];
    assertTrue($Gson$Types.equals(t1, t2));
  }

  @Test public void testEquals_typeVariable_notEqual_differentDeclaration() {
    TypeVariable<?> t1 = Container.class.getTypeParameters()[0];
    TypeVariable<?> t2 = ArrayContainer.class.getTypeParameters()[0];
    assertFalse($Gson$Types.equals(t1, t2));
  }

  @Test public void testEquals_unsupportedType_returnsFalse() {
    assertFalse($Gson$Types.equals(new CustomType(), new CustomType()));
  }

  // ======================================================================
  // getGenericSupertype (package-private)
  // ======================================================================

  @Test public void testGetGenericSupertype_sameType() {
    assertEquals(String.class, $Gson$Types.getGenericSupertype(String.class, String.class, String.class));
  }

  @Test public void testGetGenericSupertype_directInterface() {
    assertEquals(Foo.class, $Gson$Types.getGenericSupertype(ImplFoo.class, ImplFoo.class, Foo.class));
  }

  @Test public void testGetGenericSupertype_assignableInterface_recurses() {
    assertEquals(Foo.class, $Gson$Types.getGenericSupertype(ImplBar.class, ImplBar.class, Foo.class));
  }

  @Test public void testGetGenericSupertype_directSuperclass() {
    assertEquals(Base.class, $Gson$Types.getGenericSupertype(Derived.class, Derived.class, Base.class));
  }

  @Test public void testGetGenericSupertype_assignableSuperclass_recurses() {
    assertEquals(Grand.class, $Gson$Types.getGenericSupertype(Child.class, Child.class, Grand.class));
  }

  @Test public void testGetGenericSupertype_cannotResolve_returnsToResolve() {
    assertEquals(String.class, $Gson$Types.getGenericSupertype(Integer.class, Integer.class, String.class));
  }

  // ======================================================================
  // getSupertype
  // ======================================================================

  @Test public void testGetSupertype_valid_resolvesGenericsFully() {
    Type result = $Gson$Types.getSupertype(StringArrayList.class, StringArrayList.class, Collection.class);
    assertTrue(result instanceof ParameterizedType);
    ParameterizedType pt = (ParameterizedType) result;
    assertEquals(Collection.class, pt.getRawType());
    assertEquals(String.class, pt.getActualTypeArguments()[0]);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetSupertype_notAssignable_throws() {
    $Gson$Types.getSupertype(String.class, String.class, List.class);
  }

  // ======================================================================
  // getArrayComponentType
  // ======================================================================

  @Test public void testGetArrayComponentType_genericArrayType() {
    assertEquals(String.class, $Gson$Types.getArrayComponentType($Gson$Types.arrayOf(String.class)));
  }

  @Test public void testGetArrayComponentType_classArray() {
    assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
  }

  // ======================================================================
  // getCollectionElementType
  // ======================================================================

  @Test public void testGetCollectionElementType_parameterized() {
    Type result = $Gson$Types.getCollectionElementType(StringArrayList.class, StringArrayList.class);
    assertEquals(String.class, result);
  }

  @Test public void testGetCollectionElementType_rawDirectInterface_returnsObject() {
    Type result =
        $Gson$Types.getCollectionElementType(RawCollectionDirect.class, RawCollectionDirect.class);
    assertEquals(Object.class, result);
  }
  // NOTE: "collectionType instanceof WildcardType" branch not covered - could not construct a
  // reachable scenario via standard reflection/generics without guessing internal behavior.

  // ======================================================================
  // getMapKeyAndValueTypes
  // ======================================================================

  @Test public void testGetMapKeyAndValueTypes_propertiesSpecialCase() {
    Type[] result = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    assertArrayEquals(new Type[] { String.class, String.class }, result);
  }

  @Test public void testGetMapKeyAndValueTypes_parameterized() {
    Type[] result = $Gson$Types.getMapKeyAndValueTypes(StringIntMap.class, StringIntMap.class);
    assertArrayEquals(new Type[] { String.class, Integer.class }, result);
  }

  @Test public void testGetMapKeyAndValueTypes_rawDirectInterface_returnsObjectObject() {
    Type[] result = $Gson$Types.getMapKeyAndValueTypes(RawMapDirect.class, RawMapDirect.class);
    assertArrayEquals(new Type[] { Object.class, Object.class }, result);
  }

  // ======================================================================
  // resolve
  // ======================================================================

  @Test public void testResolve_plainClass_fallsToElse_returnsSame() {
    assertSame(String.class, $Gson$Types.resolve(String.class, String.class, String.class));
  }

  @Test public void testResolve_typeVariable_resolvedToActualType() throws Exception {
    Field f = Container.class.getDeclaredField("value");
    Type t = f.getGenericType();
    Type result = $Gson$Types.resolve(StringContainer.class, StringContainer.class, t);
    assertEquals(String.class, result);
  }

  @Test public void testResolve_typeVariable_unresolved_returnsSameVariable() throws Exception {
    Field f = Container.class.getDeclaredField("value");
    Type t = f.getGenericType();
    Type result = $Gson$Types.resolve(RawContainerSub.class, RawContainerSub.class, t);
    assertSame(t, result);
  }

  @Test public void testResolve_classArray_unchanged() {
    assertSame(String[].class, $Gson$Types.resolve(String.class, String.class, String[].class));
  }

  @Test public void testResolve_genericArrayType_changed() throws Exception {
    Field f = ArrayContainer.class.getDeclaredField("arr");
    Type t = f.getGenericType();
    Type result = $Gson$Types.resolve(StringArrayContainer.class, StringArrayContainer.class, t);
    assertTrue(result instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) result).getGenericComponentType());
  }

  @Test public void testResolve_genericArrayType_unchanged() {
    GenericArrayType g = $Gson$Types.arrayOf(String.class);
    assertSame(g, $Gson$Types.resolve(String.class, String.class, g));
  }

  @Test public void testResolve_parameterizedType_changed() throws Exception {
    Field f = ListContainer.class.getDeclaredField("list");
    Type t = f.getGenericType();
    Type result = $Gson$Types.resolve(StringListContainer.class, StringListContainer.class, t);
    assertTrue(result instanceof ParameterizedType);
    ParameterizedType pt = (ParameterizedType) result;
    assertEquals(List.class, pt.getRawType());
    assertEquals(String.class, pt.getActualTypeArguments()[0]);
  }

  @Test public void testResolve_parameterizedType_unchanged() throws Exception {
    Field f = ConcreteListContainer.class.getDeclaredField("list");
    Type t = f.getGenericType();
    Type result = $Gson$Types.resolve(ConcreteListContainer.class, ConcreteListContainer.class, t);
    assertSame(t, result);
  }

  @Test public void testResolve_wildcardType_upperBoundChanged() throws Exception {
    Field f = WildcardContainer.class.getDeclaredField("extendsList");
    ParameterizedType listType = (ParameterizedType) f.getGenericType();
    Type wildcard = listType.getActualTypeArguments()[0];
    Type result = $Gson$Types.resolve(StringWildcardContainer.class, StringWildcardContainer.class, wildcard);
    assertTrue(result instanceof WildcardType);
    assertEquals(String.class, ((WildcardType) result).getUpperBounds()[0]);
  }

  @Test public void testResolve_wildcardType_lowerBoundChanged() throws Exception {
    Field f = WildcardContainer.class.getDeclaredField("superList");
    ParameterizedType listType = (ParameterizedType) f.getGenericType();
    Type wildcard = listType.getActualTypeArguments()[0];
    Type result = $Gson$Types.resolve(StringWildcardContainer.class, StringWildcardContainer.class, wildcard);
    assertTrue(result instanceof WildcardType);
    assertEquals(String.class, ((WildcardType) result).getLowerBounds()[0]);
  }

  @Test public void testResolve_wildcardType_unchanged() throws Exception {
    Field f = ConcreteWildcardContainer.class.getDeclaredField("list");
    ParameterizedType listType = (ParameterizedType) f.getGenericType();
    Type wildcard = listType.getActualTypeArguments()[0];
    Type result =
        $Gson$Types.resolve(ConcreteWildcardContainer.class, ConcreteWildcardContainer.class, wildcard);
    assertSame(wildcard, result);
  }

  // ======================================================================
  // resolveTypeVariable
  // ======================================================================

  @Test public void testResolveTypeVariable_declaredByParameterizedType() {
    TypeVariable<?> t = Container.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolveTypeVariable(StringContainer.class, StringContainer.class, t);
    assertEquals(String.class, resolved);
  }

  @Test public void testResolveTypeVariable_declaredByRawSupertype_returnsSameUnknown() {
    TypeVariable<?> t = Container.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolveTypeVariable(RawContainerSub.class, RawContainerSub.class, t);
    assertSame(t, resolved);
  }

  @Test public void testResolveTypeVariable_declaredByMethod_declaredByRawIsNull() throws Exception {
    TypeVariable<?> m =
        $Gson$TypesTest.class.getDeclaredMethod("genericMethod", Object.class).getTypeParameters()[0];
    Type resolved = $Gson$Types.resolveTypeVariable(String.class, String.class, m);
    assertSame(m, resolved);
  }

  // ======================================================================
  // checkNotPrimitive
  // ======================================================================

  @Test public void testCheckNotPrimitive_nonPrimitive_noException() {
    $Gson$Types.checkNotPrimitive(String.class); // should not throw
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCheckNotPrimitive_primitive_throws() {
    $Gson$Types.checkNotPrimitive(int.class);
  }

  @Test public void testCheckNotPrimitive_nonClassType_noException() {
    // !(type instanceof Class<?>) branch -> true, short-circuits, no exception
    $Gson$Types.checkNotPrimitive($Gson$Types.arrayOf(String.class));
  }
}
```

## สรุปการครอบคลุม Branch/Condition แยกตามเมธอดเป้าหมาย

| เมธอดเป้าหมาย | เทสเมธอดหลัก | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| constructor (private) | testPrivateConstructor_throwsUnsupportedOperationException | throw UnsupportedOperationException |
| newParameterizedTypeWithOwner / ParameterizedTypeImpl ctor | testNewParameterizedTypeWithOwner_* , testParameterizedType_* | isStaticOrTopLevelClass true/false, ownerType null/non-null, checkNotNull, checkNotPrimitive true/false, toString length==0/1/>1, equals/hashCode |
| arrayOf / GenericArrayTypeImpl | testArrayOf_*, testGenericArrayType_* | ไม่มี validation (primitive ผ่านได้), toString, equals true/false, hashCode |
| subtypeOf / supertypeOf / WildcardTypeImpl | testSubtypeOf_*, testSupertypeOf_* | upperBound==Object.class / !=Object.class (toString "?" vs "? extends"), lowerBound null/non-null, checkNotPrimitive throw |
| canonicalize | testCanonicalize_* | if Class(array/non-array), else-if ParameterizedType, GenericArrayType, WildcardType, else (fallback), null input |
| getRawType | testGetRawType_* | Class, ParameterizedType (rawType instanceof Class true/false), GenericArrayType, TypeVariable, WildcardType, else (null/unsupported) throw |
| equal(Object,Object) | testEqualHelper_* | a==b, a!=null&&a.equals(b) true/false, a null b non-null |
| hashCodeOrZero | testHashCodeOrZero_* | o!=null / o==null |
| typeToString | testTypeToString_* | instanceof Class true/false, null → NPE (fault-finding edge case) |
| equals(Type,Type) | testEquals_* | a==b, Class, ParameterizedType(b not PT / equal / notEqual owner-raw-args), GenericArrayType(b not GAT/equal/notEqual), WildcardType(b not WT/equal/notEqual), TypeVariable(b not TV/equal/notEqual), else fallback, null,null |
| getGenericSupertype | testGetGenericSupertype_* | toResolve==rawType, interface direct match, interface assignable recurse, superclass direct match, superclass assignable recurse, cannot-resolve fallback |
| getSupertype | testGetSupertype_* | checkArgument true (integration ผ่าน resolve เต็มสาย) / false throw |
| getArrayComponentType | testGetArrayComponentType_* | instanceof GenericArrayType true/false |
| getCollectionElementType | testGetCollectionElementType_* | instanceof ParameterizedType true, fallback Object.class (WildcardType branch ไม่ครอบคลุม-มีคอมเมนต์) |
| getMapKeyAndValueTypes | testGetMapKeyAndValueTypes_* | context==Properties.class, instanceof ParameterizedType true, fallback {Object,Object} |
| resolve | testResolve_* | TypeVariable(resolved/unresolved), Class-array(unchanged), GenericArrayType(changed/unchanged), ParameterizedType(changed/unchanged), WildcardType(lowerBound changed/upperBound changed/unchanged), else fallback |
| resolveTypeVariable | testResolveTypeVariable_* | declaredByRaw==null, declaredBy instanceof ParameterizedType true/false |
| checkNotPrimitive | testCheckNotPrimitive_* | !(instanceof Class) short-circuit true, isPrimitive() true/false |

**ข้อจำกัดที่บันทึกไว้ (ไม่ guess behavior):**
1. `WildcardTypeImpl` ตรวจ `checkArgument(lowerBounds.length<=1)` และ `checkArgument(upperBounds.length==1)` — unreachable ผ่าน public API และคลาส private เรียกตรงไม่ได้
2. `getCollectionElementType`: branch `collectionType instanceof WildcardType` — ไม่พบวิธีสร้าง scenario ที่ reach ได้จริงโดยไม่ guess