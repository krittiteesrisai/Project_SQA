package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.*;

import static org.junit.Assert.*;

public class TypeFactoryTest {

    @Test
    public void testFindClassPrimitives() throws ClassNotFoundException {
        TypeFactory tf = TypeFactory.defaultInstance();
        assertEquals(Integer.TYPE, tf.findClass("int"));
        assertEquals(Long.TYPE, tf.findClass("long"));
        assertEquals(Float.TYPE, tf.findClass("float"));
        assertEquals(Double.TYPE, tf.findClass("double"));
        assertEquals(Boolean.TYPE, tf.findClass("boolean"));
        assertEquals(Byte.TYPE, tf.findClass("byte"));
        assertEquals(Character.TYPE, tf.findClass("char"));
        assertEquals(Short.TYPE, tf.findClass("short"));
        assertEquals(Void.TYPE, tf.findClass("void"));
        assertNull(tf._findPrimitive("unknown"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassMalformedNotFound() throws ClassNotFoundException {
        TypeFactory.defaultInstance().findClass("com.nonexistent.InvalidClassName12345");
    }

    @Test
    public void testFindClassWithCustomClassLoader() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance().withClassLoader(Thread.currentThread().getContextClassLoader());
        Class<?> cls = tf.findClass("java.lang.String");
        assertEquals(String.class, cls);
    }

    @Test
    public void testConstructSpecializedTypeIdenticalAndObject() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        assertSame(stringType, tf.constructSpecializedType(stringType, String.class));

        JavaType objectType = tf.constructType(Object.class);
        JavaType specialized = tf.constructSpecializedType(objectType, String.class);
        assertNotNull(specialized);
        assertEquals(String.class, specialized.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeIncompatible() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        tf.constructSpecializedType(stringType, Integer.class);
    }

    @Test
    public void testConstructSpecializedTypeContainers() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType mapType = tf.constructMapType(Map.class, String.class, String.class);

        assertEquals(HashMap.class, tf.constructSpecializedType(mapType, HashMap.class).getRawClass());
        assertEquals(LinkedHashMap.class, tf.constructSpecializedType(mapType, LinkedHashMap.class).getRawClass());
        assertEquals(TreeMap.class, tf.constructSpecializedType(mapType, TreeMap.class).getRawClass());
        assertEquals(EnumMap.class, tf.constructSpecializedType(tf.constructMapType(Map.class, Enum.class, String.class), EnumMap.class).getRawClass());

        JavaType collType = tf.constructCollectionType(Collection.class, String.class);
        assertEquals(ArrayList.class, tf.constructSpecializedType(collType, ArrayList.class).getRawClass());
        assertEquals(LinkedList.class, tf.constructSpecializedType(collType, LinkedList.class).getRawClass());
        assertEquals(HashSet.class, tf.constructSpecializedType(collType, HashSet.class).getRawClass());
        assertEquals(TreeSet.class, tf.constructSpecializedType(collType, TreeSet.class).getRawClass());

        JavaType enumSetType = tf.constructCollectionType(EnumSet.class, Enum.class);
        assertSame(enumSetType, tf.constructSpecializedType(enumSetType, EnumSet.class));
    }

    @Test
    public void testMoreSpecificType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType strType = tf.constructType(String.class);
        JavaType objType = tf.constructType(Object.class);

        assertSame(strType, tf.moreSpecificType(null, strType));
        assertSame(strType, tf.moreSpecificType(strType, null));
        assertSame(strType, tf.moreSpecificType(strType, strType));
        assertSame(strType, tf.moreSpecificType(objType, strType)); // String is more specific than Object
    }

    @Test
    public void testConstructFromCanonical() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testFindTypeParameters() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType listType = tf.constructCollectionType(List.class, String.class);
        JavaType[] params = tf.findTypeParameters(listType, Collection.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());

        JavaType nonMatch = tf.constructType(String.class);
        JavaType[] emptyParams = tf.findTypeParameters(nonMatch, Collection.class);
        assertEquals(0, emptyParams.length);
    }

    @Test
    public void testTypeModifiersAndCacheMutants() {
        TypeFactory tf = TypeFactory.defaultInstance();
        TypeFactory tfWithNullMod = tf.withModifier(null);
        assertNotNull(tfWithNullMod);

        TypeFactory tfWithCache = tf.withCache(new LRUMap<Object, JavaType>(8, 100));
        assertNotNull(tfWithCache);
        tfWithCache.clearCache();
    }

    @Test
    public void testRawConstructors() {
        TypeFactory tf = TypeFactory.defaultInstance();
        assertNotNull(tf.constructRawCollectionType(List.class));
        assertNotNull(tf.constructRawCollectionLikeType(Collection.class));
        assertNotNull(tf.constructRawMapType(Map.class));
        assertNotNull(tf.constructRawMapLikeType(Map.class));
        assertNotNull(tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class)));
        assertNotNull(tf.uncheckedSimpleType(String.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapTypeInvalidBindings() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        Method m = TypeFactory.class.getDeclaredMethod("_mapType", Class.class, TypeBindings.class, JavaType.class, JavaType[].class);
        m.setAccessible(true);
        TypeBindings bindings = TypeBindings.create(HashMap.class, new JavaType[] { tf.constructType(String.class) });
        m.invoke(tf, Map.class, bindings, null, new JavaType[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCollectionTypeInvalidBindings() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        Method m = TypeFactory.class.getDeclaredMethod("_collectionType", Class.class, TypeBindings.class, JavaType.class, JavaType[].class);
        m.setAccessible(true);
        TypeBindings bindings = TypeBindings.create(List.class, new JavaType[] { tf.constructType(String.class), tf.constructType(String.class) });
        m.invoke(tf, List.class, bindings, null, new JavaType[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferenceTypeInvalidBindings() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        Method m = TypeFactory.class.getDeclaredMethod("_referenceType", Class.class, TypeBindings.class, JavaType.class, JavaType[].class);
        m.setAccessible(true);
        TypeBindings bindings = TypeBindings.create(AtomicReference.class, new JavaType[] { tf.constructType(String.class), tf.constructType(String.class) });
        m.invoke(tf, AtomicReference.class, bindings, null, new JavaType[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromAnyUnrecognizedType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        Method m = TypeFactory.class.getDeclaredMethod("_fromAny", ClassStack.class, java.lang.reflect.Type.class, TypeBindings.class);
        m.setAccessible(true);
        m.invoke(tf, null, new java.lang.reflect.Type() {}, TypeBindings.emptyBindings());
    }

    @Test(expected = IllegalStateException.class)
    public void testTypeModifierReturningNull() {
        TypeFactory tf = TypeFactory.defaultInstance().withModifier(new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, java.lang.reflect.Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return null;
            }
            @Override
            public String toString() { return "NullModifier"; }
        });
        tf.constructType(String.class);
    }
}