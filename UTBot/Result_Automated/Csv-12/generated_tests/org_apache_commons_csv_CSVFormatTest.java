package org.apache.commons.csv;

import org.junit.Test;
import java.lang.reflect.Method;
import java.io.PrintStream;
import java.util.Formatter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import sun.nio.cs.StreamEncoder;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.io.StringWriter;
import java.io.PrintWriter;
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
        short[] shortArray = {};
        
        boolean actual = cSVFormat.equals(shortArray);
        
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
        Character escapeCharacter = '\u0100';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> Escape=<\u0100> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> QuoteChar=<\u0000> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> CommentStart=<\u0000> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> EmptyLines:ignored SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> RecordSeparator=<> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> SurroundingSpaces:ignored SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code ((quoteMode == null)): False}
 * @utbot.executesCondition {@code ((quoteCharacter == null)): True}
 * @utbot.executesCondition {@code ((commentMarker == null)): True}
 * @utbot.executesCondition {@code ((escapeCharacter == null)): True}
 * @utbot.executesCondition {@code ((nullString == null)): True}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): True}
 * @utbot.executesCondition {@code (ignoreEmptyLines): False}
 * @utbot.executesCondition {@code (skipHeaderRecord): True}
 * @utbot.executesCondition {@code ((recordSeparator == null)): True}
 * @utbot.invokes {@link org.apache.commons.csv.QuoteMode#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_QuoteModeNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(-1220045059, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code ((quoteMode == null)): True}
 * @utbot.executesCondition {@code ((quoteCharacter == null)): True}
 * @utbot.executesCondition {@code ((commentMarker == null)): True}
 * @utbot.executesCondition {@code ((escapeCharacter == null)): True}
 * @utbot.executesCondition {@code ((nullString == null)): True}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): False}
 * @utbot.executesCondition {@code (ignoreEmptyLines): True}
 * @utbot.executesCondition {@code (skipHeaderRecord): True}
 * @utbot.executesCondition {@code ((recordSeparator == null)): False}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_RecordSeparatorNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(-358534732, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code ((quoteMode == null)): True}
 * @utbot.executesCondition {@code ((quoteCharacter == null)): True}
 * @utbot.executesCondition {@code ((commentMarker == null)): True}
 * @utbot.executesCondition {@code ((escapeCharacter == null)): True}
 * @utbot.executesCondition {@code ((nullString == null)): False}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): True}
 * @utbot.executesCondition {@code (ignoreEmptyLines): False}
 * @utbot.executesCondition {@code (skipHeaderRecord): False}
 * @utbot.executesCondition {@code ((recordSeparator == null)): True}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_NullStringNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(-363891346, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code ((quoteMode == null)): True}
 * @utbot.executesCondition {@code ((quoteCharacter == null)): False}
 * @utbot.executesCondition {@code ((commentMarker == null)): True}
 * @utbot.executesCondition {@code ((escapeCharacter == null)): True}
 * @utbot.executesCondition {@code ((nullString == null)): True}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): False}
 * @utbot.executesCondition {@code (ignoreEmptyLines): False}
 * @utbot.executesCondition {@code (skipHeaderRecord): True}
 * @utbot.executesCondition {@code ((recordSeparator == null)): True}
 * @utbot.invokes {@link java.lang.Character#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_QuoteCharacterNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1932643342, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code ((quoteMode == null)): True}
 * @utbot.executesCondition {@code ((quoteCharacter == null)): True}
 * @utbot.executesCondition {@code ((commentMarker == null)): False}
 * @utbot.executesCondition {@code ((escapeCharacter == null)): True}
 * @utbot.executesCondition {@code ((nullString == null)): True}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): True}
 * @utbot.executesCondition {@code (ignoreEmptyLines): True}
 * @utbot.executesCondition {@code (skipHeaderRecord): False}
 * @utbot.executesCondition {@code ((recordSeparator == null)): True}
 * @utbot.invokes {@link java.lang.Character#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_CommentMarkerNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(-428714220, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code ((quoteMode == null)): True}
 * @utbot.executesCondition {@code ((quoteCharacter == null)): True}
 * @utbot.executesCondition {@code ((commentMarker == null)): True}
 * @utbot.executesCondition {@code ((escapeCharacter == null)): False}
 * @utbot.executesCondition {@code ((nullString == null)): True}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): False}
 * @utbot.executesCondition {@code (ignoreEmptyLines): True}
 * @utbot.executesCondition {@code (skipHeaderRecord): False}
 * @utbot.executesCondition {@code ((recordSeparator == null)): True}
 * @utbot.invokes {@link java.lang.Character#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_EscapeCharacterNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(-2023182246, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.format
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method format([Ljava.lang.Object;)
    
    @Test
    public void testFormat1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 17;
        objectArray[0] = ((Object) integer);
        String string = "";
        objectArray[1] = ((Object) string);
        objectArray[2] = ((Object) string);
        objectArray[3] = ((Object) string);
        objectArray[4] = ((Object) string);
        objectArray[5] = ((Object) string);
        objectArray[6] = ((Object) string);
        objectArray[7] = ((Object) string);
        objectArray[8] = ((Object) string);
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "17";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = new java.lang.Object[17];
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.Object[] objectArray = {};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "-2147483648";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '-';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "--2147483648";
        
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "-2147483648";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = new Object();
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        objectArray[7] = object;
        objectArray[8] = object;
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "java.lang.Object@19ae4e5d\u0000java.lang.Object@19ae4e5d\u0000java.lang.Object@19ae4e5d\u0000java.lang.Object@19ae4e5d\u0000java.lang.Object@19ae4e5d\u0000java.lang.Object@19ae4e5d\u0000java.lang.Object@19ae4e5d\u0000java.lang.Object@19ae4e5d";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "\u0000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
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
    public void testFormat12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.Object[] objectArray = new java.lang.Object[17];
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "\n";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "n\u0000\u0000n\u0000\u0000n\u0000\u0000n\u0000\u0000n\u0000\u0000n\u0000\u0000n\u0000\u0000n\u0000\u0000n";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "\u0001\u0000\u0000\u0000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method format([Ljava.lang.Object;)
    
    @Test
    public void testFormat15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 0;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:141)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:198)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVFormat.format(CSVFormat.java:454) */
        cSVFormat.format(objectArray);
    }
    
    @Test
    public void testFormat16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:141)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:198)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.format(CSVFormat.java:454) */
        cSVFormat.format(objectArray);
    }
    
    @Test
    public void testFormat17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.Object[] objectArray = {null};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:141)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:198)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVFormat.format(CSVFormat.java:454) */
        cSVFormat.format(objectArray);
    }
    
    @Test
    public void testFormat18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:141)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:198)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVFormat.format(CSVFormat.java:454) */
        cSVFormat.format(objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.validate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method validate()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == escapeCharacter.charValue()): False}
 * @utbot.executesCondition {@code (commentMarker != null): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): True}
 * @utbot.executesCondition {@code (escapeCharacter.equals(commentMarker)): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): False}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.invokes {@link java.lang.Character#equals(java.lang.Object)}
 *  */
    @Test
    public void testValidate_EscapeCharacterNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFDF');
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
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): True}
 * @utbot.executesCondition {@code (quoteMode == QuoteMode.NONE): False}
 *  */
    @Test
    public void testValidate_QuoteModeNotEqualsQuoteModeNONE() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        validateMethod.invoke(cSVFormat, validateMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == quoteCharacter.charValue()): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (quoteCharacter.equals(commentMarker)): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): True}
 * @utbot.executesCondition {@code (quoteMode == QuoteMode.NONE): False}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.invokes {@link java.lang.Character#equals(java.lang.Object)}
 *  */
    @Test
    public void testValidate_NotQuoteCharacterEquals() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '!');
        Character quoteCharacter = '@';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        validateMethod.invoke(cSVFormat, validateMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): True}
 * @utbot.executesCondition {@code (quoteMode == QuoteMode.NONE): False}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 *  */
    @Test
    public void testValidate_DelimiterNotEqualsCommentMarkerCharValue() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Method validateMethod = cSVFormatClazz.getDeclaredMethod("validate");
        validateMethod.setAccessible(true);
        java.lang.Object[] validateMethodArguments = new java.lang.Object[0];
        validateMethod.invoke(cSVFormat, validateMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method validate()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == quoteCharacter.charValue()): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: quoteCharacter != null && delimiter == quoteCharacter.charValue()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException() throws Throwable  {
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
    public void testValidate_ThrowIllegalArgumentException_1() throws Throwable  {
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
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == quoteCharacter.charValue()): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (quoteCharacter.equals(commentMarker)): True}
 * @utbot.invokes {@link java.lang.Character#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: quoteCharacter != null && quoteCharacter.equals(commentMarker)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_5() throws Throwable  {
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
    public void testValidate_ThrowIllegalArgumentException_6() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFDF');
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
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: commentMarker != null && delimiter == commentMarker.charValue()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_3() throws Throwable  {
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
 * @utbot.executesCondition {@code (quoteCharacter != null): True}
 * @utbot.executesCondition {@code (delimiter == quoteCharacter.charValue()): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: commentMarker != null && delimiter == commentMarker.charValue()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_4() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '!';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
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
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (commentMarker != null): False}
 * @utbot.executesCondition {@code (quoteCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): True}
 * @utbot.executesCondition {@code (quoteMode == QuoteMode.NONE): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: escapeCharacter == null && quoteMode == QuoteMode.NONE
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValidate_ThrowIllegalArgumentException_2() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.print
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method print(java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Appendable)}
 * @utbot.returnsFrom {@code return new CSVPrinter(out, this);}
 *  */
    @Test
    public void testPrint_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
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
        assertFalse(actualOutTrouble);
        
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
        
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Appendable)}
 *  */
    @Test
    public void testPrint() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        String nullString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
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
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
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
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method print(java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Appendable)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testPrint_ThrowIOException() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method print(java.lang.Appendable)
    
    @Test
    public void testPrint1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[32];
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
        java.lang.String[] cSVFormatHeader9 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader9 = ((String) get(cSVFormatHeader9, 9));
        java.lang.String[] cSVFormatHeader10 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader10 = ((String) get(cSVFormatHeader10, 10));
        java.lang.String[] cSVFormatHeader11 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader11 = ((String) get(cSVFormatHeader11, 11));
        java.lang.String[] cSVFormatHeader12 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader12 = ((String) get(cSVFormatHeader12, 12));
        java.lang.String[] cSVFormatHeader13 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader13 = ((String) get(cSVFormatHeader13, 13));
        java.lang.String[] cSVFormatHeader14 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader14 = ((String) get(cSVFormatHeader14, 14));
        java.lang.String[] cSVFormatHeader15 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader15 = ((String) get(cSVFormatHeader15, 15));
        java.lang.String[] cSVFormatHeader16 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader16 = ((String) get(cSVFormatHeader16, 16));
        java.lang.String[] cSVFormatHeader17 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader17 = ((String) get(cSVFormatHeader17, 17));
        java.lang.String[] cSVFormatHeader18 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader18 = ((String) get(cSVFormatHeader18, 18));
        java.lang.String[] cSVFormatHeader19 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader19 = ((String) get(cSVFormatHeader19, 19));
        java.lang.String[] cSVFormatHeader20 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader20 = ((String) get(cSVFormatHeader20, 20));
        java.lang.String[] cSVFormatHeader21 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader21 = ((String) get(cSVFormatHeader21, 21));
        java.lang.String[] cSVFormatHeader22 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader22 = ((String) get(cSVFormatHeader22, 22));
        java.lang.String[] cSVFormatHeader23 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader23 = ((String) get(cSVFormatHeader23, 23));
        java.lang.String[] cSVFormatHeader24 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader24 = ((String) get(cSVFormatHeader24, 24));
        java.lang.String[] cSVFormatHeader25 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader25 = ((String) get(cSVFormatHeader25, 25));
        java.lang.String[] cSVFormatHeader26 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader26 = ((String) get(cSVFormatHeader26, 26));
        java.lang.String[] cSVFormatHeader27 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader27 = ((String) get(cSVFormatHeader27, 27));
        java.lang.String[] cSVFormatHeader28 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader28 = ((String) get(cSVFormatHeader28, 28));
        java.lang.String[] cSVFormatHeader29 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader29 = ((String) get(cSVFormatHeader29, 29));
        java.lang.String[] cSVFormatHeader30 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader30 = ((String) get(cSVFormatHeader30, 30));
        java.lang.String[] cSVFormatHeader31 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader31 = ((String) get(cSVFormatHeader31, 31));
        
        assertNull(finalCSVFormatHeader0);
        
        assertNull(finalCSVFormatHeader1);
        
        assertNull(finalCSVFormatHeader2);
        
        assertNull(finalCSVFormatHeader3);
        
        assertNull(finalCSVFormatHeader4);
        
        assertNull(finalCSVFormatHeader5);
        
        assertNull(finalCSVFormatHeader6);
        
        assertNull(finalCSVFormatHeader7);
        
        assertNull(finalCSVFormatHeader8);
        
        assertNull(finalCSVFormatHeader9);
        
        assertNull(finalCSVFormatHeader10);
        
        assertNull(finalCSVFormatHeader11);
        
        assertNull(finalCSVFormatHeader12);
        
        assertNull(finalCSVFormatHeader13);
        
        assertNull(finalCSVFormatHeader14);
        
        assertNull(finalCSVFormatHeader15);
        
        assertNull(finalCSVFormatHeader16);
        
        assertNull(finalCSVFormatHeader17);
        
        assertNull(finalCSVFormatHeader18);
        
        assertNull(finalCSVFormatHeader19);
        
        assertNull(finalCSVFormatHeader20);
        
        assertNull(finalCSVFormatHeader21);
        
        assertNull(finalCSVFormatHeader22);
        
        assertNull(finalCSVFormatHeader23);
        
        assertNull(finalCSVFormatHeader24);
        
        assertNull(finalCSVFormatHeader25);
        
        assertNull(finalCSVFormatHeader26);
        
        assertNull(finalCSVFormatHeader27);
        
        assertNull(finalCSVFormatHeader28);
        
        assertNull(finalCSVFormatHeader29);
        
        assertNull(finalCSVFormatHeader30);
        
        assertNull(finalCSVFormatHeader31);
    }
    
    @Test
    public void testPrint2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        String nullString = "\u0000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
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
        setField(out, "java.lang.AbstractStringBuilder", "count", 4);
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
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    
    @Test
    public void testPrint3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = new java.lang.String[8];
        String string = "\u0000";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
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
    public void testPrint4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = new java.lang.String[8];
        String string = "\r";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
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
    public void testPrint5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = 'o';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        String nullString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
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
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    
    @Test
    public void testPrint6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = new java.lang.String[8];
        String string = "\n\u0000";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
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
    public void testPrint7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = 'o';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
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
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    
    @Test
    public void testPrint8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[32];
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
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
        java.lang.String[] cSVFormatHeader9 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader9 = ((String) get(cSVFormatHeader9, 9));
        java.lang.String[] cSVFormatHeader10 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader10 = ((String) get(cSVFormatHeader10, 10));
        java.lang.String[] cSVFormatHeader11 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader11 = ((String) get(cSVFormatHeader11, 11));
        java.lang.String[] cSVFormatHeader12 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader12 = ((String) get(cSVFormatHeader12, 12));
        java.lang.String[] cSVFormatHeader13 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader13 = ((String) get(cSVFormatHeader13, 13));
        java.lang.String[] cSVFormatHeader14 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader14 = ((String) get(cSVFormatHeader14, 14));
        java.lang.String[] cSVFormatHeader15 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader15 = ((String) get(cSVFormatHeader15, 15));
        java.lang.String[] cSVFormatHeader16 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader16 = ((String) get(cSVFormatHeader16, 16));
        java.lang.String[] cSVFormatHeader17 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader17 = ((String) get(cSVFormatHeader17, 17));
        java.lang.String[] cSVFormatHeader18 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader18 = ((String) get(cSVFormatHeader18, 18));
        java.lang.String[] cSVFormatHeader19 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader19 = ((String) get(cSVFormatHeader19, 19));
        java.lang.String[] cSVFormatHeader20 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader20 = ((String) get(cSVFormatHeader20, 20));
        java.lang.String[] cSVFormatHeader21 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader21 = ((String) get(cSVFormatHeader21, 21));
        java.lang.String[] cSVFormatHeader22 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader22 = ((String) get(cSVFormatHeader22, 22));
        java.lang.String[] cSVFormatHeader23 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader23 = ((String) get(cSVFormatHeader23, 23));
        java.lang.String[] cSVFormatHeader24 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader24 = ((String) get(cSVFormatHeader24, 24));
        java.lang.String[] cSVFormatHeader25 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader25 = ((String) get(cSVFormatHeader25, 25));
        java.lang.String[] cSVFormatHeader26 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader26 = ((String) get(cSVFormatHeader26, 26));
        java.lang.String[] cSVFormatHeader27 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader27 = ((String) get(cSVFormatHeader27, 27));
        java.lang.String[] cSVFormatHeader28 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader28 = ((String) get(cSVFormatHeader28, 28));
        java.lang.String[] cSVFormatHeader29 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader29 = ((String) get(cSVFormatHeader29, 29));
        java.lang.String[] cSVFormatHeader30 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader30 = ((String) get(cSVFormatHeader30, 30));
        java.lang.String[] cSVFormatHeader31 = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader31 = ((String) get(cSVFormatHeader31, 31));
        
        assertNull(finalCSVFormatHeader0);
        
        assertNull(finalCSVFormatHeader1);
        
        assertNull(finalCSVFormatHeader2);
        
        assertNull(finalCSVFormatHeader3);
        
        assertNull(finalCSVFormatHeader4);
        
        assertNull(finalCSVFormatHeader5);
        
        assertNull(finalCSVFormatHeader6);
        
        assertNull(finalCSVFormatHeader7);
        
        assertNull(finalCSVFormatHeader8);
        
        assertNull(finalCSVFormatHeader9);
        
        assertNull(finalCSVFormatHeader10);
        
        assertNull(finalCSVFormatHeader11);
        
        assertNull(finalCSVFormatHeader12);
        
        assertNull(finalCSVFormatHeader13);
        
        assertNull(finalCSVFormatHeader14);
        
        assertNull(finalCSVFormatHeader15);
        
        assertNull(finalCSVFormatHeader16);
        
        assertNull(finalCSVFormatHeader17);
        
        assertNull(finalCSVFormatHeader18);
        
        assertNull(finalCSVFormatHeader19);
        
        assertNull(finalCSVFormatHeader20);
        
        assertNull(finalCSVFormatHeader21);
        
        assertNull(finalCSVFormatHeader22);
        
        assertNull(finalCSVFormatHeader23);
        
        assertNull(finalCSVFormatHeader24);
        
        assertNull(finalCSVFormatHeader25);
        
        assertNull(finalCSVFormatHeader26);
        
        assertNull(finalCSVFormatHeader27);
        
        assertNull(finalCSVFormatHeader28);
        
        assertNull(finalCSVFormatHeader29);
        
        assertNull(finalCSVFormatHeader30);
        
        assertNull(finalCSVFormatHeader31);
    }
    
    @Test
    public void testPrint9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = new java.lang.String[1];
        header[0] = recordSeparator;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
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
        
    }
    
    @Test
    public void testPrint10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
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
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method print(java.lang.Appendable)
    
    @Test
    public void testPrint11() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[32];
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Object heapCharBufferR = createInstance("java.nio.HeapCharBufferR");
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.HeapCharBufferR.put(HeapCharBufferR.java:212)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:2046)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:267)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class heapCharBufferRType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", heapCharBufferRType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = heapCharBufferR;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint12() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Object byteBufferAsCharBufferRB = createInstance("java.nio.ByteBufferAsCharBufferRB");
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.ByteBufferAsCharBufferRB.put(ByteBufferAsCharBufferRB.java:161)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:2046)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:267)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteBufferAsCharBufferRBType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", byteBufferAsCharBufferRBType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = byteBufferAsCharBufferRB;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint13() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[32];
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Object byteBufferAsCharBufferRL = createInstance("java.nio.ByteBufferAsCharBufferRL");
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.ByteBufferAsCharBufferRL.put(ByteBufferAsCharBufferRL.java:161)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:2046)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:267)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteBufferAsCharBufferRLType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", byteBufferAsCharBufferRLType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = byteBufferAsCharBufferRL;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint14() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[32];
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Object directCharBufferS = createInstance("java.nio.DirectCharBufferS");
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.nio.BufferOverflowException]
            java.base/java.nio.Buffer.nextPutIndex(Buffer.java:722)
            java.base/java.nio.DirectCharBufferS.put(DirectCharBufferS.java:352)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:2046)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:267)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:119)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class directCharBufferSType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", directCharBufferSType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = directCharBufferS;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint15() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = new java.lang.String[1];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Object directCharBufferS = createInstance("java.nio.DirectCharBufferS");
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:141)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:198)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class directCharBufferSType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", directCharBufferSType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = directCharBufferS;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint16() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = new java.lang.String[8];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:237)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:229)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:76)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:127)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class fileWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", fileWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = fileWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint17() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = new java.lang.String[8];
        String string = "\u0001";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:237)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:229)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:76)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:167)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    
    @Test
    public void testPrint18() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "\u0002\u8000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:106)
            java.base/java.io.StringWriter.append(StringWriter.java:150)
            java.base/java.io.StringWriter.append(StringWriter.java:190)
            java.base/java.io.StringWriter.append(StringWriter.java:41)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:167)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    public void testPrint19() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = new java.lang.String[1];
        header[0] = recordSeparator;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:237)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:76)
            org.apache.commons.csv.CSVPrinter.println(CSVPrinter.java:336)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:378)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    
    @Test
    public void testPrint20() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "\u0002\u0000";
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
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:148)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    public void testPrint21() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = 'o';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[32];
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:77)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:119)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", anonymousPrintWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = anonymousPrintWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint22() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = 'o';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = new java.lang.String[8];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:167)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    public void testPrint23() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = new java.lang.String[8];
        String string = "\r\u0000";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:156)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", anonymousPrintWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = anonymousPrintWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint24() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[32];
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndQuote(CSVPrinter.java:259)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:123)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", anonymousPrintWriterType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = anonymousPrintWriter;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint25() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.println(CSVPrinter.java:336)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:378)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    public void testPrint26() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:127)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    public void testPrint27() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", 'o');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", quoteCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[32];
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:119)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    public void testPrint28() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "\n";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:156)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    public void testPrint29() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "\u0000";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVPrinter.printAndEscape(CSVPrinter.java:156)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:125)
            org.apache.commons.csv.CSVPrinter.print(CSVPrinter.java:113)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:376)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:70)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:670) */
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
    ///endregion
    
    ///region Errors report for print
    
    public void testPrint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 23 occurrences of:
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withDelimiter(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithDelimiter_Return_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withDelimiter('');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithDelimiter_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withDelimiter('_');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithDelimiter_Return_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withDelimiter('');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithDelimiter_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withDelimiter('_');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withDelimiter(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(delimiter)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withDelimiter('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(delimiter)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withDelimiter('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withDelimiter('_');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withDelimiter('_');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withDelimiter('_');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[2];
        header[0] = nullString;
        header[1] = nullString;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withDelimiter(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withDelimiter(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withDelimiter(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withDelimiter(' ');
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withHeader([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithHeader_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithHeader_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] stringArray = {null, null};
        
        cSVFormat.withHeader(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withHeader(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withHeader(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withRecordSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withRecordSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithRecordSeparator_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithRecordSeparator_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withRecordSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withRecordSeparator
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withRecordSeparator(char)
    
    @Test
    public void testWithRecordSeparator1() throws Exception  {
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withEscape(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.returnsFrom {@code return withEscape(Character.valueOf(escape));}
 *  */
    @Test
    public void testWithEscape_ReturnWithEscape() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.returnsFrom {@code return withEscape(Character.valueOf(escape));}
 *  */
    @Test
    public void testWithEscape_ReturnWithEscape_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withEscape('!');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '!';
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.returnsFrom {@code return withEscape(Character.valueOf(escape));}
 *  */
    @Test
    public void testWithEscape_ReturnWithEscape_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withEscape(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
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
    public void testWithEscape_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withEscape('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withEscape('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withEscape(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withEscape(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withEscape(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withEscape(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withEscape(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withEscape('!');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withEscape(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withEscape(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithEscape_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withEscape(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(escape)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException1() throws Exception  {
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
    public void testWithEscape_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\n';
        
        cSVFormat.withEscape(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_71() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_51() throws Exception  {
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
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_81() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        Character character = ' ';
        
        cSVFormat.withEscape(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuote
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withQuote(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.returnsFrom {@code return withQuote(Character.valueOf(quoteChar));}
 *  */
    @Test
    public void testWithQuote_ReturnWithQuote() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuote('_');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.returnsFrom {@code return withQuote(Character.valueOf(quoteChar));}
 *  */
    @Test
    public void testWithQuote_ReturnWithQuote_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withQuote(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
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
    public void testWithQuote_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withQuote('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withQuote('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote('_');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote('!');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withQuote(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuote(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_3() throws Exception  {
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
    public void testWithQuote_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withQuote('!');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuote
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withQuote(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithQuote_Return_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithQuote_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithQuote_Return_1() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithQuote_Return_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
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
    public void testWithQuote_ThrowIllegalArgumentException1() throws Exception  {
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
    public void testWithQuote_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\n';
        
        cSVFormat.withQuote(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = new java.lang.String[1];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_61() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_71() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = new java.lang.String[2];
        String string = "";
        header[0] = string;
        header[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuote(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_81() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        Character character = ' ';
        
        cSVFormat.withQuote(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuoteMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withQuoteMode(org.apache.commons.csv.QuoteMode)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithQuoteMode_Return_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuoteMode(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithQuoteMode_Return_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        Character commentMarker = '\uFF80';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header = new java.lang.String[1];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuoteMode(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        setField(expected, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        java.lang.String[] header1 = new java.lang.String[1];
        header1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithQuoteMode_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withQuoteMode(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithQuoteMode_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withQuoteMode(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithQuoteMode_Return_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withQuoteMode(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withQuoteMode(org.apache.commons.csv.QuoteMode)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = new java.lang.String[2];
        header[1] = recordSeparator;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        QuoteMode quoteMode = QuoteMode.NONE;
        
        cSVFormat.withQuoteMode(quoteMode);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '!');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        
        cSVFormat.withQuoteMode(quoteMode);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withQuoteMode(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteMode(org.apache.commons.csv.QuoteMode)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteModePolicy, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteMode_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withNullString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withNullString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithNullString_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithNullString_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithNullString_Return_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withNullString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = new java.lang.String[2];
        String string = "";
        header[0] = string;
        header[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withNullString(null);
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.newFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newFormat(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#newFormat(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, false, false);}
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, false, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_ThrowIllegalArgumentException() {
        CSVFormat.newFormat('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#newFormat(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, false, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_ThrowIllegalArgumentException_1() {
        CSVFormat.newFormat('\r');
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withCommentMarker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withCommentMarker(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.returnsFrom {@code return withCommentMarker(Character.valueOf(commentMarker));}
 *  */
    @Test
    public void testWithCommentMarker_ReturnWithCommentMarker_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.String[] header = new java.lang.String[1];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker('_');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '_';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header1 = new java.lang.String[1];
        header1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.returnsFrom {@code return withCommentMarker(Character.valueOf(commentMarker));}
 *  */
    @Test
    public void testWithCommentMarker_ReturnWithCommentMarker() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withCommentMarker('_');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '_';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.returnsFrom {@code return withCommentMarker(Character.valueOf(commentMarker));}
 *  */
    @Test
    public void testWithCommentMarker_ReturnWithCommentMarker_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '^');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withCommentMarker('!');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '^');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character commentMarker = '!';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.returnsFrom {@code return withCommentMarker(Character.valueOf(commentMarker));}
 *  */
    @Test
    public void testWithCommentMarker_ReturnWithCommentMarker_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withCommentMarker(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withCommentMarker('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withCommentMarker('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
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
    public void testWithCommentMarker_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withCommentMarker('_');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
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
    public void testWithCommentMarker_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = new java.lang.String[2];
        String string = "";
        header[0] = string;
        header[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withCommentMarker(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        cSVFormat.withCommentMarker(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentMarker(Character.valueOf(commentMarker));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withCommentMarker(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withCommentMarker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withCommentMarker(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
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
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithCommentMarker_Return_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFF80');
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Character character = 'Q';
        
        CSVFormat actual = cSVFormat.withCommentMarker(character);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFF80');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", character);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithCommentMarker_Return_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '!');
        Character escapeCharacter = 'F';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header = new java.lang.String[1];
        header[0] = recordSeparator;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '!');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        java.lang.String[] header1 = new java.lang.String[1];
        header1[0] = recordSeparator;
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
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
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithCommentMarker_Return_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFFD');
        Character escapeCharacter = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        Character character = '9';
        
        CSVFormat actual = cSVFormat.withCommentMarker(character);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFFD');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", character);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_61() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_71() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = new java.lang.String[2];
        String string = "";
        header[0] = string;
        header[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_81() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        Character character = ' ';
        
        cSVFormat.withCommentMarker(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_91() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character character = ' ';
        
        cSVFormat.withCommentMarker(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFDF');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        Character character = ' ';
        
        cSVFormat.withCommentMarker(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_111() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFDF');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character character = ' ';
        
        cSVFormat.withCommentMarker(character);
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithIgnoreSurroundingSpaces_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithIgnoreSurroundingSpaces_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withSkipHeaderRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withSkipHeaderRecord(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithSkipHeaderRecord_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithSkipHeaderRecord_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSkipHeaderRecord(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withIgnoreEmptyLines(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithIgnoreEmptyLines_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithIgnoreEmptyLines_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreEmptyLines(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines(false);
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withAllowMissingColumnNames(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithAllowMissingColumnNames_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 *  */
    @Test
    public void testWithAllowMissingColumnNames_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        Character escapeCharacter = '9';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAllowMissingColumnNames(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord, allowMissingColumnNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames(false);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields965546845291900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields965546845291900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass965546845296700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields965546845291900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass965546845296700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields965546845605600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields965546845605600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass965546845606700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields965546845605600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass965546845606700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

