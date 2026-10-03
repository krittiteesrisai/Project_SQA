package com.fasterxml.jackson.databind.type;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.core.type.TypeReference;

import static org.junit.Assert.*;

public class TypeFactoryTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        typeFactory.clearCache();
    }

    @Test
    public void testWithModifier() {
        TypeFactory tfNull = typeFactory.withModifier(null);
        assertNotNull(tfNull);

        TypeModifier dummyMod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType annotated, Type actualType, TypeBindings bindings, TypeFactory typeFactory) {
                return annotated;
            }
        };

        TypeFactory tfFirst = typeFactory.withModifier(dummyMod);
        assertNotNull(tfFirst);

        TypeFactory tfSecond = tfFirst.withModifier(dummyMod);
        assertNotNull(tfSecond);
    }

    @Test
    public void testRawClass() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
        assertEquals(List.class, TypeFactory.rawClass(new TypeReference<List<String>>() {}.getType()));
    }

    @Test
    public void testConstructSpecializedTypeEdgeCases() {
        JavaType baseStr = typeFactory.constructType(String.class);
        assertEquals(baseStr, typeFactory.constructSpecializedType(baseStr, String.class));

        JavaType baseList = typeFactory.constructType(List.class);
        JavaType specializedArrayList = typeFactory.constructSpecializedType(baseList, ArrayList.class);
        assertNotNull(specializedArrayList);

        JavaType withValHandler = baseList.withValueHandler("handler");
        JavaType withTypeHandler = withValHandler.withTypeHandler("typeHandler");
        JavaType specializedWithHandlers = typeFactory.constructSpecializedType(withTypeHandler, ArrayList.class);
        assertNotNull(specializedWithHandlers);

        try {
            typeFactory.constructSpecializedType(baseList, Integer.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not subtype of"));
        }

        JavaType simpleBase = typeFactory.constructType(Number.class);
        JavaType narrowed = typeFactory.constructSpecializedType(simpleBase, Integer.class);
        assertNotNull(narrowed);
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType type = typeFactory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());

        try {
            typeFactory.constructFromCanonical("NonExistentClassType12345");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testFindTypeParameters() {
        JavaType mapType = typeFactory.constructType(new TypeReference<HashMap<String, Integer>>() {}.getType());
        JavaType[] params = typeFactory.findTypeParameters(mapType, Map.class);
        assertNotNull(params);
        assertEquals(2, params.length);

        JavaType simpleType = typeFactory.constructType(String.class);
        JavaType[] simpleParams = typeFactory.findTypeParameters(simpleType, String.class);
        assertNull(simpleParams);

        JavaType[] classParams = typeFactory.findTypeParameters(HashMap.class, Map.class);
        assertNotNull(classParams);

        try {
            typeFactory.findTypeParameters(String.class, Map.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("is not a subtype of"));
        }
    }

    @Test
    public void testMoreSpecificType() {
        JavaType strType = typeFactory.constructType(String.class);
        JavaType objType = typeFactory.constructType(Object.class);

        assertEquals(strType, typeFactory.moreSpecificType(null, strType));
        assertEquals(strType, typeFactory.moreSpecificType(strType, null));
        assertEquals(strType, typeFactory.moreSpecificType(strType, strType));
        assertEquals(objType, typeFactory.moreSpecificType(strType, objType)); // raw1.isAssignableFrom(raw2) -> type2
        assertEquals(strType, typeFactory.moreSpecificType(objType, strType)); // raw1 not assignable from raw2 -> type1
    }

    @Test
    public void testConstructTypeVariations() {
        assertNotNull(typeFactory.constructType(String.class, (Class<?>) null));
        assertNotNull(typeFactory.constructType(String.class, Object.class));
        assertNotNull(typeFactory.constructType(String.class, (JavaType) null));
        assertNotNull(typeFactory.constructType(String.class, typeFactory.constructType(Object.class)));
        assertNotNull(typeFactory.constructType(new TypeReference<List<String>>() {}));
    }

    @Test
    public void testConstructTypeUnrecognized() {
        try {
            typeFactory.constructType((Type) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unrecognized Type"));
        }

        try {
            Type weirdType = new Type() {};
            typeFactory.constructType(weirdType);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unrecognized Type"));
        }
    }

    @Test
    public void testConstructSimpleTypeValidation() {
        try {
            typeFactory.constructSimpleType(List.class, List.class, new JavaType[0]);
            fail("Expected IllegalArgumentException due to type param mismatch");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Parameter type mismatch"));
        }
        
        JavaType simple = typeFactory.constructSimpleType(Class.class, Class.class, new JavaType[]{typeFactory.constructType(Object.class)});
        assertNotNull(simple);
    }

    @Test
    public void testConstructParametrizedTypeEdgeCases() {
        try {
            typeFactory.constructParametrizedType(String[].class, String[].class, typeFactory.constructType(String.class), typeFactory.constructType(Integer.class));
            fail("Expected IllegalArgumentException for array");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Need exactly 1 parameter type for arrays"));
        }

        try {
            typeFactory.constructParametrizedType(Map.class, Map.class, typeFactory.constructType(String.class));
            fail("Expected IllegalArgumentException for Map");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Need exactly 2 parameter types for Map types"));
        }

        try {
            typeFactory.constructParametrizedType(List.class, List.class);
            fail("Expected IllegalArgumentException for Collection");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Need exactly 1 parameter type for Collection types"));
        }

        // Test deprecated methods for coverage
        assertNotNull(typeFactory.constructParametricType(List.class, String.class));
        assertNotNull(typeFactory.constructParametricType(List.class, typeFactory.constructType(String.class)));
    }

    @Test
    public void testConstructRawMethods() {
        assertNotNull(typeFactory.constructRawCollectionType(List.class));
        assertNotNull(typeFactory.constructRawCollectionLikeType(Collection.class));
        assertNotNull(typeFactory.constructRawMapType(Map.class));
        assertNotNull(typeFactory.constructRawMapLikeType(Map.class));
    }

    @Test
    public void testUncheckedSimpleType() {
        assertNotNull(typeFactory.uncheckedSimpleType(String.class));
    }

    @Test
    public void testFromClassPrimitivesAndSpecials() {
        assertNotNull(typeFactory.constructType(boolean.class));
        assertNotNull(typeFactory.constructType(int.class));
        assertNotNull(typeFactory.constructType(long.class));
        assertNotNull(typeFactory.constructType(Thread.State.class)); // Enum
        assertNotNull(typeFactory.constructType(String[].class)); // Array
    }

    @Test
    public void testMapEntryAndParameterizedClass() throws Exception {
        // Trigger Map.Entry branch in _fromClass
        Type entryType = DummyClass.class.getField("mapEntryField").getGenericType();
        assertNotNull(typeFactory.constructType(entryType));

        // Trigger _fromParameterizedClass edge cases via reflection or parser
        Method method = TypeFactory.class.getDeclaredMethod("_fromParameterizedClass", Class.class, List.class);
        method.setAccessible(true);
        
        JavaType resMap = (JavaType) method.invoke(typeFactory, HashMap.class, Collections.emptyList());
        assertNotNull(resMap);

        JavaType resCol = (JavaType) method.invoke(typeFactory, ArrayList.class, Collections.emptyList());
        assertNotNull(resCol);

        JavaType resColWithParam = (JavaType) method.invoke(typeFactory, ArrayList.class, Collections.singletonList(typeFactory.constructType(String.class)));
        assertNotNull(resColWithParam);

        JavaType resSimple = (JavaType) method.invoke(typeFactory, DummyClass.class, Collections.emptyList());
        assertNotNull(resSimple);
    }

    @Test
    public void testParameterizedTypeEdgeCasesInParamType() throws Exception {
        // Trigger parameter count mismatch in Map/Collection inside _fromParamType via TypeReference
        Type mapSubtype = new TypeReference<IncompleteMap>() {}.getType();
        try {
            typeFactory.constructType(mapSubtype);
        } catch (Exception e) {
            // Expected to trigger validation checks
        }
    }

    @Test
    public void testTypeVariablesAndWildcards() throws Exception {
        Type varType = DummyGenericClass.class.getTypeParameters()[0];
        assertNotNull(typeFactory.constructType(varType)); // context == null branch

        TypeBindings bindings = new TypeBindings(typeFactory, String.class);
        Method constructVarMethod = TypeFactory.class.getDeclaredMethod("_fromVariable", java.lang.reflect.TypeVariable.class, TypeBindings.class);
        constructVarMethod.setAccessible(true);
        assertNotNull(constructVarMethod.invoke(typeFactory, varType, bindings));

        Type wildcardType = DummyGenericClass.class.getField("wildcardField").getGenericType();
        assertNotNull(typeFactory.constructType(wildcardType));
    }

    @Test
    public void testSuperChainOptimizationCache() {
        // Trigger specific HashMap and ArrayList super interface cache branches
        assertNotNull(typeFactory.findTypeParameters(HashMap.class, Map.class));
        assertNotNull(typeFactory.findTypeParameters(ArrayList.class, List.class));
        
        // Call again to test cache hit
        assertNotNull(typeFactory.findTypeParameters(HashMap.class, Map.class));
        assertNotNull(typeFactory.findTypeParameters(ArrayList.class, List.class));
    }

    // Helper classes for reflection and complex type testing
    public static class DummyClass {
        public Map.Entry<String, String> mapEntryField;
    }

    public static class IncompleteMap extends HashMap<String, String> {
        private static final long serialVersionUID = 1L;
    }

    public static class DummyGenericClass<T> {
        public List<? extends Number> wildcardField;
    }
}