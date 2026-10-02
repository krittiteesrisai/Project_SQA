package org.joda.time;

import org.junit.Test;
import org.joda.time.format.DateTimeFormatter;
import java.util.Locale;
import java.lang.reflect.InvocationTargetException;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import java.util.HashMap;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.Partial.Property;
import java.lang.reflect.Method;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.field.StrictDateTimeField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.base.AbstractPeriod;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.chrono.GJChronology;
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

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public final class org_joda_time_PartialTest {
    ///region Test suites for executable org.joda.time.Partial.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString()}
 * @utbot.executesCondition {@code (f1 == null): False}
 * @utbot.returnsFrom {@code return f1.print(this);}
 *  */
    @Test
    public void testToString_F1NotEqualsNull() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {null};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        
        assertNull(finalPartialITypes0);
        
        assertNull(finalPartialIFormatter0);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString()}
 * @utbot.executesCondition {@code (f1 == null): False}
 * @utbot.returnsFrom {@code return f1.print(this);}
 *  */
    @Test
    public void testToString_F1NotEqualsNull_1() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 1);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString();
        
        String expected = "\uFFFD";
        
        assertEquals(expected, actual);
        
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        
        assertNull(finalPartialIFormatter0);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString()}
 * @utbot.executesCondition {@code (f1 == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toStringList()}
 * @utbot.returnsFrom {@code return toStringList();}
 *  */
    @Test
    public void testToString_F1EqualsNull() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = {null, null};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString();
        
        String expected = "[]";
        
        assertEquals(expected, actual);
        
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter1 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter1 = ((DateTimeFormatter) get(partialIFormatter1, 1));
        
        assertNull(finalPartialIFormatter0);
        
        assertNull(finalPartialIFormatter1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString()}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: DateTimeFormatter f1 = f[1];
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {null};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.Partial.toString(Partial.java:748) */
        partial.toString();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString()}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.executesCondition {@code (f1 == null): False}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormatter#print(org.joda.time.ReadablePartial)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return f1.print(this);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToString_ThrowUnsupportedOperationException() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        partial.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString(java.lang.String, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String,java.util.Locale)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.returnsFrom {@code return toString();}
 *  */
    @Test
    public void testToString_PatternEqualsNull() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString(null, null);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        
        assertNull(finalPartialIFormatter0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString(java.lang.String, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String,java.util.Locale)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return toString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToString_ThrowUnsupportedOperationException1() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        partial.toString(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String,java.util.Locale)}
 * @utbot.executesCondition {@code (pattern == null): False}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormat#forPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToString_ThrowIllegalArgumentException() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        String string = "";
        
        partial.toString(string, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString(java.lang.String, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String,java.util.Locale)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return toString();
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.joda.time.Partial.toString(Partial.java:748)
            org.joda.time.Partial.toString(Partial.java:804) */
        partial.toString(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString(java.lang.String, java.util.Locale)
    
    @Test
    public void testToString1() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {null, null, null, null, null, null, null, null, null};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        String actual = partial.toString(null, locale);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes1 = ((DateTimeFieldType) get(partialITypes1, 1));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes2, 2));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes3, 3));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes4, 4));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes5, 5));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes6, 6));
        org.joda.time.DateTimeFieldType[] partialITypes7 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes7, 7));
        org.joda.time.DateTimeFieldType[] partialITypes8 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes8, 8));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter1 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter2 = ((DateTimeFormatter) get(partialIFormatter1, 2));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter2 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter3 = ((DateTimeFormatter) get(partialIFormatter2, 3));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter3 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter4 = ((DateTimeFormatter) get(partialIFormatter3, 4));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter4 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter5 = ((DateTimeFormatter) get(partialIFormatter4, 5));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter5 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter6 = ((DateTimeFormatter) get(partialIFormatter5, 6));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter6 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter7 = ((DateTimeFormatter) get(partialIFormatter6, 7));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter7 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter8 = ((DateTimeFormatter) get(partialIFormatter7, 8));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter8 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter9 = ((DateTimeFormatter) get(partialIFormatter8, 9));
        
        assertNull(finalPartialITypes0);
        
        assertNull(finalPartialITypes1);
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
        
        assertNull(finalPartialIFormatter0);
        
        assertNull(finalPartialIFormatter2);
        
        assertNull(finalPartialIFormatter3);
        
        assertNull(finalPartialIFormatter4);
        
        assertNull(finalPartialIFormatter5);
        
        assertNull(finalPartialIFormatter6);
        
        assertNull(finalPartialIFormatter7);
        
        assertNull(finalPartialIFormatter8);
        
        assertNull(finalPartialIFormatter9);
    }
    
    @Test
    public void testToString2() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {null};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 1);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        String actual = partial.toString(null, locale);
        
        String expected = "\uFFFD";
        
        assertEquals(expected, actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter1 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter2 = ((DateTimeFormatter) get(partialIFormatter1, 2));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter2 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter3 = ((DateTimeFormatter) get(partialIFormatter2, 3));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter3 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter4 = ((DateTimeFormatter) get(partialIFormatter3, 4));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter4 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter5 = ((DateTimeFormatter) get(partialIFormatter4, 5));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter5 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter6 = ((DateTimeFormatter) get(partialIFormatter5, 6));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter6 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter7 = ((DateTimeFormatter) get(partialIFormatter6, 7));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter7 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter8 = ((DateTimeFormatter) get(partialIFormatter7, 8));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter8 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter9 = ((DateTimeFormatter) get(partialIFormatter8, 9));
        
        assertNull(finalPartialITypes0);
        
        assertNull(finalPartialIFormatter0);
        
        assertNull(finalPartialIFormatter2);
        
        assertNull(finalPartialIFormatter3);
        
        assertNull(finalPartialIFormatter4);
        
        assertNull(finalPartialIFormatter5);
        
        assertNull(finalPartialIFormatter6);
        
        assertNull(finalPartialIFormatter7);
        
        assertNull(finalPartialIFormatter8);
        
        assertNull(finalPartialIFormatter9);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString(java.lang.String, java.util.Locale)
    
    @Test
    public void testToString3() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormat$StyleFormatter");
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.size(Partial.java:311)
            org.joda.time.base.AbstractPartial.indexOf(AbstractPartial.java:170)
            org.joda.time.base.AbstractPartial.isSupported(AbstractPartial.java:160)
            org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber.printTo(DateTimeFormatterBuilder.java:1431)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.printTo(DateTimeFormatterBuilder.java:2708)
            org.joda.time.format.DateTimeFormat$StyleFormatter.printTo(DateTimeFormat.java:830)
            org.joda.time.format.DateTimeFormatter.printTo(DateTimeFormatter.java:547)
            org.joda.time.format.DateTimeFormatter.print(DateTimeFormatter.java:623)
            org.joda.time.Partial.toString(Partial.java:752)
            org.joda.time.Partial.toString(Partial.java:804) */
        partial.toString(null, null);
    }
    
    @Test
    public void testToString4() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null, null, null, null, null, null, null, null, null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:772)
            org.joda.time.Partial.toString(Partial.java:750)
            org.joda.time.Partial.toString(Partial.java:804) */
        partial.toString(null, null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method toString(java.lang.String, java.util.Locale)
    
    @Test(timeout = 1000L)
    public void testToString5() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {null, null};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[18];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", Integer.MIN_VALUE);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        partial.toString(null, locale);
    }
    
    @Test(timeout = 1000L)
    public void testToString6() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[18];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", Integer.MIN_VALUE);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        partial.toString(null, locale);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return toString();
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.joda.time.Partial.toString(Partial.java:748)
            org.joda.time.Partial.toString(Partial.java:789) */
        partial.toString(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return toString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToString_ThrowUnsupportedOperationException2() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        partial.toString(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String)}
 * @utbot.executesCondition {@code (pattern == null): False}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormat#forPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return DateTimeFormat.forPattern(pattern).print(this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToString_ThrowIllegalArgumentException1() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        String string = "";
        
        partial.toString(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString(java.lang.String)
    
    @Test
    public void testToString7() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {null};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 2048);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString(((String) null));
        
        String expected = "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD";
        
        assertEquals(expected, actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter1 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter2 = ((DateTimeFormatter) get(partialIFormatter1, 2));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter2 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter3 = ((DateTimeFormatter) get(partialIFormatter2, 3));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter3 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter4 = ((DateTimeFormatter) get(partialIFormatter3, 4));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter4 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter5 = ((DateTimeFormatter) get(partialIFormatter4, 5));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter5 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter6 = ((DateTimeFormatter) get(partialIFormatter5, 6));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter6 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter7 = ((DateTimeFormatter) get(partialIFormatter6, 7));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter7 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter8 = ((DateTimeFormatter) get(partialIFormatter7, 8));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter8 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter9 = ((DateTimeFormatter) get(partialIFormatter8, 9));
        
        assertNull(finalPartialITypes0);
        
        assertNull(finalPartialIFormatter0);
        
        assertNull(finalPartialIFormatter2);
        
        assertNull(finalPartialIFormatter3);
        
        assertNull(finalPartialIFormatter4);
        
        assertNull(finalPartialIFormatter5);
        
        assertNull(finalPartialIFormatter6);
        
        assertNull(finalPartialIFormatter7);
        
        assertNull(finalPartialIFormatter8);
        
        assertNull(finalPartialIFormatter9);
    }
    
    @Test
    public void testToString8() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = new org.joda.time.DateTimeFieldType[10];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        iTypes[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", standardDateTimeFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes1, 2));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes2, 3));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes3, 4));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes4, 5));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes5, 6));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes6, 7));
        org.joda.time.DateTimeFieldType[] partialITypes7 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes7, 8));
        org.joda.time.DateTimeFieldType[] partialITypes8 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes9 = ((DateTimeFieldType) get(partialITypes8, 9));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter1 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter2 = ((DateTimeFormatter) get(partialIFormatter1, 2));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter2 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter3 = ((DateTimeFormatter) get(partialIFormatter2, 3));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter3 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter4 = ((DateTimeFormatter) get(partialIFormatter3, 4));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter4 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter5 = ((DateTimeFormatter) get(partialIFormatter4, 5));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter5 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter6 = ((DateTimeFormatter) get(partialIFormatter5, 6));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter6 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter7 = ((DateTimeFormatter) get(partialIFormatter6, 7));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter7 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter8 = ((DateTimeFormatter) get(partialIFormatter7, 8));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter8 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter9 = ((DateTimeFormatter) get(partialIFormatter8, 9));
        
        assertNull(finalPartialITypes0);
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
        
        assertNull(finalPartialITypes9);
        
        assertNull(finalPartialIFormatter0);
        
        assertNull(finalPartialIFormatter2);
        
        assertNull(finalPartialIFormatter3);
        
        assertNull(finalPartialIFormatter4);
        
        assertNull(finalPartialIFormatter5);
        
        assertNull(finalPartialIFormatter6);
        
        assertNull(finalPartialIFormatter7);
        
        assertNull(finalPartialIFormatter8);
        
        assertNull(finalPartialIFormatter9);
    }
    
    @Test
    public void testToString9() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        String actual = partial.toString(((String) null));
        
        String expected = "[]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString(java.lang.String)
    
    @Test
    public void testToString10() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        iTypes[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = {null, null, null, null, null, null, null, null, null, null};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:774)
            org.joda.time.Partial.toString(Partial.java:750)
            org.joda.time.Partial.toString(Partial.java:789) */
        partial.toString(((String) null));
    }
    
    @Test
    public void testToString11() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null, null, null, null, null, null, null, null, null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:772)
            org.joda.time.Partial.toString(Partial.java:750)
            org.joda.time.Partial.toString(Partial.java:789) */
        partial.toString(((String) null));
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method toString(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testToString12() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", Integer.MIN_VALUE);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        partial.toString(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValue(int)}
 * @utbot.returnsFrom {@code return iValues[index];}
 *  */
    @Test
    public void testGetValue_ReturnIndexOfIValues() {
        int[] intArray = {-255, -255};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        
        int actual = partial.getValue(1);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return iValues[index];
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException() {
        int[] intArray = {-255};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        
        /* This test fails because method [org.joda.time.Partial.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.joda.time.Partial.getValue(Partial.java:370) */
        partial.getValue(-256);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iValues[index];
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getValue] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getValue(Partial.java:370) */
        partial.getValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#size()}
 * @utbot.returnsFrom {@code return iTypes.length;}
 *  */
    @Test
    public void testSize_ReturnITypesLength() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        int actual = partial.size();
        
        assertEquals(1, actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        
        assertNull(finalPartialITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iTypes.length;
 *  */
    @Test
    public void testSize_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.size] produces [java.lang.NullPointerException]
            org.joda.time.Partial.size(Partial.java:311) */
        partial.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getField(int, org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_2() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_3() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 1);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_4() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_5() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_6() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_7() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_8() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_9() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_10() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_11() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_12() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_13() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 8);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_14() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_15() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_16() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_17() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_18() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_19() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_20() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_21() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_22() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getField(int, org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return iTypes[index].getField(chrono);
 *  */
    @Test
    public void testGetField_ThrowArrayIndexOutOfBoundsException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.joda.time.Partial.getField(Partial.java:335) */
        partial.getField(-256, null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.DateTimeFieldType#getField(org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iTypes[index].getField(chrono);
 *  */
    @Test
    public void testGetField_ThrowNullPointerException_1() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null, null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getField(Partial.java:335) */
        partial.getField(1, null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iTypes[index].getField(chrono);
 *  */
    @Test
    public void testGetField_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getField(Partial.java:335) */
        partial.getField(-255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getField(int, org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.DateTimeFieldType#getField(org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.InternalError} in: return iTypes[index].getField(chrono);
 *  */
    @Test(expected = InternalError.class)
    public void testGetField_ThrowInternalError() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        partial.getField(0, iSOChronology);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getField(int, org.joda.time.Chronology)
    
    @Test
    public void testGetField1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        cCache.put(standardDateTimeFieldType2, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName3 = "eras";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField2() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName3 = "eras";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName4);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName5 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName5);
        cCache.put(standardDateTimeFieldType3, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField3() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName4 = "eras";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName5 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName5);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName6 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName6);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName7 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName7);
        cCache.put(standardDateTimeFieldType4, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField4() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName5 = "eras";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName6 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName6);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName7 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName7);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName8 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName8);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName9 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName9);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName10 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName10);
        cCache.put(standardDateTimeFieldType5, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField5() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName6 = "eras";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName7);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName8 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName8);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName9 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName10 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName10);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName11 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName11);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName12 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName12);
        cCache.put(standardDateTimeFieldType6, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField6() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName7 = "eras";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName8 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName8);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        cCache.put(standardDateTimeFieldType7, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField7() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName7 = "eras";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName8 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName8);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName15 = "hourOfDay";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName15);
        cCache.put(standardDateTimeFieldType8, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField8() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName15 = "weeks";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName15);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName16 = "dayOfWeek";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName16);
        cCache.put(standardDateTimeFieldType8, expected);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName17 = "hourOfDay";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName17);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType9, unsupportedDateTimeField6);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField9() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName15 = "weeks";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName15);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName16 = "dayOfWeek";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName16);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType8, unsupportedDateTimeField6);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName17 = "hourOfHalfday";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName17);
        cCache.put(standardDateTimeFieldType9, expected);
        Object standardDateTimeFieldType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName18 = "hourOfDay";
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType", "iName", iName18);
        UnsupportedDateTimeField unsupportedDateTimeField7 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType10);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType10, unsupportedDateTimeField7);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField10() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName15 = "weeks";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName15);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName16 = "dayOfWeek";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName16);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType8, unsupportedDateTimeField6);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName17 = "hourOfHalfday";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName17);
        UnsupportedDateTimeField unsupportedDateTimeField7 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType9, unsupportedDateTimeField7);
        Object standardDateTimeFieldType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName18 = "hourOfDay";
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType", "iName", iName18);
        UnsupportedDateTimeField unsupportedDateTimeField8 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType10);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType10, unsupportedDateTimeField8);
        Object standardDateTimeFieldType11 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName19 = "yearOfEra";
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType", "iName", iName19);
        cCache.put(standardDateTimeFieldType11, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType11);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField11() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName9 = "halfdayOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName10 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName11 = "millisOfSecond";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName11);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName12 = "weeks";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName12);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName13 = "dayOfWeek";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName14 = "hourOfHalfday";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType1);
        String iName15 = "dayOfYear";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName15);
        cCache.put(standardDateTimeFieldType8, expected);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName16 = "hourOfDay";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName16);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType9, unsupportedDateTimeField6);
        Object standardDateTimeFieldType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName17 = "yearOfEra";
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType", "iName", iName17);
        UnsupportedDateTimeField unsupportedDateTimeField7 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType10);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType10, unsupportedDateTimeField7);
        Object standardDateTimeFieldType11 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName18 = "secondOfDay";
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType", "iName", iName18);
        UnsupportedDateTimeField unsupportedDateTimeField8 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType11);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType11, unsupportedDateTimeField8);
        Object standardDateTimeFieldType12 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName19 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName19);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName20 = "yearOfCentury";
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType", "iName", iName20);
        UnsupportedDateTimeField unsupportedDateTimeField9 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType12);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType12, unsupportedDateTimeField9);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField12() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName9 = "centuries";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName9);
        UnsupportedDurationField unsupportedDurationField6 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField6, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField6, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType6);
        cCache1.put(standardDurationFieldType6, unsupportedDurationField6);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName11 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName11);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName12 = "millisOfSecond";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName13 = "weeks";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName13);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName14 = "dayOfWeek";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName15 = "hourOfHalfday";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName15);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType1);
        String iName16 = "dayOfYear";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName16);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType8, unsupportedDateTimeField6);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName17 = "hourOfDay";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName17);
        UnsupportedDateTimeField unsupportedDateTimeField7 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType9, unsupportedDateTimeField7);
        Object standardDateTimeFieldType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName18 = "yearOfEra";
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType", "iName", iName18);
        UnsupportedDateTimeField unsupportedDateTimeField8 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType10);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType10, unsupportedDateTimeField8);
        Object standardDateTimeFieldType11 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType6);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName19 = "centuryOfEra";
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType", "iName", iName19);
        cCache.put(standardDateTimeFieldType11, expected);
        Object standardDateTimeFieldType12 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName20 = "secondOfDay";
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType", "iName", iName20);
        UnsupportedDateTimeField unsupportedDateTimeField9 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType12);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType12, unsupportedDateTimeField9);
        Object standardDateTimeFieldType13 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType6);
        String iName21 = "yearOfCentury";
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType", "iName", iName21);
        UnsupportedDateTimeField unsupportedDateTimeField10 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField10, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField10, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType13);
        setField(unsupportedDateTimeField10, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType13, unsupportedDateTimeField10);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType11);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField6);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getField(int, org.joda.time.Chronology)
    
    @Test(expected = InternalError.class)
    public void testGetField13() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.getField(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getFieldType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldType(int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldType(int)}
 * @utbot.returnsFrom {@code return iTypes[index];}
 *  */
    @Test
    public void testGetFieldType_ReturnIndexOfITypes() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null, null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        DateTimeFieldType actual = partial.getFieldType(1);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes1 = ((DateTimeFieldType) get(partialITypes1, 1));
        
        assertNull(finalPartialITypes0);
        
        assertNull(finalPartialITypes1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFieldType(int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldType(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return iTypes[index];
 *  */
    @Test
    public void testGetFieldType_ThrowArrayIndexOutOfBoundsException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getFieldType] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.joda.time.Partial.getFieldType(Partial.java:346) */
        partial.getFieldType(-256);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldType(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iTypes[index];
 *  */
    @Test
    public void testGetFieldType_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getFieldType] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getFieldType(Partial.java:346) */
        partial.getFieldType(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getFormatter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFormatter()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFormatter()}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.returnsFrom {@code return f[0];}
 *  */
    @Test
    public void testGetFormatter_FNotEqualsNull() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {null};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        DateTimeFormatter actual = partial.getFormatter();
        
        assertNull(actual);
        
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        
        assertNull(finalPartialIFormatter0);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFormatter()}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.executesCondition {@code (size() == 0): True}
 * @utbot.invokes {@link org.joda.time.Partial#size()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFormatter_SizeEqualsZero() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        DateTimeFormatter actual = partial.getFormatter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFormatter()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFormatter()}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return f[0];
 *  */
    @Test
    public void testGetFormatter_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.getFormatter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.getFormatter(Partial.java:724) */
        partial.getFormatter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.property
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method property(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#property(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.Partial#indexOfSupported(org.joda.time.DateTimeFieldType)}
 * @utbot.returnsFrom {@code return new Property(this, indexOfSupported(type));}
 *  */
    @Test
    public void testProperty_PartialIndexOfSupported() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        Partial.Property actual = partial.property(null);
        
        Partial.Property expected = new Partial.Property(partial, 0);
        
        Partial expectedIPartial = ((Partial) getFieldValue(expected, "org.joda.time.Partial$Property", "iPartial"));
        Partial actualIPartial = ((Partial) getFieldValue(actual, "org.joda.time.Partial$Property", "iPartial"));
        Chronology actualIPartialIChronology = ((Chronology) getFieldValue(actualIPartial, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIPartialIChronology);
        
        org.joda.time.DateTimeFieldType[] expectedIPartialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(expectedIPartial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualIPartialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actualIPartial, "org.joda.time.Partial", "iTypes"));
        int expectedIPartialITypesSize = expectedIPartialITypes.length;
        assertEquals(expectedIPartialITypesSize, actualIPartialITypes.length);
        assertTrue(deepEquals(expectedIPartialITypes, actualIPartialITypes));
        
        int[] actualIPartialIValues = ((int[]) getFieldValue(actualIPartial, "org.joda.time.Partial", "iValues"));
        assertNull(actualIPartialIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIPartialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actualIPartial, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIPartialIFormatter);
        
        int expectedIFieldIndex = ((Integer) getFieldValue(expected, "org.joda.time.Partial$Property", "iFieldIndex"));
        int actualIFieldIndex = ((Integer) getFieldValue(actual, "org.joda.time.Partial$Property", "iFieldIndex"));
        assertEquals(expectedIFieldIndex, actualIFieldIndex);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        
        assertNull(finalPartialITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method property(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#property(org.joda.time.DateTimeFieldType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Property(this, indexOfSupported(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProperty_ThrowIllegalArgumentException_1() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldType1Type = Class.forName("org.joda.time.DateTimeFieldType");
        Method propertyMethod = partialClazz.getDeclaredMethod("property", standardDateTimeFieldType1Type);
        propertyMethod.setAccessible(true);
        java.lang.Object[] propertyMethodArguments = new java.lang.Object[1];
        propertyMethodArguments[0] = standardDateTimeFieldType1;
        try {
            propertyMethod.invoke(partial, propertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#property(org.joda.time.DateTimeFieldType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Property(this, indexOfSupported(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProperty_ThrowIllegalArgumentException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.property(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getChronology
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getChronology()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getChronology()}
 * @utbot.returnsFrom {@code return iChronology;}
 *  */
    @Test
    public void testGetChronology_ReturnIChronology() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        Chronology actual = partial.getChronology();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.with
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method with(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.invokes {@link org.joda.time.Partial#indexOf(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.Partial#getValue(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWith_FieldTypeNotEqualsNull() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-255};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        Partial actual = ((Partial) withMethod.invoke(partial, withMethodArguments));
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] partialIValues = ((int[]) getFieldValue(partial, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int partialIValuesSize = partialIValues.length;
        assertEquals(partialIValuesSize, actualIValues.length);
        assertArrayEquals(partialIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method with(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fieldType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWith_ThrowIllegalArgumentException() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        partial.with(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.invokes {@link org.joda.time.Partial#indexOf(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.DateTimeFieldType#getDurationType()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#getField(org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.InternalError} in: DurationField unitField = fieldType.getDurationType().getField(iChronology);
 *  */
    @Test(expected = InternalError.class)
    public void testWith_ThrowInternalError() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method with(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: value == getValue(index)
 *  */
    @Test
    public void testWith_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.getValue(Partial.java:370)
            org.joda.time.Partial.with(Partial.java:470) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link org.joda.time.Partial#getField(int)}
 * @utbot.invokes {@link org.joda.time.DateTimeField#set(org.joda.time.ReadablePartial,int,int[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWith_ThrowNullPointerException_13() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-199};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -58;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DurationField unitField = fieldType.getDurationType().getField(iChronology);
 *  */
    @Test
    public void testWith_ThrowNullPointerException_12() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(zonedChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:439) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DurationField unitField = fieldType.getDurationType().getField(iChronology);
 *  */
    @Test
    public void testWith_ThrowNullPointerException() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:439) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_1() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_2() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_3() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_4() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_5() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_6() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_7() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_8() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_9() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_10() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_11() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:440) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method with(org.joda.time.DateTimeFieldType, int)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith1() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith2() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 8192;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = InternalError.class)
    public void testWith3() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith4() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith5() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith6() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith7() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith8() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 8);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith9() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith10() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith11() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith12() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith13() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith14() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith15() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith16() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 134217728;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith17() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith18() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith19() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith20() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith21() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testWith22() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = InternalError.class)
    public void testWith23() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 1;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = InternalError.class)
    public void testWith24() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 0;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = InternalError.class)
    public void testWith25() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 0;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method with(org.joda.time.DateTimeFieldType, int)
    
    @Test
    public void testWith26() throws Throwable  {
        LimitChronology limitChronology = ((LimitChronology) createInstance("org.joda.time.chrono.LimitChronology"));
        StrictDateTimeField iYearOfEra = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        setField(limitChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfEra", iYearOfEra);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {0};
        Partial partial = new Partial(limitChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.set(DelegatedDateTimeField.java:198)
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 8;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith27() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.joda.time.Partial.with(Partial.java:459) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 0;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith28() throws Throwable  {
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(anonymousBaseChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.joda.time.Partial.with(Partial.java:459) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 0;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith29() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith30() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith31() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith32() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith33() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith34() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 1);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith35() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith36() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith37() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith38() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 8);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith39() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith40() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith41() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith42() throws Throwable  {
        LimitChronology limitChronology = ((LimitChronology) createInstance("org.joda.time.chrono.LimitChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {0};
        Partial partial = new Partial(limitChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 67108864;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith43() throws Throwable  {
        LimitChronology limitChronology = ((LimitChronology) createInstance("org.joda.time.chrono.LimitChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {0};
        Partial partial = new Partial(limitChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 67108864;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith44() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 134217728;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith45() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith46() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith47() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith48() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        int[] intArray = {0};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:474) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 4194304;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith49() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null, null, null, null, null, null, null, null, null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:439) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 0;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testWith50() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        MillisDurationField iWeeks = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iWeeks", iWeeks);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(zonedChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.joda.time.Partial.with(Partial.java:459) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = 0;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.plus
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plus(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#plus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, 1);}
 *  */
    @Test
    public void testPlus_ReturnWithPeriodAdded() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        Partial actual = partial.plus(null);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#plus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, 1);}
 *  */
    @Test
    public void testPlus_ReturnWithPeriodAdded_1() throws Exception  {
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        Partial actual = partial.plus(mutablePeriod);
        
        int[] intArray1 = {};
        Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        assertNull(actualITypes);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#plus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, 1);}
 *  */
    @Test
    public void testPlus_ReturnWithPeriodAdded_2() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCTime = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cTime"));
        try {
            org.joda.time.DurationFieldType[] durationFieldTypeArray = {};
            PeriodType cTime = new PeriodType(null, durationFieldTypeArray, null);
            setStaticField(periodTypeClazz, "cTime", cTime);
            int[] intArray = {};
            Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
            AbstractPeriod anonymousAbstractPeriod = ((AbstractPeriod) createInstance("org.joda.time.base.BasePeriod$1"));
            
            Partial actual = partial.plus(anonymousAbstractPeriod);
            
            int[] intArray1 = {};
            Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
            
            Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
            assertNull(actualIChronology);
            
            org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
            assertNull(actualITypes);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
            assertNull(actualIFormatter);
            
        } finally {
            setStaticField(PeriodType.class, "cTime", prevCTime);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.minus
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minus(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#minus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, -1);}
 *  */
    @Test
    public void testMinus_ReturnWithPeriodAdded() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        Partial actual = partial.minus(null);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#minus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, -1);}
 *  */
    @Test
    public void testMinus_ReturnWithPeriodAdded_1() throws Exception  {
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        Partial actual = partial.minus(mutablePeriod);
        
        int[] intArray1 = {};
        Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        assertNull(actualITypes);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#minus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, -1);}
 *  */
    @Test
    public void testMinus_ReturnWithPeriodAdded_2() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCTime = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cTime"));
        try {
            org.joda.time.DurationFieldType[] durationFieldTypeArray = {};
            PeriodType cTime = new PeriodType(null, durationFieldTypeArray, null);
            setStaticField(periodTypeClazz, "cTime", cTime);
            int[] intArray = {};
            Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
            AbstractPeriod anonymousAbstractPeriod = ((AbstractPeriod) createInstance("org.joda.time.base.BasePeriod$1"));
            
            Partial actual = partial.minus(anonymousAbstractPeriod);
            
            int[] intArray1 = {};
            Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
            
            Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
            assertNull(actualIChronology);
            
            org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
            assertNull(actualITypes);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
            assertNull(actualIFormatter);
            
        } finally {
            setStaticField(PeriodType.class, "cTime", prevCTime);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValues()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return (int[]) iValues.clone();}
 *  */
    @Test
    public void testGetValues_ObjectClone() {
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        
        int[] actual = partial.getValues();
        
        int[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValues()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (int[]) iValues.clone();
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getValues] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getValues(Partial.java:383) */
        partial.getValues();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.isMatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isMatch(org.joda.time.ReadablePartial)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsMatch_ReturnTrue() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        
        boolean actual = partial.isMatch(localTime);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 *  */
    @Test
    public void testIsMatch_ValueNotEqualsIOfIValues() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-255};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iCenturyOfEra = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDateTimeField", "iRange", -2);
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 490402587607040L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        boolean actual = partial.isMatch(localDateTime);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isMatch(org.joda.time.ReadablePartial)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (partial == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: partial == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_ThrowIllegalArgumentException() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        partial.isMatch(((ReadablePartial) null));
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (partial == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int value = partial.get(iTypes[i]);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_ThrowIllegalArgumentException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        
        partial.isMatch(localDateTime);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (partial == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.InternalError} in: int value = partial.get(iTypes[i]);
 *  */
    @Test(expected = InternalError.class)
    public void testIsMatch_ThrowInternalError() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        partial.isMatch(localDateTime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isMatch(org.joda.time.ReadablePartial)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: value != iValues[i]
 *  */
    @Test
    public void testIsMatch_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        PreciseDateTimeField iCenturyOfEra = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDateTimeField", "iRange", Integer.MIN_VALUE);
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.isMatch(Partial.java:687) */
        partial.isMatch(localDateTime);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int value = partial.get(iTypes[i]);
 *  */
    @Test
    public void testIsMatch_ThrowArithmeticException() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        PreciseDateTimeField iCenturyOfEra = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:81)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:686) */
        partial.isMatch(localDateTime);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int value = partial.get(iTypes[i]);
 *  */
    @Test
    public void testIsMatch_ThrowArithmeticException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        PreciseDateTimeField iHourOfHalfday = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iHourOfHalfday, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:81)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:686) */
        partial.isMatch(localDateTime);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < iTypes.length; i++)
 *  */
    @Test
    public void testIsMatch_ThrowNullPointerException() throws Exception  {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.Partial.isMatch(Partial.java:685) */
        partial.isMatch(localDate);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value != iValues[i]
 *  */
    @Test
    public void testIsMatch_ThrowNullPointerException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        PreciseDateTimeField iCenturyOfEra = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDateTimeField", "iRange", Integer.MIN_VALUE);
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.Partial.isMatch(Partial.java:687) */
        partial.isMatch(localDateTime);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value != iValues[i]
 *  */
    @Test
    public void testIsMatch_ThrowNullPointerException_2() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        PreciseDateTimeField iWeekyearOfCentury = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iWeekyearOfCentury, "org.joda.time.field.PreciseDateTimeField", "iRange", Integer.MIN_VALUE);
        setField(iWeekyearOfCentury, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.Partial.isMatch(Partial.java:687) */
        partial.isMatch(localDateTime);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.without
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method without(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (index != -1): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithout_IndexEqualsNegative1_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldType1Type = Class.forName("org.joda.time.DateTimeFieldType");
        Method withoutMethod = partialClazz.getDeclaredMethod("without", standardDateTimeFieldType1Type);
        withoutMethod.setAccessible(true);
        java.lang.Object[] withoutMethodArguments = new java.lang.Object[1];
        withoutMethodArguments[0] = standardDateTimeFieldType1;
        Partial actual = ((Partial) withoutMethod.invoke(partial, withoutMethodArguments));
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (index != -1): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithout_IndexEqualsNegative1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        Partial actual = partial.without(null);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (index != -1): True}
 * @utbot.invokes {@link org.joda.time.Partial#size()}
 * @utbot.invokes {@link org.joda.time.Partial#size()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link org.joda.time.Chronology#validate(org.joda.time.ReadablePartial,int[])}
 * @utbot.returnsFrom {@code return newPartial;}
 *  */
    @Test
    public void testWithout_IndexNotEqualsNegative1() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {-255, -255};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        Partial actual = partial.without(null);
        
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = {};
        int[] intArray1 = {};
        Partial expected = new Partial(iSOChronology, dateTimeFieldTypeArray1, intArray1);
        
        Chronology expectedIChronology = ((Chronology) getFieldValue(expected, "org.joda.time.Partial", "iChronology"));
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        Chronology actualIChronologyIBase = ((Chronology) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBase"));
        assertNull(actualIChronologyIBase);
        
        Object actualIChronologyIParam = getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iParam");
        assertNull(actualIChronologyIParam);
        
        DurationField actualIChronologyIMillis = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMillis"));
        assertNull(actualIChronologyIMillis);
        
        DurationField actualIChronologyISeconds = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iSeconds"));
        assertNull(actualIChronologyISeconds);
        
        DurationField actualIChronologyIMinutes = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMinutes"));
        assertNull(actualIChronologyIMinutes);
        
        DurationField actualIChronologyIHours = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHours"));
        assertNull(actualIChronologyIHours);
        
        DurationField actualIChronologyIHalfdays = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHalfdays"));
        assertNull(actualIChronologyIHalfdays);
        
        DurationField actualIChronologyIDays = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDays"));
        assertNull(actualIChronologyIDays);
        
        DurationField actualIChronologyIWeeks = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeeks"));
        assertNull(actualIChronologyIWeeks);
        
        DurationField actualIChronologyIWeekyears = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyears"));
        assertNull(actualIChronologyIWeekyears);
        
        DurationField actualIChronologyIMonths = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMonths"));
        assertNull(actualIChronologyIMonths);
        
        DurationField actualIChronologyIYears = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYears"));
        assertNull(actualIChronologyIYears);
        
        DurationField actualIChronologyICenturies = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        assertNull(actualIChronologyICenturies);
        
        DurationField actualIChronologyIEras = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iEras"));
        assertNull(actualIChronologyIEras);
        
        DateTimeField actualIChronologyIMillisOfSecond = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond"));
        assertNull(actualIChronologyIMillisOfSecond);
        
        DateTimeField actualIChronologyIMillisOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay"));
        assertNull(actualIChronologyIMillisOfDay);
        
        DateTimeField actualIChronologyISecondOfMinute = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute"));
        assertNull(actualIChronologyISecondOfMinute);
        
        DateTimeField actualIChronologyISecondOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay"));
        assertNull(actualIChronologyISecondOfDay);
        
        DateTimeField actualIChronologyIMinuteOfHour = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour"));
        assertNull(actualIChronologyIMinuteOfHour);
        
        DateTimeField actualIChronologyIMinuteOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay"));
        assertNull(actualIChronologyIMinuteOfDay);
        
        DateTimeField actualIChronologyIHourOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfDay"));
        assertNull(actualIChronologyIHourOfDay);
        
        DateTimeField actualIChronologyIClockhourOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay"));
        assertNull(actualIChronologyIClockhourOfDay);
        
        DateTimeField actualIChronologyIHourOfHalfday = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday"));
        assertNull(actualIChronologyIHourOfHalfday);
        
        DateTimeField actualIChronologyIClockhourOfHalfday = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday"));
        assertNull(actualIChronologyIClockhourOfHalfday);
        
        DateTimeField actualIChronologyIHalfdayOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay"));
        assertNull(actualIChronologyIHalfdayOfDay);
        
        DateTimeField actualIChronologyIDayOfWeek = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek"));
        assertNull(actualIChronologyIDayOfWeek);
        
        DateTimeField actualIChronologyIDayOfMonth = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth"));
        assertNull(actualIChronologyIDayOfMonth);
        
        DateTimeField actualIChronologyIDayOfYear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfYear"));
        assertNull(actualIChronologyIDayOfYear);
        
        DateTimeField actualIChronologyIWeekOfWeekyear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear"));
        assertNull(actualIChronologyIWeekOfWeekyear);
        
        DateTimeField actualIChronologyIWeekyear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyear"));
        assertNull(actualIChronologyIWeekyear);
        
        DateTimeField actualIChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        assertNull(actualIChronologyIWeekyearOfCentury);
        
        DateTimeField actualIChronologyIMonthOfYear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear"));
        assertNull(actualIChronologyIMonthOfYear);
        
        DateTimeField actualIChronologyIYear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYear"));
        assertNull(actualIChronologyIYear);
        
        DateTimeField actualIChronologyIYearOfEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfEra"));
        assertNull(actualIChronologyIYearOfEra);
        
        DateTimeField actualIChronologyIYearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        assertNull(actualIChronologyIYearOfCentury);
        
        DateTimeField actualIChronologyICenturyOfEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        assertNull(actualIChronologyICenturyOfEra);
        
        DateTimeField actualIChronologyIEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iEra"));
        assertNull(actualIChronologyIEra);
        
        int expectedIChronologyIBaseFlags = ((Integer) getFieldValue(expectedIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        int actualIChronologyIBaseFlags = ((Integer) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        assertEquals(expectedIChronologyIBaseFlags, actualIChronologyIBaseFlags);
        
        org.joda.time.DateTimeFieldType[] expectedITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(expected, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int expectedITypesSize = expectedITypes.length;
        assertEquals(expectedITypesSize, actualITypes.length);
        assertTrue(deepEquals(expectedITypes, actualITypes));
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        
        assertNull(finalPartialITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method without(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(iValues, index + 1, newValues, index, newValues.length - index);
 *  */
    @Test
    public void testWithout_ThrowArrayIndexOutOfBoundsException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.without] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.joda.time.Partial.without(Partial.java:494) */
        partial.without(null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.Chronology#validate(org.joda.time.ReadablePartial,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iChronology.validate(newPartial, newValues);
 *  */
    @Test
    public void testWithout_ThrowNullPointerException_1() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {-255, 1};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.without] produces [java.lang.NullPointerException]
            org.joda.time.Partial.without(Partial.java:496) */
        partial.without(null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(iValues, 0, newValues, 0, index);
 *  */
    @Test
    public void testWithout_ThrowNullPointerException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.without] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.joda.time.Partial.without(Partial.java:493) */
        partial.without(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withFieldAdded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withFieldAdded(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#indexOfSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithFieldAdded_PartialIndexOfSupported() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        Partial actual = partial.withFieldAdded(null, 0);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withFieldAdded(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link org.joda.time.Partial#getField(int)}
 * @utbot.throwsException {@link java.lang.InternalError} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test(expected = InternalError.class)
    public void testWithFieldAdded_ThrowInternalError() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_ThrowIllegalArgumentException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_ThrowIllegalArgumentException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withFieldAdded(null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withFieldAdded(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_1() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_2() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_3() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_4() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_5() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_6() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_7() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_8() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_9() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_10() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_11() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_12() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_13() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_14() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:547) */
        partial.withFieldAdded(null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withPeriodAdded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withPeriodAdded(org.joda.time.ReadablePeriod, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withPeriodAdded(org.joda.time.ReadablePeriod,int)}
 * @utbot.executesCondition {@code (period == null): False}
 * @utbot.executesCondition {@code (scalar == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithPeriodAdded_ScalarEqualsZero() throws Exception  {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        Partial actual = partial.withPeriodAdded(mutablePeriod, 0);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withPeriodAdded(org.joda.time.ReadablePeriod,int)}
 * @utbot.executesCondition {@code (period == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithPeriodAdded_PeriodEqualsNull() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        Partial actual = partial.withPeriodAdded(null, -255);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withPeriodAdded(org.joda.time.ReadablePeriod,int)}
 * @utbot.executesCondition {@code (period == null): False}
 * @utbot.executesCondition {@code (scalar == 0): False}
 * @utbot.returnsFrom {@code return new Partial(this, newValues);}
 *  */
    @Test
    public void testWithPeriodAdded_ScalarNotEqualsZero_1() throws Exception  {
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        Partial actual = partial.withPeriodAdded(mutablePeriod, -255);
        
        int[] intArray1 = {};
        Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        assertNull(actualITypes);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withPeriodAdded(org.joda.time.ReadablePeriod,int)}
 * @utbot.executesCondition {@code (period == null): False}
 * @utbot.executesCondition {@code (scalar == 0): False}
 * @utbot.returnsFrom {@code return new Partial(this, newValues);}
 *  */
    @Test
    public void testWithPeriodAdded_ScalarNotEqualsZero() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCTime = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cTime"));
        try {
            org.joda.time.DurationFieldType[] durationFieldTypeArray = {};
            PeriodType cTime = new PeriodType(null, durationFieldTypeArray, null);
            setStaticField(periodTypeClazz, "cTime", cTime);
            int[] intArray = {};
            Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
            AbstractPeriod anonymousAbstractPeriod = ((AbstractPeriod) createInstance("org.joda.time.base.BasePeriod$1"));
            
            Partial actual = partial.withPeriodAdded(anonymousAbstractPeriod, -255);
            
            int[] intArray1 = {};
            Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
            
            Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
            assertNull(actualIChronology);
            
            org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
            assertNull(actualITypes);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
            assertNull(actualIFormatter);
            
        } finally {
            setStaticField(PeriodType.class, "cTime", prevCTime);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withField(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#indexOfSupported(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.Partial#getValue(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithField_PartialGetValue() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {-255};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        Partial actual = partial.withField(null, -255);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] partialIValues = ((int[]) getFieldValue(partial, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int partialIValuesSize = partialIValues.length;
        assertEquals(partialIValuesSize, actualIValues.length);
        assertArrayEquals(partialIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes1, 0));
        
        assertNull(finalPartialITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withField(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#getValue(int)}
 * @utbot.invokes {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link org.joda.time.Partial#getField(int)}
 * @utbot.throwsException {@link java.lang.InternalError} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test(expected = InternalError.class)
    public void testWithField_ThrowInternalError() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithField_ThrowIllegalArgumentException_1() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldType1Type = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldType1Type, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType1;
        withFieldMethodArguments[1] = -255;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithField_ThrowIllegalArgumentException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withField(null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withField(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: value == getValue(index)
 *  */
    @Test
    public void testWithField_ThrowArrayIndexOutOfBoundsException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.getValue(Partial.java:370)
            org.joda.time.Partial.withField(Partial.java:519) */
        partial.withField(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_1() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_2() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_3() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_4() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_5() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_6() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_7() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_8() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_9() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_10() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_11() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_12() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_13() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:523) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.toStringList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringList()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toStringList()}
 * @utbot.invokes {@link org.joda.time.Partial#size()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testToStringList_StringBuilderToString() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        String actual = partial.toStringList();
        
        String expected = "[]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toStringList()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toStringList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf.append(iValues[i]);
 *  */
    @Test
    public void testToStringList_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.toStringList] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.toStringList(Partial.java:774) */
        partial.toStringList();
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toStringList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf.append(iTypes[i].getName());
 *  */
    @Test
    public void testToStringList_ThrowNullPointerException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.toStringList] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:772) */
        partial.toStringList();
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toStringList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf.append(iValues[i]);
 *  */
    @Test
    public void testToStringList_ThrowNullPointerException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.toStringList] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:774) */
        partial.toStringList();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getFieldTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldTypes()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldTypes()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return (DateTimeFieldType[]) iTypes.clone();}
 *  */
    @Test
    public void testGetFieldTypes_ObjectClone() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        org.joda.time.DateTimeFieldType[] actual = partial.getFieldTypes();
        
        org.joda.time.DateTimeFieldType[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFieldTypes()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldTypes()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (DateTimeFieldType[]) iTypes.clone();
 *  */
    @Test
    public void testGetFieldTypes_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getFieldTypes] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getFieldTypes(Partial.java:358) */
        partial.getFieldTypes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withFieldAddWrapped
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withFieldAddWrapped(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#indexOfSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithFieldAddWrapped_PartialIndexOfSupported() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        Partial actual = partial.withFieldAddWrapped(null, 0);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withFieldAddWrapped(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link org.joda.time.Partial#getField(int)}
 * @utbot.throwsException {@link java.lang.InternalError} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test(expected = InternalError.class)
    public void testWithFieldAddWrapped_ThrowInternalError() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_ThrowIllegalArgumentException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_ThrowIllegalArgumentException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withFieldAddWrapped(null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withFieldAddWrapped(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_1() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_2() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_3() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_4() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_5() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_6() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_7() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_8() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_9() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_10() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_11() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_12() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_13() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_14() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:571) */
        partial.withFieldAddWrapped(null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withChronologyRetainFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withChronologyRetainFields(org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withChronologyRetainFields(org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (newChronology == getChronology()): True}
 * @utbot.invokes {@link org.joda.time.DateTimeUtils#getChronology(org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.Chronology#withUTC()}
 * @utbot.invokes {@link org.joda.time.Partial#getChronology()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithChronologyRetainFields_NewChronologyEqualsGetChronology() throws Exception  {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        Partial actual = partial.withChronologyRetainFields(zonedChronology);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        assertNull(actualITypes);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withChronologyRetainFields(org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withChronologyRetainFields(org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.Chronology#validate(org.joda.time.ReadablePartial,int[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: newChronology.validate(newPartial, iValues);
 *  */
    @Test
    public void testWithChronologyRetainFields_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.Partial.withChronologyRetainFields] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.chrono.BaseChronology.validate(BaseChronology.java:185)
            org.joda.time.Partial.withChronologyRetainFields(Partial.java:408) */
        partial.withChronologyRetainFields(zonedChronology);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withChronologyRetainFields(org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.Chronology#validate(org.joda.time.ReadablePartial,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newChronology.validate(newPartial, iValues);
 *  */
    @Test
    public void testWithChronologyRetainFields_ThrowNullPointerException() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        Partial partial = new Partial(iSOChronology, ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        /* This test fails because method [org.joda.time.Partial.withChronologyRetainFields] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withChronologyRetainFields(Partial.java:408) */
        partial.withChronologyRetainFields(zonedChronology);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withChronologyRetainFields(org.joda.time.Chronology)
    
    @Test
    public void testWithChronologyRetainFields1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", zonedChronology);
        
        Partial actual = partial.withChronologyRetainFields(zonedChronology);
        
        Partial expected = new Partial(zonedChronology, dateTimeFieldTypeArray, ((int[]) null));
        
        Chronology expectedIChronology = ((Chronology) getFieldValue(expected, "org.joda.time.Partial", "iChronology"));
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        Chronology expectedIChronologyIBase = ((Chronology) getFieldValue(expectedIChronology, "org.joda.time.chrono.AssembledChronology", "iBase"));
        Chronology actualIChronologyIBase = ((Chronology) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBase"));
        assertTrue(deepEquals(expectedIChronologyIBase, actualIChronologyIBase));
        Object actualIChronologyIBaseIParam = getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iParam");
        assertNull(actualIChronologyIBaseIParam);
        
        DurationField actualIChronologyIBaseIMillis = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillis"));
        assertNull(actualIChronologyIBaseIMillis);
        
        DurationField actualIChronologyIBaseISeconds = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSeconds"));
        assertNull(actualIChronologyIBaseISeconds);
        
        DurationField actualIChronologyIBaseIMinutes = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinutes"));
        assertNull(actualIChronologyIBaseIMinutes);
        
        DurationField actualIChronologyIBaseIHours = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHours"));
        assertNull(actualIChronologyIBaseIHours);
        
        DurationField actualIChronologyIBaseIHalfdays = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdays"));
        assertNull(actualIChronologyIBaseIHalfdays);
        
        DurationField actualIChronologyIBaseIDays = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDays"));
        assertNull(actualIChronologyIBaseIDays);
        
        DurationField actualIChronologyIBaseIWeeks = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeeks"));
        assertNull(actualIChronologyIBaseIWeeks);
        
        DurationField actualIChronologyIBaseIWeekyears = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeekyears"));
        assertNull(actualIChronologyIBaseIWeekyears);
        
        DurationField actualIChronologyIBaseIMonths = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMonths"));
        assertNull(actualIChronologyIBaseIMonths);
        
        DurationField actualIChronologyIBaseIYears = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iYears"));
        assertNull(actualIChronologyIBaseIYears);
        
        DurationField actualIChronologyIBaseICenturies = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        assertNull(actualIChronologyIBaseICenturies);
        
        DurationField actualIChronologyIBaseIEras = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iEras"));
        assertNull(actualIChronologyIBaseIEras);
        
        DateTimeField actualIChronologyIBaseIMillisOfSecond = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond"));
        assertNull(actualIChronologyIBaseIMillisOfSecond);
        
        DateTimeField actualIChronologyIBaseIMillisOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay"));
        assertNull(actualIChronologyIBaseIMillisOfDay);
        
        DateTimeField actualIChronologyIBaseISecondOfMinute = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute"));
        assertNull(actualIChronologyIBaseISecondOfMinute);
        
        DateTimeField actualIChronologyIBaseISecondOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay"));
        assertNull(actualIChronologyIBaseISecondOfDay);
        
        DateTimeField actualIChronologyIBaseIMinuteOfHour = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour"));
        assertNull(actualIChronologyIBaseIMinuteOfHour);
        
        DateTimeField actualIChronologyIBaseIMinuteOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay"));
        assertNull(actualIChronologyIBaseIMinuteOfDay);
        
        DateTimeField actualIChronologyIBaseIHourOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfDay"));
        assertNull(actualIChronologyIBaseIHourOfDay);
        
        DateTimeField actualIChronologyIBaseIClockhourOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay"));
        assertNull(actualIChronologyIBaseIClockhourOfDay);
        
        DateTimeField actualIChronologyIBaseIHourOfHalfday = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday"));
        assertNull(actualIChronologyIBaseIHourOfHalfday);
        
        DateTimeField actualIChronologyIBaseIClockhourOfHalfday = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday"));
        assertNull(actualIChronologyIBaseIClockhourOfHalfday);
        
        DateTimeField actualIChronologyIBaseIHalfdayOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay"));
        assertNull(actualIChronologyIBaseIHalfdayOfDay);
        
        DateTimeField actualIChronologyIBaseIDayOfWeek = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek"));
        assertNull(actualIChronologyIBaseIDayOfWeek);
        
        DateTimeField actualIChronologyIBaseIDayOfMonth = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth"));
        assertNull(actualIChronologyIBaseIDayOfMonth);
        
        DateTimeField actualIChronologyIBaseIDayOfYear = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDayOfYear"));
        assertNull(actualIChronologyIBaseIDayOfYear);
        
        DateTimeField actualIChronologyIBaseIWeekOfWeekyear = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear"));
        assertNull(actualIChronologyIBaseIWeekOfWeekyear);
        
        DateTimeField actualIChronologyIBaseIWeekyear = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeekyear"));
        assertNull(actualIChronologyIBaseIWeekyear);
        
        DateTimeField actualIChronologyIBaseIWeekyearOfCentury = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        assertNull(actualIChronologyIBaseIWeekyearOfCentury);
        
        DateTimeField actualIChronologyIBaseIMonthOfYear = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear"));
        assertNull(actualIChronologyIBaseIMonthOfYear);
        
        DateTimeField actualIChronologyIBaseIYear = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iYear"));
        assertNull(actualIChronologyIBaseIYear);
        
        DateTimeField actualIChronologyIBaseIYearOfEra = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iYearOfEra"));
        assertNull(actualIChronologyIBaseIYearOfEra);
        
        DateTimeField actualIChronologyIBaseIYearOfCentury = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        assertNull(actualIChronologyIBaseIYearOfCentury);
        
        DateTimeField actualIChronologyIBaseICenturyOfEra = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        assertNull(actualIChronologyIBaseICenturyOfEra);
        
        DateTimeField actualIChronologyIBaseIEra = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iEra"));
        assertNull(actualIChronologyIBaseIEra);
        
        int expectedIChronologyIBaseIBaseFlags = ((Integer) getFieldValue(expectedIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        int actualIChronologyIBaseIBaseFlags = ((Integer) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        assertEquals(expectedIChronologyIBaseIBaseFlags, actualIChronologyIBaseIBaseFlags);
        
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        assertTrue(deepEquals(expectedIChronology, actualIChronology));
        
        org.joda.time.DateTimeFieldType[] expectedITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(expected, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int expectedITypesSize = expectedITypes.length;
        assertEquals(expectedITypesSize, actualITypes.length);
        assertTrue(deepEquals(expectedITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withChronologyRetainFields(org.joda.time.Chronology)
    
    @Test
    public void testWithChronologyRetainFields2() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {0};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.Partial.withChronologyRetainFields] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getField(Partial.java:335)
            org.joda.time.base.AbstractPartial.getField(AbstractPartial.java:105)
            org.joda.time.chrono.BaseChronology.validate(BaseChronology.java:186)
            org.joda.time.Partial.withChronologyRetainFields(Partial.java:408) */
        partial.withChronologyRetainFields(zonedChronology);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1050351231332700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1050351231332700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1050351231345100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050351231332700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050351231345100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1050351232112400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1050351232112400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1050351232115099 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050351232112400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050351232115099).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1050351243042900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1050351243042900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1050351243046700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050351243042900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050351243046700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1050351244568300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1050351244568300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1050351244571200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050351244568300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050351244571200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

