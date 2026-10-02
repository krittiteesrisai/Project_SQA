package org.apache.commons.lang;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_lang_ClassUtilsTest {
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getClass
    
    ///region FUZZER: CHECKED EXCEPTIONS for method getClass(java.lang.ClassLoader, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "ZX");
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getClass(java.lang.ClassLoader, java.lang.String)
    
    @Test(expected = ClassNotFoundException.class)
    public void testGetClass1() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getClass
    
    ///region FUZZER: CHECKED EXCEPTIONS for method getClass(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString1() throws ClassNotFoundException  {
        ClassUtils.getClass("\u0014\n\t\r");
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getClass(java.lang.String)
    
    @Test(expected = ClassNotFoundException.class)
    public void testGetClass2() throws ClassNotFoundException  {
        String string = "";
        
        ClassUtils.getClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getClass
    
    ///region FUZZER: CHECKED EXCEPTIONS for method getClass(java.lang.ClassLoader, java.lang.String, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString2() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "[", true);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getClass(java.lang.ClassLoader, java.lang.String, boolean)
    
    @Test(expected = ClassNotFoundException.class)
    public void testGetClass3() throws ClassNotFoundException  {
        ClassUtils.getClass(null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getClass
    
    ///region FUZZER: CHECKED EXCEPTIONS for method getClass(java.lang.String, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithBlankString() throws ClassNotFoundException  {
        ClassUtils.getClass("\n\t\r", false);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getClass(java.lang.String, boolean)
    
    @Test(expected = ClassNotFoundException.class)
    public void testGetClass4() throws ClassNotFoundException  {
        String string = "";
        
        ClassUtils.getClass(string, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.toClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toClass([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#toClass(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return classes;}
 *  */
    @Test
    public void testToClass_ArrayLengthNotEqualsZero() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        java.lang.Class[] actual = ClassUtils.toClass(objectArray);
        
        java.lang.Class[] expected = new java.lang.Class[1];
        Class class1 = Object.class;
        expected[0] = class1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#toClass(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return ArrayUtils.EMPTY_CLASS_ARRAY;}
 *  */
    @Test
    public void testToClass_ArrayLengthEqualsZero() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Class[] prevEMPTY_CLASS_ARRAY = ArrayUtils.EMPTY_CLASS_ARRAY;
        try {
            java.lang.Class[] emptyClassArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CLASS_ARRAY", emptyClassArray);
            java.lang.Object[] objectArray = {};
            
            java.lang.Class[] actual = ClassUtils.toClass(objectArray);
            
            int emptyClassArraySize = emptyClassArray.length;
            assertEquals(emptyClassArraySize, actual.length);
            assertTrue(deepEquals(emptyClassArray, actual));
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CLASS_ARRAY", prevEMPTY_CLASS_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#toClass(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToClass_ArrayEqualsNull() {
        java.lang.Class[] actual = ClassUtils.toClass(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toClass([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#toClass(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: classes[i] = array[i].getClass();
 *  */
    @Test
    public void testToClass_ThrowNullPointerException() {
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.lang.ClassUtils.toClass] produces [java.lang.NullPointerException]
            org.apache.commons.lang.ClassUtils.toClass(ClassUtils.java:876) */
        ClassUtils.toClass(objectArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toClass([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        java.lang.Class[] actual = ClassUtils.toClass(objectArray);
        
        java.lang.Class[] expected = new java.lang.Class[3];
        Class class1 = Object.class;
        expected[0] = class1;
        expected[1] = class1;
        expected[2] = class1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getCanonicalName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetCanonicalName_ClassNameEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = ((Object) null);
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getCanonicalName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): False}
 * @utbot.executesCondition {@code (dim < 1): True}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testGetCanonicalName_DimLessThan1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = string;
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCanonicalName(java.lang.String)
    
    @Test
    public void testGetCanonicalName1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0000\u0000\u0000";
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = string;
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        assertEquals(string, actual);
    }
    
    @Test
    public void testGetCanonicalName2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0000\t\t\u0000\u0000\u0000\u0000";
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = string;
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getPackageName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageName(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link org.apache.commons.lang.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.returnsFrom {@code return getPackageName(object.getClass());}
 *  */
    @Test
    public void testGetPackageName_ObjectNotEqualsNull() {
        short[] shortArray = {};
        
        String actual = ClassUtils.getPackageName(shortArray, null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return valueIfNull;}
 *  */
    @Test
    public void testGetPackageName_ObjectEqualsNull() {
        String actual = ClassUtils.getPackageName(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getPackageName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): False}
 * @utbot.executesCondition {@code (i == -1): True}
 *  */
    @Test
    public void testGetPackageName_IEqualsNegative1() {
        String string = "";
        
        String actual = ClassUtils.getPackageName(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): True}
 *  */
    @Test
    public void testGetPackageName_ClassNameEqualsNull() {
        String actual = ClassUtils.getPackageName(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): False}
 * @utbot.executesCondition {@code (i == -1): False}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return className.substring(0, i);}
 *  */
    @Test
    public void testGetPackageName_INotEqualsNegative1() {
        String string = " .";
        
        String actual = ClassUtils.getPackageName(string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getPackageName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang.ClassUtils#getPackageName(java.lang.String)}
 * @utbot.returnsFrom {@code return getPackageName(cls.getName());}
 *  */
    @Test
    public void testGetPackageName_ClsNotEqualsNull() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return StringUtils.EMPTY;}
 *  */
    @Test
    public void testGetPackageName_ClsEqualsNull() {
        String actual = ClassUtils.getPackageName(((Class) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.isAssignable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAssignable([Ljava.lang.Class;, [Ljava.lang.Class;, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 *  */
    @Test
    public void testIsAssignable_ReturnFalse() {
        java.lang.Class[] classArray = {null, null};
        java.lang.Class[] classArray1 = {null};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, false);
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        Class finalClassArray1 = classArray[1];
        
        Class finalClassArray10 = classArray1[0];
        
        assertNull(finalClassArray0);
        
        assertNull(finalClassArray1);
        
        assertNull(finalClassArray10);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 * @utbot.executesCondition {@code (classArray == null): False}
 * @utbot.executesCondition {@code (toClassArray == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < classArray.length; i++)} once
 *  */
    @Test
    public void testIsAssignable_ToClassArrayNotEqualsNull() {
        java.lang.Class[] classArray = {null};
        java.lang.Class[] classArray1 = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray1[0] = class1;
        
        Class initialClassArray10 = classArray1[0];
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, false);
        
        assertTrue(actual);
        
        Class finalClassArray0 = classArray[0];
        
        Class finalClassArray10 = classArray1[0];
        
        assertNull(finalClassArray0);
        
        assertFalse(initialClassArray10 == finalClassArray10);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 * @utbot.executesCondition {@code (classArray == null): False}
 * @utbot.executesCondition {@code (toClassArray == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < classArray.length; i++)} once
 *  */
    @Test
    public void testIsAssignable_ToClassArrayNotEqualsNull_1() {
        java.lang.Class[] classArray = {null};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray, false);
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        
        Class finalClassArray01 = classArray[0];
        
        assertNull(finalClassArray0);
        
        assertNull(finalClassArray01);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 * @utbot.executesCondition {@code (classArray == null): False}
 * @utbot.executesCondition {@code (toClassArray == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < classArray.length; i++)} once
 *  */
    @Test
    public void testIsAssignable_ToClassArrayNotEqualsNull_2() {
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        java.lang.Class[] classArray1 = new java.lang.Class[1];
        classArray1[0] = class1;
        
        Class initialClassArray0 = classArray[0];
        
        Class initialClassArray10 = classArray1[0];
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, false);
        
        assertTrue(actual);
        
        Class finalClassArray0 = classArray[0];
        
        Class finalClassArray10 = classArray1[0];
        
        assertFalse(initialClassArray0 == finalClassArray0);
        
        assertFalse(initialClassArray10 == finalClassArray10);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 * @utbot.executesCondition {@code (classArray == null): False}
 * @utbot.executesCondition {@code (toClassArray == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < classArray.length; i++)} once
 *  */
    @Test
    public void testIsAssignable_ToClassArrayNotEqualsNull_3() {
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        java.lang.Class[] classArray1 = new java.lang.Class[1];
        classArray1[0] = class1;
        
        Class initialClassArray0 = classArray[0];
        
        Class initialClassArray10 = classArray1[0];
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, true);
        
        assertTrue(actual);
        
        Class finalClassArray0 = classArray[0];
        
        Class finalClassArray10 = classArray1[0];
        
        assertFalse(initialClassArray0 == finalClassArray0);
        
        assertFalse(initialClassArray10 == finalClassArray10);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 *  */
    @Test
    public void testIsAssignable_ReturnFalse_1() {
        java.lang.Class[] classArray = {null};
        
        boolean actual = ClassUtils.isAssignable(classArray, ((java.lang.Class[]) null), false);
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        
        assertNull(finalClassArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 *  */
    @Test
    public void testIsAssignable_ReturnFalse_2() {
        java.lang.Class[] classArray = {null};
        
        boolean actual = ClassUtils.isAssignable(((java.lang.Class[]) null), classArray, false);
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        
        assertNull(finalClassArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 * @utbot.executesCondition {@code (classArray == null): True}
 *  */
    @Test
    public void testIsAssignable_ClassArrayEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Class[] prevEMPTY_CLASS_ARRAY = ArrayUtils.EMPTY_CLASS_ARRAY;
        try {
            java.lang.Class[] emptyClassArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CLASS_ARRAY", emptyClassArray);
            java.lang.Class[] classArray = {};
            
            boolean actual = ClassUtils.isAssignable(((java.lang.Class[]) null), classArray, false);
            
            assertTrue(actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CLASS_ARRAY", prevEMPTY_CLASS_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 * @utbot.executesCondition {@code (classArray == null): False}
 * @utbot.executesCondition {@code (toClassArray == null): True}
 *  */
    @Test
    public void testIsAssignable_ToClassArrayEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Class[] prevEMPTY_CLASS_ARRAY = ArrayUtils.EMPTY_CLASS_ARRAY;
        try {
            java.lang.Class[] emptyClassArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CLASS_ARRAY", emptyClassArray);
            java.lang.Class[] classArray = {};
            
            boolean actual = ClassUtils.isAssignable(classArray, ((java.lang.Class[]) null), false);
            
            assertTrue(actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CLASS_ARRAY", prevEMPTY_CLASS_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 * @utbot.executesCondition {@code (classArray == null): True}
 *  */
    @Test
    public void testIsAssignable_ClassArrayEqualsNull_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Class[] prevEMPTY_CLASS_ARRAY = ArrayUtils.EMPTY_CLASS_ARRAY;
        try {
            java.lang.Class[] emptyClassArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CLASS_ARRAY", emptyClassArray);
            
            boolean actual = ClassUtils.isAssignable(((java.lang.Class[]) null), ((java.lang.Class[]) null), false);
            
            assertTrue(actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CLASS_ARRAY", prevEMPTY_CLASS_ARRAY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.isAssignable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAssignable([Ljava.lang.Class;, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
 * @utbot.returnsFrom {@code return isAssignable(classArray, toClassArray, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable() {
        java.lang.Class[] classArray = {null};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray);
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        
        Class finalClassArray01 = classArray[0];
        
        assertNull(finalClassArray0);
        
        assertNull(finalClassArray01);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
 * @utbot.returnsFrom {@code return isAssignable(classArray, toClassArray, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_1() {
        java.lang.Class[] classArray = {null, null};
        java.lang.Class[] classArray1 = {null};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        Class finalClassArray1 = classArray[1];
        
        Class finalClassArray10 = classArray1[0];
        
        assertNull(finalClassArray0);
        
        assertNull(finalClassArray1);
        
        assertNull(finalClassArray10);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
 * @utbot.returnsFrom {@code return isAssignable(classArray, toClassArray, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_2() {
        java.lang.Class[] classArray = {null};
        java.lang.Class[] classArray1 = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray1[0] = class1;
        
        Class initialClassArray10 = classArray1[0];
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
        
        Class finalClassArray0 = classArray[0];
        
        Class finalClassArray10 = classArray1[0];
        
        assertNull(finalClassArray0);
        
        assertFalse(initialClassArray10 == finalClassArray10);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
 * @utbot.returnsFrom {@code return isAssignable(classArray, toClassArray, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_3() {
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        java.lang.Class[] classArray1 = new java.lang.Class[1];
        classArray1[0] = class1;
        
        Class initialClassArray0 = classArray[0];
        
        Class initialClassArray10 = classArray1[0];
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
        
        Class finalClassArray0 = classArray[0];
        
        Class finalClassArray10 = classArray1[0];
        
        assertFalse(initialClassArray0 == finalClassArray0);
        
        assertFalse(initialClassArray10 == finalClassArray10);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
 * @utbot.returnsFrom {@code return isAssignable(classArray, toClassArray, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_4() {
        java.lang.Class[] classArray = {null};
        
        boolean actual = ClassUtils.isAssignable(((java.lang.Class[]) null), classArray);
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        
        assertNull(finalClassArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
 * @utbot.returnsFrom {@code return isAssignable(classArray, toClassArray, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_5() {
        java.lang.Class[] classArray = {null};
        
        boolean actual = ClassUtils.isAssignable(classArray, ((java.lang.Class[]) null));
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        
        assertNull(finalClassArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
 * @utbot.returnsFrom {@code return isAssignable(classArray, toClassArray, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Class[] prevEMPTY_CLASS_ARRAY = ArrayUtils.EMPTY_CLASS_ARRAY;
        try {
            java.lang.Class[] emptyClassArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CLASS_ARRAY", emptyClassArray);
            java.lang.Class[] classArray = {};
            
            boolean actual = ClassUtils.isAssignable(classArray, ((java.lang.Class[]) null));
            
            assertTrue(actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CLASS_ARRAY", prevEMPTY_CLASS_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
 * @utbot.returnsFrom {@code return isAssignable(classArray, toClassArray, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_8() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Class[] prevEMPTY_CLASS_ARRAY = ArrayUtils.EMPTY_CLASS_ARRAY;
        try {
            java.lang.Class[] emptyClassArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CLASS_ARRAY", emptyClassArray);
            java.lang.Class[] classArray = {};
            
            boolean actual = ClassUtils.isAssignable(((java.lang.Class[]) null), classArray);
            
            assertTrue(actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CLASS_ARRAY", prevEMPTY_CLASS_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
 * @utbot.returnsFrom {@code return isAssignable(classArray, toClassArray, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Class[] prevEMPTY_CLASS_ARRAY = ArrayUtils.EMPTY_CLASS_ARRAY;
        try {
            java.lang.Class[] emptyClassArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CLASS_ARRAY", emptyClassArray);
            
            boolean actual = ClassUtils.isAssignable(((java.lang.Class[]) null), ((java.lang.Class[]) null));
            
            assertTrue(actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CLASS_ARRAY", prevEMPTY_CLASS_ARRAY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.isAssignable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAssignable(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class,java.lang.Class)}
 * @utbot.returnsFrom {@code return isAssignable(cls, toClass, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_11() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class,java.lang.Class)}
 * @utbot.returnsFrom {@code return isAssignable(cls, toClass, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable1() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(((Class) null), class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class,java.lang.Class)}
 * @utbot.returnsFrom {@code return isAssignable(cls, toClass, false);}
 *  */
    @Test
    public void testIsAssignable_ReturnIsAssignable_21() {
        boolean actual = ClassUtils.isAssignable(((Class) null), ((Class) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.isAssignable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAssignable(java.lang.Class, java.lang.Class, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (toClass == null): False}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.executesCondition {@code (autoboxing): False}
 * @utbot.executesCondition {@code (cls.equals(toClass)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignable_NotAutoboxing() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, false);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (toClass == null): False}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.executesCondition {@code (autoboxing): True}
 * @utbot.executesCondition {@code (cls.isPrimitive()): False}
 * @utbot.executesCondition {@code (toClass.isPrimitive()): True}
 * @utbot.executesCondition {@code (!cls.isPrimitive()): False}
 * @utbot.executesCondition {@code (cls.equals(toClass)): True}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignable_ClsIsPrimitive() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, true);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (toClass == null): False}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.returnsFrom {@code return !(toClass.isPrimitive());}
 *  */
    @Test
    public void testIsAssignable_NotToClassIsPrimitive() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(((Class) null), class1, false);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (toClass == null): True}
 *  */
    @Test
    public void testIsAssignable_ToClassEqualsNull() {
        boolean actual = ClassUtils.isAssignable(((Class) null), ((Class) null), false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.isInnerClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInnerClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isInnerClass(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.returnsFrom {@code return cls.getName().indexOf(INNER_CLASS_SEPARATOR_CHAR) >= 0;}
 *  */
    @Test
    public void testIsInnerClass_ClsGetNameIndexOfLessThanZero() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isInnerClass(class1);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#isInnerClass(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsInnerClass_ClsEqualsNull() {
        boolean actual = ClassUtils.isInnerClass(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.addAbbreviation
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAbbreviation(java.lang.String, java.lang.String)
    
    @Test
    public void testAddAbbreviation1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method addAbbreviationMethod = classUtilsClazz.getDeclaredMethod("addAbbreviation", stringType, stringType);
        addAbbreviationMethod.setAccessible(true);
        java.lang.Object[] addAbbreviationMethodArguments = new java.lang.Object[2];
        addAbbreviationMethodArguments[0] = ((Object) null);
        addAbbreviationMethodArguments[1] = ((Object) null);
        addAbbreviationMethod.invoke(null, addAbbreviationMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getAllSuperclasses
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllSuperclasses(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getAllSuperclasses(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetAllSuperclasses_ClsEqualsNull() {
        List actual = ClassUtils.getAllSuperclasses(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getAllInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllInterfaces(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getAllInterfaces(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes org.apache.commons.lang.ClassUtils#getAllInterfaces(java.lang.Class,java.util.HashSet)
 *  */
    @Test
    public void testGetAllInterfaces_ClsNotEqualsNull() {
        Class class1 = Object.class;
        
        ArrayList actual = ((ArrayList) ClassUtils.getAllInterfaces(class1));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getAllInterfaces(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetAllInterfaces_ClsEqualsNull() {
        List actual = ClassUtils.getAllInterfaces(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getAllInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllInterfaces(java.lang.Class, java.util.HashSet)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getAllInterfaces(java.lang.Class,java.util.HashSet)}
 * @utbot.iterates iterate the loop {@code while(cls != null)} once
 *  */
    @Test
    public void testGetAllInterfaces_HashSetAdd() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class class1 = Object.class;
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class class1Type = Class.forName("java.lang.Class");
        Class hashSetType = Class.forName("java.util.HashSet");
        Method getAllInterfacesMethod = classUtilsClazz.getDeclaredMethod("getAllInterfaces", class1Type, hashSetType);
        getAllInterfacesMethod.setAccessible(true);
        java.lang.Object[] getAllInterfacesMethodArguments = new java.lang.Object[2];
        getAllInterfacesMethodArguments[0] = class1;
        getAllInterfacesMethodArguments[1] = ((Object) null);
        getAllInterfacesMethod.invoke(null, getAllInterfacesMethodArguments);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getAllInterfaces(java.lang.Class,java.util.HashSet)}
 *  */
    @Test
    public void testGetAllInterfaces() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class classType = Class.forName("java.lang.Class");
        Class hashSetType = Class.forName("java.util.HashSet");
        Method getAllInterfacesMethod = classUtilsClazz.getDeclaredMethod("getAllInterfaces", classType, hashSetType);
        getAllInterfacesMethod.setAccessible(true);
        java.lang.Object[] getAllInterfacesMethodArguments = new java.lang.Object[2];
        getAllInterfacesMethodArguments[0] = ((Object) null);
        getAllInterfacesMethodArguments[1] = ((Object) null);
        getAllInterfacesMethod.invoke(null, getAllInterfacesMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getShortClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.String)}
 * @utbot.returnsFrom {@code return getShortClassName(cls.getName());}
 *  */
    @Test
    public void testGetShortClassName_ClsNotEqualsNull() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return StringUtils.EMPTY;}
 *  */
    @Test
    public void testGetShortClassName_ClsEqualsNull() {
        String actual = ClassUtils.getShortClassName(((Class) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getShortClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.Class)}
 * @utbot.returnsFrom {@code return getShortClassName(object.getClass());}
 *  */
    @Test
    public void testGetShortClassName_ObjectNotEqualsNull() {
        byte[] byteArray = {};
        
        String actual = ClassUtils.getShortClassName(byteArray, null);
        
        String expected = "[B";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return valueIfNull;}
 *  */
    @Test
    public void testGetShortClassName_ObjectEqualsNull() {
        String actual = ClassUtils.getShortClassName(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getShortClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getShortClassName(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (className == null): False}
    /// invoke:
    ///     {@link java.lang.String#length()} once
    /// execute conditions:
    ///     {@code (className.length() == 0): False}
    /// invoke:
    ///     {@link java.lang.String#lastIndexOf(int)} once,
    ///     {@link java.lang.String#indexOf(int,int)} once,
    ///     {@link java.lang.String#substring(int)} once
    /// return from: {@code return out;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.String)}
 * @utbot.executesCondition {@code (lastDotIdx == -1): True}
 * @utbot.executesCondition {@code (innerIdx != -1): False}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetShortClassName_LastDotIdxEqualsNegative1() {
        String string = "  ";
        
        String actual = ClassUtils.getShortClassName(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.String)}
 * @utbot.executesCondition {@code (lastDotIdx == -1): False}
 * @utbot.executesCondition {@code (innerIdx != -1): False}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetShortClassName_InnerIdxEqualsNegative1() {
        String string = ".";
        
        String actual = ClassUtils.getShortClassName(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.String)}
 * @utbot.executesCondition {@code (lastDotIdx == -1): False}
 * @utbot.executesCondition {@code (innerIdx != -1): True}
 * @utbot.invokes {@link java.lang.String#replace(char,char)}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetShortClassName_InnerIdxNotEqualsNegative1() {
        String string = ".$";
        
        String actual = ClassUtils.getShortClassName(string);
        
        String expected = ".";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getShortClassName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): True}
 *  */
    @Test
    public void testGetShortClassName_ClassNameEqualsNull() {
        String actual = ClassUtils.getShortClassName(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortClassName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): False}
 * @utbot.executesCondition {@code (className.length() == 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testGetShortClassName_ClassNameLengthEqualsZero() {
        String string = "";
        
        String actual = ClassUtils.getShortClassName(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getPublicMethod
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPublicMethod(java.lang.Class, java.lang.String, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPublicMethod(java.lang.Class,java.lang.String,java.lang.Class[])}
 * @utbot.invokes {@link java.lang.Class#getMethod(java.lang.String,java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Method declaredMethod = cls.getMethod(methodName, parameterTypes);
 *  */
    @Test
    public void testGetPublicMethod_ThrowNullPointerException_1() throws NoSuchMethodException  {
        Class class1 = Object.class;
        
        /* This test fails because method [org.apache.commons.lang.ClassUtils.getPublicMethod] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.Class.getMethod(Class.java:2219)
            org.apache.commons.lang.ClassUtils.getPublicMethod(ClassUtils.java:803) */
        ClassUtils.getPublicMethod(class1, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPublicMethod(java.lang.Class,java.lang.String,java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Method declaredMethod = cls.getMethod(methodName, parameterTypes);
 *  */
    @Test
    public void testGetPublicMethod_ThrowNullPointerException() throws NoSuchMethodException  {
        /* This test fails because method [org.apache.commons.lang.ClassUtils.getPublicMethod] produces [java.lang.NullPointerException]
            org.apache.commons.lang.ClassUtils.getPublicMethod(ClassUtils.java:803) */
        ClassUtils.getPublicMethod(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getPublicMethod(java.lang.Class, java.lang.String, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPublicMethod(java.lang.Class,java.lang.String,java.lang.Class[])}
 * @utbot.invokes {@link java.lang.Class#getMethod(java.lang.String,java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NoSuchMethodException} 
 *  */
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_ThrowNoSuchMethodException() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        
        ClassUtils.getPublicMethod(class1, string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.primitiveToWrapper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method primitiveToWrapper(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#primitiveToWrapper(java.lang.Class)}
 * @utbot.executesCondition {@code (cls != null): True}
 * @utbot.executesCondition {@code (cls.isPrimitive()): False}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.returnsFrom {@code return convertedClass;}
 *  */
    @Test
    public void testPrimitiveToWrapper_NotClsIsPrimitive() {
        Class class1 = Object.class;
        
        Class actual = ClassUtils.primitiveToWrapper(class1);
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#primitiveToWrapper(java.lang.Class)}
 * @utbot.executesCondition {@code (cls != null): False}
 * @utbot.returnsFrom {@code return convertedClass;}
 *  */
    @Test
    public void testPrimitiveToWrapper_ClsEqualsNull() {
        Class actual = ClassUtils.primitiveToWrapper(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.toCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#toCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testToCanonicalName_ReturnClassName() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "!";
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = string;
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#toCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testToCanonicalName_ReturnClassName_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = string;
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#toCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testToCanonicalName_ReturnClassName_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = string;
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#toCanonicalName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): True}
 * @utbot.invokes {@link org.apache.commons.lang.StringUtils#deleteWhitespace(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: className == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testToCanonicalName_ThrowNullPointerException() throws Throwable  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = ((Object) null);
        try {
            toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.wrapperToPrimitive
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wrapperToPrimitive(java.lang.Class)
    
    @Test
    public void testWrapperToPrimitive1() {
        Class actual = ClassUtils.wrapperToPrimitive(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getShortCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang.ClassUtils#getShortCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return getShortCanonicalName(object.getClass().getName());}
 *  */
    @Test
    public void testGetShortCanonicalName_ObjectNotEqualsNull() {
        byte[] byteArray = {};
        
        String actual = ClassUtils.getShortCanonicalName(byteArray, null);
        
        String expected = "byte[]";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return valueIfNull;}
 *  */
    @Test
    public void testGetShortCanonicalName_ObjectEqualsNull() {
        String actual = ClassUtils.getShortCanonicalName(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.Object, java.lang.String)
    
    @Test
    public void testGetShortCanonicalName1() {
        Object object = new Object();
        String string = "";
        
        String actual = ClassUtils.getShortCanonicalName(object, string);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getShortCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortCanonicalName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang.ClassUtils#getShortCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return getShortCanonicalName(cls.getName());}
 *  */
    @Test
    public void testGetShortCanonicalName_ClsNotEqualsNull() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getShortCanonicalName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortCanonicalName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return StringUtils.EMPTY;}
 *  */
    @Test
    public void testGetShortCanonicalName_ClsEqualsNull() {
        String actual = ClassUtils.getShortCanonicalName(((Class) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getShortCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return ClassUtils.getShortClassName(getCanonicalName(canonicalName));}
 *  */
    @Test
    public void testGetShortCanonicalName_ReturnClassUtilsGetShortClassName() {
        String string = "\f";
        
        String actual = ClassUtils.getShortCanonicalName(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return ClassUtils.getShortClassName(getCanonicalName(canonicalName));}
 *  */
    @Test
    public void testGetShortCanonicalName_ReturnClassUtilsGetShortClassName_1() {
        String actual = ClassUtils.getShortCanonicalName(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getShortCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return ClassUtils.getShortClassName(getCanonicalName(canonicalName));}
 *  */
    @Test
    public void testGetShortCanonicalName_ReturnClassUtilsGetShortClassName_2() {
        String string = "";
        
        String actual = ClassUtils.getShortCanonicalName(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.String)
    
    @Test
    public void testGetShortCanonicalName2() {
        String string = "\f\r\u0000";
        
        String actual = ClassUtils.getShortCanonicalName(string);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetShortCanonicalName3() {
        String string = "\u0000\u0000";
        
        String actual = ClassUtils.getShortCanonicalName(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getPackageCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageCanonicalName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang.ClassUtils#getPackageCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return getPackageCanonicalName(cls.getName());}
 *  */
    @Test
    public void testGetPackageCanonicalName_ClsNotEqualsNull() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageCanonicalName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return StringUtils.EMPTY;}
 *  */
    @Test
    public void testGetPackageCanonicalName_ClsEqualsNull() {
        String actual = ClassUtils.getPackageCanonicalName(((Class) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getPackageCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return ClassUtils.getPackageName(getCanonicalName(canonicalName));}
 *  */
    @Test
    public void testGetPackageCanonicalName_ReturnClassUtilsGetPackageName() {
        String string = "\f";
        
        String actual = ClassUtils.getPackageCanonicalName(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return ClassUtils.getPackageName(getCanonicalName(canonicalName));}
 *  */
    @Test
    public void testGetPackageCanonicalName_ReturnClassUtilsGetPackageName_1() {
        String actual = ClassUtils.getPackageCanonicalName(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return ClassUtils.getPackageName(getCanonicalName(canonicalName));}
 *  */
    @Test
    public void testGetPackageCanonicalName_ReturnClassUtilsGetPackageName_2() {
        String string = "";
        
        String actual = ClassUtils.getPackageCanonicalName(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.String)
    
    @Test
    public void testGetPackageCanonicalName1() {
        String string = "\u0000";
        
        String actual = ClassUtils.getPackageCanonicalName(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.getPackageCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang.ClassUtils#getPackageCanonicalName(java.lang.String)}
 * @utbot.returnsFrom {@code return getPackageCanonicalName(object.getClass().getName());}
 *  */
    @Test
    public void testGetPackageCanonicalName_ObjectNotEqualsNull() {
        byte[] byteArray = {};
        
        String actual = ClassUtils.getPackageCanonicalName(byteArray, null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return valueIfNull;}
 *  */
    @Test
    public void testGetPackageCanonicalName_ObjectEqualsNull() {
        String actual = ClassUtils.getPackageCanonicalName(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.Object, java.lang.String)
    
    @Test
    public void testGetPackageCanonicalName2() {
        Object object = new Object();
        String string = "";
        
        String actual = ClassUtils.getPackageCanonicalName(object, string);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.wrappersToPrimitives
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrappersToPrimitives([Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
 * @utbot.executesCondition {@code (classes == null): False}
 * @utbot.executesCondition {@code (classes.length == 0): True}
 * @utbot.returnsFrom {@code return classes;}
 *  */
    @Test
    public void testWrappersToPrimitives_ClassesLengthEqualsZero() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
 * @utbot.executesCondition {@code (classes == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testWrappersToPrimitives_ClassesEqualsNull() {
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wrappersToPrimitives([Ljava.lang.Class;)
    
    @Test
    public void testWrappersToPrimitives1() {
        java.lang.Class[] classArray = {null};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        java.lang.Class[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClassArray0 = classArray[0];
        
        assertNull(finalClassArray0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.convertClassesToClassNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertClassesToClassNames(java.util.List)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#convertClassesToClassNames(java.util.List)}
 * @utbot.executesCondition {@code (classes == null): False}
 * @utbot.returnsFrom {@code return classNames;}
 *  */
    @Test
    public void testConvertClassesToClassNames_ClassesNotEqualsNull() {
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#convertClassesToClassNames(java.util.List)}
 * @utbot.executesCondition {@code (classes == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testConvertClassesToClassNames_ClassesEqualsNull() {
        List actual = ClassUtils.convertClassesToClassNames(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#convertClassesToClassNames(java.util.List)}
 * @utbot.executesCondition {@code (classes == null): False}
 * @utbot.iterates iterate the loop {@code for(Class<?> cls: classes)} once
 * @utbot.returnsFrom {@code return classNames;}
 *  */
    @Test
    public void testConvertClassesToClassNames_ClsNotEqualsNull() {
        ArrayList arrayList = new ArrayList();
        Class class1 = Object.class;
        arrayList.add(class1);
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        String string = "java.lang.Object";
        expected.add(string);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#convertClassesToClassNames(java.util.List)}
 * @utbot.executesCondition {@code (classes == null): False}
 * @utbot.iterates iterate the loop {@code for(Class<?> cls: classes)} once
 * @utbot.returnsFrom {@code return classNames;}
 *  */
    @Test
    public void testConvertClassesToClassNames_ClsEqualsNull() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.primitivesToWrappers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method primitivesToWrappers([Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#primitivesToWrappers(java.lang.Class[])}
 * @utbot.executesCondition {@code (classes == null): False}
 * @utbot.executesCondition {@code (classes.length == 0): True}
 * @utbot.returnsFrom {@code return classes;}
 *  */
    @Test
    public void testPrimitivesToWrappers_ClassesLengthEqualsZero() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#primitivesToWrappers(java.lang.Class[])}
 * @utbot.executesCondition {@code (classes == null): False}
 * @utbot.executesCondition {@code (classes.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < classes.length; i++)} once
 * @utbot.returnsFrom {@code return convertedClasses;}
 *  */
    @Test
    public void testPrimitivesToWrappers_ClassesLengthNotEqualsZero() {
        java.lang.Class[] classArray = {null};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        java.lang.Class[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClassArray0 = classArray[0];
        
        assertNull(finalClassArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#primitivesToWrappers(java.lang.Class[])}
 * @utbot.executesCondition {@code (classes == null): False}
 * @utbot.executesCondition {@code (classes.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < classes.length; i++)} once
 * @utbot.returnsFrom {@code return convertedClasses;}
 *  */
    @Test
    public void testPrimitivesToWrappers_ClassesLengthNotEqualsZero_1() {
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        
        Class initialClassArray0 = classArray[0];
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        java.lang.Class[] expected = new java.lang.Class[1];
        expected[0] = class1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClassArray0 = classArray[0];
        
        assertFalse(initialClassArray0 == finalClassArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#primitivesToWrappers(java.lang.Class[])}
 * @utbot.executesCondition {@code (classes == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testPrimitivesToWrappers_ClassesEqualsNull() {
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.ClassUtils.convertClassNamesToClasses
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertClassNamesToClasses(java.util.List)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#convertClassNamesToClasses(java.util.List)}
 * @utbot.executesCondition {@code (classNames == null): False}
 * @utbot.returnsFrom {@code return classes;}
 *  */
    @Test
    public void testConvertClassNamesToClasses_ClassNamesNotEqualsNull() {
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassNamesToClasses(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#convertClassNamesToClasses(java.util.List)}
 * @utbot.executesCondition {@code (classNames == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testConvertClassNamesToClasses_ClassNamesEqualsNull() {
        List actual = ClassUtils.convertClassNamesToClasses(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.ClassUtils#convertClassNamesToClasses(java.util.List)}
 * @utbot.executesCondition {@code (classNames == null): False}
 * @utbot.iterates iterate the loop {@code for(String className: classNames)} once
 * @utbot.returnsFrom {@code return classes;}
 *  */
    @Test
    public void testConvertClassNamesToClasses_ListAdd() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassNamesToClasses(arrayList));
        
        ArrayList expected = new ArrayList();
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields630936725026900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields630936725026900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass630936725033400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields630936725026900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass630936725033400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    ///endregion
}

