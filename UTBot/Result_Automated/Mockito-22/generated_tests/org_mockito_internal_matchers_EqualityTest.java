package org.mockito.internal.matchers;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_mockito_internal_matchers_EqualityTest {
    ///region Test suites for executable org.mockito.internal.matchers.Equality.areEqual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method areEqual(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return isArray(o2) && areArraysEqual(o1, o2);}
 *  */
    @Test
    public void testAreEqual_IsArrayAndAreArraysEqual() {
        int[] intArray = {};
        
        boolean actual = Equality.areEqual(intArray, intArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return isArray(o2) && areArraysEqual(o1, o2);}
 *  */
    @Test
    public void testAreEqual_ReturnIsArrayAndAreArraysEqual() {
        int[] intArray = {};
        
        boolean actual = Equality.areEqual(intArray, intArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return isArray(o2) && areArraysEqual(o1, o2);}
 *  */
    @Test
    public void testAreEqual_ReturnIsArrayAndAreArraysEqual_1() {
        byte[] byteArray = {};
        
        boolean actual = Equality.areEqual(byteArray, byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (o1 == null): False}
 * @utbot.executesCondition {@code (o2 == null): False}
 * @utbot.executesCondition {@code (isArray(o1)): False}
 * @utbot.returnsFrom {@code return o1.equals(o2);}
 *  */
    @Test
    public void testAreEqual_NotIsArray() {
        Long long1 = 0L;
        short[] shortArray = {};
        
        boolean actual = Equality.areEqual(long1, shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (o1 == null): False}
 * @utbot.executesCondition {@code (o2 == null): True}
 * @utbot.returnsFrom {@code return o1 == null && o2 == null;}
 *  */
    @Test
    public void testAreEqual_O1NotEqualsNullAndO2NotEqualsNull() {
        byte[] byteArray = {};
        
        boolean actual = Equality.areEqual(byteArray, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (o1 == null): True}
 * @utbot.returnsFrom {@code return o1 == null && o2 == null;}
 *  */
    @Test
    public void testAreEqual_O1NotEqualsNullAndO2NotEqualsNull_1() {
        byte[] byteArray = {};
        
        boolean actual = Equality.areEqual(null, byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (o1 == null): False}
 * @utbot.executesCondition {@code (o2 == null): False}
 * @utbot.executesCondition {@code (isArray(o1)): False}
 * @utbot.returnsFrom {@code return o1.equals(o2);}
 *  */
    @Test
    public void testAreEqual_NotIsArray_1() {
        Integer integer = 0;
        short[] shortArray = {};
        
        boolean actual = Equality.areEqual(integer, shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (o1 == null): False}
 * @utbot.executesCondition {@code (o2 == null): False}
 * @utbot.executesCondition {@code (isArray(o1)): False}
 * @utbot.returnsFrom {@code return o1.equals(o2);}
 *  */
    @Test
    public void testAreEqual_NotIsArray_2() {
        Character character = '\u0000';
        short[] shortArray = {};
        
        boolean actual = Equality.areEqual(character, shortArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method areEqual(java.lang.Object, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (o1 == null): False},
    ///     {@code (o2 == null): False}
    /// invoke:
    ///     {@link org.mockito.internal.matchers.Equality#isArray(java.lang.Object)} once
    /// execute conditions:
    ///     {@code (isArray(o1)): True}
    /// return from: {@code return isArray(o2) && areArraysEqual(o1, o2);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return isArray(o2) && areArraysEqual(o1, o2);}
 *  */
    @Test
    public void testAreEqual_IsArrayAndAreArraysEqual_1() {
        int[] intArray = {};
        byte[] byteArray = {};
        
        boolean actual = Equality.areEqual(intArray, byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return isArray(o2) && areArraysEqual(o1, o2);}
 *  */
    @Test
    public void testAreEqual_IsArrayAndAreArraysEqual_2() {
        int[] intArray = {};
        
        boolean actual = Equality.areEqual(intArray, intArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return isArray(o2) && areArraysEqual(o1, o2);}
 *  */
    @Test
    public void testAreEqual_IsArrayAndAreArraysEqual_3() {
        int[] intArray = {};
        
        boolean actual = Equality.areEqual(intArray, intArray);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.matchers.Equality.isArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isArray(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#isArray(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Class#isArray()}
 * @utbot.returnsFrom {@code return o.getClass().isArray();}
 *  */
    @Test
    public void testIsArray_ClassIsArray() {
        byte[] byteArray = {};
        
        boolean actual = Equality.isArray(byteArray);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isArray(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#isArray(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return o.getClass().isArray();
 *  */
    @Test
    public void testIsArray_ThrowNullPointerException() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.isArray] produces [java.lang.NullPointerException]
            org.mockito.internal.matchers.Equality.isArray(Equality.java:42) */
        Equality.isArray(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isArray(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Equality}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#isArray(java.lang.Object)}
     */
    @Test
    public void testIsArrayThrowsNPE() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.isArray] produces [java.lang.NullPointerException]
            org.mockito.internal.matchers.Equality.isArray(Equality.java:42) */
        Equality.isArray(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.matchers.Equality.areArrayLengthsEqual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method areArrayLengthsEqual(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayLengthsEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return Array.getLength(o1) == Array.getLength(o2);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Array.getLength(o1) == Array.getLength(o2);
 *  */
    @Test
    public void testAreArrayLengthsEqual_ThrowNullPointerException() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayLengthsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29) */
        Equality.areArrayLengthsEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayLengthsEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return Array.getLength(o1) == Array.getLength(o2);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Array.getLength(o1) == Array.getLength(o2);
 *  */
    @Test
    public void testAreArrayLengthsEqual_ThrowNullPointerException_1() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayLengthsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29) */
        Equality.areArrayLengthsEqual(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method areArrayLengthsEqual(java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Equality}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayLengthsEqual(java.lang.Object,java.lang.Object)}
     */
    @Test
    public void testAreArrayLengthsEqualThrowsNPE() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayLengthsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29) */
        Equality.areArrayLengthsEqual(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.matchers.Equality.areArrayElementsEqual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method areArrayElementsEqual(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayElementsEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return true;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return true;
 *  */
    @Test
    public void testAreArrayElementsEqual_ThrowNullPointerException() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayElementsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayElementsEqual(Equality.java:33) */
        Equality.areArrayElementsEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayElementsEqual(java.lang.Object,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < Array.getLength(o1); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testAreArrayElementsEqual_ThrowNullPointerException_1() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayElementsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayElementsEqual(Equality.java:33) */
        Equality.areArrayElementsEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayElementsEqual(java.lang.Object,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < Array.getLength(o1); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testAreArrayElementsEqual_ThrowNullPointerException_2() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayElementsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayElementsEqual(Equality.java:33) */
        Equality.areArrayElementsEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayElementsEqual(java.lang.Object,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < Array.getLength(o1); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testAreArrayElementsEqual_ThrowNullPointerException_3() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayElementsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayElementsEqual(Equality.java:33) */
        Equality.areArrayElementsEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayElementsEqual(java.lang.Object,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < Array.getLength(o1); i++)} once
 * @utbot.returnsFrom {@code return true;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return true;
 *  */
    @Test
    public void testAreArrayElementsEqual_ThrowNullPointerException_4() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayElementsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayElementsEqual(Equality.java:33) */
        Equality.areArrayElementsEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayElementsEqual(java.lang.Object,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < Array.getLength(o1); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testAreArrayElementsEqual_ThrowNullPointerException_5() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayElementsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayElementsEqual(Equality.java:33) */
        Equality.areArrayElementsEqual(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method areArrayElementsEqual(java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Equality}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArrayElementsEqual(java.lang.Object,java.lang.Object)}
     */
    @Test
    public void testAreArrayElementsEqualThrowsNPE() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArrayElementsEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayElementsEqual(Equality.java:33) */
        Equality.areArrayElementsEqual(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.matchers.Equality.areArraysEqual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method areArraysEqual(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArraysEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);
 *  */
    @Test
    public void testAreArraysEqual_ThrowNullPointerException() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArraysEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29)
            org.mockito.internal.matchers.Equality.areArraysEqual(Equality.java:25) */
        Equality.areArraysEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArraysEqual(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (areArrayElementsEqual(o1, o2)): True}
 * @utbot.returnsFrom {@code return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);
 *  */
    @Test
    public void testAreArraysEqual_ThrowNullPointerException_1() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArraysEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29)
            org.mockito.internal.matchers.Equality.areArraysEqual(Equality.java:25) */
        Equality.areArraysEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArraysEqual(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (areArrayElementsEqual(o1, o2)): False}
 * @utbot.returnsFrom {@code return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);
 *  */
    @Test
    public void testAreArraysEqual_ThrowNullPointerException_2() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArraysEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29)
            org.mockito.internal.matchers.Equality.areArraysEqual(Equality.java:25) */
        Equality.areArraysEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArraysEqual(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (areArrayElementsEqual(o1, o2)): False}
 * @utbot.returnsFrom {@code return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);
 *  */
    @Test
    public void testAreArraysEqual_ThrowNullPointerException_3() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArraysEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29)
            org.mockito.internal.matchers.Equality.areArraysEqual(Equality.java:25) */
        Equality.areArraysEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArraysEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);
 *  */
    @Test
    public void testAreArraysEqual_ThrowNullPointerException_4() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArraysEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29)
            org.mockito.internal.matchers.Equality.areArraysEqual(Equality.java:25) */
        Equality.areArraysEqual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Equality}
 * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArraysEqual(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return areArrayLengthsEqual(o1, o2) && areArrayElementsEqual(o1, o2);
 *  */
    @Test
    public void testAreArraysEqual_ThrowNullPointerException_5() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArraysEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29)
            org.mockito.internal.matchers.Equality.areArraysEqual(Equality.java:25) */
        Equality.areArraysEqual(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method areArraysEqual(java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.matchers.Equality}
     * @utbot.methodUnderTest {@link org.mockito.internal.matchers.Equality#areArraysEqual(java.lang.Object,java.lang.Object)}
     */
    @Test
    public void testAreArraysEqualThrowsNPE() {
        /* This test fails because method [org.mockito.internal.matchers.Equality.areArraysEqual] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.mockito.internal.matchers.Equality.areArrayLengthsEqual(Equality.java:29)
            org.mockito.internal.matchers.Equality.areArraysEqual(Equality.java:25) */
        Equality.areArraysEqual(null, null);
    }
    ///endregion
    
    ///endregion
}

