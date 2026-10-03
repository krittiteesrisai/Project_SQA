package org.apache.commons.lang3.reflect;

import org.junit.Test;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TypeUtilsTest<T extends Number & Comparable<T>> {

    // Fixture types for reflection
    public List<String> stringList;
    public List<Number> numberList;
    public List<? extends Number> numberExtendsList;
    public List<? super Integer> integerSuperList;
    public List<?> wildcardList;
    public ArrayList<String> stringArrayList;
    public Comparable<String> stringComparable;

    public T typeVarField;
    public T[] genericArrayField;
    public List<String>[] stringListArrayField;
    public List<?>[] wildcardListArrayField;
    public String[] stringArrayField;
    public int[] intArrayField;

    public static class Outer<O> {
        public class Inner<I> {}
    }
    public Outer<String>.Inner<Integer> innerField;

    public interface InterfaceA<A> {}
    public interface InterfaceB<B> extends InterfaceA<B> {}
    public static class ImplB<X> implements InterfaceB<X> {}
    public static class ImplAB<Y> implements InterfaceA<Y>, InterfaceB<Y> {}

    public static class CustomType implements Type {
        @Override
        public String toString() {
            return "CustomType";
        }
    }

    private static Type getFieldType(String fieldName) throws NoSuchFieldException {
        return TypeUtilsTest.class.getField(fieldName).getGenericType();
    }

    @Test
    public void testConstructor() {
        assertNotNull(new TypeUtils());
    }

    @Test
    public void testIsAssignable_NullAndPrimitiveCases() {
        // null target
        assertFalse(TypeUtils.isAssignable(String.class, (Type) null));
        // null type to primitive class
        assertFalse(TypeUtils.isAssignable(null, int.class));
        // null type to non-primitive class
        assertTrue(TypeUtils.isAssignable(null, String.class));
        // null to null
        assertTrue(TypeUtils.isAssignable(null, (Type) null));
    }

    @Test
    public void testIsAssignable_ClassToClass() {
        assertTrue(TypeUtils.isAssignable(String.class, Object.class));
        assertTrue(TypeUtils.isAssignable(Integer.class, Number.class));
        assertFalse(TypeUtils.isAssignable(Number.class, Integer.class));
        assertTrue(TypeUtils.isAssignable(int.class, Integer.class));
        assertTrue(TypeUtils.isAssignable(Integer.class, int.class));
        assertTrue(TypeUtils.isAssignable(String.class, String.class));
    }

    @Test
    public void testIsAssignable_ParameterizedTypes() throws NoSuchFieldException {
        Type strListType = getFieldType("stringList");
        Type numListType = getFieldType("numberList");
        Type numExtendsListType = getFieldType("numberExtendsList");
        Type intSuperListType = getFieldType("integerSuperList");
        Type wildcardListType = getFieldType("wildcardList");
        Type strArrayListType = getFieldType("stringArrayList");

        // Identity
        assertTrue(TypeUtils.isAssignable(strListType, strListType));
        // Subclass to Superclass with same type arg
        assertTrue(TypeUtils.isAssignable(strArrayListType, strListType));
        // Incompatible type args
        assertFalse(TypeUtils.isAssignable(strListType, numListType));
        // Wildcard bounds (? extends Number)
        assertTrue(TypeUtils.isAssignable(numListType, numExtendsListType));
        assertFalse(TypeUtils.isAssignable(strListType, numExtendsListType));
        // Wildcard bounds (? super Integer)
        assertTrue(TypeUtils.isAssignable(numListType, intSuperListType));
        assertFalse(TypeUtils.isAssignable(strListType, intSuperListType));
        // Unbounded wildcard
        assertTrue(TypeUtils.isAssignable(strListType, wildcardListType));
        // Raw to Parameterized
        assertTrue(TypeUtils.isAssignable(List.class, wildcardListType));
        // Null checks on ParameterizedType
        assertTrue(TypeUtils.isAssignable(null, strListType));
    }

    @Test
    public void testIsAssignable_GenericArrayTypes() throws NoSuchFieldException {
        Type genericArray = getFieldType("genericArrayField");
        Type strListArray = getFieldType("stringListArrayField");
        Type wildcardListArray = getFieldType("wildcardListArrayField");
        Type strArray = getFieldType("stringArrayField");

        // Identity
        assertTrue(TypeUtils.isAssignable(genericArray, genericArray));
        assertTrue(TypeUtils.isAssignable(strListArray, wildcardListArray));
        assertFalse(TypeUtils.isAssignable(wildcardListArray, strListArray));

        // Array Class to GenericArrayType
        assertFalse(TypeUtils.isAssignable(strArray, strListArray));
        // GenericArrayType to Object & Array class
        assertTrue(TypeUtils.isAssignable(genericArray, Object.class));
        assertTrue(TypeUtils.isAssignable(genericArray, Number[].class));
        assertFalse(TypeUtils.isAssignable(genericArray, String[].class));

        // ParameterizedType to GenericArrayType should be false
        Type strListType = getFieldType("stringList");
        assertFalse(TypeUtils.isAssignable(strListType, genericArray));

        // Null to GenericArrayType
        assertTrue(TypeUtils.isAssignable(null, genericArray));
    }

    @Test
    public void testIsAssignable_WildcardTypes() throws NoSuchFieldException {
        ParameterizedType numExtendsListType = (ParameterizedType) getFieldType("numberExtendsList");
        WildcardType extendsNum = (WildcardType) numExtendsListType.getActualTypeArguments()[0];

        ParameterizedType intSuperListType = (ParameterizedType) getFieldType("integerSuperList");
        WildcardType superInt = (WildcardType) intSuperListType.getActualTypeArguments()[0];

        // Identity
        assertTrue(TypeUtils.isAssignable(extendsNum, extendsNum));
        assertTrue(TypeUtils.isAssignable(superInt, superInt));

        // Class vs Wildcard
        assertTrue(TypeUtils.isAssignable(Integer.class, extendsNum));
        assertFalse(TypeUtils.isAssignable(String.class, extendsNum));
        assertTrue(TypeUtils.isAssignable(Number.class, superInt));
        assertFalse(TypeUtils.isAssignable(String.class, superInt));

        // Wildcard vs Wildcard
        assertTrue(TypeUtils.isAssignable(extendsNum, extendsNum));
        assertFalse(TypeUtils.isAssignable(superInt, extendsNum));

        // Wildcard cannot be assigned to Class
        assertFalse(TypeUtils.isAssignable(extendsNum, Number.class));
    }

    @Test
    public void testIsAssignable_TypeVariables() throws NoSuchFieldException {
        TypeVariable<?> typeVar = (TypeVariable<?>) getFieldType("typeVarField");

        // Identity
        assertTrue(TypeUtils.isAssignable(typeVar, typeVar));
        // TypeVariable to its bound (Number, Comparable)
        assertTrue(TypeUtils.isAssignable(typeVar, Number.class));
        assertTrue(TypeUtils.isAssignable(typeVar, Comparable.class));
        assertFalse(TypeUtils.isAssignable(typeVar, String.class));

        // Class to TypeVariable is false
        assertFalse(TypeUtils.isAssignable(Integer.class, typeVar));
        // Null to TypeVariable is true
        assertTrue(TypeUtils.isAssignable(null, typeVar));
    }

    @Test(expected = IllegalStateException.class)
    public void testIsAssignable_UnhandledTypeException() {
        Type custom = new CustomType();
        TypeUtils.isAssignable(custom, custom);
    }

    @Test
    public void testGetTypeArguments_ParameterizedAndHierarchy() throws NoSuchFieldException {
        Type strListType = getFieldType("stringList");
        Map<TypeVariable<?>, Type> typeArgs = TypeUtils.getTypeArguments((ParameterizedType) strListType);
        assertEquals(1, typeArgs.size());
        assertEquals(String.class, typeArgs.values().iterator().next());

        // Interface hierarchy mapping
        Map<TypeVariable<?>, Type> bArgs = TypeUtils.getTypeArguments(ImplB.class, InterfaceA.class);
        assertNotNull(bArgs);
        assertEquals(1, bArgs.size());

        // Interface implemented multiple times
        Map<TypeVariable<?>, Type> abArgs = TypeUtils.getTypeArguments(ImplAB.class, InterfaceA.class);
        assertNotNull(abArgs);

        // Primitive types
        Map<TypeVariable<?>, Type> primArgs = TypeUtils.getTypeArguments(int.class, Integer.class);
        assertNotNull(primArgs);
        Map<TypeVariable<?>, Type> primToPrim = TypeUtils.getTypeArguments(int.class, long.class);
        assertNotNull(primToPrim);
        assertTrue(primToPrim.isEmpty());

        // Incompatible hierarchy returns null
        assertNull(TypeUtils.getTypeArguments(String.class, List.class));
    }

    @Test
    public void testGetTypeArguments_OwnerHierarchy() throws NoSuchFieldException {
        Type innerType = getFieldType("innerField");
        Map<TypeVariable<?>, Type> args = TypeUtils.getTypeArguments(innerType, Outer.Inner.class);
        assertNotNull(args);
        assertEquals(2, args.size());
    }

    @Test
    public void testGetTypeArguments_GenericArrayAndWildcard() throws NoSuchFieldException {
        Type strListArray = getFieldType("stringListArrayField");
        Map<TypeVariable<?>, Type> arrayArgs = TypeUtils.getTypeArguments(strListArray, List[].class);
        assertNotNull(arrayArgs);

        Type numExtendsListType = getFieldType("numberExtendsList");
        WildcardType wildcardType = (WildcardType) ((ParameterizedType) numExtendsListType).getActualTypeArguments()[0];
        Map<TypeVariable<?>, Type> wildcardArgs = TypeUtils.getTypeArguments(wildcardType, Number.class);
        assertNotNull(wildcardArgs);

        Type typeVar = getFieldType("typeVarField");
        Map<TypeVariable<?>, Type> varArgs = TypeUtils.getTypeArguments(typeVar, Number.class);
        assertNotNull(varArgs);
    }

    @Test
    public void testDetermineTypeArguments() throws NoSuchFieldException {
        ParameterizedType strListType = (ParameterizedType) getFieldType("stringList");
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(ArrayList.class, strListType);
        assertNotNull(result);
        assertEquals(String.class, result.get(ArrayList.class.getTypeParameters()[0]));

        // Incompatible types
        assertNull(TypeUtils.determineTypeArguments(Set.class, strListType));

        // Exact match
        Map<TypeVariable<?>, Type> exact = TypeUtils.determineTypeArguments(List.class, strListType);
        assertNotNull(exact);
        assertEquals(String.class, exact.get(List.class.getTypeParameters()[0]));
    }

    @Test
    public void testIsInstance() throws NoSuchFieldException {
        Type strListType = getFieldType("stringList");

        assertFalse(TypeUtils.isInstance("test", null));
        assertFalse(TypeUtils.isInstance(null, int.class));
        assertTrue(TypeUtils.isInstance(null, String.class));
        assertTrue(TypeUtils.isInstance(new ArrayList<String>(), strListType));
        assertFalse(TypeUtils.isInstance("test", strListType));
    }

    @Test
    public void testNormalizeUpperBounds() {
        // Length < 2
        Type[] single = new Type[] { String.class };
        assertArrayEquals(single, TypeUtils.normalizeUpperBounds(single));
        Type[] empty = new Type[0];
        assertArrayEquals(empty, TypeUtils.normalizeUpperBounds(empty));

        // Redundant subtypes (List is subtype of Collection)
        Type[] bounds = new Type[] { Collection.class, List.class };
        Type[] normalized = TypeUtils.normalizeUpperBounds(bounds);
        assertEquals(1, normalized.length);
        assertEquals(List.class, normalized[0]);

        // Disjoint bounds
        Type[] disjoint = new Type[] { Comparable.class, Serializable.class };
        Type[] normalizedDisjoint = TypeUtils.normalizeUpperBounds(disjoint);
        assertEquals(2, normalizedDisjoint.length);
    }

    @Test
    public void testGetImplicitBounds() throws NoSuchFieldException {
        TypeVariable<?> typeVar = (TypeVariable<?>) getFieldType("typeVarField");
        Type[] bounds = TypeUtils.getImplicitBounds(typeVar);
        assertEquals(2, bounds.length); // Number & Comparable

        ParameterizedType numExtendsListType = (ParameterizedType) getFieldType("numberExtendsList");
        WildcardType extendsNum = (WildcardType) numExtendsListType.getActualTypeArguments()[0];
        Type[] upperBounds = TypeUtils.getImplicitUpperBounds(extendsNum);
        assertEquals(1, upperBounds.length);
        assertEquals(Number.class, upperBounds[0]);

        ParameterizedType intSuperListType = (ParameterizedType) getFieldType("integerSuperList");
        WildcardType superInt = (WildcardType) intSuperListType.getActualTypeArguments()[0];
        Type[] lowerBounds = TypeUtils.getImplicitLowerBounds(superInt);
        assertEquals(1, lowerBounds.length);
        assertEquals(Integer.class, lowerBounds[0]);

        // Empty lower bounds fallback to null element
        Type[] emptyLower = TypeUtils.getImplicitLowerBounds(extendsNum);
        assertEquals(1, emptyLower.length);
        assertNull(emptyLower[0]);
    }

    @Test
    public void testTypesSatisfyVariables() throws NoSuchFieldException {
        TypeVariable<?> typeVar = (TypeVariable<?>) getFieldType("typeVarField");

        Map<TypeVariable<?>, Type> validMap = new HashMap<TypeVariable<?>, Type>();
        validMap.put(typeVar, Integer.class);
        assertTrue(TypeUtils.typesSatisfyVariables(validMap));

        Map<TypeVariable<?>, Type> invalidMap = new HashMap<TypeVariable<?>, Type>();
        invalidMap.put(typeVar, String.class);
        assertFalse(TypeUtils.typesSatisfyVariables(invalidMap));
    }

    public <M> void dummyMethod(M m) {}

    @Test
    public void testGetRawType() throws NoSuchFieldException, NoSuchMethodException {
        Type strListType = getFieldType("stringList");
        Type typeVar = getFieldType("typeVarField");
        Type genericArray = getFieldType("genericArrayField");
        Type wildcardListType = getFieldType("wildcardList");
        WildcardType wildcard = (WildcardType) ((ParameterizedType) wildcardListType).getActualTypeArguments()[0];

        // Class
        assertEquals(String.class, TypeUtils.getRawType(String.class, null));
        // ParameterizedType
        assertEquals(List.class, TypeUtils.getRawType(strListType, null));
        // GenericArrayType
        assertEquals(Number[].class, TypeUtils.getRawType(genericArray, TypeUtilsTest.class));
        // WildcardType
        assertNull(TypeUtils.getRawType(wildcard, null));
        // TypeVariable without assigningType
        assertNull(TypeUtils.getRawType(typeVar, null));
        // TypeVariable with assigningType
        assertEquals(Number.class, TypeUtils.getRawType(typeVar, TypeUtilsTest.class));

        // Method-level TypeVariable (GenericDeclaration is Method not Class)
        Method m = TypeUtilsTest.class.getMethod("dummyMethod", Object.class);
        TypeVariable<?> methodVar = m.getTypeParameters()[0];
        assertNull(TypeUtils.getRawType(methodVar, TypeUtilsTest.class));

        // Unknown Type
        try {
            TypeUtils.getRawType(new CustomType(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    @Test
    public void testIsArrayTypeAndGetArrayComponentType() throws NoSuchFieldException {
        Type genericArray = getFieldType("genericArrayField");
        Type strArray = getFieldType("stringArrayField");
        Type strListType = getFieldType("stringList");

        assertTrue(TypeUtils.isArrayType(strArray));
        assertTrue(TypeUtils.isArrayType(genericArray));
        assertFalse(TypeUtils.isArrayType(strListType));
        assertFalse(TypeUtils.isArrayType(null));

        assertEquals(String.class, TypeUtils.getArrayComponentType(strArray));
        assertEquals(getFieldType("typeVarField"), TypeUtils.getArrayComponentType(genericArray));
        assertNull(TypeUtils.getArrayComponentType(strListType));
        assertNull(TypeUtils.getArrayComponentType(null));
    }
}