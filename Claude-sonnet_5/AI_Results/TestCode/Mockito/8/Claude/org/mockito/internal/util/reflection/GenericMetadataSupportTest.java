package org.mockito.internal.util.reflection;

// Import ของคลาสเป้าหมาย (แม้อยู่ package เดียวกัน ใส่ไว้ให้ตรงตามข้อกำหนด)
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.exceptions.base.MockitoException;

import org.junit.Test;

import java.lang.reflect.*;
import java.util.*;

import static org.junit.Assert.*;

public class GenericMetadataSupportTest {

    // =========================================================================================
    // FIXTURES
    // =========================================================================================

    /**
     * ตัวอย่างตรงจาก Javadoc ของคลาสเป้าหมาย ใช้ครอบคลุมหลาย pattern ของ generic
     * เพิ่มเมธอด returningGenericArray() เพื่อทดสอบ branch "unsupported type" (GenericArrayType)
     */
    interface GenericsNest<K extends Comparable<K> & Cloneable> extends Map<K, Set<Number>> {
        Set<Number> remove(Object key); // override with fixed ParameterizedType
        List<? super Integer> returning_wildcard_with_class_lower_bound();
        List<? super K> returning_wildcard_with_typeVar_lower_bound();
        List<? extends K> returning_wildcard_with_typeVar_upper_bound();
        K returningK();
        <O extends K> List<O> paramType_with_type_params();
        <S, T extends S> T two_type_params();
        <O extends K> O typeVar_with_type_params();
        Number returningNonGeneric();
        <A> A[] returningGenericArray(); // GenericArrayType - ไม่รองรับใน resolveGenericReturnType
    }

    interface Box<T> {
        T get();
    }

    /** T ของ Box ถูก map ตรงไปยัง ParameterizedType (List<String>) ไม่ถูก wrap เป็น BoundedType */
    interface StringListBox extends Box<List<String>> {
    }

    /** T ของ Box ถูก map ตรงไปยัง Class ธรรมดา (Integer.class) */
    interface NumberBox extends Box<Integer> {
    }

    /** T ของ Box ถูก map ไปยัง GenericArrayType (E[]) ซึ่งไม่ถูกรองรับใน extractRawTypeOf/extractActualBoundedTypeOf */
    interface ArrayBox<E> extends Box<E[]> {
    }

    static class SuperClassWithTypeVariable<A> {
    }

    /** ทดสอบ superClassOf() branch: genericSuperclass instanceof ParameterizedType */
    static class SubClassBindingTypeVariable extends SuperClassWithTypeVariable<String> {
    }

    static class SimpleClassNoGenerics {
    }

    static class GrandParent<A> {
    }

    /** ParentNoGenerics extends GrandParent<String> -> genericSuperclass เป็น ParameterizedType */
    static class ParentNoGenerics extends GrandParent<String> {
    }

    /** ChildNoGenerics extends ParentNoGenerics (plain Class) -> genericSuperclass เป็น Class ธรรมดา */
    static class ChildNoGenerics extends ParentNoGenerics {
    }

    static class FieldHolder {
        List<String> stringList;
        List<?> wildcardList;
        Map<String, Integer> stringIntMap;
    }

    // =========================================================================================
    // inferFrom(Type)
    // =========================================================================================

    @Test
    public void inferFrom_shouldThrow_whenTypeIsNull() {
        // Checks.checkNotNull() source ไม่ได้ให้มา จึงยืนยันแค่ว่ามี exception เกิดขึ้น (ไม่เดาชนิด exception)
        try {
            GenericMetadataSupport.inferFrom(null);
            fail("Expected an exception when type is null");
        } catch (Exception e) {
            // พฤติกรรมที่แน่นอนของ Checks.checkNotNull ไม่อยู่ใน source ที่ให้มา
        }
    }

    @Test
    public void inferFrom_withClass_returnsSupportWithCorrectRawType() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(GenericsNest.class);
        assertEquals(GenericsNest.class, support.rawType());
    }

    @Test
    public void inferFrom_withParameterizedType_returnsSupportWithCorrectRawType() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("stringList");
        ParameterizedType pt = (ParameterizedType) field.getGenericType();
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(pt);
        assertEquals(List.class, support.rawType());
    }

    @Test(expected = MockitoException.class)
    public void inferFrom_withUnsupportedType_throwsMockitoException() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("wildcardList");
        ParameterizedType pt = (ParameterizedType) field.getGenericType();
        Type wildcard = pt.getActualTypeArguments()[0]; // WildcardType, ไม่ใช่ Class/ParameterizedType
        GenericMetadataSupport.inferFrom(wildcard);
    }

    // =========================================================================================
    // FromClassGenericMetadataSupport (ผ่าน inferFrom(Class))
    // =========================================================================================

    @Test
    public void fromClass_interfaceWithNoSuperclass_endsLoopOnNull() {
        // GenericsNest เป็น interface -> getGenericSuperclass() คืน null -> loop จบด้วย currentExploredClass == null
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(GenericsNest.class);
        TypeVariable k = GenericsNest.class.getTypeParameters()[0];
        Type actual = support.getActualTypeArgumentFor(k);
        assertTrue(actual instanceof GenericMetadataSupport.TypeVarBoundedType);
    }

    @Test
    public void fromClass_withGenericSuperclass_bindsTypeVariable() {
        // ทดสอบ superClassOf(): genericSuperclass instanceof ParameterizedType
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SubClassBindingTypeVariable.class);
        TypeVariable a = SuperClassWithTypeVariable.class.getTypeParameters()[0];
        assertEquals(String.class, support.getActualTypeArgumentFor(a));
    }

    @Test
    public void fromClass_withMultiLevelHierarchy_resolvesTypeVariableFromGrandParent() {
        // ทดสอบ superClassOf() ทั้งสอง branch (Class ธรรมดา และ ParameterizedType) ในหลายระดับ
        // รวมถึง loop สิ้นสุดด้วย currentExploredClass == Object.class
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(ChildNoGenerics.class);
        TypeVariable a = GrandParent.class.getTypeParameters()[0];
        assertEquals(String.class, support.getActualTypeArgumentFor(a));
    }

    // =========================================================================================
    // FromParameterizedTypeGenericMetadataSupport
    // =========================================================================================

    @Test
    public void fromParameterizedType_registersActualTypeArgument() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("stringList");
        ParameterizedType pt = (ParameterizedType) field.getGenericType();
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(pt);
        TypeVariable e = List.class.getTypeParameters()[0];
        assertEquals(String.class, support.getActualTypeArgumentFor(e));
    }

    @Test
    public void fromParameterizedType_withMultipleTypeArguments_registersAll() throws Exception {
        // ครอบคลุม loop ของ registerTypeVariablesOn() กับ actualTypeArguments หลายตัว (i=0,1)
        Field field = FieldHolder.class.getDeclaredField("stringIntMap");
        ParameterizedType pt = (ParameterizedType) field.getGenericType();
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(pt);
        TypeVariable k = Map.class.getTypeParameters()[0];
        TypeVariable v = Map.class.getTypeParameters()[1];
        assertEquals(String.class, support.getActualTypeArgumentFor(k));
        assertEquals(Integer.class, support.getActualTypeArgumentFor(v));
    }

    // =========================================================================================
    // resolveGenericReturnType(Method)
    // =========================================================================================

    @Test
    public void resolveGenericReturnType_classReturnType_returnsNotGenericReturnTypeSupport() throws Exception {
        Method m = GenericsNest.class.getMethod("returningNonGeneric");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertEquals(Number.class, result.rawType());
    }

    @Test
    public void resolveGenericReturnType_fixedParameterizedType_remove() throws Exception {
        Method m = GenericsNest.class.getMethod("remove", Object.class);
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertEquals(Set.class, result.rawType());
        TypeVariable setVar = Set.class.getTypeParameters()[0];
        assertEquals(Number.class, result.getActualTypeArgumentFor(setVar));
    }

    @Test
    public void resolveGenericReturnType_paramTypeWithTypeParams_resolvesElementTypeRecursively() throws Exception {
        // ครอบคลุม getActualTypeArgumentFor() branch ที่ value เป็น TypeVariable -> recursive call
        Method m = GenericsNest.class.getMethod("paramType_with_type_params");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertEquals(List.class, result.rawType());
        TypeVariable listVar = List.class.getTypeParameters()[0];
        Type actual = result.getActualTypeArgumentFor(listVar);
        assertTrue(actual instanceof GenericMetadataSupport.TypeVarBoundedType);
    }

    @Test
    public void resolveGenericReturnType_typeVariable_returnsTypeVariableReturnType() throws Exception {
        // K extends Comparable<K> & Cloneable -> firstBound ไม่ใช่ TypeVariable -> boundsOf คืน TypeVarBoundedType ทันที
        Method m = GenericsNest.class.getMethod("returningK");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertEquals(Comparable.class, result.rawType());
    }

    @Test
    public void resolveGenericReturnType_typeVarWithTypeParamsBound_resolvesViaRecursiveBoundsOf() throws Exception {
        // O extends K (TypeVariable) -> boundsOf(O) ต้อง recurse เข้า boundsOf(K)
        Method m = GenericsNest.class.getMethod("typeVar_with_type_params");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertEquals(Comparable.class, result.rawType());
    }

    @Test
    public void resolveGenericReturnType_twoTypeParams_resolvesToObjectRawType() throws Exception {
        // <S, T extends S> T : S ไม่มี explicit bound -> Object.class
        Method m = GenericsNest.class.getMethod("two_type_params");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertEquals(Object.class, result.rawType());
    }

    @Test(expected = MockitoException.class)
    public void resolveGenericReturnType_genericArrayType_throwsMockitoException() throws Exception {
        Method m = GenericsNest.class.getMethod("returningGenericArray");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        base.resolveGenericReturnType(m);
    }

    // ---- wildcard-bound branches (boundsOf(WildcardType)) ----

    @Test
    public void resolveGenericReturnType_wildcardWithClassLowerBound_resolvesToWildCardBoundedType() throws Exception {
        // List<? super Integer> : firstBound() = Integer.class (ไม่ใช่ TypeVariable) -> WildCardBoundedType
        Method m = GenericsNest.class.getMethod("returning_wildcard_with_class_lower_bound");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        TypeVariable listVar = List.class.getTypeParameters()[0];
        Type actual = result.getActualTypeArgumentFor(listVar);
        assertTrue(actual instanceof GenericMetadataSupport.WildCardBoundedType);
        assertEquals(Integer.class, ((GenericMetadataSupport.WildCardBoundedType) actual).firstBound());
    }

    @Test
    public void resolveGenericReturnType_wildcardWithTypeVarLowerBound_resolvesToTypeVarBoundedType() throws Exception {
        // List<? super K> : firstBound() = K (TypeVariable) -> recurse boundsOf(K) -> TypeVarBoundedType
        Method m = GenericsNest.class.getMethod("returning_wildcard_with_typeVar_lower_bound");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        TypeVariable listVar = List.class.getTypeParameters()[0];
        Type actual = result.getActualTypeArgumentFor(listVar);
        assertTrue(actual instanceof GenericMetadataSupport.TypeVarBoundedType);
    }

    @Test
    public void resolveGenericReturnType_wildcardWithTypeVarUpperBound_resolvesToTypeVarBoundedType() throws Exception {
        // List<? extends K> : firstBound() = upperBounds[0] = K (TypeVariable) -> recurse
        Method m = GenericsNest.class.getMethod("returning_wildcard_with_typeVar_upper_bound");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        TypeVariable listVar = List.class.getTypeParameters()[0];
        Type actual = result.getActualTypeArgumentFor(listVar);
        assertTrue(actual instanceof GenericMetadataSupport.TypeVarBoundedType);
    }

    // =========================================================================================
    // actualTypeArguments() / getActualTypeArgumentFor()
    // =========================================================================================

    @Test
    public void actualTypeArguments_withNoTypeParameters_returnsEmptyMap() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClassNoGenerics.class);
        assertTrue(support.actualTypeArguments().isEmpty());
    }

    @Test
    public void actualTypeArguments_returnsMapWithTypeVarBoundedType() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(GenericsNest.class);
        TypeVariable k = GenericsNest.class.getTypeParameters()[0];
        Map<TypeVariable, Type> result = support.actualTypeArguments();
        assertTrue(result.containsKey(k));
        assertTrue(result.get(k) instanceof GenericMetadataSupport.TypeVarBoundedType);
    }

    @Test
    public void getActualTypeArgumentFor_resolvesChainedTypeVariable() {
        // ครอบคลุม branch `if (type instanceof TypeVariable) return getActualTypeArgumentFor(typeVariable);`
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(GenericsNest.class);
        TypeVariable mapKeyVar = Map.class.getTypeParameters()[0]; // Map's K, ถูก map ไปที่ GenericsNest's K (TypeVariable)
        Type resolved = support.getActualTypeArgumentFor(mapKeyVar);
        assertTrue(resolved instanceof GenericMetadataSupport.TypeVarBoundedType);
    }

    // =========================================================================================
    // extraInterfaces() / rawExtraInterfaces() / hasRawExtraInterfaces() - default implementation
    // =========================================================================================

    @Test
    public void extraInterfaces_defaultImplementation_returnsEmptyList() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(GenericsNest.class);
        assertTrue(support.extraInterfaces().isEmpty());
    }

    @Test
    public void rawExtraInterfaces_defaultImplementation_returnsEmptyArray() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(GenericsNest.class);
        assertEquals(0, support.rawExtraInterfaces().length);
    }

    @Test
    public void hasRawExtraInterfaces_defaultImplementation_returnsFalse() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(GenericsNest.class);
        assertFalse(support.hasRawExtraInterfaces());
    }

    @Test
    public void parameterizedReturnType_extraInterfaces_defaultEmpty() throws Exception {
        Method m = GenericsNest.class.getMethod("remove", Object.class);
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertTrue(result.extraInterfaces().isEmpty());
        assertFalse(result.hasRawExtraInterfaces());
    }

    // =========================================================================================
    // TypeVariableReturnType - rawType() / extractRawTypeOf() branches
    // =========================================================================================

    @Test
    public void typeVariableReturnType_rawType_isCachedOnSecondCall() throws Exception {
        // ครอบคลุม if (rawType == null) ทั้ง true (ครั้งแรก) และ false (ครั้งที่สอง)
        Method m = GenericsNest.class.getMethod("returningK");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        Class<?> first = result.rawType();
        Class<?> second = result.rawType();
        assertSame(first, second);
    }

    @Test
    public void typeVariableReturnType_mappedDirectlyToParameterizedType_resolvesRawTypeToList() throws Exception {
        // extractRawTypeOf(): branch ParameterizedType
        Method m = Box.class.getMethod("get");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(StringListBox.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertEquals(List.class, result.rawType());
    }

    @Test
    public void typeVariableReturnType_mappedToPlainClass_resolvesRawTypeDirectly() throws Exception {
        // extractRawTypeOf(): branch Class
        Method m = Box.class.getMethod("get");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(NumberBox.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertEquals(Integer.class, result.rawType());
    }

    @Test(expected = MockitoException.class)
    public void typeVariableReturnType_rawType_unsupportedGenericArrayType_throwsMockitoException() throws Exception {
        // extractRawTypeOf(): ไม่มี branch รองรับ GenericArrayType -> throw MockitoException (fault-sensitive test)
        Method m = Box.class.getMethod("get");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(ArrayBox.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        result.rawType();
    }

    // =========================================================================================
    // TypeVariableReturnType - extraInterfaces() / rawExtraInterfaces() branches
    // =========================================================================================

    @Test
    public void typeVariableReturnType_extraInterfaces_boundedTypeBranch_returnsCloneable() throws Exception {
        Method m = GenericsNest.class.getMethod("returningK");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        List<Type> extra = result.extraInterfaces();
        assertEquals(1, extra.size());
        assertTrue(extra.contains(Cloneable.class));
    }

    @Test
    public void typeVariableReturnType_rawExtraInterfaces_containsCloneable() throws Exception {
        Method m = GenericsNest.class.getMethod("returningK");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(GenericsNest.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        Class<?>[] raw = result.rawExtraInterfaces();
        assertEquals(1, raw.length);
        assertEquals(Cloneable.class, raw[0]);
        assertTrue(result.hasRawExtraInterfaces());
    }

    @Test
    public void typeVariableReturnType_extraInterfaces_parameterizedTypeBranch() throws Exception {
        Method m = Box.class.getMethod("get");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(StringListBox.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        List<Type> extra = result.extraInterfaces();
        assertEquals(1, extra.size());
        assertTrue(extra.get(0) instanceof ParameterizedType);
        assertEquals(List.class, ((ParameterizedType) extra.get(0)).getRawType());
    }

    @Test
    public void typeVariableReturnType_rawExtraInterfaces_skipsCollisionWithRawType() throws Exception {
        // rawExtraInterfaces(): branch ที่ rawInterface เท่ากับ rawType() -> ไม่ add (ป้องกัน collision)
        Method m = Box.class.getMethod("get");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(StringListBox.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertEquals(0, result.rawExtraInterfaces().length);
        assertFalse(result.hasRawExtraInterfaces());
    }

    @Test
    public void typeVariableReturnType_extraInterfaces_classBranch_returnsEmptyList() throws Exception {
        Method m = Box.class.getMethod("get");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(NumberBox.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        assertTrue(result.extraInterfaces().isEmpty());
        assertEquals(0, result.rawExtraInterfaces().length);
        assertFalse(result.hasRawExtraInterfaces());
    }

    @Test(expected = MockitoException.class)
    public void typeVariableReturnType_extraInterfaces_unsupportedType_throwsMockitoException() throws Exception {
        // extraInterfaces(): ไม่มี branch รองรับ GenericArrayType -> throw MockitoException (fault-sensitive test)
        Method m = Box.class.getMethod("get");
        GenericMetadataSupport base = GenericMetadataSupport.inferFrom(ArrayBox.class);
        GenericMetadataSupport result = base.resolveGenericReturnType(m);
        result.extraInterfaces();
    }

    // =========================================================================================
    // registerTypeVariablesOn() / registerTypeParametersOn() - direct protected-method access
    // =========================================================================================

    @Test
    public void registerTypeVariablesOn_withNonParameterizedType_doesNotModifyMap() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClassNoGenerics.class);
        int before = support.contextualActualTypeParameters.size();
        support.registerTypeVariablesOn(String.class); // ไม่ใช่ ParameterizedType
        assertEquals(before, support.contextualActualTypeParameters.size());
    }

    @Test
    public void registerTypeVariablesOn_withNullType_doesNotThrow() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClassNoGenerics.class);
        support.registerTypeVariablesOn(null); // null ไม่ใช่ instanceof ParameterizedType -> no-op
    }

    @Test
    public void registerTypeParametersOn_withEmptyArray_doesNothing() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClassNoGenerics.class);
        int before = support.contextualActualTypeParameters.size();
        support.registerTypeParametersOn(new TypeVariable[0]);
        assertEquals(before, support.contextualActualTypeParameters.size());
    }

    @Test
    public void registerTypeParametersOn_addsNewTypeVariable() {
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(SimpleClassNoGenerics.class);
        TypeVariable t = Box.class.getTypeParameters()[0];
        assertFalse(support.contextualActualTypeParameters.containsKey(t));
        support.registerTypeParametersOn(new TypeVariable[]{t});
        assertTrue(support.contextualActualTypeParameters.containsKey(t));
    }

    @Test
    public void registerTypeParametersOn_skipsAlreadyPresentTypeVariable() {
        // ครอบคลุม branch `if (!contextualActualTypeParameters.containsKey(typeVariable))` = false
        GenericMetadataSupport support = GenericMetadataSupport.inferFrom(GenericsNest.class);
        TypeVariable k = GenericsNest.class.getTypeParameters()[0];
        Type before = support.contextualActualTypeParameters.get(k);
        support.registerTypeParametersOn(new TypeVariable[]{k}); // k ถูกลงทะเบียนไว้แล้วตั้งแต่ construct
        Type after = support.contextualActualTypeParameters.get(k);
        assertSame(before, after);
    }

    // =========================================================================================
    // TypeVarBoundedType - public utility methods
    // =========================================================================================

    @Test
    public void typeVarBoundedType_firstBoundAndInterfaceBounds() {
        TypeVariable k = GenericsNest.class.getTypeParameters()[0]; // K extends Comparable<K> & Cloneable
        GenericMetadataSupport.TypeVarBoundedType bounded = new GenericMetadataSupport.TypeVarBoundedType(k);
        assertEquals(k.getBounds()[0], bounded.firstBound());
        assertArrayEquals(new Type[]{Cloneable.class}, bounded.interfaceBounds());
        assertEquals(k, bounded.typeVariable());
    }

    @Test
    public void typeVarBoundedType_equalsAndHashCode() {
        TypeVariable k = GenericsNest.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType b1 = new GenericMetadataSupport.TypeVarBoundedType(k);
        GenericMetadataSupport.TypeVarBoundedType b2 = new GenericMetadataSupport.TypeVarBoundedType(k);
        assertEquals(b1, b2);
        assertEquals(b1.hashCode(), b2.hashCode());
        assertEquals(b1, b1);               // this == o branch
        assertFalse(b1.equals(null));       // o == null branch
        assertFalse(b1.equals("mismatch")); // getClass() != o.getClass() branch
    }

    @Test
    public void typeVarBoundedType_toString_containsBoundsInfo() {
        TypeVariable k = GenericsNest.class.getTypeParameters()[0];
        GenericMetadataSupport.TypeVarBoundedType bounded = new GenericMetadataSupport.TypeVarBoundedType(k);
        String s = bounded.toString();
        assertTrue(s.contains("firstBound"));
        assertTrue(s.contains("interfaceBounds"));
    }

    // =========================================================================================
    // WildCardBoundedType - public utility methods (+ fault detection test)
    // =========================================================================================

    @Test
    public void wildCardBoundedType_firstBoundAndInterfaceBounds() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("wildcardList"); // List<?> -> upper bound Object
        ParameterizedType pt = (ParameterizedType) field.getGenericType();
        WildcardType wildcard = (WildcardType) pt.getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bounded = new GenericMetadataSupport.WildCardBoundedType(wildcard);
        assertEquals(Object.class, bounded.firstBound());
        assertEquals(0, bounded.interfaceBounds().length);
        assertEquals(wildcard, bounded.wildCard());
    }

    @Test
    public void wildCardBoundedType_toString_containsFirstBoundInfo() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("wildcardList");
        ParameterizedType pt = (ParameterizedType) field.getGenericType();
        WildcardType wildcard = (WildcardType) pt.getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bounded = new GenericMetadataSupport.WildCardBoundedType(wildcard);
        String s = bounded.toString();
        assertTrue(s.contains("firstBound"));
        assertTrue(s.contains("interfaceBounds=[]"));
    }

    @Test
    public void wildCardBoundedType_equals_reflexiveNullAndTypeMismatch() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("wildcardList");
        ParameterizedType pt = (ParameterizedType) field.getGenericType();
        WildcardType wildcard = (WildcardType) pt.getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType bounded = new GenericMetadataSupport.WildCardBoundedType(wildcard);
        assertEquals(bounded, bounded);       // this == o
        assertFalse(bounded.equals(null));    // o == null
        assertFalse(bounded.equals("other")); // getClass() != o.getClass()
    }

    @Test(expected = ClassCastException.class)
    public void wildCardBoundedType_equals_withAnotherInstanceOfSameClass_exposesCastBug() throws Exception {
        // *** FAULT DETECTED ***
        // WildCardBoundedType.equals() ผิดพลาด: cast `o` เป็น TypeVarBoundedType แทนที่จะเป็น WildCardBoundedType
        // เมื่อเทียบกับอีก instance ของ WildCardBoundedType เอง (getClass() ตรงกัน) จะเกิด ClassCastException
        Field field = FieldHolder.class.getDeclaredField("wildcardList");
        ParameterizedType pt = (ParameterizedType) field.getGenericType();
        WildcardType wildcard = (WildcardType) pt.getActualTypeArguments()[0];
        GenericMetadataSupport.WildCardBoundedType b1 = new GenericMetadataSupport.WildCardBoundedType(wildcard);
        GenericMetadataSupport.WildCardBoundedType b2 = new GenericMetadataSupport.WildCardBoundedType(wildcard);
        b1.equals(b2); // throws ClassCastException due to the bug in source
    }
}
