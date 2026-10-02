package org.apache.commons.collections;

import org.junit.Test;
import java.util.NoSuchElementException;
import java.util.LinkedHashMap;
import sun.security.ssl.SunJSSE;
import java.util.Properties;
import sun.security.provider.VerificationProvider;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.junit.Ignore;
import java.util.Stack;
import java.util.Vector;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_collections_ExtendedPropertiesTest {
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.isInitialized
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInitialized()
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#isInitialized()}
 * @utbot.returnsFrom {@code return isInitialized;}
 *  */
    @Test
    public void testIsInitialized_ReturnIsInitialized() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        boolean actual = extendedProperties.isInitialized();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.remove
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#remove(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object ret = getProperty(strKey);
 *  */
    @Test
    public void testRemove_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.remove] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getProperty(ExtendedProperties.java:650)
            org.apache.commons.collections.ExtendedProperties.remove(ExtendedProperties.java:1776) */
        extendedProperties.remove(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.put
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object ret = getProperty(strKey);
 *  */
    @Test
    public void testPut_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.put] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getProperty(ExtendedProperties.java:650)
            org.apache.commons.collections.ExtendedProperties.put(ExtendedProperties.java:1740) */
        extendedProperties.put(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getProperty(java.lang.String)}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.invokes {@link java.util.Hashtable#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return obj;}
 *  */
    @Test
    public void testGetProperty_DefaultsEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        Object actual = extendedProperties.getProperty(string);
        
        assertNull(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Hashtable#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object obj = super.get(key);
 *  */
    @Test
    public void testGetProperty_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getProperty] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getProperty(ExtendedProperties.java:650) */
        extendedProperties.getProperty(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getBoolean
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getBoolean(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String)}
 * @utbot.executesCondition {@code (b != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String,java.lang.Boolean)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} when: b != null
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testGetBoolean_ThrowNoSuchElementException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        extendedProperties.getBoolean(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBoolean(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String,java.lang.Boolean)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Boolean b = getBoolean(key, null);
 *  */
    @Test
    public void testGetBoolean_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getBoolean] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getBoolean(ExtendedProperties.java:1212)
            org.apache.commons.collections.ExtendedProperties.getBoolean(ExtendedProperties.java:1179) */
        extendedProperties.getBoolean(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBoolean(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String,boolean)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String,java.lang.Boolean)}
 * @utbot.invokes {@link java.lang.Boolean#booleanValue()}
 * @utbot.returnsFrom {@code return getBoolean(key, new Boolean(defaultValue)).booleanValue();}
 *  */
    @Test
    public void testGetBoolean_BooleanBooleanValue() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 2);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "  ";
        
        boolean actual = extendedProperties.getBoolean(string, false);
        
        assertFalse(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        Object extendedPropertiesTable1 = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable1 = get(extendedPropertiesTable1, 1);
        
        assertNull(finalExtendedPropertiesTable0);
        
        assertNull(finalExtendedPropertiesTable1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBoolean(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String,boolean)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String,java.lang.Boolean)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getBoolean(key, new Boolean(defaultValue)).booleanValue();
 *  */
    @Test
    public void testGetBoolean_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getBoolean] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getBoolean(ExtendedProperties.java:1212)
            org.apache.commons.collections.ExtendedProperties.getBoolean(ExtendedProperties.java:1197) */
        extendedProperties.getBoolean(string, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBoolean(java.lang.String, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String,java.lang.Boolean)}
 * @utbot.executesCondition {@code (value instanceof Boolean): False}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetBoolean_DefaultsEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 2);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        Boolean actual = extendedProperties.getBoolean(string, ((Boolean) null));
        
        assertNull(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        Object extendedPropertiesTable1 = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable1 = get(extendedPropertiesTable1, 1);
        
        assertNull(finalExtendedPropertiesTable0);
        
        assertNull(finalExtendedPropertiesTable1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBoolean(java.lang.String, java.lang.Boolean)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getBoolean(java.lang.String,java.lang.Boolean)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetBoolean_ThrowArithmeticException2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getBoolean] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getBoolean(ExtendedProperties.java:1212) */
        extendedProperties.getBoolean(string, ((Boolean) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getByte
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getByte(java.lang.String, java.lang.Byte)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String,java.lang.Byte)}
 * @utbot.executesCondition {@code (value instanceof Byte): False}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetByte_DefaultsEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        Byte actual = extendedProperties.getByte(string, ((Byte) null));
        
        assertNull(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getByte(java.lang.String, java.lang.Byte)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String,java.lang.Byte)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetByte_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getByte] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getByte(ExtendedProperties.java:1307) */
        extendedProperties.getByte(string, ((Byte) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getByte
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getByte(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String)}
 * @utbot.executesCondition {@code (b != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String,java.lang.Byte)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} when: b != null
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testGetByte_ThrowNoSuchElementException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        extendedProperties.getByte(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getByte(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String,java.lang.Byte)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Byte b = getByte(key, null);
 *  */
    @Test
    public void testGetByte_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getByte] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getByte(ExtendedProperties.java:1307)
            org.apache.commons.collections.ExtendedProperties.getByte(ExtendedProperties.java:1271) */
        extendedProperties.getByte(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getByte
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getByte(java.lang.String, byte)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String,byte)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String,java.lang.Byte)}
 * @utbot.invokes {@link java.lang.Byte#byteValue()}
 * @utbot.returnsFrom {@code return getByte(key, new Byte(defaultValue)).byteValue();}
 *  */
    @Test
    public void testGetByte_ByteByteValue() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        byte actual = extendedProperties.getByte(string, (byte) -127);
        
        assertEquals((byte) -127, actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getByte(java.lang.String, byte)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String,byte)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getByte(java.lang.String,java.lang.Byte)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getByte(key, new Byte(defaultValue)).byteValue();
 *  */
    @Test
    public void testGetByte_ThrowArithmeticException2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getByte] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getByte(ExtendedProperties.java:1307)
            org.apache.commons.collections.ExtendedProperties.getByte(ExtendedProperties.java:1291) */
        extendedProperties.getByte(string, (byte) -127);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getShort
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShort(java.lang.String, java.lang.Short)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String,java.lang.Short)}
 * @utbot.executesCondition {@code (value instanceof Short): False}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetShort_DefaultsEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        Short actual = extendedProperties.getShort(string, ((Short) null));
        
        assertNull(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getShort(java.lang.String, java.lang.Short)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String,java.lang.Short)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetShort_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getShort] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getShort(ExtendedProperties.java:1377) */
        extendedProperties.getShort(string, ((Short) null));
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String,java.lang.Short)}
 * @utbot.executesCondition {@code (value instanceof Short): False}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.returnsFrom {@code return defaultValue;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return defaultValue;
 *  */
    @Test
    public void testGetShort_ThrowNullPointerException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 5);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(next, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getShort] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.get(Hashtable.java:384)
            org.apache.commons.collections.ExtendedProperties.getShort(ExtendedProperties.java:1377) */
        extendedProperties.getShort(string, ((Short) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getShort
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShort(java.lang.String, short)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String,short)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String,java.lang.Short)}
 * @utbot.invokes {@link java.lang.Short#shortValue()}
 * @utbot.returnsFrom {@code return getShort(key, new Short(defaultValue)).shortValue();}
 *  */
    @Test
    public void testGetShort_ShortShortValue() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        short actual = extendedProperties.getShort(string, (short) -255);
        
        assertEquals((short) -255, actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getShort(java.lang.String, short)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String,short)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String,java.lang.Short)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getShort(key, new Short(defaultValue)).shortValue();
 *  */
    @Test
    public void testGetShort_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getShort] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getShort(ExtendedProperties.java:1377)
            org.apache.commons.collections.ExtendedProperties.getShort(ExtendedProperties.java:1361) */
        extendedProperties.getShort(string, (short) -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getShort
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getShort(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String)}
 * @utbot.executesCondition {@code (s != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String,java.lang.Short)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} when: s != null
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testGetShort_ThrowNoSuchElementException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        extendedProperties.getShort(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getShort(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getShort(java.lang.String,java.lang.Short)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Short s = getShort(key, null);
 *  */
    @Test
    public void testGetShort_ThrowArithmeticException2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getShort] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getShort(ExtendedProperties.java:1377)
            org.apache.commons.collections.ExtendedProperties.getShort(ExtendedProperties.java:1341) */
        extendedProperties.getShort(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getInt
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInt(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testGetInt_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInt] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getInteger(ExtendedProperties.java:1475)
            org.apache.commons.collections.ExtendedProperties.getInteger(ExtendedProperties.java:1434)
            org.apache.commons.collections.ExtendedProperties.getInt(ExtendedProperties.java:1406) */
        extendedProperties.getInt(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInt(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return getInteger(name);
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testGetInt_ThrowNoSuchElementException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        extendedProperties.getInt(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInt(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String,int)}
 * @utbot.returnsFrom {@code return getInteger(name, def);}
 *  */
    @Test
    public void testGetInt_ExtendedPropertiesGetInteger() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        int actual = extendedProperties.getInt(string, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInt(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getInteger(name, def);
 *  */
    @Test
    public void testGetInt_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInt] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getInteger(ExtendedProperties.java:1475)
            org.apache.commons.collections.ExtendedProperties.getInteger(ExtendedProperties.java:1454)
            org.apache.commons.collections.ExtendedProperties.getInt(ExtendedProperties.java:1418) */
        extendedProperties.getInt(string, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getLong
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String)}
 * @utbot.executesCondition {@code (l != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String,java.lang.Long)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} when: l != null
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testGetLong_ThrowNoSuchElementException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        extendedProperties.getLong(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String,java.lang.Long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Long l = getLong(key, null);
 *  */
    @Test
    public void testGetLong_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getLong] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getLong(ExtendedProperties.java:1545)
            org.apache.commons.collections.ExtendedProperties.getLong(ExtendedProperties.java:1509) */
        extendedProperties.getLong(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLong(java.lang.String, long)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String,long)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String,java.lang.Long)}
 * @utbot.invokes {@link java.lang.Long#longValue()}
 * @utbot.returnsFrom {@code return getLong(key, new Long(defaultValue)).longValue();}
 *  */
    @Test
    public void testGetLong_LongLongValue() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        long actual = extendedProperties.getLong(string, -255L);
        
        assertEquals(-255L, actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLong(java.lang.String, long)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String,long)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String,java.lang.Long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getLong(key, new Long(defaultValue)).longValue();
 *  */
    @Test
    public void testGetLong_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getLong] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getLong(ExtendedProperties.java:1545)
            org.apache.commons.collections.ExtendedProperties.getLong(ExtendedProperties.java:1529) */
        extendedProperties.getLong(string, -255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLong(java.lang.String, java.lang.Long)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String,java.lang.Long)}
 * @utbot.executesCondition {@code (value instanceof Long): False}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetLong_DefaultsEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        Long actual = extendedProperties.getLong(string, ((Long) null));
        
        assertNull(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLong(java.lang.String, java.lang.Long)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getLong(java.lang.String,java.lang.Long)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetLong_ThrowArithmeticException2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getLong] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getLong(ExtendedProperties.java:1545) */
        extendedProperties.getLong(string, ((Long) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getFloat
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String,java.lang.Float)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} when: f != null
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testGetFloat_ThrowNoSuchElementException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        extendedProperties.getFloat(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Float f = getFloat(key, null);
 *  */
    @Test
    public void testGetFloat_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getFloat] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getFloat(ExtendedProperties.java:1615)
            org.apache.commons.collections.ExtendedProperties.getFloat(ExtendedProperties.java:1579) */
        extendedProperties.getFloat(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} 
 *  */
    @Test
    public void testGetFloat_ThrowArithmeticException_1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(defaults, "java.util.Hashtable", "table", table);
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table1 = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table1[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table1);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getFloat] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getFloat(ExtendedProperties.java:1615)
            org.apache.commons.collections.ExtendedProperties.getFloat(ExtendedProperties.java:1627)
            org.apache.commons.collections.ExtendedProperties.getFloat(ExtendedProperties.java:1579) */
        extendedProperties.getFloat(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFloat(java.lang.String, java.lang.Float)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String,java.lang.Float)}
 * @utbot.executesCondition {@code (value instanceof Float): False}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetFloat_DefaultsEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        Float actual = extendedProperties.getFloat(string, ((Float) null));
        
        assertNull(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFloat(java.lang.String, java.lang.Float)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String,java.lang.Float)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetFloat_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getFloat] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getFloat(ExtendedProperties.java:1615) */
        extendedProperties.getFloat(string, ((Float) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFloat(java.lang.String, float)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String,float)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String,java.lang.Float)}
 * @utbot.invokes {@link java.lang.Float#floatValue()}
 * @utbot.returnsFrom {@code return getFloat(key, new Float(defaultValue)).floatValue();}
 *  */
    @Test
    public void testGetFloat_FloatFloatValue() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        float actual = extendedProperties.getFloat(string, 1.0842022E-19f);
        
        org.junit.Assert.assertEquals(1.0842022E-19f, actual, 1.0E-6f);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFloat(java.lang.String, float)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String,float)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getFloat(java.lang.String,java.lang.Float)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getFloat(key, new Float(defaultValue)).floatValue();
 *  */
    @Test
    public void testGetFloat_ThrowArithmeticException2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getFloat] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getFloat(ExtendedProperties.java:1615)
            org.apache.commons.collections.ExtendedProperties.getFloat(ExtendedProperties.java:1599) */
        extendedProperties.getFloat(string, 1.4E-45f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDouble(java.lang.String, java.lang.Double)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getDouble(java.lang.String,java.lang.Double)}
 * @utbot.executesCondition {@code (value instanceof Double): False}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetDouble_DefaultsEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        Double actual = extendedProperties.getDouble(string, ((Double) null));
        
        assertNull(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDouble(java.lang.String, java.lang.Double)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getDouble(java.lang.String,java.lang.Double)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetDouble_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getDouble] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1685) */
        extendedProperties.getDouble(string, ((Double) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDouble(java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getDouble(java.lang.String,double)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getDouble(java.lang.String,java.lang.Double)}
 * @utbot.invokes {@link java.lang.Double#doubleValue()}
 * @utbot.returnsFrom {@code return getDouble(key, new Double(defaultValue)).doubleValue();}
 *  */
    @Test
    public void testGetDouble_DoubleDoubleValue() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        double actual = extendedProperties.getDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDouble(java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getDouble(java.lang.String,double)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getDouble(java.lang.String,java.lang.Double)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getDouble(key, new Double(defaultValue)).doubleValue();
 *  */
    @Test
    public void testGetDouble_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getDouble] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1685)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1669) */
        extendedProperties.getDouble(string, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDouble(java.lang.String, double)
    
    @Test
    public void testGetDouble1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        Object next1 = createInstance("java.util.Hashtable$Entry");
        setField(next1, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(next1, "java.util.Hashtable$Entry", "key", key);
        setField(next, "java.util.Hashtable$Entry", "next", next1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getDouble] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.get(Hashtable.java:384)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1685)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1669) */
        extendedProperties.getDouble(string, java.lang.Double.NaN);
    }
    
    @Test
    public void testGetDouble2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getDouble] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1685)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1697)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1669) */
        extendedProperties.getDouble(string, java.lang.Double.NaN);
    }
    
    @Test
    public void testGetDouble3() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        table[0] = entry;
        setField(defaults, "java.util.Hashtable", "table", table);
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table1 = createArray("java.util.Hashtable$Entry", 11);
        setField(extendedProperties, "java.util.Hashtable", "table", table1);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getDouble] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.get(Hashtable.java:384)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1685)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1697)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1669) */
        extendedProperties.getDouble(string, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getDouble(java.lang.String, double)
    
    @Test(timeout = 1000L)
    public void testGetDouble4() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getDouble(string, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getDouble(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getDouble(java.lang.String,java.lang.Double)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Double d = getDouble(key, null);
 *  */
    @Test
    public void testGetDouble_ThrowArithmeticException2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getDouble] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1685)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1649) */
        extendedProperties.getDouble(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDouble(java.lang.String)
    
    @Test(expected = NoSuchElementException.class)
    public void testGetDouble5() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Integer key1 = 0;
        setField(next, "java.util.Hashtable$Entry", "key", key1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        extendedProperties.getDouble(string);
    }
    
    @Test(expected = NoSuchElementException.class)
    public void testGetDouble6() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(defaults, "java.util.Hashtable", "table", table);
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table1 = createArray("java.util.Hashtable$Entry", 3);
        table1[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table1);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        extendedProperties.getDouble(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDouble(java.lang.String)
    
    @Test
    public void testGetDouble7() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(next, "java.util.Hashtable$Entry", "key", key);
        Object next1 = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "next", next1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getDouble] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.get(Hashtable.java:384)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1685)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1649) */
        extendedProperties.getDouble(string);
    }
    
    @Test
    public void testGetDouble8() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getDouble] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1685)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1697)
            org.apache.commons.collections.ExtendedProperties.getDouble(ExtendedProperties.java:1649) */
        extendedProperties.getDouble(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getDouble(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testGetDouble9() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getDouble(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.load
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method load(java.io.InputStream, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#load(java.io.InputStream,java.lang.String)}
 * @utbot.executesCondition {@code (enc != null): False}
 * @utbot.executesCondition {@code (reader == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reader = new PropertiesReader(new InputStreamReader(input, "8859_1"));
 *  */
    @Test
    public void testLoad_ThrowNullPointerException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.load] produces [java.lang.NullPointerException]
            java.base/java.io.Reader.<init>(Reader.java:168)
            java.base/java.io.InputStreamReader.<init>(InputStreamReader.java:97)
            org.apache.commons.collections.ExtendedProperties.load(ExtendedProperties.java:579) */
        extendedProperties.load(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#load(java.io.InputStream,java.lang.String)}
 * @utbot.executesCondition {@code (enc != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reader = new PropertiesReader(new InputStreamReader(input, enc));
 *  */
    @Test
    public void testLoad_ThrowNullPointerException_1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.load] produces [java.lang.NullPointerException]
            java.base/java.io.Reader.<init>(Reader.java:168)
            java.base/java.io.InputStreamReader.<init>(InputStreamReader.java:97)
            org.apache.commons.collections.ExtendedProperties.load(ExtendedProperties.java:570) */
        extendedProperties.load(null, string);
    }
    ///endregion
    
    ///region Errors report for load
    
    public void testLoad_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.load
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method load(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#load(java.io.InputStream)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#load(java.io.InputStream,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: load(input, null);
 *  */
    @Test
    public void testLoad_ThrowNullPointerException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.load] produces [java.lang.NullPointerException]
            java.base/java.io.Reader.<init>(Reader.java:168)
            java.base/java.io.InputStreamReader.<init>(InputStreamReader.java:97)
            org.apache.commons.collections.ExtendedProperties.load(ExtendedProperties.java:579)
            org.apache.commons.collections.ExtendedProperties.load(ExtendedProperties.java:555) */
        extendedProperties.load(null);
    }
    ///endregion
    
    ///region Errors report for load
    
    public void testLoad_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.putAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#putAll(java.util.Map)}
 * @utbot.executesCondition {@code (map instanceof ExtendedProperties): False}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator it = map.entrySet().iterator(); it.hasNext(); )
 *  */
    @Test
    public void testPutAll_ThrowNullPointerException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.putAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ExtendedProperties.putAll(ExtendedProperties.java:1759) */
        extendedProperties.putAll(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method putAll(java.util.Map)
    
    @Test
    public void testPutAll1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        extendedProperties.putAll(linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.setProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setProperty(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#setProperty(java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#clearProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: clearProperty(key);
 *  */
    @Test
    public void testSetProperty_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.setProperty] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.containsKey(Hashtable.java:354)
            org.apache.commons.collections.ExtendedProperties.clearProperty(ExtendedProperties.java:834)
            org.apache.commons.collections.ExtendedProperties.setProperty(ExtendedProperties.java:762) */
        extendedProperties.setProperty(string, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setProperty(java.lang.String, java.lang.Object)
    
    @Test
    public void testSetProperty1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.setProperty] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.containsKey(Hashtable.java:356)
            org.apache.commons.collections.ExtendedProperties.clearProperty(ExtendedProperties.java:834)
            org.apache.commons.collections.ExtendedProperties.setProperty(ExtendedProperties.java:762) */
        extendedProperties.setProperty(string, object);
    }
    
    @Test
    public void testSetProperty2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.setProperty] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ExtendedProperties.addPropertyInternal(ExtendedProperties.java:747)
            org.apache.commons.collections.ExtendedProperties.addProperty(ExtendedProperties.java:697)
            org.apache.commons.collections.ExtendedProperties.setProperty(ExtendedProperties.java:763) */
        extendedProperties.setProperty(string, object);
    }
    
    @Test
    public void testSetProperty3() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        String string1 = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.setProperty] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ExtendedProperties.addPropertyInternal(ExtendedProperties.java:747)
            org.apache.commons.collections.ExtendedProperties.addProperty(ExtendedProperties.java:694)
            org.apache.commons.collections.ExtendedProperties.setProperty(ExtendedProperties.java:763) */
        extendedProperties.setProperty(string, string1);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method setProperty(java.lang.String, java.lang.Object)
    
    @Test(timeout = 1000L)
    public void testSetProperty4() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Object object = new Object();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.setProperty(string, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getProperties
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getProperties(java.lang.String, java.util.Properties)
    
    @Test
    public void testGetProperties1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Integer key1 = 0;
        setField(next, "java.util.Hashtable$Entry", "key", key1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        SunJSSE sunJSSE = ((SunJSSE) createInstance("sun.security.ssl.SunJSSE"));
        
        Properties actual = extendedProperties.getProperties(string, sunJSSE);
        
        Properties expected = new Properties();
        
        // java.util.Properties has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getProperties(java.lang.String, java.util.Properties)
    
    @Test
    public void testGetProperties2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getProperties] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getStringArray(ExtendedProperties.java:1040)
            org.apache.commons.collections.ExtendedProperties.getProperties(ExtendedProperties.java:1012) */
        extendedProperties.getProperties(string, null);
    }
    
    @Test
    public void testGetProperties3() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        SunJSSE sunJSSE = ((SunJSSE) createInstance("sun.security.ssl.SunJSSE"));
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getProperties] produces [java.lang.NullPointerException] */
        extendedProperties.getProperties(string, sunJSSE);
    }
    
    @Test
    public void testGetProperties4() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        VerificationProvider verificationProvider = ((VerificationProvider) createInstance("sun.security.provider.VerificationProvider"));
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getProperties] produces [java.lang.NullPointerException] */
        extendedProperties.getProperties(string, verificationProvider);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getProperties(java.lang.String, java.util.Properties)
    
    @Test(timeout = 1000L)
    public void testGetProperties5() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        SunJSSE sunJSSE = ((SunJSSE) createInstance("sun.security.ssl.SunJSSE"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getProperties(string, sunJSSE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperties(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getProperties(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getProperties(java.lang.String,java.util.Properties)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getProperties(key, new Properties());
 *  */
    @Test
    public void testGetProperties_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getProperties] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getStringArray(ExtendedProperties.java:1040)
            org.apache.commons.collections.ExtendedProperties.getProperties(ExtendedProperties.java:1012)
            org.apache.commons.collections.ExtendedProperties.getProperties(ExtendedProperties.java:994) */
        extendedProperties.getProperties(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getProperties(java.lang.String)
    
    @Test
    public void testGetProperties6() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        Properties actual = extendedProperties.getProperties(string);
        
        Properties expected = new Properties();
        
        // java.util.Properties has overridden equals method
        assertEquals(expected, actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getProperties(java.lang.String)
    
    @Test
    public void testGetProperties7() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(next, "java.util.Hashtable$Entry", "key", key);
        Object next1 = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "next", next1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getProperties] produces [java.lang.NullPointerException] */
        extendedProperties.getProperties(string);
    }
    
    @Test
    public void testGetProperties8() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getProperties] produces [java.lang.NullPointerException] */
        extendedProperties.getProperties(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.clearProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#clearProperty(java.lang.String)}
 * @utbot.executesCondition {@code (containsKey(key)): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#containsKey(java.lang.Object)}
 *  */
    @Test
    public void testClearProperty_NotContainsKey() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        extendedProperties.clearProperty(string);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#clearProperty(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: containsKey(key)
 *  */
    @Test
    public void testClearProperty_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.clearProperty] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.containsKey(Hashtable.java:354)
            org.apache.commons.collections.ExtendedProperties.clearProperty(ExtendedProperties.java:834) */
        extendedProperties.clearProperty(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearProperty(java.lang.String)
    
    @Test
    public void testClearProperty1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(next, "java.util.Hashtable$Entry", "key", key);
        Object next1 = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "next", next1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.clearProperty] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.containsKey(Hashtable.java:356)
            org.apache.commons.collections.ExtendedProperties.clearProperty(ExtendedProperties.java:834) */
        extendedProperties.clearProperty(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method clearProperty(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testClearProperty2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.clearProperty(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.combine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method combine(org.apache.commons.collections.ExtendedProperties)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#combine(org.apache.commons.collections.ExtendedProperties)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getKeys()}
 *  */
    @Test
    public void testCombine() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties extendedProperties1 = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        extendedProperties1.keysAsListed = keysAsListed;
        
        extendedProperties.combine(extendedProperties1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method combine(org.apache.commons.collections.ExtendedProperties)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#combine(org.apache.commons.collections.ExtendedProperties)}
 * @utbot.iterates iterate the loop {@code for(Iterator it = props.getKeys(); it.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String key = (String) it.next();
 *  */
    @Test
    public void testCombine_ThrowClassCastException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties extendedProperties1 = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        Object object = createInstance("java.lang.Object");
        keysAsListed.add(object);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        extendedProperties1.keysAsListed = keysAsListed;
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.combine] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.ExtendedProperties.combine(ExtendedProperties.java:822) */
        extendedProperties.combine(extendedProperties1);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#combine(org.apache.commons.collections.ExtendedProperties)}
 * @utbot.iterates iterate the loop {@code for(Iterator it = props.getKeys(); it.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: clearProperty(key);
 *  */
    @Test
    public void testCombine_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        ExtendedProperties extendedProperties1 = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        String string = "";
        keysAsListed.add(string);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        extendedProperties1.keysAsListed = keysAsListed;
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.combine] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.containsKey(Hashtable.java:354)
            org.apache.commons.collections.ExtendedProperties.clearProperty(ExtendedProperties.java:834)
            org.apache.commons.collections.ExtendedProperties.combine(ExtendedProperties.java:823) */
        extendedProperties.combine(extendedProperties1);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#combine(org.apache.commons.collections.ExtendedProperties)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getKeys()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator it = props.getKeys(); it.hasNext(); )
 *  */
    @Test
    public void testCombine_ThrowNullPointerException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.combine] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ExtendedProperties.combine(ExtendedProperties.java:821) */
        extendedProperties.combine(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method combine(org.apache.commons.collections.ExtendedProperties)
    
    @Test
    public void testCombine1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 23);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(next, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[2] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        ExtendedProperties extendedProperties1 = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keysAsListed.add(string);
        keysAsListed.add(extendedProperties1);
        Object object = createInstance("java.lang.Object");
        keysAsListed.add(object);
        extendedProperties1.keysAsListed = keysAsListed;
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.combine] produces [java.lang.NullPointerException] */
        extendedProperties.combine(extendedProperties1);
    }
    
    @Test
    public void testCombine2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keysAsListed.add(string);
        ArrayList arrayList = new ArrayList();
        keysAsListed.add(arrayList);
        Object object = createInstance("java.lang.Object");
        keysAsListed.add(object);
        extendedProperties.keysAsListed = keysAsListed;
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 23);
        Object entry = createInstance("java.util.Hashtable$Entry");
        table[2] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.combine] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.put(Hashtable.java:476)
            org.apache.commons.collections.ExtendedProperties.addPropertyDirect(ExtendedProperties.java:716)
            org.apache.commons.collections.ExtendedProperties.combine(ExtendedProperties.java:824) */
        extendedProperties.combine(extendedProperties);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.save
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method save(java.io.OutputStream, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#save(java.io.OutputStream,java.lang.String)}
 * @utbot.executesCondition {@code (output == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testSave_OutputEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        extendedProperties.save(null, null);
    }
    ///endregion
    
    ///region Errors report for save
    
    public void testSave_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.nio.charset.Charset java.nio.charset.Charset.defaultCharset accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInteger(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String,java.lang.Integer)}
 * @utbot.returnsFrom {@code return defaultValue;}
 *  */
    @Test
    public void testGetInteger_ExtendedPropertiesGetInteger() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        int actual = extendedProperties.getInteger(string, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInteger(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String,java.lang.Integer)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Integer i = getInteger(key, null);
 *  */
    @Test
    public void testGetInteger_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInteger] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getInteger(ExtendedProperties.java:1475)
            org.apache.commons.collections.ExtendedProperties.getInteger(ExtendedProperties.java:1454) */
        extendedProperties.getInteger(string, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInteger(java.lang.String, int)
    
    @Test
    public void testGetInteger1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(next, "java.util.Hashtable$Entry", "key", key);
        setField(next, "java.util.Hashtable$Entry", "next", next);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInteger] produces [java.lang.NullPointerException] */
        extendedProperties.getInteger(string, 0);
    }
    
    @Test
    public void testGetInteger2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInteger] produces [java.lang.NullPointerException] */
        extendedProperties.getInteger(string, 0);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getInteger(java.lang.String, int)
    
    @Test(timeout = 1000L)
    public void testGetInteger3() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getInteger(string, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getInteger
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String,java.lang.Integer)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Integer i = getInteger(key, null);
 *  */
    @Test
    public void testGetInteger_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInteger] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getInteger(ExtendedProperties.java:1475)
            org.apache.commons.collections.ExtendedProperties.getInteger(ExtendedProperties.java:1434) */
        extendedProperties.getInteger(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInteger(java.lang.String)
    
    @Test(expected = NoSuchElementException.class)
    public void testGetInteger4() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Integer key1 = 0;
        setField(next, "java.util.Hashtable$Entry", "key", key1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        extendedProperties.getInteger(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInteger(java.lang.String)
    
    @Test
    public void testGetInteger5() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInteger] produces [java.lang.NullPointerException] */
        extendedProperties.getInteger(string);
    }
    
    @Test
    public void testGetInteger6() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInteger] produces [java.lang.NullPointerException] */
        extendedProperties.getInteger(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getInteger(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testGetInteger7() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getInteger(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getInteger
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInteger(java.lang.String, java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInteger(java.lang.String,java.lang.Integer)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetInteger_ThrowArithmeticException2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInteger] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getInteger(ExtendedProperties.java:1475) */
        extendedProperties.getInteger(string, ((Integer) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInteger(java.lang.String, java.lang.Integer)
    
    @Test
    public void testGetInteger8() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        setField(next, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Integer integer = 0;
        
        Integer actual = extendedProperties.getInteger(string, integer);
        
        assertEquals(integer, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getInteger(java.lang.String, java.lang.Integer)
    
    @Test
    public void testGetInteger9() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        Object next1 = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "next", next1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInteger] produces [java.lang.NullPointerException] */
        extendedProperties.getInteger(string, integer);
    }
    
    @Test
    public void testGetInteger10() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getInteger] produces [java.lang.NullPointerException] */
        extendedProperties.getInteger(string, integer);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getInteger(java.lang.String, java.lang.Integer)
    
    @Test(timeout = 1000L)
    public void testGetInteger11() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Integer integer = 0;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getInteger(string, integer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.display
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method display()
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#display()}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getKeys()}
 *  */
    @Test
    public void testDisplay_IHasNext() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        extendedProperties.keysAsListed = keysAsListed;
        
        extendedProperties.display();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method display()
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#display()}
 * @utbot.iterates iterate the loop {@code while(i.hasNext())} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String key = (String) i.next();
 *  */
    @Test
    public void testDisplay_ThrowClassCastException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        Object object = createInstance("java.lang.Object");
        keysAsListed.add(object);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        extendedProperties.keysAsListed = keysAsListed;
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.display] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.ExtendedProperties.display(ExtendedProperties.java:935) */
        extendedProperties.display();
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#display()}
 * @utbot.iterates iterate the loop {@code while(i.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testDisplay_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        String string = "";
        keysAsListed.add(string);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        extendedProperties.keysAsListed = keysAsListed;
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.display] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.display(ExtendedProperties.java:936) */
        extendedProperties.display();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method display()
    
    @Test
    public void testDisplay1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keysAsListed.add(string);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        keysAsListed.add(copyOnWriteArrayList);
        keysAsListed.add(copyOnWriteArrayList);
        extendedProperties.keysAsListed = keysAsListed;
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.display] produces [java.lang.ClassCastException: class java.util.concurrent.CopyOnWriteArrayList cannot be cast to class java.lang.String (java.util.concurrent.CopyOnWriteArrayList and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.ExtendedProperties.display(ExtendedProperties.java:935) */
        extendedProperties.display();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#escape(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testEscape_StringBufferToString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = extendedPropertiesClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(null, escapeMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method escape(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.StringBuffer#length()} once,
    ///     {@link java.lang.StringBuffer#charAt(int)} once,
    ///     {@link java.lang.StringBuffer#toString()} once
    /// return from: {@code return buf.toString();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length(); i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testEscape_CNotEqualsChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = extendedPropertiesClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(null, escapeMethodArguments));
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length(); i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testEscape_CEqualsChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = ",";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = extendedPropertiesClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(null, escapeMethodArguments));
        
        String expected = "\\,";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#escape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length(); i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testEscape_CEqualsChar_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\\";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = extendedPropertiesClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(null, escapeMethodArguments));
        
        String expected = "\\\\";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#escape(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length(); i++)} 4 times
 * @utbot.returnsFrom {@code return buf.toString();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return buf.toString();
 *  */
    @Test
    public void testEscape_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.escape] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:105)
            java.base/java.lang.StringBuffer.<init>(StringBuffer.java:158)
            org.apache.commons.collections.ExtendedProperties.escape(ExtendedProperties.java:308) */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = extendedPropertiesClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = ((Object) null);
        try {
            escapeMethod.invoke(null, escapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.ExtendedProperties}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#escape(java.lang.String)}
     */
    @Test
    public void testEscapeWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = extendedPropertiesClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = "\u0014\n\t\r";
        String actual = ((String) escapeMethod.invoke(null, escapeMethodArguments));
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.unescape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method unescape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#unescape(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length() - 1; i++)} once
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testUnescape_StringBufferToString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method unescapeMethod = extendedPropertiesClazz.getDeclaredMethod("unescape", stringType);
        unescapeMethod.setAccessible(true);
        java.lang.Object[] unescapeMethodArguments = new java.lang.Object[1];
        unescapeMethodArguments[0] = string;
        String actual = ((String) unescapeMethod.invoke(null, unescapeMethodArguments));
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method unescape(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.StringBuffer#length()} once,
    ///     {@link java.lang.StringBuffer#charAt(int)} twice,
    ///     {@link java.lang.StringBuffer#toString()} once
    /// return from: {@code return buf.toString();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#unescape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length() - 1; i++)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testUnescape_C1NotEqualsChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "  ";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method unescapeMethod = extendedPropertiesClazz.getDeclaredMethod("unescape", stringType);
        unescapeMethod.setAccessible(true);
        java.lang.Object[] unescapeMethodArguments = new java.lang.Object[1];
        unescapeMethodArguments[0] = string;
        String actual = ((String) unescapeMethod.invoke(null, unescapeMethodArguments));
        
        String expected = "  ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#unescape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length() - 1; i++)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testUnescape_C2NotEqualsChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\\ ";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method unescapeMethod = extendedPropertiesClazz.getDeclaredMethod("unescape", stringType);
        unescapeMethod.setAccessible(true);
        java.lang.Object[] unescapeMethodArguments = new java.lang.Object[1];
        unescapeMethodArguments[0] = string;
        String actual = ((String) unescapeMethod.invoke(null, unescapeMethodArguments));
        
        String expected = "\\ ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#unescape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length() - 1; i++)} twice
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testUnescape_C2EqualsChar() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\\\\ ";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method unescapeMethod = extendedPropertiesClazz.getDeclaredMethod("unescape", stringType);
        unescapeMethod.setAccessible(true);
        java.lang.Object[] unescapeMethodArguments = new java.lang.Object[1];
        unescapeMethodArguments[0] = string;
        String actual = ((String) unescapeMethod.invoke(null, unescapeMethodArguments));
        
        String expected = "\\ ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#unescape(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < buf.length() - 1; i++)} 4 times
 * @utbot.returnsFrom {@code return buf.toString();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return buf.toString();
 *  */
    @Test
    public void testUnescape_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.unescape] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:105)
            java.base/java.lang.StringBuffer.<init>(StringBuffer.java:158)
            org.apache.commons.collections.ExtendedProperties.unescape(ExtendedProperties.java:323) */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method unescapeMethod = extendedPropertiesClazz.getDeclaredMethod("unescape", stringType);
        unescapeMethod.setAccessible(true);
        java.lang.Object[] unescapeMethodArguments = new java.lang.Object[1];
        unescapeMethodArguments[0] = ((Object) null);
        try {
            unescapeMethod.invoke(null, unescapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unescape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.ExtendedProperties}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#unescape(java.lang.String)}
     */
    @Test
    public void testUnescapeWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method unescapeMethod = extendedPropertiesClazz.getDeclaredMethod("unescape", stringType);
        unescapeMethod.setAccessible(true);
        java.lang.Object[] unescapeMethodArguments = new java.lang.Object[1];
        unescapeMethodArguments[0] = "\u0014\n\t\r";
        String actual = ((String) unescapeMethod.invoke(null, unescapeMethodArguments));
        
        String expected = "\u0014\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKeys(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getKeys(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getKeys()}
 * @utbot.invokes {@link java.util.ArrayList#iterator()}
 * @utbot.returnsFrom {@code return matchingKeys.iterator();}
 *  */
    @Test
    public void testGetKeys_ArrayListIterator() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        extendedProperties.keysAsListed = keysAsListed;
        
        Object actual = extendedProperties.getKeys(null);
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getKeys(java.lang.String)
    
    @Test
    public void testGetKeys1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        keysAsListed.add(null);
        extendedProperties.keysAsListed = keysAsListed;
        
        Object actual = extendedProperties.getKeys(null);
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        
    }
    
    @Test
    public void testGetKeys2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        String string = "\u0000";
        keysAsListed.add(string);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = ((Object) string);
        objectArray[1] = objectArray;
        keysAsListed.add(objectArray);
        extendedProperties.keysAsListed = keysAsListed;
        
        Object actual = extendedProperties.getKeys(string);
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        
    }
    
    @Test
    public void testGetKeys3() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        String string = "";
        keysAsListed.add(string);
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = ((Object) string);
        objectArray[1] = objectArray;
        keysAsListed.add(objectArray);
        extendedProperties.keysAsListed = keysAsListed;
        String string1 = "\u0000";
        
        Object actual = extendedProperties.getKeys(string1);
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKeys()
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getKeys()}
 * @utbot.invokes {@link java.util.ArrayList#iterator()}
 * @utbot.returnsFrom {@code return keysAsListed.iterator();}
 *  */
    @Test
    public void testGetKeys_ArrayListIterator1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        extendedProperties.keysAsListed = keysAsListed;
        
        Object actual = extendedProperties.getKeys();
        
        Object expected = createInstance("java.util.ArrayList$Itr");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getKeys()
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getKeys()}
 * @utbot.invokes {@link java.util.ArrayList#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return keysAsListed.iterator();
 *  */
    @Test
    public void testGetKeys_ThrowNullPointerException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getKeys] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ExtendedProperties.getKeys(ExtendedProperties.java:854) */
        extendedProperties.getKeys();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.subset
    
    ///region OTHER: SECURITY for method subset(java.lang.String)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testSubset1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.subset] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "file.separator" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.collections.ExtendedProperties.<init>(ExtendedProperties.java:174)
            org.apache.commons.collections.ExtendedProperties.subset(ExtendedProperties.java:887) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getString(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getString(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#interpolate(java.lang.String)}
 * @utbot.returnsFrom {@code return interpolate(defaultValue);}
 *  */
    @Test
    public void testGetString_DefaultsEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        String actual = extendedProperties.getString(string, null);
        
        assertNull(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getString(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getString(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetString_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getString] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getString(ExtendedProperties.java:964) */
        extendedProperties.getString(string, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getString(java.lang.String, java.lang.String)
    
    @Test
    public void testGetString1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        String actual = extendedProperties.getString(string, string);
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getString(java.lang.String, java.lang.String)
    
    @Test
    public void testGetString2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 15);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        Object next1 = createInstance("java.util.Hashtable$Entry");
        setField(next1, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(next1, "java.util.Hashtable$Entry", "key", key);
        setField(next, "java.util.Hashtable$Entry", "next", next1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        table[1] = next;
        table[2] = next;
        table[3] = next;
        table[4] = next;
        table[5] = next;
        table[6] = next;
        table[7] = next;
        table[8] = next;
        table[9] = next;
        table[10] = next;
        table[11] = next;
        table[12] = next;
        table[13] = next;
        table[14] = next;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getString] produces [java.lang.NullPointerException] */
        extendedProperties.getString(string, null);
    }
    
    @Test
    public void testGetString3() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 15);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Character key1 = '\u0000';
        setField(next, "java.util.Hashtable$Entry", "key", key1);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        table[1] = next;
        table[2] = next;
        table[3] = next;
        table[4] = next;
        table[5] = next;
        table[6] = next;
        table[7] = next;
        table[8] = next;
        table[9] = next;
        table[10] = next;
        table[11] = next;
        table[12] = next;
        table[13] = next;
        table[14] = next;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getString] produces [java.lang.NullPointerException] */
        extendedProperties.getString(string, null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getString(java.lang.String, java.lang.String)
    
    @Test(timeout = 1000L)
    public void testGetString4() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getString(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getString(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getString(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return getString(key, null);}
 *  */
    @Test
    public void testGetString_ExtendedPropertiesGetString() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        String actual = extendedProperties.getString(string);
        
        assertNull(actual);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getString(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getString(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getString(key, null);
 *  */
    @Test
    public void testGetString_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getString] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getString(ExtendedProperties.java:964)
            org.apache.commons.collections.ExtendedProperties.getString(ExtendedProperties.java:950) */
        extendedProperties.getString(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getString(java.lang.String)
    
    @Test
    public void testGetString5() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getString] produces [java.lang.NullPointerException] */
        extendedProperties.getString(string);
    }
    
    @Test
    public void testGetString6() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getString] produces [java.lang.NullPointerException] */
        extendedProperties.getString(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getString(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testGetString7() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getString(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getStringArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStringArray(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getStringArray(java.lang.String)}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value instanceof List): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return new String[0];}
 *  */
    @Test
    public void testGetStringArray_DefaultsEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        java.lang.String[] actual = extendedProperties.getStringArray(string);
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getStringArray(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getStringArray(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetStringArray_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getStringArray] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getStringArray(ExtendedProperties.java:1040) */
        extendedProperties.getStringArray(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getStringArray(java.lang.String)
    
    @Test
    public void testGetStringArray1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getStringArray] produces [java.lang.NullPointerException] */
        extendedProperties.getStringArray(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getStringArray(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testGetStringArray2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getStringArray(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.interpolate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method interpolate(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#interpolate(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#interpolateHelper(java.lang.String,java.util.List)}
 * @utbot.returnsFrom {@code return (interpolateHelper(base, null));}
 *  */
    @Test
    public void testInterpolate_ExtendedPropertiesInterpolateHelper() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        String actual = extendedProperties.interpolate(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method interpolate(java.lang.String)
    
    @Test
    public void testInterpolate1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        String string = "\u0000\u0000\u0000\u0000$\u0000";
        
        String actual = extendedProperties.interpolate(string);
        
        String expected = "\u0000\u0000\u0000\u0000$\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInterpolate2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        String string = "$${\u0000\u0000\u0000\u0000";
        
        String actual = extendedProperties.interpolate(string);
        
        String expected = "$${\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.testBoolean
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method testBoolean(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#testBoolean(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#toLowerCase(java.util.Locale)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s = value.toLowerCase(Locale.ENGLISH);
 *  */
    @Test
    public void testTestBoolean_ThrowNullPointerException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.testBoolean] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ExtendedProperties.testBoolean(ExtendedProperties.java:1247) */
        extendedProperties.testBoolean(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method testBoolean(java.lang.String)
    
    @Test
    public void testTestBoolean1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        String string = "";
        
        String actual = extendedProperties.testBoolean(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.addPropertyDirect
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPropertyDirect(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#addPropertyDirect(java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} when: !containsKey(key)
 *  */
    @Test
    public void testAddPropertyDirect_ThrowArithmeticException() throws Throwable  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.addPropertyDirect] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.containsKey(Hashtable.java:354)
            org.apache.commons.collections.ExtendedProperties.addPropertyDirect(ExtendedProperties.java:713) */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method addPropertyDirectMethod = extendedPropertiesClazz.getDeclaredMethod("addPropertyDirect", stringType, objectType);
        addPropertyDirectMethod.setAccessible(true);
        java.lang.Object[] addPropertyDirectMethodArguments = new java.lang.Object[2];
        addPropertyDirectMethodArguments[0] = string;
        addPropertyDirectMethodArguments[1] = ((Object) null);
        try {
            addPropertyDirectMethod.invoke(extendedProperties, addPropertyDirectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addPropertyDirect(java.lang.String, java.lang.Object)
    
    @Test
    public void testAddPropertyDirect1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ArrayList keysAsListed = new ArrayList();
        keysAsListed.add(null);
        keysAsListed.add(null);
        keysAsListed.add(null);
        extendedProperties.keysAsListed = keysAsListed;
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 32);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        Object object = new Object();
        
        Object initialExtendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method addPropertyDirectMethod = extendedPropertiesClazz.getDeclaredMethod("addPropertyDirect", stringType, objectType);
        addPropertyDirectMethod.setAccessible(true);
        java.lang.Object[] addPropertyDirectMethodArguments = new java.lang.Object[2];
        addPropertyDirectMethodArguments[0] = string;
        addPropertyDirectMethodArguments[1] = object;
        addPropertyDirectMethod.invoke(extendedProperties, addPropertyDirectMethodArguments);
        
        Object finalExtendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        
        assertFalse(initialExtendedPropertiesTable == finalExtendedPropertiesTable);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addPropertyDirect(java.lang.String, java.lang.Object)
    
    @Test
    public void testAddPropertyDirect2() throws Throwable  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Character key = '\u0000';
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.addPropertyDirect] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ExtendedProperties.addPropertyDirect(ExtendedProperties.java:714) */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method addPropertyDirectMethod = extendedPropertiesClazz.getDeclaredMethod("addPropertyDirect", stringType, objectType);
        addPropertyDirectMethod.setAccessible(true);
        java.lang.Object[] addPropertyDirectMethodArguments = new java.lang.Object[2];
        addPropertyDirectMethodArguments[0] = string;
        addPropertyDirectMethodArguments[1] = object;
        try {
            addPropertyDirectMethod.invoke(extendedProperties, addPropertyDirectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddPropertyDirect3() throws Throwable  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(next, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(next, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.addPropertyDirect] produces [java.lang.NullPointerException]
            java.base/java.util.Hashtable.containsKey(Hashtable.java:356)
            org.apache.commons.collections.ExtendedProperties.addPropertyDirect(ExtendedProperties.java:713) */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method addPropertyDirectMethod = extendedPropertiesClazz.getDeclaredMethod("addPropertyDirect", stringType, objectType);
        addPropertyDirectMethod.setAccessible(true);
        java.lang.Object[] addPropertyDirectMethodArguments = new java.lang.Object[2];
        addPropertyDirectMethodArguments[0] = string;
        addPropertyDirectMethodArguments[1] = object;
        try {
            addPropertyDirectMethod.invoke(extendedProperties, addPropertyDirectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method addPropertyDirect(java.lang.String, java.lang.Object)
    
    @Test(timeout = 1000L)
    public void testAddPropertyDirect4() throws Throwable  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Object object = new Object();
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method addPropertyDirectMethod = extendedPropertiesClazz.getDeclaredMethod("addPropertyDirect", stringType, objectType);
        addPropertyDirectMethod.setAccessible(true);
        java.lang.Object[] addPropertyDirectMethodArguments = new java.lang.Object[2];
        addPropertyDirectMethodArguments[0] = string;
        addPropertyDirectMethodArguments[1] = object;
        try {
            addPropertyDirectMethod.invoke(extendedProperties, addPropertyDirectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.interpolateHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method interpolateHelper(java.lang.String, java.util.List)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#interpolateHelper(java.lang.String,java.util.List)}
 * @utbot.executesCondition {@code (base == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testInterpolateHelper_BaseEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        String actual = extendedProperties.interpolateHelper(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVector(java.lang.String, java.util.Vector)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getVector(java.lang.String,java.util.Vector)}
 * @utbot.executesCondition {@code ((defaultValue == null)): False}
 * @utbot.returnsFrom {@code return ((defaultValue == null) ? new Vector() : defaultValue);}
 *  */
    @Test
    public void testGetVector_DefaultValueNotEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        Stack stack = new Stack();
        
        Stack actual = ((Stack) extendedProperties.getVector(string, stack));
        
        Stack expected = ((Stack) createInstance("java.util.Stack"));
        java.lang.Object[] elementData = {null, null, null, null, null, null, null, null, null, null};
        setField(expected, "java.util.Vector", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.Vector", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.Vector", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedElementCount = ((Integer) getFieldValue(expected, "java.util.Vector", "elementCount"));
        int actualElementCount = ((Integer) getFieldValue(actual, "java.util.Vector", "elementCount"));
        assertEquals(expectedElementCount, actualElementCount);
        
        int expectedCapacityIncrement = ((Integer) getFieldValue(expected, "java.util.Vector", "capacityIncrement"));
        int actualCapacityIncrement = ((Integer) getFieldValue(actual, "java.util.Vector", "capacityIncrement"));
        assertEquals(expectedCapacityIncrement, actualCapacityIncrement);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getVector(java.lang.String,java.util.Vector)}
 * @utbot.executesCondition {@code ((defaultValue == null)): True}
 * @utbot.returnsFrom {@code return ((defaultValue == null) ? new Vector() : defaultValue);}
 *  */
    @Test
    public void testGetVector_DefaultValueEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        Vector actual = extendedProperties.getVector(string, null);
        
        Vector expected = new Vector();
        
        // java.util.Vector is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getVector(java.lang.String, java.util.Vector)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getVector(java.lang.String,java.util.Vector)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object value = get(key);
 *  */
    @Test
    public void testGetVector_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getVector] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getVector(ExtendedProperties.java:1094) */
        extendedProperties.getVector(string, null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getVector(java.lang.String, java.util.Vector)
    
    @Test(timeout = 1000L)
    public void testGetVector1() throws Throwable  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Object linkVector = createInstance("javax.swing.JEditorPane$JEditorPaneAccessibleHypertextSupport$LinkVector");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class linkVectorType = Class.forName("java.util.Vector");
        Method getVectorMethod = extendedPropertiesClazz.getDeclaredMethod("getVector", stringType, linkVectorType);
        getVectorMethod.setAccessible(true);
        java.lang.Object[] getVectorMethodArguments = new java.lang.Object[2];
        getVectorMethodArguments[0] = string;
        getVectorMethodArguments[1] = linkVector;
        try {
            getVectorMethod.invoke(extendedProperties, getVectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getVector
    
    public void testGetVector_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVector(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getVector(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getVector(java.lang.String,java.util.Vector)}
 * @utbot.returnsFrom {@code return getVector(key, null);}
 *  */
    @Test
    public void testGetVector_ExtendedPropertiesGetVector() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        Vector actual = extendedProperties.getVector(string);
        
        Vector expected = new Vector();
        
        // java.util.Vector is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getVector(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getVector(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getVector(java.lang.String,java.util.Vector)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getVector(key, null);
 *  */
    @Test
    public void testGetVector_ThrowArithmeticException1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getVector] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getVector(ExtendedProperties.java:1094)
            org.apache.commons.collections.ExtendedProperties.getVector(ExtendedProperties.java:1078) */
        extendedProperties.getVector(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getVector(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testGetVector2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        setField(entry, "java.util.Hashtable$Entry", "next", entry);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        extendedProperties.getVector(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.countPreceding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method countPreceding(java.lang.String, int, char)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#countPreceding(java.lang.String,int,char)}
 * @utbot.iterates iterate the loop {@code for(i = index - 1; i >= 0; i--)} once
 * @utbot.returnsFrom {@code return index - 1 - i;}
 *  */
    @Test
    public void testCountPreceding_LineCharAtNotEqualsCh() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method countPrecedingMethod = extendedPropertiesClazz.getDeclaredMethod("countPreceding", stringType, intType, charType);
        countPrecedingMethod.setAccessible(true);
        java.lang.Object[] countPrecedingMethodArguments = new java.lang.Object[3];
        countPrecedingMethodArguments[0] = string;
        countPrecedingMethodArguments[1] = 1;
        countPrecedingMethodArguments[2] = '@';
        int actual = ((Integer) countPrecedingMethod.invoke(null, countPrecedingMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#countPreceding(java.lang.String,int,char)}
 * @utbot.returnsFrom {@code return index - 1 - i;}
 *  */
    @Test
    public void testCountPreceding_ReturnIndexMinus1MinusI() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method countPrecedingMethod = extendedPropertiesClazz.getDeclaredMethod("countPreceding", stringType, intType, charType);
        countPrecedingMethod.setAccessible(true);
        java.lang.Object[] countPrecedingMethodArguments = new java.lang.Object[3];
        countPrecedingMethodArguments[0] = ((Object) null);
        countPrecedingMethodArguments[1] = 0;
        countPrecedingMethodArguments[2] = ' ';
        int actual = ((Integer) countPrecedingMethod.invoke(null, countPrecedingMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#countPreceding(java.lang.String,int,char)}
 * @utbot.iterates iterate the loop {@code for(i = index - 1; i >= 0; i--)} once
 * @utbot.returnsFrom {@code return index - 1 - i;}
 *  */
    @Test
    public void testCountPreceding_LineCharAtEqualsCh() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method countPrecedingMethod = extendedPropertiesClazz.getDeclaredMethod("countPreceding", stringType, intType, charType);
        countPrecedingMethod.setAccessible(true);
        java.lang.Object[] countPrecedingMethodArguments = new java.lang.Object[3];
        countPrecedingMethodArguments[0] = string;
        countPrecedingMethodArguments[1] = 1;
        countPrecedingMethodArguments[2] = ' ';
        int actual = ((Integer) countPrecedingMethod.invoke(null, countPrecedingMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method countPreceding(java.lang.String, int, char)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#countPreceding(java.lang.String,int,char)}
 * @utbot.iterates iterate the loop {@code for(i = index - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: line.charAt(i) != ch
 *  */
    @Test
    public void testCountPreceding_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.countPreceding] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.collections.ExtendedProperties.countPreceding(ExtendedProperties.java:341) */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method countPrecedingMethod = extendedPropertiesClazz.getDeclaredMethod("countPreceding", stringType, intType, charType);
        countPrecedingMethod.setAccessible(true);
        java.lang.Object[] countPrecedingMethodArguments = new java.lang.Object[3];
        countPrecedingMethodArguments[0] = string;
        countPrecedingMethodArguments[1] = 1;
        countPrecedingMethodArguments[2] = ' ';
        try {
            countPrecedingMethod.invoke(null, countPrecedingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#countPreceding(java.lang.String,int,char)}
 * @utbot.iterates iterate the loop {@code for(i = index - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: line.charAt(i) != ch
 *  */
    @Test
    public void testCountPreceding_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.countPreceding] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ExtendedProperties.countPreceding(ExtendedProperties.java:341) */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Class charType = char.class;
        Method countPrecedingMethod = extendedPropertiesClazz.getDeclaredMethod("countPreceding", stringType, intType, charType);
        countPrecedingMethod.setAccessible(true);
        java.lang.Object[] countPrecedingMethodArguments = new java.lang.Object[3];
        countPrecedingMethodArguments[0] = ((Object) null);
        countPrecedingMethodArguments[1] = 1;
        countPrecedingMethodArguments[2] = ' ';
        try {
            countPrecedingMethod.invoke(null, countPrecedingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getInclude
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInclude()
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInclude()}
 * @utbot.executesCondition {@code (includePropertyName == null): False}
 * @utbot.executesCondition {@code ("".equals(includePropertyName)): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetInclude_Equals() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        String includePropertyName = "";
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "includePropertyName", includePropertyName);
        
        String actual = extendedProperties.getInclude();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInclude()}
 * @utbot.executesCondition {@code (includePropertyName == null): False}
 * @utbot.executesCondition {@code ("".equals(includePropertyName)): False}
 * @utbot.returnsFrom {@code return includePropertyName;}
 *  */
    @Test
    public void testGetInclude_NotEquals() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        String includePropertyName = "\u0000";
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "includePropertyName", includePropertyName);
        
        String actual = extendedProperties.getInclude();
        
        assertEquals(includePropertyName, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getInclude()}
 * @utbot.executesCondition {@code (includePropertyName == null): True}
 * @utbot.returnsFrom {@code return include;}
 *  */
    @Test
    public void testGetInclude_IncludePropertyNameEqualsNull() throws Exception  {
        String prevInclude = ExtendedProperties.include;
        try {
            ExtendedProperties.include = null;
            ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
            
            String actual = extendedProperties.getInclude();
            
            assertNull(actual);
        } finally {
            ExtendedProperties.include = prevInclude;
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.endsWithSlash
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method endsWithSlash(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#endsWithSlash(java.lang.String)}
 * @utbot.executesCondition {@code (!line.endsWith("\\")): True}
 * @utbot.invokes {@link java.lang.String#endsWith(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEndsWithSlash_NotLineEndsWith() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method endsWithSlashMethod = extendedPropertiesClazz.getDeclaredMethod("endsWithSlash", stringType);
        endsWithSlashMethod.setAccessible(true);
        java.lang.Object[] endsWithSlashMethodArguments = new java.lang.Object[1];
        endsWithSlashMethodArguments[0] = string;
        boolean actual = ((Boolean) endsWithSlashMethod.invoke(null, endsWithSlashMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method endsWithSlash(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#endsWith(java.lang.String)} once
    /// execute conditions:
    ///     {@code (!line.endsWith("\\")): False}
    /// invoke:
    ///     {@link java.lang.String#length()} once,
    ///     org.apache.commons.collections.ExtendedProperties#countPreceding(java.lang.String,int,char) once
    /// return from: {@code return (countPreceding(line, line.length() - 1, '\\') % 2 == 0);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#endsWithSlash(java.lang.String)}
 * @utbot.returnsFrom {@code return (countPreceding(line, line.length() - 1, '\\') % 2 == 0);}
 *  */
    @Test
    public void testEndsWithSlash_CountPrecedingRemainderOf2EqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\\";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method endsWithSlashMethod = extendedPropertiesClazz.getDeclaredMethod("endsWithSlash", stringType);
        endsWithSlashMethod.setAccessible(true);
        java.lang.Object[] endsWithSlashMethodArguments = new java.lang.Object[1];
        endsWithSlashMethodArguments[0] = string;
        boolean actual = ((Boolean) endsWithSlashMethod.invoke(null, endsWithSlashMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#endsWithSlash(java.lang.String)}
 * @utbot.returnsFrom {@code return (countPreceding(line, line.length() - 1, '\\') % 2 == 0);}
 *  */
    @Test
    public void testEndsWithSlash_CountPrecedingRemainderOf2NotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\\\\";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method endsWithSlashMethod = extendedPropertiesClazz.getDeclaredMethod("endsWithSlash", stringType);
        endsWithSlashMethod.setAccessible(true);
        java.lang.Object[] endsWithSlashMethodArguments = new java.lang.Object[1];
        endsWithSlashMethodArguments[0] = string;
        boolean actual = ((Boolean) endsWithSlashMethod.invoke(null, endsWithSlashMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#endsWithSlash(java.lang.String)}
 * @utbot.returnsFrom {@code return (countPreceding(line, line.length() - 1, '\\') % 2 == 0);}
 *  */
    @Test
    public void testEndsWithSlash_CountPrecedingRemainderOf2EqualsZero_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " \\";
        
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method endsWithSlashMethod = extendedPropertiesClazz.getDeclaredMethod("endsWithSlash", stringType);
        endsWithSlashMethod.setAccessible(true);
        java.lang.Object[] endsWithSlashMethodArguments = new java.lang.Object[1];
        endsWithSlashMethodArguments[0] = string;
        boolean actual = ((Boolean) endsWithSlashMethod.invoke(null, endsWithSlashMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endsWithSlash(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#endsWithSlash(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#endsWith(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !line.endsWith("\\")
 *  */
    @Test
    public void testEndsWithSlash_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.endsWithSlash] produces [java.lang.NullPointerException]
            org.apache.commons.collections.ExtendedProperties.endsWithSlash(ExtendedProperties.java:352) */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Method endsWithSlashMethod = extendedPropertiesClazz.getDeclaredMethod("endsWithSlash", stringType);
        endsWithSlashMethod.setAccessible(true);
        java.lang.Object[] endsWithSlashMethodArguments = new java.lang.Object[1];
        endsWithSlashMethodArguments[0] = ((Object) null);
        try {
            endsWithSlashMethod.invoke(null, endsWithSlashMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getList(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getList(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getList(java.lang.String,java.util.List)}
 * @utbot.returnsFrom {@code return getList(key, null);}
 *  */
    @Test
    public void testGetList_ExtendedPropertiesGetList() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        ArrayList actual = ((ArrayList) extendedProperties.getList(string));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getList(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getList(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#getList(java.lang.String,java.util.List)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return getList(key, null);
 *  */
    @Test
    public void testGetList_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getList] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.getList(ExtendedProperties.java:1146)
            org.apache.commons.collections.ExtendedProperties.getList(ExtendedProperties.java:1129) */
        extendedProperties.getList(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getList(java.lang.String)
    
    @Test
    public void testGetList1() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        Object entry = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "hash", 255);
        Integer key = 0;
        setField(entry, "java.util.Hashtable$Entry", "key", key);
        Object next = createInstance("java.util.Hashtable$Entry");
        setField(entry, "java.util.Hashtable$Entry", "next", next);
        table[0] = entry;
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getList] produces [java.lang.NullPointerException] */
        extendedProperties.getList(string);
    }
    
    @Test
    public void testGetList2() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        ExtendedProperties defaults = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        setField(extendedProperties, "org.apache.commons.collections.ExtendedProperties", "defaults", defaults);
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.getList] produces [java.lang.NullPointerException] */
        extendedProperties.getList(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.getList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getList(java.lang.String, java.util.List)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#getList(java.lang.String,java.util.List)}
 * @utbot.executesCondition {@code (value instanceof List): False}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (defaults != null): False}
 * @utbot.executesCondition {@code ((defaultValue == null)): False}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return ((defaultValue == null) ? new ArrayList() : defaultValue);}
 *  */
    @Test
    public void testGetList_DefaultValueNotEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 1);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = "  ";
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) extendedProperties.getList(string, arrayList));
        
        assertTrue(deepEquals(arrayList, actual));
        
        Object extendedPropertiesTable = getFieldValue(extendedProperties, "java.util.Hashtable", "table");
        Object finalExtendedPropertiesTable0 = get(extendedPropertiesTable, 0);
        
        assertNull(finalExtendedPropertiesTable0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.setInclude
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setInclude(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#setInclude(java.lang.String)}
 * @utbot.executesCondition {@code (inc == null): False}
 *  */
    @Test
    public void testSetInclude_IncNotEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        String string = "";
        
        extendedProperties.setInclude(string);
    }
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#setInclude(java.lang.String)}
 * @utbot.executesCondition {@code (inc == null): True}
 *  */
    @Test
    public void testSetInclude_IncEqualsNull() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        
        extendedProperties.setInclude(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.convertProperties
    
    ///region OTHER: SECURITY for method convertProperties(java.util.Properties)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testConvertProperties1() {
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.convertProperties] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "file.separator" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkPropertyAccess(SecurityManager.java:1160)
            java.base/java.lang.System.getProperty(System.java:916)
            org.apache.commons.collections.ExtendedProperties.<init>(ExtendedProperties.java:174)
            org.apache.commons.collections.ExtendedProperties.convertProperties(ExtendedProperties.java:1720) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.addProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addProperty(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#addProperty(java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (value instanceof String): False}
 * @utbot.invokes org.apache.commons.collections.ExtendedProperties#addPropertyInternal(java.lang.String,java.lang.Object)
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: addPropertyInternal(key, value);
 *  */
    @Test
    public void testAddProperty_ThrowArithmeticException() throws Exception  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.addProperty] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.addPropertyInternal(ExtendedProperties.java:731)
            org.apache.commons.collections.ExtendedProperties.addProperty(ExtendedProperties.java:697) */
        extendedProperties.addProperty(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.ExtendedProperties.addPropertyInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPropertyInternal(java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExtendedProperties}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.ExtendedProperties#addPropertyInternal(java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.ExtendedProperties#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: Object current = this.get(key);
 *  */
    @Test
    public void testAddPropertyInternal_ThrowArithmeticException() throws Throwable  {
        ExtendedProperties extendedProperties = ((ExtendedProperties) createInstance("org.apache.commons.collections.ExtendedProperties"));
        java.lang.Object[] table = createArray("java.util.Hashtable$Entry", 0);
        setField(extendedProperties, "java.util.Hashtable", "table", table);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.collections.ExtendedProperties.addPropertyInternal] produces [java.lang.ArithmeticException: / by zero]
            java.base/java.util.Hashtable.get(Hashtable.java:382)
            org.apache.commons.collections.ExtendedProperties.addPropertyInternal(ExtendedProperties.java:731) */
        Class extendedPropertiesClazz = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Method addPropertyInternalMethod = extendedPropertiesClazz.getDeclaredMethod("addPropertyInternal", stringType, objectType);
        addPropertyInternalMethod.setAccessible(true);
        java.lang.Object[] addPropertyInternalMethodArguments = new java.lang.Object[2];
        addPropertyInternalMethodArguments[0] = string;
        addPropertyInternalMethodArguments[1] = ((Object) null);
        try {
            addPropertyInternalMethod.invoke(extendedProperties, addPropertyInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
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
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields957599943039100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields957599943039100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass957599943045600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields957599943039100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass957599943045600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields957599943868600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields957599943868600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass957599943870700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields957599943868600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass957599943870700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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

