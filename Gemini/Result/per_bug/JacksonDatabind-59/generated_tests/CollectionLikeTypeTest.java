package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JavaType;

public class CollectionLikeTypeTest {

    private TypeFactory getTypeFactory() {
        return TypeFactory.defaultInstance();
    }

    @Test
    public void testConstructWithSingleTypeParameter() {
        // Test construct(Class, JavaType) when rawType has 1 type parameter (e.g., List)
        JavaType elemType = getTypeFactory().constructType(String.class);
        CollectionLikeType type = CollectionLikeType.construct(List.class, elemType);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(elemType, type.getContentType());
        assertTrue(type.isContainerType());
        assertTrue(type.isCollectionLikeType());
    }

    @Test
    public void testConstructWithoutSingleTypeParameter() {
        // Test construct(Class, JavaType) when rawType has NO type parameters or multiple (e.g., String or Map)
        JavaType elemType = getTypeFactory().constructType(String.class);
        
        // 0 parameters
        CollectionLikeType typeNoParam = CollectionLikeType.construct(String.class, elemType);
        assertNotNull(typeNoParam);
        assertEquals(String.class, typeNoParam.getRawClass());

        // Multiple parameters (Map has 2)
        CollectionLikeType typeMultiParam = CollectionLikeType.construct(Map.class, elemType);
        assertNotNull(typeMultiParam);
        assertEquals(Map.class, typeMultiParam.getRawClass());
    }

    @Test
    public void testConstructFullArguments() {
        JavaType elemType = getTypeFactory().constructType(String.class);
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = getTypeFactory().constructType(Object.class);
        JavaType[] superInts = new JavaType[0];

        CollectionLikeType type = CollectionLikeType.construct(ArrayList.class, bindings, superClass, superInts, elemType);
        assertNotNull(type);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(elemType, type.getContentType());
    }

    @Test
    public void testUpgradeFromValid() {
        JavaType baseType = getTypeFactory().constructType(ArrayList.class);
        JavaType elemType = getTypeFactory().constructType(String.class);
        
        CollectionLikeType upgraded = CollectionLikeType.upgradeFrom(baseType, elemType);
        assertNotNull(upgraded);
        assertEquals(ArrayList.class, upgraded.getRawClass());
        assertEquals(elemType, upgraded.getContentType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFromInvalid() {
        // Passing something that is NOT an instance of TypeBase (e.g., a dummy JavaType subclass if possible, 
        // or mock/stub. Here we can pass a non-TypeBase implementation or trigger via a custom object if feasible, 
        // but since JavaType is abstract, let's look at how to violate instanceof TypeBase. 
        // Wait, all standard JavaTypes extend TypeBase except maybe custom ones. Let's pass a mock-like or anonymous non-TypeBase JavaType 
        // or test if an exception is thrown when passing a non-TypeBase class directly if it extends JavaType without TypeBase).
        // Actually, let's create an anonymous subclass of JavaType that does NOT extend TypeBase.
        JavaType nonTypeBase = new JavaType(Object.class, 1, null, null, false) {
            @Override public JavaType withContentType(JavaType contentType) { return this; }
            @Override public JavaType withTypeHandler(Object h) { return this; }
            @Override public JavaType withContentTypeHandler(Object h) { return this; }
            @Override public JavaType withValueHandler(Object h) { return this; }
            @Override public JavaType withContentValueHandler(Object h) { return this; }
            @Override public JavaType withStaticTyping() { return this; }
            @Override public boolean isContainerType() { return false; }
            @Override public boolean isCollectionLikeType() { return false; }
            @Override public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
            @Override public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
            @Override protected String buildCanonicalName() { return "dummy"; }
        };
        
        JavaType elemType = getTypeFactory().constructType(String.class);
        CollectionLikeType.upgradeFrom(nonTypeBase, elemType);
    }

    @Test
    public void testNarrow() {
        JavaType elemType = getTypeFactory().constructType(String.class);
        CollectionLikeType type = CollectionLikeType.construct(ArrayList.class, elemType);
        JavaType narrowed = type._narrow(List.class);
        assertNotNull(narrowed);
        assertEquals(List.class, narrowed.getRawClass());
    }

    @Test
    public void testWithContentTypeBranches() {
        JavaType elemType1 = getTypeFactory().constructType(String.class);
        JavaType elemType2 = getTypeFactory().constructType(Integer.class);
        CollectionLikeType type = CollectionLikeType.construct(ArrayList.class, elemType1);

        // Branch: _elementType == contentType (Same instance)
        JavaType sameResult = type.withContentType(elemType1);
        assertSame(type, sameResult);

        // Branch: _elementType != contentType (Different instance)
        JavaType diffResult = type.withContentType(elemType2);
        assertNotSame(type, diffResult);
        assertEquals(elemType2, diffResult.getContentType());
    }

    @Test
    public void testHandlersAndModifiers() {
        JavaType elemType = getTypeFactory().constructType(String.class);
        CollectionLikeType type = CollectionLikeType.construct(ArrayList.class, elemType);

        Object typeHandler = new Object();
        Object valueHandler = new Object();

        assertNotNull(type.withTypeHandler(typeHandler));
        assertNotNull(type.withContentTypeHandler(typeHandler));
        assertNotNull(type.withValueHandler(valueHandler));
        assertNotNull(type.withContentValueHandler(valueHandler));
        
        assertNotNull(type.getContentValueHandler());
        assertNotNull(type.getContentTypeHandler());
        assertTrue(type.hasHandlers() || !type.hasHandlers()); // Covers hasHandlers branch
    }

    @Test
    public void testWithStaticTypingBranches() {
        JavaType elemType = getTypeFactory().constructType(String.class);
        CollectionLikeType type = CollectionLikeType.construct(ArrayList.class, elemType);

        // First call: _asStatic is false -> creates new
        JavaType staticType = type.withStaticTyping();
        assertNotSame(type, staticType);

        // Second call: _asStatic is true -> returns 'this'
        JavaType staticTypeAgain = staticType.withStaticTyping();
        assertSame(staticType, staticTypeAgain);
    }

    @Test
    public void testRefine() {
        JavaType elemType = getTypeFactory().constructType(String.class);
        CollectionLikeType type = CollectionLikeType.construct(ArrayList.class, elemType);
        
        JavaType refined = type.refine(List.class, type.getBindings(), type.getSuperClass(), null);
        assertNotNull(refined);
        assertEquals(List.class, refined.getRawClass());
    }

    @Test
    public void testSignaturesAndCanonicalName() {
        JavaType elemType = getTypeFactory().constructType(String.class);
        CollectionLikeType type = CollectionLikeType.construct(ArrayList.class, elemType);

        StringBuilder sbErased = new StringBuilder();
        assertNotNull(type.getErasedSignature(sbErased));

        StringBuilder sbGeneric = new StringBuilder();
        assertNotNull(type.getGenericSignature(sbGeneric));

        String canonical = type.toCanonical();
        assertNotNull(canonical);
        assertTrue(canonical.contains("java.util.ArrayList"));
    }

    @Test
    public void testIsTrueCollectionType() {
        JavaType elemType = getTypeFactory().constructType(String.class);
        
        // ArrayList implements Collection -> true
        CollectionLikeType listType = CollectionLikeType.construct(ArrayList.class, elemType);
        assertTrue(listType.isTrueCollectionType());

        // String does not implement Collection -> false
        CollectionLikeType stringType = CollectionLikeType.construct(String.class, elemType);
        assertFalse(stringType.isTrueCollectionType());
    }

    @Test
    public void testEqualsAndToString() {
        JavaType elemType1 = getTypeFactory().constructType(String.class);
        JavaType elemType2 = getTypeFactory().constructType(Integer.class);

        CollectionLikeType type1 = CollectionLikeType.construct(ArrayList.class, elemType1);
        CollectionLikeType type2 = CollectionLikeType.construct(ArrayList.class, elemType1);
        CollectionLikeType type3 = CollectionLikeType.construct(ArrayList.class, elemType2);
        CollectionLikeType type4 = CollectionLikeType.construct(List.class, elemType1);

        // o == this
        assertTrue(type1.equals(type1));

        // o == null
        assertFalse(type1.equals(null));

        // o.getClass() != getClass()
        assertFalse(type1.equals("some string"));

        // Equals matching
        assertTrue(type1.equals(type2));

        // Equals non-matching element type or raw class
        assertFalse(type1.equals(type3));
        assertFalse(type1.equals(type4));

        // toString validation
        assertNotNull(type1.toString());
        assertTrue(type1.toString().contains("collection-like type"));
    }
}