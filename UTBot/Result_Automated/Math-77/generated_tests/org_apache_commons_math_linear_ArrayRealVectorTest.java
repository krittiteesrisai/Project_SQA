package org.apache.commons.math.linear;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_linear_ArrayRealVectorTest {
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#add(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#add(double[])}
 * @utbot.returnsFrom {@code return (ArrayRealVector) add(v.data);}
 *  */
    @Test
    public void testAdd_ArrayRealVectorAdd() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.0078125};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {0.0};
        arrayRealVector1.data = data1;
        
        ArrayRealVector actual = arrayRealVector.add(arrayRealVector1);
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {2.0078125};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#add(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (ArrayRealVector) add(v.data);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.add(ArrayRealVector.java:303) */
        arrayRealVector.add(((ArrayRealVector) null));
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#add(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return new ArrayRealVector(out, false);}
 *  */
    @Test
    public void testAdd_ObjectClone() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.781342323134002E-309};
        arrayRealVector.data = data;
        double[] doubleArray = {0.0};
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.add(doubleArray));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {2.781342323134002E-309};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#add(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.add(ArrayRealVector.java:287) */
        arrayRealVector.add(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#add(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#add(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return add((ArrayRealVector) v);}
 *  */
    @Test
    public void testAdd_VInstanceOfArrayRealVector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {0.0};
        arrayRealVector1.data = data1;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method addMethod = arrayRealVectorClazz.getDeclaredMethod("add", arrayRealVector1Type);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = arrayRealVector1;
        ArrayRealVector actual = ((ArrayRealVector) addMethod.invoke(arrayRealVector, addMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {0.0};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.executesCondition {@code (!(other instanceof RealVector)): True}
 *  */
    @Test
    public void testEquals_NotOtherInstanceOfRealVector() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        byte[] byteArray = {};
        
        boolean actual = arrayRealVector.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 *  */
    @Test
    public void testEquals_Other() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        boolean actual = arrayRealVector.equals(arrayRealVector);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): True}
 *  */
    @Test
    public void testEquals_OtherEqualsNull() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        boolean actual = arrayRealVector.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (other): False},
    ///     {@code (other == null): False},
    ///     {@code (!(other instanceof RealVector)): False}
    /// invoke:
    ///     {@link org.apache.commons.math.linear.RealVector#getDimension()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 *  */
    @Test
    public void testEquals_ReturnFalse_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        
        boolean actual = arrayRealVector.equals(openMapRealVector);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 *  */
    @Test
    public void testEquals() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = arrayRealVector.equals(openMapRealVector);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 *  */
    @Test
    public void testEquals_ReturnFalse() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {0.0};
        arrayRealVector1.data = data1;
        
        boolean actual = arrayRealVector.equals(arrayRealVector1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 *  */
    @Test
    public void testEquals_IOfDataNotEqualsRhsGetEntry() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {-7.167464590104721E-299};
        arrayRealVector1.data = data1;
        
        boolean actual = arrayRealVector.equals(arrayRealVector1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} twice
 *  */
    @Test
    public void testEquals_IOfDataEqualsRhsGetEntry() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {1.557374211109024E-207};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        arrayRealVector1.data = data;
        
        boolean actual = arrayRealVector.equals(arrayRealVector1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return this.isNaN();}
 *  */
    @Test
    public void testEquals_ReturnThisIsNaN() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-2.0000000000000004};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {java.lang.Double.NaN};
        arrayRealVector1.data = data1;
        
        boolean actual = arrayRealVector.equals(arrayRealVector1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return this.isNaN();}
 *  */
    @Test
    public void testEquals_ReturnThisIsNaN_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {java.lang.Double.NaN};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = arrayRealVector.equals(openMapRealVector);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#isNaN()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: rhs.isNaN()
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {-2.0000000000000004};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:579)
            org.apache.commons.math.linear.ArrayRealVector.equals(ArrayRealVector.java:1159) */
        arrayRealVector.equals(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: data.length != rhs.getDimension()
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.equals(ArrayRealVector.java:1155) */
        arrayRealVector.equals(openMapRealVector);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {java.lang.Double.NaN};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        arrayRealVector1.data = data;
        
        boolean actual = arrayRealVector.equals(arrayRealVector1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            0.0, -2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[13];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = java.lang.Byte.MIN_VALUE;
        states[3] = (byte) 1;
        states[4] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = arrayRealVector.equals(openMapRealVector);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {
            java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", data);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        boolean actual = arrayRealVector.equals(openMapRealVector);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals4() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = new byte[14];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = java.lang.Byte.MIN_VALUE;
        states[3] = (byte) 1;
        states[4] = java.lang.Byte.MIN_VALUE;
        states[5] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:579)
            org.apache.commons.math.linear.ArrayRealVector.equals(ArrayRealVector.java:1159) */
        arrayRealVector.equals(openMapRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.toString
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(double[])}
 * @utbot.returnsFrom {@code return new ArrayRealVector(this, in);}
 *  */
    @Test
    public void testAppend_Return() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        double[] doubleArray = {};
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.append(doubleArray));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return new ArrayRealVector(this, v);}
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testAppend_CatchClassCastException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.append(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return new ArrayRealVector(this, v);}
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testAppend_CatchClassCastException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.append(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {0.0};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return new ArrayRealVector(this, v);}
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testAppend_CatchClassCastException_4() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.append(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {0.0};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return new ArrayRealVector(this, (ArrayRealVector) v);}
 *  */
    @Test
    public void testAppend_Return1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        arrayRealVector1.data = data;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method appendMethod = arrayRealVectorClazz.getDeclaredMethod("append", arrayRealVector1Type);
        appendMethod.setAccessible(true);
        java.lang.Object[] appendMethodArguments = new java.lang.Object[1];
        appendMethodArguments[0] = arrayRealVector1;
        ArrayRealVector actual = ((ArrayRealVector) appendMethod.invoke(arrayRealVector, appendMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return new ArrayRealVector(this, v);}
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testAppend_CatchClassCastException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.append(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {0.0};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return new ArrayRealVector(this, v);}
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testAppend_CatchClassCastException_3() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.append(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {0.0};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new ArrayRealVector(this, v);
 *  */
    @Test
    public void testAppend_ThrowNegativeArraySizeException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.append] produces [java.lang.NegativeArraySizeException: -2147483647]
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:201)
            org.apache.commons.math.linear.ArrayRealVector.append(ArrayRealVector.java:959) */
        arrayRealVector.append(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ArrayRealVector(this, v);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:204)
            org.apache.commons.math.linear.ArrayRealVector.append(ArrayRealVector.java:959) */
        arrayRealVector.append(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ArrayRealVector(this, v);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:204)
            org.apache.commons.math.linear.ArrayRealVector.append(ArrayRealVector.java:959) */
        arrayRealVector.append(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ArrayRealVector(this, v);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:201)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:204)
            org.apache.commons.math.linear.ArrayRealVector.append(ArrayRealVector.java:959) */
        arrayRealVector.append(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ArrayRealVector(this, v);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", data);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:190)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:204)
            org.apache.commons.math.linear.ArrayRealVector.append(ArrayRealVector.java:959) */
        arrayRealVector.append(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ArrayRealVector(this, v);
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:202)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:204)
            org.apache.commons.math.linear.ArrayRealVector.append(ArrayRealVector.java:959) */
        arrayRealVector.append(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayRealVector(this, v);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:204)
            org.apache.commons.math.linear.ArrayRealVector.append(ArrayRealVector.java:959) */
        arrayRealVector.append(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayRealVector(this, v);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:204)
            org.apache.commons.math.linear.ArrayRealVector.append(ArrayRealVector.java:959) */
        arrayRealVector.append(openMapRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return new ArrayRealVector(this, v);}
 *  */
    @Test
    public void testAppend_Return2() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        arrayRealVector1.data = data;
        
        ArrayRealVector actual = arrayRealVector.append(arrayRealVector1);
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(double)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return new ArrayRealVector(out, false);}
 *  */
    @Test
    public void testAppend_SystemArraycopy() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.append(java.lang.Double.NaN));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {java.lang.Double.NaN};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#append(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] out = new double[data.length + 1];
 *  */
    @Test
    public void testAppend_ThrowNullPointerException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.append(ArrayRealVector.java:974) */
        arrayRealVector.append(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#hashCode()}
 * @utbot.returnsFrom {@code return 9;}
 *  */
    @Test
    public void testHashCode_Return9() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {java.lang.Double.NaN};
        arrayRealVector.data = data;
        
        int actual = arrayRealVector.hashCode();
        
        assertEquals(9, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#hashCode()}
 * @utbot.returnsFrom {@code return MathUtils.hash(data);}
 *  */
    @Test
    public void testHashCode_ReturnMathUtilsHash() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        int actual = arrayRealVector.hashCode();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#hashCode()}
 * @utbot.returnsFrom {@code return MathUtils.hash(data);}
 *  */
    @Test
    public void testHashCode_ReturnMathUtilsHash_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-2.0000000000000004};
        arrayRealVector.data = data;
        
        int actual = arrayRealVector.hashCode();
        
        assertEquals(-1073741792, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#toArray()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return data.clone();}
 *  */
    @Test
    public void testToArray_ObjectClone() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        double[] actual = arrayRealVector.toArray();
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toArray()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#toArray()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data.clone();
 *  */
    @Test
    public void testToArray_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.toArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.toArray(ArrayRealVector.java:1052) */
        arrayRealVector.toArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#set(double)}
 * @utbot.invokes {@link java.util.Arrays#fill(double[],double)}
 *  */
    @Test
    public void testSet_ArraysFill() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        arrayRealVector.set(java.lang.Double.NaN);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(int, org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#set(int,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,double[])}
 *  */
    @Test
    public void testSet_ArrayRealVectorSetSubVector() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {};
        arrayRealVector1.data = data1;
        
        arrayRealVector.set(0, arrayRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(int, org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#set(int,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setSubVector(index, v.data);
 *  */
    @Test
    public void testSet_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.set] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.set(ArrayRealVector.java:1042) */
        arrayRealVector.set(-255, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#set(int,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setSubVector(index, v.data);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector1.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.set] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1025)
            org.apache.commons.math.linear.ArrayRealVector.set(ArrayRealVector.java:1042) */
        arrayRealVector.set(-255, arrayRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(int, org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#set(int,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: setSubVector(index, v.data);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSet_ThrowMatrixIndexException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        arrayRealVector.set(-1, arrayRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#isNaN()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN_ReturnFalse() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        boolean actual = arrayRealVector.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#isNaN()}
 * @utbot.iterates iterate the loop {@code for(double v: data)} once
 *  */
    @Test
    public void testIsNaN_DoubleIsNaN() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {java.lang.Double.NaN};
        arrayRealVector.data = data;
        
        boolean actual = arrayRealVector.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#isNaN()}
 * @utbot.iterates iterate the loop {@code for(double v: data)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN_NotDoubleIsNaN() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.0};
        arrayRealVector.data = data;
        
        boolean actual = arrayRealVector.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNaN()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#isNaN()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(double v: data)
 *  */
    @Test
    public void testIsNaN_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.isNaN] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.isNaN(ArrayRealVector.java:1093) */
        arrayRealVector.isNaN();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#copy()}
 * @utbot.returnsFrom {@code return new ArrayRealVector(this, true);}
 *  */
    @Test
    public void testCopy_Return() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.copy());
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.isInfinite
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInfinite()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#isInfinite()}
 * @utbot.executesCondition {@code (isNaN()): False}
 *  */
    @Test
    public void testIsInfinite_NotIsNaN() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        boolean actual = arrayRealVector.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#isInfinite()}
 * @utbot.executesCondition {@code (isNaN()): True}
 *  */
    @Test
    public void testIsInfinite_IsNaN() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {java.lang.Double.NaN};
        arrayRealVector.data = data;
        
        boolean actual = arrayRealVector.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#isInfinite()}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.iterates iterate the loop {@code for(double v: data)} once
 *  */
    @Test
    public void testIsInfinite_DoubleIsInfinite() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {java.lang.Double.POSITIVE_INFINITY};
        arrayRealVector.data = data;
        
        boolean actual = arrayRealVector.isInfinite();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#isInfinite()}
 * @utbot.executesCondition {@code (isNaN()): False}
 * @utbot.iterates iterate the loop {@code for(double v: data)} once
 *  */
    @Test
    public void testIsInfinite_NotDoubleIsInfinite() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-2.0000000000000004};
        arrayRealVector.data = data;
        
        boolean actual = arrayRealVector.isInfinite();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntry(int)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return data[index];}
 *  */
    @Test
    public void testGetEntry_ReturnIndexOfData() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getEntry(1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntry(int)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return data[index];
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.linear.ArrayRealVector.getEntry(ArrayRealVector.java:946) */
        arrayRealVector.getEntry(-256);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data[index];
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getEntry(ArrayRealVector.java:946) */
        arrayRealVector.getEntry(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getData()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getData()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return data.clone();}
 *  */
    @Test
    public void testGetData_ObjectClone() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        double[] actual = arrayRealVector.getData();
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getData()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getData()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data.clone();
 *  */
    @Test
    public void testGetData_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getData(ArrayRealVector.java:645) */
        arrayRealVector.getData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.setEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setEntry(int,double)}
 *  */
    @Test
    public void testSetEntry() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        arrayRealVector.setEntry(1, java.lang.Double.NaN);
        
        double finalArrayRealVectorData1 = arrayRealVector.data[1];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalArrayRealVectorData1, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: data[index] = value;
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.setEntry(ArrayRealVector.java:1000) */
        arrayRealVector.setEntry(-255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setEntry(int,double)}
 * @utbot.caughtException {@code IndexOutOfBoundsException e}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_ThrowMatrixIndexException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        arrayRealVector.setEntry(-1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setEntry(int,double)}
 * @utbot.caughtException {@code IndexOutOfBoundsException e}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_ThrowMatrixIndexException_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        arrayRealVector.setEntry(0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#subtract(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#sparseIterator()}
 *  */
    @Test
    public void testSubtract_NotVNotInstanceOfArrayRealVector() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {4.0474E-320, 1.6578092E-316};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.subtract(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {4.0474E-320, 1.6578092E-316};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#subtract(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#subtract(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return subtract((ArrayRealVector) v);}
 *  */
    @Test
    public void testSubtract_VInstanceOfArrayRealVector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {0.0};
        arrayRealVector1.data = data1;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method subtractMethod = arrayRealVectorClazz.getDeclaredMethod("subtract", arrayRealVector1Type);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = arrayRealVector1;
        ArrayRealVector actual = ((ArrayRealVector) subtractMethod.invoke(arrayRealVector, subtractMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {-0.0};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for subtract
    
    public void testSubtract_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#subtract(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return new ArrayRealVector(out, false);}
 *  */
    @Test
    public void testSubtract_ObjectClone() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.2250738586367177E-308};
        arrayRealVector.data = data;
        double[] doubleArray = {0.0};
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.subtract(doubleArray));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {2.2250738586367177E-308};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#subtract(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.subtract(ArrayRealVector.java:326) */
        arrayRealVector.subtract(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for subtract
    
    public void testSubtract_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#subtract(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#subtract(double[])}
 * @utbot.returnsFrom {@code return (ArrayRealVector) subtract(v.data);}
 *  */
    @Test
    public void testSubtract_ArrayRealVectorSubtract() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.0078125};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {0.0};
        arrayRealVector1.data = data1;
        
        ArrayRealVector actual = arrayRealVector.subtract(arrayRealVector1);
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {2.0078125};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#subtract(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (ArrayRealVector) subtract(v.data);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.subtract(ArrayRealVector.java:342) */
        arrayRealVector.subtract(((ArrayRealVector) null));
    }
    ///endregion
    
    ///region Errors report for subtract
    
    public void testSubtract_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.dotProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dotProduct(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#dotProduct(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return dotProduct(v.data);}
 *  */
    @Test
    public void testDotProduct_ReturnDotProduct() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.dotProduct(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#dotProduct(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return dotProduct(v.data);}
 *  */
    @Test
    public void testDotProduct_ReturnDotProduct_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.dotProduct(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dotProduct(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#dotProduct(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return dotProduct(v.data);
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.dotProduct(ArrayRealVector.java:693) */
        arrayRealVector.dotProduct(((ArrayRealVector) null));
    }
    ///endregion
    
    ///region Errors report for dotProduct
    
    public void testDotProduct_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.dotProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dotProduct(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#sparseIterator()}
 *  */
    @Test
    public void testDotProduct_NotVNotInstanceOfArrayRealVector() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        double actual = arrayRealVector.dotProduct(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#dotProduct(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return dotProduct((ArrayRealVector) v);}
 *  */
    @Test
    public void testDotProduct_VInstanceOfArrayRealVector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method dotProductMethod = arrayRealVectorClazz.getDeclaredMethod("dotProduct", arrayRealVectorType);
        dotProductMethod.setAccessible(true);
        java.lang.Object[] dotProductMethodArguments = new java.lang.Object[1];
        dotProductMethodArguments[0] = arrayRealVector;
        double actual = ((Double) dotProductMethod.invoke(arrayRealVector, dotProductMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region Errors report for dotProduct
    
    public void testDotProduct_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.dotProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dotProduct([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#dotProduct(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return dot;}
 *  */
    @Test
    public void testDotProduct_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        double[] doubleArray = {};
        
        double actual = arrayRealVector.dotProduct(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#dotProduct(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return dot;}
 *  */
    @Test
    public void testDotProduct_IterateForLoop_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        double[] doubleArray = {0.0};
        
        double actual = arrayRealVector.dotProduct(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dotProduct([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#dotProduct(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.dotProduct(ArrayRealVector.java:677) */
        arrayRealVector.dotProduct(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for dotProduct
    
    public void testDotProduct_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.ebeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeMultiply([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeMultiply(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return new ArrayRealVector(out, false);}
 *  */
    @Test
    public void testEbeMultiply_ObjectClone() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.781342323134002E-309};
        arrayRealVector.data = data;
        double[] doubleArray = {0.0};
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.ebeMultiply(doubleArray));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {0.0};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeMultiply([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeMultiply(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(ArrayRealVector.java:587) */
        arrayRealVector.ebeMultiply(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for ebeMultiply
    
    public void testEbeMultiply_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.ebeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#ebeMultiply(double[])}
 * @utbot.returnsFrom {@code return (ArrayRealVector) ebeMultiply(v.data);}
 *  */
    @Test
    public void testEbeMultiply_ArrayRealVectorEbeMultiply() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.0078125};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {0.0};
        arrayRealVector1.data = data1;
        
        ArrayRealVector actual = arrayRealVector.ebeMultiply(arrayRealVector1);
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {0.0};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (ArrayRealVector) ebeMultiply(v.data);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(ArrayRealVector.java:603) */
        arrayRealVector.ebeMultiply(((ArrayRealVector) null));
    }
    ///endregion
    
    ///region Errors report for ebeMultiply
    
    public void testEbeMultiply_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.ebeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeMultiply(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return new ArrayRealVector(out, false);}
 *  */
    @Test
    public void testEbeMultiply_NotVNotInstanceOfArrayRealVector() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {7.9E-323};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.ebeMultiply(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {0.0};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return ebeMultiply((ArrayRealVector) v);}
 *  */
    @Test
    public void testEbeMultiply_VInstanceOfArrayRealVector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.225074389006149E-308};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {0.0};
        arrayRealVector1.data = data1;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeMultiplyMethod = arrayRealVectorClazz.getDeclaredMethod("ebeMultiply", arrayRealVector1Type);
        ebeMultiplyMethod.setAccessible(true);
        java.lang.Object[] ebeMultiplyMethodArguments = new java.lang.Object[1];
        ebeMultiplyMethodArguments[0] = arrayRealVector1;
        ArrayRealVector actual = ((ArrayRealVector) ebeMultiplyMethod.invoke(arrayRealVector, ebeMultiplyMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {0.0};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return new ArrayRealVector(out, false);}
 *  */
    @Test
    public void testEbeMultiply_NotVNotInstanceOfArrayRealVector_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.ebeMultiply(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {-0.0};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for ebeMultiply
    
    public void testEbeMultiply_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapUlpToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapUlpToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapUlpToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapUlpToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapUlpToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapUlpToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapUlpToSelf_MathUlp() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapUlpToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(4.9E-324, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapUlpToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapUlpToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapUlpToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapUlpToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapUlpToSelf(ArrayRealVector.java:563) */
        arrayRealVector.mapUlpToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.ebeDivide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeDivide([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeDivide(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return new ArrayRealVector(out, false);}
 *  */
    @Test
    public void testEbeDivide_ObjectClone() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.781342323134002E-309};
        arrayRealVector.data = data;
        double[] doubleArray = {0.0};
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.ebeDivide(doubleArray));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {java.lang.Double.POSITIVE_INFINITY};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeDivide([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeDivide(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.ebeDivide] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.ebeDivide(ArrayRealVector.java:624) */
        arrayRealVector.ebeDivide(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for ebeDivide
    
    public void testEbeDivide_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.ebeDivide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeDivide(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return new ArrayRealVector(out, false);}
 *  */
    @Test
    public void testEbeDivide_NotVNotInstanceOfArrayRealVector() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.ebeDivide(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {java.lang.Double.NaN};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#ebeDivide(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return ebeDivide((ArrayRealVector) v);}
 *  */
    @Test
    public void testEbeDivide_VInstanceOfArrayRealVector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {0.0};
        arrayRealVector1.data = data1;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeDivideMethod = arrayRealVectorClazz.getDeclaredMethod("ebeDivide", arrayRealVector1Type);
        ebeDivideMethod.setAccessible(true);
        java.lang.Object[] ebeDivideMethodArguments = new java.lang.Object[1];
        ebeDivideMethodArguments[0] = arrayRealVector1;
        ArrayRealVector actual = ((ArrayRealVector) ebeDivideMethod.invoke(arrayRealVector, ebeDivideMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {java.lang.Double.NaN};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return new ArrayRealVector(out, false);}
 *  */
    @Test
    public void testEbeDivide_NotVNotInstanceOfArrayRealVector_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {1.61895E-319};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.ebeDivide(openMapRealVector));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {java.lang.Double.POSITIVE_INFINITY};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for ebeDivide
    
    public void testEbeDivide_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.ebeDivide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeDivide(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeDivide(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#ebeDivide(double[])}
 * @utbot.returnsFrom {@code return (ArrayRealVector) ebeDivide(v.data);}
 *  */
    @Test
    public void testEbeDivide_ArrayRealVectorEbeDivide() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.0078125};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {0.0};
        arrayRealVector1.data = data1;
        
        ArrayRealVector actual = arrayRealVector.ebeDivide(arrayRealVector1);
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {java.lang.Double.POSITIVE_INFINITY};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeDivide(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#ebeDivide(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (ArrayRealVector) ebeDivide(v.data);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.ebeDivide] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.ebeDivide(ArrayRealVector.java:640) */
        arrayRealVector.ebeDivide(((ArrayRealVector) null));
    }
    ///endregion
    
    ///region Errors report for ebeDivide
    
    public void testEbeDivide_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDimension()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDimension()}
 * @utbot.returnsFrom {@code return data.length;}
 *  */
    @Test
    public void testGetDimension_ReturnDataLength() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        int actual = arrayRealVector.getDimension();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDimension()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data.length;
 *  */
    @Test
    public void testGetDimension_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDimension] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getDimension(ArrayRealVector.java:951) */
        arrayRealVector.getDimension();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapSignumToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapSignumToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSignumToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSignumToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSignumToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSignumToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSignumToSelf_MathSignum() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {java.lang.Double.NaN};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSignumToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapSignumToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSignumToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapSignumToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapSignumToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapSignumToSelf(ArrayRealVector.java:555) */
        arrayRealVector.mapSignumToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapRintToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapRintToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapRintToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapRintToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapRintToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapRintToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapRintToSelf_MathRint() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {3.337610787760802E-308};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapRintToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(0.0, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapRintToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapRintToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapRintToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapRintToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapRintToSelf(ArrayRealVector.java:547) */
        arrayRealVector.mapRintToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.unitize
    
    ///region Errors report for unitize
    
    public void testUnitize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$1 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getSubVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getSubVector(int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetSubVector_SystemArraycopy() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.getSubVector(0, 0));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getSubVector(int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: ArrayRealVector out = new ArrayRealVector(n);
 *  */
    @Test
    public void testGetSubVector_ThrowNegativeArraySizeException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getSubVector] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:65)
            org.apache.commons.math.linear.ArrayRealVector.getSubVector(ArrayRealVector.java:987) */
        arrayRealVector.getSubVector(-255, -256);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getSubVector(int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(data, index, out.data, 0, n);
 *  */
    @Test
    public void testGetSubVector_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getSubVector] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.ArrayRealVector.getSubVector(ArrayRealVector.java:989) */
        arrayRealVector.getSubVector(-255, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getSubVector(int,int)}
 * @utbot.caughtException {@code IndexOutOfBoundsException e}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_ThrowMatrixIndexException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        arrayRealVector.getSubVector(-1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getSubVector(int,int)}
 * @utbot.caughtException {@code IndexOutOfBoundsException e}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_ThrowMatrixIndexException_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        arrayRealVector.getSubVector(129, 2);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getSubVector(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkIndex(int)}
 * @utbot.caughtException {@code IndexOutOfBoundsException e}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index + n - 1);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_ThrowMatrixIndexException_2() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        arrayRealVector.getSubVector(0, 2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getNorm
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNorm()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getNorm()}
 * @utbot.returnsFrom {@code return Math.sqrt(sum);}
 *  */
    @Test
    public void testGetNorm_ReturnMathSqrt() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getNorm()}
 * @utbot.iterates iterate the loop {@code for(double a: data)} once
 * @utbot.returnsFrom {@code return Math.sqrt(sum);}
 *  */
    @Test
    public void testGetNorm_IterateForEachLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNorm()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getNorm()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(double a: data)
 *  */
    @Test
    public void testGetNorm_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getNorm] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getNorm(ArrayRealVector.java:700) */
        arrayRealVector.getNorm();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.outerProduct
    
    ///region Errors report for outerProduct
    
    public void testOuterProduct_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.outerProduct
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerProduct(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#outerProduct(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return outerProduct(v.data);
 *  */
    @Test
    public void testOuterProduct_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.outerProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.outerProduct(ArrayRealVector.java:927) */
        arrayRealVector.outerProduct(((ArrayRealVector) null));
    }
    ///endregion
    
    ///region Errors report for outerProduct
    
    public void testOuterProduct_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.outerProduct
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerProduct([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#outerProduct(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testOuterProduct_ThrowNullPointerException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.outerProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.outerProduct(ArrayRealVector.java:933) */
        arrayRealVector.outerProduct(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for outerProduct
    
    public void testOuterProduct_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.setSubVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSubVector(int, org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testSetSubVector_CatchClassCastException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        arrayRealVector.setSubVector(-1, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} twice
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testSetSubVector_CatchClassCastException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        arrayRealVector.setSubVector(0, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#set(int,org.apache.commons.math.linear.ArrayRealVector)}
 *  */
    @Test
    public void testSetSubVector_ArrayRealVectorSet() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {};
        arrayRealVector1.data = data1;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class intType = int.class;
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method setSubVectorMethod = arrayRealVectorClazz.getDeclaredMethod("setSubVector", intType, arrayRealVector1Type);
        setSubVectorMethod.setAccessible(true);
        java.lang.Object[] setSubVectorMethodArguments = new java.lang.Object[2];
        setSubVectorMethodArguments[0] = 0;
        setSubVectorMethodArguments[1] = arrayRealVector1;
        setSubVectorMethod.invoke(arrayRealVector, setSubVectorMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testSetSubVector_CatchClassCastException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        arrayRealVector.setSubVector(0, openMapRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSubVector(int, org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: data[i] = v.getEntry(i - index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1013) */
        arrayRealVector.setSubVector(-254, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkIndex(index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_5() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getDimension(ArrayRealVector.java:951)
            org.apache.commons.math.linear.AbstractRealVector.checkIndex(AbstractRealVector.java:73)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1017) */
        arrayRealVector.setSubVector(-1, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#set(int,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set(index, (ArrayRealVector) v);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException() throws Throwable  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector1.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1025)
            org.apache.commons.math.linear.ArrayRealVector.set(ArrayRealVector.java:1042)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1010) */
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class intType = int.class;
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method setSubVectorMethod = arrayRealVectorClazz.getDeclaredMethod("setSubVector", intType, arrayRealVector1Type);
        setSubVectorMethod.setAccessible(true);
        java.lang.Object[] setSubVectorMethodArguments = new java.lang.Object[2];
        setSubVectorMethodArguments[0] = -255;
        setSubVectorMethodArguments[1] = arrayRealVector1;
        try {
            setSubVectorMethod.invoke(arrayRealVector, setSubVectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: data[i] = v.getEntry(i - index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_4() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1013) */
        arrayRealVector.setSubVector(-254, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkIndex(index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_8() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getDimension(ArrayRealVector.java:951)
            org.apache.commons.math.linear.AbstractRealVector.checkIndex(AbstractRealVector.java:73)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1017) */
        arrayRealVector.setSubVector(-1, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: data[i] = v.getEntry(i - index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_9() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1013) */
        arrayRealVector.setSubVector(-254, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: data[i] = v.getEntry(i - index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1013) */
        arrayRealVector.setSubVector(-254, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: data[i] = v.getEntry(i - index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_3() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1013) */
        arrayRealVector.setSubVector(-254, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkIndex(index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_6() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getDimension(ArrayRealVector.java:951)
            org.apache.commons.math.linear.AbstractRealVector.checkIndex(AbstractRealVector.java:73)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1017) */
        arrayRealVector.setSubVector(-1, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: data[i] = v.getEntry(i - index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_7() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-2147483643, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1013) */
        arrayRealVector.setSubVector(-254, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkIndex(index);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_10() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getDimension(ArrayRealVector.java:951)
            org.apache.commons.math.linear.AbstractRealVector.checkIndex(AbstractRealVector.java:73)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1017) */
        arrayRealVector.setSubVector(-1, openMapRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSubVector(int, org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: data[i] = v.getEntry(i - index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -2147483647);
        
        arrayRealVector.setSubVector(-254, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code IndexOutOfBoundsException e}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        arrayRealVector.setSubVector(-1, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = index; i < index + v.getDimension(); ++i)} once
 * @utbot.caughtException {@code IndexOutOfBoundsException e}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException_3() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        arrayRealVector.setSubVector(0, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#set(int,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: set(index, (ArrayRealVector) v);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException() throws Throwable  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class intType = int.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method setSubVectorMethod = arrayRealVectorClazz.getDeclaredMethod("setSubVector", intType, arrayRealVectorType);
        setSubVectorMethod.setAccessible(true);
        java.lang.Object[] setSubVectorMethodArguments = new java.lang.Object[2];
        setSubVectorMethodArguments[0] = -1;
        setSubVectorMethodArguments[1] = arrayRealVector;
        try {
            setSubVectorMethod.invoke(arrayRealVector, setSubVectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.setSubVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSubVector(int, [D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,double[])}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 *  */
    @Test
    public void testSetSubVector_SystemArraycopy() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        double[] doubleArray = {};
        
        arrayRealVector.setSubVector(0, doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSubVector(int, [D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,double[])}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(v, 0, data, index, v.length);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_11() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1025) */
        arrayRealVector.setSubVector(-255, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(v, 0, data, index, v.length);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.setSubVector(ArrayRealVector.java:1025) */
        arrayRealVector.setSubVector(-255, ((double[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSubVector(int, [D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#setSubVector(int,double[])}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkIndex(int)}
 * @utbot.caughtException {@code IndexOutOfBoundsException e}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        double[] doubleArray = {0.0};
        
        arrayRealVector.setSubVector(-1, doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.returnsFrom {@code return Math.sqrt(sum);}
 *  */
    @Test
    public void testGetDistance_NotVNotInstanceOfArrayRealVector() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        double actual = arrayRealVector.getDistance(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.returnsFrom {@code return getDistance((ArrayRealVector) v);}
 *  */
    @Test
    public void testGetDistance_VInstanceOfArrayRealVector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getDistanceMethod = arrayRealVectorClazz.getDeclaredMethod("getDistance", arrayRealVectorType);
        getDistanceMethod.setAccessible(true);
        java.lang.Object[] getDistanceMethodArguments = new java.lang.Object[1];
        getDistanceMethodArguments[0] = arrayRealVector;
        double actual = ((Double) getDistanceMethod.invoke(arrayRealVector, getDistanceMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.returnsFrom {@code return getDistance((ArrayRealVector) v);}
 *  */
    @Test
    public void testGetDistance_VInstanceOfArrayRealVector_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getDistanceMethod = arrayRealVectorClazz.getDeclaredMethod("getDistance", arrayRealVectorType);
        getDistanceMethod.setAccessible(true);
        java.lang.Object[] getDistanceMethodArguments = new java.lang.Object[1];
        getDistanceMethodArguments[0] = arrayRealVector;
        double actual = ((Double) getDistanceMethod.invoke(arrayRealVector, getDistanceMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:735) */
        arrayRealVector.getDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:735) */
        arrayRealVector.getDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:201)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:735) */
        arrayRealVector.getDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:190)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:735) */
        arrayRealVector.getDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", data);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:202)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:735) */
        arrayRealVector.getDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:735) */
        arrayRealVector.getDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:198)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:735) */
        arrayRealVector.getDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:735) */
        arrayRealVector.getDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:735) */
        arrayRealVector.getDistance(openMapRealVector);
    }
    ///endregion
    
    ///region Errors report for getDistance
    
    public void testGetDistance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDistance([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.returnsFrom {@code return Math.sqrt(sum);}
 *  */
    @Test
    public void testGetDistance_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        double[] doubleArray = {};
        
        double actual = arrayRealVector.getDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} twice
 * @utbot.returnsFrom {@code return Math.sqrt(sum);}
 *  */
    @Test
    public void testGetDistance_IterateForLoop_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        double[] doubleArray = {0.0};
        
        double actual = arrayRealVector.getDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:745) */
        arrayRealVector.getDistance(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for getDistance
    
    public void testGetDistance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDistance(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return getDistance(v.data);}
 *  */
    @Test
    public void testGetDistance_ReturnGetDistance() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getDistance(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return getDistance(v.data);}
 *  */
    @Test
    public void testGetDistance_ReturnGetDistance_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getDistance(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDistance(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getDistance(v.data);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException2() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getDistance(ArrayRealVector.java:769) */
        arrayRealVector.getDistance(((ArrayRealVector) null));
    }
    ///endregion
    
    ///region Errors report for getDistance
    
    public void testGetDistance_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getLInfNorm
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLInfNorm()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfNorm()}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetLInfNorm_ReturnMax() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getLInfNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfNorm()}
 * @utbot.iterates iterate the loop {@code for(double a: data)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetLInfNorm_MathMax() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getLInfNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfNorm()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfNorm()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(double a: data)
 *  */
    @Test
    public void testGetLInfNorm_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getLInfNorm] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getLInfNorm(ArrayRealVector.java:720) */
        arrayRealVector.getLInfNorm();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getL1Norm
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getL1Norm()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Norm()}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetL1Norm_ReturnSum() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getL1Norm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Norm()}
 * @utbot.iterates iterate the loop {@code for(double a: data)} once
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetL1Norm_MathAbs() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-0.0};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getL1Norm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Norm()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Norm()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(double a: data)
 *  */
    @Test
    public void testGetL1Norm_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Norm] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getL1Norm(ArrayRealVector.java:710) */
        arrayRealVector.getL1Norm();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getL1Distance([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetL1Distance_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        double[] doubleArray = {};
        
        double actual = arrayRealVector.getL1Distance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} twice
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetL1Distance_MathAbs() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {30.672152161656413};
        arrayRealVector.data = data;
        double[] doubleArray = {-1.328229308189375};
        
        double actual = arrayRealVector.getL1Distance(doubleArray);
        
        org.junit.Assert.assertEquals(32.00038146984579, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getL1Distance(ArrayRealVector.java:791) */
        arrayRealVector.getL1Distance(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for getL1Distance
    
    public void testGetL1Distance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getL1Distance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetL1Distance_NotVNotInstanceOfArrayRealVector() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        double actual = arrayRealVector.getL1Distance(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.returnsFrom {@code return getL1Distance((ArrayRealVector) v);}
 *  */
    @Test
    public void testGetL1Distance_VInstanceOfArrayRealVector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getL1DistanceMethod = arrayRealVectorClazz.getDeclaredMethod("getL1Distance", arrayRealVectorType);
        getL1DistanceMethod.setAccessible(true);
        java.lang.Object[] getL1DistanceMethodArguments = new java.lang.Object[1];
        getL1DistanceMethodArguments[0] = arrayRealVector;
        double actual = ((Double) getL1DistanceMethod.invoke(arrayRealVector, getL1DistanceMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.returnsFrom {@code return getL1Distance((ArrayRealVector) v);}
 *  */
    @Test
    public void testGetL1Distance_VInstanceOfArrayRealVector_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {131072.50012970148};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {1.5258179921802935};
        arrayRealVector1.data = data1;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getL1DistanceMethod = arrayRealVectorClazz.getDeclaredMethod("getL1Distance", arrayRealVector1Type);
        getL1DistanceMethod.setAccessible(true);
        java.lang.Object[] getL1DistanceMethodArguments = new java.lang.Object[1];
        getL1DistanceMethodArguments[0] = arrayRealVector1;
        double actual = ((Double) getL1DistanceMethod.invoke(arrayRealVector, getL1DistanceMethodArguments));
        
        org.junit.Assert.assertEquals(131070.9743117093, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} twice
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetL1Distance_NotVNotInstanceOfArrayRealVector_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {5.030015707015976E78};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-3.508391050414905E77};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = arrayRealVector.getL1Distance(openMapRealVector);
        
        org.junit.Assert.assertEquals(5.380854812057466E78, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} twice
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testGetL1Distance_NotVNotInstanceOfArrayRealVector_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-1.6688053980058097E-308};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {2048, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, -1.6688053980058097E-308};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = arrayRealVector.getL1Distance(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getL1Distance(ArrayRealVector.java:781) */
        arrayRealVector.getL1Distance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getL1Distance(ArrayRealVector.java:781) */
        arrayRealVector.getL1Distance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:201)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getL1Distance(ArrayRealVector.java:781) */
        arrayRealVector.getL1Distance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:190)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getL1Distance(ArrayRealVector.java:781) */
        arrayRealVector.getL1Distance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", data);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:202)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getL1Distance(ArrayRealVector.java:781) */
        arrayRealVector.getL1Distance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getL1Distance(ArrayRealVector.java:781) */
        arrayRealVector.getL1Distance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getL1Distance(ArrayRealVector.java:781) */
        arrayRealVector.getL1Distance(openMapRealVector);
    }
    ///endregion
    
    ///region Errors report for getL1Distance
    
    public void testGetL1Distance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getL1Distance(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return getL1Distance(v.data);}
 *  */
    @Test
    public void testGetL1Distance_ReturnGetL1Distance() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getL1Distance(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return getL1Distance(v.data);}
 *  */
    @Test
    public void testGetL1Distance_ReturnGetL1Distance_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {-0.0};
        arrayRealVector1.data = data1;
        
        double actual = arrayRealVector.getL1Distance(arrayRealVector1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getL1Distance(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getL1Distance(v.data);
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException2() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getL1Distance(ArrayRealVector.java:815) */
        arrayRealVector.getL1Distance(((ArrayRealVector) null));
    }
    ///endregion
    
    ///region Errors report for getL1Distance
    
    public void testGetL1Distance_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.projection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method projection(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return (ArrayRealVector) v.mapMultiply(dotProduct(v) / v.dotProduct(v));}
 *  */
    @Test
    public void testProjection_ReturnVMapMultiplyDotProductVvDotProductV() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {};
        arrayRealVector1.data = data1;
        
        ArrayRealVector actual = arrayRealVector.projection(arrayRealVector1);
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return (ArrayRealVector) v.mapMultiply(dotProduct(v) / v.dotProduct(v));}
 *  */
    @Test
    public void testProjection_ReturnVMapMultiplyDotProductVvDotProductV_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {1.32624737E-315};
        arrayRealVector1.data = data1;
        
        ArrayRealVector actual = arrayRealVector.projection(arrayRealVector1);
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {java.lang.Double.NaN};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for projection
    
    public void testProjection_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.projection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method projection(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return v.mapMultiply(dotProduct(v) / v.dotProduct(v));}
 *  */
    @Test
    public void testProjection_ReturnVMapMultiply() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {};
        arrayRealVector1.data = data1;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method projectionMethod = arrayRealVectorClazz.getDeclaredMethod("projection", arrayRealVector1Type);
        projectionMethod.setAccessible(true);
        java.lang.Object[] projectionMethodArguments = new java.lang.Object[1];
        projectionMethodArguments[0] = arrayRealVector1;
        ArrayRealVector actual = ((ArrayRealVector) projectionMethod.invoke(arrayRealVector, projectionMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.returnsFrom {@code return v.mapMultiply(dotProduct(v) / v.dotProduct(v));}
 *  */
    @Test
    public void testProjection_ReturnVMapMultiply_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {2.0237E-320};
        arrayRealVector1.data = data1;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method projectionMethod = arrayRealVectorClazz.getDeclaredMethod("projection", arrayRealVector1Type);
        projectionMethod.setAccessible(true);
        java.lang.Object[] projectionMethodArguments = new java.lang.Object[1];
        projectionMethodArguments[0] = arrayRealVector1;
        ArrayRealVector actual = ((ArrayRealVector) projectionMethod.invoke(arrayRealVector, projectionMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data2 = {java.lang.Double.NaN};
        expected.data = data2;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method projection(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return v.mapMultiply(dotProduct(v) / v.dotProduct(v));
 *  */
    @Test
    public void testProjection_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1073741824};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.projection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.linear.ArrayRealVector.dotProduct(ArrayRealVector.java:668)
            org.apache.commons.math.linear.ArrayRealVector.projection(ArrayRealVector.java:884) */
        arrayRealVector.projection(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return v.mapMultiply(dotProduct(v) / v.dotProduct(v));
 *  */
    @Test
    public void testProjection_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.projection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:832)
            org.apache.commons.math.linear.ArrayRealVector.dotProduct(ArrayRealVector.java:668)
            org.apache.commons.math.linear.ArrayRealVector.projection(ArrayRealVector.java:884) */
        arrayRealVector.projection(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return v.mapMultiply(dotProduct(v) / v.dotProduct(v));
 *  */
    @Test
    public void testProjection_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", data);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.projection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry.getIndex(OpenMapRealVector.java:844)
            org.apache.commons.math.linear.ArrayRealVector.dotProduct(ArrayRealVector.java:668)
            org.apache.commons.math.linear.ArrayRealVector.projection(ArrayRealVector.java:884) */
        arrayRealVector.projection(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProjection_ThrowNullPointerException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:141)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:30)
            org.apache.commons.math.linear.AbstractRealVector.mapMultiply(AbstractRealVector.java:521)
            org.apache.commons.math.linear.ArrayRealVector.projection(ArrayRealVector.java:884) */
        arrayRealVector.projection(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProjection_ThrowNullPointerException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:141)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:30)
            org.apache.commons.math.linear.AbstractRealVector.mapMultiply(AbstractRealVector.java:521)
            org.apache.commons.math.linear.ArrayRealVector.projection(ArrayRealVector.java:884) */
        arrayRealVector.projection(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return v.mapMultiply(dotProduct(v) / v.dotProduct(v));
 *  */
    @Test
    public void testProjection_ThrowNullPointerException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry.getIndex(OpenMapRealVector.java:844)
            org.apache.commons.math.linear.ArrayRealVector.dotProduct(ArrayRealVector.java:668)
            org.apache.commons.math.linear.ArrayRealVector.projection(ArrayRealVector.java:884) */
        arrayRealVector.projection(openMapRealVector);
    }
    ///endregion
    
    ///region Errors report for projection
    
    public void testProjection_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.projection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method projection([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#projection(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#projection(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return projection(new ArrayRealVector(v, false));}
 *  */
    @Test
    public void testProjection_ArrayRealVectorProjection() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        double[] doubleArray = {-0.0};
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.projection(doubleArray));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {java.lang.Double.NaN};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for projection
    
    public void testProjection_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return getLInfDistance(v.data);}
 *  */
    @Test
    public void testGetLInfDistance_ReturnGetLInfDistance() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        double actual = arrayRealVector.getLInfDistance(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.returnsFrom {@code return getLInfDistance(v.data);}
 *  */
    @Test
    public void testGetLInfDistance_ReturnGetLInfDistance_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {java.lang.Double.NEGATIVE_INFINITY};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {java.lang.Double.POSITIVE_INFINITY};
        arrayRealVector1.data = data1;
        
        double actual = arrayRealVector.getLInfDistance(arrayRealVector1);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getLInfDistance(v.data);
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(ArrayRealVector.java:861) */
        arrayRealVector.getLInfDistance(((ArrayRealVector) null));
    }
    ///endregion
    
    ///region Errors report for getLInfDistance
    
    public void testGetLInfDistance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetLInfDistance_NotVNotInstanceOfArrayRealVector() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        double actual = arrayRealVector.getLInfDistance(openMapRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.returnsFrom {@code return getLInfDistance((ArrayRealVector) v);}
 *  */
    @Test
    public void testGetLInfDistance_VInstanceOfArrayRealVector() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getLInfDistanceMethod = arrayRealVectorClazz.getDeclaredMethod("getLInfDistance", arrayRealVectorType);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = arrayRealVector;
        double actual = ((Double) getLInfDistanceMethod.invoke(arrayRealVector, getLInfDistanceMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof ArrayRealVector): True}
 * @utbot.returnsFrom {@code return getLInfDistance((ArrayRealVector) v);}
 *  */
    @Test
    public void testGetLInfDistance_VInstanceOfArrayRealVector_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {java.lang.Double.NEGATIVE_INFINITY};
        arrayRealVector.data = data;
        ArrayRealVector arrayRealVector1 = new ArrayRealVector(0);
        double[] data1 = {java.lang.Double.POSITIVE_INFINITY};
        arrayRealVector1.data = data1;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVector1Type = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getLInfDistanceMethod = arrayRealVectorClazz.getDeclaredMethod("getLInfDistance", arrayRealVector1Type);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = arrayRealVector1;
        double actual = ((Double) getLInfDistanceMethod.invoke(arrayRealVector, getLInfDistanceMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(ArrayRealVector.java:827) */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(ArrayRealVector.java:827) */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:190)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(ArrayRealVector.java:827) */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(ArrayRealVector.java:827) */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double delta = data[i] - v.getEntry(i);
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(ArrayRealVector.java:827) */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testGetLInfDistance1() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-1.2495801780096372};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -65536.25000742433);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = arrayRealVector.getLInfDistance(openMapRealVector);
        
        org.junit.Assert.assertEquals(65535.00042724632, actual, 1.0E-6);
    }
    
    @Test
    public void testGetLInfDistance2() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {9.860762490756998E-32};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -1.7726622920963562E277, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = arrayRealVector.getLInfDistance(openMapRealVector);
        
        org.junit.Assert.assertEquals(1.7726622920963562E277, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testGetLInfDistance3() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = new double[16];
        data[0] = 2.6268908555421327E-307;
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.6268908555421327E-307);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 16);
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getLInfDistance] produces [java.lang.NullPointerException] */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    @Test(timeout = 1000L)
    public void testGetLInfDistance4() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    
    @Test(timeout = 1000L)
    public void testGetLInfDistance5() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    
    @Test(timeout = 1000L)
    public void testGetLInfDistance6() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = new double[12];
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[18];
        states[0] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 12);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    
    @Test(timeout = 1000L)
    public void testGetLInfDistance7() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {
            -5.56268464626801E-309, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        arrayRealVector.getLInfDistance(openMapRealVector);
    }
    ///endregion
    
    ///region Errors report for getLInfDistance
    
    public void testGetLInfDistance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLInfDistance([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetLInfDistance_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        double[] doubleArray = {};
        
        double actual = arrayRealVector.getLInfDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; ++i)} twice
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetLInfDistance_MathMax() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-5.0923503667E-313};
        arrayRealVector.data = data;
        double[] doubleArray = {-8.517384299E-313};
        
        double actual = arrayRealVector.getLInfDistance(doubleArray);
        
        org.junit.Assert.assertEquals(3.4250339323E-313, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance([D)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getLInfDistance(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException2() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(ArrayRealVector.java:837) */
        arrayRealVector.getLInfDistance(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for getLInfDistance
    
    public void testGetLInfDistance_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.unitVector
    
    ///region Errors report for unitVector
    
    public void testUnitVector_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$1 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkVectorDimensions(int)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(int)}
 * @utbot.executesCondition {@code (data.length != n): False}
 *  */
    @Test
    public void testCheckVectorDimensions_DataLengthEqualsN() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        arrayRealVector.checkVectorDimensions(1);
    }
    ///endregion
    
    ///region Errors report for checkVectorDimensions
    
    public void testCheckVectorDimensions_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkVectorDimensions(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testCheckVectorDimensions() throws Exception  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        arrayRealVector.checkVectorDimensions(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testCheckVectorDimensions_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        Class arrayRealVectorClazz = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method checkVectorDimensionsMethod = arrayRealVectorClazz.getDeclaredMethod("checkVectorDimensions", arrayRealVectorType);
        checkVectorDimensionsMethod.setAccessible(true);
        java.lang.Object[] checkVectorDimensionsMethodArguments = new java.lang.Object[1];
        checkVectorDimensionsMethodArguments[0] = arrayRealVector;
        checkVectorDimensionsMethod.invoke(arrayRealVector, checkVectorDimensionsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkVectorDimensions(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#checkVectorDimensions(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testCheckVectorDimensions_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector();
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(ArrayRealVector.java:1069) */
        arrayRealVector.checkVectorDimensions(((RealVector) null));
    }
    ///endregion
    
    ///region Errors report for checkVectorDimensions
    
    public void testCheckVectorDimensions_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.getDataRef
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataRef()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#getDataRef()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetDataRef_ReturnData() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        double[] actual = arrayRealVector.getDataRef();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapCbrtToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapCbrtToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCbrtToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapCbrtToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapCbrtToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCbrtToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapCbrtToSelf_MathCbrt() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapCbrtToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapCbrtToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCbrtToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapCbrtToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapCbrtToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapCbrtToSelf(ArrayRealVector.java:523) */
        arrayRealVector.mapCbrtToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapAcosToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapAcosToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAcosToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAcosToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAcosToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAcosToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAcosToSelf_MathAcos() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAcosToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(1.5707963267948966, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapAcosToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAcosToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapAcosToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapAcosToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapAcosToSelf(ArrayRealVector.java:475) */
        arrayRealVector.mapAcosToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapPowToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapPowToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapPowToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapPowToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapPowToSelf(java.lang.Double.NaN));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapPowToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapPowToSelf_MathPow() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapPowToSelf(-0.0));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(1.0, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapPowToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapPowToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapPowToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapPowToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapPowToSelf(ArrayRealVector.java:379) */
        arrayRealVector.mapPowToSelf(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mapPowToSelf(double)
    
    @Test
    public void testMapPowToSelf1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = new double[32];
        data[0] = 2.05226937924702E-289;
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapPowToSelf(1.2377400361250002E10));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(0.0, finalArrayRealVectorData0, 1.0E-6);
    }
    
    @Test
    public void testMapPowToSelf2() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.2250738585072014E-308, 0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapPowToSelf(-4.9E-324));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        double finalArrayRealVectorData1 = arrayRealVector.data[1];
        
        org.junit.Assert.assertEquals(1.0, finalArrayRealVectorData0, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalArrayRealVectorData1, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapAddToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapAddToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAddToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAddToSelf(java.lang.Double.NaN));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAddToSelf_IterateForLoop_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAddToSelf(java.lang.Double.NaN));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapAddToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapAddToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapAddToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapAddToSelf(ArrayRealVector.java:347) */
        arrayRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapCoshToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapCoshToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCoshToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapCoshToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapCoshToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCoshToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapCoshToSelf_MathCosh() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapCoshToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(1.0, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapCoshToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCoshToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapCoshToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapCoshToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapCoshToSelf(ArrayRealVector.java:427) */
        arrayRealVector.mapCoshToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapSubtractToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapSubtractToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSubtractToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSubtractToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSubtractToSelf(java.lang.Double.NaN));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSubtractToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSubtractToSelf_IterateForLoop_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSubtractToSelf(java.lang.Double.NaN));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapSubtractToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSubtractToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapSubtractToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapSubtractToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapSubtractToSelf(ArrayRealVector.java:355) */
        arrayRealVector.mapSubtractToSelf(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapLog10ToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapLog10ToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapLog10ToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapLog10ToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapLog10ToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapLog10ToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapLog10ToSelf_MathLog10() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapLog10ToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapLog10ToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapLog10ToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapLog10ToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapLog10ToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapLog10ToSelf(ArrayRealVector.java:411) */
        arrayRealVector.mapLog10ToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapCosToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapCosToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCosToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapCosToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapCosToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCosToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapCosToSelf_MathCos() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapCosToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(1.0, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapCosToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCosToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapCosToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapCosToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapCosToSelf(ArrayRealVector.java:451) */
        arrayRealVector.mapCosToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapSinToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapSinToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSinToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSinToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSinToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSinToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSinToSelf_MathSin() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSinToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapSinToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSinToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapSinToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapSinToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapSinToSelf(ArrayRealVector.java:459) */
        arrayRealVector.mapSinToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapInvToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapInvToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapInvToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapInvToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapInvToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapInvToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapInvToSelf_IterateForLoop_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapInvToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapInvToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapInvToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapInvToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapInvToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapInvToSelf(ArrayRealVector.java:499) */
        arrayRealVector.mapInvToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapExpm1ToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapExpm1ToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapExpm1ToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapExpm1ToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapExpm1ToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapExpm1ToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapExpm1ToSelf_MathExpm1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapExpm1ToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapExpm1ToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapExpm1ToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapExpm1ToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapExpm1ToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapExpm1ToSelf(ArrayRealVector.java:395) */
        arrayRealVector.mapExpm1ToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapExpToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapExpToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapExpToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapExpToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapExpToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapExpToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapExpToSelf_MathExp() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapExpToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(1.0, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapExpToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapExpToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapExpToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapExpToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapExpToSelf(ArrayRealVector.java:387) */
        arrayRealVector.mapExpToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapLog1pToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapLog1pToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapLog1pToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapLog1pToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapLog1pToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapLog1pToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapLog1pToSelf_MathLog1p() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapLog1pToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapLog1pToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapLog1pToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapLog1pToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapLog1pToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapLog1pToSelf(ArrayRealVector.java:419) */
        arrayRealVector.mapLog1pToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapTanhToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapTanhToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapTanhToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapTanhToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapTanhToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapTanhToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapTanhToSelf_MathTanh() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapTanhToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapTanhToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapTanhToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapTanhToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapTanhToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapTanhToSelf(ArrayRealVector.java:443) */
        arrayRealVector.mapTanhToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapTanToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapTanToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapTanToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapTanToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapTanToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapTanToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapTanToSelf_MathTan() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapTanToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapTanToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapTanToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapTanToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapTanToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapTanToSelf(ArrayRealVector.java:467) */
        arrayRealVector.mapTanToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapAsinToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapAsinToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAsinToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAsinToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAsinToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAsinToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAsinToSelf_MathAsin() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAsinToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapAsinToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAsinToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapAsinToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapAsinToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapAsinToSelf(ArrayRealVector.java:483) */
        arrayRealVector.mapAsinToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapSqrtToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapSqrtToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSqrtToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSqrtToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSqrtToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSqrtToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSqrtToSelf_MathSqrt() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSqrtToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapSqrtToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSqrtToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapSqrtToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapSqrtToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapSqrtToSelf(ArrayRealVector.java:515) */
        arrayRealVector.mapSqrtToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapAbsToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapAbsToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAbsToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAbsToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAbsToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAbsToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAbsToSelf_MathAbs() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {3.337610787760802E-308};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAbsToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapAbsToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAbsToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapAbsToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapAbsToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapAbsToSelf(ArrayRealVector.java:507) */
        arrayRealVector.mapAbsToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapAtanToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapAtanToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAtanToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAtanToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAtanToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAtanToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAtanToSelf_MathAtan() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapAtanToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapAtanToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapAtanToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapAtanToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapAtanToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapAtanToSelf(ArrayRealVector.java:491) */
        arrayRealVector.mapAtanToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapMultiplyToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapMultiplyToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapMultiplyToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapMultiplyToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapMultiplyToSelf(java.lang.Double.NaN));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapMultiplyToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapMultiplyToSelf_IterateForLoop_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapMultiplyToSelf(java.lang.Double.NaN));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapMultiplyToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapMultiplyToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapMultiplyToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapMultiplyToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapMultiplyToSelf(ArrayRealVector.java:363) */
        arrayRealVector.mapMultiplyToSelf(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapCeilToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapCeilToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCeilToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapCeilToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapCeilToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCeilToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapCeilToSelf_MathCeil() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapCeilToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapCeilToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapCeilToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapCeilToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapCeilToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapCeilToSelf(ArrayRealVector.java:531) */
        arrayRealVector.mapCeilToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapDivideToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapDivideToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapDivideToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapDivideToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapDivideToSelf(java.lang.Double.NaN));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapDivideToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapDivideToSelf_IterateForLoop_1() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapDivideToSelf(java.lang.Double.NaN));
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapDivideToSelf(double)
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapDivideToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapDivideToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapDivideToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapDivideToSelf(ArrayRealVector.java:371) */
        arrayRealVector.mapDivideToSelf(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapSinhToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapSinhToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSinhToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSinhToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSinhToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSinhToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapSinhToSelf_MathSinh() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapSinhToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapSinhToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapSinhToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapSinhToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapSinhToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapSinhToSelf(ArrayRealVector.java:435) */
        arrayRealVector.mapSinhToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapLogToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapLogToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapLogToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapLogToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapLogToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapLogToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapLogToSelf_MathLog() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapLogToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
        
        double finalArrayRealVectorData0 = arrayRealVector.data[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, finalArrayRealVectorData0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapLogToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapLogToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapLogToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapLogToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapLogToSelf(ArrayRealVector.java:403) */
        arrayRealVector.mapLogToSelf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.ArrayRealVector.mapFloorToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapFloorToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapFloorToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapFloorToSelf_IterateForLoop() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapFloorToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapFloorToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} twice
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapFloorToSelf_MathFloor() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        ArrayRealVector actual = ((ArrayRealVector) arrayRealVector.mapFloorToSelf());
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(arrayRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapFloorToSelf()
    
    /**
    @utbot.classUnderTest {@link ArrayRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.ArrayRealVector#mapFloorToSelf()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length; i++)
 *  */
    @Test
    public void testMapFloorToSelf_ThrowNullPointerException() {
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        arrayRealVector.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.ArrayRealVector.mapFloorToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.ArrayRealVector.mapFloorToSelf(ArrayRealVector.java:539) */
        arrayRealVector.mapFloorToSelf();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields740423294134100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields740423294134100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass740423294137900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields740423294134100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass740423294137900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

