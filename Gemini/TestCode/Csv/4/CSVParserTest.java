package org.apache.commons.csv;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {

    private CSVParser parser;

    @After
    public void tearDown() throws IOException {
        if (parser != null && !parser.isClosed()) {
            parser.close();
        }
    }

    @Test
    public void testParseStringAndFormatNotNull() throws IOException {
        parser = CSVParser.parse("a,b,c\n1,2,3", CSVFormat.DEFAULT);
        assertNotNull(parser);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("1", records.get(1).get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullStringThrowsException() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullFormatThrowsException() throws IOException {
        CSVParser.parse("a,b", (CSVFormat) null);
    }

    @Test
    public void testParseFile() throws IOException {
        // Create a temporary file for testing File parsing
        File tempFile = File.createTempFile("csvTest", ".csv");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), "header1,header2\nval1,val2".getBytes());

        parser = CSVParser.parse(tempFile, CSVFormat.DEFAULT.withHeader());
        assertNotNull(parser);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(2, headerMap.size());
        
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("val1", records.get(0).get("header1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullFileThrowsException() throws IOException {
        CSVParser.parse((File) null, CSVFormat.DEFAULT);
    }

    @Test
    public void testParseURL() throws Exception {
        File tempFile = File.createTempFile("csvURLTest", ".csv");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), "x,y\n1,2".getBytes());
        URL url = tempFile.toURI().toURL();

        parser = CSVParser.parse(url, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
        assertNotNull(parser);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullURLThrowsException() throws IOException {
        CSVParser.parse((URL) null, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    @Test
    public void testParseNullCharsetURL() throws Exception {
        File tempFile = File.createTempFile("csvURLTest", ".csv");
        tempFile.deleteOnExit();
        java.nio.file.Files.write(tempFile.toPath(), "x,y\n1,2".getBytes());
        URL url = tempFile.toURI().toURL();

        parser = CSVParser.parse(url, null, CSVFormat.DEFAULT);
        assertNotNull(parser);
        assertEquals(2, parser.getRecords().size());
    }

    @Test
    public void testHeaderInitializationEmptyFormatHeader() throws IOException {
        String code = "h1,h2\nv1,v2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader(new String[0]);
        parser = CSVParser.parse(code, format);
        Map<String, Integer> map = parser.getHeaderMap();
        assertNotNull(map);
        assertEquals(2, map.size());
        assertTrue(map.containsKey("h1"));
    }

    @Test
    public void testHeaderInitializationSkipHeaderRecord() throws IOException {
        String code = "h1,h2\nv1,v2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader("h1", "h2").withSkipHeaderRecord(true);
        parser = CSVParser.parse(code, format);
        Map<String, Integer> map = parser.getHeaderMap();
        assertEquals(2, map.size());
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("v1", records.get(0).get("h1"));
    }

    @Test
    public void testNullStringHandling() throws IOException {
        String code = "NULL,val2";
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        parser = CSVParser.parse(code, format);
        List<CSVRecord> records = parser.getRecords();
        assertNull(records.get(0).get(0));
        assertEquals("val2", records.get(0).get(1));
    }

    @Test
    public void testNullStringDisabledHandling() throws IOException {
        String code = "NULL,val2";
        CSVFormat format = CSVFormat.DEFAULT; // nullString is null by default
        parser = CSVParser.parse(code, format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals("NULL", records.get(0).get(0));
    }

    @Test
    public void testCommentsHandling() throws IOException {
        String code = "# Comment 1\n# Comment 2\na,b";
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        parser = CSVParser.parse(code, format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        // Check comment is correctly stored in CSVRecord
        assertNotNull(records.get(0).getComment());
        assertTrue(records.get(0).getComment().contains("Comment 1"));
    }

    @Test
    public void testIteratorBehaviors() throws IOException {
        parser = CSVParser.parse("a,b\nc,d", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        
        assertTrue(it.hasNext());
        assertTrue(it.hasNext()); // repeated hasNext should be safe
        
        CSVRecord rec1 = it.next();
        assertEquals("a", rec1.get(0));
        
        assertTrue(it.hasNext());
        CSVRecord rec2 = it.next();
        assertEquals("c", rec2.get(0));
        
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextWithoutHasNext() throws IOException {
        parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.next(); // Should consume the first
        it.next(); // Should throw NoSuchElementException because no more records
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorOnClosedParser() throws IOException {
        parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        it.next();
    }

    @Test
    public void testIteratorHasNextOnClosedParser() throws IOException {
        parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemoveUnsupported() throws IOException {
        parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.remove();
    }

    @Test
    public void testGettersAndState() throws IOException {
        parser = CSVParser.parse("a,b\nc,d", CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        assertEquals(0L, parser.getRecordNumber());
        
        parser.getRecords();
        assertEquals(2L, parser.getRecordNumber());
        
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test(expected = IOException.class)
    public void testInvalidTokenHandling() throws IOException {
        // Triggering an invalid token sequence that causes IOException
        String code = "\"unclosed quote";
        parser = CSVParser.parse(code, CSVFormat.DEFAULT);
        parser.getRecords();
    }

    @Test
    public void testIteratorIOExceptionWrapping() {
        // Reader that throws IOException on read to test RuntimeException wrapping in iterator
        Reader faultyReader = new Reader() {
            @Override
            int read(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated IO Error");
            }
            @Override
            public void close() {}
        };
        
        try {
            CSVParser faultyParser = new CSVParser(faultyReader, CSVFormat.DEFAULT);
            Iterator<CSVRecord> it = faultyParser.iterator();
            it.hasNext();
            fail("Expected RuntimeException due to IOException");
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
    }
}