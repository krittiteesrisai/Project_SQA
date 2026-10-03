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
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GenericMetadataSupportTest {

    // Interfaces and Classes for testing generic scenarios
    interface SingleBoundInterface<T extends Number> {
        T returningSingleBound();
    }

    interface MultiBoundInterface<K extends Number & Comparable<K> & Cloneable> {
        K returningMultiBound();
    }

    interface GenericsNest<K extends Comparable<K> & Cloneable> extends Map<K, Set<Number>> {
        Set<Number> remove(Object key);
        List<? super Integer> returning_wildcard_with_class_lower_bound();
        List<? super K> returning_wildcard_with_typeVar_lower_bound();
        List<? extends K> returning_wildcard_with_typeVar_upper_bound();
        K returningK();
        <O extends K> List<O> paramType_with_type_params();
        <S, T extends S> T two_type_params();
        <O extends K> O typeVar_with_type_params();
        Number returningNonGeneric();
        <A> A[] returningGenericArray();
    }

    interface UpperBoundedInterface<E extends List<String>> {
        E getList();
    }

    static class BaseGenericClass<T, S> {
        public T returnT() { return null; }
        public S returnS() { return null; }
    }

    static class ConcreteSubClass extends BaseGenericClass<String, Integer> implements SingleBoundInterface<Double> {
        @Override
        public Double returningSingleBound() { return null; }
    }

    static class DeepSubClass extends ConcreteSubClass {}

    // Dummy custom Type to trigger Unsupported Type paths
    static class CustomType implements Type {
        @Override
        public String toString() {
            return "CustomType";
        }
    }

    // ----------------------------------------------------------------------------------
    // inferFrom Tests
    // ----------------------------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void inferFrom_shouldThrowExceptionOnNull() {
        GenericMetadataSupport.inferFrom(null);
    }

    @Test
    public void inferFrom_shouldSupportClassType() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteSubClass.class);
        assertNotNull(metadata);
        assertEquals(ConcreteSubClass.class, metadata.rawType());
    }

    @Test
    public void inferFrom_shouldSupportParameterizedType() throws Exception {
        Method method = GenericsNest.class.getMethod("returning_wildcard_with_class_lower_bound");
        Type parameterizedType = method.getGenericReturnType();
        
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(parameterizedType);
        assertNotNull(metadata);
        assertEquals(List.class, metadata.rawType());
    }

    @Test(expected = MockitoException.class)
    public void inferFrom_shouldThrowMockitoExceptionOnUnsupportedType() {
        GenericMetadataSupport.inferFrom(new CustomType());
    }

    // ----------------------------------------------------------------------------------
    // FromClassGenericMetadataSupport & Superclass/Interface Resolution
    // ----------------------------------------------------------------------------------

    @Test
    public void fromClass_shouldResolveSuperClassAndInterfaces() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(ConcreteSubClass.class);
        Map<TypeVariable, Type> typeArguments = metadata.actualTypeArguments();
        assertNotNull(typeArguments);
    }

    @Test
    public void fromClass_shouldHandleDeepInheritanceHierarchy() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(DeepSubClass.class);
        assertEquals(DeepSubClass.class, metadata.rawType());
        assertNotNull(metadata.actualTypeArguments());
    }

    // ----------------------------------------------------------------------------------
    // resolveGenericReturnType Tests
    // ----------------------------------------------------------------------------------

    @Test
    public void resolveGenericReturnType_shouldResolveNonGenericReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("returningNonGeneric");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Number.class, returnMetadata.rawType());
        assertEquals(0, returnMetadata.extraInterfaces().size());
        assertEquals(0, returnMetadata.rawExtraInterfaces().length);
        assertFalse(returnMetadata.hasRawExtraInterfaces());
    }

    @Test
    public void resolveGenericReturnType_shouldResolveParameterizedReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("remove", Object.class);

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Set.class, returnMetadata.rawType());
    }

    @Test
    public void resolveGenericReturnType_shouldResolveTypeVariableReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SingleBoundInterface.class);
        Method method = SingleBoundInterface.class.getMethod("returningSingleBound");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Number.class, returnMetadata.rawType());
    }

    @Test(expected = MockitoException.class)
    public void resolveGenericReturnType_shouldThrowMockitoExceptionForGenericArrayReturnType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("returningGenericArray");

        metadata.resolveGenericReturnType(method);
    }

    // ----------------------------------------------------------------------------------
    // TypeVariableReturnType & Multi-bound Resolution (Defects4J Mockito-8 context)
    // ----------------------------------------------------------------------------------

    @Test
    public void typeVariableReturnType_shouldExtractMultiBoundsAndExtraInterfaces() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MultiBoundInterface.class);
        Method method = MultiBoundInterface.class.getMethod("returningMultiBound");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Number.class, returnMetadata.rawType());
        assertTrue(returnMetadata.hasRawExtraInterfaces());
        
        Class<?>[] extraInterfaces = returnMetadata.rawExtraInterfaces();
        assertEquals(2, extraInterfaces.length);
        assertEquals(Comparable.class, extraInterfaces[0]);
        assertEquals(Cloneable.class, extraInterfaces[1]);
    }

    @Test
    public void typeVariableReturnType_shouldResolveNestedTypeVariables() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("two_type_params");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Object.class, returnMetadata.rawType());
    }

    @Test
    public void typeVariableReturnType_shouldResolveMethodLevelTypeVariableBoundedByClassTypeVariable() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        Method method = GenericsNest.class.getMethod("typeVar_with_type_params");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(Comparable.class, returnMetadata.rawType());
    }

    @Test
    public void typeVariableReturnType_shouldHandleUpperBoundedByParameterizedType() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(UpperBoundedInterface.class);
        Method method = UpperBoundedInterface.class.getMethod("getList");

        GenericMetadataSupport returnMetadata = metadata.resolveGenericReturnType(method);
        assertEquals(List.class, returnMetadata.rawType());
    }

    // ----------------------------------------------------------------------------------
    // ParameterizedType with Wildcards & Bounds
    // ----------------------------------------------------------------------------------

    @Test
    public void parameterizedType_withWildcardUpperAndLowerBounds() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(GenericsNest.class);
        
        Method lowerBoundMethod = GenericsNest.class.getMethod("returning_wildcard_with_class_lower_bound");
        GenericMetadataSupport lowerMetadata = metadata.resolveGenericReturnType(lowerBoundMethod);
        assertEquals(List.class, lowerMetadata.rawType());

        Method upperBoundMethod = GenericsNest.class.getMethod("returning_wildcard_with_typeVar_upper_bound");
        GenericMetadataSupport upperMetadata = metadata.resolveGenericReturnType(upperBoundMethod);
        assertEquals(List.class, upperMetadata.rawType());
    }

    // ----------------------------------------------------------------------------------
    // TypeVarBoundedType and WildCardBoundedType Tests
    // ----------------------------------------------------------------------------------

    @Test
    public void typeVarBoundedType_methodsAndEqualsContract() throws Exception {
        TypeVariable<?>[] typeParameters = MultiBoundInterface.class.getTypeParameters();
        TypeVariable<?> typeVar = typeParameters[0];

        GenericMetadataSupport.TypeVarBoundedType boundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVar);
        assertEquals(Number.class, boundedType.firstBound());
        assertEquals(2, boundedType.interfaceBounds().length);
        assertEquals(typeVar, boundedType.typeVariable());
        assertTrue(boundedType.toString().contains("firstBound"));

        // Equals and HashCode
        GenericMetadataSupport.TypeVarBoundedType sameBoundedType = new GenericMetadataSupport.TypeVarBoundedType(typeVar);
        assertEquals(boundedType, sameBoundedType);
        assertEquals(boundedType.hashCode(), sameBoundedType.hashCode());
        assertEquals(boundedType, boundedType);
        assertNotEquals(boundedType, null);
        assertNotEquals(boundedType, "some string");
    }

    @Test
    public void wildCardBoundedType_methods() throws Exception {
        Method method = GenericsNest.class.getMethod("returning_wildcard_with_class_lower_bound");
        ParameterizedType pType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) pType.getActualTypeArguments()[0];

        GenericMetadataSupport.WildCardBoundedType wildCardBounded = new GenericMetadataSupport.WildCardBoundedType(wildcardType);
        assertEquals(Integer.class, wildCardBounded.firstBound());
        assertEquals(0, wildCardBounded.interfaceBounds().length);
        assertEquals(wildcardType, wildCardBounded.wildCard());
        assertTrue(wildCardBounded.toString().contains("interfaceBounds=[]"));
        assertEquals(wildcardType.hashCode(), wildCardBounded.hashCode());
        assertEquals(wildCardBounded, wildCardBounded);
        assertNotEquals(wildCardBounded, null);
        assertNotEquals(wildCardBounded, "string");
    }

    // Helper assertion to avoid JUnit version mismatch issues
    private void assertNotEquals(Object expected, Object actual) {
        if (expected == null && actual == null) {
            fail("expected not to be equal, but both are null");
        }
        if (expected != null && expected.equals(actual)) {
            fail("expected not to be equal, but both are: " + actual);
        }
    }
}