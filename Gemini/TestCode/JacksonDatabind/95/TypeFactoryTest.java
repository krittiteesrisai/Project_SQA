package com.fasterxml.jackson.databind.type;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class TypeFactoryTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    @Test
    public void testConstructSpecializedType_SameClass() {
        JavaType baseType = typeFactory.constructType(List.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, List.class);
        assertEquals(baseType, result);
    }

    @Test
    public void testConstructSpecializedType_FromObject() {
        JavaType baseType = typeFactory.constructType(Object.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, ArrayList.class);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_NotSubtype() {
        JavaType baseType = typeFactory.constructType(String.class);
        typeFactory.constructSpecializedType(baseType, ArrayList.class);
    }

    @Test
    public void testConstructSpecializedType_EmptyBindings() {
        JavaType baseType = typeFactory.constructType(List.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_MapShortcuts() {
        JavaType baseType = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        
        JavaType hashMap = typeFactory.constructSpecializedType(baseType, HashMap.class);
        assertEquals(HashMap.class, hashMap.getRawClass());

        JavaType linkedHashMap = typeFactory.constructSpecializedType(baseType, LinkedHashMap.class);
        assertEquals(LinkedHashMap.class, linkedHashMap.getRawClass());

        JavaType treeMap = typeFactory.constructSpecializedType(baseType, TreeMap.class);
        assertEquals(TreeMap.class, treeMap.getRawClass());

        JavaType enumMap = typeFactory.constructSpecializedType(
            typeFactory.constructMapType(Map.class, EnumKey.class, String.class), 
            EnumMap.class
        );
        assertEquals(EnumMap.class, enumMap.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_CollectionShortcuts() {
        JavaType baseType = typeFactory.constructCollectionType(Collection.class, String.class);
        
        JavaType arrayList = typeFactory.constructSpecializedType(baseType, ArrayList.class);
        assertEquals(ArrayList.class, arrayList.getRawClass());

        JavaType linkedList = typeFactory.constructSpecializedType(baseType, LinkedList.class);
        assertEquals(LinkedList.class, linkedList.getRawClass());

        JavaType hashSet = typeFactory.constructSpecializedType(baseType, HashSet.class);
        assertEquals(HashSet.class, hashSet.getRawClass());

        JavaType treeSet = typeFactory.constructSpecializedType(baseType, TreeSet.class);
        assertEquals(TreeSet.class, treeSet.getRawClass());

        JavaType enumSetBase = typeFactory.constructType(EnumSet.class);
        JavaType enumSetRes = typeFactory.constructSpecializedType(enumSetBase, EnumSet.class);
        assertEquals(EnumSet.class, enumSetRes.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_ZeroTypeParams() {
        JavaType baseType = typeFactory.constructType(SimpleNonGenericParent.class);
        JavaType res = typeFactory.constructSpecializedType(baseType, SimpleNonGenericChild.class);
        assertEquals(SimpleNonGenericChild.class, res.getRawClass());
    }

    @Test
    public void testConstructGeneralizedType_SameClass() {
        JavaType baseType = typeFactory.constructType(ArrayList.class);
        JavaType result = typeFactory.constructGeneralizedType(baseType, ArrayList.class);
        assertEquals(baseType, result);
    }

    @Test
    public void testConstructGeneralizedType_ValidSuper() {
        JavaType baseType = typeFactory.constructType(ArrayList.class);
        JavaType result = typeFactory.constructGeneralizedType(baseType, List.class);
        assertEquals(List.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_NotSuperType() {
        JavaType baseType = typeFactory.constructType(ArrayList.class);
        typeFactory.constructGeneralizedType(baseType, String.class);
    }

    @Test
    public void testFindClass_Primitives() throws Exception {
        assertEquals(int.class, typeFactory.findClass("int"));
        assertEquals(long.class, typeFactory.findClass("long"));
        assertEquals(float.class, typeFactory.findClass("float"));
        assertEquals(double.class, typeFactory.findClass("double"));
        assertEquals(boolean.class, typeFactory.findClass("boolean"));
        assertEquals(byte.class, typeFactory.findClass("byte"));
        assertEquals(char.class, typeFactory.findClass("char"));
        assertEquals(short.class, typeFactory.findClass("short"));
        assertEquals(void.class, typeFactory.findClass("void"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_NotFound() throws Exception {
        typeFactory.findClass("com.nonexistent.ClassXYZ");
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType type = typeFactory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testFindTypeParameters() {
        JavaType type = typeFactory.constructMapType(HashMap.class, String.class, Integer.class);
        JavaType[] params = typeFactory.findTypeParameters(type, Map.class);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());

        JavaType[] emptyParams = typeFactory.findTypeParameters(type, Runnable.class);
        assertEquals(0, emptyParams.length);
    }

    @Test
    public void testMoreSpecificType() {
        JavaType strType = typeFactory.constructType(String.class);
        JavaType objType = typeFactory.constructType(Object.class);

        assertEquals(strType, typeFactory.moreSpecificType(null, strType));
        assertEquals(strType, typeFactory.moreSpecificType(strType, null));
        assertEquals(strType, typeFactory.moreSpecificType(strType, strType));
        assertEquals(strType, typeFactory.moreSpecificType(objType, strType));
        assertEquals(strType, typeFactory.moreSpecificType(strType, objType));
    }

    @Test
    public void testConstructTypeVariants() {
        assertNotNull(typeFactory.constructType((Type) String.class));
        assertNotNull(typeFactory.constructType(String.class, TypeBindings.emptyBindings()));
        assertNotNull(typeFactory.constructType(new TypeReference<List<String>>() {}));
        assertNotNull(typeFactory.constructType(String.class, String.class));
        assertNotNull(typeFactory.constructType(String.class, (JavaType) null));
        
        JavaType contextType = typeFactory.constructType(GenericContainer.class);
        assertNotNull(typeFactory.constructType(List.class, contextType));
    }

    @Test
    public void testDirectFactoryMethods() {
        assertNotNull(typeFactory.constructArrayType(String.class));
        assertNotNull(typeFactory.constructArrayType(typeFactory.constructType(String.class)));
        assertNotNull(typeFactory.constructCollectionType(ArrayList.class, String.class));
        assertNotNull(typeFactory.constructCollectionLikeType(Collection.class, String.class));
        assertNotNull(typeFactory.constructCollectionLikeType(ArrayList.class, typeFactory.constructType(String.class)));
        assertNotNull(typeFactory.constructMapType(HashMap.class, String.class, Integer.class));
        assertNotNull(typeFactory.constructMapType(Properties.class, String.class, String.class));
        assertNotNull(typeFactory.constructMapLikeType(Map.class, String.class, Integer.class));
        assertNotNull(typeFactory.constructSimpleType(List.class, new JavaType[] { typeFactory.constructType(String.class) }));
        assertNotNull(typeFactory.constructReferenceType(AtomicReference.class, typeFactory.constructType(String.class)));
        assertNotNull(typeFactory.uncheckedSimpleType(String.class));
        assertNotNull(typeFactory.constructParametricType(List.class, String.class));
        assertNotNull(typeFactory.constructParametrizedType(List.class, List.class, String.class));
        assertNotNull(typeFactory.constructParametrizedType(List.class, List.class, String.class));
        
        assertNotNull(typeFactory.constructRawCollectionType(ArrayList.class));
        assertNotNull(typeFactory.constructRawCollectionLikeType(ArrayList.class));
        assertNotNull(typeFactory.constructRawMapType(HashMap.class));
        assertNotNull(typeFactory.constructRawMapLikeType(HashMap.class));
    }

    @Test
    public void testMutantFactoriesAndCache() {
        TypeFactory tfNullMod = typeFactory.withModifier(null);
        assertNotNull(tfNullMod);

        TypeFactory tfWithMod = typeFactory.withModifier(new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType annotated, Type jdkType, TypeBindings bindings, TypeFactory typeFactory) {
                return annotated;
            }
        });
        assertNotNull(tfWithMod);

        assertNotNull(typeFactory.withClassLoader(Thread.currentThread().getContextClassLoader()));
        assertNotNull(typeFactory.withCache(new LRUMap<Object, JavaType>(10, 10)));
        assertNotNull(TypeFactory.defaultInstance());
        
        typeFactory.clearCache();
        assertNotNull(typeFactory.getClassLoader());
        assertNotNull(TypeFactory.unknownType());
        assertNotNull(TypeFactory.rawClass(String.class));
        assertNotNull(TypeFactory.rawClass(new TypeReference<List<String>>() {}.getType()));
    }

    @Test
    public void testFromAnyReflections() throws Exception {
        Field genericListField = GenericFieldsHolder.class.getDeclaredField("stringList");
        Type genericType = genericListField.getGenericType();
        assertNotNull(typeFactory.constructType(genericType));

        Field genericArrayField = GenericFieldsHolder.class.getDeclaredField("stringArray");
        assertNotNull(typeFactory.constructType(genericArrayField.getGenericType()));

        Field wildcardField = GenericFieldsHolder.class.getDeclaredField("wildcardList");
        assertNotNull(typeFactory.constructType(wildcardField.getGenericType()));

        Field variableField = GenericClass.class.getDeclaredField("tField");
        assertNotNull(typeFactory.constructType(variableField.getGenericType()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromAnyUnrecognized() {
        typeFactory.constructType(new DummyUnsupportedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testTypeModifierReturningNull() {
        TypeFactory tf = typeFactory.withModifier(new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType annotated, Type jdkType, TypeBindings bindings, TypeFactory typeFactory) {
                return null;
            }
        });
        tf.constructType(String.class);
    }

    // Supporting helper classes for testing edge cases
    private enum EnumKey { A, B }
    private static class SimpleNonGenericParent {}
    private static class SimpleNonGenericChild extends SimpleNonGenericParent {}
    private static class GenericContainer<T> {
        public T value;
    }
    private static class GenericFieldsHolder<T> {
        public List<String> stringList;
        public T[] stringArray;
        public List<?> wildcardList;
    }
    private static class GenericClass<T> {
        public T tField;
    }
    private static class DummyUnsupportedType implements Type {
        @Override
        public String getTypeName() {
            return "Dummy";
        }
    }
}