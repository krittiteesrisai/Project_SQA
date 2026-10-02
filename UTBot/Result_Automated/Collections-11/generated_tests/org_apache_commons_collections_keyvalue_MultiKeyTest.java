package org.apache.commons.collections.keyvalue;

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

public final class org_apache_commons_collections_keyvalue_MultiKeyTest {
    ///region Test suites for executable org.apache.commons.collections.keyvalue.MultiKey.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        
        boolean actual = multiKey.equals(multiKey);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof MultiKey): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfMultiKey() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        
        boolean actual = multiKey.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof MultiKey): True}
 * @utbot.invokes {@link java.util.Arrays#equals(java.lang.Object[],java.lang.Object[])}
 * @utbot.returnsFrom {@code return Arrays.equals(keys, otherMulti.keys);}
 *  */
    @Test
    public void testEquals_OtherInstanceOfMultiKey() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        MultiKey multiKey1 = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null};
        setField(multiKey1, "org.apache.commons.collections.keyvalue.MultiKey", "keys", keys);
        
        boolean actual = multiKey.equals(multiKey1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.keyvalue.MultiKey.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "MultiKey" + Arrays.asList(keys).toString();}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null};
        setField(multiKey, "org.apache.commons.collections.keyvalue.MultiKey", "keys", keys);
        
        String actual = multiKey.toString();
        
        String expected = "MultiKey[null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.keyvalue.MultiKey.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#hashCode()}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ReturnHashCode() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(multiKey, "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", -255);
        
        int actual = multiKey.hashCode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.keyvalue.MultiKey.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#size()}
 * @utbot.returnsFrom {@code return keys.length;}
 *  */
    @Test
    public void testSize_ReturnKeysLength() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null};
        setField(multiKey, "org.apache.commons.collections.keyvalue.MultiKey", "keys", keys);
        
        int actual = multiKey.size();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return keys.length;
 *  */
    @Test
    public void testSize_ThrowNullPointerException() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        
        /* This test fails because method [org.apache.commons.collections.keyvalue.MultiKey.size] produces [java.lang.NullPointerException]
            org.apache.commons.collections.keyvalue.MultiKey.size(MultiKey.java:207) */
        multiKey.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.keyvalue.MultiKey.getKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKey(int)
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#getKey(int)}
 * @utbot.returnsFrom {@code return keys[index];}
 *  */
    @Test
    public void testGetKey_ReturnIndexOfKeys() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null, null};
        setField(multiKey, "org.apache.commons.collections.keyvalue.MultiKey", "keys", keys);
        
        Object actual = multiKey.getKey(1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getKey(int)
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#getKey(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return keys[index];
 *  */
    @Test
    public void testGetKey_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] keys = {null};
        setField(multiKey, "org.apache.commons.collections.keyvalue.MultiKey", "keys", keys);
        
        /* This test fails because method [org.apache.commons.collections.keyvalue.MultiKey.getKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.collections.keyvalue.MultiKey.getKey(MultiKey.java:197) */
        multiKey.getKey(-256);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#getKey(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return keys[index];
 *  */
    @Test
    public void testGetKey_ThrowNullPointerException() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        
        /* This test fails because method [org.apache.commons.collections.keyvalue.MultiKey.getKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections.keyvalue.MultiKey.getKey(MultiKey.java:197) */
        multiKey.getKey(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.keyvalue.MultiKey.getKeys
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKeys()
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#getKeys()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return (Object[]) keys.clone();}
 *  */
    @Test
    public void testGetKeys_ObjectClone() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] keys = {};
        setField(multiKey, "org.apache.commons.collections.keyvalue.MultiKey", "keys", keys);
        
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
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#getKeys()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Object[]) keys.clone();
 *  */
    @Test
    public void testGetKeys_ThrowNullPointerException() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        
        /* This test fails because method [org.apache.commons.collections.keyvalue.MultiKey.getKeys] produces [java.lang.NullPointerException]
            org.apache.commons.collections.keyvalue.MultiKey.getKeys(MultiKey.java:182) */
        multiKey.getKeys();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.keyvalue.MultiKey.calculateHashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method calculateHashCode([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#calculateHashCode(java.lang.Object[])}
 *  */
    @Test
    public void testCalculateHashCode() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(multiKey, "org.apache.commons.collections.keyvalue.MultiKey", "hashCode", -255);
        java.lang.Object[] objectArray = {};
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
        
        int finalMultiKeyHashCode = ((Integer) getFieldValue(multiKey, "org.apache.commons.collections.keyvalue.MultiKey", "hashCode"));
        
        assertEquals(0, finalMultiKeyHashCode);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#calculateHashCode(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < keys.length; i++)} once
 *  */
    @Test
    public void testCalculateHashCode_IOfKeysEqualsNull() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = {null};
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MultiKey}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#calculateHashCode(java.lang.Object[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < keys.length; i++)} once
 *  */
    @Test
    public void testCalculateHashCode_IOfKeysNotEqualsNull() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
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
 * @utbot.methodUnderTest {@link org.apache.commons.collections.keyvalue.MultiKey#calculateHashCode(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < keys.length; i++)
 *  */
    @Test
    public void testCalculateHashCode_ThrowNullPointerException() throws Throwable  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        
        /* This test fails because method [org.apache.commons.collections.keyvalue.MultiKey.calculateHashCode] produces [java.lang.NullPointerException]
            org.apache.commons.collections.keyvalue.MultiKey.calculateHashCode(MultiKey.java:261) */
        Class multiKeyClazz = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
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
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = new java.lang.Object[13];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        objectArray[1] = ((Object) integer);
        Character character = '\u0000';
        objectArray[3] = ((Object) character);
        objectArray[4] = ((Object) integer);
        objectArray[5] = ((Object) multiKey);
        objectArray[6] = ((Object) multiKey);
        objectArray[7] = ((Object) multiKey);
        objectArray[8] = ((Object) multiKey);
        objectArray[9] = ((Object) multiKey);
        objectArray[10] = ((Object) multiKey);
        objectArray[11] = ((Object) multiKey);
        objectArray[12] = ((Object) multiKey);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
    }
    
    @Test
    public void testCalculateHashCode2() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = new java.lang.Object[15];
        Character character = '\u0000';
        objectArray[2] = ((Object) character);
        objectArray[3] = ((Object) character);
        objectArray[7] = ((Object) multiKey);
        objectArray[8] = ((Object) multiKey);
        objectArray[9] = ((Object) multiKey);
        objectArray[10] = ((Object) multiKey);
        objectArray[11] = ((Object) multiKey);
        objectArray[12] = ((Object) multiKey);
        objectArray[13] = ((Object) multiKey);
        objectArray[14] = ((Object) multiKey);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method calculateHashCodeMethod = multiKeyClazz.getDeclaredMethod("calculateHashCode", objectArrayType);
        calculateHashCodeMethod.setAccessible(true);
        java.lang.Object[] calculateHashCodeMethodArguments = new java.lang.Object[1];
        calculateHashCodeMethodArguments[0] = ((Object) objectArray);
        calculateHashCodeMethod.invoke(multiKey, calculateHashCodeMethodArguments);
    }
    
    @Test
    public void testCalculateHashCode3() throws Exception  {
        MultiKey multiKey = ((MultiKey) createInstance("org.apache.commons.collections.keyvalue.MultiKey"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[1] = ((Object) integer);
        Character character = '\u0000';
        objectArray[3] = ((Object) character);
        objectArray[7] = ((Object) character);
        objectArray[8] = ((Object) multiKey);
        
        Class multiKeyClazz = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
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
        
                java.lang.reflect.Method methodForGetDeclaredFields957211812300500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields957211812300500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass957211812339000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields957211812300500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass957211812339000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields957211815789500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields957211815789500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass957211815791300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields957211815789500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass957211815791300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

