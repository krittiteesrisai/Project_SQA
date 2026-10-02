package org.joda.time.format;

import org.junit.Test;
import java.util.ArrayList;
import org.joda.time.format.PeriodFormatterBuilder.Composite;
import org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix;
import java.util.List;
import org.joda.time.format.PeriodFormatterBuilder.FieldFormatter;
import org.joda.time.format.PeriodFormatterBuilder.Literal;
import org.joda.time.format.PeriodFormatterBuilder.SimpleAffix;
import org.joda.time.format.PeriodFormatterBuilder.PluralAffix;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import org.joda.time.PeriodType;
import org.joda.time.format.PeriodFormatterBuilder.Separator;
import org.joda.time.format.PeriodFormatterBuilder.CompositeAffix;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class org_joda_time_format_PeriodFormatterBuilderTest {
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.joda.time.format.PeriodPrinter, org.joda.time.format.PeriodParser)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (printer == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_PrinterNotEqualsNull_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.append(composite, null);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertTrue(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        boolean finalPeriodFormatterBuilderINotParser = ((Boolean) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        
        assertTrue(finalPeriodFormatterBuilderINotParser);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (printer == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_PrinterNotEqualsNull() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        PeriodFormatterBuilder.Literal literal = new PeriodFormatterBuilder.Literal(null);
        PeriodFormatterBuilder.Literal literal1 = new PeriodFormatterBuilder.Literal(null);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.append(literal, literal1);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (printer == null): True}
 * @utbot.executesCondition {@code (parser == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_ParserNotEqualsNull() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = new PeriodFormatterBuilder.FieldFormatter(0, 0, 0, false, 0, null, null, null);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.append(null, fieldFormatter);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertTrue(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        boolean finalPeriodFormatterBuilderINotPrinter = ((Boolean) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        
        assertTrue(finalPeriodFormatterBuilderINotPrinter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.joda.time.format.PeriodPrinter, org.joda.time.format.PeriodParser)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (printer == null): True}
 * @utbot.executesCondition {@code (parser == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: printer == null && parser == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (printer == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: clearPrefix();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppend_ThrowIllegalStateException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        
        periodFormatterBuilder.append(composite, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (printer == null): True}
 * @utbot.executesCondition {@code (parser == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: clearPrefix();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppend_ThrowIllegalStateException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = new PeriodFormatterBuilder.FieldFormatter(0, 0, 0, false, 0, null, null, null);
        
        periodFormatterBuilder.append(null, fieldFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.joda.time.format.PeriodPrinter, org.joda.time.format.PeriodParser)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (printer == null): False}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append0(printer, parser);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.append] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.append(PeriodFormatterBuilder.java:216) */
        periodFormatterBuilder.append(composite, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.joda.time.format.PeriodFormatter)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodFormatter)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return_2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        PeriodFormatterBuilder.Literal literal = new PeriodFormatterBuilder.Literal(null);
        PeriodFormatter periodFormatter = new PeriodFormatter(literal, null);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.append(periodFormatter);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertTrue(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        boolean finalPeriodFormatterBuilderINotParser = ((Boolean) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        
        assertTrue(finalPeriodFormatterBuilderINotParser);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodFormatter)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = new PeriodFormatterBuilder.FieldFormatter(0, 0, 0, false, 0, null, null, null);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter1 = new PeriodFormatterBuilder.FieldFormatter(0, 0, 0, false, 0, null, null, null);
        PeriodFormatter periodFormatter = new PeriodFormatter(fieldFormatter, fieldFormatter1);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.append(periodFormatter);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodFormatter)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Return_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = new PeriodFormatterBuilder.FieldFormatter(0, 0, 0, false, 0, null, null, null);
        PeriodFormatter periodFormatter = new PeriodFormatter(null, fieldFormatter);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.append(periodFormatter);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertTrue(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        boolean finalPeriodFormatterBuilderINotPrinter = ((Boolean) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        
        assertTrue(finalPeriodFormatterBuilderINotPrinter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.joda.time.format.PeriodFormatter)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodFormatter)}
 * @utbot.executesCondition {@code (formatter == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: formatter == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.append(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodFormatter)}
 * @utbot.executesCondition {@code (formatter == null): False}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: clearPrefix();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppend_ThrowIllegalStateException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        PeriodFormatter periodFormatter = new PeriodFormatter(null, null);
        
        periodFormatterBuilder.append(periodFormatter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.joda.time.format.PeriodFormatter)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append(org.joda.time.format.PeriodFormatter)}
 * @utbot.executesCondition {@code (formatter == null): False}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.invokes {@link org.joda.time.format.PeriodFormatter#getPrinter()}
 * @utbot.invokes {@link org.joda.time.format.PeriodFormatter#getParser()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append0(formatter.getPrinter(), formatter.getParser());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatter periodFormatter = new PeriodFormatter(null, null);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.append] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.append(PeriodFormatterBuilder.java:196) */
        periodFormatterBuilder.append(periodFormatter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#clear()}
 * @utbot.executesCondition {@code (iElementPairs == null): True}
 *  */
    @Test
    public void testClear_IElementPairsEqualsNull() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] initialPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        
        periodFormatterBuilder.clear();
        
        int finalPeriodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int finalPeriodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int finalPeriodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] finalPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters == finalPeriodFormatterBuilderIFieldFormatters);
        
        assertEquals(1, finalPeriodFormatterBuilderIMinPrintedDigits);
        
        assertEquals(2, finalPeriodFormatterBuilderIPrintZeroSetting);
        
        assertEquals(10, finalPeriodFormatterBuilderIMaxParsedDigits);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#clear()}
 * @utbot.executesCondition {@code (iElementPairs == null): False}
 * @utbot.invokes {@link java.util.List#clear()}
 *  */
    @Test
    public void testClear_IElementPairsNotEqualsNull() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        PeriodFormatterBuilder.PluralAffix iPrefix = ((PeriodFormatterBuilder.PluralAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] initialPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        
        periodFormatterBuilder.clear();
        
        int finalPeriodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int finalPeriodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int finalPeriodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        PeriodFormatterBuilder.PeriodFieldAffix finalPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] finalPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters == finalPeriodFormatterBuilderIFieldFormatters);
        
        assertEquals(1, finalPeriodFormatterBuilderIMinPrintedDigits);
        
        assertEquals(2, finalPeriodFormatterBuilderIPrintZeroSetting);
        
        assertEquals(10, finalPeriodFormatterBuilderIMaxParsedDigits);
        
        assertNull(finalPeriodFormatterBuilderIPrefix);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.toFormatter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toFormatter(java.util.List, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter(java.util.List,boolean,boolean)}
 * @utbot.executesCondition {@code (notPrinter && notParser): False}
 * @utbot.executesCondition {@code (notParser): False}
 * @utbot.returnsFrom {@code return new PeriodFormatter((PeriodPrinter) comp[0], (PeriodParser) comp[1]);}
 *  */
    @Test
    public void testToFormatter_NotNotParser() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            ArrayList arrayList = new ArrayList();
            
            Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
            Class arrayListType = Class.forName("java.util.List");
            Class booleanType = boolean.class;
            Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", arrayListType, booleanType, booleanType);
            toFormatterMethod.setAccessible(true);
            java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
            toFormatterMethodArguments[0] = arrayList;
            toFormatterMethodArguments[1] = false;
            toFormatterMethodArguments[2] = false;
            PeriodFormatter actual = ((PeriodFormatter) toFormatterMethod.invoke(null, toFormatterMethodArguments));
            
            PeriodFormatter expected = ((PeriodFormatter) createInstance("org.joda.time.format.PeriodFormatter"));
            PeriodFormatterBuilder.Literal iPrinter = ((PeriodFormatterBuilder.Literal) createInstance("org.joda.time.format.PeriodFormatterBuilder$Literal"));
            setField(iPrinter, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText", string);
            setField(expected, "org.joda.time.format.PeriodFormatter", "iPrinter", iPrinter);
            setField(expected, "org.joda.time.format.PeriodFormatter", "iParser", iPrinter);
            
            PeriodPrinter expectedIPrinter = ((PeriodPrinter) getFieldValue(expected, "org.joda.time.format.PeriodFormatter", "iPrinter"));
            PeriodPrinter actualIPrinter = ((PeriodPrinter) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iPrinter"));
            String expectedIPrinterIText = ((String) getFieldValue(expectedIPrinter, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            String actualIPrinterIText = ((String) getFieldValue(actualIPrinter, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            assertEquals(expectedIPrinterIText, actualIPrinterIText);
            
            PeriodParser expectedIParser = ((PeriodParser) getFieldValue(expected, "org.joda.time.format.PeriodFormatter", "iParser"));
            PeriodParser actualIParser = ((PeriodParser) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParser"));
            assertTrue(deepEquals(expectedIParser, actualIParser));
            
            Locale actualILocale = ((Locale) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iLocale"));
            assertNull(actualILocale);
            
            PeriodType actualIParseType = ((PeriodType) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParseType"));
            assertNull(actualIParseType);
            
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter(java.util.List,boolean,boolean)}
 * @utbot.executesCondition {@code (notPrinter && notParser): False}
 * @utbot.executesCondition {@code (notParser): True}
 * @utbot.returnsFrom {@code return new PeriodFormatter((PeriodPrinter) comp[0], null);}
 *  */
    @Test
    public void testToFormatter_NotParser() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            ArrayList arrayList = new ArrayList();
            
            Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
            Class arrayListType = Class.forName("java.util.List");
            Class booleanType = boolean.class;
            Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", arrayListType, booleanType, booleanType);
            toFormatterMethod.setAccessible(true);
            java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
            toFormatterMethodArguments[0] = arrayList;
            toFormatterMethodArguments[1] = false;
            toFormatterMethodArguments[2] = true;
            PeriodFormatter actual = ((PeriodFormatter) toFormatterMethod.invoke(null, toFormatterMethodArguments));
            
            PeriodFormatter expected = ((PeriodFormatter) createInstance("org.joda.time.format.PeriodFormatter"));
            PeriodFormatterBuilder.Literal iPrinter = ((PeriodFormatterBuilder.Literal) createInstance("org.joda.time.format.PeriodFormatterBuilder$Literal"));
            setField(iPrinter, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText", string);
            setField(expected, "org.joda.time.format.PeriodFormatter", "iPrinter", iPrinter);
            
            PeriodPrinter expectedIPrinter = ((PeriodPrinter) getFieldValue(expected, "org.joda.time.format.PeriodFormatter", "iPrinter"));
            PeriodPrinter actualIPrinter = ((PeriodPrinter) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iPrinter"));
            String expectedIPrinterIText = ((String) getFieldValue(expectedIPrinter, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            String actualIPrinterIText = ((String) getFieldValue(actualIPrinter, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            assertEquals(expectedIPrinterIText, actualIPrinterIText);
            
            PeriodParser actualIParser = ((PeriodParser) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParser"));
            assertNull(actualIParser);
            
            Locale actualILocale = ((Locale) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iLocale"));
            assertNull(actualILocale);
            
            PeriodType actualIParseType = ((PeriodType) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParseType"));
            assertNull(actualIParseType);
            
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter(java.util.List,boolean,boolean)}
 * @utbot.executesCondition {@code (notPrinter && notParser): True}
 * @utbot.executesCondition {@code (if (notPrinter && notParser) {
 *     throw new IllegalStateException("Builder has created neither a printer nor a parser");
 * }): False}
 * @utbot.returnsFrom {@code return new PeriodFormatter(null, (PeriodParser) comp[1]);}
 *  */
    @Test
    public void testToFormatter_NotPrinterAndNotParser() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            ArrayList arrayList = new ArrayList();
            
            Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
            Class arrayListType = Class.forName("java.util.List");
            Class booleanType = boolean.class;
            Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", arrayListType, booleanType, booleanType);
            toFormatterMethod.setAccessible(true);
            java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
            toFormatterMethodArguments[0] = arrayList;
            toFormatterMethodArguments[1] = true;
            toFormatterMethodArguments[2] = false;
            PeriodFormatter actual = ((PeriodFormatter) toFormatterMethod.invoke(null, toFormatterMethodArguments));
            
            PeriodFormatter expected = ((PeriodFormatter) createInstance("org.joda.time.format.PeriodFormatter"));
            PeriodFormatterBuilder.Literal iParser = ((PeriodFormatterBuilder.Literal) createInstance("org.joda.time.format.PeriodFormatterBuilder$Literal"));
            setField(iParser, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText", string);
            setField(expected, "org.joda.time.format.PeriodFormatter", "iParser", iParser);
            
            PeriodPrinter actualIPrinter = ((PeriodPrinter) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iPrinter"));
            assertNull(actualIPrinter);
            
            PeriodParser expectedIParser = ((PeriodParser) getFieldValue(expected, "org.joda.time.format.PeriodFormatter", "iParser"));
            PeriodParser actualIParser = ((PeriodParser) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParser"));
            String expectedIParserIText = ((String) getFieldValue(expectedIParser, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            String actualIParserIText = ((String) getFieldValue(actualIParser, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            assertEquals(expectedIParserIText, actualIParserIText);
            
            Locale actualILocale = ((Locale) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iLocale"));
            assertNull(actualILocale);
            
            PeriodType actualIParseType = ((PeriodType) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParseType"));
            assertNull(actualIParseType);
            
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toFormatter(java.util.List, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter(java.util.List,boolean,boolean)}
 * @utbot.executesCondition {@code (notPrinter && notParser): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int size = elementPairs.size();
 *  */
    @Test
    public void testToFormatter_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:798) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class listType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", listType, booleanType, booleanType);
        toFormatterMethod.setAccessible(true);
        java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
        toFormatterMethodArguments[0] = ((Object) null);
        toFormatterMethodArguments[1] = false;
        toFormatterMethodArguments[2] = false;
        try {
            toFormatterMethod.invoke(null, toFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter(java.util.List,boolean,boolean)}
 * @utbot.executesCondition {@code (notPrinter && notParser): True}
 * @utbot.executesCondition {@code (if (notPrinter && notParser) {
 *     throw new IllegalStateException("Builder has created neither a printer nor a parser");
 * }): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int size = elementPairs.size();
 *  */
    @Test
    public void testToFormatter_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:798) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class listType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", listType, booleanType, booleanType);
        toFormatterMethod.setAccessible(true);
        java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
        toFormatterMethodArguments[0] = ((Object) null);
        toFormatterMethodArguments[1] = true;
        toFormatterMethodArguments[2] = false;
        try {
            toFormatterMethod.invoke(null, toFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toFormatter(java.util.List, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter(java.util.List,boolean,boolean)}
 * @utbot.executesCondition {@code (notPrinter && notParser): True}
 * @utbot.executesCondition {@code (if (notPrinter && notParser) {
 *     throw new IllegalStateException("Builder has created neither a printer nor a parser");
 * }): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: notPrinter && notParser
 *  */
    @Test(expected = IllegalStateException.class)
    public void testToFormatter_ThrowIllegalStateException() throws Throwable  {
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class listType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", listType, booleanType, booleanType);
        toFormatterMethod.setAccessible(true);
        java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
        toFormatterMethodArguments[0] = ((Object) null);
        toFormatterMethodArguments[1] = true;
        toFormatterMethodArguments[2] = true;
        try {
            toFormatterMethod.invoke(null, toFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toFormatter(java.util.List, boolean, boolean)
    
    @Test
    public void testToFormatter1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", arrayListType, booleanType, booleanType);
        toFormatterMethod.setAccessible(true);
        java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
        toFormatterMethodArguments[0] = arrayList;
        toFormatterMethodArguments[1] = true;
        toFormatterMethodArguments[2] = false;
        try {
            toFormatterMethod.invoke(null, toFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToFormatter2() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", arrayListType, booleanType, booleanType);
        toFormatterMethod.setAccessible(true);
        java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
        toFormatterMethodArguments[0] = arrayList;
        toFormatterMethodArguments[1] = false;
        toFormatterMethodArguments[2] = false;
        try {
            toFormatterMethod.invoke(null, toFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToFormatter3() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        arrayList.add(separator);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList$SubList.get(ArrayList.java:1149)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:801) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", arrayListType, booleanType, booleanType);
        toFormatterMethod.setAccessible(true);
        java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
        toFormatterMethodArguments[0] = arrayList;
        toFormatterMethodArguments[1] = false;
        toFormatterMethodArguments[2] = false;
        try {
            toFormatterMethod.invoke(null, toFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToFormatter4() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        arrayList.add(separator);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList$SubList.get(ArrayList.java:1149)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:801) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", arrayListType, booleanType, booleanType);
        toFormatterMethod.setAccessible(true);
        java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
        toFormatterMethodArguments[0] = arrayList;
        toFormatterMethodArguments[1] = true;
        toFormatterMethodArguments[2] = false;
        try {
            toFormatterMethod.invoke(null, toFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToFormatter5() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", arrayListType, booleanType, booleanType);
        toFormatterMethod.setAccessible(true);
        java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
        toFormatterMethodArguments[0] = arrayList;
        toFormatterMethodArguments[1] = false;
        toFormatterMethodArguments[2] = false;
        try {
            toFormatterMethod.invoke(null, toFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToFormatter6() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method toFormatterMethod = periodFormatterBuilderClazz.getDeclaredMethod("toFormatter", arrayListType, booleanType, booleanType);
        toFormatterMethod.setAccessible(true);
        java.lang.Object[] toFormatterMethodArguments = new java.lang.Object[3];
        toFormatterMethodArguments[0] = arrayList;
        toFormatterMethodArguments[1] = true;
        toFormatterMethodArguments[2] = false;
        try {
            toFormatterMethod.invoke(null, toFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.toFormatter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toFormatter()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#toFormatter(java.util.List,boolean,boolean)
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#toFormatter(java.util.List,boolean,boolean)
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return formatter;}
 *  */
    @Test
    public void testToFormatter_PeriodFormatterBuilderToFormatter() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {};
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] initialPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            PeriodFormatter actual = periodFormatterBuilder.toFormatter();
            
            PeriodFormatter expected = ((PeriodFormatter) createInstance("org.joda.time.format.PeriodFormatter"));
            PeriodFormatterBuilder.Literal iParser = ((PeriodFormatterBuilder.Literal) createInstance("org.joda.time.format.PeriodFormatterBuilder$Literal"));
            setField(iParser, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText", string);
            setField(expected, "org.joda.time.format.PeriodFormatter", "iParser", iParser);
            
            PeriodPrinter actualIPrinter = ((PeriodPrinter) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iPrinter"));
            assertNull(actualIPrinter);
            
            PeriodParser expectedIParser = ((PeriodParser) getFieldValue(expected, "org.joda.time.format.PeriodFormatter", "iParser"));
            PeriodParser actualIParser = ((PeriodParser) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParser"));
            String expectedIParserIText = ((String) getFieldValue(expectedIParser, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            String actualIParserIText = ((String) getFieldValue(actualIParser, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            assertEquals(expectedIParserIText, actualIParserIText);
            
            Locale actualILocale = ((Locale) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iLocale"));
            assertNull(actualILocale);
            
            PeriodType actualIParseType = ((PeriodType) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParseType"));
            assertNull(actualIParseType);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] finalPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            assertFalse(initialPeriodFormatterBuilderIFieldFormatters == finalPeriodFormatterBuilderIFieldFormatters);
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toFormatter()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PeriodFormatter formatter = toFormatter(iElementPairs, iNotPrinter, iNotParser);
 *  */
    @Test
    public void testToFormatter_ThrowNullPointerException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:798)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123) */
        periodFormatterBuilder.toFormatter();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PeriodFormatter formatter = toFormatter(iElementPairs, iNotPrinter, iNotParser);
 *  */
    @Test
    public void testToFormatter_ThrowNullPointerException_11() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:798)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123) */
        periodFormatterBuilder.toFormatter();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iFieldFormatters = (FieldFormatter[]) iFieldFormatters.clone();
 *  */
    @Test
    public void testToFormatter_ThrowNullPointerException_2() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
            
            /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.NullPointerException]
                org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:124) */
            periodFormatterBuilder.toFormatter();
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iFieldFormatters = (FieldFormatter[]) iFieldFormatters.clone();
 *  */
    @Test
    public void testToFormatter_ThrowNullPointerException_3() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            
            /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.NullPointerException]
                org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:124) */
            periodFormatterBuilder.toFormatter();
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iFieldFormatters = (FieldFormatter[]) iFieldFormatters.clone();
 *  */
    @Test
    public void testToFormatter_ThrowNullPointerException_4() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser", true);
            
            /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.NullPointerException]
                org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:124) */
            periodFormatterBuilder.toFormatter();
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toFormatter()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#toFormatter(java.util.List,boolean,boolean)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: PeriodFormatter formatter = toFormatter(iElementPairs, iNotPrinter, iNotParser);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testToFormatter_ThrowIllegalStateException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser", true);
        
        periodFormatterBuilder.toFormatter();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toFormatter()
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.format.PeriodFormatterBuilder}
     * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter()}
     */
    @Test
    public void testToFormatter() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();
        
        PeriodFormatter actual = periodFormatterBuilder.toFormatter();
        
        PeriodFormatter expected = ((PeriodFormatter) createInstance("org.joda.time.format.PeriodFormatter"));
        PeriodFormatterBuilder.Literal iPrinter = ((PeriodFormatterBuilder.Literal) createInstance("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        String iText = "";
        setField(iPrinter, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText", iText);
        setField(expected, "org.joda.time.format.PeriodFormatter", "iPrinter", iPrinter);
        setField(expected, "org.joda.time.format.PeriodFormatter", "iParser", iPrinter);
        
        PeriodPrinter expectedIPrinter = ((PeriodPrinter) getFieldValue(expected, "org.joda.time.format.PeriodFormatter", "iPrinter"));
        PeriodPrinter actualIPrinter = ((PeriodPrinter) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iPrinter"));
        String expectedIPrinterIText = ((String) getFieldValue(expectedIPrinter, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
        String actualIPrinterIText = ((String) getFieldValue(actualIPrinter, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
        assertEquals(expectedIPrinterIText, actualIPrinterIText);
        
        PeriodParser expectedIParser = ((PeriodParser) getFieldValue(expected, "org.joda.time.format.PeriodFormatter", "iParser"));
        PeriodParser actualIParser = ((PeriodParser) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParser"));
        assertTrue(deepEquals(expectedIParser, actualIParser));
        
        Locale actualILocale = ((Locale) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iLocale"));
        assertNull(actualILocale);
        
        PeriodType actualIParseType = ((PeriodType) getFieldValue(actual, "org.joda.time.format.PeriodFormatter", "iParseType"));
        assertNull(actualIParseType);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toFormatter()
    
    @Test
    public void testToFormatter7() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123) */
        periodFormatterBuilder.toFormatter();
    }
    
    @Test
    public void testToFormatter8() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123) */
        periodFormatterBuilder.toFormatter();
    }
    
    @Test
    public void testToFormatter9() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList$SubList.get(ArrayList.java:1149)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:801)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123) */
        periodFormatterBuilder.toFormatter();
    }
    
    @Test
    public void testToFormatter10() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toFormatter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList$SubList.get(ArrayList.java:1149)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:801)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123) */
        periodFormatterBuilder.toFormatter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendLiteral(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendLiteral(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendLiteral_TextNotEqualsNull() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendLiteral(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendLiteral(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendLiteral(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: text == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteral_ThrowIllegalArgumentException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendLiteral(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendLiteral(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: clearPrefix();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendLiteral_ThrowIllegalStateException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        String string = "";
        
        periodFormatterBuilder.appendLiteral(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendLiteral(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendLiteral(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append0(literal, literal);
 *  */
    @Test
    public void testAppendLiteral_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendLiteral] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendLiteral(PeriodFormatterBuilder.java:233) */
        periodFormatterBuilder.appendLiteral(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSuffix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSuffix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.returnsFrom {@code return appendSuffix(new SimpleAffix(text));}
 *  */
    @Test
    public void testAppendSuffix_ReturnAppendSuffix_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        PeriodFormatterBuilder.SimpleAffix iSuffix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        String iText = "";
        setField(iSuffix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText", iText);
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iSuffix", iSuffix);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(iSuffix);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 0));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSuffix(iText);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters0 == finalPeriodFormatterBuilderIFieldFormatters0);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.returnsFrom {@code return appendSuffix(new SimpleAffix(text));}
 *  */
    @Test
    public void testAppendSuffix_ReturnAppendSuffix() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(null);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        String string = "";
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 0));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSuffix(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters0 == finalPeriodFormatterBuilderIFieldFormatters0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSuffix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: text == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_ThrowIllegalArgumentException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendSuffix(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new SimpleAffix(text));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        periodFormatterBuilder.appendSuffix(string);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new SimpleAffix(text));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        periodFormatterBuilder.appendSuffix(string);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new SimpleAffix(text));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        PeriodFormatterBuilder.SimpleAffix simpleAffix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        String iText = "";
        setField(simpleAffix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText", iText);
        iElementPairs.add(simpleAffix);
        iElementPairs.add(simpleAffix);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        periodFormatterBuilder.appendSuffix(iText);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new SimpleAffix(text));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_3() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        PeriodFormatterBuilder.SimpleAffix simpleAffix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        String iText = "";
        setField(simpleAffix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText", iText);
        iElementPairs.add(simpleAffix);
        iElementPairs.add(simpleAffix);
        Object object1 = createInstance("java.lang.Object");
        iElementPairs.add(object1);
        Object object2 = createInstance("java.lang.Object");
        iElementPairs.add(object2);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        periodFormatterBuilder.appendSuffix(iText);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new SimpleAffix(text));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_4() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        String iText = "";
        setField(iPrefix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText", iText);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(iPrefix);
        iElementPairs.add(iPrefix);
        iElementPairs.add(null);
        iElementPairs.add(null);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        periodFormatterBuilder.appendSuffix(iText);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSuffix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return appendSuffix(new SimpleAffix(text));
 *  */
    @Test
    public void testAppendSuffix_ThrowIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:592)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:555) */
        periodFormatterBuilder.appendSuffix(string);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return appendSuffix(new SimpleAffix(text));
 *  */
    @Test
    public void testAppendSuffix_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iFieldType", 1073741824);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(null);
        PeriodFormatterBuilder.SimpleAffix simpleAffix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        String iText = "";
        setField(simpleAffix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText", iText);
        iElementPairs.add(simpleAffix);
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(simpleAffix);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:609)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:555) */
        periodFormatterBuilder.appendSuffix(iText);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return appendSuffix(new SimpleAffix(text));
 *  */
    @Test
    public void testAppendSuffix_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:591)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:555) */
        periodFormatterBuilder.appendSuffix(string);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return appendSuffix(new SimpleAffix(text));
 *  */
    @Test
    public void testAppendSuffix_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        PeriodFormatterBuilder.SimpleAffix simpleAffix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        String iText = "";
        setField(simpleAffix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText", iText);
        iElementPairs.add(simpleAffix);
        iElementPairs.add(simpleAffix);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(simpleAffix);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:609)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:555) */
        periodFormatterBuilder.appendSuffix(iText);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSuffix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSuffix(org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): True}
 * @utbot.executesCondition {@code (originalPrinter == null): False}
 * @utbot.executesCondition {@code (originalParser == null): False}
 * @utbot.executesCondition {@code (originalPrinter != originalParser): False}
 * @utbot.executesCondition {@code (!(originalPrinter instanceof FieldFormatter)): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#set(int,java.lang.Object)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#set(int,java.lang.Object)}
 * @utbot.invokes {@link org.joda.time.format.PeriodFormatterBuilder.FieldFormatter#getFieldType()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendSuffix_OriginalPrinterNotInstanceOfFieldFormatter() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        PeriodFormatterBuilder.SimpleAffix iSuffix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iSuffix", iSuffix);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(iSuffix);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 0));
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments));
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters0 == finalPeriodFormatterBuilderIFieldFormatters0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSuffix(org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): False}
 * @utbot.executesCondition {@code (originalPrinter == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: originalPrinter == null || originalParser == null || originalPrinter != originalParser || !(originalPrinter instanceof FieldFormatter)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): True}
 * @utbot.executesCondition {@code (originalPrinter == null): False}
 * @utbot.executesCondition {@code (originalParser == null): False}
 * @utbot.executesCondition {@code (originalPrinter != originalParser): False}
 * @utbot.executesCondition {@code (!(originalPrinter instanceof FieldFormatter)): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: originalPrinter == null || originalParser == null || originalPrinter != originalParser || !(originalPrinter instanceof FieldFormatter)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_21() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): True}
 * @utbot.executesCondition {@code (originalPrinter == null): False}
 * @utbot.executesCondition {@code (originalParser == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: originalPrinter == null || originalParser == null || originalPrinter != originalParser || !(originalPrinter instanceof FieldFormatter)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_11() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): True}
 * @utbot.executesCondition {@code (originalPrinter == null): False}
 * @utbot.executesCondition {@code (originalParser == null): False}
 * @utbot.executesCondition {@code (originalPrinter != originalParser): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: originalPrinter == null || originalParser == null || originalPrinter != originalParser || !(originalPrinter instanceof FieldFormatter)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_41() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        Object object1 = createInstance("java.lang.Object");
        iElementPairs.add(object1);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): True}
 * @utbot.executesCondition {@code (originalPrinter == null): False}
 * @utbot.executesCondition {@code (originalParser == null): False}
 * @utbot.executesCondition {@code (originalPrinter != originalParser): False}
 * @utbot.executesCondition {@code (!(originalPrinter instanceof FieldFormatter)): False}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: clearPrefix();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_31() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(null);
        iElementPairs.add(iPrefix);
        iElementPairs.add(iPrefix);
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSuffix(org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: originalPrinter = iElementPairs.get(iElementPairs.size() - 2);
 *  */
    @Test
    public void testAppendSuffix_ThrowIndexOutOfBoundsException1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:592) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): True}
 * @utbot.executesCondition {@code (originalPrinter == null): False}
 * @utbot.executesCondition {@code (originalParser == null): False}
 * @utbot.executesCondition {@code (originalPrinter != originalParser): False}
 * @utbot.executesCondition {@code (!(originalPrinter instanceof FieldFormatter)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iFieldFormatters[newField.getFieldType()] = newField;
 *  */
    @Test
    public void testAppendSuffix_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iFieldType", Integer.MIN_VALUE);
        PeriodFormatterBuilder.PluralAffix iPrefix = ((PeriodFormatterBuilder.PluralAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iPrefix", iPrefix);
        PeriodFormatterBuilder.SimpleAffix iSuffix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iSuffix", iSuffix);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(null);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:609) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): True}
 * @utbot.executesCondition {@code (originalPrinter == null): False}
 * @utbot.executesCondition {@code (originalParser == null): False}
 * @utbot.executesCondition {@code (originalPrinter != originalParser): False}
 * @utbot.executesCondition {@code (!(originalPrinter instanceof FieldFormatter)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iFieldFormatters[newField.getFieldType()] = newField;
 *  */
    @Test
    public void testAppendSuffix_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iFieldType", 1073741824);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:609) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iElementPairs.size() > 0
 *  */
    @Test
    public void testAppendSuffix_ThrowNullPointerException1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:591) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iElementPairs.size() > 0): True}
 * @utbot.executesCondition {@code (originalPrinter == null): False}
 * @utbot.executesCondition {@code (originalParser == null): False}
 * @utbot.executesCondition {@code (originalPrinter != originalParser): False}
 * @utbot.executesCondition {@code (!(originalPrinter instanceof FieldFormatter)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iFieldFormatters[newField.getFieldType()] = newField;
 *  */
    @Test
    public void testAppendSuffix_ThrowNullPointerException_11() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        PeriodFormatterBuilder.SimpleAffix simpleAffix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        iElementPairs.add(simpleAffix);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iSuffix", simpleAffix);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:609) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendSuffixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSuffix", periodFieldAffixType);
        appendSuffixMethod.setAccessible(true);
        java.lang.Object[] appendSuffixMethodArguments = new java.lang.Object[1];
        appendSuffixMethodArguments[0] = ((Object) null);
        try {
            appendSuffixMethod.invoke(periodFormatterBuilder, appendSuffixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSuffix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSuffix(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return appendSuffix(new PluralAffix(singularText, pluralText));}
 *  */
    @Test
    public void testAppendSuffix_ReturnAppendSuffix_11() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        PeriodFormatterBuilder.CompositeAffix iPrefix = ((PeriodFormatterBuilder.CompositeAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iPrefix", iPrefix);
        PeriodFormatterBuilder.CompositeAffix iSuffix = ((PeriodFormatterBuilder.CompositeAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iSuffix", iSuffix);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        String string = "";
        String string1 = "";
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 0));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSuffix(string, string1);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters0 == finalPeriodFormatterBuilderIFieldFormatters0);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return appendSuffix(new PluralAffix(singularText, pluralText));}
 *  */
    @Test
    public void testAppendSuffix_ReturnAppendSuffix1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        String string = "";
        String string1 = "";
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 0));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSuffix(string, string1);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters0 == finalPeriodFormatterBuilderIFieldFormatters0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSuffix(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (singularText == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: singularText == null || pluralText == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_ThrowIllegalArgumentException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendSuffix(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (singularText == null): False}
 * @utbot.executesCondition {@code (pluralText == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: singularText == null || pluralText == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_ThrowIllegalArgumentException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        periodFormatterBuilder.appendSuffix(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (singularText == null): False}
 * @utbot.executesCondition {@code (pluralText == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new PluralAffix(singularText, pluralText));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        
        periodFormatterBuilder.appendSuffix(string, string1);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (singularText == null): False}
 * @utbot.executesCondition {@code (pluralText == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new PluralAffix(singularText, pluralText));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_22() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        
        periodFormatterBuilder.appendSuffix(string, string1);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (singularText == null): False}
 * @utbot.executesCondition {@code (pluralText == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new PluralAffix(singularText, pluralText));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_12() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        String string = "";
        iElementPairs.add(string);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(iElementPairs);
        iElementPairs.add(iElementPairs);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        Object object1 = createInstance("java.lang.Object");
        iElementPairs.add(object1);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string1 = "";
        
        periodFormatterBuilder.appendSuffix(string1, string);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (singularText == null): False}
 * @utbot.executesCondition {@code (pluralText == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new PluralAffix(singularText, pluralText));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_42() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.PluralAffix iPrefix = ((PeriodFormatterBuilder.PluralAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(iPrefix);
        iElementPairs.add(iPrefix);
        iElementPairs.add(null);
        iElementPairs.add(null);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        
        periodFormatterBuilder.appendSuffix(string, string1);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (singularText == null): False}
 * @utbot.executesCondition {@code (pluralText == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSuffix(new PluralAffix(singularText, pluralText));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_ThrowIllegalStateException_32() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        
        periodFormatterBuilder.appendSuffix(string, string1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSuffix(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return appendSuffix(new PluralAffix(singularText, pluralText));
 *  */
    @Test
    public void testAppendSuffix_ThrowIndexOutOfBoundsException2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:592)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:576) */
        periodFormatterBuilder.appendSuffix(string, string1);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return appendSuffix(new PluralAffix(singularText, pluralText));
 *  */
    @Test
    public void testAppendSuffix_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        setField(fieldFormatter, "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter", "iFieldType", Integer.MIN_VALUE);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(iElementPairs);
        iElementPairs.add(iElementPairs);
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        String string = "";
        String string1 = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:609)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:576) */
        periodFormatterBuilder.appendSuffix(string, string1);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return appendSuffix(new PluralAffix(singularText, pluralText));
 *  */
    @Test
    public void testAppendSuffix_ThrowNullPointerException2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        String string1 = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:591)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:576) */
        periodFormatterBuilder.appendSuffix(string, string1);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSuffix(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return appendSuffix(new PluralAffix(singularText, pluralText));
 *  */
    @Test
    public void testAppendSuffix_ThrowNullPointerException_12() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        iElementPairs.add(fieldFormatter);
        iElementPairs.add(fieldFormatter);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSuffix] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:609)
            org.joda.time.format.PeriodFormatterBuilder.appendSuffix(PeriodFormatterBuilder.java:576) */
        periodFormatterBuilder.appendSuffix(string, string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsBefore
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSeparatorIfFieldsBefore(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparatorIfFieldsBefore(java.lang.String)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.returnsFrom {@code return appendSeparator(text, text, null, true, false);}
 *  */
    @Test
    public void testAppendSeparatorIfFieldsBefore_PeriodFormatterBuilderAppendSeparator() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparatorIfFieldsBefore(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparatorIfFieldsBefore(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparatorIfFieldsBefore(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return appendSeparator(text, text, null, true, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparatorIfFieldsBefore_ThrowIllegalArgumentException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendSeparatorIfFieldsBefore(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparatorIfFieldsBefore(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSeparator(text, text, null, true, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparatorIfFieldsBefore_ThrowIllegalStateException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        String string = "";
        
        periodFormatterBuilder.appendSeparatorIfFieldsBefore(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSeparatorIfFieldsBefore(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparatorIfFieldsBefore(java.lang.String)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return appendSeparator(text, text, null, true, false);
 *  */
    @Test
    public void testAppendSeparatorIfFieldsBefore_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsBefore] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:738)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsBefore(PeriodFormatterBuilder.java:672) */
        periodFormatterBuilder.appendSeparatorIfFieldsBefore(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSeparatorIfFieldsBefore(java.lang.String)
    
    @Test
    public void testAppendSeparatorIfFieldsBefore1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparatorIfFieldsBefore(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparatorIfFieldsBefore(java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparatorIfFieldsBefore2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(object);
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        periodFormatterBuilder.appendSeparatorIfFieldsBefore(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendSeparatorIfFieldsBefore(java.lang.String)
    
    @Test
    public void testAppendSeparatorIfFieldsBefore3() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        Object object1 = createInstance("java.lang.Object");
        iElementPairs.add(object1);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsBefore] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsBefore(PeriodFormatterBuilder.java:672) */
        periodFormatterBuilder.appendSeparatorIfFieldsBefore(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.minimumPrintedDigits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minimumPrintedDigits(int)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#minimumPrintedDigits(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMinimumPrintedDigits_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.minimumPrintedDigits(-255);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.printZeroRarelyFirst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printZeroRarelyFirst()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#printZeroRarelyFirst()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPrintZeroRarelyFirst_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.printZeroRarelyFirst();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        int finalPeriodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        
        assertEquals(1, finalPeriodFormatterBuilderIPrintZeroSetting);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.printZeroRarelyLast
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printZeroRarelyLast()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#printZeroRarelyLast()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPrintZeroRarelyLast_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.printZeroRarelyLast();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        int finalPeriodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        
        assertEquals(2, finalPeriodFormatterBuilderIPrintZeroSetting);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.maximumParsedDigits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maximumParsedDigits(int)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#maximumParsedDigits(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMaximumParsedDigits_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.maximumParsedDigits(-255);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsAfter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSeparatorIfFieldsAfter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparatorIfFieldsAfter(java.lang.String)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.returnsFrom {@code return appendSeparator(text, text, null, false, true);}
 *  */
    @Test
    public void testAppendSeparatorIfFieldsAfter_PeriodFormatterBuilderAppendSeparator() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            String string1 = " ";
            
            PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparatorIfFieldsAfter(string1);
            
            int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
            int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
            assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
            
            int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
            int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
            assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
            
            int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
            int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
            assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
            
            boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
            assertFalse(actualIRejectSignedValues);
            
            PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
            assertNull(actualIPrefix);
            
            List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
            List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
            assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
            
            boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
            assertFalse(actualINotPrinter);
            
            boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
            assertFalse(actualINotParser);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            assertNull(actualIFieldFormatters);
            
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparatorIfFieldsAfter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparatorIfFieldsAfter(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return appendSeparator(text, text, null, false, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparatorIfFieldsAfter_ThrowIllegalArgumentException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendSeparatorIfFieldsAfter(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparatorIfFieldsAfter(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSeparator(text, text, null, false, true);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparatorIfFieldsAfter_ThrowIllegalStateException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        String string = "";
        
        periodFormatterBuilder.appendSeparatorIfFieldsAfter(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSeparatorIfFieldsAfter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparatorIfFieldsAfter(java.lang.String)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return appendSeparator(text, text, null, false, true);
 *  */
    @Test
    public void testAppendSeparatorIfFieldsAfter_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsAfter] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:738)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsAfter(PeriodFormatterBuilder.java:652) */
        periodFormatterBuilder.appendSeparatorIfFieldsAfter(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSeparatorIfFieldsAfter(java.lang.String)
    
    @Test
    public void testAppendSeparatorIfFieldsAfter1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparatorIfFieldsAfter(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    
    @Test
    public void testAppendSeparatorIfFieldsAfter2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparatorIfFieldsAfter(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparatorIfFieldsAfter(java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparatorIfFieldsAfter3() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        periodFormatterBuilder.appendSeparatorIfFieldsAfter(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendSeparatorIfFieldsAfter(java.lang.String)
    
    @Test
    public void testAppendSeparatorIfFieldsAfter4() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsAfter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsAfter(PeriodFormatterBuilder.java:652) */
        periodFormatterBuilder.appendSeparatorIfFieldsAfter(string);
    }
    
    @Test
    public void testAppendSeparatorIfFieldsAfter5() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsAfter] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsAfter(PeriodFormatterBuilder.java:652) */
        periodFormatterBuilder.appendSeparatorIfFieldsAfter(string);
    }
    
    @Test
    public void testAppendSeparatorIfFieldsAfter6() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsAfter] produces [java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparatorIfFieldsAfter(PeriodFormatterBuilder.java:652) */
        periodFormatterBuilder.appendSeparatorIfFieldsAfter(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.printZeroIfSupported
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printZeroIfSupported()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#printZeroIfSupported()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPrintZeroIfSupported_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.printZeroIfSupported();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        int finalPeriodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        
        assertEquals(3, finalPeriodFormatterBuilderIPrintZeroSetting);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithMillis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSecondsWithMillis()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSecondsWithMillis()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendSecondsWithMillis_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null, null, null, null, null, null, null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 8));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSecondsWithMillis();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters4 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters4, 2));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters5 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters5, 3));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters6 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters6, 4));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters7 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters7, 5));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters8 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters8, 6));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters9 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters9, 7));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters10 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters10, 8));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters8 == finalPeriodFormatterBuilderIFieldFormatters8);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters2);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters3);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters4);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters5);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters6);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters7);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSecondsWithMillis()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSecondsWithMillis()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(SECONDS_MILLIS);
 *  */
    @Test
    public void testAppendSecondsWithMillis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithMillis(PeriodFormatterBuilder.java:488) */
        periodFormatterBuilder.appendSecondsWithMillis();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSecondsWithMillis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(SECONDS_MILLIS);
 *  */
    @Test
    public void testAppendSecondsWithMillis_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithMillis] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithMillis(PeriodFormatterBuilder.java:488) */
        periodFormatterBuilder.appendSecondsWithMillis();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSecondsWithMillis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendSecondsWithMillis_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithMillis] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithMillis(PeriodFormatterBuilder.java:488) */
        periodFormatterBuilder.appendSecondsWithMillis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithOptionalMillis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSecondsWithOptionalMillis()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSecondsWithOptionalMillis()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendSecondsWithOptionalMillis_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null, null, null, null, null, null, null, null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters9 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 9));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSecondsWithOptionalMillis();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters4 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters4, 2));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters5 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters5, 3));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters6 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters6, 4));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters7 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters7, 5));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters8 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters8, 6));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters9 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters9, 7));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters10 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters10, 8));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters11 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters9 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters11, 9));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters9 == finalPeriodFormatterBuilderIFieldFormatters9);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters2);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters3);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters4);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters5);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters6);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters7);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSecondsWithOptionalMillis()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSecondsWithOptionalMillis()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(SECONDS_OPTIONAL_MILLIS);
 *  */
    @Test
    public void testAppendSecondsWithOptionalMillis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithOptionalMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 2]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithOptionalMillis(PeriodFormatterBuilder.java:500) */
        periodFormatterBuilder.appendSecondsWithOptionalMillis();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSecondsWithOptionalMillis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(SECONDS_OPTIONAL_MILLIS);
 *  */
    @Test
    public void testAppendSecondsWithOptionalMillis_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithOptionalMillis] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithOptionalMillis(PeriodFormatterBuilder.java:500) */
        periodFormatterBuilder.appendSecondsWithOptionalMillis();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSecondsWithOptionalMillis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendSecondsWithOptionalMillis_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithOptionalMillis] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendSecondsWithOptionalMillis(PeriodFormatterBuilder.java:500) */
        periodFormatterBuilder.appendSecondsWithOptionalMillis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendField(int)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendField(int)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int,int)
 *  */
    @Test
    public void testAppendField_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 1));
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class intType = int.class;
        Method appendFieldMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendField", intType);
        appendFieldMethod.setAccessible(true);
        java.lang.Object[] appendFieldMethodArguments = new java.lang.Object[1];
        appendFieldMethodArguments[0] = 1;
        appendFieldMethod.invoke(periodFormatterBuilder, appendFieldMethodArguments);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters1, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 1));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters1 == finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendField(int)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendField(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(type, iMinPrintedDigits);
 *  */
    @Test
    public void testAppendField_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 2]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class intType = int.class;
        Method appendFieldMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendField", intType);
        appendFieldMethod.setAccessible(true);
        java.lang.Object[] appendFieldMethodArguments = new java.lang.Object[1];
        appendFieldMethodArguments[0] = 33;
        try {
            appendFieldMethod.invoke(periodFormatterBuilder, appendFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendField(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(type, iMinPrintedDigits);
 *  */
    @Test
    public void testAppendField_ThrowNullPointerException() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -256);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        PeriodFormatterBuilder.CompositeAffix iPrefix = ((PeriodFormatterBuilder.CompositeAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendField] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class intType = int.class;
        Method appendFieldMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendField", intType);
        appendFieldMethod.setAccessible(true);
        java.lang.Object[] appendFieldMethodArguments = new java.lang.Object[1];
        appendFieldMethodArguments[0] = -255;
        try {
            appendFieldMethod.invoke(periodFormatterBuilder, appendFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendField(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(type, iMinPrintedDigits);
 *  */
    @Test
    public void testAppendField_ThrowNullPointerException_1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendField] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class intType = int.class;
        Method appendFieldMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendField", intType);
        appendFieldMethod.setAccessible(true);
        java.lang.Object[] appendFieldMethodArguments = new java.lang.Object[1];
        appendFieldMethodArguments[0] = -255;
        try {
            appendFieldMethod.invoke(periodFormatterBuilder, appendFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendField(int, int)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendField(int,int)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)
 *  */
    @Test
    public void testAppendField_PeriodFormatterBuilderAppend0() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 1));
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class intType = int.class;
        Method appendFieldMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendField", intType, intType);
        appendFieldMethod.setAccessible(true);
        java.lang.Object[] appendFieldMethodArguments = new java.lang.Object[2];
        appendFieldMethodArguments[0] = 1;
        appendFieldMethodArguments[1] = -255;
        appendFieldMethod.invoke(periodFormatterBuilder, appendFieldMethodArguments);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters1, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 1));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters1 == finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendField(int, int)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendField(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iFieldFormatters[type] = field;
 *  */
    @Test
    public void testAppendField_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        PeriodFormatterBuilder.CompositeAffix iPrefix = ((PeriodFormatterBuilder.CompositeAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class intType = int.class;
        Method appendFieldMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendField", intType, intType);
        appendFieldMethod.setAccessible(true);
        java.lang.Object[] appendFieldMethodArguments = new java.lang.Object[2];
        appendFieldMethodArguments[0] = 129;
        appendFieldMethodArguments[1] = -255;
        try {
            appendFieldMethod.invoke(periodFormatterBuilder, appendFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendField(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iFieldFormatters[type] = field;
 *  */
    @Test
    public void testAppendField_ThrowNullPointerException1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendField] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class intType = int.class;
        Method appendFieldMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendField", intType, intType);
        appendFieldMethod.setAccessible(true);
        java.lang.Object[] appendFieldMethodArguments = new java.lang.Object[2];
        appendFieldMethodArguments[0] = -255;
        appendFieldMethodArguments[1] = -254;
        try {
            appendFieldMethod.invoke(periodFormatterBuilder, appendFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendField(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append0(field, field);
 *  */
    @Test
    public void testAppendField_ThrowNullPointerException_11() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendField] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class intType = int.class;
        Method appendFieldMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendField", intType, intType);
        appendFieldMethod.setAccessible(true);
        java.lang.Object[] appendFieldMethodArguments = new java.lang.Object[2];
        appendFieldMethodArguments[0] = -255;
        appendFieldMethodArguments[1] = -255;
        try {
            appendFieldMethod.invoke(periodFormatterBuilder, appendFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.createComposite
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createComposite(java.util.List)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.activatesSwitch {@code switch(elementPairs.size()) case: 0}
 *  */
    @Test
    public void testCreateComposite_SwitchElementPairsSizeCase0() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            ArrayList arrayList = new ArrayList();
            
            Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
            Class arrayListType = Class.forName("java.util.List");
            Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
            createCompositeMethod.setAccessible(true);
            java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
            createCompositeMethodArguments[0] = arrayList;
            java.lang.Object[] actual = ((java.lang.Object[]) createCompositeMethod.invoke(null, createCompositeMethodArguments));
            
            java.lang.Object[] expected = new java.lang.Object[2];
            expected[0] = ((Object) empty);
            expected[1] = ((Object) empty);
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.returnsFrom {@code return new Object[] { comp, comp };}
 *  */
    @Test
    public void testCreateComposite_ReturnNewArrayOfObject_1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        org.joda.time.format.PeriodParser[] iParsers = {};
        setField(composite, "org.joda.time.format.PeriodFormatterBuilder$Composite", "iParsers", iParsers);
        arrayList.add(composite);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = arrayList;
        java.lang.Object[] actual = ((java.lang.Object[]) createCompositeMethod.invoke(null, createCompositeMethodArguments));
        
        java.lang.Object[] expected = new java.lang.Object[2];
        PeriodFormatterBuilder.Composite composite1 = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        expected[0] = ((Object) composite1);
        expected[1] = ((Object) composite1);
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.returnsFrom {@code return new Object[] { comp, comp };}
 *  */
    @Test
    public void testCreateComposite_ReturnNewArrayOfObject_3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = arrayList;
        java.lang.Object[] actual = ((java.lang.Object[]) createCompositeMethod.invoke(null, createCompositeMethodArguments));
        
        java.lang.Object[] expected = new java.lang.Object[2];
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        expected[0] = ((Object) composite);
        expected[1] = ((Object) composite);
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.returnsFrom {@code return new Object[] { comp, comp };}
 *  */
    @Test
    public void testCreateComposite_ReturnNewArrayOfObject_4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        org.joda.time.format.PeriodPrinter[] iPrinters = {};
        setField(composite, "org.joda.time.format.PeriodFormatterBuilder$Composite", "iPrinters", iPrinters);
        arrayList.add(composite);
        arrayList.add(null);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = arrayList;
        java.lang.Object[] actual = ((java.lang.Object[]) createCompositeMethod.invoke(null, createCompositeMethodArguments));
        
        java.lang.Object[] expected = new java.lang.Object[2];
        PeriodFormatterBuilder.Composite composite1 = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        expected[0] = ((Object) composite1);
        expected[1] = ((Object) composite1);
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.returnsFrom {@code return new Object[] { comp, comp };}
 *  */
    @Test
    public void testCreateComposite_ReturnNewArrayOfObject() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        arrayList.add(composite);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = arrayList;
        java.lang.Object[] actual = ((java.lang.Object[]) createCompositeMethod.invoke(null, createCompositeMethodArguments));
        
        java.lang.Object[] expected = new java.lang.Object[2];
        PeriodFormatterBuilder.Composite composite1 = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        expected[0] = ((Object) composite1);
        expected[1] = ((Object) composite1);
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.returnsFrom {@code return new Object[] { comp, comp };}
 *  */
    @Test
    public void testCreateComposite_ReturnNewArrayOfObject_2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        PeriodFormatterBuilder.Literal literal = new PeriodFormatterBuilder.Literal(null);
        arrayList.add(literal);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = arrayList;
        java.lang.Object[] actual = ((java.lang.Object[]) createCompositeMethod.invoke(null, createCompositeMethodArguments));
        
        java.lang.Object[] expected = new java.lang.Object[2];
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        org.joda.time.format.PeriodParser[] iParsers = new org.joda.time.format.PeriodParser[1];
        PeriodFormatterBuilder.Literal literal1 = ((PeriodFormatterBuilder.Literal) createInstance("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        iParsers[0] = ((PeriodParser) literal1);
        setField(composite, "org.joda.time.format.PeriodFormatterBuilder$Composite", "iParsers", iParsers);
        expected[0] = ((Object) composite);
        expected[1] = ((Object) composite);
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.returnsFrom {@code return new Object[] { comp, comp };}
 *  */
    @Test
    public void testCreateComposite_ReturnNewArrayOfObject_5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = new PeriodFormatterBuilder.FieldFormatter(0, 0, 0, false, 0, null, null, null);
        arrayList.add(fieldFormatter);
        arrayList.add(null);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = arrayList;
        java.lang.Object[] actual = ((java.lang.Object[]) createCompositeMethod.invoke(null, createCompositeMethodArguments));
        
        java.lang.Object[] expected = new java.lang.Object[2];
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        org.joda.time.format.PeriodPrinter[] iPrinters = new org.joda.time.format.PeriodPrinter[1];
        PeriodFormatterBuilder.FieldFormatter fieldFormatter1 = ((PeriodFormatterBuilder.FieldFormatter) createInstance("org.joda.time.format.PeriodFormatterBuilder$FieldFormatter"));
        iPrinters[0] = ((PeriodPrinter) fieldFormatter1);
        setField(composite, "org.joda.time.format.PeriodFormatterBuilder$Composite", "iPrinters", iPrinters);
        expected[0] = ((Object) composite);
        expected[1] = ((Object) composite);
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createComposite(java.util.List)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.activatesSwitch {@code switch(elementPairs.size()) case: 1}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return new Object[] { elementPairs.get(0), elementPairs.get(1) };
 *  */
    @Test
    public void testCreateComposite_ThrowIndexOutOfBoundsException() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.createComposite] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = arrayList;
        try {
            createCompositeMethod.invoke(null, createCompositeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Composite comp = new Composite(elementPairs);
 *  */
    @Test
    public void testCreateComposite_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        arrayList.add(separator);
        arrayList.add(null);
        arrayList.add(separator);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.createComposite] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = arrayList;
        try {
            createCompositeMethod.invoke(null, createCompositeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Composite comp = new Composite(elementPairs);
 *  */
    @Test
    public void testCreateComposite_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        org.joda.time.format.PeriodParser[] iParsers = {null};
        setField(composite, "org.joda.time.format.PeriodFormatterBuilder$Composite", "iParsers", iParsers);
        arrayList.add(composite);
        arrayList.add(null);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.createComposite] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class arrayListType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", arrayListType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = arrayList;
        try {
            createCompositeMethod.invoke(null, createCompositeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#createComposite(java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(elementPairs.size())
 *  */
    @Test
    public void testCreateComposite_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.createComposite] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:816) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class listType = Class.forName("java.util.List");
        Method createCompositeMethod = periodFormatterBuilderClazz.getDeclaredMethod("createComposite", listType);
        createCompositeMethod.setAccessible(true);
        java.lang.Object[] createCompositeMethodArguments = new java.lang.Object[1];
        createCompositeMethodArguments[0] = ((Object) null);
        try {
            createCompositeMethod.invoke(null, createCompositeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)}
 * @utbot.executesCondition {@code (useAfter): False}
 *  */
    @Test
    public void testAppendSeparator_NotUseAfter() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = string;
        appendSeparatorMethodArguments[1] = string;
        appendSeparatorMethodArguments[2] = ((Object) null);
        appendSeparatorMethodArguments[3] = false;
        appendSeparatorMethodArguments[4] = false;
        PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments));
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)}
 * @utbot.executesCondition {@code (useAfter): True}
 * @utbot.executesCondition {@code (useBefore == false): False}
 *  */
    @Test
    public void testAppendSeparator_UseBeforeNotEqualsFalse() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = string;
        appendSeparatorMethodArguments[1] = string;
        appendSeparatorMethodArguments[2] = ((Object) null);
        appendSeparatorMethodArguments[3] = true;
        appendSeparatorMethodArguments[4] = true;
        PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments));
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)}
 * @utbot.executesCondition {@code (useAfter): True}
 * @utbot.executesCondition {@code (useBefore == false): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testAppendSeparator_UseBeforeEqualsFalse_1() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            String string1 = " ";
            java.lang.String[] stringArray = {};
            
            Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
            Class string1Type = Class.forName("java.lang.String");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class booleanType = boolean.class;
            Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", string1Type, string1Type, stringArrayType, booleanType, booleanType);
            appendSeparatorMethod.setAccessible(true);
            java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
            appendSeparatorMethodArguments[0] = string1;
            appendSeparatorMethodArguments[1] = string1;
            appendSeparatorMethodArguments[2] = ((Object) stringArray);
            appendSeparatorMethodArguments[3] = false;
            appendSeparatorMethodArguments[4] = true;
            PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments));
            
            int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
            int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
            assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
            
            int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
            int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
            assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
            
            int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
            int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
            assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
            
            boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
            assertFalse(actualIRejectSignedValues);
            
            PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
            assertNull(actualIPrefix);
            
            List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
            List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
            assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
            
            boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
            assertFalse(actualINotPrinter);
            
            boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
            assertFalse(actualINotParser);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            assertNull(actualIFieldFormatters);
            
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)}
 * @utbot.executesCondition {@code (useAfter): True}
 * @utbot.executesCondition {@code (useBefore == false): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testAppendSeparator_UseBeforeEqualsFalse() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            String string1 = " ";
            
            Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
            Class string1Type = Class.forName("java.lang.String");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class booleanType = boolean.class;
            Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", string1Type, string1Type, stringArrayType, booleanType, booleanType);
            appendSeparatorMethod.setAccessible(true);
            java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
            appendSeparatorMethodArguments[0] = string1;
            appendSeparatorMethodArguments[1] = string1;
            appendSeparatorMethodArguments[2] = ((Object) null);
            appendSeparatorMethodArguments[3] = false;
            appendSeparatorMethodArguments[4] = true;
            PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments));
            
            int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
            int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
            assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
            
            int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
            int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
            assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
            
            int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
            int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
            assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
            
            boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
            assertFalse(actualIRejectSignedValues);
            
            PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
            assertNull(actualIPrefix);
            
            List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
            List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
            assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
            
            boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
            assertFalse(actualINotPrinter);
            
            boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
            assertFalse(actualINotParser);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            assertNull(actualIFieldFormatters);
            
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)}
 * @utbot.executesCondition {@code (useAfter): True}
 * @utbot.executesCondition {@code (useBefore == false): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testAppendSeparator_UseBeforeEqualsFalse_2() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            String string1 = "";
            
            Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
            Class string1Type = Class.forName("java.lang.String");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class booleanType = boolean.class;
            Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", string1Type, string1Type, stringArrayType, booleanType, booleanType);
            appendSeparatorMethod.setAccessible(true);
            java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
            appendSeparatorMethodArguments[0] = string1;
            appendSeparatorMethodArguments[1] = string;
            appendSeparatorMethodArguments[2] = ((Object) null);
            appendSeparatorMethodArguments[3] = false;
            appendSeparatorMethodArguments[4] = true;
            PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments));
            
            int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
            int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
            assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
            
            int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
            int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
            assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
            
            int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
            int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
            assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
            
            boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
            assertFalse(actualIRejectSignedValues);
            
            PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
            assertNull(actualIPrefix);
            
            List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
            List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
            assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
            
            boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
            assertFalse(actualINotPrinter);
            
            boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
            assertFalse(actualINotParser);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            assertNull(actualIFieldFormatters);
            
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: text == null || finalText == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_ThrowIllegalArgumentException() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = ((Object) null);
        appendSeparatorMethodArguments[1] = ((Object) null);
        appendSeparatorMethodArguments[2] = ((Object) null);
        appendSeparatorMethodArguments[3] = false;
        appendSeparatorMethodArguments[4] = false;
        try {
            appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.executesCondition {@code (finalText == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: text == null || finalText == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_ThrowIllegalArgumentException_1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = string;
        appendSeparatorMethodArguments[1] = ((Object) null);
        appendSeparatorMethodArguments[2] = ((Object) null);
        appendSeparatorMethodArguments[3] = false;
        appendSeparatorMethodArguments[4] = false;
        try {
            appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.executesCondition {@code (finalText == null): False}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: clearPrefix();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator_ThrowIllegalStateException() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        String string = "";
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = string;
        appendSeparatorMethodArguments[1] = string;
        appendSeparatorMethodArguments[2] = ((Object) null);
        appendSeparatorMethodArguments[3] = false;
        appendSeparatorMethodArguments[4] = false;
        try {
            appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.executesCondition {@code (finalText == null): False}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#clearPrefix()
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: pairs.size() == 0
 *  */
    @Test
    public void testAppendSeparator_ThrowNullPointerException() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:738) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = string;
        appendSeparatorMethodArguments[1] = string;
        appendSeparatorMethodArguments[2] = ((Object) null);
        appendSeparatorMethodArguments[3] = false;
        appendSeparatorMethodArguments[4] = false;
        try {
            appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;, boolean, boolean)
    
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator1() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        java.lang.String[] stringArray = new java.lang.String[17];
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = string;
        appendSeparatorMethodArguments[1] = string1;
        appendSeparatorMethodArguments[2] = ((Object) stringArray);
        appendSeparatorMethodArguments[3] = false;
        appendSeparatorMethodArguments[4] = false;
        try {
            appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;, boolean, boolean)
    
    @Test
    public void testAppendSeparator2() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        java.lang.String[] stringArray = new java.lang.String[17];
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = string;
        appendSeparatorMethodArguments[1] = string1;
        appendSeparatorMethodArguments[2] = ((Object) stringArray);
        appendSeparatorMethodArguments[3] = false;
        appendSeparatorMethodArguments[4] = false;
        try {
            appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendSeparator3() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(periodFormatterBuilder);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        java.lang.String[] stringArray = new java.lang.String[17];
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = string;
        appendSeparatorMethodArguments[1] = string1;
        appendSeparatorMethodArguments[2] = ((Object) stringArray);
        appendSeparatorMethodArguments[3] = false;
        appendSeparatorMethodArguments[4] = false;
        try {
            appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendSeparator4() throws Throwable  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            String string1 = "\u0000\u0000\u0000\u0000\u0000";
            String string2 = "\u0000\u0000\u0000\u0000\u0000";
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
            
            /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.NullPointerException]
                java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2054)
                java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2047)
                java.base/java.util.TreeMap.put(TreeMap.java:795)
                java.base/java.util.TreeMap.put(TreeMap.java:534)
                java.base/java.util.TreeSet.add(TreeSet.java:255)
                org.joda.time.format.PeriodFormatterBuilder$Separator.<init>(PeriodFormatterBuilder.java:1608)
                org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:740) */
            Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
            Class string1Type = Class.forName("java.lang.String");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class booleanType = boolean.class;
            Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", string1Type, string1Type, stringArrayType, booleanType, booleanType);
            appendSeparatorMethod.setAccessible(true);
            java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
            appendSeparatorMethodArguments[0] = string1;
            appendSeparatorMethodArguments[1] = string2;
            appendSeparatorMethodArguments[2] = ((Object) stringArray);
            appendSeparatorMethodArguments[3] = false;
            appendSeparatorMethodArguments[4] = true;
            try {
                appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testAppendSeparator5() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        iElementPairs.add(periodFormatterBuilder);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        java.lang.String[] stringArray = new java.lang.String[17];
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.NullPointerException]
            java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2054)
            java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2047)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            java.base/java.util.TreeSet.add(TreeSet.java:255)
            org.joda.time.format.PeriodFormatterBuilder$Separator.<init>(PeriodFormatterBuilder.java:1608)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:766) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class booleanType = boolean.class;
        Method appendSeparatorMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendSeparator", stringType, stringType, stringArrayType, booleanType, booleanType);
        appendSeparatorMethod.setAccessible(true);
        java.lang.Object[] appendSeparatorMethodArguments = new java.lang.Object[5];
        appendSeparatorMethodArguments[0] = string;
        appendSeparatorMethodArguments[1] = string1;
        appendSeparatorMethodArguments[2] = ((Object) stringArray);
        appendSeparatorMethodArguments[3] = false;
        appendSeparatorMethodArguments[4] = false;
        try {
            appendSeparatorMethod.invoke(periodFormatterBuilder, appendSeparatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.returnsFrom {@code return appendSeparator(text, text, null, true, true);}
 *  */
    @Test
    public void testAppendSeparator_PeriodFormatterBuilderAppendSeparator() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparator(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return appendSeparator(text, text, null, true, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_ThrowIllegalArgumentException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendSeparator(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSeparator(text, text, null, true, true);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator_ThrowIllegalStateException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        String string = "";
        
        periodFormatterBuilder.appendSeparator(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSeparator(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return appendSeparator(text, text, null, true, true);
 *  */
    @Test
    public void testAppendSeparator_ThrowNullPointerException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:738)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:632) */
        periodFormatterBuilder.appendSeparator(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSeparator(java.lang.String)
    
    @Test
    public void testAppendSeparator6() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        Object object1 = createInstance("java.lang.Object");
        iElementPairs.add(object1);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparator(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    
    @Test
    public void testAppendSeparator7() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparator(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparator(java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator8() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(object);
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        periodFormatterBuilder.appendSeparator(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendSeparator(java.lang.String)
    
    @Test
    public void testAppendSeparator9() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:632) */
        periodFormatterBuilder.appendSeparator(string);
    }
    
    @Test
    public void testAppendSeparator10() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        Object object1 = createInstance("java.lang.Object");
        iElementPairs.add(object1);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:632) */
        periodFormatterBuilder.appendSeparator(string);
    }
    
    @Test
    public void testAppendSeparator11() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(object);
        iElementPairs.add(object);
        iElementPairs.add(object);
        Object object1 = createInstance("java.lang.Object");
        iElementPairs.add(object1);
        iElementPairs.add(object);
        iElementPairs.add(object1);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:632) */
        periodFormatterBuilder.appendSeparator(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.returnsFrom {@code return appendSeparator(text, finalText, variants, true, true);}
 *  */
    @Test
    public void testAppendSeparator_PeriodFormatterBuilderAppendSeparator1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparator(string, string, null);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return appendSeparator(text, finalText, variants, true, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_ThrowIllegalArgumentException2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        periodFormatterBuilder.appendSeparator(string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return appendSeparator(text, finalText, variants, true, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_ThrowIllegalArgumentException_11() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendSeparator(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSeparator(text, finalText, variants, true, true);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator_ThrowIllegalStateException2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        String string = "";
        
        periodFormatterBuilder.appendSeparator(string, string, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return appendSeparator(text, finalText, variants, true, true);
 *  */
    @Test
    public void testAppendSeparator_ThrowNullPointerException2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:738)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:724) */
        periodFormatterBuilder.appendSeparator(string, string, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;)
    
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator12() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        java.lang.String[] stringArray = new java.lang.String[17];
        
        periodFormatterBuilder.appendSeparator(string, string1, stringArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendSeparator(java.lang.String, java.lang.String, [Ljava.lang.String;)
    
    @Test
    public void testAppendSeparator13() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        java.lang.String[] stringArray = new java.lang.String[17];
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:724) */
        periodFormatterBuilder.appendSeparator(string, string1, stringArray);
    }
    
    @Test
    public void testAppendSeparator14() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        java.lang.String[] stringArray = new java.lang.String[17];
        iElementPairs.add(stringArray);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        String string1 = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.NullPointerException]
            java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2054)
            java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2047)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            java.base/java.util.TreeSet.add(TreeSet.java:255)
            org.joda.time.format.PeriodFormatterBuilder$Separator.<init>(PeriodFormatterBuilder.java:1608)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:766)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:724) */
        periodFormatterBuilder.appendSeparator(string, string1, stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSeparator(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.returnsFrom {@code return appendSeparator(text, finalText, null, true, true);}
 *  */
    @Test
    public void testAppendSeparator_PeriodFormatterBuilderAppendSeparator2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparator(string, string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparator(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return appendSeparator(text, finalText, null, true, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_ThrowIllegalArgumentException3() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendSeparator(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return appendSeparator(text, finalText, null, true, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_ThrowIllegalArgumentException_12() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        periodFormatterBuilder.appendSeparator(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return appendSeparator(text, finalText, null, true, true);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator_ThrowIllegalStateException3() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        String string = "";
        
        periodFormatterBuilder.appendSeparator(string, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSeparator(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String)}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendSeparator(java.lang.String,java.lang.String,java.lang.String[],boolean,boolean)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return appendSeparator(text, finalText, null, true, true);
 *  */
    @Test
    public void testAppendSeparator_ThrowNullPointerException3() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:738)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:697) */
        periodFormatterBuilder.appendSeparator(string, string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendSeparator(java.lang.String, java.lang.String)
    
    @Test
    public void testAppendSeparator15() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparator(string, string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    
    @Test
    public void testAppendSeparator16() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeparator(string, string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendSeparator(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator17() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        periodFormatterBuilder.appendSeparator(string, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendSeparator(java.lang.String, java.lang.String)
    
    @Test
    public void testAppendSeparator18() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:697) */
        periodFormatterBuilder.appendSeparator(string, string);
    }
    
    @Test
    public void testAppendSeparator19() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(periodFormatterBuilder);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:697) */
        periodFormatterBuilder.appendSeparator(string, string);
    }
    
    @Test
    public void testAppendSeparator20() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(periodFormatterBuilder);
        iElementPairs.add(periodFormatterBuilder);
        iElementPairs.add(periodFormatterBuilder);
        iElementPairs.add(periodFormatterBuilder);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(periodFormatterBuilder);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        String string = "";
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeparator] produces [java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:764)
            org.joda.time.format.PeriodFormatterBuilder.appendSeparator(PeriodFormatterBuilder.java:697) */
        periodFormatterBuilder.appendSeparator(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.clearPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearPrefix()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#clearPrefix()}
 * @utbot.executesCondition {@code (iPrefix != null): False}
 *  */
    @Test
    public void testClearPrefix_IPrefixEqualsNull() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Method clearPrefixMethod = periodFormatterBuilderClazz.getDeclaredMethod("clearPrefix");
        clearPrefixMethod.setAccessible(true);
        java.lang.Object[] clearPrefixMethodArguments = new java.lang.Object[0];
        clearPrefixMethod.invoke(periodFormatterBuilder, clearPrefixMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clearPrefix()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#clearPrefix()}
 * @utbot.executesCondition {@code (iPrefix != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: iPrefix != null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testClearPrefix_ThrowIllegalStateException() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Method clearPrefixMethod = periodFormatterBuilderClazz.getDeclaredMethod("clearPrefix");
        clearPrefixMethod.setAccessible(true);
        java.lang.Object[] clearPrefixMethodArguments = new java.lang.Object[0];
        try {
            clearPrefixMethod.invoke(periodFormatterBuilder, clearPrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.append0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append0(org.joda.time.format.PeriodPrinter, org.joda.time.format.PeriodParser)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (iNotPrinter |= (printer == null);): False}
 * @utbot.executesCondition {@code (iNotParser |= (parser == null);): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend0_Return_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class compositeType = Class.forName("org.joda.time.format.PeriodPrinter");
        Class periodParserType = Class.forName("org.joda.time.format.PeriodParser");
        Method append0Method = periodFormatterBuilderClazz.getDeclaredMethod("append0", compositeType, periodParserType);
        append0Method.setAccessible(true);
        java.lang.Object[] append0MethodArguments = new java.lang.Object[2];
        append0MethodArguments[0] = composite;
        append0MethodArguments[1] = ((Object) null);
        PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) append0Method.invoke(periodFormatterBuilder, append0MethodArguments));
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertTrue(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        boolean finalPeriodFormatterBuilderINotParser = ((Boolean) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        
        assertTrue(finalPeriodFormatterBuilderINotParser);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (iNotPrinter |= (printer == null);): False}
 * @utbot.executesCondition {@code (iNotParser |= (parser == null);): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend0_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        PeriodFormatterBuilder.Composite composite = ((PeriodFormatterBuilder.Composite) createInstance("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = new PeriodFormatterBuilder.FieldFormatter(0, 0, 0, false, 0, null, null, null);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class compositeType = Class.forName("org.joda.time.format.PeriodPrinter");
        Class fieldFormatterType = Class.forName("org.joda.time.format.PeriodParser");
        Method append0Method = periodFormatterBuilderClazz.getDeclaredMethod("append0", compositeType, fieldFormatterType);
        append0Method.setAccessible(true);
        java.lang.Object[] append0MethodArguments = new java.lang.Object[2];
        append0MethodArguments[0] = composite;
        append0MethodArguments[1] = fieldFormatter;
        PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) append0Method.invoke(periodFormatterBuilder, append0MethodArguments));
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.executesCondition {@code (iNotPrinter |= (printer == null);): True}
 * @utbot.executesCondition {@code (iNotParser |= (parser == null);): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend0_Return_2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodPrinterType = Class.forName("org.joda.time.format.PeriodPrinter");
        Class periodParserType = Class.forName("org.joda.time.format.PeriodParser");
        Method append0Method = periodFormatterBuilderClazz.getDeclaredMethod("append0", periodPrinterType, periodParserType);
        append0Method.setAccessible(true);
        java.lang.Object[] append0MethodArguments = new java.lang.Object[2];
        append0MethodArguments[0] = ((Object) null);
        append0MethodArguments[1] = ((Object) null);
        PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) append0Method.invoke(periodFormatterBuilder, append0MethodArguments));
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertTrue(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertTrue(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        boolean finalPeriodFormatterBuilderINotPrinter = ((Boolean) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        boolean finalPeriodFormatterBuilderINotParser = ((Boolean) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        
        assertTrue(finalPeriodFormatterBuilderINotPrinter);
        
        assertTrue(finalPeriodFormatterBuilderINotParser);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append0(org.joda.time.format.PeriodPrinter, org.joda.time.format.PeriodParser)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#append0(org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iElementPairs.add(printer);
 *  */
    @Test
    public void testAppend0_ThrowNullPointerException() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.append0] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786) */
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodPrinterType = Class.forName("org.joda.time.format.PeriodPrinter");
        Class periodParserType = Class.forName("org.joda.time.format.PeriodParser");
        Method append0Method = periodFormatterBuilderClazz.getDeclaredMethod("append0", periodPrinterType, periodParserType);
        append0Method.setAccessible(true);
        java.lang.Object[] append0MethodArguments = new java.lang.Object[2];
        append0MethodArguments[0] = ((Object) null);
        append0MethodArguments[1] = ((Object) null);
        try {
            append0Method.invoke(periodFormatterBuilder, append0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.toPrinter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toPrinter()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toPrinter()}
 * @utbot.executesCondition {@code (iNotPrinter): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToPrinter_INotPrinter() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        
        PeriodPrinter actual = periodFormatterBuilder.toPrinter();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toPrinter()}
 * @utbot.executesCondition {@code (iNotPrinter): False}
 * @utbot.returnsFrom {@code return toFormatter().getPrinter();}
 *  */
    @Test
    public void testToPrinter_NotINotPrinter() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {};
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] initialPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            PeriodFormatterBuilder.Literal actual = ((PeriodFormatterBuilder.Literal) periodFormatterBuilder.toPrinter());
            
            String emptyIText = ((String) getFieldValue(empty, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            String actualIText = ((String) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            assertEquals(emptyIText, actualIText);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] finalPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            assertFalse(initialPeriodFormatterBuilderIFieldFormatters == finalPeriodFormatterBuilderIFieldFormatters);
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toPrinter()}
 * @utbot.executesCondition {@code (iNotPrinter): False}
 * @utbot.returnsFrom {@code return toFormatter().getPrinter();}
 *  */
    @Test
    public void testToPrinter_NotINotPrinter_1() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser", true);
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {};
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] initialPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            PeriodFormatterBuilder.Literal actual = ((PeriodFormatterBuilder.Literal) periodFormatterBuilder.toPrinter());
            
            String emptyIText = ((String) getFieldValue(empty, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            String actualIText = ((String) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            assertEquals(emptyIText, actualIText);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] finalPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            assertFalse(initialPeriodFormatterBuilderIFieldFormatters == finalPeriodFormatterBuilderIFieldFormatters);
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toPrinter()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toPrinter()}
 * @utbot.executesCondition {@code (iNotPrinter): False}
 * @utbot.invokes {@link org.joda.time.format.PeriodFormatterBuilder#toFormatter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return toFormatter().getPrinter();
 *  */
    @Test
    public void testToPrinter_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toPrinter] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:798)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toPrinter(PeriodFormatterBuilder.java:144) */
        periodFormatterBuilder.toPrinter();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toPrinter()
    
    @Test
    public void testToPrinter1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toPrinter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toPrinter(PeriodFormatterBuilder.java:144) */
        periodFormatterBuilder.toPrinter();
    }
    
    @Test
    public void testToPrinter2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toPrinter] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList$SubList.get(ArrayList.java:1149)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:801)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toPrinter(PeriodFormatterBuilder.java:144) */
        periodFormatterBuilder.toPrinter();
    }
    
    @Test
    public void testToPrinter3() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toPrinter] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toPrinter(PeriodFormatterBuilder.java:144) */
        periodFormatterBuilder.toPrinter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(java.lang.String)}
 * @utbot.returnsFrom {@code return appendPrefix(new SimpleAffix(text));}
 *  */
    @Test
    public void testAppendPrefix_ReturnAppendPrefix() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        PeriodFormatterBuilder.PeriodFieldAffix initialPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendPrefix(string);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        String periodFormatterBuilderIPrefixIText = ((String) getFieldValue(periodFormatterBuilderIPrefix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText"));
        String actualIPrefixIText = ((String) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText"));
        assertEquals(periodFormatterBuilderIPrefixIText, actualIPrefixIText);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        PeriodFormatterBuilder.PeriodFieldAffix finalPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        assertFalse(initialPeriodFormatterBuilderIPrefix == finalPeriodFormatterBuilderIPrefix);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(java.lang.String)}
 * @utbot.returnsFrom {@code return appendPrefix(new SimpleAffix(text));}
 *  */
    @Test
    public void testAppendPrefix_ReturnAppendPrefix_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        String iText = "";
        setField(iPrefix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText", iText);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        
        PeriodFormatterBuilder.PeriodFieldAffix initialPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendPrefix(iText);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefixILeft = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilderIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iLeft"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefixILeft = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iLeft"));
        String periodFormatterBuilderIPrefixILeftIText = ((String) getFieldValue(periodFormatterBuilderIPrefixILeft, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText"));
        String actualIPrefixILeftIText = ((String) getFieldValue(actualIPrefixILeft, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText"));
        assertEquals(periodFormatterBuilderIPrefixILeftIText, actualIPrefixILeftIText);
        
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefixIRight = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilderIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iRight"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefixIRight = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iRight"));
        assertTrue(deepEquals(periodFormatterBuilderIPrefixIRight, actualIPrefixIRight));
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        PeriodFormatterBuilder.PeriodFieldAffix finalPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        assertFalse(initialPeriodFormatterBuilderIPrefix == finalPeriodFormatterBuilderIPrefix);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: text == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_ThrowIllegalArgumentException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendPrefix(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendPrefix(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return appendPrefix(new PluralAffix(singularText, pluralText));}
 *  */
    @Test
    public void testAppendPrefix_ReturnAppendPrefix1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        String string1 = "";
        
        PeriodFormatterBuilder.PeriodFieldAffix initialPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendPrefix(string, string1);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        String periodFormatterBuilderIPrefixISingularText = ((String) getFieldValue(periodFormatterBuilderIPrefix, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iSingularText"));
        String actualIPrefixISingularText = ((String) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iSingularText"));
        assertEquals(periodFormatterBuilderIPrefixISingularText, actualIPrefixISingularText);
        
        String periodFormatterBuilderIPrefixIPluralText = ((String) getFieldValue(periodFormatterBuilderIPrefix, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iPluralText"));
        String actualIPrefixIPluralText = ((String) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iPluralText"));
        assertEquals(periodFormatterBuilderIPrefixIPluralText, actualIPrefixIPluralText);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        PeriodFormatterBuilder.PeriodFieldAffix finalPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        assertFalse(initialPeriodFormatterBuilderIPrefix == finalPeriodFormatterBuilderIPrefix);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return appendPrefix(new PluralAffix(singularText, pluralText));}
 *  */
    @Test
    public void testAppendPrefix_ReturnAppendPrefix_11() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.PluralAffix iPrefix = ((PeriodFormatterBuilder.PluralAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$PluralAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        String string = "";
        String string1 = "";
        
        PeriodFormatterBuilder.PeriodFieldAffix initialPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendPrefix(string, string1);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefixILeft = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilderIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iLeft"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefixILeft = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iLeft"));
        String actualIPrefixILeftISingularText = ((String) getFieldValue(actualIPrefixILeft, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iSingularText"));
        assertNull(actualIPrefixILeftISingularText);
        
        String actualIPrefixILeftIPluralText = ((String) getFieldValue(actualIPrefixILeft, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iPluralText"));
        assertNull(actualIPrefixILeftIPluralText);
        
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefixIRight = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilderIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iRight"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefixIRight = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iRight"));
        String periodFormatterBuilderIPrefixIRightISingularText = ((String) getFieldValue(periodFormatterBuilderIPrefixIRight, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iSingularText"));
        String actualIPrefixIRightISingularText = ((String) getFieldValue(actualIPrefixIRight, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iSingularText"));
        assertEquals(periodFormatterBuilderIPrefixIRightISingularText, actualIPrefixIRightISingularText);
        
        String periodFormatterBuilderIPrefixIRightIPluralText = ((String) getFieldValue(periodFormatterBuilderIPrefixIRight, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iPluralText"));
        String actualIPrefixIRightIPluralText = ((String) getFieldValue(actualIPrefixIRight, "org.joda.time.format.PeriodFormatterBuilder$PluralAffix", "iPluralText"));
        assertEquals(periodFormatterBuilderIPrefixIRightIPluralText, actualIPrefixIRightIPluralText);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        PeriodFormatterBuilder.PeriodFieldAffix finalPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        assertFalse(initialPeriodFormatterBuilderIPrefix == finalPeriodFormatterBuilderIPrefix);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendPrefix(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (singularText == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: singularText == null || pluralText == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_ThrowIllegalArgumentException1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        periodFormatterBuilder.appendPrefix(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (singularText == null): False}
 * @utbot.executesCondition {@code (pluralText == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: singularText == null || pluralText == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_ThrowIllegalArgumentException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        String string = "";
        
        periodFormatterBuilder.appendPrefix(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendPrefix(org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iPrefix != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendPrefix_IPrefixEqualsNull() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.SimpleAffix simpleAffix = new PeriodFormatterBuilder.SimpleAffix(null);
        
        PeriodFormatterBuilder.PeriodFieldAffix initialPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class simpleAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendPrefixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendPrefix", simpleAffixType);
        appendPrefixMethod.setAccessible(true);
        java.lang.Object[] appendPrefixMethodArguments = new java.lang.Object[1];
        appendPrefixMethodArguments[0] = simpleAffix;
        PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) appendPrefixMethod.invoke(periodFormatterBuilder, appendPrefixMethodArguments));
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        String actualIPrefixIText = ((String) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText"));
        assertNull(actualIPrefixIText);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        PeriodFormatterBuilder.PeriodFieldAffix finalPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        assertFalse(initialPeriodFormatterBuilderIPrefix == finalPeriodFormatterBuilderIPrefix);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (iPrefix != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendPrefix_IPrefixNotEqualsNull() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        PeriodFormatterBuilder.CompositeAffix iPrefix = ((PeriodFormatterBuilder.CompositeAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        PeriodFormatterBuilder.SimpleAffix simpleAffix = new PeriodFormatterBuilder.SimpleAffix(null);
        
        PeriodFormatterBuilder.PeriodFieldAffix initialPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class simpleAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendPrefixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendPrefix", simpleAffixType);
        appendPrefixMethod.setAccessible(true);
        java.lang.Object[] appendPrefixMethodArguments = new java.lang.Object[1];
        appendPrefixMethodArguments[0] = simpleAffix;
        PeriodFormatterBuilder actual = ((PeriodFormatterBuilder) appendPrefixMethod.invoke(periodFormatterBuilder, appendPrefixMethodArguments));
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefixILeft = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilderIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iLeft"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefixILeft = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iLeft"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefixILeftILeft = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actualIPrefixILeft, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iLeft"));
        assertNull(actualIPrefixILeftILeft);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefixILeftIRight = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actualIPrefixILeft, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iRight"));
        assertNull(actualIPrefixILeftIRight);
        
        PeriodFormatterBuilder.PeriodFieldAffix periodFormatterBuilderIPrefixIRight = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilderIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iRight"));
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefixIRight = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actualIPrefix, "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix", "iRight"));
        String actualIPrefixIRightIText = ((String) getFieldValue(actualIPrefixIRight, "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix", "iText"));
        assertNull(actualIPrefixIRightIText);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        PeriodFormatterBuilder.PeriodFieldAffix finalPeriodFormatterBuilderIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        
        assertFalse(initialPeriodFormatterBuilderIPrefix == finalPeriodFormatterBuilderIPrefix);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendPrefix(org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendPrefix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix)}
 * @utbot.executesCondition {@code (prefix == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: prefix == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_ThrowIllegalArgumentException2() throws Throwable  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        Class periodFormatterBuilderClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class periodFieldAffixType = Class.forName("org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix");
        Method appendPrefixMethod = periodFormatterBuilderClazz.getDeclaredMethod("appendPrefix", periodFieldAffixType);
        appendPrefixMethod.setAccessible(true);
        java.lang.Object[] appendPrefixMethodArguments = new java.lang.Object[1];
        appendPrefixMethodArguments[0] = ((Object) null);
        try {
            appendPrefixMethod.invoke(periodFormatterBuilder, appendPrefixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.toParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toParser()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toParser()}
 * @utbot.executesCondition {@code (iNotParser): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testToParser_INotParser() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser", true);
        
        PeriodParser actual = periodFormatterBuilder.toParser();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toParser()}
 * @utbot.executesCondition {@code (iNotParser): False}
 * @utbot.returnsFrom {@code return toFormatter().getParser();}
 *  */
    @Test
    public void testToParser_NotINotParser() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {};
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] initialPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            PeriodFormatterBuilder.Literal actual = ((PeriodFormatterBuilder.Literal) periodFormatterBuilder.toParser());
            
            String emptyIText = ((String) getFieldValue(empty, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            String actualIText = ((String) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            assertEquals(emptyIText, actualIText);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] finalPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            assertFalse(initialPeriodFormatterBuilderIFieldFormatters == finalPeriodFormatterBuilderIFieldFormatters);
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toParser()}
 * @utbot.executesCondition {@code (iNotParser): False}
 * @utbot.returnsFrom {@code return toFormatter().getParser();}
 *  */
    @Test
    public void testToParser_NotINotParser_1() throws Exception  {
        PeriodFormatterBuilder.Literal prevEMPTY = PeriodFormatterBuilder.Literal.EMPTY;
        try {
            String string = "";
            PeriodFormatterBuilder.Literal empty = new PeriodFormatterBuilder.Literal(string);
            Class literalClazz = Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal");
            setStaticField(literalClazz, "EMPTY", empty);
            PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
            ArrayList iElementPairs = new ArrayList();
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {};
            setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] initialPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            PeriodFormatterBuilder.Literal actual = ((PeriodFormatterBuilder.Literal) periodFormatterBuilder.toParser());
            
            String emptyIText = ((String) getFieldValue(empty, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            String actualIText = ((String) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder$Literal", "iText"));
            assertEquals(emptyIText, actualIText);
            
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] finalPeriodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
            
            assertFalse(initialPeriodFormatterBuilderIFieldFormatters == finalPeriodFormatterBuilderIFieldFormatters);
        } finally {
            setStaticField(PeriodFormatterBuilder.Literal.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toParser()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toParser()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return toFormatter().getParser();
 *  */
    @Test
    public void testToParser_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toParser] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:798)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toParser(PeriodFormatterBuilder.java:163) */
        periodFormatterBuilder.toParser();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#toParser()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return toFormatter().getParser();
 *  */
    @Test
    public void testToParser_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toParser] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:798)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toParser(PeriodFormatterBuilder.java:163) */
        periodFormatterBuilder.toParser();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toParser()
    
    @Test
    public void testToParser1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toParser] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toParser(PeriodFormatterBuilder.java:163) */
        periodFormatterBuilder.toParser();
    }
    
    @Test
    public void testToParser2() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toParser] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toParser(PeriodFormatterBuilder.java:163) */
        periodFormatterBuilder.toParser();
    }
    
    @Test
    public void testToParser3() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toParser] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList$SubList.get(ArrayList.java:1149)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:801)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toParser(PeriodFormatterBuilder.java:163) */
        periodFormatterBuilder.toParser();
    }
    
    @Test
    public void testToParser4() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toParser] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toParser(PeriodFormatterBuilder.java:163) */
        periodFormatterBuilder.toParser();
    }
    
    @Test
    public void testToParser5() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        Object object = createInstance("java.lang.Object");
        iElementPairs.add(object);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toParser] produces [java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.joda.time.format.PeriodFormatterBuilder$Composite.decompose(PeriodFormatterBuilder.java:1846)
            org.joda.time.format.PeriodFormatterBuilder$Composite.<init>(PeriodFormatterBuilder.java:1768)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:822)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toParser(PeriodFormatterBuilder.java:163) */
        periodFormatterBuilder.toParser();
    }
    
    @Test
    public void testToParser6() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        ArrayList iElementPairs = new ArrayList();
        PeriodFormatterBuilder.Separator separator = ((PeriodFormatterBuilder.Separator) createInstance("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        iElementPairs.add(separator);
        iElementPairs.add(null);
        iElementPairs.add(null);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter", true);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.toParser] produces [java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList$SubList.get(ArrayList.java:1149)
            org.joda.time.format.PeriodFormatterBuilder.createComposite(PeriodFormatterBuilder.java:820)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:805)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:801)
            org.joda.time.format.PeriodFormatterBuilder.toFormatter(PeriodFormatterBuilder.java:123)
            org.joda.time.format.PeriodFormatterBuilder.toParser(PeriodFormatterBuilder.java:163) */
        periodFormatterBuilder.toParser();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.rejectSignedValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rejectSignedValues(boolean)
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#rejectSignedValues(boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRejectSignedValues_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.rejectSignedValues(false);
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.printZeroAlways
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printZeroAlways()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#printZeroAlways()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPrintZeroAlways_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.printZeroAlways();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        int finalPeriodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        
        assertEquals(4, finalPeriodFormatterBuilderIPrintZeroSetting);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.printZeroNever
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printZeroNever()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#printZeroNever()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPrintZeroNever_Return() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.printZeroNever();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertNull(actualIElementPairs);
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        assertNull(actualIFieldFormatters);
        
        int finalPeriodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        
        assertEquals(5, finalPeriodFormatterBuilderIPrintZeroSetting);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendMonths
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendMonths()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMonths()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendMonths_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 1));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendMonths();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters1 == finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendMonths()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMonths()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(MONTHS);
 *  */
    @Test
    public void testAppendMonths_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMonths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendMonths(PeriodFormatterBuilder.java:411) */
        periodFormatterBuilder.appendMonths();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMonths()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(MONTHS);
 *  */
    @Test
    public void testAppendMonths_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMonths] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendMonths(PeriodFormatterBuilder.java:411) */
        periodFormatterBuilder.appendMonths();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMonths()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendMonths_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMonths] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendMonths(PeriodFormatterBuilder.java:411) */
        periodFormatterBuilder.appendMonths();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendMinutes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendMinutes()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMinutes()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendMinutes_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[14];
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 5));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendMinutes();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters4 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters4, 2));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters5 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters5, 3));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters6 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters6, 4));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters7 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters7, 5));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters8 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters8, 6));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters9 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters9, 7));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters10 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters10, 8));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters11 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters9 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters11, 9));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters12 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters10 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters12, 10));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters13 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters11 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters13, 11));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters14 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters12 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters14, 12));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters15 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters13 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters15, 13));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters5 == finalPeriodFormatterBuilderIFieldFormatters5);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters2);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters3);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters4);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters6);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters7);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters8);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters9);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters10);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters11);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters12);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters13);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendMinutes()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMinutes()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(MINUTES);
 *  */
    @Test
    public void testAppendMinutes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMinutes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendMinutes(PeriodFormatterBuilder.java:463) */
        periodFormatterBuilder.appendMinutes();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMinutes()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendMinutes_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMinutes] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendMinutes(PeriodFormatterBuilder.java:463) */
        periodFormatterBuilder.appendMinutes();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMinutes()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(MINUTES);
 *  */
    @Test
    public void testAppendMinutes_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -252);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMinutes] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendMinutes(PeriodFormatterBuilder.java:463) */
        periodFormatterBuilder.appendMinutes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendDays
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDays()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendDays()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendDays_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null, null, null, null, null, null, null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 3));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendDays();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters4 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters4, 2));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters5 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters5, 3));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters6 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters6, 4));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters7 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters7, 5));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters8 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters8, 6));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters9 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters9, 7));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters10 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters10, 8));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters3 == finalPeriodFormatterBuilderIFieldFormatters3);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters2);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters4);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters5);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters6);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters7);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDays()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendDays()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(DAYS);
 *  */
    @Test
    public void testAppendDays_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendDays] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendDays(PeriodFormatterBuilder.java:437) */
        periodFormatterBuilder.appendDays();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendDays()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(DAYS);
 *  */
    @Test
    public void testAppendDays_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendDays] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendDays(PeriodFormatterBuilder.java:437) */
        periodFormatterBuilder.appendDays();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendDays()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendDays_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendDays] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendDays(PeriodFormatterBuilder.java:437) */
        periodFormatterBuilder.appendDays();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendHours
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendHours()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendHours()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendHours_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[13];
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 4));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendHours();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters4 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters4, 2));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters5 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters5, 3));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters6 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters6, 4));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters7 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters7, 5));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters8 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters8, 6));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters9 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters9, 7));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters10 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters10, 8));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters11 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters9 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters11, 9));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters12 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters10 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters12, 10));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters13 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters11 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters13, 11));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters14 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters12 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters14, 12));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters4 == finalPeriodFormatterBuilderIFieldFormatters4);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters2);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters3);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters5);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters6);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters7);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters8);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters9);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters10);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters11);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters12);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendHours()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendHours()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(HOURS);
 *  */
    @Test
    public void testAppendHours_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendHours] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendHours(PeriodFormatterBuilder.java:450) */
        periodFormatterBuilder.appendHours();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendHours()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(HOURS);
 *  */
    @Test
    public void testAppendHours_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendHours] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendHours(PeriodFormatterBuilder.java:450) */
        periodFormatterBuilder.appendHours();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendHours()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendHours_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendHours] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendHours(PeriodFormatterBuilder.java:450) */
        periodFormatterBuilder.appendHours();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendMillis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendMillis()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMillis()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendMillis_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null, null, null, null, null, null, null, null, null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 7));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendMillis();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters4 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters4, 2));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters5 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters5, 3));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters6 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters6, 4));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters7 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters7, 5));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters8 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters8, 6));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters9 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters9, 7));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters10 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters10, 8));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters7 == finalPeriodFormatterBuilderIFieldFormatters7);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters2);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters3);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters4);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters5);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters6);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendMillis()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMillis()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(MILLIS);
 *  */
    @Test
    public void testAppendMillis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMillis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendMillis(PeriodFormatterBuilder.java:513) */
        periodFormatterBuilder.appendMillis();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMillis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(MILLIS);
 *  */
    @Test
    public void testAppendMillis_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMillis] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendMillis(PeriodFormatterBuilder.java:513) */
        periodFormatterBuilder.appendMillis();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMillis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendMillis_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMillis] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendMillis(PeriodFormatterBuilder.java:513) */
        periodFormatterBuilder.appendMillis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendSeconds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendSeconds()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeconds()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendSeconds_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[15];
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 6));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendSeconds();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters4 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters4, 2));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters5 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters5, 3));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters6 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters6, 4));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters7 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters7, 5));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters8 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters8, 6));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters9 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters9, 7));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters10 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters10, 8));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters11 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters9 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters11, 9));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters12 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters10 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters12, 10));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters13 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters11 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters13, 11));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters14 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters12 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters14, 12));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters15 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters13 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters15, 13));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters16 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters14 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters16, 14));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters6 == finalPeriodFormatterBuilderIFieldFormatters6);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters2);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters3);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters4);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters5);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters7);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters8);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters9);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters10);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters11);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters12);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters13);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters14);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendSeconds()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeconds()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(SECONDS);
 *  */
    @Test
    public void testAppendSeconds_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeconds] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendSeconds(PeriodFormatterBuilder.java:476) */
        periodFormatterBuilder.appendSeconds();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeconds()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(SECONDS);
 *  */
    @Test
    public void testAppendSeconds_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeconds] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendSeconds(PeriodFormatterBuilder.java:476) */
        periodFormatterBuilder.appendSeconds();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendSeconds()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendSeconds_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendSeconds] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendSeconds(PeriodFormatterBuilder.java:476) */
        periodFormatterBuilder.appendSeconds();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendMillis3Digit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendMillis3Digit()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMillis3Digit()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int,int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendMillis3Digit_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[17];
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 7));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendMillis3Digit();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters4 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters4, 2));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters5 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters5, 3));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters6 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters6, 4));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters7 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters7, 5));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters8 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters8, 6));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters9 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters9, 7));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters10 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters10, 8));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters11 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters9 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters11, 9));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters12 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters10 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters12, 10));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters13 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters11 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters13, 11));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters14 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters12 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters14, 12));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters15 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters13 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters15, 13));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters16 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters14 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters16, 14));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters17 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters15 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters17, 15));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters18 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters16 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters18, 16));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters7 == finalPeriodFormatterBuilderIFieldFormatters7);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters2);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters3);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters4);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters5);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters6);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters8);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters9);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters10);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters11);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters12);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters13);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters14);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters15);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters16);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendMillis3Digit()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMillis3Digit()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(7, 3);
 *  */
    @Test
    public void testAppendMillis3Digit_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMillis3Digit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendMillis3Digit(PeriodFormatterBuilder.java:525) */
        periodFormatterBuilder.appendMillis3Digit();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMillis3Digit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(7, 3);
 *  */
    @Test
    public void testAppendMillis3Digit_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMillis3Digit] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendMillis3Digit(PeriodFormatterBuilder.java:525) */
        periodFormatterBuilder.appendMillis3Digit();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendMillis3Digit()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(7, 3);
 *  */
    @Test
    public void testAppendMillis3Digit_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendMillis3Digit] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendMillis3Digit(PeriodFormatterBuilder.java:525) */
        periodFormatterBuilder.appendMillis3Digit();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendWeeks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendWeeks()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendWeeks()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendWeeks_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[11];
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 2));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendWeeks();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters3 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters1 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters3, 1));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters4 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters2 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters4, 2));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters5 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters3 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters5, 3));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters6 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters4 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters6, 4));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters7 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters5 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters7, 5));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters8 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters6 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters8, 6));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters9 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters7 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters9, 7));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters10 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters8 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters10, 8));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters11 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters9 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters11, 9));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters12 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters10 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters12, 10));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters2 == finalPeriodFormatterBuilderIFieldFormatters2);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters0);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters1);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters3);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters4);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters5);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters6);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters7);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters8);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters9);
        
        assertNull(finalPeriodFormatterBuilderIFieldFormatters10);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendWeeks()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendWeeks()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(WEEKS);
 *  */
    @Test
    public void testAppendWeeks_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendWeeks] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendWeeks(PeriodFormatterBuilder.java:424) */
        periodFormatterBuilder.appendWeeks();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendWeeks()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(WEEKS);
 *  */
    @Test
    public void testAppendWeeks_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -254);
        PeriodFormatterBuilder.SimpleAffix iPrefix = ((PeriodFormatterBuilder.SimpleAffix) createInstance("org.joda.time.format.PeriodFormatterBuilder$SimpleAffix"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix", iPrefix);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendWeeks] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendWeeks(PeriodFormatterBuilder.java:424) */
        periodFormatterBuilder.appendWeeks();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendWeeks()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendWeeks_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendWeeks] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendWeeks(PeriodFormatterBuilder.java:424) */
        periodFormatterBuilder.appendWeeks();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.format.PeriodFormatterBuilder.appendYears
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendYears()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendYears()}
 * @utbot.invokes org.joda.time.format.PeriodFormatterBuilder#appendField(int)
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendYears_PeriodFormatterBuilderAppendField() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {null};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter initialPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters, 0));
        
        PeriodFormatterBuilder actual = periodFormatterBuilder.appendYears();
        
        int periodFormatterBuilderIMinPrintedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        int actualIMinPrintedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits"));
        assertEquals(periodFormatterBuilderIMinPrintedDigits, actualIMinPrintedDigits);
        
        int periodFormatterBuilderIPrintZeroSetting = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        int actualIPrintZeroSetting = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting"));
        assertEquals(periodFormatterBuilderIPrintZeroSetting, actualIPrintZeroSetting);
        
        int periodFormatterBuilderIMaxParsedDigits = ((Integer) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        int actualIMaxParsedDigits = ((Integer) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits"));
        assertEquals(periodFormatterBuilderIMaxParsedDigits, actualIMaxParsedDigits);
        
        boolean actualIRejectSignedValues = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iRejectSignedValues"));
        assertFalse(actualIRejectSignedValues);
        
        PeriodFormatterBuilder.PeriodFieldAffix actualIPrefix = ((PeriodFormatterBuilder.PeriodFieldAffix) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iPrefix"));
        assertNull(actualIPrefix);
        
        List periodFormatterBuilderIElementPairs = ((List) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        List actualIElementPairs = ((List) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs"));
        assertTrue(deepEquals(periodFormatterBuilderIElementPairs, actualIElementPairs));
        
        boolean actualINotPrinter = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotPrinter"));
        assertFalse(actualINotPrinter);
        
        boolean actualINotParser = ((Boolean) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iNotParser"));
        assertFalse(actualINotParser);
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters1 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] actualIFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(actual, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        int periodFormatterBuilderIFieldFormatters1Size = periodFormatterBuilderIFieldFormatters1.length;
        assertEquals(periodFormatterBuilderIFieldFormatters1Size, actualIFieldFormatters.length);
        assertTrue(deepEquals(periodFormatterBuilderIFieldFormatters1, actualIFieldFormatters));
        
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] periodFormatterBuilderIFieldFormatters2 = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) getFieldValue(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters"));
        PeriodFormatterBuilder.FieldFormatter finalPeriodFormatterBuilderIFieldFormatters0 = ((PeriodFormatterBuilder.FieldFormatter) get(periodFormatterBuilderIFieldFormatters2, 0));
        
        assertFalse(initialPeriodFormatterBuilderIFieldFormatters0 == finalPeriodFormatterBuilderIFieldFormatters0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendYears()
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendYears()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: appendField(YEARS);
 *  */
    @Test
    public void testAppendYears_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters = {};
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iFieldFormatters", iFieldFormatters);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendYears] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendYears(PeriodFormatterBuilder.java:398) */
        periodFormatterBuilder.appendYears();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendYears()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAppendYears_ThrowNullPointerException() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -255);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendYears] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.append0(PeriodFormatterBuilder.java:786)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:536)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendYears(PeriodFormatterBuilder.java:398) */
        periodFormatterBuilder.appendYears();
    }
    
    /**
    @utbot.classUnderTest {@link PeriodFormatterBuilder}
 * @utbot.methodUnderTest {@link org.joda.time.format.PeriodFormatterBuilder#appendYears()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendField(YEARS);
 *  */
    @Test
    public void testAppendYears_ThrowNullPointerException_1() throws Exception  {
        PeriodFormatterBuilder periodFormatterBuilder = ((PeriodFormatterBuilder) createInstance("org.joda.time.format.PeriodFormatterBuilder"));
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMinPrintedDigits", -254);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iPrintZeroSetting", -252);
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iMaxParsedDigits", -255);
        ArrayList iElementPairs = new ArrayList();
        setField(periodFormatterBuilder, "org.joda.time.format.PeriodFormatterBuilder", "iElementPairs", iElementPairs);
        
        /* This test fails because method [org.joda.time.format.PeriodFormatterBuilder.appendYears] produces [java.lang.NullPointerException]
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:537)
            org.joda.time.format.PeriodFormatterBuilder.appendField(PeriodFormatterBuilder.java:530)
            org.joda.time.format.PeriodFormatterBuilder.appendYears(PeriodFormatterBuilder.java:398) */
        periodFormatterBuilder.appendYears();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1056577505322099 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1056577505322099.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1056577505328700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1056577505322099.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1056577505328700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1056577506702200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1056577506702200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1056577506704100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1056577506702200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1056577506704100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1056577515631800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1056577515631800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1056577515634500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1056577515631800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1056577515634500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

