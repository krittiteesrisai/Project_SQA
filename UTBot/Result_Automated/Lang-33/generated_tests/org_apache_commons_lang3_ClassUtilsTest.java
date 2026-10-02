package org.apache.commons.lang3;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.util.Collections.emptyList;

public final class org_apache_commons_lang3_ClassUtilsTest {
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.isAssignable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAssignable(java.lang.Class, java.lang.Class, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (autoboxing): False}
 * @utbot.executesCondition {@code (cls.equals(toClass)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignable_ClsEquals() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, false);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (autoboxing): False}
 * @utbot.executesCondition {@code (cls.equals(toClass)): False}
 * @utbot.executesCondition {@code (cls.isPrimitive()): True}
 * @utbot.executesCondition {@code (toClass.isPrimitive() == false): True}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 *  */
    @Test
    public void testIsAssignable_ToClassIsPrimitiveEqualsFalse() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, false);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (autoboxing): False}
 * @utbot.executesCondition {@code (cls.equals(toClass)): False}
 * @utbot.executesCondition {@code (cls.isPrimitive()): False}
 * @utbot.returnsFrom {@code return toClass.isAssignableFrom(cls);}
 *  */
    @Test
    public void testIsAssignable_NotClsIsPrimitive() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, false);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (autoboxing): True}
 * @utbot.executesCondition {@code (cls.isPrimitive()): False}
 * @utbot.executesCondition {@code (toClass.isPrimitive()): True}
 * @utbot.executesCondition {@code (!cls.isPrimitive()): False}
 * @utbot.executesCondition {@code (cls.equals(toClass)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignable_ClsEquals_1() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, true);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (autoboxing): True}
 * @utbot.executesCondition {@code (cls.isPrimitive()): False}
 * @utbot.executesCondition {@code (toClass.isPrimitive()): False}
 * @utbot.executesCondition {@code (cls.equals(toClass)): False}
 * @utbot.executesCondition {@code (cls.isPrimitive()): False}
 * @utbot.returnsFrom {@code return toClass.isAssignableFrom(cls);}
 *  */
    @Test
    public void testIsAssignable_NotClsIsPrimitive_1() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, true);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (autoboxing): True}
 * @utbot.executesCondition {@code (cls.isPrimitive()): True}
 * @utbot.executesCondition {@code (!toClass.isPrimitive()): False}
 * @utbot.executesCondition {@code (toClass.isPrimitive()): False}
 * @utbot.executesCondition {@code (cls.equals(toClass)): False}
 * @utbot.executesCondition {@code (cls.isPrimitive()): False}
 * @utbot.returnsFrom {@code return toClass.isAssignableFrom(cls);}
 *  */
    @Test
    public void testIsAssignable_ToClassIsPrimitive() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, true);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (autoboxing): True}
 * @utbot.executesCondition {@code (cls.isPrimitive()): True}
 * @utbot.executesCondition {@code (!toClass.isPrimitive()): True}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.executesCondition {@code (toClass.isPrimitive()): True}
 * @utbot.executesCondition {@code (!cls.isPrimitive()): False}
 * @utbot.executesCondition {@code (cls.equals(toClass)): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#primitiveToWrapper(java.lang.Class)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignable_ClsNotEqualsNull() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, true);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isAssignable(java.lang.Class, java.lang.Class, boolean)
    
    @Test
    public void testIsAssignable1() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, true);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    @Test
    public void testIsAssignable2() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, true);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    @Test
    public void testIsAssignable3() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, true);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    @Test
    public void testIsAssignable4() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isAssignable(class1, class1, true);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.isAssignable
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isAssignable(java.lang.Class, java.lang.Class)
    
    @Test
    public void testIsAssignable5() {
        boolean actual = ClassUtils.isAssignable(((Class) null), ((Class) null));
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsAssignable6() {
        boolean actual = ClassUtils.isAssignable(((Class) null), ((Class) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.isAssignable
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isAssignable([Ljava.lang.Class;, [Ljava.lang.Class;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays1() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays2() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays3() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays4() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays5() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays6() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[])}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays7() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isAssignable([Ljava.lang.Class;, [Ljava.lang.Class;)
    
    @Test
    public void testIsAssignable7() {
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        java.lang.Class[] classArray1 = {null, null, null, null, null, null, null, null, null};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1);
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        Class finalClassArray1 = classArray[1];
        Class finalClassArray2 = classArray[2];
        Class finalClassArray3 = classArray[3];
        Class finalClassArray4 = classArray[4];
        Class finalClassArray5 = classArray[5];
        Class finalClassArray6 = classArray[6];
        Class finalClassArray7 = classArray[7];
        Class finalClassArray8 = classArray[8];
        
        Class finalClassArray10 = classArray1[0];
        Class finalClassArray11 = classArray1[1];
        Class finalClassArray12 = classArray1[2];
        Class finalClassArray13 = classArray1[3];
        Class finalClassArray14 = classArray1[4];
        Class finalClassArray15 = classArray1[5];
        Class finalClassArray16 = classArray1[6];
        Class finalClassArray17 = classArray1[7];
        Class finalClassArray18 = classArray1[8];
        
        assertNull(finalClassArray0);
        
        assertNull(finalClassArray1);
        
        assertNull(finalClassArray2);
        
        assertNull(finalClassArray3);
        
        assertNull(finalClassArray4);
        
        assertNull(finalClassArray5);
        
        assertNull(finalClassArray6);
        
        assertNull(finalClassArray7);
        
        assertNull(finalClassArray8);
        
        assertNull(finalClassArray10);
        
        assertNull(finalClassArray11);
        
        assertNull(finalClassArray12);
        
        assertNull(finalClassArray13);
        
        assertNull(finalClassArray14);
        
        assertNull(finalClassArray15);
        
        assertNull(finalClassArray16);
        
        assertNull(finalClassArray17);
        
        assertNull(finalClassArray18);
    }
    
    @Test
    public void testIsAssignable8() {
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        boolean actual = ClassUtils.isAssignable(((java.lang.Class[]) null), classArray);
        
        assertFalse(actual);
        
        Class finalClassArray0 = classArray[0];
        Class finalClassArray1 = classArray[1];
        Class finalClassArray2 = classArray[2];
        Class finalClassArray3 = classArray[3];
        Class finalClassArray4 = classArray[4];
        Class finalClassArray5 = classArray[5];
        Class finalClassArray6 = classArray[6];
        Class finalClassArray7 = classArray[7];
        Class finalClassArray8 = classArray[8];
        
        assertNull(finalClassArray0);
        
        assertNull(finalClassArray1);
        
        assertNull(finalClassArray2);
        
        assertNull(finalClassArray3);
        
        assertNull(finalClassArray4);
        
        assertNull(finalClassArray5);
        
        assertNull(finalClassArray6);
        
        assertNull(finalClassArray7);
        
        assertNull(finalClassArray8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.isAssignable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAssignable([Ljava.lang.Class;, [Ljava.lang.Class;, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
 * @utbot.executesCondition {@code (ArrayUtils.isSameLength(classArray, toClassArray) == false): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object[])}
 *  */
    @Test
    public void testIsAssignable_ArrayUtilsIsSameLengthEqualsFalse() {
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
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isAssignable([Ljava.lang.Class;, [Ljava.lang.Class;, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays8() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, true);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays9() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, false);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays10() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, true);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays11() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, false);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays12() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, false);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays13() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, false);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays14() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, true);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays15() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, true);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays16() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, false);
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class[],java.lang.Class[],boolean)}
     */
    @Test
    public void testIsAssignableReturnsTrueWithEmptyObjectArrays17() {
        java.lang.Class[] classArray = {};
        java.lang.Class[] classArray1 = {};
        
        boolean actual = ClassUtils.isAssignable(classArray, classArray1, true);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.isInnerClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInnerClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isInnerClass(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isInnerClass(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.returnsFrom {@code return cls.getName().indexOf(INNER_CLASS_SEPARATOR_CHAR) >= 0;}
 *  */
    @Test
    public void testIsInnerClass_ClsGetNameIndexOfGreaterOrEqualZero() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtils.isInnerClass(class1);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#isInnerClass(java.lang.Class)}
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
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getPackageCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return valueIfNull;}
 *  */
    @Test
    public void testGetPackageCanonicalName_ObjectEqualsNull() {
        String actual = ClassUtils.getPackageCanonicalName(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.Object, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString() {
        String actual = ClassUtils.getPackageCanonicalName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString1() {
        String actual = ClassUtils.getPackageCanonicalName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithEmptyString() {
        Object object = new Object();
        
        String actual = ClassUtils.getPackageCanonicalName(object, "");
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString2() {
        String actual = ClassUtils.getPackageCanonicalName(null, "XZ");
        
        String expected = "XZ";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString3() {
        String actual = ClassUtils.getPackageCanonicalName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString4() {
        String actual = ClassUtils.getPackageCanonicalName(null, "XZ");
        
        String expected = "XZ";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString5() {
        String actual = ClassUtils.getPackageCanonicalName(null, "-3");
        
        String expected = "-3";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString6() {
        String actual = ClassUtils.getPackageCanonicalName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithBlankString() {
        String actual = ClassUtils.getPackageCanonicalName(null, "\n\r\t");
        
        String expected = "\n\r\t";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithBlankString1() {
        String actual = ClassUtils.getPackageCanonicalName(null, "\n\r\t");
        
        String expected = "\n\r\t";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getPackageCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.Class)
    
    @Test
    public void testGetPackageCanonicalName1() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetPackageCanonicalName2() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetPackageCanonicalName3() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetPackageCanonicalName4() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetPackageCanonicalName5() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetPackageCanonicalName6() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetPackageCanonicalName7() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetPackageCanonicalName8() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetPackageCanonicalName9() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetPackageCanonicalName10() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageCanonicalName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getPackageCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
 * @utbot.invokes org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
 * @utbot.returnsFrom {@code return ClassUtils.getPackageName(getCanonicalName(canonicalName));}
 *  */
    @Test
    public void testGetPackageCanonicalName_ClassUtilsGetPackageName() {
        String actual = ClassUtils.getPackageCanonicalName(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPackageCanonicalName(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString7() {
        String actual = ClassUtils.getPackageCanonicalName("\u0014\n\t\r");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithEmptyString1() {
        String actual = ClassUtils.getPackageCanonicalName("");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString8() {
        String actual = ClassUtils.getPackageCanonicalName("\r\t\u0014\n");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString9() {
        String actual = ClassUtils.getPackageCanonicalName("\u0014\r\t\n");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString10() {
        String actual = ClassUtils.getPackageCanonicalName("\u008A");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString11() {
        String actual = ClassUtils.getPackageCanonicalName("-3");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString12() {
        String actual = ClassUtils.getPackageCanonicalName("\u0014\t\r\n");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString13() {
        String actual = ClassUtils.getPackageCanonicalName("abc");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString14() {
        String actual = ClassUtils.getPackageCanonicalName("abc");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetPackageCanonicalNameWithNonEmptyString15() {
        String actual = ClassUtils.getPackageCanonicalName("ab5c");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getShortCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return valueIfNull;}
 *  */
    @Test
    public void testGetShortCanonicalName_ObjectEqualsNull() {
        String actual = ClassUtils.getShortCanonicalName(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.Object, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString() {
        String actual = ClassUtils.getShortCanonicalName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString1() {
        String actual = ClassUtils.getShortCanonicalName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithEmptyString() {
        Object object = new Object();
        
        String actual = ClassUtils.getShortCanonicalName(object, "");
        
        String expected = "Object";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString2() {
        String actual = ClassUtils.getShortCanonicalName(null, "XZ");
        
        String expected = "XZ";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString3() {
        String actual = ClassUtils.getShortCanonicalName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString4() {
        String actual = ClassUtils.getShortCanonicalName(null, "XZ");
        
        String expected = "XZ";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString5() {
        String actual = ClassUtils.getShortCanonicalName(null, "-3");
        
        String expected = "-3";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString6() {
        String actual = ClassUtils.getShortCanonicalName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithBlankString() {
        String actual = ClassUtils.getShortCanonicalName(null, "\n\r\t");
        
        String expected = "\n\r\t";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithBlankString1() {
        String actual = ClassUtils.getShortCanonicalName(null, "\n\r\t");
        
        String expected = "\n\r\t";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getShortCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.Class)}
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
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getShortCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
 * @utbot.invokes org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
 * @utbot.returnsFrom {@code return ClassUtils.getShortClassName(getCanonicalName(canonicalName));}
 *  */
    @Test
    public void testGetShortCanonicalName_ClassUtilsGetShortClassName() {
        String actual = ClassUtils.getShortCanonicalName(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getShortCanonicalName(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString7() {
        String actual = ClassUtils.getShortCanonicalName("\u0014\n\t\r");
        
        String expected = "\u0014";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithEmptyString1() {
        String actual = ClassUtils.getShortCanonicalName("");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString8() {
        String actual = ClassUtils.getShortCanonicalName("\r\t\u0014\n");
        
        String expected = "\u0014";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString9() {
        String actual = ClassUtils.getShortCanonicalName("\u0014\r\t\n");
        
        String expected = "\u0014";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString10() {
        String actual = ClassUtils.getShortCanonicalName("\u008A");
        
        String expected = "\u008A";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString11() {
        String actual = ClassUtils.getShortCanonicalName("-3");
        
        String expected = "-3";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString12() {
        String actual = ClassUtils.getShortCanonicalName("\u0014\t\r\n");
        
        String expected = "\u0014";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString13() {
        String actual = ClassUtils.getShortCanonicalName("abc");
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString14() {
        String actual = ClassUtils.getShortCanonicalName("abc");
        
        String expected = "abc";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetShortCanonicalNameWithNonEmptyString15() {
        String actual = ClassUtils.getShortCanonicalName("ab5c");
        
        String expected = "ab5c";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertClassNamesToClasses(java.util.List)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method convertClassNamesToClasses(java.util.List)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses() {
        List list = emptyList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassNamesToClasses(list));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses1() {
        List list = emptyList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassNamesToClasses(list));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses2() {
        List list = emptyList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassNamesToClasses(list));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses3() {
        List list = emptyList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassNamesToClasses(list));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses4() {
        List list = emptyList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassNamesToClasses(list));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses5() {
        List actual = ClassUtils.convertClassNamesToClasses(null);
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses6() {
        List actual = ClassUtils.convertClassNamesToClasses(null);
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses7() {
        List actual = ClassUtils.convertClassNamesToClasses(null);
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses8() {
        List actual = ClassUtils.convertClassNamesToClasses(null);
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses9() {
        List actual = ClassUtils.convertClassNamesToClasses(null);
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses10() {
        List actual = ClassUtils.convertClassNamesToClasses(null);
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassNamesToClasses(java.util.List)}
     */
    @Test
    public void testConvertClassNamesToClasses11() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("");
        arrayList.add("#$\\\"'");
        arrayList.add("-3");
        arrayList.add("10");
        arrayList.add("#$\\\"'");
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassNamesToClasses(arrayList));
        
        ArrayList expected = new ArrayList();
        expected.add(null);
        expected.add(null);
        expected.add(null);
        expected.add(null);
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.primitivesToWrappers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method primitivesToWrappers([Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
 * @utbot.executesCondition {@code (classes == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testPrimitivesToWrappers_ClassesEqualsNull() {
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method primitivesToWrappers([Ljava.lang.Class;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray1() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray2() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray3() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray4() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray5() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray6() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray7() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray8() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitivesToWrappers(java.lang.Class[])}
     */
    @Test
    public void testPrimitivesToWrappersWithEmptyObjectArray9() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.primitivesToWrappers(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.wrappersToPrimitives
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrappersToPrimitives([Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
 * @utbot.executesCondition {@code (classes == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testWrappersToPrimitives_ClassesEqualsNull() {
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method wrappersToPrimitives([Ljava.lang.Class;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray1() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray2() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray3() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray4() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray5() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray6() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray7() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray8() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#wrappersToPrimitives(java.lang.Class[])}
     */
    @Test
    public void testWrappersToPrimitivesWithEmptyObjectArray9() {
        java.lang.Class[] classArray = {};
        
        java.lang.Class[] actual = ClassUtils.wrappersToPrimitives(classArray);
        
        int classArraySize = classArray.length;
        assertEquals(classArraySize, actual.length);
        assertTrue(deepEquals(classArray, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.convertClassesToClassNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertClassesToClassNames(java.util.List)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
 * @utbot.executesCondition {@code (classes == null): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#iterator()}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
 * @utbot.executesCondition {@code (classes == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testConvertClassesToClassNames_ClassesEqualsNull() {
        List actual = ClassUtils.convertClassesToClassNames(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method convertClassesToClassNames(java.util.List)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames() {
        List list = emptyList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(list));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames1() {
        List list = emptyList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(list));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames2() {
        List list = emptyList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(list));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames3() {
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames4() {
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames5() {
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames6() {
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames7() {
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames8() {
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#convertClassesToClassNames(java.util.List)}
     */
    @Test
    public void testConvertClassesToClassNames9() {
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtils.convertClassesToClassNames(arrayList));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getAllSuperclasses
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllSuperclasses(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getAllSuperclasses(java.lang.Class)}
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
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getShortClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Class)}
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.Class)
    
    @Test
    public void testGetShortClassName1() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetShortClassName2() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetShortClassName3() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetShortClassName4() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getShortClassName(class1);
        
        String expected = "Object";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getShortClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Class)}
 * @utbot.returnsFrom {@code return getShortClassName(object.getClass());}
 *  */
    @Test
    public void testGetShortClassName_ObjectNotEqualsNull() {
        byte[] byteArray = {};
        
        String actual = ClassUtils.getShortClassName(byteArray, null);
        
        String expected = "byte[]";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return valueIfNull;}
 *  */
    @Test
    public void testGetShortClassName_ObjectEqualsNull() {
        String actual = ClassUtils.getShortClassName(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.Object, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString() {
        String actual = ClassUtils.getShortClassName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString1() {
        String actual = ClassUtils.getShortClassName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithEmptyString() {
        Object object = new Object();
        
        String actual = ClassUtils.getShortClassName(object, "");
        
        String expected = "Object";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString2() {
        String actual = ClassUtils.getShortClassName(null, "XZ");
        
        String expected = "XZ";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString3() {
        String actual = ClassUtils.getShortClassName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString4() {
        String actual = ClassUtils.getShortClassName(null, "XZ");
        
        String expected = "XZ";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString5() {
        String actual = ClassUtils.getShortClassName(null, "-3");
        
        String expected = "-3";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString6() {
        String actual = ClassUtils.getShortClassName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithBlankString() {
        String actual = ClassUtils.getShortClassName(null, "\n\r\t");
        
        String expected = "\n\r\t";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithBlankString1() {
        String actual = ClassUtils.getShortClassName(null, "\n\r\t");
        
        String expected = "\n\r\t";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getShortClassName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): True}
 *  */
    @Test
    public void testGetShortClassName_ClassNameEqualsNull() {
        String actual = ClassUtils.getShortClassName(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getShortClassName(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString7() {
        String actual = ClassUtils.getShortClassName("01");
        
        String expected = "01";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString8() {
        String actual = ClassUtils.getShortClassName("10");
        
        String expected = "10";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString9() {
        String actual = ClassUtils.getShortClassName("10\u0012");
        
        String expected = "10\u0012";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString10() {
        String actual = ClassUtils.getShortClassName("10\u0012");
        
        String expected = "10\u0012";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString11() {
        String actual = ClassUtils.getShortClassName("10");
        
        String expected = "10";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString12() {
        String actual = ClassUtils.getShortClassName("1_0");
        
        String expected = "1_0";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString13() {
        String actual = ClassUtils.getShortClassName("1_0");
        
        String expected = "1_0";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString14() {
        String actual = ClassUtils.getShortClassName("]");
        
        String expected = "]";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassNameWithNonEmptyString15() {
        String actual = ClassUtils.getShortClassName("](");
        
        String expected = "](";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getShortClassName(java.lang.String)}
     */
    @Test
    public void testGetShortClassName() {
        String actual = ClassUtils.getShortClassName(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getAllInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllInterfaces(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getAllInterfaces(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.invokes org.apache.commons.lang3.ClassUtils#getAllInterfaces(java.lang.Class,java.util.HashSet)
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getAllInterfaces(java.lang.Class)}
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
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getAllInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllInterfaces(java.lang.Class, java.util.HashSet)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getAllInterfaces(java.lang.Class,java.util.HashSet)}
 * @utbot.iterates iterate the loop {@code while(cls != null)} once
 *  */
    @Test
    public void testGetAllInterfaces_HashSetAdd() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class class1 = Object.class;
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getAllInterfaces(java.lang.Class,java.util.HashSet)}
 * @utbot.iterates iterate the loop {@code while(cls != null)} once
 *  */
    @Test
    public void testGetAllInterfaces_IterateWhileLoop() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class class1 = Object.class;
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getAllInterfaces(java.lang.Class,java.util.HashSet)}
 *  */
    @Test
    public void testGetAllInterfaces() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
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
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.addAbbreviation
    
    ///region Errors report for addAbbreviation
    
    public void testAddAbbreviation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.wrapperToPrimitive
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wrapperToPrimitive(java.lang.Class)
    
    @Test
    public void testWrapperToPrimitive1() {
        Class actual = ClassUtils.wrapperToPrimitive(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.primitiveToWrapper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method primitiveToWrapper(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitiveToWrapper(java.lang.Class)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#primitiveToWrapper(java.lang.Class)}
 * @utbot.executesCondition {@code (cls != null): False}
 * @utbot.returnsFrom {@code return convertedClass;}
 *  */
    @Test
    public void testPrimitiveToWrapper_ClsEqualsNull() {
        Class actual = ClassUtils.primitiveToWrapper(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method primitiveToWrapper(java.lang.Class)
    
    @Test
    public void testPrimitiveToWrapper1() {
        Class class1 = Object.class;
        
        Class actual = ClassUtils.primitiveToWrapper(class1);
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.toCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.StringUtils#deleteWhitespace(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#endsWith(java.lang.String)}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testToCanonicalName_ClassNameEndsWith() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = string;
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.StringUtils#deleteWhitespace(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: className == null
 *  */
    @Test
    public void testToCanonicalName_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.ClassUtils.toCanonicalName] produces [java.lang.NullPointerException: className must not be null.]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.ClassUtils.toCanonicalName(ClassUtils.java:1202) */
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toCanonicalName(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "XZb";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "XZb";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "ab";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "ba";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "ba";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "baC";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "baC";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "baC";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "baC";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "ba";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "ba";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "b\u0090a";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "b\u0090a";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "b\u0090a";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "b\u0090a";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString8() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "className must ot be null.";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "classNamemustotbenull.";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameWithNonEmptyString9() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method toCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("toCanonicalName", stringType);
        toCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] toCanonicalNameMethodArguments = new java.lang.Object[1];
        toCanonicalNameMethodArguments[0] = "classNa\uFFEBme must ot be null.";
        String actual = ((String) toCanonicalNameMethod.invoke(null, toCanonicalNameMethodArguments));
        
        String expected = "classNa\uFFEBmemustotbenull.";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method toCanonicalName(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toCanonicalName(java.lang.String)}
     */
    @Test
    public void testToCanonicalNameThrowsNPE() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.ClassUtils.toCanonicalName] produces [java.lang.NullPointerException: className must not be null.]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.ClassUtils.toCanonicalName(ClassUtils.java:1202) */
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
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
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getPublicMethod
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method getPublicMethod(java.lang.Class, java.lang.String, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPublicMethod(java.lang.Class,java.lang.String,java.lang.Class[])}
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPublicMethod(java.lang.Class, java.lang.String, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPublicMethod(java.lang.Class,java.lang.String,java.lang.Class[])}
 * @utbot.invokes {@link java.lang.Class#getMethod(java.lang.String,java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Method declaredMethod = cls.getMethod(methodName, parameterTypes);
 *  */
    @Test
    public void testGetPublicMethod_ThrowNullPointerException() throws NoSuchMethodException  {
        Class class1 = Object.class;
        
        /* This test fails because method [org.apache.commons.lang3.ClassUtils.getPublicMethod] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.Class.getMethod(Class.java:2219)
            org.apache.commons.lang3.ClassUtils.getPublicMethod(ClassUtils.java:1165) */
        ClassUtils.getPublicMethod(class1, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPublicMethod(java.lang.Class,java.lang.String,java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Method declaredMethod = cls.getMethod(methodName, parameterTypes);
 *  */
    @Test
    public void testGetPublicMethod_ThrowNullPointerException_1() throws NoSuchMethodException  {
        /* This test fails because method [org.apache.commons.lang3.ClassUtils.getPublicMethod] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.ClassUtils.getPublicMethod(ClassUtils.java:1165) */
        ClassUtils.getPublicMethod(null, null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getPublicMethod(java.lang.Class, java.lang.String, [Ljava.lang.Class;)
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod1() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = new java.lang.Class[1];
        classArray[0] = class1;
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod2() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = {null};
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod3() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = {null};
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod4() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod5() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod6() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = {null};
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod7() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = {null};
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod8() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = new java.lang.Class[17];
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod9() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    
    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod10() throws NoSuchMethodException  {
        Class class1 = Object.class;
        String string = "";
        java.lang.Class[] classArray = {null, null, null, null, null, null, null, null, null};
        
        ClassUtils.getPublicMethod(class1, string, classArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getClass
    
    ///region FUZZER: CHECKED EXCEPTIONS for method getClass(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString() throws ClassNotFoundException  {
        ClassUtils.getClass("ac");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString1() throws ClassNotFoundException  {
        ClassUtils.getClass("\u0014\n\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithEmptyString() throws ClassNotFoundException  {
        ClassUtils.getClass("");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString2() throws ClassNotFoundException  {
        ClassUtils.getClass("\r\t\u0014\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString3() throws ClassNotFoundException  {
        ClassUtils.getClass("\u0014\r\t\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString4() throws ClassNotFoundException  {
        ClassUtils.getClass("\u008A");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString5() throws ClassNotFoundException  {
        ClassUtils.getClass("-3");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString6() throws ClassNotFoundException  {
        ClassUtils.getClass("\u0014\t\r\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString7() throws ClassNotFoundException  {
        ClassUtils.getClass("abc");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString8() throws ClassNotFoundException  {
        ClassUtils.getClass("abc");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString9() throws ClassNotFoundException  {
        ClassUtils.getClass("ab5c");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getClass(java.lang.String)
    
    @Test
    public void testGetClass1() throws ClassNotFoundException  {
        /* This test fails because method [org.apache.commons.lang3.ClassUtils.getClass] produces [java.lang.NullPointerException: className must not be null.]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.ClassUtils.toCanonicalName(ClassUtils.java:1202)
            org.apache.commons.lang3.ClassUtils.getClass(ClassUtils.java:1069)
            org.apache.commons.lang3.ClassUtils.getClass(ClassUtils.java:1135)
            org.apache.commons.lang3.ClassUtils.getClass(ClassUtils.java:1118) */
        ClassUtils.getClass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getClass
    
    ///region FUZZER: CHECKED EXCEPTIONS for method getClass(java.lang.String, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString10() throws ClassNotFoundException  {
        ClassUtils.getClass("ab", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithBlankString() throws ClassNotFoundException  {
        ClassUtils.getClass("\n\t\r", false);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithBlankString1() throws ClassNotFoundException  {
        ClassUtils.getClass("\n\r", false);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithEmptyString1() throws ClassNotFoundException  {
        ClassUtils.getClass("", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString11() throws ClassNotFoundException  {
        ClassUtils.getClass("\u00A8", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString12() throws ClassNotFoundException  {
        ClassUtils.getClass("abc", false);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString13() throws ClassNotFoundException  {
        ClassUtils.getClass("abc", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString14() throws ClassNotFoundException  {
        ClassUtils.getClass("acb", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString15() throws ClassNotFoundException  {
        ClassUtils.getClass("acb", false);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString16() throws ClassNotFoundException  {
        ClassUtils.getClass("acb", false);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString17() throws ClassNotFoundException  {
        ClassUtils.getClass("ab", false);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getClass(java.lang.String, boolean)
    
    @Test(expected = ClassNotFoundException.class)
    public void testGetClass2() throws ClassNotFoundException  {
        String string = "";
        
        ClassUtils.getClass(string, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getClass
    
    ///region FUZZER: CHECKED EXCEPTIONS for method getClass(java.lang.ClassLoader, java.lang.String, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString18() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "cab", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString19() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "[", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString20() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "[", false);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString21() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "'\\#$\"", false);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString22() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "\\$'\"#", false);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString23() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "\\$'\"#", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString24() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "cab", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString25() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "cb", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString26() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "abc", true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString27() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "cab", false);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String,boolean)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString28() throws ClassNotFoundException  {
        ClassUtils.getClass(null, "cab", true);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getClass(java.lang.ClassLoader, java.lang.String, boolean)
    
    @Test
    public void testGetClass3() throws ClassNotFoundException  {
        /* This test fails because method [org.apache.commons.lang3.ClassUtils.getClass] produces [java.lang.NullPointerException: className must not be null.]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.ClassUtils.toCanonicalName(ClassUtils.java:1202)
            org.apache.commons.lang3.ClassUtils.getClass(ClassUtils.java:1069) */
        ClassUtils.getClass(null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getClass
    
    ///region FUZZER: CHECKED EXCEPTIONS for method getClass(java.lang.ClassLoader, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString29() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "\n\r\uFFDE\t");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString30() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "ZX");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString31() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "ZX");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithEmptyString2() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString32() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "XZ");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString33() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "ZX");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString34() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "XZ");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString35() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "-3");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithNonEmptyString36() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "ZX");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithBlankString2() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "\n\r\t");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getClass(java.lang.ClassLoader,java.lang.String)}
     */
    @Test(expected = ClassNotFoundException.class)
    public void testGetClassThrowsCNFEWithBlankString3() throws ClassNotFoundException  {
        ClassUtils.getClass(((ClassLoader) null), "\n\r\t");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getClass(java.lang.ClassLoader, java.lang.String)
    
    @Test
    public void testGetClass4() throws ClassNotFoundException  {
        /* This test fails because method [org.apache.commons.lang3.ClassUtils.getClass] produces [java.lang.NullPointerException: className must not be null.]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.ClassUtils.toCanonicalName(ClassUtils.java:1202)
            org.apache.commons.lang3.ClassUtils.getClass(ClassUtils.java:1069)
            org.apache.commons.lang3.ClassUtils.getClass(ClassUtils.java:1103) */
        ClassUtils.getClass(((ClassLoader) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.toClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toClass([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 *  */
    @Test
    public void testToClass_ArrayLengthNotEqualsZero() {
        java.lang.Object[] objectArray = {null};
        
        java.lang.Class[] actual = ClassUtils.toClass(objectArray);
        
        java.lang.Class[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToClass_ArrayEqualsNull() {
        java.lang.Class[] actual = ClassUtils.toClass(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toClass([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray1() {
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray2() {
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        
        java.lang.Class[] actual = ClassUtils.toClass(objectArray);
        
        java.lang.Class[] expected = new java.lang.Class[2];
        Class class1 = Object.class;
        expected[0] = class1;
        expected[1] = class1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray3() {
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray4() {
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray5() {
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray6() {
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray7() {
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray8() {
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#toClass(java.lang.Object[])}
     */
    @Test
    public void testToClassWithNonEmptyObjectArray9() {
        java.lang.Object[] objectArray = new java.lang.Object[4];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        Object object3 = new Object();
        objectArray[3] = object3;
        
        java.lang.Class[] actual = ClassUtils.toClass(objectArray);
        
        java.lang.Class[] expected = new java.lang.Class[4];
        Class class1 = Object.class;
        expected[0] = class1;
        expected[1] = class1;
        expected[2] = class1;
        expected[3] = class1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCanonicalName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): False}
 * @utbot.executesCondition {@code (dim < 1): True}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testGetCanonicalName_DimLessThan1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = string;
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetCanonicalName_ClassNameEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = ((Object) null);
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCanonicalName(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "XZb";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "XZb";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "ab";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "ab";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "ba";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "ba";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "baC";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "baC";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "baC";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "baC";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "ba";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "ba";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "b\u0090a";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "b\u0090a";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "b\u0090a";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "b\u0090a";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString8() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "[";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "[]";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalNameWithNonEmptyString9() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = "P[";
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        String expected = "P[";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getCanonicalName(java.lang.String)}
     */
    @Test
    public void testGetCanonicalName() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilsClazz = Class.forName("org.apache.commons.lang3.ClassUtils");
        Class stringType = Class.forName("java.lang.String");
        Method getCanonicalNameMethod = classUtilsClazz.getDeclaredMethod("getCanonicalName", stringType);
        getCanonicalNameMethod.setAccessible(true);
        java.lang.Object[] getCanonicalNameMethodArguments = new java.lang.Object[1];
        getCanonicalNameMethodArguments[0] = ((Object) null);
        String actual = ((String) getCanonicalNameMethod.invoke(null, getCanonicalNameMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getPackageName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
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
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.returnsFrom {@code return getPackageName(cls.getName());}
 *  */
    @Test
    public void testGetPackageName_ClsNotEqualsNull_1() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 *  */
    @Test
    public void testGetPackageName_ClsNotEqualsNull_2() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.returnsFrom {@code return getPackageName(cls.getName());}
 *  */
    @Test
    public void testGetPackageName_ClsNotEqualsNull_3() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.returnsFrom {@code return getPackageName(cls.getName());}
 *  */
    @Test
    public void testGetPackageName_ClsNotEqualsNull_4() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.returnsFrom {@code return getPackageName(cls.getName());}
 *  */
    @Test
    public void testGetPackageName_ClsNotEqualsNull_5() {
        Class class1 = Object.class;
        
        String actual = ClassUtils.getPackageName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Class)}
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
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getPackageName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageName(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Class)}
 * @utbot.returnsFrom {@code return getPackageName(object.getClass());}
 *  */
    @Test
    public void testGetPackageName_ObjectNotEqualsNull() {
        byte[] byteArray = {};
        
        String actual = ClassUtils.getPackageName(byteArray, null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return valueIfNull;}
 *  */
    @Test
    public void testGetPackageName_ObjectEqualsNull() {
        String actual = ClassUtils.getPackageName(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPackageName(java.lang.Object, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString() {
        String actual = ClassUtils.getPackageName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString1() {
        String actual = ClassUtils.getPackageName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithEmptyString() {
        Object object = new Object();
        
        String actual = ClassUtils.getPackageName(object, "");
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString2() {
        String actual = ClassUtils.getPackageName(null, "XZ");
        
        String expected = "XZ";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString3() {
        String actual = ClassUtils.getPackageName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString4() {
        String actual = ClassUtils.getPackageName(null, "XZ");
        
        String expected = "XZ";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString5() {
        String actual = ClassUtils.getPackageName(null, "-3");
        
        String expected = "-3";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString6() {
        String actual = ClassUtils.getPackageName(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithBlankString() {
        String actual = ClassUtils.getPackageName(null, "\n\r\t");
        
        String expected = "\n\r\t";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithBlankString1() {
        String actual = ClassUtils.getPackageName(null, "\n\r\t");
        
        String expected = "\n\r\t";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ClassUtils.getPackageName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): True}
 *  */
    @Test
    public void testGetPackageName_ClassNameEqualsNull() {
        String actual = ClassUtils.getPackageName(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPackageName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
 * @utbot.executesCondition {@code (className == null): False}
 * @utbot.executesCondition {@code (className.length() == 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.iterates iterate the loop {@code while(className.charAt(0) == '[')} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: while(className.charAt(0) == '[')
 *  */
    @Test
    public void testGetPackageName_ThrowStringIndexOutOfBoundsException() {
        String string = "[";
        
        /* This test fails because method [org.apache.commons.lang3.ClassUtils.getPackageName] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.lang3.ClassUtils.getPackageName(ClassUtils.java:415) */
        ClassUtils.getPackageName(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPackageName(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString7() {
        String actual = ClassUtils.getPackageName("\u0014\n\t\r");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithEmptyString1() {
        String actual = ClassUtils.getPackageName("");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString8() {
        String actual = ClassUtils.getPackageName("\r\t\u0014\n");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString9() {
        String actual = ClassUtils.getPackageName("\u0014\r\t\n");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString10() {
        String actual = ClassUtils.getPackageName("\u008A");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString11() {
        String actual = ClassUtils.getPackageName("-3");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString12() {
        String actual = ClassUtils.getPackageName("\u0014\t\r\n");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString13() {
        String actual = ClassUtils.getPackageName("abc");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString14() {
        String actual = ClassUtils.getPackageName("abc");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ClassUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ClassUtils#getPackageName(java.lang.String)}
     */
    @Test
    public void testGetPackageNameWithNonEmptyString15() {
        String actual = ClassUtils.getPackageName("ab5c");
        
        String expected = "";
        
        assertEquals(expected, actual);
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
    ///endregion
}

