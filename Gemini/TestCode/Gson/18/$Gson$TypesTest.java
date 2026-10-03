package com.google.gson.internal;

import org.junit.Test;
import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;

import static org.junit.Assert.*;

public class $Gson$TypesTest {

  // Dummy classes for testing reflection and generics
  private static class SampleGenericClass<T> implements Map<String, T> {
    @Override public int size() { return 0; }
    @Override public boolean isEmpty() { return false; }
    @Override public boolean containsKey(Object key) { return false; }
    @Override public boolean containsValue(Object value) { return false; }
    @Override public T get(Object key) { return null; }
    @Override public T put(String key, T value) { return null; }
    @Override public T remove(Object key) { return null; }
    @Override public void putAll(Map<? extends String, ? extends T> m) {}
    @Override public void clear() {}
    @Override public Set<String> keySet() { return null; }
    @Override public Collection<T> values() { return null; }
    @Override public Set<Entry<String, T>> entrySet() { return null; }
  }

  private static class NestedClass {}
  public static class StaticNestedClass {}

  private T sampleField;

  @Test
  public void testCanonicalizeClassAndArray() {
    Type classType = String.class;
    assertEquals(String.class, $Gson$Types.canonicalize(classType));

    Class<?> arrayClass = String[].class;
    Type canonicalArray = $Gson$Types.canonicalize(arrayClass);
    assertTrue(canonicalArray instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) canonicalArray).getGenericComponentType());
  }

  @Test
  public void testCanonicalizeParameterizedType() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type canonical = $Gson$Types.canonicalize(pt);
    assertEquals(pt, canonical);
  }

  @Test
  public void testCanonicalizeGenericArrayType() {
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    Type canonical = $Gson$Types.canonicalize(gat);
    assertEquals(gat, canonical);
  }

  @Test
  public void testCanonicalizeWildcardType() {
    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    Type canonical = $Gson$Types.canonicalize(wt);
    assertEquals(wt, canonical);
  }

  @Test
  public void testCanonicalizeUnsupportedType() {
    Type unknownType = new Type() {};
    assertEquals(unknownType, $Gson$Types.canonicalize(unknownType));
  }

  @Test
  public void testGetRawTypeValidCases() {
    assertEquals(String.class, $Gson$Types.getRawType(String.class));

    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, $Gson$Types.getRawType(pt));

    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(String[].class, $Gson$Types.getRawType(gat));

    WildcardType wt = $Gson$Types.subtypeOf(String.class);
    assertEquals(String.class, $Gson$Types.getRawType(wt));
  }

  @Test
  public void testGetRawTypeVariable() throws Exception {
    Field field = $Gson$TypesTest.class.getDeclaredField("sampleField");
    Type typeVar = field.getGenericType();
    assertEquals(Object.class, $Gson$Types.getRawType(typeVar));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawTypeInvalid() {
    $Gson$Types.getRawType(new Type() {});
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawTypeNull() {
    $Gson$Types.getRawType(null);
  }

  @Test
  public void testEqualsTypes() {
    Type t1 = String.class;
    Type t2 = String.class;
    Type t3 = Integer.class;

    assertTrue($Gson$Types.equals(null, null));
    assertFalse($Gson$Types.equals(t1, null));
    assertFalse($Gson$Types.equals(null, t1));
    assertTrue($Gson$Types.equals(t1, t2));
    assertFalse($Gson$Types.equals(t1, t3));

    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
    assertTrue($Gson$Types.equals(pt1, pt2));
    assertFalse($Gson$Types.equals(pt1, pt3));
    assertFalse($Gson$Types.equals(pt1, t1));

    GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);
    assertTrue($Gson$Types.equals(gat1, gat2));
    assertFalse($Gson$Types.equals(gat1, gat3));
    assertFalse($Gson$Types.equals(gat1, t1));

    WildcardType wt1 = $Gson$Types.subtypeOf(String.class);
    WildcardType wt2 = $Gson$Types.subtypeOf(String.class);
    WildcardType wt3 = $Gson$Types.subtypeOf(Integer.class);
    assertTrue($Gson$Types.equals(wt1, wt2));
    assertFalse($Gson$Types.equals(wt1, wt3));
    assertFalse($Gson$Types.equals(wt1, t1));

    try {
      Field f1 = $Gson$TypesTest.class.getDeclaredField("sampleField");
      assertFalse($Gson$Types.equals(f1.getGenericType(), t1));
      assertFalse($Gson$Types.equals(t1, f1.getGenericType()));
      assertTrue($Gson$Types.equals(f1.getGenericType(), f1.getGenericType()));
    } catch (Exception ignored) {}
  }

  @Test
  public void testSubtypeAndSupertypeWildcards() {
    WildcardType sub = $Gson$Types.subtypeOf(String.class);
    assertEquals("? extends java.lang.String", sub.toString());
    assertEquals(1, sub.getUpperBounds().length);
    assertEquals(0, sub.getLowerBounds().length);

    WildcardType subWildcard = $Gson$Types.subtypeOf(sub);
    assertEquals("? extends java.lang.String", subWildcard.toString());

    WildcardType sup = $Gson$Types.supertypeOf(String.class);
    assertEquals("? super java.lang.String", sup.toString());
    assertEquals(1, sup.getLowerBounds().length);

    WildcardType supWildcard = $Gson$Types.supertypeOf(sub);
    assertEquals("? super ? extends java.lang.String", supWildcard.toString());

    WildcardType objSub = $Gson$Types.subtypeOf(Object.class);
    assertEquals("?", objSub.toString());
  }

  @Test
  public void testGetCollectionAndMapTypes() {
    Type collType = $Gson$Types.getCollectionElementType(List.class, List.class);
    assertEquals(Object.class, collType);

    Type[] mapTypes = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    assertEquals(String.class, mapTypes[0]);
    assertEquals(String.class, mapTypes[1]);

    ParameterizedType sampleMap = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    Type[] resolvedMapTypes = $Gson$Types.getMapKeyAndValueTypes(sampleMap, Map.class);
    assertEquals(String.class, resolvedMapTypes[0]);
    assertEquals(Integer.class, resolvedMapTypes[1]);
  }

  @Test
  public void testGetArrayComponentType() {
    assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, $Gson$Types.getArrayComponentType(gat));
  }

  @Test(expected = ClassCastException.class)
  public void testGetArrayComponentTypeInvalid() {
    $Gson$Types.getArrayComponentType(String.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testParameterizedTypeInvalidOwner() {
    // Non-static inner class requires an owner type
    $Gson$Types.newParameterizedTypeWithOwner(null, NestedClass.class);
  }

  @Test
  public void testParameterizedTypeValidOwnerOrStatic() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, StaticNestedClass.class);
    assertNotNull(pt);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWildcardInvalidBounds() {
    // lowerBounds.length > 1 is invalid
    new $Gson$Types.WildcardTypeImpl(new Type[]{Object.class}, new Type[]{String.class, Integer.class});
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWildcardInvalidUpperBoundLength() {
    // upperBounds.length != 1 is invalid
    new $Gson$Types.WildcardTypeImpl(new Type[]{}, new Type[]{});
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWildcardPrimitiveBound() {
    $Gson$Types.subtypeOf(int.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testParameterizedPrimitiveArgument() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
  }

  @Test
  public void testResolveTypeVariableAndGenericSupertype() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, SampleGenericClass.class, String.class);
    Type resolved = $Gson$Types.resolve(pt, SampleGenericClass.class, Map.class);
    assertNotNull(resolved);

    Type resolvedDirect = $Gson$Types.resolve(String.class, String.class, String.class);
    assertEquals(String.class, resolvedDirect);

    Type resolvedArray = $Gson$Types.resolve(String.class, String.class, String[].class);
    assertEquals(String[].class, resolvedArray);

    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    Type resolvedGat = $Gson$Types.resolve(String.class, String.class, gat);
    assertEquals(gat, resolvedGat);

    WildcardType wt = $Gson$Types.subtypeOf(String.class);
    Type resolvedWt = $Gson$Types.resolve(String.class, String.class, wt);
    assertEquals(wt, resolvedWt);
  }

  @Test
  public void testTypeToString() {
    assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals("java.util.List<java.lang.String>", $Gson$Types.typeToString(pt));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testPrivateConstructor() throws Exception {
    java.lang.reflect.Constructor<$Gson$Types> c = (java.lang.reflect.Constructor<$Gson$Types>) $Gson$Types.class.getDeclaredConstructor();
    c.setAccessible(true);
    try {
      c.newInstance();
    } catch (java.lang.reflect.InvocationTargetException e) {
      throw (RuntimeException) e.getTargetException();
    }
  }
}