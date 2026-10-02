package com.google.gson;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for {@link TypeInfoFactory}.
 *
 * หมายเหตุ: TypeInfo / TypeInfoArray / TypeUtils / Preconditions ไม่มี source ให้ตรวจสอบ
 * จึงตรวจผลลัพธ์แบบ black-box (assertNotNull / exception type ที่ระบุใน source ของ TypeInfoFactory เท่านั้น)
 */
public class TypeInfoFactoryTest {

  // ---------------------- Fixture classes ----------------------

  static class SimpleClass {
    public String simpleField;
  }

  static class SimpleGenericHolder {
    public List<String> listField;
  }

  static class WildcardHolder {
    public List<? extends Number> wildcardField;
  }

  static class GenericClass<T> {
    public T genericField;
    public T[] genericArrayField;
    public List<T> listOfTField;
    public List<T>[] listArrayField;
  }

  static class GenericContainer {
    public GenericClass<String> containerField;
  }

  static class AnotherGenericClass<X> {
    public X anotherField;
  }

  static class AnotherGenericContainer {
    public AnotherGenericClass<String> containerField;
  }

  static class MultiTypeParamClass<A, B> {
    public B secondField;
  }

  static class MultiTypeParamContainer {
    public MultiTypeParamClass<String, Integer> containerField;
  }

  // ---------------------- getTypeInfoForArray ----------------------

  @Test
  public void testGetTypeInfoForArray_ValidObjectArray() {
    TypeInfoArray result = TypeInfoFactory.getTypeInfoForArray(String[].class);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForArray_ValidPrimitiveArray() {
    // boundary: primitive array
    TypeInfoArray result = TypeInfoFactory.getTypeInfoForArray(int[].class);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForArray_NonArray_ThrowsIllegalArgumentException() {
    try {
      TypeInfoFactory.getTypeInfoForArray(String.class);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // ok - มาจาก Preconditions.checkArgument(false)
    }
  }

  @Test
  public void testGetTypeInfoForArray_NullType_ThrowsException() {
    // boundary/null: ไม่ทราบพฤติกรรมแน่ชัดของ TypeUtils.isArray(null) เพราะไม่มี source
    // จึงตรวจสอบเพียงว่ามี exception เกิดขึ้น (ไม่ระบุ exact type)
    try {
      TypeInfoFactory.getTypeInfoForArray(null);
      fail("Expected some exception for null input");
    } catch (RuntimeException expected) {
      // ok
    }
  }

  // ---------------------- getTypeInfoForField: Class branch ----------------------

  @Test
  public void testGetTypeInfoForField_ClassTypeField_Success() throws Exception {
    Field f = SimpleClass.class.getDeclaredField("simpleField");
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(f, SimpleClass.class);
    assertNotNull(result);
  }

  // ---------------------- getTypeInfoForField: ParameterizedType branch ----------------------

  @Test
  public void testGetTypeInfoForField_ParameterizedTypeWithConcreteArgs_Success() throws Exception {
    Field f = SimpleGenericHolder.class.getDeclaredField("listField");
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(f, SimpleGenericHolder.class);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_ParameterizedTypeWithTypeVariableArg_Success() throws Exception {
    Field f = GenericClass.class.getDeclaredField("listOfTField");
    Type parentType = GenericContainer.class.getDeclaredField("containerField").getGenericType();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(f, parentType);
    assertNotNull(result);
  }

  // ---------------------- getTypeInfoForField: TypeVariable branch ----------------------

  @Test
  public void testGetTypeInfoForField_TypeVariableDirect_ParentParameterized_Success() throws Exception {
    Field f = GenericClass.class.getDeclaredField("genericField");
    Type parentType = GenericContainer.class.getDeclaredField("containerField").getGenericType();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(f, parentType);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_TypeVariableSecondParameter_Success() throws Exception {
    // ทดสอบ loop ของ getIndex ให้เดินหลายรอบก่อนพบ match (index != 0)
    Field f = MultiTypeParamClass.class.getDeclaredField("secondField");
    Type parentType =
        MultiTypeParamContainer.class.getDeclaredField("containerField").getGenericType();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(f, parentType);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_TypeVariableDirect_ParentNotParameterized_ThrowsUnsupportedOperationException()
      throws Exception {
    Field f = GenericClass.class.getDeclaredField("genericField");
    try {
      // ส่ง raw Class (ไม่ใช่ ParameterizedType) เป็น typeDefiningF
      TypeInfoFactory.getTypeInfoForField(f, GenericClass.class);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException expected) {
      // ok
    }
  }

  @Test
  public void testGetTypeInfoForField_TypeVariableMismatch_ThrowsIllegalStateException()
      throws Exception {
    // Field มาจาก GenericClass<T> แต่ typeDefiningF เป็น ParameterizedType ของคลาสอื่น (AnotherGenericClass<X>)
    // => getIndex หา TypeVariable T ไม่พบใน classTypeVariables ของ AnotherGenericClass
    Field f = GenericClass.class.getDeclaredField("genericField");
    Type mismatchParentType =
        AnotherGenericContainer.class.getDeclaredField("containerField").getGenericType();
    try {
      TypeInfoFactory.getTypeInfoForField(f, mismatchParentType);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      // ok
    }
  }

  // ---------------------- getTypeInfoForField: WildcardType branch ----------------------

  @Test
  public void testGetTypeInfoForField_WildcardType_Success() throws Exception {
    Field f = WildcardHolder.class.getDeclaredField("wildcardField");
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(f, WildcardHolder.class);
    assertNotNull(result);
  }

  // ---------------------- getTypeInfoForField: GenericArrayType branch ----------------------

  @Test
  public void testGetTypeInfoForField_GenericArrayType_ResolvesToClass_Success() throws Exception {
    // T[] -> resolve T เป็น String.class (Class) -> ternary true branch (wrapWithArray)
    Field f = GenericClass.class.getDeclaredField("genericArrayField");
    Type parentType = GenericContainer.class.getDeclaredField("containerField").getGenericType();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(f, parentType);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeInfoForField_GenericArrayType_ResolvesToNonClass_Success() throws Exception {
    // List<T>[] -> component (List<T>) resolve เป็น ParameterizedTypeImpl(List, [String]) ซึ่งไม่ equal กับ
    // component เดิม (args ต่างกัน: T vs String.class) และไม่ใช่ Class -> else branch (GenericArrayTypeImpl)
    Field f = GenericClass.class.getDeclaredField("listArrayField");
    Type parentType = GenericContainer.class.getDeclaredField("containerField").getGenericType();
    TypeInfo result = TypeInfoFactory.getTypeInfoForField(f, parentType);
    assertNotNull(result);
  }

  // ---------------------- Null / boundary inputs on public API ----------------------

  @Test
  public void testGetTypeInfoForField_NullField_ThrowsNullPointerException() {
    try {
      TypeInfoFactory.getTypeInfoForField(null, SimpleClass.class);
      fail("Expected NullPointerException from f.getGenericType()");
    } catch (NullPointerException expected) {
      // ok - เกิดจากการเรียก f.getGenericType() บน null reference
    }
  }

  @Test
  public void testGetTypeInfoForField_NullTypeDefiningF_ThrowsException() throws Exception {
    // boundary/null: ไม่ทราบพฤติกรรมแน่ชัดของ TypeUtils.toRawClass(null) เพราะไม่มี source
    // ตรวจสอบเพียงว่ามี exception เกิดขึ้น (ไม่ระบุ exact type)
    Field f = SimpleClass.class.getDeclaredField("simpleField");
    try {
      TypeInfoFactory.getTypeInfoForField(f, null);
      fail("Expected some exception for null typeDefiningF");
    } catch (RuntimeException expected) {
      // ok
    }
  }

  // ---------------------- Private method tests via reflection ----------------------
  // ใช้เพื่อเข้าถึง branch ที่ไม่สามารถ trigger ได้จริงผ่าน public API ด้วย reflection ปกติ

  @Test
  public void testGetActualType_UnsupportedType_ThrowsIllegalArgumentException() throws Exception {
    // Type ที่ไม่ใช่ Class/ParameterizedType/GenericArrayType/TypeVariable/WildcardType -> else branch
    Type fakeType = new Type() {
      @Override
      public String toString() {
        return "FakeType";
      }
    };
    Method getActualType =
        TypeInfoFactory.class.getDeclaredMethod("getActualType", Type.class, Type.class, Class.class);
    getActualType.setAccessible(true);
    try {
      getActualType.invoke(null, fakeType, String.class, String.class);
      fail("Expected IllegalArgumentException");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof IllegalArgumentException);
    }
  }

  @Test
  public void testGetActualType_GenericArrayType_ComponentUnchanged_ReturnsSameInstance()
      throws Exception {
    // componentType.equals(actualType) == true -> return castedType (early return) แบบ deterministic
    final Type component = String.class;
    GenericArrayType fakeArrayType = new GenericArrayType() {
      @Override
      public Type getGenericComponentType() {
        return component;
      }
    };
    Method getActualType =
        TypeInfoFactory.class.getDeclaredMethod("getActualType", Type.class, Type.class, Class.class);
    getActualType.setAccessible(true);
    Object result = getActualType.invoke(null, fakeArrayType, String.class, String.class);
    assertSame(fakeArrayType, result);
  }

  @Test
  public void testExtractRealTypes_NullArgument_ThrowsException() throws Exception {
    // Preconditions.checkNotNull(null) -> คาดว่า throw exception (ไม่มี source ยืนยัน exact type)
    Method extractRealTypes =
        TypeInfoFactory.class.getDeclaredMethod(
            "extractRealTypes", Type[].class, Type.class, Class.class);
    extractRealTypes.setAccessible(true);
    try {
      extractRealTypes.invoke(null, (Type[]) null, String.class, String.class);
      fail("Expected an exception due to null actualTypeArguments");
    } catch (InvocationTargetException e) {
      assertNotNull(e.getCause());
    }
  }
}
