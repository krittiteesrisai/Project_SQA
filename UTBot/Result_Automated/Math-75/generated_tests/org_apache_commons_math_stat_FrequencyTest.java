package org.apache.commons.math.stat;

import org.junit.Test;
import java.util.TreeMap;
import java.util.Comparator;
import sun.security.util.ByteArrayLexOrder;
import java.util.ArrayList;
import java.util.HashSet;
import sun.net.www.protocol.http.HttpURLConnection.TunnelState;
import sun.net.www.protocol.http.HttpURLConnection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_stat_FrequencyTest {
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.executesCondition {@code (!(obj instanceof Frequency)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfFrequency() {
        Frequency frequency = new Frequency();
        byte[] byteArray = {};
        
        boolean actual = frequency.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() {
        Frequency frequency = new Frequency();
        
        boolean actual = frequency.equals(frequency);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj == null): True}
 *  */
    @Test
    public void testEquals_ObjEqualsNull() {
        Frequency frequency = new Frequency();
        
        boolean actual = frequency.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.executesCondition {@code (!(obj instanceof Frequency)): False}
 * @utbot.executesCondition {@code (freqTable == null): True}
 * @utbot.executesCondition {@code (other.freqTable != null): True}
 *  */
    @Test
    public void testEquals_OtherFreqTableNotEqualsNull() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        Frequency frequency1 = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency1, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        boolean actual = frequency.equals(frequency1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.executesCondition {@code (!(obj instanceof Frequency)): False}
 * @utbot.executesCondition {@code (freqTable == null): True}
 * @utbot.executesCondition {@code (other.freqTable != null): False}
 *  */
    @Test
    public void testEquals_OtherFreqTableEqualsNull() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        Frequency frequency1 = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        boolean actual = frequency.equals(frequency1);
        
        assertTrue(actual);
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
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#hashCode()}
 * @utbot.executesCondition {@code ((freqTable == null)): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_FreqTableEqualsNull() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        int actual = frequency.hashCode();
        
        assertEquals(31, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.Frequency}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#hashCode()}
     */
    @Test
    public void testHashCodeReturns31() {
        Frequency frequency = new Frequency();
        
        int actual = frequency.hashCode();
        
        assertEquals(31, actual);
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
            org.apache.commons.math.stat.Frequency.clear(Frequency.java:191) */
        frequency.clear();
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
    public void testGetCount_ReturnGetCount() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.util.Comparators$NullComparator");
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
    public void testGetCount_ReturnGetCount_1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.ProcessEnvironment$NameComparator");
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCount(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Comparable)}
 * @utbot.executesCondition {@code (count != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCount_CountEqualsNull() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer$1"));
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(((Comparable) null));
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Comparable)}
 *  */
    @Test
    public void testGetCount() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Character character = '\u0000';
        
        long actual = frequency.getCount(((Comparable) character));
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Comparable)}
 * @utbot.executesCondition {@code (count != null): True}
 * @utbot.invokes {@link java.lang.Long#longValue()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetCount_CountNotEqualsNull() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Character key = '\u0000';
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Long value = 0L;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Character character = '\u0000';
        
        long actual = frequency.getCount(((Comparable) character));
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCount(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.TreeMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Long count = freqTable.get(v);
 *  */
    @Test
    public void testGetCount_ThrowNullPointerException_1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCount] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getCount(Frequency.java:249) */
        frequency.getCount(((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.TreeMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Long count = freqTable.get(v);
 *  */
    @Test
    public void testGetCount_ThrowNullPointerException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCount] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:345)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            org.apache.commons.math.stat.Frequency.getCount(Frequency.java:249) */
        frequency.getCount(((Comparable) null));
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getCount(java.lang.Comparable)
    
    @Test(timeout = 1000L)
    public void testGetCount1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Character key = '\u0000';
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Object right = createInstance("java.util.TreeMap$Entry");
        Character key1 = '\uF800';
        setField(right, "java.util.TreeMap$Entry", "key", key1);
        Object left = createInstance("java.util.TreeMap$Entry");
        setField(left, "java.util.TreeMap$Entry", "key", key);
        setField(left, "java.util.TreeMap$Entry", "right", left);
        setField(right, "java.util.TreeMap$Entry", "left", left);
        setField(root, "java.util.TreeMap$Entry", "right", right);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Character character = '\u0003';
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        frequency.getCount(((Comparable) character));
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCount(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.returnsFrom {@code return getCount((Comparable<?>) v);}
 *  */
    @Test
    public void testGetCount_ReturnGetCount1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.util.Arrays$NaturalOrder");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(((Object) null));
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.returnsFrom {@code return getCount((Comparable<?>) v);}
 *  */
    @Test
    public void testGetCount_ReturnGetCount_11() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        int[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(((Object) null));
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.returnsFrom {@code return getCount((Comparable<?>) v);}
 *  */
    @Test
    public void testGetCount_ReturnGetCount_2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(freqTable, "java.util.TreeMap", "root", root);
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getCount((Comparable<?>) v);
 *  */
    @Test
    public void testGetCount_ThrowClassCastException() {
        Frequency frequency = new Frequency();
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCount] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Comparable ([B and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getCount(Frequency.java:233) */
        frequency.getCount(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCount(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getCount((Comparable<?>) v);
 *  */
    @Test
    public void testGetCount_ThrowNullPointerException1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCount] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:345)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            org.apache.commons.math.stat.Frequency.getCount(Frequency.java:249)
            org.apache.commons.math.stat.Frequency.getCount(Frequency.java:233) */
        frequency.getCount(((Object) null));
    }
    ///endregion
    
    ///region Errors report for getCount
    
    public void testGetCount_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
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
    public void testGetCount_ReturnGetCount2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.util.Comparators$NullComparator");
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
    public void testGetCount_ReturnGetCount_12() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(freqTable, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(freqTable, "java.util.TreeMap", "root", root);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCount(' ');
        
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
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCount(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCount(long)}
 * @utbot.returnsFrom {@code return getCount(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCount_ReturnGetCount3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.util.Comparators$NullComparator");
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
    public void testGetCount_ReturnGetCount_13() throws Exception  {
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
    public void testGetCount_ReturnGetCount_21() throws Exception  {
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
    
    ///region Errors report for getCount
    
    public void testGetCount_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region Errors report for addValue
    
    public void testAddValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Failed requirement.
        
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat
        
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
    
    ///region Errors report for addValue
    
    public void testAddValue_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addValue(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.TreeMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Long count = freqTable.get(obj);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.addValue(Frequency.java:138) */
        frequency.addValue(((Comparable) null));
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 * @utbot.invokes {@link java.util.TreeMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Long count = freqTable.get(obj);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.addValue] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:345)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            org.apache.commons.math.stat.Frequency.addValue(Frequency.java:138) */
        frequency.addValue(((Comparable) null));
    }
    ///endregion
    
    ///region Errors report for addValue
    
    public void testAddValue_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Failed requirement.
        
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region Errors report for addValue
    
    public void testAddValue_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Failed requirement.
        
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region Errors report for addValue
    
    public void testAddValue_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.addValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addValue(java.lang.Integer)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Integer)}
 * @utbot.invokes {@link java.lang.Integer#longValue()}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#addValue(java.lang.Comparable)}
 *  */
    @Test
    public void testAddValue_FrequencyAddValue2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(freqTable, "java.util.TreeMap", "size", -255);
        setField(freqTable, "java.util.TreeMap", "modCount", -255);
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
    public void testAddValue_ThrowNullPointerException1() {
        Frequency frequency = new Frequency();
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.addValue(Frequency.java:168) */
        frequency.addValue(((Integer) null));
    }
    ///endregion
    
    ///region Errors report for addValue
    
    public void testAddValue_errors5()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.valuesIterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method valuesIterator()
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#valuesIterator()}
 * @utbot.invokes {@link java.util.TreeMap#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return freqTable.keySet().iterator();
 *  */
    @Test
    public void testValuesIterator_ThrowClassCastException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.concurrent.ConcurrentSkipListMap$SubMap");
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.ClassCastException: class java.util.concurrent.ConcurrentSkipListMap$SubMap cannot be cast to class java.util.TreeMap$NavigableSubMap (java.util.concurrent.ConcurrentSkipListMap$SubMap and java.util.TreeMap$NavigableSubMap are in module java.base of loader 'bootstrap')]
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:204) */
        frequency.valuesIterator();
    }
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#valuesIterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return freqTable.keySet().iterator();
 *  */
    @Test
    public void testValuesIterator_ThrowNullPointerException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:204) */
        frequency.valuesIterator();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method valuesIterator()
    
    @Test
    public void testValuesIterator1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        Object actual = frequency.valuesIterator();
        
        Object expected = createInstance("java.util.TreeMap$KeyIterator");
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method valuesIterator()
    
    @Test
    public void testValuesIterator2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m1 = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(m1, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        Object key = createInstance("java.lang.Object");
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(m1, "java.util.TreeMap", "root", root);
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", m1);
        setField(m, "java.util.TreeMap$NavigableSubMap", "loInclusive", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class [B (java.lang.Object and [B are in module java.base of loader 'bootstrap')]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.getCeilingEntry(TreeMap.java:395)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1706)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:204) */
        frequency.valuesIterator();
    }
    
    @Test
    public void testValuesIterator3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m1 = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(m1, "java.util.TreeMap", "root", root);
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", m1);
        Object lo = createInstance("java.lang.Object");
        setField(m, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(m, "java.util.TreeMap$NavigableSubMap", "loInclusive", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap.getCeilingEntry(TreeMap.java:395)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1706)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:204) */
        frequency.valuesIterator();
    }
    
    @Test
    public void testValuesIterator4() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m1 = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(m1, "java.util.TreeMap", "root", root);
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", m1);
        Object hi = createInstance("java.lang.Object");
        setField(m, "java.util.TreeMap$NavigableSubMap", "hi", hi);
        setField(m, "java.util.TreeMap$NavigableSubMap", "fromStart", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap$NavigableSubMap.tooHigh(TreeMap.java:1677)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1708)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:204) */
        frequency.valuesIterator();
    }
    
    @Test
    public void testValuesIterator5() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m1 = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(m1, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(m1, "java.util.TreeMap", "root", root);
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", m1);
        setField(m, "java.util.TreeMap$NavigableSubMap", "lo", key);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.NullPointerException]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:56)
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.getCeilingEntry(TreeMap.java:395)
            java.base/java.util.TreeMap$NavigableSubMap.absHighFence(TreeMap.java:1751)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:204) */
        frequency.valuesIterator();
    }
    
    @Test
    public void testValuesIterator6() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(freqTable, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", freqTable);
        Integer lo = 0;
        setField(m, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(m, "java.util.TreeMap$NavigableSubMap", "loInclusive", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap.getCeilingEntry(TreeMap.java:395)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1706)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:204) */
        frequency.valuesIterator();
    }
    
    @Test
    public void testValuesIterator7() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m1 = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(m1, "java.util.TreeMap", "root", root);
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", m1);
        Integer lo = 0;
        setField(m, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.valuesIterator] produces [java.lang.NullPointerException]
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap.getCeilingEntry(TreeMap.java:395)
            java.base/java.util.TreeMap$NavigableSubMap.absHighFence(TreeMap.java:1751)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            org.apache.commons.math.stat.Frequency.valuesIterator(Frequency.java:204) */
        frequency.valuesIterator();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method valuesIterator()
    
    @Test(timeout = 1000L)
    public void testValuesIterator8() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(root, "java.util.TreeMap$Entry", "left", root);
        setField(m, "java.util.TreeMap", "root", root);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(freqTable, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        frequency.valuesIterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getSumFreq
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSumFreq()
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getSumFreq()}
 * @utbot.invokes {@link java.util.TreeMap#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<Long> iterator = freqTable.values().iterator();
 *  */
    @Test
    public void testGetSumFreq_ThrowNullPointerException() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getSumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:216) */
        frequency.getSumFreq();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSumFreq()
    
    @Test
    public void testGetSumFreq1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getSumFreq();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSumFreq()
    
    @Test
    public void testGetSumFreq2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getSumFreq] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218) */
        frequency.getSumFreq();
    }
    
    @Test
    public void testGetSumFreq3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        Object object = createInstance("java.lang.Object");
        values.add(object);
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getSumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218) */
        frequency.getSumFreq();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getPct
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPct(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getPct(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getCumPct((Comparable<?>) v);
 *  */
    @Test
    public void testGetPct_ThrowClassCastException() {
        Frequency frequency = new Frequency();
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Comparable ([B and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:303) */
        frequency.getPct(byteArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPct(java.lang.Object)
    
    @Test
    public void testGetPct1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        HttpURLConnection.TunnelState tunnelState = HttpURLConnection.TunnelState.NONE;
        
        double actual = frequency.getPct(tunnelState);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPct(java.lang.Object)
    
    @Test
    public void testGetPct2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:303) */
        frequency.getPct(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getPct
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPct(char)
    
    @Test
    public void testGetPct3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getPct('\u0000');
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPct(char)
    
    @Test
    public void testGetPct4() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:316)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:353) */
        frequency.getPct('\u0000');
    }
    
    @Test
    public void testGetPct5() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:316)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:353) */
        frequency.getPct('\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getPct
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPct(int)
    
    @Test
    public void testGetPct6() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getPct(0);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPct(int)
    
    @Test
    public void testGetPct7() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:316)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:331) */
        frequency.getPct(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getPct
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPct(java.lang.Comparable)
    
    @Test
    public void testGetPct8() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getPct(((Comparable) null));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPct(java.lang.Comparable)
    
    @Test
    public void testGetPct9() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:316) */
        frequency.getPct(((Comparable) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPct(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getPct(long)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getPct(java.lang.Comparable)}
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
    public void testGetPct10() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:316)
            org.apache.commons.math.stat.Frequency.getPct(Frequency.java:342) */
        frequency.getPct(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumFreq
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCumFreq(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumFreq(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getCumFreq((Comparable<?>) v);
 *  */
    @Test
    public void testGetCumFreq_ThrowClassCastException() {
        Frequency frequency = new Frequency();
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Comparable ([B and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:369) */
        frequency.getCumFreq(byteArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCumFreq(java.lang.Object)
    
    @Test
    public void testGetCumFreq1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        HttpURLConnection.TunnelState tunnelState = HttpURLConnection.TunnelState.NONE;
        
        long actual = frequency.getCumFreq(tunnelState);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumFreq(java.lang.Object)
    
    @Test
    public void testGetCumFreq2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Class requestTypeClazz = Class.forName("sun.nio.fs.AbstractPoller$RequestType");
        Object requestType = getEnumConstantByName(requestTypeClazz, "REGISTER");
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:382)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:369) */
        frequency.getCumFreq(requestType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumFreq
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCumFreq(char)
    
    @Test
    public void testGetCumFreq3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCumFreq('\u0000');
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumFreq(char)
    
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
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:382)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:456) */
        frequency.getCumFreq('\u0000');
    }
    
    @Test
    public void testGetCumFreq5() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:382)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:456) */
        frequency.getCumFreq('\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumFreq
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCumFreq(java.lang.Comparable)
    
    @Test
    public void testGetCumFreq6() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCumFreq(((Comparable) null));
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumFreq(java.lang.Comparable)
    
    @Test
    public void testGetCumFreq7() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:382) */
        frequency.getCumFreq(((Comparable) null));
    }
    
    @Test
    public void testGetCumFreq8() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:382) */
        frequency.getCumFreq(((Comparable) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumFreq
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCumFreq(int)
    
    @Test
    public void testGetCumFreq9() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        long actual = frequency.getCumFreq(0);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumFreq(int)
    
    @Test
    public void testGetCumFreq10() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Character character = '\u0000';
        values.add(character);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class java.lang.Long (java.lang.Character and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:382)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:432) */
        frequency.getCumFreq(0);
    }
    
    @Test
    public void testGetCumFreq11() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        Object object = createInstance("java.lang.Object");
        values.add(object);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:382)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:432) */
        frequency.getCumFreq(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumFreq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumFreq(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumFreq(long)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumFreq(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return getCumFreq(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCumFreq_FrequencyGetCumFreq() throws Exception  {
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
    public void testGetCumFreq12() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:382)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:444) */
        frequency.getCumFreq(0L);
    }
    
    @Test
    public void testGetCumFreq13() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumFreq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:382)
            org.apache.commons.math.stat.Frequency.getCumFreq(Frequency.java:444) */
        frequency.getCumFreq(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumPct
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCumPct(char)
    
    @Test
    public void testGetCumPct1() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getCumPct('\u0000');
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumPct(char)
    
    @Test
    public void testGetCumPct2() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:534) */
        frequency.getCumPct('\u0000');
    }
    
    @Test
    public void testGetCumPct3() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:534) */
        frequency.getCumPct('\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumPct
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCumPct(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getCumPct((Comparable<?>) v);
 *  */
    @Test
    public void testGetCumPct_ThrowClassCastException() {
        Frequency frequency = new Frequency();
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Comparable ([B and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:475) */
        frequency.getCumPct(byteArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCumPct(java.lang.Object)
    
    @Test
    public void testGetCumPct4() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        HttpURLConnection.TunnelState tunnelState = HttpURLConnection.TunnelState.NONE;
        
        double actual = frequency.getCumPct(tunnelState);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumPct(java.lang.Object)
    
    @Test
    public void testGetCumPct5() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:475) */
        frequency.getCumPct(((Object) null));
    }
    
    @Test
    public void testGetCumPct6() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        Class requestTypeClazz = Class.forName("sun.nio.fs.AbstractPoller$RequestType");
        Object requestType = getEnumConstantByName(requestTypeClazz, "REGISTER");
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:475) */
        frequency.getCumPct(requestType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumPct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCumPct(long)
    
    /**
    @utbot.classUnderTest {@link Frequency}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.Frequency#getCumPct(long)}
 * @utbot.invokes {@link org.apache.commons.math.stat.Frequency#getCumPct(java.lang.Comparable)}
 * @utbot.returnsFrom {@code return getCumPct(Long.valueOf(v));}
 *  */
    @Test
    public void testGetCumPct_FrequencyGetCumPct() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getCumPct(-255L);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumPct(long)
    
    @Test
    public void testGetCumPct7() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:521) */
        frequency.getCumPct(0L);
    }
    
    @Test
    public void testGetCumPct8() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:521) */
        frequency.getCumPct(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumPct
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCumPct(int)
    
    @Test
    public void testGetCumPct9() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getCumPct(0);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumPct(int)
    
    @Test
    public void testGetCumPct10() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:508) */
        frequency.getCumPct(0);
    }
    
    @Test
    public void testGetCumPct11() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:508) */
        frequency.getCumPct(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.Frequency.getCumPct
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCumPct(java.lang.Comparable)
    
    @Test
    public void testGetCumPct12() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        double actual = frequency.getCumPct(((Comparable) null));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCumPct(java.lang.Comparable)
    
    @Test
    public void testGetCumPct13() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Character character = '\u0000';
        values.add(character);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class java.lang.Long (java.lang.Character and java.lang.Long are in module java.base of loader 'bootstrap')]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491) */
        frequency.getCumPct(((Comparable) null));
    }
    
    @Test
    public void testGetCumPct14() throws Exception  {
        Frequency frequency = ((Frequency) createInstance("org.apache.commons.math.stat.Frequency"));
        TreeMap freqTable = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        values.add(null);
        setField(freqTable, "java.util.AbstractMap", "values", values);
        setField(frequency, "org.apache.commons.math.stat.Frequency", "freqTable", freqTable);
        
        /* This test fails because method [org.apache.commons.math.stat.Frequency.getCumPct] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.Frequency.getSumFreq(Frequency.java:218)
            org.apache.commons.math.stat.Frequency.getCumPct(Frequency.java:491) */
        frequency.getCumPct(((Comparable) null));
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
        
                java.lang.reflect.Method methodForGetDeclaredFields708394193481300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields708394193481300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass708394193488200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields708394193481300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass708394193488200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

