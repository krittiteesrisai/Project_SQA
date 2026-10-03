package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {

    @Test
    public void testParseStringWithoutHeader() throws IOException {
        String data = "a,b,c\n1,2,3";
        CSVParser parser = CSVParser.parse(data, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        
        assertEquals(2, records.size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("1", records.get(1).get(0));
        assertNull(parser.getHeaderMap());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testParseStringWithExplicitHeader() throws IOException {
        String data = "1,2,3\n4,5,6";
        CSVFormat format = CSVFormat.DEFAULT.withHeader("h1", "h2", "h3");
        CSVParser parser = CSVParser.parse(data, format);
        
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(3, headerMap.size());
        assertEquals(Integer.valueOf(0), headerMap.get("h1"));

        CSVRecord record = parser.iterator().next();
        assertEquals("1", record.get("h1"));
        parser.close();
    }

    @Test
    public void testParseStringWithImplicitHeaderAndSkip() throws IOException {
        String data = "h1,h2,h3\n1,2,3";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withSkipHeaderRecord(true);
        CSVParser parser = CSVParser.parse(data, format);
        
        assertNotNull(parser.getHeaderMap());
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("1", records.get(0).get("h1"));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateHeaderThrowsException() throws IOException {
        String data = "h1,h1,h3\n1,2,3";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        CSVParser.parse(data, format);
    }

    @Test
    public void testEmptyHeaderWithIgnoreEmptyHeaders() throws IOException {
        // ทดสอบเคส Header ว่างและตั้งค่า ignore empty headers
        String data = ",h2,\n1,2,3";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withIgnoreEmptyHeaders(true);
        CSVParser parser = CSVParser.parse(data, format);
        assertNotNull(parser.getHeaderMap());
        parser.close();
    }

    @Test
    public void testNullStringHandling() throws IOException {
        String data = "NULL,val";
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVParser parser = CSVParser.parse(data, format);
        CSVRecord record = parser.iterator().next();
        
        assertNull(record.get(0));
        assertEquals("val", record.get(1));
        parser.close();
    }

    @Test
    public void testCommentsHandling() throws IOException {
        String data = "# Comment 1\n# Comment 2\na,b";
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVParser parser = CSVParser.parse(data, format);
        List<CSVRecord> records = parser.getRecords();
        
        assertEquals(1, records.size());
        assertNotNull(records.get(0).getComment());
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextOnClosedParser() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        it.next();
    }

    @Test
    public void testIteratorHasNextOnClosedParser() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        assertFalse(it.hasNext());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemoveUnsupported() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        it.remove();
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullFile() throws IOException {
        CSVParser.parse((File) null, Charset.defaultCharset(), CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullString() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullUrl() throws IOException {
        CSVParser.parse((URL) null, Charset.defaultCharset(), CSVFormat.DEFAULT);
    }
}