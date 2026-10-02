package org.apache.commons.lang3;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_lang3_ArrayUtilsTest {
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.removeElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeElement([F, float)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(float[],float)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone() {
        float[] floatArray = {};
        
        float[] actual = ArrayUtils.removeElement(floatArray, java.lang.Float.NaN);
        
        float[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(float[],float)}
 *  */
    @Test
    public void testRemoveElement() {
        float[] floatArray = {3.787689E-29f};
        
        float[] actual = ArrayUtils.removeElement(floatArray, 3.787689E-29f);
        
        float[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(float[],float)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_1() {
        float[] floatArray = {3.59E-43f};
        
        float[] actual = ArrayUtils.removeElement(floatArray, 1.1755325E-38f);
        
        float[] expected = {3.59E-43f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(float[],float)}
 *  */
    @Test
    public void testRemoveElement_1() {
        float[] floatArray = {9.403991E-38f};
        
        float[] actual = ArrayUtils.removeElement(floatArray, 9.403991E-38f);
        
        float[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(float[],float)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_2() {
        float[] actual = ArrayUtils.removeElement(((float[]) null), java.lang.Float.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeElement([F, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(float[],float)}
     */
    @Test
    public void testRemoveElementWithNonEmptyPrimitiveArray() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float[] actual = ArrayUtils.removeElement(floatArray, 1.3292282E36f);
        
        float[] expected = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeElement([F, float)
    
    @Test
    public void testRemoveElement1() {
        float[] floatArray = {
            -2.350989E-38f, 2.350989E-38f, -2.350989E-38f, -1.17549435E-38f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f, 0.0f
        };
        
        float[] actual = ArrayUtils.removeElement(floatArray, -1.17549435E-38f);
        
        float[] expected = {
            -2.350989E-38f, 2.350989E-38f, -2.350989E-38f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testRemoveElement2() {
        float[] floatArray = {
            2.3304847E-25f, 3.9586747E13f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f, 0.0f
        };
        
        float[] actual = ArrayUtils.removeElement(floatArray, 3.9586747E13f);
        
        float[] expected = {
            2.3304847E-25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testRemoveElement3() {
        float[] floatArray = {
            java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN,
            java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN
        };
        
        float[] actual = ArrayUtils.removeElement(floatArray, java.lang.Float.NaN);
        
        float[] expected = {
            java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN,
            java.lang.Float.NaN, java.lang.Float.NaN, java.lang.Float.NaN
        };
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testRemoveElement4() {
        float[] floatArray = {
            5.792838E-34f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f, 0.0f
        };
        
        float[] actual = ArrayUtils.removeElement(floatArray, 5.792838E-34f);
        
        float[] expected = {
            0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
            0.0f, 0.0f, 0.0f
        };
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.removeElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeElement([Ljava.lang.Object;, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone1() {
        java.lang.Object[] objectArray = {};
        byte[] byteArray = {};
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, byteArray);
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_11() {
        java.lang.Object[] objectArray = {};
        byte[] byteArray = {};
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, byteArray);
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_21() {
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, ((Object) null));
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_3() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        ArrayUtils arrayUtils = new ArrayUtils();
        objectArray[0] = ((Object) arrayUtils);
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, ((Object) null));
        
        java.lang.Object[] expected = new java.lang.Object[1];
        expected[0] = ((Object) arrayUtils);
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeElement([Ljava.lang.Object;, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(java.lang.Object[],java.lang.Object)}
     */
    @Test
    public void testRemoveElementWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        Object object3 = new Object();
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, object3);
        
        java.lang.Object[] expected = new java.lang.Object[3];
        expected[0] = object;
        expected[1] = object1;
        expected[2] = object2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeElement([Ljava.lang.Object;, java.lang.Object)
    
    @Test
    public void testRemoveElement5() {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        Integer integer = 0;
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, ((Object) integer));
        
        java.lang.Object[] expected = {null, null, null, null, null, null, null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testRemoveElement6() {
        java.lang.Object[] objectArray = new java.lang.Object[10];
        Object object = new Object();
        objectArray[0] = object;
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, ((Object) null));
        
        java.lang.Object[] expected = new java.lang.Object[9];
        expected[0] = object;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testRemoveElement7() {
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        Integer integer1 = 0;
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, ((Object) integer1));
        
        java.lang.Object[] expected = {null, null, null, null, null, null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testRemoveElement8() {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, ((Object) null));
        
        java.lang.Object[] expected = {null, null, null, null, null, null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testRemoveElement9() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        Integer integer = 0;
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, ((Object) integer));
        
        java.lang.Object[] expected = new java.lang.Object[1];
        expected[0] = object;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testRemoveElement10() {
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        
        java.lang.Object[] actual = ArrayUtils.removeElement(objectArray, ((Object) null));
        
        java.lang.Object[] expected = new java.lang.Object[8];
        expected[0] = object;
        expected[1] = object;
        expected[2] = object;
        expected[3] = object;
        expected[4] = object;
        expected[5] = object;
        expected[6] = object;
        expected[7] = object;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testRemoveElement11() {
        Object object = new Object();
        
        java.lang.Object[] actual = ArrayUtils.removeElement(((java.lang.Object[]) null), object);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.removeElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeElement([C, char)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(char[],char)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone2() {
        char[] charArray = {};
        
        char[] actual = ArrayUtils.removeElement(charArray, ' ');
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(char[],char)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_12() {
        char[] charArray = {' '};
        
        char[] actual = ArrayUtils.removeElement(charArray, '!');
        
        char[] expected = {' '};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(char[],char)}
 *  */
    @Test
    public void testRemoveElement12() {
        char[] charArray = {' '};
        
        char[] actual = ArrayUtils.removeElement(charArray, ' ');
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(char[],char)}
 *  */
    @Test
    public void testRemoveElement_11() {
        char[] charArray = {' '};
        
        char[] actual = ArrayUtils.removeElement(charArray, ' ');
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(char[],char)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_22() {
        char[] actual = ArrayUtils.removeElement(((char[]) null), ' ');
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeElement([C, char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(char[],char)}
     */
    @Test
    public void testRemoveElementWithNonEmptyPrimitiveArrayAndCornerCase() {
        char[] charArray = {'\u0000', '', '?'};
        
        char[] actual = ArrayUtils.removeElement(charArray, '\u0000');
        
        char[] expected = {'', '?'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeElement([C, char)
    
    @Test
    public void testRemoveElement13() {
        char[] charArray = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        
        char[] actual = ArrayUtils.removeElement(charArray, '\u0000');
        
        char[] expected = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement14() {
        char[] charArray = new char[14];
        charArray[0] = '\u0001';
        charArray[1] = '\u0001';
        charArray[2] = '\u0001';
        charArray[3] = '\u0001';
        charArray[4] = '\u0001';
        charArray[6] = '\u0001';
        charArray[7] = '\u0001';
        charArray[8] = '\u0001';
        charArray[9] = '\u0001';
        charArray[10] = '\u0001';
        charArray[11] = '\u0001';
        charArray[12] = '\u0001';
        charArray[13] = '\u0001';
        
        char[] actual = ArrayUtils.removeElement(charArray, '\u0000');
        
        char[] expected = new char[13];
        expected[0] = '\u0001';
        expected[1] = '\u0001';
        expected[2] = '\u0001';
        expected[3] = '\u0001';
        expected[4] = '\u0001';
        expected[5] = '\u0001';
        expected[6] = '\u0001';
        expected[7] = '\u0001';
        expected[8] = '\u0001';
        expected[9] = '\u0001';
        expected[10] = '\u0001';
        expected[11] = '\u0001';
        expected[12] = '\u0001';
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement15() {
        char[] charArray = new char[11];
        charArray[0] = '\u0001';
        charArray[1] = '\u0001';
        
        char[] actual = ArrayUtils.removeElement(charArray, '\u0000');
        
        char[] expected = {
            '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement16() {
        char[] charArray = {
            '\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        char[] actual = ArrayUtils.removeElement(charArray, '\u0000');
        
        char[] expected = {'\u0001', '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement17() {
        char[] charArray = new char[11];
        charArray[0] = '\u0001';
        charArray[1] = '\u0001';
        
        char[] actual = ArrayUtils.removeElement(charArray, '\u0000');
        
        char[] expected = {
            '\u0001', '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement18() {
        char[] charArray = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        
        char[] actual = ArrayUtils.removeElement(charArray, '\u0000');
        
        char[] expected = {
            '\u0001', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.removeElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeElement([B, byte)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(byte[],byte)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone3() {
        byte[] byteArray = {};
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) -127);
        
        byte[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(byte[],byte)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_13() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) -126);
        
        byte[] expected = {(byte) -127};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(byte[],byte)}
 *  */
    @Test
    public void testRemoveElement19() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) -127);
        
        byte[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(byte[],byte)}
 *  */
    @Test
    public void testRemoveElement_12() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) -127);
        
        byte[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(byte[],byte)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_23() {
        byte[] actual = ArrayUtils.removeElement(((byte[]) null), (byte) -127);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeElement([B, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(byte[],byte)}
     */
    @Test
    public void testRemoveElementWithNonEmptyPrimitiveArrayAndCornerCase1() {
        byte[] byteArray = {(byte) 0, (byte) -1, java.lang.Byte.MAX_VALUE};
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) 0);
        
        byte[] expected = {(byte) -1, java.lang.Byte.MAX_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeElement([B, byte)
    
    @Test
    public void testRemoveElement20() {
        byte[] byteArray = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) 0);
        
        byte[] expected = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement21() {
        byte[] byteArray = new byte[11];
        byteArray[0] = java.lang.Byte.MIN_VALUE;
        byteArray[1] = java.lang.Byte.MIN_VALUE;
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) 0);
        
        byte[] expected = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement22() {
        byte[] byteArray = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) 0);
        
        byte[] expected = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement23() {
        byte[] byteArray = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) 0);
        
        byte[] expected = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement24() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        byte[] actual = ArrayUtils.removeElement(byteArray, java.lang.Byte.MIN_VALUE);
        
        byte[] expected = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement25() {
        byte[] byteArray = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        byte[] actual = ArrayUtils.removeElement(byteArray, (byte) 0);
        
        byte[] expected = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.removeElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeElement([Z, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(boolean[],boolean)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone4() {
        boolean[] booleanArray = {};
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, false);
        
        boolean[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(boolean[],boolean)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_14() {
        boolean[] booleanArray = {false};
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, true);
        
        boolean[] expected = {false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(boolean[],boolean)}
 *  */
    @Test
    public void testRemoveElement26() {
        boolean[] booleanArray = {false};
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, false);
        
        boolean[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(boolean[],boolean)}
 *  */
    @Test
    public void testRemoveElement_13() {
        boolean[] booleanArray = {false};
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, false);
        
        boolean[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(boolean[],boolean)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_24() {
        boolean[] actual = ArrayUtils.removeElement(((boolean[]) null), false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeElement([Z, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(boolean[],boolean)}
     */
    @Test
    public void testRemoveElementWithNonEmptyPrimitiveArray1() {
        boolean[] booleanArray = {false, true, true};
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, false);
        
        boolean[] expected = {true, true};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeElement([Z, boolean)
    
    @Test
    public void testRemoveElement27() {
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, true);
        
        boolean[] expected = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement28() {
        boolean[] booleanArray = {
            true, true, true, false, true, true,
            true, true, true
        };
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, false);
        
        boolean[] expected = {
            true, true, true, true, true, true,
            true, true
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement29() {
        boolean[] booleanArray = new boolean[11];
        booleanArray[0] = true;
        booleanArray[1] = true;
        booleanArray[3] = true;
        booleanArray[4] = true;
        booleanArray[5] = true;
        booleanArray[6] = true;
        booleanArray[7] = true;
        booleanArray[8] = true;
        booleanArray[9] = true;
        booleanArray[10] = true;
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, false);
        
        boolean[] expected = {
            true, true, true, true, true, true,
            true, true, true, true
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement30() {
        boolean[] booleanArray = {
            true, true, true, false, false, false,
            false, false, false
        };
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, false);
        
        boolean[] expected = {
            true, true, true, false, false, false,
            false, false
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement31() {
        boolean[] booleanArray = new boolean[11];
        booleanArray[0] = true;
        booleanArray[1] = true;
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, false);
        
        boolean[] expected = {
            true, true, false, false, false, false,
            false, false, false, false
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement32() {
        boolean[] booleanArray = {
            true, false, true, true, true, true,
            true, true, true, true
        };
        
        boolean[] actual = ArrayUtils.removeElement(booleanArray, false);
        
        boolean[] expected = {
            true, true, true, true, true, true,
            true, true, true
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.removeElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeElement([D, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(double[],double)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone5() {
        double[] doubleArray = {};
        
        double[] actual = ArrayUtils.removeElement(doubleArray, java.lang.Double.NaN);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(double[],double)}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#remove(double[],int)}
 *  */
    @Test
    public void testRemoveElement_ArrayUtilsRemove() {
        double[] doubleArray = {8.852647461097807E-221};
        
        double[] actual = ArrayUtils.removeElement(doubleArray, 8.852647461097807E-221);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(double[],double)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_15() {
        double[] doubleArray = {1.5111572745182905E23};
        
        double[] actual = ArrayUtils.removeElement(doubleArray, -2.7491146137600024E11);
        
        double[] expected = {1.5111572745182905E23};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(double[],double)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_25() {
        double[] actual = ArrayUtils.removeElement(((double[]) null), java.lang.Double.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeElement([D, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(double[],double)}
     */
    @Test
    public void testRemoveElementWithNonEmptyPrimitiveArray2() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        double[] actual = ArrayUtils.removeElement(doubleArray, 1.1235582092889477E307);
        
        double[] expected = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeElement([D, double)
    
    @Test
    public void testRemoveElement33() {
        double[] doubleArray = {
            2.080357E-317, 2.2250738605795894E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        double[] actual = ArrayUtils.removeElement(doubleArray, 2.2250738605795894E-308);
        
        double[] expected = {
            2.080357E-317, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void testRemoveElement34() {
        double[] doubleArray = {
            1.7306072151666486E-77, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        double[] actual = ArrayUtils.removeElement(doubleArray, 1.7306072151666486E-77);
        
        double[] expected = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void testRemoveElement35() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        double[] actual = ArrayUtils.removeElement(doubleArray, java.lang.Double.NaN);
        
        double[] expected = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.removeElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeElement([S, short)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(short[],short)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone6() {
        short[] shortArray = {};
        
        short[] actual = ArrayUtils.removeElement(shortArray, (short) -255);
        
        short[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(short[],short)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_16() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.removeElement(shortArray, (short) -254);
        
        short[] expected = {(short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(short[],short)}
 *  */
    @Test
    public void testRemoveElement36() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.removeElement(shortArray, (short) -255);
        
        short[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(short[],short)}
 *  */
    @Test
    public void testRemoveElement_14() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.removeElement(shortArray, (short) -255);
        
        short[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(short[],short)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_26() {
        short[] actual = ArrayUtils.removeElement(((short[]) null), (short) -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeElement([S, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(short[],short)}
     */
    @Test
    public void testRemoveElementWithNonEmptyPrimitiveArrayAndCornerCase2() {
        short[] shortArray = {(short) 0, (short) -1, java.lang.Short.MAX_VALUE};
        
        short[] actual = ArrayUtils.removeElement(shortArray, (short) 0);
        
        short[] expected = {(short) -1, java.lang.Short.MAX_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeElement([S, short)
    
    @Test
    public void testRemoveElement37() {
        short[] shortArray = new short[11];
        shortArray[0] = java.lang.Short.MIN_VALUE;
        shortArray[1] = java.lang.Short.MIN_VALUE;
        
        short[] actual = ArrayUtils.removeElement(shortArray, (short) 0);
        
        short[] expected = {
            java.lang.Short.MIN_VALUE, java.lang.Short.MIN_VALUE, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0, (short) 0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement38() {
        short[] shortArray = new short[13];
        shortArray[0] = java.lang.Short.MIN_VALUE;
        shortArray[1] = java.lang.Short.MIN_VALUE;
        shortArray[2] = java.lang.Short.MIN_VALUE;
        shortArray[3] = java.lang.Short.MIN_VALUE;
        shortArray[5] = java.lang.Short.MIN_VALUE;
        shortArray[6] = java.lang.Short.MIN_VALUE;
        shortArray[7] = java.lang.Short.MIN_VALUE;
        shortArray[8] = java.lang.Short.MIN_VALUE;
        shortArray[9] = java.lang.Short.MIN_VALUE;
        shortArray[10] = java.lang.Short.MIN_VALUE;
        shortArray[11] = java.lang.Short.MIN_VALUE;
        shortArray[12] = java.lang.Short.MIN_VALUE;
        
        short[] actual = ArrayUtils.removeElement(shortArray, (short) 0);
        
        short[] expected = new short[12];
        expected[0] = java.lang.Short.MIN_VALUE;
        expected[1] = java.lang.Short.MIN_VALUE;
        expected[2] = java.lang.Short.MIN_VALUE;
        expected[3] = java.lang.Short.MIN_VALUE;
        expected[4] = java.lang.Short.MIN_VALUE;
        expected[5] = java.lang.Short.MIN_VALUE;
        expected[6] = java.lang.Short.MIN_VALUE;
        expected[7] = java.lang.Short.MIN_VALUE;
        expected[8] = java.lang.Short.MIN_VALUE;
        expected[9] = java.lang.Short.MIN_VALUE;
        expected[10] = java.lang.Short.MIN_VALUE;
        expected[11] = java.lang.Short.MIN_VALUE;
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement39() {
        short[] shortArray = {
            java.lang.Short.MIN_VALUE, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0, (short) 0
        };
        
        short[] actual = ArrayUtils.removeElement(shortArray, (short) 0);
        
        short[] expected = {
            java.lang.Short.MIN_VALUE, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement40() {
        short[] shortArray = {
            java.lang.Short.MIN_VALUE, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0, (short) 0
        };
        
        short[] actual = ArrayUtils.removeElement(shortArray, (short) 0);
        
        short[] expected = {
            java.lang.Short.MIN_VALUE, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement41() {
        short[] shortArray = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        short[] actual = ArrayUtils.removeElement(shortArray, java.lang.Short.MIN_VALUE);
        
        short[] expected = {
            (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0,
            (short) 0, (short) 0, (short) 0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.removeElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeElement([J, long)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(long[],long)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone7() {
        long[] longArray = {};
        
        long[] actual = ArrayUtils.removeElement(longArray, -255L);
        
        long[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(long[],long)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_17() {
        long[] longArray = {-255L};
        
        long[] actual = ArrayUtils.removeElement(longArray, -253L);
        
        long[] expected = {-255L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(long[],long)}
 *  */
    @Test
    public void testRemoveElement42() {
        long[] longArray = {-255L};
        
        long[] actual = ArrayUtils.removeElement(longArray, -255L);
        
        long[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(long[],long)}
 *  */
    @Test
    public void testRemoveElement_15() {
        long[] longArray = {-255L};
        
        long[] actual = ArrayUtils.removeElement(longArray, -255L);
        
        long[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(long[],long)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_27() {
        long[] actual = ArrayUtils.removeElement(((long[]) null), -255L);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeElement([J, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(long[],long)}
     */
    @Test
    public void testRemoveElementWithNonEmptyPrimitiveArrayAndCornerCase3() {
        long[] longArray = {0L, -1L, java.lang.Long.MAX_VALUE};
        
        long[] actual = ArrayUtils.removeElement(longArray, 0L);
        
        long[] expected = {-1L, java.lang.Long.MAX_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeElement([J, long)
    
    @Test
    public void testRemoveElement43() {
        long[] longArray = new long[11];
        longArray[0] = java.lang.Long.MIN_VALUE;
        longArray[1] = java.lang.Long.MIN_VALUE;
        
        long[] actual = ArrayUtils.removeElement(longArray, 0L);
        
        long[] expected = {
            java.lang.Long.MIN_VALUE, java.lang.Long.MIN_VALUE, 0L, 0L, 0L, 0L, 0L, 0L,
            0L, 0L
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement44() {
        long[] longArray = new long[13];
        longArray[0] = java.lang.Long.MIN_VALUE;
        longArray[1] = java.lang.Long.MIN_VALUE;
        longArray[2] = java.lang.Long.MIN_VALUE;
        longArray[3] = java.lang.Long.MIN_VALUE;
        longArray[5] = java.lang.Long.MIN_VALUE;
        longArray[6] = java.lang.Long.MIN_VALUE;
        longArray[7] = java.lang.Long.MIN_VALUE;
        longArray[8] = java.lang.Long.MIN_VALUE;
        longArray[9] = java.lang.Long.MIN_VALUE;
        longArray[10] = java.lang.Long.MIN_VALUE;
        longArray[11] = java.lang.Long.MIN_VALUE;
        longArray[12] = java.lang.Long.MIN_VALUE;
        
        long[] actual = ArrayUtils.removeElement(longArray, 0L);
        
        long[] expected = new long[12];
        expected[0] = java.lang.Long.MIN_VALUE;
        expected[1] = java.lang.Long.MIN_VALUE;
        expected[2] = java.lang.Long.MIN_VALUE;
        expected[3] = java.lang.Long.MIN_VALUE;
        expected[4] = java.lang.Long.MIN_VALUE;
        expected[5] = java.lang.Long.MIN_VALUE;
        expected[6] = java.lang.Long.MIN_VALUE;
        expected[7] = java.lang.Long.MIN_VALUE;
        expected[8] = java.lang.Long.MIN_VALUE;
        expected[9] = java.lang.Long.MIN_VALUE;
        expected[10] = java.lang.Long.MIN_VALUE;
        expected[11] = java.lang.Long.MIN_VALUE;
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement45() {
        long[] longArray = new long[11];
        longArray[0] = java.lang.Long.MIN_VALUE;
        longArray[1] = java.lang.Long.MIN_VALUE;
        
        long[] actual = ArrayUtils.removeElement(longArray, 0L);
        
        long[] expected = {
            java.lang.Long.MIN_VALUE, java.lang.Long.MIN_VALUE, 0L, 0L, 0L, 0L, 0L, 0L,
            0L, 0L
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement46() {
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        long[] actual = ArrayUtils.removeElement(longArray, 1L);
        
        long[] expected = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement47() {
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        long[] actual = ArrayUtils.removeElement(longArray, 0L);
        
        long[] expected = {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.removeElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeElement([I, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(int[],int)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone8() {
        int[] intArray = {};
        
        int[] actual = ArrayUtils.removeElement(intArray, -255);
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(int[],int)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_18() {
        int[] intArray = {-254};
        
        int[] actual = ArrayUtils.removeElement(intArray, -255);
        
        int[] expected = {-254};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(int[],int)}
 *  */
    @Test
    public void testRemoveElement48() {
        int[] intArray = {1};
        
        int[] actual = ArrayUtils.removeElement(intArray, 1);
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(int[],int)}
 *  */
    @Test
    public void testRemoveElement_16() {
        int[] intArray = {1};
        
        int[] actual = ArrayUtils.removeElement(intArray, 1);
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(int[],int)}
 * @utbot.returnsFrom {@code return clone(array);}
 *  */
    @Test
    public void testRemoveElement_ReturnClone_28() {
        int[] actual = ArrayUtils.removeElement(((int[]) null), -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeElement([I, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#removeElement(int[],int)}
     */
    @Test
    public void testRemoveElementWithNonEmptyPrimitiveArrayAndCornerCase4() {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        
        int[] actual = ArrayUtils.removeElement(intArray, 0);
        
        int[] expected = {-1, Integer.MAX_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeElement([I, int)
    
    @Test
    public void testRemoveElement49() {
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        int[] actual = ArrayUtils.removeElement(intArray, 1);
        
        int[] expected = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement50() {
        int[] intArray = {
            1, 1, 1, 0, -2147483647, -2147483647, -2147483647, -2147483647,
            -2147483647
        };
        
        int[] actual = ArrayUtils.removeElement(intArray, 0);
        
        int[] expected = {1, 1, 1, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement51() {
        int[] intArray = new int[11];
        intArray[0] = 1;
        intArray[1] = 1;
        intArray[3] = -2147483647;
        intArray[4] = -2147483647;
        intArray[5] = -2147483647;
        intArray[6] = -2147483647;
        intArray[7] = -2147483647;
        intArray[8] = -2147483647;
        intArray[9] = -2147483647;
        intArray[10] = -2147483647;
        
        int[] actual = ArrayUtils.removeElement(intArray, 0);
        
        int[] expected = {
            1, 1, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647,
            -2147483647, -2147483647
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testRemoveElement52() {
        int[] intArray = {
            0, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647,
            -2147483647
        };
        
        int[] actual = ArrayUtils.removeElement(intArray, 0);
        
        int[] expected = {-2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647, -2147483647};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([I, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int)}
 *  */
    @Test
    public void testAdd() {
        int[] intArray = {1};
        
        int[] actual = ArrayUtils.add(intArray, -255);
        
        int[] expected = {1, -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int)}
 *  */
    @Test
    public void testAdd_1() {
        int[] intArray = {1};
        
        int[] actual = ArrayUtils.add(intArray, -255);
        
        int[] expected = {1, -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int)}
 *  */
    @Test
    public void testAdd_2() {
        int[] actual = ArrayUtils.add(((int[]) null), -255);
        
        int[] expected = {-255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add([I, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int)}
     */
    @Test
    public void testAddWithNonEmptyPrimitiveArrayAndCornerCase() {
        int[] intArray = {1, Integer.MAX_VALUE, -1};
        
        int[] actual = ArrayUtils.add(intArray, Integer.MIN_VALUE);
        
        int[] expected = {1, Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([D, int, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],int,double)}
 *  */
    @Test
    public void testAdd1() {
        double[] doubleArray = {0.0};
        
        double[] actual = ArrayUtils.add(doubleArray, 0, java.lang.Double.NaN);
        
        double[] expected = {java.lang.Double.NaN, 0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],int,double)}
 *  */
    @Test
    public void testAdd_11() {
        double[] actual = ArrayUtils.add(((double[]) null), 0, java.lang.Double.NaN);
        
        double[] expected = {java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([D, int, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],int,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (double[]) add(array, index, Double.valueOf(element), Double.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:426) */
        ArrayUtils.add(doubleArray, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],int,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (double[]) add(array, index, Double.valueOf(element), Double.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_1() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:426) */
        ArrayUtils.add(doubleArray, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],int,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (double[]) add(array, index, Double.valueOf(element), Double.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_2() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:426) */
        ArrayUtils.add(((double[]) null), -255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add([D, int, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],int,double)}
     */
    @Test
    public void testAddThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 3]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:426) */
        ArrayUtils.add(doubleArray, -1, 0.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([F, int, float)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],int,float)}
 *  */
    @Test
    public void testAdd2() {
        float[] floatArray = {0.0f};
        
        float[] actual = ArrayUtils.add(floatArray, 0, 1.4E-45f);
        
        float[] expected = {1.4E-45f, 0.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],int,float)}
 *  */
    @Test
    public void testAdd_12() {
        float[] actual = ArrayUtils.add(((float[]) null), 0, 1.4E-45f);
        
        float[] expected = {1.4E-45f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([F, int, float)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],int,float)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (float[]) add(array, index, Float.valueOf(element), Float.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException1() {
        float[] floatArray = {0.0f};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:488) */
        ArrayUtils.add(floatArray, -1, 1.4E-45f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],int,float)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (float[]) add(array, index, Float.valueOf(element), Float.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_11() {
        float[] floatArray = {0.0f};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:488) */
        ArrayUtils.add(floatArray, -1, 1.4E-45f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],int,float)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (float[]) add(array, index, Float.valueOf(element), Float.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_21() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:488) */
        ArrayUtils.add(((float[]) null), -255, 1.4E-45f);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add([F, int, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],int,float)}
     */
    @Test
    public void testAddThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase1() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 3]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:488) */
        ArrayUtils.add(floatArray, -1, 0.0f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([J, int, long)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],int,long)}
 *  */
    @Test
    public void testAdd3() {
        long[] longArray = {-255L};
        
        long[] actual = ArrayUtils.add(longArray, 0, -255L);
        
        long[] expected = {-255L, -255L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],int,long)}
 *  */
    @Test
    public void testAdd_13() {
        long[] actual = ArrayUtils.add(((long[]) null), 0, -255L);
        
        long[] expected = {-255L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([J, int, long)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],int,long)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (long[]) add(array, index, Long.valueOf(element), Long.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException2() {
        long[] longArray = {-255L};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:585) */
        ArrayUtils.add(longArray, -1, -255L);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],int,long)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (long[]) add(array, index, Long.valueOf(element), Long.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_12() {
        long[] longArray = {-255L};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:585) */
        ArrayUtils.add(longArray, -1, -255L);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],int,long)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (long[]) add(array, index, Long.valueOf(element), Long.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_22() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:585) */
        ArrayUtils.add(((long[]) null), -255, -255L);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add([J, int, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],int,long)}
     */
    @Test
    public void testAddThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase2() {
        long[] longArray = {-1L, -549755813889L, java.lang.Long.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 3]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:585) */
        ArrayUtils.add(longArray, -1, java.lang.Long.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.lang.Object, int, java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index > length || index < 0
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException3() throws Throwable  {
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: 81, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class shortArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", shortArrayType, intType, shortArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) shortArray);
        addMethodArguments[1] = 81;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): False}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index > length || index < 0
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_13() throws Throwable  {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", byteArrayType, intType, byteArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) byteArray);
        addMethodArguments[1] = -1;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.executesCondition {@code (index != 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index != 0
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_23() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", objectType, intType, objectType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = -255;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(array, 0, result, 0, index);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Throwable  {
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:639) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class intArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", intArrayType, intType, intArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) intArray);
        addMethodArguments[1] = 0;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(array, 0, result, 0, index);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Throwable  {
        long[] longArray = {0L};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:639) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class longArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", longArrayType, intType, longArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) longArray);
        addMethodArguments[1] = 0;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(array, 0, result, 0, index);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_2() throws Throwable  {
        byte[] byteArray = {(byte) 0};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:639) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", byteArrayType, intType, byteArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) byteArray);
        addMethodArguments[1] = 0;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(array, 0, result, 0, index);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_3() throws Throwable  {
        boolean[] booleanArray = {false};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:639) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class booleanArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", booleanArrayType, intType, booleanArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) booleanArray);
        addMethodArguments[1] = 0;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(array, 0, result, 0, index);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_4() throws Throwable  {
        char[] charArray = {'\u0000'};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:639) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class charArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", charArrayType, intType, charArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) charArray);
        addMethodArguments[1] = 0;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(array, 0, result, 0, index);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_5() throws Throwable  {
        float[] floatArray = {0.0f};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:639) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class floatArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", floatArrayType, intType, floatArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) floatArray);
        addMethodArguments[1] = 0;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(array, 0, result, 0, index);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_6() throws Throwable  {
        short[] shortArray = {(short) 0};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:639) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class shortArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", shortArrayType, intType, shortArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) shortArray);
        addMethodArguments[1] = 0;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (index > length): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index < length): False}
 * @utbot.invokes {@link java.lang.reflect.Array#set(java.lang.Object,int,java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return result;
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_7() throws Throwable  {
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:639) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", objectArrayType, intType, objectArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) objectArray);
        addMethodArguments[1] = 0;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.executesCondition {@code (index != 0): False}
 * @utbot.invokes {@link java.lang.reflect.Array#newInstance(java.lang.Class,int)}
 * @utbot.invokes {@link java.lang.reflect.Array#set(java.lang.Object,int,java.lang.Object)}
 * @utbot.returnsFrom {@code return joinedArray;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return joinedArray;
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_8() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:631) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", objectType, intType, objectType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = 0;
        addMethodArguments[2] = ((Object) null);
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(java.lang.Object, int, java.lang.Object, java.lang.Class)
    
    @Test
    public void testAdd4() throws Throwable  {
        Object object = new Object();
        Object object1 = new Object();
        Class class1 = Object.class;
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IllegalArgumentException: Argument is not an array]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:635) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class intType = int.class;
        Class class1Type = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", class1, intType, class1, class1Type);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = object;
        addMethodArguments[1] = 2;
        addMethodArguments[2] = object1;
        addMethodArguments[3] = class1;
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd5() throws Throwable  {
        Object object = new Object();
        Object object1 = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IllegalArgumentException: Argument is not an array]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:635) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", objectType, intType, objectType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = object;
        addMethodArguments[1] = 1;
        addMethodArguments[2] = object1;
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAdd6() throws Throwable  {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:639) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class doubleArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Class classType = Class.forName("java.lang.Class");
        Method addMethod = arrayUtilsClazz.getDeclaredMethod("add", doubleArrayType, intType, doubleArrayType, classType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[4];
        addMethodArguments[0] = ((Object) doubleArray);
        addMethodArguments[1] = 1;
        addMethodArguments[2] = object;
        addMethodArguments[3] = ((Object) null);
        try {
            addMethod.invoke(null, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([F, float)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],float)}
 *  */
    @Test
    public void testAdd7() {
        float[] floatArray = {0.0f};
        
        float[] actual = ArrayUtils.add(floatArray, java.lang.Float.NaN);
        
        float[] expected = {0.0f, java.lang.Float.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],float)}
 *  */
    @Test
    public void testAdd_14() {
        float[] floatArray = {0.0f};
        
        float[] actual = ArrayUtils.add(floatArray, java.lang.Float.NaN);
        
        float[] expected = {0.0f, java.lang.Float.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],float)}
 *  */
    @Test
    public void testAdd_21() {
        float[] actual = ArrayUtils.add(((float[]) null), java.lang.Float.NaN);
        
        float[] expected = {java.lang.Float.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add([F, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(float[],float)}
     */
    @Test
    public void testAddWithNonEmptyPrimitiveArray() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float[] actual = ArrayUtils.add(floatArray, 1.3292282E36f);
        
        float[] expected = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f, 1.3292282E36f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([D, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],double)}
 *  */
    @Test
    public void testAdd8() {
        double[] doubleArray = {0.0};
        
        double[] actual = ArrayUtils.add(doubleArray, java.lang.Double.NaN);
        
        double[] expected = {0.0, java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],double)}
 *  */
    @Test
    public void testAdd_15() {
        double[] doubleArray = {0.0};
        
        double[] actual = ArrayUtils.add(doubleArray, java.lang.Double.NaN);
        
        double[] expected = {0.0, java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],double)}
 *  */
    @Test
    public void testAdd_22() {
        double[] actual = ArrayUtils.add(((double[]) null), java.lang.Double.NaN);
        
        double[] expected = {java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add([D, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(double[],double)}
     */
    @Test
    public void testAddWithNonEmptyPrimitiveArray1() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        double[] actual = ArrayUtils.add(doubleArray, 1.1235582092889477E307);
        
        double[] expected = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0, 1.1235582092889477E307};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([C, int, char)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],int,char)}
 *  */
    @Test
    public void testAdd9() {
        char[] charArray = {' '};
        
        char[] actual = ArrayUtils.add(charArray, 0, ' ');
        
        char[] expected = {' ', ' '};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],int,char)}
 *  */
    @Test
    public void testAdd_16() {
        char[] actual = ArrayUtils.add(((char[]) null), 0, ' ');
        
        char[] expected = {' '};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([C, int, char)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],int,char)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (char[]) add(array, index, Character.valueOf(element), Character.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException4() {
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:364) */
        ArrayUtils.add(charArray, -1, ' ');
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],int,char)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (char[]) add(array, index, Character.valueOf(element), Character.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_14() {
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:364) */
        ArrayUtils.add(charArray, -1, ' ');
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],int,char)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (char[]) add(array, index, Character.valueOf(element), Character.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_24() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:364) */
        ArrayUtils.add(((char[]) null), -255, ' ');
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add([C, int, char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],int,char)}
     */
    @Test
    public void testAddThrowsIOOBEWithNonEmptyPrimitiveArray() {
        char[] charArray = {'', '?', '@'};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 3]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:364) */
        ArrayUtils.add(charArray, -1, '?');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([Z, int, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],int,boolean)}
 *  */
    @Test
    public void testAdd10() {
        boolean[] booleanArray = {false};
        
        boolean[] actual = ArrayUtils.add(booleanArray, 0, false);
        
        boolean[] expected = {false, false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],int,boolean)}
 *  */
    @Test
    public void testAdd_17() {
        boolean[] actual = ArrayUtils.add(((boolean[]) null), 0, false);
        
        boolean[] expected = {false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([Z, int, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],int,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (boolean[]) add(array, index, Boolean.valueOf(element), Boolean.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException5() {
        boolean[] booleanArray = {false};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:239) */
        ArrayUtils.add(booleanArray, -1, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],int,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (boolean[]) add(array, index, Boolean.valueOf(element), Boolean.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_15() {
        boolean[] booleanArray = {false};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:239) */
        ArrayUtils.add(booleanArray, -1, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],int,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (boolean[]) add(array, index, Boolean.valueOf(element), Boolean.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_25() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:239) */
        ArrayUtils.add(((boolean[]) null), -255, false);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add([Z, int, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],int,boolean)}
     */
    @Test
    public void testAddThrowsIOOBEWithNonEmptyPrimitiveArray1() {
        boolean[] booleanArray = {false, false, true};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 3]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:239) */
        ArrayUtils.add(booleanArray, -1, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([Ljava.lang.Object;, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],int,java.lang.Object)}
 * @utbot.executesCondition {@code (array != null): False}
 * @utbot.executesCondition {@code (element != null): True}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#add(java.lang.Object,int,java.lang.Object,java.lang.Class)
 * @utbot.returnsFrom {@code return (T[]) add(array, index, element, clss);}
 *  */
    @Test
    public void testAdd_ElementNotEqualsNull() {
        byte[] byteArray = {};
        
        byte[][] actual = ((byte[][]) ArrayUtils.add(((java.lang.Object[]) null), 0, byteArray));
        
        byte[][] expected = new byte[1][];
        expected[0] = byteArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([Ljava.lang.Object;, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],int,java.lang.Object)}
 * @utbot.executesCondition {@code (array != null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (T[]) add(array, index, element, clss);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException6() {
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:754) */
        ArrayUtils.add(objectArray, -1, ((Object) null));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],int,java.lang.Object)}
 * @utbot.executesCondition {@code (array != null): False}
 * @utbot.executesCondition {@code (element != null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (T[]) add(array, index, element, clss);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_16() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:754) */
        ArrayUtils.add(((java.lang.Object[]) null), -255, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],int,java.lang.Object)}
 * @utbot.executesCondition {@code (array != null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (T[]) add(array, index, element, clss);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_26() {
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:754) */
        ArrayUtils.add(objectArray, -1, ((Object) null));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],int,java.lang.Object)}
 * @utbot.executesCondition {@code (array != null): False}
 * @utbot.executesCondition {@code (element != null): False}
 * @utbot.returnsFrom {@code return (T[]) new Object[] { null };}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (T[]) new Object[] { null };
 *  */
    @Test
    public void testAdd_ThrowIllegalArgumentException() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IllegalArgumentException: Array and element cannot both be null]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:751) */
        ArrayUtils.add(((java.lang.Object[]) null), -255, ((Object) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add([Ljava.lang.Object;, int, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],int,java.lang.Object)}
     */
    @Test
    public void testAddThrowsIOOBEWithNonEmptyObjectArrayAndCornerCase() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        Object object3 = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -2147483648, Length: 3]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:754) */
        ArrayUtils.add(objectArray, Integer.MIN_VALUE, object3);
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([J, long)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],long)}
 *  */
    @Test
    public void testAdd11() {
        long[] longArray = {-255L};
        
        long[] actual = ArrayUtils.add(longArray, -255L);
        
        long[] expected = {-255L, -255L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],long)}
 *  */
    @Test
    public void testAdd_18() {
        long[] longArray = {-255L};
        
        long[] actual = ArrayUtils.add(longArray, -255L);
        
        long[] expected = {-255L, -255L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],long)}
 *  */
    @Test
    public void testAdd_23() {
        long[] actual = ArrayUtils.add(((long[]) null), -255L);
        
        long[] expected = {-255L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add([J, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(long[],long)}
     */
    @Test
    public void testAddWithNonEmptyPrimitiveArrayAndCornerCase1() {
        long[] longArray = {1L, java.lang.Long.MAX_VALUE, -1L};
        
        long[] actual = ArrayUtils.add(longArray, java.lang.Long.MIN_VALUE);
        
        long[] expected = {1L, java.lang.Long.MAX_VALUE, -1L, java.lang.Long.MIN_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([B, int, byte)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],int,byte)}
 *  */
    @Test
    public void testAdd12() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = ArrayUtils.add(byteArray, 0, (byte) -127);
        
        byte[] expected = {(byte) -127, (byte) -127};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],int,byte)}
 *  */
    @Test
    public void testAdd_19() {
        byte[] actual = ArrayUtils.add(((byte[]) null), 0, (byte) -127);
        
        byte[] expected = {(byte) -127};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([B, int, byte)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],int,byte)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (byte[]) add(array, index, Byte.valueOf(element), Byte.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException7() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:301) */
        ArrayUtils.add(byteArray, -1, (byte) -127);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],int,byte)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (byte[]) add(array, index, Byte.valueOf(element), Byte.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_17() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:301) */
        ArrayUtils.add(byteArray, -1, (byte) -127);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],int,byte)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (byte[]) add(array, index, Byte.valueOf(element), Byte.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_27() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:301) */
        ArrayUtils.add(((byte[]) null), -255, (byte) -127);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add([B, int, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],int,byte)}
     */
    @Test
    public void testAddThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase3() {
        byte[] byteArray = {(byte) -1, java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 3]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:301) */
        ArrayUtils.add(byteArray, -1, java.lang.Byte.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([S, int, short)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],int,short)}
 *  */
    @Test
    public void testAdd13() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.add(shortArray, 0, (short) -255);
        
        short[] expected = {(short) -255, (short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],int,short)}
 *  */
    @Test
    public void testAdd_110() {
        short[] actual = ArrayUtils.add(((short[]) null), 0, (short) -255);
        
        short[] expected = {(short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([S, int, short)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],int,short)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (short[]) add(array, index, Short.valueOf(element), Short.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException8() {
        short[] shortArray = {(short) -255};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:680) */
        ArrayUtils.add(shortArray, -1, (short) -255);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],int,short)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (short[]) add(array, index, Short.valueOf(element), Short.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_18() {
        short[] shortArray = {(short) -255};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:680) */
        ArrayUtils.add(shortArray, -1, (short) -255);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],int,short)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (short[]) add(array, index, Short.valueOf(element), Short.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_28() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:680) */
        ArrayUtils.add(((short[]) null), -255, (short) -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add([S, int, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],int,short)}
     */
    @Test
    public void testAddThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase4() {
        short[] shortArray = {(short) -1, java.lang.Short.MAX_VALUE, java.lang.Short.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 3]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:680) */
        ArrayUtils.add(shortArray, -1, java.lang.Short.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([I, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int,int)}
 *  */
    @Test
    public void testAdd14() {
        int[] intArray = {1};
        
        int[] actual = ArrayUtils.add(intArray, 0, -255);
        
        int[] expected = {-255, 1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int,int)}
 *  */
    @Test
    public void testAdd_111() {
        int[] actual = ArrayUtils.add(((int[]) null), 0, -255);
        
        int[] expected = {-255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([I, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (int[]) add(array, index, Integer.valueOf(element), Integer.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException9() {
        int[] intArray = {1};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:550) */
        ArrayUtils.add(intArray, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (int[]) add(array, index, Integer.valueOf(element), Integer.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_19() {
        int[] intArray = {1};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:550) */
        ArrayUtils.add(intArray, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (int[]) add(array, index, Integer.valueOf(element), Integer.TYPE);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException_29() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -255, Length: 0]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:629)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:550) */
        ArrayUtils.add(((int[]) null), -255, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add([I, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(int[],int,int)}
     */
    @Test
    public void testAddThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase5() {
        int[] intArray = {-1, -1, Integer.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 3]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:637)
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:550) */
        ArrayUtils.add(intArray, -1, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([C, char)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],char)}
 *  */
    @Test
    public void testAdd15() {
        char[] charArray = {' '};
        
        char[] actual = ArrayUtils.add(charArray, ' ');
        
        char[] expected = {' ', ' '};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],char)}
 *  */
    @Test
    public void testAdd_112() {
        char[] charArray = {' '};
        
        char[] actual = ArrayUtils.add(charArray, ' ');
        
        char[] expected = {' ', ' '};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],char)}
 *  */
    @Test
    public void testAdd_24() {
        char[] actual = ArrayUtils.add(((char[]) null), ' ');
        
        char[] expected = {' '};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add([C, char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(char[],char)}
     */
    @Test
    public void testAddWithNonEmptyPrimitiveArray2() {
        char[] charArray = {'\u0001', '?', ''};
        
        char[] actual = ArrayUtils.add(charArray, '@');
        
        char[] expected = {'\u0001', '?', '', '@'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([Z, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],boolean)}
 *  */
    @Test
    public void testAdd16() {
        boolean[] booleanArray = {false};
        
        boolean[] actual = ArrayUtils.add(booleanArray, false);
        
        boolean[] expected = {false, false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],boolean)}
 *  */
    @Test
    public void testAdd_113() {
        boolean[] booleanArray = {false};
        
        boolean[] actual = ArrayUtils.add(booleanArray, false);
        
        boolean[] expected = {false, false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],boolean)}
 *  */
    @Test
    public void testAdd_25() {
        boolean[] actual = ArrayUtils.add(((boolean[]) null), false);
        
        boolean[] expected = {false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add([Z, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(boolean[],boolean)}
     */
    @Test
    public void testAddWithNonEmptyPrimitiveArray3() {
        boolean[] booleanArray = {false, true, true};
        
        boolean[] actual = ArrayUtils.add(booleanArray, false);
        
        boolean[] expected = {false, true, true, false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([B, byte)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],byte)}
 *  */
    @Test
    public void testAdd17() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = ArrayUtils.add(byteArray, (byte) -127);
        
        byte[] expected = {(byte) -127, (byte) -127};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],byte)}
 *  */
    @Test
    public void testAdd_114() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = ArrayUtils.add(byteArray, (byte) -127);
        
        byte[] expected = {(byte) -127, (byte) -127};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],byte)}
 *  */
    @Test
    public void testAdd_26() {
        byte[] actual = ArrayUtils.add(((byte[]) null), (byte) -127);
        
        byte[] expected = {(byte) -127};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add([B, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(byte[],byte)}
     */
    @Test
    public void testAddWithNonEmptyPrimitiveArrayAndCornerCase2() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        byte[] actual = ArrayUtils.add(byteArray, java.lang.Byte.MIN_VALUE);
        
        byte[] expected = {(byte) 1, java.lang.Byte.MAX_VALUE, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([S, short)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],short)}
 *  */
    @Test
    public void testAdd18() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.add(shortArray, (short) -255);
        
        short[] expected = {(short) -255, (short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],short)}
 *  */
    @Test
    public void testAdd_115() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.add(shortArray, (short) -255);
        
        short[] expected = {(short) -255, (short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],short)}
 *  */
    @Test
    public void testAdd_27() {
        short[] actual = ArrayUtils.add(((short[]) null), (short) -255);
        
        short[] expected = {(short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add([S, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(short[],short)}
     */
    @Test
    public void testAddWithNonEmptyPrimitiveArrayAndCornerCase3() {
        short[] shortArray = {(short) 1, java.lang.Short.MAX_VALUE, (short) -1};
        
        short[] actual = ArrayUtils.add(shortArray, java.lang.Short.MIN_VALUE);
        
        short[] expected = {(short) 1, java.lang.Short.MAX_VALUE, (short) -1, java.lang.Short.MIN_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([Ljava.lang.Object;, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return newArray;}
 *  */
    @Test
    public void testAdd_ReturnNewArray() {
        byte[] byteArray = {};
        
        byte[][] actual = ((byte[][]) ArrayUtils.add(((java.lang.Object[]) null), byteArray));
        
        byte[][] expected = new byte[1][];
        expected[0] = byteArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],java.lang.Object)}
 *  */
    @Test
    public void testAdd19() {
        byte[] byteArray = {};
        
        byte[][] actual = ((byte[][]) ArrayUtils.add(((java.lang.Object[]) null), byteArray));
        
        byte[][] expected = new byte[1][];
        expected[0] = byteArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([Ljava.lang.Object;, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],java.lang.Object)}
 * @utbot.executesCondition {@code (element != null): False}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: newArray[newArray.length - 1] = element;
 *  */
    @Test
    public void testAdd_ThrowIllegalArgumentException1() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.add] produces [java.lang.IllegalArgumentException: Arguments cannot both be null]
            org.apache.commons.lang3.ArrayUtils.add(ArrayUtils.java:794) */
        ArrayUtils.add(((java.lang.Object[]) null), ((Object) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add([Ljava.lang.Object;, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#add(java.lang.Object[],java.lang.Object)}
     */
    @Test
    public void testAddWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        Object object3 = new Object();
        
        java.lang.Object[] actual = ArrayUtils.add(objectArray, object3);
        
        java.lang.Object[] expected = new java.lang.Object[4];
        expected[0] = object;
        expected[1] = object1;
        expected[2] = object2;
        expected[3] = object3;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add([Ljava.lang.Object;, java.lang.Object)
    
    @Test
    public void testAdd20() {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        java.lang.Object[] actual = ArrayUtils.add(objectArray, objectArray);
        
        java.lang.Object[] expected = new java.lang.Object[10];
        expected[9] = objectArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testAdd21() {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        java.lang.Object[] actual = ArrayUtils.add(objectArray, objectArray);
        
        java.lang.Object[] expected = new java.lang.Object[10];
        expected[9] = objectArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove([I, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(int[],int)}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)
 *  */
    @Test
    public void testRemove_ArrayUtilsRemove() {
        int[] intArray = {1};
        
        int[] actual = ArrayUtils.remove(intArray, 0);
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove([I, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(int[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (int[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException() {
        int[] intArray = {1};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4813) */
        ArrayUtils.remove(intArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(int[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (int[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_1() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4813) */
        ArrayUtils.remove(((int[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(int[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (int[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_2() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4813) */
        ArrayUtils.remove(((int[]) null), -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove([I, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(int[],int)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() {
        int[] intArray = {-1, -1, Integer.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 2147483647, Length: 3]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4813) */
        ArrayUtils.remove(intArray, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove([J, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(long[],int)}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)
 *  */
    @Test
    public void testRemove_ArrayUtilsRemove1() {
        long[] longArray = {-255L};
        
        long[] actual = ArrayUtils.remove(longArray, 0);
        
        long[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove([J, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(long[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (long[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException1() {
        long[] longArray = {-255L};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4845) */
        ArrayUtils.remove(longArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(long[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (long[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_11() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4845) */
        ArrayUtils.remove(((long[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(long[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (long[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_21() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4845) */
        ArrayUtils.remove(((long[]) null), -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove([J, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(long[],int)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase1() {
        long[] longArray = {-1L, -1L, java.lang.Long.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 2147483647, Length: 3]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4845) */
        ArrayUtils.remove(longArray, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove([S, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(short[],int)}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)
 *  */
    @Test
    public void testRemove_ArrayUtilsRemove2() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.remove(shortArray, 0);
        
        short[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove([S, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(short[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (short[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException2() {
        short[] shortArray = {(short) -255};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4913) */
        ArrayUtils.remove(shortArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(short[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (short[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_12() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4913) */
        ArrayUtils.remove(((short[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(short[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (short[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_22() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4913) */
        ArrayUtils.remove(((short[]) null), -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove([S, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(short[],int)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase2() {
        short[] shortArray = {(short) -1, (short) -1, java.lang.Short.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 2147483647, Length: 3]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4913) */
        ArrayUtils.remove(shortArray, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 *  */
    @Test
    public void testRemove() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        long[] longArray = {0L};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class longArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", longArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) longArray);
        removeMethodArguments[1] = 0;
        long[] actual = ((long[]) removeMethod.invoke(null, removeMethodArguments));
        
        long[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 *  */
    @Test
    public void testRemove_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        boolean[] booleanArray = {false};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class booleanArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", booleanArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) booleanArray);
        removeMethodArguments[1] = 0;
        boolean[] actual = ((boolean[]) removeMethod.invoke(null, removeMethodArguments));
        
        boolean[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 *  */
    @Test
    public void testRemove_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {0};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class intArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", intArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) intArray);
        removeMethodArguments[1] = 0;
        int[] actual = ((int[]) removeMethod.invoke(null, removeMethodArguments));
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 *  */
    @Test
    public void testRemove_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {'\u0000'};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class charArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", charArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) charArray);
        removeMethodArguments[1] = 0;
        char[] actual = ((char[]) removeMethod.invoke(null, removeMethodArguments));
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 *  */
    @Test
    public void testRemove_4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        float[] floatArray = {0.0f};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class floatArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", floatArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) floatArray);
        removeMethodArguments[1] = 0;
        float[] actual = ((float[]) removeMethod.invoke(null, removeMethodArguments));
        
        float[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 *  */
    @Test
    public void testRemove_5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) 0};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", byteArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) byteArray);
        removeMethodArguments[1] = 0;
        byte[] actual = ((byte[]) removeMethod.invoke(null, removeMethodArguments));
        
        byte[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 *  */
    @Test
    public void testRemove_6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class doubleArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", doubleArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) doubleArray);
        removeMethodArguments[1] = 0;
        double[] actual = ((double[]) removeMethod.invoke(null, removeMethodArguments));
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 *  */
    @Test
    public void testRemove_7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        short[] shortArray = {(short) 0};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class shortArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", shortArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) shortArray);
        removeMethodArguments[1] = 0;
        short[] actual = ((short[]) removeMethod.invoke(null, removeMethodArguments));
        
        short[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index < 0 || index >= length
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException3() throws Throwable  {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", byteArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) byteArray);
        removeMethodArguments[1] = -1;
        try {
            removeMethod.invoke(null, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 * @utbot.executesCondition {@code (index >= length): False}
 * @utbot.executesCondition {@code (index < length - 1): False}
 * @utbot.invokes {@link java.lang.Class#getComponentType()}
 * @utbot.invokes {@link java.lang.reflect.Array#newInstance(java.lang.Class,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return result;}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return result;
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_13() throws Throwable  {
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", objectArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) objectArray);
        removeMethodArguments[1] = 0;
        try {
            removeMethod.invoke(null, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index < 0 || index >= length
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_23() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", objectType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) null);
        removeMethodArguments[1] = -1;
        try {
            removeMethod.invoke(null, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
 * @utbot.executesCondition {@code (index >= length): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index < 0 || index >= length
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", objectType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) null);
        removeMethodArguments[1] = 0;
        try {
            removeMethod.invoke(null, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove(java.lang.Object, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)}
     */
    @Test
    public void testRemoveThrowsIOOBE() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -2147483647, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", objectType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) null);
        removeMethodArguments[1] = -2147483647;
        try {
            removeMethod.invoke(null, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method remove(java.lang.Object, int)
    
    @Test
    public void testRemove1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class doubleArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", doubleArrayType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = ((Object) doubleArray);
        removeMethodArguments[1] = 0;
        double[] actual = ((double[]) removeMethod.invoke(null, removeMethodArguments));
        
        double[] expected = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method remove(java.lang.Object, int)
    
    @Test
    public void testRemove2() throws Throwable  {
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IllegalArgumentException: Argument is not an array]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.lang3.ArrayUtils.getLength(ArrayUtils.java:1710)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4870) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", objectType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = object;
        removeMethodArguments[1] = 2;
        try {
            removeMethod.invoke(null, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRemove3() throws Throwable  {
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IllegalArgumentException: Argument is not an array]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.lang3.ArrayUtils.getLength(ArrayUtils.java:1710)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4870) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method removeMethod = arrayUtilsClazz.getDeclaredMethod("remove", objectType, intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[2];
        removeMethodArguments[0] = object;
        removeMethodArguments[1] = 0;
        try {
            removeMethod.invoke(null, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove([C, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(char[],int)}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)
 *  */
    @Test
    public void testRemove_ArrayUtilsRemove3() {
        char[] charArray = {' '};
        
        char[] actual = ArrayUtils.remove(charArray, 0);
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove([C, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(char[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (char[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException4() {
        char[] charArray = {' '};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4717) */
        ArrayUtils.remove(charArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(char[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (char[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_14() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4717) */
        ArrayUtils.remove(((char[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(char[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (char[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_24() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4717) */
        ArrayUtils.remove(((char[]) null), -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove([C, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(char[],int)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase3() {
        char[] charArray = {'', '', '@'};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 2147483647, Length: 3]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4717) */
        ArrayUtils.remove(charArray, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove([B, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(byte[],int)}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)
 *  */
    @Test
    public void testRemove_ArrayUtilsRemove4() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = ArrayUtils.remove(byteArray, 0);
        
        byte[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove([B, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(byte[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (byte[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException5() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4685) */
        ArrayUtils.remove(byteArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(byte[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (byte[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_15() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4685) */
        ArrayUtils.remove(((byte[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(byte[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (byte[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_25() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4685) */
        ArrayUtils.remove(((byte[]) null), -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove([B, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(byte[],int)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase4() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 2147483647, Length: 3]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4685) */
        ArrayUtils.remove(byteArray, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove([Z, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(boolean[],int)}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)
 *  */
    @Test
    public void testRemove_ArrayUtilsRemove5() {
        boolean[] booleanArray = {false};
        
        boolean[] actual = ArrayUtils.remove(booleanArray, 0);
        
        boolean[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove([Z, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(boolean[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (boolean[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException6() {
        boolean[] booleanArray = {false};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4653) */
        ArrayUtils.remove(booleanArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(boolean[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (boolean[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_16() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4653) */
        ArrayUtils.remove(((boolean[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(boolean[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (boolean[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_26() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4653) */
        ArrayUtils.remove(((boolean[]) null), -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove([Z, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(boolean[],int)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase5() {
        boolean[] booleanArray = {false, true, true};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 2147483647, Length: 3]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4653) */
        ArrayUtils.remove(booleanArray, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove([Ljava.lang.Object;, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (T[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException7() {
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4947) */
        ArrayUtils.remove(objectArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object[],int)}
 * @utbot.returnsFrom {@code return (T[]) remove((Object) array, index);}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (T[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_17() {
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4947) */
        ArrayUtils.remove(objectArray, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (T[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_27() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4947) */
        ArrayUtils.remove(((java.lang.Object[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (T[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_31() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4947) */
        ArrayUtils.remove(((java.lang.Object[]) null), -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove([Ljava.lang.Object;, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object[],int)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithNonEmptyObjectArrayAndCornerCase() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 2147483647, Length: 3]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4947) */
        ArrayUtils.remove(objectArray, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method remove([Ljava.lang.Object;, int)
    
    @Test
    public void testRemove4() {
        java.lang.Object[] objectArray = new java.lang.Object[32];
        
        java.lang.Object[] actual = ArrayUtils.remove(objectArray, 2);
        
        java.lang.Object[] expected = new java.lang.Object[31];
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testRemove5() {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        java.lang.Object[] actual = ArrayUtils.remove(objectArray, 0);
        
        java.lang.Object[] expected = {null, null, null, null, null, null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region Errors report for remove
    
    public void testRemove_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove([F, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(float[],int)}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)
 *  */
    @Test
    public void testRemove_ArrayUtilsRemove6() {
        float[] floatArray = {0.0f};
        
        float[] actual = ArrayUtils.remove(floatArray, 0);
        
        float[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove([F, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(float[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (float[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException8() {
        float[] floatArray = {0.0f};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4781) */
        ArrayUtils.remove(floatArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(float[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (float[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_18() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4781) */
        ArrayUtils.remove(((float[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(float[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (float[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_28() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4781) */
        ArrayUtils.remove(((float[]) null), -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove([F, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(float[],int)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase6() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 2147483647, Length: 3]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4781) */
        ArrayUtils.remove(floatArray, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove([D, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(double[],int)}
 * @utbot.invokes org.apache.commons.lang3.ArrayUtils#remove(java.lang.Object,int)
 *  */
    @Test
    public void testRemove_ArrayUtilsRemove7() {
        double[] doubleArray = {0.0};
        
        double[] actual = ArrayUtils.remove(doubleArray, 0);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove([D, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(double[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (double[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException9() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 1]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4749) */
        ArrayUtils.remove(doubleArray, -1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(double[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (double[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_19() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 0, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4749) */
        ArrayUtils.remove(((double[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(double[],int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (double[]) remove((Object) array, index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException_29() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: -1, Length: 0]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4749) */
        ArrayUtils.remove(((double[]) null), -1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method remove([D, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#remove(double[],int)}
     */
    @Test
    public void testRemoveThrowsIOOBEWithNonEmptyPrimitiveArrayAndCornerCase7() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.remove] produces [java.lang.IndexOutOfBoundsException: Index: 2147483647, Length: 3]
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4872)
            org.apache.commons.lang3.ArrayUtils.remove(ArrayUtils.java:4749) */
        ArrayUtils.remove(doubleArray, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toString(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return stringIfNull;}
 *  */
    @Test
    public void testToString_ArrayEqualsNull() {
        String actual = ArrayUtils.toString(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString(java.lang.Object, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toString(java.lang.Object,java.lang.String)}
     */
    @Test
    public void testToStringWithNonEmptyString() {
        String actual = ArrayUtils.toString(null, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString(java.lang.Object, java.lang.String)
    
    @Test
    public void testToString1() {
        Object object = new Object();
        String string = "";
        
        String actual = ArrayUtils.toString(object, string);
        
        String expected = "java.lang.Object@1727ff67";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toString(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#toString(java.lang.Object,java.lang.String)}
 * @utbot.returnsFrom {@code return toString(array, "{}");}
 *  */
    @Test
    public void testToString_ArrayUtilsToString() {
        String actual = ArrayUtils.toString(null);
        
        String expected = "{}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toString(java.lang.Object)}
     */
    @Test
    public void testToString() {
        String actual = ArrayUtils.toString(null);
        
        String expected = "{}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString(java.lang.Object)
    
    @Test
    public void testToString2() {
        Object object = new Object();
        
        String actual = ArrayUtils.toString(object);
        
        String expected = "java.lang.Object@416b72d0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() {
        Object object = new Object();
        
        String actual = ArrayUtils.toString(object);
        
        String expected = "java.lang.Object@49803e60";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([B)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return array.clone();}
 *  */
    @Test
    public void testClone_ArrayNotEqualsNull() {
        byte[] byteArray = {};
        
        byte[] actual = ArrayUtils.clone(byteArray);
        
        byte[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ArrayEqualsNull() {
        byte[] actual = ArrayUtils.clone(((byte[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(byte[])}
     */
    @Test
    public void testCloneWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        byte[] actual = ArrayUtils.clone(byteArray);
        
        byte[] expected = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([D)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return array.clone();}
 *  */
    @Test
    public void testClone_ArrayNotEqualsNull1() {
        double[] doubleArray = {3.2379E-319};
        
        double[] actual = ArrayUtils.clone(doubleArray);
        
        double[] expected = {3.2379E-319};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ArrayEqualsNull1() {
        double[] actual = ArrayUtils.clone(((double[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(double[])}
     */
    @Test
    public void testCloneWithNonEmptyPrimitiveArray1() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        double[] actual = ArrayUtils.clone(doubleArray);
        
        double[] expected = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([C)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(char[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return array.clone();}
 *  */
    @Test
    public void testClone_ArrayNotEqualsNull2() {
        char[] charArray = {};
        
        char[] actual = ArrayUtils.clone(charArray);
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(char[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ArrayEqualsNull2() {
        char[] actual = ArrayUtils.clone(((char[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(char[])}
     */
    @Test
    public void testCloneWithNonEmptyPrimitiveArray2() {
        char[] charArray = {'', '', '@'};
        
        char[] actual = ArrayUtils.clone(charArray);
        
        char[] expected = {'', '', '@'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return array.clone();}
 *  */
    @Test
    public void testClone_ArrayNotEqualsNull3() {
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = ArrayUtils.clone(objectArray);
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ArrayEqualsNull3() {
        java.lang.Object[] actual = ArrayUtils.clone(((java.lang.Object[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(java.lang.Object[])}
     */
    @Test
    public void testCloneWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        java.lang.Object[] actual = ArrayUtils.clone(objectArray);
        
        java.lang.Object[] expected = new java.lang.Object[3];
        expected[0] = object;
        expected[1] = object1;
        expected[2] = object2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([J)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return array.clone();}
 *  */
    @Test
    public void testClone_ArrayNotEqualsNull4() {
        long[] longArray = {};
        
        long[] actual = ArrayUtils.clone(longArray);
        
        long[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ArrayEqualsNull4() {
        long[] actual = ArrayUtils.clone(((long[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(long[])}
     */
    @Test
    public void testCloneWithNonEmptyPrimitiveArray3() {
        long[] longArray = {-1L, -1L, java.lang.Long.MIN_VALUE};
        
        long[] actual = ArrayUtils.clone(longArray);
        
        long[] expected = {-1L, -1L, java.lang.Long.MIN_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([S)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return array.clone();}
 *  */
    @Test
    public void testClone_ArrayNotEqualsNull5() {
        short[] shortArray = {};
        
        short[] actual = ArrayUtils.clone(shortArray);
        
        short[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ArrayEqualsNull5() {
        short[] actual = ArrayUtils.clone(((short[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(short[])}
     */
    @Test
    public void testCloneWithNonEmptyPrimitiveArray4() {
        short[] shortArray = {(short) -1, (short) -1, java.lang.Short.MIN_VALUE};
        
        short[] actual = ArrayUtils.clone(shortArray);
        
        short[] expected = {(short) -1, (short) -1, java.lang.Short.MIN_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([I)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return array.clone();}
 *  */
    @Test
    public void testClone_ArrayNotEqualsNull6() {
        int[] intArray = {};
        
        int[] actual = ArrayUtils.clone(intArray);
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(int[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ArrayEqualsNull6() {
        int[] actual = ArrayUtils.clone(((int[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(int[])}
     */
    @Test
    public void testCloneWithNonEmptyPrimitiveArray5() {
        int[] intArray = {-1, -1, Integer.MIN_VALUE};
        
        int[] actual = ArrayUtils.clone(intArray);
        
        int[] expected = {-1, -1, Integer.MIN_VALUE};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([Z)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return array.clone();}
 *  */
    @Test
    public void testClone_ArrayNotEqualsNull7() {
        boolean[] booleanArray = {};
        
        boolean[] actual = ArrayUtils.clone(booleanArray);
        
        boolean[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(boolean[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ArrayEqualsNull7() {
        boolean[] actual = ArrayUtils.clone(((boolean[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([Z)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(boolean[])}
     */
    @Test
    public void testCloneWithNonEmptyPrimitiveArray6() {
        boolean[] booleanArray = {false, true, true};
        
        boolean[] actual = ArrayUtils.clone(booleanArray);
        
        boolean[] expected = {false, true, true};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone([F)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return array.clone();}
 *  */
    @Test
    public void testClone_ArrayNotEqualsNull8() {
        float[] floatArray = {};
        
        float[] actual = ArrayUtils.clone(floatArray);
        
        float[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ArrayEqualsNull8() {
        float[] actual = ArrayUtils.clone(((float[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone([F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#clone(float[])}
     */
    @Test
    public void testCloneWithNonEmptyPrimitiveArray7() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float[] actual = ArrayUtils.clone(floatArray);
        
        float[] expected = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.getLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLength(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#getLength(java.lang.Object)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.invokes {@link java.lang.reflect.Array#getLength(java.lang.Object)}
 * @utbot.returnsFrom {@code return Array.getLength(array);}
 *  */
    @Test
    public void testGetLength_ArrayNotEqualsNull() {
        byte[] byteArray = {};
        
        int actual = ArrayUtils.getLength(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#getLength(java.lang.Object)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetLength_ArrayEqualsNull() {
        int actual = ArrayUtils.getLength(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLength(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#getLength(java.lang.Object)}
     */
    @Test
    public void testGetLengthReturnsZero() {
        int actual = ArrayUtils.getLength(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([D, double, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero() {
        double[] doubleArray = {0.0, 0.0};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, 129);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindEqualsIOfArray() {
        double[] doubleArray = {1.295163E-318};
        
        int actual = ArrayUtils.indexOf(doubleArray, 1.295163E-318, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero() {
        double[] doubleArray = {-2.7813423231340017E-308};
        
        int actual = ArrayUtils.indexOf(doubleArray, -2.7813423231340017E-308, -1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testIndexOf_ArrayUtilsIsEmpty() {
        double[] doubleArray = {};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindNotEqualsIOfArray() {
        double[] doubleArray = {4.000007629394532};
        
        int actual = ArrayUtils.indexOf(doubleArray, 3.689355851616328E19, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testIndexOf_ArrayUtilsIsEmpty_1() {
        int actual = ArrayUtils.indexOf(((double[]) null), java.lang.Double.NaN, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([D, double, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArrayAndCornerCase() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([C, char)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf() {
        char[] charArray = {' '};
        
        int actual = ArrayUtils.indexOf(charArray, ' ');
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_1() {
        char[] charArray = {};
        
        int actual = ArrayUtils.indexOf(charArray, ' ');
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_2() {
        char[] charArray = {' '};
        
        int actual = ArrayUtils.indexOf(charArray, '_');
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_3() {
        int actual = ArrayUtils.indexOf(((char[]) null), ' ');
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([C, char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArray() {
        char[] charArray = {'\u0000', '?', ''};
        
        int actual = ArrayUtils.indexOf(charArray, '@');
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([F, float, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero1() {
        float[] floatArray = {0.0f, 0.0f};
        
        int actual = ArrayUtils.indexOf(floatArray, java.lang.Float.NaN, 129);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindEqualsIOfArray1() {
        float[] floatArray = {5.877472E-39f};
        
        int actual = ArrayUtils.indexOf(floatArray, 5.877472E-39f, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero1() {
        float[] floatArray = {1.6165917E-38f};
        
        int actual = ArrayUtils.indexOf(floatArray, 1.6165917E-38f, -1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testIndexOf_ArrayUtilsIsEmpty1() {
        float[] floatArray = {};
        
        int actual = ArrayUtils.indexOf(floatArray, java.lang.Float.NaN, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindNotEqualsIOfArray1() {
        float[] floatArray = {1.3224313E-38f};
        
        int actual = ArrayUtils.indexOf(floatArray, 1.9984014E-15f, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testIndexOf_ArrayUtilsIsEmpty_11() {
        int actual = ArrayUtils.indexOf(((float[]) null), java.lang.Float.NaN, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([F, float, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float,int)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArrayAndCornerCase1() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        int actual = ArrayUtils.indexOf(floatArray, java.lang.Float.NaN, -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([D, double, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0, tolerance);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf1() {
        double[] doubleArray = {-2.6815615859885194E154};
        
        int actual = ArrayUtils.indexOf(doubleArray, -2.6815615859885194E154, 1.9685256523047107E100);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0, tolerance);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_11() {
        double[] doubleArray = {};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0, tolerance);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_21() {
        double[] doubleArray = {java.lang.Double.NaN};
        
        int actual = ArrayUtils.indexOf(doubleArray, 3.3641780628865967E-308, 1.121279821520949E-308);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0, tolerance);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_31() {
        int actual = ArrayUtils.indexOf(((double[]) null), java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([D, double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,double)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArrayAndCornerCases() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 0.0, -1.0};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf([D, double, double)
    
    @Test
    public void testIndexOf1() {
        double[] doubleArray = {1.585125426502717E116};
        
        int actual = ArrayUtils.indexOf(doubleArray, 1.0026864935073554, 0.0021370134774090256);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf2() {
        double[] doubleArray = {
            512.0938792229408, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        int actual = ArrayUtils.indexOf(doubleArray, 8.49749236788218E-309, 1.408598609491025E-308);
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testIndexOf3() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([B, byte, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero2() {
        byte[] byteArray = {};
        
        int actual = ArrayUtils.indexOf(byteArray, (byte) -127, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero2() {
        byte[] byteArray = {};
        
        int actual = ArrayUtils.indexOf(byteArray, (byte) -127, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindEqualsIOfArray2() {
        byte[] byteArray = {(byte) -127};
        
        int actual = ArrayUtils.indexOf(byteArray, (byte) -127, -1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindNotEqualsIOfArray2() {
        byte[] byteArray = {(byte) -127};
        
        int actual = ArrayUtils.indexOf(byteArray, (byte) -123, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testIndexOf_ArrayEqualsNull() {
        int actual = ArrayUtils.indexOf(((byte[]) null), (byte) -127, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([B, byte, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte,int)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArray1() {
        byte[] byteArray = {(byte) 1, (byte) 0, (byte) -1};
        
        int actual = ArrayUtils.indexOf(byteArray, (byte) 1, 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([B, byte)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf2() {
        byte[] byteArray = {(byte) -127};
        
        int actual = ArrayUtils.indexOf(byteArray, (byte) -127);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_12() {
        byte[] byteArray = {};
        
        int actual = ArrayUtils.indexOf(byteArray, (byte) -127);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_22() {
        byte[] byteArray = {(byte) -127};
        
        int actual = ArrayUtils.indexOf(byteArray, (byte) -126);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_32() {
        int actual = ArrayUtils.indexOf(((byte[]) null), (byte) -127);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([B, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(byte[],byte)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArrayAndCornerCase2() {
        byte[] byteArray = {(byte) 0, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        int actual = ArrayUtils.indexOf(byteArray, java.lang.Byte.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([D, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf3() {
        double[] doubleArray = {};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_13() {
        double[] doubleArray = {4.9E-324};
        
        int actual = ArrayUtils.indexOf(doubleArray, 4.9E-324);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_23() {
        double[] doubleArray = {-2.2250743890061654E-308};
        
        int actual = ArrayUtils.indexOf(doubleArray, 3.689349694351239E19);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_33() {
        int actual = ArrayUtils.indexOf(((double[]) null), java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([D, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArray2() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        int actual = ArrayUtils.indexOf(doubleArray, 1.1235582092889477E307);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([F, float)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf4() {
        float[] floatArray = {};
        
        int actual = ArrayUtils.indexOf(floatArray, java.lang.Float.NaN);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_14() {
        float[] floatArray = {1.4E-45f};
        
        int actual = ArrayUtils.indexOf(floatArray, 1.4E-45f);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_24() {
        float[] floatArray = {-1.1754945E-38f};
        
        int actual = ArrayUtils.indexOf(floatArray, 8.0f);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_34() {
        int actual = ArrayUtils.indexOf(((float[]) null), java.lang.Float.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([F, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(float[],float)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArray3() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        int actual = ArrayUtils.indexOf(floatArray, 1.3292282E36f);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([C, char, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero3() {
        char[] charArray = {};
        
        int actual = ArrayUtils.indexOf(charArray, ' ', 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero3() {
        char[] charArray = {};
        
        int actual = ArrayUtils.indexOf(charArray, ' ', -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindEqualsIOfArray3() {
        char[] charArray = {' '};
        
        int actual = ArrayUtils.indexOf(charArray, ' ', -1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindNotEqualsIOfArray3() {
        char[] charArray = {' '};
        
        int actual = ArrayUtils.indexOf(charArray, 'A', 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testIndexOf_ArrayEqualsNull1() {
        int actual = ArrayUtils.indexOf(((char[]) null), ' ', -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([C, char, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(char[],char,int)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArray4() {
        char[] charArray = {'\u0001', '\u0000', ''};
        
        int actual = ArrayUtils.indexOf(charArray, '\u0001', 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([Z, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf5() {
        boolean[] booleanArray = {};
        
        int actual = ArrayUtils.indexOf(booleanArray, false);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_15() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.indexOf(booleanArray, false);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_25() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.indexOf(booleanArray, true);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_35() {
        int actual = ArrayUtils.indexOf(((boolean[]) null), false);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([Z, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean)}
     */
    @Test
    public void testIndexOfReturnsZeroWithNonEmptyPrimitiveArray() {
        boolean[] booleanArray = {false, true, true};
        
        int actual = ArrayUtils.indexOf(booleanArray, false);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([Z, boolean, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero4() {
        boolean[] booleanArray = {false, false};
        
        int actual = ArrayUtils.indexOf(booleanArray, false, 129);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindEqualsIOfArray4() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.indexOf(booleanArray, false, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindEqualsIOfArray_1() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.indexOf(booleanArray, false, -1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testIndexOf_ArrayUtilsIsEmpty2() {
        boolean[] booleanArray = {};
        
        int actual = ArrayUtils.indexOf(booleanArray, false, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindNotEqualsIOfArray4() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.indexOf(booleanArray, true, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testIndexOf_ArrayUtilsIsEmpty_12() {
        int actual = ArrayUtils.indexOf(((boolean[]) null), false, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([Z, boolean, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean,int)}
     */
    @Test
    public void testIndexOfReturns2WithNonEmptyPrimitiveArray() {
        boolean[] booleanArray = {false, false, true};
        
        int actual = ArrayUtils.indexOf(booleanArray, true, 1);
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([J, long, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero5() {
        long[] longArray = {};
        
        int actual = ArrayUtils.indexOf(longArray, -255L, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero4() {
        long[] longArray = {};
        
        int actual = ArrayUtils.indexOf(longArray, -255L, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindEqualsIOfArray5() {
        long[] longArray = {1L};
        
        int actual = ArrayUtils.indexOf(longArray, 1L, -1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindNotEqualsIOfArray5() {
        long[] longArray = {-255L};
        
        int actual = ArrayUtils.indexOf(longArray, -251L, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testIndexOf_ArrayEqualsNull2() {
        int actual = ArrayUtils.indexOf(((long[]) null), -255L, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([J, long, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long,int)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArrayAndCornerCase3() {
        long[] longArray = {0L, 2147483648L, 1L};
        
        int actual = ArrayUtils.indexOf(longArray, java.lang.Long.MIN_VALUE, -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([J, long)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf6() {
        long[] longArray = {-255L};
        
        int actual = ArrayUtils.indexOf(longArray, -255L);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_16() {
        long[] longArray = {};
        
        int actual = ArrayUtils.indexOf(longArray, -255L);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_26() {
        long[] longArray = {2L};
        
        int actual = ArrayUtils.indexOf(longArray, -253L);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_36() {
        int actual = ArrayUtils.indexOf(((long[]) null), -255L);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([J, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(long[],long)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArrayAndCornerCase4() {
        long[] longArray = {0L, java.lang.Long.MAX_VALUE, -1L};
        
        int actual = ArrayUtils.indexOf(longArray, java.lang.Long.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method indexOf([Ljava.lang.Object;, java.lang.Object, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (objectToFind == null): False}
    /// invoke:
    ///     {@link java.lang.Class#getComponentType()} once,
    ///     {@link java.lang.Class#isInstance(java.lang.Object)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.executesCondition {@code (array.getClass().getComponentType().isInstance(objectToFind)): False}
 *  */
    @Test
    public void testIndexOf_NotArrayGetClassGetComponentTypeIsInstance() {
        java.lang.Object[] objectArray = {null};
        
        int actual = ArrayUtils.indexOf(objectArray, objectArray, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero6() {
        java.lang.Object[] objectArray = {null};
        
        int actual = ArrayUtils.indexOf(objectArray, objectArray, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.executesCondition {@code (array.getClass().getComponentType().isInstance(objectToFind)): True}
 *  */
    @Test
    public void testIndexOf_ArrayGetClassGetComponentTypeIsInstance() {
        java.lang.Object[] objectArray = {};
        
        int actual = ArrayUtils.indexOf(objectArray, objectArray, -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method indexOf([Ljava.lang.Object;, java.lang.Object, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (objectToFind == null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_ReturnINDEX_NOT_FOUND() {
        java.lang.Object[] objectArray = {};
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) null), 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_IOfArrayEqualsNull() {
        java.lang.Object[] objectArray = {null};
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) null), 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero5() {
        java.lang.Object[] objectArray = {null};
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) null), -1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([Ljava.lang.Object;, java.lang.Object, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object,int)}
     */
    @Test
    public void testIndexOfWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        Object object3 = new Object();
        
        int actual = ArrayUtils.indexOf(objectArray, object3, 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf([Ljava.lang.Object;, java.lang.Object, int)
    
    @Test
    public void testIndexOf4() {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        int actual = ArrayUtils.indexOf(objectArray, objectArray, 0);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf5() {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        int actual = ArrayUtils.indexOf(objectArray, objectArray, Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf6() {
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) null), Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf7() {
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) null), 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([Ljava.lang.Object;, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf7() {
        java.lang.Object[] objectArray = {};
        byte[] byteArray = {};
        
        int actual = ArrayUtils.indexOf(objectArray, byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_17() {
        java.lang.Object[] objectArray = {null};
        byte[] byteArray = {};
        
        int actual = ArrayUtils.indexOf(objectArray, byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_27() {
        java.lang.Object[] objectArray = {};
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) null));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_37() {
        java.lang.Object[] objectArray = {null};
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) null));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_4() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        Integer integer1 = 0;
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) integer1));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_5() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) null));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_6() {
        java.lang.Object[] objectArray = {null};
        Integer integer = 0;
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) integer));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([Ljava.lang.Object;, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(java.lang.Object[],java.lang.Object)}
     */
    @Test
    public void testIndexOfWithNonEmptyObjectArray1() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        Object object3 = new Object();
        
        int actual = ArrayUtils.indexOf(objectArray, object3);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf([Ljava.lang.Object;, java.lang.Object)
    
    @Test
    public void testIndexOf8() {
        java.lang.Object[] objectArray = new java.lang.Object[17];
        Integer integer = 0;
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) integer));
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf9() {
        java.lang.Object[] objectArray = new java.lang.Object[17];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        Integer integer1 = 1;
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) integer1));
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf10() {
        java.lang.Object[] objectArray = new java.lang.Object[17];
        Character character = '\u0000';
        objectArray[0] = ((Object) character);
        Character character1 = '\u0000';
        
        int actual = ArrayUtils.indexOf(objectArray, ((Object) character1));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([S, short)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf8() {
        short[] shortArray = {(short) -255};
        
        int actual = ArrayUtils.indexOf(shortArray, (short) -255);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_18() {
        short[] shortArray = {};
        
        int actual = ArrayUtils.indexOf(shortArray, (short) -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_28() {
        short[] shortArray = {(short) -255};
        
        int actual = ArrayUtils.indexOf(shortArray, (short) -254);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ReturnIndexOf_38() {
        int actual = ArrayUtils.indexOf(((short[]) null), (short) -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([S, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArrayAndCornerCase5() {
        short[] shortArray = {(short) 0, java.lang.Short.MAX_VALUE, (short) -1};
        
        int actual = ArrayUtils.indexOf(shortArray, java.lang.Short.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([S, short, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero7() {
        short[] shortArray = {};
        
        int actual = ArrayUtils.indexOf(shortArray, (short) -255, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero6() {
        short[] shortArray = {};
        
        int actual = ArrayUtils.indexOf(shortArray, (short) -255, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindEqualsIOfArray6() {
        short[] shortArray = {(short) -255};
        
        int actual = ArrayUtils.indexOf(shortArray, (short) -255, -1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindNotEqualsIOfArray6() {
        short[] shortArray = {(short) -255};
        
        int actual = ArrayUtils.indexOf(shortArray, (short) -254, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testIndexOf_ArrayEqualsNull3() {
        int actual = ArrayUtils.indexOf(((short[]) null), (short) -255, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([S, short, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(short[],short,int)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArray5() {
        short[] shortArray = {(short) 1, (short) 0, (short) -1};
        
        int actual = ArrayUtils.indexOf(shortArray, (short) 1, 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([D, double, int, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int,double)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero8() {
        double[] doubleArray = {0.0, 0.0};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, 129, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int,double)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_IOfArrayLessOrEqualMax() {
        double[] doubleArray = {2.225073858507202E-308};
        
        int actual = ArrayUtils.indexOf(doubleArray, 2.225073858507202E-308, 0, 0.0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int,double)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_IOfArrayLessOrEqualMax_1() {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.POSITIVE_INFINITY, -1, -0.0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int,double)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_IOfArrayLessThanMin() {
        double[] doubleArray = {java.lang.Double.NaN};
        
        int actual = ArrayUtils.indexOf(doubleArray, 2.0927902483201506E298, 0, 2.5412829985060325E288);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(double[],double,int,double)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_IOfArrayGreaterThanMax() {
        double[] doubleArray = {-2.604693137843693E238};
        
        int actual = ArrayUtils.indexOf(doubleArray, -2.604704393599862E238, -1, -1.1255756169184658E233);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([D, double, int, double)
    
    @Test
    public void testIndexOfByFuzzer() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, 0, 1.0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf([D, double, int, double)
    
    @Test
    public void testIndexOf11() {
        double[] doubleArray = {
            2.903303192590591E-268, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        int actual = ArrayUtils.indexOf(doubleArray, 2.255502051371233E-307, Integer.MIN_VALUE, -1.3297609466613953E-308);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf12() {
        double[] doubleArray = {};
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, 0, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf13() {
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, Integer.MIN_VALUE, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf14() {
        double[] doubleArray = {
            -6.507336079353195, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        int actual = ArrayUtils.indexOf(doubleArray, -256.3822338586765, 0, -249.8748977793233);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf15() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        int actual = ArrayUtils.indexOf(doubleArray, java.lang.Double.NaN, 0, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([I, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(int[],int)}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#indexOf(int[],int,int)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0);}
 *  */
    @Test
    public void testIndexOf_ArrayUtilsIndexOf() {
        int[] intArray = {1};
        
        int actual = ArrayUtils.indexOf(intArray, 1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([I, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(int[],int)}
     */
    @Test
    public void testIndexOfWithNonEmptyPrimitiveArrayAndCornerCase6() {
        int[] intArray = {0, Integer.MAX_VALUE, -1};
        
        int actual = ArrayUtils.indexOf(intArray, Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf([I, int)
    
    @Test
    public void testIndexOf16() {
        int[] intArray = {};
        
        int actual = ArrayUtils.indexOf(intArray, 0);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf17() {
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        int actual = ArrayUtils.indexOf(intArray, 1);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf18() {
        int actual = ArrayUtils.indexOf(((int[]) null), 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf([I, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 *  */
    @Test
    public void testIndexOf_StartIndexGreaterOrEqualZero9() {
        int[] intArray = {};
        
        int actual = ArrayUtils.indexOf(intArray, -255, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testIndexOf_StartIndexLessThanZero7() {
        int[] intArray = {};
        
        int actual = ArrayUtils.indexOf(intArray, -255, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindEqualsIOfArray7() {
        int[] intArray = {1};
        
        int actual = ArrayUtils.indexOf(intArray, 1, -1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i < array.length; i++)} once
 *  */
    @Test
    public void testIndexOf_ValueToFindNotEqualsIOfArray7() {
        int[] intArray = {1};
        
        int actual = ArrayUtils.indexOf(intArray, -255, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testIndexOf_ArrayEqualsNull4() {
        int actual = ArrayUtils.indexOf(((int[]) null), -255, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method indexOf([I, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#indexOf(int[],int,int)}
     */
    @Test
    public void testIndexOfReturnsOneWithNonEmptyPrimitiveArrayAndCornerCase() {
        int[] intArray = {Integer.MIN_VALUE, 1, -1};
        
        int actual = ArrayUtils.indexOf(intArray, 1, 0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([D, double, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,double)}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int,double)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE, tolerance);}
 *  */
    @Test
    public void testLastIndexOf_ArrayUtilsLastIndexOf() {
        int actual = ArrayUtils.lastIndexOf(((double[]) null), java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([D, double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,double)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCases() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 0.0, -1.0};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastIndexOf([D, double, double)
    
    @Test
    public void testLastIndexOf1() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testLastIndexOf2() {
        double[] doubleArray = new double[16];
        doubleArray[15] = 4.4000948518045106E154;
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, 4.4416665928577395E154, 4.157174105322886E152);
        
        assertEquals(15, actual);
    }
    
    @Test
    public void testLastIndexOf3() {
        double[] doubleArray = {};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testLastIndexOf4() {
        double[] doubleArray = {-1.7312964763733292E-154};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, -37970.016969919336, 1.2655658723106171);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testLastIndexOf5() {
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 2.7597575144465586E-308
        };
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, -163.50812148727712, -4.749813083908579);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method lastIndexOf([D, double, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero() {
        double[] doubleArray = {0.0};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayUtilsIsEmpty() {
        double[] doubleArray = {};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayUtilsIsEmpty_1() {
        int actual = ArrayUtils.lastIndexOf(((double[]) null), java.lang.Double.NaN, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method lastIndexOf([D, double, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (ArrayUtils.isEmpty(array)): False},
    ///     {@code (startIndex < 0): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int)}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindEqualsIOfArray() {
        double[] doubleArray = {-2.2250738585072014E-308};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, -2.2250738585072014E-308, 256);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int)}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanArrayLength() {
        double[] doubleArray = {7.836435417956776E-295};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, 7.836435417956776E-295, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int)}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindNotEqualsIOfArray() {
        double[] doubleArray = {0.0};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, 2);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([D, double, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCases1() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method lastIndexOf([Z, boolean, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero1() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, false, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayUtilsIsEmpty1() {
        boolean[] booleanArray = {};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, false, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayUtilsIsEmpty_11() {
        int actual = ArrayUtils.lastIndexOf(((boolean[]) null), false, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method lastIndexOf([Z, boolean, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (ArrayUtils.isEmpty(array)): False},
    ///     {@code (startIndex < 0): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_StartIndexGreaterOrEqualArrayLength() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, false, 2);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindEqualsIOfArray1() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, false, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean,int)}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindNotEqualsIOfArray1() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, true, 0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([Z, boolean, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArray() {
        boolean[] booleanArray = {false, false, true};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, true, -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([Z, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, false);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_1() {
        boolean[] booleanArray = {};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, false);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_2() {
        boolean[] booleanArray = {false};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, true);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_3() {
        int actual = ArrayUtils.lastIndexOf(((boolean[]) null), false);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([Z, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean)}
     */
    @Test
    public void testLastIndexOfReturnsZeroWithNonEmptyPrimitiveArray() {
        boolean[] booleanArray = {false, true, true};
        
        int actual = ArrayUtils.lastIndexOf(booleanArray, false);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method lastIndexOf([F, float, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero2() {
        float[] floatArray = {0.0f};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, java.lang.Float.NaN, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayUtilsIsEmpty2() {
        float[] floatArray = {};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, java.lang.Float.NaN, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float,int)}
 * @utbot.executesCondition {@code (ArrayUtils.isEmpty(array)): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayUtilsIsEmpty_12() {
        int actual = ArrayUtils.lastIndexOf(((float[]) null), java.lang.Float.NaN, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method lastIndexOf([F, float, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (ArrayUtils.isEmpty(array)): False},
    ///     {@code (startIndex < 0): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float,int)}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindEqualsIOfArray2() {
        float[] floatArray = {0.0f};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, -0.0f, 256);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float,int)}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanArrayLength1() {
        float[] floatArray = {4.814825E-34f};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, 4.814825E-34f, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float,int)}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindNotEqualsIOfArray2() {
        float[] floatArray = {-5.369185E-29f};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, 1.0000886E-37f, 256);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([F, float, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCases2() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, java.lang.Float.NaN, Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([F, float)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf1() {
        float[] floatArray = {};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, java.lang.Float.NaN);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_11() {
        float[] floatArray = {1.4E-45f};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, 1.4E-45f);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_21() {
        float[] floatArray = {-1.7632417E-38f};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, 12.0f);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_31() {
        int actual = ArrayUtils.lastIndexOf(((float[]) null), java.lang.Float.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([F, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(float[],float)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArray1() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        int actual = ArrayUtils.lastIndexOf(floatArray, 1.3292282E36f);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([D, double, int, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int,double)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero3() {
        double[] doubleArray = {0.0};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, -1, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int,double)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_IOfArrayLessOrEqualMax() {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.POSITIVE_INFINITY, 0, -17.03125);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double,int,double)}
 *  */
    @Test
    public void testLastIndexOf_ReturnINDEX_NOT_FOUND() {
        double[] doubleArray = {};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, -255, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([D, double, int, double)
    
    @Test
    public void testLastIndexOfByFuzzer() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, Integer.MAX_VALUE, 1.0);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastIndexOf([D, double, int, double)
    
    @Test
    public void testLastIndexOf6() {
        double[] doubleArray = new double[16];
        doubleArray[15] = 5.363123171977039E154;
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, -5.945781513191911E76, 1073741824, -2.7891117429814974E77);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testLastIndexOf7() {
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, 1073741824, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testLastIndexOf8() {
        double[] doubleArray = {6.406274508999188E-272};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, -1.0012207627296448, 0, -0.9666977487357825);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testLastIndexOf9() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN, 0, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testLastIndexOf10() {
        int actual = ArrayUtils.lastIndexOf(null, java.lang.Double.NaN, 0, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([J, long, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero4() {
        long[] longArray = {-255L};
        
        int actual = ArrayUtils.lastIndexOf(longArray, -255L, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexGreaterOrEqualArrayLength1() {
        long[] longArray = {};
        
        int actual = ArrayUtils.lastIndexOf(longArray, -255L, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindEqualsIOfArray3() {
        long[] longArray = {-255L, -255L};
        
        int actual = ArrayUtils.lastIndexOf(longArray, -255L, 129);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindEqualsIOfArray_1() {
        long[] longArray = {-255L};
        
        int actual = ArrayUtils.lastIndexOf(longArray, -255L, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindNotEqualsIOfArray3() {
        long[] longArray = {-255L};
        
        int actual = ArrayUtils.lastIndexOf(longArray, -254L, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayEqualsNull() {
        int actual = ArrayUtils.lastIndexOf(((long[]) null), -255L, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([J, long, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCase() {
        long[] longArray = {4294967295L, -549755813889L, 0L};
        
        int actual = ArrayUtils.lastIndexOf(longArray, 1L, Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([I, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf2() {
        int[] intArray = {};
        
        int actual = ArrayUtils.lastIndexOf(intArray, -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_12() {
        int[] intArray = {1};
        
        int actual = ArrayUtils.lastIndexOf(intArray, -2);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_22() {
        int[] intArray = {-255};
        
        int actual = ArrayUtils.lastIndexOf(intArray, -255);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_32() {
        int actual = ArrayUtils.lastIndexOf(((int[]) null), -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([I, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCase1() {
        int[] intArray = {Integer.MAX_VALUE, Integer.MAX_VALUE, -1};
        
        int actual = ArrayUtils.lastIndexOf(intArray, Integer.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([I, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero5() {
        int[] intArray = {1};
        
        int actual = ArrayUtils.lastIndexOf(intArray, -255, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindEqualsIOfArray4() {
        int[] intArray = {1, 1};
        
        int actual = ArrayUtils.lastIndexOf(intArray, 1, 32);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanArrayLength2() {
        int[] intArray = {-255};
        
        int actual = ArrayUtils.lastIndexOf(intArray, -255, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexGreaterOrEqualArrayLength2() {
        int[] intArray = {};
        
        int actual = ArrayUtils.lastIndexOf(intArray, -255, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindNotEqualsIOfArray4() {
        int[] intArray = {1};
        
        int actual = ArrayUtils.lastIndexOf(intArray, -2, 2);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayEqualsNull1() {
        int actual = ArrayUtils.lastIndexOf(((int[]) null), -255, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([I, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(int[],int,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCase2() {
        int[] intArray = {0, 0, -1};
        
        int actual = ArrayUtils.lastIndexOf(intArray, Integer.MIN_VALUE, 1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([S, short)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf3() {
        short[] shortArray = {};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, (short) -255);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_13() {
        short[] shortArray = {(short) -255};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, (short) -254);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_23() {
        short[] shortArray = {(short) -255};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, (short) -255);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_33() {
        int actual = ArrayUtils.lastIndexOf(((short[]) null), (short) -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([S, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCase3() {
        short[] shortArray = {(short) -1, java.lang.Short.MAX_VALUE, (short) -1};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, java.lang.Short.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([J, long)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf4() {
        long[] longArray = {};
        
        int actual = ArrayUtils.lastIndexOf(longArray, -255L);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_14() {
        long[] longArray = {-255L};
        
        int actual = ArrayUtils.lastIndexOf(longArray, -255L);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_24() {
        long[] longArray = {-255L};
        
        int actual = ArrayUtils.lastIndexOf(longArray, -254L);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_34() {
        int actual = ArrayUtils.lastIndexOf(((long[]) null), -255L);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([J, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(long[],long)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCase4() {
        long[] longArray = {2147483647L, java.lang.Long.MAX_VALUE, -1L};
        
        int actual = ArrayUtils.lastIndexOf(longArray, java.lang.Long.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([Ljava.lang.Object;, java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.executesCondition {@code (objectToFind == null): False}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanArrayLength3() {
        java.lang.Object[] objectArray = {null};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, objectArray, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.executesCondition {@code (objectToFind == null): False}
 * @utbot.executesCondition {@code (array.getClass().getComponentType().isInstance(objectToFind)): False}
 *  */
    @Test
    public void testLastIndexOf_NotArrayGetClassGetComponentTypeIsInstance() {
        java.lang.Object[] objectArray = {};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, objectArray, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.executesCondition {@code (objectToFind == null): False}
 * @utbot.executesCondition {@code (array.getClass().getComponentType().isInstance(objectToFind)): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayGetClassGetComponentTypeIsInstance() {
        java.lang.Object[] objectArray = {};
        short[] shortArray = {};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, shortArray, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero6() {
        java.lang.Object[] objectArray = {null};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) null), -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.executesCondition {@code (objectToFind == null): True}
 *  */
    @Test
    public void testLastIndexOf_ObjectToFindEqualsNull() {
        java.lang.Object[] objectArray = {};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) null), 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.executesCondition {@code (objectToFind == null): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_IOfArrayEqualsNull() {
        java.lang.Object[] objectArray = {null, null};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) null), 129);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.executesCondition {@code (objectToFind == null): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_IOfArrayNotEqualsNull() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) null), 2);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.executesCondition {@code (objectToFind == null): False}
 * @utbot.executesCondition {@code (array.getClass().getComponentType().isInstance(objectToFind)): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_NotObjectToFindEquals() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        Integer integer1 = -1;
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) integer1), 2);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.executesCondition {@code (objectToFind == null): False}
 * @utbot.executesCondition {@code (array.getClass().getComponentType().isInstance(objectToFind)): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ObjectToFindEquals() {
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        objectArray[1] = ((Object) integer);
        Integer integer1 = 0;
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) integer1), 128);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([Ljava.lang.Object;, java.lang.Object, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        Object object3 = new Object();
        
        int actual = ArrayUtils.lastIndexOf(objectArray, object3, -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastIndexOf([Ljava.lang.Object;, java.lang.Object, int)
    
    @Test
    public void testLastIndexOf11() {
        java.lang.Object[] objectArray = new java.lang.Object[5];
        Integer integer = 0;
        objectArray[3] = ((Object) integer);
        Integer integer1 = 0;
        objectArray[4] = ((Object) integer1);
        Integer integer2 = 1;
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) integer2), 1073741824);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([Ljava.lang.Object;, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf5() {
        java.lang.Object[] objectArray = {};
        byte[] byteArray = {};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_15() {
        java.lang.Object[] objectArray = {null};
        byte[] byteArray = {};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_25() {
        java.lang.Object[] objectArray = {};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) null));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_35() {
        java.lang.Object[] objectArray = {null};
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) null));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_4() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        ArrayUtils arrayUtils = new ArrayUtils();
        objectArray[0] = ((Object) arrayUtils);
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) null));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_5() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        Integer integer1 = 0;
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) integer1));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_6() {
        java.lang.Object[] objectArray = {null};
        Integer integer = 0;
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) integer));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_7() {
        java.lang.Object[] objectArray = {null};
        Character character = '\u0000';
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) character));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_8() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Character character = '\u0000';
        objectArray[0] = ((Object) character);
        Character character1 = '\u0000';
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) character1));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([Ljava.lang.Object;, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(java.lang.Object[],java.lang.Object)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyObjectArray1() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        Object object3 = new Object();
        
        int actual = ArrayUtils.lastIndexOf(objectArray, object3);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastIndexOf([Ljava.lang.Object;, java.lang.Object)
    
    @Test
    public void testLastIndexOf12() {
        java.lang.Object[] objectArray = new java.lang.Object[5];
        Integer integer = 0;
        objectArray[3] = ((Object) integer);
        Integer integer1 = 0;
        objectArray[4] = ((Object) integer1);
        Integer integer2 = 1;
        
        int actual = ArrayUtils.lastIndexOf(objectArray, ((Object) integer2));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([D, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf6() {
        double[] doubleArray = {};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_16() {
        double[] doubleArray = {1.7800590868057674E-307};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, 1.7800590868057674E-307);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_26() {
        double[] doubleArray = {-4.124348071532665E-230};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, 524544.0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_36() {
        int actual = ArrayUtils.lastIndexOf(((double[]) null), java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([D, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(double[],double)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArray2() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        int actual = ArrayUtils.lastIndexOf(doubleArray, 1.1235582092889477E307);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([B, byte, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero7() {
        byte[] byteArray = {(byte) -127};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, (byte) -127, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindEqualsIOfArray5() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, (byte) -127, 129);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanArrayLength4() {
        byte[] byteArray = {(byte) -127};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, (byte) -127, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexGreaterOrEqualArrayLength3() {
        byte[] byteArray = {};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, (byte) -127, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindNotEqualsIOfArray5() {
        byte[] byteArray = {(byte) -127};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, (byte) -126, 2);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayEqualsNull2() {
        int actual = ArrayUtils.lastIndexOf(((byte[]) null), (byte) -127, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([B, byte, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCase5() {
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) -1};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, java.lang.Byte.MIN_VALUE, -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([B, byte)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf7() {
        byte[] byteArray = {};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, (byte) -127);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_17() {
        byte[] byteArray = {(byte) -127};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, (byte) -126);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_27() {
        byte[] byteArray = {(byte) -127};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, (byte) -127);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_37() {
        int actual = ArrayUtils.lastIndexOf(((byte[]) null), (byte) -127);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([B, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(byte[],byte)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCase6() {
        byte[] byteArray = {(byte) -1, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        int actual = ArrayUtils.lastIndexOf(byteArray, java.lang.Byte.MIN_VALUE);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([S, short, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero8() {
        short[] shortArray = {(short) -255};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, (short) -255, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindEqualsIOfArray6() {
        short[] shortArray = {(short) -255, (short) -255};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, (short) -255, 129);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanArrayLength5() {
        short[] shortArray = {(short) -255};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, (short) -255, 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexGreaterOrEqualArrayLength4() {
        short[] shortArray = {};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, (short) -255, 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindNotEqualsIOfArray6() {
        short[] shortArray = {(short) -255};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, (short) -254, 2);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayEqualsNull3() {
        int actual = ArrayUtils.lastIndexOf(((short[]) null), (short) -255, -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([S, short, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(short[],short,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArrayAndCornerCase7() {
        short[] shortArray = {(short) 0, (short) 0, (short) -1};
        
        int actual = ArrayUtils.lastIndexOf(shortArray, java.lang.Short.MIN_VALUE, -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([C, char)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf8() {
        char[] charArray = {};
        
        int actual = ArrayUtils.lastIndexOf(charArray, ' ');
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_18() {
        char[] charArray = {' '};
        
        int actual = ArrayUtils.lastIndexOf(charArray, '_');
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_28() {
        char[] charArray = {' '};
        
        int actual = ArrayUtils.lastIndexOf(charArray, ' ');
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char)}
 * @utbot.returnsFrom {@code return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testLastIndexOf_ReturnLastIndexOf_38() {
        int actual = ArrayUtils.lastIndexOf(((char[]) null), ' ');
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([C, char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArray3() {
        char[] charArray = {'\uFFFF', '?', ''};
        
        int actual = ArrayUtils.lastIndexOf(charArray, '@');
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.lastIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastIndexOf([C, char, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanZero9() {
        char[] charArray = {' '};
        
        int actual = ArrayUtils.lastIndexOf(charArray, ' ', -1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindEqualsIOfArray7() {
        char[] charArray = {' ', ' '};
        
        int actual = ArrayUtils.lastIndexOf(charArray, ' ', 65);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_StartIndexLessThanArrayLength6() {
        char[] charArray = {' '};
        
        int actual = ArrayUtils.lastIndexOf(charArray, ' ', 0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 *  */
    @Test
    public void testLastIndexOf_StartIndexGreaterOrEqualArrayLength5() {
        char[] charArray = {};
        
        int actual = ArrayUtils.lastIndexOf(charArray, ' ', 0);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndex < 0): False}
 * @utbot.executesCondition {@code (startIndex >= array.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = startIndex; i >= 0; i--)} once
 *  */
    @Test
    public void testLastIndexOf_ValueToFindNotEqualsIOfArray7() {
        char[] charArray = {' '};
        
        int actual = ArrayUtils.lastIndexOf(charArray, '_', 2);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char,int)}
 * @utbot.executesCondition {@code (array == null): True}
 *  */
    @Test
    public void testLastIndexOf_ArrayEqualsNull4() {
        int actual = ArrayUtils.lastIndexOf(((char[]) null), ' ', -255);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lastIndexOf([C, char, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(char[],char,int)}
     */
    @Test
    public void testLastIndexOfWithNonEmptyPrimitiveArray4() {
        char[] charArray = {'\u0000', '\u0000', '\uFFFF'};
        
        int actual = ArrayUtils.lastIndexOf(charArray, '@', -1);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty([I)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthNotEqualsZero() {
        int[] intArray = {1};
        
        boolean actual = ArrayUtils.isEmpty(intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthEqualsZero() {
        int[] intArray = {};
        
        boolean actual = ArrayUtils.isEmpty(intArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(int[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayEqualsNull() {
        boolean actual = ArrayUtils.isEmpty(((int[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(int[])}
     */
    @Test
    public void testIsEmptyReturnsFalseWithNonEmptyPrimitiveArray() {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        
        boolean actual = ArrayUtils.isEmpty(intArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty([S)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthNotEqualsZero1() {
        short[] shortArray = {(short) -255};
        
        boolean actual = ArrayUtils.isEmpty(shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthEqualsZero1() {
        short[] shortArray = {};
        
        boolean actual = ArrayUtils.isEmpty(shortArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayEqualsNull1() {
        boolean actual = ArrayUtils.isEmpty(((short[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty([S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(short[])}
     */
    @Test
    public void testIsEmptyReturnsFalseWithNonEmptyPrimitiveArray1() {
        short[] shortArray = {(short) 0, (short) -1, java.lang.Short.MAX_VALUE};
        
        boolean actual = ArrayUtils.isEmpty(shortArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty([C)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(char[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthNotEqualsZero2() {
        char[] charArray = {' '};
        
        boolean actual = ArrayUtils.isEmpty(charArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(char[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthEqualsZero2() {
        char[] charArray = {};
        
        boolean actual = ArrayUtils.isEmpty(charArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(char[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayEqualsNull2() {
        boolean actual = ArrayUtils.isEmpty(((char[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty([C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(char[])}
     */
    @Test
    public void testIsEmptyReturnsFalseWithNonEmptyPrimitiveArray2() {
        char[] charArray = {'\u0000', '', '?'};
        
        boolean actual = ArrayUtils.isEmpty(charArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty([J)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthNotEqualsZero3() {
        long[] longArray = {-255L};
        
        boolean actual = ArrayUtils.isEmpty(longArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthEqualsZero3() {
        long[] longArray = {};
        
        boolean actual = ArrayUtils.isEmpty(longArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayEqualsNull3() {
        boolean actual = ArrayUtils.isEmpty(((long[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty([J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(long[])}
     */
    @Test
    public void testIsEmptyReturnsFalseWithNonEmptyPrimitiveArray3() {
        long[] longArray = {0L, -1L, java.lang.Long.MAX_VALUE};
        
        boolean actual = ArrayUtils.isEmpty(longArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthNotEqualsZero4() {
        java.lang.Object[] objectArray = {null};
        
        boolean actual = ArrayUtils.isEmpty(objectArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthEqualsZero4() {
        java.lang.Object[] objectArray = {};
        
        boolean actual = ArrayUtils.isEmpty(objectArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayEqualsNull4() {
        boolean actual = ArrayUtils.isEmpty(((java.lang.Object[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(java.lang.Object[])}
     */
    @Test
    public void testIsEmptyReturnsFalseWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        boolean actual = ArrayUtils.isEmpty(objectArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty([Z)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthNotEqualsZero5() {
        boolean[] booleanArray = {false};
        
        boolean actual = ArrayUtils.isEmpty(booleanArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthEqualsZero5() {
        boolean[] booleanArray = {};
        
        boolean actual = ArrayUtils.isEmpty(booleanArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(boolean[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayEqualsNull5() {
        boolean actual = ArrayUtils.isEmpty(((boolean[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty([Z)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(boolean[])}
     */
    @Test
    public void testIsEmptyReturnsFalseWithNonEmptyPrimitiveArray4() {
        boolean[] booleanArray = {false, true, true};
        
        boolean actual = ArrayUtils.isEmpty(booleanArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty([F)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthNotEqualsZero6() {
        float[] floatArray = {0.0f};
        
        boolean actual = ArrayUtils.isEmpty(floatArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthEqualsZero6() {
        float[] floatArray = {};
        
        boolean actual = ArrayUtils.isEmpty(floatArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayEqualsNull6() {
        boolean actual = ArrayUtils.isEmpty(((float[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty([F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(float[])}
     */
    @Test
    public void testIsEmptyReturnsFalseWithNonEmptyPrimitiveArray5() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        boolean actual = ArrayUtils.isEmpty(floatArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty([D)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthNotEqualsZero7() {
        double[] doubleArray = {0.0};
        
        boolean actual = ArrayUtils.isEmpty(doubleArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthEqualsZero7() {
        double[] doubleArray = {};
        
        boolean actual = ArrayUtils.isEmpty(doubleArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayEqualsNull7() {
        boolean actual = ArrayUtils.isEmpty(((double[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(double[])}
     */
    @Test
    public void testIsEmptyReturnsFalseWithNonEmptyPrimitiveArray6() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        boolean actual = ArrayUtils.isEmpty(doubleArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty([B)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthNotEqualsZero8() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = ArrayUtils.isEmpty(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayLengthEqualsZero8() {
        byte[] byteArray = {};
        
        boolean actual = ArrayUtils.isEmpty(byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEmpty_ArrayEqualsNull8() {
        boolean actual = ArrayUtils.isEmpty(((byte[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEmpty(byte[])}
     */
    @Test
    public void testIsEmptyReturnsFalseWithNonEmptyPrimitiveArray7() {
        byte[] byteArray = {(byte) 0, (byte) -1, java.lang.Byte.MAX_VALUE};
        
        boolean actual = ArrayUtils.isEmpty(byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([F, float)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(float[],float)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND() {
        float[] floatArray = {};
        
        boolean actual = ArrayUtils.contains(floatArray, java.lang.Float.NaN);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(float[],float)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_1() {
        float[] floatArray = {1.4E-45f};
        
        boolean actual = ArrayUtils.contains(floatArray, 1.4E-45f);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(float[],float)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_2() {
        float[] floatArray = {-2.0000002f};
        
        boolean actual = ArrayUtils.contains(floatArray, 4.0f);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(float[],float)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_3() {
        boolean actual = ArrayUtils.contains(((float[]) null), java.lang.Float.NaN);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([F, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(float[],float)}
     */
    @Test
    public void testContainsReturnsFalseWithNonEmptyPrimitiveArray() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        boolean actual = ArrayUtils.contains(floatArray, 1.3292282E36f);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([I, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(int[],int)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND1() {
        int[] intArray = {};
        
        boolean actual = ArrayUtils.contains(intArray, -255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(int[],int)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_11() {
        int[] intArray = {1};
        
        boolean actual = ArrayUtils.contains(intArray, 1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(int[],int)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_21() {
        int[] intArray = {1};
        
        boolean actual = ArrayUtils.contains(intArray, -2);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(int[],int)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_31() {
        boolean actual = ArrayUtils.contains(((int[]) null), -255);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([I, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(int[],int)}
     */
    @Test
    public void testContainsReturnsFalseWithNonEmptyPrimitiveArray1() {
        int[] intArray = {0, Integer.MIN_VALUE, -1};
        
        boolean actual = ArrayUtils.contains(intArray, -2147483647);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([J, long)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(long[],long)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND2() {
        long[] longArray = {};
        
        boolean actual = ArrayUtils.contains(longArray, -255L);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(long[],long)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_12() {
        long[] longArray = {-255L};
        
        boolean actual = ArrayUtils.contains(longArray, -255L);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(long[],long)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_22() {
        long[] longArray = {-254L};
        
        boolean actual = ArrayUtils.contains(longArray, 3L);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(long[],long)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_32() {
        boolean actual = ArrayUtils.contains(((long[]) null), -255L);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([J, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(long[],long)}
     */
    @Test
    public void testContainsReturnsFalseWithNonEmptyPrimitiveArray2() {
        long[] longArray = {0L, java.lang.Long.MIN_VALUE, -1L};
        
        boolean actual = ArrayUtils.contains(longArray, -9223372036854775807L);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([Ljava.lang.Object;, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND3() {
        java.lang.Object[] objectArray = {};
        short[] shortArray = {};
        
        boolean actual = ArrayUtils.contains(objectArray, shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_13() {
        java.lang.Object[] objectArray = {null};
        byte[] byteArray = {};
        
        boolean actual = ArrayUtils.contains(objectArray, byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_23() {
        java.lang.Object[] objectArray = {};
        
        boolean actual = ArrayUtils.contains(objectArray, ((Object) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_33() {
        java.lang.Object[] objectArray = {null};
        
        boolean actual = ArrayUtils.contains(objectArray, ((Object) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_4() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        boolean actual = ArrayUtils.contains(objectArray, ((Object) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_5() {
        java.lang.Object[] objectArray = {null};
        Integer integer = 0;
        
        boolean actual = ArrayUtils.contains(objectArray, ((Object) integer));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_6() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Character character = '\u0000';
        objectArray[0] = ((Object) character);
        Character character1 = '\u0000';
        
        boolean actual = ArrayUtils.contains(objectArray, ((Object) character1));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(array, objectToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_7() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        Integer integer1 = 0;
        
        boolean actual = ArrayUtils.contains(objectArray, ((Object) integer1));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([Ljava.lang.Object;, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
     */
    @Test
    public void testContainsReturnsFalseWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        Object object3 = new Object();
        
        boolean actual = ArrayUtils.contains(objectArray, object3);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contains([Ljava.lang.Object;, java.lang.Object)
    
    @Test
    public void testContains1() {
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        Integer integer = 0;
        objectArray[1] = ((Object) integer);
        Class class1 = Object.class;
        objectArray[2] = ((Object) class1);
        objectArray[3] = ((Object) class1);
        objectArray[4] = ((Object) class1);
        objectArray[5] = ((Object) class1);
        objectArray[6] = ((Object) class1);
        objectArray[7] = ((Object) class1);
        objectArray[8] = ((Object) class1);
        Integer integer1 = 0;
        
        Object initialObjectArray2 = objectArray[2];
        Object initialObjectArray3 = objectArray[3];
        Object initialObjectArray4 = objectArray[4];
        Object initialObjectArray5 = objectArray[5];
        Object initialObjectArray6 = objectArray[6];
        Object initialObjectArray7 = objectArray[7];
        Object initialObjectArray8 = objectArray[8];
        
        boolean actual = ArrayUtils.contains(objectArray, ((Object) integer1));
        
        assertTrue(actual);
        
        Object finalObjectArray2 = objectArray[2];
        Object finalObjectArray3 = objectArray[3];
        Object finalObjectArray4 = objectArray[4];
        Object finalObjectArray5 = objectArray[5];
        Object finalObjectArray6 = objectArray[6];
        Object finalObjectArray7 = objectArray[7];
        Object finalObjectArray8 = objectArray[8];
        
        assertFalse(initialObjectArray2 == finalObjectArray2);
        
        assertFalse(initialObjectArray3 == finalObjectArray3);
        
        assertFalse(initialObjectArray4 == finalObjectArray4);
        
        assertFalse(initialObjectArray5 == finalObjectArray5);
        
        assertFalse(initialObjectArray6 == finalObjectArray6);
        
        assertFalse(initialObjectArray7 == finalObjectArray7);
        
        assertFalse(initialObjectArray8 == finalObjectArray8);
    }
    
    @Test
    public void testContains2() {
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Object object = new Object();
        objectArray[0] = object;
        Integer integer = 0;
        objectArray[1] = ((Object) integer);
        Integer integer1 = 1;
        objectArray[2] = ((Object) integer1);
        objectArray[3] = ((Object) integer1);
        objectArray[4] = ((Object) integer1);
        objectArray[5] = ((Object) integer1);
        objectArray[6] = ((Object) integer1);
        objectArray[7] = ((Object) integer1);
        objectArray[8] = ((Object) integer1);
        objectArray[9] = ((Object) integer1);
        objectArray[10] = ((Object) integer1);
        objectArray[11] = ((Object) integer1);
        objectArray[12] = ((Object) integer1);
        objectArray[13] = ((Object) integer1);
        objectArray[14] = ((Object) integer1);
        objectArray[15] = ((Object) integer1);
        objectArray[16] = ((Object) integer1);
        objectArray[17] = ((Object) integer1);
        objectArray[18] = ((Object) integer1);
        objectArray[19] = ((Object) integer1);
        objectArray[20] = ((Object) integer1);
        objectArray[21] = ((Object) integer1);
        objectArray[22] = ((Object) integer1);
        objectArray[23] = ((Object) integer1);
        objectArray[24] = ((Object) integer1);
        objectArray[25] = ((Object) integer1);
        objectArray[26] = ((Object) integer1);
        objectArray[27] = ((Object) integer1);
        objectArray[28] = ((Object) integer1);
        objectArray[29] = ((Object) integer1);
        objectArray[30] = ((Object) integer1);
        objectArray[31] = ((Object) integer1);
        
        boolean actual = ArrayUtils.contains(objectArray, ((Object) integer1));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([S, short)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(short[],short)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND4() {
        short[] shortArray = {};
        
        boolean actual = ArrayUtils.contains(shortArray, (short) -255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(short[],short)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_14() {
        short[] shortArray = {(short) -255};
        
        boolean actual = ArrayUtils.contains(shortArray, (short) -255);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(short[],short)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_24() {
        short[] shortArray = {(short) -255};
        
        boolean actual = ArrayUtils.contains(shortArray, (short) -254);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(short[],short)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_34() {
        boolean actual = ArrayUtils.contains(((short[]) null), (short) -255);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([S, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(short[],short)}
     */
    @Test
    public void testContainsReturnsFalseWithNonEmptyPrimitiveArray3() {
        short[] shortArray = {(short) 0, java.lang.Short.MIN_VALUE, (short) -1};
        
        boolean actual = ArrayUtils.contains(shortArray, (short) -32767);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([B, byte)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(byte[],byte)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND5() {
        byte[] byteArray = {};
        
        boolean actual = ArrayUtils.contains(byteArray, (byte) -127);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(byte[],byte)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_15() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = ArrayUtils.contains(byteArray, (byte) -127);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(byte[],byte)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_25() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = ArrayUtils.contains(byteArray, (byte) -126);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(byte[],byte)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_35() {
        boolean actual = ArrayUtils.contains(((byte[]) null), (byte) -127);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([B, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(byte[],byte)}
     */
    @Test
    public void testContainsReturnsFalseWithNonEmptyPrimitiveArray4() {
        byte[] byteArray = {(byte) 0, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        boolean actual = ArrayUtils.contains(byteArray, (byte) -127);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([D, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND6() {
        double[] doubleArray = {};
        
        boolean actual = ArrayUtils.contains(doubleArray, java.lang.Double.NaN);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_16() {
        double[] doubleArray = {1.0118E-320};
        
        boolean actual = ArrayUtils.contains(doubleArray, 1.0118E-320);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_26() {
        double[] doubleArray = {-2.2250738647239864E-308};
        
        boolean actual = ArrayUtils.contains(doubleArray, 8.000000022351742);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_36() {
        boolean actual = ArrayUtils.contains(((double[]) null), java.lang.Double.NaN);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([D, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double)}
     */
    @Test
    public void testContainsReturnsFalseWithNonEmptyPrimitiveArray5() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        boolean actual = ArrayUtils.contains(doubleArray, 1.1235582092889477E307);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([D, double, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double,double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND7() {
        double[] doubleArray = {};
        
        boolean actual = ArrayUtils.contains(doubleArray, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double,double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_17() {
        double[] doubleArray = {2.225073858508154E-308};
        
        boolean actual = ArrayUtils.contains(doubleArray, -3.16E-321, -2.22507385850847E-308);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double,double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_27() {
        double[] doubleArray = {-448.0078125};
        
        boolean actual = ArrayUtils.contains(doubleArray, -448.0078125, 4.0083367200179456E-292);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double,double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_37() {
        double[] doubleArray = {-3.689376962239581E19};
        
        boolean actual = ArrayUtils.contains(doubleArray, 3.8755340576174175, 0.0);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double,double)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_41() {
        boolean actual = ArrayUtils.contains(null, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([D, double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(double[],double,double)}
     */
    @Test
    public void testContainsReturnsFalseWithNonEmptyPrimitiveArrayAndCornerCases() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 0.0, -1.0};
        
        boolean actual = ArrayUtils.contains(doubleArray, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contains([D, double, double)
    
    @Test
    public void testContains3() {
        double[] doubleArray = {6.369233725730284E73, 0.0};
        
        boolean actual = ArrayUtils.contains(doubleArray, -5.193489607127512E62, 5.1934228458422365E62);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains4() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        boolean actual = ArrayUtils.contains(doubleArray, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([Z, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(boolean[],boolean)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND8() {
        boolean[] booleanArray = {false};
        
        boolean actual = ArrayUtils.contains(booleanArray, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(boolean[],boolean)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_18() {
        boolean[] booleanArray = {};
        
        boolean actual = ArrayUtils.contains(booleanArray, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(boolean[],boolean)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_28() {
        boolean[] booleanArray = {true, false};
        
        boolean actual = ArrayUtils.contains(booleanArray, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(boolean[],boolean)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_38() {
        boolean[] booleanArray = {false};
        
        boolean actual = ArrayUtils.contains(booleanArray, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(boolean[],boolean)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_42() {
        boolean actual = ArrayUtils.contains(((boolean[]) null), false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([Z, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(boolean[],boolean)}
     */
    @Test
    public void testContainsReturnsTrueWithNonEmptyPrimitiveArray() {
        boolean[] booleanArray = {false, true, true};
        
        boolean actual = ArrayUtils.contains(booleanArray, false);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains([C, char)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(char[],char)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND9() {
        char[] charArray = {};
        
        boolean actual = ArrayUtils.contains(charArray, ' ');
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(char[],char)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_19() {
        char[] charArray = {' '};
        
        boolean actual = ArrayUtils.contains(charArray, ' ');
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(char[],char)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_29() {
        char[] charArray = {' '};
        
        boolean actual = ArrayUtils.contains(charArray, '_');
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(char[],char)}
 * @utbot.returnsFrom {@code return indexOf(array, valueToFind) != INDEX_NOT_FOUND;}
 *  */
    @Test
    public void testContains_ReturnIndexOfEqualsINDEX_NOT_FOUND_39() {
        boolean actual = ArrayUtils.contains(((char[]) null), ' ');
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains([C, char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#contains(char[],char)}
     */
    @Test
    public void testContainsReturnsFalseWithNonEmptyPrimitiveArray6() {
        char[] charArray = {'\u0000', '@', ''};
        
        boolean actual = ArrayUtils.contains(charArray, 'A');
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll([F, [F)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return joinedArray;}
 *  */
    @Test
    public void testAddAll_Array2NotEqualsNull() {
        float[] floatArray = {};
        float[] floatArray1 = {};
        
        float[] actual = ArrayUtils.addAll(floatArray, floatArray1);
        
        float[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull() {
        float[] floatArray = {};
        
        float[] actual = ArrayUtils.addAll(((float[]) null), floatArray);
        
        float[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(float[])}
 * @utbot.returnsFrom {@code return clone(array1);}
 *  */
    @Test
    public void testAddAll_Array2EqualsNull() {
        float[] floatArray = {};
        
        float[] actual = ArrayUtils.addAll(floatArray, ((float[]) null));
        
        float[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull_1() {
        float[] actual = ArrayUtils.addAll(((float[]) null), ((float[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll([F, [F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(float[],float[])}
     */
    @Test
    public void testAddAllWithNonEmptyPrimitiveArrays() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        float[] floatArray1 = {java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.NEGATIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY};
        
        float[] actual = ArrayUtils.addAll(floatArray, floatArray1);
        
        float[] expected = {
            0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.NEGATIVE_INFINITY,
            java.lang.Float.POSITIVE_INFINITY
        };
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll([J, [J)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return joinedArray;}
 *  */
    @Test
    public void testAddAll_Array2NotEqualsNull1() {
        long[] longArray = {};
        long[] longArray1 = {};
        
        long[] actual = ArrayUtils.addAll(longArray, longArray1);
        
        long[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull1() {
        long[] longArray = {};
        
        long[] actual = ArrayUtils.addAll(((long[]) null), longArray);
        
        long[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(long[])}
 * @utbot.returnsFrom {@code return clone(array1);}
 *  */
    @Test
    public void testAddAll_Array2EqualsNull1() {
        long[] longArray = {};
        
        long[] actual = ArrayUtils.addAll(longArray, ((long[]) null));
        
        long[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull_11() {
        long[] actual = ArrayUtils.addAll(((long[]) null), ((long[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll([J, [J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(long[],long[])}
     */
    @Test
    public void testAddAllWithNonEmptyPrimitiveArrays1() {
        long[] longArray = {0L, java.lang.Long.MAX_VALUE, -1L};
        long[] longArray1 = {1L, 1L, java.lang.Long.MAX_VALUE, 1L};
        
        long[] actual = ArrayUtils.addAll(longArray, longArray1);
        
        long[] expected = {0L, java.lang.Long.MAX_VALUE, -1L, 1L, 1L, java.lang.Long.MAX_VALUE, 1L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll([Ljava.lang.Object;, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull2() {
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = ArrayUtils.addAll(((java.lang.Object[]) null), objectArray);
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(java.lang.Object[])}
 * @utbot.returnsFrom {@code return clone(array1);}
 *  */
    @Test
    public void testAddAll_Array2EqualsNull2() {
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = ArrayUtils.addAll(objectArray, ((java.lang.Object[]) null));
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull_12() {
        java.lang.Object[] actual = ArrayUtils.addAll(((java.lang.Object[]) null), ((java.lang.Object[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll([Ljava.lang.Object;, [Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(java.lang.Object[],java.lang.Object[])}
     */
    @Test
    public void testAddAllWithNonEmptyObjectArrays() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        java.lang.Object[] objectArray1 = new java.lang.Object[4];
        Object object3 = new Object();
        objectArray1[0] = object3;
        Object object4 = new Object();
        objectArray1[1] = object4;
        Object object5 = new Object();
        objectArray1[2] = object5;
        Object object6 = new Object();
        objectArray1[3] = object6;
        
        java.lang.Object[] actual = ArrayUtils.addAll(objectArray, objectArray1);
        
        java.lang.Object[] expected = new java.lang.Object[7];
        expected[0] = object;
        expected[1] = object1;
        expected[2] = object2;
        expected[3] = object3;
        expected[4] = object4;
        expected[5] = object5;
        expected[6] = object6;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll([Ljava.lang.Object;, [Ljava.lang.Object;)
    
    @Test
    public void testAddAll1() {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        java.lang.Object[] actual = ArrayUtils.addAll(objectArray, objectArray);
        
        java.lang.Object[] expected = new java.lang.Object[18];
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testAddAll2() {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        java.lang.Object[] actual = ArrayUtils.addAll(objectArray, objectArray);
        
        java.lang.Object[] expected = new java.lang.Object[18];
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region Errors report for addAll
    
    public void testAddAll_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll([D, [D)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return joinedArray;}
 *  */
    @Test
    public void testAddAll_Array2NotEqualsNull2() {
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        double[] actual = ArrayUtils.addAll(doubleArray, doubleArray1);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull3() {
        double[] doubleArray = {};
        
        double[] actual = ArrayUtils.addAll(((double[]) null), doubleArray);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(double[])}
 * @utbot.returnsFrom {@code return clone(array1);}
 *  */
    @Test
    public void testAddAll_Array2EqualsNull3() {
        double[] doubleArray = {1.58E-322};
        
        double[] actual = ArrayUtils.addAll(doubleArray, ((double[]) null));
        
        double[] expected = {1.58E-322};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull_13() {
        double[] actual = ArrayUtils.addAll(((double[]) null), ((double[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(double[],double[])}
     */
    @Test
    public void testAddAllWithNonEmptyPrimitiveArrays2() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        
        double[] actual = ArrayUtils.addAll(doubleArray, doubleArray1);
        
        double[] expected = {
            0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY,
            java.lang.Double.POSITIVE_INFINITY
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll([I, [I)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return joinedArray;}
 *  */
    @Test
    public void testAddAll_Array2NotEqualsNull3() {
        int[] intArray = {};
        int[] intArray1 = {};
        
        int[] actual = ArrayUtils.addAll(intArray, intArray1);
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(int[])}
 * @utbot.returnsFrom {@code return clone(array1);}
 *  */
    @Test
    public void testAddAll_Array2EqualsNull4() {
        int[] intArray = {};
        
        int[] actual = ArrayUtils.addAll(intArray, ((int[]) null));
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(int[])}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull4() {
        int[] actual = ArrayUtils.addAll(((int[]) null), ((int[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll([I, [I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(int[],int[])}
     */
    @Test
    public void testAddAllWithNonEmptyPrimitiveArrays3() {
        int[] intArray = {0, Integer.MAX_VALUE, -1};
        int[] intArray1 = {1, 1, Integer.MAX_VALUE, 1};
        
        int[] actual = ArrayUtils.addAll(intArray, intArray1);
        
        int[] expected = {0, Integer.MAX_VALUE, -1, 1, 1, Integer.MAX_VALUE, 1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll([S, [S)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return joinedArray;}
 *  */
    @Test
    public void testAddAll_Array2NotEqualsNull4() {
        short[] shortArray = {};
        short[] shortArray1 = {};
        
        short[] actual = ArrayUtils.addAll(shortArray, shortArray1);
        
        short[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull5() {
        short[] shortArray = {};
        
        short[] actual = ArrayUtils.addAll(((short[]) null), shortArray);
        
        short[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(short[])}
 * @utbot.returnsFrom {@code return clone(array1);}
 *  */
    @Test
    public void testAddAll_Array2EqualsNull5() {
        short[] shortArray = {};
        
        short[] actual = ArrayUtils.addAll(shortArray, ((short[]) null));
        
        short[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull_14() {
        short[] actual = ArrayUtils.addAll(((short[]) null), ((short[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll([S, [S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(short[],short[])}
     */
    @Test
    public void testAddAllWithNonEmptyPrimitiveArrays4() {
        short[] shortArray = {(short) 0, java.lang.Short.MAX_VALUE, (short) -1};
        short[] shortArray1 = {(short) 1, (short) 1, java.lang.Short.MAX_VALUE, (short) 1};
        
        short[] actual = ArrayUtils.addAll(shortArray, shortArray1);
        
        short[] expected = {
            (short) 0, java.lang.Short.MAX_VALUE, (short) -1, (short) 1, (short) 1, java.lang.Short.MAX_VALUE,
            (short) 1
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll([B, [B)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return joinedArray;}
 *  */
    @Test
    public void testAddAll_Array2NotEqualsNull5() {
        byte[] byteArray = {};
        byte[] byteArray1 = {};
        
        byte[] actual = ArrayUtils.addAll(byteArray, byteArray1);
        
        byte[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(byte[])}
 * @utbot.returnsFrom {@code return clone(array1);}
 *  */
    @Test
    public void testAddAll_Array2EqualsNull6() {
        byte[] byteArray = {};
        
        byte[] actual = ArrayUtils.addAll(byteArray, ((byte[]) null));
        
        byte[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(byte[])}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull6() {
        byte[] actual = ArrayUtils.addAll(((byte[]) null), ((byte[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll([B, [B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(byte[],byte[])}
     */
    @Test
    public void testAddAllWithNonEmptyPrimitiveArrays5() {
        byte[] byteArray = {(byte) 0, java.lang.Byte.MAX_VALUE, (byte) -1};
        byte[] byteArray1 = {(byte) 1, (byte) 1, java.lang.Byte.MAX_VALUE, (byte) 1};
        
        byte[] actual = ArrayUtils.addAll(byteArray, byteArray1);
        
        byte[] expected = {(byte) 0, java.lang.Byte.MAX_VALUE, (byte) -1, (byte) 1, (byte) 1, java.lang.Byte.MAX_VALUE, (byte) 1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll([C, [C)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return joinedArray;}
 *  */
    @Test
    public void testAddAll_Array2NotEqualsNull6() {
        char[] charArray = {};
        char[] charArray1 = {};
        
        char[] actual = ArrayUtils.addAll(charArray, charArray1);
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(char[])}
 * @utbot.returnsFrom {@code return clone(array1);}
 *  */
    @Test
    public void testAddAll_Array2EqualsNull7() {
        char[] charArray = {};
        
        char[] actual = ArrayUtils.addAll(charArray, ((char[]) null));
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(char[])}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull7() {
        char[] actual = ArrayUtils.addAll(((char[]) null), ((char[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll([C, [C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(char[],char[])}
     */
    @Test
    public void testAddAllWithNonEmptyPrimitiveArrays6() {
        char[] charArray = {'\u0000', '?', ''};
        char[] charArray1 = {'\u0001', '\u0001', '?', '\u0001'};
        
        char[] actual = ArrayUtils.addAll(charArray, charArray1);
        
        char[] expected = {'\u0000', '?', '', '\u0001', '\u0001', '?', '\u0001'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll([Z, [Z)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return joinedArray;}
 *  */
    @Test
    public void testAddAll_Array2NotEqualsNull7() {
        boolean[] booleanArray = {};
        boolean[] booleanArray1 = {};
        
        boolean[] actual = ArrayUtils.addAll(booleanArray, booleanArray1);
        
        boolean[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull8() {
        boolean[] booleanArray = {};
        
        boolean[] actual = ArrayUtils.addAll(((boolean[]) null), booleanArray);
        
        boolean[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.invokes {@link org.apache.commons.lang3.ArrayUtils#clone(boolean[])}
 * @utbot.returnsFrom {@code return clone(array1);}
 *  */
    @Test
    public void testAddAll_Array2EqualsNull8() {
        boolean[] booleanArray = {};
        
        boolean[] actual = ArrayUtils.addAll(booleanArray, ((boolean[]) null));
        
        boolean[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.returnsFrom {@code return clone(array2);}
 *  */
    @Test
    public void testAddAll_Array1EqualsNull_15() {
        boolean[] actual = ArrayUtils.addAll(((boolean[]) null), ((boolean[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll([Z, [Z)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#addAll(boolean[],boolean[])}
     */
    @Test
    public void testAddAllWithNonEmptyPrimitiveArrays7() {
        boolean[] booleanArray = {false, true, true};
        boolean[] booleanArray1 = {false, true, false, true};
        
        boolean[] actual = ArrayUtils.addAll(booleanArray, booleanArray1);
        
        boolean[] expected = {
            false, true, true, false, true, false,
            true
        };
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toMap([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toMap(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.returnsFrom {@code return map;}
 *  */
    @Test
    public void testToMap_ArrayNotEqualsNull() {
        java.lang.Object[] objectArray = {};
        
        HashMap actual = ((HashMap) ArrayUtils.toMap(objectArray));
        
        HashMap expected = new HashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toMap(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToMap_ArrayEqualsNull() {
        Map actual = ArrayUtils.toMap(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toMap(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return map;}
 *  */
    @Test
    public void testToMap_ObjectInstanceOfMapEntry() throws Exception  {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object keyValueHolder = createInstance("java.util.KeyValueHolder");
        byte[] key = {};
        setField(keyValueHolder, "java.util.KeyValueHolder", "key", key);
        setField(keyValueHolder, "java.util.KeyValueHolder", "value", key);
        objectArray[0] = keyValueHolder;
        
        HashMap actual = ((HashMap) ArrayUtils.toMap(objectArray));
        
        HashMap expected = new HashMap();
        expected.put(key, key);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toMap([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toMap(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: object instanceof Object[]
 *  */
    @Test
    public void testToMap_ThrowIllegalArgumentException() {
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toMap] produces [java.lang.IllegalArgumentException: Array element 0, 'null', is neither of type Map.Entry nor an Array]
            org.apache.commons.lang3.ArrayUtils.toMap(ArrayUtils.java:8961) */
        ArrayUtils.toMap(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toMap(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: entry.length < 2
 *  */
    @Test
    public void testToMap_ThrowIllegalArgumentException_1() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toMap] produces [java.lang.IllegalArgumentException: Array element 0, 'java.lang.Object@63dd4996', is neither of type Map.Entry nor an Array]
            org.apache.commons.lang3.ArrayUtils.toMap(ArrayUtils.java:8961) */
        ArrayUtils.toMap(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toMap(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return map;}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return map;
 *  */
    @Test
    public void testToMap_ThrowIllegalArgumentException_2() {
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toMap] produces [java.lang.IllegalArgumentException: Array element 0, 'java.lang.Object@5df3cb06', is neither of type Map.Entry nor an Array]
            org.apache.commons.lang3.ArrayUtils.toMap(ArrayUtils.java:8961) */
        ArrayUtils.toMap(objectArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method toMap([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toMap(java.lang.Object[])}
     */
    @Test
    public void testToMapThrowsIAEWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toMap] produces [java.lang.IllegalArgumentException: Array element 0, 'java.lang.Object@3bf8852f', is neither of type Map.Entry nor an Array]
            org.apache.commons.lang3.ArrayUtils.toMap(ArrayUtils.java:8961) */
        ArrayUtils.toMap(objectArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toMap([Ljava.lang.Object;)
    
    @Test
    public void testToMap1() {
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toMap] produces [java.lang.IllegalArgumentException: Array element 0, 'java.lang.Object@500325f7', is neither of type Map.Entry nor an Array]
            org.apache.commons.lang3.ArrayUtils.toMap(ArrayUtils.java:8961) */
        ArrayUtils.toMap(objectArray);
    }
    
    @Test
    public void testToMap2() {
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        objectArray[2] = object1;
        objectArray[3] = object1;
        objectArray[4] = object1;
        objectArray[5] = object1;
        objectArray[6] = object1;
        objectArray[7] = object1;
        objectArray[8] = object1;
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toMap] produces [java.lang.IllegalArgumentException: Array element 0, 'java.lang.Object@63e2d636', is neither of type Map.Entry nor an Array]
            org.apache.commons.lang3.ArrayUtils.toMap(ArrayUtils.java:8961) */
        ArrayUtils.toMap(objectArray);
    }
    
    @Test
    public void testToMap3() throws Exception  {
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object keyValueHolder = createInstance("java.util.KeyValueHolder");
        Object key = createInstance("java.lang.Object");
        setField(keyValueHolder, "java.util.KeyValueHolder", "key", key);
        setField(keyValueHolder, "java.util.KeyValueHolder", "value", key);
        objectArray[0] = keyValueHolder;
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toMap] produces [java.lang.IllegalArgumentException: Array element 1, 'null', is neither of type Map.Entry nor an Array]
            org.apache.commons.lang3.ArrayUtils.toMap(ArrayUtils.java:8961) */
        ArrayUtils.toMap(objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([S)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull() {
        short[] shortArray = {(short) -255};
        
        ArrayUtils.reverse(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull_1() {
        short[] shortArray = {(short) -255, (short) -255};
        
        ArrayUtils.reverse(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReverse_ArrayEqualsNull() {
        ArrayUtils.reverse(((short[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(short[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray() {
        short[] shortArray = {(short) -1, (short) -1, (short) 1};
        
        ArrayUtils.reverse(shortArray);
        
        short finalShortArray0 = shortArray[0];
        short finalShortArray2 = shortArray[2];
        
        assertEquals((short) 1, finalShortArray0);
        
        assertEquals((short) -1, finalShortArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([I)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull1() {
        int[] intArray = {1};
        
        ArrayUtils.reverse(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull_11() {
        int[] intArray = {1, 1};
        
        ArrayUtils.reverse(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(int[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReverse_ArrayEqualsNull1() {
        ArrayUtils.reverse(((int[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(int[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray1() {
        int[] intArray = {-1, -1, 1};
        
        ArrayUtils.reverse(intArray);
        
        int finalIntArray0 = intArray[0];
        int finalIntArray2 = intArray[2];
        
        assertEquals(1, finalIntArray0);
        
        assertEquals(-1, finalIntArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([J)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull2() {
        long[] longArray = {-255L};
        
        ArrayUtils.reverse(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull_12() {
        long[] longArray = {-255L, -255L};
        
        ArrayUtils.reverse(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReverse_ArrayEqualsNull2() {
        ArrayUtils.reverse(((long[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(long[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray2() {
        long[] longArray = {-1L, 4294967295L, 1L};
        
        ArrayUtils.reverse(longArray);
        
        long finalLongArray0 = longArray[0];
        long finalLongArray2 = longArray[2];
        
        assertEquals(1L, finalLongArray0);
        
        assertEquals(-1L, finalLongArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull3() {
        java.lang.Object[] objectArray = {null};
        
        ArrayUtils.reverse(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull_13() {
        java.lang.Object[] objectArray = {null, null};
        
        ArrayUtils.reverse(objectArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(java.lang.Object[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReverse_ArrayEqualsNull3() {
        ArrayUtils.reverse(((java.lang.Object[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(java.lang.Object[])}
     */
    @Test
    public void testReverseWithNonEmptyObjectArray() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        ArrayUtils.reverse(objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([Z)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull4() {
        boolean[] booleanArray = {false};
        
        ArrayUtils.reverse(booleanArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull_14() {
        boolean[] booleanArray = {false, false};
        
        ArrayUtils.reverse(booleanArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(boolean[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReverse_ArrayEqualsNull4() {
        ArrayUtils.reverse(((boolean[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([Z)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(boolean[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray3() {
        boolean[] booleanArray = {false, true, true};
        
        ArrayUtils.reverse(booleanArray);
        
        boolean finalBooleanArray0 = booleanArray[0];
        boolean finalBooleanArray2 = booleanArray[2];
        
        assertTrue(finalBooleanArray0);
        
        assertFalse(finalBooleanArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([F)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull5() {
        float[] floatArray = {0.0f};
        
        ArrayUtils.reverse(floatArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull_15() {
        float[] floatArray = {0.0f, 0.0f};
        
        ArrayUtils.reverse(floatArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReverse_ArrayEqualsNull5() {
        ArrayUtils.reverse(((float[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(float[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray4() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        ArrayUtils.reverse(floatArray);
        
        float finalFloatArray0 = floatArray[0];
        float finalFloatArray2 = floatArray[2];
        
        org.junit.Assert.assertEquals(-1.0f, finalFloatArray0, 1.0E-6f);
        
        org.junit.Assert.assertEquals(0.0f, finalFloatArray2, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([D)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull6() {
        double[] doubleArray = {0.0};
        
        ArrayUtils.reverse(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull_16() {
        double[] doubleArray = {0.0, 0.0};
        
        ArrayUtils.reverse(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReverse_ArrayEqualsNull6() {
        ArrayUtils.reverse(((double[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(double[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray5() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        ArrayUtils.reverse(doubleArray);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray2 = doubleArray[2];
        
        org.junit.Assert.assertEquals(-1.0, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalDoubleArray2, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([B)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull7() {
        byte[] byteArray = {(byte) -127};
        
        ArrayUtils.reverse(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull_17() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        ArrayUtils.reverse(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReverse_ArrayEqualsNull7() {
        ArrayUtils.reverse(((byte[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(byte[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray6() {
        byte[] byteArray = {(byte) -1, (byte) -1, (byte) 1};
        
        ArrayUtils.reverse(byteArray);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray2 = byteArray[2];
        
        assertEquals((byte) 1, finalByteArray0);
        
        assertEquals((byte) -1, finalByteArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([C)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(char[])}
 * @utbot.executesCondition {@code (array == null): False}
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull8() {
        char[] charArray = {' '};
        
        ArrayUtils.reverse(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(char[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code while(j > i)} once
 *  */
    @Test
    public void testReverse_ArrayNotEqualsNull_18() {
        char[] charArray = {' ', ' '};
        
        ArrayUtils.reverse(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(char[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReverse_ArrayEqualsNull8() {
        ArrayUtils.reverse(((char[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#reverse(char[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray7() {
        char[] charArray = {'', '\uFFFF', '\u0001'};
        
        ArrayUtils.reverse(charArray);
        
        char finalCharArray0 = charArray[0];
        char finalCharArray2 = charArray[2];
        
        assertEquals('\u0001', finalCharArray0);
        
        assertEquals('', finalCharArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameLength([Ljava.lang.Object;, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthEqualsArray2Length() {
        java.lang.Object[] objectArray = {};
        
        boolean actual = ArrayUtils.isSameLength(objectArray, objectArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthNotEqualsArray2Length() {
        java.lang.Object[] objectArray = {null, null};
        java.lang.Object[] objectArray1 = {null};
        
        boolean actual = ArrayUtils.isSameLength(objectArray, objectArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthGreaterThanZero() {
        java.lang.Object[] objectArray = {null};
        
        boolean actual = ArrayUtils.isSameLength(((java.lang.Object[]) null), objectArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthGreaterThanZero() {
        java.lang.Object[] objectArray = {null};
        
        boolean actual = ArrayUtils.isSameLength(objectArray, ((java.lang.Object[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthLessOrEqualZero() {
        java.lang.Object[] objectArray = {};
        
        boolean actual = ArrayUtils.isSameLength(((java.lang.Object[]) null), objectArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2EqualsNull() {
        java.lang.Object[] objectArray = {};
        
        boolean actual = ArrayUtils.isSameLength(objectArray, ((java.lang.Object[]) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1EqualsNull() {
        boolean actual = ArrayUtils.isSameLength(((java.lang.Object[]) null), ((java.lang.Object[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameLength([Ljava.lang.Object;, [Ljava.lang.Object;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object[])}
     */
    @Test
    public void testIsSameLengthReturnsFalseWithNonEmptyObjectArrays() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        java.lang.Object[] objectArray1 = new java.lang.Object[4];
        Object object3 = new Object();
        objectArray1[0] = object3;
        Object object4 = new Object();
        objectArray1[1] = object4;
        Object object5 = new Object();
        objectArray1[2] = object5;
        Object object6 = new Object();
        objectArray1[3] = object6;
        
        boolean actual = ArrayUtils.isSameLength(objectArray, objectArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameLength([F, [F)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthEqualsArray2Length1() {
        float[] floatArray = {};
        
        boolean actual = ArrayUtils.isSameLength(floatArray, floatArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthNotEqualsArray2Length1() {
        float[] floatArray = {0.0f, 0.0f};
        float[] floatArray1 = {0.0f};
        
        boolean actual = ArrayUtils.isSameLength(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthGreaterThanZero1() {
        float[] floatArray = {0.0f};
        
        boolean actual = ArrayUtils.isSameLength(((float[]) null), floatArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthGreaterThanZero1() {
        float[] floatArray = {0.0f};
        
        boolean actual = ArrayUtils.isSameLength(floatArray, ((float[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthLessOrEqualZero1() {
        float[] floatArray = {};
        
        boolean actual = ArrayUtils.isSameLength(((float[]) null), floatArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2EqualsNull1() {
        float[] floatArray = {};
        
        boolean actual = ArrayUtils.isSameLength(floatArray, ((float[]) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1EqualsNull1() {
        boolean actual = ArrayUtils.isSameLength(((float[]) null), ((float[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameLength([F, [F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float[])}
     */
    @Test
    public void testIsSameLengthReturnsFalseWithNonEmptyPrimitiveArrays() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        float[] floatArray1 = {java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.NEGATIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY};
        
        boolean actual = ArrayUtils.isSameLength(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameLength([C, [C)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthEqualsArray2Length2() {
        char[] charArray = {};
        
        boolean actual = ArrayUtils.isSameLength(charArray, charArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthNotEqualsArray2Length2() {
        char[] charArray = {' ', ' '};
        char[] charArray1 = {' '};
        
        boolean actual = ArrayUtils.isSameLength(charArray, charArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthGreaterThanZero2() {
        char[] charArray = {' '};
        
        boolean actual = ArrayUtils.isSameLength(((char[]) null), charArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthGreaterThanZero2() {
        char[] charArray = {' '};
        
        boolean actual = ArrayUtils.isSameLength(charArray, ((char[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthLessOrEqualZero2() {
        char[] charArray = {};
        
        boolean actual = ArrayUtils.isSameLength(((char[]) null), charArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2EqualsNull2() {
        char[] charArray = {};
        
        boolean actual = ArrayUtils.isSameLength(charArray, ((char[]) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1EqualsNull2() {
        boolean actual = ArrayUtils.isSameLength(((char[]) null), ((char[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameLength([C, [C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char[])}
     */
    @Test
    public void testIsSameLengthReturnsFalseWithNonEmptyPrimitiveArrays1() {
        char[] charArray = {'\u0000', '', '?'};
        char[] charArray1 = {'\u0000', '\u0000', '\u0000', '?'};
        
        boolean actual = ArrayUtils.isSameLength(charArray, charArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameLength([B, [B)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthEqualsArray2Length3() {
        byte[] byteArray = {};
        
        boolean actual = ArrayUtils.isSameLength(byteArray, byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthNotEqualsArray2Length3() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        boolean actual = ArrayUtils.isSameLength(byteArray, byteArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthGreaterThanZero3() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = ArrayUtils.isSameLength(((byte[]) null), byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthGreaterThanZero3() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = ArrayUtils.isSameLength(byteArray, ((byte[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthLessOrEqualZero3() {
        byte[] byteArray = {};
        
        boolean actual = ArrayUtils.isSameLength(((byte[]) null), byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2EqualsNull3() {
        byte[] byteArray = {};
        
        boolean actual = ArrayUtils.isSameLength(byteArray, ((byte[]) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1EqualsNull3() {
        boolean actual = ArrayUtils.isSameLength(((byte[]) null), ((byte[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameLength([B, [B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte[])}
     */
    @Test
    public void testIsSameLengthReturnsFalseWithNonEmptyPrimitiveArrays2() {
        byte[] byteArray = {(byte) 0, (byte) -1, java.lang.Byte.MAX_VALUE};
        byte[] byteArray1 = {(byte) 0, (byte) 0, (byte) 0, java.lang.Byte.MAX_VALUE};
        
        boolean actual = ArrayUtils.isSameLength(byteArray, byteArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameLength([D, [D)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthEqualsArray2Length4() {
        double[] doubleArray = {};
        
        boolean actual = ArrayUtils.isSameLength(doubleArray, doubleArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthNotEqualsArray2Length4() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        boolean actual = ArrayUtils.isSameLength(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthGreaterThanZero4() {
        double[] doubleArray = {0.0};
        
        boolean actual = ArrayUtils.isSameLength(((double[]) null), doubleArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthGreaterThanZero4() {
        double[] doubleArray = {0.0};
        
        boolean actual = ArrayUtils.isSameLength(doubleArray, ((double[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthLessOrEqualZero4() {
        double[] doubleArray = {};
        
        boolean actual = ArrayUtils.isSameLength(((double[]) null), doubleArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2EqualsNull4() {
        double[] doubleArray = {};
        
        boolean actual = ArrayUtils.isSameLength(doubleArray, ((double[]) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1EqualsNull4() {
        boolean actual = ArrayUtils.isSameLength(((double[]) null), ((double[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameLength([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double[])}
     */
    @Test
    public void testIsSameLengthReturnsFalseWithNonEmptyPrimitiveArrays3() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        
        boolean actual = ArrayUtils.isSameLength(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameLength([Z, [Z)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthEqualsArray2Length5() {
        boolean[] booleanArray = {};
        
        boolean actual = ArrayUtils.isSameLength(booleanArray, booleanArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthNotEqualsArray2Length5() {
        boolean[] booleanArray = {false, false};
        boolean[] booleanArray1 = {false};
        
        boolean actual = ArrayUtils.isSameLength(booleanArray, booleanArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthGreaterThanZero5() {
        boolean[] booleanArray = {false};
        
        boolean actual = ArrayUtils.isSameLength(((boolean[]) null), booleanArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthGreaterThanZero5() {
        boolean[] booleanArray = {false};
        
        boolean actual = ArrayUtils.isSameLength(booleanArray, ((boolean[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthLessOrEqualZero5() {
        boolean[] booleanArray = {};
        
        boolean actual = ArrayUtils.isSameLength(((boolean[]) null), booleanArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2EqualsNull5() {
        boolean[] booleanArray = {};
        
        boolean actual = ArrayUtils.isSameLength(booleanArray, ((boolean[]) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1EqualsNull5() {
        boolean actual = ArrayUtils.isSameLength(((boolean[]) null), ((boolean[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameLength([Z, [Z)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean[])}
     */
    @Test
    public void testIsSameLengthReturnsFalseWithNonEmptyPrimitiveArrays4() {
        boolean[] booleanArray = {false, true, true};
        boolean[] booleanArray1 = {false, true, false, true};
        
        boolean actual = ArrayUtils.isSameLength(booleanArray, booleanArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameLength([S, [S)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthEqualsArray2Length6() {
        short[] shortArray = {};
        short[] shortArray1 = {};
        
        boolean actual = ArrayUtils.isSameLength(shortArray, shortArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthNotEqualsArray2Length6() {
        short[] shortArray = {(short) -255, (short) -255};
        short[] shortArray1 = {(short) -255};
        
        boolean actual = ArrayUtils.isSameLength(shortArray, shortArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthGreaterThanZero6() {
        short[] shortArray = {(short) -255};
        
        boolean actual = ArrayUtils.isSameLength(((short[]) null), shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthGreaterThanZero6() {
        short[] shortArray = {(short) -255};
        
        boolean actual = ArrayUtils.isSameLength(shortArray, ((short[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthLessOrEqualZero6() {
        short[] shortArray = {};
        
        boolean actual = ArrayUtils.isSameLength(((short[]) null), shortArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2EqualsNull6() {
        short[] shortArray = {};
        
        boolean actual = ArrayUtils.isSameLength(shortArray, ((short[]) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1EqualsNull6() {
        boolean actual = ArrayUtils.isSameLength(((short[]) null), ((short[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameLength([S, [S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short[])}
     */
    @Test
    public void testIsSameLengthReturnsFalseWithNonEmptyPrimitiveArrays5() {
        short[] shortArray = {(short) 0, (short) -1, java.lang.Short.MAX_VALUE};
        short[] shortArray1 = {(short) 0, (short) 0, (short) 0, java.lang.Short.MAX_VALUE};
        
        boolean actual = ArrayUtils.isSameLength(shortArray, shortArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameLength([I, [I)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthEqualsArray2Length7() {
        int[] intArray = {};
        int[] intArray1 = {};
        
        boolean actual = ArrayUtils.isSameLength(intArray, intArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthNotEqualsArray2Length7() {
        int[] intArray = {1, 1};
        int[] intArray1 = {-255};
        
        boolean actual = ArrayUtils.isSameLength(intArray, intArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthGreaterThanZero7() {
        int[] intArray = {-255};
        
        boolean actual = ArrayUtils.isSameLength(((int[]) null), intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthGreaterThanZero7() {
        int[] intArray = {1};
        
        boolean actual = ArrayUtils.isSameLength(intArray, ((int[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthLessOrEqualZero7() {
        int[] intArray = {};
        
        boolean actual = ArrayUtils.isSameLength(((int[]) null), intArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2EqualsNull7() {
        int[] intArray = {};
        
        boolean actual = ArrayUtils.isSameLength(intArray, ((int[]) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1EqualsNull7() {
        boolean actual = ArrayUtils.isSameLength(((int[]) null), ((int[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameLength([I, [I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int[])}
     */
    @Test
    public void testIsSameLengthReturnsFalseWithNonEmptyPrimitiveArrays6() {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        int[] intArray1 = {0, 0, 0, Integer.MAX_VALUE};
        
        boolean actual = ArrayUtils.isSameLength(intArray, intArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameLength([J, [J)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthEqualsArray2Length8() {
        long[] longArray = {};
        long[] longArray1 = {};
        
        boolean actual = ArrayUtils.isSameLength(longArray, longArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthNotEqualsArray2Length8() {
        long[] longArray = {-255L, -255L};
        long[] longArray1 = {-255L};
        
        boolean actual = ArrayUtils.isSameLength(longArray, longArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthGreaterThanZero8() {
        long[] longArray = {-255L};
        
        boolean actual = ArrayUtils.isSameLength(((long[]) null), longArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSameLength_Array1LengthGreaterThanZero8() {
        long[] longArray = {-255L};
        
        boolean actual = ArrayUtils.isSameLength(longArray, ((long[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): True}
 * @utbot.executesCondition {@code (array2.length > 0): False}
 * @utbot.executesCondition {@code (array2 == null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2LengthLessOrEqualZero8() {
        long[] longArray = {};
        
        boolean actual = ArrayUtils.isSameLength(((long[]) null), longArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array1.length > 0): False}
 * @utbot.executesCondition {@code (array1 != null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array2EqualsNull8() {
        long[] longArray = {};
        
        boolean actual = ArrayUtils.isSameLength(longArray, ((long[]) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long[])}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.executesCondition {@code (array2 != null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.executesCondition {@code (array1 != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSameLength_Array1EqualsNull8() {
        boolean actual = ArrayUtils.isSameLength(((long[]) null), ((long[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSameLength([J, [J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long[])}
     */
    @Test
    public void testIsSameLengthReturnsFalseWithNonEmptyPrimitiveArrays7() {
        long[] longArray = {0L, -1L, java.lang.Long.MAX_VALUE};
        long[] longArray1 = {0L, 0L, 0L, java.lang.Long.MAX_VALUE};
        
        boolean actual = ArrayUtils.isSameLength(longArray, longArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toObject([J)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToObject_ArrayLengthNotEqualsZero() {
        long[] longArray = {-255L};
        
        java.lang.Long[] actual = ArrayUtils.toObject(longArray);
        
        java.lang.Long[] expected = new java.lang.Long[1];
        Long long1 = -255L;
        expected[0] = long1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_LONG_OBJECT_ARRAY;}
 *  */
    @Test
    public void testToObject_ArrayLengthEqualsZero() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Long[] prevEMPTY_LONG_OBJECT_ARRAY = ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        try {
            java.lang.Long[] emptyLongObjectArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_LONG_OBJECT_ARRAY", emptyLongObjectArray);
            long[] longArray = {};
            
            java.lang.Long[] actual = ArrayUtils.toObject(longArray);
            
            int emptyLongObjectArraySize = emptyLongObjectArray.length;
            assertEquals(emptyLongObjectArraySize, actual.length);
            assertTrue(deepEquals(emptyLongObjectArray, actual));
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_LONG_OBJECT_ARRAY", prevEMPTY_LONG_OBJECT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToObject_ArrayEqualsNull() {
        java.lang.Long[] actual = ArrayUtils.toObject(((long[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toObject([J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(long[])}
     */
    @Test
    public void testToObjectWithNonEmptyPrimitiveArray() {
        long[] longArray = {1L, java.lang.Long.MIN_VALUE, -1L};
        
        java.lang.Long[] actual = ArrayUtils.toObject(longArray);
        
        java.lang.Long[] expected = new java.lang.Long[3];
        Long long1 = 1L;
        expected[0] = long1;
        Long long2 = java.lang.Long.MIN_VALUE;
        expected[1] = long2;
        Long long3 = -1L;
        expected[2] = long3;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toObject([Z)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToObject_IOfArray() {
        boolean[] booleanArray = {true};
        
        java.lang.Boolean[] actual = ArrayUtils.toObject(booleanArray);
        
        java.lang.Boolean[] expected = new java.lang.Boolean[1];
        Boolean boolean1 = true;
        expected[0] = boolean1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToObject_NotIOfArray() {
        boolean[] booleanArray = {false};
        
        java.lang.Boolean[] actual = ArrayUtils.toObject(booleanArray);
        
        java.lang.Boolean[] expected = new java.lang.Boolean[1];
        Boolean boolean1 = false;
        expected[0] = boolean1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_BOOLEAN_OBJECT_ARRAY;}
 *  */
    @Test
    public void testToObject_ArrayLengthEqualsZero1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Boolean[] prevEMPTY_BOOLEAN_OBJECT_ARRAY = ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        try {
            java.lang.Boolean[] emptyBooleanObjectArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_BOOLEAN_OBJECT_ARRAY", emptyBooleanObjectArray);
            boolean[] booleanArray = {};
            
            java.lang.Boolean[] actual = ArrayUtils.toObject(booleanArray);
            
            int emptyBooleanObjectArraySize = emptyBooleanObjectArray.length;
            assertEquals(emptyBooleanObjectArraySize, actual.length);
            assertTrue(deepEquals(emptyBooleanObjectArray, actual));
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_BOOLEAN_OBJECT_ARRAY", prevEMPTY_BOOLEAN_OBJECT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(boolean[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToObject_ArrayEqualsNull1() {
        java.lang.Boolean[] actual = ArrayUtils.toObject(((boolean[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toObject([Z)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(boolean[])}
     */
    @Test
    public void testToObjectWithNonEmptyPrimitiveArray1() {
        boolean[] booleanArray = {false, true, true};
        
        java.lang.Boolean[] actual = ArrayUtils.toObject(booleanArray);
        
        java.lang.Boolean[] expected = new java.lang.Boolean[3];
        Boolean boolean1 = false;
        expected[0] = boolean1;
        Boolean boolean2 = true;
        expected[1] = boolean2;
        expected[2] = boolean2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toObject([S)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToObject_ArrayLengthNotEqualsZero1() {
        short[] shortArray = {(short) -255};
        
        java.lang.Short[] actual = ArrayUtils.toObject(shortArray);
        
        java.lang.Short[] expected = new java.lang.Short[1];
        Short short1 = (short) -255;
        expected[0] = short1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_SHORT_OBJECT_ARRAY;}
 *  */
    @Test
    public void testToObject_ArrayLengthEqualsZero2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Short[] prevEMPTY_SHORT_OBJECT_ARRAY = ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        try {
            java.lang.Short[] emptyShortObjectArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_SHORT_OBJECT_ARRAY", emptyShortObjectArray);
            short[] shortArray = {};
            
            java.lang.Short[] actual = ArrayUtils.toObject(shortArray);
            
            int emptyShortObjectArraySize = emptyShortObjectArray.length;
            assertEquals(emptyShortObjectArraySize, actual.length);
            assertTrue(deepEquals(emptyShortObjectArray, actual));
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_SHORT_OBJECT_ARRAY", prevEMPTY_SHORT_OBJECT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToObject_ArrayEqualsNull2() {
        java.lang.Short[] actual = ArrayUtils.toObject(((short[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toObject([S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(short[])}
     */
    @Test
    public void testToObjectWithNonEmptyPrimitiveArray2() {
        short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        java.lang.Short[] actual = ArrayUtils.toObject(shortArray);
        
        java.lang.Short[] expected = new java.lang.Short[3];
        Short short1 = (short) 1;
        expected[0] = short1;
        Short short2 = java.lang.Short.MIN_VALUE;
        expected[1] = short2;
        Short short3 = (short) -1;
        expected[2] = short3;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toObject([F)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToObject_ArrayLengthNotEqualsZero2() {
        float[] floatArray = {1.4E-45f};
        
        java.lang.Float[] actual = ArrayUtils.toObject(floatArray);
        
        java.lang.Float[] expected = new java.lang.Float[1];
        Float float1 = 1.4E-45f;
        expected[0] = float1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_FLOAT_OBJECT_ARRAY;}
 *  */
    @Test
    public void testToObject_ArrayLengthEqualsZero3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Float[] prevEMPTY_FLOAT_OBJECT_ARRAY = ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        try {
            java.lang.Float[] emptyFloatObjectArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_FLOAT_OBJECT_ARRAY", emptyFloatObjectArray);
            float[] floatArray = {};
            
            java.lang.Float[] actual = ArrayUtils.toObject(floatArray);
            
            int emptyFloatObjectArraySize = emptyFloatObjectArray.length;
            assertEquals(emptyFloatObjectArraySize, actual.length);
            assertTrue(deepEquals(emptyFloatObjectArray, actual));
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_FLOAT_OBJECT_ARRAY", prevEMPTY_FLOAT_OBJECT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToObject_ArrayEqualsNull3() {
        java.lang.Float[] actual = ArrayUtils.toObject(((float[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toObject([F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(float[])}
     */
    @Test
    public void testToObjectWithNonEmptyPrimitiveArray3() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        java.lang.Float[] actual = ArrayUtils.toObject(floatArray);
        
        java.lang.Float[] expected = new java.lang.Float[3];
        Float float1 = 0.0f;
        expected[0] = float1;
        Float float2 = java.lang.Float.NEGATIVE_INFINITY;
        expected[1] = float2;
        Float float3 = -1.0f;
        expected[2] = float3;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toObject([D)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToObject_ArrayLengthNotEqualsZero3() {
        double[] doubleArray = {4.9E-324};
        
        java.lang.Double[] actual = ArrayUtils.toObject(doubleArray);
        
        java.lang.Double[] expected = new java.lang.Double[1];
        Double double1 = 4.9E-324;
        expected[0] = double1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_DOUBLE_OBJECT_ARRAY;}
 *  */
    @Test
    public void testToObject_ArrayLengthEqualsZero4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Double[] prevEMPTY_DOUBLE_OBJECT_ARRAY = ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        try {
            java.lang.Double[] emptyDoubleObjectArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_DOUBLE_OBJECT_ARRAY", emptyDoubleObjectArray);
            double[] doubleArray = {};
            
            java.lang.Double[] actual = ArrayUtils.toObject(doubleArray);
            
            int emptyDoubleObjectArraySize = emptyDoubleObjectArray.length;
            assertEquals(emptyDoubleObjectArraySize, actual.length);
            assertTrue(deepEquals(emptyDoubleObjectArray, actual));
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_DOUBLE_OBJECT_ARRAY", prevEMPTY_DOUBLE_OBJECT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToObject_ArrayEqualsNull4() {
        java.lang.Double[] actual = ArrayUtils.toObject(((double[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toObject([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(double[])}
     */
    @Test
    public void testToObjectWithNonEmptyPrimitiveArray4() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        java.lang.Double[] actual = ArrayUtils.toObject(doubleArray);
        
        java.lang.Double[] expected = new java.lang.Double[3];
        Double double1 = 0.0;
        expected[0] = double1;
        Double double2 = java.lang.Double.NEGATIVE_INFINITY;
        expected[1] = double2;
        Double double3 = -1.0;
        expected[2] = double3;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toObject([B)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToObject_ArrayLengthNotEqualsZero4() {
        byte[] byteArray = {(byte) -127};
        
        java.lang.Byte[] actual = ArrayUtils.toObject(byteArray);
        
        java.lang.Byte[] expected = new java.lang.Byte[1];
        Byte byte1 = (byte) -127;
        expected[0] = byte1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_BYTE_OBJECT_ARRAY;}
 *  */
    @Test
    public void testToObject_ArrayLengthEqualsZero5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Byte[] prevEMPTY_BYTE_OBJECT_ARRAY = ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        try {
            java.lang.Byte[] emptyByteObjectArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_BYTE_OBJECT_ARRAY", emptyByteObjectArray);
            byte[] byteArray = {};
            
            java.lang.Byte[] actual = ArrayUtils.toObject(byteArray);
            
            int emptyByteObjectArraySize = emptyByteObjectArray.length;
            assertEquals(emptyByteObjectArraySize, actual.length);
            assertTrue(deepEquals(emptyByteObjectArray, actual));
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_BYTE_OBJECT_ARRAY", prevEMPTY_BYTE_OBJECT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToObject_ArrayEqualsNull5() {
        java.lang.Byte[] actual = ArrayUtils.toObject(((byte[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toObject([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(byte[])}
     */
    @Test
    public void testToObjectWithNonEmptyPrimitiveArray5() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        java.lang.Byte[] actual = ArrayUtils.toObject(byteArray);
        
        java.lang.Byte[] expected = new java.lang.Byte[3];
        Byte byte1 = (byte) 1;
        expected[0] = byte1;
        Byte byte2 = java.lang.Byte.MIN_VALUE;
        expected[1] = byte2;
        Byte byte3 = (byte) -1;
        expected[2] = byte3;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toObject([C)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(char[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToObject_ArrayLengthNotEqualsZero5() {
        char[] charArray = {' '};
        
        java.lang.Character[] actual = ArrayUtils.toObject(charArray);
        
        java.lang.Character[] expected = new java.lang.Character[1];
        Character character = ' ';
        expected[0] = character;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(char[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_CHARACTER_OBJECT_ARRAY;}
 *  */
    @Test
    public void testToObject_ArrayLengthEqualsZero6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Character[] prevEMPTY_CHARACTER_OBJECT_ARRAY = ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        try {
            java.lang.Character[] emptyCharacterObjectArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CHARACTER_OBJECT_ARRAY", emptyCharacterObjectArray);
            char[] charArray = {};
            
            java.lang.Character[] actual = ArrayUtils.toObject(charArray);
            
            int emptyCharacterObjectArraySize = emptyCharacterObjectArray.length;
            assertEquals(emptyCharacterObjectArraySize, actual.length);
            assertTrue(deepEquals(emptyCharacterObjectArray, actual));
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CHARACTER_OBJECT_ARRAY", prevEMPTY_CHARACTER_OBJECT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(char[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToObject_ArrayEqualsNull6() {
        java.lang.Character[] actual = ArrayUtils.toObject(((char[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toObject([C)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(char[])}
     */
    @Test
    public void testToObjectWithNonEmptyPrimitiveArray6() {
        char[] charArray = {'\u0001', '@', ''};
        
        java.lang.Character[] actual = ArrayUtils.toObject(charArray);
        
        java.lang.Character[] expected = new java.lang.Character[3];
        Character character = '\u0001';
        expected[0] = character;
        Character character1 = '@';
        expected[1] = character1;
        Character character2 = '';
        expected[2] = character2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toObject([I)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToObject_ArrayLengthNotEqualsZero6() {
        int[] intArray = {1};
        
        java.lang.Integer[] actual = ArrayUtils.toObject(intArray);
        
        java.lang.Integer[] expected = new java.lang.Integer[1];
        Integer integer = 1;
        expected[0] = integer;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_INTEGER_OBJECT_ARRAY;}
 *  */
    @Test
    public void testToObject_ArrayLengthEqualsZero7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.Integer[] prevEMPTY_INTEGER_OBJECT_ARRAY = ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        try {
            java.lang.Integer[] emptyIntegerObjectArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_INTEGER_OBJECT_ARRAY", emptyIntegerObjectArray);
            int[] intArray = {};
            
            java.lang.Integer[] actual = ArrayUtils.toObject(intArray);
            
            int emptyIntegerObjectArraySize = emptyIntegerObjectArray.length;
            assertEquals(emptyIntegerObjectArraySize, actual.length);
            assertTrue(deepEquals(emptyIntegerObjectArray, actual));
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_INTEGER_OBJECT_ARRAY", prevEMPTY_INTEGER_OBJECT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(int[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToObject_ArrayEqualsNull7() {
        java.lang.Integer[] actual = ArrayUtils.toObject(((int[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toObject([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toObject(int[])}
     */
    @Test
    public void testToObjectWithNonEmptyPrimitiveArray7() {
        int[] intArray = {1, Integer.MIN_VALUE, -1};
        
        java.lang.Integer[] actual = ArrayUtils.toObject(intArray);
        
        java.lang.Integer[] expected = new java.lang.Integer[3];
        Integer integer = 1;
        expected[0] = integer;
        Integer integer1 = Integer.MIN_VALUE;
        expected[1] = integer1;
        Integer integer2 = -1;
        expected[2] = integer2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isEquals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEquals(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEquals(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testIsEquals() {
        short[] shortArray = {(short) 0};
        short[][] shortArray1 = {};
        
        boolean actual = ArrayUtils.isEquals(shortArray, shortArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEquals(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testIsEquals_1() {
        long[] longArray = {0L};
        int[][] intArray = {};
        
        boolean actual = ArrayUtils.isEquals(longArray, intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEquals(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testIsEquals_2() {
        char[] charArray = {'\u0000'};
        int[][] intArray = {};
        
        boolean actual = ArrayUtils.isEquals(charArray, intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isEquals(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testIsEquals_3() {
        boolean[] booleanArray = {false};
        int[][] intArray = {};
        
        boolean actual = ArrayUtils.isEquals(booleanArray, intArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isEquals(java.lang.Object, java.lang.Object)
    
    @Test
    public void testIsEquals1() {
        char[] charArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        char[] charArray1 = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        
        boolean actual = ArrayUtils.isEquals(charArray, charArray1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsEquals2() {
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        byte[] byteArray1 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        boolean actual = ArrayUtils.isEquals(byteArray, byteArray1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsEquals3() {
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false
        };
        boolean[] booleanArray1 = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        boolean actual = ArrayUtils.isEquals(booleanArray, booleanArray1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsEquals4() {
        boolean[] booleanArray = {
            false, false, false, false, false, false,
            false, false, false, false
        };
        boolean[] booleanArray1 = {
            false, false, false, false, false, false,
            false, false, false
        };
        
        boolean actual = ArrayUtils.isEquals(booleanArray, booleanArray1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsEquals5() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        double[] doubleArray1 = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        boolean actual = ArrayUtils.isEquals(doubleArray, doubleArray1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsEquals6() {
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        int[] intArray1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        boolean actual = ArrayUtils.isEquals(intArray, intArray1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsEquals7() {
        long[] longArray = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        long[] longArray1 = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        
        boolean actual = ArrayUtils.isEquals(longArray, longArray1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.subarray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subarray([D, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(double[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveGreaterThanArrayLength() {
        double[] doubleArray = {0.0};
        
        double[] actual = ArrayUtils.subarray(doubleArray, 0, 2);
        
        double[] expected = {0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(double[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_StartIndexInclusiveLessThanZero() {
        double[] doubleArray = {0.0};
        
        double[] actual = ArrayUtils.subarray(doubleArray, -1, 1);
        
        double[] expected = {0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(double[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): True}
 * @utbot.returnsFrom {@code return EMPTY_DOUBLE_ARRAY;}
 *  */
    @Test
    public void testSubarray_NewSizeLessOrEqualZero() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        double[] prevEMPTY_DOUBLE_ARRAY = ArrayUtils.EMPTY_DOUBLE_ARRAY;
        try {
            double[] emptyDoubleArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_DOUBLE_ARRAY", emptyDoubleArray);
            double[] doubleArray = {};
            
            double[] actual = ArrayUtils.subarray(doubleArray, 0, 0);
            
            org.junit.Assert.assertArrayEquals(emptyDoubleArray, actual, 1.0E-6);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_DOUBLE_ARRAY", prevEMPTY_DOUBLE_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(double[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSubarray_ArrayEqualsNull() {
        double[] actual = ArrayUtils.subarray(((double[]) null), -255, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subarray([D, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(double[],int,int)}
     */
    @Test
    public void testSubarrayWithNonEmptyPrimitiveArrayAndCornerCase() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 0.0, -1.0};
        
        double[] actual = ArrayUtils.subarray(doubleArray, -1, Integer.MAX_VALUE);
        
        double[] expected = {java.lang.Double.NEGATIVE_INFINITY, 0.0, -1.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.subarray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subarray([B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(byte[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveGreaterThanArrayLength1() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = ArrayUtils.subarray(byteArray, -1, 2);
        
        byte[] expected = {(byte) -127};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(byte[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_StartIndexInclusiveGreaterOrEqualZero() {
        byte[] byteArray = {(byte) -127};
        
        byte[] actual = ArrayUtils.subarray(byteArray, 0, 1);
        
        byte[] expected = {(byte) -127};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(byte[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): True}
 * @utbot.returnsFrom {@code return EMPTY_BYTE_ARRAY;}
 *  */
    @Test
    public void testSubarray_NewSizeLessOrEqualZero1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevEMPTY_BYTE_ARRAY = ArrayUtils.EMPTY_BYTE_ARRAY;
        try {
            byte[] emptyByteArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_BYTE_ARRAY", emptyByteArray);
            byte[] byteArray = {};
            
            byte[] actual = ArrayUtils.subarray(byteArray, -1, 0);
            
            org.junit.Assert.assertArrayEquals(emptyByteArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_BYTE_ARRAY", prevEMPTY_BYTE_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(byte[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSubarray_ArrayEqualsNull1() {
        byte[] actual = ArrayUtils.subarray(((byte[]) null), -255, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subarray([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(byte[],int,int)}
     */
    @Test
    public void testSubarrayWithNonEmptyPrimitiveArrayAndCornerCase1() {
        byte[] byteArray = {(byte) -1, (byte) 1, (byte) 0};
        
        byte[] actual = ArrayUtils.subarray(byteArray, -1, Integer.MAX_VALUE);
        
        byte[] expected = {(byte) -1, (byte) 1, (byte) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.subarray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subarray([Z, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(boolean[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveGreaterThanArrayLength2() {
        boolean[] booleanArray = {false, false};
        
        boolean[] actual = ArrayUtils.subarray(booleanArray, -1, 3);
        
        boolean[] expected = {false, false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(boolean[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_StartIndexInclusiveGreaterOrEqualZero1() {
        boolean[] booleanArray = {false};
        
        boolean[] actual = ArrayUtils.subarray(booleanArray, 0, 1);
        
        boolean[] expected = {false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(boolean[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): True}
 * @utbot.returnsFrom {@code return EMPTY_BOOLEAN_ARRAY;}
 *  */
    @Test
    public void testSubarray_NewSizeLessOrEqualZero2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        boolean[] prevEMPTY_BOOLEAN_ARRAY = ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        try {
            boolean[] emptyBooleanArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_BOOLEAN_ARRAY", emptyBooleanArray);
            boolean[] booleanArray = {};
            
            boolean[] actual = ArrayUtils.subarray(booleanArray, -1, 0);
            
            org.junit.Assert.assertArrayEquals(emptyBooleanArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_BOOLEAN_ARRAY", prevEMPTY_BOOLEAN_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(boolean[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSubarray_ArrayEqualsNull2() {
        boolean[] actual = ArrayUtils.subarray(((boolean[]) null), -255, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subarray([Z, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(boolean[],int,int)}
     */
    @Test
    public void testSubarrayWithNonEmptyPrimitiveArrayAndCornerCase2() {
        boolean[] booleanArray = {true, false, true};
        
        boolean[] actual = ArrayUtils.subarray(booleanArray, -1, Integer.MAX_VALUE);
        
        boolean[] expected = {true, false, true};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.subarray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method subarray([F, int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (array == null): False},
    ///     {@code (newSize <= 0): False}
    /// invoke:
    ///     {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)} once
    /// return from: {@code return subarray;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(float[],int,int)}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveLessOrEqualArrayLength() {
        float[] floatArray = {0.0f};
        
        float[] actual = ArrayUtils.subarray(floatArray, 0, 1);
        
        float[] expected = {0.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(float[],int,int)}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_StartIndexInclusiveLessThanZero1() {
        float[] floatArray = {0.0f};
        
        float[] actual = ArrayUtils.subarray(floatArray, -1, 1);
        
        float[] expected = {0.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(float[],int,int)}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveGreaterThanArrayLength3() {
        float[] floatArray = {0.0f};
        
        float[] actual = ArrayUtils.subarray(floatArray, 0, 2);
        
        float[] expected = {0.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method subarray([F, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(float[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): True}
 * @utbot.returnsFrom {@code return EMPTY_FLOAT_ARRAY;}
 *  */
    @Test
    public void testSubarray_NewSizeLessOrEqualZero3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        float[] prevEMPTY_FLOAT_ARRAY = ArrayUtils.EMPTY_FLOAT_ARRAY;
        try {
            float[] emptyFloatArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_FLOAT_ARRAY", emptyFloatArray);
            float[] floatArray = {};
            
            float[] actual = ArrayUtils.subarray(floatArray, -1, 0);
            
            assertArrayEquals(emptyFloatArray, actual, 1.0E-6f);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_FLOAT_ARRAY", prevEMPTY_FLOAT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(float[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSubarray_ArrayEqualsNull3() {
        float[] actual = ArrayUtils.subarray(((float[]) null), -255, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subarray([F, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(float[],int,int)}
     */
    @Test
    public void testSubarrayWithNonEmptyPrimitiveArrayAndCornerCase3() {
        float[] floatArray = {java.lang.Float.NEGATIVE_INFINITY, 0.0f, -1.0f};
        
        float[] actual = ArrayUtils.subarray(floatArray, -1, Integer.MAX_VALUE);
        
        float[] expected = {java.lang.Float.NEGATIVE_INFINITY, 0.0f, -1.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.subarray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method subarray([S, int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (array == null): False},
    ///     {@code (newSize <= 0): False}
    /// invoke:
    ///     {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)} once
    /// return from: {@code return subarray;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(short[],int,int)}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_StartIndexInclusiveLessThanZero2() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.subarray(shortArray, -1, 1);
        
        short[] expected = {(short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(short[],int,int)}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveLessOrEqualArrayLength1() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.subarray(shortArray, 0, 1);
        
        short[] expected = {(short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(short[],int,int)}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveGreaterThanArrayLength4() {
        short[] shortArray = {(short) -255};
        
        short[] actual = ArrayUtils.subarray(shortArray, 0, 2);
        
        short[] expected = {(short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method subarray([S, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(short[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.executesCondition {@code (newSize <= 0): True}
 * @utbot.returnsFrom {@code return EMPTY_SHORT_ARRAY;}
 *  */
    @Test
    public void testSubarray_NewSizeLessOrEqualZero4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        short[] prevEMPTY_SHORT_ARRAY = ArrayUtils.EMPTY_SHORT_ARRAY;
        try {
            short[] emptyShortArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_SHORT_ARRAY", emptyShortArray);
            short[] shortArray = {};
            
            short[] actual = ArrayUtils.subarray(shortArray, -1, 1);
            
            org.junit.Assert.assertArrayEquals(emptyShortArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_SHORT_ARRAY", prevEMPTY_SHORT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(short[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSubarray_ArrayEqualsNull4() {
        short[] actual = ArrayUtils.subarray(((short[]) null), -255, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subarray([S, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(short[],int,int)}
     */
    @Test
    public void testSubarrayWithNonEmptyPrimitiveArrayAndCornerCase4() {
        short[] shortArray = {(short) -1, (short) 1, (short) 0};
        
        short[] actual = ArrayUtils.subarray(shortArray, -1, Integer.MAX_VALUE);
        
        short[] expected = {(short) -1, (short) 1, (short) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.subarray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subarray([I, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_NewSizeGreaterThanZero() {
        int[] intArray = {1};
        
        int[] actual = ArrayUtils.subarray(intArray, -1, 1);
        
        int[] expected = {1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveGreaterThanArrayLength5() {
        int[] intArray = {1};
        
        int[] actual = ArrayUtils.subarray(intArray, 0, 2);
        
        int[] expected = {1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): True}
 * @utbot.returnsFrom {@code return EMPTY_INT_ARRAY;}
 *  */
    @Test
    public void testSubarray_NewSizeLessOrEqualZero5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        int[] prevEMPTY_INT_ARRAY = ArrayUtils.EMPTY_INT_ARRAY;
        try {
            int[] emptyIntArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_INT_ARRAY", emptyIntArray);
            int[] intArray = {};
            
            int[] actual = ArrayUtils.subarray(intArray, -1, 0);
            
            org.junit.Assert.assertArrayEquals(emptyIntArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_INT_ARRAY", prevEMPTY_INT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(int[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSubarray_ArrayEqualsNull5() {
        int[] actual = ArrayUtils.subarray(((int[]) null), -255, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subarray([I, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(int[],int,int)}
     */
    @Test
    public void testSubarrayWithNonEmptyPrimitiveArrayAndCornerCase5() {
        int[] intArray = {-1, 1, 0};
        
        int[] actual = ArrayUtils.subarray(intArray, -1, Integer.MAX_VALUE);
        
        int[] expected = {-1, 1, 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.subarray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method subarray([J, int, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (array == null): False},
    ///     {@code (newSize <= 0): False}
    /// invoke:
    ///     {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)} once
    /// return from: {@code return subarray;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(long[],int,int)}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveLessOrEqualArrayLength2() {
        long[] longArray = {1L};
        
        long[] actual = ArrayUtils.subarray(longArray, -1, 1);
        
        long[] expected = {1L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(long[],int,int)}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_StartIndexInclusiveGreaterOrEqualZero2() {
        long[] longArray = {-255L};
        
        long[] actual = ArrayUtils.subarray(longArray, 0, 1);
        
        long[] expected = {-255L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(long[],int,int)}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveGreaterThanArrayLength6() {
        long[] longArray = {-255L, -255L};
        
        long[] actual = ArrayUtils.subarray(longArray, -1, 3);
        
        long[] expected = {-255L, -255L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method subarray([J, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(long[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): True}
 * @utbot.returnsFrom {@code return EMPTY_LONG_ARRAY;}
 *  */
    @Test
    public void testSubarray_NewSizeLessOrEqualZero6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        long[] prevEMPTY_LONG_ARRAY = ArrayUtils.EMPTY_LONG_ARRAY;
        try {
            long[] emptyLongArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_LONG_ARRAY", emptyLongArray);
            long[] longArray = {};
            
            long[] actual = ArrayUtils.subarray(longArray, -1, 0);
            
            org.junit.Assert.assertArrayEquals(emptyLongArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_LONG_ARRAY", prevEMPTY_LONG_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(long[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSubarray_ArrayEqualsNull6() {
        long[] actual = ArrayUtils.subarray(((long[]) null), -255, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subarray([J, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(long[],int,int)}
     */
    @Test
    public void testSubarrayWithNonEmptyPrimitiveArrayAndCornerCase6() {
        long[] longArray = {-1L, 1L, 0L};
        
        long[] actual = ArrayUtils.subarray(longArray, -1, Integer.MAX_VALUE);
        
        long[] expected = {-1L, 1L, 0L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.subarray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subarray([Ljava.lang.Object;, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(java.lang.Object[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.returnsFrom {@code return (T[]) Array.newInstance(type, 0);}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveGreaterThanArrayLength7() {
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = ArrayUtils.subarray(objectArray, -1, 1);
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(java.lang.Object[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.returnsFrom {@code return (T[]) Array.newInstance(type, 0);}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveLessOrEqualArrayLength3() {
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = ArrayUtils.subarray(objectArray, -1, 0);
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(java.lang.Object[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.returnsFrom {@code return (T[]) Array.newInstance(type, 0);}
 *  */
    @Test
    public void testSubarray_StartIndexInclusiveGreaterOrEqualZero3() {
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = ArrayUtils.subarray(objectArray, 0, 1);
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(java.lang.Object[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSubarray_ArrayEqualsNull7() {
        java.lang.Object[] actual = ArrayUtils.subarray(((java.lang.Object[]) null), -255, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subarray([Ljava.lang.Object;, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(java.lang.Object[],int,int)}
     */
    @Test
    public void testSubarrayWithNonEmptyObjectArrayAndCornerCase() {
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Object object = new Object();
        objectArray[0] = object;
        Object object1 = new Object();
        objectArray[1] = object1;
        Object object2 = new Object();
        objectArray[2] = object2;
        
        java.lang.Object[] actual = ArrayUtils.subarray(objectArray, -1, Integer.MAX_VALUE);
        
        java.lang.Object[] expected = new java.lang.Object[3];
        expected[0] = object;
        expected[1] = object1;
        expected[2] = object2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subarray([Ljava.lang.Object;, int, int)
    
    @Test
    public void testSubarray1() {
        java.lang.Object[] objectArray = {null, null, null};
        
        java.lang.Object[] actual = ArrayUtils.subarray(objectArray, 0, 6);
        
        java.lang.Object[] expected = {null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testSubarray2() {
        java.lang.Object[] objectArray = {null, null};
        
        java.lang.Object[] actual = ArrayUtils.subarray(objectArray, Integer.MIN_VALUE, 3);
        
        java.lang.Object[] expected = {null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testSubarray3() {
        java.lang.Object[] objectArray = {null, null};
        
        java.lang.Object[] actual = ArrayUtils.subarray(objectArray, Integer.MIN_VALUE, 3);
        
        java.lang.Object[] expected = {null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testSubarray4() {
        java.lang.Object[] objectArray = new java.lang.Object[32];
        
        java.lang.Object[] actual = ArrayUtils.subarray(objectArray, Integer.MIN_VALUE, 1);
        
        java.lang.Object[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testSubarray5() {
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = ArrayUtils.subarray(objectArray, Integer.MIN_VALUE, -2147483647);
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subarray([Ljava.lang.Object;, int, int)
    
    @Test
    public void testSubarray6() {
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.subarray] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2454266950 out of bounds for object array[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.lang3.ArrayUtils.subarray(ArrayUtils.java:8230) */
        ArrayUtils.subarray(objectArray, Integer.MAX_VALUE, -1840700346);
    }
    ///endregion
    
    ///region Errors report for subarray
    
    public void testSubarray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.subarray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subarray([C, int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(char[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): True}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): False}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_EndIndexExclusiveLessOrEqualArrayLength4() {
        char[] charArray = {' '};
        
        char[] actual = ArrayUtils.subarray(charArray, -1, 1);
        
        char[] expected = {' '};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(char[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.executesCondition {@code (newSize <= 0): False}
 * @utbot.returnsFrom {@code return subarray;}
 *  */
    @Test
    public void testSubarray_NewSizeGreaterThanZero1() {
        char[] charArray = {' '};
        
        char[] actual = ArrayUtils.subarray(charArray, 0, 2);
        
        char[] expected = {' '};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(char[],int,int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (startIndexInclusive < 0): False}
 * @utbot.executesCondition {@code (endIndexExclusive > array.length): True}
 * @utbot.executesCondition {@code (newSize <= 0): True}
 * @utbot.returnsFrom {@code return EMPTY_CHAR_ARRAY;}
 *  */
    @Test
    public void testSubarray_NewSizeLessOrEqualZero7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        char[] prevEMPTY_CHAR_ARRAY = ArrayUtils.EMPTY_CHAR_ARRAY;
        try {
            char[] emptyCharArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CHAR_ARRAY", emptyCharArray);
            char[] charArray = {};
            
            char[] actual = ArrayUtils.subarray(charArray, 0, 1);
            
            org.junit.Assert.assertArrayEquals(emptyCharArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CHAR_ARRAY", prevEMPTY_CHAR_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(char[],int,int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testSubarray_ArrayEqualsNull8() {
        char[] actual = ArrayUtils.subarray(((char[]) null), -255, -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subarray([C, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#subarray(char[],int,int)}
     */
    @Test
    public void testSubarrayWithNonEmptyPrimitiveArrayAndCornerCase7() {
        char[] charArray = {'', '\u0001', '\u0000'};
        
        char[] actual = ArrayUtils.subarray(charArray, -1, Integer.MAX_VALUE);
        
        char[] expected = {'', '\u0001', '\u0000'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.isSameType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameType(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return array1.getClass().getName().equals(array2.getClass().getName());}
 *  */
    @Test
    public void testIsSameType_ReturnArray1GetClassGetNameEquals() {
        int[] intArray = {};
        int[] intArray1 = {};
        
        boolean actual = ArrayUtils.isSameType(intArray, intArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return array1.getClass().getName().equals(array2.getClass().getName());}
 *  */
    @Test
    public void testIsSameType_ReturnArray1GetClassGetNameEquals_1() {
        byte[] byteArray = {};
        byte[] byteArray1 = {};
        
        boolean actual = ArrayUtils.isSameType(byteArray, byteArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return array1.getClass().getName().equals(array2.getClass().getName());}
 *  */
    @Test
    public void testIsSameType_ReturnArray1GetClassGetNameEquals_2() {
        short[] shortArray = {};
        short[] shortArray1 = {};
        
        boolean actual = ArrayUtils.isSameType(shortArray, shortArray1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSameType(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array1 == null || array2 == null
 *  */
    @Test
    public void testIsSameType_ThrowIllegalArgumentException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.isSameType] produces [java.lang.IllegalArgumentException: The Array must not be null]
            org.apache.commons.lang3.ArrayUtils.isSameType(ArrayUtils.java:3495) */
        ArrayUtils.isSameType(byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (array1 == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array1 == null || array2 == null
 *  */
    @Test
    public void testIsSameType_ThrowIllegalArgumentException_1() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.isSameType] produces [java.lang.IllegalArgumentException: The Array must not be null]
            org.apache.commons.lang3.ArrayUtils.isSameType(ArrayUtils.java:3495) */
        ArrayUtils.isSameType(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isSameType(java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)}
     */
    @Test
    public void testIsSameTypeThrowsIAE() {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.isSameType] produces [java.lang.IllegalArgumentException: The Array must not be null]
            org.apache.commons.lang3.ArrayUtils.isSameType(ArrayUtils.java:3495) */
        ArrayUtils.isSameType(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Short;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthNotEqualsZero() {
        java.lang.Short[] shortArray = new java.lang.Short[1];
        Short short1 = (short) 0;
        shortArray[0] = short1;
        
        short[] actual = ArrayUtils.toPrimitive(shortArray);
        
        short[] expected = {(short) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_SHORT_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        short[] prevEMPTY_SHORT_ARRAY = ArrayUtils.EMPTY_SHORT_ARRAY;
        try {
            short[] emptyShortArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_SHORT_ARRAY", emptyShortArray);
            java.lang.Short[] shortArray = {};
            
            short[] actual = ArrayUtils.toPrimitive(shortArray);
            
            org.junit.Assert.assertArrayEquals(emptyShortArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_SHORT_ARRAY", prevEMPTY_SHORT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull() {
        short[] actual = ArrayUtils.toPrimitive(((java.lang.Short[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrimitive([Ljava.lang.Short;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[i] = array[i].shortValue();
 *  */
    @Test
    public void testToPrimitive_ThrowNullPointerException() {
        java.lang.Short[] shortArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toPrimitive] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.ArrayUtils.toPrimitive(ArrayUtils.java:9518) */
        ArrayUtils.toPrimitive(shortArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Short;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[])}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray() {
        java.lang.Short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short[] actual = ArrayUtils.toPrimitive(shortArray);
        
        short[] expected = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Short;, short)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[],short)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BNotEqualsNull() {
        java.lang.Short[] shortArray = new java.lang.Short[1];
        Short short1 = (short) 0;
        shortArray[0] = short1;
        
        short[] actual = ArrayUtils.toPrimitive(shortArray, (short) -255);
        
        short[] expected = {(short) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[],short)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BEqualsNull() {
        java.lang.Short[] shortArray = {null};
        
        short[] actual = ArrayUtils.toPrimitive(shortArray, (short) -255);
        
        short[] expected = {(short) -255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
        
        Short finalShortArray0 = shortArray[0];
        
        assertNull(finalShortArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[],short)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_SHORT_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        short[] prevEMPTY_SHORT_ARRAY = ArrayUtils.EMPTY_SHORT_ARRAY;
        try {
            short[] emptyShortArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_SHORT_ARRAY", emptyShortArray);
            java.lang.Short[] shortArray = {};
            
            short[] actual = ArrayUtils.toPrimitive(shortArray, (short) -255);
            
            org.junit.Assert.assertArrayEquals(emptyShortArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_SHORT_ARRAY", prevEMPTY_SHORT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[],short)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull1() {
        short[] actual = ArrayUtils.toPrimitive(((java.lang.Short[]) null), (short) -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Short;, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Short[],short)}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray1() {
        java.lang.Short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short[] actual = ArrayUtils.toPrimitive(shortArray, (short) -32767);
        
        short[] expected = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Character;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthNotEqualsZero1() {
        java.lang.Character[] characterArray = new java.lang.Character[1];
        Character character = '\u0000';
        characterArray[0] = character;
        
        char[] actual = ArrayUtils.toPrimitive(characterArray);
        
        char[] expected = {'\u0000'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_CHAR_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        char[] prevEMPTY_CHAR_ARRAY = ArrayUtils.EMPTY_CHAR_ARRAY;
        try {
            char[] emptyCharArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CHAR_ARRAY", emptyCharArray);
            java.lang.Character[] characterArray = {};
            
            char[] actual = ArrayUtils.toPrimitive(characterArray);
            
            org.junit.Assert.assertArrayEquals(emptyCharArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CHAR_ARRAY", prevEMPTY_CHAR_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull2() {
        char[] actual = ArrayUtils.toPrimitive(((java.lang.Character[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrimitive([Ljava.lang.Character;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[i] = array[i].charValue();
 *  */
    @Test
    public void testToPrimitive_ThrowNullPointerException1() {
        java.lang.Character[] characterArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toPrimitive] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.ArrayUtils.toPrimitive(ArrayUtils.java:9250) */
        ArrayUtils.toPrimitive(characterArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Character;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[])}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray2() {
        java.lang.Character[] characterArray = {'\u0001', '@', ''};
        
        char[] actual = ArrayUtils.toPrimitive(characterArray);
        
        char[] expected = {'\u0001', '@', ''};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Integer;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthNotEqualsZero2() {
        java.lang.Integer[] integerArray = new java.lang.Integer[1];
        Integer integer = 0;
        integerArray[0] = integer;
        
        int[] actual = ArrayUtils.toPrimitive(integerArray);
        
        int[] expected = {0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_INT_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        int[] prevEMPTY_INT_ARRAY = ArrayUtils.EMPTY_INT_ARRAY;
        try {
            int[] emptyIntArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_INT_ARRAY", emptyIntArray);
            java.lang.Integer[] integerArray = {};
            
            int[] actual = ArrayUtils.toPrimitive(integerArray);
            
            org.junit.Assert.assertArrayEquals(emptyIntArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_INT_ARRAY", prevEMPTY_INT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull3() {
        int[] actual = ArrayUtils.toPrimitive(((java.lang.Integer[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrimitive([Ljava.lang.Integer;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[i] = array[i].intValue();
 *  */
    @Test
    public void testToPrimitive_ThrowNullPointerException2() {
        java.lang.Integer[] integerArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toPrimitive] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.ArrayUtils.toPrimitive(ArrayUtils.java:9391) */
        ArrayUtils.toPrimitive(integerArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Integer;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[])}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray3() {
        java.lang.Integer[] integerArray = {1, Integer.MIN_VALUE, -1};
        
        int[] actual = ArrayUtils.toPrimitive(integerArray);
        
        int[] expected = {1, Integer.MIN_VALUE, -1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Integer;, int)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[],int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BNotEqualsNull1() {
        java.lang.Integer[] integerArray = new java.lang.Integer[1];
        Integer integer = 0;
        integerArray[0] = integer;
        
        int[] actual = ArrayUtils.toPrimitive(integerArray, -255);
        
        int[] expected = {0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[],int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BEqualsNull1() {
        java.lang.Integer[] integerArray = {null};
        
        int[] actual = ArrayUtils.toPrimitive(integerArray, -255);
        
        int[] expected = {-255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
        
        Integer finalIntegerArray0 = integerArray[0];
        
        assertNull(finalIntegerArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[],int)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_INT_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        int[] prevEMPTY_INT_ARRAY = ArrayUtils.EMPTY_INT_ARRAY;
        try {
            int[] emptyIntArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_INT_ARRAY", emptyIntArray);
            java.lang.Integer[] integerArray = {};
            
            int[] actual = ArrayUtils.toPrimitive(integerArray, -255);
            
            org.junit.Assert.assertArrayEquals(emptyIntArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_INT_ARRAY", prevEMPTY_INT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[],int)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull4() {
        int[] actual = ArrayUtils.toPrimitive(((java.lang.Integer[]) null), -255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Integer;, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Integer[],int)}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray4() {
        java.lang.Integer[] integerArray = {1, Integer.MIN_VALUE, -1};
        
        int[] actual = ArrayUtils.toPrimitive(integerArray, -2147483647);
        
        int[] expected = {1, Integer.MIN_VALUE, -1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Boolean;, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[],boolean)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BNotEqualsNull2() {
        java.lang.Boolean[] booleanArray = new java.lang.Boolean[1];
        Boolean boolean1 = false;
        booleanArray[0] = boolean1;
        
        boolean[] actual = ArrayUtils.toPrimitive(booleanArray, false);
        
        boolean[] expected = {false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[],boolean)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BEqualsNull2() {
        java.lang.Boolean[] booleanArray = {null};
        
        boolean[] actual = ArrayUtils.toPrimitive(booleanArray, false);
        
        boolean[] expected = {false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
        
        Boolean finalBooleanArray0 = booleanArray[0];
        
        assertNull(finalBooleanArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[],boolean)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_BOOLEAN_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        boolean[] prevEMPTY_BOOLEAN_ARRAY = ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        try {
            boolean[] emptyBooleanArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_BOOLEAN_ARRAY", emptyBooleanArray);
            java.lang.Boolean[] booleanArray = {};
            
            boolean[] actual = ArrayUtils.toPrimitive(booleanArray, false);
            
            org.junit.Assert.assertArrayEquals(emptyBooleanArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_BOOLEAN_ARRAY", prevEMPTY_BOOLEAN_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[],boolean)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull5() {
        boolean[] actual = ArrayUtils.toPrimitive(((java.lang.Boolean[]) null), false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Boolean;, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[],boolean)}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray5() {
        java.lang.Boolean[] booleanArray = {false, true, true};
        
        boolean[] actual = ArrayUtils.toPrimitive(booleanArray, false);
        
        boolean[] expected = {false, true, true};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Boolean;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthNotEqualsZero3() {
        java.lang.Boolean[] booleanArray = new java.lang.Boolean[1];
        Boolean boolean1 = false;
        booleanArray[0] = boolean1;
        
        boolean[] actual = ArrayUtils.toPrimitive(booleanArray);
        
        boolean[] expected = {false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_BOOLEAN_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        boolean[] prevEMPTY_BOOLEAN_ARRAY = ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        try {
            boolean[] emptyBooleanArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_BOOLEAN_ARRAY", emptyBooleanArray);
            java.lang.Boolean[] booleanArray = {};
            
            boolean[] actual = ArrayUtils.toPrimitive(booleanArray);
            
            org.junit.Assert.assertArrayEquals(emptyBooleanArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_BOOLEAN_ARRAY", prevEMPTY_BOOLEAN_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull6() {
        boolean[] actual = ArrayUtils.toPrimitive(((java.lang.Boolean[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrimitive([Ljava.lang.Boolean;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[i] = array[i].booleanValue();
 *  */
    @Test
    public void testToPrimitive_ThrowNullPointerException3() {
        java.lang.Boolean[] booleanArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toPrimitive] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.ArrayUtils.toPrimitive(ArrayUtils.java:9156) */
        ArrayUtils.toPrimitive(booleanArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Boolean;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[])}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray6() {
        java.lang.Boolean[] booleanArray = {false, true, true};
        
        boolean[] actual = ArrayUtils.toPrimitive(booleanArray);
        
        boolean[] expected = {false, true, true};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Long;, long)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[],long)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BNotEqualsNull3() {
        java.lang.Long[] longArray = new java.lang.Long[1];
        Long long1 = 0L;
        longArray[0] = long1;
        
        long[] actual = ArrayUtils.toPrimitive(longArray, -255L);
        
        long[] expected = {0L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[],long)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BEqualsNull3() {
        java.lang.Long[] longArray = {null};
        
        long[] actual = ArrayUtils.toPrimitive(longArray, -255L);
        
        long[] expected = {-255L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
        
        Long finalLongArray0 = longArray[0];
        
        assertNull(finalLongArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[],long)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_LONG_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        long[] prevEMPTY_LONG_ARRAY = ArrayUtils.EMPTY_LONG_ARRAY;
        try {
            long[] emptyLongArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_LONG_ARRAY", emptyLongArray);
            java.lang.Long[] longArray = {};
            
            long[] actual = ArrayUtils.toPrimitive(longArray, -255L);
            
            org.junit.Assert.assertArrayEquals(emptyLongArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_LONG_ARRAY", prevEMPTY_LONG_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[],long)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull7() {
        long[] actual = ArrayUtils.toPrimitive(((java.lang.Long[]) null), -255L);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Long;, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[],long)}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray7() {
        java.lang.Long[] longArray = {1L, java.lang.Long.MIN_VALUE, -1L};
        
        long[] actual = ArrayUtils.toPrimitive(longArray, -9223372036854775807L);
        
        long[] expected = {1L, java.lang.Long.MIN_VALUE, -1L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Long;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthNotEqualsZero4() {
        java.lang.Long[] longArray = new java.lang.Long[1];
        Long long1 = 0L;
        longArray[0] = long1;
        
        long[] actual = ArrayUtils.toPrimitive(longArray);
        
        long[] expected = {0L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_LONG_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero8() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        long[] prevEMPTY_LONG_ARRAY = ArrayUtils.EMPTY_LONG_ARRAY;
        try {
            long[] emptyLongArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_LONG_ARRAY", emptyLongArray);
            java.lang.Long[] longArray = {};
            
            long[] actual = ArrayUtils.toPrimitive(longArray);
            
            org.junit.Assert.assertArrayEquals(emptyLongArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_LONG_ARRAY", prevEMPTY_LONG_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull8() {
        long[] actual = ArrayUtils.toPrimitive(((java.lang.Long[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrimitive([Ljava.lang.Long;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[i] = array[i].longValue();
 *  */
    @Test
    public void testToPrimitive_ThrowNullPointerException4() {
        java.lang.Long[] longArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toPrimitive] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.ArrayUtils.toPrimitive(ArrayUtils.java:9438) */
        ArrayUtils.toPrimitive(longArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Long;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Long[])}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray8() {
        java.lang.Long[] longArray = {1L, java.lang.Long.MIN_VALUE, -1L};
        
        long[] actual = ArrayUtils.toPrimitive(longArray);
        
        long[] expected = {1L, java.lang.Long.MIN_VALUE, -1L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Character;, char)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[],char)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BNotEqualsNull4() {
        java.lang.Character[] characterArray = new java.lang.Character[1];
        Character character = '\u0000';
        characterArray[0] = character;
        
        char[] actual = ArrayUtils.toPrimitive(characterArray, ' ');
        
        char[] expected = {'\u0000'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[],char)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BEqualsNull4() {
        java.lang.Character[] characterArray = {null};
        
        char[] actual = ArrayUtils.toPrimitive(characterArray, ' ');
        
        char[] expected = {' '};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
        
        Character finalCharacterArray0 = characterArray[0];
        
        assertNull(finalCharacterArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[],char)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_CHAR_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero9() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        char[] prevEMPTY_CHAR_ARRAY = ArrayUtils.EMPTY_CHAR_ARRAY;
        try {
            char[] emptyCharArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_CHAR_ARRAY", emptyCharArray);
            java.lang.Character[] characterArray = {};
            
            char[] actual = ArrayUtils.toPrimitive(characterArray, ' ');
            
            org.junit.Assert.assertArrayEquals(emptyCharArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_CHAR_ARRAY", prevEMPTY_CHAR_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[],char)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull9() {
        char[] actual = ArrayUtils.toPrimitive(((java.lang.Character[]) null), ' ');
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Character;, char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Character[],char)}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray9() {
        java.lang.Character[] characterArray = {'\u0001', '@', ''};
        
        char[] actual = ArrayUtils.toPrimitive(characterArray, 'A');
        
        char[] expected = {'\u0001', '@', ''};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Byte;, byte)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[],byte)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BNotEqualsNull5() {
        java.lang.Byte[] byteArray = new java.lang.Byte[1];
        Byte byte1 = (byte) 0;
        byteArray[0] = byte1;
        
        byte[] actual = ArrayUtils.toPrimitive(byteArray, (byte) -127);
        
        byte[] expected = {(byte) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[],byte)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BEqualsNull5() {
        java.lang.Byte[] byteArray = {null};
        
        byte[] actual = ArrayUtils.toPrimitive(byteArray, (byte) -127);
        
        byte[] expected = {(byte) -127};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
        
        Byte finalByteArray0 = byteArray[0];
        
        assertNull(finalByteArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[],byte)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_BYTE_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero10() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevEMPTY_BYTE_ARRAY = ArrayUtils.EMPTY_BYTE_ARRAY;
        try {
            byte[] emptyByteArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_BYTE_ARRAY", emptyByteArray);
            java.lang.Byte[] byteArray = {};
            
            byte[] actual = ArrayUtils.toPrimitive(byteArray, (byte) -127);
            
            org.junit.Assert.assertArrayEquals(emptyByteArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_BYTE_ARRAY", prevEMPTY_BYTE_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[],byte)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull10() {
        byte[] actual = ArrayUtils.toPrimitive(((java.lang.Byte[]) null), (byte) -127);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Byte;, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[],byte)}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray10() {
        java.lang.Byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte[] actual = ArrayUtils.toPrimitive(byteArray, (byte) -127);
        
        byte[] expected = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Double;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthNotEqualsZero5() {
        java.lang.Double[] doubleArray = new java.lang.Double[1];
        Double double1 = 0.0;
        doubleArray[0] = double1;
        
        double[] actual = ArrayUtils.toPrimitive(doubleArray);
        
        double[] expected = {0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_DOUBLE_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        double[] prevEMPTY_DOUBLE_ARRAY = ArrayUtils.EMPTY_DOUBLE_ARRAY;
        try {
            double[] emptyDoubleArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_DOUBLE_ARRAY", emptyDoubleArray);
            java.lang.Double[] doubleArray = {};
            
            double[] actual = ArrayUtils.toPrimitive(doubleArray);
            
            org.junit.Assert.assertArrayEquals(emptyDoubleArray, actual, 1.0E-6);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_DOUBLE_ARRAY", prevEMPTY_DOUBLE_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull11() {
        double[] actual = ArrayUtils.toPrimitive(((java.lang.Double[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrimitive([Ljava.lang.Double;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[i] = array[i].doubleValue();
 *  */
    @Test
    public void testToPrimitive_ThrowNullPointerException5() {
        java.lang.Double[] doubleArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toPrimitive] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.ArrayUtils.toPrimitive(ArrayUtils.java:9297) */
        ArrayUtils.toPrimitive(doubleArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Double;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[])}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray11() {
        java.lang.Double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        double[] actual = ArrayUtils.toPrimitive(doubleArray);
        
        double[] expected = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Byte;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthNotEqualsZero6() {
        java.lang.Byte[] byteArray = new java.lang.Byte[1];
        Byte byte1 = (byte) 0;
        byteArray[0] = byte1;
        
        byte[] actual = ArrayUtils.toPrimitive(byteArray);
        
        byte[] expected = {(byte) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_BYTE_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        byte[] prevEMPTY_BYTE_ARRAY = ArrayUtils.EMPTY_BYTE_ARRAY;
        try {
            byte[] emptyByteArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_BYTE_ARRAY", emptyByteArray);
            java.lang.Byte[] byteArray = {};
            
            byte[] actual = ArrayUtils.toPrimitive(byteArray);
            
            org.junit.Assert.assertArrayEquals(emptyByteArray, actual);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_BYTE_ARRAY", prevEMPTY_BYTE_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull12() {
        byte[] actual = ArrayUtils.toPrimitive(((java.lang.Byte[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrimitive([Ljava.lang.Byte;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[i] = array[i].byteValue();
 *  */
    @Test
    public void testToPrimitive_ThrowNullPointerException6() {
        java.lang.Byte[] byteArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toPrimitive] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.ArrayUtils.toPrimitive(ArrayUtils.java:9203) */
        ArrayUtils.toPrimitive(byteArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Byte;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Byte[])}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray12() {
        java.lang.Byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte[] actual = ArrayUtils.toPrimitive(byteArray);
        
        byte[] expected = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Float;, float)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[],float)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BNotEqualsNull6() {
        java.lang.Float[] floatArray = new java.lang.Float[1];
        Float float1 = 0.0f;
        floatArray[0] = float1;
        
        float[] actual = ArrayUtils.toPrimitive(floatArray, java.lang.Float.NaN);
        
        float[] expected = {0.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[],float)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BEqualsNull6() {
        java.lang.Float[] floatArray = {null};
        
        float[] actual = ArrayUtils.toPrimitive(floatArray, java.lang.Float.NaN);
        
        float[] expected = {java.lang.Float.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
        
        Float finalFloatArray0 = floatArray[0];
        
        assertNull(finalFloatArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[],float)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_FLOAT_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero13() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        float[] prevEMPTY_FLOAT_ARRAY = ArrayUtils.EMPTY_FLOAT_ARRAY;
        try {
            float[] emptyFloatArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_FLOAT_ARRAY", emptyFloatArray);
            java.lang.Float[] floatArray = {};
            
            float[] actual = ArrayUtils.toPrimitive(floatArray, java.lang.Float.NaN);
            
            assertArrayEquals(emptyFloatArray, actual, 1.0E-6f);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_FLOAT_ARRAY", prevEMPTY_FLOAT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[],float)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull13() {
        float[] actual = ArrayUtils.toPrimitive(((java.lang.Float[]) null), java.lang.Float.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Float;, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[],float)}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray13() {
        java.lang.Float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float[] actual = ArrayUtils.toPrimitive(floatArray, 1.3292282E36f);
        
        float[] expected = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Float;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthNotEqualsZero7() {
        java.lang.Float[] floatArray = new java.lang.Float[1];
        Float float1 = 0.0f;
        floatArray[0] = float1;
        
        float[] actual = ArrayUtils.toPrimitive(floatArray);
        
        float[] expected = {0.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_FLOAT_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero14() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        float[] prevEMPTY_FLOAT_ARRAY = ArrayUtils.EMPTY_FLOAT_ARRAY;
        try {
            float[] emptyFloatArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_FLOAT_ARRAY", emptyFloatArray);
            java.lang.Float[] floatArray = {};
            
            float[] actual = ArrayUtils.toPrimitive(floatArray);
            
            assertArrayEquals(emptyFloatArray, actual, 1.0E-6f);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_FLOAT_ARRAY", prevEMPTY_FLOAT_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull14() {
        float[] actual = ArrayUtils.toPrimitive(((java.lang.Float[]) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrimitive([Ljava.lang.Float;)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[i] = array[i].floatValue();
 *  */
    @Test
    public void testToPrimitive_ThrowNullPointerException7() {
        java.lang.Float[] floatArray = {null};
        
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.toPrimitive] produces [java.lang.NullPointerException]
            org.apache.commons.lang3.ArrayUtils.toPrimitive(ArrayUtils.java:9344) */
        ArrayUtils.toPrimitive(floatArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Float;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Float[])}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray14() {
        java.lang.Float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float[] actual = ArrayUtils.toPrimitive(floatArray);
        
        float[] expected = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.toPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Double;, double)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[],double)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BNotEqualsNull7() {
        java.lang.Double[] doubleArray = new java.lang.Double[1];
        Double double1 = 0.0;
        doubleArray[0] = double1;
        
        double[] actual = ArrayUtils.toPrimitive(doubleArray, java.lang.Double.NaN);
        
        double[] expected = {0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[],double)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testToPrimitive_BEqualsNull7() {
        java.lang.Double[] doubleArray = {null};
        
        double[] actual = ArrayUtils.toPrimitive(doubleArray, java.lang.Double.NaN);
        
        double[] expected = {java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
        
        Double finalDoubleArray0 = doubleArray[0];
        
        assertNull(finalDoubleArray0);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[],double)}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY_DOUBLE_ARRAY;}
 *  */
    @Test
    public void testToPrimitive_ArrayLengthEqualsZero15() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        double[] prevEMPTY_DOUBLE_ARRAY = ArrayUtils.EMPTY_DOUBLE_ARRAY;
        try {
            double[] emptyDoubleArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_DOUBLE_ARRAY", emptyDoubleArray);
            java.lang.Double[] doubleArray = {};
            
            double[] actual = ArrayUtils.toPrimitive(doubleArray, java.lang.Double.NaN);
            
            org.junit.Assert.assertArrayEquals(emptyDoubleArray, actual, 1.0E-6);
        } finally {
            setStaticField(ArrayUtils.class, "EMPTY_DOUBLE_ARRAY", prevEMPTY_DOUBLE_ARRAY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[],double)}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrimitive_ArrayEqualsNull15() {
        double[] actual = ArrayUtils.toPrimitive(((java.lang.Double[]) null), java.lang.Double.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toPrimitive([Ljava.lang.Double;, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.ArrayUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Double[],double)}
     */
    @Test
    public void testToPrimitiveWithNonEmptyObjectArray15() {
        java.lang.Double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        double[] actual = ArrayUtils.toPrimitive(doubleArray, 1.1235582092889477E307);
        
        double[] expected = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.ArrayUtils.copyArrayGrow1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyArrayGrow1(java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        short[] shortArray = {(short) 0};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class shortArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", shortArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) shortArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        short[] actual = ((short[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        short[] expected = {(short) 0, (short) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class intArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", intArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) intArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        int[] actual = ((int[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        int[] expected = {0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {(byte) 0};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", byteArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) byteArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        byte[] actual = ((byte[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        byte[] expected = {(byte) 0, (byte) 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        boolean[] booleanArray = {false};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class booleanArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", booleanArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) booleanArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        boolean[] actual = ((boolean[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        boolean[] expected = {false, false};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1_4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        char[] charArray = {'\u0000'};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class charArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", charArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) charArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        char[] actual = ((char[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        char[] expected = {'\u0000', '\u0000'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return newArray;}
 *  */
    @Test
    public void testCopyArrayGrow1_ReturnNewArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Object[] objectArray = {};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", objectArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) objectArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        java.lang.Object[] actual = ((java.lang.Object[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        java.lang.Object[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1_5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {0};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class intArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", intArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) intArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        int[] actual = ((int[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        int[] expected = {0, 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1_6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null, null};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", objectArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) objectArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        java.lang.Object[] actual = ((java.lang.Object[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        java.lang.Object[] expected = new java.lang.Object[11];
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1_7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        float[] floatArray = {0.0f};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class floatArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", floatArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) floatArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        float[] actual = ((float[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        float[] expected = {0.0f, 0.0f};
        
        assertArrayEquals(expected, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1_8() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        long[] longArray = {0L};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class longArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", longArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) longArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        long[] actual = ((long[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        long[] expected = {0L, 0L};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testCopyArrayGrow1_9() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0};
        
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class doubleArrayType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", doubleArrayType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) doubleArray);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        double[] actual = ((double[]) copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments));
        
        double[] expected = {0.0, 0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyArrayGrow1(java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ArrayUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.ArrayUtils#copyArrayGrow1(java.lang.Object,java.lang.Class)}
 * @utbot.executesCondition {@code (array != null): False}
 * @utbot.invokes {@link java.lang.reflect.Array#newInstance(java.lang.Class,int)}
 * @utbot.returnsFrom {@code return Array.newInstance(newArrayComponentType, 1);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Array.newInstance(newArrayComponentType, 1);
 *  */
    @Test
    public void testCopyArrayGrow1_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.lang3.ArrayUtils.copyArrayGrow1] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            org.apache.commons.lang3.ArrayUtils.copyArrayGrow1(ArrayUtils.java:1655) */
        Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class objectType = Class.forName("java.lang.Object");
        Class classType = Class.forName("java.lang.Class");
        Method copyArrayGrow1Method = arrayUtilsClazz.getDeclaredMethod("copyArrayGrow1", objectType, classType);
        copyArrayGrow1Method.setAccessible(true);
        java.lang.Object[] copyArrayGrow1MethodArguments = new java.lang.Object[2];
        copyArrayGrow1MethodArguments[0] = ((Object) null);
        copyArrayGrow1MethodArguments[1] = ((Object) null);
        try {
            copyArrayGrow1Method.invoke(null, copyArrayGrow1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields677623158865000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields677623158865000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass677623158870600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields677623158865000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass677623158870600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields677623158972000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields677623158972000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass677623158972500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields677623158972000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass677623158972500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

