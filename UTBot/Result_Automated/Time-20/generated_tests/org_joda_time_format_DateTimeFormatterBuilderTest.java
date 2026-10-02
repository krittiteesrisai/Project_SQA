package org.joda.time.format;

import org.junit.Test;
import java.util.ArrayList;
import org.joda.time.format.DateTimeFormat.StyleFormatter;
import org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId;
import org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset;
import org.joda.time.format.DateTimeFormatterBuilder.Fraction;
import org.joda.time.format.DateTimeFormatterBuilder.Composite;
import org.joda.time.format.DateTimeFormatterBuilder.MatchingParser;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral;
import org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber;
import org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear;
import org.joda.time.format.DateTimeFormatterBuilder.TextField;
import org.joda.time.DateTimeFieldType;
import java.util.HashMap;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import sun.nio.cs.StreamEncoder;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public final class org_joda_time_format_DateTimeFormatterBuilderTest {
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimeParser)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkParser(org.joda.time.format.DateTimeParser)
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.returnsFrom {@code return append0(null, parser);}
 *  */
    @Test
    public void testAppend_DateTimeFormatterBuilderAppend0() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.append(((DateTimeParser) styleFormatter));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimeParser)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkParser(org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkParser(parser);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.append(((DateTimeParser) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimeParser)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkParser(org.joda.time.format.DateTimeParser)
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(null, parser);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.append] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.append(DateTimeFormatterBuilder.java:238) */
        dateTimeFormatterBuilder.append(((DateTimeParser) styleFormatter));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.joda.time.format.DateTimePrinter)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkPrinter(org.joda.time.format.DateTimePrinter)
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.returnsFrom {@code return append0(printer, null);}
 *  */
    @Test
    public void testAppend_DateTimeFormatterBuilderAppend01() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        DateTimeFormatterBuilder.TimeZoneId timeZoneId = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.append(((DateTimePrinter) timeZoneId));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.joda.time.format.DateTimePrinter)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkPrinter(org.joda.time.format.DateTimePrinter)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkPrinter(printer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException1() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.append(((DateTimePrinter) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.joda.time.format.DateTimePrinter)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkPrinter(org.joda.time.format.DateTimePrinter)
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(printer, null);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.append] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.append(DateTimeFormatterBuilder.java:225) */
        dateTimeFormatterBuilder.append(((DateTimePrinter) styleFormatter));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.joda.time.format.DateTimeFormatter)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimeFormatter)}
 * @utbot.executesCondition {@code (formatter == null): False}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormatter#getPrinter()}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormatter#getParser()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.returnsFrom {@code return append0(formatter.getPrinter(), formatter.getParser());}
 *  */
    @Test
    public void testAppend_FormatterNotEqualsNull() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(null, styleFormatter);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.append(dateTimeFormatter);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.joda.time.format.DateTimeFormatter)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimeFormatter)}
 * @utbot.executesCondition {@code (formatter == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: formatter == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException2() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.append(((DateTimeFormatter) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.joda.time.format.DateTimeFormatter)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimeFormatter)}
 * @utbot.executesCondition {@code (formatter == null): False}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormatter#getPrinter()}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormatter#getParser()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(formatter.getPrinter(), formatter.getParser());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(null, null);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.append] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.append(DateTimeFormatterBuilder.java:212) */
        dateTimeFormatterBuilder.append(dateTimeFormatter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.joda.time.format.DateTimePrinter, org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkPrinter(org.joda.time.format.DateTimePrinter)
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkParser(org.joda.time.format.DateTimeParser)
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.returnsFrom {@code return append0(printer, parser);}
 *  */
    @Test
    public void testAppend_DateTimeFormatterBuilderAppend02() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset = ((DateTimeFormatterBuilder.TimeZoneOffset) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.append(((DateTimePrinter) timeZoneOffset), styleFormatter);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.joda.time.format.DateTimePrinter, org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkParser(org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkParser(parser);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException3() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        
        dateTimeFormatterBuilder.append(((DateTimePrinter) styleFormatter), ((DateTimeParser) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkPrinter(printer);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException_1() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.append(((DateTimePrinter) null), ((DateTimeParser) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.joda.time.format.DateTimePrinter, org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkPrinter(org.joda.time.format.DateTimePrinter)
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkParser(org.joda.time.format.DateTimeParser)
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(printer, parser);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.append] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.append(DateTimeFormatterBuilder.java:252) */
        dateTimeFormatterBuilder.append(((DateTimePrinter) styleFormatter), styleFormatter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.append
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.joda.time.format.DateTimePrinter, [Lorg.joda.time.format.DateTimeParser;)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[])}
 * @utbot.executesCondition {@code (length == 1): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: copyOfParsers[i] = parsers[i];
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray = {};
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.format.DateTimeFormatterBuilder.append(DateTimeFormatterBuilder.java:294) */
        dateTimeFormatterBuilder.append(((DateTimePrinter) null), dateTimeParserArray);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[])}
 * @utbot.executesCondition {@code (length == 1): True}
 * @utbot.executesCondition {@code (parsers[0] == null): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(printer, parsers[0]);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException4() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        org.joda.time.format.DateTimeParser[] dateTimeParserArray = new org.joda.time.format.DateTimeParser[1];
        DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset = ((DateTimeFormatterBuilder.TimeZoneOffset) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        dateTimeParserArray[0] = ((DateTimeParser) timeZoneOffset);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.append] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.append(DateTimeFormatterBuilder.java:284) */
        dateTimeFormatterBuilder.append(((DateTimePrinter) null), dateTimeParserArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.joda.time.format.DateTimePrinter, [Lorg.joda.time.format.DateTimeParser;)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[])}
 * @utbot.executesCondition {@code (printer != null): False}
 * @utbot.executesCondition {@code (parsers == null): False}
 * @utbot.executesCondition {@code (length == 1): True}
 * @utbot.executesCondition {@code (parsers[0] == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: parsers[0] == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException_11() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray = {null};
        
        dateTimeFormatterBuilder.append(((DateTimePrinter) null), dateTimeParserArray);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[])}
 * @utbot.executesCondition {@code (printer != null): False}
 * @utbot.executesCondition {@code (parsers == null): False}
 * @utbot.executesCondition {@code (length == 1): False}
 * @utbot.iterates iterate the loop {@code for(i = 0; i < length - 1; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (copyOfParsers[i] = parsers[i]) == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException_2() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray = {null, null};
        
        dateTimeFormatterBuilder.append(((DateTimePrinter) null), dateTimeParserArray);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[])}
 * @utbot.executesCondition {@code (printer != null): True}
 * @utbot.executesCondition {@code (parsers == null): True}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkPrinter(org.joda.time.format.DateTimePrinter)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: parsers == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException_3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset = ((DateTimeFormatterBuilder.TimeZoneOffset) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        
        dateTimeFormatterBuilder.append(((DateTimePrinter) timeZoneOffset), ((org.joda.time.format.DateTimeParser[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[])}
 * @utbot.executesCondition {@code (printer != null): False}
 * @utbot.executesCondition {@code (parsers == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: parsers == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException4() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.append(((DateTimePrinter) null), ((org.joda.time.format.DateTimeParser[]) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method append(org.joda.time.format.DateTimePrinter, [Lorg.joda.time.format.DateTimeParser;)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[])}
     */
    @Test
    public void testAppendThrowsAIOOBEWithEmptyObjectArray() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(1, 0, Integer.MIN_VALUE);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray = {};
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.format.DateTimeFormatterBuilder.append(DateTimeFormatterBuilder.java:294) */
        dateTimeFormatterBuilder.append(((DateTimePrinter) styleFormatter), dateTimeParserArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(org.joda.time.format.DateTimePrinter, [Lorg.joda.time.format.DateTimeParser;)
    
    @Test
    public void testAppend1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.Fraction fraction = ((DateTimeFormatterBuilder.Fraction) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        org.joda.time.format.DateTimeParser[] dateTimeParserArray = new org.joda.time.format.DateTimeParser[2];
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        dateTimeParserArray[0] = ((DateTimeParser) composite);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.append(((DateTimePrinter) fraction), dateTimeParserArray);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(fraction);
        DateTimeFormatterBuilder.MatchingParser matchingParser = ((DateTimeFormatterBuilder.MatchingParser) createInstance("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        org.joda.time.format.DateTimeParser[] iParsers = new org.joda.time.format.DateTimeParser[2];
        iParsers[0] = ((DateTimeParser) composite);
        setField(matchingParser, "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser", "iParsers", iParsers);
        iElementPairs.add(matchingParser);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        DateTimeParser finalDateTimeParserArray1 = dateTimeParserArray[1];
        
        assertNull(finalDateTimeParserArray1);
    }
    
    @Test
    public void testAppend2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray = new org.joda.time.format.DateTimeParser[32];
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        dateTimeParserArray[0] = ((DateTimeParser) composite);
        dateTimeParserArray[1] = ((DateTimeParser) composite);
        dateTimeParserArray[2] = ((DateTimeParser) composite);
        dateTimeParserArray[3] = ((DateTimeParser) composite);
        dateTimeParserArray[4] = ((DateTimeParser) composite);
        dateTimeParserArray[5] = ((DateTimeParser) composite);
        dateTimeParserArray[6] = ((DateTimeParser) composite);
        dateTimeParserArray[7] = ((DateTimeParser) composite);
        dateTimeParserArray[8] = ((DateTimeParser) composite);
        dateTimeParserArray[9] = ((DateTimeParser) composite);
        dateTimeParserArray[10] = ((DateTimeParser) composite);
        dateTimeParserArray[11] = ((DateTimeParser) composite);
        dateTimeParserArray[12] = ((DateTimeParser) composite);
        dateTimeParserArray[13] = ((DateTimeParser) composite);
        dateTimeParserArray[14] = ((DateTimeParser) composite);
        dateTimeParserArray[15] = ((DateTimeParser) composite);
        dateTimeParserArray[16] = ((DateTimeParser) composite);
        dateTimeParserArray[17] = ((DateTimeParser) composite);
        dateTimeParserArray[18] = ((DateTimeParser) composite);
        dateTimeParserArray[19] = ((DateTimeParser) composite);
        dateTimeParserArray[20] = ((DateTimeParser) composite);
        dateTimeParserArray[21] = ((DateTimeParser) composite);
        dateTimeParserArray[22] = ((DateTimeParser) composite);
        dateTimeParserArray[23] = ((DateTimeParser) composite);
        dateTimeParserArray[24] = ((DateTimeParser) composite);
        dateTimeParserArray[25] = ((DateTimeParser) composite);
        dateTimeParserArray[26] = ((DateTimeParser) composite);
        dateTimeParserArray[27] = ((DateTimeParser) composite);
        dateTimeParserArray[28] = ((DateTimeParser) composite);
        dateTimeParserArray[29] = ((DateTimeParser) composite);
        dateTimeParserArray[30] = ((DateTimeParser) composite);
        dateTimeParserArray[31] = ((DateTimeParser) composite);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.append(((DateTimePrinter) null), dateTimeParserArray);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        DateTimeFormatterBuilder.MatchingParser matchingParser = ((DateTimeFormatterBuilder.MatchingParser) createInstance("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        org.joda.time.format.DateTimeParser[] iParsers = new org.joda.time.format.DateTimeParser[32];
        iParsers[0] = ((DateTimeParser) composite);
        iParsers[1] = ((DateTimeParser) composite);
        iParsers[2] = ((DateTimeParser) composite);
        iParsers[3] = ((DateTimeParser) composite);
        iParsers[4] = ((DateTimeParser) composite);
        iParsers[5] = ((DateTimeParser) composite);
        iParsers[6] = ((DateTimeParser) composite);
        iParsers[7] = ((DateTimeParser) composite);
        iParsers[8] = ((DateTimeParser) composite);
        iParsers[9] = ((DateTimeParser) composite);
        iParsers[10] = ((DateTimeParser) composite);
        iParsers[11] = ((DateTimeParser) composite);
        iParsers[12] = ((DateTimeParser) composite);
        iParsers[13] = ((DateTimeParser) composite);
        iParsers[14] = ((DateTimeParser) composite);
        iParsers[15] = ((DateTimeParser) composite);
        iParsers[16] = ((DateTimeParser) composite);
        iParsers[17] = ((DateTimeParser) composite);
        iParsers[18] = ((DateTimeParser) composite);
        iParsers[19] = ((DateTimeParser) composite);
        iParsers[20] = ((DateTimeParser) composite);
        iParsers[21] = ((DateTimeParser) composite);
        iParsers[22] = ((DateTimeParser) composite);
        iParsers[23] = ((DateTimeParser) composite);
        iParsers[24] = ((DateTimeParser) composite);
        iParsers[25] = ((DateTimeParser) composite);
        iParsers[26] = ((DateTimeParser) composite);
        iParsers[27] = ((DateTimeParser) composite);
        iParsers[28] = ((DateTimeParser) composite);
        iParsers[29] = ((DateTimeParser) composite);
        iParsers[30] = ((DateTimeParser) composite);
        iParsers[31] = ((DateTimeParser) composite);
        setField(matchingParser, "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser", "iParsers", iParsers);
        iElementPairs.add(matchingParser);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.joda.time.format.DateTimePrinter, [Lorg.joda.time.format.DateTimeParser;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppend3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.Fraction fraction = ((DateTimeFormatterBuilder.Fraction) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        org.joda.time.format.DateTimeParser[] dateTimeParserArray = new org.joda.time.format.DateTimeParser[32];
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        dateTimeParserArray[0] = ((DateTimeParser) composite);
        
        dateTimeFormatterBuilder.append(((DateTimePrinter) fraction), dateTimeParserArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#clear()}
 * @utbot.invokes {@link java.util.ArrayList#clear()}
 *  */
    @Test
    public void testClear_ArrayListClear() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        dateTimeFormatterBuilder.clear();
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#clear()}
 * @utbot.invokes {@link java.util.ArrayList#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iElementPairs.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.clear] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.clear(DateTimeFormatterBuilder.java:197) */
        dateTimeFormatterBuilder.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.getFormatter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFormatter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#getFormatter()}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.returnsFrom {@code return f;}
 *  */
    @Test
    public void testGetFormatter_FNotEqualsNull() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        byte[] iFormatter = {};
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Method getFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("getFormatter");
        getFormatterMethod.setAccessible(true);
        java.lang.Object[] getFormatterMethodArguments = new java.lang.Object[0];
        byte[] actual = ((byte[]) getFormatterMethod.invoke(dateTimeFormatterBuilder, getFormatterMethodArguments));
        
        assertArrayEquals(iFormatter, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#getFormatter()}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.executesCondition {@code (iElementPairs.size() == 2): True}
 * @utbot.executesCondition {@code (printer != null): True}
 * @utbot.executesCondition {@code (printer == parser): True}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.returnsFrom {@code return f;}
 *  */
    @Test
    public void testGetFormatter_PrinterEqualsParser() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(object);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        Object initialDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Method getFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("getFormatter");
        getFormatterMethod.setAccessible(true);
        java.lang.Object[] getFormatterMethodArguments = new java.lang.Object[0];
        Object actual = getFormatterMethod.invoke(dateTimeFormatterBuilder, getFormatterMethodArguments);
        
        Object expected = new Object();
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertFalse(initialDateTimeFormatterBuilderIFormatter == finalDateTimeFormatterBuilderIFormatter);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#getFormatter()}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.executesCondition {@code (iElementPairs.size() == 2): True}
 * @utbot.executesCondition {@code (printer != null): False}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.returnsFrom {@code return f;}
 *  */
    @Test
    public void testGetFormatter_PrinterEqualsNull() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        Object initialDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Method getFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("getFormatter");
        getFormatterMethod.setAccessible(true);
        java.lang.Object[] getFormatterMethodArguments = new java.lang.Object[0];
        Object actual = getFormatterMethod.invoke(dateTimeFormatterBuilder, getFormatterMethodArguments);
        
        Object expected = new Object();
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertFalse(initialDateTimeFormatterBuilderIFormatter == finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFormatter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#getFormatter()}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iElementPairs.size() == 2
 *  */
    @Test
    public void testGetFormatter_ThrowNullPointerException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.getFormatter] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1103) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Method getFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("getFormatter");
        getFormatterMethod.setAccessible(true);
        java.lang.Object[] getFormatterMethodArguments = new java.lang.Object[0];
        try {
            getFormatterMethod.invoke(dateTimeFormatterBuilder, getFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFormatter()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#getFormatter()}
     */
    @Test
    public void testGetFormatter() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Method getFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("getFormatter");
        getFormatterMethod.setAccessible(true);
        java.lang.Object[] getFormatterMethodArguments = new java.lang.Object[0];
        DateTimeFormatterBuilder.Composite actual = ((DateTimeFormatterBuilder.Composite) getFormatterMethod.invoke(dateTimeFormatterBuilder, getFormatterMethodArguments));
        
        DateTimeFormatterBuilder.Composite expected = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        
        org.joda.time.format.DateTimePrinter[] actualIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        assertNull(actualIPrinters);
        
        org.joda.time.format.DateTimeParser[] actualIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        assertNull(actualIParsers);
        
        int expectedIPrintedLengthEstimate = ((Integer) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        int actualIPrintedLengthEstimate = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        assertEquals(expectedIPrintedLengthEstimate, actualIPrintedLengthEstimate);
        
        int expectedIParsedLengthEstimate = ((Integer) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        int actualIParsedLengthEstimate = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        assertEquals(expectedIParsedLengthEstimate, actualIParsedLengthEstimate);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFormatter()
    
    @Test
    public void testGetFormatter1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        Object initialDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Method getFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("getFormatter");
        getFormatterMethod.setAccessible(true);
        java.lang.Object[] getFormatterMethodArguments = new java.lang.Object[0];
        Object actual = getFormatterMethod.invoke(dateTimeFormatterBuilder, getFormatterMethodArguments);
        
        Object expected = new Object();
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertFalse(initialDateTimeFormatterBuilderIFormatter == finalDateTimeFormatterBuilderIFormatter);
    }
    
    @Test
    public void testGetFormatter2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        Object object1 = createInstance("java.lang.Object");
        iElementPairs.add(object1);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        Object initialDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Method getFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("getFormatter");
        getFormatterMethod.setAccessible(true);
        java.lang.Object[] getFormatterMethodArguments = new java.lang.Object[0];
        DateTimeFormatterBuilder.Composite actual = ((DateTimeFormatterBuilder.Composite) getFormatterMethod.invoke(dateTimeFormatterBuilder, getFormatterMethodArguments));
        
        DateTimeFormatterBuilder.Composite expected = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        
        org.joda.time.format.DateTimePrinter[] actualIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        assertNull(actualIPrinters);
        
        org.joda.time.format.DateTimeParser[] actualIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        assertNull(actualIParsers);
        
        int expectedIPrintedLengthEstimate = ((Integer) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        int actualIPrintedLengthEstimate = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        assertEquals(expectedIPrintedLengthEstimate, actualIPrintedLengthEstimate);
        
        int expectedIParsedLengthEstimate = ((Integer) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        int actualIParsedLengthEstimate = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        assertEquals(expectedIParsedLengthEstimate, actualIParsedLengthEstimate);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertFalse(initialDateTimeFormatterBuilderIFormatter == finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendPattern(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendPattern(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormat#appendPatternTo(org.joda.time.format.DateTimeFormatterBuilder,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendPattern_DateTimeFormatAppendPatternTo() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        String string = "";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendPattern(string);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendPattern(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendPattern(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormat#appendPatternTo(org.joda.time.format.DateTimeFormatterBuilder,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DateTimeFormat.appendPatternTo(this, pattern);
 *  */
    @Test
    public void testAppendPattern_ThrowNullPointerException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendPattern] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormat.parsePatternTo(DateTimeFormat.java:400)
            org.joda.time.format.DateTimeFormat.appendPatternTo(DateTimeFormat.java:377)
            org.joda.time.format.DateTimeFormatterBuilder.appendPattern(DateTimeFormatterBuilder.java:1094) */
        dateTimeFormatterBuilder.appendPattern(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendPattern(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendPattern(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendPatternThrowsIAEWithNonEmptyString() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendPattern("ZX");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendPattern(java.lang.String)
    
    @Test
    public void testAppendPattern1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        String string = "{";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendPattern(string);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.CharacterLiteral characterLiteral = ((DateTimeFormatterBuilder.CharacterLiteral) createInstance("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setField(characterLiteral, "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", "iValue", '{');
        iElementPairs.add(characterLiteral);
        iElementPairs.add(characterLiteral);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendPattern2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        String string = "\u0000";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendPattern(string);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.CharacterLiteral characterLiteral = ((DateTimeFormatterBuilder.CharacterLiteral) createInstance("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setField(characterLiteral, "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", "iValue", '\u0000');
        iElementPairs.add(characterLiteral);
        iElementPairs.add(characterLiteral);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendPattern3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        String string = "`";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendPattern(string);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.CharacterLiteral characterLiteral = ((DateTimeFormatterBuilder.CharacterLiteral) createInstance("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setField(characterLiteral, "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", "iValue", '`');
        iElementPairs.add(characterLiteral);
        iElementPairs.add(characterLiteral);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendPattern4() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        String string = "k";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendPattern(string);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber = ((DateTimeFormatterBuilder.UnpaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName = "hours";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName1 = "days";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "clockhourOfDay";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 2);
        iElementPairs.add(unpaddedNumber);
        iElementPairs.add(unpaddedNumber);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendPattern5() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        String string = "K";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendPattern(string);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber = ((DateTimeFormatterBuilder.UnpaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName = "hours";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName1 = "halfdays";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "hourOfHalfday";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 2);
        iElementPairs.add(unpaddedNumber);
        iElementPairs.add(unpaddedNumber);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendPattern6() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        String string = "k\u0000";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendPattern(string);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber = ((DateTimeFormatterBuilder.UnpaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName = "hours";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName1 = "days";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "clockhourOfDay";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 2);
        iElementPairs.add(unpaddedNumber);
        iElementPairs.add(unpaddedNumber);
        DateTimeFormatterBuilder.CharacterLiteral characterLiteral = ((DateTimeFormatterBuilder.CharacterLiteral) createInstance("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setField(characterLiteral, "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", "iValue", '\u0000');
        iElementPairs.add(characterLiteral);
        iElementPairs.add(characterLiteral);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendPattern7() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        String string = "K\u0000";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendPattern(string);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber = ((DateTimeFormatterBuilder.UnpaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName = "hours";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName1 = "halfdays";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "hourOfHalfday";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 2);
        iElementPairs.add(unpaddedNumber);
        iElementPairs.add(unpaddedNumber);
        DateTimeFormatterBuilder.CharacterLiteral characterLiteral = ((DateTimeFormatterBuilder.CharacterLiteral) createInstance("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setField(characterLiteral, "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", "iValue", '\u0000');
        iElementPairs.add(characterLiteral);
        iElementPairs.add(characterLiteral);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.toFormatter
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toFormatter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toFormatter()}
 * @utbot.executesCondition {@code (printer != null): False}
 * @utbot.executesCondition {@code (parser != null): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#getFormatter()
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#isPrinter(java.lang.Object)
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#isParser(java.lang.Object)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Both printing and parsing not supported");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToFormatter_ThrowUnsupportedOperationException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        dateTimeFormatterBuilder.toFormatter();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toFormatter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toFormatter()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#getFormatter()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object f = getFormatter();
 *  */
    @Test
    public void testToFormatter_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.toFormatter] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1103)
            org.joda.time.format.DateTimeFormatterBuilder.toFormatter(DateTimeFormatterBuilder.java:104) */
        dateTimeFormatterBuilder.toFormatter();
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toFormatter()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toFormatter()}
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testToFormatterThrowsUOE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.toFormatter();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toFormatter()
    
    @Test
    public void testToFormatter1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.MatchingParser iFormatter = ((DateTimeFormatterBuilder.MatchingParser) createInstance("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatter actual = dateTimeFormatterBuilder.toFormatter();
        
        DateTimeFormatter expected = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        setField(expected, "org.joda.time.format.DateTimeFormatter", "iParser", iFormatter);
        setField(expected, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        
        DateTimePrinter actualIPrinter = ((DateTimePrinter) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iPrinter"));
        assertNull(actualIPrinter);
        
        DateTimeParser expectedIParser = ((DateTimeParser) getFieldValue(expected, "org.joda.time.format.DateTimeFormatter", "iParser"));
        DateTimeParser actualIParser = ((DateTimeParser) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iParser"));
        org.joda.time.format.DateTimeParser[] actualIParserIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(actualIParser, "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser", "iParsers"));
        assertNull(actualIParserIParsers);
        
        int expectedIParserIParsedLengthEstimate = ((Integer) getFieldValue(expectedIParser, "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser", "iParsedLengthEstimate"));
        int actualIParserIParsedLengthEstimate = ((Integer) getFieldValue(actualIParser, "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser", "iParsedLengthEstimate"));
        assertEquals(expectedIParserIParsedLengthEstimate, actualIParserIParsedLengthEstimate);
        
        Locale actualILocale = ((Locale) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iLocale"));
        assertNull(actualILocale);
        
        boolean actualIOffsetParsed = ((Boolean) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iOffsetParsed"));
        assertFalse(actualIOffsetParsed);
        
        Chronology actualIChrono = ((Chronology) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iChrono"));
        assertNull(actualIChrono);
        
        DateTimeZone actualIZone = ((DateTimeZone) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iZone"));
        assertNull(actualIZone);
        
        Integer actualIPivotYear = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iPivotYear"));
        assertNull(actualIPivotYear);
        
        int expectedIDefaultYear = ((Integer) getFieldValue(expected, "org.joda.time.format.DateTimeFormatter", "iDefaultYear"));
        int actualIDefaultYear = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iDefaultYear"));
        assertEquals(expectedIDefaultYear, actualIDefaultYear);
        
    }
    
    @Test
    public void testToFormatter2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimeParser[] iParsers = {null, null, null, null, null, null, null, null, null};
        setField(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers", iParsers);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatter actual = dateTimeFormatterBuilder.toFormatter();
        
        DateTimeFormatter expected = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        setField(expected, "org.joda.time.format.DateTimeFormatter", "iParser", iFormatter);
        setField(expected, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        
        DateTimePrinter actualIPrinter = ((DateTimePrinter) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iPrinter"));
        assertNull(actualIPrinter);
        
        DateTimeParser expectedIParser = ((DateTimeParser) getFieldValue(expected, "org.joda.time.format.DateTimeFormatter", "iParser"));
        DateTimeParser actualIParser = ((DateTimeParser) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iParser"));
        org.joda.time.format.DateTimePrinter[] actualIParserIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(actualIParser, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        assertNull(actualIParserIPrinters);
        
        org.joda.time.format.DateTimeParser[] expectedIParserIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(expectedIParser, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        org.joda.time.format.DateTimeParser[] actualIParserIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(actualIParser, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        int expectedIParserIParsersSize = expectedIParserIParsers.length;
        assertEquals(expectedIParserIParsersSize, actualIParserIParsers.length);
        assertTrue(deepEquals(expectedIParserIParsers, actualIParserIParsers));
        
        int expectedIParserIPrintedLengthEstimate = ((Integer) getFieldValue(expectedIParser, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        int actualIParserIPrintedLengthEstimate = ((Integer) getFieldValue(actualIParser, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        assertEquals(expectedIParserIPrintedLengthEstimate, actualIParserIPrintedLengthEstimate);
        
        int expectedIParserIParsedLengthEstimate = ((Integer) getFieldValue(expectedIParser, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        int actualIParserIParsedLengthEstimate = ((Integer) getFieldValue(actualIParser, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        assertEquals(expectedIParserIParsedLengthEstimate, actualIParserIParsedLengthEstimate);
        
        Locale actualILocale = ((Locale) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iLocale"));
        assertNull(actualILocale);
        
        boolean actualIOffsetParsed = ((Boolean) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iOffsetParsed"));
        assertFalse(actualIOffsetParsed);
        
        Chronology actualIChrono = ((Chronology) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iChrono"));
        assertNull(actualIChrono);
        
        DateTimeZone actualIZone = ((DateTimeZone) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iZone"));
        assertNull(actualIZone);
        
        Integer actualIPivotYear = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iPivotYear"));
        assertNull(actualIPivotYear);
        
        int expectedIDefaultYear = ((Integer) getFieldValue(expected, "org.joda.time.format.DateTimeFormatter", "iDefaultYear"));
        int actualIDefaultYear = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iDefaultYear"));
        assertEquals(expectedIDefaultYear, actualIDefaultYear);
        
        Object dateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatterIFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers0 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatterIFormatterIParsers, 0));
        Object dateTimeFormatterBuilderIFormatter1 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter1IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter1, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers1 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter1IFormatterIParsers, 1));
        Object dateTimeFormatterBuilderIFormatter2 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter2IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter2, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers2 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter2IFormatterIParsers, 2));
        Object dateTimeFormatterBuilderIFormatter3 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter3IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter3, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers3 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter3IFormatterIParsers, 3));
        Object dateTimeFormatterBuilderIFormatter4 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter4IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter4, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers4 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter4IFormatterIParsers, 4));
        Object dateTimeFormatterBuilderIFormatter5 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter5IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter5, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers5 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter5IFormatterIParsers, 5));
        Object dateTimeFormatterBuilderIFormatter6 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter6IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter6, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers6 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter6IFormatterIParsers, 6));
        Object dateTimeFormatterBuilderIFormatter7 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter7IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter7, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers7 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter7IFormatterIParsers, 7));
        Object dateTimeFormatterBuilderIFormatter8 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter8IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter8, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers8 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter8IFormatterIParsers, 8));
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers0);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers1);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers2);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers3);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers4);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers5);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers6);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers7);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers8);
    }
    
    @Test
    public void testToFormatter3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimePrinter[] iPrinters = {null, null, null, null, null, null, null, null, null};
        setField(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters", iPrinters);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatter actual = dateTimeFormatterBuilder.toFormatter();
        
        DateTimeFormatter expected = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        setField(expected, "org.joda.time.format.DateTimeFormatter", "iPrinter", iFormatter);
        setField(expected, "org.joda.time.format.DateTimeFormatter", "iDefaultYear", 2000);
        
        DateTimePrinter expectedIPrinter = ((DateTimePrinter) getFieldValue(expected, "org.joda.time.format.DateTimeFormatter", "iPrinter"));
        DateTimePrinter actualIPrinter = ((DateTimePrinter) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iPrinter"));
        org.joda.time.format.DateTimePrinter[] expectedIPrinterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(expectedIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        org.joda.time.format.DateTimePrinter[] actualIPrinterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(actualIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        int expectedIPrinterIPrintersSize = expectedIPrinterIPrinters.length;
        assertEquals(expectedIPrinterIPrintersSize, actualIPrinterIPrinters.length);
        assertTrue(deepEquals(expectedIPrinterIPrinters, actualIPrinterIPrinters));
        
        org.joda.time.format.DateTimeParser[] actualIPrinterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(actualIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        assertNull(actualIPrinterIParsers);
        
        int expectedIPrinterIPrintedLengthEstimate = ((Integer) getFieldValue(expectedIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        int actualIPrinterIPrintedLengthEstimate = ((Integer) getFieldValue(actualIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        assertEquals(expectedIPrinterIPrintedLengthEstimate, actualIPrinterIPrintedLengthEstimate);
        
        int expectedIPrinterIParsedLengthEstimate = ((Integer) getFieldValue(expectedIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        int actualIPrinterIParsedLengthEstimate = ((Integer) getFieldValue(actualIPrinter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        assertEquals(expectedIPrinterIParsedLengthEstimate, actualIPrinterIParsedLengthEstimate);
        
        DateTimeParser actualIParser = ((DateTimeParser) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iParser"));
        assertNull(actualIParser);
        
        Locale actualILocale = ((Locale) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iLocale"));
        assertNull(actualILocale);
        
        boolean actualIOffsetParsed = ((Boolean) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iOffsetParsed"));
        assertFalse(actualIOffsetParsed);
        
        Chronology actualIChrono = ((Chronology) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iChrono"));
        assertNull(actualIChrono);
        
        DateTimeZone actualIZone = ((DateTimeZone) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iZone"));
        assertNull(actualIZone);
        
        Integer actualIPivotYear = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iPivotYear"));
        assertNull(actualIPivotYear);
        
        int expectedIDefaultYear = ((Integer) getFieldValue(expected, "org.joda.time.format.DateTimeFormatter", "iDefaultYear"));
        int actualIDefaultYear = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatter", "iDefaultYear"));
        assertEquals(expectedIDefaultYear, actualIDefaultYear);
        
        Object dateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatterIFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters0 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatterIFormatterIPrinters, 0));
        Object dateTimeFormatterBuilderIFormatter1 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatter1IFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter1, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters1 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatter1IFormatterIPrinters, 1));
        Object dateTimeFormatterBuilderIFormatter2 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatter2IFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter2, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters2 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatter2IFormatterIPrinters, 2));
        Object dateTimeFormatterBuilderIFormatter3 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatter3IFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter3, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters3 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatter3IFormatterIPrinters, 3));
        Object dateTimeFormatterBuilderIFormatter4 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatter4IFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter4, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters4 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatter4IFormatterIPrinters, 4));
        Object dateTimeFormatterBuilderIFormatter5 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatter5IFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter5, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters5 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatter5IFormatterIPrinters, 5));
        Object dateTimeFormatterBuilderIFormatter6 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatter6IFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter6, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters6 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatter6IFormatterIPrinters, 6));
        Object dateTimeFormatterBuilderIFormatter7 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatter7IFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter7, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters7 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatter7IFormatterIPrinters, 7));
        Object dateTimeFormatterBuilderIFormatter8 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatter8IFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter8, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters8 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatter8IFormatterIPrinters, 8));
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters0);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters1);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters2);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters3);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters4);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters5);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters6);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters7);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters8);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toFormatter()
    
    @Test(expected = UnsupportedOperationException.class)
    public void testToFormatter4() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        dateTimeFormatterBuilder.toFormatter();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toFormatter()
    
    @Test
    public void testToFormatter5() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.decompose(DateTimeFormatterBuilder.java:2718)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.<init>(DateTimeFormatterBuilder.java:2568)
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1117)
            org.joda.time.format.DateTimeFormatterBuilder.toFormatter(DateTimeFormatterBuilder.java:104) */
        dateTimeFormatterBuilder.toFormatter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendLiteral(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendLiteral(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.activatesSwitch {@code switch(text.length()) case: 0}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendLiteral_TextNotEqualsNull() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        String string = "";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendLiteral(string);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendLiteral(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendLiteral(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: text == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteral_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendLiteral(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendLiteral(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendLiteral(java.lang.String)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.activatesSwitch {@code switch(text.length()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new StringLiteral(text));
 *  */
    @Test
    public void testAppendLiteral_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        String string = "  ";
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendLiteral] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendLiteral(DateTimeFormatterBuilder.java:379) */
        dateTimeFormatterBuilder.appendLiteral(string);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendLiteral(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.activatesSwitch {@code switch(text.length()) case: 1}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new CharacterLiteral(text.charAt(0)));
 *  */
    @Test
    public void testAppendLiteral_ThrowNullPointerException_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        String string = " ";
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendLiteral] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendLiteral(DateTimeFormatterBuilder.java:377) */
        dateTimeFormatterBuilder.appendLiteral(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendLiteral(java.lang.String)
    
    @Test
    public void testAppendLiteral1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "\u0000";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendLiteral(string);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendLiteral2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "\u0000\u0000";
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendLiteral(string);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendLiteral(char)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendLiteral(char)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.returnsFrom {@code return append0(new CharacterLiteral(c));}
 *  */
    @Test
    public void testAppendLiteral_DateTimeFormatterBuilderAppend0() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendLiteral(' ');
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendLiteral(char)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendLiteral(char)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new CharacterLiteral(c));
 *  */
    @Test
    public void testAppendLiteral_ThrowNullPointerException1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendLiteral] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendLiteral(DateTimeFormatterBuilder.java:359) */
        dateTimeFormatterBuilder.appendLiteral(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendFraction
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendFraction(org.joda.time.DateTimeFieldType, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFraction(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (maxDigits < minDigits): True}
 * @utbot.executesCondition {@code (minDigits < 0): False}
 * @utbot.executesCondition {@code (maxDigits <= 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: minDigits < 0 || maxDigits <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_ThrowIllegalArgumentException_1() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFractionMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFraction", standardDateTimeFieldTypeType, intType, intType);
        appendFractionMethod.setAccessible(true);
        java.lang.Object[] appendFractionMethodArguments = new java.lang.Object[3];
        appendFractionMethodArguments[0] = standardDateTimeFieldType;
        appendFractionMethodArguments[1] = 0;
        appendFractionMethodArguments[2] = -1;
        try {
            appendFractionMethod.invoke(dateTimeFormatterBuilder, appendFractionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFraction(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (maxDigits < minDigits): False}
 * @utbot.executesCondition {@code (minDigits < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: minDigits < 0 || maxDigits <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_ThrowIllegalArgumentException_2() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFractionMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFraction", standardDateTimeFieldTypeType, intType, intType);
        appendFractionMethod.setAccessible(true);
        java.lang.Object[] appendFractionMethodArguments = new java.lang.Object[3];
        appendFractionMethodArguments[0] = standardDateTimeFieldType;
        appendFractionMethodArguments[1] = -1;
        appendFractionMethodArguments[2] = -1;
        try {
            appendFractionMethod.invoke(dateTimeFormatterBuilder, appendFractionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFraction(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fieldType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendFraction_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendFraction(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendFraction(org.joda.time.DateTimeFieldType, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFraction(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (maxDigits < minDigits): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new Fraction(fieldType, minDigits, maxDigits));
 *  */
    @Test
    public void testAppendFraction_ThrowNullPointerException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendFraction] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendFraction(DateTimeFormatterBuilder.java:541) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFractionMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFraction", standardDateTimeFieldTypeType, intType, intType);
        appendFractionMethod.setAccessible(true);
        java.lang.Object[] appendFractionMethodArguments = new java.lang.Object[3];
        appendFractionMethodArguments[0] = standardDateTimeFieldType;
        appendFractionMethodArguments[1] = 19;
        appendFractionMethodArguments[2] = 18;
        try {
            appendFractionMethod.invoke(dateTimeFormatterBuilder, appendFractionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFraction(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (maxDigits < minDigits): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new Fraction(fieldType, minDigits, maxDigits));
 *  */
    @Test
    public void testAppendFraction_ThrowNullPointerException_1() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendFraction] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendFraction(DateTimeFormatterBuilder.java:541) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFractionMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFraction", standardDateTimeFieldTypeType, intType, intType);
        appendFractionMethod.setAccessible(true);
        java.lang.Object[] appendFractionMethodArguments = new java.lang.Object[3];
        appendFractionMethodArguments[0] = standardDateTimeFieldType;
        appendFractionMethodArguments[1] = 3;
        appendFractionMethodArguments[2] = 18;
        try {
            appendFractionMethod.invoke(dateTimeFormatterBuilder, appendFractionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendFraction(org.joda.time.DateTimeFieldType, int, int)
    
    @Test
    public void testAppendFraction1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFractionMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFraction", standardDateTimeFieldTypeType, intType, intType);
        appendFractionMethod.setAccessible(true);
        java.lang.Object[] appendFractionMethodArguments = new java.lang.Object[3];
        appendFractionMethodArguments[0] = standardDateTimeFieldType;
        appendFractionMethodArguments[1] = 6;
        appendFractionMethodArguments[2] = 11;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendFractionMethod.invoke(dateTimeFormatterBuilder, appendFractionMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    
    @Test
    public void testAppendFraction2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFractionMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFraction", standardDateTimeFieldTypeType, intType, intType);
        appendFractionMethod.setAccessible(true);
        java.lang.Object[] appendFractionMethodArguments = new java.lang.Object[3];
        appendFractionMethodArguments[0] = standardDateTimeFieldType;
        appendFractionMethodArguments[1] = 22;
        appendFractionMethodArguments[2] = 1073741843;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendFractionMethod.invoke(dateTimeFormatterBuilder, appendFractionMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendFraction3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFractionMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFraction", standardDateTimeFieldTypeType, intType, intType);
        appendFractionMethod.setAccessible(true);
        java.lang.Object[] appendFractionMethodArguments = new java.lang.Object[3];
        appendFractionMethodArguments[0] = standardDateTimeFieldType;
        appendFractionMethodArguments[1] = 3;
        appendFractionMethodArguments[2] = 0;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendFractionMethod.invoke(dateTimeFormatterBuilder, appendFractionMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendFraction(org.joda.time.DateTimeFieldType, int, int)
    
    @Test
    public void testAppendFraction4() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendFraction] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendFraction(DateTimeFormatterBuilder.java:541) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFractionMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFraction", standardDateTimeFieldTypeType, intType, intType);
        appendFractionMethod.setAccessible(true);
        java.lang.Object[] appendFractionMethodArguments = new java.lang.Object[3];
        appendFractionMethodArguments[0] = standardDateTimeFieldType;
        appendFractionMethodArguments[1] = 22;
        appendFractionMethodArguments[2] = 1073741843;
        try {
            appendFractionMethod.invoke(dateTimeFormatterBuilder, appendFractionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendFraction5() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendFraction] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendFraction(DateTimeFormatterBuilder.java:541) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFractionMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFraction", standardDateTimeFieldTypeType, intType, intType);
        appendFractionMethod.setAccessible(true);
        java.lang.Object[] appendFractionMethodArguments = new java.lang.Object[3];
        appendFractionMethodArguments[0] = standardDateTimeFieldType;
        appendFractionMethodArguments[1] = 3;
        appendFractionMethodArguments[2] = 0;
        try {
            appendFractionMethod.invoke(dateTimeFormatterBuilder, appendFractionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendText(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendText(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.returnsFrom {@code return append0(new TextField(fieldType, false));}
 *  */
    @Test
    public void testAppendText_FieldTypeNotEqualsNull() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Method appendTextMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendText", standardDateTimeFieldTypeType);
        appendTextMethod.setAccessible(true);
        java.lang.Object[] appendTextMethodArguments = new java.lang.Object[1];
        appendTextMethodArguments[0] = standardDateTimeFieldType;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendTextMethod.invoke(dateTimeFormatterBuilder, appendTextMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendText(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendText(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (fieldType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fieldType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendText_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendText(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendText(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendText(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new TextField(fieldType, false));
 *  */
    @Test
    public void testAppendText_ThrowNullPointerException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendText] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendText(DateTimeFormatterBuilder.java:499) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Method appendTextMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendText", standardDateTimeFieldTypeType);
        appendTextMethod.setAccessible(true);
        java.lang.Object[] appendTextMethodArguments = new java.lang.Object[1];
        appendTextMethodArguments[0] = standardDateTimeFieldType;
        try {
            appendTextMethod.invoke(dateTimeFormatterBuilder, appendTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendOptional
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendOptional(org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendOptional(org.joda.time.format.DateTimeParser)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#checkParser(org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkParser(parser);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendOptional_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendOptional(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendOptional(org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendOptional(org.joda.time.format.DateTimeParser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(null, new MatchingParser(parsers));
 *  */
    @Test
    public void testAppendOptional_ThrowNullPointerException_1() throws Exception  {
        int prevMAX_LENGTH = DateTimeFormatterBuilder.TimeZoneId.MAX_LENGTH;
        try {
            Class timeZoneIdClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
            setStaticField(timeZoneIdClazz, "MAX_LENGTH", 32);
            DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
            DateTimeFormatterBuilder.TimeZoneId timeZoneId = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
            
            /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendOptional] produces [java.lang.NullPointerException]
                org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
                org.joda.time.format.DateTimeFormatterBuilder.appendOptional(DateTimeFormatterBuilder.java:309) */
            dateTimeFormatterBuilder.appendOptional(timeZoneId);
        } finally {
            setStaticField(DateTimeFormatterBuilder.TimeZoneId.class, "MAX_LENGTH", prevMAX_LENGTH);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendOptional(org.joda.time.format.DateTimeParser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(null, new MatchingParser(parsers));
 *  */
    @Test
    public void testAppendOptional_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendOptional] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.appendOptional(DateTimeFormatterBuilder.java:309) */
        dateTimeFormatterBuilder.appendOptional(styleFormatter);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendOptional(org.joda.time.format.DateTimeParser)
    
    @Test
    public void testAppendOptional1() throws Exception  {
        int prevMAX_LENGTH = DateTimeFormatterBuilder.TimeZoneId.MAX_LENGTH;
        try {
            Class timeZoneIdClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
            setStaticField(timeZoneIdClazz, "MAX_LENGTH", 32);
            DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            iElementPairs.add(null);
            iElementPairs.add(null);
            iElementPairs.add(null);
            setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
            DateTimeFormatterBuilder.TimeZoneId timeZoneId = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
            
            DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendOptional(timeZoneId);
            
            ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
            ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
            assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
            
            Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
            assertNull(actualIFormatter);
            
        } finally {
            setStaticField(DateTimeFormatterBuilder.TimeZoneId.class, "MAX_LENGTH", prevMAX_LENGTH);
        }
    }
    
    @Test
    public void testAppendOptional2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendOptional(styleFormatter);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.toPrinter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrinter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toPrinter()}
 * @utbot.returnsFrom {@code return (DateTimePrinter) f;}
 *  */
    @Test
    public void testToPrinter_ReturnF() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.CharacterLiteral iFormatter = ((DateTimeFormatterBuilder.CharacterLiteral) createInstance("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder.CharacterLiteral actual = ((DateTimeFormatterBuilder.CharacterLiteral) dateTimeFormatterBuilder.toPrinter());
        
        DateTimeFormatterBuilder.CharacterLiteral expected = new DateTimeFormatterBuilder.CharacterLiteral('\u0000');
        
        char expectedIValue = ((Character) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", "iValue"));
        char actualIValue = ((Character) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", "iValue"));
        assertEquals(expectedIValue, actualIValue);
        
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toPrinter()}
 * @utbot.returnsFrom {@code return (DateTimePrinter) f;}
 *  */
    @Test
    public void testToPrinter_ReturnF_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimePrinter[] iPrinters = {null};
        setField(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters", iPrinters);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder.Composite actual = ((DateTimeFormatterBuilder.Composite) dateTimeFormatterBuilder.toPrinter());
        
        org.joda.time.format.DateTimePrinter[] iFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        org.joda.time.format.DateTimePrinter[] actualIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        int iFormatterIPrintersSize = iFormatterIPrinters.length;
        assertEquals(iFormatterIPrintersSize, actualIPrinters.length);
        assertTrue(deepEquals(iFormatterIPrinters, actualIPrinters));
        
        org.joda.time.format.DateTimeParser[] actualIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        assertNull(actualIParsers);
        
        int iFormatterIPrintedLengthEstimate = ((Integer) getFieldValue(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        int actualIPrintedLengthEstimate = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        assertEquals(iFormatterIPrintedLengthEstimate, actualIPrintedLengthEstimate);
        
        int iFormatterIParsedLengthEstimate = ((Integer) getFieldValue(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        int actualIParsedLengthEstimate = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        assertEquals(iFormatterIParsedLengthEstimate, actualIParsedLengthEstimate);
        
        Object dateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatterIFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters0 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatterIFormatterIPrinters, 0));
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toPrinter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toPrinter()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Printing is not supported");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToPrinter_ThrowUnsupportedOperationException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        byte[] iFormatter = {};
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        dateTimeFormatterBuilder.toPrinter();
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toPrinter()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Printing is not supported");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToPrinter_ThrowUnsupportedOperationException_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        dateTimeFormatterBuilder.toPrinter();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrinter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toPrinter()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#getFormatter()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object f = getFormatter();
 *  */
    @Test
    public void testToPrinter_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.toPrinter] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1103)
            org.joda.time.format.DateTimeFormatterBuilder.toPrinter(DateTimeFormatterBuilder.java:132) */
        dateTimeFormatterBuilder.toPrinter();
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toPrinter()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toPrinter()}
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testToPrinterThrowsUOE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.toPrinter();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toPrinter()
    
    @Test(expected = UnsupportedOperationException.class)
    public void testToPrinter1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(dateTimeFormatterBuilder);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        dateTimeFormatterBuilder.toPrinter();
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testToPrinter2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        ArrayList arrayList = new ArrayList();
        iElementPairs.add(arrayList);
        ArrayList arrayList1 = new ArrayList();
        iElementPairs.add(arrayList1);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        dateTimeFormatterBuilder.toPrinter();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toPrinter()
    
    @Test
    public void testToPrinter3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.toPrinter] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.decompose(DateTimeFormatterBuilder.java:2718)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.<init>(DateTimeFormatterBuilder.java:2568)
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1117)
            org.joda.time.format.DateTimeFormatterBuilder.toPrinter(DateTimeFormatterBuilder.java:132) */
        dateTimeFormatterBuilder.toPrinter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendShortText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendShortText(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendShortText(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.returnsFrom {@code return append0(new TextField(fieldType, true));}
 *  */
    @Test
    public void testAppendShortText_FieldTypeNotEqualsNull() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Method appendShortTextMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendShortText", standardDateTimeFieldTypeType);
        appendShortTextMethod.setAccessible(true);
        java.lang.Object[] appendShortTextMethodArguments = new java.lang.Object[1];
        appendShortTextMethodArguments[0] = standardDateTimeFieldType;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendShortTextMethod.invoke(dateTimeFormatterBuilder, appendShortTextMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendShortText(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendShortText(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (fieldType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fieldType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendShortText_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendShortText(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendShortText(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendShortText(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new TextField(fieldType, true));
 *  */
    @Test
    public void testAppendShortText_ThrowNullPointerException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendShortText] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendShortText(DateTimeFormatterBuilder.java:514) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Method appendShortTextMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendShortText", standardDateTimeFieldTypeType);
        appendShortTextMethod.setAccessible(true);
        java.lang.Object[] appendShortTextMethodArguments = new java.lang.Object[1];
        appendShortTextMethodArguments[0] = standardDateTimeFieldType;
        try {
            appendShortTextMethod.invoke(dateTimeFormatterBuilder, appendShortTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendMillisOfDay
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendMillisOfDay(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendMillisOfDay(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendMillisOfDayThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendMillisOfDay(-2147483640);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendDecimal
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendDecimal(org.joda.time.DateTimeFieldType, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendDecimal(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (maxDigits < minDigits): True}
 * @utbot.executesCondition {@code (minDigits < 0): False}
 * @utbot.executesCondition {@code (maxDigits <= 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: minDigits < 0 || maxDigits <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_ThrowIllegalArgumentException_1() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendDecimalMethod.setAccessible(true);
        java.lang.Object[] appendDecimalMethodArguments = new java.lang.Object[3];
        appendDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendDecimalMethodArguments[1] = 0;
        appendDecimalMethodArguments[2] = -1;
        try {
            appendDecimalMethod.invoke(dateTimeFormatterBuilder, appendDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendDecimal(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (maxDigits < minDigits): False}
 * @utbot.executesCondition {@code (minDigits < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: minDigits < 0 || maxDigits <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_ThrowIllegalArgumentException_2() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendDecimalMethod.setAccessible(true);
        java.lang.Object[] appendDecimalMethodArguments = new java.lang.Object[3];
        appendDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendDecimalMethodArguments[1] = -1;
        appendDecimalMethodArguments[2] = -1;
        try {
            appendDecimalMethod.invoke(dateTimeFormatterBuilder, appendDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendDecimal(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fieldType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimal_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendDecimal(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDecimal(org.joda.time.DateTimeFieldType, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendDecimal(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (maxDigits < minDigits): True}
 * @utbot.executesCondition {@code (minDigits < 0): False}
 * @utbot.executesCondition {@code (maxDigits <= 0): False}
 * @utbot.executesCondition {@code (minDigits <= 1): True}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new UnpaddedNumber(fieldType, maxDigits, false));
 *  */
    @Test
    public void testAppendDecimal_ThrowNullPointerException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendDecimal] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendDecimal(DateTimeFormatterBuilder.java:406) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendDecimalMethod.setAccessible(true);
        java.lang.Object[] appendDecimalMethodArguments = new java.lang.Object[3];
        appendDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendDecimalMethodArguments[1] = 1;
        appendDecimalMethodArguments[2] = 0;
        try {
            appendDecimalMethod.invoke(dateTimeFormatterBuilder, appendDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDecimal(org.joda.time.DateTimeFieldType, int, int)
    
    @Test
    public void testAppendDecimal1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendDecimalMethod.setAccessible(true);
        java.lang.Object[] appendDecimalMethodArguments = new java.lang.Object[3];
        appendDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendDecimalMethodArguments[1] = 2;
        appendDecimalMethodArguments[2] = 2;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendDecimalMethod.invoke(dateTimeFormatterBuilder, appendDecimalMethodArguments));
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.PaddedNumber paddedNumber = ((DateTimeFormatterBuilder.PaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 2);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", standardDateTimeFieldType);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 2);
        iElementPairs.add(paddedNumber);
        iElementPairs.add(paddedNumber);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendDecimal2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendDecimalMethod.setAccessible(true);
        java.lang.Object[] appendDecimalMethodArguments = new java.lang.Object[3];
        appendDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendDecimalMethodArguments[1] = 0;
        appendDecimalMethodArguments[2] = 1;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendDecimalMethod.invoke(dateTimeFormatterBuilder, appendDecimalMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendDecimal3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendDecimalMethod.setAccessible(true);
        java.lang.Object[] appendDecimalMethodArguments = new java.lang.Object[3];
        appendDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendDecimalMethodArguments[1] = 1;
        appendDecimalMethodArguments[2] = 0;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendDecimalMethod.invoke(dateTimeFormatterBuilder, appendDecimalMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendSecondOfDay
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSecondOfDay(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendSecondOfDay(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSecondOfDayThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendSecondOfDay(-2147483643);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendMinuteOfHour
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendMinuteOfHour(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendMinuteOfHour(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendMinuteOfHourThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendMinuteOfHour(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendMinuteOfDay
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendMinuteOfDay(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendMinuteOfDay(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendMinuteOfDayThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendMinuteOfDay(-2147483644);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendHourOfDay
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendHourOfDay(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendHourOfDay(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendHourOfDayThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendHourOfDay(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.canBuildParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canBuildParser()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildParser()}
 * @utbot.returnsFrom {@code return isParser(getFormatter());}
 *  */
    @Test
    public void testCanBuildParser_ReturnIsParser() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.TwoDigitYear iFormatter = ((DateTimeFormatterBuilder.TwoDigitYear) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildParser();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildParser()}
 * @utbot.returnsFrom {@code return isParser(getFormatter());}
 *  */
    @Test
    public void testCanBuildParser_ReturnIsParser_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        byte[] iFormatter = {};
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildParser();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildParser()}
 * @utbot.returnsFrom {@code return isParser(getFormatter());}
 *  */
    @Test
    public void testCanBuildParser_ReturnIsParser_2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimeParser[] iParsers = {null};
        setField(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers", iParsers);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildParser();
        
        assertTrue(actual);
        
        Object dateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatterIFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers0 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatterIFormatterIParsers, 0));
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers0);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildParser()}
 * @utbot.returnsFrom {@code return isParser(getFormatter());}
 *  */
    @Test
    public void testCanBuildParser_ReturnIsParser_3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildParser();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canBuildParser()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildParser()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#getFormatter()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isParser(getFormatter());
 *  */
    @Test
    public void testCanBuildParser_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.canBuildParser] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1103)
            org.joda.time.format.DateTimeFormatterBuilder.canBuildParser(DateTimeFormatterBuilder.java:187) */
        dateTimeFormatterBuilder.canBuildParser();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method canBuildParser()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildParser()}
     */
    @Test
    public void testCanBuildParserReturnsFalse() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        boolean actual = dateTimeFormatterBuilder.canBuildParser();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method canBuildParser()
    
    @Test
    public void testCanBuildParser1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        Object initialDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        boolean actual = dateTimeFormatterBuilder.canBuildParser();
        
        assertFalse(actual);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertFalse(initialDateTimeFormatterBuilderIFormatter == finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.append0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append0(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend0_ArrayListAdd() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class objectType = Class.forName("java.lang.Object");
        Method append0Method = dateTimeFormatterBuilderClazz.getDeclaredMethod("append0", objectType);
        append0Method.setAccessible(true);
        java.lang.Object[] append0MethodArguments = new java.lang.Object[1];
        append0MethodArguments[0] = ((Object) null);
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) append0Method.invoke(dateTimeFormatterBuilder, append0MethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append0(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iElementPairs.add(element);
 *  */
    @Test
    public void testAppend0_ThrowNullPointerException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.append0] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class objectType = Class.forName("java.lang.Object");
        Method append0Method = dateTimeFormatterBuilderClazz.getDeclaredMethod("append0", objectType);
        append0Method.setAccessible(true);
        java.lang.Object[] append0MethodArguments = new java.lang.Object[1];
        append0MethodArguments[0] = ((Object) null);
        try {
            append0Method.invoke(dateTimeFormatterBuilder, append0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.append0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append0(org.joda.time.format.DateTimePrinter, org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend0_ArrayListAdd1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class dateTimePrinterType = Class.forName("org.joda.time.format.DateTimePrinter");
        Class dateTimeParserType = Class.forName("org.joda.time.format.DateTimeParser");
        Method append0Method = dateTimeFormatterBuilderClazz.getDeclaredMethod("append0", dateTimePrinterType, dateTimeParserType);
        append0Method.setAccessible(true);
        java.lang.Object[] append0MethodArguments = new java.lang.Object[2];
        append0MethodArguments[0] = ((Object) null);
        append0MethodArguments[1] = ((Object) null);
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) append0Method.invoke(dateTimeFormatterBuilder, append0MethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append0(org.joda.time.format.DateTimePrinter, org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iElementPairs.add(printer);
 *  */
    @Test
    public void testAppend0_ThrowNullPointerException1() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.append0] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class dateTimePrinterType = Class.forName("org.joda.time.format.DateTimePrinter");
        Class dateTimeParserType = Class.forName("org.joda.time.format.DateTimeParser");
        Method append0Method = dateTimeFormatterBuilderClazz.getDeclaredMethod("append0", dateTimePrinterType, dateTimeParserType);
        append0Method.setAccessible(true);
        java.lang.Object[] append0MethodArguments = new java.lang.Object[2];
        append0MethodArguments[0] = ((Object) null);
        append0MethodArguments[1] = ((Object) null);
        try {
            append0Method.invoke(dateTimeFormatterBuilder, append0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.toParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toParser()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toParser()}
 * @utbot.returnsFrom {@code return (DateTimeParser) f;}
 *  */
    @Test
    public void testToParser_ReturnF() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.TextField iFormatter = ((DateTimeFormatterBuilder.TextField) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder.TextField actual = ((DateTimeFormatterBuilder.TextField) dateTimeFormatterBuilder.toParser());
        
        DateTimeFieldType actualIFieldType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iFieldType"));
        assertNull(actualIFieldType);
        
        boolean actualIShort = ((Boolean) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iShort"));
        assertFalse(actualIShort);
        
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toParser()}
 * @utbot.returnsFrom {@code return (DateTimeParser) f;}
 *  */
    @Test
    public void testToParser_ReturnF_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimeParser[] iParsers = {null};
        setField(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers", iParsers);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder.Composite actual = ((DateTimeFormatterBuilder.Composite) dateTimeFormatterBuilder.toParser());
        
        org.joda.time.format.DateTimePrinter[] actualIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        assertNull(actualIPrinters);
        
        org.joda.time.format.DateTimeParser[] iFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        org.joda.time.format.DateTimeParser[] actualIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        int iFormatterIParsersSize = iFormatterIParsers.length;
        assertEquals(iFormatterIParsersSize, actualIParsers.length);
        assertTrue(deepEquals(iFormatterIParsers, actualIParsers));
        
        int iFormatterIPrintedLengthEstimate = ((Integer) getFieldValue(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        int actualIPrintedLengthEstimate = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrintedLengthEstimate"));
        assertEquals(iFormatterIPrintedLengthEstimate, actualIPrintedLengthEstimate);
        
        int iFormatterIParsedLengthEstimate = ((Integer) getFieldValue(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        int actualIParsedLengthEstimate = ((Integer) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsedLengthEstimate"));
        assertEquals(iFormatterIParsedLengthEstimate, actualIParsedLengthEstimate);
        
        Object dateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatterIFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers0 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatterIFormatterIParsers, 0));
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toParser()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toParser()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Parsing is not supported");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToParser_ThrowUnsupportedOperationException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        byte[] iFormatter = {};
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        dateTimeFormatterBuilder.toParser();
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toParser()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Parsing is not supported");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToParser_ThrowUnsupportedOperationException_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        dateTimeFormatterBuilder.toParser();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toParser()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toParser()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#getFormatter()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object f = getFormatter();
 *  */
    @Test
    public void testToParser_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.toParser] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1103)
            org.joda.time.format.DateTimeFormatterBuilder.toParser(DateTimeFormatterBuilder.java:152) */
        dateTimeFormatterBuilder.toParser();
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toParser()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#toParser()}
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testToParserThrowsUOE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.toParser();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toParser()
    
    @Test(expected = UnsupportedOperationException.class)
    public void testToParser1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        dateTimeFormatterBuilder.toParser();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toParser()
    
    @Test
    public void testToParser2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.toParser] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.decompose(DateTimeFormatterBuilder.java:2718)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.<init>(DateTimeFormatterBuilder.java:2568)
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1117)
            org.joda.time.format.DateTimeFormatterBuilder.toParser(DateTimeFormatterBuilder.java:152) */
        dateTimeFormatterBuilder.toParser();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.checkParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkParser(org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#checkParser(org.joda.time.format.DateTimeParser)}
 * @utbot.executesCondition {@code (parser == null): False}
 *  */
    @Test
    public void testCheckParser_ParserNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormat.StyleFormatter styleFormatter = new DateTimeFormat.StyleFormatter(0, 0, 0);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class styleFormatterType = Class.forName("org.joda.time.format.DateTimeParser");
        Method checkParserMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("checkParser", styleFormatterType);
        checkParserMethod.setAccessible(true);
        java.lang.Object[] checkParserMethodArguments = new java.lang.Object[1];
        checkParserMethodArguments[0] = styleFormatter;
        checkParserMethod.invoke(dateTimeFormatterBuilder, checkParserMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkParser(org.joda.time.format.DateTimeParser)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#checkParser(org.joda.time.format.DateTimeParser)}
 * @utbot.executesCondition {@code (parser == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: parser == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCheckParser_ThrowIllegalArgumentException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class dateTimeParserType = Class.forName("org.joda.time.format.DateTimeParser");
        Method checkParserMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("checkParser", dateTimeParserType);
        checkParserMethod.setAccessible(true);
        java.lang.Object[] checkParserMethodArguments = new java.lang.Object[1];
        checkParserMethodArguments[0] = ((Object) null);
        try {
            checkParserMethod.invoke(dateTimeFormatterBuilder, checkParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.checkPrinter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkPrinter(org.joda.time.format.DateTimePrinter)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#checkPrinter(org.joda.time.format.DateTimePrinter)}
 * @utbot.executesCondition {@code (printer == null): False}
 *  */
    @Test
    public void testCheckPrinter_PrinterNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.TimeZoneId timeZoneId = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class timeZoneIdType = Class.forName("org.joda.time.format.DateTimePrinter");
        Method checkPrinterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("checkPrinter", timeZoneIdType);
        checkPrinterMethod.setAccessible(true);
        java.lang.Object[] checkPrinterMethodArguments = new java.lang.Object[1];
        checkPrinterMethodArguments[0] = timeZoneId;
        checkPrinterMethod.invoke(dateTimeFormatterBuilder, checkPrinterMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkPrinter(org.joda.time.format.DateTimePrinter)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#checkPrinter(org.joda.time.format.DateTimePrinter)}
 * @utbot.executesCondition {@code (printer == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: printer == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCheckPrinter_ThrowIllegalArgumentException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class dateTimePrinterType = Class.forName("org.joda.time.format.DateTimePrinter");
        Method checkPrinterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("checkPrinter", dateTimePrinterType);
        checkPrinterMethod.setAccessible(true);
        java.lang.Object[] checkPrinterMethodArguments = new java.lang.Object[1];
        checkPrinterMethodArguments[0] = ((Object) null);
        try {
            checkPrinterMethod.invoke(dateTimeFormatterBuilder, checkPrinterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendFixedDecimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendFixedDecimal(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFixedDecimal(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (numDigits <= 0): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.returnsFrom {@code return append0(new FixedNumber(fieldType, numDigits, false));}
 *  */
    @Test
    public void testAppendFixedDecimal_NumDigitsGreaterThanZero() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFixedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFixedDecimal", standardDateTimeFieldTypeType, intType);
        appendFixedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendFixedDecimalMethodArguments = new java.lang.Object[2];
        appendFixedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendFixedDecimalMethodArguments[1] = 1;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendFixedDecimalMethod.invoke(dateTimeFormatterBuilder, appendFixedDecimalMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendFixedDecimal(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFixedDecimal(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (numDigits <= 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: numDigits <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedDecimal_ThrowIllegalArgumentException_1() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFixedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFixedDecimal", standardDateTimeFieldTypeType, intType);
        appendFixedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendFixedDecimalMethodArguments = new java.lang.Object[2];
        appendFixedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendFixedDecimalMethodArguments[1] = 0;
        try {
            appendFixedDecimalMethod.invoke(dateTimeFormatterBuilder, appendFixedDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFixedDecimal(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fieldType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedDecimal_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendFixedDecimal(null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendFixedDecimal(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFixedDecimal(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (numDigits <= 0): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new FixedNumber(fieldType, numDigits, false));
 *  */
    @Test
    public void testAppendFixedDecimal_ThrowNullPointerException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendFixedDecimal] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendFixedDecimal(DateTimeFormatterBuilder.java:432) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFixedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFixedDecimal", standardDateTimeFieldTypeType, intType);
        appendFixedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendFixedDecimalMethodArguments = new java.lang.Object[2];
        appendFixedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendFixedDecimalMethodArguments[1] = 1;
        try {
            appendFixedDecimalMethod.invoke(dateTimeFormatterBuilder, appendFixedDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.canBuildPrinter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canBuildPrinter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildPrinter()}
 * @utbot.returnsFrom {@code return isPrinter(getFormatter());}
 *  */
    @Test
    public void testCanBuildPrinter_ReturnIsPrinter() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.TwoDigitYear iFormatter = ((DateTimeFormatterBuilder.TwoDigitYear) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildPrinter();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildPrinter()}
 * @utbot.returnsFrom {@code return isPrinter(getFormatter());}
 *  */
    @Test
    public void testCanBuildPrinter_ReturnIsPrinter_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        byte[] iFormatter = {};
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildPrinter();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildPrinter()}
 * @utbot.returnsFrom {@code return isPrinter(getFormatter());}
 *  */
    @Test
    public void testCanBuildPrinter_ReturnIsPrinter_2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimePrinter[] iPrinters = {null};
        setField(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters", iPrinters);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildPrinter();
        
        assertTrue(actual);
        
        Object dateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatterIFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters0 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatterIFormatterIPrinters, 0));
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters0);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildPrinter()}
 * @utbot.returnsFrom {@code return isPrinter(getFormatter());}
 *  */
    @Test
    public void testCanBuildPrinter_ReturnIsPrinter_3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildPrinter();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canBuildPrinter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildPrinter()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#getFormatter()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isPrinter(getFormatter());
 *  */
    @Test
    public void testCanBuildPrinter_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.canBuildPrinter] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1103)
            org.joda.time.format.DateTimeFormatterBuilder.canBuildPrinter(DateTimeFormatterBuilder.java:177) */
        dateTimeFormatterBuilder.canBuildPrinter();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method canBuildPrinter()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildPrinter()}
     */
    @Test
    public void testCanBuildPrinterReturnsFalse() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        boolean actual = dateTimeFormatterBuilder.canBuildPrinter();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method canBuildPrinter()
    
    @Test
    public void testCanBuildPrinter1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(dateTimeFormatterBuilder);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        boolean actual = dateTimeFormatterBuilder.canBuildPrinter();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method canBuildPrinter()
    
    @Test
    public void testCanBuildPrinter2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.canBuildPrinter] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.decompose(DateTimeFormatterBuilder.java:2718)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.<init>(DateTimeFormatterBuilder.java:2568)
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1117)
            org.joda.time.format.DateTimeFormatterBuilder.canBuildPrinter(DateTimeFormatterBuilder.java:177) */
        dateTimeFormatterBuilder.canBuildPrinter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.canBuildFormatter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canBuildFormatter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildFormatter()}
 * @utbot.returnsFrom {@code return isFormatter(getFormatter());}
 *  */
    @Test
    public void testCanBuildFormatter_ReturnIsFormatter() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.TwoDigitYear iFormatter = ((DateTimeFormatterBuilder.TwoDigitYear) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildFormatter();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildFormatter()}
 * @utbot.returnsFrom {@code return isFormatter(getFormatter());}
 *  */
    @Test
    public void testCanBuildFormatter_ReturnIsFormatter_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        byte[] iFormatter = {};
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildFormatter();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildFormatter()}
 * @utbot.returnsFrom {@code return isFormatter(getFormatter());}
 *  */
    @Test
    public void testCanBuildFormatter_ReturnIsFormatter_2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimePrinter[] iPrinters = {null};
        setField(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters", iPrinters);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildFormatter();
        
        assertTrue(actual);
        
        Object dateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimePrinter[] dateTimeFormatterBuilderIFormatterIFormatterIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(dateTimeFormatterBuilderIFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalDateTimeFormatterBuilderIFormatterIPrinters0 = ((DateTimePrinter) get(dateTimeFormatterBuilderIFormatterIFormatterIPrinters, 0));
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIPrinters0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canBuildFormatter()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildFormatter()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#getFormatter()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isFormatter(getFormatter());
 *  */
    @Test
    public void testCanBuildFormatter_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.canBuildFormatter] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1103)
            org.joda.time.format.DateTimeFormatterBuilder.canBuildFormatter(DateTimeFormatterBuilder.java:167) */
        dateTimeFormatterBuilder.canBuildFormatter();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method canBuildFormatter()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#canBuildFormatter()}
     */
    @Test
    public void testCanBuildFormatterReturnsFalse() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        boolean actual = dateTimeFormatterBuilder.canBuildFormatter();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method canBuildFormatter()
    
    @Test
    public void testCanBuildFormatter1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.MatchingParser iFormatter = ((DateTimeFormatterBuilder.MatchingParser) createInstance("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildFormatter();
        
        assertTrue(actual);
    }
    
    @Test
    public void testCanBuildFormatter2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimeParser[] iParsers = {null, null, null, null, null, null, null, null, null};
        setField(iFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers", iParsers);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildFormatter();
        
        assertTrue(actual);
        
        Object dateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatterIFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers0 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatterIFormatterIParsers, 0));
        Object dateTimeFormatterBuilderIFormatter1 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter1IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter1, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers1 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter1IFormatterIParsers, 1));
        Object dateTimeFormatterBuilderIFormatter2 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter2IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter2, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers2 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter2IFormatterIParsers, 2));
        Object dateTimeFormatterBuilderIFormatter3 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter3IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter3, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers3 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter3IFormatterIParsers, 3));
        Object dateTimeFormatterBuilderIFormatter4 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter4IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter4, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers4 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter4IFormatterIParsers, 4));
        Object dateTimeFormatterBuilderIFormatter5 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter5IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter5, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers5 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter5IFormatterIParsers, 5));
        Object dateTimeFormatterBuilderIFormatter6 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter6IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter6, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers6 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter6IFormatterIParsers, 6));
        Object dateTimeFormatterBuilderIFormatter7 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter7IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter7, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers7 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter7IFormatterIParsers, 7));
        Object dateTimeFormatterBuilderIFormatter8 = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        org.joda.time.format.DateTimeParser[] dateTimeFormatterBuilderIFormatter8IFormatterIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(dateTimeFormatterBuilderIFormatter8, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalDateTimeFormatterBuilderIFormatterIParsers8 = ((DateTimeParser) get(dateTimeFormatterBuilderIFormatter8IFormatterIParsers, 8));
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers0);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers1);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers2);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers3);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers4);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers5);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers6);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers7);
        
        assertNull(finalDateTimeFormatterBuilderIFormatterIParsers8);
    }
    
    @Test
    public void testCanBuildFormatter3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        DateTimeFormatterBuilder.Composite iFormatter = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        boolean actual = dateTimeFormatterBuilder.canBuildFormatter();
        
        assertFalse(actual);
    }
    
    @Test
    public void testCanBuildFormatter4() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        Object initialDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        boolean actual = dateTimeFormatterBuilder.canBuildFormatter();
        
        assertFalse(actual);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertFalse(initialDateTimeFormatterBuilderIFormatter == finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method canBuildFormatter()
    
    @Test
    public void testCanBuildFormatter5() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.canBuildFormatter] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.decompose(DateTimeFormatterBuilder.java:2718)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.<init>(DateTimeFormatterBuilder.java:2568)
            org.joda.time.format.DateTimeFormatterBuilder.getFormatter(DateTimeFormatterBuilder.java:1117)
            org.joda.time.format.DateTimeFormatterBuilder.canBuildFormatter(DateTimeFormatterBuilder.java:167) */
        dateTimeFormatterBuilder.canBuildFormatter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendDayOfMonth
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendDayOfMonth(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendDayOfMonth(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendDayOfMonthThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendDayOfMonth(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.isPrinter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPrinter(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isPrinter(java.lang.Object)}
 * @utbot.executesCondition {@code (f instanceof DateTimePrinter): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsPrinter_NotFNotInstanceOfDateTimePrinter() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class objectType = Class.forName("java.lang.Object");
        Method isPrinterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isPrinter", objectType);
        isPrinterMethod.setAccessible(true);
        java.lang.Object[] isPrinterMethodArguments = new java.lang.Object[1];
        isPrinterMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isPrinterMethod.invoke(dateTimeFormatterBuilder, isPrinterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isPrinter(java.lang.Object)}
 * @utbot.executesCondition {@code (f instanceof DateTimePrinter): True}
 * @utbot.executesCondition {@code (f instanceof Composite): True}
 * @utbot.returnsFrom {@code return ((Composite) f).isPrinter();}
 *  */
    @Test
    public void testIsPrinter_FInstanceOfComposite_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimePrinter[] iPrinters = {null};
        setField(composite, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters", iPrinters);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class compositeType = Class.forName("java.lang.Object");
        Method isPrinterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isPrinter", compositeType);
        isPrinterMethod.setAccessible(true);
        java.lang.Object[] isPrinterMethodArguments = new java.lang.Object[1];
        isPrinterMethodArguments[0] = composite;
        boolean actual = ((Boolean) isPrinterMethod.invoke(dateTimeFormatterBuilder, isPrinterMethodArguments));
        
        assertTrue(actual);
        
        org.joda.time.format.DateTimePrinter[] compositeIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(composite, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalCompositeIPrinters0 = ((DateTimePrinter) get(compositeIPrinters, 0));
        
        assertNull(finalCompositeIPrinters0);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isPrinter(java.lang.Object)}
 * @utbot.executesCondition {@code (f instanceof DateTimePrinter): True}
 * @utbot.executesCondition {@code (f instanceof Composite): True}
 * @utbot.returnsFrom {@code return ((Composite) f).isPrinter();}
 *  */
    @Test
    public void testIsPrinter_FInstanceOfComposite() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class compositeType = Class.forName("java.lang.Object");
        Method isPrinterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isPrinter", compositeType);
        isPrinterMethod.setAccessible(true);
        java.lang.Object[] isPrinterMethodArguments = new java.lang.Object[1];
        isPrinterMethodArguments[0] = composite;
        boolean actual = ((Boolean) isPrinterMethod.invoke(dateTimeFormatterBuilder, isPrinterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isPrinter(java.lang.Object)}
 * @utbot.executesCondition {@code (f instanceof DateTimePrinter): True}
 * @utbot.executesCondition {@code (f instanceof Composite): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsPrinter_NotFNotInstanceOfComposite() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.TwoDigitYear twoDigitYear = new DateTimeFormatterBuilder.TwoDigitYear(null, 0, false);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class twoDigitYearType = Class.forName("java.lang.Object");
        Method isPrinterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isPrinter", twoDigitYearType);
        isPrinterMethod.setAccessible(true);
        java.lang.Object[] isPrinterMethodArguments = new java.lang.Object[1];
        isPrinterMethodArguments[0] = twoDigitYear;
        boolean actual = ((Boolean) isPrinterMethod.invoke(dateTimeFormatterBuilder, isPrinterMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.isParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isParser(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isParser(java.lang.Object)}
 * @utbot.executesCondition {@code (f instanceof DateTimeParser): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsParser_NotFNotInstanceOfDateTimeParser() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class objectType = Class.forName("java.lang.Object");
        Method isParserMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isParser", objectType);
        isParserMethod.setAccessible(true);
        java.lang.Object[] isParserMethodArguments = new java.lang.Object[1];
        isParserMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isParserMethod.invoke(dateTimeFormatterBuilder, isParserMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isParser(java.lang.Object)}
 * @utbot.executesCondition {@code (f instanceof DateTimeParser): True}
 * @utbot.executesCondition {@code (f instanceof Composite): True}
 * @utbot.returnsFrom {@code return ((Composite) f).isParser();}
 *  */
    @Test
    public void testIsParser_FInstanceOfComposite_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimeParser[] iParsers = {null};
        setField(composite, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers", iParsers);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class compositeType = Class.forName("java.lang.Object");
        Method isParserMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isParser", compositeType);
        isParserMethod.setAccessible(true);
        java.lang.Object[] isParserMethodArguments = new java.lang.Object[1];
        isParserMethodArguments[0] = composite;
        boolean actual = ((Boolean) isParserMethod.invoke(dateTimeFormatterBuilder, isParserMethodArguments));
        
        assertTrue(actual);
        
        org.joda.time.format.DateTimeParser[] compositeIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(composite, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalCompositeIParsers0 = ((DateTimeParser) get(compositeIParsers, 0));
        
        assertNull(finalCompositeIParsers0);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isParser(java.lang.Object)}
 * @utbot.executesCondition {@code (f instanceof DateTimeParser): True}
 * @utbot.executesCondition {@code (f instanceof Composite): True}
 * @utbot.returnsFrom {@code return ((Composite) f).isParser();}
 *  */
    @Test
    public void testIsParser_FInstanceOfComposite() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class compositeType = Class.forName("java.lang.Object");
        Method isParserMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isParser", compositeType);
        isParserMethod.setAccessible(true);
        java.lang.Object[] isParserMethodArguments = new java.lang.Object[1];
        isParserMethodArguments[0] = composite;
        boolean actual = ((Boolean) isParserMethod.invoke(dateTimeFormatterBuilder, isParserMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isParser(java.lang.Object)}
 * @utbot.executesCondition {@code (f instanceof DateTimeParser): True}
 * @utbot.executesCondition {@code (f instanceof Composite): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsParser_NotFNotInstanceOfComposite() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.TwoDigitYear twoDigitYear = new DateTimeFormatterBuilder.TwoDigitYear(null, 0, false);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class twoDigitYearType = Class.forName("java.lang.Object");
        Method isParserMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isParser", twoDigitYearType);
        isParserMethod.setAccessible(true);
        java.lang.Object[] isParserMethodArguments = new java.lang.Object[1];
        isParserMethodArguments[0] = twoDigitYear;
        boolean actual = ((Boolean) isParserMethod.invoke(dateTimeFormatterBuilder, isParserMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendDayOfYear
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendDayOfYear(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendDayOfYear(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendDayOfYearThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendDayOfYear(-2147483645);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDayOfYear(int)
    
    @Test
    public void testAppendDayOfYear1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendDayOfYear(0);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber = ((DateTimeFormatterBuilder.UnpaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName = "days";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "dayOfYear";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(unpaddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 3);
        iElementPairs.add(unpaddedNumber);
        iElementPairs.add(unpaddedNumber);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.isFormatter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFormatter(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isFormatter(java.lang.Object)}
 * @utbot.returnsFrom {@code return (isPrinter(f) || isParser(f));}
 *  */
    @Test
    public void testIsFormatter_ReturnIsPrinterOrIsParser_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset = ((DateTimeFormatterBuilder.TimeZoneOffset) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class timeZoneOffsetType = Class.forName("java.lang.Object");
        Method isFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isFormatter", timeZoneOffsetType);
        isFormatterMethod.setAccessible(true);
        java.lang.Object[] isFormatterMethodArguments = new java.lang.Object[1];
        isFormatterMethodArguments[0] = timeZoneOffset;
        boolean actual = ((Boolean) isFormatterMethod.invoke(dateTimeFormatterBuilder, isFormatterMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isFormatter(java.lang.Object)}
 * @utbot.returnsFrom {@code return (isPrinter(f) || isParser(f));}
 *  */
    @Test
    public void testIsFormatter_ReturnIsPrinterOrIsParser_2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.MatchingParser matchingParser = ((DateTimeFormatterBuilder.MatchingParser) createInstance("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class matchingParserType = Class.forName("java.lang.Object");
        Method isFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isFormatter", matchingParserType);
        isFormatterMethod.setAccessible(true);
        java.lang.Object[] isFormatterMethodArguments = new java.lang.Object[1];
        isFormatterMethodArguments[0] = matchingParser;
        boolean actual = ((Boolean) isFormatterMethod.invoke(dateTimeFormatterBuilder, isFormatterMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isFormatter(java.lang.Object)}
 * @utbot.returnsFrom {@code return (isPrinter(f) || isParser(f));}
 *  */
    @Test
    public void testIsFormatter_ReturnIsPrinterOrIsParser() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class objectType = Class.forName("java.lang.Object");
        Method isFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isFormatter", objectType);
        isFormatterMethod.setAccessible(true);
        java.lang.Object[] isFormatterMethodArguments = new java.lang.Object[1];
        isFormatterMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isFormatterMethod.invoke(dateTimeFormatterBuilder, isFormatterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isFormatter(java.lang.Object)}
 * @utbot.returnsFrom {@code return (isPrinter(f) || isParser(f));}
 *  */
    @Test
    public void testIsFormatter_ReturnIsPrinterOrIsParser_3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimePrinter[] iPrinters = {null};
        setField(composite, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters", iPrinters);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class compositeType = Class.forName("java.lang.Object");
        Method isFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isFormatter", compositeType);
        isFormatterMethod.setAccessible(true);
        java.lang.Object[] isFormatterMethodArguments = new java.lang.Object[1];
        isFormatterMethodArguments[0] = composite;
        boolean actual = ((Boolean) isFormatterMethod.invoke(dateTimeFormatterBuilder, isFormatterMethodArguments));
        
        assertTrue(actual);
        
        org.joda.time.format.DateTimePrinter[] compositeIPrinters = ((org.joda.time.format.DateTimePrinter[]) getFieldValue(composite, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iPrinters"));
        DateTimePrinter finalCompositeIPrinters0 = ((DateTimePrinter) get(compositeIPrinters, 0));
        
        assertNull(finalCompositeIPrinters0);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isFormatter(java.lang.Object)}
 * @utbot.returnsFrom {@code return (isPrinter(f) || isParser(f));}
 *  */
    @Test
    public void testIsFormatter_ReturnIsPrinterOrIsParser_5() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        org.joda.time.format.DateTimeParser[] iParsers = {null};
        setField(composite, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers", iParsers);
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class compositeType = Class.forName("java.lang.Object");
        Method isFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isFormatter", compositeType);
        isFormatterMethod.setAccessible(true);
        java.lang.Object[] isFormatterMethodArguments = new java.lang.Object[1];
        isFormatterMethodArguments[0] = composite;
        boolean actual = ((Boolean) isFormatterMethod.invoke(dateTimeFormatterBuilder, isFormatterMethodArguments));
        
        assertTrue(actual);
        
        org.joda.time.format.DateTimeParser[] compositeIParsers = ((org.joda.time.format.DateTimeParser[]) getFieldValue(composite, "org.joda.time.format.DateTimeFormatterBuilder$Composite", "iParsers"));
        DateTimeParser finalCompositeIParsers0 = ((DateTimeParser) get(compositeIParsers, 0));
        
        assertNull(finalCompositeIParsers0);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#isFormatter(java.lang.Object)}
 * @utbot.returnsFrom {@code return (isPrinter(f) || isParser(f));}
 *  */
    @Test
    public void testIsFormatter_ReturnIsPrinterOrIsParser_4() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatterBuilder.Composite composite = ((DateTimeFormatterBuilder.Composite) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class compositeType = Class.forName("java.lang.Object");
        Method isFormatterMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("isFormatter", compositeType);
        isFormatterMethod.setAccessible(true);
        java.lang.Object[] isFormatterMethodArguments = new java.lang.Object[1];
        isFormatterMethodArguments[0] = composite;
        boolean actual = ((Boolean) isFormatterMethod.invoke(dateTimeFormatterBuilder, isFormatterMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendTimeZoneId()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneId()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.returnsFrom {@code return append0(TimeZoneId.INSTANCE, TimeZoneId.INSTANCE);}
 *  */
    @Test
    public void testAppendTimeZoneId_DateTimeFormatterBuilderAppend0() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneId();
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendTimeZoneId()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneId()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(TimeZoneId.INSTANCE, TimeZoneId.INSTANCE);
 *  */
    @Test
    public void testAppendTimeZoneId_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneId] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneId(DateTimeFormatterBuilder.java:1030) */
        dateTimeFormatterBuilder.appendTimeZoneId();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendTimeZoneId()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneId()}
     */
    @Test
    public void testAppendTimeZoneId() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneId();
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TimeZoneId timeZoneId = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        iElementPairs.add(timeZoneId);
        iElementPairs.add(timeZoneId);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendDayOfWeek
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendDayOfWeek(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendDayOfWeek(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendDayOfWeekThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendDayOfWeek(-2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendMonthOfYear
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendMonthOfYear(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendMonthOfYear(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendMonthOfYearThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendMonthOfYear(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendEraText
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendEraText()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendEraText()}
     */
    @Test
    public void testAppendEraText() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendEraText();
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TextField textField = ((DateTimeFormatterBuilder.TextField) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        HashMap cParseCache = new HashMap();
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "cParseCache", cParseCache);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 1);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName = "eras";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        String iName1 = "era";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName1);
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iFieldType", iFieldType);
        iElementPairs.add(textField);
        iElementPairs.add(textField);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTwoDigitYear
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendTwoDigitYear(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTwoDigitYear(int)}
     */
    @Test
    public void testAppendTwoDigitYearWithCornerCase() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTwoDigitYear(Integer.MIN_VALUE);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TwoDigitYear twoDigitYear = ((DateTimeFormatterBuilder.TwoDigitYear) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName = "years";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        String iName1 = "year";
        setField(iType, "org.joda.time.DateTimeFieldType", "iName", iName1);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iType", iType);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iPivot", Integer.MIN_VALUE);
        iElementPairs.add(twoDigitYear);
        iElementPairs.add(twoDigitYear);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTwoDigitYear
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendTwoDigitYear(int, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTwoDigitYear(int,boolean)}
     */
    @Test
    public void testAppendTwoDigitYear() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTwoDigitYear(1, true);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TwoDigitYear twoDigitYear = ((DateTimeFormatterBuilder.TwoDigitYear) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName = "years";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        String iName1 = "year";
        setField(iType, "org.joda.time.DateTimeFieldType", "iName", iName1);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iType", iType);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iPivot", 1);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iLenientParse", true);
        iElementPairs.add(twoDigitYear);
        iElementPairs.add(twoDigitYear);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendCenturyOfEra
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendCenturyOfEra(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendCenturyOfEra(int,int)}
     */
    @Test
    public void testAppendCenturyOfEra() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendCenturyOfEra(16385, -1);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.PaddedNumber paddedNumber = ((DateTimeFormatterBuilder.PaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 16385);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName = "centuries";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName1 = "eras";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "centuryOfEra";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 16385);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iSigned", true);
        iElementPairs.add(paddedNumber);
        iElementPairs.add(paddedNumber);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendYear
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendYear(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendYear(int,int)}
     */
    @Test
    public void testAppendYear() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendYear(16385, -1);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.PaddedNumber paddedNumber = ((DateTimeFormatterBuilder.PaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 16385);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName = "years";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        String iName1 = "year";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName1);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 16385);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iSigned", true);
        iElementPairs.add(paddedNumber);
        iElementPairs.add(paddedNumber);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendWeekyear
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendWeekyear(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendWeekyear(int,int)}
     */
    @Test
    public void testAppendWeekyear() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendWeekyear(16385, -1);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.PaddedNumber paddedNumber = ((DateTimeFormatterBuilder.PaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 16385);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
        String iName = "weekyears";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        String iName1 = "weekyear";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName1);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 16385);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iSigned", true);
        iElementPairs.add(paddedNumber);
        iElementPairs.add(paddedNumber);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendYearOfEra
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendYearOfEra(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendYearOfEra(int,int)}
     */
    @Test
    public void testAppendYearOfEra() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendYearOfEra(16385, -1);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.PaddedNumber paddedNumber = ((DateTimeFormatterBuilder.PaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 16385);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName = "years";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName1 = "eras";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "yearOfEra";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 16385);
        iElementPairs.add(paddedNumber);
        iElementPairs.add(paddedNumber);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendTimeZoneName()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneName()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.returnsFrom {@code return append0(new TimeZoneName(TimeZoneName.LONG_NAME, null), null);}
 *  */
    @Test
    public void testAppendTimeZoneName_DateTimeFormatterBuilderAppend0() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneName();
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendTimeZoneName()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneName()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new TimeZoneName(TimeZoneName.LONG_NAME, null), null);
 *  */
    @Test
    public void testAppendTimeZoneName_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneName] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneName(DateTimeFormatterBuilder.java:980) */
        dateTimeFormatterBuilder.appendTimeZoneName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendTimeZoneName(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneName(java.util.Map)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.returnsFrom {@code return append0(pp, pp);}
 *  */
    @Test
    public void testAppendTimeZoneName_DateTimeFormatterBuilderAppend01() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneName(null);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendTimeZoneName(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneName(java.util.Map)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(pp, pp);
 *  */
    @Test
    public void testAppendTimeZoneName_ThrowNullPointerException1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneName] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneName(DateTimeFormatterBuilder.java:994) */
        dateTimeFormatterBuilder.appendTimeZoneName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.printUnknownString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printUnknownString(java.io.Writer, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#printUnknownString(java.io.Writer,int)}
 *  */
    @Test
    public void testPrintUnknownString() throws IOException  {
        DateTimeFormatterBuilder.printUnknownString(null, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printUnknownString(java.io.Writer, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#printUnknownString(java.io.Writer,int)}
 * @utbot.iterates iterate the loop {@code for(int i = len; --i >= 0; )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write('\ufffd');
 *  */
    @Test
    public void testPrintUnknownString_ThrowNullPointerException() throws IOException  {
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.printUnknownString] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(DateTimeFormatterBuilder.java:1158) */
        DateTimeFormatterBuilder.printUnknownString(null, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#printUnknownString(java.io.Writer,int)}
 * @utbot.iterates iterate the loop {@code for(int i = len; --i >= 0; )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPrintUnknownString_ThrowNullPointerException_1() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.printUnknownString] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(DateTimeFormatterBuilder.java:1158) */
        DateTimeFormatterBuilder.printUnknownString(printWriter, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method printUnknownString(java.io.Writer, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#printUnknownString(java.io.Writer,int)}
 * @utbot.iterates iterate the loop {@code for(int i = len; --i >= 0; )} once
 * @utbot.throwsException {@link java.io.IOException} in: out.write('\ufffd');
 *  */
    @Test(expected = IOException.class)
    public void testPrintUnknownString_ThrowIOException() throws Exception  {
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        
        DateTimeFormatterBuilder.printUnknownString(fileWriter, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendHourOfHalfday
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendHourOfHalfday(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendHourOfHalfday(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendHourOfHalfdayThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendHourOfHalfday(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendMonthOfYearShortText
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendMonthOfYearShortText()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendMonthOfYearShortText()}
     */
    @Test
    public void testAppendMonthOfYearShortText() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendMonthOfYearShortText();
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TextField textField = ((DateTimeFormatterBuilder.TextField) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        HashMap cParseCache = new HashMap();
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "cParseCache", cParseCache);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName = "months";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "monthOfYear";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iFieldType", iFieldType);
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iShort", true);
        iElementPairs.add(textField);
        iElementPairs.add(textField);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendClockhourOfHalfday
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendClockhourOfHalfday(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendClockhourOfHalfday(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendClockhourOfHalfdayThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendClockhourOfHalfday(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendTimeZoneOffset(java.lang.String, java.lang.String, boolean, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneOffset(java.lang.String,java.lang.String,boolean,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return append0(new TimeZoneOffset(zeroOffsetPrintText, zeroOffsetParseText, showSeparators, minFields, maxFields));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendTimeZoneOffset_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendTimeZoneOffset(null, null, false, 0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneOffset(java.lang.String,java.lang.String,boolean,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return append0(new TimeZoneOffset(zeroOffsetPrintText, zeroOffsetParseText, showSeparators, minFields, maxFields));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendTimeZoneOffset_ThrowIllegalArgumentException_1() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendTimeZoneOffset(null, null, false, 1, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendTimeZoneOffset(java.lang.String, java.lang.String, boolean, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneOffset(java.lang.String,java.lang.String,boolean,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new TimeZoneOffset(zeroOffsetPrintText, zeroOffsetParseText, showSeparators, minFields, maxFields));
 *  */
    @Test
    public void testAppendTimeZoneOffset_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset(DateTimeFormatterBuilder.java:1080) */
        dateTimeFormatterBuilder.appendTimeZoneOffset(null, null, false, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneOffset(java.lang.String,java.lang.String,boolean,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new TimeZoneOffset(zeroOffsetPrintText, zeroOffsetParseText, showSeparators, minFields, maxFields));
 *  */
    @Test
    public void testAppendTimeZoneOffset_ThrowNullPointerException_1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset(DateTimeFormatterBuilder.java:1080) */
        dateTimeFormatterBuilder.appendTimeZoneOffset(null, null, false, 5, 5);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendTimeZoneOffset(java.lang.String, java.lang.String, boolean, int, int)
    
    @Test
    public void testAppendTimeZoneOffset1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneOffset(null, null, false, 5, 1073741824);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendTimeZoneOffset2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneOffset(null, null, false, 1, 1);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendTimeZoneOffset(java.lang.String, boolean, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneOffset(java.lang.String,boolean,int,int)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.returnsFrom {@code return append0(new TimeZoneOffset(zeroOffsetText, zeroOffsetText, showSeparators, minFields, maxFields));}
 *  */
    @Test
    public void testAppendTimeZoneOffset_DateTimeFormatterBuilderAppend0() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneOffset(null, false, 1, 1);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendTimeZoneOffset(java.lang.String, boolean, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneOffset(java.lang.String,boolean,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return append0(new TimeZoneOffset(zeroOffsetText, zeroOffsetText, showSeparators, minFields, maxFields));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendTimeZoneOffset_ThrowIllegalArgumentException1() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendTimeZoneOffset(null, false, 0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneOffset(java.lang.String,boolean,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return append0(new TimeZoneOffset(zeroOffsetText, zeroOffsetText, showSeparators, minFields, maxFields));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendTimeZoneOffset_ThrowIllegalArgumentException_11() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendTimeZoneOffset(null, false, 1, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendTimeZoneOffset(java.lang.String, boolean, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneOffset(java.lang.String,boolean,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new TimeZoneOffset(zeroOffsetText, zeroOffsetText, showSeparators, minFields, maxFields));
 *  */
    @Test
    public void testAppendTimeZoneOffset_ThrowNullPointerException1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset(DateTimeFormatterBuilder.java:1053) */
        dateTimeFormatterBuilder.appendTimeZoneOffset(null, false, 1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneOffset(java.lang.String,boolean,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new TimeZoneOffset(zeroOffsetText, zeroOffsetText, showSeparators, minFields, maxFields));
 *  */
    @Test
    public void testAppendTimeZoneOffset_ThrowNullPointerException_11() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneOffset(DateTimeFormatterBuilder.java:1053) */
        dateTimeFormatterBuilder.appendTimeZoneOffset(null, false, 21, 21);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendTimeZoneOffset(java.lang.String, boolean, int, int)
    
    @Test
    public void testAppendTimeZoneOffset3() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneOffset(null, false, 5, 1073741824);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendFractionOfSecond
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendFractionOfSecond(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFractionOfSecond(int,int)}
     */
    @Test
    public void testAppendFractionOfSecond() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendFractionOfSecond(16385, -1);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.Fraction fraction = ((DateTimeFormatterBuilder.Fraction) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName1 = "days";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfDay";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(fraction, "org.joda.time.format.DateTimeFormatterBuilder$Fraction", "iFieldType", iFieldType);
        fraction.iMinDigits = 16385;
        fraction.iMaxDigits = 18;
        iElementPairs.add(fraction);
        iElementPairs.add(fraction);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendUnknownString(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendUnknownString(java.lang.StringBuffer,int)}
 *  */
    @Test
    public void testAppendUnknownString() {
        DateTimeFormatterBuilder.appendUnknownString(null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendUnknownString(java.lang.StringBuffer,int)}
 * @utbot.iterates iterate the loop {@code for(int i = len; --i >= 0; )} once
 *  */
    @Test
    public void testAppendUnknownString_StringBufferAppend() {
        StringBuffer stringBuffer = new StringBuffer("");
        
        DateTimeFormatterBuilder.appendUnknownString(stringBuffer, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendUnknownString(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendUnknownString(java.lang.StringBuffer,int)}
 * @utbot.iterates iterate the loop {@code for(int i = len; --i >= 0; )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf.append('\ufffd');
 *  */
    @Test
    public void testAppendUnknownString_ThrowNullPointerException() {
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(DateTimeFormatterBuilder.java:1152) */
        DateTimeFormatterBuilder.appendUnknownString(null, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendFractionOfHour
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendFractionOfHour(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFractionOfHour(int,int)}
     */
    @Test
    public void testAppendFractionOfHour() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendFractionOfHour(16385, -1);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.Fraction fraction = ((DateTimeFormatterBuilder.Fraction) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName = "hours";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName1 = "days";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "hourOfDay";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(fraction, "org.joda.time.format.DateTimeFormatterBuilder$Fraction", "iFieldType", iFieldType);
        fraction.iMinDigits = 16385;
        fraction.iMaxDigits = 18;
        iElementPairs.add(fraction);
        iElementPairs.add(fraction);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendSecondOfMinute
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSecondOfMinute(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendSecondOfMinute(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSecondOfMinuteThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendSecondOfMinute(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendFixedSignedDecimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendFixedSignedDecimal(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFixedSignedDecimal(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (numDigits <= 0): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.returnsFrom {@code return append0(new FixedNumber(fieldType, numDigits, true));}
 *  */
    @Test
    public void testAppendFixedSignedDecimal_NumDigitsGreaterThanZero() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFixedSignedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFixedSignedDecimal", standardDateTimeFieldTypeType, intType);
        appendFixedSignedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendFixedSignedDecimalMethodArguments = new java.lang.Object[2];
        appendFixedSignedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendFixedSignedDecimalMethodArguments[1] = 1;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendFixedSignedDecimalMethod.invoke(dateTimeFormatterBuilder, appendFixedSignedDecimalMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendFixedSignedDecimal(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFixedSignedDecimal(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (numDigits <= 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: numDigits <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedSignedDecimal_ThrowIllegalArgumentException_1() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFixedSignedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFixedSignedDecimal", standardDateTimeFieldTypeType, intType);
        appendFixedSignedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendFixedSignedDecimalMethodArguments = new java.lang.Object[2];
        appendFixedSignedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendFixedSignedDecimalMethodArguments[1] = 0;
        try {
            appendFixedSignedDecimalMethod.invoke(dateTimeFormatterBuilder, appendFixedSignedDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFixedSignedDecimal(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fieldType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendFixedSignedDecimal_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendFixedSignedDecimal(null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendFixedSignedDecimal(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFixedSignedDecimal(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (numDigits <= 0): False}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new FixedNumber(fieldType, numDigits, true));
 *  */
    @Test
    public void testAppendFixedSignedDecimal_ThrowNullPointerException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendFixedSignedDecimal] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendFixedSignedDecimal(DateTimeFormatterBuilder.java:484) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendFixedSignedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendFixedSignedDecimal", standardDateTimeFieldTypeType, intType);
        appendFixedSignedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendFixedSignedDecimalMethodArguments = new java.lang.Object[2];
        appendFixedSignedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendFixedSignedDecimalMethodArguments[1] = 1;
        try {
            appendFixedSignedDecimalMethod.invoke(dateTimeFormatterBuilder, appendFixedSignedDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendDayOfWeekShortText
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendDayOfWeekShortText()
    
    @Test
    public void testAppendDayOfWeekShortText1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendDayOfWeekShortText();
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TextField textField = ((DateTimeFormatterBuilder.TextField) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        HashMap cParseCache = new HashMap();
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "cParseCache", cParseCache);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName = "days";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName1 = "weeks";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "dayOfWeek";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iFieldType", iFieldType);
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iShort", true);
        iElementPairs.add(textField);
        iElementPairs.add(textField);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendWeekOfWeekyear
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendWeekOfWeekyear(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendWeekOfWeekyear(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendWeekOfWeekyearThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendWeekOfWeekyear(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendSignedDecimal
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSignedDecimal(org.joda.time.DateTimeFieldType, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendSignedDecimal(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (maxDigits < minDigits): True}
 * @utbot.executesCondition {@code (minDigits < 0): False}
 * @utbot.executesCondition {@code (maxDigits <= 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: minDigits < 0 || maxDigits <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_ThrowIllegalArgumentException_1() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendSignedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendSignedDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendSignedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendSignedDecimalMethodArguments = new java.lang.Object[3];
        appendSignedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendSignedDecimalMethodArguments[1] = 0;
        appendSignedDecimalMethodArguments[2] = -1;
        try {
            appendSignedDecimalMethod.invoke(dateTimeFormatterBuilder, appendSignedDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendSignedDecimal(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (maxDigits < minDigits): False}
 * @utbot.executesCondition {@code (minDigits < 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: minDigits < 0 || maxDigits <= 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_ThrowIllegalArgumentException_2() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendSignedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendSignedDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendSignedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendSignedDecimalMethodArguments = new java.lang.Object[3];
        appendSignedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendSignedDecimalMethodArguments[1] = -1;
        appendSignedDecimalMethodArguments[2] = -1;
        try {
            appendSignedDecimalMethod.invoke(dateTimeFormatterBuilder, appendSignedDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendSignedDecimal(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fieldType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSignedDecimal_ThrowIllegalArgumentException() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendSignedDecimal(null, -255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSignedDecimal(org.joda.time.DateTimeFieldType, int, int)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendSignedDecimal(org.joda.time.DateTimeFieldType,int,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.executesCondition {@code (maxDigits < minDigits): True}
 * @utbot.executesCondition {@code (minDigits < 0): False}
 * @utbot.executesCondition {@code (maxDigits <= 0): False}
 * @utbot.executesCondition {@code (minDigits <= 1): True}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(java.lang.Object)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new UnpaddedNumber(fieldType, maxDigits, true));
 *  */
    @Test
    public void testAppendSignedDecimal_ThrowNullPointerException() throws Throwable  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendSignedDecimal] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:338)
            org.joda.time.format.DateTimeFormatterBuilder.appendSignedDecimal(DateTimeFormatterBuilder.java:458) */
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendSignedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendSignedDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendSignedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendSignedDecimalMethodArguments = new java.lang.Object[3];
        appendSignedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendSignedDecimalMethodArguments[1] = 1;
        appendSignedDecimalMethodArguments[2] = 0;
        try {
            appendSignedDecimalMethod.invoke(dateTimeFormatterBuilder, appendSignedDecimalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSignedDecimal(org.joda.time.DateTimeFieldType, int, int)
    
    @Test
    public void testAppendSignedDecimal1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendSignedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendSignedDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendSignedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendSignedDecimalMethodArguments = new java.lang.Object[3];
        appendSignedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendSignedDecimalMethodArguments[1] = 2;
        appendSignedDecimalMethodArguments[2] = 0;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendSignedDecimalMethod.invoke(dateTimeFormatterBuilder, appendSignedDecimalMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    
    @Test
    public void testAppendSignedDecimal2() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class dateTimeFormatterBuilderClazz = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method appendSignedDecimalMethod = dateTimeFormatterBuilderClazz.getDeclaredMethod("appendSignedDecimal", standardDateTimeFieldTypeType, intType, intType);
        appendSignedDecimalMethod.setAccessible(true);
        java.lang.Object[] appendSignedDecimalMethodArguments = new java.lang.Object[3];
        appendSignedDecimalMethodArguments[0] = standardDateTimeFieldType;
        appendSignedDecimalMethodArguments[1] = 0;
        appendSignedDecimalMethodArguments[2] = 1;
        DateTimeFormatterBuilder actual = ((DateTimeFormatterBuilder) appendSignedDecimalMethod.invoke(dateTimeFormatterBuilder, appendSignedDecimalMethodArguments));
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendYearOfCentury
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendYearOfCentury(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendYearOfCentury(int,int)}
     */
    @Test
    public void testAppendYearOfCentury() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendYearOfCentury(16385, -1);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.PaddedNumber paddedNumber = ((DateTimeFormatterBuilder.PaddedNumber) createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 16385);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName = "years";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName1 = "centuries";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "yearOfCentury";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(paddedNumber, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iMaxParsedDigits", 16385);
        iElementPairs.add(paddedNumber);
        iElementPairs.add(paddedNumber);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneShortName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendTimeZoneShortName(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneShortName(java.util.Map)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.returnsFrom {@code return append0(pp, pp);}
 *  */
    @Test
    public void testAppendTimeZoneShortName_DateTimeFormatterBuilderAppend0() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneShortName(null);
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendTimeZoneShortName(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneShortName(java.util.Map)}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(pp, pp);
 *  */
    @Test
    public void testAppendTimeZoneShortName_ThrowNullPointerException() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneShortName] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneShortName(DateTimeFormatterBuilder.java:1020) */
        dateTimeFormatterBuilder.appendTimeZoneShortName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneShortName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendTimeZoneShortName()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneShortName()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.returnsFrom {@code return append0(new TimeZoneName(TimeZoneName.SHORT_NAME, null), null);}
 *  */
    @Test
    public void testAppendTimeZoneShortName_DateTimeFormatterBuilderAppend01() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        Object iFormatter = createInstance("java.lang.Object");
        setField(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter", iFormatter);
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTimeZoneShortName();
        
        ArrayList dateTimeFormatterBuilderIElementPairs = ((ArrayList) getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(dateTimeFormatterBuilderIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
        Object finalDateTimeFormatterBuilderIFormatter = getFieldValue(dateTimeFormatterBuilder, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        
        assertNull(finalDateTimeFormatterBuilderIFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendTimeZoneShortName()
    
    /**
    @utbot.classUnderTest {@link DateTimeFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTimeZoneShortName()}
 * @utbot.invokes org.joda.time.format.DateTimeFormatterBuilder#append0(org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append0(new TimeZoneName(TimeZoneName.SHORT_NAME, null), null);
 *  */
    @Test
    public void testAppendTimeZoneShortName_ThrowNullPointerException1() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneShortName] produces [java.lang.NullPointerException]
            org.joda.time.format.DateTimeFormatterBuilder.append0(DateTimeFormatterBuilder.java:346)
            org.joda.time.format.DateTimeFormatterBuilder.appendTimeZoneShortName(DateTimeFormatterBuilder.java:1005) */
        dateTimeFormatterBuilder.appendTimeZoneShortName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendMillisOfSecond
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendMillisOfSecond(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendMillisOfSecond(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendMillisOfSecondThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendMillisOfSecond(-2147483645);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendFractionOfMinute
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendFractionOfMinute(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFractionOfMinute(int,int)}
     */
    @Test
    public void testAppendFractionOfMinute() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendFractionOfMinute(16385, -1);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.Fraction fraction = ((DateTimeFormatterBuilder.Fraction) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName = "minutes";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName1 = "days";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "minuteOfDay";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(fraction, "org.joda.time.format.DateTimeFormatterBuilder$Fraction", "iFieldType", iFieldType);
        fraction.iMinDigits = 16385;
        fraction.iMaxDigits = 18;
        iElementPairs.add(fraction);
        iElementPairs.add(fraction);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendFractionOfDay
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendFractionOfDay(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendFractionOfDay(int,int)}
     */
    @Test
    public void testAppendFractionOfDay() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendFractionOfDay(16385, -1);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.Fraction fraction = ((DateTimeFormatterBuilder.Fraction) createInstance("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName = "days";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "dayOfYear";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(fraction, "org.joda.time.format.DateTimeFormatterBuilder$Fraction", "iFieldType", iFieldType);
        fraction.iMinDigits = 16385;
        fraction.iMaxDigits = 18;
        iElementPairs.add(fraction);
        iElementPairs.add(fraction);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendClockhourOfDay
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendClockhourOfDay(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendClockhourOfDay(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendClockhourOfDayThrowsIAE() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        dateTimeFormatterBuilder.appendClockhourOfDay(-2147483646);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendHalfdayOfDayText
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendHalfdayOfDayText()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendHalfdayOfDayText()}
     */
    @Test
    public void testAppendHalfdayOfDayText() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendHalfdayOfDayText();
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TextField textField = ((DateTimeFormatterBuilder.TextField) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        HashMap cParseCache = new HashMap();
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "cParseCache", cParseCache);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName = "halfdays";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName1 = "days";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "halfdayOfDay";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iFieldType", iFieldType);
        iElementPairs.add(textField);
        iElementPairs.add(textField);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendMonthOfYearText
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendMonthOfYearText()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendMonthOfYearText()}
     */
    @Test
    public void testAppendMonthOfYearText() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendMonthOfYearText();
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TextField textField = ((DateTimeFormatterBuilder.TextField) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        HashMap cParseCache = new HashMap();
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "cParseCache", cParseCache);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName = "months";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName1 = "years";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "monthOfYear";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iFieldType", iFieldType);
        iElementPairs.add(textField);
        iElementPairs.add(textField);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTwoDigitWeekyear
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendTwoDigitWeekyear(int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTwoDigitWeekyear(int)}
     */
    @Test
    public void testAppendTwoDigitWeekyearWithCornerCase() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTwoDigitWeekyear(Integer.MIN_VALUE);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TwoDigitYear twoDigitYear = ((DateTimeFormatterBuilder.TwoDigitYear) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
        String iName = "weekyears";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        String iName1 = "weekyear";
        setField(iType, "org.joda.time.DateTimeFieldType", "iName", iName1);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iType", iType);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iPivot", Integer.MIN_VALUE);
        iElementPairs.add(twoDigitYear);
        iElementPairs.add(twoDigitYear);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendTwoDigitWeekyear
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendTwoDigitWeekyear(int, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendTwoDigitWeekyear(int,boolean)}
     */
    @Test
    public void testAppendTwoDigitWeekyear() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendTwoDigitWeekyear(1, true);
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TwoDigitYear twoDigitYear = ((DateTimeFormatterBuilder.TwoDigitYear) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
        String iName = "weekyears";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        String iName1 = "weekyear";
        setField(iType, "org.joda.time.DateTimeFieldType", "iName", iName1);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iType", iType);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iPivot", 1);
        setField(twoDigitYear, "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", "iLenientParse", true);
        iElementPairs.add(twoDigitYear);
        iElementPairs.add(twoDigitYear);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.DateTimeFormatterBuilder.appendDayOfWeekText
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method appendDayOfWeekText()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.DateTimeFormatterBuilder#appendDayOfWeekText()}
     */
    @Test
    public void testAppendDayOfWeekText() throws Exception  {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        
        DateTimeFormatterBuilder actual = dateTimeFormatterBuilder.appendDayOfWeekText();
        
        DateTimeFormatterBuilder expected = ((DateTimeFormatterBuilder) createInstance("org.joda.time.format.DateTimeFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        DateTimeFormatterBuilder.TextField textField = ((DateTimeFormatterBuilder.TextField) createInstance("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        HashMap cParseCache = new HashMap();
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "cParseCache", cParseCache);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName = "days";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName1 = "weeks";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(iFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "dayOfWeek";
        setField(iFieldType, "org.joda.time.DateTimeFieldType", "iName", iName2);
        setField(textField, "org.joda.time.format.DateTimeFormatterBuilder$TextField", "iFieldType", iFieldType);
        iElementPairs.add(textField);
        iElementPairs.add(textField);
        setField(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs", iElementPairs);
        
        ArrayList expectedIElementPairs = ((ArrayList) getFieldValue(expected, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        ArrayList actualIElementPairs = ((ArrayList) getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(expectedIElementPairs, actualIElementPairs));
        
        Object actualIFormatter = getFieldValue(actual, "org.joda.time.format.DateTimeFormatterBuilder", "iFormatter");
        assertNull(actualIFormatter);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1055149662706299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1055149662706299.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1055149662719799 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1055149662706299.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1055149662719799).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1055149663192000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1055149663192000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1055149663194800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1055149663192000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1055149663194800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1055149668280200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1055149668280200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1055149668284700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1055149668280200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1055149668284700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

