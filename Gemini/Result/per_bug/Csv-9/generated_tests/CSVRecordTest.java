/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
        A, B
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
    public void testGetByIndex() {
        String[] values = { "val1", "val2", "val3" };
        CSVRecord record = new CSVRecord(values, null, null, 10L);
        assertEquals("val1", record.get(0));
        assertEquals("val2", record.get(1));
        assertEquals("val3", record.get(2));
        assertEquals(3, record.size());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndexOutOfBounds() {
        String[] values = { "val1" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(5); // Should throw ArrayIndexOutOfBoundsException
    }

    @Test
    public void testGetByEnum() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("A", 0);
        mapping.put("B", 1);

        String[] values = { "first", "second" };
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        assertEquals("first", record.get(TestEnum.A));
        assertEquals("second", record.get(TestEnum.B));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByNameNoMapping() {
        String[] values = { "val1" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get("Column1"); // Should throw IllegalStateException because mapping is null
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByNameNotFound() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);

        String[] values = { "val1" };
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        record.get("NonExistentColumn"); // Should throw IllegalArgumentException
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByNameIndexOutOfBounds() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col2", 5); // Index 5 is out of bounds for values length 1

        String[] values = { "val1" };
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        record.get("Col2"); // Should trigger catch(ArrayIndexOutOfBoundsException) and throw IllegalArgumentException
    }

    @Test
    public void testGetByNameSuccess() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);
        mapping.put("Col2", 1);

        String[] values = { "A", "B" };
        CSVRecord record = new CSVRecord(values, mapping, "Test Comment", 5L);

        assertEquals("A", record.get("Col1"));
        assertEquals("B", record.get("Col2"));
        assertEquals("Test Comment", record.getComment());
        assertEquals(5L, record.getRecordNumber());
    }

    @Test
    public void testIsConsistent() {
        // mapping == null -> true
        CSVRecord record1 = new CSVRecord(new String[]{"a"}, null, null, 1L);
        assertTrue(record1.isConsistent());

        // mapping size matches values length -> true
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);
        CSVRecord record2 = new CSVRecord(new String[]{"a"}, mapping, null, 1L);
        assertTrue(record2.isConsistent());

        // mapping size does not match values length -> false
        mapping.put("Col2", 1);
        CSVRecord record3 = new CSVRecord(new String[]{"a"}, mapping, null, 1L);
        assertFalse(record3.isConsistent());
    }

    @Test
    public void testIsMapped() {
        CSVRecord recordNoMap = new CSVRecord(new String[]{"a"}, null, null, 1L);
        assertFalse(recordNoMap.isMapped("Col1"));

        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);
        CSVRecord recordWithMap = new CSVRecord(new String[]{"a"}, mapping, null, 1L);
        assertTrue(recordWithMap.isMapped("Col1"));
        assertFalse(recordWithMap.isMapped("Col2"));
    }

    @Test
    public void testIsSet() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);
        mapping.put("Col2", 5); // Mapped, but index >= values.length

        CSVRecord record = new CSVRecord(new String[]{"a"}, mapping, null, 1L);

        assertTrue(record.isSet("Col1"));  // Mapped and index < values.length
        assertFalse(record.isSet("Col2")); // Mapped but index >= values.length
        assertFalse(record.isSet("Col3")); // Not mapped
    }

    @Test
    public void testIterator() {
        String[] values = { "one", "two", "three" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        Iterator<String> iterator = record.iterator();

        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertEquals("one", iterator.next());
        assertEquals("two", iterator.next());
        assertEquals("three", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testToMap() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Col1", 0);
        mapping.put("Col2", 1);
        mapping.put("Col3", 5); // Out of bounds, should be skipped by putIn

        String[] values = { "Val1", "Val2" };
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);

        Map<String, String> map = record.toMap();
        assertNotNull(map);
        assertEquals(2, map.size());
        assertEquals("Val1", map.get("Col1"));
        assertEquals("Val2", map.get("Col2"));
        assertNull(map.get("Col3"));
    }

    @Test
    public void testToString() {
        String[] values = { "A", "B" };
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("[A, B]", record.toString());
    }
}