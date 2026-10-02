package org.apache.commons.lang3;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * JUnit4 test suite for {@link ClassUtils} (Defects4J Lang-33b)
 * เป้าหมาย: ครอบคลุม branch/condition ให้มากที่สุดเท่าที่วิเคราะห์ได้จาก source
 */
public class ClassUtilsTest {

    // ---- helper types สำหรับทดสอบ getPublicMethod กรณี declaring class ไม่ public ----
    interface Hidden { // package-private interface (ไม่ public)
        void doSomething();
    }

    static class Impl implements Hidden { // package-private class
        public void doSomething() { }
    }

    // =========================================================
    // getShortClassName
    // =========================================================

    @Test
    public void testGetShortClassName_Object_Null() {
        assertEquals("NULL", ClassUtils.getShortClassName((Object) null, "NULL"));
    }

    @Test
    public void testGetShortClassName_Object_NotNull() {
        assertEquals("String", ClassUtils.getShortClassName("hello", "NULL"));
    }

    @Test
    public void testGetShortClassName_Class_Null() {
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
    }

    @Test
    public void testGetShortClassName_Class_Normal() {
        assertEquals("String", ClassUtils.getShortClassName(String.class));
    }

    @Test
    public void testGetShortClassName_String_Null() {
        assertEquals("", ClassUtils.getShortClassName((String) null));
    }

    @Test
    public void testGetShortClassName_String_Empty() {
        assertEquals("", ClassUtils.getShortClassName(""));
    }

    @Test
    public void testGetShortClassName_String_Normal() {
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
    }

    @Test
    public void testGetShortClassName_String_NoPackage() {
        assertEquals("String", ClassUtils.getShortClassName("String"));
    }

    @Test
    public void testGetShortClassName_String_InnerClass() {
        // innerIdx != -1 branch -> '$' แปลงเป็น '.'
        assertEquals("Map.Entry", ClassUtils.getShortClassName("java.util.Map$Entry"));
    }

    @Test
    public void testGetShortClassName_String_ObjectArray() {
        // array encoding "[L...;" + strip Object type encoding
        assertEquals("String[]", ClassUtils.getShortClassName("[Ljava.lang.String;"));
    }

    @Test
    public void testGetShortClassName_String_PrimitiveArray() {
        // array encoding "[I" -> reverseAbbreviationMap lookup -> "int"
        assertEquals("int[]", ClassUtils.getShortClassName("[I"));
    }

    @Test
    public void testGetShortClassName_String_MultiDimArray() {
        assertEquals("int[][]", ClassUtils.getShortClassName("[[I"));
    }

    @Test
    public void testGetShortClassName_String_AbbreviationDirect() {
        // reverseAbbreviationMap.containsKey(className) == true โดยไม่ผ่าน array branch
        assertEquals("int", ClassUtils.getShortClassName("I"));
    }

    // =========================================================
    // getPackageName
    // =========================================================

    @Test
    public void testGetPackageName_Object_Null() {
        assertEquals("NULL", ClassUtils.getPackageName((Object) null, "NULL"));
    }

    @Test
    public void testGetPackageName_Object_NotNull() {
        assertEquals("java.lang", ClassUtils.getPackageName("hello", "NULL"));
    }

    @Test
    public void testGetPackageName_Class_Null() {
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
    }

    @Test
    public void testGetPackageName_Class_Normal() {
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
    }

    @Test
    public void testGetPackageName_String_Null() {
        assertEquals("", ClassUtils.getPackageName((String) null));
    }

    @Test
    public void testGetPackageName_String_Empty() {
        assertEquals("", ClassUtils.getPackageName(""));
    }

    @Test
    public void testGetPackageName_String_NoPackage() {
        assertEquals("", ClassUtils.getPackageName("String"));
    }

    @Test
    public void testGetPackageName_String_Normal() {
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String"));
    }

    @Test
    public void testGetPackageName_String_ArrayObjectEncoding() {
        assertEquals("java.lang", ClassUtils.getPackageName("[Ljava.lang.String;"));
    }

    @Test
    public void testGetPackageName_String_ArrayPrimitive() {
        // หลัง strip '[' -> "I" ไม่มี 'L'...';' และไม่มี '.' -> คืนค่าว่าง
        assertEquals("", ClassUtils.getPackageName("[I"));
    }

    // =========================================================
    // getAllSuperclasses / getAllInterfaces
    // =========================================================

    @Test
    public void testGetAllSuperclasses_Null() {
        assertNull(ClassUtils.getAllSuperclasses(null));
    }

    @Test
    public void testGetAllSuperclasses_Normal() {
        List<Class<?>> result = ClassUtils.getAllSuperclasses(ArrayList.class);
        assertNotNull(result);
        assertTrue(result.size() > 0);
        assertEquals(Object.class, result.get(result.size() - 1));
    }

    @Test
    public void testGetAllInterfaces_Null() {
        assertNull(ClassUtils.getAllInterfaces(null));
    }

    @Test
    public void testGetAllInterfaces_Normal() {
        List<Class<?>> result = ClassUtils.getAllInterfaces(ArrayList.class);
        assertNotNull(result);
        assertTrue(result.contains(List.class));
    }

    // =========================================================
    // convertClassNamesToClasses / convertClassesToClassNames
    // =========================================================

    @Test
    public void testConvertClassNamesToClasses_Null() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
    }

    @Test
    public void testConvertClassNamesToClasses_Valid() {
        List<String> names = Arrays.asList("java.lang.String", "java.util.ArrayList");
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(names);
        assertEquals(String.class, result.get(0));
        assertEquals(ArrayList.class, result.get(1));
    }

    @Test
    public void testConvertClassNamesToClasses_Invalid() {
        // Class.forName throws -> catch branch -> null added
        List<String> names = Arrays.asList("no.such.Class$$$");
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(names);
        assertNull(result.get(0));
    }

    @Test
    public void testConvertClassesToClassNames_Null() {
        assertNull(ClassUtils.convertClassesToClassNames(null));
    }

    @Test
    public void testConvertClassesToClassNames_WithNullElement() {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        classes.add(String.class);
        classes.add(null);
        List<String> names = ClassUtils.convertClassesToClassNames(classes);
        assertEquals("java.lang.String", names.get(0));
        assertNull(names.get(1));
    }

    // =========================================================
    // isAssignable (Class[], Class[])
    // =========================================================

    @Test
    public void testIsAssignableArray_BothNull() {
        assertTrue(ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null));
    }

    @Test
    public void testIsAssignableArray_DifferentLength() {
        assertFalse(ClassUtils.isAssignable(new Class<?>[] { String.class },
                new Class<?>[] { String.class, String.class }));
    }

    @Test
    public void testIsAssignableArray_SameLengthMatch() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[] { Integer.class },
                new Class<?>[] { Number.class }));
    }

    @Test
    public void testIsAssignableArray_SameLengthMismatch() {
        assertFalse(ClassUtils.isAssignable(new Class<?>[] { String.class },
                new Class<?>[] { Number.class }));
    }

    @Test
    public void testIsAssignableArray_WithExplicitAutoboxing() {
        assertTrue(ClassUtils.isAssignable(new Class<?>[] { int.class },
                new Class<?>[] { Integer.class }, true));
        assertFalse(ClassUtils.isAssignable(new Class<?>[] { int.class },
                new Class<?>[] { Integer.class }, false));
    }

    // =========================================================
    // isAssignable (Class, Class[, boolean])
    // =========================================================

    @Test
    public void testIsAssignable_ToClassNull() {
        assertFalse(ClassUtils.isAssignable(String.class, null));
    }

    @Test
    public void testIsAssignable_ClsNull_ToClassPrimitive() {
        assertFalse(ClassUtils.isAssignable(null, int.class));
    }

    @Test
    public void testIsAssignable_ClsNull_ToClassNonPrimitive() {
        assertTrue(ClassUtils.isAssignable(null, String.class));
    }

    @Test
    public void testIsAssignable_Equal() {
        assertTrue(ClassUtils.isAssignable(String.class, String.class));
    }

    @Test
    public void testIsAssignable_Autobox_PrimitiveToWrapper() {
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class, true));
    }

    @Test
    public void testIsAssignable_Autobox_WrapperToPrimitive() {
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class, true));
    }

    @Test
    public void testIsAssignable_NoAutobox_PrimitiveVsWrapper_False() {
        assertFalse(ClassUtils.isAssignable(int.class, Integer.class, false));
    }

    @Test
    public void testIsAssignable_NoAutobox_WrapperVsPrimitive_UsesIsAssignableFrom() {
        // ไม่เข้า autoboxing, cls ไม่ primitive -> ไปที่ toClass.isAssignableFrom(cls)
        assertFalse(ClassUtils.isAssignable(Integer.class, int.class, false));
    }

    @Test
    public void testIsAssignable_Autobox_WrapperToPrimitive_NullResult() {
        // wrapperToPrimitive(String.class) == null -> branch "cls == null -> return false"
        assertFalse(ClassUtils.isAssignable(String.class, int.class, true));
    }

    @Test
    public void testIsAssignable_PrimitiveWidening_IntToLongFloatDouble() {
        assertTrue(ClassUtils.isAssignable(int.class, long.class, false));
        assertTrue(ClassUtils.isAssignable(int.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(int.class, double.class, false));
    }

    @Test
    public void testIsAssignable_PrimitiveWidening_IntToShort_False() {
        assertFalse(ClassUtils.isAssignable(int.class, short.class, false));
    }

    @Test
    public void testIsAssignable_PrimitiveWidening_LongToFloatDouble() {
        assertTrue(ClassUtils.isAssignable(long.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(long.class, double.class, false));
    }

    @Test
    public void testIsAssignable_PrimitiveWidening_LongToInt_False() {
        assertFalse(ClassUtils.isAssignable(long.class, int.class, false));
    }

    @Test
    public void testIsAssignable_Boolean_AlwaysFalseExceptSelf() {
        assertFalse(ClassUtils.isAssignable(boolean.class, int.class, false));
    }

    @Test
    public void testIsAssignable_Double_AlwaysFalseExceptSelf() {
        assertFalse(ClassUtils.isAssignable(double.class, float.class, false));
    }

    @Test
    public void testIsAssignable_FloatToDouble() {
        assertTrue(ClassUtils.isAssignable(float.class, double.class, false));
    }

    @Test
    public void testIsAssignable_FloatToInt_False() {
        assertFalse(ClassUtils.isAssignable(float.class, int.class, false));
    }

    @Test
    public void testIsAssignable_CharWidening() {
        assertTrue(ClassUtils.isAssignable(char.class, int.class, false));
        assertTrue(ClassUtils.isAssignable(char.class, long.class, false));
        assertTrue(ClassUtils.isAssignable(char.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(char.class, double.class, false));
    }

    @Test
    public void testIsAssignable_CharToShort_False() {
        assertFalse(ClassUtils.isAssignable(char.class, short.class, false));
    }

    @Test
    public void testIsAssignable_ShortWidening() {
        assertTrue(ClassUtils.isAssignable(short.class, int.class, false));
        assertTrue(ClassUtils.isAssignable(short.class, long.class, false));
        assertTrue(ClassUtils.isAssignable(short.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(short.class, double.class, false));
    }

    @Test
    public void testIsAssignable_ShortToByte_False() {
        assertFalse(ClassUtils.isAssignable(short.class, byte.class, false));
    }

    @Test
    public void testIsAssignable_ByteWidening() {
        assertTrue(ClassUtils.isAssignable(byte.class, short.class, false));
        assertTrue(ClassUtils.isAssignable(byte.class, int.class, false));
        assertTrue(ClassUtils.isAssignable(byte.class, long.class, false));
        assertTrue(ClassUtils.isAssignable(byte.class, float.class, false));
        assertTrue(ClassUtils.isAssignable(byte.class, double.class, false));
    }

    @Test
    public void testIsAssignable_ByteToBoolean_False() {
        assertFalse(ClassUtils.isAssignable(byte.class, boolean.class, false));
    }

    @Test
    public void testIsAssignable_ToClassNotPrimitive_WhenClsPrimitive_False() {
        // cls primitive, toClass ไม่ primitive, ไม่ autobox -> false (เงื่อนไข toClass.isPrimitive()==false)
        assertFalse(ClassUtils.isAssignable(int.class, Object.class, false));
    }

    @Test
    public void testIsAssignable_VoidFallsThroughToDeadCodeReturnFalse() {
        // หมายเหตุ: ตาม comment ในซอร์ส "should never get here" แต่ void.class เป็น primitive
        // และไม่ถูกเช็คในเงื่อนไขใดๆ ก่อนหน้า ทำให้ไปถึงบรรทัด return false สุดท้ายได้จริง
        assertFalse(ClassUtils.isAssignable(void.class, int.class, false));
    }

    @Test
    public void testIsAssignable_ReferenceAssignableFrom_True() {
        assertTrue(ClassUtils.isAssignable(Integer.class, Number.class, false));
    }

    @Test
    public void testIsAssignable_ReferenceAssignableFrom_False() {
        assertFalse(ClassUtils.isAssignable(Number.class, Integer.class, false));
    }

    // =========================================================
    // primitiveToWrapper / primitivesToWrappers
    // =========================================================

    @Test
    public void testPrimitiveToWrapper_Null() {
        assertNull(ClassUtils.primitiveToWrapper(null));
    }

    @Test
    public void testPrimitiveToWrapper_Primitive() {
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(int.class));
    }

    @Test
    public void testPrimitiveToWrapper_NonPrimitive() {
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
    }

    @Test
    public void testPrimitivesToWrappers_Null() {
        assertNull(ClassUtils.primitivesToWrappers(null));
    }

    @Test
    public void testPrimitivesToWrappers_Empty() {
        Class<?>[] empty = new Class<?>[0];
        assertSame(empty, ClassUtils.primitivesToWrappers(empty));
    }

    @Test
    public void testPrimitivesToWrappers_Normal() {
        Class<?>[] result = ClassUtils.primitivesToWrappers(new Class<?>[] { int.class, String.class });
        assertEquals(Integer.class, result[0]);
        assertEquals(String.class, result[1]);
    }

    // =========================================================
    // wrapperToPrimitive / wrappersToPrimitives
    // =========================================================

    @Test
    public void testWrapperToPrimitive_Wrapper() {
        assertEquals(int.class, ClassUtils.wrapperToPrimitive(Integer.class));
    }

    @Test
    public void testWrapperToPrimitive_NonWrapper() {
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
    }

    @Test
    public void testWrapperToPrimitive_Null() {
        assertNull(ClassUtils.wrapperToPrimitive(null));
    }

    @Test
    public void testWrappersToPrimitives_Null() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
    }

    @Test
    public void testWrappersToPrimitives_Empty() {
        Class<?>[] empty = new Class<?>[0];
        assertSame(empty, ClassUtils.wrappersToPrimitives(empty));
    }

    @Test
    public void testWrappersToPrimitives_Normal() {
        Class<?>[] result = ClassUtils.wrappersToPrimitives(new Class<?>[] { Integer.class, String.class });
        assertEquals(int.class, result[0]);
        assertNull(result[1]);
    }

    // =========================================================
    // isInnerClass
    // =========================================================

    @Test
    public void testIsInnerClass_Null() {
        assertFalse(ClassUtils.isInnerClass(null));
    }

    @Test
    public void testIsInnerClass_Inner() {
        assertTrue(ClassUtils.isInnerClass(java.util.Map.Entry.class));
    }

    @Test
    public void testIsInnerClass_NotInner() {
        assertFalse(ClassUtils.isInnerClass(String.class));
    }

    // =========================================================
    // getClass(...)
    // =========================================================

    @Test
    public void testGetClass_Abbreviation() throws ClassNotFoundException {
        Class<?> result = ClassUtils.getClass(getClass().getClassLoader(), "int", true);
        assertEquals(int.class, result);
    }

    @Test
    public void testGetClass_JvmArrayNotation() throws ClassNotFoundException {
        Class<?> result = ClassUtils.getClass(getClass().getClassLoader(), "[Ljava.lang.String;", true);
        assertEquals(String[].class, result);
    }

    @Test
    public void testGetClass_CanonicalArrayNotation() throws ClassNotFoundException {
        Class<?> result = ClassUtils.getClass(getClass().getClassLoader(), "java.lang.String[]", true);
        assertEquals(String[].class, result);
    }

    @Test
    public void testGetClass_PrimitiveArrayCanonical() throws ClassNotFoundException {
        Class<?> result = ClassUtils.getClass(getClass().getClassLoader(), "int[]", true);
        assertEquals(int[].class, result);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClass_NotFound() throws ClassNotFoundException {
        ClassUtils.getClass(getClass().getClassLoader(), "no.such.Class$$$", true);
    }

    @Test
    public void testGetClass_TwoArgOverload() throws ClassNotFoundException {
        Class<?> result = ClassUtils.getClass(getClass().getClassLoader(), "java.lang.String");
        assertEquals(String.class, result);
    }

    @Test
    public void testGetClass_OneArgString() throws ClassNotFoundException {
        Class<?> result = ClassUtils.getClass("java.lang.String");
        assertEquals(String.class, result);
    }

    @Test
    public void testGetClass_StringBoolean() throws ClassNotFoundException {
        Class<?> result = ClassUtils.getClass("java.lang.String", false);
        assertEquals(String.class, result);
    }

    // =========================================================
    // getPublicMethod
    // =========================================================

    @Test
    public void testGetPublicMethod_DeclaringClassAlreadyPublic() throws Exception {
        Method m = ClassUtils.getPublicMethod(String.class, "length", new Class<?>[0]);
        assertNotNull(m);
        assertEquals(String.class, m.getDeclaringClass());
    }

    @Test
    public void testGetPublicMethod_FoundViaPublicInterface() throws Exception {
        // ตามตัวอย่างใน javadoc: unmodifiable collection -> class ไม่ public แต่ interface List เป็น public
        List<?> list = Collections.unmodifiableList(new ArrayList<Object>());
        Method m = ClassUtils.getPublicMethod(list.getClass(), "isEmpty", new Class<?>[0]);
        assertNotNull(m);
        assertTrue(java.lang.reflect.Modifier.isPublic(m.getDeclaringClass().getModifiers()));
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_NotFoundAtAll_ThrowsFromInitialGetMethod() throws Exception {
        ClassUtils.getPublicMethod(String.class, "noSuchMethodXyz", new Class<?>[0]);
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_NoPublicDeclaringClassFound_ThrowsCustomException() throws Exception {
        // Impl ไม่ public, interface Hidden ก็ไม่ public -> ไม่มี candidate class ที่ public
        // -> หลุดลูปไปโยน NoSuchMethodException ที่สร้างขึ้นเอง (ท้ายเมธอด)
        ClassUtils.getPublicMethod(Impl.class, "doSomething", new Class<?>[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPublicMethod_NullClass_ThrowsNPE() throws Exception {
        ClassUtils.getPublicMethod(null, "toString", new Class<?>[0]);
    }

    // =========================================================
    // toClass
    // =========================================================

    @Test
    public void testToClass_Null() {
        assertNull(ClassUtils.toClass(null));
    }

    @Test
    public void testToClass_Empty() {
        Object[] empty = new Object[0];
        Class<?>[] result = ClassUtils.toClass(empty);
        assertEquals(0, result.length);
    }

    @Test
    public void testToClass_Normal() {
        Object[] arr = new Object[] { "a", Integer.valueOf(1) };
        Class<?>[] result = ClassUtils.toClass(arr);
        assertEquals(String.class, result[0]);
        assertEquals(Integer.class, result[1]);
    }

    // =========================================================
    // getShortCanonicalName
    // =========================================================

    @Test
    public void testGetShortCanonicalName_Object_Null() {
        assertEquals("NULL", ClassUtils.getShortCanonicalName((Object) null, "NULL"));
    }

    @Test
    public void testGetShortCanonicalName_Object_Normal() {
        assertEquals("String", ClassUtils.getShortCanonicalName("hello", "NULL"));
    }

    @Test
    public void testGetShortCanonicalName_Class_Null() {
        assertEquals("", ClassUtils.getShortCanonicalName((Class<?>) null));
    }

    @Test
    public void testGetShortCanonicalName_Class_Normal() {
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class));
    }

    @Test
    public void testGetShortCanonicalName_String_Null() {
        // getCanonicalName(null) -> null -> getShortClassName(null) -> ""
        assertEquals("", ClassUtils.getShortCanonicalName((String) null));
    }

    @Test
    public void testGetShortCanonicalName_String_Normal() {
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
    }

    @Test
    public void testGetShortCanonicalName_String_ObjectArray() {
        assertEquals("String[]", ClassUtils.getShortCanonicalName("[Ljava.lang.String;"));
    }

    @Test
    public void testGetShortCanonicalName_String_PrimitiveArray() {
        assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
    }

    // =========================================================
    // getPackageCanonicalName
    // =========================================================

    @Test
    public void testGetPackageCanonicalName_Object_Null() {
        assertEquals("NULL", ClassUtils.getPackageCanonicalName((Object) null, "NULL"));
    }

    @Test
    public void testGetPackageCanonicalName_Object_Normal() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("hello", "NULL"));
    }

    @Test
    public void testGetPackageCanonicalName_Class_Null() {
        assertEquals("", ClassUtils.getPackageCanonicalName((Class<?>) null));
    }

    @Test
    public void testGetPackageCanonicalName_Class_Normal() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class));
    }

    @Test
    public void testGetPackageCanonicalName_String_ObjectArray() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[Ljava.lang.String;"));
    }

    @Test
    public void testGetPackageCanonicalName_String_NoPackage() {
        assertEquals("", ClassUtils.getPackageCanonicalName("String"));
    }
}
