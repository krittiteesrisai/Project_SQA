package org.apache.commons.math.util;

import org.junit.Test;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.util.MultidimensionalCounter.Iterator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_util_MultidimensionalCounterTest {
    ///region Test suites for executable org.apache.commons.math.util.MultidimensionalCounter.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testToString_ReturnSbToString() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        
        String actual = multidimensionalCounter.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testToString_StringBuilderAppend() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] uniCounterOffset = {-255};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "uniCounterOffset", uniCounterOffset);
        int[] size = {1};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        
        String actual = multidimensionalCounter.toString();
        
        String expected = "[0]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sb.append("[").append(getCount(i)).append("]");
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] size = {};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:266)
            org.apache.commons.math.util.MultidimensionalCounter.toString(MultidimensionalCounter.java:299) */
        multidimensionalCounter.toString();
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sb.append("[").append(getCount(i)).append("]");
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] uniCounterOffset = {};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "uniCounterOffset", uniCounterOffset);
        int[] size = {1};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:270)
            org.apache.commons.math.util.MultidimensionalCounter.toString(MultidimensionalCounter.java:299) */
        multidimensionalCounter.toString();
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sb.append("[").append(getCount(i)).append("]");
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] uniCounterOffset = {-255};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "uniCounterOffset", uniCounterOffset);
        int[] size = {1};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", -256);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:272)
            org.apache.commons.math.util.MultidimensionalCounter.toString(MultidimensionalCounter.java:299) */
        multidimensionalCounter.toString();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: sb.append("[").append(getCount(i)).append("]");
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testToString_ThrowDimensionMismatchException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 2);
        
        multidimensionalCounter.toString();
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: sb.append("[").append(getCount(i)).append("]");
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testToString_ThrowOutOfRangeException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] size = {0};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        
        multidimensionalCounter.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.MultidimensionalCounter.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#iterator()}
 * @utbot.returnsFrom {@code return new Iterator();}
 *  */
    @Test
    public void testIterator_Return() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 2);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", 1);
        
        MultidimensionalCounter.Iterator actual = multidimensionalCounter.iterator();
        
        MultidimensionalCounter.Iterator expected = ((MultidimensionalCounter.Iterator) createInstance("org.apache.commons.math.util.MultidimensionalCounter$Iterator"));
        int[] counter = {0, -1};
        setField(expected, "org.apache.commons.math.util.MultidimensionalCounter$Iterator", "counter", counter);
        setField(expected, "org.apache.commons.math.util.MultidimensionalCounter$Iterator", "count", -1);
        setField(expected, "org.apache.commons.math.util.MultidimensionalCounter$Iterator", "this$0", multidimensionalCounter);
        
        int[] expectedCounter = ((int[]) getFieldValue(expected, "org.apache.commons.math.util.MultidimensionalCounter$Iterator", "counter"));
        int[] actualCounter = ((int[]) getFieldValue(actual, "org.apache.commons.math.util.MultidimensionalCounter$Iterator", "counter"));
        int expectedCounterSize = expectedCounter.length;
        assertEquals(expectedCounterSize, actualCounter.length);
        assertArrayEquals(expectedCounter, actualCounter);
        
        int expectedCount = expected.getCount();
        int actualCount = actual.getCount();
        assertEquals(expectedCount, actualCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator()
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#iterator()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Iterator();
 *  */
    @Test
    public void testIterator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", -256);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.iterator] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.util.MultidimensionalCounter$Iterator.<init>(MultidimensionalCounter.java:86)
            org.apache.commons.math.util.MultidimensionalCounter.iterator(MultidimensionalCounter.java:196) */
        multidimensionalCounter.iterator();
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#iterator()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new Iterator();
 *  */
    @Test
    public void testIterator_ThrowNegativeArraySizeException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", -256);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.iterator] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.util.MultidimensionalCounter$Iterator.<init>(MultidimensionalCounter.java:75)
            org.apache.commons.math.util.MultidimensionalCounter.iterator(MultidimensionalCounter.java:196) */
        multidimensionalCounter.iterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.MultidimensionalCounter.getSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSize()
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getSize()}
 * @utbot.returnsFrom {@code return totalSize;}
 *  */
    @Test
    public void testGetSize_ReturnTotalSize() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "totalSize", -255);
        
        int actual = multidimensionalCounter.getSize();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.MultidimensionalCounter.getCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCount([I)
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.returnsFrom {@code return count + c[last];}
 *  */
    @Test
    public void testGetCount_IndexLessThanIOfSize() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] uniCounterOffset = {-255};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "uniCounterOffset", uniCounterOffset);
        int[] size = {1};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        int[] intArray = {0};
        
        int actual = multidimensionalCounter.getCount(intArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCount([I)
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return count + c[last];
 *  */
    @Test
    public void testGetCount_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", 1);
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCount] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:272) */
        multidimensionalCounter.getCount(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: index < 0 || index >= size[i]
 *  */
    @Test
    public void testGetCount_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] size = {};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCount] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:266) */
        multidimensionalCounter.getCount(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: count += uniCounterOffset[i] * c[i];
 *  */
    @Test
    public void testGetCount_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] uniCounterOffset = {};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "uniCounterOffset", uniCounterOffset);
        int[] size = {1};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCount] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:270) */
        multidimensionalCounter.getCount(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return count + c[last];
 *  */
    @Test
    public void testGetCount_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] uniCounterOffset = {-255};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "uniCounterOffset", uniCounterOffset);
        int[] size = {1};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", 1073741824);
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCount] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:272) */
        multidimensionalCounter.getCount(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < 0 || index >= size[i]
 *  */
    @Test
    public void testGetCount_ThrowNullPointerException_2() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] intArray = {-1};
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCount] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:268) */
        multidimensionalCounter.getCount(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: c.length != dimension
 *  */
    @Test
    public void testGetCount_ThrowNullPointerException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCount] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:260) */
        multidimensionalCounter.getCount(null);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < 0 || index >= size[i]
 *  */
    @Test
    public void testGetCount_ThrowNullPointerException_1() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCount] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:266) */
        multidimensionalCounter.getCount(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: count += uniCounterOffset[i] * c[i];
 *  */
    @Test
    public void testGetCount_ThrowNullPointerException_3() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] size = {1};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCount] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.MultidimensionalCounter.getCount(MultidimensionalCounter.java:270) */
        multidimensionalCounter.getCount(intArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCount([I)
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} when: c.length != dimension
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetCount_ThrowDimensionMismatchException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] intArray = {1};
        
        multidimensionalCounter.getCount(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCount(int[])}
 * @utbot.executesCondition {@code (c.length != dimension): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} when: index < 0 || index >= size[i]
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetCount_ThrowOutOfRangeException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] size = {0};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        int[] intArray = {0};
        
        multidimensionalCounter.getCount(intArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.MultidimensionalCounter.getDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDimension()
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getDimension()}
 * @utbot.returnsFrom {@code return dimension;}
 *  */
    @Test
    public void testGetDimension_ReturnDimension() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", -255);
        
        int actual = multidimensionalCounter.getDimension();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.MultidimensionalCounter.getCounts
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCounts(int)
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= totalSize): False}
 * @utbot.returnsFrom {@code return indices;}
 *  */
    @Test
    public void testGetCounts_IndexLessThanTotalSize() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "totalSize", 1);
        
        int[] actual = multidimensionalCounter.getCounts(0);
        
        int[] expected = {0};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCounts(int)
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} when: index < 0 || index >= totalSize
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetCounts_ThrowOutOfRangeException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        
        multidimensionalCounter.getCounts(-1);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= totalSize): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} when: index < 0 || index >= totalSize
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetCounts_ThrowOutOfRangeException_1() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        
        multidimensionalCounter.getCounts(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCounts(int)
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final int[] indices = new int[dimension];
 *  */
    @Test
    public void testGetCounts_ThrowNegativeArraySizeException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", -256);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "totalSize", 1);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCounts] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.util.MultidimensionalCounter.getCounts(MultidimensionalCounter.java:222) */
        multidimensionalCounter.getCounts(0);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: indices[last] = idx;
 *  */
    @Test
    public void testGetCounts_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "totalSize", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCounts] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.util.MultidimensionalCounter.getCounts(MultidimensionalCounter.java:243) */
        multidimensionalCounter.getCounts(0);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.iterates iterate the loop {@code while(count < index)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: indices[last] = idx;
 *  */
    @Test
    public void testGetCounts_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "totalSize", 2);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCounts] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.util.MultidimensionalCounter.getCounts(MultidimensionalCounter.java:243) */
        multidimensionalCounter.getCounts(1);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < last; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int offset = uniCounterOffset[i];
 *  */
    @Test
    public void testGetCounts_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] uniCounterOffset = {};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "uniCounterOffset", uniCounterOffset);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "totalSize", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", 1);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCounts] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MultidimensionalCounter.getCounts(MultidimensionalCounter.java:227) */
        multidimensionalCounter.getCounts(0);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < last; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: indices[i] = idx;
 *  */
    @Test
    public void testGetCounts_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] uniCounterOffset = {1};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "uniCounterOffset", uniCounterOffset);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "totalSize", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", 1);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCounts] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.MultidimensionalCounter.getCounts(MultidimensionalCounter.java:234) */
        multidimensionalCounter.getCounts(0);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < last; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: indices[last] = idx;
 *  */
    @Test
    public void testGetCounts_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        int[] uniCounterOffset = {1};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "uniCounterOffset", uniCounterOffset);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "totalSize", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", 1);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCounts] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.MultidimensionalCounter.getCounts(MultidimensionalCounter.java:243) */
        multidimensionalCounter.getCounts(0);
    }
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getCounts(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < last; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int offset = uniCounterOffset[i];
 *  */
    @Test
    public void testGetCounts_ThrowNullPointerException() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "dimension", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "totalSize", 1);
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "last", 1);
        
        /* This test fails because method [org.apache.commons.math.util.MultidimensionalCounter.getCounts] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.MultidimensionalCounter.getCounts(MultidimensionalCounter.java:227) */
        multidimensionalCounter.getCounts(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.MultidimensionalCounter.getSizes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSizes()
    
    /**
    @utbot.classUnderTest {@link MultidimensionalCounter}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.MultidimensionalCounter#getSizes()}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#copyOf(int[])}
 * @utbot.returnsFrom {@code return MathUtils.copyOf(size);}
 *  */
    @Test
    public void testGetSizes_MathUtilsCopyOf() throws Exception  {
        MultidimensionalCounter multidimensionalCounter = ((MultidimensionalCounter) createInstance("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] size = {};
        setField(multidimensionalCounter, "org.apache.commons.math.util.MultidimensionalCounter", "size", size);
        
        int[] actual = multidimensionalCounter.getSizes();
        
        int[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields733866126244300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields733866126244300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass733866126251000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields733866126244300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass733866126251000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields733866126637900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields733866126637900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass733866126641000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields733866126637900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass733866126641000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

