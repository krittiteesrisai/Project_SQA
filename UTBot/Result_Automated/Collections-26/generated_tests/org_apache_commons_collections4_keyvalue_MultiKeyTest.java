package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_collections4_keyvalue_MultiKeyTest {
    ///region Test suites for executable org.apache.commons.collections4.keyvalue.MultiKey.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        
        boolean actual = multiKey.equals(multiKey);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof MultiKey): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfMultiKey() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        
        boolean actual = multiKey.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof MultiKey): True}
 * @utbot.invokes {@link java.util.Arrays#equals(java.lang.Object[],java.lang.Object[])}
 * @utbot.returnsFrom {@code return Arrays.equals(keys, otherMulti.keys);}
 *  */
    @Test
    public void testEquals_OtherInstanceOfMultiKey() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        MultiKey multiKey1 = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null};
        setField(multiKey1, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        boolean actual = multiKey.equals(multiKey1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.keyvalue.MultiKey.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = new java.lang.Object[9];
        Character character = '\u0100';
        keys[0] = ((Object) character);
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        String actual = multiKey.toString();
        
        String expected = "MultiKey[\u0100, null, null, null, null, null, null, null, null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.keyvalue.MultiKey.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#hashCode()}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ReturnHashCode() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode", -255);
        
        int actual = multiKey.hashCode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.keyvalue.MultiKey.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#size()}
 * @utbot.returnsFrom {@code return keys.length;}
 *  */
    @Test
    public void testSize_ReturnKeysLength() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null};
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        int actual = multiKey.size();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return keys.length;
 *  */
    @Test
    public void testSize_ThrowNullPointerException() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        
        /* This test fails because method [org.apache.commons.collections4.keyvalue.MultiKey.size] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.keyvalue.MultiKey.size(MultiKey.java:206) */
        multiKey.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.keyvalue.MultiKey.getKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKey(int)
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#getKey(int)}
 * @utbot.returnsFrom {@code return keys[index];}
 *  */
    @Test
    public void testGetKey_ReturnIndexOfKeys() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null, null};
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        Object actual = multiKey.getKey(1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getKey(int)
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#getKey(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return keys[index];
 *  */
    @Test
    public void testGetKey_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null};
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        /* This test fails because method [org.apache.commons.collections4.keyvalue.MultiKey.getKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.collections4.keyvalue.MultiKey.getKey(MultiKey.java:196) */
        multiKey.getKey(-256);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#getKey(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return keys[index];
 *  */
    @Test
    public void testGetKey_ThrowNullPointerException() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        
        /* This test fails because method [org.apache.commons.collections4.keyvalue.MultiKey.getKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.keyvalue.MultiKey.getKey(MultiKey.java:196) */
        multiKey.getKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.keyvalue.MultiKey.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#readResolve()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve_Return() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = {};
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode", -255);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Method readResolveMethod = multiKeyClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        MultiKey actual = ((MultiKey) readResolveMethod.invoke(multiKey, readResolveMethodArguments));
        
        java.lang.Object[] multiKeyKeys = multiKey.getKeys();
        java.lang.Object[] actualKeys = actual.getKeys();
        int multiKeyKeysSize = multiKeyKeys.length;
        assertEquals(multiKeyKeysSize, actualKeys.length);
        assertTrue(deepEquals(multiKeyKeys, actualKeys));
        
        int multiKeyHashCode = ((Integer) getFieldValue(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        int actualHashCode = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        assertEquals(multiKeyHashCode, actualHashCode);
        
        int finalMultiKeyHashCode = ((Integer) getFieldValue(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        
        assertEquals(0, finalMultiKeyHashCode);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#readResolve()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve_Return_1() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = new java.lang.Object[1];
        Integer integer = 0;
        keys[0] = ((Object) integer);
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Method readResolveMethod = multiKeyClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        MultiKey actual = ((MultiKey) readResolveMethod.invoke(multiKey, readResolveMethodArguments));
        
        java.lang.Object[] multiKeyKeys = multiKey.getKeys();
        java.lang.Object[] actualKeys = actual.getKeys();
        int multiKeyKeysSize = multiKeyKeys.length;
        assertEquals(multiKeyKeysSize, actualKeys.length);
        assertTrue(deepEquals(multiKeyKeys, actualKeys));
        
        int multiKeyHashCode = ((Integer) getFieldValue(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        int actualHashCode = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        assertEquals(multiKeyHashCode, actualHashCode);
        
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#readResolve()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve_Return_2() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null};
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Method readResolveMethod = multiKeyClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        MultiKey actual = ((MultiKey) readResolveMethod.invoke(multiKey, readResolveMethodArguments));
        
        java.lang.Object[] multiKeyKeys = multiKey.getKeys();
        java.lang.Object[] actualKeys = actual.getKeys();
        int multiKeyKeysSize = multiKeyKeys.length;
        assertEquals(multiKeyKeysSize, actualKeys.length);
        assertTrue(deepEquals(multiKeyKeys, actualKeys));
        
        int multiKeyHashCode = ((Integer) getFieldValue(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        int actualHashCode = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        assertEquals(multiKeyHashCode, actualHashCode);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readResolve()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#readResolve()}
 * @utbot.invokes org.apache.commons.collections4.keyvalue.MultiKey#calculateHashCode(java.lang.Object[])
 * @utbot.throwsException {@link java.lang.NullPointerException} in: calculateHashCode(keys);
 *  */
    @Test
    public void testReadResolve_ThrowNullPointerException() throws Throwable  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        
        /* This test fails because method [org.apache.commons.collections4.keyvalue.MultiKey.readResolve] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.keyvalue.MultiKey.calculateHashCode(MultiKey.java:263)
            org.apache.commons.collections4.keyvalue.MultiKey.readResolve(MultiKey.java:278) */
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Method readResolveMethod = multiKeyClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        try {
            readResolveMethod.invoke(multiKey, readResolveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method readResolve()
    
    @Test
    public void testReadResolve1() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = new java.lang.Object[15];
        Integer integer = 0;
        keys[0] = ((Object) integer);
        Character character = '\u0000';
        keys[2] = ((Object) character);
        Long long1 = 0L;
        keys[6] = ((Object) long1);
        keys[7] = ((Object) multiKey);
        keys[8] = ((Object) multiKey);
        keys[9] = ((Object) multiKey);
        keys[10] = ((Object) multiKey);
        keys[11] = ((Object) multiKey);
        keys[12] = ((Object) multiKey);
        keys[13] = ((Object) multiKey);
        keys[14] = ((Object) multiKey);
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Method readResolveMethod = multiKeyClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        MultiKey actual = ((MultiKey) readResolveMethod.invoke(multiKey, readResolveMethodArguments));
        
        java.lang.Object[] multiKeyKeys = multiKey.getKeys();
        java.lang.Object[] actualKeys = actual.getKeys();
        int multiKeyKeysSize = multiKeyKeys.length;
        assertEquals(multiKeyKeysSize, actualKeys.length);
        assertTrue(deepEquals(multiKeyKeys, actualKeys));
        
        int multiKeyHashCode = ((Integer) getFieldValue(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        int actualHashCode = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        assertEquals(multiKeyHashCode, actualHashCode);
        
    }
    
    @Test
    public void testReadResolve2() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = new java.lang.Object[14];
        Integer integer = 0;
        keys[2] = ((Object) integer);
        keys[4] = ((Object) integer);
        Long long1 = 0L;
        keys[5] = ((Object) long1);
        keys[6] = ((Object) multiKey);
        keys[7] = ((Object) multiKey);
        keys[8] = ((Object) multiKey);
        keys[9] = ((Object) multiKey);
        keys[10] = ((Object) multiKey);
        keys[11] = ((Object) multiKey);
        keys[12] = ((Object) multiKey);
        keys[13] = ((Object) multiKey);
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Method readResolveMethod = multiKeyClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        MultiKey actual = ((MultiKey) readResolveMethod.invoke(multiKey, readResolveMethodArguments));
        
        java.lang.Object[] multiKeyKeys = multiKey.getKeys();
        java.lang.Object[] actualKeys = actual.getKeys();
        int multiKeyKeysSize = multiKeyKeys.length;
        assertEquals(multiKeyKeysSize, actualKeys.length);
        assertTrue(deepEquals(multiKeyKeys, actualKeys));
        
        int multiKeyHashCode = ((Integer) getFieldValue(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        int actualHashCode = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        assertEquals(multiKeyHashCode, actualHashCode);
        
    }
    
    @Test
    public void testReadResolve3() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = new java.lang.Object[13];
        Character character = '\u0000';
        keys[1] = ((Object) character);
        Integer integer = 0;
        keys[2] = ((Object) integer);
        keys[4] = ((Object) integer);
        keys[5] = ((Object) multiKey);
        keys[6] = ((Object) multiKey);
        keys[7] = ((Object) multiKey);
        keys[8] = ((Object) multiKey);
        keys[9] = ((Object) multiKey);
        keys[10] = ((Object) multiKey);
        keys[11] = ((Object) multiKey);
        keys[12] = ((Object) multiKey);
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Method readResolveMethod = multiKeyClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        MultiKey actual = ((MultiKey) readResolveMethod.invoke(multiKey, readResolveMethodArguments));
        
        java.lang.Object[] multiKeyKeys = multiKey.getKeys();
        java.lang.Object[] actualKeys = actual.getKeys();
        int multiKeyKeysSize = multiKeyKeys.length;
        assertEquals(multiKeyKeysSize, actualKeys.length);
        assertTrue(deepEquals(multiKeyKeys, actualKeys));
        
        int multiKeyHashCode = ((Integer) getFieldValue(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        int actualHashCode = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        assertEquals(multiKeyHashCode, actualHashCode);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.keyvalue.MultiKey.getKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKeys()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#getKeys()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return keys.clone();}
 *  */
    @Test
    public void testGetKeys_ObjectClone() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] keys = {};
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "keys", keys);
        
        java.lang.Object[] actual = multiKey.getKeys();
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getKeys()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#getKeys()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return keys.clone();
 *  */
    @Test
    public void testGetKeys_ThrowNullPointerException() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        
        /* This test fails because method [org.apache.commons.collections4.keyvalue.MultiKey.getKeys] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.keyvalue.MultiKey.getKeys(MultiKey.java:181) */
        multiKey.getKeys();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.keyvalue.MultiKey.calculateHashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method calculateHashCode([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#calculateHashCode(java.lang.Object[])}
 *  */
    @Test
    public void testCalculateHashCode() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode", -255);
        java.lang.Object[] objectArray = {};
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
        
        int finalMultiKeyHashCode = ((Integer) getFieldValue(multiKey, "org.apache.commons.collections4.keyvalue.MultiKey", "hashCode"));
        
        assertEquals(0, finalMultiKeyHashCode);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#calculateHashCode(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object key: keys)} once
 *  */
    @Test
    public void testCalculateHashCode_KeyEqualsNull() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = {null};
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#calculateHashCode(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(final Object key: keys)} once
 *  */
    @Test
    public void testCalculateHashCode_KeyNotEqualsNull() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateHashCode([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.keyvalue.MultiKey#calculateHashCode(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Object key: keys)
 *  */
    @Test
    public void testCalculateHashCode_ThrowNullPointerException() throws Throwable  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        
        /* This test fails because method [org.apache.commons.collections4.keyvalue.MultiKey.calculateHashCode] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.keyvalue.MultiKey.calculateHashCode(MultiKey.java:263) */
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) null);
        try {
            calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method calculateHashCode([Ljava.lang.Object;)
    
    @Test
    public void testCalculateHashCode1() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        objectArray[1] = ((Object) integer);
        Character character = '\u0000';
        objectArray[7] = ((Object) character);
        objectArray[8] = ((Object) multiKey);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
    }
    
    @Test
    public void testCalculateHashCode2() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Character character = '\u0000';
        objectArray[5] = ((Object) character);
        Integer integer = 0;
        objectArray[7] = ((Object) integer);
        objectArray[8] = ((Object) multiKey);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
    }
    
    @Test
    public void testCalculateHashCode3() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections4.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[1] = ((Object) integer);
        Character character = '\u0000';
        objectArray[6] = ((Object) character);
        objectArray[8] = ((Object) multiKey);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields948551718861600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields948551718861600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass948551718866700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948551718861600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948551718866700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields948551722551800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields948551722551800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass948551722553400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948551722551800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948551722553400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

