package org.apache.commons.csv;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.time.temporal.ChronoUnit;
import sun.invoke.util.Wrapper;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_csv_CSVRecordTest {
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.get
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(java.lang.Enum)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.Enum)}
 * @utbot.invokes {@link java.lang.Enum#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return get(e.toString());
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.get] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.get(CSVRecord.java:67) */
        cSVRecord.get(((Enum) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(java.lang.Enum)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.Enum)}
 * @utbot.invokes {@link java.lang.Enum#toString()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return get(e.toString());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGet_ThrowIllegalArgumentException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        
        cSVRecord.get(chronoUnit);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(java.lang.Enum)
    
    @Test(expected = IllegalStateException.class)
    public void testGet1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        Wrapper wrapper = Wrapper.BOOLEAN;
        
        cSVRecord.get(wrapper);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.executesCondition {@code (mapping == null): False}
 * @utbot.executesCondition {@code (index == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.returnsFrom {@code return values[index.intValue()];}
 *  */
    @Test
    public void testGet_IndexNotEqualsNull() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 0;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        String actual = cSVRecord.get(((String) null));
        
        assertNull(actual);
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        
        assertNull(finalCSVRecordValues0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.executesCondition {@code (mapping == null): False}
 * @utbot.executesCondition {@code (index == null): True}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.invokes {@link java.lang.String#format(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: index == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGet_ThrowIllegalArgumentException1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        String string = "";
        
        cSVRecord.get(string);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.executesCondition {@code (mapping == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: mapping == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGet_ThrowIllegalStateException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        cSVRecord.get(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.executesCondition {@code (mapping == null): False}
 * @utbot.executesCondition {@code (index == null): False}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return values[index.intValue()];
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGet_ThrowIllegalArgumentException_1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 1073741824;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        cSVRecord.get(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.executesCondition {@code (mapping == null): False}
 * @utbot.executesCondition {@code (index == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return values[index.intValue()];
 *  */
    @Test
    public void testGet_ThrowNullPointerException1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 0;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.get] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.get(CSVRecord.java:105) */
        cSVRecord.get(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(int)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(int)}
 * @utbot.returnsFrom {@code return values[i];}
 *  */
    @Test
    public void testGet_ReturnIOfValues() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        java.lang.String[] values = {null, null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        String actual = cSVRecord.get(1);
        
        assertNull(actual);
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        java.lang.String[] cSVRecordValues1 = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues1 = ((String) get(cSVRecordValues1, 1));
        
        assertNull(finalCSVRecordValues0);
        
        assertNull(finalCSVRecordValues1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(int)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return values[i];
 *  */
    @Test
    public void testGet_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.get] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.csv.CSVRecord.get(CSVRecord.java:78) */
        cSVRecord.get(-256);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return values[i];
 *  */
    @Test
    public void testGet_ThrowNullPointerException2() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.get] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.get(CSVRecord.java:78) */
        cSVRecord.get(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#toString()}
 * @utbot.invokes {@link java.util.Arrays#toString(java.lang.Object[])}
 * @utbot.returnsFrom {@code return Arrays.toString(values);}
 *  */
    @Test
    public void testToString_ArraysToString() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        String actual = cSVRecord.toString();
        
        String expected = "[null]";
        
        assertEquals(expected, actual);
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        
        assertNull(finalCSVRecordValues0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.values
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method values()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#values()}
 * @utbot.returnsFrom {@code return values;}
 *  */
    @Test
    public void testValues_ReturnValues() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        java.lang.String[] actual = cSVRecord.values();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#size()}
 * @utbot.returnsFrom {@code return values.length;}
 *  */
    @Test
    public void testSize_ReturnValuesLength() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        int actual = cSVRecord.size();
        
        assertEquals(1, actual);
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        
        assertNull(finalCSVRecordValues0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return values.length;
 *  */
    @Test
    public void testSize_ThrowNullPointerException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.size] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.size(CSVRecord.java:193) */
        cSVRecord.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#iterator()}
 * @utbot.invokes org.apache.commons.csv.CSVRecord#toList()
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return toList().iterator();}
 *  */
    @Test
    public void testIterator_ListIterator() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        java.lang.String[] values = {};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        Object actual = cSVRecord.iterator();
        
        Object expected = createInstance("java.util.Arrays$ArrayItr");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.toList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toList()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#toList()}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.returnsFrom {@code return Arrays.asList(values);}
 *  */
    @Test
    public void testToList_ArraysAsList() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        Class cSVRecordClazz = Class.forName("org.apache.commons.csv.CSVRecord");
        Method toListMethod = cSVRecordClazz.getDeclaredMethod("toList");
        toListMethod.setAccessible(true);
        java.lang.Object[] toListMethodArguments = new java.lang.Object[0];
        List actual = ((List) toListMethod.invoke(cSVRecord, toListMethodArguments));
        
        List expected = new ArrayList();
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        
        assertNull(finalCSVRecordValues0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.toMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toMap()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#toMap()}
 * @utbot.returnsFrom {@code return putIn(new HashMap<String, String>(values.length));}
 *  */
    @Test
    public void testToMap_ReturnPutIn_1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        HashMap actual = ((HashMap) cSVRecord.toMap());
        
        HashMap expected = new HashMap();
        
        assertTrue(deepEquals(expected, actual));
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        
        assertNull(finalCSVRecordValues0);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#toMap()}
 * @utbot.returnsFrom {@code return putIn(new HashMap<String, String>(values.length));}
 *  */
    @Test
    public void testToMap_ReturnPutIn() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        String string = "";
        Integer integer = 0;
        mapping.put(string, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        HashMap actual = ((HashMap) cSVRecord.toMap());
        
        HashMap expected = new HashMap();
        expected.put(string, null);
        
        assertTrue(deepEquals(expected, actual));
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        
        assertNull(finalCSVRecordValues0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toMap()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#toMap()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVRecord#putIn(java.util.Map)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return putIn(new HashMap<String, String>(values.length));
 *  */
    @Test
    public void testToMap_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        String string = "";
        Integer integer = 1073741824;
        mapping.put(string, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.toMap] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.csv.CSVRecord.putIn(CSVRecord.java:182)
            org.apache.commons.csv.CSVRecord.toMap(CSVRecord.java:212) */
        cSVRecord.toMap();
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#toMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return putIn(new HashMap<String, String>(values.length));
 *  */
    @Test
    public void testToMap_ThrowNullPointerException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.toMap] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.toMap(CSVRecord.java:212) */
        cSVRecord.toMap();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.isSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSet(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isSet(java.lang.String)}
 * @utbot.returnsFrom {@code return isMapped(name) && mapping.get(name).intValue() < values.length;}
 *  */
    @Test
    public void testIsSet_IsMappedAndMappingGetNameIntValueGreaterOrEqualValuesLength() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        String string = "";
        
        boolean actual = cSVRecord.isSet(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isSet(java.lang.String)}
 * @utbot.returnsFrom {@code return isMapped(name) && mapping.get(name).intValue() < values.length;}
 *  */
    @Test
    public void testIsSet_IsMappedAndMappingGetNameIntValueGreaterOrEqualValuesLength_1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        boolean actual = cSVRecord.isSet(null);
        
        assertFalse(actual);
        
        Map finalCSVRecordMapping = ((Map) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping"));
        
        assertNull(finalCSVRecordMapping);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isSet(java.lang.String)}
 * @utbot.returnsFrom {@code return isMapped(name) && mapping.get(name).intValue() < values.length;}
 *  */
    @Test
    public void testIsSet_IsMappedAndMappingGetNameIntValueLessThanValuesLength() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 0;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        boolean actual = cSVRecord.isSet(null);
        
        assertTrue(actual);
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        
        assertNull(finalCSVRecordValues0);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isSet(java.lang.String)}
 * @utbot.returnsFrom {@code return isMapped(name) && mapping.get(name).intValue() < values.length;}
 *  */
    @Test
    public void testIsSet_IsMappedAndMappingGetNameIntValueGreaterOrEqualValuesLength_2() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 0;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        boolean actual = cSVRecord.isSet(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSet(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isSet(java.lang.String)}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isMapped(name) && mapping.get(name).intValue() < values.length;
 *  */
    @Test
    public void testIsSet_ThrowNullPointerException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        mapping.put(null, null);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.isSet] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.isSet(CSVRecord.java:161) */
        cSVRecord.isSet(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isSet(java.lang.String)}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isMapped(name) && mapping.get(name).intValue() < values.length;
 *  */
    @Test
    public void testIsSet_ThrowNullPointerException_1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 0;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.isSet] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.isSet(CSVRecord.java:161) */
        cSVRecord.isSet(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.getComment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getComment()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#getComment()}
 * @utbot.returnsFrom {@code return comment;}
 *  */
    @Test
    public void testGetComment_ReturnComment() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        String actual = cSVRecord.getComment();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.isConsistent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isConsistent()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isConsistent()}
 * @utbot.returnsFrom {@code return mapping == null ? true : mapping.size() == values.length;}
 *  */
    @Test
    public void testIsConsistent_MappingEqualsNull_1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        boolean actual = cSVRecord.isConsistent();
        
        assertTrue(actual);
        
        Map finalCSVRecordMapping = ((Map) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping"));
        
        assertNull(finalCSVRecordMapping);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isConsistent()}
 * @utbot.executesCondition {@code (mapping == null): True}
 * @utbot.returnsFrom {@code return mapping == null ? true : mapping.size() == values.length;}
 *  */
    @Test
    public void testIsConsistent_MappingEqualsNull() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        boolean actual = cSVRecord.isConsistent();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isConsistent()}
 * @utbot.executesCondition {@code (mapping == null): False}
 * @utbot.returnsFrom {@code return mapping == null ? true : mapping.size() == values.length;}
 *  */
    @Test
    public void testIsConsistent_MappingNotEqualsNull() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        boolean actual = cSVRecord.isConsistent();
        
        assertFalse(actual);
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        
        assertNull(finalCSVRecordValues0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isConsistent()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isConsistent()}
 * @utbot.invokes {@link java.util.Map#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mapping == null
 *  */
    @Test
    public void testIsConsistent_ThrowNullPointerException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.isConsistent] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.isConsistent(CSVRecord.java:139) */
        cSVRecord.isConsistent();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.isMapped
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isMapped(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isMapped(java.lang.String)}
 * @utbot.executesCondition {@code (mapping != null): True}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return mapping != null ? mapping.containsKey(name) : false;}
 *  */
    @Test
    public void testIsMapped_MappingNotEqualsNull() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        boolean actual = cSVRecord.isMapped(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#isMapped(java.lang.String)}
 * @utbot.executesCondition {@code (mapping != null): False}
 * @utbot.returnsFrom {@code return mapping != null ? mapping.containsKey(name) : false;}
 *  */
    @Test
    public void testIsMapped_MappingEqualsNull() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        boolean actual = cSVRecord.isMapped(null);
        
        assertFalse(actual);
        
        Map finalCSVRecordMapping = ((Map) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping"));
        
        assertNull(finalCSVRecordMapping);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.getRecordNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRecordNumber()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#getRecordNumber()}
 * @utbot.returnsFrom {@code return recordNumber;}
 *  */
    @Test
    public void testGetRecordNumber_ReturnRecordNumber() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "recordNumber", 1L);
        
        long actual = cSVRecord.getRecordNumber();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.putIn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putIn(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#putIn(java.util.Map)}
 * @utbot.returnsFrom {@code return map;}
 *  */
    @Test
    public void testPutIn_ReturnMap() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        Map actual = cSVRecord.putIn(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#putIn(java.util.Map)}
 * @utbot.iterates iterate the loop {@code for(final Entry<String, Integer> entry: mapping.entrySet())} once
 * @utbot.returnsFrom {@code return map;}
 *  */
    @Test
    public void testPutIn_MapPut() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        String string = "";
        Integer integer = 0;
        mapping.put(string, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        LinkedHashMap actual = ((LinkedHashMap) cSVRecord.putIn(mapping));
        
        assertTrue(deepEquals(mapping, actual));
        
        java.lang.String[] cSVRecordValues = ((java.lang.String[]) getFieldValue(cSVRecord, "org.apache.commons.csv.CSVRecord", "values"));
        String finalCSVRecordValues0 = ((String) get(cSVRecordValues, 0));
        
        assertNull(finalCSVRecordValues0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putIn(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#putIn(java.util.Map)}
 * @utbot.iterates iterate the loop {@code for(final Entry<String, Integer> entry: mapping.entrySet())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: map.put(entry.getKey(), values[col]);
 *  */
    @Test
    public void testPutIn_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        String string = "";
        Integer integer = Integer.MIN_VALUE;
        mapping.put(string, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.putIn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.csv.CSVRecord.putIn(CSVRecord.java:182) */
        cSVRecord.putIn(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#putIn(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Entry<String, Integer> entry: mapping.entrySet())
 *  */
    @Test
    public void testPutIn_ThrowNullPointerException_1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.putIn] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.putIn(CSVRecord.java:180) */
        cSVRecord.putIn(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#putIn(java.util.Map)}
 * @utbot.iterates iterate the loop {@code for(final Entry<String, Integer> entry: mapping.entrySet())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int col = entry.getValue().intValue();
 *  */
    @Test
    public void testPutIn_ThrowNullPointerException_2() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        String string = "";
        mapping.put(string, null);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.putIn] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.putIn(CSVRecord.java:181) */
        cSVRecord.putIn(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#putIn(java.util.Map)}
 * @utbot.iterates iterate the loop {@code for(final Entry<String, Integer> entry: mapping.entrySet())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: map.put(entry.getKey(), values[col]);
 *  */
    @Test
    public void testPutIn_ThrowNullPointerException_3() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        String string = "";
        Integer integer = 0;
        mapping.put(string, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.putIn] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.putIn(CSVRecord.java:182) */
        cSVRecord.putIn(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#putIn(java.util.Map)}
 * @utbot.iterates iterate the loop {@code for(final Entry<String, Integer> entry: mapping.entrySet())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: map.put(entry.getKey(), values[col]);
 *  */
    @Test
    public void testPutIn_ThrowNullPointerException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        String string = "";
        Integer integer = 0;
        mapping.put(string, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.putIn] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.putIn(CSVRecord.java:182) */
        cSVRecord.putIn(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method putIn(java.util.Map)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.CSVRecord}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#putIn(java.util.Map)}
     */
    @Test
    public void testPutInThrowsAIOOBE() {
        java.lang.String[] stringArray = {"#$\\\"'", "XZ", "10"};
        HashMap hashMap = new HashMap();
        hashMap.put("-3", Integer.MIN_VALUE);
        hashMap.put("XZ", 1);
        CSVRecord cSVRecord = new CSVRecord(stringArray, hashMap, "XZ", java.lang.Long.MAX_VALUE);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("#$\\\"'", "10");
        hashMap1.put("\n\t\r", "-3");
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.putIn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 3]
            org.apache.commons.csv.CSVRecord.putIn(CSVRecord.java:182) */
        cSVRecord.putIn(hashMap1);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields964682198244200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields964682198244200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass964682198249800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964682198244200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964682198249800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields964682198758100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields964682198758100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass964682198759800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964682198758100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964682198759800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

