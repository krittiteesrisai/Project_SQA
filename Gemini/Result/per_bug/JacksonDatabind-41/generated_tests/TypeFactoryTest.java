package com.fasterxml.jackson.databind.type;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class TypeFactoryTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    @After
    public void tearDown() {
        typeFactory.clearCache();
    }

    // ==========================================
    // Test for findClass & Primitive handling
    // ==========================================
    @Test
    public void testFindClassPrimitive() throws Exception {
        assertEquals(int.class, typeFactory.findClass("int"));
        assertEquals(long.class, typeFactory.findClass("long"));
        assertEquals(float.class, typeFactory.findClass("float"));
        assertEquals(double.class, typeFactory.findClass("double"));
        assertEquals(boolean.class, typeFactory.findClass("boolean"));
        assertEquals(byte.class, typeFactory.findClass("byte"));
        assertEquals(char.class, typeFactory.findClass("char"));
        assertEquals(short.class, typeFactory.findClass("short"));
        assertEquals(void.class, typeFactory.findClass("void"));
        assertNull(typeFactory._findPrimitive("nonexistent"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassInvalid() throws Exception {
        typeFactory.findClass("com.nonexistent.ClassXYZ");
    }

    @Test(expected = RuntimeException.class)
    public void testFindClassRuntimeException() throws Exception {
        // Force a scenario or subclass where classForName throws a RuntimeException
        TypeFactory customFactory = new TypeFactory(new TypeParser(typeFactory), null, null) {
            @Override
            protected Class<?> classForName(String name, boolean initialize, ClassLoader loader) throws ClassNotFoundException {
                throw new RuntimeException("Simulated Runtime Exception");
            }
        };
        customFactory.findClass("java.lang.String");
    }

    // ==========================================
    // Tests for constructSpecializedType
    // ==========================================
    @Test
    public void testConstructSpecializedTypeEdgeCases() {
        JavaType stringType = typeFactory.constructType(String.class);
        
        // Branch: rawBase == subclass
        assertSame(stringType, typeFactory.constructSpecializedType(stringType, String.class));

        // Branch: rawBase == Object.class
        JavaType objectType = typeFactory.constructType(Object.class);
        JavaType specializedFromObj = typeFactory.constructSpecializedType(objectType, String.class);
        assertNotNull(specializedFromObj);

        // Branch: Not assignable (IllegalArgumentException)
        try {
            typeFactory.constructSpecializedType(stringType, Integer.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not subtype of"));
        }

        // Branch: Container types (Map-like & Collection-like shortcuts)
        JavaType mapType = typeFactory.constructMapType(Map.class, String.class, String.class);
        JavaType hashMapType = typeFactory.constructSpecializedType(mapType, HashMap.class);
        assertNotNull(hashMapType);

        JavaType collectionType = typeFactory.constructCollectionType(Collection.class, String.class);
        JavaType arrayListType = typeFactory.constructSpecializedType(collectionType, ArrayList.class);
        assertNotNull(arrayListType);

        // Branch: EnumSet special handling
        JavaType enumSetType = typeFactory.constructType(EnumSet.class);
        JavaType specializedEnumSet = typeFactory.constructSpecializedType(enumSetType, EnumSet.class);
        assertNotNull(specializedEnumSet);
    }

    // ==========================================
    // Tests for constructGeneralizedType
    // ==========================================
    @Test
    public void testConstructGeneralizedType() {
        JavaType stringListType = typeFactory.constructCollectionType(ArrayList.class, String.class);
        
        // Branch: rawBase == superClass
        assertSame(stringListType, typeFactory.constructGeneralizedType(stringListType, ArrayList.class));

        // Branch: Valid super type
        JavaType collectionSuper = typeFactory.constructGeneralizedType(stringListType, Collection.class);
        assertNotNull(collectionSuper);

        // Branch: Invalid super type (IllegalArgumentException)
        try {
            typeFactory.constructGeneralizedType(stringListType, Integer.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not a super-type"));
        }
    }

    // ==========================================
    // Tests for _fromAny and unrecognised types
    // ==========================================
    @Test(expected = IllegalArgumentException.class)
    public void testFromAnyUnrecognizedType() throws Exception {
        // Pass a mock or unsupported Type implementation to trigger unrecognized type exception
        Type unsupportedType = new Type() {};
        typeFactory.constructType(unsupportedType);
    }

    @Test
    public void testWithModifierAndLoaders() {
        assertNotNull(typeFactory.withModifier(null));
        assertNotNull(typeFactory.withClassLoader(Thread.currentThread().getContextClassLoader()));
        assertNotNull(typeFactory.getClassLoader());
    }

    @Test
    public void testMoreSpecificType() {
        JavaType strType = typeFactory.constructType(String.class);
        JavaType objType = typeFactory.constructType(Object.class);

        assertNull(typeFactory.moreSpecificType(null, null));
        assertEquals(strType, typeFactory.moreSpecificType(null, strType));
        assertEquals(strType, typeFactory.moreSpecificType(strType, null));
        assertEquals(strType, typeFactory.moreSpecificType(strType, strType));
        // objType.isAssignableFrom(strType) -> strType is more specific
        assertEquals(strType, typeFactory.moreSpecificType(objType, strType));
    }

    @Test
    public void testWellKnownTypesAndCache() {
        assertNotNull(TypeFactory.unknownType());
        assertNotNull(TypeFactory.rawClass(String.class));
        
        typeFactory.clearCache();
        JavaType cachedInt = typeFactory.constructType(int.class);
        assertNotNull(cachedInt);
    }
}