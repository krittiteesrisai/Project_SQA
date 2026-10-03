package org.apache.commons.lang3;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * High coverage and edge-case unit tests for {@link ClassUtils}.
 */
public class ClassUtilsTest {

    // -------------------------------------------------------------------------
    // Constructor & Constants
    // -------------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new ClassUtils());
        Constructor<?>[] cons = ClassUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
    }

    // -------------------------------------------------------------------------
    // Defects4J Lang-33 Target: toClass(Object[])
    // -------------------------------------------------------------------------
    @Test
    public void testToClass_Lang33_NullElementHandling() {
        // null input array
        assertNull(ClassUtils.toClass(null));

        // empty input array
        assertArrayEquals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.toClass(new Object[0]));

        // Valid array without nulls
        Object[] normalArray = new Object[] { "Test", Integer.valueOf(1) };
        Class<?>[] normalExpected = new Class<?>[] { String.class, Integer.class };
        assertArrayEquals(normalExpected, ClassUtils.toClass(normalArray));

        // Edge case / Fault detection (Lang-33): Array containing null elements
        Object[] arrayWithNull = new Object[] { "Hello", null, Integer.valueOf(42) };
        Class<?>[] expectedWithNull = new Class<?>[] { String.class, null, Integer.class };
        
        Class<?>[] result = ClassUtils.toClass(arrayWithNull);
        assertArrayEquals(expectedWithNull, result);
    }

    // -------------------------------------------------------------------------
    // getShortClassName & getPackageName
    // -------------------------------------------------------------------------
    @Test
    public void testGetShortClassName_Object() {
        assertNull(ClassUtils.getShortClassName((Object) null, null));
        assertEquals("default", ClassUtils.getShortClassName(null, "default"));
        assertEquals("String", ClassUtils.getShortClassName("hello", "default"));
    }

    @Test
    public void testGetShortClassName_Class() {
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
        assertEquals("String", ClassUtils.getShortClassName(String.class));
        assertEquals("Map.Entry", ClassUtils.getShortClassName(Map.Entry.class));
        assertEquals("int[]", ClassUtils.getShortClassName(int[].class));
        assertEquals("String[][]", ClassUtils.getShortClassName(String[][].class));
    }

    @Test
    public void testGetShortClassName_String() {
        assertEquals("", ClassUtils.getShortClassName((String) null));
        assertEquals("", ClassUtils.getShortClassName(""));
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
        assertEquals("Map.Entry", ClassUtils.getShortClassName("java.util.Map$Entry"));
        assertEquals("Entry", ClassUtils.getShortClassName("Entry"));
        assertEquals("int[]", ClassUtils.getShortClassName("[I"));
        assertEquals("double[][][]", ClassUtils.getShortClassName("[[[D"));
        assertEquals("String[]", ClassUtils.getShortClassName("[Ljava.lang.String;"));
        assertEquals("String[][]", ClassUtils.getShortClassName("[[Ljava.lang.String;"));
    }

    @Test
    public void testGetPackageName_Object() {
        assertNull(ClassUtils.getPackageName((Object) null, null));
        assertEquals("default", ClassUtils.getPackageName(null, "default"));
        assertEquals("java.lang", ClassUtils.getPackageName("hello", "default"));
    }

    @Test
    public void testGetPackageName_Class() {
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        assertEquals("java.util", ClassUtils.getPackageName(Map.Entry.class));
        assertEquals("java.lang", ClassUtils.getPackageName(String[].class));
        assertEquals("", ClassUtils.getPackageName(int[].class));
    }

    @Test
    public void testGetPackageName_String() {
        assertEquals("", ClassUtils.getPackageName((String) null));
        assertEquals("", ClassUtils.getPackageName(""));
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String"));
        assertEquals("", ClassUtils.getPackageName("UnpackagedClass"));
        assertEquals("java.lang", ClassUtils.getPackageName("[Ljava.lang.String;"));
        assertEquals("java.lang", ClassUtils.getPackageName("[[Ljava.lang.String;"));
        assertEquals("", ClassUtils.getPackageName("[I"));
    }

    // -------------------------------------------------------------------------
    // getAllSuperclasses & getAllInterfaces
    // -------------------------------------------------------------------------
    private static interface InterfaceA {}
    private static interface InterfaceB extends InterfaceA {}
    private static interface InterfaceC {}
    private static class ClassA implements InterfaceB {}
    private static class ClassB extends ClassA implements InterfaceC {}

    @Test
    public void testGetAllSuperclasses() {
        assertNull(ClassUtils.getAllSuperclasses(null));
        assertEquals(0, ClassUtils.getAllSuperclasses(Object.class).size());

        List<Class<?>> superclasses = ClassUtils.getAllSuperclasses(ClassB.class);
        assertEquals(2, superclasses.size());
        assertEquals(ClassA.class, superclasses.get(0));
        assertEquals(Object.class, superclasses.get(1));
    }

    @Test
    public void testGetAllInterfaces() {
        assertNull(ClassUtils.getAllInterfaces(null));
        
        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(ClassB.class);
        assertEquals(3, interfaces.size());
        assertTrue(interfaces.contains(InterfaceC.class));
        assertTrue(interfaces.contains(InterfaceB.class));
        assertTrue(interfaces.contains(InterfaceA.class));
    }

    // -------------------------------------------------------------------------
    // convertClassNamesToClasses & convertClassesToClassNames
    // -------------------------------------------------------------------------
    @Test
    public void testConvertClassNamesToClasses() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
        assertEquals(Collections.emptyList(), ClassUtils.convertClassNamesToClasses(new ArrayList<String>()));

        List<String> list = Arrays.asList("java.lang.String", "non.existent.ClassName", null);
        List<Class<?>> classes = ClassUtils.convertClassNamesToClasses(list);
        assertEquals(3, classes.size());
        assertEquals(String.class, classes.get(0));
        assertNull(classes.get(1));
        assertNull(classes.get(2));
    }

    @Test
    public void testConvertClassesToClassNames() {
        assertNull(ClassUtils.convertClassesToClassNames(null));
        assertEquals(Collections.emptyList(), ClassUtils.convertClassesToClassNames(new ArrayList<Class<?>>()));

        List<Class<?>> list = Arrays.asList(String.class, null, Integer.class);
        List<String> names = ClassUtils.convertClassesToClassNames(list);
        assertEquals(3, names.size());
        assertEquals("java.lang.String", names.get(0));
        assertNull(names.get(1));
        assertEquals("java.lang.Integer", names.get(2));
    }

    // -------------------------------------------------------------------------
    // isAssignable (Primitives, Widening, Autoboxing, Nulls)
    // -------------------------------------------------------------------------
    @Test
    public void testIsAssignable_ClassArray() {
        assertFalse(ClassUtils.isAssignable(new Class<?>[] { String.class }, new Class<?>[] { String.class, Integer.class }));
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null));
        assertTrue(ClassUtils.isAssignable(new Class<?>[0], (Class<?>[0])));
        assertTrue(ClassUtils.isAssignable(new Class<?>[] { Integer.class }, new Class<?>[] { Object.class }));
        assertFalse(ClassUtils.isAssignable(new Class<?>[] { Object.class }, new Class<?>[] { Integer.class }));
    }

    @Test
    public void testIsAssignable_Nulls() {
        assertFalse(ClassUtils.isAssignable(String.class, null));
        assertFalse(ClassUtils.isAssignable(null, int.class));
        assertTrue(ClassUtils.isAssignable(null, String.class));
    }

    @Test
    public void testIsAssignable_PrimitiveWidening() {
        // Byte
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Short.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Integer.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Long.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Double.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Byte.TYPE, Character.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Byte.TYPE, Boolean.TYPE, false));

        // Short
        assertFalse(ClassUtils.isAssignable(Short.TYPE, Byte.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Integer.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Long.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Double.TYPE, false));

        // Character
        assertFalse(ClassUtils.isAssignable(Character.TYPE, Short.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Integer.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Long.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Double.TYPE, false));

        // Integer
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Short.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Long.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Double.TYPE, false));

        // Long
        assertFalse(ClassUtils.isAssignable(Long.TYPE, Integer.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Long.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Long.TYPE, Double.TYPE, false));

        // Float
        assertFalse(ClassUtils.isAssignable(Float.TYPE, Long.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Float.TYPE, Double.TYPE, false));

        // Double & Boolean
        assertFalse(ClassUtils.isAssignable(Double.TYPE, Float.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Boolean.TYPE, Integer.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE, false));
    }

    @Test
    public void testIsAssignable_Autoboxing() {
        // Autoboxing enabled
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class, true));
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class, true));
        assertTrue(ClassUtils.isAssignable(int.class, Number.class, true));
        assertTrue(ClassUtils.isAssignable(int.class, Object.class, true));
        assertTrue(ClassUtils.isAssignable(Integer.class, long.class, true));

        // Autoboxing disabled
        assertFalse(ClassUtils.isAssignable(int.class, Integer.class, false));
        assertFalse(ClassUtils.isAssignable(Integer.class, int.class, false));
        assertFalse(ClassUtils.isAssignable(int.class, Object.class, false));

        // Assigning to primitive from non-convertible wrapper
        assertFalse(ClassUtils.isAssignable(String.class, int.class, true));
    }

    // -------------------------------------------------------------------------
    // primitiveToWrapper & wrapperToPrimitive
    // -------------------------------------------------------------------------
    @Test
    public void testPrimitiveToWrapper() {
        assertNull(ClassUtils.primitiveToWrapper(null));
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(int.class));
        assertEquals(Boolean.class, ClassUtils.primitiveToWrapper(boolean.class));
        assertEquals(Byte.class, ClassUtils.primitiveToWrapper(byte.class));
        assertEquals(Character.class, ClassUtils.primitiveToWrapper(char.class));
        assertEquals(Short.class, ClassUtils.primitiveToWrapper(short.class));
        assertEquals(Long.class, ClassUtils.primitiveToWrapper(long.class));
        assertEquals(Float.class, ClassUtils.primitiveToWrapper(float.class));
        assertEquals(Double.class, ClassUtils.primitiveToWrapper(double.class));
        assertEquals(Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
    }

    @Test
    public void testPrimitivesToWrappers() {
        assertNull(ClassUtils.primitivesToWrappers(null));
        assertArrayEquals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.primitivesToWrappers(new Class<?>[0]));

        Class<?>[] primitives = new Class<?>[] { int.class, String.class, null };
        Class<?>[] expected = new Class<?>[] { Integer.class, String.class, null };
        assertArrayEquals(expected, ClassUtils.primitivesToWrappers(primitives));
    }

    @Test
    public void testWrapperToPrimitive() {
        assertNull(ClassUtils.wrapperToPrimitive(null));
        assertEquals(int.class, ClassUtils.wrapperToPrimitive(Integer.class));
        assertEquals(boolean.class, ClassUtils.wrapperToPrimitive(Boolean.class));
        assertEquals(byte.class, ClassUtils.wrapperToPrimitive(Byte.class));
        assertEquals(char.class, ClassUtils.wrapperToPrimitive(Character.class));
        assertEquals(short.class, ClassUtils.wrapperToPrimitive(Short.class));
        assertEquals(long.class, ClassUtils.wrapperToPrimitive(Long.class));
        assertEquals(float.class, ClassUtils.wrapperToPrimitive(Float.class));
        assertEquals(double.class, ClassUtils.wrapperToPrimitive(Double.class));
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
        assertNull(ClassUtils.wrapperToPrimitive(Void.class));
    }

    @Test
    public void testWrappersToPrimitives() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
        assertArrayEquals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.wrappersToPrimitives(new Class<?>[0]));

        Class<?>[] wrappers = new Class<?>[] { Integer.class, String.class, null };
        Class<?>[] expected = new Class<?>[] { int.class, null, null };
        assertArrayEquals(expected, ClassUtils.wrappersToPrimitives(wrappers));
    }

    // -------------------------------------------------------------------------
    // isInnerClass
    // -------------------------------------------------------------------------
    @Test
    public void testIsInnerClass() {
        assertFalse(ClassUtils.isInnerClass(null));
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertTrue(ClassUtils.isInnerClass(Map.Entry.class));
        assertTrue(ClassUtils.isInnerClass(ClassA.class));
    }

    // -------------------------------------------------------------------------
    // getClass
    // -------------------------------------------------------------------------
    @Test
    public void testGetClass() throws Exception {
        assertEquals(int[].class, ClassUtils.getClass("int[]"));
        assertEquals(int[][].class, ClassUtils.getClass("int[][]"));
        assertEquals(String[].class, ClassUtils.getClass("java.lang.String[]"));
        assertEquals(String[].class, ClassUtils.getClass("[Ljava.lang.String;"));
        assertEquals(int[].class, ClassUtils.getClass("[I"));
        assertEquals(String.class, ClassUtils.getClass("java.lang.String"));
        assertEquals(String.class, ClassUtils.getClass(ClassLoader.getSystemClassLoader(), "java.lang.String"));
        assertEquals(String.class, ClassUtils.getClass(ClassLoader.getSystemClassLoader(), "java.lang.String", false));
        assertEquals(String.class, ClassUtils.getClass("java.lang.String", false));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClassNotFound() throws Exception {
        ClassUtils.getClass("unknown.package.NonExistent");
    }

    @Test(expected = NullPointerException.class)
    public void testGetClassNullName() throws Exception {
        ClassUtils.getClass((String) null);
    }

    // -------------------------------------------------------------------------
    // getPublicMethod
    // -------------------------------------------------------------------------
    @Test
    public void testGetPublicMethod() throws Exception {
        // Standard public class and method
        Method method = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertNotNull(method);
        assertEquals("length", method.getName());

        // Interface method lookup on non-public implementation
        Set<String> set = Collections.unmodifiableSet(new HashSet<String>());
        Method setMethod = ClassUtils.getPublicMethod(set.getClass(), "isEmpty", new Class<?>[0]);
        assertNotNull(setMethod);
        assertTrue(Modifier.isPublic(setMethod.getDeclaringClass().getModifiers()));
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_NotFound() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonExistentMethod", new Class<?>[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPublicMethod_NullClass() throws Exception {
        ClassUtils.getPublicMethod(null, "toString", new Class<?>[0]);
    }

    // -------------------------------------------------------------------------
    // getShortCanonicalName & getPackageCanonicalName
    // -------------------------------------------------------------------------
    @Test
    public void testGetShortCanonicalName() {
        assertNull(ClassUtils.getShortCanonicalName((Object) null, null));
        assertEquals("default", ClassUtils.getShortCanonicalName(null, "default"));
        assertEquals("String", ClassUtils.getShortCanonicalName("hello", "default"));

        assertEquals("", ClassUtils.getShortCanonicalName((Class<?>) null));
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class));
        assertEquals("int[]", ClassUtils.getShortCanonicalName(int[].class));
        assertEquals("String[][]", ClassUtils.getShortCanonicalName(String[][].class));

        assertEquals("", ClassUtils.getShortCanonicalName((String) null));
        assertEquals("String[]", ClassUtils.getShortCanonicalName("[Ljava.lang.String;"));
        assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
        assertEquals("int[][][]", ClassUtils.getShortCanonicalName("[[[I"));
        assertEquals("Map.Entry", ClassUtils.getShortCanonicalName("java.util.Map$Entry"));
    }

    @Test
    public void testGetPackageCanonicalName() {
        assertNull(ClassUtils.getPackageCanonicalName((Object) null, null));
        assertEquals("default", ClassUtils.getPackageCanonicalName(null, "default"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("hello", "default"));

        assertEquals("", ClassUtils.getPackageCanonicalName((Class<?>) null));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class));
        assertEquals("", ClassUtils.getPackageCanonicalName(int[].class));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String[][].class));

        assertEquals("", ClassUtils.getPackageCanonicalName((String) null));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[Ljava.lang.String;"));
        assertEquals("", ClassUtils.getPackageCanonicalName("[I"));
        assertEquals("", ClassUtils.getPackageCanonicalName("UnpackagedClass"));
    }
}