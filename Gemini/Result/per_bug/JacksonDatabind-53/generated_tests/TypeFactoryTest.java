package com.fasterxml.jackson.databind.type;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

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

    @Test
    public void testConstructSpecializedType_SameClass() {
        JavaType base = typeFactory.constructType(String.class);
        JavaType specialized = typeFactory.constructSpecializedType(base, String.class);
        assertSame(base, specialized);
    }

    @Test
    public void testConstructSpecializedType_FromObject() {
        JavaType base = typeFactory.constructType(Object.class);
        JavaType specialized = typeFactory.constructSpecializedType(base, String.class);
        assertNotNull(specialized);
        assertEquals(String.class, specialized.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_NotSubtype() {
        JavaType base = typeFactory.constructType(String.class);
        typeFactory.constructSpecializedType(base, Integer.class);
    }

    @Test
    public void testConstructSpecializedType_EmptyBindings() {
        JavaType base = typeFactory.constructType(List.class);
        JavaType specialized = typeFactory.constructSpecializedType(base, ArrayList.class);
        assertNotNull(specialized);
        assertEquals(ArrayList.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_MapSubtypes() {
        JavaType base = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JavaType specialized = typeFactory.constructSpecializedType(base, HashMap.class);
        assertEquals(HashMap.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_CollectionSubtypes() {
        JavaType base = typeFactory.constructCollectionType(Collection.class, String.class);
        JavaType specialized = typeFactory.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_EnumSetShortcut() {
        JavaType base = typeFactory.constructType(EnumSet.class);
        JavaType specialized = typeFactory.constructSpecializedType(base, EnumSet.class);
        assertNotNull(specialized);
    }

    @Test
    public void testConstructGeneralizedType_SameClass() {
        JavaType base = typeFactory.constructType(ArrayList.class);
        JavaType generalized = typeFactory.constructGeneralizedType(base, ArrayList.class);
        assertSame(base, generalized);
    }

    @Test
    public void testConstructGeneralizedType_ValidSuperType() {
        JavaType base = typeFactory.constructType(ArrayList.class);
        JavaType generalized = typeFactory.constructGeneralizedType(base, List.class);
        assertNotNull(generalized);
        assertEquals(List.class, generalized.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_NotSuperType() {
        JavaType base = typeFactory.constructType(String.class);
        typeFactory.constructGeneralizedType(base, ArrayList.class);
    }

    @Test
    public void testConstructFromCanonical() {
        String canonical = "java.util.List<java.lang.String>";
        JavaType type = typeFactory.constructFromCanonical(canonical);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testFindTypeParameters() {
        JavaType type = typeFactory.constructCollectionType(ArrayList.class, String.class);
        JavaType[] params = typeFactory.findTypeParameters(type, Collection.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParameters_NoMatch() {
        JavaType type = typeFactory.constructType(String.class);
        JavaType[] params = typeFactory.findTypeParameters(type, Map.class);
        assertArrayEquals(TypeFactory.unknownType() == null ? new JavaType[0] : new JavaType[0], params);
    }

    @Test
    public void testMoreSpecificType() {
        JavaType stringType = typeFactory.constructType(String.class);
        JavaType objectType = typeFactory.constructType(Object.class);

        assertNull(typeFactory.moreSpecificType(null, null));
        assertEquals(stringType, typeFactory.moreSpecificType(null, stringType));
        assertEquals(stringType, typeFactory.moreSpecificType(stringType, null));
        assertEquals(stringType, typeFactory.moreSpecificType(stringType, stringType));
        assertEquals(stringType, typeFactory.moreSpecificType(objectType, stringType));
    }

    @Test
    public void testConstructTypeVariants() {
        assertNotNull(typeFactory.constructType(String.class));
        assertNotNull(typeFactory.constructType(String.class, TypeFactory.EMPTY_BINDINGS));
        assertNotNull(typeFactory.constructType(new TypeReference<List<String>>() {}));
        assertNotNull(typeFactory.constructType(String.class, String.class));
        assertNotNull(typeFactory.constructType(String.class, typeFactory.constructType(String.class)));
    }

    @Test
    public void testDirectFactoryMethods() {
        assertNotNull(typeFactory.constructArrayType(String.class));
        assertNotNull(typeFactory.constructArrayType(typeFactory.constructType(String.class)));
        assertNotNull(typeFactory.constructCollectionType(ArrayList.class, String.class));
        assertNotNull(typeFactory.constructCollectionLikeType(Collection.class, String.class));
        assertNotNull(typeFactory.constructMapType(HashMap.class, String.class, String.class));
        assertNotNull(typeFactory.constructMapLikeType(Map.class, String.class, String.class));
        assertNotNull(typeFactory.constructSimpleType(List.class, new JavaType[]{typeFactory.constructType(String.class)}));
        assertNotNull(typeFactory.constructReferenceType(AtomicReference.class, typeFactory.constructType(String.class)));
        assertNotNull(typeFactory.uncheckedSimpleType(String.class));
        assertNotNull(typeFactory.constructParametricType(ArrayList.class, String.class));
        assertNotNull(typeFactory.constructParametrizedType(ArrayList.class, List.class, String.class));
        assertNotNull(typeFactory.constructParametrizedType(ArrayList.class, List.class, new JavaType[]{typeFactory.constructType(String.class)}));
        assertNotNull(typeFactory.constructParametrizedType(ArrayList.class, List.class, new Class[]{String.class}));
    }

    @Test
    public void testRawConstructors() {
        assertNotNull(typeFactory.constructRawCollectionType(ArrayList.class));
        assertNotNull(typeFactory.constructRawCollectionLikeType(Collection.class));
        assertNotNull(typeFactory.constructRawMapType(HashMap.class));
        assertNotNull(typeFactory.constructRawMapLikeType(Map.class));
    }

    @Test
    public void testFindClass() throws ClassNotFoundException {
        assertEquals(int.class, typeFactory.findClass("int"));
        assertEquals(String.class, typeFactory.findClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_NotFound() throws ClassNotFoundException {
        typeFactory.findClass("non.existent.ClassNameXYZ");
    }

    @Test
    public void testTypeModifierIntegration() {
        TypeFactory modified = typeFactory.withModifier(new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings bindings, TypeFactory typeFactory) {
                return type;
            }

            @Override
            public String toString() {
                return "DummyModifier";
            }
        });
        assertNotNull(modified);
        assertNotNull(modified.withClassLoader(Thread.currentThread().getContextClassLoader()));
        assertNotNull(modified.withModifier(null));
    }

    @Test
    public void testUnknownTypeAndRawClass() {
        assertNotNull(TypeFactory.unknownType());
        assertEquals(String.class, TypeFactory.rawClass(String.class));
        assertEquals(List.class, TypeFactory.rawClass(new TypeReference<List<String>>(){}.getType()));
    }
}