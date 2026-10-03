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
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Test;

public class CSVParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParseFileNullFile() throws IOException {
        CSVParser.parse((File) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseFileNullFormat() throws IOException {
        File tempFile = File.createTempFile("csv", ".txt");
        tempFile.deleteOnExit();
        CSVParser.parse(tempFile, (CSVFormat) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNullString() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNullFormat() throws IOException {
        CSVParser.parse("a,b,c", (CSVFormat) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseUrlNullUrl() throws IOException {
        CSVParser.parse((URL) null, Charset.defaultCharset(), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseUrlNullCharset() throws IOException {
        URL url = new URL("http://localhost");
        CSVParser.parse(url, (Charset) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseUrlNullFormat() throws IOException {
        URL url = new URL("http://localhost");
        CSVParser.parse(url, Charset.defaultCharset(), (CSVFormat) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullReader() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat() throws IOException {
        new CSVParser(new StringReader("a"), null);
    }

    @Test
    public void testParseFileValid() throws IOException {
        File tempFile = File.createTempFile("csv", ".txt");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), "col1,col2\nval1,val2".getBytes());

        CSVParser parser = CSVParser.parse(tempFile, CSVFormat.DEFAULT);
        assertNotNull(parser);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testParseUrlValidMock() throws IOException {
        // ทดสอบพาร์ส URL ด้วยการจำลองผ่านไฟล์ local file URL เพื่อเลี่ยง Network call จริง
        File tempFile = File.createTempFile("csv", ".txt");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), "a,b\n1,2".getBytes());

        CSVParser parser = CSVParser.parse(tempFile.toURI().toURL(), Charset.defaultCharset(), CSVFormat.DEFAULT);
        assertNotNull(parser);
        assertEquals(2, parser.getRecords().size());
        parser.close();
    }

    @Test
    public void testInitializeHeaderEmptyArray() throws IOException {
        String code = "header1,header2\nval1,val2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader(new String[0]);
        CSVParser parser = CSVParser.parse(code, format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(2, headerMap.size());
        assertTrue(headerMap.containsKey("header1"));
        assertTrue(headerMap.containsKey("header2"));
        parser.close();
    }

    @Test
    public void testInitializeHeaderWithSkip() throws IOException {
        String code = "header1,header2\nval1,val2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader("h1", "h2").withSkipHeaderRecord(true);
        CSVParser parser = CSVParser.parse(code, format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(2, headerMap.size());
        assertTrue(headerMap.containsKey("h1"));

        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("val1", records.get(0).get(0));
        parser.close();
    }

    @Test
    public void testInitializeHeaderWithoutSkip() throws IOException {
        String code = "val1,val2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader("h1", "h2").withSkipHeaderRecord(false);
        CSVParser parser = CSVParser.parse(code, format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("val1", records.get(0).get(0));
        parser.close();
    }

    @Test
    public void testNullStringHandling() throws IOException {
        String code = "NULL,val2";
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = CSVParser.parse(code, format);
        CSVRecord record = parser.nextRecord();
        assertNull(record.get(0));
        assertEquals("val2", record.get(1));
        parser.close();
    }

    @Test
    public void testCommentsAndLineNumbers() throws IOException {
        String code = "# This is a comment\n# Another comment\na,b\n# Mid comment\nc,d";
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = CSVParser.parse(code, format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("c", records.get(1).get(0));
        assertTrue(parser.getCurrentLineNumber() > 0);
        parser.close();
    }

    @Test
    public void testGetRecordsWithCollection() throws IOException {
        String code = "a,b\n1,2\n3,4";
        CSVParser parser = CSVParser.parse(code, CSVFormat.DEFAULT);
        List<CSVRecord> targetList = new ArrayList<CSVRecord>();
        parser.getRecords(targetList);
        assertEquals(3, targetList.size());
        parser.close();
    }

    @Test
    public void testIteratorOperations() throws IOException {
        String code = "a,b\n1,2";
        CSVParser parser = CSVParser.parse(code, CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();

        assertTrue(iterator.hasNext());
        assertNotNull(iterator.next());
        assertTrue(iterator.hasNext());
        assertNotNull(iterator.next());
        assertFalse(iterator.hasNext());

        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNoSuchElementWhenClosed() throws IOException {
        String code = "a,b";
        CSVParser parser = CSVParser.parse(code, CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.next();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNoSuchElementAtEnd() throws IOException {
        String code = "a,b";
        CSVParser parser = CSVParser.parse(code, CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.next(); // first record
        iterator.next(); // second record (header or data) -> will throw if out of bounds
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemoveUnsupported() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iterator = parser.iterator();
        iterator.remove();
        parser.close();
    }

    @Test
    public void testGetHeaderMapNull() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        assertNull(parser.getHeaderMap());
        parser.close();
    }

    @Test
    public void testGetRecordNumber() throws IOException {
        CSVParser parser = CSVParser.parse("a,b\nc,d", CSVFormat.DEFAULT);
        assertEquals(0, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(1, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(2, parser.getRecordNumber());
        parser.close();
    }
}