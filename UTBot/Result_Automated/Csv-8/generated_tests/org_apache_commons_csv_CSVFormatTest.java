package org.apache.commons.csv;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.apache.commons.csv.Token.Type;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_csv_CSVFormatTest {
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withHeader
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withHeader([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithHeader_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] stringArray = {};
        
        CSVFormat actual = cSVFormat.withHeader(stringArray);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithHeader_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withHeader(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withHeader([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withHeader(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithHeader_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withHeader(null);
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withRecordSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withRecordSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithRecordSeparator_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithRecordSeparator_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withRecordSeparator(((String) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withRecordSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withRecordSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithRecordSeparator_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withRecordSeparator(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withNullString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withNullString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithNullString_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithNullString_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withNullString(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withNullString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withNullString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullString_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withNullString(null);
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
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withEscape(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(expected, "org.apache.commons.csv.CSVFormat", "escape", escape);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withEscape(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(expected, "org.apache.commons.csv.CSVFormat", "escape", escape);
        
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
    public void testWithEscape_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withEscape(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withEscape(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithEscape_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithEscape_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withEscape(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withEscape(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withEscape(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithEscape_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        Character character = ' ';
        
        cSVFormat.withEscape(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withCommentStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withCommentStart(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(char)}
 * @utbot.returnsFrom {@code return withCommentStart(Character.valueOf(commentStart));}
 *  */
    @Test
    public void testWithCommentStart_ReturnWithCommentStart() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentStart(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentStart = ' ';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(char)}
 * @utbot.returnsFrom {@code return withCommentStart(Character.valueOf(commentStart));}
 *  */
    @Test
    public void testWithCommentStart_ReturnWithCommentStart_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withCommentStart(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentStart = ' ';
        setField(expected, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withCommentStart(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentStart(Character.valueOf(commentStart));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withCommentStart('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentStart(Character.valueOf(commentStart));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withCommentStart('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withCommentStart(Character.valueOf(commentStart));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withCommentStart(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withCommentStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withCommentStart(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithCommentStart_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withCommentStart(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithCommentStart_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withCommentStart(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withCommentStart(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(commentStart)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\r';
        
        cSVFormat.withCommentStart(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(commentStart)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\n';
        
        cSVFormat.withCommentStart(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withCommentStart(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withCommentStart(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithCommentStart_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        Character character = ' ';
        
        cSVFormat.withCommentStart(character);
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.newFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newFormat(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#newFormat(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, false);}
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_ThrowIllegalArgumentException() {
        CSVFormat.newFormat('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#newFormat(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, null, null, null, null, false, false, null, null, null, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewFormat_ThrowIllegalArgumentException_1() {
        CSVFormat.newFormat('\r');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getCommentStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCommentStart()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getCommentStart()}
 * @utbot.returnsFrom {@code return commentStart;}
 *  */
    @Test
    public void testGetCommentStart_ReturnCommentStart() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        Character actual = cSVFormat.getCommentStart();
        
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getQuotePolicy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQuotePolicy()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getQuotePolicy()}
 * @utbot.returnsFrom {@code return quotePolicy;}
 *  */
    @Test
    public void testGetQuotePolicy_ReturnQuotePolicy() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        Quote actual = cSVFormat.getQuotePolicy();
        
        assertNull(actual);
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getQuoteChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQuoteChar()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getQuoteChar()}
 * @utbot.returnsFrom {@code return quoteChar;}
 *  */
    @Test
    public void testGetQuoteChar_ReturnQuoteChar() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        Character actual = cSVFormat.getQuoteChar();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isEscaping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEscaping()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isEscaping()}
 * @utbot.returnsFrom {@code return escape != null;}
 *  */
    @Test
    public void testIsEscaping_EscapeEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.isEscaping();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isEscaping()}
 * @utbot.returnsFrom {@code return escape != null;}
 *  */
    @Test
    public void testIsEscaping_EscapeNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character escape = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        
        boolean actual = cSVFormat.isEscaping();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isNullHandling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNullHandling()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isNullHandling()}
 * @utbot.returnsFrom {@code return nullString != null;}
 *  */
    @Test
    public void testIsNullHandling_NullStringEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.isNullHandling();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isNullHandling()}
 * @utbot.returnsFrom {@code return nullString != null;}
 *  */
    @Test
    public void testIsNullHandling_NullStringNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        String nullString = "";
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "nullString", nullString);
        
        boolean actual = cSVFormat.isNullHandling();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isQuoting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isQuoting()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isQuoting()}
 * @utbot.returnsFrom {@code return quoteChar != null;}
 *  */
    @Test
    public void testIsQuoting_QuoteCharEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.isQuoting();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isQuoting()}
 * @utbot.returnsFrom {@code return quoteChar != null;}
 *  */
    @Test
    public void testIsQuoting_QuoteCharNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        
        boolean actual = cSVFormat.isQuoting();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.getEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEscape()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#getEscape()}
 * @utbot.returnsFrom {@code return escape;}
 *  */
    @Test
    public void testGetEscape_ReturnEscape() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        Character actual = cSVFormat.getEscape();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuoteChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withQuoteChar(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(char)}
 * @utbot.returnsFrom {@code return withQuoteChar(Character.valueOf(quoteChar));}
 *  */
    @Test
    public void testWithQuoteChar_ReturnWithQuoteChar() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuoteChar(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(char)}
 * @utbot.returnsFrom {@code return withQuoteChar(Character.valueOf(quoteChar));}
 *  */
    @Test
    public void testWithQuoteChar_ReturnWithQuoteChar_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withQuoteChar(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(expected, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withQuoteChar(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuoteChar(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withQuoteChar('\n');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuoteChar(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        cSVFormat.withQuoteChar('\r');
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return withQuoteChar(Character.valueOf(quoteChar));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_ThrowIllegalArgumentException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withQuoteChar(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuoteChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withQuoteChar(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithQuoteChar_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuoteChar(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(java.lang.Character)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithQuoteChar_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withQuoteChar(((Character) null));
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withQuoteChar(java.lang.Character)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(quoteChar)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_ThrowIllegalArgumentException1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\r';
        
        cSVFormat.withQuoteChar(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: isLineBreak(quoteChar)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_ThrowIllegalArgumentException_11() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character character = '\n';
        
        cSVFormat.withQuoteChar(character);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_ThrowIllegalArgumentException_21() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withQuoteChar(((Character) null));
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuoteChar(java.lang.Character)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuoteChar_ThrowIllegalArgumentException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        Character character = ' ';
        
        cSVFormat.withQuoteChar(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withQuotePolicy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withQuotePolicy(org.apache.commons.csv.Quote)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuotePolicy(org.apache.commons.csv.Quote)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithQuotePolicy_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withQuotePolicy(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuotePolicy(org.apache.commons.csv.Quote)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithQuotePolicy_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withQuotePolicy(null);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withQuotePolicy(org.apache.commons.csv.Quote)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuotePolicy(org.apache.commons.csv.Quote)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuotePolicy_ThrowIllegalArgumentException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\n');
        
        cSVFormat.withQuotePolicy(null);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withQuotePolicy(org.apache.commons.csv.Quote)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithQuotePolicy_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withQuotePolicy(null);
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithIgnoreSurroundingSpaces_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithIgnoreSurroundingSpaces_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withIgnoreSurroundingSpaces(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreSurroundingSpaces(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreSurroundingSpaces(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreSurroundingSpaces_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreSurroundingSpaces(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withIgnoreEmptyLines(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithIgnoreEmptyLines_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithIgnoreEmptyLines_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withIgnoreEmptyLines(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withIgnoreEmptyLines(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withIgnoreEmptyLines(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithIgnoreEmptyLines_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withIgnoreEmptyLines(false);
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
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withSkipHeaderRecord
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withSkipHeaderRecord(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithSkipHeaderRecord_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithSkipHeaderRecord_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        CSVFormat actual = cSVFormat.withSkipHeaderRecord(false);
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withSkipHeaderRecord(boolean)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withSkipHeaderRecord(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithSkipHeaderRecord_ThrowIllegalArgumentException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\r');
        
        cSVFormat.withSkipHeaderRecord(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.isCommentingEnabled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCommentingEnabled()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isCommentingEnabled()}
 * @utbot.returnsFrom {@code return commentStart != null;}
 *  */
    @Test
    public void testIsCommentingEnabled_CommentStartEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        boolean actual = cSVFormat.isCommentingEnabled();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#isCommentingEnabled()}
 * @utbot.returnsFrom {@code return commentStart != null;}
 *  */
    @Test
    public void testIsCommentingEnabled_CommentStartNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Character commentStart = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        
        boolean actual = cSVFormat.isCommentingEnabled();
        
        assertTrue(actual);
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
        int[] intArray = {};
        
        boolean actual = cSVFormat.equals(intArray);
        
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
        Character escape = '\u0100';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> Escape=<\u0100> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> QuoteChar=<\u0000> SkipHeaderRecord:false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentStart = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        
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
    
    @Test
    public void testToString7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        java.lang.String[] header = {null, null, null, null, null, null, null, null, null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        String actual = cSVFormat.toString();
        
        String expected = "Delimiter=<\u0000> SkipHeaderRecord:false Header:[null, null, null, null, null, null, null, null, null]";
        
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
 * @utbot.executesCondition {@code ((quotePolicy == null)): False}
 * @utbot.executesCondition {@code ((quoteChar == null)): True}
 * @utbot.executesCondition {@code ((commentStart == null)): True}
 * @utbot.executesCondition {@code ((escape == null)): True}
 * @utbot.executesCondition {@code ((nullString == null)): True}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): True}
 * @utbot.executesCondition {@code (ignoreEmptyLines): False}
 * @utbot.executesCondition {@code (skipHeaderRecord): True}
 * @utbot.executesCondition {@code ((recordSeparator == null)): True}
 * @utbot.invokes {@link org.apache.commons.csv.Quote#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_QuotePolicyNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Quote quotePolicy = Quote.ALL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(-1436531882, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code ((quotePolicy == null)): True}
 * @utbot.executesCondition {@code ((quoteChar == null)): True}
 * @utbot.executesCondition {@code ((commentStart == null)): True}
 * @utbot.executesCondition {@code ((escape == null)): True}
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
 * @utbot.executesCondition {@code ((quotePolicy == null)): True}
 * @utbot.executesCondition {@code ((quoteChar == null)): True}
 * @utbot.executesCondition {@code ((commentStart == null)): True}
 * @utbot.executesCondition {@code ((escape == null)): True}
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
 * @utbot.executesCondition {@code ((quotePolicy == null)): True}
 * @utbot.executesCondition {@code ((quoteChar == null)): False}
 * @utbot.executesCondition {@code ((commentStart == null)): True}
 * @utbot.executesCondition {@code ((escape == null)): True}
 * @utbot.executesCondition {@code ((nullString == null)): True}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): False}
 * @utbot.executesCondition {@code (ignoreEmptyLines): False}
 * @utbot.executesCondition {@code (skipHeaderRecord): True}
 * @utbot.executesCondition {@code ((recordSeparator == null)): True}
 * @utbot.invokes {@link java.lang.Character#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_QuoteCharNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "skipHeaderRecord", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(1932643342, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code ((quotePolicy == null)): True}
 * @utbot.executesCondition {@code ((quoteChar == null)): True}
 * @utbot.executesCondition {@code ((commentStart == null)): False}
 * @utbot.executesCondition {@code ((escape == null)): True}
 * @utbot.executesCondition {@code ((nullString == null)): True}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): True}
 * @utbot.executesCondition {@code (ignoreEmptyLines): True}
 * @utbot.executesCondition {@code (skipHeaderRecord): False}
 * @utbot.executesCondition {@code ((recordSeparator == null)): True}
 * @utbot.invokes {@link java.lang.Character#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_CommentStartNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentStart = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreSurroundingSpaces", true);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "ignoreEmptyLines", true);
        
        int actual = cSVFormat.hashCode();
        
        assertEquals(-428714220, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#hashCode()}
 * @utbot.executesCondition {@code ((quotePolicy == null)): True}
 * @utbot.executesCondition {@code ((quoteChar == null)): True}
 * @utbot.executesCondition {@code ((commentStart == null)): True}
 * @utbot.executesCondition {@code ((escape == null)): False}
 * @utbot.executesCondition {@code ((nullString == null)): True}
 * @utbot.executesCondition {@code (ignoreSurroundingSpaces): False}
 * @utbot.executesCondition {@code (ignoreEmptyLines): True}
 * @utbot.executesCondition {@code (skipHeaderRecord): False}
 * @utbot.executesCondition {@code ((recordSeparator == null)): True}
 * @utbot.invokes {@link java.lang.Character#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_EscapeNotEqualsNull() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
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
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Character escape = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escape = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormat4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        String actual = cSVFormat.format(objectArray);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method format([Ljava.lang.Object;)
    
    @Test(expected = IllegalStateException.class)
    public void testFormat5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", quoteChar);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        cSVFormat.format(objectArray);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testFormat6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentStart = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        Character escape = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        cSVFormat.format(objectArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method format([Ljava.lang.Object;)
    
    @Test
    public void testFormat7() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escape = '@';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        /* This test fails because method [org.apache.commons.csv.CSVFormat.format] produces [java.lang.NullPointerException]
            org.apache.commons.csv.CSVPrinter.printRecord(CSVPrinter.java:363)
            org.apache.commons.csv.CSVFormat.format(CSVFormat.java:400) */
        cSVFormat.format(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.validate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method validate()
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (quoteChar != null): True}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: quoteChar != null && delimiter == quoteChar.charValue()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testValidate_ThrowIllegalStateException() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character quoteChar = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        
        cSVFormat.validate();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (quoteChar != null): False}
 * @utbot.executesCondition {@code (escape != null): True}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: escape != null && delimiter == escape.charValue()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testValidate_ThrowIllegalStateException_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character escape = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        
        cSVFormat.validate();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (quoteChar != null): False}
 * @utbot.executesCondition {@code (escape != null): False}
 * @utbot.executesCondition {@code (commentStart != null): True}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: commentStart != null && delimiter == commentStart.charValue()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testValidate_ThrowIllegalStateException_3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        Character commentStart = ' ';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        
        cSVFormat.validate();
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#validate()}
 * @utbot.executesCondition {@code (quoteChar != null): False}
 * @utbot.executesCondition {@code (escape != null): False}
 * @utbot.executesCondition {@code (commentStart != null): False}
 * @utbot.executesCondition {@code (quoteChar != null): False}
 * @utbot.executesCondition {@code (escape != null): False}
 * @utbot.executesCondition {@code (escape == null): True}
 * @utbot.executesCondition {@code (quotePolicy == Quote.NONE): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: escape == null && quotePolicy == Quote.NONE
 *  */
    @Test(expected = IllegalStateException.class)
    public void testValidate_ThrowIllegalStateException_2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Quote quotePolicy = Quote.NONE;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        
        cSVFormat.validate();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method validate()
    
    @Test
    public void testValidate1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", quoteChar);
        
        cSVFormat.validate();
    }
    
    @Test
    public void testValidate2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentStart = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        
        cSVFormat.validate();
    }
    
    @Test
    public void testValidate3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escape = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        
        cSVFormat.validate();
    }
    
    @Test
    public void testValidate4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Quote quotePolicy = Quote.MINIMAL;
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quotePolicy", quotePolicy);
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        cSVFormat.validate();
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method validate()
    
    @Test(expected = IllegalStateException.class)
    public void testValidate5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", quoteChar);
        
        cSVFormat.validate();
    }
    
    @Test(expected = IllegalStateException.class)
    public void testValidate6() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentStart = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", commentStart);
        
        cSVFormat.validate();
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.io.Reader)
    
    @Test
    public void testParse1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Character escape = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        Object lineReader = createInstance("java.io.Console$LineReader");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class lineReaderType = Class.forName("java.io.Reader");
        Method parseMethod = cSVFormatClazz.getDeclaredMethod("parse", lineReaderType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = lineReader;
        CSVParser actual = ((CSVParser) parseMethod.invoke(cSVFormat, parseMethodArguments));
        
        CSVParser expected = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        setField(expected, "org.apache.commons.csv.CSVParser", "format", cSVFormat);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0001');
        setField(lexer, "org.apache.commons.csv.Lexer", "escape", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "quoteChar", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\uFFFE');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -2);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(reader, "java.io.BufferedReader", "in", lineReader);
        char[] cb = new char[8192];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(reader, "java.io.BufferedReader", "defaultCharBufferSize", 8192);
        setField(reader, "java.io.BufferedReader", "defaultExpectedLineLength", 80);
        setField(reader, "java.io.Reader", "lock", lineReader);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(expected, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        setField(expected, "org.apache.commons.csv.CSVParser", "record", record);
        setField(expected, "org.apache.commons.csv.CSVParser", "recordNumber", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.INVALID;
        reusableToken.type = type;
        StringBuilder content = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(expected, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        // org.apache.commons.csv.CSVParser is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testParse2() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Object lineReader = createInstance("java.io.Console$LineReader");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class lineReaderType = Class.forName("java.io.Reader");
        Method parseMethod = cSVFormatClazz.getDeclaredMethod("parse", lineReaderType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = lineReader;
        CSVParser actual = ((CSVParser) parseMethod.invoke(cSVFormat, parseMethodArguments));
        
        CSVParser expected = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        setField(expected, "org.apache.commons.csv.CSVParser", "format", cSVFormat);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0001');
        setField(lexer, "org.apache.commons.csv.Lexer", "escape", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "quoteChar", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\uFFFE');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -2);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(reader, "java.io.BufferedReader", "in", lineReader);
        char[] cb = new char[8192];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(reader, "java.io.BufferedReader", "defaultCharBufferSize", 8192);
        setField(reader, "java.io.BufferedReader", "defaultExpectedLineLength", 80);
        setField(reader, "java.io.Reader", "lock", lineReader);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(expected, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        setField(expected, "org.apache.commons.csv.CSVParser", "record", record);
        setField(expected, "org.apache.commons.csv.CSVParser", "recordNumber", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.INVALID;
        reusableToken.type = type;
        StringBuilder content = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(expected, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        // org.apache.commons.csv.CSVParser is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testParse3() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character escape = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        Object lineReader = createInstance("java.io.Console$LineReader");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class lineReaderType = Class.forName("java.io.Reader");
        Method parseMethod = cSVFormatClazz.getDeclaredMethod("parse", lineReaderType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = lineReader;
        CSVParser actual = ((CSVParser) parseMethod.invoke(cSVFormat, parseMethodArguments));
        
        CSVParser expected = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        setField(expected, "org.apache.commons.csv.CSVParser", "format", cSVFormat);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0001');
        setField(lexer, "org.apache.commons.csv.Lexer", "escape", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "quoteChar", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\uFFFE');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -2);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(reader, "java.io.BufferedReader", "in", lineReader);
        char[] cb = new char[8192];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(reader, "java.io.BufferedReader", "defaultCharBufferSize", 8192);
        setField(reader, "java.io.BufferedReader", "defaultExpectedLineLength", 80);
        setField(reader, "java.io.Reader", "lock", lineReader);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(expected, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        setField(expected, "org.apache.commons.csv.CSVParser", "record", record);
        setField(expected, "org.apache.commons.csv.CSVParser", "recordNumber", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.INVALID;
        reusableToken.type = type;
        StringBuilder content = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(expected, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        // org.apache.commons.csv.CSVParser is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testParse4() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {null};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        FileReader fileReader = ((FileReader) createInstance("java.io.FileReader"));
        
        CSVParser actual = cSVFormat.parse(fileReader);
        
        CSVParser expected = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        setField(expected, "org.apache.commons.csv.CSVParser", "format", cSVFormat);
        LinkedHashMap headerMap = new LinkedHashMap();
        Integer integer = 0;
        headerMap.put(null, integer);
        setField(expected, "org.apache.commons.csv.CSVParser", "headerMap", headerMap);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "escape", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "quoteChar", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\uFFFE');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -2);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(reader, "java.io.BufferedReader", "in", fileReader);
        char[] cb = new char[8192];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(reader, "java.io.BufferedReader", "defaultCharBufferSize", 8192);
        setField(reader, "java.io.BufferedReader", "defaultExpectedLineLength", 80);
        setField(reader, "java.io.Reader", "lock", fileReader);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(expected, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        setField(expected, "org.apache.commons.csv.CSVParser", "record", record);
        setField(expected, "org.apache.commons.csv.CSVParser", "recordNumber", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.INVALID;
        reusableToken.type = type;
        StringBuilder content = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(expected, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        // org.apache.commons.csv.CSVParser is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
        
        java.lang.String[] cSVFormatHeader = ((java.lang.String[]) getFieldValue(cSVFormat, "org.apache.commons.csv.CSVFormat", "header"));
        String finalCSVFormatHeader0 = ((String) get(cSVFormatHeader, 0));
        
        assertNull(finalCSVFormatHeader0);
    }
    
    @Test
    public void testParse5() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        Object lineReader = createInstance("java.io.Console$LineReader");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class lineReaderType = Class.forName("java.io.Reader");
        Method parseMethod = cSVFormatClazz.getDeclaredMethod("parse", lineReaderType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = lineReader;
        CSVParser actual = ((CSVParser) parseMethod.invoke(cSVFormat, parseMethodArguments));
        
        CSVParser expected = ((CSVParser) createInstance("org.apache.commons.csv.CSVParser"));
        setField(expected, "org.apache.commons.csv.CSVParser", "format", cSVFormat);
        Lexer lexer = ((Lexer) createInstance("org.apache.commons.csv.Lexer"));
        setField(lexer, "org.apache.commons.csv.Lexer", "delimiter", '\u0000');
        setField(lexer, "org.apache.commons.csv.Lexer", "escape", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "quoteChar", '\uFFFE');
        setField(lexer, "org.apache.commons.csv.Lexer", "commentStart", '\uFFFE');
        ExtendedBufferedReader reader = ((ExtendedBufferedReader) createInstance("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "lastChar", -2);
        setField(reader, "org.apache.commons.csv.ExtendedBufferedReader", "eolCounter", 0L);
        setField(reader, "java.io.BufferedReader", "in", lineReader);
        char[] cb = new char[8192];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "markedChar", -1);
        setField(reader, "java.io.BufferedReader", "defaultCharBufferSize", 8192);
        setField(reader, "java.io.BufferedReader", "defaultExpectedLineLength", 80);
        setField(reader, "java.io.Reader", "lock", lineReader);
        setField(lexer, "org.apache.commons.csv.Lexer", "reader", reader);
        setField(expected, "org.apache.commons.csv.CSVParser", "lexer", lexer);
        ArrayList record = new ArrayList();
        setField(expected, "org.apache.commons.csv.CSVParser", "record", record);
        setField(expected, "org.apache.commons.csv.CSVParser", "recordNumber", 0L);
        Token reusableToken = ((Token) createInstance("org.apache.commons.csv.Token"));
        Token.Type type = Token.Type.INVALID;
        reusableToken.type = type;
        StringBuilder content = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(reusableToken, "org.apache.commons.csv.Token", "content", content);
        setField(expected, "org.apache.commons.csv.CSVParser", "reusableToken", reusableToken);
        
        // org.apache.commons.csv.CSVParser is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.Reader)
    
    @Test(expected = IllegalStateException.class)
    public void testParse6() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        Object lineReader = createInstance("java.io.Console$LineReader");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class lineReaderType = Class.forName("java.io.Reader");
        Method parseMethod = cSVFormatClazz.getDeclaredMethod("parse", lineReaderType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = lineReader;
        try {
            parseMethod.invoke(cSVFormat, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testParse7() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character quoteChar = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "quoteChar", quoteChar);
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", quoteChar);
        Object lineReader = createInstance("java.io.Console$LineReader");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class lineReaderType = Class.forName("java.io.Reader");
        Method parseMethod = cSVFormatClazz.getDeclaredMethod("parse", lineReaderType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = lineReader;
        try {
            parseMethod.invoke(cSVFormat, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testParse8() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0000');
        Character commentStart = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        Object lineReader = createInstance("java.io.Console$LineReader");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class lineReaderType = Class.forName("java.io.Reader");
        Method parseMethod = cSVFormatClazz.getDeclaredMethod("parse", lineReaderType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = lineReader;
        try {
            parseMethod.invoke(cSVFormat, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testParse9() throws Throwable  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "delimiter", '\u0001');
        Character commentStart = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "commentStart", commentStart);
        Character escape = '\u0000';
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "escape", escape);
        Object lineReader = createInstance("java.io.Console$LineReader");
        
        Class cSVFormatClazz = Class.forName("org.apache.commons.csv.CSVFormat");
        Class lineReaderType = Class.forName("java.io.Reader");
        Method parseMethod = cSVFormatClazz.getDeclaredMethod("parse", lineReaderType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = lineReader;
        try {
            parseMethod.invoke(cSVFormat, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.csv.CSVFormat.withDelimiter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withDelimiter(char)
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithDelimiter_Return_1() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        java.lang.String[] header = {};
        setField(cSVFormat, "org.apache.commons.csv.CSVFormat", "header", header);
        
        CSVFormat actual = cSVFormat.withDelimiter(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        java.lang.String[] header1 = {};
        setField(expected, "org.apache.commons.csv.CSVFormat", "header", header1);
        
        // org.apache.commons.csv.CSVFormat has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CSVFormat}
 * @utbot.methodUnderTest {@link org.apache.commons.csv.CSVFormat#withDelimiter(char)}
 * @utbot.returnsFrom {@code return new CSVFormat(delimiter, quoteChar, quotePolicy, commentStart, escape, ignoreSurroundingSpaces, ignoreEmptyLines, recordSeparator, nullString, header, skipHeaderRecord);}
 *  */
    @Test
    public void testWithDelimiter_Return() throws Exception  {
        CSVFormat cSVFormat = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        
        CSVFormat actual = cSVFormat.withDelimiter(' ');
        
        CSVFormat expected = ((CSVFormat) createInstance("org.apache.commons.csv.CSVFormat"));
        setField(expected, "org.apache.commons.csv.CSVFormat", "delimiter", ' ');
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields964907708186200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields964907708186200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass964907708198800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964907708186200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964907708198800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields964907708775100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields964907708775100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass964907708779600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields964907708775100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass964907708779600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

