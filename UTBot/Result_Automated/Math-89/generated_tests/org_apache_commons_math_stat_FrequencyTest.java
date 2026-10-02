package org.apache.commons.math.stat;

import org.junit.Test;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.ArrayList;
import java.util.HashSet;
import sun.security.util.ByteArrayLexOrder;
import sun.security.util.ByteArrayTagOrder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_stat_FrequencyTest {
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValue(char)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(char)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addValue(Character.valueOf(v));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.ProcessEnvironment$NameComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        short[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        frequency.addValue(' ');
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addValue(char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.Frequency}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(char)}
     */
    @Test
    public void testAddValue() {
        Frequency frequency = new Frequency();
        
        frequency.addValue('\u001F');
    }
    ///endregion
    
    ///region Errors report for addValue
    
    public void testAddValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addValue(int)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(int)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 *  */
    @Test
    public void testAddValue_FrequencyAddValue() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(freqTable, "java.util.TreeMap", "size", -255);
        setField(freqTable, "java.util.TreeMap", "modCount", -255);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        frequency.addValue(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValue(int)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(int)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addValue(Long.valueOf(v));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        short[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        frequency.addValue(-255);
    }
    ///endregion
    
    ///region Errors report for addValue
    
    public void testAddValue_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addValue(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Integer)}
 *  */
    @Test
    public void testAddValue1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = -255L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Integer integer = -255;
        
        frequency.addValue(integer);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Integer)}
 *  */
    @Test
    public void testAddValue_1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = -255L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Long value = -1L;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Integer integer = -255;
        
        frequency.addValue(integer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addValue(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Integer)}
 * @utbot.invokes {@link java.lang.Integer#longValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addValue(Long.valueOf(v.longValue()));
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException() {
        Frequency frequency = new Frequency();
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.addValue(Frequency.java:156) */
        frequency.addValue(((Integer) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValue(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Integer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addValue(Long.valueOf(v.longValue()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException_1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Integer integer = -255;
        
        frequency.addValue(integer);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Integer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addValue(Long.valueOf(v.longValue()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = -255L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        byte[] value = {};
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Integer integer = -255;
        
        frequency.addValue(integer);
    }
    ///endregion
    
    ///region Errors report for addValue
    
    public void testAddValue_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addValue(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(long)}
 *  */
    @Test
    public void testAddValue2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = -255L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        frequency.addValue(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(long)}
 *  */
    @Test
    public void testAddValue_11() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = -255L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Long value = 0L;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        frequency.addValue(-255L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValue(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addValue(Long.valueOf(v));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        short[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        frequency.addValue(-256L);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addValue(Long.valueOf(v));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException_11() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = -255L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        byte[] value = {};
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        frequency.addValue(-255L);
    }
    ///endregion
    
    ///region Errors report for addValue
    
    public void testAddValue_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: addValue((Comparable<?>) v);
 *  */
    @Test
    public void testAddValue_ThrowClassCastException() {
        Frequency frequency = new Frequency();
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.addValue] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Comparable ([B and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.addValue(Frequency.java:110) */
        frequency.addValue(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.addValue] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:345)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            org.apache.commons.math.stat.Frequency.addValue(Frequency.java:129)
            org.apache.commons.math.stat.Frequency.addValue(Frequency.java:110) */
        frequency.addValue(((Object) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addValue((Comparable<?>) v);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException_12() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        int[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        frequency.addValue(((Object) null));
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addValue((Comparable<?>) v);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException4() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Integer integer = 0;
        
        frequency.addValue(((Object) integer));
    }
    ///endregion
    
    ///region Errors report for addValue
    
    public void testAddValue_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.executesCondition {@code (count == null): False}
 * @utbot.invokes {@link java.lang.Long#longValue()}
 * @utbot.invokes {@link java.util.TreeMap#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testAddValue_CountNotEqualsNull() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = 0L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Long value = -3L;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Long long1 = 0L;
        
        frequency.addValue(((Comparable) long1));
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.executesCondition {@code (count == null): True}
 * @utbot.invokes {@link java.util.TreeMap#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testAddValue_CountEqualsNull() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = 0L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "color", true);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(freqTable, "java.util.TreeMap", "size", -255);
        setField(freqTable, "java.util.TreeMap", "modCount", -255);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Long long1 = 1L;
        
        TreeMap frequencyFreqTable = ((TreeMap) getFieldValue(frequency, "org.apache.commons.math.stat.Frequency", "freqTable"));
        Object frequencyFreqTableFreqTableRoot = getFieldValue(frequencyFreqTable, "java.util.TreeMap", "root");
        Object initialFrequencyFreqTableRootRight = getFieldValue(frequencyFreqTableFreqTableRoot, "java.util.TreeMap$Entry", "right");
        
        frequency.addValue(((Comparable) long1));
        
        TreeMap frequencyFreqTable1 = ((TreeMap) getFieldValue(frequency, "org.apache.commons.math.stat.Frequency", "freqTable"));
        Object frequencyFreqTable1FreqTableRoot = getFieldValue(frequencyFreqTable1, "java.util.TreeMap", "root");
        Object finalFrequencyFreqTableRootRight = getFieldValue(frequencyFreqTable1FreqTableRoot, "java.util.TreeMap$Entry", "right");
        TreeMap frequencyFreqTable2 = ((TreeMap) getFieldValue(frequency, "org.apache.commons.math.stat.Frequency", "freqTable"));
        int finalFrequencyFreqTableSize = ((Integer) getFieldValue(frequencyFreqTable2, "java.util.TreeMap", "size"));
        TreeMap frequencyFreqTable3 = ((TreeMap) getFieldValue(frequency, "org.apache.commons.math.stat.Frequency", "freqTable"));
        int finalFrequencyFreqTableModCount = ((Integer) getFieldValue(frequencyFreqTable3, "java.util.TreeMap", "modCount"));
        
        assertFalse(initialFrequencyFreqTableRootRight == finalFrequencyFreqTableRootRight);
        
        assertEquals(-254, finalFrequencyFreqTableSize);
        
        assertEquals(-254, finalFrequencyFreqTableModCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.TreeMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Long count = (Long) freqTable.get(obj);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.addValue(Frequency.java:129) */
        frequency.addValue(((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.TreeMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Long count = (Long) freqTable.get(obj);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.addValue] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:345)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            org.apache.commons.math.stat.Frequency.addValue(Frequency.java:129) */
        frequency.addValue(((Comparable) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in:  catch (ClassCastException ex) {
 *     throw new IllegalArgumentException("Value not comparable to existing values.");
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException5() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Character character = '\u0000';
        
        frequency.addValue(((Comparable) character));
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.caughtException {@code ClassCastException ex}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in:  catch (ClassCastException ex) {
 *     throw new IllegalArgumentException("Value not comparable to existing values.");
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_ThrowIllegalArgumentException_13() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = 0L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        int[] value = {};
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Long long1 = 0L;
        
        frequency.addValue(((Comparable) long1));
    }
    ///endregion
    
    ///region Errors report for addValue
    
    public void testAddValue_errors5()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.valuesIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method valuesIterator()
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#valuesIterator()}
 * @utbot.invokes {@link java.util.TreeMap#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return freqTable.keySet().iterator();}
 *  */
    @Test
    public void testValuesIterator_SetIterator() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(freqTable, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", freqTable);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        Object actual = frequency.valuesIterator();
        
        Object expected = createInstance("java.util.TreeMap$KeyIterator");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method valuesIterator()
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#valuesIterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return freqTable.keySet().iterator();
 *  */
    @Test
    public void testValuesIterator_ThrowClassCastException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.ClassCastException: class java.util.concurrent.ConcurrentSkipListMap cannot be cast to class java.util.TreeMap$NavigableSubMap (java.util.concurrent.ConcurrentSkipListMap and java.util.TreeMap$NavigableSubMap are in module java.base of loader 'bootstrap')]
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:192) */
        frequency.valuesIterator();
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#valuesIterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return freqTable.keySet().iterator();
 *  */
    @Test
    public void testValuesIterator_ThrowClassCastException_1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(freqTable, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", freqTable);
        byte[] lo = {};
        setField(m, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Comparable ([B and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap.getHigherEntry(TreeMap.java:461)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1707)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:192) */
        frequency.valuesIterator();
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#valuesIterator()}
 * @utbot.invokes {@link java.util.TreeMap#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return freqTable.keySet().iterator();
 *  */
    @Test
    public void testValuesIterator_ThrowNullPointerException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:192) */
        frequency.valuesIterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumPct(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Object)}
 * @utbot.executesCondition {@code (sumFreq == 0): True}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testGetCumPct_SumFreqEqualsZero() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getCumPct(((Object) null));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCumPct(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final long sumFreq = getSumFreq();
 *  */
    @Test
    public void testGetCumPct_ThrowClassCastException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:418) */
        frequency.getCumPct(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumPct(char)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(char)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Object)}
 * @utbot.returnsFrom {@code return getCumPct(Character.valueOf(v));}
 *  */
    @Test
    public void testGetCumPct_FrequencyGetCumPct() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getCumPct(' ');
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCumPct(char)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(char)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getCumPct(Character.valueOf(v));
 *  */
    @Test
    public void testGetCumPct_ThrowClassCastException1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:418)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:461) */
        frequency.getCumPct(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumPct(int)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(int)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Object)}
 * @utbot.returnsFrom {@code return getCumPct(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCumPct_FrequencyGetCumPct1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getCumPct(-255);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCumPct(int)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(int)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getCumPct(Long.valueOf(v));
 *  */
    @Test
    public void testGetCumPct_ThrowClassCastException2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Character character = '\u0000';
        values.add(character);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class java.lang.Long (java.lang.Character and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:418)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:435) */
        frequency.getCumPct(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumPct(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(long)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Object)}
 * @utbot.returnsFrom {@code return getCumPct(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCumPct_FrequencyGetCumPct2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getCumPct(-255L);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCumPct(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(long)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getCumPct(Long.valueOf(v));
 *  */
    @Test
    public void testGetCumPct_ThrowClassCastException3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Character character = '\u0000';
        values.add(character);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class java.lang.Long (java.lang.Character and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:418)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:448) */
        frequency.getCumPct(-255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getSumFreq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSumFreq()
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetSumFreq_ReturnResult() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getSumFreq();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetSumFreq_IteratorHasNext() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        Long long1 = 0L;
        values.add(long1);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getSumFreq();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSumFreq()
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result += ((Long) iterator.next()).longValue();
 *  */
    @Test
    public void testGetSumFreq_ThrowClassCastException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getSumFreq] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206) */
        frequency.getSumFreq();
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.invokes {@link java.util.TreeMap#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iterator = freqTable.values().iterator();
 *  */
    @Test
    public void testGetSumFreq_ThrowNullPointerException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getSumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:204) */
        frequency.getSumFreq();
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result += ((Long) iterator.next()).longValue();
 *  */
    @Test
    public void testGetSumFreq_ThrowNullPointerException_1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getSumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206) */
        frequency.getSumFreq();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumFreq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumFreq(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumFreq(java.lang.Object)}
 * @utbot.executesCondition {@code (getSumFreq() == 0): True}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 *  */
    @Test
    public void testGetCumFreq_GetSumFreqEqualsZero() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCumFreq(((Object) null));
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCumFreq(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumFreq(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: getSumFreq() == 0
 *  */
    @Test
    public void testGetCumFreq_ThrowClassCastException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327) */
        frequency.getCumFreq(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumFreq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumFreq(int)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumFreq(int)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumFreq(java.lang.Object)}
 * @utbot.returnsFrom {@code return getCumFreq(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCumFreq_FrequencyGetCumFreq() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCumFreq(-255);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumFreq(int)
    
    @Test
    public void testGetCumFreq1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Character character = '\u0000';
        values.add(character);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class java.lang.Long (java.lang.Character and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:377) */
        frequency.getCumFreq(0);
    }
    
    @Test
    public void testGetCumFreq2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:377) */
        frequency.getCumFreq(0);
    }
    
    @Test
    public void testGetCumFreq3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        Long long1 = 0L;
        values.add(long1);
        values.add(null);
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:377) */
        frequency.getCumFreq(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumFreq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumFreq(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumFreq(long)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumFreq(java.lang.Object)}
 * @utbot.returnsFrom {@code return getCumFreq(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCumFreq_FrequencyGetCumFreq1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCumFreq(-255L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumFreq(long)
    
    @Test
    public void testGetCumFreq4() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Character character = '\u0000';
        values.add(character);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class java.lang.Long (java.lang.Character and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:389) */
        frequency.getCumFreq(0L);
    }
    
    @Test
    public void testGetCumFreq5() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        Character character = '\u0000';
        values.add(character);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:389) */
        frequency.getCumFreq(0L);
    }
    
    @Test
    public void testGetCumFreq6() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        Long long1 = 0L;
        values.add(long1);
        values.add(null);
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:389) */
        frequency.getCumFreq(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumFreq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumFreq(char)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumFreq(char)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumFreq(java.lang.Object)}
 * @utbot.returnsFrom {@code return getCumFreq(Character.valueOf(v));}
 *  */
    @Test
    public void testGetCumFreq_FrequencyGetCumFreq2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCumFreq(' ');
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCumFreq(char)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumFreq(char)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumFreq(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getCumFreq(Character.valueOf(v));
 *  */
    @Test
    public void testGetCumFreq_ThrowClassCastException1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:401) */
        frequency.getCumFreq(' ');
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumFreq(char)
    
    @Test
    public void testGetCumFreq7() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:401) */
        frequency.getCumFreq('\u0000');
    }
    
    @Test
    public void testGetCumFreq8() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        Long long1 = 0L;
        values.add(long1);
        values.add(null);
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:327)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:401) */
        frequency.getCumFreq('\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPct(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getPct(long)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getPct(java.lang.Object)}
 * @utbot.returnsFrom {@code return getPct(Long.valueOf(v));}
 *  */
    @Test
    public void testGetPct_FrequencyGetPct() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getPct(-255L);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPct(long)
    
    @Test
    public void testGetPct1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:302) */
        frequency.getPct(0L);
    }
    
    @Test
    public void testGetPct2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        Object object = createInstance("java.lang.Object");
        values.add(object);
        values.add(object);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:302) */
        frequency.getPct(0L);
    }
    
    @Test
    public void testGetPct3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        Long long1 = 0L;
        values.add(long1);
        values.add(null);
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:302) */
        frequency.getPct(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPct(char)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getPct(char)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getPct(java.lang.Object)}
 * @utbot.returnsFrom {@code return getPct(Character.valueOf(v));}
 *  */
    @Test
    public void testGetPct_FrequencyGetPct1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getPct(' ');
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPct(char)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getPct(char)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getPct(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getPct(Character.valueOf(v));
 *  */
    @Test
    public void testGetPct_ThrowClassCastException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:313) */
        frequency.getPct(' ');
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPct(char)
    
    @Test
    public void testGetPct4() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:313) */
        frequency.getPct('\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPct(int)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getPct(int)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getPct(java.lang.Object)}
 * @utbot.returnsFrom {@code return getPct(Long.valueOf(v));}
 *  */
    @Test
    public void testGetPct_FrequencyGetPct2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getPct(-255);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPct(int)
    
    @Test
    public void testGetPct5() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:291) */
        frequency.getPct(0);
    }
    
    @Test
    public void testGetPct6() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:291) */
        frequency.getPct(0);
    }
    
    @Test
    public void testGetPct7() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        Long long1 = 0L;
        values.add(long1);
        values.add(null);
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:291) */
        frequency.getPct(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPct(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getPct(java.lang.Object)}
 * @utbot.executesCondition {@code (sumFreq == 0): True}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testGetPct_SumFreqEqualsZero() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getPct(((Object) null));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPct(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getPct(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final long sumFreq = getSumFreq();
 *  */
    @Test
    public void testGetPct_ThrowClassCastException1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276) */
        frequency.getPct(((Object) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPct(java.lang.Object)
    
    @Test
    public void testGetPct8() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276) */
        frequency.getPct(object);
    }
    
    @Test
    public void testGetPct9() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        Long long1 = 0L;
        values.add(long1);
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:206)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:276) */
        frequency.getPct(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() {
        Frequency frequency = new Frequency();
        
        String actual = frequency.toString();
        
        String expected = "Value \t Freq. \t Pct. \t Cum Pct. \n";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
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
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#clear()}
 * @utbot.invokes {@link java.util.TreeMap#clear()}
 *  */
    @Test
    public void testClear_TreeMapClear() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(freqTable, "java.util.TreeMap", "size", -255);
        setField(freqTable, "java.util.TreeMap", "modCount", -255);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        frequency.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#clear()}
 * @utbot.invokes {@link java.util.TreeMap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: freqTable.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.clear(Frequency.java:179) */
        frequency.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCount(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(long)}
 * @utbot.returnsFrom {@code return getCount(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCount_ReturnGetCount() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(long)}
 * @utbot.returnsFrom {@code return getCount(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCount_ReturnGetCount_1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(-255L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(long)}
 * @utbot.returnsFrom {@code return getCount(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCount_ReturnGetCount_2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = -255L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "value", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(-255L);
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getCount(long)
    
    @Test(timeout = 1000L)
    public void testGetCount1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Long key = 540449547470503936L;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Object left = createInstance("java.util.TreeMap$Entry");
        Long key1 = 4611686018427387904L;
        setField(left, "java.util.TreeMap$Entry", "key", key1);
        Object left1 = createInstance("java.util.TreeMap$Entry");
        Long key2 = 4611686018427387904L;
        setField(left1, "java.util.TreeMap$Entry", "key", key2);
        Object left2 = createInstance("java.util.TreeMap$Entry");
        Long key3 = 540434154307715072L;
        setField(left2, "java.util.TreeMap$Entry", "key", key3);
        Object right = createInstance("java.util.TreeMap$Entry");
        setField(right, "java.util.TreeMap$Entry", "key", key2);
        setField(right, "java.util.TreeMap$Entry", "left", right);
        setField(left2, "java.util.TreeMap$Entry", "right", right);
        setField(left1, "java.util.TreeMap$Entry", "left", left2);
        setField(left, "java.util.TreeMap$Entry", "left", left1);
        setField(root, "java.util.TreeMap$Entry", "left", left);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        frequency.getCount(540434154307715074L);
    }
    ///endregion
    
    ///region Errors report for getCount
    
    public void testGetCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCount(char)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(char)}
 * @utbot.returnsFrom {@code return getCount(Character.valueOf(v));}
 *  */
    @Test
    public void testGetCount_ReturnGetCount1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(' ');
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(char)}
 * @utbot.returnsFrom {@code return getCount(Character.valueOf(v));}
 *  */
    @Test
    public void testGetCount_ReturnGetCount_11() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(' ');
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region Errors report for getCount
    
    public void testGetCount_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getCount(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (v instanceof Integer): False}
    /// invoke:
    ///     {@link java.util.TreeMap#get(java.lang.Object)} once
    /// return from: {@code return result;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 *  */
    @Test
    public void testGetCount() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        byte[] byteArray = {};
        
        long actual = frequency.getCount(byteArray);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.executesCondition {@code (count != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCount_CountEqualsNull() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(((Object) null));
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCount_CatchGetCount() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        short[] value = {};
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        byte[] byteArray = {};
        
        long actual = frequency.getCount(byteArray);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.executesCondition {@code (count != null): True}
 * @utbot.invokes {@link java.lang.Long#longValue()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCount_CountNotEqualsNull() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Long value = 0L;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        byte[] byteArray = {};
        
        long actual = frequency.getCount(byteArray);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getCount(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.executesCondition {@code (v instanceof Integer): True}
 * @utbot.invokes {@link java.lang.Integer#longValue()}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCount(long)}
 * @utbot.returnsFrom {@code return getCount(((Integer) v).longValue());}
 *  */
    @Test
    public void testGetCount_VInstanceOfInteger() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Integer integer = 0;
        
        long actual = frequency.getCount(((Object) integer));
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCount(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.invokes {@link java.util.TreeMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Long count = (Long) freqTable.get(v);
 *  */
    @Test
    public void testGetCount_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayTagOrder comparator = ((ByteArrayTagOrder) createInstance("sun.security.util.ByteArrayTagOrder"));
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {(byte) 0};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCount] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/sun.security.util.ByteArrayTagOrder.compare(ByteArrayTagOrder.java:58)
            java.base/sun.security.util.ByteArrayTagOrder.compare(ByteArrayTagOrder.java:38)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            org.apache.commons.math.stat.Frequency.getCount(Frequency.java:224) */
        frequency.getCount(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.invokes {@link java.util.TreeMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Long count = (Long) freqTable.get(v);
 *  */
    @Test
    public void testGetCount_ThrowNullPointerException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCount] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getCount(Frequency.java:224) */
        frequency.getCount(((Object) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getCount(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.Frequency}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
     */
    @Test
    public void testGetCountThrowsNPE() {
        Frequency frequency = new Frequency();
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCount] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:345)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            org.apache.commons.math.stat.Frequency.getCount(Frequency.java:224) */
        frequency.getCount(((Object) null));
    }
    ///endregion
    
    ///region Errors report for getCount
    
    public void testGetCount_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCount(int)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(int)}
 * @utbot.returnsFrom {@code return getCount(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCount_ReturnGetCount2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(-255);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(int)}
 * @utbot.returnsFrom {@code return getCount(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCount_ReturnGetCount_12() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(-255);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region Errors report for getCount
    
    public void testGetCount_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields786075319285300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields786075319285300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass786075319290700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields786075319285300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass786075319290700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields786075319722100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields786075319722100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass786075319723500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields786075319722100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass786075319723500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

