package org.apache.commons.lang;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ClassUtilsTest {

    // ----------------------------------------------------------------------
    // Constructor & Constants
    // ----------------------------------------------------------------------

    @Test
    public void testConstructor() {
        assertNotNull(new ClassUtils());
        Constructor<?>[] cons = ClassUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
    }

    @Test
    public void testConstants() {
        assertEquals('.', ClassUtils.PACKAGE_SEPARATOR_CHAR);
        assertEquals(".", ClassUtils.PACKAGE_SEPARATOR);
        assertEquals('$', ClassUtils.INNER_CLASS_SEPARATOR_CHAR);
        assertEquals("$", ClassUtils.INNER_CLASS_SEPARATOR);
    }

    // ----------------------------------------------------------------------
    // Short Class Name
    // ----------------------------------------------------------------------

    @Test
    public void testGetShortClassName_Object() {
        assertEquals("String", ClassUtils.getShortClassName("hello", "default"));
        assertEquals("default", ClassUtils.getShortClassName((Object) null, "default"));
        assertNull(ClassUtils.getShortClassName((Object) null, null));
    }

    @Test
    public void testGetShortClassName_Class() {
        assertEquals("ClassUtils", ClassUtils.getShortClassName(ClassUtils.class));
        assertEquals("Map.Entry", ClassUtils.getShortClassName(Map.Entry.class));
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
    }

    @Test
    public void testGetShortClassName_String() {
        assertEquals("", ClassUtils.getShortClassName((String) null));
        assertEquals("", ClassUtils.getShortClassName(""));
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
        assertEquals("ClassUtilsTest", ClassUtils.getShortClassName("ClassUtilsTest"));
        assertEquals("Map.Entry", ClassUtils.getShortClassName("java.util.Map$Entry"));
        assertEquals("Outer.Inner.SubInner", ClassUtils.getShortClassName("org.test.Outer$Inner$SubInner"));
        assertEquals("Inner", ClassUtils.getShortClassName("$Inner"));
    }

    // ----------------------------------------------------------------------
    // Package Name
    // ----------------------------------------------------------------------

    @Test
    public void testGetPackageName_Object() {
        assertEquals("java.lang", ClassUtils.getPackageName("hello", "default"));
        assertEquals("default", ClassUtils.getPackageName((Object) null, "default"));
        assertNull(ClassUtils.getPackageName((Object) null, null));
    }

    @Test
    public void testGetPackageName_Class() {
        assertEquals("org.apache.commons.lang", ClassUtils.getPackageName(ClassUtils.class));
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
    }

    @Test
    public void testGetPackageName_String() {
        assertEquals("", ClassUtils.getPackageName((String) null));
        assertEquals("", ClassUtils.getPackageName(""));
        assertEquals("", ClassUtils.getPackageName("UnpackagedClass"));
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String"));
        assertEquals("java.util", ClassUtils.getPackageName("java.util.Map$Entry"));
    }

    // ----------------------------------------------------------------------
    // Superclasses & Interfaces
    // ----------------------------------------------------------------------

    private interface BaseInterface {}
    private interface ExtendedInterface extends BaseInterface {}
    private static class BaseClass implements BaseInterface {}
    private static class SubClass extends BaseClass implements ExtendedInterface {}

    @Test
    public void testGetAllSuperclasses() {
        assertNull(ClassUtils.getAllSuperclasses(null));
        
        List<Class<?>> empty = ClassUtils.getAllSuperclasses(Object.class);
        assertEquals(0, empty.size());

        List<Class<?>> superClasses = ClassUtils.getAllSuperclasses(SubClass.class);
        assertEquals(2, superClasses.size());
        assertEquals(BaseClass.class, superClasses.get(0));
        assertEquals(Object.class, superClasses.get(1));
    }

    @Test
    public void testGetAllInterfaces() {
        assertNull(ClassUtils.getAllInterfaces(null));

        List<Class<?>> interfaces = ClassUtils.getAllInterfaces(SubClass.class);
        assertEquals(2, interfaces.size());
        assertTrue(interfaces.contains(ExtendedInterface.class));
        assertTrue(interfaces.contains(BaseInterface.class));

        List<Class<?>> fromInterface = ClassUtils.getAllInterfaces(ExtendedInterface.class);
        assertEquals(1, fromInterface.size());
        assertEquals(BaseInterface.class, fromInterface.get(0));

        List<Class<?>> objectInterfaces = ClassUtils.getAllInterfaces(Object.class);
        assertEquals(0, objectInterfaces.size());
    }

    // ----------------------------------------------------------------------
    // Convert Lists
    // ----------------------------------------------------------------------

    @Test
    public void testConvertClassNamesToClasses() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
        assertEquals(Collections.emptyList(), ClassUtils.convertClassNamesToClasses(new ArrayList<String>()));

        List<String> list = Arrays.asList("java.lang.String", "invalid.Class.Name", null);
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

        List<Class<?>> list = new ArrayList<Class<?>>();
        list.add(String.class);
        list.add(null);
        List<String> names = ClassUtils.convertClassesToClassNames(list);
        assertEquals(2, names.size());
        assertEquals("java.lang.String", names.get(0));
        assertNull(names.get(1));
    }

    // ----------------------------------------------------------------------
    // isAssignable
    // ----------------------------------------------------------------------

    @Test
    public void testIsAssignable_ClassArrays() {
        assertFalse(ClassUtils.isAssignable(new Class<?>[]{String.class}, new Class<?>[]{String.class, Integer.class}));
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null));
        assertTrue(ClassUtils.isAssignable(new Class<?>[]{}, (Class<?>[]) null));
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, new Class<?>[]{}));

        Class<?>[] array1 = new Class<?>[]{Integer.class, String.class};
        Class<?>[] array2 = new Class<?>[]{Number.class, Object.class};
        assertTrue(ClassUtils.isAssignable(array1, array2));

        Class<?>[] incompatible = new Class<?>[]{String.class, Integer.class};
        assertFalse(ClassUtils.isAssignable(array1, incompatible));
    }

    @Test
    public void testIsAssignable_DirectAndNull() {
        assertFalse(ClassUtils.isAssignable(String.class, null));
        assertFalse(ClassUtils.isAssignable(String.class, null, true));
        assertTrue(ClassUtils.isAssignable(null, String.class));
        assertFalse(ClassUtils.isAssignable(null, int.class));
        assertTrue(ClassUtils.isAssignable(String.class, String.class));
        assertTrue(ClassUtils.isAssignable(Integer.class, Number.class));
        assertFalse(ClassUtils.isAssignable(Number.class, Integer.class));
    }

    @Test
    public void testIsAssignable_PrimitiveWideningWithoutAutoboxing() {
        // Integer
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Long.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Integer.TYPE, Double.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Short.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Byte.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Integer.TYPE, Object.class, false));

        // Long
        assertTrue(ClassUtils.isAssignable(Long.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Long.TYPE, Double.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Long.TYPE, Integer.TYPE, false));

        // Boolean & Double
        assertFalse(ClassUtils.isAssignable(Boolean.TYPE, Integer.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Double.TYPE, Float.TYPE, false));

        // Float
        assertTrue(ClassUtils.isAssignable(Float.TYPE, Double.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Float.TYPE, Long.TYPE, false));

        // Character
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Integer.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Long.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Character.TYPE, Double.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Character.TYPE, Short.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Character.TYPE, Byte.TYPE, false));

        // Short
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Integer.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Long.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Short.TYPE, Double.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Short.TYPE, Byte.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Short.TYPE, Character.TYPE, false));

        // Byte
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Short.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Integer.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Long.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Float.TYPE, false));
        assertTrue(ClassUtils.isAssignable(Byte.TYPE, Double.TYPE, false));
        assertFalse(ClassUtils.isAssignable(Byte.TYPE, Character.TYPE, false));
    }

    @Test
    public void testIsAssignable_WithAutoboxing() {
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class, true));
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class, true));
        assertTrue(ClassUtils.isAssignable(int.class, Number.class, true));
        assertTrue(ClassUtils.isAssignable(int.class, Object.class, true));
        assertTrue(ClassUtils.isAssignable(Integer.class, long.class, true));
        assertTrue(ClassUtils.isAssignable(Integer.class, double.class, true));

        assertFalse(ClassUtils.isAssignable(int.class, Long.class, true));
        assertFalse(ClassUtils.isAssignable(int.class, String.class, true));
        assertFalse(ClassUtils.isAssignable(String.class, int.class, true));
    }

    // ----------------------------------------------------------------------
    // Primitive <-> Wrapper Conversions
    // ----------------------------------------------------------------------

    @Test
    public void testPrimitiveToWrapper() {
        assertNull(ClassUtils.primitiveToWrapper(null));
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(int.class));
        assertEquals(Boolean.class, ClassUtils.primitiveToWrapper(boolean.class));
        assertEquals(Byte.class, ClassUtils.primitiveToWrapper(byte.class));
        assertEquals(Character.class, ClassUtils.primitiveToWrapper(char.class));
        assertEquals(Short.class, ClassUtils.primitiveToWrapper(short.class));
        assertEquals(Long.class, ClassUtils.primitiveToWrapper(long.class));
        assertEquals(Float.class, ClassUtils.primitiveToWrapper(float.class));
        assertEquals(Double.class, ClassUtils.primitiveToWrapper(double.class));
        assertEquals(Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));
    }

    @Test
    public void testPrimitivesToWrappers() {
        assertNull(ClassUtils.primitivesToWrappers(null));
        assertArrayEquals(new Class<?>[]{}, ClassUtils.primitivesToWrappers(new Class<?>[]{}));

        Class<?>[] primitives = new Class<?>[]{int.class, String.class, null};
        Class<?>[] wrappers = ClassUtils.primitivesToWrappers(primitives);
        assertArrayEquals(new Class<?>[]{Integer.class, String.class, null}, wrappers);
    }

    @Test
    public void testWrapperToPrimitive() {
        assertNull(ClassUtils.wrapperToPrimitive(null));
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
        assertNull(ClassUtils.wrapperToPrimitive(Void.TYPE));
        assertEquals(int.class, ClassUtils.wrapperToPrimitive(Integer.class));
        assertEquals(boolean.class, ClassUtils.wrapperToPrimitive(Boolean.class));
        assertEquals(byte.class, ClassUtils.wrapperToPrimitive(Byte.class));
        assertEquals(char.class, ClassUtils.wrapperToPrimitive(Character.class));
        assertEquals(short.class, ClassUtils.wrapperToPrimitive(Short.class));
        assertEquals(long.class, ClassUtils.wrapperToPrimitive(Long.class));
        assertEquals(float.class, ClassUtils.wrapperToPrimitive(Float.class));
        assertEquals(double.class, ClassUtils.wrapperToPrimitive(Double.class));
    }

    @Test
    public void testWrappersToPrimitives() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
        assertArrayEquals(new Class<?>[]{}, ClassUtils.wrappersToPrimitives(new Class<?>[]{}));

        Class<?>[] wrappers = new Class<?>[]{Integer.class, String.class, null};
        Class<?>[] primitives = ClassUtils.wrappersToPrimitives(wrappers);
        assertArrayEquals(new Class<?>[]{int.class, null, null}, primitives);
    }

    // ----------------------------------------------------------------------
    // Inner Class
    // ----------------------------------------------------------------------

    @Test
    public void testIsInnerClass() {
        assertFalse(ClassUtils.isInnerClass(null));
        assertFalse(ClassUtils.isInnerClass(String.class));
        assertTrue(ClassUtils.isInnerClass(Map.Entry.class));
        assertTrue(ClassUtils.isInnerClass(SubClass.class));
    }

    // ----------------------------------------------------------------------
    // Class Loading (getClass)
    // ----------------------------------------------------------------------

    @Test
    public void testGetClass() throws ClassNotFoundException {
        assertEquals(String.class, ClassUtils.getClass("java.lang.String"));
        assertEquals(String.class, ClassUtils.getClass("java.lang.String", true));
        assertEquals(String.class, ClassUtils.getClass(getClass().getClassLoader(), "java.lang.String"));
        assertEquals(String.class, ClassUtils.getClass(getClass().getClassLoader(), "java.lang.String", true));

        // Primitives & Abbreviations
        assertEquals(int.class, ClassUtils.getClass("int"));
        assertEquals(int[].class, ClassUtils.getClass("int[]"));
        assertEquals(int[][].class, ClassUtils.getClass("int[][]"));
        assertEquals(String[].class, ClassUtils.getClass("java.lang.String[]"));
        assertEquals(String[].class, ClassUtils.getClass("[Ljava.lang.String;"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClassNotFound() throws ClassNotFoundException {
        ClassUtils.getClass("unknown.NonExistentClass");
    }

    @Test(expected = NullPointerException.class)
    public void testGetClassNull() throws ClassNotFoundException {
        ClassUtils.getClass((String) null);
    }

    // ----------------------------------------------------------------------
    // Public Method
    // ----------------------------------------------------------------------

    @Test
    public void testGetPublicMethod_DeclaredDirectly() throws Exception {
        Method method = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[]{});
        assertNotNull(method);
        assertEquals("length", method.getName());
    }

    @Test
    public void testGetPublicMethod_FromInterface() throws Exception {
        // Map.entrySet() returned object is an unmodifiable/private set implementation
        Map<String, String> map = Collections.unmodifiableMap(Collections.singletonMap("a", "b"));
        Method method = ClassUtils.getPublicMethod(map.getClass(), "isEmpty", new Class<?>[]{});
        assertNotNull(method);
        assertTrue(Modifier.isPublic(method.getDeclaringClass().getModifiers()));
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_NotFound() throws Exception {
        ClassUtils.getPublicMethod(String.class, "nonExistentMethod", new Class<?>[]{});
    }

    @Test(expected = NullPointerException.class)
    public void testGetPublicMethod_NullClass() throws Exception {
        ClassUtils.getPublicMethod(null, "length", new Class<?>[]{});
    }

    // ----------------------------------------------------------------------
    // toClass
    // ----------------------------------------------------------------------

    @Test
    public void testToClass() {
        assertNull(ClassUtils.toClass(null));
        assertArrayEquals(new Class<?>[]{}, ClassUtils.toClass(new Object[]{}));

        Object[] objects = new Object[]{"test", Integer.valueOf(1), Boolean.TRUE};
        Class<?>[] classes = ClassUtils.toClass(objects);
        assertArrayEquals(new Class<?>[]{String.class, Integer.class, Boolean.class}, classes);
    }

    // ----------------------------------------------------------------------
    // Canonical Names
    // ----------------------------------------------------------------------

    @Test
    public void testGetShortCanonicalName() {
        assertEquals("String", ClassUtils.getShortCanonicalName("hello", "default"));
        assertEquals("default", ClassUtils.getShortCanonicalName((Object) null, "default"));
        
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class));
        assertEquals("", ClassUtils.getShortCanonicalName((Class<?>) null));

        assertEquals("", ClassUtils.getShortCanonicalName((String) null));
        assertEquals("", ClassUtils.getShortCanonicalName(""));
        assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
        assertEquals("String[]", ClassUtils.getShortCanonicalName("[Ljava.lang.String;"));
        assertEquals("String[][]", ClassUtils.getShortCanonicalName("[[Ljava.lang.String;"));
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
    }

    @Test
    public void testGetPackageCanonicalName() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("hello", "default"));
        assertEquals("default", ClassUtils.getPackageCanonicalName((Object) null, "default"));

        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class));
        assertEquals("", ClassUtils.getPackageCanonicalName((Class<?>) null));

        assertEquals("", ClassUtils.getPackageCanonicalName((String) null));
        assertEquals("", ClassUtils.getPackageCanonicalName(""));
        assertEquals("", ClassUtils.getPackageCanonicalName("[I"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[Ljava.lang.String;"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[[Ljava.lang.String;"));
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("java.lang.String"));
    }
}