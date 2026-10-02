package org.apache.commons.csv;

import org.junit.Test;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.lang.reflect.Method;
import java.io.File;
import java.nio.charset.Charset;
import java.io.Writer;
import java.io.StringWriter;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
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
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.println
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method println(java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#println(java.lang.Appendable)}
 * @utbot.executesCondition {@code (getTrailingDelimiter()): True}
 * @utbot.executesCondition {@code (recordSeparator != null): False}
 *  */
    @Test
    public void testPrintln_RecordSeparatorEqualsNull_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        
        cSVFormat.println(printStream);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#println(java.lang.Appendable)}
 * @utbot.executesCondition {@code (getTrailingDelimiter()): False}
 * @utbot.executesCondition {@code (recordSeparator != null): False}
 *  */
    @Test
    public void testPrintln_RecordSeparatorEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.println(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#println(java.lang.Appendable)}
 * @utbot.executesCondition {@code (getTrailingDelimiter()): True}
 *  */
    @Test
    public void testPrintln_GetTrailingDelimiter() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printlnMethod = cSVFormatClazz.getDeclaredMethod("println", printWriterType);
        printlnMethod.setAccessible(true);
        java.lang.Object[] printlnMethodArguments = new java.lang.Object[1];
        printlnMethodArguments[0] = printWriter;
        printlnMethod.invoke(cSVFormat, printlnMethodArguments);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#println(java.lang.Appendable)}
 * @utbot.executesCondition {@code (getTrailingDelimiter()): False}
 * @utbot.executesCondition {@code (recordSeparator != null): True}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 *  */
    @Test
    public void testPrintln_AppendableAppend() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Method printlnMethod = cSVFormatClazz.getDeclaredMethod("println", anonymousPrintWriterType);
        printlnMethod.setAccessible(true);
        java.lang.Object[] printlnMethodArguments = new java.lang.Object[1];
        printlnMethodArguments[0] = anonymousPrintWriter;
        printlnMethod.invoke(cSVFormat, printlnMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method println(java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#println(java.lang.Appendable)}
 * @utbot.executesCondition {@code (getTrailingDelimiter()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(getDelimiter());
 *  */
    @Test
    public void testPrintln_ThrowNullPointerException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.println] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.println(CSVFormat.java:1269) */
        cSVFormat.println(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#println(java.lang.Appendable)}
 * @utbot.executesCondition {@code (getTrailingDelimiter()): False}
 * @utbot.executesCondition {@code (recordSeparator != null): True}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(recordSeparator);
 *  */
    @Test
    public void testPrintln_ThrowNullPointerException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.println] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.println(CSVFormat.java:1272) */
        cSVFormat.println(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#println(java.lang.Appendable)}
 * @utbot.executesCondition {@code (getTrailingDelimiter()): False}
 * @utbot.executesCondition {@code (recordSeparator != null): True}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPrintln_ThrowNullPointerException_1() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.println] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.println(CSVFormat.java:1272) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printlnMethod = cSVFormatClazz.getDeclaredMethod("println", printWriterType);
        printlnMethod.setAccessible(true);
        java.lang.Object[] printlnMethodArguments = new java.lang.Object[1];
        printlnMethodArguments[0] = printWriter;
        try {
            printlnMethod.invoke(cSVFormat, printlnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#println(java.lang.Appendable)}
 * @utbot.executesCondition {@code (getTrailingDelimiter()): True}
 * @utbot.executesCondition {@code (recordSeparator != null): True}
 * @utbot.invokes {@link java.lang.Appendable#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPrintln_ThrowNullPointerException_3() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.println] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.println(CSVFormat.java:1269) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printlnMethod = cSVFormatClazz.getDeclaredMethod("println", printWriterType);
        printlnMethod.setAccessible(true);
        java.lang.Object[] printlnMethodArguments = new java.lang.Object[1];
        printlnMethodArguments[0] = printWriter;
        try {
            printlnMethod.invoke(cSVFormat, printlnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
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
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
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
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> SkipHeaderRecord:false HeaderComments:[null, null, null, null, null, null, null, null, null]";
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): True}
 * @utbot.executesCondition {@code (ignoreHeaderCase): True}
 * @utbot.executesCondition {@code (ignoreEmptyLines): False}
 * @utbot.executesCondition {@code (skipHeaderRecord): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_IgnoreHeaderCase() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1599912028, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): True}
 * @utbot.executesCondition {@code (ignoreHeaderCase): False}
 * @utbot.executesCondition {@code (ignoreEmptyLines): False}
 * @utbot.executesCondition {@code (skipHeaderRecord): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_NotSkipHeaderRecord() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1605458919, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): False}
 * @utbot.executesCondition {@code (ignoreHeaderCase): False}
 * @utbot.executesCondition {@code (ignoreEmptyLines): True}
 * @utbot.executesCondition {@code (skipHeaderRecord): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_NotSkipHeaderRecord_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1777055079, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): False}
 * @utbot.executesCondition {@code (ignoreHeaderCase): False}
 * @utbot.executesCondition {@code (ignoreEmptyLines): True}
 * @utbot.executesCondition {@code (skipHeaderRecord): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_SkipHeaderRecord() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1777049313, actual);
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
            org.apache.commons.csv.CSVFormat$Predefined.valueOf(CSVFormat.java:163)
            org.apache.commons.csv.CSVFormat.valueOf(CSVFormat.java:552) */
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
            org.apache.commons.csv.CSVFormat$Predefined.valueOf(CSVFormat.java:163)
            org.apache.commons.csv.CSVFormat.valueOf(CSVFormat.java:552) */
        CSVFormat.valueOf("\u0014\n\t\r");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.trim
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trim(java.lang.CharSequence)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#trim(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (charSequence instanceof String): False}
 * @utbot.executesCondition {@code (pos > 0 || len < count): True}
 * @utbot.executesCondition {@code (pos > 0 || len < count): False}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 * @utbot.returnsFrom {@code return pos > 0 || len < count ? charSequence.subSequence(pos, len) : charSequence;}
 *  */
    @Test
    public void testTrim_PosLessOrEqualZeroOrLenGreaterOrEqualCount() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String string = "";
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Method trimMethod = cSVFormatClazz.getDeclaredMethod("trim", stringType);
        trimMethod.setAccessible(true);
        java.lang.Object[] trimMethodArguments = new java.lang.Object[1];
        trimMethodArguments[0] = string;
        String actual = ((String) trimMethod.invoke(cSVFormat, trimMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method trim(java.lang.CharSequence)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#trim(java.lang.CharSequence)}
 * @utbot.executesCondition {@code (charSequence instanceof String): False}
 * @utbot.invokes {@link java.lang.CharSequence#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int count = charSequence.length();
 *  */
    @Test
    public void testTrim_ThrowNullPointerException() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.trim] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.trim(CSVFormat.java:1361) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Method trimMethod = cSVFormatClazz.getDeclaredMethod("trim", charSequenceType);
        trimMethod.setAccessible(true);
        java.lang.Object[] trimMethodArguments = new java.lang.Object[1];
        trimMethodArguments[0] = ((Object) null);
        try {
            trimMethod.invoke(cSVFormat, trimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testValidate_HeaderEqualsNull_1() throws Exception  {
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
 *  */
    @Test
    public void testValidate_HeaderEqualsNull_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\uFFC6';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\"');
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
 * @utbot.executesCondition {@code (commentMarker != null): True}
 * @utbot.executesCondition {@code (delimiter == commentMarker.charValue()): False}
 * @utbot.executesCondition {@code (escapeCharacter != null): False}
 * @utbot.executesCondition {@code (escapeCharacter == null): True}
 * @utbot.executesCondition {@code (quoteMode == QuoteMode.NONE): False}
 * @utbot.executesCondition {@code (header != null): False}
 *  */
    @Test
    public void testValidate_HeaderEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
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
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
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
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
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
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.print
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method print(java.lang.Object, java.lang.Appendable, boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value instanceof CharSequence): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, charSequence, 0, charSequence.length(), out, newRecord);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1093)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087) */
        cSVFormat.print(integer, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (null == nullString): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, charSequence, 0, charSequence.length(), out, newRecord);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087) */
        cSVFormat.print(null, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (null == nullString): False}
 * @utbot.executesCondition {@code (QuoteMode.ALL == quoteMode): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, charSequence, 0, charSequence.length(), out, newRecord);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087) */
        cSVFormat.print(null, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value instanceof CharSequence): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.print(value, charSequence, 0, charSequence.length(), out, newRecord);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087) */
        cSVFormat.print(integer, null, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.print
    
    ///region Errors report for print
    
    public void testPrint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.Set java.nio.file.spi.FileSystemProvider.DEFAULT_OPEN_OPTIONS accessible:
        module java.base does not "opens java.nio.file.spi" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.print
    
    ///region OTHER: ERROR SUITE for method print(java.io.File, java.nio.charset.Charset)
    
    @Test
    public void testPrint1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException: name can't be null]
            java.base/java.io.FilePermission.init(FilePermission.java:323)
            java.base/java.io.FilePermission.<init>(FilePermission.java:490)
            java.base/java.lang.SecurityManager.checkWrite(SecurityManager.java:847)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:223)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:184)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1031) */
        cSVFormat.print(((File) null), ((Charset) null));
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
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Appendable)}
 * @utbot.returnsFrom {@code return new CSVPrinter(out, this);}
 *  */
    @Test
    public void testPrint_Return_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
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
    public void testPrint2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
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
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
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
    public void testPrint4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
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
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testPrint5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trim", true);
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
    public void testPrint6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trim", true);
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
    public void testPrint7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method print(java.lang.Appendable)
    
    @Test
    public void testPrint8() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = new java.lang.String[8];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trim", true);
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:106)
            java.base/java.io.StringWriter.append(StringWriter.java:150)
            java.base/java.io.StringWriter.append(StringWriter.java:190)
            java.base/java.io.StringWriter.append(StringWriter.java:41)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:231)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:74)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:993) */
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
    public void testPrint9() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.println(CSVFormat.java:1272)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1297)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:231)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:74)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:993) */
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
    public void testPrint10() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:231)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:74)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:993) */
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
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        Object heapCharBuffer = createInstance("java.nio.HeapCharBuffer");
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            java.base/java.nio.HeapCharBuffer.put(HeapCharBuffer.java:284)
            java.base/java.nio.CharBuffer.put(CharBuffer.java:1427)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:1982)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:267)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:231)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:74)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:993) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class heapCharBufferType = Class.forName("java.lang.Appendable");
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", heapCharBufferType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[1];
        printMethodArguments[0] = heapCharBuffer;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint12() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:106)
            java.base/java.io.StringWriter.append(StringWriter.java:150)
            java.base/java.io.StringWriter.append(StringWriter.java:41)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295)
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:231)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:74)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:993) */
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
    public void testPrint13() throws Throwable  {
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
            org.apache.commons.csv.CSVPrinter.printComment(CSVPrinter.java:163)
            org.apache.commons.csv.CSVPrinter.<init>(CSVPrinter.java:69)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:993) */
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.print
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method print(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#isQuoteCharacterSet()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#isEscapeCharacterSet()}
 * @utbot.invokes org.apache.commons.csv.CSVFormat#printAndEscape(java.lang.CharSequence,int,int,java.lang.Appendable)
 *  */
    @Test
    public void testPrint_ObjectNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        byte[] byteArray = {};
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", byteArrayType, charSequenceType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = ((Object) byteArray);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -1;
        printMethodArguments[3] = 0;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        printMethod.invoke(cSVFormat, printMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method print(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(value);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException1() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -255;
        printMethodArguments[3] = -255;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (!newRecord): True}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getDelimiter()}
 * @utbot.invokes {@link java.lang.Appendable#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(getDelimiter());
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_11() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1093) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -255;
        printMethodArguments[3] = -255;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = false;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(value, offset, offset + len);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_21() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", byteArrayType, charSequenceType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = ((Object) byteArray);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -255;
        printMethodArguments[3] = -255;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len, out);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_31() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1120)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1101) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", byteArrayType, charSequenceType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = ((Object) byteArray);
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = -254;
        printMethodArguments[3] = 1;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len, out);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_5() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        byte[] byteArray = {};
        String string = "\u0000\r";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1132)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1101) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", byteArrayType, stringType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = ((Object) byteArray);
        printMethodArguments[1] = string;
        printMethodArguments[2] = 1;
        printMethodArguments[3] = 1;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len, out);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_6() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        byte[] byteArray = {};
        String string = "\r\u0000";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1132)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1101) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", byteArrayType, stringType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = ((Object) byteArray);
        printMethodArguments[1] = string;
        printMethodArguments[2] = 1;
        printMethodArguments[3] = 1;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#print(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (!newRecord): False}
 * @utbot.executesCondition {@code (object == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: printAndEscape(value, offset, len, out);
 *  */
    @Test
    public void testPrint_ThrowNullPointerException_4() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\uFFDF');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        Object object = new Object();
        String string = "\r ";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1132)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1101) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, stringType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = string;
        printMethodArguments[2] = 1;
        printMethodArguments[3] = 1;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method print(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)
    
    @Test
    public void testPrint14() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Object object = new Object();
        String string = "";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.StringIndexOutOfBoundsException: begin 1073741825, end -2147483647, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.subSequence(String.java:2749)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, stringType, intType, intType, printWriterType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = string;
        printMethodArguments[2] = 1073741825;
        printMethodArguments[3] = 1073741824;
        printMethodArguments[4] = printWriter;
        printMethodArguments[5] = true;
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
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1120)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1101) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, stringType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = string;
        printMethodArguments[2] = 0;
        printMethodArguments[3] = 1;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint16() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String string = "";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, stringType, intType, intType, printWriterType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = ((Object) null);
        printMethodArguments[1] = string;
        printMethodArguments[2] = 0;
        printMethodArguments[3] = 0;
        printMethodArguments[4] = printWriter;
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint17() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Object object = new Object();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:237)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:229)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:76)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, stringType, intType, intType, outputStreamWriterType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = string;
        printMethodArguments[2] = 0;
        printMethodArguments[3] = 34;
        printMethodArguments[4] = outputStreamWriter;
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint18() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Object object = new Object();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, stringType, intType, intType, printWriterType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = string;
        printMethodArguments[2] = 0;
        printMethodArguments[3] = 34;
        printMethodArguments[4] = printWriter;
        printMethodArguments[5] = true;
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
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Object object = new Object();
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:77)
            java.base/java.io.StringWriter.append(StringWriter.java:210)
            java.base/java.io.StringWriter.append(StringWriter.java:41)
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1235)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1099) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class stringWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType, stringWriterType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = 0;
        printMethodArguments[3] = 0;
        printMethodArguments[4] = stringWriter;
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint20() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1117)
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1175)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1099) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = 0;
        printMethodArguments[3] = 0;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint21() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        Object object = new Object();
        String string = "\u0001";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1143)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1101) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, stringType, intType, intType, appendableType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = string;
        printMethodArguments[2] = 0;
        printMethodArguments[3] = 1;
        printMethodArguments[4] = ((Object) null);
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrint22() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Object object = new Object();
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1093) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, charSequenceType, intType, intType, printWriterType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = ((Object) null);
        printMethodArguments[2] = 0;
        printMethodArguments[3] = 0;
        printMethodArguments[4] = printWriter;
        printMethodArguments[5] = false;
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
        Object object = new Object();
        String string = "\n";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.print] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1132)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1101) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printMethod = cSVFormatClazz.getDeclaredMethod("print", objectType, stringType, intType, intType, printWriterType, booleanType);
        printMethod.setAccessible(true);
        java.lang.Object[] printMethodArguments = new java.lang.Object[6];
        printMethodArguments[0] = object;
        printMethodArguments[1] = string;
        printMethodArguments[2] = 0;
        printMethodArguments[3] = 1;
        printMethodArguments[4] = printWriter;
        printMethodArguments[5] = true;
        try {
            printMethod.invoke(cSVFormat, printMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for print
    
    public void testPrint_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
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
 * @utbot.invokes org.apache.commons.csv.CSVFormat#isLineBreak(char)
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);}
 *  */
    @Test
    public void testWithDelimiter_CSVFormatIsLineBreak() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withDelimiter(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withDelimiter(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withDelimiter(' ');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter_ThrowIllegalArgumentException_4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        
        cSVFormat.withDelimiter(' ');
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withDelimiter(char)
    
    @Test
    public void testWithDelimiter1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0200');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0200');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u1000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u1000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithDelimiter4() throws Exception  {
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
    public void testWithDelimiter5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0000');
        
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
    public void testWithDelimiter6() throws Exception  {
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
    public void testWithDelimiter7() throws Exception  {
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
    public void testWithDelimiter8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withDelimiter('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withDelimiter(char)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withDelimiter('\u0001');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withDelimiter('\u0001');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithDelimiter11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withDelimiter('\u0000');
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
        Integer integer = 0;
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
        String string = "0";
        expected[0] = string;
        String string1 = "[Ljava.lang.String;@319acc2f";
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
        java.lang.Object[] objectArray = new java.lang.Object[2];
        Character character = '\u0000';
        objectArray[1] = ((Object) character);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method toStringArrayMethod = cSVFormatClazz.getDeclaredMethod("toStringArray", objectArrayType);
        toStringArrayMethod.setAccessible(true);
        java.lang.Object[] toStringArrayMethodArguments = new java.lang.Object[1];
        toStringArrayMethodArguments[0] = ((Object) objectArray);
        java.lang.String[] actual = ((java.lang.String[]) toStringArrayMethod.invoke(cSVFormat, toStringArrayMethodArguments));
        
        java.lang.String[] expected = new java.lang.String[2];
        String string = "\u0000";
        expected[1] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withHeader(java.sql.ResultSetMetaData)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.executesCondition {@code (metaData != null): False}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.returnsFrom {@code return withHeader(labels);}
 *  */
    @Test
    public void testWithHeader_MetaDataEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader(java.sql.ResultSetMetaData)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(labels);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(labels);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(labels);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withHeader(java.sql.ResultSetMetaData)
    
    @Test
    public void testWithHeader1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithHeader2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
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
    public void testWithHeader6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
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
    public void testWithHeader10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withHeader(((ResultSetMetaData) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader(java.sql.ResultSetMetaData)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withHeader(((ResultSetMetaData) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeader
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader(java.sql.ResultSet)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSet)}
 * @utbot.executesCondition {@code (resultSet != null): False}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#withHeader(java.sql.ResultSetMetaData)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader(resultSet != null ? resultSet.getMetaData() : null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeader(((ResultSet) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withHeader(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.Class)}
 * @utbot.executesCondition {@code (headerEnum != null): True}
 * @utbot.invokes {@link java.lang.Class#getEnumConstants()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Enum<?>[] enumValues = headerEnum.getEnumConstants();
 *  */
    @Test
    public void testWithHeader_ThrowNullPointerException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Class class1 = Object.class;
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.withHeader] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.withHeader(CSVFormat.java:1584) */
        cSVFormat.withHeader(class1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withHeader(java.lang.Class)
    
    @Test
    public void testWithHeader29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((Class) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((Class) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((Class) null));
        
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
    public void testWithHeader32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withHeader(((Class) null));
        
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
    public void testWithHeader33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((Class) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withHeader(((Class) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader(java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withHeader(((Class) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withHeader(((Class) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((Class) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((Class) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withHeader(((Class) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((Class) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeader(((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeader
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withHeader([Ljava.lang.String;)
    
    @Test
    public void testWithHeader42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeader44() throws Exception  {
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
        
        CSVFormat actual = cSVFormat.withHeader(((java.lang.String[]) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader([Ljava.lang.String;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader50() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        java.lang.String[] stringArray = {};
        
        cSVFormat.withHeader(stringArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader52() throws Exception  {
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
    public void testWithHeader53() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader54() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withHeader(((java.lang.String[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withRecordSeparator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withRecordSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
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
    public void testWithRecordSeparator2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator4() throws Exception  {
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
    public void testWithRecordSeparator5() throws Exception  {
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
    public void testWithRecordSeparator6() throws Exception  {
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
    public void testWithRecordSeparator7() throws Exception  {
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
    public void testWithRecordSeparator8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithRecordSeparator10() throws Exception  {
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
    public void testWithRecordSeparator11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withRecordSeparator
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withRecordSeparator(char)
    
    @Test
    public void testWithRecordSeparator21() throws Exception  {
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withNullString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withNullString(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withNullString(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withNullString(java.lang.String)
    
    @Test
    public void testWithNullString1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNullString2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNullString3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0002');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0002');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNullString4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
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
    public void testWithNullString5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNullString6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNullString7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNullString8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNullString9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNullString10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithNullString11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withNullString(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withNullString(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withNullString(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withEscape
    
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withEscape(java.lang.Character)
    
    @Test
    public void testWithEscape1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0084');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0084');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithEscape3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
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
    public void testWithEscape5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
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
    public void testWithEscape8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withEscape(java.lang.Character)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withEscape(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withEscape(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withEscape(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character character = '\u0000';
        
        cSVFormat.withEscape(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withEscape
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withEscape(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withEscape('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withEscape('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withEscape(Character.valueOf(escape));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withEscape(' ');
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withEscape(char)
    
    @Test
    public void testWithEscape21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withEscape('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0210');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withEscape('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0210');
        Character escapeCharacter = '\u0000';
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withEscape('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithEscape24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withEscape('\u0000');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withEscape(char)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {null, null, null, null, null, null, null, null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withEscape('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withEscape('\u0001');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        cSVFormat.withEscape('\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.printRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printRecord(java.lang.Appendable, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printRecord(java.lang.Appendable,java.lang.Object[])}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#println(java.lang.Appendable)}
 *  */
    @Test
    public void testPrintRecord_CSVFormatPrintln() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.Object[] objectArray = {};
        
        cSVFormat.printRecord(null, objectArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printRecord(java.lang.Appendable, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printRecord(java.lang.Appendable,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < values.length; i++)
 *  */
    @Test
    public void testPrintRecord_ThrowNullPointerException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1294) */
        cSVFormat.printRecord(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method printRecord(java.lang.Appendable, [Ljava.lang.Object;)
    
    @Test
    public void testPrintRecord1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        java.lang.Object[] objectArray = {};
        
        cSVFormat.printRecord(printStream, objectArray);
    }
    
    @Test
    public void testPrintRecord2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        StringBuffer stringBuffer = new StringBuffer("");
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = -6;
        objectArray[0] = ((Object) integer);
        char[] charArray = {};
        objectArray[1] = ((Object) charArray);
        objectArray[2] = ((Object) charArray);
        objectArray[3] = ((Object) charArray);
        objectArray[4] = ((Object) charArray);
        objectArray[5] = ((Object) charArray);
        objectArray[6] = ((Object) charArray);
        objectArray[7] = ((Object) charArray);
        objectArray[8] = ((Object) charArray);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringBufferType = Class.forName("java.lang.Appendable");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method printRecordMethod = cSVFormatClazz.getDeclaredMethod("printRecord", stringBufferType, objectArrayType);
        printRecordMethod.setAccessible(true);
        java.lang.Object[] printRecordMethodArguments = new java.lang.Object[2];
        printRecordMethodArguments[0] = stringBuffer;
        printRecordMethodArguments[1] = ((Object) objectArray);
        printRecordMethod.invoke(cSVFormat, printRecordMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printRecord(java.lang.Appendable, [Ljava.lang.Object;)
    
    @Test
    public void testPrintRecord3() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Object byteBufferAsCharBufferRL = createInstance("java.nio.ByteBufferAsCharBufferRL");
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = 671088657;
        objectArray[0] = ((Object) integer);
        objectArray[1] = ((Object) integer);
        objectArray[2] = ((Object) integer);
        objectArray[3] = ((Object) integer);
        objectArray[4] = ((Object) integer);
        objectArray[5] = ((Object) integer);
        objectArray[6] = ((Object) integer);
        objectArray[7] = ((Object) integer);
        objectArray[8] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.CharBuffer.put(CharBuffer.java:1397)
            java.base/java.nio.CharBuffer.put(CharBuffer.java:1427)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:2019)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:267)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteBufferAsCharBufferRLType = Class.forName("java.lang.Appendable");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method printRecordMethod = cSVFormatClazz.getDeclaredMethod("printRecord", byteBufferAsCharBufferRLType, objectArrayType);
        printRecordMethod.setAccessible(true);
        java.lang.Object[] printRecordMethodArguments = new java.lang.Object[2];
        printRecordMethodArguments[0] = byteBufferAsCharBufferRL;
        printRecordMethodArguments[1] = ((Object) objectArray);
        try {
            printRecordMethod.invoke(cSVFormat, printRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintRecord4() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "!";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trim", true);
        Object byteBufferAsCharBufferRL = createInstance("java.nio.ByteBufferAsCharBufferRL");
        java.lang.Object[] objectArray = new java.lang.Object[9];
        objectArray[1] = byteBufferAsCharBufferRL;
        objectArray[2] = byteBufferAsCharBufferRL;
        objectArray[3] = byteBufferAsCharBufferRL;
        objectArray[4] = byteBufferAsCharBufferRL;
        objectArray[5] = byteBufferAsCharBufferRL;
        objectArray[6] = byteBufferAsCharBufferRL;
        objectArray[7] = byteBufferAsCharBufferRL;
        objectArray[8] = byteBufferAsCharBufferRL;
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.CharBuffer.put(CharBuffer.java:1397)
            java.base/java.nio.CharBuffer.put(CharBuffer.java:1427)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:1982)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:267)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class byteBufferAsCharBufferRLType = Class.forName("java.lang.Appendable");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method printRecordMethod = cSVFormatClazz.getDeclaredMethod("printRecord", byteBufferAsCharBufferRLType, objectArrayType);
        printRecordMethod.setAccessible(true);
        java.lang.Object[] printRecordMethodArguments = new java.lang.Object[2];
        printRecordMethodArguments[0] = byteBufferAsCharBufferRL;
        printRecordMethodArguments[1] = ((Object) objectArray);
        try {
            printRecordMethod.invoke(cSVFormat, printRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintRecord5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Character character = '\u0100';
        objectArray[0] = ((Object) character);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        cSVFormat.printRecord(null, objectArray);
    }
    
    @Test
    public void testPrintRecord6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trim", true);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        cSVFormat.printRecord(null, objectArray);
    }
    
    @Test
    public void testPrintRecord7() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method printRecordMethod = cSVFormatClazz.getDeclaredMethod("printRecord", printWriterType, objectArrayType);
        printRecordMethod.setAccessible(true);
        java.lang.Object[] printRecordMethodArguments = new java.lang.Object[2];
        printRecordMethodArguments[0] = printWriter;
        printRecordMethodArguments[1] = ((Object) objectArray);
        try {
            printRecordMethod.invoke(cSVFormat, printRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintRecord8() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.println(CSVFormat.java:1272)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1297) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method printRecordMethod = cSVFormatClazz.getDeclaredMethod("printRecord", printWriterType, objectArrayType);
        printRecordMethod.setAccessible(true);
        java.lang.Object[] printRecordMethodArguments = new java.lang.Object[2];
        printRecordMethodArguments[0] = printWriter;
        printRecordMethodArguments[1] = ((Object) objectArray);
        try {
            printRecordMethod.invoke(cSVFormat, printRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintRecord9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trim", true);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        cSVFormat.printRecord(null, objectArray);
    }
    
    @Test
    public void testPrintRecord10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1220)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1099)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        cSVFormat.printRecord(null, objectArray);
    }
    
    @Test
    public void testPrintRecord11() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        java.lang.Object[] objectArray = {};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.println(CSVFormat.java:1269)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1297) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method printRecordMethod = cSVFormatClazz.getDeclaredMethod("printRecord", printWriterType, objectArrayType);
        printRecordMethod.setAccessible(true);
        java.lang.Object[] printRecordMethodArguments = new java.lang.Object[2];
        printRecordMethodArguments[0] = printWriter;
        printRecordMethodArguments[1] = ((Object) objectArray);
        try {
            printRecordMethod.invoke(cSVFormat, printRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintRecord12() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1103)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class objectArrayType = Class.forName("[Ljava.lang.Object;");
        Method printRecordMethod = cSVFormatClazz.getDeclaredMethod("printRecord", printWriterType, objectArrayType);
        printRecordMethod.setAccessible(true);
        java.lang.Object[] printRecordMethodArguments = new java.lang.Object[2];
        printRecordMethodArguments[0] = printWriter;
        printRecordMethodArguments[1] = ((Object) objectArray);
        try {
            printRecordMethod.invoke(cSVFormat, printRecordMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintRecord13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1143)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1101)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        cSVFormat.printRecord(null, objectArray);
    }
    
    @Test
    public void testPrintRecord14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printRecord] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1096)
            org.apache.commons.csv.CSVFormat.print(CSVFormat.java:1087)
            org.apache.commons.csv.CSVFormat.printRecord(CSVFormat.java:1295) */
        cSVFormat.printRecord(null, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuote
    
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
    public void testWithQuote_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withQuote(' ');
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withQuote(char)
    
    @Test
    public void testWithQuote1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withQuote('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0001';
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithQuote2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuote('\u0100');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        Character quoteCharacter = '\u0100';
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithQuote3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withQuote('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        Character quoteCharacter = '\u0001';
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withQuote(char)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote('\u0001');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote('\u0001');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote('\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuote
    
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote(((Character) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withQuote(java.lang.Character)
    
    @Test
    public void testWithQuote7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithQuote8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
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
    public void testWithQuote9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
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
    public void testWithQuote10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
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
    public void testWithQuote11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithQuote12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
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
    public void testWithQuote13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithQuote14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithQuote15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithQuote16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithQuote17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withQuote(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withQuote(java.lang.Character)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withQuote(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuote28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character character = '\u0000';
        
        cSVFormat.withQuote(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.newFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newFormat(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#newFormat(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, null, false, false, false, false, false, false);}
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, null, false, false, false, false, false, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_ThrowIllegalArgumentException() {
        CSVFormat.newFormat('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#newFormat(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, null, false, false, false, false, false, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_ThrowIllegalArgumentException_1() {
        CSVFormat.newFormat('\r');
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.printAndEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printAndEscape(java.lang.CharSequence, int, int, java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndEscape(java.lang.CharSequence,int,int,java.lang.Appendable)}
 * @utbot.executesCondition {@code (if (pos > start) {
 *     out.append(value, start, pos);
 * }): False}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getDelimiter()}
 * @utbot.invokes {@link org.apache.commons.csv.CSVFormat#getEscapeCharacter()}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 *  */
    @Test
    public void testPrintAndEscape_PosLessOrEqualStart() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", charSequenceType, intType, intType, appendableType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = ((Object) null);
        printAndEscapeMethodArguments[1] = -231;
        printAndEscapeMethodArguments[2] = 0;
        printAndEscapeMethodArguments[3] = ((Object) null);
        printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printAndEscape(java.lang.CharSequence, int, int, java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndEscape(java.lang.CharSequence,int,int,java.lang.Appendable)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: char c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndEscape_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1120) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, appendableType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = -255;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = ((Object) null);
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndEscape(java.lang.CharSequence,int,int,java.lang.Appendable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char escape = getEscapeCharacter().charValue();
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1117) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", charSequenceType, intType, intType, appendableType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = ((Object) null);
        printAndEscapeMethodArguments[1] = -255;
        printAndEscapeMethodArguments[2] = -255;
        printAndEscapeMethodArguments[3] = ((Object) null);
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndEscape(java.lang.CharSequence,int,int,java.lang.Appendable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_1() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1120) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", charSequenceType, intType, intType, appendableType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = ((Object) null);
        printAndEscapeMethodArguments[1] = -254;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = ((Object) null);
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndEscape(java.lang.CharSequence,int,int,java.lang.Appendable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(escape);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_2() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1132) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, appendableType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = ((Object) null);
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndEscape(java.lang.CharSequence,int,int,java.lang.Appendable)}
 * @utbot.executesCondition {@code (if (pos > start) {
 *     out.append(value, start, pos);
 * }): True}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(value, start, pos);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_3() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '_');
        Character escapeCharacter = '_';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1143) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, appendableType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 1;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = ((Object) null);
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndEscape(java.lang.CharSequence,int,int,java.lang.Appendable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(escape);
 *  */
    @Test
    public void testPrintAndEscape_ThrowNullPointerException_4() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escapeCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\r";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1132) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, appendableType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = ((Object) null);
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method printAndEscape(java.lang.CharSequence, int, int, java.lang.Appendable)
    
    @Test
    public void testPrintAndEscape1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\u0000";
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printStreamType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, printStreamType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = printStream;
        printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
    }
    
    @Test
    public void testPrintAndEscape2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\n";
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printStreamType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, printStreamType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = printStream;
        printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
    }
    
    @Test
    public void testPrintAndEscape3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\r";
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printStreamType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, printStreamType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = printStream;
        printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
    }
    
    @Test
    public void testPrintAndEscape4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\u0000";
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printStreamType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, printStreamType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = printStream;
        printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printAndEscape(java.lang.CharSequence, int, int, java.lang.Appendable)
    
    @Test
    public void testPrintAndEscape5() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1143) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, printWriterType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 1;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = printWriter;
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndEscape6() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:237)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:229)
            java.base/java.io.OutputStreamWriter.append(OutputStreamWriter.java:76)
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1143) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, outputStreamWriterType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 31;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = outputStreamWriter;
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndEscape7() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1124) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, appendableType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 1;
        printAndEscapeMethodArguments[2] = 2;
        printAndEscapeMethodArguments[3] = ((Object) null);
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndEscape8() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\u0000";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1132) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, printWriterType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = printWriter;
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndEscape9() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        String string = "\r";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndEscape] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1132) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Method printAndEscapeMethod = cSVFormatClazz.getDeclaredMethod("printAndEscape", stringType, intType, intType, printWriterType);
        printAndEscapeMethod.setAccessible(true);
        java.lang.Object[] printAndEscapeMethodArguments = new java.lang.Object[4];
        printAndEscapeMethodArguments[0] = string;
        printAndEscapeMethodArguments[1] = 0;
        printAndEscapeMethodArguments[2] = 1;
        printAndEscapeMethodArguments[3] = printWriter;
        try {
            printAndEscapeMethod.invoke(cSVFormat, printAndEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for printAndEscape
    
    public void testPrintAndEscape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.printAndQuote
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printAndQuote(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char quoteChar = getQuoteCharacter().charValue();
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1159) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType, appendableType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = -255;
        printAndQuoteMethodArguments[4] = ((Object) null);
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (quoteModePolicy == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(quoteModePolicy)
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_1() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.MINIMAL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1220) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType, appendableType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = ((Object) null);
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (quoteModePolicy == null): False}
 * @utbot.executesCondition {@code (len <= 0): False}
 * @utbot.invokes {@link java.lang.CharSequence#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char c = value.charAt(pos);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_2() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.MINIMAL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1187) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType, appendableType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = 1;
        printAndQuoteMethodArguments[4] = ((Object) null);
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (quoteModePolicy == null): False}
 * @utbot.executesCondition {@code (len <= 0): True}
 * @utbot.executesCondition {@code (newRecord): False}
 * @utbot.executesCondition {@code (!quote): True}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(value, start, end);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_3() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '@');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.MINIMAL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1220) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType, appendableType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = ((Object) null);
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (quoteModePolicy == null): False}
 * @utbot.executesCondition {@code (quote = !(object instanceof Number);): False}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence,int,int)}
 * @utbot.activatesSwitch {@code switch(quoteModePolicy) case: NON_NUMERIC}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(value, start, end);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_4() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = '@';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1230) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class integerType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", integerType, charSequenceType, intType, intType, appendableType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = integer;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = ((Object) null);
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printAndQuote(java.lang.Object,java.lang.CharSequence,int,int,java.lang.Appendable,boolean)}
 * @utbot.executesCondition {@code (quoteModePolicy == null): False}
 * @utbot.executesCondition {@code (len <= 0): True}
 * @utbot.executesCondition {@code (newRecord): True}
 * @utbot.executesCondition {@code (!quote): False}
 * @utbot.invokes {@link java.lang.Appendable#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(quoteChar);
 *  */
    @Test
    public void testPrintAndQuote_ThrowNullPointerException_5() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.MINIMAL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1235) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType, appendableType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = ((Object) null);
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = -255;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = ((Object) null);
        printAndQuoteMethodArguments[5] = true;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method printAndQuote(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)
    
    @Test
    public void testPrintAndQuote1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Object object = new Object();
        String string = "";
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printStreamType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType, printStreamType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = printStream;
        printAndQuoteMethodArguments[5] = false;
        printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
    }
    
    @Test
    public void testPrintAndQuote2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Object object = new Object();
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printStreamType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType, printStreamType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = printStream;
        printAndQuoteMethodArguments[5] = false;
        printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method printAndQuote(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)
    
    @Test
    public void testPrintAndQuote3() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.MINIMAL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Object object = new Object();
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483647, length 4]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.subSequence(String.java:2749)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1220) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType, printWriterType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = -2147483647;
        printAndQuoteMethodArguments[4] = printWriter;
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote4() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Object object = new Object();
        Object byteBufferAsCharBufferRL = createInstance("java.nio.ByteBufferAsCharBufferRL");
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.nio.ReadOnlyBufferException]
            java.base/java.nio.ByteBufferAsCharBufferRL.put(ByteBufferAsCharBufferRL.java:161)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:2046)
            java.base/java.nio.CharBuffer.append(CharBuffer.java:267)
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1235) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class byteBufferAsCharBufferRLType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType, byteBufferAsCharBufferRLType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = byteBufferAsCharBufferRL;
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote5() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.MINIMAL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1187) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType, appendableType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 1;
        printAndQuoteMethodArguments[4] = ((Object) null);
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote6() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NON_NUMERIC;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Integer integer = 0;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1127)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1230) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class integerType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", integerType, charSequenceType, intType, intType, printWriterType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = integer;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = printWriter;
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote7() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVFormat.printAndEscape(CSVFormat.java:1117)
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1175) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class appendableType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType, appendableType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = ((Object) null);
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote8() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        Object object = new Object();
        StringWriter stringWriter = ((StringWriter) createInstance("java.io.StringWriter"));
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:106)
            java.base/java.io.StringWriter.append(StringWriter.java:150)
            java.base/java.io.StringWriter.append(StringWriter.java:190)
            java.base/java.io.StringWriter.append(StringWriter.java:41)
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1220) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class charSequenceType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class stringWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, charSequenceType, intType, intType, stringWriterType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = ((Object) null);
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = stringWriter;
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrintAndQuote9() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        QuoteMode quoteMode = QuoteMode.ALL_NON_NULL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        Object object = new Object();
        String string = "";
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.printAndQuote] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.apache.commons.csv.CSVFormat.printAndQuote(CSVFormat.java:1235) */
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.CharSequence");
        Class intType = int.class;
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class booleanType = boolean.class;
        Method printAndQuoteMethod = cSVFormatClazz.getDeclaredMethod("printAndQuote", objectType, stringType, intType, intType, anonymousPrintWriterType, booleanType);
        printAndQuoteMethod.setAccessible(true);
        java.lang.Object[] printAndQuoteMethodArguments = new java.lang.Object[6];
        printAndQuoteMethodArguments[0] = object;
        printAndQuoteMethodArguments[1] = string;
        printAndQuoteMethodArguments[2] = 0;
        printAndQuoteMethodArguments[3] = 0;
        printAndQuoteMethodArguments[4] = anonymousPrintWriter;
        printAndQuoteMethodArguments[5] = false;
        try {
            printAndQuoteMethod.invoke(cSVFormat, printAndQuoteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getTrim
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTrim()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getTrim()}
 * @utbot.returnsFrom {@code return trim;}
 *  */
    @Test
    public void testGetTrim_ReturnTrim() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.getTrim();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getAutoFlush
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAutoFlush()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getAutoFlush()}
 * @utbot.returnsFrom {@code return autoFlush;}
 *  */
    @Test
    public void testGetAutoFlush_ReturnAutoFlush() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.getAutoFlush();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.printer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printer()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printer()}
 *  */
    @Test
    public void testPrinter() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#printer()}
 * @utbot.returnsFrom {@code return new CSVPrinter(System.out, this);}
 *  */
    @Test
    public void testPrinter_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method printer()
    
    @Test
    public void testPrinter1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
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
    public void testPrinter2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = new java.lang.String[8];
        String string = "";
        header[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
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
    public void testPrinter3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
    }
    
    @Test
    public void testPrinter4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
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
    public void testPrinter5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
    }
    
    @Test
    public void testPrinter6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String recordSeparator = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "recordSeparator", recordSeparator);
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
        CSVFormat expectedFormat = ((CSVFormat) getFieldValue(expected, "org.apache.commons.csv.CSVPrinter", "format"));
        CSVFormat actualFormat = ((CSVFormat) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "format"));
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        boolean actualNewRecord = ((Boolean) getFieldValue(actual, "org.apache.commons.csv.CSVPrinter", "newRecord"));
        assertTrue(actualNewRecord);
        
    }
    
    @Test
    public void testPrinter7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        QuoteMode quoteMode = QuoteMode.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
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
        
        assertNull(finalCSVFormatHeader0);
        
        assertNull(finalCSVFormatHeader1);
    }
    
    @Test
    public void testPrinter8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        
        CSVPrinter actual = cSVFormat.printer();
        
        CSVPrinter expected = ((CSVPrinter) createInstance("org.apache.commons.csv.CSVPrinter"));
        PrintStream out = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(expected, "org.apache.commons.csv.CSVPrinter", "out", out);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "format", cSVFormat);
        setField(expected, "org.apache.commons.csv.CSVPrinter", "newRecord", true);
        
        Appendable expectedOut = expected.getOut();
        Appendable actualOut = actual.getOut();
        
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeaderComments
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeaderComments([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeaderComments(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withHeaderComments(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeaderComments(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeaderComments(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withHeaderComments([Ljava.lang.Object;)
    
    @Test
    public void testWithHeaderComments1() throws Exception  {
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.Object[] objectArray = {};
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments4() throws Exception  {
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
    public void testWithHeaderComments5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        CSVFormat actual = cSVFormat.withHeaderComments(objectArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "-2147483648";
        headerComments[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithHeaderComments6() throws Exception  {
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
    public void testWithHeaderComments7() throws Exception  {
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
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeaderComments([Ljava.lang.Object;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {null};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.Object[] objectArray = new java.lang.Object[1];
        Integer integer = Integer.MIN_VALUE;
        objectArray[0] = ((Object) integer);
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.Object[] objectArray = {};
        
        cSVFormat.withHeaderComments(objectArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withHeaderComments(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeaderComments20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withHeaderComments(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withAutoFlush
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAutoFlush(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAutoFlush(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAutoFlush(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAutoFlush(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withAutoFlush(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAutoFlush(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withAutoFlush(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withAutoFlush(boolean)
    
    @Test
    public void testWithAutoFlush1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
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
    public void testWithAutoFlush3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
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
    public void testWithAutoFlush4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
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
    public void testWithAutoFlush10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAutoFlush15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAutoFlush(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAutoFlush(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAutoFlush(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAutoFlush29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAutoFlush(false);
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
    public void testWithCommentMarker_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker('\u0001');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0001';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withCommentMarker(char)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker('\u0000');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withCommentMarker
    
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentMarker(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withCommentMarker(java.lang.Character)
    
    @Test
    public void testWithCommentMarker8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u4000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u4000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
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
    public void testWithCommentMarker12() throws Exception  {
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
    public void testWithCommentMarker13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
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
    public void testWithCommentMarker18() throws Exception  {
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
    public void testWithCommentMarker19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithCommentMarker20() throws Exception  {
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
    public void testWithCommentMarker21() throws Exception  {
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
    
    @Test
    public void testWithCommentMarker22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withCommentMarker(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withCommentMarker(java.lang.Character)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withCommentMarker(((Character) null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentMarker30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character character = '\u0000';
        
        cSVFormat.withCommentMarker(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withTrim
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withTrim(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withTrim(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withTrim(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withTrim(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withTrim(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withTrim(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withTrim(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withTrim
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withTrim()
    
    @Test
    public void testWithTrim1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrim2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrim3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrim4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrim5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithTrim6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithTrim7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrim8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrim9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrim10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrim11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrim12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null, null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
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
    public void testWithTrim13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withTrim();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "trim", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withTrim()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withTrim();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withTrim();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withTrim();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withTrim();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withTrim();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withTrim();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withTrim();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withTrim();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrim22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withTrim();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getTrailingDelimiter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTrailingDelimiter()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getTrailingDelimiter()}
 * @utbot.returnsFrom {@code return trailingDelimiter;}
 *  */
    @Test
    public void testGetTrailingDelimiter_ReturnTrailingDelimiter() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.getTrailingDelimiter();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAllowMissingColumnNames(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withAllowMissingColumnNames(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withAllowMissingColumnNames(boolean)
    
    @Test
    public void testWithAllowMissingColumnNames1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames3() throws Exception  {
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
    public void testWithAllowMissingColumnNames4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames5() throws Exception  {
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
    public void testWithAllowMissingColumnNames6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames7() throws Exception  {
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
    public void testWithAllowMissingColumnNames8() throws Exception  {
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
    public void testWithAllowMissingColumnNames9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames10() throws Exception  {
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
    public void testWithAllowMissingColumnNames11() throws Exception  {
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
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAllowMissingColumnNames(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withAllowMissingColumnNames()
    
    @Test
    public void testWithAllowMissingColumnNames24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
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
    public void testWithAllowMissingColumnNames27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u8000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u8000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
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
    public void testWithAllowMissingColumnNames30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
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
    public void testWithAllowMissingColumnNames31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithAllowMissingColumnNames36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
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
    public void testWithAllowMissingColumnNames37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withAllowMissingColumnNames();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "allowMissingColumnNames", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withAllowMissingColumnNames()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withAllowMissingColumnNames();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithAllowMissingColumnNames49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withAllowMissingColumnNames();
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreEmptyLines()
    
    @Test
    public void testWithIgnoreEmptyLines1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines3() throws Exception  {
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
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreEmptyLines7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreEmptyLines9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines10() throws Exception  {
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
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null, null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
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
    public void testWithIgnoreEmptyLines14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreEmptyLines()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withIgnoreEmptyLines();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreEmptyLines(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreEmptyLines(boolean)
    
    @Test
    public void testWithIgnoreEmptyLines28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines29() throws Exception  {
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
    public void testWithIgnoreEmptyLines30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines32() throws Exception  {
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
    public void testWithIgnoreEmptyLines33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines34() throws Exception  {
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
    public void testWithIgnoreEmptyLines35() throws Exception  {
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
    public void testWithIgnoreEmptyLines36() throws Exception  {
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
    public void testWithIgnoreEmptyLines37() throws Exception  {
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
    public void testWithIgnoreEmptyLines38() throws Exception  {
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
    public void testWithIgnoreEmptyLines39() throws Exception  {
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
    public void testWithIgnoreEmptyLines40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreEmptyLines41() throws Exception  {
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
    public void testWithIgnoreEmptyLines42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines50() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines51() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines52() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines53() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines54() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines55() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreEmptyLines(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withTrailingDelimiter
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withTrailingDelimiter()
    
    @Test
    public void testWithTrailingDelimiter1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithTrailingDelimiter6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithTrailingDelimiter7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null, null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
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
    public void testWithTrailingDelimiter13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "trailingDelimiter", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withTrailingDelimiter()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withTrailingDelimiter();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withTrailingDelimiter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withTrailingDelimiter
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withTrailingDelimiter(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withTrailingDelimiter(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withTrailingDelimiter(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withTrailingDelimiter(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withTrailingDelimiter(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withTrailingDelimiter(boolean)
    
    @Test
    public void testWithTrailingDelimiter25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
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
    public void testWithTrailingDelimiter32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithTrailingDelimiter37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withTrailingDelimiter(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withTrailingDelimiter(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithTrailingDelimiter50() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withTrailingDelimiter(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withFirstRecordAsHeader
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withFirstRecordAsHeader()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withFirstRecordAsHeader()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader().withSkipHeaderRecord();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withFirstRecordAsHeader();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withFirstRecordAsHeader()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withHeader().withSkipHeaderRecord();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withFirstRecordAsHeader();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withFirstRecordAsHeader()
    
    @Test
    public void testWithFirstRecordAsHeader1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithFirstRecordAsHeader2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithFirstRecordAsHeader3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithFirstRecordAsHeader4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithFirstRecordAsHeader5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithFirstRecordAsHeader6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithFirstRecordAsHeader7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
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
    public void testWithFirstRecordAsHeader8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[2];
        String string = "";
        headerComments[1] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
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
    public void testWithFirstRecordAsHeader9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithFirstRecordAsHeader10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithFirstRecordAsHeader11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        CSVFormat actual = cSVFormat.withFirstRecordAsHeader();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withFirstRecordAsHeader()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withFirstRecordAsHeader();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withFirstRecordAsHeader();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        QuoteMode quoteMode = QuoteMode.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteMode", quoteMode);
        
        cSVFormat.withFirstRecordAsHeader();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withFirstRecordAsHeader();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withFirstRecordAsHeader();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withFirstRecordAsHeader();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withFirstRecordAsHeader();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithFirstRecordAsHeader19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        
        cSVFormat.withFirstRecordAsHeader();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreHeaderCase(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreHeaderCase(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreHeaderCase(boolean)
    
    @Test
    public void testWithIgnoreHeaderCase1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase3() throws Exception  {
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
    public void testWithIgnoreHeaderCase4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase5() throws Exception  {
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
    public void testWithIgnoreHeaderCase6() throws Exception  {
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
    public void testWithIgnoreHeaderCase7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase8() throws Exception  {
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
    
    @Test
    public void testWithIgnoreHeaderCase9() throws Exception  {
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
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreHeaderCase(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase10() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreHeaderCase()
    
    @Test
    public void testWithIgnoreHeaderCase22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase23() throws Exception  {
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
    public void testWithIgnoreHeaderCase24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase26() throws Exception  {
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
    public void testWithIgnoreHeaderCase27() throws Exception  {
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
    public void testWithIgnoreHeaderCase28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase29() throws Exception  {
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
    public void testWithIgnoreHeaderCase30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreHeaderCase32() throws Exception  {
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
    public void testWithIgnoreHeaderCase33() throws Exception  {
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
    public void testWithIgnoreHeaderCase34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withIgnoreHeaderCase();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreHeaderCase", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreHeaderCase()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreHeaderCase();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreHeaderCase45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withIgnoreHeaderCase();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    @Test
    public void testWithIgnoreSurroundingSpaces1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces4() throws Exception  {
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
    public void testWithIgnoreSurroundingSpaces5() throws Exception  {
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
    public void testWithIgnoreSurroundingSpaces6() throws Exception  {
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
    public void testWithIgnoreSurroundingSpaces7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces8() throws Exception  {
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
    public void testWithIgnoreSurroundingSpaces9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces10() throws Exception  {
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
    public void testWithIgnoreSurroundingSpaces11() throws Exception  {
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
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withIgnoreSurroundingSpaces()
    
    @Test
    public void testWithIgnoreSurroundingSpaces24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces27() throws Exception  {
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
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces28() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces29() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces30() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces32() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] cSVFormatHeaderComments = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments"));
        String finalCSVFormatHeaderComments0 = ((String) get(cSVFormatHeaderComments, 0));
        
        assertNull(finalCSVFormatHeaderComments0);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces34() throws Exception  {
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
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces35() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = new java.lang.String[1];
        String string = "";
        headerComments[0] = string;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = new java.lang.String[1];
        headerComments1[0] = string;
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithIgnoreSurroundingSpaces36() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null, null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
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
    public void testWithIgnoreSurroundingSpaces37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreSurroundingSpaces()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withIgnoreSurroundingSpaces();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces49() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withIgnoreSurroundingSpaces();
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withSkipHeaderRecord
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withSkipHeaderRecord()
    
    @Test
    public void testWithSkipHeaderRecord1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        java.lang.String[] headerComments = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
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
    public void testWithSkipHeaderRecord6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord7() throws Exception  {
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
    public void testWithSkipHeaderRecord8() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord9() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
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
    public void testWithSkipHeaderRecord11() throws Exception  {
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
    public void testWithSkipHeaderRecord12() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments1 = {null, null};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
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
    public void testWithSkipHeaderRecord13() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord();
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        setField(expected, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSkipHeaderRecord()
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord14() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord15() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord16() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord17() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord18() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord19() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord20() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord22() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord23() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord24() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withSkipHeaderRecord();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withSkipHeaderRecord
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSkipHeaderRecord(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteCharacter, quoteMode, commentMarker, escapeCharacter, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, headerComments, header, skipHeaderRecord, allowMissingColumnNames, ignoreHeaderCase, trim, trailingDelimiter, autoFlush);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withSkipHeaderRecord(boolean)
    
    @Test
    public void testWithSkipHeaderRecord25() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord26() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", escapeCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord27() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord28() throws Exception  {
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
    public void testWithSkipHeaderRecord29() throws Exception  {
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
    public void testWithSkipHeaderRecord30() throws Exception  {
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
    public void testWithSkipHeaderRecord31() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(expected, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] headerComments1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord32() throws Exception  {
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
    public void testWithSkipHeaderRecord33() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord34() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWithSkipHeaderRecord35() throws Exception  {
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
    public void testWithSkipHeaderRecord36() throws Exception  {
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
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSkipHeaderRecord(boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord37() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord38() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character escapeCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", escapeCharacter);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord39() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord40() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord41() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord42() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord43() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", header);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord44() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escapeCharacter", commentMarker);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord45() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", commentMarker);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord46() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        Character quoteCharacter = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteCharacter", quoteCharacter);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord47() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentMarker = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentMarker", commentMarker);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord48() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        java.lang.String[] headerComments = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "headerComments", headerComments);
        
        cSVFormat.withSkipHeaderRecord(false);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields966212468004000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields966212468004000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass966212468009800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields966212468004000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass966212468009800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields966212468299000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields966212468299000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass966212468300600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields966212468299000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass966212468300600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

