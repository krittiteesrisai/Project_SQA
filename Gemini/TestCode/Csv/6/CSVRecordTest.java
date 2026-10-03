package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class CSVRecordTest {

    private enum TestEnum {
        HEADER1, HEADER2
    }

    @Test
    public void testConstructorWithNullValues() {
        CSVRecord record = new CSVRecord(null, null, "comment", 1L);
        assertNotNull(record.values());
        assertEquals(0, record.size());
        assertEquals("comment", record.getComment());
        assertEquals(1L, record.getRecordNumber());
    }

    @Test
    public void testConstructorWithNonNullValues() {
        String[] values = { "A", "B" };
        CSVRecord record = new CSVRecord(values, null, null, 2L);
        assertEquals(2, record.size());
        assertNull(record.getComment());
        assertEquals(2L, record.getRecordNumber());
    }

    @Test
    public void testGetByIndex() {
        String[] values = { "Val1", "Val2", "Val3" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("Val1", record.get(0));
        assertEquals("Val2", record.get(1));
        assertEquals("Val3", record.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndexOutOfBounds() {
        String[] values = { "Val1" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(5);
    }

    @Test
    public void testGetByEnum() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("HEADER1", 0);
        mapping.put("HEADER2", 1);
        
        String[] values = { "Data1", "Data2" };
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        
        assertEquals("Data1", record.get(TestEnum.HEADER1));
        assertEquals("Data2", record.get(TestEnum.HEADER2));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByNameWithoutMapping() {
        String[] values = { "Data1" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get("HEADER1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByNameNotFound() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("HEADER1", 0);
        
        String[] values = { "Data1" };
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        record.get("UNKNOWN_HEADER");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByNameArrayIndexOutOfBoundsFaultTrigger() {
        // Defects4J Csv-6 edge case: mapping points to index 1, but values array length is 1.
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("HEADER2", 1);
        
        String[] values = { "Data1" };
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        record.get("HEADER2");
    }

    @Test
    public void testGetByNameSuccess() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("HEADER1", 0);
        
        String[] values = { "Data1" };
        CSVRecord record = new CSVRecord(values, mapping, "Test Comment", 10L);
        assertEquals("Data1", record.get("HEADER1"));
        assertEquals("Test Comment", record.getComment());
        assertEquals(10L, record.getRecordNumber());
    }

    @Test
    public void testIsConsistent() {
        // mapping == null -> true
        CSVRecord record1 = new CSVRecord(new String[] { "A" }, null, null, 1L);
        assertTrue(record1.isConsistent());

        // mapping.size() == values.length -> true
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("H1", 0);
        CSVRecord record2 = new CSVRecord(new String[] { "A" }, mapping, null, 1L);
        assertTrue(record2.isConsistent());

        // mapping.size() != values.length -> false
        Map<String, Integer> mapping2 = new HashMap<String, Integer>();
        mapping2.put("H1", 0);
        mapping2.put("H2", 1);
        CSVRecord record3 = new CSVRecord(new String[] { "A" }, mapping2, null, 1L);
        assertFalse(record3.isConsistent());
    }

    @Test
    public void testIsMapped() {
        // mapping == null -> false
        CSVRecord record1 = new CSVRecord(new String[] { "A" }, null, null, 1L);
        assertFalse(record1.isMapped("H1"));

        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("H1", 0);
        CSVRecord record2 = new CSVRecord(new String[] { "A" }, mapping, null, 1L);
        assertTrue(record2.isMapped("H1"));
        assertFalse(record2.isMapped("H2"));
    }

    @Test
    public void testIsSet() {
        CSVRecord record1 = new CSVRecord(new String[] { "A" }, null, null, 1L);
        assertFalse(record1.isSet("H1"));

        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("H1", 0);
        mapping.put("H2", 1); // mapped but out of bounds for values length 1
        
        CSVRecord record2 = new CSVRecord(new String[] { "A" }, mapping, null, 1L);
        assertTrue(record2.isSet("H1"));
        assertFalse(record2.isSet("H2")); // mapped, index 1 >= values.length 1 -> false
        assertFalse(record2.isSet("NON_EXISTENT"));
    }

    @Test
    public void testIteratorAndToList() {
        String[] values = { "V1", "V2" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        Iterator<String> it = record.iterator();
        
        assertTrue(it.hasNext());
        assertEquals("V1", it.next());
        assertTrue(it.hasNext());
        assertEquals("V2", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testToMap() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("H1", 0);
        mapping.put("H2", 1);
        
        String[] values = { "Val1", "Val2" };
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        
        Map<String, String> map = record.toMap();
        assertEquals(2, map.size());
        assertEquals("Val1", map.get("H1"));
        assertEquals("Val2", map.get("H2"));
    }

    @Test
    public void testToString() {
        String[] values = { "A", "B" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("[A, B]", record.toString());
    }
}