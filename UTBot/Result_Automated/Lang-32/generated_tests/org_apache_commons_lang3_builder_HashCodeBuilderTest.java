package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_lang3_builder_HashCodeBuilderTest {
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(double)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(double)}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(long)}
 * @utbot.returnsFrom {@code return append(Double.doubleToLongBits(value));}
 *  */
    @Test
    public void testAppend_HashCodeBuilderAppend() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(java.lang.Double.NaN);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(2147024385, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(double)}
     */
    @Test
    public void testAppend() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(1, -1);
        
        HashCodeBuilder actual = hashCodeBuilder.append(-1.1125369292536007E-308);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -1);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -2146959361);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([D)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_HashCodeBuilderAppend1() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        double[] doubleArray = {java.lang.Double.NaN};
        
        HashCodeBuilder actual = hashCodeBuilder.append(doubleArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(2146959360, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        double[] doubleArray = {};
        
        HashCodeBuilder actual = hashCodeBuilder.append(doubleArray);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", 37);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 17);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayEqualsNull() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(((double[]) null));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65025, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(float)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(float)}
 * @utbot.invokes {@link java.lang.Float#floatToIntBits(float)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_FloatFloatToIntBits() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(-2.0000002f);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(-1073676798, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(float)}
     */
    @Test
    public void testAppend1() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(1, -1);
        
        HashCodeBuilder actual = hashCodeBuilder.append(-5.877472E-39f);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -1);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -2143289345);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([F)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_HashCodeBuilderAppend2() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        float[] floatArray = {1.17549435E-38f};
        
        HashCodeBuilder actual = hashCodeBuilder.append(floatArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(8388608, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull1() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        float[] floatArray = {};
        
        HashCodeBuilder actual = hashCodeBuilder.append(floatArray);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", 37);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 17);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayEqualsNull1() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(((float[]) null));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65025, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([B)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_HashCodeBuilderAppend3() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        byte[] byteArray = {(byte) -127};
        
        HashCodeBuilder actual = hashCodeBuilder.append(byteArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(-127, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull2() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        byte[] byteArray = {};
        
        HashCodeBuilder actual = hashCodeBuilder.append(byteArray);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", 37);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 17);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayEqualsNull2() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(((byte[]) null));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65025, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(char)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(char)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(' ');
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65057, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(char)}
     */
    @Test
    public void testAppend2() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(1, -1);
        
        HashCodeBuilder actual = hashCodeBuilder.append('~');
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -1);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 125);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([C)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(char[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_HashCodeBuilderAppend4() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        char[] charArray = {' '};
        
        HashCodeBuilder actual = hashCodeBuilder.append(charArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(32, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(char[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull3() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        char[] charArray = {};
        
        HashCodeBuilder actual = hashCodeBuilder.append(charArray);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", 37);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 17);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(char[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayEqualsNull3() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(((char[]) null));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65025, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): False}
 * @utbot.executesCondition {@code (object instanceof short[]): False}
 * @utbot.executesCondition {@code (object instanceof char[]): False}
 * @utbot.executesCondition {@code (object instanceof byte[]): False}
 * @utbot.executesCondition {@code (object instanceof double[]): False}
 * @utbot.executesCondition {@code (object instanceof float[]): False}
 * @utbot.executesCondition {@code (object instanceof boolean[]): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_NotObjectNotInstanceOfBoolean() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Long long1 = 0L;
        objectArray[1] = ((Object) long1);
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) objectArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): True}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(long[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ObjectInstanceOfLong() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        long[] longArray = {0L};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) longArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): True}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(int[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ObjectInstanceOfInt() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        int[] intArray = {0};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) intArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): False}
 * @utbot.executesCondition {@code (object instanceof short[]): False}
 * @utbot.executesCondition {@code (object instanceof char[]): False}
 * @utbot.executesCondition {@code (object instanceof byte[]): False}
 * @utbot.executesCondition {@code (object instanceof double[]): False}
 * @utbot.executesCondition {@code (object instanceof float[]): False}
 * @utbot.executesCondition {@code (object instanceof boolean[]): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ObjectInstanceOfBoolean() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        boolean[] booleanArray = {false};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) booleanArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(1, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): False}
 * @utbot.executesCondition {@code (object instanceof short[]): False}
 * @utbot.executesCondition {@code (object instanceof char[]): False}
 * @utbot.executesCondition {@code (object instanceof byte[]): False}
 * @utbot.executesCondition {@code (object instanceof double[]): False}
 * @utbot.executesCondition {@code (object instanceof float[]): False}
 * @utbot.executesCondition {@code (object instanceof boolean[]): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ObjectInstanceOfBoolean_1() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        boolean[] booleanArray = {true};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) booleanArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): False}
 * @utbot.executesCondition {@code (object instanceof short[]): False}
 * @utbot.executesCondition {@code (object instanceof char[]): False}
 * @utbot.executesCondition {@code (object instanceof byte[]): False}
 * @utbot.executesCondition {@code (object instanceof double[]): False}
 * @utbot.executesCondition {@code (object instanceof float[]): True}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(float[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ObjectInstanceOfFloat() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        float[] floatArray = {java.lang.Float.NaN};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) floatArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(2143289344, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): False}
 * @utbot.executesCondition {@code (object instanceof short[]): True}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(short[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ObjectInstanceOfShort() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        short[] shortArray = {(short) 0};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) shortArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): False}
 * @utbot.executesCondition {@code (object instanceof short[]): False}
 * @utbot.executesCondition {@code (object instanceof char[]): False}
 * @utbot.executesCondition {@code (object instanceof byte[]): True}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(byte[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ObjectInstanceOfByte() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        byte[] byteArray = {(byte) 0};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) byteArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): False}
 * @utbot.executesCondition {@code (object instanceof short[]): False}
 * @utbot.executesCondition {@code (object instanceof char[]): False}
 * @utbot.executesCondition {@code (object instanceof byte[]): False}
 * @utbot.executesCondition {@code (object instanceof double[]): True}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(double[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ObjectInstanceOfDouble() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        double[] doubleArray = {java.lang.Double.NaN};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) doubleArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(2146959360, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): False}
 * @utbot.executesCondition {@code (object instanceof short[]): False}
 * @utbot.executesCondition {@code (object instanceof char[]): True}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(char[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ObjectInstanceOfChar() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        char[] charArray = {'\u0000'};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) charArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object)}
 * @utbot.executesCondition {@code (object instanceof long[]): False}
 * @utbot.executesCondition {@code (object instanceof int[]): False}
 * @utbot.executesCondition {@code (object instanceof short[]): False}
 * @utbot.executesCondition {@code (object instanceof char[]): False}
 * @utbot.executesCondition {@code (object instanceof byte[]): False}
 * @utbot.executesCondition {@code (object instanceof double[]): False}
 * @utbot.executesCondition {@code (object instanceof float[]): False}
 * @utbot.executesCondition {@code (object instanceof boolean[]): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_NotObjectNotInstanceOfBoolean_1() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = {null};
        
        HashCodeBuilder actual = hashCodeBuilder.append(((Object) objectArray));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        char[] charArray = {'\u0000'};
        objectArray[0] = ((Object) charArray);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_1() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = {null};
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_2() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_3() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        int[] intArray = {0};
        objectArray[0] = ((Object) intArray);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_4() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        double[] doubleArray = {java.lang.Double.NaN};
        objectArray[0] = ((Object) doubleArray);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(2146959360, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_5() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        long[] longArray = {0L};
        objectArray[0] = ((Object) longArray);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_6() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        boolean[] booleanArray = {true};
        objectArray[0] = ((Object) booleanArray);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_7() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        boolean[] booleanArray = {false};
        objectArray[0] = ((Object) booleanArray);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(1, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_8() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        byte[] byteArray = {(byte) 0};
        objectArray[0] = ((Object) byteArray);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_9() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        short[] shortArray = {(short) 0};
        objectArray[0] = ((Object) shortArray);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_IterateForLoop_10() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        float[] floatArray = {java.lang.Float.NaN};
        objectArray[0] = ((Object) floatArray);
        
        HashCodeBuilder actual = hashCodeBuilder.append(objectArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(2143289344, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(short)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(short)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return1() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append((short) 1);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65026, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(short)}
     */
    @Test
    public void testAppend3() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(1, -1);
        
        HashCodeBuilder actual = hashCodeBuilder.append((short) -9);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -1);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -10);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([S)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_HashCodeBuilderAppend5() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        short[] shortArray = {(short) -255};
        
        HashCodeBuilder actual = hashCodeBuilder.append(shortArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(-255, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull4() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        short[] shortArray = {};
        
        HashCodeBuilder actual = hashCodeBuilder.append(shortArray);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", 37);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 17);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayEqualsNull4() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(((short[]) null));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65025, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(int)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return2() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(1);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65026, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(int)}
     */
    @Test
    public void testAppend4() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(1, -1);
        
        HashCodeBuilder actual = hashCodeBuilder.append(-65);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -1);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -66);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([I)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_HashCodeBuilderAppend6() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        int[] intArray = {-255};
        
        HashCodeBuilder actual = hashCodeBuilder.append(intArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(-255, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull5() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        int[] intArray = {};
        
        HashCodeBuilder actual = hashCodeBuilder.append(intArray);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", 37);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 17);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(int[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayEqualsNull5() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(((int[]) null));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65025, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(long)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(long)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return3() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(1L);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65026, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([J)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_HashCodeBuilderAppend7() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        long[] longArray = {-255L};
        
        HashCodeBuilder actual = hashCodeBuilder.append(longArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(254, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull6() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        long[] longArray = {};
        
        HashCodeBuilder actual = hashCodeBuilder.append(longArray);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", 37);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 17);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayEqualsNull6() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(((long[]) null));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65025, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(boolean)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_NotValue() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 1);
        
        HashCodeBuilder actual = hashCodeBuilder.append(false);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(-254, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Value() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 1);
        
        HashCodeBuilder actual = hashCodeBuilder.append(true);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(-255, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([Z)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull7() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        boolean[] booleanArray = {false};
        
        HashCodeBuilder actual = hashCodeBuilder.append(booleanArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(1, finalHashCodeBuilderITotal);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull_1() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        boolean[] booleanArray = {true};
        
        HashCodeBuilder actual = hashCodeBuilder.append(booleanArray);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(boolean[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayNotEqualsNull_2() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        boolean[] booleanArray = {};
        
        HashCodeBuilder actual = hashCodeBuilder.append(booleanArray);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", 37);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", 17);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(boolean[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ArrayEqualsNull7() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append(((boolean[]) null));
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65025, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(byte)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(byte)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return4() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.append((byte) -127);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(64898, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#append(byte)}
     */
    @Test
    public void testAppend5() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(1, -1);
        
        HashCodeBuilder actual = hashCodeBuilder.append((byte) -3);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -1);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -4);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#hashCode()}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#toHashCode()}
 * @utbot.returnsFrom {@code return toHashCode();}
 *  */
    @Test
    public void testHashCode_HashCodeBuilderToHashCode() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        int actual = hashCodeBuilder.hashCode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#hashCode()}
     */
    @Test
    public void testHashCode() {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(-2147483647, -1);
        
        int actual = hashCodeBuilder.hashCode();
        
        assertEquals(-2147483647, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRegistered(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#isRegistered(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#getRegistry()}
 *  */
    @Test
    public void testIsRegistered_HashCodeBuilderGetRegistry() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            boolean actual = HashCodeBuilder.isRegistered(null);
            
            assertFalse(actual);
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isRegistered(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#isRegistered(java.lang.Object)}
     */
    @Test
    public void testIsRegisteredReturnsFalse() {
        boolean actual = HashCodeBuilder.isRegistered(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.register
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method register(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#register(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#getRegistry()}
 *  */
    @Test
    public void testRegister_HashCodeBuilderGetRegistry() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashCodeBuilder.register(null);
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method register(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#register(java.lang.Object)}
     */
    @Test
    public void testRegister() {
        HashCodeBuilder.register(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.unregister
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unregister(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#unregister(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#getRegistry()}
 *  */
    @Test
    public void testUnregister_HashCodeBuilderGetRegistry() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashCodeBuilder.unregister(null);
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unregister(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#unregister(java.lang.Object)}
     */
    @Test
    public void testUnregister() {
        HashCodeBuilder.unregister(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.appendSuper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSuper(int)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#appendSuper(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendSuper_Return() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -255);
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        HashCodeBuilder actual = hashCodeBuilder.appendSuper(1);
        
        int hashCodeBuilderIConstant = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(hashCodeBuilderIConstant, actualIConstant);
        
        int hashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(hashCodeBuilderITotal, actualITotal);
        
        int finalHashCodeBuilderITotal = ((Integer) getFieldValue(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        
        assertEquals(65026, finalHashCodeBuilderITotal);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendSuper(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#appendSuper(int)}
     */
    @Test
    public void testAppendSuper() throws Exception  {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(1, -1);
        
        HashCodeBuilder actual = hashCodeBuilder.appendSuper(-65);
        
        HashCodeBuilder expected = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant", -1);
        setField(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -66);
        
        int expectedIConstant = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        int actualIConstant = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iConstant"));
        assertEquals(expectedIConstant, actualIConstant);
        
        int expectedITotal = ((Integer) getFieldValue(expected, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        int actualITotal = ((Integer) getFieldValue(actual, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal"));
        assertEquals(expectedITotal, actualITotal);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.toHashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toHashCode()
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#toHashCode()}
 * @utbot.returnsFrom {@code return iTotal;}
 *  */
    @Test
    public void testToHashCode_ReturnITotal() throws Exception  {
        HashCodeBuilder hashCodeBuilder = ((HashCodeBuilder) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setField(hashCodeBuilder, "org.apache.commons.lang3.builder.HashCodeBuilder", "iTotal", -255);
        
        int actual = hashCodeBuilder.toHashCode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toHashCode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#toHashCode()}
     */
    @Test
    public void testToHashCode() {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(-2147483647, -1);
        
        int actual = hashCodeBuilder.toHashCode();
        
        assertEquals(-2147483647, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reflectionHashCode(int, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException() {
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd initial value]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:570)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:259) */
        HashCodeBuilder.reflectionHashCode(2, -255, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException_1() {
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd multiplier]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:571)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:259) */
        HashCodeBuilder.reflectionHashCode(1, 0, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException_2() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd initial value]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:570)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:259) */
        HashCodeBuilder.reflectionHashCode(0, -255, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException_3() {
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd multiplier]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:571)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:259) */
        HashCodeBuilder.reflectionHashCode(1, -254, shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:259) */
        HashCodeBuilder.reflectionHashCode(1, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SECURITY for method reflectionHashCode(int, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.throwsException {@link java.security.AccessControlException} 
 *  */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode_ThrowAccessControlException() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            short[] shortArray = {};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:259) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method reflectionHashCode(int, int, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object)}
     */
    @Test
    public void testReflectionHashCodeThrowsNPE() {
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:259) */
        HashCodeBuilder.reflectionHashCode(16384, -1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reflectionHashCode(int, int, java.lang.Object, boolean)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException1() {
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd multiplier]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:571)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:306) */
        HashCodeBuilder.reflectionHashCode(1, 0, intArray, false);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException_11() {
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd initial value]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:570)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:306) */
        HashCodeBuilder.reflectionHashCode(2, -255, shortArray, false);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException_21() {
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd multiplier]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:571)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:306) */
        HashCodeBuilder.reflectionHashCode(1, -254, intArray, false);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException_31() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd initial value]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:570)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:306) */
        HashCodeBuilder.reflectionHashCode(0, -255, byteArray, false);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:306) */
        HashCodeBuilder.reflectionHashCode(1, -255, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SECURITY for method reflectionHashCode(int, int, java.lang.Object, boolean)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.throwsException {@link java.security.AccessControlException} 
 *  */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode_ThrowAccessControlException1() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            int[] intArray = {};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:306) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method reflectionHashCode(int, int, java.lang.Object, boolean)
    
    @Test
    public void testReflectionHashCodeByFuzzer() {
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:306) */
        HashCodeBuilder.reflectionHashCode(2147483583, -1, null, false);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method reflectionHashCode(int, int, java.lang.Object, boolean)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode1() {
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
            java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:306) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode
    
    ///region Errors report for reflectionHashCode
    
    public void testReflectionHashCode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 50 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reflectionHashCode(java.lang.Object, boolean)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return reflectionHashCode(17, 37, object, testTransients, null, null);
 *  */
    @Test
    public void testReflectionHashCode_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        HashCodeBuilder.reflectionHashCode(((Object) null), false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SECURITY for method reflectionHashCode(java.lang.Object, boolean)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.throwsException {@link java.security.AccessControlException} in: return reflectionHashCode(17, 37, object, testTransients, null, null);
 *  */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode_ThrowAccessControlException2() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            byte[] byteArray = {};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method reflectionHashCode(java.lang.Object, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,boolean)}
     */
    @Test
    public void testReflectionHashCodeThrowsNPE1() {
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        HashCodeBuilder.reflectionHashCode(((Object) null), false);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method reflectionHashCode(java.lang.Object, boolean)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode2() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 14);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] preHashedMap2Array = createArray("sun.util.PreHashedMap$2", 0);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "accessClassInPackage.sun.util")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.SecurityManager.checkPackageAccess(SecurityManager.java:1332)
                java.base/java.lang.Class.checkPackageAccess(Class.java:3073)
                java.base/java.lang.Class.checkMemberAccess(Class.java:3054)
                java.base/java.lang.Class.getDeclaredFields(Class.java:2369)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:194)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode3() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] preHashedMap2Array = createArray("sun.util.PreHashedMap$2", 0);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "accessClassInPackage.sun.util")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.SecurityManager.checkPackageAccess(SecurityManager.java:1332)
                java.base/java.lang.Class.checkPackageAccess(Class.java:3073)
                java.base/java.lang.Class.checkMemberAccess(Class.java:3054)
                java.base/java.lang.Class.getDeclaredFields(Class.java:2369)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:194)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode4() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 125269785);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] checkedEntrySetArray = createArray("java.lang.ProcessEnvironment$CheckedEntrySet", 0);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode5() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] preHashedMap2Array = createArray("sun.util.PreHashedMap$2", 0);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "accessClassInPackage.sun.util")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.SecurityManager.checkPackageAccess(SecurityManager.java:1332)
                java.base/java.lang.Class.checkPackageAccess(Class.java:3073)
                java.base/java.lang.Class.checkMemberAccess(Class.java:3054)
                java.base/java.lang.Class.getDeclaredFields(Class.java:2369)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:194)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode6() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] preHashedMap2Array = createArray("sun.util.PreHashedMap$2", 0);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "accessClassInPackage.sun.util")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.SecurityManager.checkPackageAccess(SecurityManager.java:1332)
                java.base/java.lang.Class.checkPackageAccess(Class.java:3073)
                java.base/java.lang.Class.checkMemberAccess(Class.java:3054)
                java.base/java.lang.Class.getDeclaredFields(Class.java:2369)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:194)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode7() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 14);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] preHashedMap2Array = createArray("sun.util.PreHashedMap$2", 0);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "accessClassInPackage.sun.util")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.SecurityManager.checkPackageAccess(SecurityManager.java:1332)
                java.base/java.lang.Class.checkPackageAccess(Class.java:3073)
                java.base/java.lang.Class.checkMemberAccess(Class.java:3054)
                java.base/java.lang.Class.getDeclaredFields(Class.java:2369)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:194)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode8() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] objectArray = {};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode9() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 14);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] preHashedMap2Array = createArray("sun.util.PreHashedMap$2", 0);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "accessClassInPackage.sun.util")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.SecurityManager.checkPackageAccess(SecurityManager.java:1332)
                java.base/java.lang.Class.checkPackageAccess(Class.java:3073)
                java.base/java.lang.Class.checkMemberAccess(Class.java:3054)
                java.base/java.lang.Class.getDeclaredFields(Class.java:2369)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:194)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode10() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object checkedEntrySet = createInstance("java.lang.ProcessEnvironment$CheckedEntrySet");
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode11() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 14);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] negotiateAuthentication1Array = createArray("[Lsun.net.www.protocol.http.NegotiateAuthentication$1;", 0);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "accessClassInPackage.sun.net.www.protocol.http")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.SecurityManager.checkPackageAccess(SecurityManager.java:1332)
                java.base/java.lang.Class.checkPackageAccess(Class.java:3073)
                java.base/java.lang.Class.checkMemberAccess(Class.java:3054)
                java.base/java.lang.Class.getDeclaredFields(Class.java:2369)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:194)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:408) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region Errors report for reflectionHashCode
    
    public void testReflectionHashCode_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reflectionHashCode(java.lang.Object, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.util.Collection)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.ReflectionToStringBuilder#toNoNullStringArray(java.util.Collection)}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return reflectionHashCode(object, ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
 *  */
    @Test
    public void testReflectionHashCode_ThrowNullPointerException3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.String[] prevEMPTY_STRING_ARRAY = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        try {
            java.lang.String[] emptyStringArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_STRING_ARRAY", emptyStringArray);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
                java.base/java.util.Objects.requireNonNull(Objects.java:334)
                org.apache.commons.lang3.Validate.notNull(Validate.java:225)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
            HashCodeBuilder.reflectionHashCode(((Object) null), ((Collection) null));
        } finally {
            setStaticField(org.apache.commons.lang3.ArrayUtils.class, "EMPTY_STRING_ARRAY", prevEMPTY_STRING_ARRAY);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method reflectionHashCode(java.lang.Object, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.util.Collection)}
     */
    @Test
    public void testReflectionHashCodeThrowsNPE2() {
        HashSet hashSet = new HashSet();
        hashSet.add("#$\\\"'");
        hashSet.add("\n\t\r");
        hashSet.add("-3");
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
        HashCodeBuilder.reflectionHashCode(((Object) null), hashSet);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method reflectionHashCode(java.lang.Object, java.util.Collection)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode12() {
        Object object = new Object();
        HashSet hashSet = new HashSet();
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
            java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode13() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.String[] prevEMPTY_STRING_ARRAY = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        try {
            java.lang.String[] emptyStringArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_STRING_ARRAY", emptyStringArray);
            Object object = new Object();
            ArrayList arrayList = new ArrayList();
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
        } finally {
            setStaticField(org.apache.commons.lang3.ArrayUtils.class, "EMPTY_STRING_ARRAY", prevEMPTY_STRING_ARRAY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode14() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.String[] prevEMPTY_STRING_ARRAY = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        try {
            java.lang.String[] emptyStringArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_STRING_ARRAY", emptyStringArray);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
        } finally {
            setStaticField(org.apache.commons.lang3.ArrayUtils.class, "EMPTY_STRING_ARRAY", prevEMPTY_STRING_ARRAY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode15() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.String[] prevEMPTY_STRING_ARRAY = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        try {
            java.lang.String[] emptyStringArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_STRING_ARRAY", emptyStringArray);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
        } finally {
            setStaticField(org.apache.commons.lang3.ArrayUtils.class, "EMPTY_STRING_ARRAY", prevEMPTY_STRING_ARRAY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode16() {
        Object object = new Object();
        HashSet hashSet = new HashSet();
        String string = "";
        hashSet.add(string);
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
            java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode17() {
        Object object = new Object();
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
            java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode18() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        java.lang.String[] prevEMPTY_STRING_ARRAY = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        try {
            java.lang.String[] emptyStringArray = {};
            Class arrayUtilsClazz = Class.forName("org.apache.commons.lang3.ArrayUtils");
            setStaticField(arrayUtilsClazz, "EMPTY_STRING_ARRAY", emptyStringArray);
            Object object = new Object();
            ArrayList arrayList = new ArrayList();
            arrayList.add(null);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
        } finally {
            setStaticField(org.apache.commons.lang3.ArrayUtils.class, "EMPTY_STRING_ARRAY", prevEMPTY_STRING_ARRAY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode19() {
        Object object = new Object();
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
            java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode20() {
        Object object = new Object();
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        String string = "";
        hashSet.add(string);
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
            java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode21() {
        Object object = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        String string = "";
        arrayList.add(string);
        arrayList.add(string);
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
            java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode22() {
        Object object = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        String string = "";
        arrayList.add(string);
        arrayList.add(string);
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
            java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:448) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reflectionHashCode(java.lang.Object, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return reflectionHashCode(17, 37, object, false, null, excludeFields);
 *  */
    @Test
    public void testReflectionHashCode_ThrowNullPointerException4() {
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        HashCodeBuilder.reflectionHashCode(((Object) null), ((java.lang.String[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SECURITY for method reflectionHashCode(java.lang.Object, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.throwsException {@link java.security.AccessControlException} in: return reflectionHashCode(17, 37, object, false, null, excludeFields);
 *  */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode_ThrowAccessControlException3() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            short[] shortArray = {};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method reflectionHashCode(java.lang.Object, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,java.lang.String[])}
     */
    @Test
    public void testReflectionHashCodeThrowsNPEWithNonEmptyObjectArray() {
        java.lang.String[] stringArray = {"#$\\\"'", "\n\t\r", "-3"};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        HashCodeBuilder.reflectionHashCode(((Object) null), stringArray);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method reflectionHashCode(java.lang.Object, [Ljava.lang.String;)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode23() {
        Object object = new Object();
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
            java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode24() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 14);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode25() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode26() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode27() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode28() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 39);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode29() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 125541036);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode30() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 14);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode31() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            java.lang.String[] stringArray = {};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode32() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 259840);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:489) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode
    
    ///region Errors report for reflectionHashCode
    
    public void testReflectionHashCode_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 22 occurrences of:
        // Concrete execution failed
        
        // 9 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reflectionHashCode(int, int, java.lang.Object, boolean, java.lang.Class, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: HashCodeBuilder builder = new HashCodeBuilder(initialNonZeroOddNumber, multiplierNonZeroOddNumber);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException2() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd initial value]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:570)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362) */
        HashCodeBuilder.reflectionHashCode(2, -255, byteArray, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: HashCodeBuilder builder = new HashCodeBuilder(initialNonZeroOddNumber, multiplierNonZeroOddNumber);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException_12() {
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd initial value]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:570)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362) */
        HashCodeBuilder.reflectionHashCode(0, -255, shortArray, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: HashCodeBuilder builder = new HashCodeBuilder(initialNonZeroOddNumber, multiplierNonZeroOddNumber);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException_22() {
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd multiplier]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:571)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362) */
        HashCodeBuilder.reflectionHashCode(1, 0, intArray, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: HashCodeBuilder builder = new HashCodeBuilder(initialNonZeroOddNumber, multiplierNonZeroOddNumber);
 *  */
    @Test
    public void testReflectionHashCode_ThrowIllegalArgumentException_32() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.IllegalArgumentException: HashCodeBuilder requires an odd multiplier]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.builder.HashCodeBuilder.<init>(HashCodeBuilder.java:571)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:362) */
        HashCodeBuilder.reflectionHashCode(1, -254, byteArray, false, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: object == null
 *  */
    @Test
    public void testReflectionHashCode_ThrowNullPointerException5() {
        /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.lang.NullPointerException: The object to build a hash code for must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:361) */
        HashCodeBuilder.reflectionHashCode(1, -255, null, false, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SECURITY for method reflectionHashCode(int, int, java.lang.Object, boolean, java.lang.Class, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean,java.lang.Class,java.lang.String[])}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes org.apache.commons.lang3.builder.HashCodeBuilder#reflectionAppend(java.lang.Object,java.lang.Class,org.apache.commons.lang3.builder.HashCodeBuilder,boolean,java.lang.String[])
 * @utbot.throwsException {@link java.security.AccessControlException} 
 *  */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode_ThrowAccessControlException4() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 132579200);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            byte[][] byteArray = {};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region OTHER: SECURITY for method reflectionHashCode(int, int, java.lang.Object, boolean, java.lang.Class, [Ljava.lang.String;)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode33() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 125550318);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object innocuousForkJoinWorkerThread = createInstance("java.util.concurrent.ForkJoinWorkerThread$InnocuousForkJoinWorkerThread");
            Class class1 = Object.class;
            java.lang.String[] stringArray = new java.lang.String[12];
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode34() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 31);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            java.lang.Object[] keySetArray = createArray("[Lsun.util.resources.ParallelListResourceBundle$KeySet;", 0);
            Class class1 = Object.class;
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "accessClassInPackage.sun.util.resources")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.SecurityManager.checkPackageAccess(SecurityManager.java:1332)
                java.base/java.lang.Class.checkPackageAccess(Class.java:3073)
                java.base/java.lang.Class.checkMemberAccess(Class.java:3054)
                java.base/java.lang.Class.getDeclaredFields(Class.java:2369)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:194)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode35() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object checkedEntrySet = createInstance("java.lang.ProcessEnvironment$CheckedEntrySet");
            Class class1 = Object.class;
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode36() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 124772006);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object keySet = createInstance("java.util.IdentityHashMap$KeySet");
            Class class1 = Object.class;
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode37() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 31);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            Class class1 = Object.class;
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode38() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            Class class1 = Object.class;
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode39() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 100564864);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            Class class1 = Object.class;
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode40() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            Class class1 = Object.class;
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode41() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            Class class1 = Object.class;
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testReflectionHashCode42() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            Object object = new Object();
            Class class1 = Object.class;
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode] produces [java.security.AccessControlException: access denied ("java.lang.reflect.ReflectPermission" "suppressAccessChecks")]
                java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
                java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
                java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
                java.base/java.lang.reflect.AccessibleObject.checkPermission(AccessibleObject.java:91)
                java.base/java.lang.reflect.AccessibleObject.setAccessible(AccessibleObject.java:125)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:196)
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:364) */
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRegistry()
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#getRegistry()}
 * @utbot.invokes {@link java.lang.ThreadLocal#get()}
 *  */
    @Test
    public void testGetRegistry_ThreadLocalGet() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRegistry()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#getRegistry()}
     */
    @Test
    public void testGetRegistry() {
        Set actual = HashCodeBuilder.getRegistry();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRegistry()
    
    @Test
    public void testGetRegistry1() {
        HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
        
        HashSet expected = new HashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetRegistry2() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    public void testGetRegistry3() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 14);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    public void testGetRegistry4() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 9);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    public void testGetRegistry5() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    public void testGetRegistry6() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    public void testGetRegistry7() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 14);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    public void testGetRegistry8() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    public void testGetRegistry9() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 14);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    public void testGetRegistry10() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    
    @Test
    public void testGetRegistry11() throws Exception  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            HashSet actual = ((HashSet) HashCodeBuilder.getRegistry());
            
            HashSet expected = new HashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reflectionAppend(java.lang.Object, java.lang.Class, org.apache.commons.lang3.builder.HashCodeBuilder, boolean, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HashCodeBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionAppend(java.lang.Object,java.lang.Class,org.apache.commons.lang3.builder.HashCodeBuilder,boolean,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.lang3.builder.HashCodeBuilder#isRegistered(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isRegistered(object)
 *  */
    @Test
    public void testReflectionAppend_ThrowNullPointerException() throws Throwable  {
        Class hashCodeBuilderClazz = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        ThreadLocal prevREGISTRY = ((ThreadLocal) getStaticFieldValue(hashCodeBuilderClazz, "REGISTRY"));
        try {
            ThreadLocal registry = ((ThreadLocal) createInstance("org.apache.commons.lang3.builder.HashCodeBuilder$1"));
            setField(registry, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setStaticField(hashCodeBuilderClazz, "REGISTRY", registry);
            
            /* This test fails because method [org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend] produces [java.lang.NullPointerException]
                org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:194) */
            Class objectType = Class.forName("java.lang.Object");
            Class classType = Class.forName("java.lang.Class");
            Class booleanType = boolean.class;
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Method reflectionAppendMethod = hashCodeBuilderClazz.getDeclaredMethod("reflectionAppend", objectType, classType, hashCodeBuilderClazz, booleanType, stringArrayType);
            reflectionAppendMethod.setAccessible(true);
            java.lang.Object[] reflectionAppendMethodArguments = new java.lang.Object[5];
            reflectionAppendMethodArguments[0] = ((Object) null);
            reflectionAppendMethodArguments[1] = ((Object) null);
            reflectionAppendMethodArguments[2] = ((Object) null);
            reflectionAppendMethodArguments[3] = false;
            reflectionAppendMethodArguments[4] = ((Object) null);
            try {
                reflectionAppendMethod.invoke(null, reflectionAppendMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(HashCodeBuilder.class, "REGISTRY", prevREGISTRY);
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields669196947769900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields669196947769900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass669196947783300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields669196947769900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass669196947783300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields669196948440900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields669196948440900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass669196948444100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields669196948440900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass669196948444100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields669196949144300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields669196949144300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass669196949147500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields669196949144300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass669196949147500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields669196950341300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields669196950341300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass669196950345200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields669196950341300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass669196950345200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

