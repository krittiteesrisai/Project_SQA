package org.apache.commons.csv;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class CSVRecordTest {

    @Test
    public void testConstructorWithNullValues() {
        CSVRecord record = new CSVRecord(null, null, "comment", 1L);
        assertNotNull(record.values());
        assertEquals(0, record.size());
        assertEquals("comment", record.getComment());
        assertEquals(1L, record.getRecordNumber());
    }

    @Test
    public void testGetByIndex() {
        String[] values = {"A", "B", "C"};
        CSVRecord record = new CSVRecord(values, null, null, 10L);
        assertEquals("A", record.get(0));
        assertEquals("B", record.get(1));
        assertEquals("C", record.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndexOutOfBounds() {
        String[] values = {"A"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(5);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNameWithoutMapping() {
        String[] values = {"A"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get("Column1");
    }

    @Test
    public void testGetNameWithMappingFound() {
        String[] values = {"ValA", "ValB"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);
        mapping.put("Col2", 1);

        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertEquals("ValA", record.get("Col1"));
        assertEquals("ValB", record.get("Col2"));
    }

    @Test
    public void testGetNameWithMappingNotFound() {
        String[] values = {"ValA"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);

        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertNull(record.get("NonExistent"));
    }

    @Test
    public void testIsConsistentWithoutMapping() {
        String[] values = {"A", "B"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentWithMatchingSize() {
        String[] values = {"A", "B"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);
        mapping.put("Col2", 1);

        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistentWithMismatchedSize() {
        String[] values = {"A"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);
        mapping.put("Col2", 1);

        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isConsistent());
    }

    @Test
    public void testIsMappedWithoutMapping() {
        String[] values = {"A"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.isMapped("Col1"));
    }

    @Test
    public void testIsMappedWithMapping() {
        String[] values = {"A"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);

        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isMapped("Col1"));
        assertFalse(record.isMapped("Col2"));
    }

    @Test
    public void testIsSetWithoutMapping() {
        String[] values = {"A"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.isSet("Col1"));
    }

    @Test
    public void testIsSetWithValidIndex() {
        String[] values = {"A"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);

        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isSet("Col1"));
    }

    @Test
    public void testIsSetWithOutOfBoundsIndex() {
        // Edge Case crucial for Csv-2b (mapping index out of values bounds)
        String[] values = {"A"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col2", 5);

        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isSet("Col2"));
    }

    @Test
    public void testIterator() {
        String[] values = {"A", "B"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        Iterator<String> iterator = record.iterator();
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertEquals("B", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testToString() {
        String[] values = {"A", "B"};
        CSVRecord record = new CSVRecord(values, null, "comment", 1L);
        assertEquals(Arrays.toString(values), record.toString());
    }
}