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
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CSVPrinterTest {

    @Test
    public void testConstructorWithHeaderAndComments() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT
                .withHeaderComments("Comment 1", null, "Comment 2")
                .withHeader("Col1", "Col2")
                .withCommentMarker('#');
        
        CSVPrinter printer = new CSVPrinter(sw, format);
        assertNotNull(printer.getOut());
        printer.close();
    }

    @Test
    public void testConstructorSkipHeader() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT
                .withHeader("Col1", "Col2")
                .withSkipHeaderRecord(true);
        
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printRecord("Val1", "Val2");
        printer.flush();
        assertEquals("Val1,Val2\r\n", sw.toString());
        printer.close();
    }

    @Test
    public void testCloseAndFlushNonCloseableAppendable() throws IOException {
        // StringBuilder implements Appendable, but not Closeable or Flushable in standard way or handled via instanceof
        StringBuilder sb = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("test");
        printer.flush();
        printer.close();
        assertEquals("test\r\n", sb.toString());
    }

    @Test
    public void testPrintNullValues() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printRecord((Object) null);
        printer.close();
        assertEquals("NULL\r\n", sw.toString());
    }

    @Test
    public void testPrintNullValueWithoutNullString() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT; // nullString is null by default
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printRecord((Object) null);
        printer.close();
        assertEquals("\r\n", sw.toString());
    }

    @Test
    public void testQuoteModeAll() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printRecord("a", 123);
        printer.close();
        assertEquals("\"a\",\"123\"\r\n", sw.toString());
    }

    @Test
    public void testQuoteModeNonNumeric() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NON_NUMERIC);
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printRecord("text", 456, 45.67);
        printer.close();
        assertEquals("\"text\",456,45.67\r\n", sw.toString());
    }

    @Test
    public void testQuoteModeNoneWithEscape() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.NONE).withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printRecord("val,ues", "test\nline");
        printer.close();
        assertEquals("val\\,ues,test\\nline\r\n", sw.toString());
    }

    @Test
    public void testQuoteModeMinimalEdgeCases() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);
        CSVPrinter printer = new CSVPrinter(sw, format);
        // Empty record, special chars at start/end, and quotes inside
        printer.printRecord("", "a\"b", "endswithspace ", "#commentlike");
        printer.close();
        assertEquals("\"\",\"a\"\"b\",\"endswithspace \",\"#commentlike\"\r\n", sw.toString());
    }

    @Test
    public void testPrintAndEscapeBranches() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withQuoteCharacterSet(null).withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printRecord("Line1\rLine2\nCol\tVal,End\\Escape");
        printer.close();
        // Verifies CR, LF, Delimiter, and Escape character handling
        assertEquals("Line1\\rLine2\\nCol\tVal\\,End\\\\Escape\r\n", sw.toString());
    }

    @Test
    public void testPrintCommentDisabled() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT; // comment marker not set
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printComment("This is a comment");
        printer.close();
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintCommentWithVariousNewlines() throws IOException {
        StringWriter sw = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(sw, format);
        printer.printComment("Line1\r\nLine2\nLine3\rLine4");
        printer.close();
        assertEquals("# Line1\r\n# Line2\r\n# Line3\r\n# Line4\r\n", sw.toString());
    }

    @Test
    public void testPrintRecordsIterableAndArrays() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        
        List<Object> data = Arrays.asList(
            new String[] { "A", "B", "C" },
            Arrays.asList("1", "2", "3"),
            "SimpleValue"
        );
        
        printer.printRecords(data);
        printer.close();
        assertEquals("A,B,C\r\n1,2,3\r\nSimpleValue\r\n", sw.toString());
    }

    @Test
    public void testPrintRecordsObjectArray() throws IOException {
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        
        printer.printRecords(
            new String[] { "X", "Y" },
            Arrays.asList("9", "8"),
            "Direct"
        );
        printer.close();
        assertEquals("X,Y\r\n9,8\r\nDirect\r\n", sw.toString());
    }
}