package org.apache.commons.csv;

import org.junit.Test;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.PrintStream;
import java.util.Formatter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import jdk.internal.access.foreign.MemorySegmentProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_csv_CSVFormatTest {
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.equals(cSVFormat);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.executesCondition {@code (getClass() != obj.getClass()): True}
 *  */
    @Test
    public void testEquals_GetClassNotEqualsObjGetClass() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        byte[] byteArray = {};
        
        boolean actual = cSVFormat.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj == null): True}
 *  */
    @Test
    public void testEquals_ObjEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> Escape=<\u0000> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> CommentStart=<\u0000> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> NullString=<> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> RecordSeparator=<> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> EmptyLines:ignored SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> SurroundingSpaces:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null, null, null, null, null, null, null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> SkipHeaderRecord:true HeaderComments:[null, null, null, null, null, null, null, null, null]";
        
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        java.lang.String[] cSVFormatHeaderComments1 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments1, 1));
        java.lang.String[] cSVFormatHeaderComments2 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments2 = ((String) get(cSVFormatHeaderComments2, 2));
        java.lang.String[] cSVFormatHeaderComments3 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments3 = ((String) get(cSVFormatHeaderComments3, 3));
        java.lang.String[] cSVFormatHeaderComments4 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments4 = ((String) get(cSVFormatHeaderComments4, 4));
        java.lang.String[] cSVFormatHeaderComments5 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments5 = ((String) get(cSVFormatHeaderComments5, 5));
        java.lang.String[] cSVFormatHeaderComments6 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments6 = ((String) get(cSVFormatHeaderComments6, 6));
        java.lang.String[] cSVFormatHeaderComments7 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments7 = ((String) get(cSVFormatHeaderComments7, 7));
        java.lang.String[] cSVFormatHeaderComments8 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments8 = ((String) get(cSVFormatHeaderComments8, 8));
        
        assertNull(finalCSVFormatHeaderComments0);
        
        assertNull(finalCSVFormatHeaderComments1);
        
        assertNull(finalCSVFormatHeaderComments2);
        
        assertNull(finalCSVFormatHeaderComments3);
        
        assertNull(finalCSVFormatHeaderComments4);
        
        assertNull(finalCSVFormatHeaderComments5);
        
        assertNull(finalCSVFormatHeaderComments6);
        
        assertNull(finalCSVFormatHeaderComments7);
        
        assertNull(finalCSVFormatHeaderComments8);
    }
    
    @Test
    public void testToString8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {null, null, null, null, null, null, null, null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> SkipHeaderRecord:true Header:[null, null, null, null, null, null, null, null, null]";
        
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        java.lang.String[] cSVFormatHeader1 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader1 = ((String) get(cSVFormatHeader1, 1));
        java.lang.String[] cSVFormatHeader2 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader2 = ((String) get(cSVFormatHeader2, 2));
        java.lang.String[] cSVFormatHeader3 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader3 = ((String) get(cSVFormatHeader3, 3));
        java.lang.String[] cSVFormatHeader4 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader4 = ((String) get(cSVFormatHeader4, 4));
        java.lang.String[] cSVFormatHeader5 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader5 = ((String) get(cSVFormatHeader5, 5));
        java.lang.String[] cSVFormatHeader6 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader6 = ((String) get(cSVFormatHeader6, 6));
        java.lang.String[] cSVFormatHeader7 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader7 = ((String) get(cSVFormatHeader7, 7));
        java.lang.String[] cSVFormatHeader8 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader8 = ((String) get(cSVFormatHeader8, 8));
        
        assertNull(finalCSVFormatHeader0);
        
        assertNull(finalCSVFormatHeader1);
        
        assertNull(finalCSVFormatHeader2);
        
        assertNull(finalCSVFormatHeader3);
        
        assertNull(finalCSVFormatHeader4);
        
        assertNull(finalCSVFormatHeader5);
        
        assertNull(finalCSVFormatHeader6);
        
        assertNull(finalCSVFormatHeader7);
        
        assertNull(finalCSVFormatHeader8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.hashCode
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1688684849, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1941554113, actual);
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1688684849, actual);
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1941554113, actual);
    }
    
    @Test
    public void testHashCode5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1941554113, actual);
    }
    
    @Test
    public void testHashCode6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1683137957, actual);
    }
    
    @Test
    public void testHashCode7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1511190071, actual);
    }
    
    @Test
    public void testHashCode8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1688684849, actual);
    }
    
    @Test
    public void testHashCode9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1683143723, actual);
    }
    
    @Test
    public void testHashCode10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1516909943, actual);
    }
    
    @Test
    public void testHashCode11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1688684849, actual);
    }
    
    @Test
    public void testHashCode12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1941554113, actual);
    }
    
    @Test
    public void testHashCode13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1764238081, actual);
    }
    
    @Test
    public void testHashCode14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1769600461, actual);
    }
    
    @Test
    public void testHashCode15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1936012987, actual);
    }
    
    @Test
    public void testHashCode16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1516731197, actual);
    }
    
    @Test
    public void testHashCode17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1764232315, actual);
    }
    
    @Test
    public void testHashCode18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1941375367, actual);
    }
    
    @Test
    public void testHashCode19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1941369601, actual);
    }
    
    @Test
    public void testHashCode20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header = {null, null, null, null, null, null, null, null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1573265702, actual);
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        java.lang.String[] cSVFormatHeader1 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader1 = ((String) get(cSVFormatHeader1, 1));
        java.lang.String[] cSVFormatHeader2 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader2 = ((String) get(cSVFormatHeader2, 2));
        java.lang.String[] cSVFormatHeader3 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader3 = ((String) get(cSVFormatHeader3, 3));
        java.lang.String[] cSVFormatHeader4 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader4 = ((String) get(cSVFormatHeader4, 4));
        java.lang.String[] cSVFormatHeader5 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader5 = ((String) get(cSVFormatHeader5, 5));
        java.lang.String[] cSVFormatHeader6 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader6 = ((String) get(cSVFormatHeader6, 6));
        java.lang.String[] cSVFormatHeader7 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader7 = ((String) get(cSVFormatHeader7, 7));
        java.lang.String[] cSVFormatHeader8 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader8 = ((String) get(cSVFormatHeader8, 8));
        
        assertNull(finalCSVFormatHeader0);
        
        assertNull(finalCSVFormatHeader1);
        
        assertNull(finalCSVFormatHeader2);
        
        assertNull(finalCSVFormatHeader3);
        
        assertNull(finalCSVFormatHeader4);
        
        assertNull(finalCSVFormatHeader5);
        
        assertNull(finalCSVFormatHeader6);
        
        assertNull(finalCSVFormatHeader7);
        
        assertNull(finalCSVFormatHeader8);
    }
    
    @Test
    public void testHashCode21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1935828476, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.valueOf
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method valueOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#valueOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return CSVFormat.Predefined.valueOf(format).getFormat();
 *  */
    @Test
    public void testValueOf_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.csv.CSVFormat.valueOf] produces [java.lang.NullPointerException: Name is null]
            java.base/java.lang.Enum.valueOf(Enum.java:271)
            org.apache.commons.csv.CSVFormat$Predefined.valueOf(CSVFormat.java:155)
            org.apache.commons.csv.CSVFormat.valueOf(CSVFormat.java:378) */
        CSVFormat.valueOf(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method valueOf(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.csv.CSVFormat}
     * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#valueOf(java.lang.String)}
     */
    @Test
    public void testValueOfThrowsIAEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.csv.CSVFormat.valueOf] produces [java.lang.IllegalArgumentException: No enum constant org.apache.commons.csv.CSVFormat.Predefined.
            
        ]
            java.base/java.lang.Enum.valueOf(Enum.java:273)
            org.apache.commons.csv.CSVFormat$Predefined.valueOf(CSVFormat.java:155)
            org.apache.commons.csv.CSVFormat.valueOf(CSVFormat.java:378) */
        CSVFormat.valueOf("\u0014\n\t\r");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method valueOf(java.lang.String)
    
    @Test
    public void testValueOf1() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.valueOf] produces [java.lang.IllegalArgumentException: No enum constant org.apache.commons.csv.CSVFormat.Predefined.]
            java.base/java.lang.Enum.valueOf(Enum.java:273)
            org.apache.commons.csv.CSVFormat$Predefined.valueOf(CSVFormat.java:155)
            org.apache.commons.csv.CSVFormat.valueOf(CSVFormat.java:378) */
        CSVFormat.valueOf(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.format
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method format([Ljava.lang.Object;)
    
    @Test
    public void testFormat1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] headerComments = new java.lang.String[8];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        java.lang.String[] cSVFormatHeaderComments1 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments2 = ((String) get(cSVFormatHeaderComments1, 2));
        java.lang.String[] cSVFormatHeaderComments2 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments3 = ((String) get(cSVFormatHeaderComments2, 3));
        java.lang.String[] cSVFormatHeaderComments3 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments4 = ((String) get(cSVFormatHeaderComments3, 4));
        java.lang.String[] cSVFormatHeaderComments4 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments5 = ((String) get(cSVFormatHeaderComments4, 5));
        java.lang.String[] cSVFormatHeaderComments5 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments6 = ((String) get(cSVFormatHeaderComments5, 6));
        java.lang.String[] cSVFormatHeaderComments6 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments7 = ((String) get(cSVFormatHeaderComments6, 7));
        
        assertNull(finalCSVFormatHeaderComments1);
        
        assertNull(finalCSVFormatHeaderComments2);
        
        assertNull(finalCSVFormatHeaderComments3);
        
        assertNull(finalCSVFormatHeaderComments4);
        
        assertNull(finalCSVFormatHeaderComments5);
        
        assertNull(finalCSVFormatHeaderComments6);
        
        assertNull(finalCSVFormatHeaderComments7);
    }
    
    @Test
    public void testFormat3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    
    @Test
    public void testFormat4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.Object[] objectArray = {};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        char[] charArray = new char[11];
        objectArray[1] = ((Object) charArray);
        objectArray[2] = ((Object) charArray);
        objectArray[3] = ((Object) charArray);
        objectArray[4] = ((Object) charArray);
        objectArray[5] = ((Object) charArray);
        objectArray[6] = ((Object) charArray);
        objectArray[7] = ((Object) charArray);
        objectArray[8] = ((Object) charArray);
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "-2147483648\u0000\u0000[C@59519c24\u0000[C@59519c24\u0000[C@59519c24\u0000[C@59519c24\u0000[C@59519c24\u0000[C@59519c24\u0000[C@59519c24\u0000[C@59519c24";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        objectArray[1] = ((Object) header);
        objectArray[2] = ((Object) header);
        objectArray[3] = ((Object) header);
        objectArray[4] = ((Object) header);
        objectArray[5] = ((Object) header);
        objectArray[6] = ((Object) header);
        objectArray[7] = ((Object) header);
        objectArray[8] = ((Object) header);
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "[Ljava.lang.String;@133cf564\u0000[Ljava.lang.String;@133cf564\u0000[Ljava.lang.String;@133cf564\u0000[Ljava.lang.String;@133cf564\u0000[Ljava.lang.String;@133cf564\u0000[Ljava.lang.String;@133cf564\u0000[Ljava.lang.String;@133cf564\u0000[Ljava.lang.String;@133cf564";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.validate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method validate()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (escapeCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == escapeCharacter.charValue()): False}
 * @utbot.executesCondition {@code (commentMarker != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): True}
 * @utbot.executesCondition {@code (escapeCharacter.equals(commentMarker)): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): False}
 * @utbot.executesCondition {@code (header != null): False}
 *  */
    @Test
    public void testValidate_HeaderEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        validateMethod.invoke(cSVFormat, validateMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (escapeCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == escapeCharacter.charValue()): False}
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): True}
 * @utbot.executesCondition {@code (escapeCharacter.equals(commentMarker)): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): False}
 * @utbot.executesCondition {@code (header != null): False}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 *  */
    @Test
    public void testValidate_DelimiterNotEqualsCommentMarkerCharValue() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        validateMethod.invoke(cSVFormat, validateMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): True}
 * @utbot.executesCondition {@code (quoteMode == QuoteMode.NONE): False}
 * @utbot.executesCondition {@code (header != null): True}
 * @utbot.iterates iterate the loop {@code for(final String hdr: header)} once
 *  */
    @Test
    public void testValidate_DupCheckAdd() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '@');
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        validateMethod.invoke(cSVFormat, validateMethodArguments);
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method validate()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (isLineBreak(delimiter)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(delimiter)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_7() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (isLineBreak(delimiter)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(delimiter)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_8() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (isLineBreak(delimiter)): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == quoteCharacter.charValue()): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: quoteCharacter != null && delimiter == quoteCharacter.charValue()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_4() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (isLineBreak(delimiter)): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == escapeCharacter.charValue()): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: escapeCharacter != null && delimiter == escapeCharacter.charValue()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (isLineBreak(delimiter)): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == escapeCharacter.charValue()): False}
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): True}
 * @utbot.executesCondition {@code (escapeCharacter.equals(commentMarker)): True}
 * @utbot.invokes {@link java.lang.Character#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: escapeCharacter != null && escapeCharacter.equals(commentMarker)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_3() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (isLineBreak(delimiter)): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == quoteCharacter.charValue()): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (quoteCharacter.equals(commentMarker)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: quoteCharacter != null && quoteCharacter.equals(commentMarker)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_6() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (isLineBreak(delimiter)): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: commentMarker != null && delimiter == commentMarker.charValue()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_1() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (isLineBreak(delimiter)): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): True}
 * @utbot.executesCondition {@code (quoteMode == QuoteMode.NONE): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: escapeCharacter == null && quoteMode == QuoteMode.NONE
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_2() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '@');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (isLineBreak(delimiter)): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == quoteCharacter.charValue()): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (quoteCharacter.equals(commentMarker)): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): True}
 * @utbot.executesCondition {@code (quoteMode == QuoteMode.NONE): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: escapeCharacter == null && quoteMode == QuoteMode.NONE
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_5() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '@');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method validate()
    
    @Test
    public void testValidate1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        validateMethod.invoke(cSVFormat, validateMethodArguments);
    }
    
    @Test
    public void testValidate2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u8000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        validateMethod.invoke(cSVFormat, validateMethodArguments);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method validate()
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidate3() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0002');
        Character quoteCharacter = '\u0001';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidate4() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {null, null, null, null, null, null, null, null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidate5() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = new java.lang.String[10];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidate6() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = new java.lang.String[10];
        String string = "";
        header[0] = string;
        String string1 = "";
        header[1] = string1;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidate7() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = new java.lang.String[10];
        String string = "";
        header[0] = string;
        header[1] = string;
        String string1 = "";
        header[2] = string1;
        header[3] = string1;
        header[4] = string1;
        header[5] = string1;
        header[6] = string1;
        header[7] = string1;
        header[8] = string1;
        header[9] = string1;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        try {
            validateMethod.invoke(cSVFormat, validateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.print
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method print(java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Appendable)}
 * @utbot.returnsFrom {@code return new CSVPrinter(out, this);}
 *  */
    @Test
    public void testPrint_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        StringBuffer stringBuffer = new StringBuffer("");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringBufferType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", stringBufferType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = stringBuffer;
        CSVPrinter actual = ((CSVPrinter) printMethod.invoke(cSVFormat, printMethodArguments));
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        StringBuffer out = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[16];
        setField(out, "java.lang.AbstractStringBuilder", "value", value);
        setField(out, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        String actualOutToStringCache = ((String) getFieldValue(actualOut, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutToStringCache);
        
        byte[] expectedOutValue = ((byte[]) getFieldValue(expectedOut, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutValue = ((byte[]) getFieldValue(actualOut, "java.lang.AbstractStringBuilder", "value"));
        int expectedOutValueSize = expectedOutValue.length;
        assertEquals(expectedOutValueSize, actualOutValue.length);
        assertArrayEquals(expectedOutValue, actualOutValue);
        
        byte expectedOutCoder = ((Byte) getFieldValue(expectedOut, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutCoder = ((Byte) getFieldValue(actualOut, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedOutCoder, actualOutCoder);
        
        int expectedOutCount = ((Integer) getFieldValue(expectedOut, "java.lang.AbstractStringBuilder", "count"));
        int actualOutCount = ((Integer) getFieldValue(actualOut, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedOutCount, actualOutCount);
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Appendable)}
 * @utbot.returnsFrom {@code return new CSVPrinter(out, this);}
 *  */
    @Test
    public void testPrint_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        StringBuffer stringBuffer = new StringBuffer("");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringBufferType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", stringBufferType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = stringBuffer;
        CSVPrinter actual = ((CSVPrinter) printMethod.invoke(cSVFormat, printMethodArguments));
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        StringBuffer out = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        byte[] value = new byte[16];
        setField(out, "java.lang.AbstractStringBuilder", "value", value);
        setField(out, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        String actualOutToStringCache = ((String) getFieldValue(actualOut, "java.lang.StringBuffer", "toStringCache"));
        assertNull(actualOutToStringCache);
        
        byte[] expectedOutValue = ((byte[]) getFieldValue(expectedOut, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutValue = ((byte[]) getFieldValue(actualOut, "java.lang.AbstractStringBuilder", "value"));
        int expectedOutValueSize = expectedOutValue.length;
        assertEquals(expectedOutValueSize, actualOutValue.length);
        assertArrayEquals(expectedOutValue, actualOutValue);
        
        byte expectedOutCoder = ((Byte) getFieldValue(expectedOut, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutCoder = ((Byte) getFieldValue(actualOut, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedOutCoder, actualOutCoder);
        
        int expectedOutCount = ((Integer) getFieldValue(expectedOut, "java.lang.AbstractStringBuilder", "count"));
        int actualOutCount = ((Integer) getFieldValue(actualOut, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedOutCount, actualOutCount);
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method print(java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Appendable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVPrinter(out, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrint_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.print(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method print(java.lang.Appendable)
    
    @Test
    public void testPrint1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = new java.lang.String[8];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringBuilderType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", stringBuilderType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = stringBuilder;
        CSVPrinter actual = ((CSVPrinter) printMethod.invoke(cSVFormat, printMethodArguments));
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        StringBuilder out = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        byte[] value = new byte[16];
        setField(out, "java.lang.AbstractStringBuilder", "value", value);
        setField(out, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(out, "java.lang.AbstractStringBuilder", "count", 7);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        byte[] expectedOutValue = ((byte[]) getFieldValue(expectedOut, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualOutValue = ((byte[]) getFieldValue(actualOut, "java.lang.AbstractStringBuilder", "value"));
        int expectedOutValueSize = expectedOutValue.length;
        assertEquals(expectedOutValueSize, actualOutValue.length);
        assertArrayEquals(expectedOutValue, actualOutValue);
        
        byte expectedOutCoder = ((Byte) getFieldValue(expectedOut, "java.lang.AbstractStringBuilder", "coder"));
        byte actualOutCoder = ((Byte) getFieldValue(actualOut, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedOutCoder, actualOutCoder);
        
        int expectedOutCount = ((Integer) getFieldValue(expectedOut, "java.lang.AbstractStringBuilder", "count"));
        int actualOutCount = ((Integer) getFieldValue(actualOut, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedOutCount, actualOutCount);
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader1 = ((String) get(cSVFormatHeader, 1));
        java.lang.String[] cSVFormatHeader1 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader2 = ((String) get(cSVFormatHeader1, 2));
        java.lang.String[] cSVFormatHeader2 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader3 = ((String) get(cSVFormatHeader2, 3));
        java.lang.String[] cSVFormatHeader3 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader4 = ((String) get(cSVFormatHeader3, 4));
        java.lang.String[] cSVFormatHeader4 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader5 = ((String) get(cSVFormatHeader4, 5));
        java.lang.String[] cSVFormatHeader5 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader6 = ((String) get(cSVFormatHeader5, 6));
        java.lang.String[] cSVFormatHeader6 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader7 = ((String) get(cSVFormatHeader6, 7));
        
        assertNull(finalCSVFormatHeader1);
        
        assertNull(finalCSVFormatHeader2);
        
        assertNull(finalCSVFormatHeader3);
        
        assertNull(finalCSVFormatHeader4);
        
        assertNull(finalCSVFormatHeader5);
        
        assertNull(finalCSVFormatHeader6);
        
        assertNull(finalCSVFormatHeader7);
    }
    
    @Test
    public void testPrint2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        
        CSVPrinter actual = cSVFormat.print(anonymousWriter);
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", anonymousWriter);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        boolean actualOutClosed = ((Boolean) getFieldValue(actualOut, "java.io.Writer$1", "closed"));
        assertFalse(actualOutClosed);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
    }
    
    @Test
    public void testPrint3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Writer anonymousWriter = ((Writer) createInstance("java.io.Writer$1"));
        
        CSVPrinter actual = cSVFormat.print(anonymousWriter);
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", anonymousWriter);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        boolean actualOutClosed = ((Boolean) getFieldValue(actualOut, "java.io.Writer$1", "closed"));
        assertFalse(actualOutClosed);
        
        char[] actualOutWriteBuffer = ((char[]) getFieldValue(actualOut, "java.io.Writer", "writeBuffer"));
        assertNull(actualOutWriteBuffer);
        
        Object actualOutLock = getFieldValue(actualOut, "java.io.Writer", "lock");
        assertNull(actualOutLock);
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    
    @Test
    public void testPrint4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        
        CSVPrinter actual = cSVFormat.print(printStream);
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", printStream);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        boolean actualOutAutoFlush = ((Boolean) getFieldValue(actualOut, "java.io.PrintStream", "autoFlush"));
        assertFalse(actualOutAutoFlush);
        
        boolean actualOutTrouble = ((Boolean) getFieldValue(actualOut, "java.io.PrintStream", "trouble"));
        assertTrue(actualOutTrouble);
        
        Formatter actualOutFormatter = ((Formatter) getFieldValue(actualOut, "java.io.PrintStream", "formatter"));
        assertNull(actualOutFormatter);
        
        BufferedWriter actualOutTextOut = ((BufferedWriter) getFieldValue(actualOut, "java.io.PrintStream", "textOut"));
        assertNull(actualOutTextOut);
        
        OutputStreamWriter actualOutCharOut = ((OutputStreamWriter) getFieldValue(actualOut, "java.io.PrintStream", "charOut"));
        assertNull(actualOutCharOut);
        
        boolean actualOutClosing = ((Boolean) getFieldValue(actualOut, "java.io.PrintStream", "closing"));
        assertFalse(actualOutClosing);
        
        OutputStream actualOutOut = ((OutputStream) getFieldValue(actualOut, "java.io.FilterOutputStream", "out"));
        assertNull(actualOutOut);
        
        boolean actualOutClosed = ((Boolean) getFieldValue(actualOut, "java.io.FilterOutputStream", "closed"));
        assertFalse(actualOutClosed);
        
        Object actualOutCloseLock = getFieldValue(actualOut, "java.io.FilterOutputStream", "closeLock");
        assertNull(actualOutCloseLock);
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testPrint5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Object byteBufferAsCharBufferRB = createInstance("java.nio.ByteBufferAsCharBufferRB");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteBufferAsCharBufferRBType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", byteBufferAsCharBufferRBType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = byteBufferAsCharBufferRB;
        CSVPrinter actual = ((CSVPrinter) printMethod.invoke(cSVFormat, printMethodArguments));
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", byteBufferAsCharBufferRB);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        ByteBuffer actualOutBb = ((ByteBuffer) getFieldValue(actualOut, "java.nio.ByteBufferAsCharBufferB", "bb"));
        assertNull(actualOutBb);
        
        char[] actualOutHb = ((char[]) getFieldValue(actualOut, "java.nio.CharBuffer", "hb"));
        assertNull(actualOutHb);
        
        int expectedOutOffset = ((Integer) getFieldValue(expectedOut, "java.nio.CharBuffer", "offset"));
        int actualOutOffset = ((Integer) getFieldValue(actualOut, "java.nio.CharBuffer", "offset"));
        assertEquals(expectedOutOffset, actualOutOffset);
        
        boolean actualOutIsReadOnly = ((Boolean) getFieldValue(actualOut, "java.nio.CharBuffer", "isReadOnly"));
        assertFalse(actualOutIsReadOnly);
        
        int expectedOutMark = ((Integer) getFieldValue(expectedOut, "java.nio.Buffer", "mark"));
        int actualOutMark = ((Integer) getFieldValue(actualOut, "java.nio.Buffer", "mark"));
        assertEquals(expectedOutMark, actualOutMark);
        
        int expectedOutPosition = ((Integer) getFieldValue(expectedOut, "java.nio.Buffer", "position"));
        int actualOutPosition = ((Integer) getFieldValue(actualOut, "java.nio.Buffer", "position"));
        assertEquals(expectedOutPosition, actualOutPosition);
        
        int expectedOutLimit = ((Integer) getFieldValue(expectedOut, "java.nio.Buffer", "limit"));
        int actualOutLimit = ((Integer) getFieldValue(actualOut, "java.nio.Buffer", "limit"));
        assertEquals(expectedOutLimit, actualOutLimit);
        
        int expectedOutCapacity = ((Integer) getFieldValue(expectedOut, "java.nio.Buffer", "capacity"));
        int actualOutCapacity = ((Integer) getFieldValue(actualOut, "java.nio.Buffer", "capacity"));
        assertEquals(expectedOutCapacity, actualOutCapacity);
        
        long expectedOutAddress = ((Long) getFieldValue(expectedOut, "java.nio.Buffer", "address"));
        long actualOutAddress = ((Long) getFieldValue(actualOut, "java.nio.Buffer", "address"));
        assertEquals(expectedOutAddress, actualOutAddress);
        
        MemorySegmentProxy actualOutSegment = ((MemorySegmentProxy) getFieldValue(actualOut, "java.nio.Buffer", "segment"));
        assertNull(actualOutSegment);
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method print(java.lang.Appendable)
    
    @Test
    public void testPrint6() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = new java.lang.String[1];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Object directCharBufferRS = createInstance("java.nio.DirectCharBufferRS");
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.DirectCharBufferRS.put(DirectCharBufferRS.java:358)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:2046)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:267)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:277)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:141)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:131)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:394)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:77)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:760) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class directCharBufferRSType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", directCharBufferRSType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = directCharBufferRS;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint7() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.println(CSVPrinter.java:354)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:396)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:77)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:760) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", printWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = printWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint8() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:77)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printComment(CSVPrinter.java:322)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:72)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:760) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", printWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = printWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint9() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = new java.lang.String[8];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:77)
            java.base/java.io.StringWriter.append(StringWriter.java:210)
            java.base/java.io.StringWriter.append(StringWriter.java:41)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:137)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:131)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:394)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:77)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:760) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", stringWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = stringWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint10() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = new java.lang.String[8];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printComment(CSVPrinter.java:322)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:72)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:760) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", printWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = printWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint11() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:145)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:131)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:394)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:77)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:760) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", printWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = printWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint12() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:237)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:229)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:76)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:145)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:131)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:394)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:77)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:760) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", outputStreamWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = outputStreamWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for print
    
    public void testPrint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.Reader)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#parse(java.io.Reader)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVParser(in, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.parse(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withDelimiter
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withDelimiter(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(delimiter)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withDelimiter('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(delimiter)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withDelimiter('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withDelimiter(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\uFFDF';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withDelimiter(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withDelimiter(' ');
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withDelimiter(char)
    
    @Test
    public void testWithDelimiter1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithDelimiter3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[1] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithDelimiter7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithDelimiter8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithDelimiter11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withDelimiter(char)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withDelimiter('\u0001');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withDelimiter('\u0001');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withDelimiter('\u0001');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHeader()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getHeader()}
 * @utbot.executesCondition {@code (header != null): True}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return header != null ? header.clone() : null;}
 *  */
    @Test
    public void testGetHeader_HeaderNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        java.lang.String[] actual = cSVFormat.getHeader();
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getHeader()}
 * @utbot.executesCondition {@code (header != null): False}
 * @utbot.returnsFrom {@code return header != null ? header.clone() : null;}
 *  */
    @Test
    public void testGetHeader_HeaderEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        java.lang.String[] actual = cSVFormat.getHeader();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.toStringArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringArray([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#toStringArray(java.lang.Object[])}
 * @utbot.executesCondition {@code (values == null): False}
 * @utbot.returnsFrom {@code return strings;}
 *  */
    @Test
    public void testToStringArray_ValuesNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.Object[] objectArray = {};
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method toStringArrayMethod = cSVFormatClazz.getDeclaredMethod("toStringArray", objectArrayType);
        toStringArrayMethod.setAccessible(true);
        java.lang.Object[] toStringArrayMethodArguments = new java.lang.Object[1];
        toStringArrayMethodArguments[0] = ((Object) objectArray);
        java.lang.String[] actual = ((java.lang.String[]) toStringArrayMethod.invoke(cSVFormat, toStringArrayMethodArguments));
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#toStringArray(java.lang.Object[])}
 * @utbot.executesCondition {@code (values == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < values.length; i++)} once
 * @utbot.returnsFrom {@code return strings;}
 *  */
    @Test
    public void testToStringArray_ValueEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.Object[] objectArray = {null};
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method toStringArrayMethod = cSVFormatClazz.getDeclaredMethod("toStringArray", objectArrayType);
        toStringArrayMethod.setAccessible(true);
        java.lang.Object[] toStringArrayMethodArguments = new java.lang.Object[1];
        toStringArrayMethodArguments[0] = ((Object) objectArray);
        java.lang.String[] actual = ((java.lang.String[]) toStringArrayMethod.invoke(cSVFormat, toStringArrayMethodArguments));
        
        java.lang.String[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#toStringArray(java.lang.Object[])}
 * @utbot.executesCondition {@code (values == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < values.length; i++)} once
 * @utbot.returnsFrom {@code return strings;}
 *  */
    @Test
    public void testToStringArray_ValueNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method toStringArrayMethod = cSVFormatClazz.getDeclaredMethod("toStringArray", objectArrayType);
        toStringArrayMethod.setAccessible(true);
        java.lang.Object[] toStringArrayMethodArguments = new java.lang.Object[1];
        toStringArrayMethodArguments[0] = ((Object) objectArray);
        java.lang.String[] actual = ((java.lang.String[]) toStringArrayMethod.invoke(cSVFormat, toStringArrayMethodArguments));
        
        java.lang.String[] expected = new java.lang.String[1];
        String string = "0";
        expected[0] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#toStringArray(java.lang.Object[])}
 * @utbot.executesCondition {@code (values == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToStringArray_ValuesEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method toStringArrayMethod = cSVFormatClazz.getDeclaredMethod("toStringArray", objectArrayType);
        toStringArrayMethod.setAccessible(true);
        java.lang.Object[] toStringArrayMethodArguments = new java.lang.Object[1];
        toStringArrayMethodArguments[0] = ((Object) null);
        java.lang.String[] actual = ((java.lang.String[]) toStringArrayMethod.invoke(cSVFormat, toStringArrayMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toStringArray([Ljava.lang.Object;)
    
    @Test
    public void testToStringArray1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        java.lang.String[] stringArray = {null, null, null};
        objectArray[2] = ((Object) stringArray);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method toStringArrayMethod = cSVFormatClazz.getDeclaredMethod("toStringArray", objectArrayType);
        toStringArrayMethod.setAccessible(true);
        java.lang.Object[] toStringArrayMethodArguments = new java.lang.Object[1];
        toStringArrayMethodArguments[0] = ((Object) objectArray);
        java.lang.String[] actual = ((java.lang.String[]) toStringArrayMethod.invoke(cSVFormat, toStringArrayMethodArguments));
        
        java.lang.String[] expected = new java.lang.String[3];
        String string = "-2147483648";
        expected[0] = string;
        String string1 = "[Ljava.lang.String;@3bbdad20";
        expected[2] = string1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Object object = objectArray[2];
        String finalObjectArray20 = ((String) get(object, 0));
        Object object1 = objectArray[2];
        String finalObjectArray21 = ((String) get(object1, 1));
        Object object2 = objectArray[2];
        String finalObjectArray22 = ((String) get(object2, 2));
        
        assertNull(finalObjectArray20);
        
        assertNull(finalObjectArray21);
        
        assertNull(finalObjectArray22);
    }
    
    @Test
    public void testToStringArray2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.Object[] objectArray = new java.lang.Object[3];
        Integer integer = 0;
        objectArray[1] = ((Object) integer);
        java.lang.String[] stringArray = {null, null, null};
        objectArray[2] = ((Object) stringArray);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method toStringArrayMethod = cSVFormatClazz.getDeclaredMethod("toStringArray", objectArrayType);
        toStringArrayMethod.setAccessible(true);
        java.lang.Object[] toStringArrayMethodArguments = new java.lang.Object[1];
        toStringArrayMethodArguments[0] = ((Object) objectArray);
        java.lang.String[] actual = ((java.lang.String[]) toStringArrayMethod.invoke(cSVFormat, toStringArrayMethodArguments));
        
        java.lang.String[] expected = new java.lang.String[3];
        String string = "0";
        expected[1] = string;
        String string1 = "[Ljava.lang.String;@66845a5f";
        expected[2] = string1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Object object = objectArray[2];
        String finalObjectArray20 = ((String) get(object, 0));
        Object object1 = objectArray[2];
        String finalObjectArray21 = ((String) get(object1, 1));
        Object object2 = objectArray[2];
        String finalObjectArray22 = ((String) get(object2, 2));
        
        assertNull(finalObjectArray20);
        
        assertNull(finalObjectArray21);
        
        assertNull(finalObjectArray22);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withHeader(java.sql.ResultSet)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.returnsFrom {@code return withHeader(resultSet != null ? resultSet.getMetaData() : null);}
 *  */
    @Test
    public void testWithHeader_ReturnWithHeader_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.returnsFrom {@code return withHeader(resultSet != null ? resultSet.getMetaData() : null);}
 *  */
    @Test
    public void testWithHeader_ReturnWithHeader() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.returnsFrom {@code return withHeader(resultSet != null ? resultSet.getMetaData() : null);}
 *  */
    @Test
    public void testWithHeader_ReturnWithHeader_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader(java.sql.ResultSet)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withHeader(java.sql.ResultSet)
    
    @Test
    public void testWithHeader1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithHeader3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\b');
        Character quoteCharacter = '\u0001';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\b');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithHeader7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[3];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[3];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        java.lang.String[] cSVFormatHeaderComments1 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments2 = ((String) get(cSVFormatHeaderComments1, 2));
        
        assertNull(finalCSVFormatHeaderComments1);
        
        assertNull(finalCSVFormatHeaderComments2);
    }
    
    @Test
    public void testWithHeader8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[3];
        String string = "";
        headerComments[1] = string;
        headerComments[2] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[3];
        headerComments1[1] = string;
        headerComments1[2] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithHeader9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0002');
        Character quoteCharacter = '\u0001';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSet) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0002');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader(java.sql.ResultSet)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withHeader(java.sql.ResultSetMetaData)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithHeader_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithHeader_Return_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithHeader_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithHeader_Return_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader(java.sql.ResultSetMetaData)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_71() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_81() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_91() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, labels, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withHeader(java.sql.ResultSetMetaData)
    
    @Test
    public void testWithHeader22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithHeader24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0002');
        Character quoteCharacter = '\u0001';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0002');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[3];
        String string = "";
        headerComments[0] = string;
        headerComments[2] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[3];
        headerComments1[0] = string;
        headerComments1[2] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithHeader26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[3];
        String string = "";
        headerComments[2] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[3];
        headerComments1[2] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        java.lang.String[] cSVFormatHeaderComments1 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments1, 1));
        
        assertNull(finalCSVFormatHeaderComments0);
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader(java.sql.ResultSetMetaData)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '\u0001';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeader
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_62() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_82() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_52() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_72() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_92() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '\uFFDF';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withHeader([Ljava.lang.String;)
    
    @Test
    public void testWithHeader35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((java.lang.String[]) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithHeader39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithHeader40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((java.lang.String[]) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0100');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0100');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((java.lang.String[]) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithHeader46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((java.lang.String[]) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((java.lang.String[]) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader50() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((java.lang.String[]) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((java.lang.String[]) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader52() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withHeader(((java.lang.String[]) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader([Ljava.lang.String;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader53() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader54() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader55() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader56() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader57() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader58() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader59() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader60() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader62() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader63() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader64() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader65() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader66() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withRecordSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withRecordSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithRecordSeparator_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithRecordSeparator_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withRecordSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '\uFFDF';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withRecordSeparator(java.lang.String)
    
    @Test
    public void testWithRecordSeparator1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        String string = "";
        
        CSVFormat actual = cSVFormat.withRecordSeparator(string);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "recordSeparator", string);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithRecordSeparator3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithRecordSeparator9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u2000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        String string = "";
        
        CSVFormat actual = cSVFormat.withRecordSeparator(string);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u2000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "recordSeparator", string);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithRecordSeparator15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withRecordSeparator(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        String string = "";
        
        cSVFormat.withRecordSeparator(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0010');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        String string = "";
        
        cSVFormat.withRecordSeparator(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withRecordSeparator
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withRecordSeparator(char)
    
    @Test
    public void testWithRecordSeparator33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        CSVFormat actual = cSVFormat.withRecordSeparator('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        String recordSeparator = "\u0000";
        setField(expected, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuote
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withQuote(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithQuote_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithQuote_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withQuote(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(quoteChar)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\r';
        
        cSVFormat.withQuote(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(quoteChar)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\n';
        
        cSVFormat.withQuote(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withQuote(((Character) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuote
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withQuote(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.returnsFrom {@code return withQuote(Character.valueOf(quoteChar));}
 *  */
    @Test
    public void testWithQuote_CSVFormatWithQuote() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.MINIMAL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withQuote('_');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withQuote(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withQuote('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withQuote('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote('!');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        cSVFormat.withQuote(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withQuote('!');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withNullString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withNullString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithNullString_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withNullString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '\uFFDF';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withNullString(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withEscape(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithEscape_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithEscape_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithEscape_Return_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withEscape(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(escape)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\r';
        
        cSVFormat.withEscape(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(escape)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\n';
        
        cSVFormat.withEscape(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withEscape(((Character) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withEscape(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.returnsFrom {@code return withEscape(Character.valueOf(escape));}
 *  */
    @Test
    public void testWithEscape_CSVFormatWithEscape() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withEscape('_');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = '_';
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withEscape(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withEscape('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withEscape('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withEscape(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withEscape(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        cSVFormat.withEscape(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withEscape(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuoteMode
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withQuoteMode(org.apache.commons.csv.QuoteMode)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        QuoteMode quoteMode = QuoteMode.NONE;
        
        cSVFormat.withQuoteMode(quoteMode);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuoteMode(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getCommentMarker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCommentMarker()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getCommentMarker()}
 * @utbot.returnsFrom {@code return commentMarker;}
 *  */
    @Test
    public void testGetCommentMarker_ReturnCommentMarker() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        Character actual = cSVFormat.getCommentMarker();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getEscapeCharacter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEscapeCharacter()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getEscapeCharacter()}
 * @utbot.returnsFrom {@code return escapeCharacter;}
 *  */
    @Test
    public void testGetEscapeCharacter_ReturnEscapeCharacter() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        Character actual = cSVFormat.getEscapeCharacter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getQuoteMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQuoteMode()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getQuoteMode()}
 * @utbot.returnsFrom {@code return quoteMode;}
 *  */
    @Test
    public void testGetQuoteMode_ReturnQuoteMode() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        QuoteMode actual = cSVFormat.getQuoteMode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getHeaderComments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHeaderComments()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getHeaderComments()}
 * @utbot.executesCondition {@code (headerComments != null): True}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return headerComments != null ? headerComments.clone() : null;}
 *  */
    @Test
    public void testGetHeaderComments_HeaderCommentsNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        java.lang.String[] actual = cSVFormat.getHeaderComments();
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getHeaderComments()}
 * @utbot.executesCondition {@code (headerComments != null): False}
 * @utbot.returnsFrom {@code return headerComments != null ? headerComments.clone() : null;}
 *  */
    @Test
    public void testGetHeaderComments_HeaderCommentsEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        java.lang.String[] actual = cSVFormat.getHeaderComments();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isCommentMarkerSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCommentMarkerSet()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isCommentMarkerSet()}
 * @utbot.returnsFrom {@code return commentMarker != null;}
 *  */
    @Test
    public void testIsCommentMarkerSet_CommentMarkerEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.isCommentMarkerSet();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isCommentMarkerSet()}
 * @utbot.returnsFrom {@code return commentMarker != null;}
 *  */
    @Test
    public void testIsCommentMarkerSet_CommentMarkerNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        boolean actual = cSVFormat.isCommentMarkerSet();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isLineBreak
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLineBreak(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isLineBreak(char)}
 * @utbot.returnsFrom {@code return c == LF || c == CR;}
 *  */
    @Test
    public void testIsLineBreak_CNotEqualsLFOrCNotEqualsCR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class charType = char.class;
        Method isLineBreakMethod = cSVFormatClazz.getDeclaredMethod("isLineBreak", charType);
        isLineBreakMethod.setAccessible(true);
        java.lang.Object[] isLineBreakMethodArguments = new java.lang.Object[1];
        isLineBreakMethodArguments[0] = ' ';
        boolean actual = ((Boolean) isLineBreakMethod.invoke(null, isLineBreakMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isLineBreak(char)}
 * @utbot.returnsFrom {@code return c == LF || c == CR;}
 *  */
    @Test
    public void testIsLineBreak_CEqualsLFOrCEqualsCR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class charType = char.class;
        Method isLineBreakMethod = cSVFormatClazz.getDeclaredMethod("isLineBreak", charType);
        isLineBreakMethod.setAccessible(true);
        java.lang.Object[] isLineBreakMethodArguments = new java.lang.Object[1];
        isLineBreakMethodArguments[0] = '\n';
        boolean actual = ((Boolean) isLineBreakMethod.invoke(null, isLineBreakMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isLineBreak(char)}
 * @utbot.returnsFrom {@code return c == LF || c == CR;}
 *  */
    @Test
    public void testIsLineBreak_CEqualsLFOrCEqualsCR_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class charType = char.class;
        Method isLineBreakMethod = cSVFormatClazz.getDeclaredMethod("isLineBreak", charType);
        isLineBreakMethod.setAccessible(true);
        java.lang.Object[] isLineBreakMethodArguments = new java.lang.Object[1];
        isLineBreakMethodArguments[0] = '\r';
        boolean actual = ((Boolean) isLineBreakMethod.invoke(null, isLineBreakMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isLineBreak
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLineBreak(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isLineBreak(java.lang.Character)}
 * @utbot.returnsFrom {@code return c != null && isLineBreak(c.charValue());}
 *  */
    @Test
    public void testIsLineBreak_CEqualsNullAndIsLineBreak() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Character character = ' ';
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class characterType = Class.forName("java.lang.Character");
        Method isLineBreakMethod = cSVFormatClazz.getDeclaredMethod("isLineBreak", characterType);
        isLineBreakMethod.setAccessible(true);
        java.lang.Object[] isLineBreakMethodArguments = new java.lang.Object[1];
        isLineBreakMethodArguments[0] = character;
        boolean actual = ((Boolean) isLineBreakMethod.invoke(null, isLineBreakMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isLineBreak(java.lang.Character)}
 * @utbot.returnsFrom {@code return c != null && isLineBreak(c.charValue());}
 *  */
    @Test
    public void testIsLineBreak_CEqualsNullAndIsLineBreak_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class characterType = Class.forName("java.lang.Character");
        Method isLineBreakMethod = cSVFormatClazz.getDeclaredMethod("isLineBreak", characterType);
        isLineBreakMethod.setAccessible(true);
        java.lang.Object[] isLineBreakMethodArguments = new java.lang.Object[1];
        isLineBreakMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isLineBreakMethod.invoke(null, isLineBreakMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isLineBreak(java.lang.Character)}
 * @utbot.returnsFrom {@code return c != null && isLineBreak(c.charValue());}
 *  */
    @Test
    public void testIsLineBreak_CNotEqualsNullAndIsLineBreak() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Character character = '\n';
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class characterType = Class.forName("java.lang.Character");
        Method isLineBreakMethod = cSVFormatClazz.getDeclaredMethod("isLineBreak", characterType);
        isLineBreakMethod.setAccessible(true);
        java.lang.Object[] isLineBreakMethodArguments = new java.lang.Object[1];
        isLineBreakMethodArguments[0] = character;
        boolean actual = ((Boolean) isLineBreakMethod.invoke(null, isLineBreakMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isLineBreak(java.lang.Character)}
 * @utbot.returnsFrom {@code return c != null && isLineBreak(c.charValue());}
 *  */
    @Test
    public void testIsLineBreak_CNotEqualsNullAndIsLineBreak_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Character character = '\r';
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class characterType = Class.forName("java.lang.Character");
        Method isLineBreakMethod = cSVFormatClazz.getDeclaredMethod("isLineBreak", characterType);
        isLineBreakMethod.setAccessible(true);
        java.lang.Object[] isLineBreakMethodArguments = new java.lang.Object[1];
        isLineBreakMethodArguments[0] = character;
        boolean actual = ((Boolean) isLineBreakMethod.invoke(null, isLineBreakMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getDelimiter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDelimiter()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getDelimiter()}
 * @utbot.returnsFrom {@code return delimiter;}
 *  */
    @Test
    public void testGetDelimiter_ReturnDelimiter() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        char actual = cSVFormat.getDelimiter();
        
        assertEquals(' ', actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getNullString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNullString()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getNullString()}
 * @utbot.returnsFrom {@code return nullString;}
 *  */
    @Test
    public void testGetNullString_ReturnNullString() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        String actual = cSVFormat.getNullString();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.newFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newFormat(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#newFormat(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, null, false, false, false);}
 *  */
    @Test
    public void testNewFormat_Return() throws Exception  {
        CSVFormat actual = CSVFormat.newFormat(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newFormat(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#newFormat(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, null, false, false, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_ThrowIllegalArgumentException() {
        CSVFormat.newFormat('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#newFormat(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, null, false, false, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_ThrowIllegalArgumentException_1() {
        CSVFormat.newFormat('\n');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isNullStringSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNullStringSet()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isNullStringSet()}
 * @utbot.returnsFrom {@code return nullString != null;}
 *  */
    @Test
    public void testIsNullStringSet_NullStringEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.isNullStringSet();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isNullStringSet()}
 * @utbot.returnsFrom {@code return nullString != null;}
 *  */
    @Test
    public void testIsNullStringSet_NullStringNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        
        boolean actual = cSVFormat.isNullStringSet();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withCommentMarker
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withCommentMarker(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withCommentMarker('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withCommentMarker('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker(' ');
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withCommentMarker(char)
    
    @Test
    public void testWithCommentMarker1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0001';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithCommentMarker2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0001';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0001';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withCommentMarker('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0001';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withCommentMarker(char)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker('\u0001');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withCommentMarker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withCommentMarker(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithCommentMarker_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 *  */
    @Test
    public void testWithCommentMarker_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withCommentMarker(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(commentMarker)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\r';
        
        cSVFormat.withCommentMarker(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(commentMarker)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\n';
        
        cSVFormat.withCommentMarker(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withCommentMarker(java.lang.Character)
    
    @Test
    public void testWithCommentMarker11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u1000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u1000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithCommentMarker16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        headerComments[0] = recordSeparator;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = recordSeparator;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithCommentMarker23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithCommentMarker25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null, null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        java.lang.String[] cSVFormatHeaderComments1 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments1, 1));
        
        assertNull(finalCSVFormatHeaderComments0);
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithCommentMarker27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withCommentMarker(java.lang.Character)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        headerComments[0] = recordSeparator;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeaderComments
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeaderComments([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeaderComments(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withHeaderComments(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeaderComments(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withHeaderComments([Ljava.lang.Object;)
    
    @Test
    public void testWithHeaderComments1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.Object[] objectArray = {};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "-2147483648";
        headerComments[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {null};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u4000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u4000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u4000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u4000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withHeaderComments(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "0";
        headerComments[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withHeaderComments(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.Object[] objectArray = {null};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withHeaderComments(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.Object[] objectArray = {};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.Object[] objectArray = {};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.Object[] objectArray = {};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Object object = new Object();
        objectArray[1] = object;
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "java.lang.Object@41562d9c";
        headerComments[1] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "-2147483648";
        headerComments[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withHeaderComments(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeaderComments(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeaderComments([Ljava.lang.Object;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '@');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {null};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.Object[] objectArray = {null};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withHeaderComments(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getQuoteCharacter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQuoteCharacter()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getQuoteCharacter()}
 * @utbot.returnsFrom {@code return quoteCharacter;}
 *  */
    @Test
    public void testGetQuoteCharacter_ReturnQuoteCharacter() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        Character actual = cSVFormat.getQuoteCharacter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getRecordSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRecordSeparator()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getRecordSeparator()}
 * @utbot.returnsFrom {@code return recordSeparator;}
 *  */
    @Test
    public void testGetRecordSeparator_ReturnRecordSeparator() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        String actual = cSVFormat.getRecordSeparator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withSkipHeaderRecord
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSkipHeaderRecord()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord()}
 * @utbot.returnsFrom {@code return this.withSkipHeaderRecord(true);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withSkipHeaderRecord(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withSkipHeaderRecord(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withSkipHeaderRecord(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withSkipHeaderRecord(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withSkipHeaderRecord(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withSkipHeaderRecord();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withSkipHeaderRecord()
    
    @Test
    public void testWithSkipHeaderRecord1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithSkipHeaderRecord7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithSkipHeaderRecord11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[1] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithSkipHeaderRecord14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithSkipHeaderRecord17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSkipHeaderRecord()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withSkipHeaderRecord();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withSkipHeaderRecord
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSkipHeaderRecord(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withSkipHeaderRecord(boolean)
    
    @Test
    public void testWithSkipHeaderRecord38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithSkipHeaderRecord45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithSkipHeaderRecord49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord50() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord52() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord53() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord54() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord55() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord56() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord57() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSkipHeaderRecord(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord58() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord59() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord60() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord62() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord63() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord64() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord65() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord66() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord67() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {null, null, null, null, null, null, null, null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord68() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord69() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord70() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord71() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getAllowMissingColumnNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllowMissingColumnNames()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getAllowMissingColumnNames()}
 * @utbot.returnsFrom {@code return allowMissingColumnNames;}
 *  */
    @Test
    public void testGetAllowMissingColumnNames_ReturnAllowMissingColumnNames() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.getAllowMissingColumnNames();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreHeaderCase(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreHeaderCase(boolean)
    
    @Test
    public void testWithIgnoreHeaderCase1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u4000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u4000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreHeaderCase8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreHeaderCase16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreHeaderCase(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u4000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0400');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreHeaderCase()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase()}
 * @utbot.returnsFrom {@code return this.withIgnoreHeaderCase(true);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreHeaderCase(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreHeaderCase(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreHeaderCase(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreHeaderCase(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreHeaderCase(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreHeaderCase();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreHeaderCase()
    
    @Test
    public void testWithIgnoreHeaderCase35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreHeaderCase41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreHeaderCase46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithIgnoreHeaderCase47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null, null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        java.lang.String[] cSVFormatHeaderComments1 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments1, 1));
        
        assertNull(finalCSVFormatHeaderComments0);
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithIgnoreHeaderCase50() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreHeaderCase()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase52() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase53() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase54() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase55() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase56() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase57() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase58() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase59() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase60() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase62() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase63() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase64() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase65() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase66() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase67() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase68() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase69() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getIgnoreHeaderCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIgnoreHeaderCase()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getIgnoreHeaderCase()}
 * @utbot.returnsFrom {@code return ignoreHeaderCase;}
 *  */
    @Test
    public void testGetIgnoreHeaderCase_ReturnIgnoreHeaderCase() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.getIgnoreHeaderCase();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isQuoteCharacterSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isQuoteCharacterSet()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isQuoteCharacterSet()}
 * @utbot.returnsFrom {@code return quoteCharacter != null;}
 *  */
    @Test
    public void testIsQuoteCharacterSet_QuoteCharacterEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.isQuoteCharacterSet();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isQuoteCharacterSet()}
 * @utbot.returnsFrom {@code return quoteCharacter != null;}
 *  */
    @Test
    public void testIsQuoteCharacterSet_QuoteCharacterNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        boolean actual = cSVFormat.isQuoteCharacterSet();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isEscapeCharacterSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEscapeCharacterSet()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isEscapeCharacterSet()}
 * @utbot.returnsFrom {@code return escapeCharacter != null;}
 *  */
    @Test
    public void testIsEscapeCharacterSet_EscapeCharacterEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.isEscapeCharacterSet();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isEscapeCharacterSet()}
 * @utbot.returnsFrom {@code return escapeCharacter != null;}
 *  */
    @Test
    public void testIsEscapeCharacterSet_EscapeCharacterNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        boolean actual = cSVFormat.isEscapeCharacterSet();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getIgnoreEmptyLines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIgnoreEmptyLines()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getIgnoreEmptyLines()}
 * @utbot.returnsFrom {@code return ignoreEmptyLines;}
 *  */
    @Test
    public void testGetIgnoreEmptyLines_ReturnIgnoreEmptyLines() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.getIgnoreEmptyLines();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getSkipHeaderRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSkipHeaderRecord()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getSkipHeaderRecord()}
 * @utbot.returnsFrom {@code return skipHeaderRecord;}
 *  */
    @Test
    public void testGetSkipHeaderRecord_ReturnSkipHeaderRecord() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.getSkipHeaderRecord();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAllowMissingColumnNames()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames()}
 * @utbot.returnsFrom {@code return this.withAllowMissingColumnNames(true);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withAllowMissingColumnNames(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withAllowMissingColumnNames(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withAllowMissingColumnNames(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withAllowMissingColumnNames(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withAllowMissingColumnNames(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withAllowMissingColumnNames(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withAllowMissingColumnNames();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withAllowMissingColumnNames()
    
    @Test
    public void testWithAllowMissingColumnNames1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithAllowMissingColumnNames7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithAllowMissingColumnNames9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[1] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithAllowMissingColumnNames12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithAllowMissingColumnNames16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAllowMissingColumnNames()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAllowMissingColumnNames(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withAllowMissingColumnNames(boolean)
    
    @Test
    public void testWithAllowMissingColumnNames39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithAllowMissingColumnNames46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithAllowMissingColumnNames50() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames52() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames53() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames54() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames55() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames56() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames57() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames58() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAllowMissingColumnNames(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames59() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames60() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames62() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames63() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames64() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames65() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames66() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames67() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames68() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames69() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames70() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames71() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames72() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreSurroundingSpaces()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces()}
 * @utbot.returnsFrom {@code return this.withIgnoreSurroundingSpaces(true);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreSurroundingSpaces(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreSurroundingSpaces(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreSurroundingSpaces(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreSurroundingSpaces(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreSurroundingSpaces(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreSurroundingSpaces()
    
    @Test
    public void testWithIgnoreSurroundingSpaces1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[1] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreSurroundingSpaces()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    @Test
    public void testWithIgnoreSurroundingSpaces38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces50() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces52() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces53() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces54() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces55() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces56() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces57() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces58() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces59() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces60() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces62() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces63() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces64() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces65() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces66() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces67() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces68() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces69() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces70() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces71() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces72() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreEmptyLines(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreEmptyLines(boolean)
    
    @Test
    public void testWithIgnoreEmptyLines1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreEmptyLines8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreEmptyLines12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreEmptyLines(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreEmptyLines()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines()}
 * @utbot.returnsFrom {@code return this.withIgnoreEmptyLines(true);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreEmptyLines(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreEmptyLines(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreEmptyLines(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreEmptyLines(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.withIgnoreEmptyLines(true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreEmptyLines();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreEmptyLines()
    
    @Test
    public void testWithIgnoreEmptyLines34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreEmptyLines40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreEmptyLines44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[1] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreEmptyLines47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        java.lang.String[] headerComments1 = new java.lang.String[2];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments1 = ((String) get(cSVFormatHeaderComments, 1));
        
        assertNull(finalCSVFormatHeaderComments1);
    }
    
    @Test
    public void testWithIgnoreEmptyLines50() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreEmptyLines()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines52() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines53() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines54() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines55() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines56() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines57() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines58() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines59() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines60() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines62() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines63() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines64() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines65() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines66() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines67() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines68() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines69() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines70() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getIgnoreSurroundingSpaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIgnoreSurroundingSpaces()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getIgnoreSurroundingSpaces()}
 * @utbot.returnsFrom {@code return ignoreSurroundingSpaces;}
 *  */
    @Test
    public void testGetIgnoreSurroundingSpaces_ReturnIgnoreSurroundingSpaces() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.getIgnoreSurroundingSpaces();
        
        assertFalse(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields965719546576400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields965719546576400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass965719546582500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields965719546576400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass965719546582500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields965719546889600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields965719546889600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass965719546890800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields965719546889600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass965719546890800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

