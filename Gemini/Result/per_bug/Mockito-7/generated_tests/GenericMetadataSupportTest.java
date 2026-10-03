package org.mockito.internal.util.reflection;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GenericMetadataSupportTest {

    // --- Interfaces / Classes สำหรับจำลอง Generic Hierarchy ---

    interface NonGenericInterface {
        String simpleMethod();
    }

    interface SingleBoundGenericInterface<T> {
        T getT();
        List<T> getListT();
        <M> M methodWithTypeParam();
        <A extends CharSequence> A methodWithBoundedTypeParam();
    }

    interface MultiBoundInterface<T extends Number & Comparable<T> & Serializable> {
        T getMultiBound();
    }

    interface SuperGeneric<K, V> {
        K getKey();
        V getValue();
    }

    interface SubGeneric<V> extends SuperGeneric<String, V> {
    }

    static class GenericClassImpl<V> implements SubGeneric<V> {
        @Override
        public String getKey() { return null; }
        @Override
        public V getValue() { return null; }
    }

    static class ConcreteStringGeneric extends GenericClassImpl<Integer> {
    }

    interface WildcardHolder<W> {
        List<? extends Number> wildcardUpper();
        List<? super Integer> wildcardLower();
        List<? extends W> wildcardTypeVar();
    }

    interface ChainedTypeVars<A, B extends A, C extends B> {
        C getChained();
    }

    interface ArrayMethodInterface<T> {
        T[] getGenericArray();
    }

    // =========================================================================
    // 1. inferFrom(Type) tests
    // =========================================================================

    @Test(expected = RuntimeException.class)
    public void inferFrom_shouldThrowException_whenTypeIsNull() {
        GenericMetadataSupport.inferFrom(null);
    }

    @Test
    public void inferFrom_shouldHandlePlainClass() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NonGenericInterface.class);
        assertNotNull(metadata);
        assertEquals(NonGenericInterface.class, metadata.rawType());
        assertTrue(metadata.actualTypeArguments().isEmpty());
    }

    @Test
    public void inferFrom_shouldHandleParameterizedType() throws Exception {
        Method method = SingleBoundGenericInterface.class.getMethod("getListT");
        Type returnType = method.getGenericReturnType(); // List<T>

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(returnType);
        assertNotNull(metadata);
        assertEquals(List.class, metadata.rawType());
    }

    @Test(expected = MockitoException.class)
    public void inferFrom_shouldThrowMockitoException_forUnsupportedType() throws Exception {
        Method method = ArrayMethodInterface.class.getMethod("getGenericArray");
        Type genericArrayType = method.getGenericReturnType(); // T[]

        GenericMetadataSupport.inferFrom(genericArrayType);
    }

    // =========================================================================
    // 2. Class Hierarchy & Inheritance Resolution tests
    // =========================================================================

    @Test
    public void inferFrom_shouldResolveSuperClassAndInterfaceTypeVariables() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteStringGeneric.class);
        assertEquals(ConcreteStringGeneric.class, metadata.rawType());

        // Contextual type arguments on SubGeneric / SuperGeneric
        Map<TypeVariable, Type> typeArguments = metadata.actualTypeArguments();
        assertNotNull(typeArguments);
    }

    @Test
    public void resolveGenericReturnType_plainMethod_returnsNotGenericReturnTypeSupport() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(NonGenericInterface.class);
        Method method = NonGenericInterface.class.getMethod("simpleMethod");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(String.class, returnMetadata.rawType());
        assertEquals(0, returnMetadata.extraInterfaces().size());
        assertEquals(0, returnMetadata.rawExtraInterfaces().length);
        assertFalse(returnMetadata.hasRawExtraInterfaces());
    }

    // =========================================================================
    // 3. resolveGenericReturnType with ParameterizedType & TypeVariable
    // =========================================================================

    @Test
    public void resolveGenericReturnType_whenReturningParameterizedType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SingleBoundGenericInterface.class);
        Method method = SingleBoundGenericInterface.class.getMethod("getListT");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_whenReturningTypeVariable_singleBound() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SingleBoundGenericInterface.class);
        Method method = SingleBoundGenericInterface.class.getMethod("getT");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_whenMethodDeclaresOwnTypeParameters() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SingleBoundGenericInterface.class);
        Method method = SingleBoundGenericInterface.class.getMethod("methodWithTypeParam");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_whenMethodDeclaresBoundedTypeParameter() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SingleBoundGenericInterface.class);
        Method method = SingleBoundGenericInterface.class.getMethod("methodWithBoundedTypeParam");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(CharSequence.class, returnMetadata.rawType());
    }

    @Test(expected = MockitoException.class)
    public void resolveGenericReturnType_throwsExceptionForGenericArrayReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ArrayMethodInterface.class);
        Method method = ArrayMethodInterface.class.getMethod("getGenericArray");

        metadata.resolveGenericReturnType(method);
    }

    // =========================================================================
    // 4. Multi-bound & Extra Interfaces tests
    // =========================================================================

    @Test
    public void resolveGenericReturnType_multiBoundTypeVariable_extractsRawAndExtraInterfaces() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MultiBoundInterface.class);
        Method method = MultiBoundInterface.class.getMethod("getMultiBound");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Number.class, returnMetadata.rawType());
        assertTrue(returnMetadata.hasRawExtraInterfaces());

        List<Type> extraInterfaces = returnMetadata.extraInterfaces();
        assertEquals(2, extraInterfaces.size());

        Class<?>[] rawExtra = returnMetadata.rawExtraInterfaces();
        assertEquals(2, rawExtra.length);
        assertEquals(Comparable.class, rawExtra[0]);
        assertEquals(Serializable.class, rawExtra[1]);
    }

    // =========================================================================
    // 5. Chained Type Variables Recursion (A -> B -> C)
    // =========================================================================

    @Test
    public void resolveGenericReturnType_chainedTypeVariables_resolvesCorrectly() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ChainedTypeVars.class);
        Method method = ChainedTypeVars.class.getMethod("getChained");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Object.class, returnMetadata.rawType());
    }

    // =========================================================================
    // 6. Wildcard Handling tests (Upper Bound, Lower Bound, TypeVariable Bound)
    // =========================================================================

    @Test
    public void wildcardRegistration_shouldResolveAllWildcardBounds() throws Exception {
        Method methodUpper = WildcardHolder.class.getMethod("wildcardUpper");
        ParameterizedType ptUpper = (ParameterizedType) methodUpper.getGenericReturnType();
        GenericMetadataSupport metadataUpper = GenericMetadataSupport.inferFrom(ptUpper);
        assertEquals(List.class, metadataUpper.rawType());

        Method methodLower = WildcardHolder.class.getMethod("wildcardLower");
        ParameterizedType ptLower = (ParameterizedType) methodLower.getGenericReturnType();
        GenericMetadataSupport metadataLower = GenericMetadataSupport.inferFrom(ptLower);
        assertEquals(List.class, metadataLower.rawType());

        Method methodTypeVar = WildcardHolder.class.getMethod("wildcardTypeVar");
        ParameterizedType ptTypeVar = (ParameterizedType) methodTypeVar.getGenericReturnType();
        GenericMetadataSupport metadataTypeVar = GenericMetadataSupport.inferFrom(ptTypeVar);
        assertEquals(List.class, metadataTypeVar.rawType());
    }

    // =========================================================================
    // 7. BoundedType implementation tests (TypeVarBoundedType & WildCardBoundedType)
    // =========================================================================

    @Test
    public void typeVarBoundedType_methodsAndEqualsContract() throws Exception {
        Method method = MultiBoundInterface.class.getMethod("getMultiBound");
        TypeVariable<?> tv = (TypeVariable<?>) method.getGenericReturnType();

        GenericMetadataSupport.TypeVarBoundedType boundedType1 = new GenericMetadataSupport.TypeVarBoundedType(tv);
        GenericMetadataSupport.TypeVarBoundedType boundedType2 = new GenericMetadataSupport.TypeVarBoundedType(tv);

        assertEquals(Number.class, boundedType1.firstBound());
        assertEquals(2, boundedType1.interfaceBounds().length);
        assertEquals(tv, boundedType1.typeVariable());
        assertEquals(boundedType1, boundedType2);
        assertEquals(boundedType1, boundedType1);
        assertNotEquals(boundedType1, null);
        assertNotEquals(boundedType1, "OtherType");
        assertEquals(boundedType1.hashCode(), boundedType2.hashCode());
        assertNotNull(boundedType1.toString());
    }

    @Test
    public void wildCardBoundedType_methodsAndEqualsContract() throws Exception {
        Method method = WildcardHolder.class.getMethod("wildcardUpper");
        ParameterizedType pt = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) pt.getActualTypeArguments()[0];

        GenericMetadataSupport.WildCardBoundedType wildCardBounded1 = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        GenericMetadataSupport.WildCardBoundedType wildCardBounded2 = new GenericMetadataSupport.WildCardBoundedType(wildcardType);

        assertEquals(Number.class, wildCardBounded1.firstBound());
        assertEquals(0, wildCardBounded1.interfaceBounds().length);
        assertEquals(wildcardType, wildCardBounded1.wildCard());
        assertEquals(wildCardBounded1.hashCode(), wildCardBounded2.hashCode());
        assertNotNull(wildCardBounded1.toString());
    }
}