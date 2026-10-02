package org.apache.commons.csv;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_csv_CSVRecordTest {
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
            org.apache.commons.csv.CSVRecord.get(CSVRecord.java:64) */
        cSVRecord.get(-256);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return values[i];
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.get] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.get(CSVRecord.java:64) */
        cSVRecord.get(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.executesCondition {@code (index != null): False}
 * @utbot.returnsFrom {@code return index != null ? values[index.intValue()] : null;}
 *  */
    @Test
    public void testGet_IndexEqualsNull() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        String string = "";
        
        String actual = cSVRecord.get(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.executesCondition {@code (index != null): True}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.returnsFrom {@code return index != null ? values[index.intValue()] : null;}
 *  */
    @Test
    public void testGet_IndexNotEqualsNull() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 0;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
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
 * @utbot.executesCondition {@code (mapping == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: mapping == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGet_ThrowIllegalStateException() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        
        cSVRecord.get(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: values[index.intValue()]
 *  */
    @Test
    public void testGet_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 1073741824;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.get] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.csv.CSVRecord.get(CSVRecord.java:85) */
        cSVRecord.get(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: values[index.intValue()]
 *  */
    @Test
    public void testGet_ThrowNullPointerException1() throws Exception  {
        CSVRecord cSVRecord = ((CSVRecord) createInstance("org.apache.commons.csv.CSVRecord"));
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 0;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
        /* This test fails because method [org.apache.commons.csv.CSVRecord.get] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVRecord.get(CSVRecord.java:85) */
        cSVRecord.get(((String) null));
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
            org.apache.commons.csv.CSVRecord.size(CSVRecord.java:159) */
        cSVRecord.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVRecord.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link CSVRecord}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVRecord#iterator()}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return Arrays.asList(values).iterator();}
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
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 0;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
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
        java.lang.String[] values = {};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        LinkedHashMap mapping = new LinkedHashMap();
        Integer integer = 0;
        mapping.put(null, integer);
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
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
            org.apache.commons.csv.CSVRecord.isSet(CSVRecord.java:118) */
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
            org.apache.commons.csv.CSVRecord.isSet(CSVRecord.java:118) */
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
        java.lang.String[] values = {};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
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
        java.lang.String[] values = {null};
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "values", values);
        LinkedHashMap mapping = new LinkedHashMap();
        setField(cSVRecord, "org.apache.commons.csv.CSVRecord", "mapping", mapping);
        
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
            org.apache.commons.csv.CSVRecord.isConsistent(CSVRecord.java:96) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields964018497625200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields964018497625200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass964018497632100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964018497625200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964018497632100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields964018498150000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields964018498150000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass964018498153800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964018498150000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964018498153800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

