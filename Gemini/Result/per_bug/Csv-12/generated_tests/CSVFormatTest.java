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

import java.io.StringReader;
import java.util.Arrays;

import org.junit.Test;

public class CSVFormatTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsLineBreakLF() {
        CSVFormat.newFormat('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewFormatDelimiterIsLineBreakCR() {
        CSVFormat.newFormat('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiterLineBreak() {
        CSVFormat.DEFAULT.withDelimiter('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerLineBreakChar() {
        CSVFormat.DEFAULT.withCommentMarker('\r');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarkerLineBreakCharacterObj() {
        CSVFormat.DEFAULT.withCommentMarker(Character.valueOf('\n'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreakChar() {
        CSVFormat.DEFAULT.withEscape('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEscapeLineBreakCharacterObj() {
        CSVFormat.DEFAULT.withEscape(Character.valueOf('\r'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteLineBreakChar() {
        CSVFormat.DEFAULT.withQuote('\n');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteLineBreakCharacterObj() {
        CSVFormat.DEFAULT.withQuote(Character.valueOf('\r'));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateHeader() {
        CSVFormat.DEFAULT.withHeader("Col1", "Col2", "Col1");
    }

    @Test
    public void testValidHeaderHandling() {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Col1", "Col2");
        assertNotNull(format.getHeader());
        assertTrue(Arrays.equals(new String[]{"Col1", "Col2"}, format.getHeader()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDelimiterEqualsQuote() {
        CSVFormat.DEFAULT.withDelimiter('"').withQuote('"');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDelimiterEqualsEscape() {
        CSVFormat.DEFAULT.withDelimiter('\\').withEscape('\\');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateDelimiterEqualsComment() {
        CSVFormat.DEFAULT.withDelimiter('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateQuoteEqualsComment() {
        CSVFormat.DEFAULT.withQuote('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateEscapeEqualsComment() {
        CSVFormat.DEFAULT.withEscape('#').withCommentMarker('#');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateNoQuotesModeWithoutEscape() {
        CSVFormat.DEFAULT.withQuote(null).withQuoteMode(QuoteMode.NONE).withEscape((Character) null);
    }

    @Test
    public void testPredefinedFormats() {
        assertNotNull(CSVFormat.DEFAULT);
        assertNotNull(CSVFormat.RFC4180);
        assertNotNull(CSVFormat.EXCEL);
        assertNotNull(CSVFormat.TDF);
        assertNotNull(CSVFormat.MYSQL);
    }

    @Test
    public void testGettersAndSetters() {
        CSVFormat format = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withEscape('\\')
                .withNullString("NULL")
                .withQuote('\'')
                .withQuoteMode(QuoteMode.ALL)
                .withRecordSeparator("\n")
                .withSkipHeaderRecord(true)
                .withAllowMissingColumnNames(true)
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true);

        assertEquals(Character.valueOf('#'), format.getCommentMarker());
        assertEquals(',', format.getDelimiter());
        assertEquals(Character.valueOf('\\'), format.getEscapeCharacter());
        assertEquals("NULL", format.getNullString());
        assertEquals(Character.valueOf('\''), format.getQuoteCharacter());
        assertEquals(QuoteMode.ALL, format.getQuoteMode());
        assertEquals("\n", format.getRecordSeparator());
        assertTrue(format.getSkipHeaderRecord());
        assertTrue(format.getAllowMissingColumnNames());
        assertTrue(format.getIgnoreEmptyLines());
        assertTrue(format.getIgnoreSurroundingSpaces());

        assertTrue(format.isCommentMarkerSet());
        assertTrue(format.isEscapeCharacterSet());
        assertTrue(format.isNullStringSet());
        assertTrue(format.isQuoteCharacterSet());
    }

    @Test
    public void testEqualsAndHashCodeEdgeCases() {
        CSVFormat format1 = CSVFormat.DEFAULT;
        CSVFormat format2 = CSVFormat.DEFAULT;
        CSVFormat format3 = CSVFormat.RFC4180;

        assertTrue(format1.equals(format1));
        assertFalse(format1.equals(null));
        assertFalse(format1.equals("Some String"));
        assertTrue(format1.equals(format2));
        assertFalse(format1.equals(format3));

        // Testing distinct fields for equals branches
        assertFalse(CSVFormat.DEFAULT.withDelimiter(';').equals(CSVFormat.DEFAULT));
        assertFalse(CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).equals(CSVFormat.DEFAULT));
        assertFalse(CSVFormat.DEFAULT.withQuote(null).equals(CSVFormat.DEFAULT));
        
        CSVFormat qFormat = CSVFormat.DEFAULT.withQuote('\'');
        assertFalse(qFormat.equals(CSVFormat.DEFAULT.withQuote('"')));
        
        assertFalse(CSVFormat.DEFAULT.withCommentMarker('#').equals(CSVFormat.DEFAULT));
        assertFalse(CSVFormat.DEFAULT.withCommentMarker('#').equals(CSVFormat.DEFAULT.withCommentMarker('!')));

        assertFalse(CSVFormat.DEFAULT.withEscape('\\').equals(CSVFormat.DEFAULT));
        assertFalse(CSVFormat.DEFAULT.withEscape('\\').equals(CSVFormat.DEFAULT.withEscape('/')));

        assertFalse(CSVFormat.DEFAULT.withNullString("N/A").equals(CSVFormat.DEFAULT));
        assertFalse(CSVFormat.DEFAULT.withNullString("N/A").equals(CSVFormat.DEFAULT.withNullString("NULL")));

        assertFalse(CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true).equals(CSVFormat.DEFAULT));
        assertFalse(CSVFormat.DEFAULT.withIgnoreEmptyLines(false).equals(CSVFormat.DEFAULT));
        assertFalse(CSVFormat.DEFAULT.withSkipHeaderRecord(true).equals(CSVFormat.DEFAULT));
        assertFalse(CSVFormat.DEFAULT.withRecordSeparator("\r").equals(CSVFormat.DEFAULT));

        assertEquals(format1.hashCode(), format2.hashCode());
    }

    @Test
    public void testToStringOutput() {
        CSVFormat format = CSVFormat.DEFAULT
                .withEscape('\\')
                .withQuote('"')
                .withCommentMarker('#')
                .withNullString("NULL")
                .withRecordSeparator("\n")
                .withIgnoreEmptyLines(true)
                .withIgnoreSurroundingSpaces(true)
                .withSkipHeaderRecord(true)
                .withHeader("A", "B");

        String str = format.toString();
        assertTrue(str.contains("Delimiter=<,>"));
        assertTrue(str.contains("Escape=<\\>"));
        assertTrue(str.contains("QuoteChar=<\">"));
        assertTrue(str.contains("CommentStart=<#>"));
        assertTrue(str.contains("NullString=<NULL>"));
        assertTrue(str.contains("RecordSeparator=<\n>"));
        assertTrue(str.contains("EmptyLines:ignored"));
        assertTrue(str.contains("SurroundingSpaces:ignored"));
        assertTrue(str.contains("SkipHeaderRecord:true"));
        assertTrue(str.contains("Header:[A, B]"));
    }

    @Test
    public void testFormatAndParsingHelpers() throws Exception {
        String formatted = CSVFormat.DEFAULT.format("a", "b", "c");
        assertEquals("a,b,c", formatted);

        CSVParser parser = CSVFormat.DEFAULT.parse(new StringReader("a,b,c"));
        assertNotNull(parser);

        CSVPrinter printer = CSVFormat.DEFAULT.print(new StringBuilder());
        assertNotNull(printer);
    }
}