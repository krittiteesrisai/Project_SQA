package org.apache.commons.lang3.reflect;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link TypeUtils} (Defects4J Lang-15b).
 */
@SuppressWarnings({ "rawtypes", "unused" })
public class TypeUtilsTest {

    // =====================================================================
    // Fixtures (generic classes/interfaces/fields used to obtain real
    // java.lang.reflect.Type instances of every kind: Class, ParameterizedType,
    // GenericArrayType, WildcardType, TypeVariable).
    // =====================================================================

    interface Animal {}
    static class Dog implements Animal {}

    static class Box<T> {
        public T content;
    }

    static class StringBox extends Box<String> {}

    static class NumberBox<T extends Number> extends Box<T> {}

    static class IntBox extends NumberBox<Integer> {}

    static class Wrapper<X> extends Box<X> {}

    static class BoxIntegerHolder {
        public Box<Integer> f;
    }

    static class GenericHolder<T extends Number & Comparable<T>> {
        public T field;
        public List<T> listField;
        public T[] arrayField;
    }

    static class GH_StringHolder {
        public GenericHolder<Integer> f;
    }

    static class NumHolder<S extends Number> {
        public S val;
    }

    static class BoundedByHolder<T, U extends T> {
    }

    static class WildcardHolder {
        public List<? extends Number> upperBounded;
        public List<? super Integer> lowerBounded;
        public List<? super Number> lowerBoundedNumber;
        public List<?> unbounded;
        public List<? extends Integer> upperBoundedInteger;
        public List<? extends CharSequence> upperBoundedCharSequence;
        public List<? extends ArrayList[]> upperBoundedArrayListArray;
    }

    static class ArrayHolder<T> {
        public T[] arr;
    }

    static class AH_StringHolder {
        public ArrayHolder<String> f;
    }

    static class ArraysHolder {
        public List<String>[] listArray;
    }

    static class ListsHolder {
        public List<String> stringList;
        public ArrayList<String> stringArrayList;
        public ArrayList<Integer> intArrayList;
    }

    /** Type implementation that is NOT Class/ParameterizedType/GenericArrayType/WildcardType/TypeVariable. */
    static class CustomType implements Type {}

    /** Used to obtain a method-declared TypeVariable (genericDeclaration instanceof Method, not Class). */
    static <M> M genericMethod() { return null; }

    // ---------------------------------------------------------------------
    // Reflection helpers
    // ---------------------------------------------------------------------

    private static Type ft(Class<?> c, String name) {
        try {
            return c.getDeclaredField(name).getGenericType();
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    private static Type wcArg(Type parameterizedListType) {
        return ((ParameterizedType) parameterizedListType).getActualTypeArguments()[0];
    }

    private static Type methodVar() {
        try {
            return TypeUtilsTest.class.getDeclaredMethod("genericMethod").getGenericReturnType();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    // ---------------------------------------------------------------------
    // Pre-computed Type fixtures
    // ---------------------------------------------------------------------

    private static final TypeVariable<?> T_GH = GenericHolder.class.getTypeParameters()[0];
    private static final TypeVariable<?> S_NH = NumHolder.class.getTypeParameters()[0];
    private static final TypeVariable<?> T_BBH = BoundedByHolder.class.getTypeParameters()[0];
    private static final TypeVariable<?> U_BBH = BoundedByHolder.class.getTypeParameters()[1];
    private static final TypeVariable<?> X_WRAPPER = Wrapper.class.getTypeParameters()[0];
    private static final TypeVariable<?> T_BOX = Box.class.getTypeParameters()[0];
    private static final TypeVariable<?> T_NUMBERBOX = NumberBox.class.getTypeParameters()[0];
    private static final TypeVariable<?> E_LIST = List.class.getTypeParameters()[0];
    private static final TypeVariable<?> E_ARRAYLIST = ArrayList.class.getTypeParameters()[0];
    private static final TypeVariable<?> E_COLLECTION = Collection.class.getTypeParameters()[0];

    private static final Type LIST_T_TYPE = ft(GenericHolder.class, "listField");
    private static final Type ARRAY_T_TYPE = ft(GenericHolder.class, "arrayField");

    private static final Type UPPER_NUMBER_FIELD = ft(WildcardHolder.class, "upperBounded");
    private static final Type LOWER_INTEGER_FIELD = ft(WildcardHolder.class, "lowerBounded");
    private static final Type LOWER_NUMBER_FIELD = ft(WildcardHolder.class, "lowerBoundedNumber");
    private static final Type UNBOUNDED_FIELD = ft(WildcardHolder.class, "unbounded");
    private static final Type UPPER_INTEGER_FIELD = ft(WildcardHolder.class, "upperBoundedInteger");
    private static final Type UPPER_CHARSEQ_FIELD = ft(WildcardHolder.class, "upperBoundedCharSequence");
    private static final Type UPPER_ARRLIST_ARRAY_FIELD = ft(WildcardHolder.class, "upperBoundedArrayListArray");

    private static final WildcardType WC_UPPER_NUMBER = (WildcardType) wcArg(UPPER_NUMBER_FIELD);
    private static final WildcardType WC_LOWER_INTEGER = (WildcardType) wcArg(LOWER_INTEGER_FIELD);
    private static final WildcardType WC_LOWER_NUMBER = (WildcardType) wcArg(LOWER_NUMBER_FIELD);
    private static final WildcardType WC_UNBOUNDED = (WildcardType) wcArg(UNBOUNDED_FIELD);
    private static final WildcardType WC_UPPER_INTEGER = (WildcardType) wcArg(UPPER_INTEGER_FIELD);
    private static final WildcardType WC_UPPER_CHARSEQ = (WildcardType) wcArg(UPPER_CHARSEQ_FIELD);
    private static final WildcardType WC_UPPER_ARRLIST_ARRAY = (WildcardType) wcArg(UPPER_ARRLIST_ARRAY_FIELD);

    private static final Type STRING_LIST_TYPE = ft(ListsHolder.class, "stringList");
    private static final Type STRING_ARRAYLIST_TYPE = ft(ListsHolder.class, "stringArrayList");
    private static final Type INT_ARRAYLIST_TYPE = ft(ListsHolder.class, "intArrayList");

    private static final Type ARR_T_AH_TYPE = ft(ArrayHolder.class, "arr");
    private static final Type GENERICHOLDER_INTEGER_TYPE = ft(GH_StringHolder.class, "f");
    private static final Type ARRAYHOLDER_STRING_TYPE = ft(AH_StringHolder.class, "f");
    private static final Type LIST_ARRAY_TYPE = ft(ArraysHolder.class, "listArray");
    private static final Type BOX_INTEGER_TYPE = ft(BoxIntegerHolder.class, "f");

    private static final Type BOX_STRING_SUPER_TYPE = StringBox.class.getGenericSuperclass();
    private static final Type NUMBERBOX_INTEGER_SUPER_TYPE = IntBox.class.getGenericSuperclass();

    private static final Type CUSTOM = new CustomType();
    private static final Type M_METHOD_VAR = methodVar();

    // =====================================================================
    // 1) isAssignable(Type, Type)  -- public entry + dispatch to Class target
    // =====================================================================

    @Test
    public void isAssignable_bothNull_true() {
        assertTrue(TypeUtils.isAssignable(null, null));
    }

    @Test
    public void isAssignable_typeNonNull_toClassNull_false() {
        assertFalse(TypeUtils.isAssignable(String.class, (Type) null));
    }

    @Test
    public void isAssignable_typeNull_toClassPrimitive_false() {
        assertFalse(TypeUtils.isAssignable(null, int.class));
    }

    @Test
    public void isAssignable_typeNull_toClassNonPrimitive_true() {
        assertTrue(TypeUtils.isAssignable(null, Integer.class));
    }

    @Test
    public void isAssignable_classToClass_true() {
        assertTrue(TypeUtils.isAssignable(Integer.class, Number.class));
    }

    @Test
    public void isAssignable_classToClass_false() {
        assertFalse(TypeUtils.isAssignable(String.class, Number.class));
    }

    @Test
    public void isAssignable_selfClass_true() {
        assertTrue(TypeUtils.isAssignable(Integer.class, Integer.class));
    }

    @Test
    public void isAssignable_parameterizedTypeToClass_true() {
        // List<String> (ParameterizedType) assignable to Collection.class
        assertTrue(TypeUtils.isAssignable(STRING_LIST_TYPE, Collection.class));
    }

    @Test
    public void isAssignable_typeVariableToClass_trueViaBound() {
        // T extends Number & Comparable<T>; Number bound matches
        assertTrue(TypeUtils.isAssignable(T_GH, Number.class));
    }

    @Test
    public void isAssignable_typeVariableToClass_falseNoBoundMatches() {
        assertFalse(TypeUtils.isAssignable(T_GH, String.class));
    }

    @Test
    public void isAssignable_genericArrayToObject_true() {
        assertTrue(TypeUtils.isAssignable(LIST_ARRAY_TYPE, Object.class));
    }

    @Test
    public void isAssignable_genericArrayToArrayClass_true() {
        assertTrue(TypeUtils.isAssignable(LIST_ARRAY_TYPE, List[].class));
    }

    @Test
    public void isAssignable_genericArrayToArrayClass_falseComponentMismatch() {
        assertFalse(TypeUtils.isAssignable(LIST_ARRAY_TYPE, String[].class));
    }

    @Test
    public void isAssignable_genericArrayToNonArrayNonObjectClass_false() {
        assertFalse(TypeUtils.isAssignable(LIST_ARRAY_TYPE, List.class));
    }

    @Test
    public void isAssignable_wildcardToClass_alwaysFalse() {
        assertFalse(TypeUtils.isAssignable(WC_UPPER_NUMBER, Number.class));
    }

    @Test
    public void isAssignable_unhandledTypeToClass_throws() {
        try {
            TypeUtils.isAssignable(CUSTOM, Number.class);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // matches: "found an unhandled type: " + type
        }
    }

    @Test
    public void isAssignable_unhandledToType_throws() {
        try {
            TypeUtils.isAssignable(Integer.class, CUSTOM);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // matches outer dispatch: "found an unhandled type: " + toType
        }
    }

    // =====================================================================
    // 2) isAssignable(Type, ParameterizedType, Map) branches
    // =====================================================================

    @Test
    public void isAssignable_toParameterized_typeNull_true() {
        assertTrue(TypeUtils.isAssignable(null, STRING_LIST_TYPE));
    }

    @Test
    public void isAssignable_toParameterized_rawIncompatible_false() {
        assertFalse(TypeUtils.isAssignable(String.class, STRING_LIST_TYPE));
    }

    @Test
    public void isAssignable_toParameterized_rawTypeNoArgs_true() {
        // raw List assignable to parameterized List<String> (fromTypeVarAssigns.isEmpty())
        assertTrue(TypeUtils.isAssignable(List.class, STRING_LIST_TYPE));
    }

    @Test
    public void isAssignable_toParameterized_argMismatch_false() {
        assertFalse(TypeUtils.isAssignable(INT_ARRAYLIST_TYPE, STRING_LIST_TYPE));
    }

    @Test
    public void isAssignable_toParameterized_argExactMatch_true() {
        assertTrue(TypeUtils.isAssignable(STRING_ARRAYLIST_TYPE, STRING_LIST_TYPE));
    }

    @Test
    public void isAssignable_toParameterized_wildcardArgMatches_true() {
        assertTrue(TypeUtils.isAssignable(STRING_ARRAYLIST_TYPE, UPPER_CHARSEQ_FIELD));
    }

    @Test
    public void isAssignable_toParameterized_wildcardArgDoesNotMatch_false() {
        assertFalse(TypeUtils.isAssignable(STRING_ARRAYLIST_TYPE, UPPER_NUMBER_FIELD));
    }

    @Test
    public void isAssignable_toParameterized_equalsShortCircuit_true() {
        // same reflective ParameterizedType compared to itself -> equals() branch
        assertTrue(TypeUtils.isAssignable(STRING_LIST_TYPE, STRING_LIST_TYPE));
    }

    /** Edge case: simulate a malformed ParameterizedType whose getRawType() is not a Class. */
    @Test
    public void getRawType_parameterizedType_notClass_throws_viaMock() {
        ParameterizedType badPT = EasyMock.createMock(ParameterizedType.class);
        EasyMock.expect(badPT.getRawType()).andReturn(null);
        EasyMock.replay(badPT);
        try {
            TypeUtils.isAssignable(Integer.class, badPT);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // matches: "Wait... What!? Type of rawType: " + rawType
        }
        EasyMock.verify(badPT);
    }

    // =====================================================================
    // 3) isAssignable(Type, GenericArrayType, Map) branches
    // =====================================================================

    @Test
    public void isAssignable_toGenericArray_typeNull_true() {
        assertTrue(TypeUtils.isAssignable(null, LIST_ARRAY_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_equals_true() {
        assertTrue(TypeUtils.isAssignable(LIST_ARRAY_TYPE, LIST_ARRAY_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_classComponentMatch_true() {
        assertTrue(TypeUtils.isAssignable(ArrayList[].class, LIST_ARRAY_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_classComponentMismatch_false() {
        assertFalse(TypeUtils.isAssignable(java.util.HashSet[].class, LIST_ARRAY_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_classNotArray_false() {
        assertFalse(TypeUtils.isAssignable(String.class, LIST_ARRAY_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_genericArrayComponent_false() {
        // component(String) not assignable to T (unbounded) -- Class->TypeVariable is always false
        assertFalse(TypeUtils.isAssignable(String[].class, ARR_T_AH_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_wildcardSubject_true() {
        assertTrue(TypeUtils.isAssignable(WC_UPPER_ARRLIST_ARRAY, LIST_ARRAY_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_wildcardSubject_false() {
        assertFalse(TypeUtils.isAssignable(WC_UPPER_NUMBER, ARR_T_AH_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_typeVariableSubject_false() {
        assertFalse(TypeUtils.isAssignable(T_GH, ARR_T_AH_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_parameterizedTypeSubject_alwaysFalse() {
        assertFalse(TypeUtils.isAssignable(STRING_LIST_TYPE, LIST_ARRAY_TYPE));
    }

    @Test
    public void isAssignable_toGenericArray_unhandled_throws() {
        try {
            TypeUtils.isAssignable(CUSTOM, LIST_ARRAY_TYPE);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    // =====================================================================
    // 4) isAssignable(Type, WildcardType, Map) branches
    // =====================================================================

    @Test
    public void isAssignable_toWildcard_typeNull_true() {
        assertTrue(TypeUtils.isAssignable(null, UPPER_NUMBER_FIELD));
    }

    @Test
    public void isAssignable_toWildcard_equals_true() {
        assertTrue(TypeUtils.isAssignable(WC_UPPER_NUMBER, WC_UPPER_NUMBER));
    }

    @Test
    public void isAssignable_toWildcard_bothWildcard_upperBound_true() {
        // ? extends Integer  assignable to  ? extends Number
        assertTrue(TypeUtils.isAssignable(WC_UPPER_INTEGER, WC_UPPER_NUMBER));
    }

    @Test
    public void isAssignable_toWildcard_bothWildcard_upperBound_false() {
        // ? extends Number NOT assignable to ? extends Integer
        assertFalse(TypeUtils.isAssignable(WC_UPPER_NUMBER, WC_UPPER_INTEGER));
    }

    @Test
    public void isAssignable_toWildcard_bothWildcard_lowerBound_false() {
        // ? super Integer NOT assignable to ? super Number (per source logic)
        assertFalse(TypeUtils.isAssignable(WC_LOWER_INTEGER, WC_LOWER_NUMBER));
    }

    @Test
    public void isAssignable_toWildcard_plainType_true() {
        assertTrue(TypeUtils.isAssignable(Integer.class, UPPER_NUMBER_FIELD));
    }

    @Test
    public void isAssignable_toWildcard_plainType_false() {
        assertFalse(TypeUtils.isAssignable(String.class, UPPER_NUMBER_FIELD));
    }

    // =====================================================================
    // 5) isAssignable(Type, TypeVariable, Map) branches
    // =====================================================================

    @Test
    public void isAssignable_toTypeVariable_typeNull