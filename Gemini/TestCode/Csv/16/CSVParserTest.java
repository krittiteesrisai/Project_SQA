package org.apache.commons.csv;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Test;

public class CSVParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullReader() throws IOException {
        CSVParser.parse((Reader) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullFormat() throws IOException {
        CSVParser.parse("a,b,c", (CSVFormat) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullString() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullFile() throws IOException {
        CSVParser.parse((File) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullPath() throws IOException {
        CSVParser.parse((Path) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullInputStream() throws IOException {
        CSVParser.parse((java.io.InputStream) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullUrl() throws IOException {
        CSVParser.parse((URL) null, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
    }

    @Test
    public void testParseStringBasic() throws IOException {
        String code = "A,B,C\n1,2,3";
        try (CSVParser parser = CSVParser.parse(code, CSVFormat.DEFAULT)) {
            assertFalse(parser.isClosed());
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("A", records.get(0).get(0));
            assertEquals("3", records.get(1).get(2));
        }
    }

    @Test
    public void testHeaderAutoDetection() throws IOException {
        String code = "H1,H2,H3\nval1,val2,val3";
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        try (CSVParser parser = CSVParser.parse(code, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(3, headerMap.size());
            assertEquals(Integer.valueOf(0), headerMap.get("H1"));
            
            List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("val1", records.get(0).get("H1"));
        }
    }

    @Test
    public void testHeaderExplicitAndSkip() throws IOException {
        String code = "val1,val2,val3";
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Col1", "Col2", "Col3").withSkipHeaderRecord(true);
        try (CSVParser parser = CSVParser.parse(code, format)) {
            Map<String, Integer> headerMap = parser.getHeaderMap();
            assertNotNull(headerMap);
            assertEquals(Integer.valueOf(1), headerMap.get("Col2"));
            
            List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals("val2", records.get(0).get("Col2"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateHeaderThrowsException() throws IOException {
        String code = "Col1,Col1,Col2\n1,2,3";
        CSVFormat.DEFAULT.withHeader();
        CSVParser.parse(code, CSVFormat.DEFAULT.withHeader());
    }

    @Test
    public void testHeaderCaseInsensitive() throws IOException {
        String code = "H1,h2\n1,2";
        CSVFormat format = CSVFormat.DEFAULT.withHeader().withIgnoreHeaderCase(true);
        try (CSVParser parser = CSVParser.parse(code, format)) {
            Map<String, Integer> map = parser.getHeaderMap();
            assertTrue(map.containsKey("H1"));
            assertTrue(map.containsKey("h1")); // case-insensitive check
        }
    }

    @Test
    public void testTrimAndNullString() throws IOException {
        String code = "A, B , NULL";
        CSVFormat format = CSVFormat.DEFAULT
                .withTrim(true)
                .withNullString("NULL");
        try (CSVParser parser = CSVParser.parse(code, format)) {
            CSVRecord record = parser.iterator().next();
            assertEquals("A", record.get(0));
            assertEquals("B", record.get(1));
            assertNull(record.get(2));
        }
    }

    @Test
    public void testTrailingDelimiter() throws IOException {
        String code = "A,B,\n";
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(true);
        try (CSVParser parser = CSVParser.parse(code, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(1, records.size());
            assertEquals(2, records.get(0).size()); // trailing empty value ignored
        }
    }

    @Test
    public void testCommentsAndEmptyLines() throws IOException {
        String code = "# Comment 1\n# Comment 2\nA,B\n\nC,D";
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        try (CSVParser parser = CSVParser.parse(code, format)) {
            List<CSVRecord> records = parser.getRecords();
            assertEquals(2, records.size());
            assertEquals("Comment 1\nComment 2", records.get(0. == 0 ? 0 : 0).getComment());
        }
    }

    @Test
    public void testIteratorOperations() throws IOException {
        String code = "a,b\nc,d";
        try (CSVParser parser = CSVParser.parse(code, CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> iter = parser.iterator();
            assertTrue(iter.hasNext());
            assertNotNull(iter.next());
            assertTrue(iter.hasNext());
            assertNotNull(iter.next());
            assertFalse(iter.hasNext());
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNoSuchElement() throws IOException {
        String code = "a,b";
        try (CSVParser parser = CSVParser.parse(code, CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> iter = parser.iterator();
            iter.next(); // consume only record
            iter.next(); // should throw NoSuchElementException
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorOnClosedParser() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> iter = parser.iterator();
        assertFalse(iter.hasNext());
        iter.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemoveUnsupported() throws IOException {
        try (CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT)) {
            Iterator<CSVRecord> iter = parser.iterator();
            iter.remove();
        }
    }

    @Test
    public void testGettersAndMetadata() throws IOException {
        String code = "line1\nline2";
        try (CSVParser parser = CSVParser.parse(code, CSVFormat.DEFAULT)) {
            assertEquals(0, parser.getRecordNumber());
            parser.iterator().next();
            assertEquals(1, parser.getRecordNumber());
            assertNotNull(parser.getFirstEndOfLine());
        }
    }

    @Test
    public void testFileAndPathParse() throws IOException {
        Path tempFile = Files.createTempFile("csvTest", ".csv");
        Files.write(tempFile, "col1,col2\nval1,val2".getBytes(StandardCharsets.UTF_8));
        
        try (CSVParser parser = CSVParser.parse(tempFile, StandardCharsets.UTF_8, CSVFormat.DEFAULT.withHeader())) {
            assertEquals(1, parser.getRecords().size());
        }

        try (CSVParser parser = CSVParser.parse(tempFile.toFile(), StandardCharsets.UTF_8, CSVFormat.DEFAULT.withHeader())) {
            assertEquals(1, parser.getRecords().size());
        }
        
        Files.deleteIfExists(tempFile);
    }
}