package com.google.gson.internal;

import org.junit.Test;

import java.lang.reflect.*;
import java.util.*;

import static org.junit.Assert.*;

public class $Gson$TypesTest {

  // ===================== Fixtures สำหรับ generics =====================

  interface Foo {}
  interface Bar extends Foo {}
  static class Impl implements Bar {}

  static class GrandParent {}
  static class Parent extends GrandParent {}
  static class Child extends Parent {}

  static class GenericSuper<T> {
    T value;
    T[] arr;
    List<T> list;
    List<? extends T> extendsList;
    List<? super T> superList;
  }
  static class StringSub extends GenericSuper<String> {}
  @SuppressWarnings({"rawtypes"})
  static class RawSub extends GenericSuper {}

  static class TwoParams<A, B> {}

  static class MethodGenericHolder {
    <T> T identity(T t) { return t; }
  }

  static class GenericHolder<T> { T value; }
  @SuppressWarnings("rawtypes")
  static class RawHolder extends GenericHolder {}

  static class StringList extends ArrayList<String> {}
  @SuppressWarnings("rawtypes")
  static class RawList extends ArrayList {}

  static class StringIntMap extends HashMap<String, Integer> {}
  @SuppressWarnings("rawtypes")
  static class RawMap extends HashMap {}

  // non-static inner class (ไม่ static, มี enclosing instance) สำหรับทดสอบ ParameterizedTypeImpl
  class NonStaticInner {}

  // Type ที่ไม่ใช่ Class/ParameterizedType/GenericArrayType/WildcardType/TypeVariable เลย
  static final Type WEIRD_TYPE_1 = new Type() {};
  static final Type WEIRD_TYPE_2 = new Type() {};

  // ===================== newParameterizedTypeWithOwner / ParameterizedTypeImpl =====================

  @Test
  public void newParameterizedType_topLevelClass_noOwner_ok() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, pt.getRawType());
    assertNull(pt.getOwnerType());
    assertArrayEquals(new Type[]{String.class}, pt.getActualTypeArguments());
  }

  @Test(expected = IllegalArgumentException.class)
  public void newParameterizedType_nonStaticInnerClass_withoutOwner_throws() {
    // Inner.class เป็น non-static member class -> ownerType ต้องไม่เป็น null
    $Gson$Types.newParameterizedTypeWithOwner(null, NonStaticInner.class);
  }

  @Test
  public void newParameterizedType_nonStaticInnerClass_withOwner_ok() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(
        $Gson$TypesTest.class, NonStaticInner.class);
    assertEquals(NonStaticInner.class, pt.getRawType());
  }

  @Test(expected = NullPointerException.class)
  public void newParameterizedType_nullTypeArgument_throws() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, (Type) null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void newParameterizedType_primitiveTypeArgument_throws() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
  }

  @Test
  public void parameterizedTypeImpl_toString_zeroArgs() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class);
    assertEquals("java.util.List", pt.toString());
  }

  @Test
  public void parameterizedTypeImpl_toString_oneArg() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals("java.util.List<java.lang.String>", pt.toString());
  }

  @Test
  public void parameterizedTypeImpl_toString_multiArgs_loopBranch() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(
        null, Map.class, String.class, Integer.class);
    assertEquals("java.util.Map<java.lang.String, java.lang.Integer>", pt.toString());
  }

  @Test
  public void parameterizedTypeImpl_equalsAndHashCode() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertTrue(pt1.equals(pt2));
    assertEquals(pt1.hashCode(), pt2.hashCode());
  }

  // ===================== arrayOf / GenericArrayTypeImpl =====================

  @Test
  public void arrayOf_basic() {
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, gat.getGenericComponentType());
    assertEquals("java.lang.String[]", gat.toString());
  }

  @Test
  public void genericArrayTypeImpl_equalsAndHashCode() {
    GenericArrayType a = $Gson$Types.arrayOf(String.class);
    GenericArrayType b = $Gson$Types.arrayOf(String.class);
    assertTrue(a.equals(b));
    assertEquals(a.hashCode(), b.hashCode());
    assertFalse(a.equals("not a type"));
  }

  // ===================== subtypeOf / supertypeOf / WildcardTypeImpl =====================

  @Test
  public void subtypeOf_normalBound() {
    WildcardType w = $Gson$Types.subtypeOf(String.class);
    assertArrayEquals(new Type[]{String.class}, w.getUpperBounds());
    assertArrayEquals(new Type[]{}, w.getLowerBounds());
    assertEquals("? extends java.lang.String", w.toString());
  }

  @Test
  public void subtypeOf_objectBound_toStringIsQuestionMark() {
    WildcardType w = $Gson$Types.subtypeOf(Object.class);
    assertEquals("?", w.toString());
  }

  @Test
  public void subtypeOf_wildcardBound_takesUpperBounds() {
    WildcardType inner = $Gson$Types.supertypeOf(String.class); // upperBounds=[Object.class]
    WildcardType w = $Gson$Types.subtypeOf(inner);
    assertEquals("?", w.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void subtypeOf_primitiveBound_throws() {
    $Gson$Types.subtypeOf(int.class);
  }

  @Test
  public void supertypeOf_normalBound() {
    WildcardType w = $Gson$Types.supertypeOf(String.class);
    assertArrayEquals(new Type[]{String.class}, w.getLowerBounds());
    assertArrayEquals(new Type[]{Object.class}, w.getUpperBounds());
    assertEquals("? super java.lang.String", w.toString());
  }

  @Test
  public void supertypeOf_wildcardBound_takesLowerBounds_empty() {
    WildcardType inner = $Gson$Types.subtypeOf(String.class); // lowerBounds=[]
    WildcardType w = $Gson$Types.supertypeOf(inner);
    assertEquals("?", w.toString());
  }

  @Test
  public void wildcardTypeImpl_equalsAndHashCode() {
    WildcardType a = $Gson$Types.subtypeOf(String.class);
    WildcardType b = $Gson$Types.subtypeOf(String.class);
    assertTrue(a.equals(b));
    assertEquals(a.hashCode(), b.hashCode());
    assertFalse(a.equals(String.class));
  }

  // ===================== canonicalize =====================

  @Test
  public void canonicalize_nonArrayClass_returnsSame() {
    assertSame(String.class, $Gson$Types.canonicalize(String.class));
  }

  @Test
  public void canonicalize_arrayClass_wrapsAsGenericArrayType() {
    Type c = $Gson$Types.canonicalize(String[].class);
    assertTrue(c instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) c).getGenericComponentType());
  }

  @Test
  public void canonicalize_primitiveArrayClass_componentUnchecked() {
    Type c = $Gson$Types.canonicalize(int[].class);
    assertTrue(c instanceof GenericArrayType);
    assertEquals(int.class, ((GenericArrayType) c).getGenericComponentType());
  }

  @Test
  public void canonicalize_parameterizedType() throws Exception {
    Type jdkParam = GenericSuper.class.getDeclaredField("list").getGenericType(); // JDK's List<T>
    Type c = $Gson$Types.canonicalize(jdkParam);
    assertTrue(c instanceof ParameterizedType);
    assertTrue($Gson$Types.equals(jdkParam, c));
  }

  @Test
  public void canonicalize_genericArrayType() throws Exception {
    Type jdkArr = GenericSuper.class.getDeclaredField("arr").getGenericType(); // JDK's T[]
    Type c = $Gson$Types.canonicalize(jdkArr);
    assertTrue(c instanceof GenericArrayType);
    assertTrue($Gson$Types.equals(jdkArr, c));
  }

  @Test
  public void canonicalize_wildcardType() throws Exception {
    ParameterizedType pt = (ParameterizedType) GenericSuper.class.getDeclaredField("extendsList").getGenericType();
    Type jdkWildcard = pt.getActualTypeArguments()[0]; // JDK's ? extends T
    Type c = $Gson$Types.canonicalize(jdkWildcard);
    assertTrue(c instanceof WildcardType);
    assertTrue($Gson$Types.equals(jdkWildcard, c));
  }

  @Test
  public void canonicalize_typeVariable_returnsUnchanged_elseBranch() {
    TypeVariable<?> tv = GenericSuper.class.getTypeParameters()[0];
    assertSame(tv, $Gson$Types.canonicalize(tv));
  }

  // ===================== getRawType =====================

  @Test
  public void getRawType_class() {
    assertEquals(String.class, $Gson$Types.getRawType(String.class));
  }

  @Test
  public void getRawType_parameterizedType() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, $Gson$Types.getRawType(pt));
  }

  @Test
  public void getRawType_genericArrayType() {
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(String[].class, $Gson$Types.getRawType(gat));
  }

  @Test
  public void getRawType_typeVariable_returnsObjectClass() {
    TypeVariable<?> tv = GenericSuper.class.getTypeParameters()[0];
    assertEquals(Object.class, $Gson$Types.getRawType(tv));
  }

  @Test
  public void getRawType_wildcardType() {
    WildcardType w = $Gson$Types.subtypeOf(String.class);
    assertEquals(String.class, $Gson$Types.getRawType(w));
  }

  @Test(expected = IllegalArgumentException.class)
  public void getRawType_nullType_throws() {
    $Gson$Types.getRawType(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void getRawType_unsupportedType_throws() {
    $Gson$Types.getRawType(WEIRD_TYPE_1);
  }

  // ===================== equal (package-private helper) =====================

  @Test
  public void equal_bothNull_true() {
    assertTrue($Gson$Types.equal(null, null));
  }

  @Test
  public void equal_sameValueDifferentRef_true() {
    assertTrue($Gson$Types.equal(new String("x"), new String("x")));
  }

  @Test
  public void equal_differentValue_false() {
    assertFalse($Gson$Types.equal("x", "y"));
  }

  @Test
  public void equal_aNotNull_bNull_false() {
    assertFalse($Gson$Types.equal("x", null));
  }

  @Test
  public void equal_aNull_bNotNull_false() {
    assertFalse($Gson$Types.equal(null, "x"));
  }

  // ===================== equals(Type,Type) =====================

  @Test
  public void equals_sameReference_true() {
    assertTrue($Gson$Types.equals(String.class, String.class));
  }

  @Test
  public void equals_classVsClass_trueFalse() {
    assertTrue($Gson$Types.equals((Type) String.class, (Type) new String("").getClass()));
    assertFalse($Gson$Types.equals((Type) String.class, (Type) Integer.class));
  }

  @Test
  public void equals_parameterizedType_bNotParameterized_false() {
    Type pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertFalse($Gson$Types.equals(pt, List.class));
  }

  @Test
  public void equals_parameterizedType_matched_true() {
    Type pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertTrue($Gson$Types.equals(pt1, pt2));
  }

  @Test
  public void equals_parameterizedType_mismatchArgs_false() {
    Type pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
    assertFalse($Gson$Types.equals(pt1, pt2));
  }

  @Test
  public void equals_genericArrayType_bNotArray_false() {
    Type gat = $Gson$Types.arrayOf(String.class);
    assertFalse($Gson$Types.equals(gat, String.class));
  }

  @Test
  public void equals_genericArrayType_matched_true() {
    assertTrue($Gson$Types.equals($Gson$Types.arrayOf(String.class), $Gson$Types.arrayOf(String.class)));
  }

  @Test
  public void equals_wildcardType_bNotWildcard_false() {
    assertFalse($Gson$Types.equals($Gson$Types.subtypeOf(String.class), String.class));
  }

  @Test
  public void equals_wildcardType_matched_true() {
    assertTrue($Gson$Types.equals($Gson$Types.subtypeOf(String.class), $Gson$Types.subtypeOf(String.class)));
  }

  @Test
  public void equals_wildcardType_mismatch_false() {
    assertFalse($Gson$Types.equals($Gson$Types.subtypeOf(String.class), $Gson$Types.supertypeOf(String.class)));
  }

  @Test
  public void equals_typeVariable_bNotTypeVariable_false() {
    TypeVariable<?> tv = GenericSuper.class.getTypeParameters()[0];
    assertFalse($Gson$Types.equals(tv, String.class));
  }

  @Test
  public void equals_typeVariable_sameNameSameDeclaration_true() {
    TypeVariable<?> tv1 = GenericSuper.class.getTypeParameters()[0];
    TypeVariable<?> tv2 = GenericSuper.class.getTypeParameters()[0];
    assertTrue($Gson$Types.equals(tv1, tv2));
  }

  @Test
  public void equals_typeVariable_differentName_false() {
    TypeVariable<?> a = TwoParams.class.getTypeParameters()[0];
    TypeVariable<?> b = TwoParams.class.getTypeParameters()[1];
    assertFalse($Gson$Types.equals(a, b));
  }

  @Test
  public void equals_unsupportedType_elseBranch_false() {
    assertFalse($Gson$Types.equals(WEIRD_TYPE_1, WEIRD_TYPE_2));
  }

  // ===================== hashCodeOrZero =====================

  @Test
  public void hashCodeOrZero_null() {
    assertEquals(0, $Gson$Types.hashCodeOrZero(null));
  }

  @Test
  public void hashCodeOrZero_nonNull() {
    assertEquals("x".hashCode(), $Gson$Types.hashCodeOrZero("x"));
  }

  // ===================== typeToString =====================

  @Test
  public void typeToString_class() {
    assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
  }

  @Test
  public void typeToString_nonClass() {
    Type pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(pt.toString(), $Gson$Types.typeToString(pt));
  }

  // ===================== getGenericSupertype (package-private) =====================

  @Test
  public void getGenericSupertype_toResolveEqualsRawType_returnsContext() {
    Type result = $Gson$Types.getGenericSupertype(String.class, String.class, String.class);
    assertEquals(String.class, result);
  }

  @Test
  public void getGenericSupertype_interfaceExactMatch() {
    // Bar directly implements Foo -> interfaces[i]==toResolve
    Type result = $Gson$Types.getGenericSupertype(Bar.class, Bar.class, Foo.class);
    assertEquals(Foo.class, result);
  }

  @Test
  public void getGenericSupertype_interfaceAssignableRecurse() {
    // Impl implements Bar which extends Foo -> ต้อง recurse ผ่าน Bar
    Type result = $Gson$Types.getGenericSupertype(Impl.class, Impl.class, Foo.class);
    assertEquals(Foo.class, result);
  }

  @Test
  public void getGenericSupertype_superclassExactMatch() {
    Type result = $Gson$Types.getGenericSupertype(Parent.class, Parent.class, GrandParent.class);
    assertEquals(GrandParent.class, result);
  }

  @Test
  public void getGenericSupertype_superclassAssignableRecurse() {
    Type result = $Gson$Types.getGenericSupertype(Child.class, Child.class, GrandParent.class);
    assertEquals(GrandParent.class, result);
  }

  @Test
  public void getGenericSupertype_rawTypeIsInterface_skipsSuperclassLoop_fallback() {
    // Foo.isInterface()==true -> skip while(rawType != Object.class) block -> fallback return toResolve
    Type result = $Gson$Types.getGenericSupertype(Foo.class, Foo.class, Bar.class);
    assertEquals(Bar.class, result);
  }

  @Test
  public void getGenericSupertype_unrelatedType_fallbackReturnsToResolve() {
    Type result = $Gson$Types.getGenericSupertype(String.class, String.class, Runnable.class);
    assertEquals(Runnable.class, result);
  }

  // ===================== getSupertype (package-private) =====================

  @Test
  public void getSupertype_valid() {
    Type result = $Gson$Types.getSupertype(StringList.class, StringList.class, Collection.class);
    assertNotNull(result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void getSupertype_notAssignable_throws() {
    $Gson$Types.getSupertype(String.class, String.class, List.class);
  }

  // ===================== getArrayComponentType =====================

  @Test
  public void getArrayComponentType_classArray() {
    assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
  }

  @Test
  public void getArrayComponentType_genericArrayType() {
    assertEquals(String.class, $Gson$Types.getArrayComponentType($Gson$Types.arrayOf(String.class)));
  }

  // ===================== getCollectionElementType =====================

  @Test
  public void getCollectionElementType_parameterized() {
    Type element = $Gson$Types.getCollectionElementType(StringList.class, StringList.class);
    assertEquals(String.class, element);
  }

  @Test
  public void getCollectionElementType_raw_returnsObject() {
    Type element = $Gson$Types.getCollectionElementType(RawList.class, RawList.class);
    assertEquals(Object.class, element);
  }
  // หมายเหตุ: branch "collectionType instanceof WildcardType" ไม่ได้ทดสอบ
  // เนื่องจากยากที่จะสร้างสถานการณ์ผ่าน public reflection API ตามปกติให้ getSupertype()
  // คืนค่าเป็น WildcardType ที่ระดับบนสุด (ไม่มีหลักฐานพฤติกรรมชัดเจนในซอร์ส)

  // ===================== getMapKeyAndValueTypes =====================

  @Test
  public void getMapKeyAndValueTypes_propertiesSpecialCase() {
    Type[] kv = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    assertArrayEquals(new Type[]{String.class, String.class}, kv);
  }

  @Test
  public void getMapKeyAndValueTypes_parameterized() {
    Type[] kv = $Gson$Types.getMapKeyAndValueTypes(StringIntMap.class, StringIntMap.class);
    assertArrayEquals(new Type[]{String.class, Integer.class}, kv);
  }

  @Test
  public void getMapKeyAndValueTypes_raw_returnsObjectObject() {
    Type[] kv = $Gson$Types.getMapKeyAndValueTypes(RawMap.class, RawMap.class);
    assertArrayEquals(new Type[]{Object.class, Object.class}, kv);
  }

  // ===================== resolve (public overload) =====================

  @Test
  public void resolve_typeVariable_resolvedThroughSuperclass() {
    TypeVariable<?> tv = GenericSuper.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolve(StringSub.class, StringSub.class, tv);
    assertEquals(String.class, resolved);
  }

  @Test
  public void resolve_typeVariable_rawUsage_unresolvedReturnsSame() {
    TypeVariable<?> tv = GenericSuper.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolve(RawSub.class, RawSub.class, tv);
    assertSame(tv, resolved);
  }

  @Test
  public void resolve_classArray_unchanged_returnsOriginal() {
    // component ของ Class array เป็น Class เสมอ (concrete) จึงไม่มี type variable ให้ resolve เปลี่ยน
    Type resolved = $Gson$Types.resolve(StringSub.class, StringSub.class, String[].class);
    assertSame(String[].class, resolved);
  }

  @Test
  public void resolve_genericArrayType_changed() throws Exception {
    Type fieldType = GenericSuper.class.getDeclaredField("arr").getGenericType(); // T[]
    Type resolved = $Gson$Types.resolve(StringSub.class, StringSub.class, fieldType);
    assertTrue(resolved instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) resolved).getGenericComponentType());
  }

  @Test
  public void resolve_parameterizedType_changed() throws Exception {
    Type fieldType = GenericSuper.class.getDeclaredField("list").getGenericType(); // List<T>
    Type resolved = $Gson$Types.resolve(StringSub.class, StringSub.class, fieldType);
    assertTrue(resolved instanceof ParameterizedType);
    ParameterizedType pt = (ParameterizedType) resolved;
    assertEquals(List.class, pt.getRawType());
    assertEquals(String.class, pt.getActualTypeArguments()[0]);
  }

  @Test
  public void resolve_parameterizedType_unchanged_returnsSame() {
    Type pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type resolved = $Gson$Types.resolve(StringSub.class, StringSub.class, pt);
    assertSame(pt, resolved);
  }

  @Test
  public void resolve_wildcardType_upperBoundChanged() throws Exception {
    ParameterizedType listType = (ParameterizedType) GenericSuper.class.getDeclaredField("extendsList").getGenericType();
    Type wildcard = listType.getActualTypeArguments()[0]; // ? extends T
    Type resolved = $Gson$Types.resolve(StringSub.class, StringSub.class, wildcard);
    assertTrue(resolved instanceof WildcardType);
    assertEquals(String.class, ((WildcardType) resolved).getUpperBounds()[0]);
  }

  @Test
  public void resolve_wildcardType_lowerBoundChanged() throws Exception {
    ParameterizedType listType = (ParameterizedType) GenericSuper.class.getDeclaredField("superList").getGenericType();
    Type wildcard = listType.getActualTypeArguments()[0]; // ? super T
    Type resolved = $Gson$Types.resolve(StringSub.class, StringSub.class, wildcard);
    assertTrue(resolved instanceof WildcardType);
    assertEquals(String.class, ((WildcardType) resolved).getLowerBounds()[0]);
  }

  @Test
  public void resolve_wildcardType_unchanged_returnsSame() {
    WildcardType w = $Gson$Types.subtypeOf(String.class); // upper bound คอนกรีตแล้ว
    Type resolved = $Gson$Types.resolve(StringSub.class, StringSub.class, w);
    assertSame(w, resolved);
  }

  @Test
  public void resolve_plainClass_elseBranch_returnsSame() {
    Type resolved = $Gson$Types.resolve(StringSub.class, StringSub.class, String.class);
    assertSame(String.class, resolved);
  }

  // ===================== resolveTypeVariable (package-private) =====================

  @Test
  public void resolveTypeVariable_declaredByClass_parameterizedSupertype() {
    TypeVariable<?> tv = GenericSuper.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolveTypeVariable(StringSub.class, StringSub.class, tv);
    assertEquals(String.class, resolved);
  }

  @Test
  public void resolveTypeVariable_declaredByMethod_returnsUnknown() throws Exception {
    Method m = MethodGenericHolder.class.getMethod("identity", Object.class);
    TypeVariable<?> tv = m.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolveTypeVariable(MethodGenericHolder.class, MethodGenericHolder.class, tv);
    assertSame(tv, resolved); // declaredByRaw == null -> return unknown
  }

  @Test
  public void resolveTypeVariable_declaredBySupertype_notParameterized_returnsUnknown() {
    TypeVariable<?> tv = GenericHolder.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolveTypeVariable(RawHolder.class, RawHolder.class, tv);
    assertSame(tv, resolved); // declaredBy เป็น raw Class ไม่ใช่ ParameterizedType
  }

  // ===================== checkNotPrimitive (package-private) =====================

  @Test
  public void checkNotPrimitive_nonPrimitiveClass_noException() {
    $Gson$Types.checkNotPrimitive(String.class); // ไม่ throw
  }

  @Test(expected = IllegalArgumentException.class)
  public void checkNotPrimitive_primitiveClass_throws() {
    $Gson$Types.checkNotPrimitive(int.class);
  }

  @Test
  public void checkNotPrimitive_nonClassType_noException() {
    TypeVariable<?> tv = GenericSuper.class.getTypeParameters()[0];
    $Gson$Types.checkNotPrimitive(tv); // !(type instanceof Class) == true -> short-circuit, ไม่ throw
  }

  // ===================== private constructor =====================

  @Test(expected = InvocationTargetException.class)
  public void privateConstructor_throwsUnsupportedOperationException() throws Exception {
    Constructor<$Gson$Types> constructor = $Gson$Types.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    constructor.newInstance();
  }
}
