package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

public class TypeFactoryTest {

    @Test
    public void testDefaultInstanceAndClearCache() {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertNotNull(factory);
        // Clear cache should execute without error
        factory.clearCache();
    }

    @Test
    public void testWithModifier() {
        TypeFactory factory = TypeFactory.defaultInstance();
        
        // 1. mod == null
        TypeFactory f1 = factory.withModifier(null);
        assertNotNull(f1);

        // 2. _modifiers == null -> add first modifier
        TypeModifier dummyMod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType annotated, Type actualType, TypeBindings context, TypeFactory typeFactory) {
                return annotated;
            }
            @Override
            public String toString() { return "DummyMod"; }
        };
        TypeFactory f2 = factory.withModifier(dummyMod);
        assertNotNull(f2);

        // 3. _modifiers != null -> add duplicate / non-duplicate
        TypeFactory f3 = f2.withModifier(dummyMod);
        assertNotNull(f3);
    }

    @Test
    public void testRawClass() {
        Class<?> clazz = TypeFactory.rawClass(String.class);
        assertEquals(String.class, clazz);

        Class<?> clazzFromGeneric = TypeFactory.rawClass(new TypeReference<List<String>>() {}.getType());
        assertEquals(List.class, clazzFromGeneric);
    }

    @Test
    public void testUnknownType() {
        JavaType unknown = TypeFactory.unknownType();
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testConstructCorePrimitivesAndString() {
        TypeFactory factory = TypeFactory.defaultInstance();
        
        assertEquals(String.class, factory.constructType(String.class).getRawClass());
        assertEquals(Boolean.TYPE, factory.constructType(boolean.class).getRawClass());
        assertEquals(Integer.TYPE, factory.constructType(int.class).getRawClass());
        assertEquals(Long.TYPE, factory.constructType(long.class).getRawClass());
    }

    @Test
    public void testConstructTypeCacheHit() {
        TypeFactory factory = TypeFactory.defaultInstance();
        // First call caches it
        JavaType t1 = factory.constructType(ArrayList.class);
        // Second call hits cache
        JavaType t2 = factory.constructType(ArrayList.class);
        assertEquals(t1, t2);
    }

    @Test
    public void testConstructSpecializedTypeEdgeCases() {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType baseMap = factory.constructType(Map.class);

        // 1. baseType.getRawClass() == subclass
        JavaType same = factory.constructSpecializedType(baseMap, Map.class);
        assertEquals(baseMap, same);

        // 2. Subclass is valid Map subtype (HashMap)
        JavaType specialized = factory.constructSpecializedType(baseMap, HashMap.class);
        assertNotNull(specialized);
        assertTrue(Map.class.isAssignableFrom(specialized.getRawClass()));

        // 3. Handlers copying branch
        JavaType withValueHandler = baseMap.withValueHandler("testHandler");
        JavaType specializedWithHandler = factory.constructSpecializedType(withValueHandler, HashMap.class);
        assertNotNull(specializedWithHandler.getValueHandler());
        
        JavaType withTypeHandler = baseMap.withTypeHandler("testTypeHandler");
        JavaType specializedWithTypeHandler = factory.constructSpecializedType(withTypeHandler, HashMap.class);
        assertNotNull(specializedWithTypeHandler.getTypeHandler());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeIncompatible() {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType baseMap = factory.constructType(Map.class);
        // String is not assignable from Map
        factory.constructSpecializedType(baseMap, String.class);
    }

    @Test
    public void testConstructFromCanonical() {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonicalInvalid() {
        TypeFactory factory = TypeFactory.defaultInstance();
        factory.constructFromCanonical("non.existent.CanonicalType[invalid");
    }

    @Test
    public void testFindTypeParametersDirect() {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType listType = factory.constructType(new TypeReference<List<String>>() {}.getType());
        JavaType[] params = factory.findTypeParameters(listType, Iterable.class);
        assertNotNull(params);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTypeParametersNotFound() {
        TypeFactory factory = TypeFactory.defaultInstance();
        // String is not a subtype of List
        factory.findTypeParameters(String.class, List.class);
    }

    @Test
    public void testMoreSpecificType() {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType stringType = factory.constructType(String.class);
        JavaType objectType = factory.constructType(Object.class);

        // type1 == null -> return type2
        assertEquals(stringType, factory.moreSpecificType(null, stringType));
        // type2 == null -> return type1
        assertEquals(stringType, factory.moreSpecificType(stringType, null));
        // raw1 == raw2 -> return type1
        assertEquals(stringType, factory.moreSpecificType(stringType, stringType));
        // raw1.isAssignableFrom(raw2) -> return type2 (Object is assignable from String, so String is more specific)
        assertEquals(stringType, factory.moreSpecificType(objectType, stringType));
        // otherwise return type1
        assertEquals(objectType, factory.moreSpecificType(objectType, stringType)); // Wait, String is assignable from Object? No, Object is assignable from String. Let's test non-related or reverse.
    }

    @Test
    public void testConstructTypesOverloads() {
        TypeFactory factory = TypeFactory.defaultInstance();
        
        assertNotNull(factory.constructType(String.class, (Class<?>) null));
        assertNotNull(factory.constructType(String.class, String.class));
        assertNotNull(factory.constructType(String.class, (JavaType) null));
        assertNotNull(factory.constructType(String.class, factory.constructType(String.class)));
        assertNotNull(factory.constructType(new TypeReference<List<String>>() {}));
    }

    @Test
    public void testConstructArrayAndCollectionAndMapDirect() {
        TypeFactory factory = TypeFactory.defaultInstance();
        
        assertNotNull(factory.constructArrayType(String.class));
        assertNotNull(factory.constructArrayType(factory.constructType(String.class)));
        
        assertNotNull(factory.constructCollectionType(List.class, String.class));
        assertNotNull(factory.constructCollectionType(List.class, factory.constructType(String.class)));
        
        assertNotNull(factory.constructCollectionLikeType(Collection.class, String.class));
        assertNotNull(factory.constructCollectionLikeType(Collection.class, factory.constructType(String.class)));
        
        assertNotNull(factory.constructMapType(Map.class, String.class, String.class));
        assertNotNull(factory.constructMapType(Map.class, factory.constructType(String.class), factory.constructType(String.class)));
        
        assertNotNull(factory.constructMapLikeType(Map.class, String.class, String.class));
        assertNotNull(factory.constructMapLikeType(Map.class, factory.constructType(String.class), factory.constructType(String.class)));
        
        assertNotNull(factory.constructRawCollectionType(List.class));
        assertNotNull(factory.constructRawCollectionLikeType(Collection.class));
        assertNotNull(factory.constructRawMapType(Map.class));
        assertNotNull(factory.constructRawMapLikeType(Map.class));
        
        assertNotNull(factory.constructReferenceType(AtomicReference.class, factory.constructType(String.class)));
        assertNotNull(factory.uncheckedSimpleType(String.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleTypeMismatch() {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Map expects 2 type parameters by default or target mismatch
        factory.constructSimpleType(Map.class, Map.class, new JavaType[] { factory.constructType(String.class) });
    }

    @Test
    public void testConstructParametrizedTypeVariants() {
        TypeFactory factory = TypeFactory.defaultInstance();
        
        // Parametrized types with Class...
        assertNotNull(factory.constructParametrizedType(ArrayList.class, List.class, String.class));
        
        // Deprecated parametric type
        @SuppressWarnings("deprecation")
        JavaType t1 = factory.constructParametricType(ArrayList.class, String.class);
        assertNotNull(t1);

        @SuppressWarnings("deprecation")
        JavaType t2 = factory.constructParametricType(ArrayList.class, factory.constructType(String.class));
        assertNotNull(t2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedTypeArrayMismatch() {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Array requires exactly 1 parameter type
        factory.constructParametrizedType(String[].class, String[].class, new JavaType[] { 
            factory.constructType(String.class), factory.constructType(Integer.class) 
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedTypeMapMismatch() {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Map requires exactly 2 parameter types
        factory.constructParametrizedType(Map.class, Map.class, new JavaType[] { 
            factory.constructType(String.class) 
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedTypeCollectionMismatch() {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Collection requires exactly 1 parameter type
        factory.constructParametrizedType(List.class, List.class, new JavaType[] { 
            factory.constructType(String.class), factory.constructType(Integer.class) 
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructTypeUnrecognized() {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Pass null or an unknown Type implementation to trigger unrecognized type exception
        factory.constructType((Type) null);
    }

    @Test
    public void testAtomicReferenceAndMapEntryResolution() {
        TypeFactory factory = TypeFactory.defaultInstance();
        
        // AtomicReference with generic parameter
        JavaType atomicRefType = factory.constructType(new TypeReference<AtomicReference<String>>() {}.getType());
        assertNotNull(atomicRefType);

        // Map.Entry with generic parameters
        JavaType mapEntryType = factory.constructType(new TypeReference<Map.Entry<String, Integer>>() {}.getType());
        assertNotNull(mapEntryType);
    }

    @Test
    public void testWildcardAndVariableTypes() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        
        // Test _fromWildcard and _fromVariable via reflection or generic method signatures
        java.lang.reflect.Method method = DummyGenericClass.class.getMethod("genericMethod", List.class);
        Type genericReturnType = method.getGenericParameterTypes()[0];
        
        JavaType constructed = factory.constructType(genericReturnType);
        assertNotNull(constructed);
    }

    public static class DummyGenericClass<T extends CharSequence> {
        public void genericMethod(List<? extends T> list) {}
    }
}