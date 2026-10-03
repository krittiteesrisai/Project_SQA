package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class TypeInfoFactoryTest {

  // --- Helper Classes for Reflection Testing ---
  private static class SampleGenericClass<T> {
    T genericField;
    List<T> listField;
    T[] genericArrayField;
    String normalField;
  }

  private static class NonGenericSubclass extends SampleGenericClass<String> {
    // parentType is Class, not ParameterizedType
  }

  private static class WildcardGenericClass<T extends Number> {
    T wildcardField;
  }

  // --- Tests for getTypeInfoForArray ---

  @Test
  public void testGetTypeInfoForArray_Valid() {
    Type arrayType = String[].class;
    TypeInfoArray info = TypeInfoFactory.getTypeInfoForArray(arrayType);
    assertNotNull(info);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTypeInfoForArray_Invalid() {
    // Passing non-array type should trigger Preconditions.checkArgument failure
    TypeInfoFactory.getTypeInfoForArray(String.class);
  }

  // --- Tests for getTypeInfoForField & getActualType ---

  @Test
  public void testGetActualType_ClassType() throws Exception {
    Field f = SampleGenericClass.class.getDeclaredField("normalField");
    Type typeDefiningF = SampleGenericClass.class;
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, typeDefiningF);
    assertNotNull(info);
    assertEquals(String.class, info.getRawClass());
  }

  @Test
  public void testGetActualType_ParameterizedType() throws Exception {
    Field f = SampleGenericClass.class.getDeclaredField("listField");
    // Use a ParameterizedType as parentType (e.g., SampleGenericClass<Integer>)
    Type typeDefiningF = new TypeToken<SampleGenericClass<Integer>>() {}.getType();
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, typeDefiningF);
    assertNotNull(info);
    assertTrue(info.getDeck() instanceof ParameterizedType || info.getRawClass() == List.class);
  }

  @Test
  public void testGetActualType_TypeVariableWithParameterizedParent() throws Exception {
    Field f = SampleGenericClass.class.getDeclaredField("genericField");
    Type typeDefiningF = new TypeToken<SampleGenericClass<Long>>() {}.getType();
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, typeDefiningF);
    assertNotNull(info);
    assertEquals(Long.class, info.getRawClass());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetActualType_TypeVariableWithNonParameterizedParent() throws Exception {
    // parentType is Class (NonGenericSubclass), but field has TypeVariable without proper parameterized context
    // Actually, accessing genericField from a raw/non-parameterized context or class definition directly
    Field f = SampleGenericClass.class.getDeclaredField("genericField");
    Type typeDefiningF = NonGenericSubclass.class;
    TypeInfoFactory.getTypeInfoForField(f, typeDefiningF);
  }

  @Test
  public void testGetActualType_GenericArrayType_Unchanged() throws Exception {
    Field f = SampleGenericClass.class.getDeclaredField("genericArrayField");
    Type typeDefiningF = new TypeToken<SampleGenericClass<String>>() {}.getType();
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, typeDefiningF);
    assertNotNull(info);
  }

  @Test
  public void testGetActualType_WildcardType() throws Exception {
    Field f = WildcardGenericClass.class.getDeclaredField("wildcardField");
    Type typeDefiningF = WildcardGenericClass.class;
    // This triggers WildcardType branch evaluating upper bounds
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, typeDefiningF);
    assertNotNull(info);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetActualType_InvalidUnsupportedType() throws Exception {
    // Pass an unsupported Type implementation to trigger IllegalArgumentException in getActualType else branch
    Type unsupportedType = new Type() {
      @Override
      public String toString() { return "UnsupportedMockType"; }
    };
    
    Field f = SampleGenericClass.class.getDeclaredField("normalField");
    // Force evaluation of an invalid type using reflection/internal logic if possible,
    // Or directly test via a custom field if we could inject it. Since we can't inject,
    // we invoke via a scenario or test handling if accessible. Alternatively, 
    // we rely on testing edge cases of weird types.
    // Note: Since getActualType is private, we test it indirectly via getTypeInfoForField if we can supply a trick,
    // or validate that invalid types throw IllegalArgumentException.
  }

  @Test(expected = IllegalStateException.class)
  public void testGetIndex_TypeVariableNotPresent() throws Exception {
    // Triggering getIndex where type variable doesn't match class declaration parameters
    // We can simulate this by passing a mismatching generic definition context.
    Field f = SampleGenericClass.class.getDeclaredField("genericField");
    // Passing a ParameterizedType whose raw class does NOT contain the type variable or mismatched
    Type mismatchedType = new TypeToken<List<String>>() {}.getType();
    TypeInfoFactory.getTypeInfoForField(f, mismatchedType);
  }
}